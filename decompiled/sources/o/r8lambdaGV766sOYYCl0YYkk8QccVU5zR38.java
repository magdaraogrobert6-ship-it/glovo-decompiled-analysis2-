package o;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.deliveryhero.fwf_http.ConstantKt;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.services.ServiceForegroundState;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaGV766sOYYCl0YYkk8QccVU5zR38 extends Service {
    private static final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public static final /* synthetic */ int write = 0;
    private long read = -1;
    private long serializer = -1;
    private volatile long IconCompatParcelizer = -1;
    private boolean MediaBrowserCompatMediaItem = false;
    private volatile boolean MediaDescriptionCompat = false;
    private volatile boolean MediaMetadataCompat = false;
    private volatile boolean MediaSessionCompatQueueItem = false;
    private volatile boolean RatingCompat = false;
    private final Runnable PlaybackStateCompatCustomAction = new r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo(0, this);
    private final Runnable MediaSessionCompatResultReceiverWrapper = new r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo(1, this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        write();
        return null;
    }

    public abstract boolean serializer();

    /* JADX WARN: Multi-variable type inference failed */
    public static void IconCompatParcelizer(r8lambdaGV766sOYYCl0YYkk8QccVU5zR38 r8lambdagv766soyycl0yykk8qccvu5zr38, r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM r8lambdaw0mbzhslee6zlbnulyni6drsgcm, int i, Notification notification, boolean z, migrateSealedSessionsMapToJsonlambda20 migratesealedsessionsmaptojsonlambda20) {
        postGeofenceReportlambda1 postgeofencereportlambda1;
        if (r8lambdagv766soyycl0yykk8qccvu5zr38.IconCompatParcelizer == -1) {
            r8lambdagv766soyycl0yykk8qccvu5zr38.IconCompatParcelizer = System.currentTimeMillis();
        }
        try {
            if (!r8lambdagv766soyycl0yykk8qccvu5zr38.RatingCompat) {
                r8lambdaw0mbzhslee6zlbnulyni6drsgcm.write(r8lambdagv766soyycl0yykk8qccvu5zr38, i, notification);
                if (!r8lambdagv766soyycl0yykk8qccvu5zr38.MediaMetadataCompat && r8lambdagv766soyycl0yykk8qccvu5zr38.MediaDescriptionCompat && (postgeofencereportlambda1 = (postGeofenceReportlambda1) setPushUniqueId.IconCompatParcelizer(postGeofenceReportlambda1.class)) != 0) {
                    r8lambdagv766soyycl0yykk8qccvu5zr38.MediaMetadataCompat = true;
                    postgeofencereportlambda1.RemoteActionCompatParcelizer(r8lambdagv766soyycl0yykk8qccvu5zr38.getClass());
                }
            }
        } finally {
            if (z) {
                migratesealedsessionsmaptojsonlambda20.write("com.sentiance.sdk:SdkService");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    public void MediaSessionCompatQueueItem() {
        boolean z;
        boolean z2;
        final r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM r8lambdaw0mbzhslee6zlbnulyni6drsgcm = (r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM) setPushUniqueId.read(r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM.class);
        ConfigurationManager configurationManager = (ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class);
        migrateBannerImpressionMapToJsonlambda0 migratebannerimpressionmaptojsonlambda0 = (migrateBannerImpressionMapToJsonlambda0) setPushUniqueId.read(migrateBannerImpressionMapToJsonlambda0.class);
        final int iRemoteActionCompatParcelizer = migratebannerimpressionmaptojsonlambda0.RemoteActionCompatParcelizer();
        final Notification notificationIconCompatParcelizer = migratebannerimpressionmaptojsonlambda0.IconCompatParcelizer();
        this.MediaSessionCompatQueueItem = true;
        final migrateSealedSessionsMapToJsonlambda20 migratesealedsessionsmaptojsonlambda20 = (migrateSealedSessionsMapToJsonlambda20) setPushUniqueId.read(migrateSealedSessionsMapToJsonlambda20.class);
        boolean zOnBackPressedInput_delegatelambda0 = configurationManager.onBackPressedInput_delegatelambda0();
        if (zOnBackPressedInput_delegatelambda0) {
            synchronized (migratesealedsessionsmaptojsonlambda20) {
                z2 = migratesealedsessionsmaptojsonlambda20.read(-1L, "com.sentiance.sdk:SdkService");
            }
            z = z2;
        }
        final boolean z3 = z;
        Runnable runnable = new Runnable() { // from class: o.r8lambdaFd7w3hG8pSHxQ4Zt1oEay9CXzI
            @Override // java.lang.Runnable
            public final void run() {
                r8lambdaGV766sOYYCl0YYkk8QccVU5zR38.IconCompatParcelizer(this.read, r8lambdaw0mbzhslee6zlbnulyni6drsgcm, iRemoteActionCompatParcelizer, notificationIconCompatParcelizer, z3, migratesealedsessionsmaptojsonlambda20);
            }
        };
        if (zOnBackPressedInput_delegatelambda0) {
            ((readList) setPushUniqueId.read(readList.class)).write().RemoteActionCompatParcelizer(runnable);
        } else {
            runnable.run();
        }
    }

    public static int read() {
        int size;
        ArrayList arrayList = RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            size = arrayList.size();
        }
        return size;
    }

    private void write() {
        ArrayList arrayList = RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        super.onTimeout(i);
        stopSelf();
        ((readList) setPushUniqueId.read(readList.class)).write().RemoteActionCompatParcelizer(new pNP$$ExternalSyntheticLambda0(10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        this.serializer = System.currentTimeMillis();
        ArrayList arrayList = RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            arrayList.add(this);
        }
        super.onCreate();
        setNewlyReceivedPushStory setnewlyreceivedpushstory = setNotificationBadgeNumber.read();
        if (!setnewlyreceivedpushstory.MediaDescriptionCompat()) {
            if (setnewlyreceivedpushstory.RatingCompat()) {
                Class<?> cls = getClass();
                Log.e("Sentiance", "SDK is not initialized. Make sure to call Sentiance.initialize() in your Application.onCreate() method.");
                Log.e("Sentiance", cls.getSimpleName());
            }
            read("The SDK is not initialized");
            RemoteActionCompatParcelizer();
            return;
        }
        postGeofenceReportlambda1 postgeofencereportlambda1 = (postGeofenceReportlambda1) setPushUniqueId.IconCompatParcelizer(postGeofenceReportlambda1.class);
        if (postgeofencereportlambda1 != 0) {
            this.MediaDescriptionCompat = true;
            postgeofencereportlambda1.serializer(getClass());
        }
        if (serializer()) {
            MediaSessionCompatQueueItem();
        }
        write();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.read = System.currentTimeMillis();
        if (intent == null) {
            read("Service started with null intent");
            RemoteActionCompatParcelizer();
            return 1;
        }
        if (!this.MediaBrowserCompatMediaItem && !this.MediaSessionCompatQueueItem && serializer()) {
            MediaSessionCompatQueueItem();
        }
        return 1;
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        read("Aborting service startup");
        if (serializer()) {
            IconCompatParcelizer();
        } else {
            stopSelf();
            write();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer() {
        if (setPushUniqueId.serializer() != null) {
            stopForeground(true);
            MediaSessionCompatQueueItem();
            ((readList) setPushUniqueId.read(readList.class)).write().RemoteActionCompatParcelizer(new r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo(2, this));
            ((readList) setPushUniqueId.read(readList.class)).write().IconCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, ConstantKt.DEFAULT_REQUEST_TIMEOUT);
            write();
            return;
        }
        new migrateBannerStorageToJsonlambda3();
        Notification notification = migrateBannerStorageToJsonlambda3.read(getApplicationContext());
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(2123874432, notification, androidx.compose.ui.graphics.Fields.CameraDistance);
            } else {
                startForeground(2123874432, notification);
            }
        } catch (Exception unused) {
        }
        if (migrateBannerStorageToJsonlambda3.serializer((ActivityManager) getSystemService("activity"), getClass()) != ServiceForegroundState.FOREGROUNDED) {
            readBoolean.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, 500L);
            return;
        }
        stopForeground(true);
        stopSelf();
        write();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public final void onDestroy() {
        postGeofenceReportlambda1 postgeofencereportlambda1;
        postGeofenceReportlambda1 postgeofencereportlambda2;
        if (setPushUniqueId.serializer() != null) {
            containsandroid_sdk_base_release containsandroid_sdk_base_releaseVarWrite = ((readList) setPushUniqueId.read(readList.class)).write();
            synchronized (this) {
                this.RatingCompat = true;
                containsandroid_sdk_base_releaseVarWrite.serializer(this.MediaSessionCompatResultReceiverWrapper);
            }
        }
        if (this.MediaMetadataCompat && (postgeofencereportlambda2 = (postGeofenceReportlambda1) setPushUniqueId.IconCompatParcelizer(postGeofenceReportlambda1.class)) != 0) {
            postgeofencereportlambda2.IconCompatParcelizer(getClass());
        }
        if (this.MediaDescriptionCompat && (postgeofencereportlambda1 = (postGeofenceReportlambda1) setPushUniqueId.IconCompatParcelizer(postGeofenceReportlambda1.class)) != 0) {
            postgeofencereportlambda1.write(getClass());
        }
        read("Destroying service. Creation time: " + this.serializer + ", Foregrounding time: " + this.IconCompatParcelizer + ", Start time: " + this.read);
        super.onDestroy();
        write();
    }

    public final void read(String str) {
        if (setPushUniqueId.serializer() != null) {
            new parseLonglambda0((Context) setPushUniqueId.read(Context.class), "SdkService", (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class)).IconCompatParcelizer("%s :: %s", getClass().getName(), str);
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
