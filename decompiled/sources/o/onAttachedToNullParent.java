package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class onAttachedToNullParent implements Closeable {
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(onAttachedToNullParent.class.getName());
    public int IconCompatParcelizer;
    public onNodeDetached MediaDescriptionCompat;
    public final RandomAccessFile RatingCompat;
    public onNodeDetached RemoteActionCompatParcelizer;
    public final byte[] serializer;
    public int write;

    public final void IconCompatParcelizer(byte[] bArr) {
        int iWrite;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    IconCompatParcelizer(length);
                    boolean z = read();
                    if (z) {
                        iWrite = 16;
                    } else {
                        onNodeDetached onnodedetached = this.MediaDescriptionCompat;
                        iWrite = write(onnodedetached.IconCompatParcelizer + 4 + onnodedetached.serializer);
                    }
                    onNodeDetached onnodedetached2 = new onNodeDetached(iWrite, length);
                    write(this.serializer, 0, length);
                    serializer(this.serializer, iWrite, 4);
                    serializer(bArr, iWrite + 4, length);
                    IconCompatParcelizer(this.write, this.IconCompatParcelizer + 1, z ? iWrite : this.RemoteActionCompatParcelizer.IconCompatParcelizer, iWrite);
                    this.MediaDescriptionCompat = onnodedetached2;
                    this.IconCompatParcelizer++;
                    if (z) {
                        this.RemoteActionCompatParcelizer = onnodedetached2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.RatingCompat.close();
        }
    }

    public final void read(onApproachPlacementui onapproachplacementui) {
        synchronized (this) {
            int iWrite = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
            for (int i = 0; i < this.IconCompatParcelizer; i++) {
                onNodeDetached onnodedetached = read(iWrite);
                onapproachplacementui.RemoteActionCompatParcelizer(new notifyChildrenUsingLookaheadCoordinatesWhilePlacing(this, onnodedetached), onnodedetached.serializer);
                iWrite = write(onnodedetached.IconCompatParcelizer + 4 + onnodedetached.serializer);
            }
        }
    }

    public final boolean read() {
        boolean z;
        synchronized (this) {
            z = this.IconCompatParcelizer == 0;
        }
        return z;
    }

    public final void serializer() {
        synchronized (this) {
            if (read()) {
                throw new NoSuchElementException();
            }
            if (this.IconCompatParcelizer == 1) {
                synchronized (this) {
                    IconCompatParcelizer(androidx.compose.ui.graphics.Fields.TransformOrigin, 0, 0, 0);
                    this.IconCompatParcelizer = 0;
                    onNodeDetached onnodedetached = onNodeDetached.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer = onnodedetached;
                    this.MediaDescriptionCompat = onnodedetached;
                    if (this.write > 4096) {
                        RandomAccessFile randomAccessFile = this.RatingCompat;
                        randomAccessFile.setLength(4096L);
                        randomAccessFile.getChannel().force(true);
                    }
                    this.write = androidx.compose.ui.graphics.Fields.TransformOrigin;
                }
            } else {
                onNodeDetached onnodedetached2 = this.RemoteActionCompatParcelizer;
                int iWrite = write(onnodedetached2.IconCompatParcelizer + 4 + onnodedetached2.serializer);
                RemoteActionCompatParcelizer(this.serializer, iWrite, 0, 4);
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, this.serializer);
                IconCompatParcelizer(this.write, this.IconCompatParcelizer - 1, iWrite, this.MediaDescriptionCompat.IconCompatParcelizer);
                this.IconCompatParcelizer--;
                this.RemoteActionCompatParcelizer = new onNodeDetached(iWrite, iRemoteActionCompatParcelizer);
            }
        }
    }

    public final int write(int i) {
        int i2 = this.write;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        int i2 = i + 4;
        int iWrite = this.write - write();
        if (iWrite >= i2) {
            return;
        }
        int i3 = this.write;
        do {
            iWrite += i3;
            i3 <<= 1;
        } while (iWrite < i2);
        RandomAccessFile randomAccessFile = this.RatingCompat;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        onNodeDetached onnodedetached = this.MediaDescriptionCompat;
        int iWrite2 = write(onnodedetached.IconCompatParcelizer + 4 + onnodedetached.serializer);
        if (iWrite2 < this.RemoteActionCompatParcelizer.IconCompatParcelizer) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.write);
            long j = iWrite2 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.MediaDescriptionCompat.IconCompatParcelizer;
        int i5 = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        if (i4 < i5) {
            int i6 = (this.write + i4) - 16;
            IconCompatParcelizer(i3, this.IconCompatParcelizer, i5, i6);
            this.MediaDescriptionCompat = new onNodeDetached(i6, this.MediaDescriptionCompat.serializer);
        } else {
            IconCompatParcelizer(i3, this.IconCompatParcelizer, i5, i4);
        }
        this.write = i3;
    }

    public final onNodeDetached read(int i) throws IOException {
        if (i == 0) {
            return onNodeDetached.RemoteActionCompatParcelizer;
        }
        RandomAccessFile randomAccessFile = this.RatingCompat;
        randomAccessFile.seek(i);
        return new onNodeDetached(i, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("QueueFile[fileLength=");
        sbM.append(this.write);
        sbM.append(", size=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", first=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", last=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(", element lengths=[");
        try {
            read(new ContentCardsFragmentCompanion(sbM));
        } catch (IOException e) {
            read.log(Level.WARNING, "read error", (Throwable) e);
        }
        sbM.append("]]");
        return sbM.toString();
    }

    public static void write(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public onAttachedToNullParent(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.serializer = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {androidx.compose.ui.graphics.Fields.TransformOrigin, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    write(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.RatingCompat = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, bArr);
        this.write = iRemoteActionCompatParcelizer;
        if (iRemoteActionCompatParcelizer <= randomAccessFile2.length()) {
            this.IconCompatParcelizer = RemoteActionCompatParcelizer(4, bArr);
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(8, bArr);
            int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(12, bArr);
            this.RemoteActionCompatParcelizer = read(iRemoteActionCompatParcelizer2);
            this.MediaDescriptionCompat = read(iRemoteActionCompatParcelizer3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.write + ", Actual length: " + randomAccessFile2.length());
    }

    public final void IconCompatParcelizer(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.serializer;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.RatingCompat;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                write(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, int i3) throws IOException {
        int iWrite = write(i);
        int i4 = this.write;
        RandomAccessFile randomAccessFile = this.RatingCompat;
        if (iWrite + i3 <= i4) {
            randomAccessFile.seek(iWrite);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i5 = i4 - iWrite;
        randomAccessFile.seek(iWrite);
        randomAccessFile.readFully(bArr, i2, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i5, i3 - i5);
    }

    public final void serializer(byte[] bArr, int i, int i2) throws IOException {
        int iWrite = write(i);
        int i3 = this.write;
        RandomAccessFile randomAccessFile = this.RatingCompat;
        if (iWrite + i2 <= i3) {
            randomAccessFile.seek(iWrite);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i4 = i3 - iWrite;
        randomAccessFile.seek(iWrite);
        randomAccessFile.write(bArr, 0, i4);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i4, i2 - i4);
    }

    public final int write() {
        if (this.IconCompatParcelizer == 0) {
            return 16;
        }
        onNodeDetached onnodedetached = this.MediaDescriptionCompat;
        int i = onnodedetached.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        if (i >= i2) {
            return (i - i2) + 4 + onnodedetached.serializer + 16;
        }
        return (((i + 4) + onnodedetached.serializer) + this.write) - i2;
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }
}
