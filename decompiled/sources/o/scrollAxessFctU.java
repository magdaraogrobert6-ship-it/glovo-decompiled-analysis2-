package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class scrollAxessFctU extends FilterInputStream {
    private final long IconCompatParcelizer;
    private int read;
    private long serializer;

    public scrollAxessFctU(InputStream inputStream, long j, long j2) {
        super(inputStream);
        this.serializer = 0L;
        this.read = 0;
        this.IconCompatParcelizer = (j2 << 1) | 1;
        RemoteActionCompatParcelizer();
        this.serializer += j;
        RemoteActionCompatParcelizer();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int iRemoteActionCompatParcelizer = this.in.read();
        if (iRemoteActionCompatParcelizer == -1) {
            return -1;
        }
        if (this.read == 0) {
            iRemoteActionCompatParcelizer = (byte) (((byte) iRemoteActionCompatParcelizer) ^ ((byte) (RemoteActionCompatParcelizer() & 255)));
        }
        int i = this.read + 1;
        this.read = i;
        if (i == 8) {
            this.read = 0;
        }
        return iRemoteActionCompatParcelizer & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 <= this.read + 8) {
            int i4 = 0;
            while (i3 < i2) {
                int i5 = read();
                if (i5 == -1 && i4 == 0) {
                    return -1;
                }
                if (i5 == -1) {
                    return i4;
                }
                i4++;
                bArr[i + i3] = (byte) i5;
                i3++;
            }
            return i4;
        }
        int i6 = i2;
        int i7 = 0;
        while (this.read > 0) {
            byte b = (byte) read();
            if (b == -1 && i7 == 0) {
                return -1;
            }
            if (b == -1) {
                return i7;
            }
            i7++;
            bArr[i] = b;
            i++;
            i6--;
        }
        int i8 = i6 / 8;
        byte[] bArr2 = new byte[8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.in.read(bArr2, 0, 8);
            if (i10 == -1 && i7 == 0) {
                return -1;
            }
            if (i10 == -1) {
                return i7;
            }
            i7 += i10;
            bArr2[0] = (byte) (((byte) (RemoteActionCompatParcelizer() & 255)) ^ bArr2[0]);
            System.arraycopy(bArr2, 0, bArr, i, i10);
            i += i10;
            if (i10 < 8) {
                return i7;
            }
        }
        int i11 = i6 - (i8 * 8);
        while (i3 < i11) {
            int i12 = read();
            if (i12 == -1) {
                return i7;
            }
            i7++;
            bArr[i] = (byte) i12;
            i++;
            i3++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        for (long j2 = 0; j2 < j; j2++) {
            read();
        }
        return j;
    }

    private int RemoteActionCompatParcelizer() {
        long j = this.serializer;
        this.serializer = (6364136223846793005L * j) + this.IconCompatParcelizer;
        int i = (int) (((j >>> 18) ^ j) >>> 27);
        int i2 = (int) (j >>> 59);
        return (i << ((-i2) & 31)) | (i >>> i2);
    }
}
