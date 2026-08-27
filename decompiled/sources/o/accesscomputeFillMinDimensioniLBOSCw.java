package o;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class accesscomputeFillMinDimensioniLBOSCw extends OutputStream {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public long read;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        int length2;
        int i4;
        int length3;
        int i5;
        int i6 = this.RemoteActionCompatParcelizer;
        if (i6 == 0) {
            if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            }
            this.read += (long) i2;
            return;
        }
        if (i6 != 1) {
            if (i < 0 || i > (length3 = bArr.length) || i2 < 0 || (i5 = i + i2) > length3 || i5 < 0) {
                throw new IndexOutOfBoundsException();
            }
            this.read += (long) i2;
            return;
        }
        if (i < 0 || i > (length2 = bArr.length) || i2 < 0 || (i4 = i + i2) > length2 || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.read += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            this.read += (long) bArr.length;
        } else if (i != 1) {
            this.read += (long) bArr.length;
        } else {
            this.read += (long) bArr.length;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            this.read++;
        } else if (i2 != 1) {
            this.read++;
        } else {
            this.read++;
        }
    }
}
