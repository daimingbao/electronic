package com.electronic.dto.req;

public class QryPageReq {
    
    private Integer request_num  = 50;
    
    private String position_str;
    
    private String sort_direction;

    public Integer getRequest_num() {
        return request_num;
    }

    public void setRequest_num(Integer request_num) {
        this.request_num = request_num;
    }

    public String getPosition_str() {
        return position_str;
    }

    public void setPosition_str(String position_str) {
        this.position_str = position_str;
    }

    public String getSort_direction() {
        return sort_direction;
    }

    public void setSort_direction(String sort_direction) {
        this.sort_direction = sort_direction;
    }
    
    
    
}
