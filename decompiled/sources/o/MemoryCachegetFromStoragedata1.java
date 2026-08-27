package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.security.InvalidKeyException;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachegetFromStoragedata1 extends KeyFactorySpi implements getCurrencyCode {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ MemoryCachegetFromStoragedata1(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.Key engineTranslateKey(java.security.Key key) throws InvalidKeyException {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                if ((key instanceof MemoryCachegetFeatures1) || (key instanceof MemoryCachegetHoldoutsWithLock1)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 1:
                if ((key instanceof MemoryCachegetAccountConfig11) || (key instanceof MemoryCachegetEvaluations1)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 2:
                if ((key instanceof MemoryCachegetAllFromStoragedata1) || (key instanceof MemoryCachegetCustomerProfile11)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 3:
                if ((key instanceof MemoryCachesetEvaluation1) || (key instanceof MemoryCachesetFeatureWithLock1)) {
                    return key;
                }
                throw new InvalidKeyException("unsupported key type");
            case 4:
                if ((key instanceof MemoryCachesetFeatures1) || (key instanceof MemoryCachesetHoldouts1)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 5:
                if ((key instanceof MemoryCachesetEvaluations1) || (key instanceof generateCustomerProfileKey)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 6:
                if ((key instanceof generateAccountConfigKey) || (key instanceof generateFeatureCacheKey)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 7:
                if ((key instanceof generateCustomerProfileUpdatedAtKey) || (key instanceof UtilKt)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 8:
                if ((key instanceof generateRuntimeFeatureKeysKey) || (key instanceof generateFeaturesUpdatedAtKey)) {
                    return key;
                }
                throw new InvalidKeyException("Unsupported key type");
            case 9:
                if ((key instanceof createDatabase) || (key instanceof FwFCacheSQL)) {
                    return key;
                }
                throw new InvalidKeyException("unsupported key type");
            default:
                if ((key instanceof generateHoldoutKeysConfigCacheKey) || (key instanceof generateProfileAttributesKey)) {
                    return key;
                }
                throw new InvalidKeyException("unsupported key type");
        }
    }

    @Override // o.getCurrencyCode
    public final PrivateKey IconCompatParcelizer(UserInfoCompanion userInfoCompanion) {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                MemoryCachegetFeatures1 memoryCachegetFeatures1 = new MemoryCachegetFeatures1();
                memoryCachegetFeatures1.RemoteActionCompatParcelizer = userInfoCompanion.write;
                memoryCachegetFeatures1.read = (FwFDataQueriesSelectItemQueryexecute1) accessmergeRulerValues.serializer(userInfoCompanion);
                return memoryCachegetFeatures1;
            case 1:
                MemoryCachegetAccountConfig11 memoryCachegetAccountConfig11 = new MemoryCachegetAccountConfig11();
                memoryCachegetAccountConfig11.RemoteActionCompatParcelizer = userInfoCompanion.write;
                memoryCachegetAccountConfig11.read = (FWFRequestJsonAdapter) accessmergeRulerValues.serializer(userInfoCompanion);
                return memoryCachegetAccountConfig11;
            case 2:
                MemoryCachegetAllFromStoragedata1 memoryCachegetAllFromStoragedata1 = new MemoryCachegetAllFromStoragedata1();
                memoryCachegetAllFromStoragedata1.serializer = userInfoCompanion.write;
                memoryCachegetAllFromStoragedata1.write = (FeatureInfo) accessmergeRulerValues.serializer(userInfoCompanion);
                return memoryCachegetAllFromStoragedata1;
            case 3:
                MemoryCachesetEvaluation1 memoryCachesetEvaluation1 = new MemoryCachesetEvaluation1();
                memoryCachesetEvaluation1.read = userInfoCompanion.write;
                memoryCachesetEvaluation1.RemoteActionCompatParcelizer = (ICache) accessmergeRulerValues.serializer(userInfoCompanion);
                return memoryCachesetEvaluation1;
            case 4:
                MemoryCachesetFeatures1 memoryCachesetFeatures1 = new MemoryCachesetFeatures1();
                memoryCachesetFeatures1.RemoteActionCompatParcelizer = userInfoCompanion.write;
                memoryCachesetFeatures1.read = (accessgetFeatureWithLock) accessmergeRulerValues.serializer(userInfoCompanion);
                return memoryCachesetFeatures1;
            case 5:
                MemoryCachesetEvaluations1 memoryCachesetEvaluations1 = new MemoryCachesetEvaluations1();
                memoryCachesetEvaluations1.write = userInfoCompanion.write;
                memoryCachesetEvaluations1.RemoteActionCompatParcelizer = (accessmigrateHoldoutKeys) accessmergeRulerValues.serializer(userInfoCompanion);
                return memoryCachesetEvaluations1;
            case 6:
                generateAccountConfigKey generateaccountconfigkey = new generateAccountConfigKey();
                generateaccountconfigkey.RemoteActionCompatParcelizer = userInfoCompanion.write;
                generateaccountconfigkey.read = (getAllFromStorage) accessmergeRulerValues.serializer(userInfoCompanion);
                return generateaccountconfigkey;
            case 7:
                generateCustomerProfileUpdatedAtKey generatecustomerprofileupdatedatkey = new generateCustomerProfileUpdatedAtKey();
                generatecustomerprofileupdatedatkey.IconCompatParcelizer = userInfoCompanion.write;
                generatecustomerprofileupdatedatkey.serializer = CryptoManagerImpl.serializer(userInfoCompanion.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer;
                generatecustomerprofileupdatedatkey.RemoteActionCompatParcelizer = (migrateHoldoutKeys) accessmergeRulerValues.serializer(userInfoCompanion);
                return generatecustomerprofileupdatedatkey;
            case 8:
                generateRuntimeFeatureKeysKey generateruntimefeaturekeyskey = new generateRuntimeFeatureKeysKey();
                generateruntimefeaturekeyskey.write = userInfoCompanion.write;
                generateruntimefeaturekeyskey.IconCompatParcelizer = (deleteFeature) accessmergeRulerValues.serializer(userInfoCompanion);
                return generateruntimefeaturekeyskey;
            case 9:
                createDatabase createdatabase = new createDatabase();
                createdatabase.read = userInfoCompanion.write;
                createdatabase.serializer = UserChangedDuringChatOpenException.IconCompatParcelizer(userInfoCompanion.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer;
                createdatabase.RemoteActionCompatParcelizer = (MemoryCachebootstrapInitialData1) accessmergeRulerValues.serializer(userInfoCompanion);
                return createdatabase;
            default:
                generateHoldoutKeysConfigCacheKey generateholdoutkeysconfigcachekey = new generateHoldoutKeysConfigCacheKey();
                generateholdoutkeysconfigcachekey.IconCompatParcelizer = userInfoCompanion.write;
                generateholdoutkeysconfigcachekey.serializer = CustomerChatNotInitializedException.RemoteActionCompatParcelizer(userInfoCompanion.serializer.serializer).serializer.IconCompatParcelizer;
                generateholdoutkeysconfigcachekey.write = (setFeatures) accessmergeRulerValues.serializer(userInfoCompanion);
                return generateholdoutkeysconfigcachekey;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e) {
                    UserAgentHeaderInterceptor.write(e);
                    return null;
                }
            case 1:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e2) {
                    UserAgentHeaderInterceptor.write(e2);
                    return null;
                }
            case 2:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e3) {
                    UserAgentHeaderInterceptor.write(e3);
                    return null;
                }
            case 3:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e4) {
                    throw new InvalidKeySpecException(e4.toString(), e4);
                }
            case 4:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e5) {
                    UserAgentHeaderInterceptor.write(e5);
                    return null;
                }
            case 5:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e6) {
                    UserAgentHeaderInterceptor.write(e6);
                    return null;
                }
            case 6:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e7) {
                    UserAgentHeaderInterceptor.write(e7);
                    return null;
                }
            case 7:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e8) {
                    UserAgentHeaderInterceptor.write(e8);
                    return null;
                }
            case 8:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e9) {
                    UserAgentHeaderInterceptor.write(e9);
                    return null;
                }
            case 9:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e10) {
                    UserAgentHeaderInterceptor.write(e10);
                    return null;
                }
            default:
                if (!(keySpec instanceof X509EncodedKeySpec)) {
                    UserAgentHeaderInterceptor.write(keySpec, "unknown key specification: ");
                    return null;
                }
                try {
                    return serializer(CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception e11) {
                    UserAgentHeaderInterceptor.write(e11);
                    return null;
                }
        }
    }

    @Override // o.getCurrencyCode
    public final PublicKey serializer(CustomerChatModule customerChatModule) {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                MemoryCachegetHoldoutsWithLock1 memoryCachegetHoldoutsWithLock1 = new MemoryCachegetHoldoutsWithLock1();
                memoryCachegetHoldoutsWithLock1.IconCompatParcelizer = (FwFDataQueriesselectItem1) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return memoryCachegetHoldoutsWithLock1;
            case 1:
                MemoryCachegetEvaluations1 memoryCachegetEvaluations1 = new MemoryCachegetEvaluations1();
                memoryCachegetEvaluations1.serializer = (UserPropertiesCompanion) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return memoryCachegetEvaluations1;
            case 2:
                MemoryCachegetCustomerProfile11 memoryCachegetCustomerProfile11 = new MemoryCachegetCustomerProfile11();
                memoryCachegetCustomerProfile11.read = (accessfetchUserFeatureFlags) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return memoryCachegetCustomerProfile11;
            case 3:
                MemoryCachesetFeatureWithLock1 memoryCachesetFeatureWithLock1 = new MemoryCachesetFeatureWithLock1();
                memoryCachesetFeatureWithLock1.serializer = (ICache) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return memoryCachesetFeatureWithLock1;
            case 4:
                MemoryCachesetHoldouts1 memoryCachesetHoldouts1 = new MemoryCachesetHoldouts1();
                memoryCachesetHoldouts1.read = (accessgetFeaturesWithLock) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return memoryCachesetHoldouts1;
            case 5:
                generateCustomerProfileKey generatecustomerprofilekey = new generateCustomerProfileKey();
                generatecustomerprofilekey.IconCompatParcelizer = (accessgetHoldoutsWithLock) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return generatecustomerprofilekey;
            case 6:
                generateFeatureCacheKey generatefeaturecachekey = new generateFeatureCacheKey();
                generatefeaturecachekey.read = (getFeaturesdefault) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return generatefeaturecachekey;
            case 7:
                UtilKt utilKt = new UtilKt();
                utilKt.serializer = CryptoManagerImpl.serializer(customerChatModule.RemoteActionCompatParcelizer.serializer).IconCompatParcelizer.IconCompatParcelizer;
                utilKt.read = (setInitialDataFeatures) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return utilKt;
            case 8:
                generateFeaturesUpdatedAtKey generatefeaturesupdatedatkey = new generateFeaturesUpdatedAtKey();
                generatefeaturesupdatedatkey.read = (setRuntimeFeatureKeys) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                return generatefeaturesupdatedatkey;
            case 9:
                FwFCacheSQL fwFCacheSQL = new FwFCacheSQL();
                MemoryCachedecodeHoldouts11 memoryCachedecodeHoldouts11 = (MemoryCachedecodeHoldouts11) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                fwFCacheSQL.IconCompatParcelizer = memoryCachedecodeHoldouts11;
                fwFCacheSQL.read = accessgetTransparentcp.serializer((String) memoryCachedecodeHoldouts11.ResultReceiver);
                return fwFCacheSQL;
            default:
                generateProfileAttributesKey generateprofileattributeskey = new generateProfileAttributesKey();
                setProfileAttributesfwf_client_release setprofileattributesfwf_client_release = (setProfileAttributesfwf_client_release) deleteRuntimeFeatureKeysfwf_client_release.IconCompatParcelizer(customerChatModule);
                generateprofileattributeskey.serializer = setprofileattributesfwf_client_release;
                generateprofileattributeskey.read = accessgetTransparentcp.serializer((String) setprofileattributesfwf_client_release.MediaBrowserCompatMediaItem);
                return generateprofileattributeskey;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e) {
                        UserAgentHeaderInterceptor.write(e);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 1:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e2) {
                        UserAgentHeaderInterceptor.write(e2);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 2:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e3) {
                        UserAgentHeaderInterceptor.write(e3);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 3:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e4) {
                        throw new InvalidKeySpecException(e4.toString(), e4);
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            case 4:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e5) {
                        UserAgentHeaderInterceptor.write(e5);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 5:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e6) {
                        UserAgentHeaderInterceptor.write(e6);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 6:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e7) {
                        UserAgentHeaderInterceptor.write(e7);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 7:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e8) {
                        UserAgentHeaderInterceptor.write(e8);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 8:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e9) {
                        UserAgentHeaderInterceptor.write(e9);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
            case 9:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e10) {
                        UserAgentHeaderInterceptor.write(e10);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
            default:
                if (keySpec instanceof PKCS8EncodedKeySpec) {
                    try {
                        return IconCompatParcelizer(UserInfoCompanion.write(provideRequest.RemoteActionCompatParcelizer(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
                    } catch (Exception e11) {
                        UserAgentHeaderInterceptor.write(e11);
                        return null;
                    }
                }
                throw new InvalidKeySpecException("unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(java.security.Key key, Class cls) throws InvalidKeySpecException {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                if (key instanceof MemoryCachegetFeatures1) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((MemoryCachegetFeatures1) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof MemoryCachegetHoldoutsWithLock1)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((MemoryCachegetHoldoutsWithLock1) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 1:
                if (key instanceof MemoryCachegetAccountConfig11) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((MemoryCachegetAccountConfig11) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof MemoryCachegetEvaluations1)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((MemoryCachegetEvaluations1) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 2:
                if (key instanceof MemoryCachegetAllFromStoragedata1) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((MemoryCachegetAllFromStoragedata1) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof MemoryCachegetCustomerProfile11)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((MemoryCachegetCustomerProfile11) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 3:
                if (key instanceof MemoryCachesetEvaluation1) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((MemoryCachesetEvaluation1) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof MemoryCachesetFeatureWithLock1)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((MemoryCachesetFeatureWithLock1) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "unknown key specification: ", "."));
            case 4:
                if (key instanceof MemoryCachesetFeatures1) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((MemoryCachesetFeatures1) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof MemoryCachesetHoldouts1)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((MemoryCachesetHoldouts1) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 5:
                if (key instanceof MemoryCachesetEvaluations1) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((MemoryCachesetEvaluations1) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof generateCustomerProfileKey)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((generateCustomerProfileKey) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 6:
                if (key instanceof generateAccountConfigKey) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((generateAccountConfigKey) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof generateFeatureCacheKey)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((generateFeatureCacheKey) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 7:
                if (key instanceof generateCustomerProfileUpdatedAtKey) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((generateCustomerProfileUpdatedAtKey) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof UtilKt)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((UtilKt) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 8:
                if (key instanceof generateRuntimeFeatureKeysKey) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((generateRuntimeFeatureKeysKey) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof generateFeaturesUpdatedAtKey)) {
                        throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((generateFeaturesUpdatedAtKey) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "Unknown key specification: ", "."));
            case 9:
                if (key instanceof createDatabase) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((createDatabase) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof FwFCacheSQL)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((FwFCacheSQL) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "unknown key specification: ", "."));
            default:
                if (key instanceof generateHoldoutKeysConfigCacheKey) {
                    if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new PKCS8EncodedKeySpec(((generateHoldoutKeysConfigCacheKey) key).getEncoded());
                    }
                } else {
                    if (!(key instanceof generateProfileAttributesKey)) {
                        throw new InvalidKeySpecException("unsupported key type: " + key.getClass() + ".");
                    }
                    if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        return new X509EncodedKeySpec(((generateProfileAttributesKey) key).getEncoded());
                    }
                }
                throw new InvalidKeySpecException(d$$ExternalSyntheticOutline0.m(cls, "unknown key specification: ", "."));
        }
    }
}
