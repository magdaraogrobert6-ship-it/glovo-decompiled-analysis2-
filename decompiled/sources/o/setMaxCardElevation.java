package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class setMaxCardElevation {
    public final int IconCompatParcelizer;
    public final UUID MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final android.graphics.Rect RemoteActionCompatParcelizer;
    public final int read;
    public final android.util.Size serializer;
    public final int write;

    public final int hashCode() {
        int iHashCode = this.MediaDescriptionCompat.hashCode();
        int i = this.write;
        int i2 = this.IconCompatParcelizer;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ this.read) * 1000003) ^ (this.MediaMetadataCompat ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setMaxCardElevation)) {
            return false;
        }
        setMaxCardElevation setmaxcardelevation = (setMaxCardElevation) obj;
        return this.MediaDescriptionCompat.equals(setmaxcardelevation.MediaDescriptionCompat) && this.write == setmaxcardelevation.write && this.IconCompatParcelizer == setmaxcardelevation.IconCompatParcelizer && this.RemoteActionCompatParcelizer.equals(setmaxcardelevation.RemoteActionCompatParcelizer) && this.serializer.equals(setmaxcardelevation.serializer) && this.read == setmaxcardelevation.read && this.MediaMetadataCompat == setmaxcardelevation.MediaMetadataCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", getTargets=");
        sb.append(this.write);
        sb.append(", getFormat=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", getCropRect=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", getSize=");
        sb.append(this.serializer);
        sb.append(", getRotationDegrees=");
        sb.append(this.read);
        sb.append(", isMirroring=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, ", shouldRespectInputCropRect=false}");
    }

    public setMaxCardElevation(UUID uuid, int i, int i2, android.graphics.Rect rect, android.util.Size size, int i3, boolean z) {
        if (uuid == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null getUuid");
            throw null;
        }
        this.MediaDescriptionCompat = uuid;
        this.write = i;
        this.IconCompatParcelizer = i2;
        if (rect == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null getCropRect");
            throw null;
        }
        this.RemoteActionCompatParcelizer = rect;
        if (size == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null getSize");
            throw null;
        }
        this.serializer = size;
        this.read = i3;
        this.MediaMetadataCompat = z;
    }
}
