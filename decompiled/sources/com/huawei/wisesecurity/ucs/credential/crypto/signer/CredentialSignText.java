package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import o.getRowCount;

/* JADX INFO: loaded from: classes2.dex */
public class CredentialSignText {
    private CredentialSignAlg algId;
    private byte[] dataBytes;
    private byte[] signature;

    public void setAlgId(CredentialSignAlg credentialSignAlg) {
        this.algId = credentialSignAlg;
    }

    public int getAlgId() {
        return this.algId.getId();
    }

    public byte[] getDataBytes() {
        return getRowCount.RemoteActionCompatParcelizer(this.dataBytes);
    }

    public byte[] getSignature() {
        return getRowCount.RemoteActionCompatParcelizer(this.signature);
    }

    public void checkParam(boolean z) throws UcsException {
        byte[] bArr = this.dataBytes;
        if (bArr == null || bArr.length == 0) {
            throw new UcsParamException("dataBytes data can not be empty..");
        }
        if (z) {
            return;
        }
        byte[] bArr2 = this.signature;
        if (bArr2 == null || bArr2.length == 0) {
            throw new UcsParamException("signature data can not be empty..");
        }
    }

    public void setDataBytes(byte[] bArr) {
        this.dataBytes = getRowCount.RemoteActionCompatParcelizer(bArr);
    }

    public void setSignature(byte[] bArr) {
        this.signature = getRowCount.RemoteActionCompatParcelizer(bArr);
    }
}
