package com.xxjqr.multiple_modules.app.prod.service.impl;

import com.xxjqr.multiple_modules.app.prod.service.ProdServeService;
import com.xxjqr.multiple_modules.core.prod.mapper.ProdServeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xxjqr on 2017/9/16.
 */
@Service
public class ProdServeServiceImpl implements ProdServeService{
    @Resource
    private ProdServeMapper prodServeMapper;

    @Override
    public List<ProdServe> listProdServe() {
        return prodServeMapper.selectAll();
    }
}
