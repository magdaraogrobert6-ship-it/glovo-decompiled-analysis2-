package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isWebp extends HttpUrlFetcher {
    public final HttpUrlFetcher IconCompatParcelizer;

    @Override // o.HttpUrlFetcher
    public final DefaultImageHeaderParserReaderEndOfFileException MediaSessionCompatQueueItem(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem(recyclableBufferedInputStream);
    }

    @Override // o.HttpUrlFetcher
    public final List RatingCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        List<RecyclableBufferedInputStream> listRatingCompat = this.IconCompatParcelizer.RatingCompat(recyclableBufferedInputStream);
        ArrayList arrayList = new ArrayList();
        for (RecyclableBufferedInputStream recyclableBufferedInputStream2 : listRatingCompat) {
            recyclableBufferedInputStream2.getClass();
            arrayList.add(recyclableBufferedInputStream2);
        }
        BrazeContentCardsManagerCompanion.RatingCompat(arrayList);
        return arrayList;
    }

    @Override // o.HttpUrlFetcher, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.IconCompatParcelizer.close();
    }

    public final String toString() {
        return displayInAppMessagelambda1.serializer(getClass()).IconCompatParcelizer() + '(' + this.IconCompatParcelizer + ')';
    }

    public isWebp(HttpUrlFetcher httpUrlFetcher) {
        httpUrlFetcher.getClass();
        this.IconCompatParcelizer = httpUrlFetcher;
    }

    @Override // o.HttpUrlFetcher
    public final void IconCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        this.IconCompatParcelizer.IconCompatParcelizer(recyclableBufferedInputStream);
    }

    @Override // o.HttpUrlFetcher
    public final ThumbFetcher MediaDescriptionCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        ThumbFetcher thumbFetcherMediaDescriptionCompat = this.IconCompatParcelizer.MediaDescriptionCompat(recyclableBufferedInputStream);
        if (thumbFetcherMediaDescriptionCompat == null) {
            return null;
        }
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = (RecyclableBufferedInputStream) thumbFetcherMediaDescriptionCompat.RatingCompat;
        if (recyclableBufferedInputStream2 == null) {
            return thumbFetcherMediaDescriptionCompat;
        }
        boolean z = thumbFetcherMediaDescriptionCompat.serializer;
        boolean z2 = thumbFetcherMediaDescriptionCompat.read;
        Long l = (Long) thumbFetcherMediaDescriptionCompat.MediaBrowserCompatMediaItem;
        Long l2 = (Long) thumbFetcherMediaDescriptionCompat.RemoteActionCompatParcelizer;
        Long l3 = (Long) thumbFetcherMediaDescriptionCompat.MediaSessionCompatQueueItem;
        Long l4 = (Long) thumbFetcherMediaDescriptionCompat.MediaDescriptionCompat;
        Map map = (Map) thumbFetcherMediaDescriptionCompat.write;
        map.getClass();
        return new ThumbFetcher(z, z2, recyclableBufferedInputStream2, l, l2, l3, l4, map);
    }

    @Override // o.HttpUrlFetcher
    public final ItemSingleChoiceBinding MediaSessionCompatToken(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        return this.IconCompatParcelizer.MediaSessionCompatToken(recyclableBufferedInputStream);
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter read(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        return this.IconCompatParcelizer.read(recyclableBufferedInputStream);
    }

    @Override // o.HttpUrlFetcher
    public final void serializer(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        recyclableBufferedInputStream.getClass();
        this.IconCompatParcelizer.serializer(recyclableBufferedInputStream);
    }

    @Override // o.HttpUrlFetcher
    public final void write(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2) {
        recyclableBufferedInputStream.getClass();
        recyclableBufferedInputStream2.getClass();
        this.IconCompatParcelizer.write(recyclableBufferedInputStream, recyclableBufferedInputStream2);
    }
}
