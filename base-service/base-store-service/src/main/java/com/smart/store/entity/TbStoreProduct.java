package com.smart.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 商品库存表
 */
@Data
@TableName(value = "tb_store_product")
public class TbStoreProduct {
    /**
     * 商品库存ID
     */
    @TableId(value = "store_id", type = IdType.AUTO)
    private Integer storeId;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private Integer productId;

    /**
     * 仓库ID
     */
    @TableField(value = "w_id")
    private Short wId;

    /**
     * 当前商品数量
     */
    @TableField(value = "current_quantity")
    private Integer currentQuantity;

    /**
     * 当前占用数据
     */
    @TableField(value = "lock_quantity")
    private Integer lockQuantity;

    /**
     * 最后修改时间
     */
    @TableField(value = "modified_time")
    private Date modifiedTime;

    public static final String COL_STORE_ID = "store_id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_W_ID = "w_id";

    public static final String COL_CURRENT_QUANTITY = "current_quantity";

    public static final String COL_LOCK_QUANTITY = "lock_quantity";

    public static final String COL_MODIFIED_TIME = "modified_time";
}