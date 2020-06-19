package com.baomidou.ant.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author jobob
 * @since 2020-06-19
 */
@Data
@Accessors(chain = true)
public class Orders {

    private static final long serialVersionUID = 1L;

    /**
     * 数据主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单号
     */
    @TableField("ORDER_NUM")
    private String orderNum;

    /**
     * 门店编号
     */
    @TableField("SHOP_NUM")
    private String shopNum;

    /**
     * 仓库编号
     */
    @TableField("WAREHOUSE_NUM")
    private String warehouseNum;

    /**
     * 订单来源编号
     */
    @TableField("SOURCE_NUM")
    private String sourceNum;

    /**
     * 订单来源类型(1采购单，2代发单)
     */
    @TableField("SOURCE_TYPE")
    private Integer sourceType;

    /**
     * 下级系统订单号（erp单号）
     */
    @TableField("SUB_ORDER_NUM")
    private String subOrderNum;

    /**
     * 重量
     */
    @TableField("WEIGHT")
    private BigDecimal weight;

    /**
     * 订单商品总数量
     */
    @TableField("QUANTITY")
    private Integer quantity;

    /**
     * 快递价格（付款方）
     */
    @TableField("PAY_EXP_PRICE")
    private BigDecimal payExpPrice;

    /**
     * 商品税费（付款方）
     */
    @TableField("PAY_TAX_PRICE")
    private BigDecimal payTaxPrice;

    /**
     * 商品价格（付款方）
     */
    @TableField("PAY_PRODUCT_PRICE")
    private BigDecimal payProductPrice;

    /**
     * 总价（付款方）
     */
    @TableField("PAY_TOTAL_PRICE")
    private BigDecimal payTotalPrice;

    /**
     * 付款方货币类型code
     */
    @TableField("PAY_CURRENCY_CODE")
    private Integer payCurrencyCode;

    /**
     * 待付金额（付款方）
     */
    @TableField("WAIT_PAY_PRICE")
    private BigDecimal waitPayPrice;

    /**
     * 快递价格（收款方）
     */
    @TableField("RECEIPT_EXP_PRICE")
    private BigDecimal receiptExpPrice;

    /**
     * 商品税费（收款方）
     */
    @TableField("RECEIPT_TAX_PRICE")
    private BigDecimal receiptTaxPrice;

    /**
     * 商品价格（收款方）
     */
    @TableField("RECEIPT_PRODUCT_PRICE")
    private BigDecimal receiptProductPrice;

    /**
     * 总价（收款方）
     */
    @TableField("RECEIPT_TOTAL_PRICE")
    private BigDecimal receiptTotalPrice;

    /**
     * 待付价格（收款方）
     */
    @TableField("RECEIPT_WAIT_PAY_PRICE")
    private BigDecimal receiptWaitPayPrice;

    /**
     * 收款方货币类型code
     */
    @TableField("RECEIPT_CURRENCY_CODE")
    private Integer receiptCurrencyCode;

    /**
     * 状态(见字典表 )
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 折扣率
     */
    @TableField("DISCOUNT_RATE")
    private BigDecimal discountRate;

    @TableField("PAY_TIME")
    private Long payTime;

    /**
     * 支付状态（0未支付 1已支付）
     */
    @TableField("PAY_STATUS")
    private Integer payStatus;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 创建时间(下单时间)
     */
    @TableField("CREATE_TIME")
    private Long createTime;

    /**
     * 修改时间
     */
    @TableField("UPDATE_TIME")
    private Long updateTime;

    /**
     * 版本号
     */
    @TableField("VERSION")
    private Integer version;

    /**
     * 门店分销等级id
     */
    @TableField("SHOP_GRADE_ID")
    private String shopGradeId;

    /**
     * 取消时间
     */
    @TableField("CANCEL_TIME")
    private Long cancelTime;

    /**
     * 完成时间
     */
    @TableField("FINISH_TIME")
    private Long finishTime;

    /**
     * 配送方式(1仓库配送,2自提3.第三方配送)
     */
    @TableField("DELIVERY_METHOD")
    private Integer deliveryMethod;

    /**
     * 出库状态：0未出库，1部分出库，2出库完成
     */
    @TableField("STOCK_STATUS")
    private Integer stockStatus;

    /**
     * 完成出库时间
     */
    @TableField("STOCK_TIME")
    private Long stockTime;

    /**
     * 提货状态(0未申请，1已申请，2已审核)
     */
    @TableField("BL_STATUS")
    private Integer blStatus;

    /**
     * 导入订单表订单编号
     */
    @TableField("IMPORT_ORDER_NUM")
    private String importOrderNum;

    /**
     * 订单发货状态是否已经推送 (0 未推送 1已推送)
     */
    @TableField("IS_PUSH")
    private Integer isPush;

    /**
     * 下游系统（erp）是否支付了
     */
    @TableField("IS_ORDER_PAY")
    private Integer isOrderPay;

    /**
     * APOS订单ID
     */
    @TableField("BUSINESS_ID")
    private String businessId;

    /**
     * 转单单号(新创建的主单号)
     */
    @TableField("TRANSFER_ORDER_NUM")
    private String transferOrderNum;

    /**
     * 转单状态(字典142)
     */
    @TableField("TRANSFER_STATUS")
    private Integer transferStatus;

    /**
     * 推送次数
     */
    @TableField("PUSH_TIMES")
    private Integer pushTimes;


}
