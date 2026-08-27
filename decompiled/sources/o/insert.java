package o;

/* JADX INFO: loaded from: classes2.dex */
public final class insert extends undelegateUnprotectedui {
    public static final Object[] RemoteActionCompatParcelizer;
    public static final insert serializer;
    public final transient int MediaBrowserCompatMediaItem;
    public final transient Object[] MediaDescriptionCompat;
    public final transient int MediaMetadataCompat;
    public final transient Object[] MediaSessionCompatQueueItem;
    public final transient int RatingCompat;

    static {
        Object[] objArr = new Object[0];
        RemoteActionCompatParcelizer = objArr;
        serializer = new insert(0, 0, 0, objArr, objArr);
    }

    @Override // o.getSelfKindSetui
    public final int IconCompatParcelizer() {
        return 0;
    }

    @Override // o.getSelfKindSetui
    public final int RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.undelegateUnprotectedui, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.MediaMetadataCompat;
    }

    @Override // o.getSelfKindSetui
    public final Object[] write() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.undelegateUnprotectedui
    public final delegateUnprotectedui MediaMetadataCompat() {
        return delegateUnprotectedui.IconCompatParcelizer(this.MediaMetadataCompat, this.MediaSessionCompatQueueItem);
    }

    public insert(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.MediaSessionCompatQueueItem = objArr;
        this.MediaBrowserCompatMediaItem = i;
        this.MediaDescriptionCompat = objArr2;
        this.RatingCompat = i2;
        this.MediaMetadataCompat = i3;
    }

    @Override // o.getSelfKindSetui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.MediaDescriptionCompat;
            if (objArr.length != 0) {
                int iIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(obj.hashCode());
                while (true) {
                    int i = iIconCompatParcelizer & this.RatingCompat;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iIconCompatParcelizer = i + 1;
                }
            }
        }
        return false;
    }

    @Override // o.getSelfKindSetui
    public final int write(int i, Object[] objArr) {
        Object[] objArr2 = this.MediaSessionCompatQueueItem;
        int i2 = this.MediaMetadataCompat;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // o.undelegateUnprotectedui
    /* JADX INFO: renamed from: RatingCompat */
    public final same iterator() {
        return read().listIterator(0);
    }
}
