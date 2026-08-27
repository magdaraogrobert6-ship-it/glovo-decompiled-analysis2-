package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenHashSet<T> {
    public int RemoteActionCompatParcelizer;
    public int read;
    public Object[] serializer;
    public int write;

    public final void read(Disposable disposable) {
        Object obj;
        Object obj2;
        Object[] objArr = this.serializer;
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = disposable.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(disposable)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(disposable));
            return;
        }
        objArr[i2] = disposable;
        int i3 = this.write + 1;
        this.write = i3;
        if (i3 >= this.read) {
            Object[] objArr2 = this.serializer;
            int length = objArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            Object[] objArr3 = new Object[i4];
            while (i3 != 0) {
                do {
                    length--;
                    obj = objArr2[length];
                } while (obj == null);
                int iHashCode2 = obj.hashCode() * (-1640531527);
                int i6 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
                if (objArr3[i6] != null) {
                    do {
                        i6 = (i6 + 1) & i5;
                    } while (objArr3[i6] != null);
                }
                objArr3[i6] = objArr2[length];
                i3--;
            }
            this.RemoteActionCompatParcelizer = i5;
            this.read = (int) (i4 * 0.75f);
            this.serializer = objArr3;
        }
    }

    public final void serializer(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.write--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i4 = i3 + 1;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
