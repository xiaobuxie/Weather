package com.example.weather.db;


import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    @Column(unique = true,defaultValue = "unknow")
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String province_name){
        this.provinceName = province_name;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
