package com.ougen.util;

import com.ougen.dto.Page;

/**
 * @author:ougen
 * @date:2018/4/2513:48
 */
public class PageUtil {

    public static Page createPage(int count,int currentPage,int everyNum){
        Page page = new Page();
        page.setCount(count);
        page.setCurrentPage(currentPage);
        page.setEveryNum(everyNum);
        page.setBegin(getBegin(currentPage,everyNum));
        page.setAllPages(getAllPages(count,everyNum));
        page.setHasPrePage(hasPrePage(page.getCurrentPage(),page.getAllPages()));
        page.setHasNextPage(hasNextPage(page.getCurrentPage(),page.getAllPages()));
        return page;
    }
    //获取起始位置
    private static int getBegin(int currentPage,int everyNum){
        return (currentPage-1)*everyNum;
    }
    //获取所有页数
    private static int getAllPages(int count , int everyNum){
        int mu = count%everyNum;
        int pages = count/everyNum;
        return mu==0?pages : pages+1;
    }
    //是否有下一页
    private static boolean hasNextPage(int currentPage,int allPage){
        return currentPage!=allPage;
    }
    //是否有上一页
    private static boolean hasPrePage(int currentPage,int allPage){
        return currentPage!=1;
    }
}
