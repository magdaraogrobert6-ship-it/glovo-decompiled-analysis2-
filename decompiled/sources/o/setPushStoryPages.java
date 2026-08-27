package o;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.logging.LogFilePurpose;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.processguard.ProcessGuardType;
import com.sentiance.sdk.task.TaskManager;
import com.sentiance.sdk.threading.executors.Executors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class setPushStoryPages {
    private TaskManager IconCompatParcelizer;
    private final Context read;
    private final ProcessGuardType write = ProcessGuardType.SERVICE_BASED;
    private final ArrayList serializer = new ArrayList();

    public final void serializer() {
        this.serializer.clear();
    }

    public setPushStoryPages(Context context) {
        this.read = context;
    }

    @SuppressLint
    private static String read(Class cls) {
        InjectUsing injectUsingRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls);
        if (!injectUsingRemoteActionCompatParcelizer.componentName().isEmpty()) {
            return injectUsingRemoteActionCompatParcelizer.componentName();
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Class should specify componentName in @InjectUsing annotation: ".concat(cls.getName()));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.content.Context] */
    public final <T> T write(Class<T> cls, Class cls2, int i, List<Class> list) {
        ?? r0 = (T) this.read;
        if (cls == Context.class) {
            return r0;
        }
        if (cls == AlarmManager.class) {
            return (T) ((AlarmManager) r0.getSystemService("alarm"));
        }
        if (cls == PowerManager.class) {
            return (T) ((PowerManager) r0.getSystemService("power"));
        }
        if (cls == TelephonyManager.class) {
            return (T) ((TelephonyManager) r0.getSystemService("phone"));
        }
        if (cls == parseLonglambda0.class) {
            if (cls2 != null) {
                return (T) new parseLonglambda0(r0, read(cls2), (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.write(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class, cls2, i, list), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.write(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class, cls2, i, list));
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Trying to obtain a Logger with a null parent");
            return null;
        }
        if (cls == r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY.class) {
            if (cls2 == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Trying to obtain a DataLogger with a null parent");
                return null;
            }
            InjectUsing injectUsingRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls2);
            if (injectUsingRemoteActionCompatParcelizer.dataLogTag().isEmpty()) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Class should specify dataLogTag in @InjectUsing annotation: ".concat(cls2.getName()));
                return null;
            }
            String strDataLogTag = injectUsingRemoteActionCompatParcelizer.dataLogTag();
            for (LogFilePurpose logFilePurpose : LogFilePurpose.values()) {
                if (strDataLogTag.equals(logFilePurpose.getFileName())) {
                    return (T) new r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY(r0, strDataLogTag, (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.write(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class, cls2, i, list), (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.write(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class, cls2, i, list));
                }
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ff$$ExternalSyntheticOutline0.m("Data log tag '", strDataLogTag, "' is not a member of LogFilePurpose"));
            return null;
        }
        if (cls == JobScheduler.class) {
            return (T) ((JobScheduler) r0.getSystemService("jobscheduler"));
        }
        if (cls == ConnectivityManager.class) {
            return (T) ((ConnectivityManager) r0.getSystemService("connectivity"));
        }
        if (cls == WifiManager.class) {
            return (T) ((WifiManager) r0.getSystemService("wifi"));
        }
        if (cls == LocationManager.class) {
            return (T) ((LocationManager) r0.getSystemService("location"));
        }
        if (cls == ActivityManager.class) {
            return (T) ((ActivityManager) r0.getSystemService("activity"));
        }
        if (cls == Runtime.class) {
            return (T) Runtime.getRuntime();
        }
        if (cls == TaskManager.class) {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = (TaskManager) setPushUniqueId.write(createOrGetDataStorelambda010.class, cls2, i, list);
            }
            return (T) this.IconCompatParcelizer;
        }
        if (cls == com.sentiance.sdk.util.c.class) {
            if (cls2 == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Trying to obtain a Cache with a null parent");
                return null;
            }
            InjectUsing injectUsingRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(cls2);
            if (!injectUsingRemoteActionCompatParcelizer2.cacheName().isEmpty()) {
                return (T) new com.sentiance.sdk.util.c(r0, injectUsingRemoteActionCompatParcelizer2.cacheName(), (getExpirationTimestampSeconds) setPushUniqueId.read(getExpirationTimestampSeconds.class));
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Class should specify cacheName in @InjectUsing annotation: ".concat(cls2.getName()));
            return null;
        }
        if (cls == SensorManager.class) {
            return (T) ((SensorManager) r0.getSystemService("sensor"));
        }
        if (cls == migratePushDeliveryEventsToJsonlambda10.class) {
            if (cls2 == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Trying to obtain a MemCache with a null parent");
                return null;
            }
            InjectUsing injectUsingRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(cls2);
            if (!injectUsingRemoteActionCompatParcelizer3.memCacheName().isEmpty()) {
                return (T) migratePushDeliveryEventsToJsonlambda10.read(injectUsingRemoteActionCompatParcelizer3.memCacheName());
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Class should specify memCacheName in @InjectUsing annotation: ".concat(cls2.getName()));
            return null;
        }
        if (cls == AudioManager.class) {
            return (T) ((AudioManager) r0.getSystemService("audio"));
        }
        if (cls == NotificationManager.class) {
            return (T) ((NotificationManager) r0.getSystemService(RemoteMessageConst.NOTIFICATION));
        }
        if (cls == r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4.class) {
            if (cls2 != null) {
                return (T) ((r8lambdarI00A69l7k7NAO4I9NDF7haFpGI) setPushUniqueId.write(r8lambdarI00A69l7k7NAO4I9NDF7haFpGI.class, cls2, i, list)).IconCompatParcelizer(read(cls2), RemoteActionCompatParcelizer(cls2).guardType() == Guard$Type.REFERENCE_COUNTED);
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Trying to obtain a Guard with a null parent");
            return null;
        }
        if (cls == r8lambdarI00A69l7k7NAO4I9NDF7haFpGI.class) {
            ProcessGuardType processGuardType = ProcessGuardType.SERVICE_BASED;
            ProcessGuardType processGuardType2 = this.write;
            if (processGuardType2 == processGuardType) {
                return (T) ((r8lambdarI00A69l7k7NAO4I9NDF7haFpGI) setPushUniqueId.write(r8lambdayNnfP9OWdJ6S3Hy631x_brBzgQA.class, cls2, i, list));
            }
            throw new SdkException("No ProcessGuard implementation for type " + processGuardType2.name());
        }
        if (cls == isGeofencesEnabledFromEnvironmentlambda4.class) {
            return Build.VERSION.SDK_INT >= 29 ? (T) ((isGeofencesEnabledFromEnvironmentlambda4) setPushUniqueId.write(isGeofencesEnabledFromEnvironmentlambda2.class, cls2, i, list)) : (T) ((isGeofencesEnabledFromEnvironmentlambda4) setPushUniqueId.write(isGeofencesEnabledFromEnvironmentlambda5.class, cls2, i, list));
        }
        if (cls == removeGeofencesRegisteredWithGeofencingClientlambda23.class) {
            return (T) removeGeofencesRegisteredWithGeofencingClientlambda23.serializer();
        }
        if (cls == readandroid_sdk_base_release.class) {
            return (T) ((Executors) setPushUniqueId.write(Executors.class, cls2, i, list)).read();
        }
        if (cls == clearAllData.class) {
            return (T) ((Executors) setPushUniqueId.write(Executors.class, cls2, i, list)).IconCompatParcelizer();
        }
        if (cls == parseObjectAsIntegerlambda1.class) {
            if (cls2 == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Trying to obtain a ModelInferenceLogger with a null parent");
                return null;
            }
            Context context = (Context) setPushUniqueId.read(Context.class);
            getExpirationTimestampSeconds getexpirationtimestampseconds = (getExpirationTimestampSeconds) setPushUniqueId.read(getExpirationTimestampSeconds.class, cls2);
            String str = read(cls2);
            return (T) new parseObjectAsIntegerlambda1(new com.sentiance.sdk.util.c(context, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, "IOLogger"), getexpirationtimestampseconds), context, str, (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class));
        }
        if (cls == PackageManager.class) {
            return (T) r0.getPackageManager();
        }
        if (cls == getNotificationCategory.class) {
            return (T) setPushUniqueId.write(ConfigurationManager.class, cls2, i, list);
        }
        if (cls == setNotificationBadgeNumber.class || cls == setNewlyReceivedPushStory.class) {
            return (T) setNotificationBadgeNumber.RemoteActionCompatParcelizer();
        }
        if (cls == r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg.class) {
            return (T) r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg.read(r0);
        }
        if (cls == migrateBannerImpressionMapToJsonlambda10.class) {
            return Build.VERSION.SDK_INT >= 31 ? (T) ((migrateBannerImpressionMapToJsonlambda10) setPushUniqueId.read(migrateBannerStorageToJsonlambda0.class)) : (T) ((migrateBannerImpressionMapToJsonlambda10) setPushUniqueId.read(migrateBannerImpressionMapToJsonlambda3.class));
        }
        if (cls == r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM.class) {
            return (Build.VERSION.SDK_INT < 34 || ((r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg) setPushUniqueId.read(r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg.class)).serializer(null) < 34) ? (T) ((r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM) setPushUniqueId.read(r8lambdadBPY6G4KO62iLuXJereEy4oonkk.class)) : (T) ((r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM) setPushUniqueId.read(r8lambdaajWQ5a9JskwXjoPi3WZt7KGMXDk.class));
        }
        if (cls == createPayload.class) {
            return Build.VERSION.SDK_INT >= 31 ? (T) ((createPayload) setPushUniqueId.read(BrazePushReceiver.class)) : (T) ((createPayload) setPushUniqueId.read(handleAdmRegistrationIntent.class));
        }
        if (cls == readFloatlambda0.class) {
            return (T) readFloatlambda0.read();
        }
        if (cls == KeyguardManager.class) {
            return (T) ((KeyguardManager) r0.getSystemService("keyguard"));
        }
        if (cls == migrateBlocklistedListlambda1.class) {
            return (T) setPushUniqueId.read(getCooldownEnterSeconds.class);
        }
        if (cls == readInt.class) {
            return (T) readInt.write();
        }
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            T t = (T) ((setPushDuration) it.next()).write(cls, cls2, i, list);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void serializer(setPushDuration setpushduration) {
        this.serializer.add(setpushduration);
    }

    @SuppressLint
    private static InjectUsing RemoteActionCompatParcelizer(Class cls) {
        try {
            InjectUsing injectUsing = (InjectUsing) cls.getAnnotation(InjectUsing.class);
            if (injectUsing != null) {
                return injectUsing;
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("No InjectUsing annotation for class ".concat(cls.getName()));
            return null;
        } catch (IncompatibleClassChangeError e) {
            throw new SdkException("Failed to get class annotation: ".concat(cls.getName()), e);
        }
    }
}
