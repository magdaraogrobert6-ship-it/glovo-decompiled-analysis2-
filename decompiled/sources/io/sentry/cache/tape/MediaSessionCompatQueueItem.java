package io.sentry.cache.tape;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem implements Closeable, Iterable {
    public static final byte[] read = new byte[Fields.TransformOrigin];
    public int IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public MediaBrowserCompatMediaItem MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public RandomAccessFile MediaSessionCompatResultReceiverWrapper;
    public MediaBrowserCompatMediaItem RatingCompat;
    public final File serializer;
    public boolean write;
    public final byte[] RemoteActionCompatParcelizer = new byte[32];
    public int MediaSessionCompatQueueItem = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write = true;
        this.MediaSessionCompatResultReceiverWrapper.close();
    }

    public final long write(long j) {
        long j2 = this.MediaBrowserCompatMediaItem;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final boolean write(int i, long j, byte[] bArr) throws IOException {
        try {
            long jWrite = write(j);
            long j2 = i;
            long j3 = this.MediaBrowserCompatMediaItem;
            RandomAccessFile randomAccessFile = this.MediaSessionCompatResultReceiverWrapper;
            if (j2 + jWrite <= j3) {
                randomAccessFile.seek(jWrite);
                this.MediaSessionCompatResultReceiverWrapper.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jWrite);
            randomAccessFile.seek(jWrite);
            this.MediaSessionCompatResultReceiverWrapper.readFully(bArr, 0, i2);
            this.MediaSessionCompatResultReceiverWrapper.seek(32L);
            this.MediaSessionCompatResultReceiverWrapper.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            IconCompatParcelizer();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            IconCompatParcelizer();
            return false;
        }
    }

    public final void IconCompatParcelizer() {
        this.MediaSessionCompatResultReceiverWrapper.close();
        File file = this.serializer;
        file.delete();
        this.MediaSessionCompatResultReceiverWrapper = write(file);
        serializer();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new MediaMetadataCompat(this);
    }

    public static void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void serializer() throws IOException {
        this.MediaSessionCompatResultReceiverWrapper.seek(0L);
        RandomAccessFile randomAccessFile = this.MediaSessionCompatResultReceiverWrapper;
        byte[] bArr = this.RemoteActionCompatParcelizer;
        randomAccessFile.readFully(bArr);
        this.MediaBrowserCompatMediaItem = write(4, bArr);
        this.IconCompatParcelizer = serializer(12, bArr);
        long jWrite = write(16, bArr);
        long jWrite2 = write(24, bArr);
        long j = this.MediaBrowserCompatMediaItem;
        long length = this.MediaSessionCompatResultReceiverWrapper.length();
        long j2 = this.MediaBrowserCompatMediaItem;
        if (j > length) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j2, "File is truncated. Expected length: ", ", Actual length: ");
            sbM.append(this.MediaSessionCompatResultReceiverWrapper.length());
            throw new IOException(sbM.toString());
        }
        if (j2 > 32) {
            this.RatingCompat = RemoteActionCompatParcelizer(jWrite);
            this.MediaDescriptionCompat = RemoteActionCompatParcelizer(jWrite2);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
    }

    public final void serializer(int i, long j, long j2, long j3) throws IOException {
        this.MediaSessionCompatResultReceiverWrapper.seek(0L);
        byte[] bArr = this.RemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer(bArr, 0, -2147483647);
        RemoteActionCompatParcelizer(4, j, bArr);
        RemoteActionCompatParcelizer(bArr, 12, i);
        RemoteActionCompatParcelizer(16, j2, bArr);
        RemoteActionCompatParcelizer(24, j3, bArr);
        this.MediaSessionCompatResultReceiverWrapper.write(bArr, 0, 32);
    }

    public final String toString() {
        return "QueueFile{file=" + this.serializer + ", zero=true, length=" + this.MediaBrowserCompatMediaItem + ", size=" + this.IconCompatParcelizer + ", first=" + this.RatingCompat + ", last=" + this.MediaDescriptionCompat + '}';
    }

    public MediaSessionCompatQueueItem(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
        this.serializer = file;
        this.MediaSessionCompatResultReceiverWrapper = randomAccessFile;
        this.MediaMetadataCompat = i;
        serializer();
    }

    public static void RemoteActionCompatParcelizer(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public final void IconCompatParcelizer(int i, long j, byte[] bArr) throws IOException {
        long jWrite = write(j);
        long j2 = this.MediaBrowserCompatMediaItem;
        RandomAccessFile randomAccessFile = this.MediaSessionCompatResultReceiverWrapper;
        if (((long) i) + jWrite <= j2) {
            randomAccessFile.seek(jWrite);
            this.MediaSessionCompatResultReceiverWrapper.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j2 - jWrite);
        randomAccessFile.seek(jWrite);
        this.MediaSessionCompatResultReceiverWrapper.write(bArr, 0, i2);
        this.MediaSessionCompatResultReceiverWrapper.seek(32L);
        this.MediaSessionCompatResultReceiverWrapper.write(bArr, i2, i - i2);
    }

    public static RandomAccessFile write(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Rename failed!");
                    return null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    public static int serializer(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final MediaBrowserCompatMediaItem RemoteActionCompatParcelizer(long j) {
        if (j != 0) {
            byte[] bArr = this.RemoteActionCompatParcelizer;
            if (write(4, j, bArr)) {
                return new MediaBrowserCompatMediaItem(j, serializer(0, bArr));
            }
        }
        return MediaBrowserCompatMediaItem.read;
    }

    public final void RemoteActionCompatParcelizer(int i) throws IOException {
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Cannot remove negative (", ") number of elements."));
            return;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.IconCompatParcelizer;
        if (i == i2) {
            write();
            return;
        }
        if (i2 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return;
        }
        if (i <= i2) {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.RatingCompat;
            long j = mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            int iSerializer = mediaBrowserCompatMediaItem.write;
            long jWrite = j;
            long j2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                j2 += (long) (iSerializer + 4);
                jWrite = write(jWrite + 4 + ((long) iSerializer));
                byte[] bArr = this.RemoteActionCompatParcelizer;
                if (!write(4, jWrite, bArr)) {
                    return;
                }
                iSerializer = serializer(0, bArr);
            }
            serializer(this.IconCompatParcelizer - i, this.MediaBrowserCompatMediaItem, jWrite, this.MediaDescriptionCompat.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer -= i;
            this.MediaSessionCompatQueueItem++;
            this.RatingCompat = new MediaBrowserCompatMediaItem(jWrite, iSerializer);
            long j3 = j2;
            while (j3 > 0) {
                int iMin = (int) Math.min(j3, 4096L);
                IconCompatParcelizer(iMin, j, read);
                long j4 = iMin;
                j3 -= j4;
                j += j4;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ").", ff$$ExternalSyntheticOutline0.m(i, "Cannot remove more elements (", ") than present in queue (")));
    }

    public static long write(int i, byte[] bArr) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public final void write() throws IOException {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        serializer(0, 4096L, 0L, 0L);
        this.MediaSessionCompatResultReceiverWrapper.seek(32L);
        this.MediaSessionCompatResultReceiverWrapper.write(read, 0, 4064);
        this.IconCompatParcelizer = 0;
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.read;
        this.RatingCompat = mediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = mediaBrowserCompatMediaItem;
        if (this.MediaBrowserCompatMediaItem > 4096) {
            this.MediaSessionCompatResultReceiverWrapper.setLength(4096L);
            this.MediaSessionCompatResultReceiverWrapper.getChannel().force(true);
        }
        this.MediaBrowserCompatMediaItem = 4096L;
        this.MediaSessionCompatQueueItem++;
    }
}
