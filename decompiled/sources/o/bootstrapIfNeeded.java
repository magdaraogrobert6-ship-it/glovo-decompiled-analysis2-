package o;

import java.io.Serializable;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.logging.Level;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;

/* JADX INFO: loaded from: classes4.dex */
public final class bootstrapIfNeeded implements PrivilegedAction {
    public final /* synthetic */ int read;
    public final /* synthetic */ Serializable write;

    public /* synthetic */ bootstrapIfNeeded(int i, Serializable serializable) {
        this.read = i;
        this.write = serializable;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String str;
        String str2;
        int i = this.read;
        Serializable serializable = this.write;
        if (i == 0) {
            return Security.getProperty((String) serializable);
        }
        int i2 = 1;
        if (i == 1) {
            try {
                return ClassLoader.getSystemClassLoader().loadClass((String) serializable);
            } catch (Exception unused) {
                return null;
            }
        }
        int i3 = 2;
        if (i == 2) {
            try {
                return Class.forName((String) serializable);
            } catch (Exception unused2) {
                return null;
            }
        }
        int i4 = 3;
        if (i == 3) {
            return System.getProperty((String) serializable);
        }
        getPaymentMedium getpaymentmedium = (getPaymentMedium) serializable;
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.digest.", getPaymentMedium.serializer);
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.symmetric.", getPaymentMedium.MediaSessionCompatQueueItem);
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.symmetric.", getPaymentMedium.MediaDescriptionCompat);
        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k[] r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8kArr = getPaymentMedium.MediaMetadataCompat;
        int i5 = 0;
        for (int i6 = 0; i6 != r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8kArr.length; i6++) {
            r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8kArr[i6];
            try {
                CustomerChatModulesendMessage2.serializer();
                getPaymentMedium.serializer("org.bouncycastle.jcajce.provider.symmetric.", r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.IconCompatParcelizer());
            } catch (CryptoServiceConstraintsException unused3) {
                java.util.logging.Logger logger = getPaymentMedium.read;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine("service for " + r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.IconCompatParcelizer() + " ignored due to constraints");
                }
            }
        }
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.asymmetric.", getPaymentMedium.write);
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.asymmetric.", getPaymentMedium.RemoteActionCompatParcelizer);
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.keystore.", getPaymentMedium.IconCompatParcelizer);
        getPaymentMedium.read("org.bouncycastle.jcajce.provider.drbg.", getPaymentMedium.MediaBrowserCompatMediaItem);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.setPictureInPictureParams);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.createNavigationEventHandleractivity);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.handleOnBackCancelled);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.dispatchResult);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.BackHandlerKtExternalSyntheticLambda1);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.setContentView);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.reportFullyDrawn);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.setEnabled);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.remove);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.onLaunch);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.register);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.getOnBackPressedDispatcherannotations);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.ComposePredictiveBackHandlerlaunchNewGesture11);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.handleMessage);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.AlertControllerButtonHandler);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.onStart);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.onStop);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.handleOnBackPressed);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.addCloseableactivity);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.ActivityResultRegistry);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.accessgetLaunchedKeysp);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.ComponentDialog);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.startActivityForResult);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.removeCloseableactivity);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.handleOnBackStarted);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.onRestoreInstanceState);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.registerKey);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.startIntentSenderForResult);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.getLifecycleRegistry1);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.ActivityResult);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.getIndexOfFirstFeature);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.performMenuItemShortcut);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.IntentSenderRequest);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.invoke);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.ComponentDialogExternalSyntheticLambda0);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.run);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.isEnabled);
        getPaymentMedium.serializer(PhoneCallTypeNone.invokeSuspend, new MemoryCachegetFromStoragedata1(8));
        SweepGradientShader9KIMszodefault.serializer(new getNetworkModule("1.3.9999.6.4.10"));
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0);
        SweepGradientShader9KIMszodefault.serializer(PhoneCallTypeNone.Keep);
        getPaymentMedium.serializer(User.RatingCompat, new MemoryCachegetFromStoragedata1(7));
        getPaymentMedium.serializer(User.serializer, new MemoryCachegetFromStoragedata1(4));
        int i7 = 9;
        getPaymentMedium.serializer(User.MediaDescriptionCompat, new MemoryCachegetFromStoragedata1(i7));
        getPaymentMedium.serializer(getRefundValue.write, new MemoryCachegetFromStoragedata1(i7));
        int i8 = 10;
        getPaymentMedium.serializer(User.MediaMetadataCompat, new MemoryCachegetFromStoragedata1(i8));
        getPaymentMedium.serializer(getRefundValue.serializer, new MemoryCachegetFromStoragedata1(i8));
        getPaymentMedium.serializer(PhoneCallTypeNormal.RemoteActionCompatParcelizer, new MemoryCachegetFromStoragedata1(i4));
        getPaymentMedium.serializer(PhoneCallTypeNone.getFullyDrawnReporter, new MemoryCachegetFromStoragedata1(6));
        getPaymentMedium.serializer(PhoneCallTypeNone.PlaybackStateCompatCustomAction, new MemoryCachegetFeatureWithLock1());
        getPaymentMedium.serializer(PhoneCallTypeNone.MediaMetadataCompat, new MemoryCachegetFeatureWithLock1());
        getPaymentMedium.serializer(PhoneCallTypeNone.read, new MemoryCachegetFeaturesToUpdate1());
        getPaymentMedium.serializer(PhoneCallTypeNone.RatingCompat, new MemoryCachegetFeaturesToUpdate1());
        getPaymentMedium.serializer(PhoneCallTypeNone.MediaSessionCompatQueueItem, new MemoryCachegetFeaturesToUpdate1());
        getPaymentMedium.serializer(PhoneCallTypeNone.RemoteActionCompatParcelizer, new MemoryCachegetFeaturesToUpdate1());
        getPaymentMedium.serializer(PhoneCallTypeNone.MediaDescriptionCompat, new MemoryCachegetFeaturesToUpdate1());
        getPaymentMedium.serializer(PhoneCallTypeNone.MediaBrowserCompatMediaItem, new MemoryCachegetFeaturesToUpdate1());
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, new MemoryCachegetProfileAttributes11());
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, new MemoryCachegetProfileAttributes11());
        getNetworkModule getnetworkmodule = PhoneCallTypeNone.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        getPaymentMedium.serializer(getnetworkmodule, new MemoryCachegetProfileAttributes11());
        getPaymentMedium.serializer(PhoneCallTypeNone._init_lambda2, new MemoryCachegetFromStoragedata1(i3));
        getPaymentMedium.serializer(PhoneCallTypeNone.createFullyDrawnExecutor, new MemoryCachegetFromStoragedata1(i3));
        getPaymentMedium.serializer(PhoneCallTypeNone.ensureViewModelStore, new MemoryCachegetFromStoragedata1(i3));
        getPaymentMedium.serializer(PhoneCallTypeNone.getOnBackPressedInput, new MemoryCachegetFromStoragedata1(i3));
        getPaymentMedium.serializer(PhoneCallTypeNone.fullyDrawnReporter_delegatelambda00, new MemoryCachegetFromStoragedata1(i3));
        getPaymentMedium.serializer(PhoneCallTypeNone.IconCompatParcelizer, new MemoryCachegetFromStoragedata1(i2));
        getPaymentMedium.serializer(PhoneCallTypeNone.write, new MemoryCachegetFromStoragedata1(i2));
        getPaymentMedium.serializer(PhoneCallTypeNone.serializer, new MemoryCachegetFromStoragedata1(i2));
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, new MemoryCachegetFromStoragedata1(i5));
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, new MemoryCachegetFromStoragedata1(i5));
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, new MemoryCachegetFromStoragedata1(i5));
        getPaymentMedium.serializer(getnetworkmodule, new MemoryCachegetProfileAttributes11());
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, new MemoryCachegetProfileAttributes11());
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, new MemoryCachegetProfileAttributes11());
        getPaymentMedium.serializer(PhoneCallTypeNone.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, new MemoryCachegetProfileAttributes11());
        int i9 = 5;
        getPaymentMedium.serializer(PhoneCallTypeNone.onBackPressedDispatcher_delegatelambda00, new MemoryCachegetFromStoragedata1(i9));
        getPaymentMedium.serializer(PhoneCallTypeNone.onBackPressedDispatcher_delegatelambda0, new MemoryCachegetFromStoragedata1(i9));
        getPaymentMedium.serializer(PhoneCallTypeNone.onBackPressedInput_delegatelambda0, new MemoryCachegetFromStoragedata1(i9));
        getPaymentMedium.serializer(PhoneCallTypeNone.addOnConfigurationChangedListener, new MemoryCachegetFromStoragedata1(i9));
        getpaymentmedium.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        getpaymentmedium.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        getpaymentmedium.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        getpaymentmedium.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        getpaymentmedium.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        getpaymentmedium.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        getpaymentmedium.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        getpaymentmedium.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        getpaymentmedium.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        getpaymentmedium.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        getpaymentmedium.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        getpaymentmedium.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        getpaymentmedium.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        getpaymentmedium.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        getpaymentmedium.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = getPaymentMedium.MediaSessionCompatResultReceiverWrapper;
        getpaymentmedium.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        getpaymentmedium.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            getpaymentmedium.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            getpaymentmedium.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        getpaymentmedium.put("CertPathBuilder.RFC3280", str2);
        getpaymentmedium.put("CertPathValidator.PKIX", str);
        getpaymentmedium.put("CertPathBuilder.PKIX", str2);
        getpaymentmedium.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        getpaymentmedium.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        getpaymentmedium.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        getpaymentmedium.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        return null;
    }
}
