package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import o.accessgetSystemNavigationDowncp;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            CronetProviderInstaller.zzc(this.mContext);
            try {
                DynamiteModule dynamiteModuleZza = CronetProviderInstaller.zza();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(dynamiteModuleZza);
                ClassLoader classLoader = dynamiteModuleZza.ResultReceiver.getClassLoader();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                accessgetSystemNavigationDowncp.serializer(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (GooglePlayServicesNotAvailableException e2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Google Play Services Cronet provider is unavailable on this device.", e2);
            return null;
        } catch (GooglePlayServicesRepairableException e3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
            return null;
        }
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    private void tryToInstallCronetProvider() {
        try {
            CronetProviderInstaller.zzc(this.mContext);
        } catch (GooglePlayServicesNotAvailableException unused) {
            Log.isLoggable(TAG, 4);
        } catch (GooglePlayServicesRepairableException unused2) {
            Log.isLoggable(TAG, 4);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public String getVersion() {
        tryToInstallCronetProvider();
        return CronetProviderInstaller.zzb();
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return CronetProviderInstaller.isInstalled();
    }
}
