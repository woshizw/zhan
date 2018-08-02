package com.zhan.cloud.service.sequence.dao;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhan.cloud.service.sequence.entity.Sequence;

/**
 * mapper接口
 * @author zhangw
 *
 */
@Mapper
public interface SequenceMapper {
    Sequence selectByKeyName(@Param("keyName") String keyName);
    
    public void updateSequence(Sequence sequence);
    
    public List<String> getSequenceList();
    
    public void addSequence(Sequence sequence);
    
   
}