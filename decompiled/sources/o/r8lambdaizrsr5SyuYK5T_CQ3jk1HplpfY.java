package o;

import android.annotation.SuppressLint;
import android.location.Location;
import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY {
    public static float[][] IconCompatParcelizer(r8lambdacuje9GyuH58gaBWrAD8wwaDT7DA r8lambdacuje9gyuh58gabwrad8wwadt7da, int i, int i2, long j, long j2) {
        boolean zRatingCompat = r8lambdacuje9gyuh58gabwrad8wwadt7da.RatingCompat();
        Class cls = Float.TYPE;
        if (!zRatingCompat && i2 >= 0) {
            int iMin = i - Math.min(Math.min(i, i2), r8lambdacuje9gyuh58gabwrad8wwadt7da.write());
            long[] jArrMediaMetadataCompat = r8lambdacuje9gyuh58gabwrad8wwadt7da.MediaMetadataCompat();
            float[][] fArrRemoteActionCompatParcelizer = r8lambdacuje9gyuh58gabwrad8wwadt7da.RemoteActionCompatParcelizer();
            float[] fArr = fArrRemoteActionCompatParcelizer[0];
            float[] fArr2 = fArrRemoteActionCompatParcelizer[1];
            float[] fArr3 = fArrRemoteActionCompatParcelizer[2];
            float[] fArrIconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(jArrMediaMetadataCompat, j, j2 - j);
            float f = fArrIconCompatParcelizer[0];
            float f2 = fArr[0];
            float f3 = fArr2[0];
            float f4 = fArr3[0];
            float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, i, 4);
            for (int i3 = 0; i3 < i; i3++) {
                if (i3 < iMin) {
                    float[] fArr5 = fArr4[i3];
                    fArr5[0] = f;
                    fArr5[1] = f2;
                    fArr5[2] = f3;
                    fArr5[3] = f4;
                } else {
                    int i4 = i3 - iMin;
                    float[] fArr6 = fArr4[i3];
                    fArr6[0] = fArrIconCompatParcelizer[i4];
                    fArr6[1] = fArr[i4];
                    fArr6[2] = fArr2[i4];
                    fArr6[3] = fArr3[i4];
                }
            }
            return fArr4;
        }
        return (float[][]) Array.newInstance((Class<?>) cls, i, 4);
    }

    public static float[] IconCompatParcelizer(long j, long j2, Location location) {
        if (location == null) {
            return new float[5];
        }
        return new float[]{r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(new long[]{location.getTime()}, j, j2 - j)[0], (float) location.getLatitude(), (float) location.getLongitude(), location.hasSpeed() ? location.getSpeed() : -1.0f, location.getAccuracy()};
    }

    @SuppressLint
    public static float[][] RemoteActionCompatParcelizer(int i, List<Location> list, r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0 r8lambdaaig5zvykrh73tepxo0st1uppjw0) {
        long jIconCompatParcelizer = r8lambdaaig5zvykrh73tepxo0st1uppjw0.IconCompatParcelizer();
        long jSerializer = r8lambdaaig5zvykrh73tepxo0st1uppjw0.serializer();
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, 5);
        if (!list.isEmpty()) {
            if (list.size() > i) {
                list = list.subList(list.size() - i, list.size());
            }
            float[] fArrIconCompatParcelizer = IconCompatParcelizer(jIconCompatParcelizer, jSerializer, list.get(0));
            int size = i - list.size();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < size) {
                    fArr[i2] = fArrIconCompatParcelizer;
                } else {
                    fArr[i2] = IconCompatParcelizer(jIconCompatParcelizer, jSerializer, list.get(i2 - size));
                }
            }
        }
        return fArr;
    }
}
