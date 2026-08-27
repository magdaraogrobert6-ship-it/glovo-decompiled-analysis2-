package com.qualtrics.digital;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class QualtricsWebviewTheme {
    public static final int DEFAULT_ACTION_BAR_COLOR = Color.parseColor("#F5F5F5");
    private int actionBarColor = DEFAULT_ACTION_BAR_COLOR;
    private int closeButtonId;

    public int getActionBarColor() {
        return this.actionBarColor;
    }

    public int getCloseButtonId() {
        return this.closeButtonId;
    }

    public void setActionBarColor(int i) {
        this.actionBarColor = i;
    }

    public void setCloseButtonId(int i) {
        this.closeButtonId = i;
    }

    public QualtricsWebviewTheme(int i) {
        this.closeButtonId = i;
    }
}
