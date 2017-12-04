package com.electronic.dto.res;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QryPageRes {
    
    private static final Logger LOG = LoggerFactory.getLogger(QryPageRes.class);
    
    private Integer page_no = 0;
    private Integer page_size = 10;

    private Integer offset = 0;
    private Integer rows = 10;

    private String since_id;

    private String max_id;

    public Integer getPage_no() {
        return page_no;
    }

    public void setPage_no(Integer page_no) {
        this.page_no = page_no;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public Integer getRows() {
        if (this.page_size != null) {
            this.rows = this.page_size;
        }
        LOG.info("page rows:" + rows);
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        if (this.page_no != null && page_size != null) {
            if (page_no <= 0) {
                this.offset = 0;
            } else {
                this.offset = (this.page_no - 1) * this.page_size;
            }
        }
        LOG.info("page offset:" + offset);
        return offset;
    }

    public String getSince_id() {
        return since_id;
    }

    public void setSince_id(String since_id) {
        this.since_id = since_id;
    }

    public String getMax_id() {
        return max_id;
    }

    public void setMax_id(String max_id) {
        this.max_id = max_id;
    }
}
