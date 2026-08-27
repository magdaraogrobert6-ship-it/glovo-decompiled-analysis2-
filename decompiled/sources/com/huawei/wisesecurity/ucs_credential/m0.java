package com.huawei.wisesecurity.ucs_credential;

import androidx.compose.ui.graphics.Fields;
import com.huawei.wisesecurity.kfs.crypto.cipher.DefaultDecryptHandler;
import com.huawei.wisesecurity.kfs.crypto.key.AESKeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsKeyStoreException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getChildrenForSearch;
import o.getDepth;
import o.getRowCount;
import o.getScrollCaptureInProgress;
import o.getSteps;
import o.visitScrollCaptureCandidates;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {
    public static final m0 IconCompatParcelizer = new m0();
    public static final Object read = new Object();
    public static AESKeyStoreKeyManager serializer;
    public byte[] write;

    public m0(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.write = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public byte[] IconCompatParcelizer(byte[] bArr) {
        AlgorithmParameterSpec gCMParameterSpec;
        byte[] bArr2;
        synchronized (read) {
            byte[] bArr3 = this.write;
            if (bArr3 != null && bArr3.length > 0) {
                try {
                    getCanScrollVertically getcanscrollvertically = (getCanScrollVertically) serializer.IconCompatParcelizer;
                    getScrollCaptureInProgress.getPreferredAlg("AES");
                    getScrollCaptureInProgress getscrollcaptureinprogress = getScrollCaptureInProgress.AES_GCM;
                    Key keySerializer = serializer.serializer();
                    byte[] bArr4 = this.write;
                    int i = getDepth.IconCompatParcelizer[getscrollcaptureinprogress.ordinal()];
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new CryptoException("unsupported cipher alg");
                        }
                        gCMParameterSpec = new IvParameterSpec(getRowCount.RemoteActionCompatParcelizer(bArr4));
                    } else {
                        gCMParameterSpec = new GCMParameterSpec(Fields.SpotShadowColor, getRowCount.RemoteActionCompatParcelizer(bArr4));
                    }
                    AlgorithmParameterSpec algorithmParameterSpec = gCMParameterSpec;
                    if (keySerializer != null) {
                        x xVar = new x(11);
                        xVar.IconCompatParcelizer = getscrollcaptureinprogress;
                        DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler(getcanscrollvertically, keySerializer, xVar, algorithmParameterSpec, 0);
                        defaultDecryptHandler.read.RemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(bArr);
                        bArr2 = defaultDecryptHandler.to();
                    } else {
                        throw new CryptoException("key | parameterSpec cannot be null");
                    }
                } catch (KfsException e) {
                    getSteps.serializer("KeyStoreManager", "AES doDecrypt failed, " + e.getMessage(), new Object[0]);
                    throw new UcsKeyStoreException("AES doDecrypt failed , exception " + e.getMessage());
                }
            } else {
                throw new UcsKeyStoreException("iv must be set before AES decrypt");
            }
        }
        return bArr2;
    }

    public byte[] read(byte[] bArr) {
        AlgorithmParameterSpec gCMParameterSpec;
        byte[] bArr2;
        synchronized (read) {
            byte[] bArr3 = this.write;
            if (bArr3 != null && bArr3.length > 0) {
                try {
                    getCanScrollVertically getcanscrollvertically = (getCanScrollVertically) serializer.IconCompatParcelizer;
                    getScrollCaptureInProgress.getPreferredAlg("AES");
                    getScrollCaptureInProgress getscrollcaptureinprogress = getScrollCaptureInProgress.AES_GCM;
                    Key keySerializer = serializer.serializer();
                    byte[] bArr4 = this.write;
                    int i = getDepth.IconCompatParcelizer[getscrollcaptureinprogress.ordinal()];
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new CryptoException("unsupported cipher alg");
                        }
                        gCMParameterSpec = new IvParameterSpec(getRowCount.RemoteActionCompatParcelizer(bArr4));
                    } else {
                        gCMParameterSpec = new GCMParameterSpec(Fields.SpotShadowColor, getRowCount.RemoteActionCompatParcelizer(bArr4));
                    }
                    AlgorithmParameterSpec algorithmParameterSpec = gCMParameterSpec;
                    if (keySerializer != null) {
                        x xVar = new x(11);
                        xVar.IconCompatParcelizer = getscrollcaptureinprogress;
                        DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler(getcanscrollvertically, keySerializer, xVar, algorithmParameterSpec, 1);
                        defaultDecryptHandler.mo4512from(bArr);
                        bArr2 = defaultDecryptHandler.to();
                    } else {
                        throw new CryptoException("key | parameterSpec cannot be null");
                    }
                } catch (KfsException e) {
                    getSteps.serializer("KeyStoreManager", "AES doEncrypt failed, " + e.getMessage(), new Object[0]);
                    throw new UcsKeyStoreException("AES doEncrypt failed , exception " + e.getMessage());
                }
            } else {
                throw new UcsKeyStoreException("iv must be set before AES encrypt");
            }
        }
        return bArr2;
    }

    public void IconCompatParcelizer() throws UcsKeyStoreException {
        try {
            if (serializer.RemoteActionCompatParcelizer("ucs_aes_alias_rootKey")) {
                getSteps.read("KeyStoreManager", "the alias exists", new Object[0]);
                return;
            }
            try {
                serializer.RemoteActionCompatParcelizer(new visitScrollCaptureCandidates("ucs_aes_alias_rootKey", Fields.RotationX, getChildrenForSearch.PURPOSE_CRYPTO));
            } catch (KfsException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("generateKeyPair failed, ");
                sbIconCompatParcelizer.append(e.getMessage());
                getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer.toString(), new Object[0]);
                StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("generateKeyPair failed , exception ");
                sbIconCompatParcelizer2.append(e.getMessage());
                throw new UcsKeyStoreException(sbIconCompatParcelizer2.toString());
            }
        } catch (KfsException e2) {
            StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("containsAlias failed, ");
            sbIconCompatParcelizer3.append(e2.getMessage());
            getSteps.serializer("KeyStoreManager", sbIconCompatParcelizer3.toString(), new Object[0]);
            StringBuilder sbIconCompatParcelizer4 = accessgetSwitchcp.IconCompatParcelizer("containsAlias failed , exception ");
            sbIconCompatParcelizer4.append(e2.getMessage());
            throw new UcsKeyStoreException(sbIconCompatParcelizer4.toString());
        }
    }

    public m0() {
    }
}
