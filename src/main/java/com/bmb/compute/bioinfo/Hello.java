package com.bmb.compute.bioinfo;

import com.bmb.compute.bioinfo.bt.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public Student sayHello(){
        Student longrui = new Student();
        longrui.setAge(108);
        longrui.setName("longrui");
        longrui.setSex("男");
        return longrui;
    }
}
