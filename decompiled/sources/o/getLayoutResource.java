package o;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getLayoutResource implements getDefaultImageFormat, getTitleMarginEnd {
    public Executor IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final ut MediaDescriptionCompat;
    public getSurfaceClass MediaMetadataCompat;
    public final LongSparseArray MediaSessionCompatQueueItem;
    public final StreamSharing$$ExternalSyntheticLambda0 MediaSessionCompatToken;
    public final LongSparseArray ParcelableVolumeInfo;
    public int PlaybackStateCompatCustomAction;
    public final ArrayList RatingCompat;
    public final setOnInflateListener RemoteActionCompatParcelizer;
    public boolean read;
    public final ArrayList serializer;
    public int write;

    public getLayoutResource(int i, int i2, int i3, int i4) {
        ut utVar = new ut(ImageReader.newInstance(i, i2, i3, i4));
        this.MediaBrowserCompatMediaItem = new Object();
        this.RemoteActionCompatParcelizer = new setOnInflateListener(0, this);
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaSessionCompatToken = new StreamSharing$$ExternalSyntheticLambda0(7, this);
        this.read = false;
        this.MediaSessionCompatQueueItem = new LongSparseArray();
        this.ParcelableVolumeInfo = new LongSparseArray();
        this.serializer = new ArrayList();
        this.MediaDescriptionCompat = utVar;
        this.write = 0;
        this.RatingCompat = new ArrayList(MediaMetadataCompat());
    }

    @Override // o.getDefaultImageFormat
    public final getInflatedId IconCompatParcelizer() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.RatingCompat.isEmpty()) {
                return null;
            }
            if (this.write >= this.RatingCompat.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = this.RatingCompat;
            int i = this.write;
            this.write = i + 1;
            getInflatedId getinflatedid = (getInflatedId) arrayList.get(i);
            this.serializer.add(getinflatedid);
            return getinflatedid;
        }
    }

    @Override // o.getDefaultImageFormat
    public final int MediaBrowserCompatMediaItem() {
        int iMediaBrowserCompatMediaItem;
        synchronized (this.MediaBrowserCompatMediaItem) {
            iMediaBrowserCompatMediaItem = this.MediaDescriptionCompat.MediaBrowserCompatMediaItem();
        }
        return iMediaBrowserCompatMediaItem;
    }

    @Override // o.getDefaultImageFormat
    public final int MediaDescriptionCompat() {
        int iMediaDescriptionCompat;
        synchronized (this.MediaBrowserCompatMediaItem) {
            iMediaDescriptionCompat = this.MediaDescriptionCompat.MediaDescriptionCompat();
        }
        return iMediaDescriptionCompat;
    }

    @Override // o.getDefaultImageFormat
    public final int MediaMetadataCompat() {
        int iMediaMetadataCompat;
        synchronized (this.MediaBrowserCompatMediaItem) {
            iMediaMetadataCompat = this.MediaDescriptionCompat.MediaMetadataCompat();
        }
        return iMediaMetadataCompat;
    }

    public final void MediaSessionCompatQueueItem() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            int size = this.MediaSessionCompatQueueItem.size();
            while (true) {
                size--;
                if (size >= 0) {
                    setTitleMarginStart settitlemarginstart = (setTitleMarginStart) this.MediaSessionCompatQueueItem.valueAt(size);
                    long jSerializer = settitlemarginstart.serializer();
                    getInflatedId getinflatedid = (getInflatedId) this.ParcelableVolumeInfo.get(jSerializer);
                    if (getinflatedid != null) {
                        this.ParcelableVolumeInfo.remove(jSerializer);
                        this.MediaSessionCompatQueueItem.removeAt(size);
                        serializer(new FeatureCombinationQueryImplExternalSyntheticLambda2(getinflatedid, null, settitlemarginstart));
                    }
                } else {
                    PlaybackStateCompat();
                }
            }
        }
    }

    public final void PlaybackStateCompat() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.ParcelableVolumeInfo.size() != 0 && this.MediaSessionCompatQueueItem.size() != 0) {
                long jKeyAt = this.ParcelableVolumeInfo.keyAt(0);
                long jKeyAt2 = this.MediaSessionCompatQueueItem.keyAt(0);
                coil3.util.UtilsKt.serializer(!Long.valueOf(jKeyAt2).equals(Long.valueOf(jKeyAt)));
                if (jKeyAt2 <= jKeyAt) {
                    int size = this.MediaSessionCompatQueueItem.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else if (this.MediaSessionCompatQueueItem.keyAt(size) < jKeyAt) {
                            this.MediaSessionCompatQueueItem.removeAt(size);
                        }
                    }
                } else {
                    int size2 = this.ParcelableVolumeInfo.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else if (this.ParcelableVolumeInfo.keyAt(size2) < jKeyAt2) {
                            ((getInflatedId) this.ParcelableVolumeInfo.valueAt(size2)).close();
                            this.ParcelableVolumeInfo.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // o.getDefaultImageFormat
    public final Surface RatingCompat() {
        Surface surfaceRatingCompat;
        synchronized (this.MediaBrowserCompatMediaItem) {
            surfaceRatingCompat = this.MediaDescriptionCompat.RatingCompat();
        }
        return surfaceRatingCompat;
    }

    @Override // o.getDefaultImageFormat
    public final int RemoteActionCompatParcelizer() {
        int iRemoteActionCompatParcelizer;
        synchronized (this.MediaBrowserCompatMediaItem) {
            iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        }
        return iRemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(getDefaultImageFormat getdefaultimageformat) {
        getInflatedId getinflatedidIconCompatParcelizer;
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.read) {
                return;
            }
            int size = this.ParcelableVolumeInfo.size() + this.RatingCompat.size();
            if (size >= getdefaultimageformat.MediaMetadataCompat()) {
                setInflatedId.IconCompatParcelizer(3, "MetadataImageReader");
                return;
            }
            do {
                try {
                    getinflatedidIconCompatParcelizer = getdefaultimageformat.IconCompatParcelizer();
                    if (getinflatedidIconCompatParcelizer != null) {
                        this.PlaybackStateCompatCustomAction--;
                        size++;
                        this.ParcelableVolumeInfo.put(getinflatedidIconCompatParcelizer.read().serializer(), getinflatedidIconCompatParcelizer);
                        MediaSessionCompatQueueItem();
                    }
                } catch (IllegalStateException unused) {
                    setInflatedId.IconCompatParcelizer(3, "MetadataImageReader");
                    getinflatedidIconCompatParcelizer = null;
                }
                if (getinflatedidIconCompatParcelizer == null || this.PlaybackStateCompatCustomAction <= 0) {
                    break;
                }
            } while (size < getdefaultimageformat.MediaMetadataCompat());
        }
    }

    @Override // o.getDefaultImageFormat
    public final void RemoteActionCompatParcelizer(getSurfaceClass getsurfaceclass, Executor executor) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            getsurfaceclass.getClass();
            this.MediaMetadataCompat = getsurfaceclass;
            executor.getClass();
            this.IconCompatParcelizer = executor;
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.MediaSessionCompatToken, executor);
        }
    }

    @Override // o.getDefaultImageFormat
    public final void read() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.MediaDescriptionCompat.read();
            this.MediaMetadataCompat = null;
            this.IconCompatParcelizer = null;
            this.PlaybackStateCompatCustomAction = 0;
        }
    }

    public final void read(getTitleTextView gettitletextview) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            int iIndexOf = this.RatingCompat.indexOf(gettitletextview);
            if (iIndexOf >= 0) {
                this.RatingCompat.remove(iIndexOf);
                int i = this.write;
                if (iIndexOf <= i) {
                    this.write = i - 1;
                }
            }
            this.serializer.remove(gettitletextview);
            if (this.PlaybackStateCompatCustomAction > 0) {
                RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
            }
        }
    }

    @Override // o.getDefaultImageFormat
    public final void serializer() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.read) {
                return;
            }
            Iterator it = new ArrayList(this.RatingCompat).iterator();
            while (it.hasNext()) {
                ((getInflatedId) it.next()).close();
            }
            this.RatingCompat.clear();
            this.MediaDescriptionCompat.serializer();
            this.read = true;
        }
    }

    public final void serializer(FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2) {
        getSurfaceClass getsurfaceclass;
        Executor executor;
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.RatingCompat.size() < MediaMetadataCompat()) {
                featureCombinationQueryImplExternalSyntheticLambda2.RemoteActionCompatParcelizer(this);
                this.RatingCompat.add(featureCombinationQueryImplExternalSyntheticLambda2);
                getsurfaceclass = this.MediaMetadataCompat;
                executor = this.IconCompatParcelizer;
            } else {
                setInflatedId.IconCompatParcelizer(3, "TAG");
                featureCombinationQueryImplExternalSyntheticLambda2.close();
                getsurfaceclass = null;
                executor = null;
            }
        }
        if (getsurfaceclass != null) {
            if (executor != null) {
                executor.execute(new CameraX$$ExternalSyntheticLambda2(this, 14, getsurfaceclass));
            } else {
                getsurfaceclass.RemoteActionCompatParcelizer(this);
            }
        }
    }

    @Override // o.getTitleMarginEnd
    public final void serializer(getTitleTextView gettitletextview) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            read(gettitletextview);
        }
    }

    @Override // o.getDefaultImageFormat
    public final getInflatedId write() {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (this.RatingCompat.isEmpty()) {
                return null;
            }
            if (this.write >= this.RatingCompat.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.RatingCompat.size() - 1; i++) {
                if (!this.serializer.contains(this.RatingCompat.get(i))) {
                    arrayList.add((getInflatedId) this.RatingCompat.get(i));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((getInflatedId) it.next()).close();
            }
            int size = this.RatingCompat.size();
            ArrayList arrayList2 = this.RatingCompat;
            this.write = size;
            getInflatedId getinflatedid = (getInflatedId) arrayList2.get(size - 1);
            this.serializer.add(getinflatedid);
            return getinflatedid;
        }
    }
}
