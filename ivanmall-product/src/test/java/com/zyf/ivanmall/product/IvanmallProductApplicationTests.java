package com.zyf.ivanmall.product;

import com.zyf.ivanmall.product.entity.BrandEntity;
import com.zyf.ivanmall.product.service.BrandService;
import com.zyf.ivanmall.product.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IvanmallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setDescript("你好1111");
        brandEntity.setName("张珊1111");

        brandService.save(brandEntity);
//        CategoryEntity categoryEntity = new CategoryEntity();
//        categoryEntity.setName("测试一号");
//
//        categoryService.save(categoryEntity);

        System.out.println("保存成功...");
    }

}
