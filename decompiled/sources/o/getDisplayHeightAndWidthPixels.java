package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getDisplayHeightAndWidthPixels implements Closeable {
    public int MediaDescriptionCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean write;
    public int[] read = new int[32];
    public String[] IconCompatParcelizer = new String[32];
    public int[] serializer = new int[32];

    public abstract void IconCompatParcelizer();

    public abstract boolean MediaBrowserCompatMediaItem();

    public abstract long MediaDescriptionCompat();

    public abstract double MediaMetadataCompat();

    public abstract int MediaSessionCompatQueueItem();

    public abstract void MediaSessionCompatResultReceiverWrapper();

    public abstract getLocalBitmaplambda3 MediaSessionCompatToken();

    public abstract void ParcelableVolumeInfo();

    public abstract String PlaybackStateCompat();

    public abstract void PlaybackStateCompatCustomAction();

    public abstract boolean RatingCompat();

    public abstract void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();

    public abstract void read();

    public abstract int serializer(getLocalBitmap getlocalbitmap);

    public abstract void serializer();

    public abstract int write(getLocalBitmap getlocalbitmap);

    public abstract void write();

    public final String RemoteActionCompatParcelizer() {
        return getLocalBitmaplambda2.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, this.read, this.IconCompatParcelizer, this.serializer);
    }

    public final com.squareup.moshi.JsonDataException write(Object obj, Object obj2) {
        if (obj == null) {
            return new com.squareup.moshi.JsonDataException("Expected " + obj2 + " but was null at path " + RemoteActionCompatParcelizer());
        }
        return new com.squareup.moshi.JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + RemoteActionCompatParcelizer());
    }

    public final void write(int i) {
        int i2 = this.MediaDescriptionCompat;
        int[] iArr = this.read;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new com.squareup.moshi.JsonDataException("Nesting too deep at ".concat(RemoteActionCompatParcelizer()));
            }
            this.read = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.IconCompatParcelizer;
            this.IconCompatParcelizer = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.serializer;
            this.serializer = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.read;
        int i3 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i3 + 1;
        iArr3[i3] = i;
    }

    public final void serializer(String str) throws com.squareup.moshi.JsonEncodingException {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " at path ");
        sbM.append(RemoteActionCompatParcelizer());
        throw new com.squareup.moshi.JsonEncodingException(sbM.toString());
    }
}
