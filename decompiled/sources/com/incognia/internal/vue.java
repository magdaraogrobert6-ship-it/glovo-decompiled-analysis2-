package com.incognia.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vue {
    public final byte[] BGx;

    public final int hashCode() {
        return Arrays.hashCode(this.BGx);
    }

    public vue(byte[] bArr) {
        this.BGx = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (vue.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.BGx, ((vue) obj).BGx);
        }
        return false;
    }
}
