package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLastChannelEK5gGoQ extends getKanaEK5gGoQ implements Set {
    public transient getLeftBracketEK5gGoQ IconCompatParcelizer;

    public static int write(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof getLastChannelEK5gGoQ) && (this instanceof getMediaCloseEK5gGoQ) && (((getLastChannelEK5gGoQ) obj) instanceof getMediaCloseEK5gGoQ) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static getLastChannelEK5gGoQ IconCompatParcelizer(int i, Object... objArr) {
        if (i == 0) {
            return getMediaCloseEK5gGoQ.write;
        }
        if (i != 1) {
            int iWrite = write(i);
            Object[] objArr2 = new Object[iWrite];
            int i2 = iWrite - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                if (obj != null) {
                    int iHashCode = obj.hashCode();
                    int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
                    while (true) {
                        int i6 = iRotateLeft & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += iHashCode;
                            i4++;
                            break;
                        }
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iRotateLeft++;
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i5, "at index "));
                    return null;
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new getMEK5gGoQ(obj3);
            }
            if (write(i4) >= iWrite / 2) {
                if (i4 < 3) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new getMediaCloseEK5gGoQ(i3, i2, i4, objArr, objArr2);
            }
            return IconCompatParcelizer(i4, objArr);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new getMEK5gGoQ(obj4);
    }
}
