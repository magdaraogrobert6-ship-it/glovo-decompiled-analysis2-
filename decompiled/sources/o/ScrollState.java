package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScrollState implements Iterator, displayInAppMessagelambda121 {
    public int MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public boolean write;

    public abstract Object read(int i);

    public abstract void serializer(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.MediaMetadataCompat;
    }

    public ScrollState(int i) {
        this.MediaMetadataCompat = i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.write) {
            ForEachGestureKt.write("Call next() before removing an element.");
            throw null;
        }
        int i = this.RemoteActionCompatParcelizer - 1;
        this.RemoteActionCompatParcelizer = i;
        serializer(i);
        this.MediaMetadataCompat--;
        this.write = false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object obj = read(this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer++;
        this.write = true;
        return obj;
    }
}
