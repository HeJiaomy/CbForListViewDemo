package com.example.admin.cbforlistviewdemo;

/**
 * Created by Admin on 2017/6/8.
 */

public class ItemBean {
    private String msg;
    private boolean isShow;  //是否显示CheckBox
    private boolean isChecked;//是否选中CheckBox

    public ItemBean(String msg, boolean isShow, boolean isChecked) {
        this.msg = msg;
        this.isShow = isShow;
        this.isChecked = isChecked;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
