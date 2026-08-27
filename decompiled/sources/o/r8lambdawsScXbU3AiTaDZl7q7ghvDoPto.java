package o;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdawsScXbU3AiTaDZl7q7ghvDoPto {
    private TriggerAssetDataStoreProviderCompanion IconCompatParcelizer;
    private TriggerAssetDataStoreProviderCompanion RemoteActionCompatParcelizer;
    private TriggerAssetDataStoreProviderCompanion read;
    private r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk serializer;
    private final int write;
    private boolean MediaSessionCompatQueueItem = false;
    private long RatingCompat = -1;
    private long MediaBrowserCompatMediaItem = -1;

    public final long RemoteActionCompatParcelizer() {
        return this.RatingCompat;
    }

    public final long serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final float[][] write(long j, long j2, int i) {
        boolean z = this.MediaSessionCompatQueueItem;
        Class cls = Float.TYPE;
        if (!z || this.read.isEmpty()) {
            return (float[][]) Array.newInstance((Class<?>) cls, i, 4);
        }
        int iMin = Math.min(IconCompatParcelizer(), i);
        int i2 = i > iMin ? i - iMin : 0;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, i, 4);
        r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfk = this.serializer;
        int size = r8lambdak_msz2dnanoyi5bwwe2hzkactfk.size();
        long[] jArr = new long[size];
        for (int i3 = 0; i3 < size; i3++) {
            jArr[i3] = r8lambdak_msz2dnanoyi5bwwe2hzkactfk.get(i3).longValue();
        }
        float[] fArrIconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(jArr, j, j2);
        float f = fArrIconCompatParcelizer[0];
        float fFloatValue = this.read.get(0).floatValue();
        float fFloatValue2 = this.RemoteActionCompatParcelizer.get(0).floatValue();
        float fFloatValue3 = this.IconCompatParcelizer.get(0).floatValue();
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr2 = fArr[i4];
            fArr2[0] = f;
            fArr2[1] = fFloatValue;
            fArr2[2] = fFloatValue2;
            fArr2[3] = fFloatValue3;
        }
        for (int i5 = 0; i5 < iMin; i5++) {
            int i6 = i5 + i2;
            float[] fArr3 = fArr[i6];
            fArr3[0] = fArrIconCompatParcelizer[i5];
            fArr3[1] = this.read.get(i5).floatValue();
            fArr[i6][2] = this.RemoteActionCompatParcelizer.get(i5).floatValue();
            fArr[i6][3] = this.IconCompatParcelizer.get(i5).floatValue();
        }
        return fArr;
    }

    public r8lambdawsScXbU3AiTaDZl7q7ghvDoPto(int i) {
        this.write = i;
    }

    public final int IconCompatParcelizer() {
        if (this.MediaSessionCompatQueueItem) {
            return this.read.size();
        }
        return 0;
    }

    public final void read() {
        if (this.MediaSessionCompatQueueItem) {
            this.MediaSessionCompatQueueItem = false;
            this.read.clear();
            this.RemoteActionCompatParcelizer.clear();
            this.IconCompatParcelizer.clear();
            this.serializer.clear();
            this.RatingCompat = -1L;
            this.MediaBrowserCompatMediaItem = -1L;
            this.read.RemoteActionCompatParcelizer();
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            this.serializer.RemoteActionCompatParcelizer();
        }
    }

    public final void write(long j, float f, float f2, float f3) {
        if (!this.MediaSessionCompatQueueItem) {
            this.MediaSessionCompatQueueItem = true;
            int i = this.write;
            this.read = new TriggerAssetDataStoreProviderCompanion(i);
            this.RemoteActionCompatParcelizer = new TriggerAssetDataStoreProviderCompanion(i);
            this.IconCompatParcelizer = new TriggerAssetDataStoreProviderCompanion(i);
            this.serializer = new r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk(i);
        }
        this.read.add(Float.valueOf(f));
        this.RemoteActionCompatParcelizer.add(Float.valueOf(f2));
        this.IconCompatParcelizer.add(Float.valueOf(f3));
        this.serializer.add(Long.valueOf(j));
        if (this.RatingCompat == -1) {
            this.RatingCompat = j;
        }
        this.MediaBrowserCompatMediaItem = j;
    }

    public final void write() {
        if (this.MediaSessionCompatQueueItem) {
            this.read.clear();
            this.RemoteActionCompatParcelizer.clear();
            this.IconCompatParcelizer.clear();
            this.serializer.clear();
            this.RatingCompat = -1L;
            this.MediaBrowserCompatMediaItem = -1L;
        }
    }
}
