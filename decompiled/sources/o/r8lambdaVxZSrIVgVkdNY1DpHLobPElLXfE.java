package o;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.services.ServiceForegroundState;
import com.sentiance.sdk.services.ServiceStartResult;
import com.sentiance.sdk.services.ServiceType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ServiceController")
public class r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE {
    private final containsandroid_sdk_base_release IconCompatParcelizer;
    private final NotificationManager MediaBrowserCompatMediaItem;
    private final getGeofenceRequestLocationannotations MediaDescriptionCompat;
    private final migrateBannerImpressionMapToJsonlambda10 MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final migrateBannerImpressionMapToJsonlambda0 MediaSessionCompatResultReceiverWrapper;
    private final boolean MediaSessionCompatToken;
    private final setNotificationBadgeNumber RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final ActivityManager read;
    private final migrateBannerStorageToJsonlambda3 serializer;
    private final Context write;
    private final HashMap PlaybackStateCompat = new HashMap();
    private final HashSet ParcelableVolumeInfo = new HashSet();
    private final r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo PlaybackStateCompatCustomAction = new r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo(3, this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[Catch: all -> 0x0105, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:8:0x0016, B:10:0x001c, B:14:0x003a, B:20:0x004e, B:40:0x0096, B:45:0x00a2, B:49:0x00b7, B:23:0x0053, B:25:0x0057, B:27:0x006c, B:30:0x0075, B:31:0x0078, B:35:0x0088, B:34:0x007f, B:13:0x0034, B:50:0x00d7, B:51:0x00db, B:53:0x00e1, B:54:0x00f2, B:56:0x00fa), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public void RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this) {
            ArrayList<Class> arrayList = new ArrayList();
            if (this.ParcelableVolumeInfo.isEmpty()) {
                return;
            }
            for (Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> cls : this.ParcelableVolumeInfo) {
                migrateBannerStorageToJsonlambda3 migratebannerstoragetojsonlambda3 = this.serializer;
                ActivityManager activityManager = this.read;
                migratebannerstoragetojsonlambda3.getClass();
                ServiceForegroundState serviceForegroundStateSerializer = migrateBannerStorageToJsonlambda3.serializer(activityManager, cls);
                Long l = read(cls);
                if (l == null) {
                    l = 0L;
                }
                boolean z2 = true;
                boolean z3 = serviceForegroundStateSerializer == ServiceForegroundState.NOT_STARTED && l.longValue() > 60000;
                if (serviceForegroundStateSerializer == ServiceForegroundState.FOREGROUNDED) {
                    if (this.MediaSessionCompatToken) {
                        this.MediaDescriptionCompat.getClass();
                        int iRemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
                        StatusBarNotification[] activeNotifications = this.MediaBrowserCompatMediaItem.getActiveNotifications();
                        int length = activeNotifications.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                Long l2 = read(cls);
                                if (l2 == null) {
                                    l2 = Long.MAX_VALUE;
                                }
                                if (l2.longValue() > 8500) {
                                }
                                if (ServiceType.BACKGROUND.getServiceClass() != cls) {
                                    z2 = false;
                                }
                                if (z3) {
                                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("Service %s has taken too long to start", cls.getName());
                                }
                                if (!z3 || z2 || z) {
                                    arrayList.add(cls);
                                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("Stopping service %s", cls.getName());
                                    this.write.stopService(new Intent(this.write, cls));
                                }
                            } else if (iRemoteActionCompatParcelizer != activeNotifications[i].getId()) {
                                i++;
                            }
                        }
                    }
                    z = true;
                    if (ServiceType.BACKGROUND.getServiceClass() != cls) {
                        z2 = false;
                    }
                    if (z3) {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Service %s has taken too long to start", cls.getName());
                    }
                    if (!z3) {
                    }
                    arrayList.add(cls);
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("Stopping service %s", cls.getName());
                    this.write.stopService(new Intent(this.write, cls));
                }
                z = false;
                if (ServiceType.BACKGROUND.getServiceClass() != cls) {
                    z2 = false;
                }
                if (z3) {
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer("Service %s has taken too long to start", cls.getName());
                }
                if (!z3) {
                }
                arrayList.add(cls);
                this.RemoteActionCompatParcelizer.IconCompatParcelizer("Stopping service %s", cls.getName());
                this.write.stopService(new Intent(this.write, cls));
            }
            for (Class cls2 : arrayList) {
                this.ParcelableVolumeInfo.remove(cls2);
                this.PlaybackStateCompat.remove(cls2);
            }
            if (!this.ParcelableVolumeInfo.isEmpty()) {
                this.IconCompatParcelizer.IconCompatParcelizer(this.PlaybackStateCompatCustomAction, 500L);
            }
        }
    }

    public final void read(ServiceType serviceType) {
        synchronized (this) {
            Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> serviceClass = serviceType.getServiceClass();
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Processing stop request for service %s", serviceClass.getName());
            if (((Long) this.PlaybackStateCompat.get(serviceType.getServiceClass())) == null) {
                return;
            }
            if (serviceType == ServiceType.BACKGROUND) {
                this.write.stopService(new Intent(this.write, serviceClass));
            } else {
                this.ParcelableVolumeInfo.add(serviceClass);
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void serializer(ServiceType serviceType) {
        synchronized (this) {
            Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> serviceClass = serviceType.getServiceClass();
            this.PlaybackStateCompat.remove(serviceClass);
            this.ParcelableVolumeInfo.remove(serviceClass);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Handled service %s stop", serviceClass.getName());
        }
    }

    public r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE(Context context, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, parseLonglambda0 parselonglambda0, ActivityManager activityManager, migrateBannerStorageToJsonlambda3 migratebannerstoragetojsonlambda3, readList readlist, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, NotificationManager notificationManager, migrateBannerImpressionMapToJsonlambda10 migratebannerimpressionmaptojsonlambda10, migrateBannerImpressionMapToJsonlambda0 migratebannerimpressionmaptojsonlambda0, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, setNotificationBadgeNumber setnotificationbadgenumber) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = context;
        this.read = activityManager;
        this.serializer = migratebannerstoragetojsonlambda3;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = notificationManager;
        this.MediaMetadataCompat = migratebannerimpressionmaptojsonlambda10;
        this.MediaDescriptionCompat = getgeofencerequestlocationannotations;
        this.RatingCompat = setnotificationbadgenumber;
        this.IconCompatParcelizer = readlist.write();
        this.MediaSessionCompatResultReceiverWrapper = migratebannerimpressionmaptojsonlambda0;
        getgeofencerequestlocationannotations.getClass();
        this.MediaSessionCompatToken = Build.VERSION.SDK_INT >= 31 && r8lambdafxbjord4rv7hbevein3jpfseg.serializer(null) >= 31;
    }

    private Long read(Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> cls) {
        Long l = (Long) this.PlaybackStateCompat.get(cls);
        if (l == null) {
            return null;
        }
        this.MediaSessionCompatQueueItem.getClass();
        return Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
    }

    public final void write(Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> cls) {
        synchronized (this) {
            this.MediaSessionCompatQueueItem.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.PlaybackStateCompat.put(cls, Long.valueOf(jElapsedRealtime));
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Pretending service %s started at time %d", cls.getName(), Long.valueOf(jElapsedRealtime));
        }
    }

    public final ServiceStartResult IconCompatParcelizer(ServiceType serviceType) {
        synchronized (this) {
            if (!this.RatingCompat.MediaDescriptionCompat()) {
                return ServiceStartResult.FAILURE_REASON_OTHER;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Start request for service type %s", serviceType.name());
            Class<? extends r8lambdaGV766sOYYCl0YYkk8QccVU5zR38> serviceClass = serviceType.getServiceClass();
            boolean zRemove = this.ParcelableVolumeInfo.remove(serviceClass);
            parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
            if (zRemove) {
                parselonglambda0.IconCompatParcelizer("Service: %s is already running", serviceClass.getName());
                return ServiceStartResult.SUCCESS;
            }
            parselonglambda0.IconCompatParcelizer("Starting service %s", serviceClass.getName());
            this.MediaSessionCompatQueueItem.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ServiceStartResult serviceStartResult = this.MediaMetadataCompat.read(serviceType, new Intent(this.write, serviceClass));
            if (serviceStartResult == ServiceStartResult.SUCCESS) {
                this.PlaybackStateCompat.put(serviceType.getServiceClass(), Long.valueOf(jElapsedRealtime));
            }
            return serviceStartResult;
        }
    }
}
