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
public final class MemoryCachegetProfileAttributes11 extends generateHoldoutCacheKey {
    public static final HashSet RemoteActionCompatParcelizer;

    static {
        HashSet hashSet = new HashSet();
        RemoteActionCompatParcelizer = hashSet;
        hashSet.add(PhoneCallTypeNone.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        hashSet.add(PhoneCallTypeNone.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        hashSet.add(PhoneCallTypeNone.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        hashSet.add(PhoneCallTypeNone.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        hashSet.add(PhoneCallTypeNone.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        hashSet.add(PhoneCallTypeNone.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
    }

    public MemoryCachegetProfileAttributes11() {
        super(RemoteActionCompatParcelizer);
    }

    @Override // o.getCurrencyCode
    public final PrivateKey IconCompatParcelizer(UserInfoCompanion userInfoCompanion) {
        MemoryCachegetHoldouts1 memoryCachegetHoldouts1 = new MemoryCachegetHoldouts1();
        memoryCachegetHoldouts1.read = userInfoCompanion.write;
        FwFCacheItem fwFCacheItem = (FwFCacheItem) accessmergeRulerValues.serializer(userInfoCompanion);
        memoryCachegetHoldouts1.write = fwFCacheItem;
        memoryCachegetHoldouts1.serializer = evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((accessgetHelpcenterRegionConfig) fwFCacheItem.MediaBrowserCompatMediaItem).write);
        return memoryCachegetHoldouts1;
    }

    @Override // o.getCurrencyCode
    public final PublicKey serializer(CustomerChatModule customerChatModule) {
        MemoryCachegetHoldoutKeys11 memoryCachegetHoldoutKeys11 = new MemoryCachegetHoldoutKeys11();
        accessgetDriver accessgetdriver = (accessgetDriver) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
        memoryCachegetHoldoutKeys11.serializer = accessgetdriver;
        memoryCachegetHoldoutKeys11.IconCompatParcelizer = evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(((accessgetHelpcenterRegionConfig) accessgetdriver.MediaBrowserCompatMediaItem).write);
        return memoryCachegetHoldoutKeys11;
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(java.security.Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof MemoryCachegetHoldouts1) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((MemoryCachegetHoldouts1) key).getEncoded());
            }
        } else {
            if (!(key instanceof MemoryCachegetHoldoutKeys11)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((MemoryCachegetHoldoutKeys11) key).getEncoded());
            }
        }
        throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.Key engineTranslateKey(java.security.Key key) throws InvalidKeyException {
        if ((key instanceof MemoryCachegetHoldouts1) || (key instanceof MemoryCachegetHoldoutKeys11)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
