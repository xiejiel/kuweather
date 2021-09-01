package com.kuweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by 22987 on 2021/9/1.
 */

    public class Province extends LitePalSupport {

    private int id;
    private String provinceName;
    private  int  provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
