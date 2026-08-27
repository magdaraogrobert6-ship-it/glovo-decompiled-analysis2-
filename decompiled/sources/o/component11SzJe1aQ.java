package o;

/* JADX INFO: loaded from: classes.dex */
public final class component11SzJe1aQ implements component150d7_KjU {
    public static final component11SzJe1aQ IconCompatParcelizer;
    public static final component11SzJe1aQ RatingCompat;
    public static final component11SzJe1aQ RemoteActionCompatParcelizer;
    public static final component11SzJe1aQ read;
    public static final component11SzJe1aQ serializer;
    public static final component11SzJe1aQ write;
    public final Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaSessionCompatQueueItem;

    public component11SzJe1aQ(getRotationX getrotationx, getCameraDistance getcameradistance, toContentCaptureSession tocontentcapturesession) {
        this.MediaSessionCompatQueueItem = 3;
        this.MediaBrowserCompatMediaItem = getcameradistance;
    }

    public String toString() {
        int i = this.MediaSessionCompatQueueItem;
        Object obj = this.MediaBrowserCompatMediaItem;
        if (i == 0) {
            return (String) obj;
        }
        if (i != 1) {
            return i != 2 ? super.toString() : (String) obj;
        }
        return (String) obj;
    }

    static {
        int i = 1;
        RatingCompat = new component11SzJe1aQ("VERTICAL", i);
        IconCompatParcelizer = new component11SzJe1aQ("HORIZONTAL", i);
        int i2 = 0;
        write = new component11SzJe1aQ("FLAT", i2);
        RemoteActionCompatParcelizer = new component11SzJe1aQ("HALF_OPENED", i2);
        int i3 = 2;
        serializer = new component11SzJe1aQ("FOLD", i3);
        read = new component11SzJe1aQ("HINGE", i3);
    }

    public /* synthetic */ component11SzJe1aQ(String str, int i) {
        this.MediaSessionCompatQueueItem = i;
        this.MediaBrowserCompatMediaItem = str;
    }
}
