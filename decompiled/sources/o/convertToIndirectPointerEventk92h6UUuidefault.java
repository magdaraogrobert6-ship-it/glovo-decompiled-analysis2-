package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class convertToIndirectPointerEventk92h6UUuidefault extends getSuppressMovementConsumption {
    public final transient ContentScaleKt IconCompatParcelizer;
    public final transient localToScreen58bKbWc RemoteActionCompatParcelizer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int IconCompatParcelizer(int i, Object[] objArr) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.get(obj) != null;
    }

    public convertToIndirectPointerEventk92h6UUuidefault(ContentScaleKt contentScaleKt, localToScreen58bKbWc localtoscreen58bkbwc) {
        this.IconCompatParcelizer = contentScaleKt;
        this.RemoteActionCompatParcelizer = localtoscreen58bkbwc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.RemoteActionCompatParcelizer.listIterator(0);
    }
}
