package com.sentiance.sdk.util;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.threading.executors.Executors;
import o.PushMaxDataStoreProviderCompanionExternalSyntheticLambda1;
import o.PushMaxDataStoreProviderCompanionExternalSyntheticLambda3;
import o.SdkAuthenticationDataStoreProviderCompanion;
import o.SdkMetadataDataStoreProviderCompanion;
import o.clearAllData;
import o.containsandroid_sdk_base_release;
import o.migratePushMaxStorageToJsonlambda11;
import o.migratePushMaxStorageToJsonlambda3;
import o.migrateTriggersReeligibilityToJsonlambda1;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI;
import o.readList;
import o.setNotificationBadgeNumber;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes4.dex */
public abstract class N {
    private clearAllData RemoteActionCompatParcelizer = null;
    private final setNotificationBadgeNumber read = setNotificationBadgeNumber.read();
    private final migrateTriggersReeligibilityToJsonlambda1<PushMaxDataStoreProviderCompanionExternalSyntheticLambda3> write = new migratePushMaxStorageToJsonlambda11(this);
    private final migrateTriggersReeligibilityToJsonlambda1<PushMaxDataStoreProviderCompanionExternalSyntheticLambda3> serializer = new PushMaxDataStoreProviderCompanionExternalSyntheticLambda1(this);

