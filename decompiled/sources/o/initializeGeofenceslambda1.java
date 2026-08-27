package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import io.sentry.util.network.NetworkBody;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DeviceInfoProvider")
public class initializeGeofenceslambda1 extends createOrGetDataStorelambda00 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final isGeofencesEnabledannotations ComponentActivity;
    private final Context IconCompatParcelizer;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg MediaBrowserCompatMediaItem;
    private final component4android_sdk_base_release MediaDescriptionCompat;
    private final populatePushStoryPagelambda2 MediaMetadataCompat;
    private final getCooldownEnterSeconds MediaSessionCompatQueueItem;
    private final getGeofenceTransitionPendingIntentannotations MediaSessionCompatResultReceiverWrapper;
    private final PackageManager MediaSessionCompatToken;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug> ParcelableVolumeInfo;
    private final getGeofencesEnabledFromServerConfig PlaybackStateCompat;
    private final getGeofenceRequestLocationannotations PlaybackStateCompatCustomAction;
    private final ActivityManager RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final isGeofencesEnabledFromEnvironmentlambda0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final SensorManager r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final getVerticalAccuracy read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivugWrite;
        synchronized (this) {
            synchronized (this) {
                r8lambdafjifijxjxuf3vopuwrut7txivugWrite = write();
                if (r8lambdafjifijxjxuf3vopuwrut7txivugWrite.equals(this.ParcelableVolumeInfo.read())) {
                    r8lambdafjifijxjxuf3vopuwrut7txivugWrite = null;
                }
            }
        }
        if (r8lambdafjifijxjxuf3vopuwrut7txivugWrite != null) {
            this.ParcelableVolumeInfo.IconCompatParcelizer(r8lambdafjifijxjxuf3vopuwrut7txivugWrite);
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
            getVerticalAccuracy getverticalaccuracy = this.read;
            this.write.getClass();
            getanalyticsenabledenterannotations.serializer(getverticalaccuracy.write(r8lambdafjifijxjxuf3vopuwrut7txivugWrite, System.currentTimeMillis()));
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.ParcelableVolumeInfo.IconCompatParcelizer(null);
        }
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("DeviceInfoTask");
        publishexceptionlambda0.read(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.MediaSessionCompatQueueItem.IconCompatParcelizer(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class);
        }
        return map;
    }

    public final r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug write() {
        boolean zHasSystemFeature;
        short sRound;
        String str;
        String strValueOf;
        String str2;
        Sensor defaultSensor;
        Sensor defaultSensor2;
        int minDelay;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        PackageManager packageManager = this.MediaSessionCompatToken;
        r8lambdaFtgykSaC7C6ocmzGhhm1R9I r8lambdaftgyksac7c6ocmzghhm1r9i = new r8lambdaFtgykSaC7C6ocmzGhhm1R9I();
        this.PlaybackStateCompatCustomAction.getClass();
        r8lambdaftgyksac7c6ocmzghhm1r9i.write = Build.CPU_ABI;
        Context context = this.IconCompatParcelizer;
        r8lambdaftgyksac7c6ocmzghhm1r9i.RemoteActionCompatParcelizer = Settings.Secure.getString(context.getContentResolver(), "android_id");
        r8lambdaftgyksac7c6ocmzghhm1r9i.serializer = Build.MANUFACTURER;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.RatingCompat.getMemoryInfo(memoryInfo);
        r8lambdaftgyksac7c6ocmzghhm1r9i.read = String.valueOf(memoryInfo.totalMem);
        r8lambdaftgyksac7c6ocmzghhm1r9i.MediaBrowserCompatMediaItem = Build.MODEL;
        r8lambdaftgyksac7c6ocmzghhm1r9i.RatingCompat = (byte) 1;
        r8lambdaftgyksac7c6ocmzghhm1r9i.MediaMetadataCompat = Build.VERSION.RELEASE;
        r8lambdaftgyksac7c6ocmzghhm1r9i.MediaDescriptionCompat = "remote";
        r8lambdaftgyksac7c6ocmzghhm1r9i.MediaSessionCompatQueueItem = "6.27.1";
        r8lambdaftgyksac7c6ocmzghhm1r9i.ParcelableVolumeInfo = context.getPackageName();
        try {
            zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.location.gps");
        } catch (Exception e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to check gps presence", new Object[0]);
            zHasSystemFeature = false;
        }
        r8lambdaftgyksac7c6ocmzghhm1r9i.PlaybackStateCompatCustomAction = Boolean.valueOf(zHasSystemFeature);
        r8lambdaftgyksac7c6ocmzghhm1r9i.MediaSessionCompatToken = Boolean.valueOf(write(1));
        r8lambdaftgyksac7c6ocmzghhm1r9i.PlaybackStateCompat = Boolean.valueOf(write(4));
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Short.valueOf(this.MediaBrowserCompatMediaItem.serializer(parselonglambda0));
        r8lambdaftgyksac7c6ocmzghhm1r9i.ComponentActivity = Short.valueOf((short) Build.VERSION.SDK_INT);
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = Build.DISPLAY;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            sRound = 0;
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            sRound = (short) Math.round(Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)) * 10.0d);
        }
        r8lambdaftgyksac7c6ocmzghhm1r9i.ResultReceiver = Short.valueOf(sRound);
        Short shValueOf = null;
        try {
            str = packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to get app version", new Object[0]);
            str = null;
        }
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
        try {
            strValueOf = String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 0).getLongVersionCode());
        } catch (PackageManager.NameNotFoundException e3) {
            parselonglambda0.IconCompatParcelizer(false, e3, "Failed to get app version", new Object[0]);
            strValueOf = null;
        }
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = strValueOf;
        try {
            str2 = packageManager.getPackageInfo("com.google.android.gms", androidx.compose.ui.graphics.Fields.SpotShadowColor).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = str2;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        float f = displayMetrics2.widthPixels;
        float f2 = displayMetrics2.density;
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = Short.valueOf((short) Math.round(Math.min(f / f2, displayMetrics2.heightPixels / f2)));
        ArrayList arrayList = new ArrayList();
        for (populatePushStoryPage populatepushstorypage : this.MediaMetadataCompat.write().write()) {
            BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
            String strMediaSessionCompatQueueItem = populatepushstorypage.MediaSessionCompatQueueItem();
            if (strMediaSessionCompatQueueItem == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'name' cannot be null");
                return null;
            }
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = strMediaSessionCompatQueueItem;
            String strMediaBrowserCompatMediaItem = populatepushstorypage.MediaBrowserCompatMediaItem();
            if (strMediaBrowserCompatMediaItem == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'version' cannot be null");
                return null;
            }
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = strMediaBrowserCompatMediaItem;
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = populatepushstorypage.read();
            arrayList.add(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.IconCompatParcelizer());
        }
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = arrayList;
        NetworkBody networkBody = new NetworkBody(13);
        SensorManager sensorManager = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        networkBody.RemoteActionCompatParcelizer = (sensorManager == null || (defaultSensor2 = sensorManager.getDefaultSensor(1)) == null || (minDelay = defaultSensor2.getMinDelay()) <= 0) ? null : Short.valueOf((short) (1000000 / minDelay));
        if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(1)) != null) {
            shValueOf = Short.valueOf((short) Math.round(defaultSensor.getMaximumRange()));
        }
        networkBody.IconCompatParcelizer = shValueOf;
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new BrazeFlushPushDeliveryReceiver(networkBody);
        markOnScreenCardsAsReadlambda0.serializer.getClass();
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = "2.3.21";
        r8lambdaftgyksac7c6ocmzghhm1r9i.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = this.PlaybackStateCompat.serializer();
        r8lambdaftgyksac7c6ocmzghhm1r9i.IconCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        return new r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug(r8lambdaftgyksac7c6ocmzghhm1r9i);
    }

    public initializeGeofenceslambda1(Context context, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, ActivityManager activityManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, populatePushStoryPagelambda2 populatepushstorypagelambda2, SensorManager sensorManager, PackageManager packageManager, getGeofencesEnabledFromServerConfig getgeofencesenabledfromserverconfig, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, getGeofenceTransitionPendingIntentannotations getgeofencetransitionpendingintentannotations) {
        this.IconCompatParcelizer = context;
        this.read = getverticalaccuracy;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = getanalyticsenabledenterannotations;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaSessionCompatQueueItem = getcooldownenterseconds;
        this.MediaDescriptionCompat = component4android_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = r8lambdafxbjord4rv7hbevein3jpfseg;
        this.RatingCompat = activityManager;
        this.MediaMetadataCompat = populatepushstorypagelambda2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sensorManager;
        this.MediaSessionCompatToken = packageManager;
        this.PlaybackStateCompat = getgeofencesenabledfromserverconfig;
        this.PlaybackStateCompatCustomAction = getgeofencerequestlocationannotations;
        this.MediaSessionCompatResultReceiverWrapper = getgeofencetransitionpendingintentannotations;
        context.getSharedPreferences("device-info", 0).edit().remove("device_info_hash").apply();
        File file = new File(context.getFilesDir(), "sentiance_device_info");
        if (file.exists()) {
            file.delete();
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new isGeofencesEnabledFromEnvironmentlambda0(this, readandroid_sdk_base_releaseVar);
        this.ComponentActivity = new isGeofencesEnabledannotations(this, readandroid_sdk_base_releaseVar);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.ParcelableVolumeInfo = new getMaxNumToRegisterannotations(this, System.currentTimeMillis());
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        isGeofencesEnabledFromEnvironmentlambda0 isgeofencesenabledfromenvironmentlambda0 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, isgeofencesenabledfromenvironmentlambda0);
        getanalyticsenabledenterannotations.read(ControlMessage.ONDEVICE_MODEL_UPDATED, this.ComponentActivity);
    }

    public static r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug read(initializeGeofenceslambda1 initializegeofenceslambda1, long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        Optional optional = initializegeofenceslambda1.MediaSessionCompatQueueItem.read(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class, Long.valueOf(j));
        if (optional == null || optional.read() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer(initializegeofenceslambda1.MediaDescriptionCompat)) == null) {
            return null;
        }
        return r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.serializer;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        synchronized (this) {
            read();
        }
        return false;
    }

    public final boolean write(int i) {
        SensorManager sensorManager = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return (sensorManager == null || sensorManager.getDefaultSensor(i) == null) ? false : true;
    }
}
