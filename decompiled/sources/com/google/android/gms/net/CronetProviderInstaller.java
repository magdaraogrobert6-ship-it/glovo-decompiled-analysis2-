package com.google.android.gms.net;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;
import o.ParentDataModifierDefaultImpls;
import o.accessgetSystemNavigationDowncp;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes2.dex */
public class CronetProviderInstaller {
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final String zza = "CronetProviderInstaller";
    private static final GoogleApiAvailabilityLight zzb = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzc = new Object();
    private static DynamiteModule zzd = null;
    private static String zze = "0";

    private CronetProviderInstaller() {
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    public static Task installProvider(Context context) {
        accessgetSystemNavigationDowncp.serializer(context, "Context must not be null");
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        boolean zIsInstalled = isInstalled();
        zzw zzwVar = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        if (zIsInstalled) {
            parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
            return zzwVar;
        }
        new Thread(new zza(context, 0, parentDataModifierDefaultImpls)).start();
        return zzwVar;
    }

    public static DynamiteModule zza() {
        DynamiteModule dynamiteModule;
        synchronized (zzc) {
            dynamiteModule = zzd;
        }
        return dynamiteModule;
    }

    public static String zzb() {
        String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    @Deprecated
    public static void zzc(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        synchronized (zzc) {
            if (isInstalled()) {
                return;
            }
            accessgetSystemNavigationDowncp.serializer(context, "Context must not be null");
            ClassLoader classLoader = CronetProviderInstaller.class.getClassLoader();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(classLoader);
            try {
                classLoader.loadClass("org.chromium.net.CronetEngine");
                int apiLevel = ApiVersion.getApiLevel();
                GoogleApiAvailabilityLight googleApiAvailabilityLight = zzb;
                googleApiAvailabilityLight.verifyGooglePlayServicesIsAvailable(context, 11925000);
                try {
                    DynamiteModule dynamiteModuleLoad = DynamiteModule.load(context, DynamiteModule.RemoteActionCompatParcelizer, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> clsLoadClass = dynamiteModuleLoad.ResultReceiver.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                            SentryLogcatAdapter.serializer(zza, "ImplVersion class is missing from Cronet module.");
                            throw new GooglePlayServicesNotAvailableException();
                        }
                        Method method = clsLoadClass.getMethod("getApiLevel", null);
                        Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                        Integer num = (Integer) method.invoke(null, null);
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(num);
                        int iIntValue = num.intValue();
                        String str = (String) method2.invoke(null, null);
                        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
                        zze = str;
                        if (apiLevel <= iIntValue) {
                            zzd = dynamiteModuleLoad;
                            return;
                        }
                        if (googleApiAvailabilityLight.getErrorResolutionIntent(context, 2, "cr") == null) {
                            SentryLogcatAdapter.serializer(zza, "Unable to fetch error resolution intent");
                            throw new GooglePlayServicesNotAvailableException();
                        }
                        String str2 = zze;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                        sb.append("Google Play Services update is required. The API Level of the client is ");
                        sb.append(apiLevel);
                        sb.append(". The API Level of the implementation is ");
                        sb.append(iIntValue);
                        sb.append(". The Cronet implementation version is ");
                        sb.append(str2);
                        throw new GooglePlayServicesRepairableException(sb.toString());
                    } catch (Exception e) {
                        SentryLogcatAdapter.read(zza, "Unable to read Cronet version from the Cronet module ", e);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e));
                    }
                } catch (DynamiteModule.LoadingException e2) {
                    SentryLogcatAdapter.read(zza, "Unable to load Cronet module", e2);
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e2));
                }
            } catch (ClassNotFoundException e3) {
                SentryLogcatAdapter.serializer(zza, "Cronet API is not available. Have you included all required dependencies?");
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e3));
            }
        }
    }
}
