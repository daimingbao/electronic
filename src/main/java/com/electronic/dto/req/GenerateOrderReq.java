
package com.electronic.dto.req;

/**
 * .
 * 
 * @author daimb17192
 * @date 2017年12月2日 下午2:28:32
 * @since 1.0
 */
public class GenerateOrderReq {
    
    private String mobile_tel;
    
    private String user_name;
    
    private String goodId;
    
    private String address;
    /**
     * 留言 备注.
     */
    private String message;
    
    
    private String line;

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    public String getMobile_tel() {
        return mobile_tel;
    }

    public void setMobile_tel(String mobile_tel) {
        this.mobile_tel = mobile_tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

}
