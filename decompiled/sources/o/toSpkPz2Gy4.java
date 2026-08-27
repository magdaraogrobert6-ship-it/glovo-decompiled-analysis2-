package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class toSpkPz2Gy4 {
    public float IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public float RatingCompat;
    public int RemoteActionCompatParcelizer;
    public float ResultReceiver;
    public final setAlignment r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final HashMap read;
    public int serializer;
    public float write;

    public final void RemoteActionCompatParcelizer(toSpkPz2Gy4 tospkpz2gy4) {
        if (tospkpz2gy4 == null) {
            return;
        }
        this.IconCompatParcelizer = tospkpz2gy4.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = tospkpz2gy4.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = tospkpz2gy4.MediaMetadataCompat;
        this.RatingCompat = tospkpz2gy4.RatingCompat;
        this.MediaDescriptionCompat = tospkpz2gy4.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = tospkpz2gy4.ParcelableVolumeInfo;
        this.MediaSessionCompatToken = tospkpz2gy4.MediaSessionCompatToken;
        this.ResultReceiver = tospkpz2gy4.ResultReceiver;
        this.PlaybackStateCompat = tospkpz2gy4.PlaybackStateCompat;
        this.MediaSessionCompatResultReceiverWrapper = tospkpz2gy4.MediaSessionCompatResultReceiverWrapper;
        this.write = tospkpz2gy4.write;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = tospkpz2gy4.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        HashMap map = this.read;
        map.clear();
        for (DrawWithContentModifier drawWithContentModifier : tospkpz2gy4.read.values()) {
            map.put(drawWithContentModifier.write(), drawWithContentModifier.RemoteActionCompatParcelizer());
        }
    }

    public toSpkPz2Gy4(toSpkPz2Gy4 tospkpz2gy4) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.RemoteActionCompatParcelizer = 0;
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaSessionCompatQueueItem = 0;
        this.serializer = 0;
        this.IconCompatParcelizer = Float.NaN;
        this.MediaBrowserCompatMediaItem = Float.NaN;
        this.MediaMetadataCompat = Float.NaN;
        this.RatingCompat = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        this.ParcelableVolumeInfo = Float.NaN;
        this.MediaSessionCompatToken = Float.NaN;
        this.ResultReceiver = Float.NaN;
        this.PlaybackStateCompat = Float.NaN;
        this.MediaSessionCompatResultReceiverWrapper = Float.NaN;
        this.write = Float.NaN;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        this.read = new HashMap();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = tospkpz2gy4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.RemoteActionCompatParcelizer = tospkpz2gy4.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = tospkpz2gy4.PlaybackStateCompatCustomAction;
        this.MediaSessionCompatQueueItem = tospkpz2gy4.MediaSessionCompatQueueItem;
        this.serializer = tospkpz2gy4.serializer;
        RemoteActionCompatParcelizer(tospkpz2gy4);
    }

    public static void RemoteActionCompatParcelizer(float f, String str, StringBuilder sb) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void IconCompatParcelizer(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    public toSpkPz2Gy4(setAlignment setalignment) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.RemoteActionCompatParcelizer = 0;
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaSessionCompatQueueItem = 0;
        this.serializer = 0;
        this.IconCompatParcelizer = Float.NaN;
        this.MediaBrowserCompatMediaItem = Float.NaN;
        this.MediaMetadataCompat = Float.NaN;
        this.RatingCompat = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        this.ParcelableVolumeInfo = Float.NaN;
        this.MediaSessionCompatToken = Float.NaN;
        this.ResultReceiver = Float.NaN;
        this.PlaybackStateCompat = Float.NaN;
        this.MediaSessionCompatResultReceiverWrapper = Float.NaN;
        this.write = Float.NaN;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        this.read = new HashMap();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = setalignment;
    }
}
