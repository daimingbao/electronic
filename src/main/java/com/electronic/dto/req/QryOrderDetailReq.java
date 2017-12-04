/**
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: </p>
 */
package com.electronic.dto.req;

/**
 * .
 * 
 * @author daimb17192
 * @date 2017年11月22日 下午1:07:58
 * @since 1.0
 */
public class QryOrderDetailReq extends QryPageReq{
    
    private String user_id;
    
    private String order_id;
    
    private String order_id_pos;
    
    private String order_status;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_id_pos() {
        return order_id_pos;
    }

    public void setOrder_id_pos(String order_id_pos) {
        this.order_id_pos = order_id_pos;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    
}
