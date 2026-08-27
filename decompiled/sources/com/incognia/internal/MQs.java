package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MQs {
    public final long BGx;
    public final long mbG;

    public final int hashCode() {
        return Long.hashCode(this.mbG) + (Long.hashCode(this.BGx) * 31);
    }

    public MQs(long j, long j2) {
        this.BGx = j;
        this.mbG = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MQs)) {
            return false;
        }
        MQs mQs = (MQs) obj;
        return this.BGx == mQs.BGx && this.mbG == mQs.mbG;
    }
}
