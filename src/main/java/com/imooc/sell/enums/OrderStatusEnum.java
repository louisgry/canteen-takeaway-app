package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @author Louis
 * @date Create in 2019/11/4 21:28
 */
@Getter
public enum OrderStatusEnum {
    /** 订单状态 */
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
