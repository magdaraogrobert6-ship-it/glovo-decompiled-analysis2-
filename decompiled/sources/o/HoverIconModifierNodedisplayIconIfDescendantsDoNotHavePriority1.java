package o;

import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class HoverIconModifierNodedisplayIconIfDescendantsDoNotHavePriority1 extends getMotionEvent {
    public final /* synthetic */ getMotionEvent IconCompatParcelizer;
    public final transient int read;
    public final transient int serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    public HoverIconModifierNodedisplayIconIfDescendantsDoNotHavePriority1(getMotionEvent getmotionevent, int i, int i2) {
        this.IconCompatParcelizer = getmotionevent;
        this.read = i;
        this.serializer = i2;
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final Object[] IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // java.util.List
    public final Object get(int i) {
        TuplesKt.RemoteActionCompatParcelizer(i, this.serializer);
        return this.IconCompatParcelizer.get(i + this.read);
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int serializer() {
        return this.IconCompatParcelizer.serializer() + this.read;
    }

    @Override // o.getMotionEvent, java.util.List
    /* JADX INFO: renamed from: serializer */
    public final getMotionEvent subList(int i, int i2) {
        TuplesKt.RemoteActionCompatParcelizer(i, i2, this.serializer);
        int i3 = this.read;
        return this.IconCompatParcelizer.subList(i + i3, i2 + i3);
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int write() {
        return this.IconCompatParcelizer.serializer() + this.read + this.serializer;
    }
}
