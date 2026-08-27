package o;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA {
    private r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w IconCompatParcelizer;
    private r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA MediaSessionCompatQueueItem;
    private final int RemoteActionCompatParcelizer;
    private r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w read;
    private boolean serializer;
    private r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w write;

    public final void MediaBrowserCompatMediaItem() {
        this.serializer = true;
        int i = this.RemoteActionCompatParcelizer;
        this.write = new r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w(i);
        this.IconCompatParcelizer = new r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w(i);
        this.read = new r8lambdaYtjc53jC0xlp5SArMoWh5Yv2E6w(i);
        this.MediaSessionCompatQueueItem = new r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA(i);
    }

    public final long[] MediaMetadataCompat() {
        int iIconCompatParcelizer = this.MediaSessionCompatQueueItem.IconCompatParcelizer();
        long[] jArr = new long[iIconCompatParcelizer];
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            jArr[i] = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(i);
        }
        return jArr;
    }

    public final float[][] RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = this.MediaSessionCompatQueueItem.IconCompatParcelizer();
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, iIconCompatParcelizer);
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            fArr[0][i] = this.write.read(i);
            fArr[1][i] = this.IconCompatParcelizer.read(i);
            fArr[2][i] = this.read.read(i);
        }
        return fArr;
    }

    public final int write() {
        return this.MediaSessionCompatQueueItem.IconCompatParcelizer();
    }

    public r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final long IconCompatParcelizer() {
        if (!this.serializer) {
            return -1L;
        }
        r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA r8lambdaddqxyraiudjzqhg2smcogjbrtia = this.MediaSessionCompatQueueItem;
        if (r8lambdaddqxyraiudjzqhg2smcogjbrtia.serializer()) {
            return -1L;
        }
        return r8lambdaddqxyraiudjzqhg2smcogjbrtia.RemoteActionCompatParcelizer(0);
    }

    public final boolean RatingCompat() {
        return !this.serializer || this.MediaSessionCompatQueueItem.serializer();
    }

    public final long serializer() {
        if (!this.serializer) {
            return -1L;
        }
        r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA r8lambdaddqxyraiudjzqhg2smcogjbrtia = this.MediaSessionCompatQueueItem;
        if (r8lambdaddqxyraiudjzqhg2smcogjbrtia.serializer()) {
            return -1L;
        }
        return r8lambdaddqxyraiudjzqhg2smcogjbrtia.RemoteActionCompatParcelizer(r8lambdaddqxyraiudjzqhg2smcogjbrtia.IconCompatParcelizer() - 1);
    }

    public final void MediaSessionCompatQueueItem() {
        if (this.serializer) {
            this.serializer = false;
            this.write = null;
            this.IconCompatParcelizer = null;
            this.read = null;
            this.MediaSessionCompatQueueItem = null;
        }
    }

    public final int RemoteActionCompatParcelizer(long j) {
        int i = 0;
        if (RatingCompat()) {
            return 0;
        }
        long jSerializer = serializer();
        r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA r8lambdaddqxyraiudjzqhg2smcogjbrtia = this.MediaSessionCompatQueueItem;
        if (jSerializer < j) {
            return r8lambdaddqxyraiudjzqhg2smcogjbrtia.IconCompatParcelizer();
        }
        int iIconCompatParcelizer = r8lambdaddqxyraiudjzqhg2smcogjbrtia.IconCompatParcelizer() - 1;
        int i2 = -1;
        while (i <= iIconCompatParcelizer) {
            int i3 = (i + iIconCompatParcelizer) / 2;
            if (this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(i3) >= j) {
                iIconCompatParcelizer = i3 - 1;
                i2 = i3;
            } else {
                i = i3 + 1;
            }
        }
        return i2;
    }

    public final void IconCompatParcelizer(long j, float f, float f2, float f3) {
        if (!this.serializer) {
            MediaBrowserCompatMediaItem();
        }
        this.write.serializer(f);
        this.IconCompatParcelizer.serializer(f2);
        this.read.serializer(f3);
        this.MediaSessionCompatQueueItem.IconCompatParcelizer(j);
    }

    public final void IconCompatParcelizer(int i) {
        if (this.serializer) {
            this.write.IconCompatParcelizer(i);
            this.IconCompatParcelizer.IconCompatParcelizer(i);
            this.read.IconCompatParcelizer(i);
            this.MediaSessionCompatQueueItem.IconCompatParcelizer(i);
        }
    }

    public final void read() {
        if (this.serializer) {
            this.write.write();
            this.IconCompatParcelizer.write();
            this.read.write();
            this.MediaSessionCompatQueueItem.write();
        }
    }

    public final void write(float[] fArr, float[] fArr2, float[] fArr3, long[] jArr, int i) {
        this.write.RemoteActionCompatParcelizer(fArr, i);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(fArr2, i);
        this.read.RemoteActionCompatParcelizer(fArr3, i);
        r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA r8lambdaddqxyraiudjzqhg2smcogjbrtia = this.MediaSessionCompatQueueItem;
        int iMin = Math.min(Math.min(i, r8lambdaddqxyraiudjzqhg2smcogjbrtia.IconCompatParcelizer()), jArr.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            jArr[i2] = r8lambdaddqxyraiudjzqhg2smcogjbrtia.RemoteActionCompatParcelizer(i2);
        }
    }
}
