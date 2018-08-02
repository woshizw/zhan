package com.hyh.cloud.give.bag.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@SuppressWarnings("rawtypes")
@Mapper
public interface BagDetailMapper {

	Integer batchAdd(List list);
	List queryListByParam(Map map);
	Integer queryCountByParam(Map map);

}