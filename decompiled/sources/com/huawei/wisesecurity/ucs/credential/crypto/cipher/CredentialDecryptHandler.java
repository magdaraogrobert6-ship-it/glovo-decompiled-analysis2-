package com.huawei.wisesecurity.ucs.credential.crypto.cipher;

import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.network.ErrorCodes;
import com.huawei.wisesecurity.kfs.crypto.cipher.DefaultDecryptHandler;
import com.huawei.wisesecurity.kfs.exception.CodecException;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsCryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs_credential.x;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.ScrollCaptureCandidate;
import o.ScrollCaptureExternalSyntheticApiModelOutline0;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getCheckboxo7Vup1c;
import o.getDepth;
import o.getRowCount;
import o.getScrollCaptureInProgress;
import o.getSwitcho7Vup1c;
import o.getViewportBoundsInWindow;

/* JADX INFO: loaded from: classes5.dex */
public class CredentialDecryptHandler implements ScrollCaptureExternalSyntheticApiModelOutline0 {
    private CredentialCipherText cipherText;
    private Credential credential;
    private CredentialClient credentialClient;

    /* JADX INFO: renamed from: fromBase64, reason: merged with bridge method [inline-methods] */
    public CredentialDecryptHandler m4513fromBase64(String str) throws UcsCryptoException {
        return from(str, getViewportBoundsInWindow.MediaSessionCompatQueueItem);
    }

    /* JADX INFO: renamed from: fromBase64Url, reason: merged with bridge method [inline-methods] */
    public CredentialDecryptHandler m4514fromBase64Url(String str) throws UcsCryptoException {
        return from(str, getViewportBoundsInWindow.MediaDescriptionCompat);
    }

    /* JADX INFO: renamed from: fromHex, reason: merged with bridge method [inline-methods] */
    public CredentialDecryptHandler m4515fromHex(String str) throws UcsCryptoException {
        return from(str, getViewportBoundsInWindow.RatingCompat);
    }

    public String toBase64() throws UcsCryptoException {
        return to(ScrollCaptureCandidate.q_);
    }

    public String toHex() throws UcsCryptoException {
        return to(ScrollCaptureCandidate.r_);
    }

    public String toRawString() throws UcsCryptoException {
        return to(ScrollCaptureCandidate.MediaBrowserCompatMediaItem);
    }

    public CredentialDecryptHandler(Credential credential, CredentialCipherText credentialCipherText, CredentialClient credentialClient) {
        this.credential = credential;
        this.cipherText = credentialCipherText;
        this.credentialClient = credentialClient;
    }

    private CredentialDecryptHandler from(String str, getViewportBoundsInWindow getviewportboundsinwindow) throws UcsCryptoException {
        try {
            from(getviewportboundsinwindow.IconCompatParcelizer(str));
            return this;
        } catch (CodecException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to decode cipher text: ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsCryptoException(1003L, sbIconCompatParcelizer.toString());
        }
    }

    private String to(ScrollCaptureCandidate scrollCaptureCandidate) throws UcsCryptoException {
        try {
            return scrollCaptureCandidate.IconCompatParcelizer(to());
        } catch (CodecException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to encode plain text: ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsCryptoException(1003L, sbIconCompatParcelizer.toString());
        }
    }

    private void doDecrypt() throws UcsCryptoException {
        AlgorithmParameterSpec gCMParameterSpec;
        getCheckboxo7Vup1c getcheckboxo7vup1c = new getCheckboxo7Vup1c();
        getcheckboxo7vup1c.read.put("flavor", "developers");
        getcheckboxo7vup1c.write("appAuth.decrypt");
        getcheckboxo7vup1c.IconCompatParcelizer();
        try {
            try {
                this.cipherText.checkParam(false);
                byte[] bArrDecryptSkDk = SkDkEntity.from(this.credential.getDataKeyBytes()).decryptSkDk(getSwitcho7Vup1c.RemoteActionCompatParcelizer(this.credential));
                getScrollCaptureInProgress.getPreferredAlg("AES");
                getCanScrollVertically getcanscrollvertically = getCanScrollVertically.ANDROID_KEYSTORE;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecryptSkDk, "AES");
                getScrollCaptureInProgress getscrollcaptureinprogress = getScrollCaptureInProgress.AES_GCM;
                byte[] iv = this.cipherText.getIv();
                int i = getDepth.IconCompatParcelizer[getscrollcaptureinprogress.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new CryptoException("unsupported cipher alg");
                    }
                    gCMParameterSpec = new IvParameterSpec(getRowCount.RemoteActionCompatParcelizer(iv));
                } else {
                    gCMParameterSpec = new GCMParameterSpec(Fields.SpotShadowColor, getRowCount.RemoteActionCompatParcelizer(iv));
                }
                x xVar = new x(11);
                xVar.IconCompatParcelizer = getscrollcaptureinprogress;
                DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler(getcanscrollvertically, secretKeySpec, xVar, gCMParameterSpec, 0);
                defaultDecryptHandler.read.RemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(this.cipherText.getCipherBytes());
                this.cipherText.setPlainBytes(defaultDecryptHandler.to());
                getcheckboxo7vup1c.read(0);
                this.credentialClient.reportLogs(getcheckboxo7vup1c);
            } catch (CryptoException e) {
                e = e;
                String str = "Fail to decrypt, errorMessage : " + e.getMessage();
                getcheckboxo7vup1c.read(ErrorCodes.MALFORMED_URL_EXCEPTION);
                getcheckboxo7vup1c.IconCompatParcelizer(str);
                throw new UcsCryptoException(1003L, str);
            } catch (UcsParamException e2) {
                String str2 = "Fail to decrypt, errorMessage : " + e2.getMessage();
                getcheckboxo7vup1c.read(1001);
                getcheckboxo7vup1c.IconCompatParcelizer(str2);
                throw new UcsCryptoException(1001L, str2);
            } catch (UcsException e3) {
                e = e3;
                String str3 = "Fail to decrypt, errorMessage : " + e.getMessage();
                getcheckboxo7vup1c.read(ErrorCodes.MALFORMED_URL_EXCEPTION);
                getcheckboxo7vup1c.IconCompatParcelizer(str3);
                throw new UcsCryptoException(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(getcheckboxo7vup1c);
            throw th;
        }
    }

    @Override // o.ScrollCaptureExternalSyntheticApiModelOutline0
    public CredentialDecryptHandler from(byte[] bArr) throws UcsCryptoException {
        if (bArr == null) {
            throw new UcsCryptoException(1001L, "cipherBytes cannot null..");
        }
        this.cipherText.setCipherBytes(bArr);
        return this;
    }

    @Override // o.ScrollCaptureExternalSyntheticApiModelOutline0, o.ScrollCaptureonScrollCaptureSearch1
    public byte[] to() throws UcsCryptoException {
        doDecrypt();
        return this.cipherText.getPlainBytes();
    }
}
