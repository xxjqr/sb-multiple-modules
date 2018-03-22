package com.xxjqr.multiple_modules.app.hotel.service.impl;

import com.xxjqr.multiple_modules.app.article.service.ArticleService;
import com.xxjqr.multiple_modules.app.hotel.service.HotelService;
import com.xxjqr.multiple_modules.comm.exception.BusinessException;
import com.xxjqr.multiple_modules.core.article.mapper.ArticleMapper;
import com.xxjqr.multiple_modules.core.article.po.Article;
import com.xxjqr.multiple_modules.core.hotel.mapper.HotelMapper;
import com.xxjqr.multiple_modules.core.hotel.po.Hotel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Resource
    private HotelMapper hotelMapper;
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleService articleService;

//    @Transactional(transactionManager = "hotelTransactional",rollbackFor=Exception.class)

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<Hotel> listHotel() throws BusinessException {

        Hotel hotel = new Hotel();
        hotel.setName("3/21");
        hotelMapper.insert(hotel);

        Article article = new Article();
        article.setTitle("3/21");
        article.setContent("3/21");
        articleMapper.insert(article);

        if (true) throw new BusinessException("错了");

        return hotelMapper.selectAll();
    }
}
