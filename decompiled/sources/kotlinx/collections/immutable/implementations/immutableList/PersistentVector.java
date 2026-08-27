package kotlinx.collections.immutable.implementations.immutableList;

import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import java.util.ListIterator;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaM0iQdkzzA5f2EfspnKZe612jafc;

/* JADX INFO: loaded from: classes4.dex */
public final class PersistentVector extends r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ {
    public final int IconCompatParcelizer;
    public final Object[] RemoteActionCompatParcelizer;
    public final int read;
    public final Object[] write;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.IconCompatParcelizer;
    }

    public PersistentVector(int i, int i2, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        this.write = objArr;
        this.RemoteActionCompatParcelizer = objArr2;
        this.IconCompatParcelizer = i;
        this.read = i2;
        if (size() > 32) {
            size();
            size();
        } else {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ExtrasKt.serializer(i, size());
        if (((size() - 1) & (-32)) <= i) {
            objArr = this.RemoteActionCompatParcelizer;
        } else {
            objArr = this.write;
            for (int i2 = this.read; i2 > 0; i2 -= 5) {
                Object obj = objArr[UtilsKt.RemoteActionCompatParcelizer(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ExtrasKt.RemoteActionCompatParcelizer(i, size());
        return new r8lambdaM0iQdkzzA5f2EfspnKZe612jafc(i, size(), (this.read / 5) + 1, this.write, this.RemoteActionCompatParcelizer);
    }
}
