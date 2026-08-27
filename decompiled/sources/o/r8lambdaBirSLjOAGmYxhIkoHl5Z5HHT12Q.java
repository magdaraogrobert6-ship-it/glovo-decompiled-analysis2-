package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.ThriftBool;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public Serializable RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I RemoteActionCompatParcelizer() {
        if (((ThriftBool) this.serializer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_accelerometer_available' is missing");
            return null;
        }
        if (((ThriftBool) this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_gyroscope_available' is missing");
            return null;
        }
        if (((ThriftBool) this.write) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_device_power_saving_mode_enabled' is missing");
            return null;
        }
        if (((onActivityPausedlambda0) this.read) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'low_battery_level_state' is missing");
            return null;
        }
        if (((registerOnApplicationlambda0) this.MediaMetadataCompat) != null) {
            return new r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'low_disk_space_state' is missing");
        return null;
    }

    public setEmailNotificationSubscriptionTypelambda0 IconCompatParcelizer() {
        if (((Byte) this.MediaDescriptionCompat) != null) {
            if (((Byte) this.serializer) != null) {
                if (((Byte) this.RemoteActionCompatParcelizer) != null) {
                    if (((Byte) this.IconCompatParcelizer) != null) {
                        return new setEmailNotificationSubscriptionTypelambda0(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_mobile_quota_status' is missing");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_wifi_quota_status' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_disk_quota_status' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'detection_status' is missing");
        return null;
    }

    public publishBrazePushAction serializer() {
        if (((Byte) this.MediaDescriptionCompat) != null) {
            if (((Byte) this.serializer) != null) {
                if (((Byte) this.RemoteActionCompatParcelizer) != null) {
                    if (((Byte) this.IconCompatParcelizer) != null) {
                        return new publishBrazePushAction(this);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_mobile_quota_status' is missing");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_wifi_quota_status' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sdk_disk_quota_status' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'detection_status' is missing");
        return null;
    }

    public setCustomUserAttributelambda2 write() {
        if (((com.sentiance.core.model.thrift.ThriftBool) this.serializer) != null) {
            if (((com.sentiance.core.model.thrift.ThriftBool) this.IconCompatParcelizer) != null) {
                if (((com.sentiance.core.model.thrift.ThriftBool) this.write) != null) {
                    if (((setCustomAttributeToSecondsFromEpoch) this.read) != null) {
                        if (((setEmailNotificationSubscriptionType) this.MediaMetadataCompat) != null) {
                            return new setCustomUserAttributelambda2(this);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'low_disk_space_state' is missing");
                        return null;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'low_battery_level_state' is missing");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_device_power_saving_mode_enabled' is missing");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_gyroscope_available' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'is_accelerometer_available' is missing");
        return null;
    }
}
