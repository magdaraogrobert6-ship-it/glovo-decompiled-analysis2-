package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AnchoredDraggableNode;
import o.ContentInViewNode;
import o.ForEachGestureKt;
import o.displayInAppMessagelambda121;
import o.getCieXyz;
import o.onContentCardClicked;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, displayInAppMessagelambda121 {
    public static final int $stable = 8;
    private ContentInViewNode values = new ContentInViewNode(16);
    private AnchoredDraggableNode distanceFromEdgeAndFlags = new AnchoredDraggableNode(16);
    private int hitDepth = -1;

    public final class HitTestResultIterator implements ListIterator<Modifier.Node>, displayInAppMessagelambda121 {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Modifier.Node next() {
            ContentInViewNode contentInViewNode = HitTestResult.this.values;
            int i = this.index;
            this.index = i + 1;
            Object objRemoteActionCompatParcelizer = contentInViewNode.RemoteActionCompatParcelizer(i);
            objRemoteActionCompatParcelizer.getClass();
            return (Modifier.Node) objRemoteActionCompatParcelizer;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        public Modifier.Node previous() {
            ContentInViewNode contentInViewNode = HitTestResult.this.values;
            int i = this.index - 1;
            this.index = i;
            Object objRemoteActionCompatParcelizer = contentInViewNode.RemoteActionCompatParcelizer(i);
            objRemoteActionCompatParcelizer.getClass();
            return (Modifier.Node) objRemoteActionCompatParcelizer;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }
    }

    public final class SubList implements List<Modifier.Node>, displayInAppMessagelambda121 {
        private final int maxIndex;
        private final int minIndex;

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
        }

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node get(int i) {
            Object objRemoteActionCompatParcelizer = HitTestResult.this.values.RemoteActionCompatParcelizer(i + this.minIndex);
            objRemoteActionCompatParcelizer.getClass();
            return (Modifier.Node) objRemoteActionCompatParcelizer;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        public int indexOf(Modifier.Node node) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i > i2) {
                return -1;
            }
            while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        public int lastIndexOf(Modifier.Node node) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 > i) {
                return -1;
            }
            while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{HitTestResult.this.values.RemoteActionCompatParcelizer(i), node}, getCieXyz.write())).booleanValue()) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.minIndex;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int i) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i + i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int i, int i2) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return hitTestResult.new SubList(i + i3, i3 + i2);
        }

        /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addFirst(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void addLast(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Modifier.Node removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List
        public /* synthetic */ void add(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* synthetic */ Modifier.Node remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
        public /* synthetic */ Object m2435removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
        public /* synthetic */ Object m2436removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.IconCompatParcelizer();
        this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    private final void removeNodeAtDepth(int i) {
        this.values.write(i);
        AnchoredDraggableNode anchoredDraggableNode = this.distanceFromEdgeAndFlags;
        if (i >= 0) {
            int i2 = anchoredDraggableNode.RemoteActionCompatParcelizer;
            if (i < i2) {
                long[] jArr = anchoredDraggableNode.serializer;
                long j = jArr[i];
                if (i != i2 - 1) {
                    onContentCardClicked.IconCompatParcelizer(jArr, jArr, i, i + 1, i2);
                }
                anchoredDraggableNode.RemoteActionCompatParcelizer--;
                return;
            }
        } else {
            anchoredDraggableNode.getClass();
        }
        ForEachGestureKt.serializer("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node get(int i) {
        Object objRemoteActionCompatParcelizer = this.values.RemoteActionCompatParcelizer(i);
        objRemoteActionCompatParcelizer.getClass();
        return (Modifier.Node) objRemoteActionCompatParcelizer;
    }

    public int getSize() {
        return this.values.IconCompatParcelizer;
    }

    public final void hitExpandedTouchBounds(Modifier.Node node, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this.hitDepth == size() - 1) {
            int i = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.read(node);
            this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(0.0f, z, true));
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            this.hitDepth = i;
            return;
        }
        long jM2432findBestHitDistancefn2tFes = m2432findBestHitDistancefn2tFes();
        int i2 = this.hitDepth;
        if (!DistanceAndFlags.m2415isInExpandedBoundsimpl(jM2432findBestHitDistancefn2tFes)) {
            if (DistanceAndFlags.m2413getDistanceimpl(jM2432findBestHitDistancefn2tFes) > 0.0f) {
                int i3 = this.hitDepth;
                removeNodesInRange(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.read(node);
                this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(0.0f, z, true));
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                this.hitDepth = i3;
                return;
            }
            return;
        }
        this.hitDepth = size() - 1;
        int i4 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.read(node);
        this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(0.0f, z, true));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.hitDepth = i4;
        if (DistanceAndFlags.m2413getDistanceimpl(m2432findBestHitDistancefn2tFes()) < 0.0f) {
            removeNodesInRange(i2 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i2;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.write();
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        if (this.hitDepth == size() - 1) {
            return true;
        }
        return DistanceAndFlags.m2409compareTo9YPOF3E(m2432findBestHitDistancefn2tFes(), HitTestResultKt.DistanceAndFlags$default(f, z, false, 4, null)) > 0;
    }

    public final void speculativeHit(Modifier.Node node, float f, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (this.hitDepth == size() - 1) {
            int i = this.hitDepth;
            removeNodesInRange(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.read(node);
            this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(f, z, false));
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            this.hitDepth = i;
            if (this.hitDepth + 1 == size() - 1 || DistanceAndFlags.m2415isInExpandedBoundsimpl(m2432findBestHitDistancefn2tFes())) {
                removeNodeAtDepth(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jM2432findBestHitDistancefn2tFes = m2432findBestHitDistancefn2tFes();
        int i2 = this.hitDepth;
        this.hitDepth = size() - 1;
        int i3 = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.read(node);
        this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(f, z, false));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.hitDepth = i3;
        long jM2432findBestHitDistancefn2tFes2 = m2432findBestHitDistancefn2tFes();
        if (this.hitDepth + 1 >= size() - 1 || DistanceAndFlags.m2409compareTo9YPOF3E(jM2432findBestHitDistancefn2tFes, jM2432findBestHitDistancefn2tFes2) <= 0) {
            removeNodesInRange(this.hitDepth + 1, size());
        } else {
            boolean zM2415isInExpandedBoundsimpl = DistanceAndFlags.m2415isInExpandedBoundsimpl(jM2432findBestHitDistancefn2tFes2);
            int i4 = this.hitDepth;
            removeNodesInRange(i2 + 1, zM2415isInExpandedBoundsimpl ? i4 + 2 : i4 + 1);
        }
        this.hitDepth = i2;
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int i, int i2) {
        return new SubList(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeNodesInRange(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.values.read(i, i2);
        AnchoredDraggableNode anchoredDraggableNode = this.distanceFromEdgeAndFlags;
        if (i >= 0) {
            int i3 = anchoredDraggableNode.RemoteActionCompatParcelizer;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    ForEachGestureKt.IconCompatParcelizer("The end index must be < start index");
                    throw null;
                }
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = anchoredDraggableNode.serializer;
                        onContentCardClicked.IconCompatParcelizer(jArr, jArr, i, i2, i3);
                    }
                    anchoredDraggableNode.RemoteActionCompatParcelizer -= i2 - i;
                    return;
                }
                return;
            }
        } else {
            anchoredDraggableNode.getClass();
        }
        ForEachGestureKt.serializer("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasHit() {
        long jM2432findBestHitDistancefn2tFes = m2432findBestHitDistancefn2tFes();
        return DistanceAndFlags.m2413getDistanceimpl(jM2432findBestHitDistancefn2tFes) < 0.0f && DistanceAndFlags.m2416isInLayerimpl(jM2432findBestHitDistancefn2tFes) && !DistanceAndFlags.m2415isInExpandedBoundsimpl(jM2432findBestHitDistancefn2tFes);
    }

    public final void hit(Modifier.Node node, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.read(node);
        this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(-1.0f, z, false));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.hitDepth = i;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.read(node);
        this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(f, z, false));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.hitDepth = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Modifier.Node removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = this.hitDepth;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: findBestHitDistance-fn2tFes, reason: not valid java name */
    private final long m2432findBestHitDistancefn2tFes() {
        long jDistanceAndFlags$default = HitTestResultKt.DistanceAndFlags$default(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i = this.hitDepth + 1;
        int size = size() - 1;
        if (i > size) {
            return jDistanceAndFlags$default;
        }
        while (true) {
            AnchoredDraggableNode anchoredDraggableNode = this.distanceFromEdgeAndFlags;
            if (i >= 0) {
                if (i >= anchoredDraggableNode.RemoteActionCompatParcelizer) {
                    break;
                }
                long jM2410constructorimpl = DistanceAndFlags.m2410constructorimpl(anchoredDraggableNode.serializer[i]);
                if (DistanceAndFlags.m2409compareTo9YPOF3E(jM2410constructorimpl, jDistanceAndFlags$default) < 0) {
                    jDistanceAndFlags$default = jM2410constructorimpl;
                }
                if ((DistanceAndFlags.m2413getDistanceimpl(jDistanceAndFlags$default) < 0.0f && DistanceAndFlags.m2416isInLayerimpl(jDistanceAndFlags$default)) || i == size) {
                    return jDistanceAndFlags$default;
                }
                i++;
            } else {
                anchoredDraggableNode.getClass();
                break;
            }
        }
        ForEachGestureKt.serializer("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, tArr);
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List
    public /* synthetic */ void add(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public /* synthetic */ Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
    public /* synthetic */ Object m2433removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
    public /* synthetic */ Object m2434removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int indexOf(Modifier.Node node) {
        int size = size() - 1;
        if (size < 0) {
            return -1;
        }
        int i = 0;
        while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.values.RemoteActionCompatParcelizer(i), node}, getCieXyz.write())).booleanValue()) {
            if (i == size) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public int lastIndexOf(Modifier.Node node) {
        for (int size = size() - 1; -1 < size; size--) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.values.RemoteActionCompatParcelizer(size), node}, getCieXyz.write())).booleanValue()) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int i) {
        return new HitTestResultIterator(this, i, 0, 0, 6, null);
    }

    public boolean contains(Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    public final void hitInMinimumTouchTarget(Modifier.Node node, float f, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i = this.hitDepth;
        removeNodesInRange(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.read(node);
        this.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(f, z, z2));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.hitDepth = i;
    }
}
