package o;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLayoutNodeLayoutDelegatep {
    public static final String IconCompatParcelizer = accessgetOuterCoordinator.RemoteActionCompatParcelizer(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong serializer = new AtomicLong(0);
    public final String RemoteActionCompatParcelizer;

    public static byte[] RemoteActionCompatParcelizer(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    public accessgetLayoutNodeLayoutDelegatep() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(time % 1000);
        byte b5 = bArrRemoteActionCompatParcelizer[0];
        byte b6 = bArrRemoteActionCompatParcelizer[1];
        byte[] bArrRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(serializer.incrementAndGet());
        byte b7 = bArrRemoteActionCompatParcelizer2[0];
        byte b8 = bArrRemoteActionCompatParcelizer2[1];
        byte[] bArrRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(Integer.valueOf(Process.myPid()).shortValue());
        String strIconCompatParcelizer = accessgetOuterCoordinator.IconCompatParcelizer(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrRemoteActionCompatParcelizer3[0], bArrRemoteActionCompatParcelizer3[1]});
        java.util.Locale locale = java.util.Locale.US;
        this.RemoteActionCompatParcelizer = String.format(locale, "%s%s%s%s", strIconCompatParcelizer.substring(0, 12), strIconCompatParcelizer.substring(12, 16), strIconCompatParcelizer.subSequence(16, 20), IconCompatParcelizer.substring(0, 12)).toUpperCase(locale);
    }
}
