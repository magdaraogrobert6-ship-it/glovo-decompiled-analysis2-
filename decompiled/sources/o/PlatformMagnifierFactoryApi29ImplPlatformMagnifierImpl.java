package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformMagnifierFactoryApi29ImplPlatformMagnifierImpl {
    public static final float[] serializer;

    static {
        long[] jArr = detectDragGestures.write;
        int iWrite = detectDragGestures.write(0);
        int iMax = iWrite > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(iWrite)) : 0;
        if (iMax != 0) {
            int i = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[iMax];
        serializer = new float[0];
    }
}
