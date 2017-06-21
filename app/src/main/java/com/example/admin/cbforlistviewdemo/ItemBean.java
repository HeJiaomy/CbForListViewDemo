package com.example.admin.cbforlistviewdemo;


class ItemBean {
    private String msg;
    private boolean isShow;  //是否显示CheckBox
    private boolean isChecked;//是否选中CheckBox

    ItemBean(String msg, boolean isShow, boolean isChecked) {
        this.msg = msg;
        this.isShow = isShow;
        this.isChecked = isChecked;
    }

     String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

     boolean isShow() {
        return isShow;
    }

     void setShow(boolean show) {
        isShow = show;
    }

     boolean isChecked() {
        return isChecked;
    }

     void setChecked(boolean checked) {
        isChecked = checked;
    }
}
