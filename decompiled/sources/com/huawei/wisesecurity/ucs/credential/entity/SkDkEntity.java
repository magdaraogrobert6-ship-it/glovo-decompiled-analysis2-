package com.huawei.wisesecurity.ucs.credential.entity;

import androidx.compose.ui.graphics.Fields;
import com.huawei.wisesecurity.kfs.crypto.cipher.DefaultDecryptHandler;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getDepth;
import o.getRowCount;
import o.getScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public class SkDkEntity {
    private static final int GCM_IV_LEN = 12;
    private static final int GCM_TAG_LEN = 16;
    private byte[] iv;
    private byte[] secKey;

    public byte[] getIv() {
        return this.iv;
    }

    public byte[] getSecKey() {
        return this.secKey;
    }

    public static SkDkEntity from(byte[] bArr) throws UcsException {
        SkDkEntity skDkEntity = new SkDkEntity();
        if (bArr.length < 28) {
            MapboxMap$$ExternalSyntheticLambda0.m(1001L, "SK DK format error");
            return null;
        }
        byte[] bArr2 = new byte[12];
        skDkEntity.iv = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        byte[] bArr3 = new byte[bArr.length - 12];
        skDkEntity.secKey = bArr3;
        System.arraycopy(bArr, 12, bArr3, 0, bArr.length - 12);
        return skDkEntity;
    }

    public byte[] decryptSkDk(byte[] bArr) throws UcsException {
        AlgorithmParameterSpec gCMParameterSpec;
        try {
            getScrollCaptureInProgress.getPreferredAlg("AES");
            getCanScrollVertically getcanscrollvertically = getCanScrollVertically.ANDROID_KEYSTORE;
            getScrollCaptureInProgress getscrollcaptureinprogress = getScrollCaptureInProgress.AES_GCM;
            byte[] bArr2 = this.iv;
            int i = getDepth.IconCompatParcelizer[getscrollcaptureinprogress.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new CryptoException("unsupported cipher alg");
                }
                gCMParameterSpec = new IvParameterSpec(getRowCount.RemoteActionCompatParcelizer(bArr2));
            } else {
                gCMParameterSpec = new GCMParameterSpec(Fields.SpotShadowColor, getRowCount.RemoteActionCompatParcelizer(bArr2));
            }
            AlgorithmParameterSpec algorithmParameterSpec = gCMParameterSpec;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            x xVar = new x(11);
            xVar.IconCompatParcelizer = getscrollcaptureinprogress;
            DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler(getcanscrollvertically, secretKeySpec, xVar, algorithmParameterSpec, 0);
            byte[] bArr3 = this.secKey;
            defaultDecryptHandler.read.RemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(bArr3);
            return defaultDecryptHandler.to();
        } catch (CryptoException e) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("decrypt sk dk error : ");
            sbIconCompatParcelizer.append(e.getMessage());
            throw new UcsException(1003L, sbIconCompatParcelizer.toString());
        }
    }
}
