package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class CanvasUtils implements compositeOverOWjLjI, getComponents8_81llA {
    public static final TreeMap IconCompatParcelizer = new TreeMap();
    public final long[] MediaBrowserCompatMediaItem;
    public final String[] MediaDescriptionCompat;
    public final double[] MediaMetadataCompat;
    public volatile String MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public final int[] read;
    public final int serializer;
    public final byte[][] write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public static final CanvasUtils IconCompatParcelizer(int i, String str) {
        TreeMap treeMap = IconCompatParcelizer;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                CanvasUtils canvasUtils = new CanvasUtils(i);
                canvasUtils.MediaSessionCompatQueueItem = str;
                canvasUtils.RemoteActionCompatParcelizer = i;
                return canvasUtils;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            CanvasUtils canvasUtils2 = (CanvasUtils) entryCeilingEntry.getValue();
            canvasUtils2.getClass();
            canvasUtils2.MediaSessionCompatQueueItem = str;
            canvasUtils2.RemoteActionCompatParcelizer = i;
            return canvasUtils2;
        }
    }

    public final void serializer() {
        TreeMap treeMap = IconCompatParcelizer;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.serializer), this);
            if (treeMap.size() > 15) {
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                for (int size = treeMap.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }

    public CanvasUtils(int i) {
        this.serializer = i;
        int i2 = i + 1;
        this.read = new int[i2];
        this.MediaBrowserCompatMediaItem = new long[i2];
        this.MediaMetadataCompat = new double[i2];
        this.MediaDescriptionCompat = new String[i2];
        this.write = new byte[i2][];
    }

    @Override // o.getComponents8_81llA
    public final void IconCompatParcelizer(int i, long j) {
        this.read[i] = 2;
        this.MediaBrowserCompatMediaItem[i] = j;
    }

    @Override // o.getComponents8_81llA
    public final void IconCompatParcelizer(int i, byte[] bArr) {
        bArr.getClass();
        this.read[i] = 5;
        this.write[i] = bArr;
    }

    @Override // o.getComponents8_81llA
    public final void serializer(int i) {
        this.read[i] = 1;
    }

    @Override // o.getComponents8_81llA
    public final void serializer(int i, String str) {
        str.getClass();
        this.read[i] = 4;
        this.MediaDescriptionCompat[i] = str;
    }

    @Override // o.getComponents8_81llA
    public final void write(double d, int i) {
        this.read[i] = 3;
        this.MediaMetadataCompat[i] = d;
    }

    @Override // o.compositeOverOWjLjI
    public final void bindTo(getComponents8_81llA getcomponents8_81lla) {
        int i = this.RemoteActionCompatParcelizer;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.read[i2];
            if (i3 == 1) {
                getcomponents8_81lla.serializer(i2);
            } else if (i3 == 2) {
                getcomponents8_81lla.IconCompatParcelizer(i2, this.MediaBrowserCompatMediaItem[i2]);
            } else if (i3 == 3) {
                getcomponents8_81lla.write(this.MediaMetadataCompat[i2], i2);
            } else if (i3 == 4) {
                String str = this.MediaDescriptionCompat[i2];
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                    return;
                }
                getcomponents8_81lla.serializer(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.write[i2];
                if (bArr == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                    return;
                }
                getcomponents8_81lla.IconCompatParcelizer(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // o.compositeOverOWjLjI
    public final String getSql() {
        String str = this.MediaSessionCompatQueueItem;
        if (str != null) {
            return str;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
        return null;
    }
}
