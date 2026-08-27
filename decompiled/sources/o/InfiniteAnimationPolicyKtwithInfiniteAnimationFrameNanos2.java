package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 implements SurfaceRequest {
    public final LegacyCameraSurfaceCleanupQuirk IconCompatParcelizer;
    public final List MediaDescriptionCompat;
    public final int RemoteActionCompatParcelizer;
    public final List read;
    public final PreviewDelayWhenVideoCaptureIsBoundQuirk serializer;
    public final int write;

    @Override // o.SurfaceRequest
    public final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.SurfaceRequest
    public final List RemoteActionCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.SurfaceRequest
    public final List read() {
        return this.read;
    }

    @Override // o.SurfaceRequest
    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2(int i, int i2, List list, List list2, LegacyCameraSurfaceCleanupQuirk legacyCameraSurfaceCleanupQuirk, PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null audioProfiles");
            throw null;
        }
        this.read = list;
        if (list2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null videoProfiles");
            throw null;
        }
        this.MediaDescriptionCompat = list2;
        this.IconCompatParcelizer = legacyCameraSurfaceCleanupQuirk;
        if (previewDelayWhenVideoCaptureIsBoundQuirk != null) {
            this.serializer = previewDelayWhenVideoCaptureIsBoundQuirk;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null defaultVideoProfile");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2)) {
            return false;
        }
        InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2 = (InfiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2) obj;
        if (this.RemoteActionCompatParcelizer != infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.RemoteActionCompatParcelizer || this.write != infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.write || !this.read.equals(infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.read) || !this.MediaDescriptionCompat.equals(infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.MediaDescriptionCompat)) {
            return false;
        }
        LegacyCameraSurfaceCleanupQuirk legacyCameraSurfaceCleanupQuirk = infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.IconCompatParcelizer;
        LegacyCameraSurfaceCleanupQuirk legacyCameraSurfaceCleanupQuirk2 = this.IconCompatParcelizer;
        if (legacyCameraSurfaceCleanupQuirk2 == null) {
            if (legacyCameraSurfaceCleanupQuirk != null) {
                return false;
            }
        } else if (!legacyCameraSurfaceCleanupQuirk2.equals(legacyCameraSurfaceCleanupQuirk)) {
            return false;
        }
        return this.serializer.equals(infiniteAnimationPolicyKtwithInfiniteAnimationFrameNanos2.serializer);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.RemoteActionCompatParcelizer + ", recommendedFileFormat=" + this.write + ", audioProfiles=" + this.read + ", videoProfiles=" + this.MediaDescriptionCompat + ", defaultAudioProfile=" + this.IconCompatParcelizer + ", defaultVideoProfile=" + this.serializer + "}";
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.MediaDescriptionCompat.hashCode();
        LegacyCameraSurfaceCleanupQuirk legacyCameraSurfaceCleanupQuirk = this.IconCompatParcelizer;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ (legacyCameraSurfaceCleanupQuirk == null ? 0 : legacyCameraSurfaceCleanupQuirk.hashCode())) * 1000003) ^ this.serializer.hashCode();
    }
}
