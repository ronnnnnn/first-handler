package com.zyfz.service.impl;

import com.zyfz.dao.ResourceMapper;
import com.zyfz.domain.Resources;
import com.zyfz.service.IResourceService;
import org.apache.shiro.authz.permission.WildcardPermission;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ron on 16-10-15.
 */
@Service
public class ResourceServiceImpl implements IResourceService {
    @Resource
    ResourceMapper resourceMapper;

    @Override
    public Integer save(Resources resource) {
        return resourceMapper.insertSelective(resource);
    }

    @Override
    public Integer update(Resources resource) {
        return resourceMapper.updateByPrimaryKeySelective(resource);
    }

    @Override
    public List<Resources> getAll() {
        return resourceMapper.selectAll();
    }


    @Override
    public Resources getOneById(Resources resource) {
        return resourceMapper.selectByPrimaryKey(resource.getId());
    }

    @Override
    public Integer deleteOneById(Resources resource) {
        return resourceMapper.deleteByPrimaryKey(resource.getId());
    }


    @Override
    public Set<String> findPermissions(Set<Integer> resourceIds) {

        Set<String> permissions = new HashSet<String>();
        for(int resourceId : resourceIds){
            Resources sysResource = resourceMapper.selectByPrimaryKey(resourceId);
            if(sysResource != null){
                permissions.add(sysResource.getPermission());
            }
        }
        return permissions;
    }

    @Override
    public List<Resources> findMenus(Set<String> permissions) {

        List<Resources> allResources = resourceMapper.selectAll();
        List<Resources> menus = new ArrayList<Resources>();
        for (Resources resource : allResources){
            if(resource.isRootNode()){
                continue;
            }

            String str2 = "menu";
            if(resource.getType().intern() != str2) {
                continue;
            }
            if(!hasPermission(permissions, resource)) {
                continue;
            }
            menus.add(resource);
        }
        return menus;
    }

    private boolean hasPermission(Set<String> permissions, Resources resource) {
        if(StringUtils.isEmpty(resource.getPermission())) {
            return true;
        }
        for(String permission : permissions) {
            WildcardPermission p1 = new WildcardPermission(permission);
            WildcardPermission p2 = new WildcardPermission(resource.getPermission());
            if(p1.implies(p2) || p2.implies(p1)) {
                return true;
            }
        }
        return false;
    }
}
