package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class generateEotflambda0 implements generateOetf {
    public final boolean IconCompatParcelizer;
    public final area MediaMetadataCompat;
    public final generateOetf MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public final boolean read;
    public boolean serializer;
    public final eotfFunclambda0 write;

    @Override // o.generateOetf
    public final void MediaBrowserCompatMediaItem() {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.serializer) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.serializer = true;
            if (this.read) {
                this.MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem();
            }
        }
    }

    public final void RatingCompat() {
        boolean z;
        synchronized (this) {
            int i = this.RemoteActionCompatParcelizer;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            int i2 = i - 1;
            this.RemoteActionCompatParcelizer = i2;
            z = i2 == 0;
        }
        if (z) {
            this.MediaMetadataCompat.IconCompatParcelizer(this.write, this);
        }
    }

    public final boolean read() {
        return this.IconCompatParcelizer;
    }

    public final void serializer() {
        synchronized (this) {
            if (this.serializer) {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
            this.RemoteActionCompatParcelizer++;
        }
    }

    @Override // o.generateOetf
    public final Object IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem.IconCompatParcelizer();
    }

    @Override // o.generateOetf
    public final Class RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
    }

    public final String toString() {
        String str;
        synchronized (this) {
            str = "EngineResource{isMemoryCacheable=" + this.IconCompatParcelizer + ", listener=" + this.MediaMetadataCompat + ", key=" + this.write + ", acquired=" + this.RemoteActionCompatParcelizer + ", isRecycled=" + this.serializer + ", resource=" + this.MediaSessionCompatQueueItem + '}';
        }
        return str;
    }

    @Override // o.generateOetf
    public final int write() {
        return this.MediaSessionCompatQueueItem.write();
    }

    public generateEotflambda0(generateOetf generateoetf, boolean z, boolean z2, eotfFunclambda0 eotffunclambda0, area areaVar) {
        UrlUtils.serializer(generateoetf, "Argument must not be null");
        this.MediaSessionCompatQueueItem = generateoetf;
        this.IconCompatParcelizer = z;
        this.read = z2;
        this.write = eotffunclambda0;
        UrlUtils.serializer(areaVar, "Argument must not be null");
        this.MediaMetadataCompat = areaVar;
    }
}
