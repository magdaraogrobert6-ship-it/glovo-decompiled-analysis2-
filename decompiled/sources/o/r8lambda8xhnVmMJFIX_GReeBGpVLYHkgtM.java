package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM extends getCacheFileSuffixlambda1 {
    public final ArrayDeque MediaBrowserCompatMediaItem;
    public ArrayDeque MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public boolean RatingCompat;
    public static final WebContentUtils IconCompatParcelizer = new WebContentUtils(3);
    public static final WebContentUtils write = new WebContentUtils(4);
    public static final WebContentUtils RemoteActionCompatParcelizer = new WebContentUtils(5);
    public static final WebContentUtils read = new WebContentUtils(6);
    public static final WebContentUtils serializer = new WebContentUtils(7);

    @Override // o.getCacheFileSuffixlambda1
    public final int write() {
        return this.MediaMetadataCompat;
    }

    @Override // o.getCacheFileSuffixlambda1
    public final int IconCompatParcelizer() {
        return serializer(IconCompatParcelizer, 1, null, 0);
    }

    public final void MediaDescriptionCompat() throws IOException {
        boolean z = this.RatingCompat;
        ArrayDeque arrayDeque = this.MediaBrowserCompatMediaItem;
        if (!z) {
            ((getCacheFileSuffixlambda1) arrayDeque.remove()).close();
            return;
        }
        this.MediaDescriptionCompat.add((getCacheFileSuffixlambda1) arrayDeque.remove());
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = (getCacheFileSuffixlambda1) arrayDeque.peek();
        if (getcachefilesuffixlambda1 != null) {
            getcachefilesuffixlambda1.read();
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final boolean RemoteActionCompatParcelizer() {
        Iterator it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            if (!((getCacheFileSuffixlambda1) it.next()).RemoteActionCompatParcelizer()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.getCacheFileSuffixlambda1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.MediaBrowserCompatMediaItem;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((getCacheFileSuffixlambda1) arrayDeque.remove()).close();
            }
        }
        if (this.MediaDescriptionCompat != null) {
            while (!this.MediaDescriptionCompat.isEmpty()) {
                ((getCacheFileSuffixlambda1) this.MediaDescriptionCompat.remove()).close();
            }
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void read() throws IOException {
        ArrayDeque arrayDeque = this.MediaDescriptionCompat;
        ArrayDeque arrayDeque2 = this.MediaBrowserCompatMediaItem;
        if (arrayDeque == null) {
            this.MediaDescriptionCompat = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.MediaDescriptionCompat.isEmpty()) {
            ((getCacheFileSuffixlambda1) this.MediaDescriptionCompat.remove()).close();
        }
        this.RatingCompat = true;
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = (getCacheFileSuffixlambda1) arrayDeque2.peek();
        if (getcachefilesuffixlambda1 != null) {
            getcachefilesuffixlambda1.read();
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final getCacheFileSuffixlambda1 serializer(int i) throws IOException {
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1Serializer;
        int i2;
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1Serializer2;
        if (i <= 0) {
            return BrazeWebViewActivitycreateWebChromeClient1ExternalSyntheticLambda0.read;
        }
        RemoteActionCompatParcelizer(i);
        this.MediaMetadataCompat -= i;
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = null;
        r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm = null;
        while (true) {
            ArrayDeque arrayDeque = this.MediaBrowserCompatMediaItem;
            getCacheFileSuffixlambda1 getcachefilesuffixlambda2 = (getCacheFileSuffixlambda1) arrayDeque.peek();
            int iWrite = getcachefilesuffixlambda2.write();
            if (iWrite > i) {
                getcachefilesuffixlambda1Serializer2 = getcachefilesuffixlambda2.serializer(i);
                i2 = 0;
            } else {
                if (this.RatingCompat) {
                    getcachefilesuffixlambda1Serializer = getcachefilesuffixlambda2.serializer(iWrite);
                    MediaDescriptionCompat();
                } else {
                    getcachefilesuffixlambda1Serializer = (getCacheFileSuffixlambda1) arrayDeque.poll();
                }
                getCacheFileSuffixlambda1 getcachefilesuffixlambda3 = getcachefilesuffixlambda1Serializer;
                i2 = i - iWrite;
                getcachefilesuffixlambda1Serializer2 = getcachefilesuffixlambda3;
            }
            if (getcachefilesuffixlambda1 == null) {
                getcachefilesuffixlambda1 = getcachefilesuffixlambda1Serializer2;
            } else {
                if (r8lambda8xhnvmmjfix_greebgpvlyhkgtm == null) {
                    r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm2 = new r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM(i2 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    r8lambda8xhnvmmjfix_greebgpvlyhkgtm2.read(getcachefilesuffixlambda1);
                    getcachefilesuffixlambda1 = r8lambda8xhnvmmjfix_greebgpvlyhkgtm2;
                    r8lambda8xhnvmmjfix_greebgpvlyhkgtm = getcachefilesuffixlambda1;
                }
                r8lambda8xhnvmmjfix_greebgpvlyhkgtm.read(getcachefilesuffixlambda1Serializer2);
            }
            if (i2 <= 0) {
                return getcachefilesuffixlambda1;
            }
            i = i2;
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void write(int i) {
        serializer(write, i, null, 0);
    }

    public final int IconCompatParcelizer(r8lambdaiqM2EJu3YF9Cgcd4OZ6jr_yHQPU r8lambdaiqm2eju3yf9cgcd4oz6jr_yhqpu, int i, Object obj, int i2) throws IOException {
        RemoteActionCompatParcelizer(i);
        ArrayDeque arrayDeque = this.MediaBrowserCompatMediaItem;
        if (!arrayDeque.isEmpty() && ((getCacheFileSuffixlambda1) arrayDeque.peek()).write() == 0) {
            MediaDescriptionCompat();
        }
        while (i > 0 && !arrayDeque.isEmpty()) {
            getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = (getCacheFileSuffixlambda1) arrayDeque.peek();
            int iMin = Math.min(i, getcachefilesuffixlambda1.write());
            i2 = r8lambdaiqm2eju3yf9cgcd4oz6jr_yhqpu.write(getcachefilesuffixlambda1, iMin, obj, i2);
            i -= iMin;
            this.MediaMetadataCompat -= iMin;
            if (((getCacheFileSuffixlambda1) arrayDeque.peek()).write() == 0) {
                MediaDescriptionCompat();
            }
        }
        if (i <= 0) {
            return i2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Failed executing read operation");
        return 0;
    }

    public final void read(getCacheFileSuffixlambda1 getcachefilesuffixlambda1) throws IOException {
        boolean z = this.RatingCompat;
        ArrayDeque arrayDeque = this.MediaBrowserCompatMediaItem;
        boolean z2 = z && arrayDeque.isEmpty();
        if (getcachefilesuffixlambda1 instanceof r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM) {
            r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM r8lambda8xhnvmmjfix_greebgpvlyhkgtm = (r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM) getcachefilesuffixlambda1;
            ArrayDeque arrayDeque2 = r8lambda8xhnvmmjfix_greebgpvlyhkgtm.MediaBrowserCompatMediaItem;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((getCacheFileSuffixlambda1) arrayDeque2.remove());
            }
            this.MediaMetadataCompat += r8lambda8xhnvmmjfix_greebgpvlyhkgtm.MediaMetadataCompat;
            r8lambda8xhnvmmjfix_greebgpvlyhkgtm.MediaMetadataCompat = 0;
            r8lambda8xhnvmmjfix_greebgpvlyhkgtm.close();
        } else {
            arrayDeque.add(getcachefilesuffixlambda1);
            this.MediaMetadataCompat = getcachefilesuffixlambda1.write() + this.MediaMetadataCompat;
        }
        if (z2) {
            ((getCacheFileSuffixlambda1) arrayDeque.peek()).read();
        }
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void serializer() {
        if (!this.RatingCompat) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.MediaBrowserCompatMediaItem;
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = (getCacheFileSuffixlambda1) arrayDeque.peek();
        if (getcachefilesuffixlambda1 != null) {
            int iWrite = getcachefilesuffixlambda1.write();
            getcachefilesuffixlambda1.serializer();
            this.MediaMetadataCompat = (getcachefilesuffixlambda1.write() - iWrite) + this.MediaMetadataCompat;
        }
        while (true) {
            getCacheFileSuffixlambda1 getcachefilesuffixlambda2 = (getCacheFileSuffixlambda1) this.MediaDescriptionCompat.pollLast();
            if (getcachefilesuffixlambda2 == null) {
                return;
            }
            getcachefilesuffixlambda2.serializer();
            arrayDeque.addFirst(getcachefilesuffixlambda2);
            this.MediaMetadataCompat = getcachefilesuffixlambda2.write() + this.MediaMetadataCompat;
        }
    }

    public r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM() {
        new ArrayDeque(2);
        this.MediaBrowserCompatMediaItem = new ArrayDeque();
    }

    public final int serializer(WebContentUtils webContentUtils, int i, Object obj, int i2) {
        try {
            return IconCompatParcelizer(webContentUtils, i, obj, i2);
        } catch (IOException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return 0;
        }
    }

    public r8lambda8xhnVmMJFIX_GReeBGpVLYHkgtM(int i) {
        new ArrayDeque(2);
        this.MediaBrowserCompatMediaItem = new ArrayDeque(i);
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void read(byte[] bArr, int i, int i2) {
        serializer(RemoteActionCompatParcelizer, i2, bArr, i);
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void serializer(ByteBuffer byteBuffer) {
        serializer(read, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // o.getCacheFileSuffixlambda1
    public final void IconCompatParcelizer(OutputStream outputStream, int i) throws IOException {
        IconCompatParcelizer(serializer, i, outputStream, 0);
    }
}
