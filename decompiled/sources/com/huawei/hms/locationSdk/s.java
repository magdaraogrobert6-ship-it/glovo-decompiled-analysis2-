package com.huawei.hms.locationSdk;

import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes2.dex */
public class s {
    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;

    public float a() {
        return this.b;
    }

    public s b(float f) {
        this.b = (int) f;
        return this;
    }

    public s c(float f) {
        this.d = (int) f;
        return this;
    }

    public String toString() {
        return this.a + BundleUtil.UNDERLINE_TAG + this.b + BundleUtil.UNDERLINE_TAG + (this.c ? 1 : 0) + BundleUtil.UNDERLINE_TAG + this.d + BundleUtil.UNDERLINE_TAG + this.e;
    }

    public s a(float f) {
        this.e = (int) f;
        return this;
    }

    public s a(int i) {
        this.a = i;
        return this;
    }

    public s a(boolean z) {
        this.c = z;
        return this;
    }
}
