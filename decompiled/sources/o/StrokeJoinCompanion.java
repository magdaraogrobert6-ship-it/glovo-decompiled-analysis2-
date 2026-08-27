package o;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class StrokeJoinCompanion {
    public float IconCompatParcelizer;
    public ArrayList MediaBrowserCompatMediaItem;
    public HashMap MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public HashMap ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public ArrayList PlaybackStateCompatCustomAction;
    public ContextMenuSpec RatingCompat;
    public accessprocessDragStart RemoteActionCompatParcelizer;
    public float read;
    public HashMap serializer;
    public android.graphics.Rect write;
    public final com.airbnb.lottie.PerformanceTracker MediaSessionCompatToken = new com.airbnb.lottie.PerformanceTracker(0);
    public final HashSet r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new HashSet();
    public int MediaSessionCompatResultReceiverWrapper = 0;

    public final float RemoteActionCompatParcelizer() {
        return (long) (((this.read - this.PlaybackStateCompat) / this.IconCompatParcelizer) * 1000.0f);
    }

    public final void IconCompatParcelizer(String str) {
        getD50Xyzui_graphics.IconCompatParcelizer(str);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(str);
    }

    public final Map IconCompatParcelizer() {
        float fIconCompatParcelizer = newD50Xyzui_graphics.IconCompatParcelizer();
        if (fIconCompatParcelizer != this.MediaSessionCompatQueueItem) {
            for (Map.Entry entry : this.MediaDescriptionCompat.entrySet()) {
                HashMap map = this.MediaDescriptionCompat;
                String str = (String) entry.getKey();
                getMirror3opZhB0 getmirror3opzhb0 = (getMirror3opZhB0) entry.getValue();
                float f = this.MediaSessionCompatQueueItem / fIconCompatParcelizer;
                int i = (int) (getmirror3opzhb0.MediaSessionCompatQueueItem * f);
                int i2 = (int) (getmirror3opzhb0.write * f);
                getMirror3opZhB0 getmirror3opzhb1 = new getMirror3opZhB0(i, i2, getmirror3opzhb0.read, getmirror3opzhb0.RemoteActionCompatParcelizer, getmirror3opzhb0.IconCompatParcelizer);
                Bitmap bitmap = getmirror3opzhb0.serializer;
                if (bitmap != null) {
                    getmirror3opzhb1.serializer = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, getmirror3opzhb1);
            }
        }
        this.MediaSessionCompatQueueItem = fIconCompatParcelizer;
        return this.MediaDescriptionCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            sb.append(((getAdobeRgb) it.next()).RemoteActionCompatParcelizer("\t"));
        }
        return sb.toString();
    }
}
