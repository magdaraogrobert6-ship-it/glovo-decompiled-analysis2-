package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentScaleCompanionFit1 extends getFillHeight {
    public final transient ContentScaleCompanionInside1 serializer;
    public final transient ContentScaleKt write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.write.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.write.getClass();
        return 1;
    }

    @Override // o.getCropannotations
    public final int write(Object[] objArr) {
        return this.serializer.write(objArr);
    }

    public ContentScaleCompanionFit1(ContentScaleKt contentScaleKt, ContentScaleCompanionInside1 contentScaleCompanionInside1) {
        this.write = contentScaleKt;
        this.serializer = contentScaleCompanionInside1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.serializer.listIterator(0);
    }
}
