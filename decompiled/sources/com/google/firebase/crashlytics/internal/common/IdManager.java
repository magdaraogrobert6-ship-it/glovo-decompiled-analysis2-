package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.room.RoomDatabase$closeBarrier$1;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.installations.FirebaseInstallations;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.LazyKt__LazyJVMKt;
import o.AccessibilityIterators;
import o.accesssetInstancecp;
import o.checkMeasuredSize;
import o.getLayingOutChildren;
import o.mergeJsonObjectslambda00;
import o.placeSelfMLgxB_4;

/* JADX INFO: loaded from: classes2.dex */
public final class IdManager {
    public final accesssetInstancecp MediaBrowserCompatMediaItem;
    public checkMeasuredSize MediaDescriptionCompat;
    public final mergeJsonObjectslambda00 MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final Context serializer;
    public final ComponentRegistry$Builder write;
    public static final Pattern read = Pattern.compile("[^\\p{Alnum}]");
    public static final String IconCompatParcelizer = Pattern.quote("/");

    public final String IconCompatParcelizer(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        synchronized (this) {
            lowerCase = read.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
            Log.isLoggable("FirebaseCrashlytics", 2);
            sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        }
        return lowerCase;
    }

    public final checkMeasuredSize RemoteActionCompatParcelizer() {
        String str;
        synchronized (this) {
            checkMeasuredSize checkmeasuredsize = this.MediaDescriptionCompat;
            if (checkmeasuredsize != null && (checkmeasuredsize.IconCompatParcelizer != null || !this.write.read())) {
                return this.MediaDescriptionCompat;
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            SharedPreferences sharedPreferences = this.serializer.getSharedPreferences("com.google.firebase.crashlytics", 0);
            String string = sharedPreferences.getString("firebase.installation.id", null);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (this.write.read()) {
                placeSelfMLgxB_4 placeselfmlgxb_4FetchTrueFid = fetchTrueFid(false);
                Log.isLoggable("FirebaseCrashlytics", 2);
                if (placeselfmlgxb_4FetchTrueFid.read == null) {
                    if (string == null) {
                        str = "SYN_" + UUID.randomUUID().toString();
                    } else {
                        str = string;
                    }
                    placeselfmlgxb_4FetchTrueFid = new placeSelfMLgxB_4(str, null);
                }
                if (Objects.equals(placeselfmlgxb_4FetchTrueFid.read, string)) {
                    this.MediaDescriptionCompat = new checkMeasuredSize(sharedPreferences.getString("crashlytics.installation.id", null), placeselfmlgxb_4FetchTrueFid.read, placeselfmlgxb_4FetchTrueFid.IconCompatParcelizer);
                } else {
                    this.MediaDescriptionCompat = new checkMeasuredSize(IconCompatParcelizer(sharedPreferences, placeselfmlgxb_4FetchTrueFid.read), placeselfmlgxb_4FetchTrueFid.read, placeselfmlgxb_4FetchTrueFid.IconCompatParcelizer);
                }
            } else if (string == null || !string.startsWith("SYN_")) {
                this.MediaDescriptionCompat = new checkMeasuredSize(IconCompatParcelizer(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
            } else {
                this.MediaDescriptionCompat = new checkMeasuredSize(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
            }
            Objects.toString(this.MediaDescriptionCompat);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return this.MediaDescriptionCompat;
        }
    }

    public final String IconCompatParcelizer() {
        String str;
        mergeJsonObjectslambda00 mergejsonobjectslambda00 = this.MediaSessionCompatQueueItem;
        Context context = this.serializer;
        synchronized (mergejsonobjectslambda00) {
            if (mergejsonobjectslambda00.RemoteActionCompatParcelizer == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                mergejsonobjectslambda00.RemoteActionCompatParcelizer = installerPackageName;
            }
            str = "".equals(mergejsonobjectslambda00.RemoteActionCompatParcelizer) ? null : mergejsonobjectslambda00.RemoteActionCompatParcelizer;
        }
        return str;
    }

    public final placeSelfMLgxB_4 fetchTrueFid(boolean z) {
        String str;
        if (!((Boolean) new RoomDatabase$closeBarrier$1(0, CrashlyticsWorkers.RemoteActionCompatParcelizer, getLayingOutChildren.class, "isNotMainThread", "isNotMainThread()Z", 0, 3).invoke()).booleanValue()) {
            Thread.currentThread().getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        accesssetInstancecp accesssetinstancecp = this.MediaBrowserCompatMediaItem;
        String str2 = null;
        if (z) {
            try {
                str = ((AccessibilityIterators) LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(((FirebaseInstallations) accesssetinstancecp).read(), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit)).IconCompatParcelizer;
            } catch (Exception e) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(((FirebaseInstallations) accesssetinstancecp).write(), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
        } catch (Exception e2) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new placeSelfMLgxB_4(str2, str);
    }

    public IdManager(Context context, String str, accesssetInstancecp accesssetinstancecp, ComponentRegistry$Builder componentRegistry$Builder) {
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("appContext must not be null");
            throw null;
        }
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("appIdentifier must not be null");
            throw null;
        }
        this.serializer = context;
        this.RemoteActionCompatParcelizer = str;
        this.MediaBrowserCompatMediaItem = accesssetinstancecp;
        this.write = componentRegistry$Builder;
        this.MediaSessionCompatQueueItem = new mergeJsonObjectslambda00();
    }
}
