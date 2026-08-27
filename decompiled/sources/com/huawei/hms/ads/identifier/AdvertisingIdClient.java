package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class AdvertisingIdClient {
    private static final String NIL_UUID = "00000000-0000-0000-0000-000000000000";
    private static final String SETTINGS_AD_ID = "pps_oaid";
    private static final String SETTINGS_TRACK_LIMIT = "pps_track_limit";
    private static final String TAG = "AdvertisingIdClient";

    public static boolean isAdvertisingIdAvailable(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo(f.a(context), Fields.SpotShadowColor);
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(f.a(context));
            return !packageManager.queryIntentServices(intent, 0).isEmpty();
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    public static final class Info {
        private final String advertisingId;
        private final boolean limitAdTrackingEnabled;

        public String getId() {
            return this.advertisingId;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        public Info(String str, boolean z) {
            this.advertisingId = str;
            this.limitAdTrackingEnabled = z;
        }
    }

    private static boolean isHmsValid(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || !f.a(context, str)) {
            return false;
        }
        return b.a(str, f.c(context, str));
    }

    private static void updateAdvertisingIdInfo(final Context context) {
        j.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.AdvertisingIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdvertisingIdClient.requestAdvertisingIdInfo(context);
                } catch (Throwable th) {
                    SentryLogcatAdapter.IconCompatParcelizer(AdvertisingIdClient.TAG, "update Id err: ".concat(th.getClass().getSimpleName()));
                }
            }
        });
    }

    public static boolean verifyAdId(Context context, String str, boolean z) throws AdIdVerifyException {
        try {
            Info infoRequestAdvertisingIdInfo = requestAdvertisingIdInfo(context);
            return TextUtils.equals(str, infoRequestAdvertisingIdInfo.getId()) && z == infoRequestAdvertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Throwable unused) {
            throw new AdIdVerifyException("Something wrong with verification, please try later.");
        }
    }

    private static Info getIdInfoViaAIDL(Context context) throws IOException {
        String str;
        try {
            context.getPackageManager().getPackageInfo(f.a(context), Fields.SpotShadowColor);
            a aVar = new a();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            String strA = f.a(context);
            if (!isHmsValid(context, strA)) {
                return new Info(NIL_UUID, true);
            }
            intent.setPackage(strA);
            try {
                if (!context.bindService(intent, aVar, 1)) {
                    str = "bind failed";
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(str);
                    return null;
                }
                try {
                    try {
                        OpenDeviceIdentifierService openDeviceIdentifierServiceAsInterface = OpenDeviceIdentifierService.Stub.asInterface(aVar.a());
                        Info info = new Info(openDeviceIdentifierServiceAsInterface.getOaid(), openDeviceIdentifierServiceAsInterface.isOaidTrackLimited());
                        try {
                            context.unbindService(aVar);
                            return info;
                        } catch (Throwable th) {
                            SentryLogcatAdapter.IconCompatParcelizer(TAG, "unbind ".concat(th.getClass().getSimpleName()));
                            return info;
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("bind hms service InterruptedException");
                    }
                } catch (RemoteException unused2) {
                    throw new IOException("bind hms service RemoteException");
                }
            } catch (Throwable th2) {
                try {
                    context.unbindService(aVar);
                } catch (Throwable th3) {
                    SentryLogcatAdapter.IconCompatParcelizer(TAG, "unbind ".concat(th3.getClass().getSimpleName()));
                }
                throw th2;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            str = "Service not found";
        } catch (Exception unused4) {
            str = "Service not found: Exception";
        }
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException {
        try {
            if (!TextUtils.isEmpty(Settings.Global.getString(context.getContentResolver(), "pps_oaid_c"))) {
                Info infoA = c.a(context);
                return infoA != null ? infoA : requestAdvertisingIdInfo(context);
            }
            String string = Settings.Global.getString(context.getContentResolver(), SETTINGS_AD_ID);
            String string2 = Settings.Global.getString(context.getContentResolver(), SETTINGS_TRACK_LIMIT);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                updateAdvertisingIdInfo(context);
                return new Info(string, Boolean.valueOf(string2).booleanValue());
            }
            return requestAdvertisingIdInfo(context);
        } catch (Throwable th) {
            SentryLogcatAdapter.IconCompatParcelizer(TAG, "get Id err: ".concat(th.getClass().getSimpleName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Info requestAdvertisingIdInfo(Context context) throws IOException {
        return c.d(context) ? c.c(context) : getIdInfoViaAIDL(context);
    }
}
