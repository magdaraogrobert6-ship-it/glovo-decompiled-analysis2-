package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasureAndLayoutDelegatePostponedRequest {
    public final zzbv IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode4 = this.serializer.hashCode();
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ this.RemoteActionCompatParcelizer) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MeasureAndLayoutDelegatePostponedRequest) {
            MeasureAndLayoutDelegatePostponedRequest measureAndLayoutDelegatePostponedRequest = (MeasureAndLayoutDelegatePostponedRequest) obj;
            return this.write.equals(measureAndLayoutDelegatePostponedRequest.write) && this.read.equals(measureAndLayoutDelegatePostponedRequest.read) && this.MediaBrowserCompatMediaItem.equals(measureAndLayoutDelegatePostponedRequest.MediaBrowserCompatMediaItem) && this.serializer.equals(measureAndLayoutDelegatePostponedRequest.serializer) && this.RemoteActionCompatParcelizer == measureAndLayoutDelegatePostponedRequest.RemoteActionCompatParcelizer && this.IconCompatParcelizer == measureAndLayoutDelegatePostponedRequest.IconCompatParcelizer;
        }
        return false;
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.write + ", versionCode=" + this.read + ", versionName=" + this.MediaBrowserCompatMediaItem + ", installUuid=" + this.serializer + ", deliveryMechanism=" + this.RemoteActionCompatParcelizer + ", developmentPlatformProvider=" + this.IconCompatParcelizer + "}";
    }

    public MeasureAndLayoutDelegatePostponedRequest(String str, String str2, String str3, String str4, int i, zzbv zzbvVar) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null appIdentifier");
            throw null;
        }
        this.write = str;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null versionCode");
            throw null;
        }
        this.read = str2;
        if (str3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null versionName");
            throw null;
        }
        this.MediaBrowserCompatMediaItem = str3;
        if (str4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null installUuid");
            throw null;
        }
        this.serializer = str4;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = zzbvVar;
    }
}
