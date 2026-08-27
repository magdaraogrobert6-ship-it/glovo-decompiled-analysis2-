package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs implements Closeable {
    protected final r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4 IconCompatParcelizer;
    private final byte[] RemoteActionCompatParcelizer;
    private final long serializer;
    private final long write;

    public final byte MediaMetadataCompat() throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer(bArr, 1);
        return bArr[0];
    }

    public final int MediaSessionCompatToken() throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer(bArr, 4);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        return (bArr[3] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final short PlaybackStateCompatCustomAction() throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer(bArr, 2);
        byte b = bArr[0];
        return (short) ((bArr[1] & 255) | ((b & 255) << 8));
    }

    public final void MediaSessionCompatQueueItem() throws IOException {
        this.IconCompatParcelizer.write();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.IconCompatParcelizer.close();
    }

    public final void write(String str) throws IOException {
        try {
            byte[] bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
            read(bytes.length);
            r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4 r8lambdafix1o_kc7cafksazjxdbyayn9j4 = this.IconCompatParcelizer;
            r8lambdafix1o_kc7cafksazjxdbyayn9j4.getClass();
            r8lambdafix1o_kc7cafksazjxdbyayn9j4.write(bytes, bytes.length);
        } catch (UnsupportedEncodingException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
        }
    }

    public final long IconCompatParcelizer() throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer(bArr, 8);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3];
        long j5 = bArr[4];
        long j6 = bArr[5];
        return (((long) bArr[7]) & 255) | ((((long) bArr[6]) & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16);
    }

    public final void RemoteActionCompatParcelizer(byte[] bArr, int i) throws EOFException {
        int i2 = 0;
        int i3 = i;
        while (i3 > 0) {
            int i4 = this.IconCompatParcelizer.read(bArr, i2, i3);
            if (i4 == -1) {
                throw new EOFException(af$$ExternalSyntheticOutline0.m(i, "Expected ", i2, " bytes; got "));
            }
            i3 -= i4;
            i2 += i4;
        }
    }

    public final r8lambdaSaVhNzq8s6PrBUxqZ34fD7SKtgs read() throws IOException {
        byte bMediaMetadataCompat = MediaMetadataCompat();
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        long j = this.serializer;
        if (j == -1 || iMediaSessionCompatToken <= j) {
            return new r8lambdaSaVhNzq8s6PrBUxqZ34fD7SKtgs(bMediaMetadataCompat, iMediaSessionCompatToken);
        }
        throw new ProtocolException("Container size limit exceeded");
    }

    public final r8lambdaSaVhNzq8s6PrBUxqZ34fD7SKtgs serializer() throws IOException {
        byte bMediaMetadataCompat = MediaMetadataCompat();
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        long j = this.serializer;
        if (j == -1 || iMediaSessionCompatToken <= j) {
            return new r8lambdaSaVhNzq8s6PrBUxqZ34fD7SKtgs(bMediaMetadataCompat, iMediaSessionCompatToken);
        }
        throw new ProtocolException("Container size limit exceeded");
    }

    public final r8lambdaRyq9c2fWEfs8F701EGgjnBMwcCU write() throws IOException {
        byte bMediaMetadataCompat = MediaMetadataCompat();
        byte bMediaMetadataCompat2 = MediaMetadataCompat();
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        long j = this.serializer;
        if (j == -1 || iMediaSessionCompatToken <= j) {
            return new r8lambdaRyq9c2fWEfs8F701EGgjnBMwcCU(bMediaMetadataCompat, bMediaMetadataCompat2, iMediaSessionCompatToken);
        }
        throw new ProtocolException("Container size limit exceeded");
    }

    public r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs(r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4 r8lambdafix1o_kc7cafksazjxdbyayn9j4) {
        if (r8lambdafix1o_kc7cafksazjxdbyayn9j4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("transport");
            throw null;
        }
        this.IconCompatParcelizer = r8lambdafix1o_kc7cafksazjxdbyayn9j4;
        this.RemoteActionCompatParcelizer = new byte[8];
        this.write = 1000000L;
        this.serializer = 5000000L;
    }

    public final String RemoteActionCompatParcelizer() throws IOException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        long j = this.write;
        if (j != -1 && iMediaSessionCompatToken > j) {
            throw new ProtocolException("String size limit exceeded");
        }
        byte[] bArr = new byte[iMediaSessionCompatToken];
        RemoteActionCompatParcelizer(bArr, iMediaSessionCompatToken);
        return new String(bArr, com.adjust.sdk.Constants.ENCODING);
    }

    public final void read(int i) throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.IconCompatParcelizer.write(bArr, 4);
    }

    public final r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0 MediaBrowserCompatMediaItem() throws IOException {
        byte bMediaMetadataCompat = MediaMetadataCompat();
        return new r8lambdaU4N4UUfM_ipqdhmMao_rTI5AEK0(bMediaMetadataCompat, bMediaMetadataCompat == 0 ? (short) 0 : PlaybackStateCompatCustomAction());
    }

    public final void serializer(long j) throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.IconCompatParcelizer.write(bArr, 8);
    }

    public final void RemoteActionCompatParcelizer(byte b) throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        bArr[0] = b;
        this.IconCompatParcelizer.write(bArr, 1);
    }

    public final boolean RatingCompat() throws IOException {
        return MediaMetadataCompat() == 1;
    }

    public final void serializer(byte b, byte b2, int i) throws IOException {
        RemoteActionCompatParcelizer(b);
        RemoteActionCompatParcelizer(b2);
        read(i);
    }

    public final void write(byte b, int i) throws IOException {
        RemoteActionCompatParcelizer(b);
        read(i);
    }

    public final void RemoteActionCompatParcelizer(short s) throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.IconCompatParcelizer.write(bArr, 2);
    }

    public final double MediaDescriptionCompat() throws IOException {
        return Double.longBitsToDouble(IconCompatParcelizer());
    }

    public final void RemoteActionCompatParcelizer(double d) throws IOException {
        serializer(Double.doubleToLongBits(d));
    }

    public final void serializer(int i, byte b) throws IOException {
        RemoteActionCompatParcelizer(b);
        RemoteActionCompatParcelizer((short) i);
    }
}
