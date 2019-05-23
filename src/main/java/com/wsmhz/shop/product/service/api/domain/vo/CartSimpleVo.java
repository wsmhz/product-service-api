package com.wsmhz.shop.product.service.api.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By TangBiJing On 2019/5/5
 * Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartSimpleVo {

    private Long id;
    /**
     * 用户Id
     */
    private Long userId;
    /**
     * 产品Id
     */
    private Long productId;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 勾选状态
     */
    private Boolean checked;
}
