package o;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultImageHeaderParserReaderEndOfFileException implements Closeable {
    public final ReentrantLock IconCompatParcelizer = new ReentrantLock();
    public final RandomAccessFile read;
    public int serializer;
    public boolean write;

    public final long RemoteActionCompatParcelizer() {
        long length;
        ReentrantLock reentrantLock = this.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            if (this.write) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.read.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            if (this.write) {
                reentrantLock.unlock();
                return;
            }
            this.write = true;
            if (this.serializer != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.read.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final RegistryNoResultEncoderAvailableException write(long j) {
        ReentrantLock reentrantLock = this.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            if (this.write) {
                throw new IllegalStateException("closed");
            }
            this.serializer++;
            reentrantLock.unlock();
            return new RegistryNoResultEncoderAvailableException(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public DefaultImageHeaderParserReaderEndOfFileException(RandomAccessFile randomAccessFile) {
        this.read = randomAccessFile;
    }
}
