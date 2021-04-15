package com.bmb.compute.bioinfo.bt.controller;

import com.bmb.compute.bioinfo.bt.bean.Strain;
import com.bmb.compute.bioinfo.bt.service.StrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("strain")
public class StrainController {

    @Autowired
    private StrainService  strainService;
    @GetMapping("/all")
    public List<Strain> getAllStrains(){

        return  strainService.findAllStrains();
    }
}
