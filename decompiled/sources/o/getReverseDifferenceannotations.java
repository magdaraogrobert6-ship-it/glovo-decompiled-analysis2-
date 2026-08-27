package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.disk.DiskLruCache$Editor;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class getReverseDifferenceannotations implements AutoCloseable {
    public static final getInAppMessageEventMap read = new getInAppMessageEventMap("[a-z0-9_-]{1,120}");
    public final RecyclableBufferedInputStream IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final RecyclableBufferedInputStream MediaMetadataCompat;
    public final RecyclableBufferedInputStream MediaSessionCompatQueueItem;
    public final LinkedHashMap MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public SingleRequest ParcelableVolumeInfo;
    public final Object PlaybackStateCompat;
    public final long PlaybackStateCompatCustomAction;
    public final RecyclableBufferedInputStream RatingCompat;
    public final ContextScope RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean serializer;
    public final getUnion write;

    public static void IconCompatParcelizer(String str) {
        if (read.read(str)) {
            return;
        }
        DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public static final void read(getReverseDifferenceannotations getreversedifferenceannotations, DiskLruCache$Editor diskLruCache$Editor, boolean z) {
        synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
            getUnionannotations getunionannotations = (getUnionannotations) diskLruCache$Editor.write;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getunionannotations.RemoteActionCompatParcelizer, diskLruCache$Editor}, getCieXyz.write())).booleanValue()) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || getunionannotations.MediaBrowserCompatMediaItem) {
                for (int i = 0; i < 2; i++) {
                    getreversedifferenceannotations.write.write((RecyclableBufferedInputStream) getunionannotations.read.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) diskLruCache$Editor.RemoteActionCompatParcelizer)[i2] && !getreversedifferenceannotations.write.MediaBrowserCompatMediaItem((RecyclableBufferedInputStream) getunionannotations.read.get(i2))) {
                        diskLruCache$Editor.serializer(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) getunionannotations.read.get(i3);
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = (RecyclableBufferedInputStream) getunionannotations.serializer.get(i3);
                    boolean zMediaBrowserCompatMediaItem = getreversedifferenceannotations.write.MediaBrowserCompatMediaItem(recyclableBufferedInputStream);
                    getUnion getunion = getreversedifferenceannotations.write;
                    if (zMediaBrowserCompatMediaItem) {
                        getunion.write(recyclableBufferedInputStream, recyclableBufferedInputStream2);
                    } else {
                        StrokeCap.IconCompatParcelizer(getunion, (RecyclableBufferedInputStream) getunionannotations.serializer.get(i3));
                    }
                    long j = getunionannotations.write[i3];
                    Long l = (Long) getreversedifferenceannotations.write.MediaMetadataCompat(recyclableBufferedInputStream2).MediaBrowserCompatMediaItem;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    getunionannotations.write[i3] = jLongValue;
                    getreversedifferenceannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (getreversedifferenceannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY - j) + jLongValue;
                }
            }
            getunionannotations.RemoteActionCompatParcelizer = null;
            if (getunionannotations.MediaBrowserCompatMediaItem) {
                getreversedifferenceannotations.serializer(getunionannotations);
                return;
            }
            getreversedifferenceannotations.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus++;
            SingleRequest singleRequest = getreversedifferenceannotations.ParcelableVolumeInfo;
            singleRequest.getClass();
            if (z || getunionannotations.MediaSessionCompatQueueItem) {
                getunionannotations.MediaSessionCompatQueueItem = true;
                singleRequest.read("CLEAN");
                singleRequest.serializer(32);
                singleRequest.read(getunionannotations.IconCompatParcelizer);
                for (long j2 : getunionannotations.write) {
                    singleRequest.serializer(32);
                    singleRequest.MediaDescriptionCompat(j2);
                }
                singleRequest.serializer(10);
            } else {
                getreversedifferenceannotations.MediaSessionCompatResultReceiverWrapper.remove(getunionannotations.IconCompatParcelizer);
                singleRequest.read("REMOVE");
                singleRequest.serializer(32);
                singleRequest.read(getunionannotations.IconCompatParcelizer);
                singleRequest.serializer(10);
            }
            singleRequest.flush();
            if (getreversedifferenceannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY > getreversedifferenceannotations.PlaybackStateCompatCustomAction || getreversedifferenceannotations.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= 2000) {
                getreversedifferenceannotations.read();
            }
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this.PlaybackStateCompat) {
            if (this.MediaBrowserCompatMediaItem) {
                return;
            }
            this.write.write(this.MediaSessionCompatQueueItem);
            if (this.write.MediaBrowserCompatMediaItem(this.MediaMetadataCompat)) {
                boolean zMediaBrowserCompatMediaItem = this.write.MediaBrowserCompatMediaItem(this.RatingCompat);
                getUnion getunion = this.write;
                RecyclableBufferedInputStream recyclableBufferedInputStream = this.MediaMetadataCompat;
                if (zMediaBrowserCompatMediaItem) {
                    getunion.write(recyclableBufferedInputStream);
                } else {
                    getunion.write(recyclableBufferedInputStream, this.RatingCompat);
                }
            }
            if (this.write.MediaBrowserCompatMediaItem(this.RatingCompat)) {
                try {
                    write();
                    RemoteActionCompatParcelizer();
                    this.MediaBrowserCompatMediaItem = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        StrokeCap.serializer(this.write, this.IconCompatParcelizer);
                        this.serializer = false;
                        MediaBrowserCompatMediaItem();
                        this.MediaBrowserCompatMediaItem = true;
                    } catch (Throwable th) {
                        this.serializer = false;
                        throw th;
                    }
                }
            }
            MediaBrowserCompatMediaItem();
            this.MediaBrowserCompatMediaItem = true;
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        synchronized (this.PlaybackStateCompat) {
            SingleRequest singleRequest = this.ParcelableVolumeInfo;
            if (singleRequest != null) {
                singleRequest.close();
            }
            DateTimeConverter dateTimeConverterWrite = this.write.write(this.MediaSessionCompatQueueItem, false);
            dateTimeConverterWrite.getClass();
            SingleRequest singleRequest2 = new SingleRequest(dateTimeConverterWrite);
            try {
                singleRequest2.read("libcore.io.DiskLruCache");
                singleRequest2.serializer(10);
                singleRequest2.read("1");
                singleRequest2.serializer(10);
                singleRequest2.MediaDescriptionCompat(3L);
                singleRequest2.serializer(10);
                singleRequest2.MediaDescriptionCompat(2L);
                singleRequest2.serializer(10);
                singleRequest2.serializer(10);
                for (getUnionannotations getunionannotations : this.MediaSessionCompatResultReceiverWrapper.values()) {
                    if (getunionannotations.RemoteActionCompatParcelizer != null) {
                        singleRequest2.read("DIRTY");
                        singleRequest2.serializer(32);
                        singleRequest2.read(getunionannotations.IconCompatParcelizer);
                        singleRequest2.serializer(10);
                    } else {
                        singleRequest2.read("CLEAN");
                        singleRequest2.serializer(32);
                        singleRequest2.read(getunionannotations.IconCompatParcelizer);
                        for (long j : getunionannotations.write) {
                            singleRequest2.serializer(32);
                            singleRequest2.MediaDescriptionCompat(j);
                        }
                        singleRequest2.serializer(10);
                    }
                }
                try {
                    singleRequest2.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    singleRequest2.close();
                } catch (Throwable th3) {
                    markOnScreenCardsAsReadlambda1.read(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            boolean zMediaBrowserCompatMediaItem = this.write.MediaBrowserCompatMediaItem(this.RatingCompat);
            getUnion getunion = this.write;
            if (zMediaBrowserCompatMediaItem) {
                getunion.write(this.RatingCompat, this.MediaMetadataCompat);
                this.write.write(this.MediaSessionCompatQueueItem, this.RatingCompat);
                this.write.write(this.MediaMetadataCompat);
            } else {
                getunion.write(this.MediaSessionCompatQueueItem, this.RatingCompat);
            }
            getUnion getunion2 = this.write;
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.RatingCompat;
            getunion2.getClass();
            recyclableBufferedInputStream.getClass();
            this.ParcelableVolumeInfo = new SingleRequest(new RequestManager(getunion2.read(recyclableBufferedInputStream), new f2$$ExternalSyntheticLambda4(7, this)));
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
            this.MediaDescriptionCompat = false;
            this.MediaSessionCompatToken = false;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            getUnionannotations getunionannotations = (getUnionannotations) it.next();
            int i = 0;
            if (getunionannotations.RemoteActionCompatParcelizer == null) {
                while (i < 2) {
                    j += getunionannotations.write[i];
                    i++;
                }
            } else {
                getunionannotations.RemoteActionCompatParcelizer = null;
                while (i < 2) {
                    RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) getunionannotations.serializer.get(i);
                    getUnion getunion = this.write;
                    getunion.write(recyclableBufferedInputStream);
                    getunion.write((RecyclableBufferedInputStream) getunionannotations.read.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.PlaybackStateCompat) {
            if (this.MediaBrowserCompatMediaItem && !this.serializer) {
                for (getUnionannotations getunionannotations : (getUnionannotations[]) this.MediaSessionCompatResultReceiverWrapper.values().toArray(new getUnionannotations[0])) {
                    DiskLruCache$Editor diskLruCache$Editor = getunionannotations.RemoteActionCompatParcelizer;
                    if (diskLruCache$Editor != null) {
                        getUnionannotations getunionannotations2 = (getUnionannotations) diskLruCache$Editor.write;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getunionannotations2.RemoteActionCompatParcelizer, diskLruCache$Editor}, getCieXyz.write())).booleanValue()) {
                            getunionannotations2.MediaBrowserCompatMediaItem = true;
                        }
                    }
                }
                serializer();
                YieldKt.write(this.RemoteActionCompatParcelizer, (CancellationException) null);
                SingleRequest singleRequest = this.ParcelableVolumeInfo;
                singleRequest.getClass();
                singleRequest.close();
                this.ParcelableVolumeInfo = null;
                this.serializer = true;
                return;
            }
            this.serializer = true;
        }
    }

    public final getXorannotations serializer(String str) {
        getXorannotations getxorannotations;
        synchronized (this.PlaybackStateCompat) {
            if (this.serializer) {
                throw new IllegalStateException("cache is closed");
            }
            IconCompatParcelizer(str);
            IconCompatParcelizer();
            getUnionannotations getunionannotations = (getUnionannotations) this.MediaSessionCompatResultReceiverWrapper.get(str);
            if (getunionannotations != null && (getxorannotations = getunionannotations.read()) != null) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus++;
                SingleRequest singleRequest = this.ParcelableVolumeInfo;
                singleRequest.getClass();
                singleRequest.read("READ");
                singleRequest.serializer(32);
                singleRequest.read(str);
                singleRequest.serializer(10);
                singleRequest.flush();
                if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= 2000) {
                    read();
                }
                return getxorannotations;
            }
            return null;
        }
    }

    public final void serializer() {
        while (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY > this.PlaybackStateCompatCustomAction) {
            for (getUnionannotations getunionannotations : this.MediaSessionCompatResultReceiverWrapper.values()) {
                if (!getunionannotations.MediaBrowserCompatMediaItem) {
                    serializer(getunionannotations);
                }
            }
            return;
        }
        this.ResultReceiver = false;
    }

    public final void serializer(getUnionannotations getunionannotations) {
        SingleRequest singleRequest;
        int i = getunionannotations.MediaMetadataCompat;
        String str = getunionannotations.IconCompatParcelizer;
        if (i > 0 && (singleRequest = this.ParcelableVolumeInfo) != null) {
            singleRequest.read("DIRTY");
            singleRequest.serializer(32);
            singleRequest.read(str);
            singleRequest.serializer(10);
            singleRequest.flush();
        }
        if (getunionannotations.MediaMetadataCompat > 0 || getunionannotations.RemoteActionCompatParcelizer != null) {
            getunionannotations.MediaBrowserCompatMediaItem = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.write.write((RecyclableBufferedInputStream) getunionannotations.serializer.get(i2));
            long j = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            long[] jArr = getunionannotations.write;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus++;
        SingleRequest singleRequest2 = this.ParcelableVolumeInfo;
        if (singleRequest2 != null) {
            singleRequest2.read("REMOVE");
            singleRequest2.serializer(32);
            singleRequest2.read(str);
            singleRequest2.serializer(10);
            singleRequest2.flush();
        }
        this.MediaSessionCompatResultReceiverWrapper.remove(str);
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= 2000) {
            read();
        }
    }

    public final DiskLruCache$Editor write(String str) {
        synchronized (this.PlaybackStateCompat) {
            if (this.serializer) {
                throw new IllegalStateException("cache is closed");
            }
            IconCompatParcelizer(str);
            IconCompatParcelizer();
            getUnionannotations getunionannotations = (getUnionannotations) this.MediaSessionCompatResultReceiverWrapper.get(str);
            if ((getunionannotations != null ? getunionannotations.RemoteActionCompatParcelizer : null) != null) {
                return null;
            }
            if (getunionannotations != null && getunionannotations.MediaMetadataCompat != 0) {
                return null;
            }
            if (!this.ResultReceiver && !this.MediaSessionCompatToken) {
                SingleRequest singleRequest = this.ParcelableVolumeInfo;
                singleRequest.getClass();
                singleRequest.read("DIRTY");
                singleRequest.serializer(32);
                singleRequest.read(str);
                singleRequest.serializer(10);
                singleRequest.flush();
                if (this.MediaDescriptionCompat) {
                    return null;
                }
                if (getunionannotations == null) {
                    getunionannotations = new getUnionannotations(this, str);
                    this.MediaSessionCompatResultReceiverWrapper.put(str, getunionannotations);
                }
                DiskLruCache$Editor diskLruCache$Editor = new DiskLruCache$Editor(this, getunionannotations);
                getunionannotations.RemoteActionCompatParcelizer = diskLruCache$Editor;
                return diskLruCache$Editor;
            }
            read();
            return null;
        }
    }

    public getReverseDifferenceannotations(long j, HttpUrlFetcher httpUrlFetcher, RecyclableBufferedInputStream recyclableBufferedInputStream) {
        this.IconCompatParcelizer = recyclableBufferedInputStream;
        this.PlaybackStateCompatCustomAction = j;
        if (j <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxSize <= 0");
            throw null;
        }
        this.RatingCompat = recyclableBufferedInputStream.write("journal");
        this.MediaSessionCompatQueueItem = recyclableBufferedInputStream.write("journal.tmp");
        this.MediaMetadataCompat = recyclableBufferedInputStream.write("journal.bkp");
        this.MediaSessionCompatResultReceiverWrapper = new LinkedHashMap(0, 0.75f, true);
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        CoroutineDispatcher.read.getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(onbackinvokedlambda0Serializer, CoroutineDispatcher.limitedParallelism$default(DefaultIoScheduler.RemoteActionCompatParcelizer, 1, null, 2, null)));
        this.PlaybackStateCompat = new Object();
        this.write = new getUnion(httpUrlFetcher);
    }

    public final void read() {
        BuildersKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, null, null, new DiskLruCache$launchCleanup$1(this, null, 0), 3);
    }

    public final void read(String str) throws IOException {
        String strSubstring;
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ' ', 0, false, 6);
        if (iWrite != -1) {
            int i = iWrite + 1;
            int iWrite2 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ' ', i, false, 4);
            LinkedHashMap linkedHashMap = this.MediaSessionCompatResultReceiverWrapper;
            if (iWrite2 == -1) {
                strSubstring = str.substring(i);
                if (iWrite == 6 && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "REMOVE", false)) {
                    linkedHashMap.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i, iWrite2);
            }
            Object getunionannotations = linkedHashMap.get(strSubstring);
            if (getunionannotations == null) {
                getunionannotations = new getUnionannotations(this, strSubstring);
                linkedHashMap.put(strSubstring, getunionannotations);
            }
            getUnionannotations getunionannotations2 = (getUnionannotations) getunionannotations;
            if (iWrite2 != -1 && iWrite == 5 && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "CLEAN", false)) {
                List listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str.substring(iWrite2 + 1), new char[]{' '});
                getunionannotations2.MediaSessionCompatQueueItem = true;
                getunionannotations2.RemoteActionCompatParcelizer = null;
                if (listRemoteActionCompatParcelizer.size() == 2) {
                    try {
                        int size = listRemoteActionCompatParcelizer.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            getunionannotations2.write[i2] = Long.parseLong((String) listRemoteActionCompatParcelizer.get(i2));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m("unexpected journal line: ", listRemoteActionCompatParcelizer));
                        return;
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m("unexpected journal line: ", listRemoteActionCompatParcelizer));
                return;
            }
            if (iWrite2 == -1 && iWrite == 5 && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "DIRTY", false)) {
                getunionannotations2.RemoteActionCompatParcelizer = new DiskLruCache$Editor(this, getunionannotations2);
                return;
            } else {
                if (iWrite2 == -1 && iWrite == 4 && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "READ", false)) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("unexpected journal line: ".concat(str));
    }

    public final void write() throws Throwable {
        Throwable th;
        getUnion getunion = this.write;
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.RatingCompat;
        GifDrawableTransformation gifDrawableTransformationRemoteActionCompatParcelizer = Okio.RemoteActionCompatParcelizer(getunion.MediaSessionCompatToken(recyclableBufferedInputStream));
        try {
            String strSerializer = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer2 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer3 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer4 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            String strSerializer5 = gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(strSerializer) && "1".equals(strSerializer2)) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{String.valueOf(3), strSerializer3}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{String.valueOf(2), strSerializer4}, getCieXyz.write())).booleanValue() && strSerializer5.length() <= 0) {
                        int i = 0;
                        while (true) {
                            try {
                                read(gifDrawableTransformationRemoteActionCompatParcelizer.serializer(Long.MAX_VALUE));
                                i++;
                            } catch (EOFException unused) {
                                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i - this.MediaSessionCompatResultReceiverWrapper.size();
                                if (gifDrawableTransformationRemoteActionCompatParcelizer.RatingCompat()) {
                                    getunion.getClass();
                                    recyclableBufferedInputStream.getClass();
                                    this.ParcelableVolumeInfo = new SingleRequest(new RequestManager(getunion.read(recyclableBufferedInputStream), new f2$$ExternalSyntheticLambda4(7, this)));
                                } else {
                                    MediaBrowserCompatMediaItem();
                                }
                                try {
                                    gifDrawableTransformationRemoteActionCompatParcelizer.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th != null) {
                                    throw th;
                                }
                                return;
                            }
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strSerializer + ", " + strSerializer2 + ", " + strSerializer3 + ", " + strSerializer4 + ", " + strSerializer5 + "]");
        } catch (Throwable th3) {
            try {
                gifDrawableTransformationRemoteActionCompatParcelizer.close();
            } catch (Throwable th4) {
                markOnScreenCardsAsReadlambda1.read(th3, th4);
            }
            th = th3;
        }
    }
}
