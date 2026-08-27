package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonDomainCompanion implements Iterator {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public int read;

    public CommonDomainCompanion(NodeChain nodeChain) {
        this.IconCompatParcelizer = 4;
        this.RemoteActionCompatParcelizer = nodeChain;
        this.read = nodeChain.serializer - 1;
    }

    public getGEK5gGoQ IconCompatParcelizer() {
        getHenkanEK5gGoQ gethenkanek5ggoq = (getHenkanEK5gGoQ) this.RemoteActionCompatParcelizer;
        int i = this.read;
        ArrayList arrayList = gethenkanek5ggoq.serializer;
        if (i >= arrayList.size()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        for (int i2 = this.read; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                this.read = i2 + 1;
                return new getGEK5gGoQ(Double.valueOf(i2));
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return this.read < ((Object[]) obj).length;
        }
        if (i != 1) {
            if (i == 2) {
                return this.read < ((getInfoEK5gGoQ) obj).RemoteActionCompatParcelizer.length();
            }
            if (i != 3) {
                return this.read >= 0;
            }
            return this.read < ((MyersDiffKt) obj).write.length;
        }
        int i2 = this.read;
        while (true) {
            ArrayList arrayList = ((getHenkanEK5gGoQ) obj).serializer;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i2) != null) {
                return true;
            }
            i2++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            int i2 = this.read;
            Object[] objArr = (Object[]) obj;
            if (i2 != objArr.length) {
                this.read = i2 + 1;
                return objArr[i2];
            }
            throw new NoSuchElementException("Out of elements: " + i2);
        }
        if (i == 1) {
            return IconCompatParcelizer();
        }
        if (i == 2) {
            if (this.read >= ((getInfoEK5gGoQ) obj).RemoteActionCompatParcelizer.length()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            int i3 = this.read;
            this.read = i3 + 1;
            return new getGEK5gGoQ(Double.valueOf(i3));
        }
        if (i != 3) {
            int i4 = this.read;
            getOnVectorMutated getonvectormutated = new getOnVectorMutated();
            Math.pow(2.0d, i4);
            this.read--;
            return getonvectormutated;
        }
        MyersDiffKt myersDiffKt = (MyersDiffKt) obj;
        Object[] objArr2 = myersDiffKt.write;
        int i5 = this.read;
        Object obj2 = objArr2[i5];
        Object obj3 = myersDiffKt.read[i5];
        this.read = i5 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj2, obj3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        if (i == 2) {
            throw new UnsupportedOperationException();
        }
        if (i == 3) {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public CommonDomainCompanion(MyersDiffKt myersDiffKt, int i) {
        this.IconCompatParcelizer = 3;
        this.RemoteActionCompatParcelizer = myersDiffKt;
        this.read = i;
    }

    public /* synthetic */ CommonDomainCompanion(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = 0;
    }
}
