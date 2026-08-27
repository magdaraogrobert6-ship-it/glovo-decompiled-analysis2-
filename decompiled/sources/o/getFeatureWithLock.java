package o;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getFeatureWithLock {
    public static final byte[][] read = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, androidx.compose.ui.graphics.Fields.RotationX, androidx.compose.ui.graphics.Fields.RotationX);
    public static final byte[] IconCompatParcelizer = new byte[androidx.compose.ui.graphics.Fields.RotationX];

    public static long RemoteActionCompatParcelizer(long j) {
        long j2 = j ^ ((j & (-6148914691236517206L)) >>> 1);
        long j3 = (-8608480567731124088L) & j2;
        long j4 = j2 ^ (((j3 >>> 1) ^ (((4919131752989213764L & j2) << 1) ^ j3)) >>> 2);
        long j5 = (-4557430888798830400L) & j4;
        long j6 = j5 >>> 2;
        long j7 = (j5 ^ ((3472328296227680304L & j4) << 2)) ^ j6;
        long j8 = (-6148914691236517206L) & j7;
        return j4 ^ ((((j8 ^ ((j7 & 6148914691236517205L) << 1)) ^ (j8 >>> 1)) ^ j6) >>> 4);
    }

    public static long write(long j, long j2) {
        long j3 = j & j2;
        long j4 = ((j3 & (-6148914691236517206L)) >>> 1) ^ (((((j << 1) & j2) ^ ((j2 << 1) & j)) & (-6148914691236517206L)) ^ j3);
        long j5 = 3689348814741910323L & j4;
        long j6 = ((j ^ (j << 2)) & (-3689348814741910324L)) ^ ((j4 & (-3689348814741910324L)) >>> 2);
        long j7 = ((j2 ^ (j2 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L;
        long j8 = j6 & j7;
        return ((((((j6 & (j7 << 1)) ^ ((j6 << 1) & j7)) & (-6148914691236517206L)) ^ j8) ^ ((j8 & (-6148914691236517206L)) >>> 1)) ^ (j5 << 2)) ^ j5;
    }

    static {
        int i;
        long j;
        int i2 = 1;
        long j2 = 72340172838076673L;
        while (true) {
            i = 0;
            j = 506097522914230528L;
            if (i2 > 255) {
                break;
            }
            while (i < 256) {
                createCache.read(i, read(j2, j), read[i2]);
                j += 578721382704613384L;
                i += 8;
            }
            j2 += 72340172838076673L;
            i2++;
        }
        while (i < 256) {
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j);
            long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer);
            long j3 = read(read(jRemoteActionCompatParcelizer2, jRemoteActionCompatParcelizer), RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer2));
            createCache.read(i, read(jRemoteActionCompatParcelizer, RemoteActionCompatParcelizer(read(RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(j3))), j3))), IconCompatParcelizer);
            j += 578721382704613384L;
            i += 8;
        }
    }

    public static long read(long j, long j2) {
        long jWrite = write(j, j2);
        long j3 = 1085102592571150095L & jWrite;
        return (write(((j ^ (j << 4)) & (-1085102592571150096L)) ^ ((jWrite & (-1085102592571150096L)) >>> 4), ((j2 ^ (j2 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j3 << 4)) ^ j3;
    }
}
