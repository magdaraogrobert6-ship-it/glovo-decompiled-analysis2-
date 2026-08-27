package o;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class getTitleTextView implements getInflatedId {
    public final getInflatedId IconCompatParcelizer;
    public final Object serializer = new Object();
    public final HashSet read = new HashSet();

    @Override // o.getInflatedId
    public Toolbar4[] IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.getInflatedId
    public int RatingCompat() {
        return this.IconCompatParcelizer.RatingCompat();
    }

    @Override // o.getInflatedId
    public final android.media.Image RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(getTitleMarginEnd gettitlemarginend) {
        synchronized (this.serializer) {
            this.read.add(gettitlemarginend);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.IconCompatParcelizer.close();
        synchronized (this.serializer) {
            hashSet = new HashSet(this.read);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((getTitleMarginEnd) it.next()).serializer(this);
        }
    }

    @Override // o.getInflatedId
    public setTitleMarginStart read() {
        return this.IconCompatParcelizer.read();
    }

    @Override // o.getInflatedId
    public int serializer() {
        return this.IconCompatParcelizer.serializer();
    }

    @Override // o.getInflatedId
    public final int write() {
        return this.IconCompatParcelizer.write();
    }

    public getTitleTextView(getInflatedId getinflatedid) {
        this.IconCompatParcelizer = getinflatedid;
    }
}
