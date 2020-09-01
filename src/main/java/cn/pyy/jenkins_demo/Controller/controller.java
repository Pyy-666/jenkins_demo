package cn.pyy.jenkins_demo.Controller;

import cn.pyy.jenkins_demo.Service.ApplyCostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class controller {
    @Resource
    ApplyCostService applyCostService;

    @RequestMapping("hello")
    public Object getAll(){
        return applyCostService.getAll();
    }
}
