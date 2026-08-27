package o;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class SeekableTransitionState {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static accessregisterComponentCallback RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            accessregisterComponentCallback accessregistercomponentcallback = androidx.lifecycle.ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat;
            throw null;
        }
        accessregisterComponentCallback accessregistercomponentcallback2 = androidx.lifecycle.ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat;
        int i3 = IconCompatParcelizer + 115;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return accessregistercomponentcallback2;
    }

    public static String RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 67;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (byteBuffer != null) {
            int iPosition = byteBuffer.position();
            try {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < iRemaining; i5++) {
                    sb.append(String.format("%02X ", Byte.valueOf(bArr[i5])));
                }
                return sb.toString().trim();
            } finally {
                byteBuffer.position(iPosition);
            }
        }
        int i6 = i2 + 57;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 70 / 0;
        }
        return "null";
    }

    public static String RemoteActionCompatParcelizer(long j) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = timeUnit.toMillis(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = ((j2 - millis2) - timeUnit2.toMillis(millis)) / 1000;
        long millis4 = timeUnit.toMillis(j3);
        long millis5 = timeUnit2.toMillis(millis);
        String str = String.format(java.util.Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j2 - millis4) - millis5) - TimeUnit.SECONDS.toMillis(millis3)));
        int i4 = write + 71;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }
}
