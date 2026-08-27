package com.huawei.wisesecurity.kfs.crypto.key;

import android.security.keystore.KeyGenParameterSpec;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.spec.ECGenParameterSpec;
import o.AccessibilityAction;
import o.MediaSessionCompatQueueItem;
import o.accessgetSwitchcp;
import o.getCanScrollVertically;
import o.getChildrenForSearch;
import o.getMergeDescendants;
import o.visitScrollCaptureCandidates;
import o.visitScrollCaptureCandidatesdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class ECKeyStoreKeyManager extends BaseMenuWrapper {
    public static final ECGenParameterSpec serializer = new ECGenParameterSpec("secp256r1");

    @Override // androidx.appcompat.view.menu.BaseMenuWrapper
    public final void read(visitScrollCaptureCandidates visitscrollcapturecandidates) throws KfsException {
        getCanScrollVertically getcanscrollvertically = (getCanScrollVertically) this.IconCompatParcelizer;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", getcanscrollvertically.getProviderName());
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder((String) visitscrollcapturecandidates.serializer, ((getChildrenForSearch) visitscrollcapturecandidates.RemoteActionCompatParcelizer).getValue()).setAttestationChallenge(visitscrollcapturecandidates.write ? getcanscrollvertically.getName().getBytes(StandardCharsets.UTF_8) : null).setDigests("SHA-256", "SHA-384", "SHA-512").setAlgorithmParameterSpec(serializer).setKeySize(visitscrollcapturecandidates.read).build());
            if (keyPairGenerator.generateKeyPair() != null) {
            } else {
                throw new KfsException("generate ec key pair failed with bad key");
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            throw new KfsException(MediaSessionCompatQueueItem.read(e, accessgetSwitchcp.IconCompatParcelizer("generate ec key pair failed, ")));
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuWrapper
    public final void write(visitScrollCaptureCandidates visitscrollcapturecandidates) throws KfsException {
        AccessibilityAction accessibilityAction = new AccessibilityAction((getCanScrollVertically) this.IconCompatParcelizer, 0);
        accessibilityAction.serializer = visitScrollCaptureCandidatesdefault.ECDSA;
        accessibilityAction.RemoteActionCompatParcelizer((String) visitscrollcapturecandidates.serializer);
        BaseMenuWrapper.read((getMergeDescendants) accessibilityAction.RemoteActionCompatParcelizer());
    }

    @Override // androidx.appcompat.view.menu.BaseMenuWrapper
    public final void serializer(visitScrollCaptureCandidates visitscrollcapturecandidates) throws KfsValidationException {
        if (visitscrollcapturecandidates.read != 256) {
            throw new KfsValidationException("bad ec key len, only ec prime 256 is supported");
        }
        if (((getChildrenForSearch) visitscrollcapturecandidates.RemoteActionCompatParcelizer) != getChildrenForSearch.PURPOSE_SIGN) {
            throw new KfsValidationException("bad purpose for ec key, only sign is supported");
        }
    }

    public ECKeyStoreKeyManager(getCanScrollVertically getcanscrollvertically) {
        super(getcanscrollvertically);
    }
}
