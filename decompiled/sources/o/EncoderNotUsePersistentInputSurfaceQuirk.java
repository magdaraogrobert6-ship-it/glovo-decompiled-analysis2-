package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class EncoderNotUsePersistentInputSurfaceQuirk {
    public final int IconCompatParcelizer;
    public final int MediaSessionCompatQueueItem;
    public final byte[] serializer;
    public static final Charset read = StandardCharsets.US_ASCII;
    public static final String[] RemoteActionCompatParcelizer = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] write = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    public EncoderNotUsePersistentInputSurfaceQuirk(byte[] bArr, int i, int i2) {
        this.IconCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = i2;
        this.serializer = bArr;
    }

    public static EncoderNotUsePersistentInputSurfaceQuirk serializer(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[write[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new EncoderNotUsePersistentInputSurfaceQuirk(byteBufferWrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(RemoteActionCompatParcelizer[this.IconCompatParcelizer]);
        sb.append(", data length:");
        return af$$ExternalSyntheticOutline0.m(this.serializer.length, ")", sb);
    }

    public static EncoderNotUsePersistentInputSurfaceQuirk serializer(long j, ByteOrder byteOrder) {
        return serializer(new long[]{j}, byteOrder);
    }
}
