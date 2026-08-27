package com.huawei.wisesecurity.ucs.credential.entity;

import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import o.LiveRegionMode;
import o.accessgetSwitchcp;
import o.getColumnSpan;

/* JADX INFO: loaded from: classes2.dex */
public class EcKeyPair {
    public byte[] privateKey;
    public byte[] publicKey;

    public byte[] getPrivateKey() {
        return this.privateKey;
    }

    public byte[] getPublicKey() {
        return this.publicKey;
    }

    private EcKeyPair(Builder builder) {
        this.publicKey = builder.publicKey;
        this.privateKey = builder.privateKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {

        @LiveRegionMode
        private byte[] privateKey;

        @LiveRegionMode
        private byte[] publicKey;

        private Builder() {
        }

        public Builder privateKey(byte[] bArr) {
            this.privateKey = bArr;
            return this;
        }

        public Builder publicKey(byte[] bArr) {
            this.publicKey = bArr;
            return this;
        }

        public EcKeyPair build() throws UcsException {
            try {
                getColumnSpan.RemoteActionCompatParcelizer(this);
                return new EcKeyPair(this);
            } catch (KfsValidationException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("EcKeyPair build check param error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsParamException(sbIconCompatParcelizer.toString());
            }
        }
    }
}
