package com.huawei.wisesecurity.kfs.crypto.signer;

import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs_credential.x;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import javax.crypto.Mac;
import o.AppendedSemanticsElement;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getLabel;
import o.getRowCount;
import o.getScrollCaptureScrollByAction;
import o.visitDescendants;
import o.visitScrollCaptureCandidatesdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultSignHandler implements getLabel, AppendedSemanticsElement {
    public final getCanScrollVertically RemoteActionCompatParcelizer;
    public final x serializer;
    public final Key write;

    public /* synthetic */ DefaultSignHandler(getCanScrollVertically getcanscrollvertically, Key key, x xVar) {
        this.RemoteActionCompatParcelizer = getcanscrollvertically;
        this.write = key;
        this.serializer = xVar;
    }

    @Override // o.getLabel
    public getLabel from(String str) {
        this.serializer.read = getRowCount.RemoteActionCompatParcelizer(getRowCount.RemoteActionCompatParcelizer(str.getBytes(StandardCharsets.UTF_8)));
        return this;
    }

    @Override // o.AppendedSemanticsElement
    public AppendedSemanticsElement fromData(byte[] bArr) {
        this.serializer.read = getRowCount.RemoteActionCompatParcelizer(bArr);
        return this;
    }

    @Override // o.getLabel
    public byte[] sign() throws CryptoException {
        int[] iArr = getScrollCaptureScrollByAction.read;
        x xVar = this.serializer;
        int i = iArr[((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).ordinal()];
        Key key = this.write;
        getCanScrollVertically getcanscrollvertically = this.RemoteActionCompatParcelizer;
        if (i == 1 || i == 2 || i == 3) {
            try {
                String transformation = ((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).getTransformation();
                Signature signature = getcanscrollvertically == getCanScrollVertically.ANDROID_KEYSTORE ? Signature.getInstance(transformation) : Signature.getInstance(transformation, getcanscrollvertically.getProviderName());
                if (!(key instanceof PrivateKey)) {
                    throw new CryptoException("sign key not private key");
                }
                signature.initSign((PrivateKey) key);
                signature.update(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.read));
                xVar.RemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(signature.sign());
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to sign : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new CryptoException(sbIconCompatParcelizer.toString());
            }
        } else {
            if (i != 4) {
                StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("unsupported sign alg : ");
                sbIconCompatParcelizer2.append(((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).getTransformation());
                throw new CryptoException(sbIconCompatParcelizer2.toString());
            }
            try {
                String transformation2 = ((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).getTransformation();
                Mac mac = getcanscrollvertically == getCanScrollVertically.ANDROID_KEYSTORE ? Mac.getInstance(transformation2) : Mac.getInstance(transformation2, getcanscrollvertically.getProviderName());
                mac.init(key);
                mac.update(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.read));
                xVar.RemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(mac.doFinal());
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e2) {
                StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("Fail to sign : ");
                sbIconCompatParcelizer3.append(e2.getMessage());
                throw new CryptoException(sbIconCompatParcelizer3.toString());
            }
        }
        return getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.RemoteActionCompatParcelizer);
    }

    public static boolean serializer(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length == bArr2.length) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.AppendedSemanticsElement
    public boolean verify(byte[] bArr) throws CryptoException {
        byte[] bArrRemoteActionCompatParcelizer = getRowCount.RemoteActionCompatParcelizer(bArr);
        x xVar = this.serializer;
        xVar.RemoteActionCompatParcelizer = bArrRemoteActionCompatParcelizer;
        int i = visitDescendants.serializer[((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).ordinal()];
        Key key = this.write;
        getCanScrollVertically getcanscrollvertically = this.RemoteActionCompatParcelizer;
        if (i == 1 || i == 2 || i == 3) {
            try {
                String transformation = ((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).getTransformation();
                Signature signature = getcanscrollvertically == getCanScrollVertically.ANDROID_KEYSTORE ? Signature.getInstance(transformation) : Signature.getInstance(transformation, getcanscrollvertically.getProviderName());
                if (!(key instanceof PublicKey)) {
                    throw new CryptoException("verify key not public key");
                }
                signature.initVerify((PublicKey) key);
                signature.update(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.read));
                return signature.verify(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.RemoteActionCompatParcelizer));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to decrypt: ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new CryptoException(sbIconCompatParcelizer.toString());
            }
        }
        if (i != 4) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("unsupported sign alg : ");
            sbIconCompatParcelizer2.append(((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).getTransformation());
            throw new CryptoException(sbIconCompatParcelizer2.toString());
        }
        try {
            String transformation2 = ((visitScrollCaptureCandidatesdefault) xVar.IconCompatParcelizer).getTransformation();
            Mac mac = getcanscrollvertically == getCanScrollVertically.ANDROID_KEYSTORE ? Mac.getInstance(transformation2) : Mac.getInstance(transformation2, getcanscrollvertically.getProviderName());
            mac.init(key);
            mac.update(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.read));
            return serializer(getRowCount.RemoteActionCompatParcelizer((byte[]) xVar.RemoteActionCompatParcelizer), mac.doFinal());
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e2) {
            StringBuilder sbIconCompatParcelizer3 = accessgetSwitchcp.IconCompatParcelizer("Fail to sign : ");
            sbIconCompatParcelizer3.append(e2.getMessage());
            throw new CryptoException(sbIconCompatParcelizer3.toString());
        }
    }

    @Override // o.getLabel
    public getLabel from(byte[] bArr) {
        this.serializer.read = getRowCount.RemoteActionCompatParcelizer(getRowCount.RemoteActionCompatParcelizer(bArr));
        return this;
    }
}
