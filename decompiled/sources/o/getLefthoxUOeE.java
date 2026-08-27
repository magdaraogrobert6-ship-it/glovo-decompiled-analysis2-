package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class getLefthoxUOeE implements Iterator {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ Object read;
    public final Iterator serializer;
    public Object write;

    public getLefthoxUOeE(getBeyondBoundsLayout getbeyondboundslayout) {
        this.read = getbeyondboundslayout;
        Collection collection = getbeyondboundslayout.RemoteActionCompatParcelizer;
        this.write = collection;
        this.serializer = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void RemoteActionCompatParcelizer() {
        getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) this.read;
        getbeyondboundslayout.serializer();
        if (getbeyondboundslayout.RemoteActionCompatParcelizer == ((Collection) this.write)) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.IconCompatParcelizer;
        Iterator it = this.serializer;
        if (i != 0) {
            if (i != 1) {
                RemoteActionCompatParcelizer();
                return it.next();
            }
            Map.Entry entry = (Map.Entry) it.next();
            this.write = entry;
            return entry.getKey();
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        this.write = (Collection) entry2.getValue();
        getAfterhoxUOeE getafterhoxuoee = (getAfterhoxUOeE) this.read;
        Object key = entry2.getKey();
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) getafterhoxuoee.read;
        Collection collection = (Collection) entry2.getValue();
        getlambda641200809ui.getClass();
        List list = (List) collection;
        return new getFillBounds(key, list instanceof RandomAccess ? new BeyondBoundsLayoutProviderModifierNode(getlambda641200809ui, key, list, null) : new getBeyondBoundsLayout(getlambda641200809ui, key, list, (getBeyondBoundsLayout) null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return this.serializer.hasNext();
        }
        if (i == 1) {
            return this.serializer.hasNext();
        }
        RemoteActionCompatParcelizer();
        return this.serializer.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        Iterator it = this.serializer;
        if (i == 0) {
            if (((Collection) this.write) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("no calls to next() since the last call to remove()");
                return;
            }
            it.remove();
            ((getLambda641200809ui) ((getAfterhoxUOeE) obj).read).read -= ((Collection) this.write).size();
            ((Collection) this.write).clear();
            this.write = null;
            return;
        }
        if (i != 1) {
            it.remove();
            getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) obj;
            ((getLambda641200809ui) getbeyondboundslayout.MediaBrowserCompatMediaItem).read--;
            getbeyondboundslayout.read();
            return;
        }
        Map.Entry entry = (Map.Entry) this.write;
        if (entry == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("no calls to next() since the last call to remove()");
            return;
        }
        Collection collection = (Collection) entry.getValue();
        it.remove();
        ((getAbovehoxUOeE) obj).RemoteActionCompatParcelizer.read -= collection.size();
        collection.clear();
        this.write = null;
    }

    public getLefthoxUOeE(getBeyondBoundsLayout getbeyondboundslayout, ListIterator listIterator) {
        this.read = getbeyondboundslayout;
        this.write = getbeyondboundslayout.RemoteActionCompatParcelizer;
        this.serializer = listIterator;
    }

    public getLefthoxUOeE(getAfterhoxUOeE getafterhoxuoee) {
        this.read = getafterhoxuoee;
        this.serializer = getafterhoxuoee.write.entrySet().iterator();
    }

    public getLefthoxUOeE(getAbovehoxUOeE getabovehoxuoee, Iterator it) {
        this.read = getabovehoxuoee;
        this.serializer = it;
    }
}
