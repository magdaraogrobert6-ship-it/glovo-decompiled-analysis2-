package com.mapbox.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.common.core.module.CommonSingletonModuleProvider;
import com.mapbox.maps.MapboxConstants;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.copyColorMatrixgBh15pIdefault;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.markOnScreenCardsAsReadlambda0;
import o.onContentCardClicked;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class CoreInitializer implements copyColorMatrixgBh15pIdefault {
    public static final Companion Companion = new Companion(null);
    private static final String SQLITE_TMPDIR_VAR_NAME = "SQLITE_TMPDIR";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isEmulator() {
            String str = Build.BRAND;
            str.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "generic", false)) {
                String str2 = Build.DEVICE;
                str2.getClass();
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "generic", false)) {
                    return true;
                }
            }
            String str3 = Build.FINGERPRINT;
            str3.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "generic", false) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, SystemUtils.UNKNOWN, false)) {
                return true;
            }
            String str4 = Build.HARDWARE;
            str4.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str4, (CharSequence) "goldfish", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str4, (CharSequence) "ranchu", false)) {
                return true;
            }
            String str5 = Build.MODEL;
            str5.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str5, (CharSequence) "google_sdk", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str5, (CharSequence) "Emulator", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str5, (CharSequence) "Android SDK built for x86", false)) {
                return true;
            }
            String str6 = Build.MANUFACTURER;
            str6.getClass();
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str6, (CharSequence) "Genymotion", false)) {
                return true;
            }
            String str7 = Build.PRODUCT;
            str7.getClass();
            return hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "sdk_google", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "google_sdk", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "sdk", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "sdk_x86", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "vbox86p", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "emulator", false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) "simulator", false);
        }

        public final SystemInformation createSystemInformation() {
            String str;
            String str2;
            String strValueOf;
            PackageInfo packageInfo;
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                str = SystemUtils.UNKNOWN;
                str2 = str;
                strValueOf = str2;
            } else {
                String string = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                String str3 = packageInfo.versionName;
                if (str3 != null) {
                    str3.getClass();
                } else {
                    str3 = "";
                }
                str = string;
                strValueOf = String.valueOf(packageInfo.versionCode);
                str2 = str3;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str4 = applicationInfo != null ? applicationInfo.packageName : null;
            String str5 = str4 == null ? SystemUtils.UNKNOWN : str4;
            String str6 = Build.DEVICE;
            String str7 = str6 == null ? "" : str6;
            String[] strArr = Build.SUPPORTED_ABIS;
            strArr.getClass();
            String str8 = (String) onContentCardClicked.write(strArr);
            String str9 = str8 == null ? "" : str8;
            String str10 = Build.MODEL;
            String str11 = (str10 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str10)) ? "" : str10;
            File filesDir = context.getFilesDir();
            String absolutePath = filesDir != null ? filesDir.getAbsolutePath() : null;
            String str12 = absolutePath == null ? "" : absolutePath;
            File cacheDir = context.getCacheDir();
            String absolutePath2 = cacheDir != null ? cacheDir.getAbsolutePath() : null;
            return new SystemInformation(Platform.ANDROID, "Android", Build.VERSION.RELEASE.toString(), str, str5, str2, strValueOf, str7, str9, str11, str12, !isEmulator(), absolutePath2 == null ? "" : absolutePath2);
        }

        private Companion() {
        }
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public List<Class<? extends copyColorMatrixgBh15pIdefault>> dependencies() {
        return instance_delegatelambda0.write;
    }

    public static final SystemInformation createSystemInformation() {
        return Companion.createSystemInformation();
    }

    private final void setupSqlite(Context context) throws ErrnoException {
        String str = Os.getenv(SQLITE_TMPDIR_VAR_NAME);
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            Os.setenv(SQLITE_TMPDIR_VAR_NAME, context.getCacheDir().getAbsolutePath(), true);
        }
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public MapboxSDKCommon create(Context context) throws ErrnoException {
        context.getClass();
        setupSqlite(context);
        MapboxSDKCommon mapboxSDKCommonInvoke = MapboxSDKCommon.INSTANCE.invoke(context);
        CommonSingletonModuleProvider.INSTANCE.getLoaderInstance().load(MapboxConstants.CORE_SHARED_LIBRARY_NAME);
        Log.info("Using Mapbox Common SDK v" + Version.getCommonSDKVersionString() + '(' + Version.getCommonSDKRevisionString() + ')', "common");
        String accessToken = MapboxOptions.getAccessToken();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) accessToken)) {
            Log.info("Telemetry service not started, missing token", "telemetry");
        } else {
            MapboxOptions.setAccessToken(accessToken);
        }
        FeatureTelemetryCounter.create("maps-mobile/kotlin/runtime/" + markOnScreenCardsAsReadlambda0.serializer).increment();
        return mapboxSDKCommonInvoke;
    }
}
