package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public class findOverridingAncestorNode implements Iterator {
    public final Iterator IconCompatParcelizer;
    public Collection RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 0;

    public findOverridingAncestorNode(getBeyondBoundsLayout getbeyondboundslayout) {
        this.serializer = getbeyondboundslayout;
        Collection collection = getbeyondboundslayout.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = collection;
        this.IconCompatParcelizer = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void IconCompatParcelizer() {
        getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) this.serializer;
        getbeyondboundslayout.serializer();
        if (getbeyondboundslayout.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.write;
        Iterator it = this.IconCompatParcelizer;
        if (i != 0) {
            IconCompatParcelizer();
            return it.next();
        }
        Map.Entry entry = (Map.Entry) it.next();
        this.RemoteActionCompatParcelizer = (Collection) entry.getValue();
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        getPointerIconService getpointericonservice = (getPointerIconService) ((getAfterhoxUOeE) this.serializer).read;
        getpointericonservice.getClass();
        List list = (List) collection;
        return new activeHoverEvent0FcD4WY(key, list instanceof RandomAccess ? new getTouchBoundsExpansionRZrCHBk(getpointericonservice, key, list, null) : new getBeyondBoundsLayout(getpointericonservice, key, list, (getBeyondBoundsLayout) null));
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.write;
        Object obj = this.serializer;
        Iterator it = this.IconCompatParcelizer;
        if (i != 0) {
            it.remove();
            ((getBeyondBoundsLayout) obj).read();
            return;
        }
        TuplesKt.RemoteActionCompatParcelizer(503622116, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{"no calls to next() since the last call to remove()", Boolean.valueOf(this.RemoteActionCompatParcelizer != null)}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -503622113);
        it.remove();
        ((getPointerIconService) ((getAfterhoxUOeE) obj).read).getClass();
        this.RemoteActionCompatParcelizer.size();
        this.RemoteActionCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.write == 0) {
            return this.IconCompatParcelizer.hasNext();
        }
        IconCompatParcelizer();
        return this.IconCompatParcelizer.hasNext();
    }

    public findOverridingAncestorNode(getAfterhoxUOeE getafterhoxuoee) {
        this.serializer = getafterhoxuoee;
        this.IconCompatParcelizer = getafterhoxuoee.write.entrySet().iterator();
    }

    public findOverridingAncestorNode(getBeyondBoundsLayout getbeyondboundslayout, ListIterator listIterator) {
        this.serializer = getbeyondboundslayout;
        this.RemoteActionCompatParcelizer = getbeyondboundslayout.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = listIterator;
    }
}
