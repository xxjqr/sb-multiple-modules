package com.xxjqr.multiple_modules.comm.util;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxjqr.multiple_modules.comm.po.Pager;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class PagerUtil {

    public static Pager query(ISelect select){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();

        Integer page = 1;
        Integer size = 10;
        String pageStr = request.getParameter("page");
        String sizeStr = request.getParameter("size");
        if (pageStr!=null && !pageStr.equals("")){
            page = Integer.valueOf(pageStr);
        }
        if (sizeStr!=null && !sizeStr.equals("")){
            size = Integer.valueOf(sizeStr);
        }
        PageInfo info = PageHelper.startPage(page,size).doSelectPageInfo(select);

        Pager pager = new Pager();
        pager.setList(info.getList());
        pager.setCurSize(info.getList().size());
        pager.setPage(page);
        pager.setSize(size);
        pager.setTotal(info.getTotal());
        pager.setPages(info.getPages());
        return pager;
    }
}
