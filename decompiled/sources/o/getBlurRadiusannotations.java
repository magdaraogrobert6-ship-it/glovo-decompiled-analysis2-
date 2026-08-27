package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class getBlurRadiusannotations {
    public final HttpUrlFetcher IconCompatParcelizer;
    public final getBlurRadius MediaBrowserCompatMediaItem;
    public final getNoneannotations MediaDescriptionCompat;
    public final setOutlineui MediaMetadataCompat;
    public final accessgetLayerBlockp MediaSessionCompatQueueItem;
    public final setOutlineui RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final accessplusjd read;
    public final setOutlineui serializer;
    public final Context write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode3 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode4 = this.MediaDescriptionCompat.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.IconCompatParcelizer.hashCode();
        int iHashCode7 = this.RatingCompat.hashCode();
        return this.read.read.hashCode() + ((this.MediaMetadataCompat.hashCode() + ((this.serializer.hashCode() + ((iHashCode7 + ((iHashCode6 + ((((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31) + iHashCode5) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public getBlurRadiusannotations(Context context, accessgetLayerBlockp accessgetlayerblockp, getBlurRadius getblurradius, getNoneannotations getnoneannotations, String str, HttpUrlFetcher httpUrlFetcher, setOutlineui setoutlineui, setOutlineui setoutlineui2, setOutlineui setoutlineui3, accessplusjd accessplusjdVar) {
        this.write = context;
        this.MediaSessionCompatQueueItem = accessgetlayerblockp;
        this.MediaBrowserCompatMediaItem = getblurradius;
        this.MediaDescriptionCompat = getnoneannotations;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = httpUrlFetcher;
        this.RatingCompat = setoutlineui;
        this.serializer = setoutlineui2;
        this.MediaMetadataCompat = setoutlineui3;
        this.read = accessplusjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBlurRadiusannotations)) {
            return false;
        }
        getBlurRadiusannotations getblurradiusannotations = (getBlurRadiusannotations) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getblurradiusannotations.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getblurradiusannotations.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() || this.MediaBrowserCompatMediaItem != getblurradiusannotations.MediaBrowserCompatMediaItem || this.MediaDescriptionCompat != getblurradiusannotations.MediaDescriptionCompat) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getblurradiusannotations.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getblurradiusannotations.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || this.RatingCompat != getblurradiusannotations.RatingCompat || this.serializer != getblurradiusannotations.serializer || this.MediaMetadataCompat != getblurradiusannotations.MediaMetadataCompat) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getblurradiusannotations.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Options(context=" + this.write + ", size=" + this.MediaSessionCompatQueueItem + ", scale=" + this.MediaBrowserCompatMediaItem + ", precision=" + this.MediaDescriptionCompat + ", diskCacheKey=" + this.RemoteActionCompatParcelizer + ", fileSystem=" + this.IconCompatParcelizer + ", memoryCachePolicy=" + this.RatingCompat + ", diskCachePolicy=" + this.serializer + ", networkCachePolicy=" + this.MediaMetadataCompat + ", extras=" + this.read + ")";
    }
}
