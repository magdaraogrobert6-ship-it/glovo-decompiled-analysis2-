package o;

import com.sentiance.sdk.sensorstream.SensorType;

/* JADX INFO: loaded from: classes3.dex */
final class logNotificationMetadataandroid_sdk_ui_release {
    private final int RemoteActionCompatParcelizer;
    private final SensorType read;
    private final onResumelambda0 write;

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final onResumelambda0 read() {
        return this.write;
    }

    public final SensorType write() {
        return this.read;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public logNotificationMetadataandroid_sdk_ui_release(SensorType sensorType, int i, onResumelambda0 onresumelambda0) {
        this.read = sensorType;
        this.RemoteActionCompatParcelizer = i;
        this.write = onresumelambda0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && logNotificationMetadataandroid_sdk_ui_release.class == obj.getClass() && this.read == ((logNotificationMetadataandroid_sdk_ui_release) obj).read;
    }
}
