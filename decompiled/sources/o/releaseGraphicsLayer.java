package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class releaseGraphicsLayer implements releaseGraphicsLayers {
    public final component50d7_KjU MediaSessionCompatQueueItem;
    public int PlaybackStateCompat;
    public int write;
    public component50d7_KjU MediaSessionCompatToken = null;
    public boolean IconCompatParcelizer = false;
    public boolean MediaDescriptionCompat = false;
    public setGraphicsContext RatingCompat = setGraphicsContext.UNKNOWN;
    public int serializer = 1;
    public createGraphicsLayer read = null;
    public boolean MediaBrowserCompatMediaItem = false;
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final ArrayList MediaMetadataCompat = new ArrayList();

    @Override // o.releaseGraphicsLayers
    public final void IconCompatParcelizer(releaseGraphicsLayers releasegraphicslayers) {
        ArrayList<releaseGraphicsLayer> arrayList = this.MediaMetadataCompat;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((releaseGraphicsLayer) it.next()).MediaBrowserCompatMediaItem) {
                return;
            }
        }
        this.MediaDescriptionCompat = true;
        component50d7_KjU component50d7_kju = this.MediaSessionCompatToken;
        if (component50d7_kju != null) {
            component50d7_kju.IconCompatParcelizer(this);
        }
        if (this.IconCompatParcelizer) {
            this.MediaSessionCompatQueueItem.IconCompatParcelizer(this);
            return;
        }
        releaseGraphicsLayer releasegraphicslayer = null;
        int i = 0;
        for (releaseGraphicsLayer releasegraphicslayer2 : arrayList) {
            if (!(releasegraphicslayer2 instanceof createGraphicsLayer)) {
                i++;
                releasegraphicslayer = releasegraphicslayer2;
            }
        }
        if (releasegraphicslayer != null && i == 1 && releasegraphicslayer.MediaBrowserCompatMediaItem) {
            createGraphicsLayer creategraphicslayer = this.read;
            if (creategraphicslayer != null) {
                if (!creategraphicslayer.MediaBrowserCompatMediaItem) {
                    return;
                } else {
                    this.write = this.serializer * creategraphicslayer.PlaybackStateCompat;
                }
            }
            IconCompatParcelizer(releasegraphicslayer.PlaybackStateCompat + this.write);
        }
        component50d7_KjU component50d7_kju2 = this.MediaSessionCompatToken;
        if (component50d7_kju2 != null) {
            component50d7_kju2.IconCompatParcelizer(this);
        }
    }

    public final void read() {
        this.MediaMetadataCompat.clear();
        this.RemoteActionCompatParcelizer.clear();
        this.MediaBrowserCompatMediaItem = false;
        this.PlaybackStateCompat = 0;
        this.MediaDescriptionCompat = false;
        this.IconCompatParcelizer = false;
    }

    public final void read(component50d7_KjU component50d7_kju) {
        this.RemoteActionCompatParcelizer.add(component50d7_kju);
        if (this.MediaBrowserCompatMediaItem) {
            component50d7_kju.IconCompatParcelizer(component50d7_kju);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper.accessensureViewModelStore);
        sb.append(":");
        sb.append(this.RatingCompat);
        sb.append("(");
        sb.append(this.MediaBrowserCompatMediaItem ? Integer.valueOf(this.PlaybackStateCompat) : "unresolved");
        sb.append(") <t=");
        sb.append(this.MediaMetadataCompat.size());
        sb.append(":d=");
        sb.append(this.RemoteActionCompatParcelizer.size());
        sb.append(">");
        return sb.toString();
    }

    public releaseGraphicsLayer(component50d7_KjU component50d7_kju) {
        this.MediaSessionCompatQueueItem = component50d7_kju;
    }

    public void IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        this.PlaybackStateCompat = i;
        for (releaseGraphicsLayers releasegraphicslayers : this.RemoteActionCompatParcelizer) {
            releasegraphicslayers.IconCompatParcelizer(releasegraphicslayers);
        }
    }
}
