package com.huawei.wisesecurity.ucs.credential.crypto.cipher;

import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import o.LiveRegionMode;
import o.ScrollCapture_androidKt;
import o.accessgetSwitchcp;
import o.getColumnSpan;
import o.getRowCount;

/* JADX INFO: loaded from: classes5.dex */
public class CredentialCipher implements ScrollCapture_androidKt {
    public CredentialCipherText cipherText;
    private Credential credential;
    private CredentialClient credentialClient;

    @Override // o.ScrollCapture_androidKt
    public CredentialDecryptHandler getDecryptHandler() {
        return new CredentialDecryptHandler(this.credential, this.cipherText, this.credentialClient);
    }

    @Override // o.ScrollCapture_androidKt
    public CredentialEncryptHandler getEncryptHandler() {
        return new CredentialEncryptHandler(this.credential, this.cipherText, this.credentialClient);
    }

    public static class Builder {

        @LiveRegionMode
        private CredentialCipherAlg cipherAlg = CredentialCipherAlg.AES_GCM;

        @LiveRegionMode
        private Credential credential;

        @LiveRegionMode
        private CredentialClient credentialClient;

        @LiveRegionMode
        private byte[] iv;

        public Builder withAlg(CredentialCipherAlg credentialCipherAlg) {
            this.cipherAlg = credentialCipherAlg;
            return this;
        }

        public Builder withCredential(Credential credential) {
            this.credential = credential;
            return this;
        }

        public Builder withCredentialClient(CredentialClient credentialClient) {
            this.credentialClient = credentialClient;
            return this;
        }

        public Builder withIv(byte[] bArr) {
            this.iv = getRowCount.RemoteActionCompatParcelizer(bArr);
            return this;
        }

        public CredentialCipher build() throws UcsException {
            try {
                getColumnSpan.RemoteActionCompatParcelizer(this);
                return new CredentialCipher(this.cipherAlg, this.credential, this.iv, this.credentialClient);
            } catch (KfsValidationException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("CredentialCipher check param error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsParamException(sbIconCompatParcelizer.toString());
            }
        }
    }

    public CredentialCipher(CredentialCipherAlg credentialCipherAlg, Credential credential, byte[] bArr, CredentialClient credentialClient) {
        this.credential = credential;
        CredentialCipherText credentialCipherText = new CredentialCipherText();
        credentialCipherText.setAlgId(credentialCipherAlg);
        credentialCipherText.setIv(bArr);
        this.cipherText = credentialCipherText;
        this.credentialClient = credentialClient;
    }
}
