package cn.pyy.jenkins_demo.Service;

import cn.pyy.jenkins_demo.Mapper.ApplyCostMapper;
import cn.pyy.jenkins_demo.entity.ApplyCost;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplyCostService {
    @Resource
    ApplyCostMapper applyCostMapper;

    public List<ApplyCost> getAll(){
        return applyCostMapper.getAll();
    }
}
