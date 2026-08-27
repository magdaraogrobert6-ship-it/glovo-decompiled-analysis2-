package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class blur1fqSgwdefault implements Iterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public Map.Entry RatingCompat;
    public final Iterator RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final setAlpha serializer;
    public Map.Entry write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RatingCompat != null;
    }

    public blur1fqSgwdefault(setAlpha setalpha, Iterator it, int i) {
        this.read = i;
        this.serializer = setalpha;
        this.RemoteActionCompatParcelizer = it;
        this.IconCompatParcelizer = setalpha.read().read;
        serializer();
    }

    @Override // java.util.Iterator
    public final void remove() {
        setAlpha setalpha = this.serializer;
        if (setalpha.read().read != this.IconCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return;
        }
        Map.Entry entry = this.write;
        if (entry == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        setalpha.remove(entry.getKey());
        this.write = null;
        this.IconCompatParcelizer = setalpha.read().read;
    }

    public final void serializer() {
        this.write = this.RatingCompat;
        Iterator it = this.RemoteActionCompatParcelizer;
        this.RatingCompat = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.read;
        if (i == 0) {
            Map.Entry entry = this.RatingCompat;
            if (entry != null) {
                serializer();
                return entry.getKey();
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return null;
        }
        if (i == 1) {
            serializer();
            if (this.write != null) {
                return new blurF8QBwvs(this);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return null;
        }
        Map.Entry entry2 = this.RatingCompat;
        if (entry2 != null) {
            serializer();
            return entry2.getValue();
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }
}
