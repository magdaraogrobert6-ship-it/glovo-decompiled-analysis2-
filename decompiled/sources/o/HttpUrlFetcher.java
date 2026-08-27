package o;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HttpUrlFetcher implements Closeable {
    public static final RecyclableBufferedInputStream RemoteActionCompatParcelizer;
    public static final VideoDecoderVideoDecoderException serializer;

    public abstract void IconCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream);

    public abstract ThumbFetcher MediaDescriptionCompat(RecyclableBufferedInputStream recyclableBufferedInputStream);

    public abstract DefaultImageHeaderParserReaderEndOfFileException MediaSessionCompatQueueItem(RecyclableBufferedInputStream recyclableBufferedInputStream);

    public abstract ItemSingleChoiceBinding MediaSessionCompatToken(RecyclableBufferedInputStream recyclableBufferedInputStream);

    public abstract List RatingCompat(RecyclableBufferedInputStream recyclableBufferedInputStream);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract DateTimeConverter read(RecyclableBufferedInputStream recyclableBufferedInputStream);

    public abstract void serializer(RecyclableBufferedInputStream recyclableBufferedInputStream);

    public abstract DateTimeConverter write(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z);

    public abstract void write(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2);

    static {
        VideoDecoderVideoDecoderException videoDecoderVideoDecoderException;
        try {
            Class.forName("java.nio.file.Files");
            videoDecoderVideoDecoderException = new VideoDecoder();
        } catch (ClassNotFoundException unused) {
            videoDecoderVideoDecoderException = new VideoDecoderVideoDecoderException();
        }
        serializer = videoDecoderVideoDecoderException;
        String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        RemoteActionCompatParcelizer = Path$Companion.IconCompatParcelizer(property);
        ClassLoader classLoader = MessageCompanion.class.getClassLoader();
        classLoader.getClass();
        new MessageCompanion(classLoader);
    }

    public final void RemoteActionCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
        while (recyclableBufferedInputStream != null && !MediaBrowserCompatMediaItem(recyclableBufferedInputStream)) {
            brazeContentCardsManager.addFirst(recyclableBufferedInputStream);
            recyclableBufferedInputStream = recyclableBufferedInputStream.IconCompatParcelizer();
        }
        Iterator<E> it = brazeContentCardsManager.iterator();
        while (it.hasNext()) {
            serializer((RecyclableBufferedInputStream) it.next());
        }
    }

    public final boolean MediaBrowserCompatMediaItem(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        return MediaDescriptionCompat(recyclableBufferedInputStream) != null;
    }

    public final ThumbFetcher MediaMetadataCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) throws FileNotFoundException {
        recyclableBufferedInputStream.getClass();
        ThumbFetcher thumbFetcherMediaDescriptionCompat = MediaDescriptionCompat(recyclableBufferedInputStream);
        if (thumbFetcherMediaDescriptionCompat != null) {
            return thumbFetcherMediaDescriptionCompat;
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "no such file: ");
        return null;
    }

    public final void write(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        IconCompatParcelizer(recyclableBufferedInputStream);
    }
}
