package o;

import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class readDatalambda0 {
    private final clearandroid_sdk_base_release IconCompatParcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private long MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final Object MediaSessionCompatQueueItem;
    private final e$$ExternalSyntheticLambda0 RatingCompat;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final Runnable serializer;
    private final long write;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static void read(readDatalambda0 readdatalambda0) {
        Runnable runnable;
        synchronized (readdatalambda0.MediaSessionCompatQueueItem) {
            if (readdatalambda0.MediaMetadataCompat) {
                return;
            }
            long j = readdatalambda0.MediaDescriptionCompat;
            if (j <= 0) {
                return;
            }
            if (System.currentTimeMillis() >= j) {
                readdatalambda0.MediaMetadataCompat = true;
                runnable = readdatalambda0.serializer;
            } else {
                runnable = null;
            }
            if (runnable != null) {
                runnable.run();
            } else {
                readdatalambda0.IconCompatParcelizer.IconCompatParcelizer(readdatalambda0.read, readdatalambda0.write, readdatalambda0.RatingCompat);
            }
        }
    }

    public final void serializer() {
        boolean z;
        synchronized (this.MediaSessionCompatQueueItem) {
            if (this.MediaMetadataCompat || this.MediaBrowserCompatMediaItem) {
                z = false;
            } else {
                z = true;
                this.MediaBrowserCompatMediaItem = true;
                this.MediaDescriptionCompat = System.currentTimeMillis() + this.RemoteActionCompatParcelizer;
            }
        }
        if (z) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.read, this.write, this.RatingCompat);
        }
    }

    public final void write() {
        boolean z;
        synchronized (this.MediaSessionCompatQueueItem) {
            if (this.MediaMetadataCompat) {
                z = false;
            } else {
                z = true;
                this.MediaMetadataCompat = true;
            }
        }
        if (z) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static {
        new serializer(null);
    }

    public readDatalambda0(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, long j, long j2, String str, Runnable runnable) {
        clearandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        str.getClass();
        runnable.getClass();
        this.IconCompatParcelizer = clearandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        this.read = str;
        this.serializer = runnable;
        this.MediaSessionCompatQueueItem = new Object();
        this.MediaDescriptionCompat = -1L;
        this.RatingCompat = new e$$ExternalSyntheticLambda0(0, this);
    }
}
