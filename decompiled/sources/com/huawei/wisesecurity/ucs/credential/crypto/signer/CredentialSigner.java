package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import o.LiveRegionMode;
import o.accessgetSwitchcp;
import o.getColumnSpan;
import o.getMergeDescendants;

/* JADX INFO: loaded from: classes2.dex */
public class CredentialSigner implements getMergeDescendants {
    private Credential credential;
    private CredentialClient credentialClient;
    private CredentialSignText signText;

    @Override // o.getMergeDescendants
    public CredentialSignHandler getSignHandler() {
        return new CredentialSignHandler(this.credential, this.signText, this.credentialClient);
    }

    @Override // o.getMergeDescendants
    public CredentialVerifyHandler getVerifyHandler() {
        return new CredentialVerifyHandler(this.credential, this.signText, this.credentialClient);
    }

    private CredentialSigner(CredentialSignAlg credentialSignAlg, Credential credential, CredentialClient credentialClient) {
        this.credential = credential;
        CredentialSignText credentialSignText = new CredentialSignText();
        this.signText = credentialSignText;
        credentialSignText.setAlgId(credentialSignAlg);
        this.credentialClient = credentialClient;
    }

    public static class Builder {

        @LiveRegionMode
        private Credential credential;

        @LiveRegionMode
        private CredentialClient credentialClient;

        @LiveRegionMode
        private CredentialSignAlg signAlg = CredentialSignAlg.HMAC_SHA256;

        public Builder withAlg(CredentialSignAlg credentialSignAlg) {
            this.signAlg = credentialSignAlg;
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

        public CredentialSigner build() throws UcsException {
            try {
                getColumnSpan.RemoteActionCompatParcelizer(this);
                return new CredentialSigner(this.signAlg, this.credential, this.credentialClient);
            } catch (KfsValidationException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("CredentialCipher check param error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsParamException(sbIconCompatParcelizer.toString());
            }
        }
    }
}
