package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.okhttp3.logging.HttpLoggingInterceptor$Level;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public class getLastKnownGpsLocationIfValidlambda0 {
    private final handlePushNotificationPayloadlambda10 IconCompatParcelizer;
    private final isFirebaseCloudMessagingRegistrationEnabled RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private boolean serializer = false;
    private final serializer write;

    public static class serializer extends migratePushDeliveryEventsToJsonlambda0 {
    }

    public final void serializer() {
        synchronized (this) {
            this.IconCompatParcelizer.read(false);
            this.serializer = false;
        }
    }

    public final void write() {
        int size;
        int size2;
        synchronized (this) {
            if (this.serializer) {
                return;
            }
            this.IconCompatParcelizer.read(true);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer.MediaDescriptionCompat();
            this.read.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.write) {
                do {
                    isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
                    synchronized (iscontentcardsunreadvisualindicatorenabled) {
                        size = ((ArrayDeque) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer).size();
                        size2 = ((ArrayDeque) iscontentcardsunreadvisualindicatorenabled.read).size();
                    }
                    if (size + size2 <= 0) {
                        break;
                    }
                    try {
                        this.write.wait(10L);
                        this.read.getClass();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (System.currentTimeMillis() - jCurrentTimeMillis <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
            }
            this.serializer = true;
        }
    }

    public getLastKnownGpsLocationIfValidlambda0(registerGeofencesWithGooglePlayIfNecessary registergeofenceswithgoogleplayifnecessary, registerGeofencesWithGooglePlayIfNecessarylambda1 registergeofenceswithgoogleplayifnecessarylambda1, setUninstallTrackingPush setuninstalltrackingpush, r8lambdazCHEfJSH3y6SNJawS_xr1wg5i08 r8lambdazchefjsh3y6snjaws_xr1wg5i08, handlePushNotificationPayloadlambda10 handlepushnotificationpayloadlambda10, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, requestSingleLocationUpdatelambda2 requestsinglelocationupdatelambda2, serializer serializerVar, r8lambdawtSqCNaCgTFiayN0V7K3kHylcmQ r8lambdawtsqcnacgtfiayn0v7k3khylcmq) {
        isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled;
        this.IconCompatParcelizer = handlepushnotificationpayloadlambda10;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = serializerVar;
        isDeviceObjectAllowlistEnabled isdeviceobjectallowlistenabled = new isDeviceObjectAllowlistEnabled(r8lambdawtsqcnacgtfiayn0v7k3khylcmq);
        HttpLoggingInterceptor$Level httpLoggingInterceptor$Level = HttpLoggingInterceptor$Level.BASIC;
        if (httpLoggingInterceptor$Level == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("level == null. Use Level.NONE instead.");
            throw null;
        }
        isdeviceobjectallowlistenabled.serializer = httpLoggingInterceptor$Level;
        synchronized (this) {
            isPushWakeScreenForNotificationEnabled ispushwakescreenfornotificationenabled = new isPushWakeScreenForNotificationEnabled();
            ispushwakescreenfornotificationenabled.read = requestsinglelocationupdatelambda2.write();
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read();
            ispushwakescreenfornotificationenabled.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 60000;
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read();
            ispushwakescreenfornotificationenabled.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 60000;
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read();
            ispushwakescreenfornotificationenabled.serializer = 60000;
            ispushwakescreenfornotificationenabled.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
            ispushwakescreenfornotificationenabled.write(registergeofenceswithgoogleplayifnecessary);
            ispushwakescreenfornotificationenabled.write(handlepushnotificationpayloadlambda10);
            if (registergeofenceswithgoogleplayifnecessarylambda1 == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            ispushwakescreenfornotificationenabled.RatingCompat.add(registergeofenceswithgoogleplayifnecessarylambda1);
            if (setuninstalltrackingpush == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            ispushwakescreenfornotificationenabled.RatingCompat.add(setuninstalltrackingpush);
            ispushwakescreenfornotificationenabled.write(r8lambdazchefjsh3y6snjaws_xr1wg5i08);
            ispushwakescreenfornotificationenabled.write(isdeviceobjectallowlistenabled);
            ispushwakescreenfornotificationenabled.ResultReceiver = false;
            isfirebasecloudmessagingregistrationenabled = new isFirebaseCloudMessagingRegistrationEnabled(ispushwakescreenfornotificationenabled);
        }
        this.RemoteActionCompatParcelizer = isfirebasecloudmessagingregistrationenabled;
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 RemoteActionCompatParcelizer(setSessionTimeout setsessiontimeout) {
        synchronized (this) {
            if (this.serializer) {
                return new requestSingleLocationUpdatelambda3(setsessiontimeout);
            }
            isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled = this.RemoteActionCompatParcelizer;
            isfirebasecloudmessagingregistrationenabled.getClass();
            setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = new setSessionTimeoutandroid_sdk_base_release(isfirebasecloudmessagingregistrationenabled, setsessiontimeout);
            isfirebasecloudmessagingregistrationenabled.MediaSessionCompatQueueItem.getClass();
            setsessiontimeoutandroid_sdk_base_release.write = setTriggerActionMinimumTimeIntervalSeconds.RemoteActionCompatParcelizer;
            return setsessiontimeoutandroid_sdk_base_release;
        }
    }
}
