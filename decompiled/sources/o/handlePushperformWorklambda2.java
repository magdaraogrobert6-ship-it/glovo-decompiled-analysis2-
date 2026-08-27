package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.TransmittableDataType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SDKResetPayloadSubmitter")
public class handlePushperformWorklambda2 {
    private final parseLonglambda0 IconCompatParcelizer;
    private final BrazeNotificationUtilsExternalSyntheticLambda1 MediaBrowserCompatMediaItem;
    private final handlePushperformWorklambda0 MediaDescriptionCompat;
    private final BrazeNotificationUtilsExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final requestSingleLocationUpdatelambda4 serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    private void IconCompatParcelizer(getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release) throws IOException {
        this.read.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new migratePushDeliveryEventsToJson(byteArrayOutputStream));
        List list = getcustomlocationprovidernamesandroid_sdk_base_release.IconCompatParcelizer;
        if (list != null) {
            r8lambdaajvt3gxgjaliojuptnhztnfupq.serializer(1, (byte) 15);
            r8lambdaajvt3gxgjaliojuptnhztnfupq.write((byte) 12, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                incrementCustomUserAttributedefault.read.read(r8lambdaajvt3gxgjaliojuptnhztnfupq, (incrementCustomUserAttributedefault) it.next());
            }
        }
        r8lambdaajvt3gxgjaliojuptnhztnfupq.RemoteActionCompatParcelizer((byte) 0);
        setSessionTimeout setsessiontimeout = this.serializer.read(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), false, true, "0.15.0", (byte) 24);
        if (setsessiontimeout == null) {
            return;
        }
        isPushWakeScreenForNotificationEnabled ispushwakescreenfornotificationenabled = new isPushWakeScreenForNotificationEnabled();
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read();
        ispushwakescreenfornotificationenabled.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 60000;
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read();
        ispushwakescreenfornotificationenabled.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 60000;
        r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read();
        ispushwakescreenfornotificationenabled.serializer = 60000;
        ispushwakescreenfornotificationenabled.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        isFirebaseCloudMessagingRegistrationEnabled isfirebasecloudmessagingregistrationenabled = new isFirebaseCloudMessagingRegistrationEnabled(ispushwakescreenfornotificationenabled);
        setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = new setSessionTimeoutandroid_sdk_base_release(isfirebasecloudmessagingregistrationenabled, setsessiontimeout);
        isfirebasecloudmessagingregistrationenabled.MediaSessionCompatQueueItem.getClass();
        setsessiontimeoutandroid_sdk_base_release.write = setTriggerActionMinimumTimeIntervalSeconds.RemoteActionCompatParcelizer;
        setsessiontimeoutandroid_sdk_base_release.serializer(new handlePushNotificationPayloadlambda11(this));
    }

    private boolean write(getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release) {
        this.write.getClass();
        Optional optionalIconCompatParcelizer = setSoundIfPresentAndSupportedlambda1.IconCompatParcelizer(getcustomlocationprovidernamesandroid_sdk_base_release);
        if (!optionalIconCompatParcelizer.IconCompatParcelizer()) {
            return false;
        }
        String str = (String) optionalIconCompatParcelizer.write();
        Set<TransmittableDataType> setResultReceiver = this.RemoteActionCompatParcelizer.ResultReceiver();
        if (setResultReceiver.contains(TransmittableDataType.ALL) || this.MediaBrowserCompatMediaItem.write(setResultReceiver).contains(str)) {
            return this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer((String) optionalIconCompatParcelizer.write());
        }
        return false;
    }

    public handlePushperformWorklambda2(parseLonglambda0 parselonglambda0, requestSingleLocationUpdatelambda4 requestsinglelocationupdatelambda4, getVerticalAccuracy getverticalaccuracy, setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, handlePushperformWorklambda0 handlepushperformworklambda0, BrazeNotificationUtilsExternalSyntheticLambda0 brazeNotificationUtilsExternalSyntheticLambda0, BrazeNotificationUtilsExternalSyntheticLambda1 brazeNotificationUtilsExternalSyntheticLambda1, ConfigurationManager configurationManager) {
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = requestsinglelocationupdatelambda4;
        this.read = getverticalaccuracy;
        this.write = setsoundifpresentandsupportedlambda1;
        this.RemoteActionCompatParcelizer = configurationManager;
        this.MediaDescriptionCompat = handlepushperformworklambda0;
        this.MediaBrowserCompatMediaItem = brazeNotificationUtilsExternalSyntheticLambda1;
        this.MediaSessionCompatQueueItem = brazeNotificationUtilsExternalSyntheticLambda0;
    }

    public final void RemoteActionCompatParcelizer() {
        try {
            getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release = this.MediaDescriptionCompat.read();
            if (write(getcustomlocationprovidernamesandroid_sdk_base_release)) {
                IconCompatParcelizer(getcustomlocationprovidernamesandroid_sdk_base_release);
            }
        } catch (IOException e) {
            this.IconCompatParcelizer.IconCompatParcelizer(false, e, "Failed to submit SDK reset payload.", new Object[0]);
        }
    }
}
