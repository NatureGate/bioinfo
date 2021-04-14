package com.bmb.compute.bioinfo;

import com.bmb.compute.bioinfo.bt.bean.Strain;
import com.bmb.compute.bioinfo.bt.dao.StrainMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest
@RunWith(SpringRunner.class)
class BioinfoApplicationTests {

    @Autowired
    private StrainMapper strainMapper;
    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<Strain> strainList = strainMapper.selectList(null);
        org.junit.Assert.assertEquals(664, strainList.size());
        strainList.forEach(System.out::println);
    }
}
