package com.demo.springcloud.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName(value = "payment")
public class Payment implements Serializable {
//    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
//    @TableId(value = "serial")
    private String serial;
}
