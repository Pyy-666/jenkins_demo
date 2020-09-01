package cn.pyy.jenkins_demo.Mapper;

import cn.pyy.jenkins_demo.entity.ApplyCost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyCostMapper {
    List<ApplyCost> getAll();
}
