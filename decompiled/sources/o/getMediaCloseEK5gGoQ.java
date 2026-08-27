package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaCloseEK5gGoQ extends getLastChannelEK5gGoQ {
    public static final Object[] read;
    public static final getMediaCloseEK5gGoQ write;
    public final transient int MediaDescriptionCompat;
    public final transient Object[] MediaMetadataCompat;
    public final transient int MediaSessionCompatQueueItem;
    public final transient int RatingCompat;
    public final transient Object[] RemoteActionCompatParcelizer;

    static {
        Object[] objArr = new Object[0];
        read = objArr;
        write = new getMediaCloseEK5gGoQ(0, 0, 0, objArr, objArr);
    }

    @Override // o.getKanaEK5gGoQ
    public final Object[] IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getKanaEK5gGoQ
    public final int RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.getLastChannelEK5gGoQ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.getKanaEK5gGoQ
    public final int read(Object[] objArr) {
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        int i = this.MediaSessionCompatQueueItem;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.getKanaEK5gGoQ
    public final int write() {
        return 0;
    }

    @Override // o.getKanaEK5gGoQ, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.MediaMetadataCompat;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.RatingCompat;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    public getMediaCloseEK5gGoQ(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.RemoteActionCompatParcelizer = objArr;
        this.MediaDescriptionCompat = i;
        this.MediaMetadataCompat = objArr2;
        this.RatingCompat = i2;
        this.MediaSessionCompatQueueItem = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        getLeftBracketEK5gGoQ getleftbracketek5ggoqRemoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (getleftbracketek5ggoqRemoteActionCompatParcelizer == null) {
            getleftbracketek5ggoqRemoteActionCompatParcelizer = getLeftBracketEK5gGoQ.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer = getleftbracketek5ggoqRemoteActionCompatParcelizer;
        }
        return getleftbracketek5ggoqRemoteActionCompatParcelizer.listIterator(0);
    }
}
