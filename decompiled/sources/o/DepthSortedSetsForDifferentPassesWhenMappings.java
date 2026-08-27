package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPassesWhenMappings extends undelegateUnprotectedui {
    public final transient Object serializer;

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // o.undelegateUnprotectedui
    /* JADX INFO: renamed from: RatingCompat */
    public final same iterator() {
        return popEach.IconCompatParcelizer(this.serializer);
    }

    @Override // o.getSelfKindSetui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.serializer.equals(obj);
    }

    @Override // o.undelegateUnprotectedui, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // o.undelegateUnprotectedui, o.getSelfKindSetui
    public final delegateUnprotectedui read() {
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        Object[] objArr = {this.serializer};
        coil3.util.ContextsKt.serializer(1, objArr);
        return delegateUnprotectedui.IconCompatParcelizer(1, objArr);
    }

    @Override // o.getSelfKindSetui
    public final int write(int i, Object[] objArr) {
        objArr[i] = this.serializer;
        return i + 1;
    }

    public DepthSortedSetsForDifferentPassesWhenMappings(Object obj) {
        this.serializer = obj;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.serializer.toString() + ']';
    }

    @Override // o.undelegateUnprotectedui, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return popEach.IconCompatParcelizer(this.serializer);
    }
}
