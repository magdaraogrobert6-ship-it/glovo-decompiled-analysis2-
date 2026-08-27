package o;

/* JADX INFO: loaded from: classes.dex */
public final class get_windowPosturem18o9QQ {
    public final AbsoluteAlignment IconCompatParcelizer;
    public final AbsoluteAlignment MediaBrowserCompatMediaItem;
    public final AbsoluteAlignment MediaMetadataCompat;
    public final AbsoluteAlignment MediaSessionCompatQueueItem;
    public final AbsoluteAlignment RemoteActionCompatParcelizer;
    public final AbsoluteAlignment read;
    public final AbsoluteAlignment serializer;
    public final AbsoluteAlignment write;

    public get_windowPosturem18o9QQ() {
        getTopLeftannotations gettopleftannotations = get_anyPointerfpxItnM.write;
        getTopLeftannotations gettopleftannotations2 = get_anyPointerfpxItnM.MediaMetadataCompat;
        getTopLeftannotations gettopleftannotations3 = get_anyPointerfpxItnM.MediaBrowserCompatMediaItem;
        getTopLeftannotations gettopleftannotations4 = get_anyPointerfpxItnM.MediaSessionCompatQueueItem;
        getTopLeftannotations gettopleftannotations5 = get_anyPointerfpxItnM.IconCompatParcelizer;
        getTopLeftannotations gettopleftannotations6 = get_anyPointerfpxItnM.MediaDescriptionCompat;
        getTopLeftannotations gettopleftannotations7 = get_anyPointerfpxItnM.read;
        getTopLeftannotations gettopleftannotations8 = get_anyPointerfpxItnM.serializer;
        this.write = gettopleftannotations;
        this.MediaSessionCompatQueueItem = gettopleftannotations2;
        this.MediaBrowserCompatMediaItem = gettopleftannotations3;
        this.read = gettopleftannotations4;
        this.RemoteActionCompatParcelizer = gettopleftannotations5;
        this.MediaMetadataCompat = gettopleftannotations6;
        this.serializer = gettopleftannotations7;
        this.IconCompatParcelizer = gettopleftannotations8;
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode3 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode4 = this.read.hashCode();
        int iHashCode5 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode6 = this.MediaMetadataCompat.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof get_windowPosturem18o9QQ)) {
            return false;
        }
        get_windowPosturem18o9QQ get_windowposturem18o9qq = (get_windowPosturem18o9QQ) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, get_windowposturem18o9qq.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, get_windowposturem18o9qq.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, get_windowposturem18o9qq.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, get_windowposturem18o9qq.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, get_windowposturem18o9qq.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, get_windowposturem18o9qq.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, get_windowposturem18o9qq.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, get_windowposturem18o9qq.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.write + ", small=" + this.MediaSessionCompatQueueItem + ", medium=" + this.MediaBrowserCompatMediaItem + ", large=" + this.read + ", largeIncreased=" + this.MediaMetadataCompat + ", extraLarge=" + this.RemoteActionCompatParcelizer + ", extralargeIncreased=" + this.serializer + ", extraExtraLarge=" + this.IconCompatParcelizer + ')';
    }
}
