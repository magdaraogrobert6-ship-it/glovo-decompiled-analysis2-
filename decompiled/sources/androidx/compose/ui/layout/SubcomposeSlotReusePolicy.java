package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DragGestureDetectorKt;
import o.accesscalculateScrollDeltaI_oMVgE;
import o.displayInAppMessagelambda121;
import o.isMaxVisibleEQwtKwdefault;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4;

/* JADX INFO: loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {

    public static final class SlotIdsSet implements Collection<Object>, displayInAppMessagelambda121 {
        public static final int $stable = 8;
        private final isMaxVisibleEQwtKwdefault set;

        public static /* synthetic */ void getSet$annotations() {
        }

        public final isMaxVisibleEQwtKwdefault getSet() {
            return this.set;
        }

        @Override // java.util.Collection
        public final int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: add$ui, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.set.IconCompatParcelizer(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.IconCompatParcelizer();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.set.read(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.set.read(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void forEach(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.set;
            Object[] objArr = ismaxvisibleeqwtkwdefault.RemoteActionCompatParcelizer;
            long[] jArr = ismaxvisibleeqwtkwdefault.MediaMetadataCompat;
            int i = ismaxvisibleeqwtkwdefault.RatingCompat;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i]);
                i = i2;
            }
        }

        public int getSize() {
            return this.set.read;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.read == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.set;
            ismaxvisibleeqwtkwdefault.getClass();
            return new accesscalculateScrollDeltaI_oMVgE(ismaxvisibleeqwtkwdefault).iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.set.RemoteActionCompatParcelizer(obj);
        }

        public final boolean removeAll(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.set;
            int i = ismaxvisibleeqwtkwdefault.read;
            Object[] objArr = ismaxvisibleeqwtkwdefault.RemoteActionCompatParcelizer;
            long[] jArr = ismaxvisibleeqwtkwdefault.MediaDescriptionCompat;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i5])).booleanValue()) {
                                    ismaxvisibleeqwtkwdefault.IconCompatParcelizer(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != this.set.read;
        }

        public final boolean retainAll(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.set;
            Object[] objArr = ismaxvisibleeqwtkwdefault.RemoteActionCompatParcelizer;
            int i = ismaxvisibleeqwtkwdefault.read;
            long[] jArr = ismaxvisibleeqwtkwdefault.MediaDescriptionCompat;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i5])).booleanValue()) {
                                    ismaxvisibleeqwtkwdefault.IconCompatParcelizer(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != ismaxvisibleeqwtkwdefault.read;
        }

        public final void trimToSize(int i) {
            int i2;
            isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = this.set;
            long[] jArr = ismaxvisibleeqwtkwdefault.MediaMetadataCompat;
            int i3 = ismaxvisibleeqwtkwdefault.IconCompatParcelizer;
            while (i3 != Integer.MAX_VALUE && (i2 = ismaxvisibleeqwtkwdefault.read) > i && i2 != 0) {
                int i4 = (int) (jArr[i3] & 2147483647L);
                ismaxvisibleeqwtkwdefault.IconCompatParcelizer(i3);
                i3 = i4;
            }
        }

        public SlotIdsSet(isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = DragGestureDetectorKt.read;
                ismaxvisibleeqwtkwdefault = new isMaxVisibleEQwtKwdefault(6);
            }
            this(ismaxvisibleeqwtkwdefault);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void fastForEach(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            isMaxVisibleEQwtKwdefault set = getSet();
            Object[] objArr = set.RemoteActionCompatParcelizer;
            long[] jArr = set.MediaMetadataCompat;
            int i = set.RatingCompat;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i]);
                i = i2;
            }
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, tArr);
        }

        public SlotIdsSet(isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault) {
            this.set = ismaxvisibleeqwtkwdefault;
        }

        public SlotIdsSet() {
            this(null, 1, null);
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.set.write((Collection) collection);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.set.RemoteActionCompatParcelizer(collection);
        }
    }

    boolean areCompatible(Object obj, Object obj2);

    void getSlotsToRetain(SlotIdsSet slotIdsSet);
}
