package o;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class StrokeCap {
    public static final void serializer(HttpUrlFetcher httpUrlFetcher, RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        try {
            IOException iOException = null;
            for (RecyclableBufferedInputStream recyclableBufferedInputStream2 : httpUrlFetcher.RatingCompat(recyclableBufferedInputStream)) {
                try {
                    if (httpUrlFetcher.MediaMetadataCompat(recyclableBufferedInputStream2).read) {
                        serializer(httpUrlFetcher, recyclableBufferedInputStream2);
                    }
                    httpUrlFetcher.IconCompatParcelizer(recyclableBufferedInputStream2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static void IconCompatParcelizer(HttpUrlFetcher httpUrlFetcher, RecyclableBufferedInputStream recyclableBufferedInputStream) {
        if (httpUrlFetcher.MediaBrowserCompatMediaItem(recyclableBufferedInputStream)) {
            return;
        }
        try {
            httpUrlFetcher.write(recyclableBufferedInputStream, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
