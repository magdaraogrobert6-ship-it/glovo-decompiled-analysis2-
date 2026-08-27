package kotlinx.collections.immutable.implementations.immutableList;

import coil3.ExtrasKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import o.onContentCardClicked;
import o.r8lambdaHTsCsUWMsb8X9dr8boPncicWuA;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0;

/* JADX INFO: loaded from: classes4.dex */
public final class SmallPersistentVector extends r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ {
    public static final SmallPersistentVector RemoteActionCompatParcelizer = new SmallPersistentVector(new Object[0]);
    public final Object[] serializer;

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.serializer.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return onContentCardClicked.read(this.serializer, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return onContentCardClicked.write(this.serializer, obj);
    }

    public final r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 serializer() {
        return new r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0(this, null, this.serializer, 0);
    }

    public SmallPersistentVector(Object[] objArr) {
        this.serializer = objArr;
    }

    public final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ read(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        if (collection.size() + size() > 32) {
            r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer = serializer();
            r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.addAll(collection);
            return r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.read();
        }
        int size = size();
        Object[] objArrCopyOf = Arrays.copyOf(this.serializer, collection.size() + size);
        int size2 = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size2] = it.next();
            size2++;
        }
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        ExtrasKt.serializer(i, size());
        return this.serializer[i];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ExtrasKt.RemoteActionCompatParcelizer(i, size());
        return new r8lambdaHTsCsUWMsb8X9dr8boPncicWuA(i, size(), this.serializer);
    }
}
