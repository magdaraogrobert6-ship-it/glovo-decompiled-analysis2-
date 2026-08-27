package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class setBlockui implements Comparable {
    public float IconCompatParcelizer;
    public DrawWithCacheElement MediaBrowserCompatMediaItem;
    public boolean RemoteActionCompatParcelizer;
    public int serializer = -1;
    public int MediaSessionCompatQueueItem = -1;
    public int PlaybackStateCompatCustomAction = 0;
    public boolean read = false;
    public final float[] MediaMetadataCompat = new float[9];
    public final float[] RatingCompat = new float[9];
    public drawWithContent[] write = new drawWithContent[16];
    public int MediaDescriptionCompat = 0;
    public int ParcelableVolumeInfo = 0;

    public final void serializer(drawWithContent drawwithcontent) {
        int i = 0;
        while (true) {
            int i2 = this.MediaDescriptionCompat;
            drawWithContent[] drawwithcontentArr = this.write;
            if (i >= i2) {
                if (i2 >= drawwithcontentArr.length) {
                    this.write = (drawWithContent[]) Arrays.copyOf(drawwithcontentArr, drawwithcontentArr.length * 2);
                }
                drawWithContent[] drawwithcontentArr2 = this.write;
                int i3 = this.MediaDescriptionCompat;
                drawwithcontentArr2[i3] = drawwithcontent;
                this.MediaDescriptionCompat = i3 + 1;
                return;
            }
            if (drawwithcontentArr[i] == drawwithcontent) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatMediaItem = DrawWithCacheElement.UNKNOWN;
        this.PlaybackStateCompatCustomAction = 0;
        this.serializer = -1;
        this.MediaSessionCompatQueueItem = -1;
        this.IconCompatParcelizer = 0.0f;
        this.read = false;
        int i = this.MediaDescriptionCompat;
        for (int i2 = 0; i2 < i; i2++) {
            this.write[i2] = null;
        }
        this.MediaDescriptionCompat = 0;
        this.ParcelableVolumeInfo = 0;
        this.RemoteActionCompatParcelizer = false;
        Arrays.fill(this.RatingCompat, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.serializer - ((setBlockui) obj).serializer;
    }

    public final void RemoteActionCompatParcelizer(DrawWithContentElement drawWithContentElement, float f) {
        this.IconCompatParcelizer = f;
        this.read = true;
        int i = this.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.write[i2].RemoteActionCompatParcelizer(drawWithContentElement, this, false);
        }
        this.MediaDescriptionCompat = 0;
    }

    public setBlockui(DrawWithCacheElement drawWithCacheElement) {
        this.MediaBrowserCompatMediaItem = drawWithCacheElement;
    }

    public final String toString() {
        return "" + this.serializer;
    }

    public final void RemoteActionCompatParcelizer(drawWithContent drawwithcontent) {
        int i = this.MediaDescriptionCompat;
        int i2 = 0;
        while (i2 < i) {
            if (this.write[i2] == drawwithcontent) {
                while (i2 < i - 1) {
                    drawWithContent[] drawwithcontentArr = this.write;
                    int i3 = i2 + 1;
                    drawwithcontentArr[i2] = drawwithcontentArr[i3];
                    i2 = i3;
                }
                this.MediaDescriptionCompat--;
                return;
            }
            i2++;
        }
    }

    public final void serializer(DrawWithContentElement drawWithContentElement, drawWithContent drawwithcontent) {
        int i = this.MediaDescriptionCompat;
        for (int i2 = 0; i2 < i; i2++) {
            this.write[i2].serializer(drawWithContentElement, drawwithcontent, false);
        }
        this.MediaDescriptionCompat = 0;
    }
}
