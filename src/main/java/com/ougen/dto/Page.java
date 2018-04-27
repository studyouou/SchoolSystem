package com.ougen.dto;

import java.util.List;

/**
 * @author:ougen
 * @date:2018/4/2513:41
 */
public class Page<T>{
    //总记录数
    private int count;

    //当前页数
    private int currentPage;

    //每页的记录数
    private int everyNum;

    //页面总数
    private int allPages;

    //开始数
    private int begin;


    //是否有上一页
    private boolean hasPrePage ;

    //是否有下一页
    private boolean hasNextPage;

    private List<T> list;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getEveryNum() {
        return everyNum;
    }

    public void setEveryNum(int everyNum) {
        this.everyNum = everyNum;
    }

    public int getAllPages() {
        return allPages;
    }

    public void setAllPages(int allPages) {
        this.allPages = allPages;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }


    public boolean isHasPrePage() {
        return hasPrePage;
    }

    public void setHasPrePage(boolean hasPrePage) {
        this.hasPrePage = hasPrePage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
