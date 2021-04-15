package com.bmb.compute.bioinfo.bt.service;

import com.bmb.compute.bioinfo.bt.bean.Strain;
import com.bmb.compute.bioinfo.bt.dao.StrainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrainSerivceImpl implements StrainService{

    @Autowired
    private StrainMapper strainMapper;
    @Override
    public List<Strain> findAllStrains() {
        return strainMapper.selectList(null);
    }
}
