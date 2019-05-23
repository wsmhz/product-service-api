package com.wsmhz.shop.product.service.api.domain.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created By TangBiJing On 2019/5/5
 * Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateForm {

    private Long id;
    /**
     * 分类Id
     */
    private Long categoryId;
    /**
     * 名称
     */
    private String name;
    /**
     * 子标题
     */
    private String subtitle;
    /**
     * 主图
     */
    private String mainImage;
    /**
     * 子图
     */
    private String subImages;
    /**
     * 详情
     */
    private String detail;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 状态
     */
    private String status;
    /**
     * 标志（扩展）
     */
    private String flag;
}
