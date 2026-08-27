package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewOrientationIncorrectQuirk implements SurfaceRequest {
    public final int IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final int serializer;
    public final List write;

    @Override // o.SurfaceRequest
    public final int IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.SurfaceRequest
    public final List RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.SurfaceRequest
    public final List read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.SurfaceRequest
    public final int write() {
        return this.IconCompatParcelizer;
    }

    public PreviewOrientationIncorrectQuirk(int i, int i2, List list, List list2) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null audioProfiles");
            throw null;
        }
        this.RemoteActionCompatParcelizer = list;
        if (list2 != null) {
            this.write = list2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null videoProfiles");
            throw null;
        }
    }

    public static PreviewOrientationIncorrectQuirk serializer(int i, int i2, List list, List list2) {
        return new PreviewOrientationIncorrectQuirk(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreviewOrientationIncorrectQuirk)) {
            return false;
        }
        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirk = (PreviewOrientationIncorrectQuirk) obj;
        return this.IconCompatParcelizer == previewOrientationIncorrectQuirk.IconCompatParcelizer && this.serializer == previewOrientationIncorrectQuirk.serializer && this.RemoteActionCompatParcelizer.equals(previewOrientationIncorrectQuirk.RemoteActionCompatParcelizer) && this.write.equals(previewOrientationIncorrectQuirk.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", recommendedFileFormat=");
        sb.append(this.serializer);
        sb.append(", audioProfiles=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", videoProfiles=");
        return MediaSessionCompatQueueItem.read(sb, this.write, "}");
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.serializer;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.write.hashCode();
    }
}
