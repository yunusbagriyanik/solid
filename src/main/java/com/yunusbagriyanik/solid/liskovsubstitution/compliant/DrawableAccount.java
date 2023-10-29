package com.yunusbagriyanik.solid.liskovsubstitution.compliant;

import java.math.BigDecimal;

public abstract class DrawableAccount extends Account {
    public abstract void drawMoney(BigDecimal amount);
}
