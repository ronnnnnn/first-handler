package com.zyfz.dao;

import com.zyfz.domain.TaskComment;

public interface TaskCommentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TaskComment record);

    int insertSelective(TaskComment record);

    TaskComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskComment record);

    int updateByPrimaryKey(TaskComment record);
}