package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class createBlock {
    public final component50d7_KjU IconCompatParcelizer;
    public final ArrayList write = new ArrayList();

    public static long IconCompatParcelizer(releaseGraphicsLayer releasegraphicslayer, long j) {
        component50d7_KjU component50d7_kju = releasegraphicslayer.MediaSessionCompatQueueItem;
        ArrayList arrayList = releasegraphicslayer.RemoteActionCompatParcelizer;
        if (component50d7_kju instanceof component1D9Ej5fM) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            releaseGraphicsLayers releasegraphicslayers = (releaseGraphicsLayers) arrayList.get(i);
            if (releasegraphicslayers instanceof releaseGraphicsLayer) {
                releaseGraphicsLayer releasegraphicslayer2 = (releaseGraphicsLayer) releasegraphicslayers;
                if (releasegraphicslayer2.MediaSessionCompatQueueItem != component50d7_kju) {
                    jMin = Math.min(jMin, IconCompatParcelizer(releasegraphicslayer2, ((long) releasegraphicslayer2.write) + j));
                }
            }
        }
        releaseGraphicsLayer releasegraphicslayer3 = component50d7_kju.RemoteActionCompatParcelizer;
        releaseGraphicsLayer releasegraphicslayer4 = component50d7_kju.PlaybackStateCompatCustomAction;
        if (releasegraphicslayer != releasegraphicslayer3) {
            return jMin;
        }
        long jMediaBrowserCompatMediaItem = j - component50d7_kju.MediaBrowserCompatMediaItem();
        return Math.min(Math.min(jMin, IconCompatParcelizer(releasegraphicslayer4, jMediaBrowserCompatMediaItem)), jMediaBrowserCompatMediaItem - ((long) releasegraphicslayer4.write));
    }

    public static long read(releaseGraphicsLayer releasegraphicslayer, long j) {
        component50d7_KjU component50d7_kju = releasegraphicslayer.MediaSessionCompatQueueItem;
        ArrayList arrayList = releasegraphicslayer.RemoteActionCompatParcelizer;
        if (component50d7_kju instanceof component1D9Ej5fM) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            releaseGraphicsLayers releasegraphicslayers = (releaseGraphicsLayers) arrayList.get(i);
            if (releasegraphicslayers instanceof releaseGraphicsLayer) {
                releaseGraphicsLayer releasegraphicslayer2 = (releaseGraphicsLayer) releasegraphicslayers;
                if (releasegraphicslayer2.MediaSessionCompatQueueItem != component50d7_kju) {
                    jMax = Math.max(jMax, read(releasegraphicslayer2, ((long) releasegraphicslayer2.write) + j));
                }
            }
        }
        releaseGraphicsLayer releasegraphicslayer3 = component50d7_kju.PlaybackStateCompatCustomAction;
        releaseGraphicsLayer releasegraphicslayer4 = component50d7_kju.RemoteActionCompatParcelizer;
        if (releasegraphicslayer != releasegraphicslayer3) {
            return jMax;
        }
        long jMediaBrowserCompatMediaItem = component50d7_kju.MediaBrowserCompatMediaItem() + j;
        return Math.max(Math.max(jMax, read(releasegraphicslayer4, jMediaBrowserCompatMediaItem)), jMediaBrowserCompatMediaItem - ((long) releasegraphicslayer4.write));
    }

    public final void write(component50d7_KjU component50d7_kju) {
        this.write.add(component50d7_kju);
    }

    public createBlock(component50d7_KjU component50d7_kju) {
        this.IconCompatParcelizer = null;
        this.IconCompatParcelizer = component50d7_kju;
    }

    public final long RemoteActionCompatParcelizer(getUseIntrinsicSize getuseintrinsicsize, int i) {
        component50d7_KjU component50d7_kju;
        component50d7_KjU component50d7_kju2;
        float f;
        long j;
        component50d7_KjU component50d7_kju3 = this.IconCompatParcelizer;
        if (!(component50d7_kju3 instanceof ScaleKt) ? i != 0 ? (component50d7_kju3 instanceof copygNMxBKI) : (component50d7_kju3 instanceof component40d7_KjU) : ((ScaleKt) component50d7_kju3).ParcelableVolumeInfo == i) {
            return 0L;
        }
        if (i == 0) {
            component50d7_kju = getuseintrinsicsize.getOnBackPressedInput;
        } else {
            component50d7_kju = getuseintrinsicsize.onCreatePanelMenu;
        }
        releaseGraphicsLayer releasegraphicslayer = component50d7_kju.PlaybackStateCompatCustomAction;
        if (i == 0) {
            component50d7_kju2 = getuseintrinsicsize.getOnBackPressedInput;
        } else {
            component50d7_kju2 = getuseintrinsicsize.onCreatePanelMenu;
        }
        releaseGraphicsLayer releasegraphicslayer2 = component50d7_kju2.RemoteActionCompatParcelizer;
        releaseGraphicsLayer releasegraphicslayer3 = component50d7_kju3.PlaybackStateCompatCustomAction;
        releaseGraphicsLayer releasegraphicslayer4 = component50d7_kju3.PlaybackStateCompatCustomAction;
        releaseGraphicsLayer releasegraphicslayer5 = component50d7_kju3.RemoteActionCompatParcelizer;
        boolean zContains = releasegraphicslayer3.MediaMetadataCompat.contains(releasegraphicslayer);
        boolean zContains2 = releasegraphicslayer5.MediaMetadataCompat.contains(releasegraphicslayer2);
        long jMediaBrowserCompatMediaItem = component50d7_kju3.MediaBrowserCompatMediaItem();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(read(releasegraphicslayer4, releasegraphicslayer4.write), ((long) releasegraphicslayer4.write) + jMediaBrowserCompatMediaItem);
            }
            if (zContains2) {
                return Math.max(-IconCompatParcelizer(releasegraphicslayer5, releasegraphicslayer5.write), ((long) (-releasegraphicslayer5.write)) + jMediaBrowserCompatMediaItem);
            }
            return (component50d7_kju3.MediaBrowserCompatMediaItem() + releasegraphicslayer4.write) - ((long) releasegraphicslayer5.write);
        }
        long j2 = read(releasegraphicslayer4, 0L);
        long jIconCompatParcelizer = IconCompatParcelizer(releasegraphicslayer5, 0L);
        long j3 = j2 - jMediaBrowserCompatMediaItem;
        int i2 = releasegraphicslayer5.write;
        if (j3 >= (-i2)) {
            j3 += (long) i2;
        }
        long j4 = releasegraphicslayer4.write;
        long j5 = ((-jIconCompatParcelizer) - jMediaBrowserCompatMediaItem) - j4;
        if (j5 >= j4) {
            j5 -= j4;
        }
        setAlignment setalignment = component50d7_kju3.MediaSessionCompatResultReceiverWrapper;
        if (i == 0) {
            f = setalignment.fullyDrawnReporter_delegatelambda0;
        } else if (i == 1) {
            f = setalignment.onBackPressed;
        } else {
            setalignment.getClass();
            f = -1.0f;
        }
        if (f > 0.0f) {
            j = (long) ((j3 / (1.0f - f)) + (j5 / f));
        } else {
            j = 0;
        }
        float f2 = j;
        long j6 = (long) ((f2 * f) + 0.5f);
        return (((long) releasegraphicslayer4.write) + ((j6 + jMediaBrowserCompatMediaItem) + ((long) c8$$ExternalSyntheticOutline0.m(1.0f, f, f2, 0.5f)))) - ((long) releasegraphicslayer5.write);
    }
}
