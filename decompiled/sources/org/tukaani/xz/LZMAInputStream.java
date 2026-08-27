package org.tukaani.xz;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import o.DrawableTransformation;
import o.FwFClientExtensionKt;
import o.getFeaturesExpirationTimefwf_client_release;
import o.getVariations;
import o.setUseEvaluationsCachefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class LZMAInputStream extends InputStream {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public setUseEvaluationsCachefwf_client_release MediaBrowserCompatMediaItem;
    public final FwFClientExtensionKt MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public final getVariations MediaSessionCompatQueueItem;
    public final getFeaturesExpirationTimefwf_client_release RemoteActionCompatParcelizer;
    public InputStream read;
    public boolean write = false;
    public boolean RatingCompat = false;
    public final byte[] PlaybackStateCompatCustomAction = new byte[1];
    public IOException serializer = null;

    public LZMAInputStream(InputStream inputStream, long j, byte b, int i) throws UnsupportedOptionsException, CorruptedInputException {
        getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release = getFeaturesExpirationTimefwf_client_release.write;
        if (j < -1) {
            throw new UnsupportedOptionsException("Uncompressed size is too big");
        }
        int i2 = b & 255;
        if (i2 > 224) {
            throw new CorruptedInputException("Invalid LZMA properties byte");
        }
        int i3 = i2 / 45;
        int i4 = i2 - (i3 * 45);
        int i5 = i4 / 9;
        int i6 = i4 - (i5 * 9);
        if (i < 0 || i > 2147483632) {
            throw new UnsupportedOptionsException("LZMA dictionary is too big for this implementation");
        }
        if (j < -1 || i6 < 0 || i6 > 8 || i5 < 0 || i5 > 4 || i3 < 0 || i3 > 4) {
            DrawableTransformation.write();
            throw null;
        }
        this.read = inputStream;
        this.RemoteActionCompatParcelizer = getfeaturesexpirationtimefwf_client_release;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        if (j >= 0 && iRemoteActionCompatParcelizer > j) {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((int) j);
        }
        this.MediaBrowserCompatMediaItem = new setUseEvaluationsCachefwf_client_release(RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer), getfeaturesexpirationtimefwf_client_release);
        getVariations getvariations = new getVariations(inputStream);
        this.MediaSessionCompatQueueItem = getvariations;
        this.MediaDescriptionCompat = new FwFClientExtensionKt(this.MediaBrowserCompatMediaItem, getvariations, i6, i5, i3);
        this.MediaMetadataCompat = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.read != null) {
            setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release = this.MediaBrowserCompatMediaItem;
            if (setuseevaluationscachefwf_client_release != null) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(setuseevaluationscachefwf_client_release.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatMediaItem = null;
            }
            try {
                this.read.close();
            } finally {
                this.read = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
    
        if (r3.write == 0) goto L72;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.LZMAInputStream.read(byte[], int, int):int");
    }

    public static int RemoteActionCompatParcelizer(int i) {
        if (i < 0 || i > 2147483632) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("LZMA dictionary is too big for this implementation");
            return 0;
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & (-16);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.PlaybackStateCompatCustomAction;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
