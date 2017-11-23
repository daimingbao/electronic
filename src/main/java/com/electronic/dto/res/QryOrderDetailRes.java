/**
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: </p>
 */
package com.electronic.dto.res;

import java.util.List;

import com.electronic.model.OrderDetail;

/**
 * .
 * 
 * @author daimb17192
 * @date 2017年11月22日 下午1:09:31
 * @since 1.0
 */
public class QryOrderDetailRes {
    
    private List<OrderDetail> data;

    public List<OrderDetail> getData() {
        return data;
    }

    public void setData(List<OrderDetail> data) {
        this.data = data;
    }

    
}
