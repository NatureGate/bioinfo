package com.bmb.compute.bioinfo.blog.bean;

import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 942121483@qq.com
 * @since 2021-04-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer clickTime;


}
