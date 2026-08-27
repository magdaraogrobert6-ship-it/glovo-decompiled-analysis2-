package o;

import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import okio.Okio;
import okio.Path$Companion;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class MessageCompanion extends HttpUrlFetcher {
    public static final RecyclableBufferedInputStream write;
    public final ClassLoader IconCompatParcelizer;
    public final HttpUrlFetcher MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen read;

    public MessageCompanion(ClassLoader classLoader) {
        VideoDecoderVideoDecoderException videoDecoderVideoDecoderException = HttpUrlFetcher.serializer;
        videoDecoderVideoDecoderException.getClass();
        this.IconCompatParcelizer = classLoader;
        this.MediaBrowserCompatMediaItem = videoDecoderVideoDecoderException;
        this.read = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(0, this));
    }

    @Override // o.HttpUrlFetcher
    public final List RatingCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) throws FileNotFoundException {
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = write;
        recyclableBufferedInputStream2.getClass();
        String strRatingCompat = ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, true).serializer(recyclableBufferedInputStream2).bytes.RatingCompat();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : (List) this.read.MediaSessionCompatResultReceiverWrapper()) {
            HttpUrlFetcher httpUrlFetcher = (HttpUrlFetcher) onviewattachedtowindowlambda0.serializer;
            RecyclableBufferedInputStream recyclableBufferedInputStream3 = (RecyclableBufferedInputStream) onviewattachedtowindowlambda0.write;
            try {
                List listRatingCompat = httpUrlFetcher.RatingCompat(recyclableBufferedInputStream3.write(strRatingCompat));
                ArrayList<RecyclableBufferedInputStream> arrayList = new ArrayList();
                for (Object obj : listRatingCompat) {
                    if (accessisMainThread.write((RecyclableBufferedInputStream) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                for (RecyclableBufferedInputStream recyclableBufferedInputStream4 : arrayList) {
                    recyclableBufferedInputStream4.getClass();
                    String strReplace = hideCurrentlyDisplayingInAppMessage.write(recyclableBufferedInputStream4.bytes.RatingCompat(), recyclableBufferedInputStream3.bytes.RatingCompat()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(recyclableBufferedInputStream2.write(strReplace));
                }
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList2, (Collection) linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return onContentCardDismissed.PlaybackStateCompat(linkedHashSet);
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "file not found: ");
        return null;
    }

    @Override // o.HttpUrlFetcher
    public final ThumbFetcher MediaDescriptionCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        if (!accessisMainThread.write(recyclableBufferedInputStream)) {
            return null;
        }
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = write;
        recyclableBufferedInputStream2.getClass();
        String strRatingCompat = ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, true).serializer(recyclableBufferedInputStream2).bytes.RatingCompat();
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : (List) this.read.MediaSessionCompatResultReceiverWrapper()) {
            ThumbFetcher thumbFetcherMediaDescriptionCompat = ((HttpUrlFetcher) onviewattachedtowindowlambda0.serializer).MediaDescriptionCompat(((RecyclableBufferedInputStream) onviewattachedtowindowlambda0.write).write(strRatingCompat));
            if (thumbFetcherMediaDescriptionCompat != null) {
                return thumbFetcherMediaDescriptionCompat;
            }
        }
        return null;
    }

    @Override // o.HttpUrlFetcher
    public final ItemSingleChoiceBinding MediaSessionCompatToken(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        if (!accessisMainThread.write(recyclableBufferedInputStream)) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "file not found: ");
            return null;
        }
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = write;
        recyclableBufferedInputStream2.getClass();
        URL resource = this.IconCompatParcelizer.getResource(ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, false).serializer(recyclableBufferedInputStream2).bytes.RatingCompat());
        if (resource == null) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return Okio.RemoteActionCompatParcelizer(inputStream);
    }

    @Override // o.HttpUrlFetcher
    public final void write(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2) throws IOException {
        recyclableBufferedInputStream.getClass();
        recyclableBufferedInputStream2.getClass();
        throw new IOException(this + " is read-only");
    }

    static {
        String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        write = Path$Companion.IconCompatParcelizer("/");
    }

    @Override // o.HttpUrlFetcher
    public final void IconCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // o.HttpUrlFetcher
    public final DefaultImageHeaderParserReaderEndOfFileException MediaSessionCompatQueueItem(RecyclableBufferedInputStream recyclableBufferedInputStream) throws FileNotFoundException {
        if (!accessisMainThread.write(recyclableBufferedInputStream)) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "file not found: ");
            return null;
        }
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = write;
        recyclableBufferedInputStream2.getClass();
        String strRatingCompat = ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, true).serializer(recyclableBufferedInputStream2).bytes.RatingCompat();
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : (List) this.read.MediaSessionCompatResultReceiverWrapper()) {
            try {
                return ((HttpUrlFetcher) onviewattachedtowindowlambda0.serializer).MediaSessionCompatQueueItem(((RecyclableBufferedInputStream) onviewattachedtowindowlambda0.write).write(strRatingCompat));
            } catch (FileNotFoundException unused) {
            }
        }
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "file not found: ");
        return null;
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter read(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // o.HttpUrlFetcher
    public final void serializer(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter write(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException(this + " is read-only");
    }
}
