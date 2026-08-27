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
public final class MemoryCachegetFeatureWithLock1 extends generateHoldoutCacheKey {
    public static final HashSet serializer;

    static {
        HashSet hashSet = new HashSet();
        serializer = hashSet;
        hashSet.add(PhoneCallTypeNone.PlaybackStateCompatCustomAction);
        hashSet.add(PhoneCallTypeNone.MediaMetadataCompat);
    }

    public MemoryCachegetFeatureWithLock1() {
        super(serializer);
    }

    @Override // o.getCurrencyCode
    public final PrivateKey IconCompatParcelizer(UserInfoCompanion userInfoCompanion) {
        MemoryCachegetFeature21 memoryCachegetFeature21 = new MemoryCachegetFeature21();
        insertItem insertitem = (insertItem) accessmergeRulerValues.serializer(userInfoCompanion);
        memoryCachegetFeature21.IconCompatParcelizer = userInfoCompanion.write;
        memoryCachegetFeature21.write = insertitem;
        memoryCachegetFeature21.read = evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((selectItem) insertitem.serializer).IconCompatParcelizer);
        return memoryCachegetFeature21;
    }

    @Override // o.getCurrencyCode
    public final PublicKey serializer(CustomerChatModule customerChatModule) {
        MemoryCachegetFeaturesWithLock1 memoryCachegetFeaturesWithLock1 = new MemoryCachegetFeaturesWithLock1();
        accesscreateArguments accesscreatearguments = (accesscreateArguments) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
        memoryCachegetFeaturesWithLock1.write = accesscreatearguments;
        memoryCachegetFeaturesWithLock1.serializer = evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((selectItem) accesscreatearguments.serializer).IconCompatParcelizer);
        return memoryCachegetFeaturesWithLock1;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(java.security.Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof MemoryCachegetFeature21) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((MemoryCachegetFeature21) key).getEncoded());
            }
        } else {
            if (!(key instanceof MemoryCachegetFeaturesWithLock1)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((MemoryCachegetFeaturesWithLock1) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.Key engineTranslateKey(java.security.Key key) throws InvalidKeyException {
        if ((key instanceof MemoryCachegetFeature21) || (key instanceof MemoryCachegetFeaturesWithLock1)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
