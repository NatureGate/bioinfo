package com.bmb.compute.bioinfo.bt.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bmb.compute.bioinfo.bt.bean.Strain;
import org.springframework.stereotype.Repository;


@Repository
@TableName("denovo_genome")
public interface StrainMapper extends BaseMapper<Strain> {
}
