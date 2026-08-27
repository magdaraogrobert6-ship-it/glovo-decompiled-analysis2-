package o;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class getNotificationId {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;

    public final cancelNotificationlambda0 RemoteActionCompatParcelizer(logLocationRecordedEvent loglocationrecordedevent, long j) {
        List list = loglocationrecordedevent.read;
        long[] jArrWrite = write(j, loglocationrecordedevent.write);
        int length = jArrWrite.length;
        float[] fArr = new float[length];
        float[] fArr2 = new float[length];
        float[] fArr3 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Integer) ((List) list.get(0)).get(i)).intValue() / 1000.0f;
            fArr2[i] = ((Integer) ((List) list.get(1)).get(i)).intValue() / 1000.0f;
            fArr3[i] = ((Integer) ((List) list.get(2)).get(i)).intValue() / 1000.0f;
        }
        return new cancelNotificationlambda0(fArr, fArr2, fArr3, jArrWrite);
    }

    public getNotificationId(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final long[] write(long j, List list) {
        r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk r8lambdak_msz2dnanoyi5bwwe2hzkactfk = new r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk(list.size());
        this.read.getClass();
        System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r8lambdak_msz2dnanoyi5bwwe2hzkactfk.add(Long.valueOf(((long) ((Integer) list.get(i)).intValue()) + j));
        }
        int size2 = r8lambdak_msz2dnanoyi5bwwe2hzkactfk.size();
        long[] jArr = new long[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            jArr[i2] = r8lambdak_msz2dnanoyi5bwwe2hzkactfk.get(i2).longValue();
        }
        return jArr;
    }
}
