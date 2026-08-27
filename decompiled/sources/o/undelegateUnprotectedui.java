package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class undelegateUnprotectedui extends getSelfKindSetui implements Set {
    public static final /* synthetic */ int read = 0;
    public transient delegateUnprotectedui write;

    public static int write(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            TextStreamsKt.read("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: RatingCompat, reason: merged with bridge method [inline-methods] */
    public abstract same iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return DiffCallback.serializer(this);
    }

    public delegateUnprotectedui MediaMetadataCompat() {
        Object[] array = toArray(getSelfKindSetui.IconCompatParcelizer);
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        return delegateUnprotectedui.IconCompatParcelizer(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof undelegateUnprotectedui) && (this instanceof insert) && (((undelegateUnprotectedui) obj) instanceof insert) && ((insert) this).MediaBrowserCompatMediaItem != obj.hashCode()) {
            return false;
        }
        return DiffCallback.RemoteActionCompatParcelizer(this, obj);
    }

    @Override // o.getSelfKindSetui
    public delegateUnprotectedui read() {
        delegateUnprotectedui delegateunprotectedui = this.write;
        if (delegateunprotectedui != null) {
            return delegateunprotectedui;
        }
        delegateUnprotectedui delegateunprotecteduiMediaMetadataCompat = MediaMetadataCompat();
        this.write = delegateunprotecteduiMediaMetadataCompat;
        return delegateunprotecteduiMediaMetadataCompat;
    }

    public static undelegateUnprotectedui RemoteActionCompatParcelizer(int i, Object... objArr) {
        if (i == 0) {
            return insert.serializer;
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
                    int iIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(iHashCode);
                    while (true) {
                        int i6 = iIconCompatParcelizer & i2;
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
                        iIconCompatParcelizer++;
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
                return new DepthSortedSetsForDifferentPassesWhenMappings(obj3);
            }
            if (write(i4) < iWrite / 2) {
                return RemoteActionCompatParcelizer(i4, objArr);
            }
            int length = objArr.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new insert(i3, i2, i4, objArr, objArr2);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new DepthSortedSetsForDifferentPassesWhenMappings(obj4);
    }

    public static undelegateUnprotectedui RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        TextStreamsKt.read("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return RemoteActionCompatParcelizer(length, objArr2);
    }
}
