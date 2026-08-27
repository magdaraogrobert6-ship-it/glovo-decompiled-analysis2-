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
import o.AppendedSemanticsElement;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getCheckboxo7Vup1c;
import o.getRowCount;
import o.getSwitcho7Vup1c;
import o.getViewportBoundsInWindow;
import o.visitScrollCaptureCandidatesdefault;

/* JADX INFO: loaded from: classes2.dex */
public class CredentialVerifyHandler implements AppendedSemanticsElement {
    private Credential credential;
    private CredentialClient credentialClient;
    private CredentialSignText signText;

    /* JADX INFO: renamed from: fromBase64Data, reason: merged with bridge method [inline-methods] */
    public CredentialVerifyHandler m4523fromBase64Data(String str) throws UcsCryptoException {
        return fromData(str, getViewportBoundsInWindow.MediaSessionCompatQueueItem);
    }

    /* JADX INFO: renamed from: fromBase64UrlData, reason: merged with bridge method [inline-methods] */
    public CredentialVerifyHandler m4524fromBase64UrlData(String str) throws UcsCryptoException {
        return fromData(str, getViewportBoundsInWindow.MediaDescriptionCompat);
    }

    /* JADX INFO: renamed from: fromHexData, reason: merged with bridge method [inline-methods] */
    public CredentialVerifyHandler m4526fromHexData(String str) throws UcsCryptoException {
        return fromData(str, getViewportBoundsInWindow.RatingCompat);
    }

    public boolean verifyBase64(String str) throws UcsCryptoException {
        return verify(str, getViewportBoundsInWindow.MediaSessionCompatQueueItem);
    }

    public boolean verifyBase64Url(String str) throws UcsCryptoException {
        return verify(str, getViewportBoundsInWindow.MediaDescriptionCompat);
    }

    public boolean verifyHex(String str) throws UcsCryptoException {
        return verify(str, getViewportBoundsInWindow.RatingCompat);
    }

    public CredentialVerifyHandler(Credential credential, CredentialSignText credentialSignText, CredentialClient credentialClient) {
        this.credential = credential;
        this.signText = credentialSignText;
        this.credentialClient = credentialClient;
    }

    private boolean doVerify() throws UcsCryptoException {
        getCheckboxo7Vup1c getcheckboxo7vup1c = new getCheckboxo7Vup1c();
        getcheckboxo7vup1c.read.put("flavor", "developers");
        getcheckboxo7vup1c.write("appAuth.verify");
        getcheckboxo7vup1c.IconCompatParcelizer();
        try {
            try {
                this.signText.checkParam(false);
                byte[] bArrDecryptSkDk = SkDkEntity.from(this.credential.getSecretKeyBytes()).decryptSkDk(getSwitcho7Vup1c.RemoteActionCompatParcelizer(this.credential));
                visitScrollCaptureCandidatesdefault preferredAlg = visitScrollCaptureCandidatesdefault.getPreferredAlg("HMAC");
                getCanScrollVertically getcanscrollvertically = getCanScrollVertically.ANDROID_KEYSTORE;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecryptSkDk, preferredAlg.getTransformation());
                visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault = visitScrollCaptureCandidatesdefault.HMAC_SHA256;
                x xVar = new x(12);
                xVar.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
                DefaultSignHandler defaultSignHandler = new DefaultSignHandler(getcanscrollvertically, secretKeySpec, xVar);
                defaultSignHandler.serializer.read = getRowCount.RemoteActionCompatParcelizer(getRowCount.RemoteActionCompatParcelizer(this.signText.getDataBytes()));
                boolean zCheckSignature = checkSignature(defaultSignHandler.sign(), this.signText.getSignature());
                getcheckboxo7vup1c.read(0);
                this.credentialClient.reportLogs(getcheckboxo7vup1c);
                return zCheckSignature;
            } catch (CryptoException e) {
                e = e;
                String str = "Fail to verify, errorMessage : " + e.getMessage();
                getcheckboxo7vup1c.read(ErrorCodes.MALFORMED_URL_EXCEPTION);
                getcheckboxo7vup1c.IconCompatParcelizer(str);
                throw new UcsCryptoException(1003L, str);
            } catch (UcsParamException e2) {
                String str2 = "Fail to verify, errorMessage : " + e2.getMessage();
                getcheckboxo7vup1c.read(1001);
                getcheckboxo7vup1c.IconCompatParcelizer(str2);
                throw new UcsCryptoException(1001L, str2);
            } catch (UcsException e3) {
                e = e3;
                String str3 = "Fail to verify, errorMessage : " + e.getMessage();
                getcheckboxo7vup1c.read(ErrorCodes.MALFORMED_URL_EXCEPTION);
                getcheckboxo7vup1c.IconCompatParcelizer(str3);
                throw new UcsCryptoException(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(getcheckboxo7vup1c);
            throw th;
        }
    }

    private CredentialVerifyHandler fromData(String str, getViewportBoundsInWindow getviewportboundsinwindow) throws UcsCryptoException {
        try {
            fromData(getviewportboundsinwindow.IconCompatParcelizer(str));
            return this;
        } catch (CodecException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to decode sign data: ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsCryptoException(1003L, sbIconCompatParcelizer.toString());
        }
    }

    private boolean verify(String str, getViewportBoundsInWindow getviewportboundsinwindow) throws UcsCryptoException {
        try {
            return verify(getviewportboundsinwindow.IconCompatParcelizer(str));
        } catch (CodecException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to decode signature : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsCryptoException(1003L, sbIconCompatParcelizer.toString());
        }
    }

    private boolean checkSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: fromData, reason: merged with bridge method [inline-methods] */
    public CredentialVerifyHandler m4525fromData(String str) throws UcsCryptoException {
        if (TextUtils.isEmpty(str)) {
            throw new UcsCryptoException(1001L, "dataString cannot empty..");
        }
        return fromData(str.getBytes(StandardCharsets.UTF_8));
    }

    public boolean verify(String str) throws UcsCryptoException {
        if (TextUtils.isEmpty(str)) {
            throw new UcsCryptoException(1001L, "signature cannot empty..");
        }
        return verify(str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // o.AppendedSemanticsElement
    public boolean verify(byte[] bArr) throws UcsCryptoException {
        this.signText.setSignature(bArr);
        return doVerify();
    }

    @Override // o.AppendedSemanticsElement
    public CredentialVerifyHandler fromData(byte[] bArr) {
        this.signText.setDataBytes(bArr);
        return this;
    }
}
