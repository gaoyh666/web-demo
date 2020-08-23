package com.gaoyh.app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author gaoyh
 *
 */
@Table(name = "t_product")
@Entity
@Data
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nameName;
	private BigDecimal price;
	private Integer isDeleted;
	private Date createTime;
	private Date updateTime;
	private String remark;

}
