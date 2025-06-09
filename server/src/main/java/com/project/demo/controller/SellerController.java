package com.project.demo.controller;

import com.project.demo.entity.Seller;
import com.project.demo.service.SellerService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 卖家：(Seller)表控制层
 *
 */
@RestController
@RequestMapping("/seller")
public class SellerController extends BaseController<Seller, SellerService> {

    /**
     * 卖家对象
     */
    @Autowired
    public SellerController(SellerService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
