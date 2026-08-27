package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class MyersDiffKt extends accessswap {
    public final Comparator IconCompatParcelizer;
    public final Object[] read;
    public final Object[] write;

    @Override // o.accessswap
    public final Comparator IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.accessswap
    public final boolean serializer(Object obj) {
        return read(obj) != -1;
    }

    @Override // o.accessswap
    public final Iterator write(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.write;
            if (i >= objArr.length || this.IconCompatParcelizer.compare(objArr[i], obj) >= 0) {
                break;
            }
            i++;
        }
        return new CommonDomainCompanion(this, i);
    }

    public MyersDiffKt() {
        wg$$ExternalSyntheticLambda0 wg__externalsyntheticlambda0 = visitNodes.write;
        this.write = new Object[0];
        this.read = new Object[0];
        this.IconCompatParcelizer = wg__externalsyntheticlambda0;
    }

    @Override // o.accessswap
    public final int RemoteActionCompatParcelizer() {
        return this.write.length;
    }

    public final int read(Object obj) {
        int i = 0;
        for (Object obj2 : this.write) {
            if (this.IconCompatParcelizer.compare(obj, obj2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o.accessswap
    public final Object read() {
        Object[] objArr = this.write;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // o.accessswap
    public final boolean serializer() {
        return this.write.length == 0;
    }

    @Override // o.accessswap
    public final Object write() {
        Object[] objArr = this.write;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CommonDomainCompanion(this, 0);
    }

    @Override // o.accessswap
    public final accessswap RemoteActionCompatParcelizer(Object obj, Object obj2) {
        int i = read(obj);
        Comparator comparator = this.IconCompatParcelizer;
        Object[] objArr = this.read;
        Object[] objArr2 = this.write;
        if (i != -1) {
            if (objArr2[i] == obj && objArr[i] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[i] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[i] = obj2;
            return new MyersDiffKt(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                map.put(objArr2[i2], objArr[i2]);
            }
            map.put(obj, obj2);
            return androidx.transition.TransitionValuesMaps.write(new ArrayList(map.keySet()), map, comparator);
        }
        int i3 = 0;
        while (i3 < objArr2.length && comparator.compare(objArr2[i3], obj) < 0) {
            i3++;
        }
        int length3 = objArr2.length + 1;
        Object[] objArr5 = new Object[length3];
        System.arraycopy(objArr2, 0, objArr5, 0, i3);
        objArr5[i3] = obj;
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i3, objArr5, i4, (length3 - i3) - 1);
        int length4 = objArr.length + 1;
        Object[] objArr6 = new Object[length4];
        System.arraycopy(objArr, 0, objArr6, 0, i3);
        objArr6[i3] = obj2;
        System.arraycopy(objArr, i3, objArr6, i4, (length4 - i3) - 1);
        return new MyersDiffKt(comparator, objArr5, objArr6);
    }

    @Override // o.accessswap
    public final Object IconCompatParcelizer(visitNodes visitnodes) {
        int i = read(visitnodes);
        if (i != -1) {
            return this.read[i];
        }
        return null;
    }

    @Override // o.accessswap
    public final accessswap RemoteActionCompatParcelizer(Object obj) {
        int i = read(obj);
        if (i == -1) {
            return this;
        }
        Object[] objArr = this.write;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr2, i, length - i);
        Object[] objArr3 = this.read;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, i);
        System.arraycopy(objArr3, i2, objArr4, i, length2 - i);
        return new MyersDiffKt(this.IconCompatParcelizer, objArr2, objArr4);
    }

    public MyersDiffKt(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.write = objArr;
        this.read = objArr2;
        this.IconCompatParcelizer = comparator;
    }
}
