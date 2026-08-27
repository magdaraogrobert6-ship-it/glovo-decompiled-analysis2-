package com.huawei.riemann.gnsslocation.core.bean.eph;

/* JADX INFO: loaded from: classes2.dex */
public class QzssEphemeris {
    public int mSatNumber;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        public int mSatNumber;

        public Builder withSatNumber(int i) {
            this.mSatNumber = i;
            return this;
        }

        public static Builder aQzssEphemeris() {
            return new Builder();
        }

        public QzssEphemeris build() {
            QzssEphemeris qzssEphemeris = new QzssEphemeris();
            qzssEphemeris.mSatNumber = this.mSatNumber;
            return qzssEphemeris;
        }

        public Builder but() {
            return aQzssEphemeris().withSatNumber(this.mSatNumber);
        }
    }
}
