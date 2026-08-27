package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformShadowContext {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final long RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int serializer;
    public final int write;

    public final int hashCode() {
        return this.read.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaMetadataCompat), 31), 31), 31), 31), 31, this.RatingCompat);
    }

    public PlatformShadowContext(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, long j, String str5) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.MediaSessionCompatQueueItem = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.MediaMetadataCompat = str4;
        this.MediaDescriptionCompat = i;
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.write = i4;
        this.RatingCompat = j;
        this.read = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformShadowContext)) {
            return false;
        }
        PlatformShadowContext platformShadowContext = (PlatformShadowContext) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, platformShadowContext.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, platformShadowContext.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, platformShadowContext.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, platformShadowContext.MediaMetadataCompat}, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat == platformShadowContext.MediaDescriptionCompat && this.serializer == platformShadowContext.serializer && this.RemoteActionCompatParcelizer == platformShadowContext.RemoteActionCompatParcelizer && this.write == platformShadowContext.write && this.RatingCompat == platformShadowContext.RatingCompat && this.read.equals(platformShadowContext.read);
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DeviceMetaData(name=", this.MediaSessionCompatQueueItem, ", manufacturer=", this.IconCompatParcelizer, ", socModel=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaBrowserCompatMediaItem, ", socManufacturer=", this.MediaMetadataCompat, ", osVersion=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.MediaDescriptionCompat, this.serializer, ", cpuCore=", ", maxCpuFreq=", sbM);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, ", memoryClass=", ", ramSize=", sbM);
        sbM.append(this.RatingCompat);
        sbM.append(", deviceIdentifier=");
        sbM.append(this.read);
        sbM.append(")");
        return sbM.toString();
    }
}
