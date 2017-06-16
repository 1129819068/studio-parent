package com.free.studio.mapper.system;

import com.free.studio.pojo.system.BsSerialNumber;
import com.free.studio.pojo.system.BsSerialNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsSerialNumberMapper {
    int countByExample(BsSerialNumberExample example);

    int deleteByExample(BsSerialNumberExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(BsSerialNumber record);

    int insertSelective(BsSerialNumber record);

    List<BsSerialNumber> selectByExample(BsSerialNumberExample example);

    BsSerialNumber selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") BsSerialNumber record, @Param("example") BsSerialNumberExample example);

    int updateByExample(@Param("record") BsSerialNumber record, @Param("example") BsSerialNumberExample example);

    int updateByPrimaryKeySelective(BsSerialNumber record);

    int updateByPrimaryKey(BsSerialNumber record);
}