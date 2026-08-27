package com.huawei.wisesecurity.kfs.crypto.key;

import android.security.keystore.KeyGenParameterSpec;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.compose.ui.graphics.Fields;
import androidx.transition.TransitionValuesMaps;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import o.AccessibilityAction;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.MediaSessionCompatQueueItem;
import o.ScrollCapture_androidKt;
import o.ScrollCaptureonScrollCaptureSearch3;
import o.accessgetSwitchcp;
import o.accessminIntrinsicHeightjd;
import o.getCanScrollVertically;
import o.getChildrenForSearch;
import o.getDepth;
import o.getMergeDescendants;
import o.getRowCount;
import o.getScrollCaptureInProgress;
import o.visitScrollCaptureCandidates;
import o.visitScrollCaptureCandidatesdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class AESKeyStoreKeyManager extends BaseMenuWrapper {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AESKeyStoreKeyManager(int i) {
        super(getCanScrollVertically.ANDROID_KEYSTORE);
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuWrapper
    public final void read(visitScrollCaptureCandidates visitscrollcapturecandidates) throws KfsException {
        int i = this.RemoteActionCompatParcelizer;
        getCanScrollVertically getcanscrollvertically = (getCanScrollVertically) this.IconCompatParcelizer;
        if (i != 0) {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", getcanscrollvertically.getProviderName());
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder((String) visitscrollcapturecandidates.serializer, ((getChildrenForSearch) visitscrollcapturecandidates.RemoteActionCompatParcelizer).getValue()).setAttestationChallenge(getcanscrollvertically.getName().getBytes(StandardCharsets.UTF_8)).setSignaturePaddings("PKCS1", "PSS").setEncryptionPaddings("PKCS1Padding", "OAEPPadding").setDigests("SHA-256", "SHA-384", "SHA-512").setKeySize(visitscrollcapturecandidates.read).build());
                if (keyPairGenerator.generateKeyPair() != null) {
                    return;
                } else {
                    throw new KfsException("generate rsa key pair failed with bad key");
                }
            } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("generate rsa key pair failed, ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new KfsException(sbIconCompatParcelizer.toString());
            }
        }
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", getcanscrollvertically.getProviderName());
            keyGenerator.init(new KeyGenParameterSpec.Builder((String) visitscrollcapturecandidates.serializer, ((getChildrenForSearch) visitscrollcapturecandidates.RemoteActionCompatParcelizer).getValue()).setKeySize(visitscrollcapturecandidates.read).setAttestationChallenge(getcanscrollvertically.getName().getBytes(StandardCharsets.UTF_8)).setRandomizedEncryptionRequired(false).setBlockModes("GCM", "CBC").setEncryptionPaddings("NoPadding", "PKCS7Padding").build());
            if (keyGenerator.generateKey() != null) {
            } else {
                throw new KfsException("generate aes key failed with bad key");
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e2) {
            StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("generate aes key failed, ");
            sbIconCompatParcelizer2.append(e2.getMessage());
            throw new KfsException(sbIconCompatParcelizer2.toString());
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuWrapper
    public final void serializer(visitScrollCaptureCandidates visitscrollcapturecandidates) throws KfsValidationException {
        if (this.RemoteActionCompatParcelizer != 0) {
            int i = visitscrollcapturecandidates.read;
            if (i != 2048 && i != 3072 && i != 4096) {
                throw new KfsValidationException("bad rsa key len");
            }
            return;
        }
        int i2 = visitscrollcapturecandidates.read;
        if (i2 != 128 && i2 != 192 && i2 != 256) {
            throw new KfsValidationException("bad aes key len");
        }
        if (((getChildrenForSearch) visitscrollcapturecandidates.RemoteActionCompatParcelizer) != getChildrenForSearch.PURPOSE_CRYPTO) {
            throw new KfsValidationException("bad purpose for aes key, only crypto is supported");
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuWrapper
    public final void write(visitScrollCaptureCandidates visitscrollcapturecandidates) throws KfsException {
        AlgorithmParameterSpec gCMParameterSpec;
        if (this.RemoteActionCompatParcelizer != 0) {
            getCanScrollVertically getcanscrollvertically = (getCanScrollVertically) this.IconCompatParcelizer;
            getChildrenForSearch getchildrenforsearch = (getChildrenForSearch) visitscrollcapturecandidates.RemoteActionCompatParcelizer;
            String str = (String) visitscrollcapturecandidates.serializer;
            if (getChildrenForSearch.containsPurpose(getchildrenforsearch, getChildrenForSearch.PURPOSE_CRYPTO)) {
                ScrollCaptureonScrollCaptureSearch3 scrollCaptureonScrollCaptureSearch3 = new ScrollCaptureonScrollCaptureSearch3(getcanscrollvertically);
                scrollCaptureonScrollCaptureSearch3.read = getScrollCaptureInProgress.RSA_OAEP;
                scrollCaptureonScrollCaptureSearch3.RemoteActionCompatParcelizer(str);
                BaseMenuWrapper.read((ScrollCapture_androidKt) scrollCaptureonScrollCaptureSearch3.write());
            }
            if (getChildrenForSearch.containsPurpose(getchildrenforsearch, getChildrenForSearch.PURPOSE_SIGN)) {
                AccessibilityAction accessibilityAction = new AccessibilityAction(getcanscrollvertically, 1);
                accessibilityAction.serializer = visitScrollCaptureCandidatesdefault.RSA_SHA256;
                accessibilityAction.RemoteActionCompatParcelizer(str);
                BaseMenuWrapper.read((getMergeDescendants) accessibilityAction.RemoteActionCompatParcelizer());
                return;
            }
            return;
        }
        getScrollCaptureInProgress getscrollcaptureinprogress = getScrollCaptureInProgress.AES_GCM;
        int ivLen = getscrollcaptureinprogress.getIvLen();
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("EncryptUtil");
        byte[] bArrRemoteActionCompatParcelizer = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(ivLen);
        getCanScrollVertically getcanscrollvertically2 = (getCanScrollVertically) this.IconCompatParcelizer;
        getScrollCaptureInProgress.getPreferredAlg("AES");
        String str2 = (String) visitscrollcapturecandidates.serializer;
        try {
            KeyStore keyStore = KeyStore.getInstance(getcanscrollvertically2.getName());
            keyStore.load(null);
            Key key = keyStore.getKey(str2, null);
            int i = getDepth.IconCompatParcelizer[getscrollcaptureinprogress.ordinal()];
            if (i == 1) {
                gCMParameterSpec = new GCMParameterSpec(Fields.SpotShadowColor, getRowCount.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer));
            } else {
                if (i != 2 && i != 3) {
                    throw new CryptoException("unsupported cipher alg");
                }
                gCMParameterSpec = new IvParameterSpec(getRowCount.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer));
            }
            if (key == null) {
                throw new CryptoException("key | parameterSpec cannot be null");
            }
            BaseMenuWrapper.read(new TransitionValuesMaps(getcanscrollvertically2, getscrollcaptureinprogress, key, gCMParameterSpec));
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            throw new KfsException(MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("keystore get key with alias failed, ")));
        }
    }
}
