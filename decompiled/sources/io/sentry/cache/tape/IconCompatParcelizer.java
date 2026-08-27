package io.sentry.cache.tape;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.JsonObjectSerializer;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import o.getHeadsetHookEK5gGoQ;
import o.getIntentArrayWithConfiguredBackStacklambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer extends read {
    public final serializer read = new serializer();
    public final JsonObjectSerializer serializer;
    public final MediaSessionCompatQueueItem write;

    @Override // io.sentry.cache.tape.read
    public final void IconCompatParcelizer(Object obj) throws IOException {
        long j;
        long j2;
        long jWrite;
        long j3;
        long j4;
        serializer serializerVar = this.read;
        serializerVar.reset();
        JsonObjectSerializer jsonObjectSerializer = this.serializer;
        jsonObjectSerializer.getClass();
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = (getIntentArrayWithConfiguredBackStacklambda1) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(serializerVar, io.sentry.cache.MediaMetadataCompat.write));
        try {
            ((io.sentry.cache.MediaMetadataCompat) jsonObjectSerializer.jsonReflectionObjectSerializer).IconCompatParcelizer.getSerializer().serializer(bufferedWriter, getintentarraywithconfiguredbackstacklambda1);
            bufferedWriter.close();
            byte[] bArr = serializerVar.read();
            int size = serializerVar.size();
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = this.write;
            mediaSessionCompatQueueItem.getClass();
            byte[] bArr2 = mediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
            if (bArr == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("data == null");
                return;
            }
            if (size < 0 || size > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (mediaSessionCompatQueueItem.write) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
                return;
            }
            int i = mediaSessionCompatQueueItem.MediaMetadataCompat;
            if (i != -1 && mediaSessionCompatQueueItem.IconCompatParcelizer == i) {
                mediaSessionCompatQueueItem.RemoteActionCompatParcelizer(1);
            }
            long j5 = ((long) size) + 4;
            long j6 = mediaSessionCompatQueueItem.MediaBrowserCompatMediaItem;
            if (mediaSessionCompatQueueItem.IconCompatParcelizer == 0) {
                j = 32;
            } else {
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = mediaSessionCompatQueueItem.MediaDescriptionCompat;
                long j7 = mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                long j8 = mediaSessionCompatQueueItem.RatingCompat.RemoteActionCompatParcelizer;
                int i2 = mediaBrowserCompatMediaItem.write;
                if (j7 >= j8) {
                    j = (j7 - j8) + 4 + ((long) i2) + 32;
                } else {
                    j = (((j7 + 4) + ((long) i2)) + j6) - j8;
                }
            }
            long j9 = j6 - j;
            if (j9 < j5) {
                while (true) {
                    j9 += j6;
                    j3 = j6 << 1;
                    if (j9 >= j5) {
                        break;
                    } else {
                        j6 = j3;
                    }
                }
                mediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper.setLength(j3);
                mediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper.getChannel().force(true);
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = mediaSessionCompatQueueItem.MediaDescriptionCompat;
                long jWrite2 = mediaSessionCompatQueueItem.write(mediaBrowserCompatMediaItem2.RemoteActionCompatParcelizer + 4 + ((long) mediaBrowserCompatMediaItem2.write));
                if (jWrite2 <= mediaSessionCompatQueueItem.RatingCompat.RemoteActionCompatParcelizer) {
                    FileChannel channel = mediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper.getChannel();
                    channel.position(mediaSessionCompatQueueItem.MediaBrowserCompatMediaItem);
                    j4 = jWrite2 - 32;
                    if (channel.transferTo(32L, j4, channel) != j4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Copied insufficient number of bytes!");
                        return;
                    }
                } else {
                    j4 = 0;
                }
                long j10 = mediaSessionCompatQueueItem.MediaDescriptionCompat.RemoteActionCompatParcelizer;
                long j11 = mediaSessionCompatQueueItem.RatingCompat.RemoteActionCompatParcelizer;
                if (j10 < j11) {
                    long j12 = (mediaSessionCompatQueueItem.MediaBrowserCompatMediaItem + j10) - 32;
                    mediaSessionCompatQueueItem.serializer(mediaSessionCompatQueueItem.IconCompatParcelizer, j3, j11, j12);
                    mediaSessionCompatQueueItem.MediaDescriptionCompat = new MediaBrowserCompatMediaItem(j12, mediaSessionCompatQueueItem.MediaDescriptionCompat.write);
                } else {
                    mediaSessionCompatQueueItem.serializer(mediaSessionCompatQueueItem.IconCompatParcelizer, j3, j11, j10);
                }
                mediaSessionCompatQueueItem.MediaBrowserCompatMediaItem = j3;
                long j13 = 32;
                while (j4 > 0) {
                    int iMin = (int) Math.min(j4, 4096L);
                    mediaSessionCompatQueueItem.IconCompatParcelizer(iMin, j13, MediaSessionCompatQueueItem.read);
                    long j14 = iMin;
                    j4 -= j14;
                    j13 += j14;
                }
            }
            boolean z = mediaSessionCompatQueueItem.IconCompatParcelizer == 0;
            if (z) {
                jWrite = 32;
                j2 = 4;
            } else {
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem3 = mediaSessionCompatQueueItem.MediaDescriptionCompat;
                j2 = 4;
                jWrite = mediaSessionCompatQueueItem.write(mediaBrowserCompatMediaItem3.RemoteActionCompatParcelizer + 4 + ((long) mediaBrowserCompatMediaItem3.write));
            }
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem4 = new MediaBrowserCompatMediaItem(jWrite, size);
            MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(bArr2, 0, size);
            mediaSessionCompatQueueItem.IconCompatParcelizer(4, jWrite, bArr2);
            mediaSessionCompatQueueItem.IconCompatParcelizer(size, jWrite + j2, bArr);
            mediaSessionCompatQueueItem.serializer(mediaSessionCompatQueueItem.IconCompatParcelizer + 1, mediaSessionCompatQueueItem.MediaBrowserCompatMediaItem, z ? jWrite : mediaSessionCompatQueueItem.RatingCompat.RemoteActionCompatParcelizer, jWrite);
            mediaSessionCompatQueueItem.MediaDescriptionCompat = mediaBrowserCompatMediaItem4;
            mediaSessionCompatQueueItem.IconCompatParcelizer++;
            mediaSessionCompatQueueItem.MediaSessionCompatQueueItem++;
            if (z) {
                mediaSessionCompatQueueItem.RatingCompat = mediaBrowserCompatMediaItem4;
            }
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem = this.write;
        mediaSessionCompatQueueItem.getClass();
        return new getHeadsetHookEK5gGoQ(this, new MediaMetadataCompat(mediaSessionCompatQueueItem));
    }

    @Override // io.sentry.cache.tape.read
    public final int read() {
        return this.write.IconCompatParcelizer;
    }

    @Override // io.sentry.cache.tape.read
    public final void write() throws IOException {
        this.write.write();
    }

    @Override // io.sentry.cache.tape.read
    public final void write(int i) throws IOException {
        this.write.RemoteActionCompatParcelizer(i);
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.write + '}';
    }

    public IconCompatParcelizer(MediaSessionCompatQueueItem mediaSessionCompatQueueItem, JsonObjectSerializer jsonObjectSerializer) {
        this.write = mediaSessionCompatQueueItem;
        this.serializer = jsonObjectSerializer;
    }
}
