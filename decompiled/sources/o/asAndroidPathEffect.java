package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class asAndroidPathEffect {
    public static final isConvexannotations MediaDescriptionCompat;
    public static final isConvexannotations MediaMetadataCompat;
    public static final AndroidPaint_androidKtWhenMappings MediaSessionCompatResultReceiverWrapper;
    public static final AndroidPaint_androidKtWhenMappings PlaybackStateCompat;
    public static final AndroidPaint_androidKtWhenMappings RatingCompat;
    public static final AndroidPaint_androidKtWhenMappings r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final isConvexannotations read;
    public static final isConvexannotations serializer;
    public final boolean ResultReceiver;
    public static final AndroidPaint_androidKtWhenMappings MediaSessionCompatQueueItem = new AndroidPaint_androidKtWhenMappings(false, 0 == true ? 1 : 0);
    public static final isConvexannotations MediaBrowserCompatMediaItem = new isConvexannotations(1 == true ? 1 : 0, 0 == true ? 1 : 0);
    public static final isConvexannotations PlaybackStateCompatCustomAction = new isConvexannotations(1 == true ? 1 : 0, 6);
    public static final isConvexannotations MediaSessionCompatToken = new isConvexannotations(1 == true ? 1 : 0, 7);
    public static final AndroidPaint_androidKtWhenMappings RemoteActionCompatParcelizer = new AndroidPaint_androidKtWhenMappings(0 == true ? 1 : 0, 1 == true ? 1 : 0);
    public static final isConvexannotations write = new isConvexannotations(1 == true ? 1 : 0, 1 == true ? 1 : 0);
    public static final isConvexannotations ParcelableVolumeInfo = new isConvexannotations(1 == true ? 1 : 0, 8);
    public static final isConvexannotations r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new isConvexannotations(1 == true ? 1 : 0, 9);

    public abstract Object IconCompatParcelizer(String str);

    public boolean IconCompatParcelizer(Object obj, Object obj2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, obj2}, iWrite3)).booleanValue();
    }

    public Object read(Object obj, String str) {
        return IconCompatParcelizer(str);
    }

    public abstract void read(String str, Bundle bundle, Object obj);

    public abstract Object serializer(Bundle bundle, String str);

    public abstract String serializer();

    public final String toString() {
        return serializer();
    }

    public String write(Object obj) {
        return String.valueOf(obj);
    }

    public asAndroidPathEffect(boolean z) {
        this.ResultReceiver = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 4;
        PlaybackStateCompat = new AndroidPaint_androidKtWhenMappings(0 == true ? 1 : 0, i);
        int i2 = 5;
        MediaDescriptionCompat = new isConvexannotations(true, i2);
        int i3 = 3;
        MediaSessionCompatResultReceiverWrapper = new AndroidPaint_androidKtWhenMappings(0 == true ? 1 : 0, i3);
        int i4 = 2;
        RatingCompat = new AndroidPaint_androidKtWhenMappings(0 == true ? 1 : 0, i4);
        serializer = new isConvexannotations(1 == true ? 1 : 0, i3);
        MediaMetadataCompat = new isConvexannotations(1 == true ? 1 : 0, i);
        read = new isConvexannotations(1 == true ? 1 : 0, i4);
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AndroidPaint_androidKtWhenMappings(1 == true ? 1 : 0, i2);
    }
}
