package o;

import java.util.Objects;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class MatrixPositionCalculator extends getMotionEvent {
    public static final MatrixPositionCalculator IconCompatParcelizer = new MatrixPositionCalculator(0, new Object[0]);
    public final transient int read;
    public final transient Object[] serializer;

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final Object[] IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int serializer() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int write() {
        return this.read;
    }

    @Override // java.util.List
    public final Object get(int i) {
        TuplesKt.RemoteActionCompatParcelizer(i, this.read);
        Object obj = this.serializer[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public MatrixPositionCalculator(int i, Object[] objArr) {
        this.serializer = objArr;
        this.read = i;
    }

    @Override // o.getMotionEvent, o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int IconCompatParcelizer(int i, Object[] objArr) {
        Object[] objArr2 = this.serializer;
        int i2 = this.read;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }
}
