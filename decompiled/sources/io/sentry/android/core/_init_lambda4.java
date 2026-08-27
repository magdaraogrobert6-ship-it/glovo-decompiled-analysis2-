package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import io.sentry.SentryOptions;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetThumbsDowncp;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;
import o.truncslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda4 {
    public static final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
    public static volatile _init_lambda4 read;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ IconCompatParcelizer;
    public final Long MediaBrowserCompatMediaItem;
    public final truncslo4al4 MediaDescriptionCompat;
    public final io.sentry.protocol.ComponentActivity MediaMetadataCompat;
    public final SentryAndroidOptions MediaSessionCompatQueueItem;
    public final accessgetThumbsDowncp RatingCompat;
    public final Context serializer;
    public final Boolean write;

    public _init_lambda4(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        accessgetThumbsDowncp accessgetthumbsdowncp;
        truncslo4al4 truncslo4al4Var;
        Bundle bundle;
        this.serializer = context;
        this.MediaSessionCompatQueueItem = sentryAndroidOptions;
        this.IconCompatParcelizer = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.RatingCompat.read.IconCompatParcelizer();
        io.sentry.protocol.ComponentActivity componentActivity = new io.sentry.protocol.ComponentActivity();
        componentActivity.write = "Android";
        componentActivity.MediaBrowserCompatMediaItem = Build.VERSION.RELEASE;
        componentActivity.IconCompatParcelizer = Build.DISPLAY;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    property = line;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Exception while attempting to read kernel information", e);
            }
        }
        if (property != null) {
            componentActivity.RemoteActionCompatParcelizer = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            componentActivity.read = Boolean.valueOf(new io.sentry.android.core.internal.util.MediaSessionCompatToken(this.serializer, sentryAndroidOptions.getLogger(), this.IconCompatParcelizer).IconCompatParcelizer());
        }
        this.MediaMetadataCompat = componentActivity;
        this.write = this.IconCompatParcelizer.write();
        BrazeActionParserExternalSyntheticLambda0 logger2 = sentryAndroidOptions.getLogger();
        boolean z = false;
        try {
            PackageInfo packageInfoRemoteActionCompatParcelizer = _init_lambda3.RemoteActionCompatParcelizer(context, this.IconCompatParcelizer);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoRemoteActionCompatParcelizer == null || packageManager == null) {
                accessgetthumbsdowncp = null;
            } else {
                str = packageInfoRemoteActionCompatParcelizer.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    accessgetthumbsdowncp = new accessgetThumbsDowncp(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    logger2.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "%s package isn't installed.", str);
                    accessgetthumbsdowncp = null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        this.RatingCompat = accessgetthumbsdowncp;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.IconCompatParcelizer;
        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) _init_lambda3.read.IconCompatParcelizer(context) : (ApplicationInfo) _init_lambda3.RemoteActionCompatParcelizer.IconCompatParcelizer(context);
        PackageInfo packageInfoRemoteActionCompatParcelizer2 = _init_lambda3.RemoteActionCompatParcelizer(context, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        if (packageInfoRemoteActionCompatParcelizer2 != null) {
            String[] strArr = packageInfoRemoteActionCompatParcelizer2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z = bundle.getBoolean("com.android.vending.splits.required");
            }
            truncslo4al4Var = new truncslo4al4(z, strArr);
        } else {
            truncslo4al4Var = null;
        }
        this.MediaDescriptionCompat = truncslo4al4Var;
        ActivityManager.MemoryInfo memoryInfo = _init_lambda3.read(context, sentryAndroidOptions.getLogger());
        if (memoryInfo != null) {
            this.MediaBrowserCompatMediaItem = Long.valueOf(memoryInfo.totalMem);
        } else {
            this.MediaBrowserCompatMediaItem = null;
        }
    }

    public static Float RemoteActionCompatParcelizer(Intent intent, SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return null;
            }
            return Float.valueOf((intExtra / intExtra2) * 100.0f);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static _init_lambda4 read(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (read == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = RemoteActionCompatParcelizer.serializer();
            try {
                if (read == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    read = new _init_lambda4(context, sentryAndroidOptions);
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return read;
    }

    public static Boolean write(Intent intent, SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    public final io.sentry.protocol.MediaMetadataCompat IconCompatParcelizer(boolean z, boolean z2) {
        Throwable th;
        io.sentry.protocol.RatingCompat ratingCompat;
        DisplayMetrics displayMetrics;
        Date dateIconCompatParcelizer;
        String str;
        Float fValueOf;
        Context context = this.serializer;
        io.sentry.protocol.MediaMetadataCompat mediaMetadataCompat = new io.sentry.protocol.MediaMetadataCompat();
        mediaMetadataCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Build.MANUFACTURER;
        mediaMetadataCompat.RemoteActionCompatParcelizer = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.MediaSessionCompatQueueItem;
        mediaMetadataCompat.PlaybackStateCompatCustomAction = _init_lambda3.read(sentryAndroidOptions.getLogger());
        mediaMetadataCompat.ResultReceiver = Build.MODEL;
        mediaMetadataCompat.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Build.ID;
        mediaMetadataCompat.read = Build.SUPPORTED_ABIS;
        this.IconCompatParcelizer.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            mediaMetadataCompat.RatingCompat = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Boolean bool = null;
        try {
            int i = context.getResources().getConfiguration().orientation;
            if (i != 1) {
                ratingCompat = i != 2 ? null : io.sentry.protocol.RatingCompat.LANDSCAPE;
            } else {
                ratingCompat = io.sentry.protocol.RatingCompat.PORTRAIT;
            }
            if (ratingCompat == null) {
                try {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    ratingCompat = null;
                } catch (Throwable th2) {
                    th = th2;
                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting device orientation.", th);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            ratingCompat = null;
        }
        mediaMetadataCompat.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = ratingCompat;
        Boolean bool2 = this.write;
        if (bool2 != null) {
            mediaMetadataCompat._init_lambda3 = bool2;
        }
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
        try {
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (Throwable th4) {
            logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting DisplayMetrics.", th4);
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            mediaMetadataCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = Integer.valueOf(displayMetrics.widthPixels);
            mediaMetadataCompat.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = Integer.valueOf(displayMetrics.heightPixels);
            mediaMetadataCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = Float.valueOf(displayMetrics.density);
            mediaMetadataCompat.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Integer.valueOf(displayMetrics.densityDpi);
        }
        try {
            dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Error getting the device's boot time.", new Object[0]);
            dateIconCompatParcelizer = null;
        }
        mediaMetadataCompat.write = dateIconCompatParcelizer;
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        mediaMetadataCompat._init_lambda4 = !locales.isEmpty() ? Calendar.getInstance(locales.get(0)).getTimeZone() : Calendar.getInstance().getTimeZone();
        int i2 = 8;
        if (mediaMetadataCompat.ParcelableVolumeInfo == null) {
            try {
                str = (String) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new SentryTracer$$ExternalSyntheticLambda1(i2, this));
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting installationId.", th5);
                str = null;
            }
            mediaMetadataCompat.ParcelableVolumeInfo = str;
        }
        Locale locale = Locale.getDefault();
        if (mediaMetadataCompat.ComponentActivity == null) {
            mediaMetadataCompat.ComponentActivity = locale.toString();
        }
        ArrayList arrayListIconCompatParcelizer = io.sentry.android.core.internal.util.RatingCompat.read.IconCompatParcelizer();
        if (!arrayListIconCompatParcelizer.isEmpty()) {
            mediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = Double.valueOf(((Integer) Collections.max(arrayListIconCompatParcelizer)).doubleValue());
            mediaMetadataCompat.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.valueOf(arrayListIconCompatParcelizer.size());
        }
        mediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.MediaBrowserCompatMediaItem;
        if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
            boolean zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(null, intentFilter, null, null, 4) : context.registerReceiver(null, intentFilter, null, null);
            if (intentRegisterReceiver != null) {
                mediaMetadataCompat.serializer = RemoteActionCompatParcelizer(intentRegisterReceiver, sentryAndroidOptions);
                mediaMetadataCompat.MediaSessionCompatQueueItem = write(intentRegisterReceiver, sentryAndroidOptions);
                try {
                    int intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                    fValueOf = intExtra != -1 ? Float.valueOf(intExtra / 10.0f) : null;
                } catch (Throwable th6) {
                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting battery temperature.", th6);
                }
                mediaMetadataCompat.IconCompatParcelizer = fValueOf;
            }
            int i3 = accessensureViewModelStore.IconCompatParcelizer[sentryAndroidOptions.getConnectionStatusProvider().IconCompatParcelizer().ordinal()];
            if (i3 == 1) {
                bool = Boolean.FALSE;
            } else if (i3 == 2) {
                bool = Boolean.TRUE;
            }
            mediaMetadataCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = bool;
            ActivityManager.MemoryInfo memoryInfo = _init_lambda3.read(context, sentryAndroidOptions.getLogger());
            if (memoryInfo != null && z2) {
                mediaMetadataCompat.MediaSessionCompatResultReceiverWrapper = Long.valueOf(memoryInfo.availMem);
                mediaMetadataCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = Boolean.valueOf(memoryInfo.lowMemory);
            }
            sentryAndroidOptions.getRuntimeManager().serializer(new f$$ExternalSyntheticLambda1(this, mediaMetadataCompat, zIsCollectExternalStorageContext, 8));
            if (mediaMetadataCompat.MediaDescriptionCompat == null) {
                mediaMetadataCompat.MediaDescriptionCompat = sentryAndroidOptions.getConnectionStatusProvider().serializer();
            }
        }
        return mediaMetadataCompat;
    }
}
