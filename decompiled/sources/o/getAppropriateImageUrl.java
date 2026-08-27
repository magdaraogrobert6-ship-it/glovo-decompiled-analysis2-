package o;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final class getAppropriateImageUrl implements Closeable, Flushable {
    public final r8lambdaMkSjJB1nMG37oUW_yupQha4 cache;

    public getAppropriateImageUrl(File file, long j) {
        VideoDecoderVideoDecoderException videoDecoderVideoDecoderException = HttpUrlFetcher.serializer;
        String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        RecyclableBufferedInputStream recyclableBufferedInputStreamRemoteActionCompatParcelizer = Path$Companion.RemoteActionCompatParcelizer(file);
        videoDecoderVideoDecoderException.getClass();
        InAppMessageHtmlFullView inAppMessageHtmlFullView = InAppMessageHtmlFullView.INSTANCE;
        inAppMessageHtmlFullView.getClass();
        this.cache = new r8lambdaMkSjJB1nMG37oUW_yupQha4(videoDecoderVideoDecoderException, recyclableBufferedInputStreamRemoteActionCompatParcelizer, j, inAppMessageHtmlFullView);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.cache.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.cache.flush();
    }

    public final void read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = this.cache;
        String strRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url);
        synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
            strRemoteActionCompatParcelizer.getClass();
            r8lambdamksjjb1nmg37ouw_yupqha4.RemoteActionCompatParcelizer();
            r8lambdamksjjb1nmg37ouw_yupqha4.IconCompatParcelizer();
            r8lambdaMkSjJB1nMG37oUW_yupQha4.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer);
            r8lambdamrRUyRDhX_6xLfo9jIAfF753450 r8lambdamrruyrdhx_6xlfo9jiaff753450 = (r8lambdamrRUyRDhX_6xLfo9jIAfF753450) r8lambdamksjjb1nmg37ouw_yupqha4.lruEntries.get(strRemoteActionCompatParcelizer);
            if (r8lambdamrruyrdhx_6xlfo9jiaff753450 == null) {
                return;
            }
            r8lambdamksjjb1nmg37ouw_yupqha4.IconCompatParcelizer(r8lambdamrruyrdhx_6xlfo9jiaff753450);
            if (r8lambdamksjjb1nmg37ouw_yupqha4.size <= r8lambdamksjjb1nmg37ouw_yupqha4.maxSize) {
                r8lambdamksjjb1nmg37ouw_yupqha4.mostRecentTrimFailed = false;
            }
        }
    }
}
