package io.sentry.android.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.android.SystemUtils;
import io.sentry.SentryOptions;
import java.lang.ref.WeakReference;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ implements io.sentry.transport.MediaMetadataCompat {
    public static final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ IconCompatParcelizer = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(0);
    public Object write;

    public void read(Activity activity) {
        WeakReference weakReference = (WeakReference) this.write;
        if (weakReference == null || weakReference.get() != activity) {
            this.write = new WeakReference(activity);
        }
    }

    @Override // io.sentry.transport.MediaMetadataCompat
    public boolean read() {
        int i = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer[((SentryOptions) this.write).getConnectionStatusProvider().IconCompatParcelizer().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        this.write = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    public Boolean write() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith(SystemUtils.UNKNOWN)) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            ((BrazeActionParserExternalSyntheticLambda0) this.write).serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "The ILogger object is required.");
        this.write = brazeActionParserExternalSyntheticLambda0;
    }

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(int i) {
    }
}
