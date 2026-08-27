package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyCameraSurfaceCleanupQuirk {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final int write;

    public LegacyCameraSurfaceCleanupQuirk(String str, int i, int i2, int i3, int i4, int i5) {
        this.IconCompatParcelizer = i;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mediaType");
            throw null;
        }
        this.serializer = str;
        this.read = i2;
        this.MediaBrowserCompatMediaItem = i3;
        this.write = i4;
        this.RemoteActionCompatParcelizer = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LegacyCameraSurfaceCleanupQuirk)) {
            return false;
        }
        LegacyCameraSurfaceCleanupQuirk legacyCameraSurfaceCleanupQuirk = (LegacyCameraSurfaceCleanupQuirk) obj;
        return this.IconCompatParcelizer == legacyCameraSurfaceCleanupQuirk.IconCompatParcelizer && this.serializer.equals(legacyCameraSurfaceCleanupQuirk.serializer) && this.read == legacyCameraSurfaceCleanupQuirk.read && this.MediaBrowserCompatMediaItem == legacyCameraSurfaceCleanupQuirk.MediaBrowserCompatMediaItem && this.write == legacyCameraSurfaceCleanupQuirk.write && this.RemoteActionCompatParcelizer == legacyCameraSurfaceCleanupQuirk.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mediaType=");
        sb.append(this.serializer);
        sb.append(", bitrate=");
        sb.append(this.read);
        sb.append(", sampleRate=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", channels=");
        sb.append(this.write);
        sb.append(", profile=");
        return af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "}", sb);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int iHashCode = this.serializer.hashCode();
        int i2 = this.read;
        int i3 = this.MediaBrowserCompatMediaItem;
        return ((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.write) * 1000003) ^ this.RemoteActionCompatParcelizer;
    }
}
