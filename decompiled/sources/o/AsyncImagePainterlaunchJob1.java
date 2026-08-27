package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePainterlaunchJob1 {
    private static int MediaDescriptionCompat = 0;
    private static int ParcelableVolumeInfo = 1;
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaMetadataCompat;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final int serializer;
    public final String write;

    public AsyncImagePainterlaunchJob1(int i, String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z3, String str3) {
        str.getClass();
        this.serializer = i;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RatingCompat = z;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = z2;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = z3;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("DestinationViewEntity(icon=", this.serializer, ", name=", this.IconCompatParcelizer, ", address=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.write, ", showMapAction=", ", mapAction=", sbM, this.RatingCompat);
        sbM.append(this.read);
        sbM.append(", showPhoneAction=");
        sbM.append(this.MediaBrowserCompatMediaItem);
        sbM.append(", phoneAction=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", showComplement=");
        sbM.append(this.MediaMetadataCompat);
        sbM.append(", complement=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ")");
        int i4 = MediaDescriptionCompat + 109;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 65;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.serializer) * 31, 31, this.IconCompatParcelizer), 31, this.write), 31, this.RatingCompat);
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null ? 0 : r8lambdardpfsr94j4iebcwx_kpqzpm8k0.hashCode())) * 31, 31, this.MediaBrowserCompatMediaItem);
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.MediaSessionCompatQueueItem;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k1 == null) {
            int i4 = MediaDescriptionCompat + 43;
            ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = r8lambdardpfsr94j4iebcwx_kpqzpm8k1.hashCode();
        }
        int iM3 = d$$ExternalSyntheticOutline0.m((iM2 + iHashCode) * 31, 31, this.MediaMetadataCompat);
        String str = this.RemoteActionCompatParcelizer;
        return iM3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = MediaDescriptionCompat + 69;
            ParcelableVolumeInfo = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof AsyncImagePainterlaunchJob1)) {
            return false;
        }
        AsyncImagePainterlaunchJob1 asyncImagePainterlaunchJob1 = (AsyncImagePainterlaunchJob1) obj;
        if (this.serializer != asyncImagePainterlaunchJob1.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, asyncImagePainterlaunchJob1.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.write.equals(asyncImagePainterlaunchJob1.write)) {
            if (this.RatingCompat != asyncImagePainterlaunchJob1.RatingCompat) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, asyncImagePainterlaunchJob1.read}, getCieXyz.write())).booleanValue()) {
                if (this.MediaBrowserCompatMediaItem != asyncImagePainterlaunchJob1.MediaBrowserCompatMediaItem) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, asyncImagePainterlaunchJob1.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || this.MediaMetadataCompat != asyncImagePainterlaunchJob1.MediaMetadataCompat) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, asyncImagePainterlaunchJob1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            i = MediaDescriptionCompat + 61;
            ParcelableVolumeInfo = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = ParcelableVolumeInfo + 125;
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i5 = i % 2;
        return false;
    }
}
