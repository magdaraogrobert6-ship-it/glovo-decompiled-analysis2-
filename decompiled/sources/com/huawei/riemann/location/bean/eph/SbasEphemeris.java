package com.huawei.riemann.location.bean.eph;

/* JADX INFO: loaded from: classes4.dex */
public class SbasEphemeris {
    public int mSatNumber;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        public int mSatNumber;

        public Builder withSatNumber(int i) {
            this.mSatNumber = i;
            return this;
        }

        public static Builder aSbasEphemeris() {
            return new Builder();
        }

        public SbasEphemeris build() {
            SbasEphemeris sbasEphemeris = new SbasEphemeris();
            sbasEphemeris.mSatNumber = this.mSatNumber;
            return sbasEphemeris;
        }

        public Builder but() {
            return aSbasEphemeris().withSatNumber(this.mSatNumber);
        }
    }
}
