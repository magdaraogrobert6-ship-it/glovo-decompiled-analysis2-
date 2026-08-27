package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final class ApiExceptionForceAppUpdateRequired extends HttpUrlFetcher {
    public static final RecyclableBufferedInputStream IconCompatParcelizer;
    public final RecyclableBufferedInputStream MediaSessionCompatQueueItem;
    public final LinkedHashMap read;
    public final HttpUrlFetcher write;

    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    @Override // o.HttpUrlFetcher
    public final ThumbFetcher MediaDescriptionCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) throws Throwable {
        Long l;
        Long lValueOf;
        Long l2;
        Integer num;
        int i;
        Long l3;
        int i2;
        Long lValueOf2;
        Long l4;
        Integer num2;
        Long l5;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        ApiExceptionSessionExpired apiExceptionSessionExpired;
        recyclableBufferedInputStream.getClass();
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = IconCompatParcelizer;
        recyclableBufferedInputStream2.getClass();
        ApiExceptionSessionExpired apiExceptionSessionExpired2 = (ApiExceptionSessionExpired) this.read.get(ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, true));
        if (apiExceptionSessionExpired2 == null) {
            return null;
        }
        long j = apiExceptionSessionExpired2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (j != -1) {
            DefaultImageHeaderParserReaderEndOfFileException defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem = this.write.MediaSessionCompatQueueItem(this.MediaSessionCompatQueueItem);
            try {
                GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.write(j));
                try {
                    ApiExceptionSessionExpired apiExceptionSessionExpiredIconCompatParcelizer = ThrowableExtensionsKt.IconCompatParcelizer(gifDrawableTransformation, apiExceptionSessionExpired2);
                    apiExceptionSessionExpiredIconCompatParcelizer.getClass();
                    try {
                        gifDrawableTransformation.close();
                        apiExceptionSessionExpired = apiExceptionSessionExpiredIconCompatParcelizer;
                        th2 = null;
                    } catch (Throwable th3) {
                        apiExceptionSessionExpired = apiExceptionSessionExpiredIconCompatParcelizer;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        gifDrawableTransformation.close();
                    } catch (Throwable th5) {
                        markOnScreenCardsAsReadlambda1.read(th2, th5);
                    }
                    apiExceptionSessionExpired = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
                apiExceptionSessionExpired2 = apiExceptionSessionExpired;
            } catch (Throwable th7) {
                th = th7;
                if (defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem != null) {
                    try {
                        defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                    } catch (Throwable th8) {
                        markOnScreenCardsAsReadlambda1.read(th, th8);
                    }
                }
                apiExceptionSessionExpired2 = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = apiExceptionSessionExpired2.PlaybackStateCompat;
        Long lValueOf4 = z ? null : Long.valueOf(apiExceptionSessionExpired2.ResultReceiver);
        Long l6 = apiExceptionSessionExpired2.MediaSessionCompatToken;
        if (l6 == null) {
            Integer num3 = apiExceptionSessionExpired2.RatingCompat;
            if (num3 != null) {
                lValueOf = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            l2 = apiExceptionSessionExpired2.PlaybackStateCompatCustomAction;
            if (l2 != null) {
                lValueOf2 = Long.valueOf((l2.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
            } else {
                num = apiExceptionSessionExpired2.ParcelableVolumeInfo;
                if (num != null) {
                    i = apiExceptionSessionExpired2.MediaSessionCompatQueueItem;
                    if (i != -1) {
                        i2 = apiExceptionSessionExpired2.MediaBrowserCompatMediaItem;
                        if (i == -1) {
                            GregorianCalendar gregorianCalendar = new GregorianCalendar();
                            gregorianCalendar.set(14, 0);
                            gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i >> 11) & 31, (i >> 5) & 63, (i & 31) << 1);
                            lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                        }
                        l4 = apiExceptionSessionExpired2.MediaSessionCompatResultReceiverWrapper;
                        if (l4 != null) {
                            num2 = apiExceptionSessionExpired2.MediaDescriptionCompat;
                            if (num2 != null) {
                                lValueOf3 = Long.valueOf(((long) num2.intValue()) * 1000);
                            } else {
                                l5 = null;
                            }
                            return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                        }
                        lValueOf3 = Long.valueOf((l4.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
                        l5 = lValueOf3;
                        return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                    }
                    l3 = null;
                    l4 = apiExceptionSessionExpired2.MediaSessionCompatResultReceiverWrapper;
                    if (l4 != null) {
                        num2 = apiExceptionSessionExpired2.MediaDescriptionCompat;
                        if (num2 != null) {
                            lValueOf3 = Long.valueOf(((long) num2.intValue()) * 1000);
                        } else {
                            l5 = null;
                        }
                        return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                    }
                    lValueOf3 = Long.valueOf((l4.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
                    l5 = lValueOf3;
                    return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                }
                lValueOf2 = Long.valueOf(((long) num.intValue()) * 1000);
            }
            l3 = lValueOf2;
            l4 = apiExceptionSessionExpired2.MediaSessionCompatResultReceiverWrapper;
            if (l4 != null) {
                num2 = apiExceptionSessionExpired2.MediaDescriptionCompat;
                if (num2 != null) {
                    lValueOf3 = Long.valueOf(((long) num2.intValue()) * 1000);
                } else {
                    l5 = null;
                }
                return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
            }
            lValueOf3 = Long.valueOf((l4.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
            l5 = lValueOf3;
            return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
        }
        lValueOf = Long.valueOf((l6.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
        l = lValueOf;
        l2 = apiExceptionSessionExpired2.PlaybackStateCompatCustomAction;
        if (l2 != null) {
            lValueOf2 = Long.valueOf((l2.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
        } else {
            num = apiExceptionSessionExpired2.ParcelableVolumeInfo;
            if (num != null) {
                i = apiExceptionSessionExpired2.MediaSessionCompatQueueItem;
                if (i != -1) {
                    i2 = apiExceptionSessionExpired2.MediaBrowserCompatMediaItem;
                    if (i == -1) {
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.set(14, 0);
                        gregorianCalendar2.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i >> 11) & 31, (i >> 5) & 63, (i & 31) << 1);
                        lValueOf2 = Long.valueOf(gregorianCalendar2.getTime().getTime());
                    }
                    l4 = apiExceptionSessionExpired2.MediaSessionCompatResultReceiverWrapper;
                    if (l4 != null) {
                        num2 = apiExceptionSessionExpired2.MediaDescriptionCompat;
                        if (num2 != null) {
                            lValueOf3 = Long.valueOf(((long) num2.intValue()) * 1000);
                        } else {
                            l5 = null;
                        }
                        return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                    }
                    lValueOf3 = Long.valueOf((l4.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
                    l5 = lValueOf3;
                    return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                }
                l3 = null;
                l4 = apiExceptionSessionExpired2.MediaSessionCompatResultReceiverWrapper;
                if (l4 != null) {
                    num2 = apiExceptionSessionExpired2.MediaDescriptionCompat;
                    if (num2 != null) {
                        lValueOf3 = Long.valueOf(((long) num2.intValue()) * 1000);
                    } else {
                        l5 = null;
                    }
                    return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
                }
                lValueOf3 = Long.valueOf((l4.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
                l5 = lValueOf3;
                return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
            }
            lValueOf2 = Long.valueOf(((long) num.intValue()) * 1000);
        }
        l3 = lValueOf2;
        l4 = apiExceptionSessionExpired2.MediaSessionCompatResultReceiverWrapper;
        if (l4 != null) {
            num2 = apiExceptionSessionExpired2.MediaDescriptionCompat;
            if (num2 != null) {
                lValueOf3 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                l5 = null;
            }
            return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) - 11644473600000L);
        l5 = lValueOf3;
        return new ThumbFetcher(!z, z, null, lValueOf4, l, l3, l5);
    }

    @Override // o.HttpUrlFetcher
    public final List RatingCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = IconCompatParcelizer;
        recyclableBufferedInputStream2.getClass();
        ApiExceptionSessionExpired apiExceptionSessionExpired = (ApiExceptionSessionExpired) this.read.get(ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, true));
        if (apiExceptionSessionExpired != null) {
            return onContentCardDismissed.PlaybackStateCompat(apiExceptionSessionExpired.serializer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(recyclableBufferedInputStream, "not a directory: ");
        return null;
    }

    public ApiExceptionForceAppUpdateRequired(RecyclableBufferedInputStream recyclableBufferedInputStream, HttpUrlFetcher httpUrlFetcher, LinkedHashMap linkedHashMap) {
        httpUrlFetcher.getClass();
        this.MediaSessionCompatQueueItem = recyclableBufferedInputStream;
        this.write = httpUrlFetcher;
        this.read = linkedHashMap;
    }

    @Override // o.HttpUrlFetcher
    public final ItemSingleChoiceBinding MediaSessionCompatToken(RecyclableBufferedInputStream recyclableBufferedInputStream) throws Throwable {
        GifDrawableTransformation gifDrawableTransformation;
        Throwable th;
        recyclableBufferedInputStream.getClass();
        RecyclableBufferedInputStream recyclableBufferedInputStream2 = IconCompatParcelizer;
        recyclableBufferedInputStream2.getClass();
        ApiExceptionSessionExpired apiExceptionSessionExpired = (ApiExceptionSessionExpired) this.read.get(ApiExceptionBadRequest.serializer(recyclableBufferedInputStream2, recyclableBufferedInputStream, true));
        if (apiExceptionSessionExpired == null) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m$1(recyclableBufferedInputStream, "no such file: ");
            return null;
        }
        long j = apiExceptionSessionExpired.ResultReceiver;
        DefaultImageHeaderParserReaderEndOfFileException defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem = this.write.MediaSessionCompatQueueItem(this.MediaSessionCompatQueueItem);
        try {
            gifDrawableTransformation = new GifDrawableTransformation(defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.write(apiExceptionSessionExpired.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
            try {
                defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem != null) {
                try {
                    defaultImageHeaderParserReaderEndOfFileExceptionMediaSessionCompatQueueItem.close();
                } catch (Throwable th4) {
                    markOnScreenCardsAsReadlambda1.read(th3, th4);
                }
            }
            gifDrawableTransformation = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        gifDrawableTransformation.getClass();
        ThrowableExtensionsKt.IconCompatParcelizer(gifDrawableTransformation, null);
        if (apiExceptionSessionExpired.RemoteActionCompatParcelizer == 0) {
            return new BlockingMessageCompanion(gifDrawableTransformation, j, true);
        }
        return new BlockingMessageCompanion(new MultiModelLoaderFactory(new GifDrawableTransformation(new BlockingMessageCompanion(gifDrawableTransformation, apiExceptionSessionExpired.write, true)), new Inflater(true)), j, false);
    }

    @Override // o.HttpUrlFetcher
    public final void write(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2) throws IOException {
        recyclableBufferedInputStream.getClass();
        recyclableBufferedInputStream2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    static {
        String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        IconCompatParcelizer = Path$Companion.IconCompatParcelizer("/");
    }

    @Override // o.HttpUrlFetcher
    public final DefaultImageHeaderParserReaderEndOfFileException MediaSessionCompatQueueItem(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // o.HttpUrlFetcher
    public final void IconCompatParcelizer(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter read(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.HttpUrlFetcher
    public final void serializer(RecyclableBufferedInputStream recyclableBufferedInputStream) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.HttpUrlFetcher
    public final DateTimeConverter write(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z) throws IOException {
        recyclableBufferedInputStream.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
