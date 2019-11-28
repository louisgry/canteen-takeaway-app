package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Louis
 * @date Create in 2019/11/4 20:38
 * @Description: 商品
 */
@Entity
@Data
public class ProductInfo {

    /** 商品Id */
    @Id
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;

    /** 商品库存 */
    private Integer productStock;

    /** 商品描述 */
    private String productDescription;

    /** 商品小图 */
    private String productIcon;

    /** 商品状态，0正常1下架 */
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;
}
