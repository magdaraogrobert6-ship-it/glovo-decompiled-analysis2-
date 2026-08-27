package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class getTimestampSeconds extends FilterInputStream {
    public int IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTimestampSeconds(DrawTransformDefaultImpls drawTransformDefaultImpls) {
        super(drawTransformDefaultImpls);
        this.read = 1;
        this.IconCompatParcelizer = Integer.MIN_VALUE;
    }

    public long serializer(long j) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE) {
            long j2 = i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.read;
        if (i == 0) {
            return Math.min(super.available(), this.IconCompatParcelizer);
        }
        if (i != 1) {
            return Math.min(super.available(), this.IconCompatParcelizer);
        }
        int i2 = this.IconCompatParcelizer;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (this.read != 1) {
            super.mark(i);
            return;
        }
        synchronized (this) {
            super.mark(i);
            this.IconCompatParcelizer = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.read;
        int i4 = -1;
        if (i3 == 0) {
            int i5 = this.IconCompatParcelizer;
            if (i5 > 0 && (i4 = super.read(bArr, i, Math.min(i2, i5))) >= 0) {
                this.IconCompatParcelizer -= i4;
            }
            return i4;
        }
        if (i3 != 1) {
            int i6 = this.IconCompatParcelizer;
            if (i6 > 0 && (i4 = super.read(bArr, i, Math.min(i2, i6))) >= 0) {
                this.IconCompatParcelizer -= i4;
            }
            return i4;
        }
        int iSerializer = (int) serializer(i2);
        if (iSerializer == -1) {
            return -1;
        }
        int i7 = super.read(bArr, i, iSerializer);
        read(i7);
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.read != 1) {
            super.reset();
            return;
        }
        synchronized (this) {
            super.reset();
            this.IconCompatParcelizer = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = this.read;
        if (i == 0) {
            int iSkip = (int) super.skip(Math.min(j, this.IconCompatParcelizer));
            if (iSkip >= 0) {
                this.IconCompatParcelizer -= iSkip;
            }
            return iSkip;
        }
        if (i != 1) {
            int iSkip2 = (int) super.skip(Math.min(j, this.IconCompatParcelizer));
            if (iSkip2 >= 0) {
                this.IconCompatParcelizer -= iSkip2;
            }
            return iSkip2;
        }
        long jSerializer = serializer(j);
        if (jSerializer == -1) {
            return 0L;
        }
        long jSkip = super.skip(jSerializer);
        read(jSkip);
        return jSkip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getTimestampSeconds(InputStream inputStream, int i, int i2) {
        super(inputStream);
        this.read = i2;
        this.IconCompatParcelizer = i;
    }

    public void read(long j) {
        int i = this.IconCompatParcelizer;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.IconCompatParcelizer = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.read;
        int i2 = -1;
        if (i == 0) {
            if (this.IconCompatParcelizer > 0 && (i2 = super.read()) >= 0) {
                this.IconCompatParcelizer--;
            }
            return i2;
        }
        if (i != 1) {
            if (this.IconCompatParcelizer > 0 && (i2 = super.read()) >= 0) {
                this.IconCompatParcelizer--;
            }
            return i2;
        }
        if (serializer(1L) == -1) {
            return -1;
        }
        int i3 = super.read();
        read(1L);
        return i3;
    }
}
