package com.wsmhz.shop.product.service.api.api;

import com.wsmhz.shop.product.service.api.domain.form.ProductSelectForm;
import com.wsmhz.shop.product.service.api.domain.form.ProductUpdateForm;
import com.wsmhz.shop.product.service.api.domain.vo.ProductSimpleVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * create by tangbj on 2018/8/30
 */
@FeignClient(name = "product-service")
public interface ProductApi {

    @PostMapping("api/product/select")
    ProductSimpleVo selectById(@RequestBody @Valid ProductSelectForm productSelectForm);

    @PutMapping("api/product")
    int update(@RequestBody ProductUpdateForm productUpdateForm);

    @GetMapping("api/product/stock/{id}")
    int selectStockByProductId(@PathVariable("id") Long id);
}
