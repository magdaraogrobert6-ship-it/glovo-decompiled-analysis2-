package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class accesscalculateScrollDeltaI_oMVgE implements displayInAppMessagelambda11, Set {
    public final isMaxVisibleEQwtKwdefault RemoteActionCompatParcelizer;
    public final isMaxVisibleEQwtKwdefault write;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.write.read(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.write.read == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new verifyOrientationStatuslambda0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.write.read;
    }

    public final String toString() {
        return this.write.toString();
    }

    public accesscalculateScrollDeltaI_oMVgE(isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault) {
        ismaxvisibleeqwtkwdefault.getClass();
        this.write = ismaxvisibleeqwtkwdefault;
        this.RemoteActionCompatParcelizer = ismaxvisibleeqwtkwdefault;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.RemoteActionCompatParcelizer;
        ismaxvisibleeqwtkwdefault.getClass();
        int i = ismaxvisibleeqwtkwdefault.read;
        for (Object obj : collection) {
            int iWrite = ismaxvisibleeqwtkwdefault.write(obj);
            ismaxvisibleeqwtkwdefault.RemoteActionCompatParcelizer[iWrite] = obj;
            long[] jArr = ismaxvisibleeqwtkwdefault.MediaMetadataCompat;
            int i2 = ismaxvisibleeqwtkwdefault.IconCompatParcelizer;
            jArr[iWrite] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iWrite) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            ismaxvisibleeqwtkwdefault.IconCompatParcelizer = iWrite;
            if (ismaxvisibleeqwtkwdefault.RatingCompat == Integer.MAX_VALUE) {
                ismaxvisibleeqwtkwdefault.RatingCompat = iWrite;
            }
        }
        return i != ismaxvisibleeqwtkwdefault.read;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.write.read(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.RemoteActionCompatParcelizer.write(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it;
        int iNumberOfTrailingZeros;
        collection.getClass();
        isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.RemoteActionCompatParcelizer;
        ismaxvisibleeqwtkwdefault.getClass();
        int i = ismaxvisibleeqwtkwdefault.read;
        Iterator it2 = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = ismaxvisibleeqwtkwdefault.write;
            int i6 = (i4 >>> 7) & i5;
            while (true) {
                long[] jArr = ismaxvisibleeqwtkwdefault.MediaDescriptionCompat;
                int i7 = i6 >> 3;
                int i8 = (i6 & 7) << 3;
                int i9 = i3;
                long j = (((-i8) >> 63) & (jArr[i7 + i2] << (64 - i8))) | (jArr[i7] >>> i8);
                long j2 = (((long) (i4 & 127)) * 72340172838076673L) ^ j;
                it = it2;
                for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{ismaxvisibleeqwtkwdefault.RemoteActionCompatParcelizer[iNumberOfTrailingZeros], next}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                }
                if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 = i9 + 8;
                i6 = (i6 + i3) & i5;
                it2 = it;
                i2 = 1;
            }
            if (iNumberOfTrailingZeros >= 0) {
                ismaxvisibleeqwtkwdefault.IconCompatParcelizer(iNumberOfTrailingZeros);
            }
            it2 = it;
        }
        return i != ismaxvisibleeqwtkwdefault.read;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accesscalculateScrollDeltaI_oMVgE.class != obj.getClass()) {
            return false;
        }
        Object[] objArr = {this.write, ((accesscalculateScrollDeltaI_oMVgE) obj).write};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}
