package com.wsmhz.shop.product.service.api.api;



import com.wsmhz.shop.product.service.api.domain.form.CartDeteleForm;
import com.wsmhz.shop.product.service.api.domain.form.UserCartForm;
import com.wsmhz.shop.product.service.api.domain.vo.CartSimpleVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * create by tangbj on 2018/8/30
 */
@FeignClient(name = "product-service")
public interface CartApi {

    @PostMapping("/api/cart/select/user")
    List<CartSimpleVo> selectByUserId(@RequestBody @Valid UserCartForm userCartForm);

    @PostMapping("/api/cart/delete")
    int deleteApi(@RequestBody @Valid CartDeteleForm cartDeteleForm);

}
