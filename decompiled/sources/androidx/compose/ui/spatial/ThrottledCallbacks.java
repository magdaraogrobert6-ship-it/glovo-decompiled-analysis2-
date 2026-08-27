package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.unit.IntOffset;
import o.VerticalScrollableClipShape;
import o.animateToWithDecay;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private Entry globalChangeEntries;
    private long minDebounceDeadline;
    private final animateToWithDecay rectChangedMap;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;
    private long windowSize;

    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis = Long.MIN_VALUE;
        private long lastUninvokedFireMillis = -1;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
            return this.callback;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final int getId() {
            return this.id;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j) {
            this.bottomRight = j;
        }

        public final void setLastInvokeMillis(long j) {
            this.lastInvokeMillis = j;
        }

        public final void setLastUninvokedFireMillis(long j) {
            this.lastUninvokedFireMillis = j;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j) {
            this.topLeft = j;
        }

        public Entry(int i, long j, long j2, DelegatableNode delegatableNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            this.id = i;
            this.throttleMillis = j;
            this.debounceMillis = j2;
            this.node = delegatableNode;
            this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }

        /* JADX INFO: renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m2858fire9b9wPM(long j, long j2, long j3, long j4, float[] fArr) {
            RelativeLayoutBounds relativeLayoutBoundsM2859rectInfoForDg36KO4 = ThrottledCallbacksKt.m2859rectInfoForDg36KO4(this.node, j, j2, j3, j4, ThrottledCallbacks.this.getWindowSize(), fArr);
            if (relativeLayoutBoundsM2859rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM2859rectInfoForDg36KO4);
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    private final long roundDownToMultipleOf8(long j) {
        return (j >> 3) << 3;
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final animateToWithDecay getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* JADX INFO: renamed from: getScreenOffset-nOcc-ac, reason: not valid java name */
    public final long m2851getScreenOffsetnOccac() {
        return this.screenOffset;
    }

    /* JADX INFO: renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name */
    public final float[] m2852getViewToWindowMatrix3i98HWw() {
        return this.viewToWindowMatrix;
    }

    /* JADX INFO: renamed from: getWindowOffset-nOcc-ac, reason: not valid java name */
    public final long m2853getWindowOffsetnOccac() {
        return this.windowOffset;
    }

    public final long getWindowSize() {
        return this.windowSize;
    }

    public final void setGlobalChangeEntries(Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j) {
        this.minDebounceDeadline = j;
    }

    /* JADX INFO: renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m2854setScreenOffsetgyyYBs(long j) {
        this.screenOffset = j;
    }

    /* JADX INFO: renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m2855setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* JADX INFO: renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m2856setWindowOffsetgyyYBs(long j) {
        this.windowOffset = j;
    }

    public final void setWindowSize(long j) {
        this.windowSize = j;
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    private final void linkedForEach(Entry entry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        while (entry != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(animateToWithDecay animatetowithdecay, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Object[] objArr = animatetowithdecay.IconCompatParcelizer;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        for (Entry next = (Entry) objArr[(i << 3) + i3]; next != null; next = next.getNext()) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(next);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void fireGlobalChangeEntries(long j) {
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long jM2838getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().m2838getOffsetFromRectListForBjo55l4(layoutNodeRequireLayoutNode);
                next.setTopLeft(jM2838getOffsetFromRectListForBjo55l4);
                int iM3801getXimpl = IntOffset.m3801getXimpl(jM2838getOffsetFromRectListForBjo55l4);
                int width = layoutNodeRequireLayoutNode.getWidth();
                next.setBottomRight((((long) (layoutNodeRequireLayoutNode.getHeight() + IntOffset.m3802getYimpl(jM2838getOffsetFromRectListForBjo55l4))) & 4294967295L) | (((long) (width + iM3801getXimpl)) << 32));
                m2850fireWY9HvpM(next, j2, j3, fArr, j);
            }
        }
    }

    public final void fireOnRectChangedEntries(long j) {
        long[] jArr;
        long j2;
        int i;
        int i2;
        long j3 = this.windowOffset;
        long j4 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        animateToWithDecay animatetowithdecay = this.rectChangedMap;
        Object[] objArr = animatetowithdecay.IconCompatParcelizer;
        long[] jArr2 = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr2[i3];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                long j6 = j5;
                int i6 = 0;
                while (i6 < i5) {
                    if ((j6 & 255) < 128) {
                        Entry next = (Entry) objArr[(i3 << 3) + i6];
                        while (next != null) {
                            m2850fireWY9HvpM(next, j3, j4, fArr, j);
                            next = next.getNext();
                            i5 = i5;
                            i4 = i4;
                            i3 = i3;
                            i6 = i6;
                            j3 = j3;
                            jArr2 = jArr2;
                            length = length;
                        }
                    }
                    long j7 = j3;
                    int i7 = i4;
                    j6 >>= i7;
                    i6++;
                    i5 = i5;
                    i4 = i7;
                    i3 = i3;
                    j3 = j7;
                    jArr2 = jArr2;
                    length = length;
                }
                jArr = jArr2;
                int i8 = length;
                j2 = j3;
                i = i3;
                if (i5 != i4) {
                    return;
                } else {
                    i2 = i8;
                }
            } else {
                jArr = jArr2;
                j2 = j3;
                i = i3;
                i2 = length;
            }
            if (i == i2) {
                return;
            }
            i3 = i + 1;
            length = i2;
            j3 = j2;
            jArr2 = jArr;
        }
    }

    public final void fireOnUpdatedRect(int i, long j, long j2, long j3) {
        Entry next = (Entry) this.rectChangedMap.serializer(i);
        while (true) {
            Entry entry = next;
            if (entry == null) {
                return;
            }
            next = entry.getNext();
            fireWithUpdatedRect$ui(entry, j, j2, j3);
        }
    }

    public final void triggerDebounced(long j) {
        float[] fArr;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        long[] jArr2;
        int i5;
        float[] fArr2;
        Object[] objArr2;
        long j4;
        int i6;
        int i7;
        if (this.minDebounceDeadline > j) {
            return;
        }
        long j5 = this.windowOffset;
        long j6 = this.screenOffset;
        float[] fArr3 = this.viewToWindowMatrix;
        animateToWithDecay animatetowithdecay = this.rectChangedMap;
        Object[] objArr3 = animatetowithdecay.IconCompatParcelizer;
        long[] jArr3 = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr3.length - 2;
        if (length >= 0) {
            j3 = Long.MAX_VALUE;
            int i8 = 0;
            while (true) {
                long j7 = jArr3[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    long j8 = j7;
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j8 & 255) < 128) {
                            long jM2849debounceEntryb8qMvQI = j3;
                            Entry next = (Entry) objArr3[(i8 << 3) + i11];
                            while (next != null) {
                                jM2849debounceEntryb8qMvQI = m2849debounceEntryb8qMvQI(next, j5, j6, fArr3, j, jM2849debounceEntryb8qMvQI);
                                next = next.getNext();
                                i10 = i10;
                                i9 = i9;
                                i11 = i11;
                                j5 = j5;
                                i8 = i8;
                                jArr3 = jArr3;
                                length = length;
                                fArr3 = fArr3;
                                objArr3 = objArr3;
                            }
                            i3 = i11;
                            i4 = i8;
                            jArr2 = jArr3;
                            i5 = length;
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            j4 = j5;
                            i6 = i10;
                            i7 = i9;
                            j3 = jM2849debounceEntryb8qMvQI;
                        } else {
                            i3 = i11;
                            i4 = i8;
                            jArr2 = jArr3;
                            i5 = length;
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            j4 = j5;
                            i6 = i10;
                            i7 = i9;
                        }
                        j8 >>= i7;
                        i11 = i3 + 1;
                        i10 = i6;
                        i9 = i7;
                        j5 = j4;
                        i8 = i4;
                        jArr3 = jArr2;
                        length = i5;
                        fArr3 = fArr2;
                        objArr3 = objArr2;
                    }
                    int i12 = i8;
                    jArr = jArr3;
                    int i13 = length;
                    fArr = fArr3;
                    objArr = objArr3;
                    j2 = j5;
                    if (i10 != i9) {
                        break;
                    }
                    i = i12;
                    i2 = i13;
                } else {
                    jArr = jArr3;
                    fArr = fArr3;
                    objArr = objArr3;
                    j2 = j5;
                    i = i8;
                    i2 = length;
                }
                if (i == i2) {
                    break;
                }
                i8 = i + 1;
                length = i2;
                j5 = j2;
                jArr3 = jArr;
                fArr3 = fArr;
                objArr3 = objArr;
            }
        } else {
            fArr = fArr3;
            j2 = j5;
            j3 = Long.MAX_VALUE;
        }
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            long jM2849debounceEntryb8qMvQI2 = j3;
            for (Entry next2 = entry; next2 != null; next2 = next2.getNext()) {
                jM2849debounceEntryb8qMvQI2 = m2849debounceEntryb8qMvQI(next2, j2, j6, fArr, j, jM2849debounceEntryb8qMvQI2);
            }
            j3 = jM2849debounceEntryb8qMvQI2;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = -1;
        }
        this.minDebounceDeadline = j3;
    }

    /* JADX INFO: renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m2857updateOffsetsLDcG7Xg(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (IntOffset.m3800equalsimpl0(j2, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = j2;
            z = true;
        }
        if (!IntOffset.m3800equalsimpl0(j, this.screenOffset)) {
            this.screenOffset = j;
            z = true;
        }
        if (fArr != null) {
            this.viewToWindowMatrix = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.windowSize) {
            return z;
        }
        this.windowSize = j3;
        return true;
    }

    public ThrottledCallbacks() {
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        this.rectChangedMap = new animateToWithDecay();
        this.minDebounceDeadline = -1L;
        IntOffset.Companion companion = IntOffset.Companion;
        this.windowOffset = companion.m3812getZeronOccac();
        this.screenOffset = companion.m3812getZeronOccac();
    }

    /* JADX INFO: renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m2849debounceEntryb8qMvQI(Entry entry, long j, long j2, float[] fArr, long j3, long j4) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return j4;
        }
        if (j3 - entry.getLastUninvokedFireMillis() >= entry.getDebounceMillis()) {
            entry.setLastInvokeMillis(j3);
            entry.setLastUninvokedFireMillis(-1L);
            entry.m2858fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j, j2, fArr);
            return j4;
        }
        return Math.min(j4, entry.getDebounceMillis() + entry.getLastUninvokedFireMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean multiRemove(animateToWithDecay animatetowithdecay, int i, Entry entry) {
        Entry next = (Entry) animatetowithdecay.MediaBrowserCompatMediaItem(i);
        if (next == null) {
            return false;
        }
        if (next != entry) {
            int i2 = animatetowithdecay.read(i);
            Object[] objArr = animatetowithdecay.IconCompatParcelizer;
            Object obj = objArr[i2];
            animatetowithdecay.serializer[i2] = i;
            objArr[i2] = next;
            while (next != null) {
                Entry next2 = next.getNext();
                if (next2 == null) {
                    return false;
                }
                if (next2 == entry) {
                    next.setNext(entry.getNext());
                    entry.setNext(null);
                    return true;
                }
                next = next.getNext();
            }
        } else {
            Entry next3 = entry.getNext();
            entry.setNext(null);
            if (next3 != null) {
                int i3 = animatetowithdecay.read(i);
                Object[] objArr2 = animatetowithdecay.IconCompatParcelizer;
                Object obj2 = objArr2[i3];
                animatetowithdecay.serializer[i3] = i;
                objArr2[i3] = next3;
                return true;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(entry.getNode().getNode());
            if (layoutNodeRequireLayoutNode.getAddedToRectList$ui()) {
                LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().unsetHasCallbacksFor(layoutNodeRequireLayoutNode);
            }
        }
        return true;
    }

    private final void runFor(animateToWithDecay animatetowithdecay, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Entry entry = (Entry) animatetowithdecay.serializer(i);
        while (entry != null) {
            Entry next = entry.getNext();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(entry);
            entry = next;
        }
    }

    public final void fireWithUpdatedRect$ui(Entry entry, long j, long j2, long j3) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = j3 - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = debounceMillis == 0;
        boolean z3 = throttleMillis == 0;
        entry.setTopLeft(j);
        entry.setBottomRight(j2);
        boolean z4 = !(z2 || z3) || z2;
        if (z && z4) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(j3);
            entry.m2858fire9b9wPM(j, j2, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z2) {
                return;
            }
            entry.setLastUninvokedFireMillis(j3);
            long j4 = this.minDebounceDeadline;
            if (j4 <= 0 || j3 + debounceMillis >= j4) {
                return;
            }
            this.minDebounceDeadline = j4;
        }
    }

    public final void forEachNewCallbackNeverInvoked(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        animateToWithDecay rectChangedMap = getRectChangedMap();
        Object[] objArr = rectChangedMap.IconCompatParcelizer;
        long[] jArr = rectChangedMap.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        Entry entry = (Entry) objArr[(i << 3) + i3];
                        for (Entry next = entry; next != null; next = next.getNext()) {
                            if (entry.getLastInvokeMillis() == Long.MIN_VALUE) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(entry);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m2850fireWY9HvpM(Entry entry, long j, long j2, float[] fArr, long j3) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean z = j3 - lastInvokeMillis > entry.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z2 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(j3);
        if (z && z2) {
            entry.setLastInvokeMillis(j3);
            entry.m2858fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j, j2, fArr);
        }
        if (z2) {
            return;
        }
        long j4 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis();
        if (j4 <= 0 || debounceMillis + j3 >= j4) {
            return;
        }
        this.minDebounceDeadline = j4;
    }

    private final Entry multiPut(animateToWithDecay animatetowithdecay, int i, Entry entry) {
        Object objSerializer = animatetowithdecay.serializer(i);
        if (objSerializer == null) {
            animatetowithdecay.IconCompatParcelizer(i, entry);
            objSerializer = entry;
        }
        Entry next = (Entry) objSerializer;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                next.getClass();
            }
            next.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:8:0x0016). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean removeFromGlobalEntries(androidx.compose.ui.spatial.ThrottledCallbacks.Entry r6) {
        /*
            r5 = this;
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r5.globalChangeEntries
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L10
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r0.getNext()
            r5.globalChangeEntries = r0
            r6.setNext(r2)
            return r1
        L10:
            if (r0 == 0) goto L1a
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r3 = r0.getNext()
        L16:
            r4 = r3
            r3 = r0
            r0 = r4
            goto L1c
        L1a:
            r3 = r0
            r0 = r2
        L1c:
            if (r0 == 0) goto L32
            if (r0 != r6) goto L2d
            if (r3 == 0) goto L29
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r0.getNext()
            r3.setNext(r0)
        L29:
            r6.setNext(r2)
            return r1
        L2d:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r3 = r0.getNext()
            goto L16
        L32:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.ThrottledCallbacks.removeFromGlobalEntries(androidx.compose.ui.spatial.ThrottledCallbacks$Entry):boolean");
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int i, long j, long j2, DelegatableNode delegatableNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return multiPut(this.rectChangedMap, i, new Entry(i, j, j2 == 0 ? j : j2, delegatableNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int i, long j, long j2, DelegatableNode delegatableNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Entry entry = new Entry(i, j, j2 == 0 ? j : j2, delegatableNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        addToGlobalEntries(entry);
        return entry;
    }
}
