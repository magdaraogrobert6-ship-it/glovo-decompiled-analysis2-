package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class getShadow {
    public int[] RatingCompat = new int[10];
    public int[] MediaSessionCompatToken = new int[10];
    public int RemoteActionCompatParcelizer = 0;
    public int[] MediaMetadataCompat = new int[10];
    public float[] MediaSessionCompatQueueItem = new float[10];
    public int IconCompatParcelizer = 0;
    public int[] MediaDescriptionCompat = new int[5];
    public String[] PlaybackStateCompat = new String[5];
    public int write = 0;
    public int[] serializer = new int[4];
    public boolean[] MediaBrowserCompatMediaItem = new boolean[4];
    public int read = 0;

    public final void IconCompatParcelizer(int i, String str) {
        int i2 = this.write;
        int[] iArr = this.MediaDescriptionCompat;
        if (i2 >= iArr.length) {
            this.MediaDescriptionCompat = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.PlaybackStateCompat;
            this.PlaybackStateCompat = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.MediaDescriptionCompat;
        int i3 = this.write;
        iArr2[i3] = i;
        String[] strArr2 = this.PlaybackStateCompat;
        this.write = i3 + 1;
        strArr2[i3] = str;
    }

    public final void write(float f, int i) {
        int i2 = this.IconCompatParcelizer;
        int[] iArr = this.MediaMetadataCompat;
        if (i2 >= iArr.length) {
            this.MediaMetadataCompat = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.MediaMetadataCompat;
        int i3 = this.IconCompatParcelizer;
        iArr2[i3] = i;
        float[] fArr2 = this.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = i3 + 1;
        fArr2[i3] = f;
    }

    public final void read(int i, int i2) {
        int i3 = this.RemoteActionCompatParcelizer;
        int[] iArr = this.RatingCompat;
        if (i3 >= iArr.length) {
            this.RatingCompat = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.MediaSessionCompatToken;
            this.MediaSessionCompatToken = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.RatingCompat;
        int i4 = this.RemoteActionCompatParcelizer;
        iArr3[i4] = i;
        int[] iArr4 = this.MediaSessionCompatToken;
        this.RemoteActionCompatParcelizer = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void read(int i, boolean z) {
        int i2 = this.read;
        int[] iArr = this.serializer;
        if (i2 >= iArr.length) {
            this.serializer = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.serializer;
        int i3 = this.read;
        iArr2[i3] = i;
        boolean[] zArr2 = this.MediaBrowserCompatMediaItem;
        this.read = i3 + 1;
        zArr2[i3] = z;
    }
}
