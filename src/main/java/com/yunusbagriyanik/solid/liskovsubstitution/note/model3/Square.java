package com.yunusbagriyanik.solid.liskovsubstitution.note.model3;

public class Square extends Rectangle {
    @Override
    public void setWidth(int w) {
        super.setWidth(w);
        super.setHeight(w);
    }

    @Override
    public void setHeight(int h) {
        super.setHeight(h);
        super.setWidth(h);
    }
}
