package com.guli.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * ר????Ʒ
 *
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-06 20:26:52
 */
@Data
@TableName("sms_home_subject_spu")
public class SmsHomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ר???
	 */
	private String name;
	/**
	 * ר??id
	 */
	private Long subjectId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ???
	 */
	private Integer sort;

}
