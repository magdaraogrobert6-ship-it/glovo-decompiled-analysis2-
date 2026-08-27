package com.huawei.riemann.location.bean.eph;

/* JADX INFO: loaded from: classes4.dex */
public class IrnssEphemeris {
    public int mSatNumber;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        public int mSatNumber;

        public Builder withSatNumber(int i) {
            this.mSatNumber = i;
            return this;
        }

        public static Builder aIrnssEphemeris() {
            return new Builder();
        }

        public IrnssEphemeris build() {
            IrnssEphemeris irnssEphemeris = new IrnssEphemeris();
            irnssEphemeris.mSatNumber = this.mSatNumber;
            return irnssEphemeris;
        }

        public Builder but() {
            return aIrnssEphemeris().withSatNumber(this.mSatNumber);
        }
    }
}
