package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VideoDecoderVideoDecoderException extends HttpUrlFetcher {
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // o.HttpUrlFetcher
    public final void IconCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileSerializer = recyclableBufferedInputStream.serializer();
        if (fileSerializer.delete() || !fileSerializer.exists()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(recyclableBufferedInputStream, "failed to delete ");
    }

    @Override // o.HttpUrlFetcher
    public ThumbFetcher MediaDescriptionCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        File fileSerializer = recyclableBufferedInputStream.serializer();
        boolean zIsFile = fileSerializer.isFile();
        boolean zIsDirectory = fileSerializer.isDirectory();
        long jLastModified = fileSerializer.lastModified();
        long length = fileSerializer.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileSerializer.exists()) {
            return new ThumbFetcher(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // o.HttpUrlFetcher
    public final ItemSingleChoiceBinding MediaSessionCompatToken(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        File fileSerializer = recyclableBufferedInputStream.serializer();
        return new CallbackException(getActiveFocusTargetNode.write(fileSerializer, new FileInputStream(fileSerializer)), ApiErrorResponseCompanion.PlaybackStateCompat);
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter read(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        File fileSerializer = recyclableBufferedInputStream.serializer();
        return new RecyclableBufferedInputStreamInvalidMarkException(getPositionInRoot.IconCompatParcelizer(fileSerializer, new FileOutputStream(fileSerializer, true), true), 0, new ApiErrorResponseCompanion());
    }

    @Override // o.HttpUrlFetcher
    public final void serializer(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        if (recyclableBufferedInputStream.serializer().mkdir()) {
            return;
        }
        ThumbFetcher thumbFetcherMediaDescriptionCompat = MediaDescriptionCompat(recyclableBufferedInputStream);
        if (thumbFetcherMediaDescriptionCompat == null || !thumbFetcherMediaDescriptionCompat.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(recyclableBufferedInputStream, "failed to create directory: ");
        }
    }

    @Override // o.HttpUrlFetcher
    public void write(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2) throws IOException {
        recyclableBufferedInputStream.getClass();
        recyclableBufferedInputStream2.getClass();
        if (recyclableBufferedInputStream.serializer().renameTo(recyclableBufferedInputStream2.serializer())) {
            return;
        }
        throw new IOException("failed to move " + recyclableBufferedInputStream + " to " + recyclableBufferedInputStream2);
    }

    @Override // o.HttpUrlFetcher
    public final DefaultImageHeaderParserReaderEndOfFileException MediaSessionCompatQueueItem(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        return new DefaultImageHeaderParserReaderEndOfFileException(new RandomAccessFile(recyclableBufferedInputStream.serializer(), "r"));
    }

    @Override // o.HttpUrlFetcher
    public final List RatingCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        File fileSerializer = recyclableBufferedInputStream.serializer();
        String[] list = fileSerializer.list();
        if (list == null) {
            if (fileSerializer.exists()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(recyclableBufferedInputStream, "failed to list ");
                return null;
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(recyclableBufferedInputStream.write(str));
        }
        BrazeContentCardsManagerCompanion.RatingCompat(arrayList);
        return arrayList;
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter write(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z) throws IOException {
        recyclableBufferedInputStream.getClass();
        if (!z || !MediaBrowserCompatMediaItem(recyclableBufferedInputStream)) {
            File fileSerializer = recyclableBufferedInputStream.serializer();
            return new RecyclableBufferedInputStreamInvalidMarkException(getPositionInRoot.IconCompatParcelizer(fileSerializer, new FileOutputStream(fileSerializer, false), false), 0, new ApiErrorResponseCompanion());
        }
        throw new IOException(recyclableBufferedInputStream + " already exists.");
    }
}