    public clearAllData getParallelExecutor() {
        clearAllData clearalldata;
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = ((Executors) setPushUniqueId.read(Executors.class)).IconCompatParcelizer();
            }
            clearalldata = this.RemoteActionCompatParcelizer;
        }
        return clearalldata;
    }

    public <T> T ifSdkIsInitialized(T t, r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<T> r8lambda4ay9ozbjge2rhlfwcxo1syvlprk) {
        return (T) a(false).write(t, r8lambda4ay9ozbjge2rhlfwcxo1syvlprk);
    }

    public <T> T ifSdkIsInitializedWithUser(T t, r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<T> r8lambda4ay9ozbjge2rhlfwcxo1syvlprk) {
        return (T) a(true).write(t, r8lambda4ay9ozbjge2rhlfwcxo1syvlprk);
    }

    private PushMaxDataStoreProviderCompanionExternalSyntheticLambda3 a(boolean z) {
        return z ? this.write.read() : this.serializer.read();
    }

    public containsandroid_sdk_base_release getSentianceHandler() {
        return ((readList) setPushUniqueId.read(readList.class)).RemoteActionCompatParcelizer();
    }

    public static Object access$100(N n, migratePushMaxStorageToJsonlambda3 migratepushmaxstoragetojsonlambda3, Object obj, SdkAuthenticationDataStoreProviderCompanion sdkAuthenticationDataStoreProviderCompanion) {
        boolean zRemoteActionCompatParcelizer;
        int iSerializer;
        n.getClass();
        if (migratepushmaxstoragetojsonlambda3.IconCompatParcelizer() && ((iSerializer = n.read.serializer()) == 0 || iSerializer == 1 || iSerializer == 5)) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("SDK is not yet initialized.");
            return null;
        }
        try {
            if (!migratepushmaxstoragetojsonlambda3.RemoteActionCompatParcelizer() || n.read.MediaBrowserCompatMediaItem()) {
                if (!migratepushmaxstoragetojsonlambda3.serializer() || n.read.write()) {
                    if (sdkAuthenticationDataStoreProviderCompanion instanceof r8lambdaA5Nojo_weyBvRJwWwexNGN83YI) {
                        ((r8lambdaA5Nojo_weyBvRJwWwexNGN83YI) sdkAuthenticationDataStoreProviderCompanion).RemoteActionCompatParcelizer();
                        if (zRemoteActionCompatParcelizer) {
                            return obj;
                        }
                    } else {
                        if (sdkAuthenticationDataStoreProviderCompanion instanceof r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk) {
                            return ((r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk) sdkAuthenticationDataStoreProviderCompanion).IconCompatParcelizer();
                        }
                        if (sdkAuthenticationDataStoreProviderCompanion instanceof SdkMetadataDataStoreProviderCompanion) {
                            return ((SdkMetadataDataStoreProviderCompanion) sdkAuthenticationDataStoreProviderCompanion).serializer();
                        }
                    }
                } else if (zRemoteActionCompatParcelizer) {
                    return obj;
                }
            } else if (zRemoteActionCompatParcelizer) {
                return obj;
            }
            return obj;
        } finally {
            if (migratepushmaxstoragetojsonlambda3.RemoteActionCompatParcelizer()) {
                n.read.MediaMetadataCompat();
            }
        }
    }

    public static void access$200(final N n, containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar, final migratePushMaxStorageToJsonlambda3 migratepushmaxstoragetojsonlambda3, final r8lambdaA5Nojo_weyBvRJwWwexNGN83YI r8lambdaa5nojo_weybvrjwwwexngn83yi) {
        int iSerializer;
        n.getClass();
        if (migratepushmaxstoragetojsonlambda3.IconCompatParcelizer() && ((iSerializer = n.read.serializer()) == 0 || iSerializer == 1 || iSerializer == 5)) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("SDK is not yet initialized.");
        } else if (!migratepushmaxstoragetojsonlambda3.serializer() || n.read.write()) {
            containsandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new Runnable() { // from class: o.migratePushMaxStorageToJsonlambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.sentiance.sdk.util.N.$r8$lambda$FeDonMLh5u4gfW9wbXRNocfS3Do(this.read, migratepushmaxstoragetojsonlambda3, r8lambdaa5nojo_weybvrjwwwexngn83yi);
                }
            });
        }
    }

    public static PushMaxDataStoreProviderCompanionExternalSyntheticLambda3 access$000(N n, migratePushMaxStorageToJsonlambda3 migratepushmaxstoragetojsonlambda3) {
        n.getClass();
        return new PushMaxDataStoreProviderCompanionExternalSyntheticLambda3(n, migratepushmaxstoragetojsonlambda3);
    }

    public static /* synthetic */ void $r8$lambda$FeDonMLh5u4gfW9wbXRNocfS3Do(N n, migratePushMaxStorageToJsonlambda3 migratepushmaxstoragetojsonlambda3, r8lambdaA5Nojo_weyBvRJwWwexNGN83YI r8lambdaa5nojo_weybvrjwwwexngn83yi) {
        boolean zRemoteActionCompatParcelizer;
        try {
            if (migratepushmaxstoragetojsonlambda3.RemoteActionCompatParcelizer() && !n.read.MediaBrowserCompatMediaItem()) {
                if (zRemoteActionCompatParcelizer) {
                    return;
                } else {
                    return;
                }
            }
            if (!migratepushmaxstoragetojsonlambda3.serializer() || n.read.write()) {
                r8lambdaa5nojo_weybvrjwwwexngn83yi.RemoteActionCompatParcelizer();
            }
        } finally {
            if (migratepushmaxstoragetojsonlambda3.RemoteActionCompatParcelizer()) {
                n.read.MediaMetadataCompat();
            }
        }
    }

    public void ifSdkIsInitialized(containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar, r8lambdaA5Nojo_weyBvRJwWwexNGN83YI r8lambdaa5nojo_weybvrjwwwexngn83yi) {
        a(false).write(containsandroid_sdk_base_releaseVar, r8lambdaa5nojo_weybvrjwwwexngn83yi);
    }

    public void ifSdkIsInitializedWithUser(containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar, r8lambdaA5Nojo_weyBvRJwWwexNGN83YI r8lambdaa5nojo_weybvrjwwwexngn83yi) {
        a(true).write(containsandroid_sdk_base_releaseVar, r8lambdaa5nojo_weybvrjwwwexngn83yi);
    }

    public void ifSdkIsInitialized(r8lambdaA5Nojo_weyBvRJwWwexNGN83YI r8lambdaa5nojo_weybvrjwwwexngn83yi) {
        a(false).IconCompatParcelizer(r8lambdaa5nojo_weybvrjwwwexngn83yi);
    }

    public void ifSdkIsInitializedWithUser(r8lambdaA5Nojo_weyBvRJwWwexNGN83YI r8lambdaa5nojo_weybvrjwwwexngn83yi) {
        a(true).IconCompatParcelizer(r8lambdaa5nojo_weybvrjwwwexngn83yi);
    }

    public <T> T ifSdkIsInitialized(SdkMetadataDataStoreProviderCompanion<T> sdkMetadataDataStoreProviderCompanion) {
        return (T) a(false).RemoteActionCompatParcelizer(sdkMetadataDataStoreProviderCompanion);
    }

    public <T> T ifSdkIsInitializedWithUser(SdkMetadataDataStoreProviderCompanion<T> sdkMetadataDataStoreProviderCompanion) {
        return (T) a(true).RemoteActionCompatParcelizer(sdkMetadataDataStoreProviderCompanion);
    }
}
