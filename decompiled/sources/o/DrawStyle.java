package o;

/* JADX INFO: loaded from: classes.dex */
public final class DrawStyle extends ImageKt {
    public int MediaBrowserCompatMediaItem;

    @Override // o.processDragGesture
    public final Object RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatMediaItem = 0;
        return super.RemoteActionCompatParcelizer(i);
    }

    @Override // o.processDragGesture
    public final void RemoteActionCompatParcelizer(ImageKt imageKt) {
        this.MediaBrowserCompatMediaItem = 0;
        super.RemoteActionCompatParcelizer(imageKt);
    }

    @Override // o.processDragGesture, java.util.Map
    public final void clear() {
        this.MediaBrowserCompatMediaItem = 0;
        super.clear();
    }

    @Override // o.processDragGesture, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.MediaBrowserCompatMediaItem = 0;
        return super.put(obj, obj2);
    }

    @Override // o.processDragGesture
    public final Object write(int i, Object obj) {
        this.MediaBrowserCompatMediaItem = 0;
        return super.write(i, obj);
    }

    @Override // o.processDragGesture, java.util.Map
    public final int hashCode() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            this.MediaBrowserCompatMediaItem = super.hashCode();
        }
        return this.MediaBrowserCompatMediaItem;
    }

    public DrawStyle(int i) {
        super(i);
    }
}
