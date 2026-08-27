package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadDirectionRightEK5gGoQ implements Iterator {
    public final /* synthetic */ Iterator IconCompatParcelizer;
    public final /* synthetic */ Iterator serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.serializer.hasNext()) {
            return true;
        }
        return this.IconCompatParcelizer.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.serializer;
        if (it.hasNext()) {
            return new getNumPadSubtractEK5gGoQ(((Integer) it.next()).toString());
        }
        Iterator it2 = this.IconCompatParcelizer;
        if (it2.hasNext()) {
            return new getNumPadSubtractEK5gGoQ((String) it2.next());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    public getNumPadDirectionRightEK5gGoQ(getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq, Iterator it, Iterator it2) {
        this.serializer = it;
        this.IconCompatParcelizer = it2;
    }
}
