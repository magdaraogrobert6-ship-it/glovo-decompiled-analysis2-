package com.huawei.wisesecurity.kfs.crypto.cipher;

import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs_credential.x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import o.ScrollCaptureExternalSyntheticApiModelOutline0;
import o.ScrollCaptureonScrollCaptureSearch1;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getRowCount;
import o.getScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDecryptHandler implements ScrollCaptureExternalSyntheticApiModelOutline0, ScrollCaptureonScrollCaptureSearch1 {
    public final Key IconCompatParcelizer;
    public final getCanScrollVertically RemoteActionCompatParcelizer;
    public final x read;
    public final /* synthetic */ int serializer;
    public final AlgorithmParameterSpec write;

    public /* synthetic */ DefaultDecryptHandler(getCanScrollVertically getcanscrollvertically, Key key, x xVar, AlgorithmParameterSpec algorithmParameterSpec, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getcanscrollvertically;
        this.IconCompatParcelizer = key;
        this.write = algorithmParameterSpec;
        this.read = xVar;
    }

    @Override // o.ScrollCaptureExternalSyntheticApiModelOutline0, o.ScrollCaptureonScrollCaptureSearch1
    public final byte[] to() throws CryptoException {
        int i = this.serializer;
        AlgorithmParameterSpec algorithmParameterSpec = this.write;
        Key key = this.IconCompatParcelizer;
        getCanScrollVertically getcanscrollvertically = this.RemoteActionCompatParcelizer;
        x xVar = this.read;
        if (i == 0) {
            try {
                String transformation = ((getScrollCaptureInProgress) xVar.IconCompatParcelizer).getTransformation();
                Cipher cipher = getcanscrollvertically == getCanScrollVertically.ANDROID_KEYSTORE ? Cipher.getInstance(transformation) : Cipher.getInstance(transformation, getcanscrollvertically.getProviderName());
                cipher.init(2, key, algorithmParameterSpec);
                return cipher.doFinal(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.RemoteActionCompatParcelizer));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to decrypt: ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new CryptoException(sbIconCompatParcelizer.toString());
            }
        }
        try {
            String transformation2 = ((getScrollCaptureInProgress) xVar.IconCompatParcelizer).getTransformation();
            Cipher cipher2 = getcanscrollvertically == getCanScrollVertically.ANDROID_KEYSTORE ? Cipher.getInstance(transformation2) : Cipher.getInstance(transformation2, getcanscrollvertically.getProviderName());
            cipher2.init(1, key, algorithmParameterSpec);
            byte[] bArrRemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(cipher2.doFinal(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.read)));
            xVar.RemoteActionCompatParcelizer = bArrRemoteActionCompatParcelizer;
            return getRowCount.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("Fail to encrypt: ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            throw new CryptoException(sbIconCompatParcelizer2.toString());
        }
    }

    @Override // o.ScrollCaptureonScrollCaptureSearch1
    /* JADX INFO: renamed from: from, reason: collision with other method in class */
    public ScrollCaptureonScrollCaptureSearch1 mo4512from(byte[] bArr) {
        this.read.read = getRowCount.RemoteActionCompatParcelizer(getRowCount.RemoteActionCompatParcelizer(bArr));
        return this;
    }

    @Override // o.ScrollCaptureExternalSyntheticApiModelOutline0
    public ScrollCaptureExternalSyntheticApiModelOutline0 from(byte[] bArr) {
        this.read.RemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(bArr);
        return this;
    }
}
