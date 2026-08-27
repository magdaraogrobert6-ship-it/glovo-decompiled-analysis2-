package o;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.services.ServiceForegroundMode;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 {
    private final ServiceForegroundMode IconCompatParcelizer;
    private final boolean MediaMetadataCompat;
    private final StartLocationFixRequest$Purpose MediaSessionCompatQueueItem;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final long serializer;
    private final int write;

    public final StartLocationFixRequest$Purpose IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    public final boolean RatingCompat() {
        return this.read;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long serializer() {
        return this.serializer;
    }

    public final int write() {
        return this.write;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i = this.write;
        long j = this.serializer;
        int i2 = (int) (j ^ (j >>> 32));
        boolean z = this.read;
        return this.MediaSessionCompatQueueItem.hashCode() + ((((this.IconCompatParcelizer.hashCode() + (((((((iHashCode * 31) + i) * 31) + i2) * 31) + (z ? 1 : 0)) * 31)) * 31) + (this.MediaMetadataCompat ? 1 : 0)) * 31);
    }

    private r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0(String str, int i, long j, ServiceForegroundMode serviceForegroundMode, boolean z, boolean z2, StartLocationFixRequest$Purpose startLocationFixRequest$Purpose) {
        this.RemoteActionCompatParcelizer = str;
        this.write = i;
        this.serializer = j;
        this.IconCompatParcelizer = serviceForegroundMode;
        this.read = z;
        this.MediaMetadataCompat = z2;
        this.MediaSessionCompatQueueItem = startLocationFixRequest$Purpose;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartLocationFixRequest{mRequestId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', mRunMode=");
        sb.append(this.write);
        sb.append(", mIntervalMs=");
        sb.append(this.serializer);
        sb.append(", mRequestImmediateFix=");
        sb.append(this.read);
        sb.append(", mForegroundMode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mStayAwake=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.MediaMetadataCompat, '}');
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaMetadataCompat || (this.write == 1 && this.serializer <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.class != obj.getClass()) {
            return false;
        }
        r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0 = (r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0) obj;
        return this.write == r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.write && this.serializer == r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.serializer && this.read == r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.read && this.MediaMetadataCompat == r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.MediaMetadataCompat && this.RemoteActionCompatParcelizer.equals(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.IconCompatParcelizer && this.MediaSessionCompatQueueItem == r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.MediaSessionCompatQueueItem;
    }

    public static r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 IconCompatParcelizer(String str, ServiceForegroundMode serviceForegroundMode, StartLocationFixRequest$Purpose startLocationFixRequest$Purpose) {
        return new r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0(str, 2, 0L, serviceForegroundMode, true, false, startLocationFixRequest$Purpose);
    }

    public static r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 read(String str, long j, ServiceForegroundMode serviceForegroundMode, boolean z, boolean z2, StartLocationFixRequest$Purpose startLocationFixRequest$Purpose) {
        return new r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0(str, 1, j, serviceForegroundMode, z, z2, startLocationFixRequest$Purpose);
    }

    public final ServiceForegroundMode RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
