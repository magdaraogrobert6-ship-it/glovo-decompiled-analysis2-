package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.huawei.wisesecurity.kfs.crypto.signer.DefaultSignHandler;
import com.huawei.wisesecurity.kfs.exception.CodecException;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsCryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs_credential.x;
import java.nio.charset.StandardCharsets;
import javax.crypto.spec.SecretKeySpec;
import o.ScrollCaptureCandidate;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getCheckboxo7Vup1c;
import o.getLabel;
import o.getRowCount;
import o.getSwitcho7Vup1c;
import o.getViewportBoundsInWindow;
import o.visitScrollCaptureCandidatesdefault;

/* JADX INFO: loaded from: classes2.dex */
public class CredentialSignHandler implements getLabel {
    private Credential credential;
    private CredentialClient credentialClient;
    private CredentialSignText signText;

    /* JADX INFO: renamed from: fromBase64, reason: merged with bridge method [inline-methods] */
    public CredentialSignHandler m4520fromBase64(String str) throws UcsCryptoException {
        return from(str, getViewportBoundsInWindow.MediaSessionCompatQueueItem);
    }

    /* JADX INFO: renamed from: fromBase64Url, reason: merged with bridge method [inline-methods] */
    public CredentialSignHandler m4521fromBase64Url(String str) throws UcsCryptoException {
        return from(str, getViewportBoundsInWindow.MediaDescriptionCompat);
    }

    /* JADX INFO: renamed from: fromHex, reason: merged with bridge method [inline-methods] */
    public CredentialSignHandler m4522fromHex(String str) throws UcsCryptoException {
        return from(str, getViewportBoundsInWindow.RatingCompat);
    }

    public String signBase64() throws UcsCryptoException {
        return sign(ScrollCaptureCandidate.q_);
    }

    public String signBase64Url() throws UcsCryptoException {
        return sign(ScrollCaptureCandidate.p_);
    }

    public String signHex() throws UcsCryptoException {
        return sign(ScrollCaptureCandidate.r_);
    }

    public CredentialSignHandler(Credential credential, CredentialSignText credentialSignText, CredentialClient credentialClient) {
        this.credential = credential;
        this.signText = credentialSignText;
        this.credentialClient = credentialClient;
    }

    private String sign(ScrollCaptureCandidate scrollCaptureCandidate) throws UcsCryptoException {
        try {
            doSign();
            return scrollCaptureCandidate.IconCompatParcelizer(this.signText.getSignature());
        } catch (CodecException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to encode signature bytes: ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsCryptoException(1003L, sbIconCompatParcelizer.toString());
        }
    }

    private void doSign() throws UcsCryptoException {
        getCheckboxo7Vup1c getcheckboxo7vup1c = new getCheckboxo7Vup1c();
        getcheckboxo7vup1c.read.put("flavor", "developers");
        getcheckboxo7vup1c.write("appAuth.sign");
        getcheckboxo7vup1c.IconCompatParcelizer();
        try {
            try {
                this.signText.checkParam(true);
                byte[] bArrDecryptSkDk = SkDkEntity.from(this.credential.getSecretKeyBytes()).decryptSkDk(getSwitcho7Vup1c.RemoteActionCompatParcelizer(this.credential));
                visitScrollCaptureCandidatesdefault preferredAlg = visitScrollCaptureCandidatesdefault.getPreferredAlg("HMAC");
                getCanScrollVertically getcanscrollvertically = getCanScrollVertically.ANDROID_KEYSTORE;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecryptSkDk, preferredAlg.getTransformation());
                visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault = visitScrollCaptureCandidatesdefault.HMAC_SHA256;
                x xVar = new x(12);
                xVar.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
                DefaultSignHandler defaultSignHandler = new DefaultSignHandler(getcanscrollvertically, secretKeySpec, xVar);
                defaultSignHandler.serializer.read = getRowCount.RemoteActionCompatParcelizer(getRowCount.RemoteActionCompatParcelizer(this.signText.getDataBytes()));
                this.signText.setSignature(defaultSignHandler.sign());
                getcheckboxo7vup1c.read(0);
                this.credentialClient.reportLogs(getcheckboxo7vup1c);
            } catch (CryptoException e) {
                e = e;
                String str = "Fail to sign, errorMessage : " + e.getMessage();
                getcheckboxo7vup1c.read(ErrorCodes.MALFORMED_URL_EXCEPTION);
                getcheckboxo7vup1c.IconCompatParcelizer(str);
                throw new UcsCryptoException(1003L, str);
            } catch (UcsParamException e2) {
                String str2 = "Fail to sign, errorMessage : " + e2.getMessage();
                getcheckboxo7vup1c.read(1001);
                getcheckboxo7vup1c.IconCompatParcelizer(str2);
                throw new UcsCryptoException(1001L, str2);
            } catch (UcsException e3) {
                e = e3;
                String str3 = "Fail to sign, errorMessage : " + e.getMessage();
                getcheckboxo7vup1c.read(ErrorCodes.MALFORMED_URL_EXCEPTION);
                getcheckboxo7vup1c.IconCompatParcelizer(str3);
                throw new UcsCryptoException(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(getcheckboxo7vup1c);
            throw th;
        }
    }

    private CredentialSignHandler from(String str, getViewportBoundsInWindow getviewportboundsinwindow) throws UcsCryptoException {
        try {
            from(getviewportboundsinwindow.IconCompatParcelizer(str));
            return this;
        } catch (CodecException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to decode plain text : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsCryptoException(1003L, sbIconCompatParcelizer.toString());
        }
    }

    @Override // o.getLabel
    public CredentialSignHandler from(String str) throws UcsCryptoException {
        if (TextUtils.isEmpty(str)) {
            throw new UcsCryptoException(1001L, "dataString cannot empty..");
        }
        return from(str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // o.getLabel
    public CredentialSignHandler from(byte[] bArr) {
        this.signText.setDataBytes(getRowCount.RemoteActionCompatParcelizer(bArr));
        return this;
    }

    @Override // o.getLabel
    public byte[] sign() throws UcsCryptoException {
        doSign();
        return this.signText.getSignature();
    }
}
