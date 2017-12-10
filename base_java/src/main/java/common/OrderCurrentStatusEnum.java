package common;

import java.io.Serializable;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/25 23:54
 */
public enum OrderCurrentStatusEnum implements Serializable{

    YES_SUBMIT_UNPAID("YES_SUBMIT_UNPAID", "已提交未支付"),

    SUBMIT_PAID_FAILURE("SUBMIT_PAID_FAILURE","已提交，支付失败"),

    SUBMIT_PAID_PENDING("SUBMIT_PAID_PENDING", "已提交,已支付,待客服处理"),

    ORDER_SERVICE_PROCESS("ORDER_SERVICE_PROCESS", "客服开始处理订单"),

    ORDER_SUPPLIER_CONFIRM("ORDER_SUPPLIER_CONFIRM", "供应商确认订单"),

    ORDER_SERVICE_CONFIRM("ORDER_SERVICE_CONFIRM", "客服确认订单"),

    USER_CHECKED_IN("USER_CHECKED_IN","用户已入住"),

    ORDER_CANCELED("ORDER_CANCELED", "订单已取消"),

    ORDER_SUCCESS_CLOSE("ORDER_SUCCESS_CLOSE", "订单已成交"),

    ORDER_DELETE_REMOVE("ORDER_DELETE_REMOVE", "订单已被删除"),

    ;

    private String code;

    private String desc;

    OrderCurrentStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}