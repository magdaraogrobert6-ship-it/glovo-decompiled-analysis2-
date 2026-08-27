package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.BaseContentCardView;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes4.dex */
public final class ReversedListReadOnly extends AbstractList {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int write = 0;

    public ReversedListReadOnly(List list) {
        list.getClass();
        this.IconCompatParcelizer = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i2 == 0) {
            return ((List) obj).get(onContentCardDismissed.write(i, this));
        }
        String strGroup = ((getIsCurrentlyDisplayingInAppMessage) obj).IconCompatParcelizer.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.write;
        Object obj = this.IconCompatParcelizer;
        return i != 0 ? ((getIsCurrentlyDisplayingInAppMessage) obj).IconCompatParcelizer.groupCount() + 1 : ((List) obj).size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        if (this.write != 1) {
            return super.contains(obj);
        }
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        if (this.write != 1) {
            return super.indexOf(obj);
        }
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return this.write != 0 ? super.iterator() : new BaseContentCardView(this, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        if (this.write != 1) {
            return super.lastIndexOf(obj);
        }
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator() {
        return this.write != 0 ? super.listIterator() : new BaseContentCardView(this, 0);
    }

    public ReversedListReadOnly(getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage) {
        this.IconCompatParcelizer = getiscurrentlydisplayinginappmessage;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return this.write != 0 ? super.listIterator(i) : new BaseContentCardView(this, i);
    }
}
