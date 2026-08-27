package o;

import io.grpc.Status;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class createUriActionFromUrlStringlambda0 extends FilterInputStream {
    public final r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public long read;
    public final int serializer;
    public long write;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            ((FilterInputStream) this).in.mark(i);
            this.RemoteActionCompatParcelizer = this.read;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        synchronized (this) {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.RemoteActionCompatParcelizer == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.read = this.RemoteActionCompatParcelizer;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.read++;
        }
        serializer();
        write();
        return i;
    }

    public final void serializer() {
        long j = this.read;
        int i = this.serializer;
        if (j <= i) {
            return;
        }
        throw Status.MediaSessionCompatQueueItem.IconCompatParcelizer("Decompressed gRPC message exceeds maximum size " + i).RemoteActionCompatParcelizer();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.read += jSkip;
        serializer();
        write();
        return jSkip;
    }

    public final void write() {
        long j = this.read;
        long j2 = this.write;
        if (j > j2) {
            for (JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 : this.IconCompatParcelizer.write) {
                jsonUtilsExternalSyntheticLambda1.read(j - j2);
            }
            this.write = this.read;
        }
    }

    public createUriActionFromUrlStringlambda0(InputStream inputStream, int i, r8lambdaMwYSInA6epuugeUvjTL8aEpFJN0 r8lambdamwysina6epuugeuvjtl8aepfjn0) {
        super(inputStream);
        this.RemoteActionCompatParcelizer = -1L;
        this.serializer = i;
        this.IconCompatParcelizer = r8lambdamwysina6epuugeuvjtl8aepfjn0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.read += (long) i3;
        }
        serializer();
        write();
        return i3;
    }
}
