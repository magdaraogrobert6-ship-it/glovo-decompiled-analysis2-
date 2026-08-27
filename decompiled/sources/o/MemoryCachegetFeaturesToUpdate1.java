package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetFeaturesToUpdate1 extends generateHoldoutCacheKey {
    public static final HashSet IconCompatParcelizer;

    static {
        HashSet hashSet = new HashSet();
        IconCompatParcelizer = hashSet;
        hashSet.add(PhoneCallTypeNone.read);
        hashSet.add(PhoneCallTypeNone.RatingCompat);
        hashSet.add(PhoneCallTypeNone.MediaSessionCompatQueueItem);
        hashSet.add(PhoneCallTypeNone.RemoteActionCompatParcelizer);
        hashSet.add(PhoneCallTypeNone.MediaDescriptionCompat);
        hashSet.add(PhoneCallTypeNone.MediaBrowserCompatMediaItem);
    }

    public MemoryCachegetFeaturesToUpdate1() {
        super(IconCompatParcelizer);
    }

    @Override // o.getCurrencyCode
    public final PrivateKey IconCompatParcelizer(UserInfoCompanion userInfoCompanion) {
        MemoryCachegetFeature1 memoryCachegetFeature1 = new MemoryCachegetFeature1();
        FwFDataQueries fwFDataQueries = (FwFDataQueries) accessmergeRulerValues.serializer(userInfoCompanion);
        memoryCachegetFeature1.write = userInfoCompanion.write;
        memoryCachegetFeature1.serializer = fwFDataQueries;
        memoryCachegetFeature1.read = evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((getStructure) fwFDataQueries.ResultReceiver).serializer);
        return memoryCachegetFeature1;
    }

    @Override // o.getCurrencyCode
    public final PublicKey serializer(CustomerChatModule customerChatModule) {
        MemoryCachegetEvaluation1 memoryCachegetEvaluation1 = new MemoryCachegetEvaluation1();
        ChatService chatService = (ChatService) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
        memoryCachegetEvaluation1.write = chatService;
        memoryCachegetEvaluation1.RemoteActionCompatParcelizer = evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((getStructure) chatService.ResultReceiver).serializer);
        return memoryCachegetEvaluation1;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(java.security.Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof MemoryCachegetFeature1) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((MemoryCachegetFeature1) key).getEncoded());
            }
        } else {
            if (!(key instanceof MemoryCachegetEvaluation1)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((MemoryCachegetEvaluation1) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.Key engineTranslateKey(java.security.Key key) throws InvalidKeyException {
        if ((key instanceof MemoryCachegetFeature1) || (key instanceof MemoryCachegetEvaluation1)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
