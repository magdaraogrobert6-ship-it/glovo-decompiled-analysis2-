package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.BasicTooltipBox;
import o.BrazeContentCardsManagerCompanion;
import o.FabBaselineTokens;
import o.awaitLongPressOrCancellationrnUCldI;
import o.detectDragGestures;
import o.down;
import o.drawArrowuDrxG_w;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.onPreFlingQWom1Mo;
import o.onRemeasuredozmzZPI;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimator {
    public final ArrayList IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public final ArrayList MediaMetadataCompat;
    public final ArrayList RatingCompat;
    public final onRemeasuredozmzZPI RemoteActionCompatParcelizer;
    public down read;
    public final relocationOffsetfbGrOKE serializer;
    public final Modifier write;

    public final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        public LazyLayoutItemAnimator RemoteActionCompatParcelizer;

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void draw(ContentDrawScope contentDrawScope) {
            ArrayList arrayList = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
            if (arrayList.size() <= 0) {
                contentDrawScope.drawContent();
            } else {
                m1$$ExternalSyntheticOutline0.m(arrayList.get(0));
                throw null;
            }
        }

        public final int hashCode() {
            return this.RemoteActionCompatParcelizer.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            this.RemoteActionCompatParcelizer.getClass();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onDetach() {
            LazyLayoutItemAnimator lazyLayoutItemAnimator = this.RemoteActionCompatParcelizer;
            lazyLayoutItemAnimator.RemoteActionCompatParcelizer();
            lazyLayoutItemAnimator.read = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayingDisappearingItemsNode)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((DisplayingDisappearingItemsNode) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.RemoteActionCompatParcelizer + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void RemoteActionCompatParcelizer() {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.RemoteActionCompatParcelizer;
        if (onremeasuredozmzzpi.write()) {
            Object[] objArr = onremeasuredozmzzpi.MediaMetadataCompat;
            long[] jArr = onremeasuredozmzzpi.write;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                m1$$ExternalSyntheticOutline0.m(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            onremeasuredozmzzpi.IconCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m92getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM3849getZeroYbymL2g = IntSize.Companion.m3849getZeroYbymL2g();
        ArrayList arrayList = this.IconCompatParcelizer;
        if (arrayList.size() <= 0) {
            return jM3849getZeroYbymL2g;
        }
        m1$$ExternalSyntheticOutline0.m(arrayList.get(0));
        throw null;
    }

    public final void read(FabBaselineTokens fabBaselineTokens, boolean z) {
        Object objMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(((LazyListMeasuredItem) fabBaselineTokens).MediaDescriptionCompat);
        objMediaBrowserCompatMediaItem.getClass();
        m1$$ExternalSyntheticOutline0.m(objMediaBrowserCompatMediaItem);
        throw null;
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = detectDragGestures.write;
        this.RemoteActionCompatParcelizer = new onRemeasuredozmzZPI();
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.serializer = new relocationOffsetfbGrOKE();
        this.MediaDescriptionCompat = new ArrayList();
        this.MediaBrowserCompatMediaItem = new ArrayList();
        this.MediaMetadataCompat = new ArrayList();
        this.RatingCompat = new ArrayList();
        this.IconCompatParcelizer = new ArrayList();
        this.write = new drawArrowuDrxG_w(this);
    }

    public static int RemoteActionCompatParcelizer(int[] iArr, FabBaselineTokens fabBaselineTokens) {
        fabBaselineTokens.getClass();
        int i = iArr[0] + ((LazyListMeasuredItem) fabBaselineTokens).PlaybackStateCompatCustomAction;
        iArr[0] = i;
        return Math.max(0, i);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x00bc A[EDGE_INSN: B:130:0x00bc->B:37:0x00bc BREAK  A[LOOP:2: B:24:0x007e->B:35:0x00b5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[LOOP:2: B:24:0x007e->B:35:0x00b5, LOOP_END] */
    public final void onMeasured(int i, int i2, int i3, ArrayList arrayList, down downVar, BasicTooltipBox basicTooltipBox, boolean z, boolean z2, boolean z3, int i4, int i5) {
        boolean z4;
        relocationOffsetfbGrOKE relocationoffsetfbgroke;
        int i6;
        int iM3801getXimpl;
        int i7;
        down downVar2 = this.read;
        this.read = downVar;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) ((FabBaselineTokens) arrayList.get(i8));
            int size2 = lazyListMeasuredItem.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((Placeable) lazyListMeasuredItem.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.get(i9)).getParentData();
            }
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.RemoteActionCompatParcelizer;
        if (onremeasuredozmzzpi.read()) {
            RemoteActionCompatParcelizer();
            return;
        }
        if (z) {
            IntOffset.m3795constructorimpl(((long) i) & 4294967295L);
        } else {
            IntOffset.m3795constructorimpl(((long) i) << 32);
        }
        boolean z5 = z2 || !z3;
        Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
        long[] jArr = onremeasuredozmzzpi.write;
        int length = jArr.length - 2;
        relocationOffsetfbGrOKE relocationoffsetfbgroke2 = this.serializer;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                z4 = z5;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    long j2 = j;
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j2 & 255) < 128) {
                            relocationoffsetfbgroke2.serializer(objArr[(i10 << 3) + i12]);
                        }
                        i12++;
                        j2 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                    z5 = z4;
                } else if (i10 != length) {
                    break;
                    break;
                } else {
                    i10++;
                    z5 = z4;
                }
            }
        } else {
            z4 = z5;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) ((FabBaselineTokens) arrayList.get(i13));
            relocationoffsetfbgroke2.write(lazyListMeasuredItem2.MediaDescriptionCompat);
            List list = lazyListMeasuredItem2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int size4 = list.size();
            for (int i14 = 0; i14 < size4; i14++) {
                ((Placeable) list.get(i14)).getParentData();
            }
            m1$$ExternalSyntheticOutline0.m(onremeasuredozmzzpi.IconCompatParcelizer(lazyListMeasuredItem2.MediaDescriptionCompat));
        }
        int i15 = 1;
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.MediaBrowserCompatMediaItem;
        ArrayList arrayList3 = this.MediaDescriptionCompat;
        if (z4 && downVar2 != null) {
            if (arrayList3.isEmpty()) {
                i7 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    BrazeContentCardsManagerCompanion.write(arrayList3, new onPreFlingQWom1Mo(downVar2, 2));
                }
                if (arrayList3.size() > 0) {
                    FabBaselineTokens fabBaselineTokens = (FabBaselineTokens) arrayList3.get(0);
                    int iRemoteActionCompatParcelizer = i4 - RemoteActionCompatParcelizer(iArr, fabBaselineTokens);
                    LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) fabBaselineTokens;
                    Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(lazyListMeasuredItem3.MediaDescriptionCompat);
                    objMediaBrowserCompatMediaItem.getClass();
                    m1$$ExternalSyntheticOutline0.m(objMediaBrowserCompatMediaItem);
                    long jM91getOffsetBjo55l4 = lazyListMeasuredItem3.m91getOffsetBjo55l4(0);
                    if (lazyListMeasuredItem3.MediaSessionCompatQueueItem) {
                        IntOffset.m3797copyiSbpLlY$default(jM91getOffsetBjo55l4, 0, iRemoteActionCompatParcelizer, 1, null);
                        throw null;
                    }
                    IntOffset.m3797copyiSbpLlY$default(jM91getOffsetBjo55l4, iRemoteActionCompatParcelizer, 0, 2, null);
                    throw null;
                }
                i15 = 1;
                i7 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > i15) {
                    BrazeContentCardsManagerCompanion.write(arrayList2, new onPreFlingQWom1Mo(downVar2, i7));
                }
                if (arrayList2.size() > 0) {
                    FabBaselineTokens fabBaselineTokens2 = (FabBaselineTokens) arrayList2.get(i7);
                    int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iArr, fabBaselineTokens2);
                    LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) fabBaselineTokens2;
                    int i16 = (iRemoteActionCompatParcelizer2 + i5) - lazyListMeasuredItem4.PlaybackStateCompatCustomAction;
                    Object objMediaBrowserCompatMediaItem2 = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(lazyListMeasuredItem4.MediaDescriptionCompat);
                    objMediaBrowserCompatMediaItem2.getClass();
                    m1$$ExternalSyntheticOutline0.m(objMediaBrowserCompatMediaItem2);
                    long jM91getOffsetBjo55l5 = lazyListMeasuredItem4.m91getOffsetBjo55l4(i7);
                    if (lazyListMeasuredItem4.MediaSessionCompatQueueItem) {
                        IntOffset.m3797copyiSbpLlY$default(jM91getOffsetBjo55l5, 0, i16, 1, null);
                        throw null;
                    }
                    IntOffset.m3797copyiSbpLlY$default(jM91getOffsetBjo55l5, i16, 0, 2, null);
                    throw null;
                }
                int i17 = i7;
                Arrays.fill(iArr, i17, 1, i17);
            }
        }
        Object[] objArr2 = relocationoffsetfbgroke2.RemoteActionCompatParcelizer;
        long[] jArr2 = relocationoffsetfbgroke2.IconCompatParcelizer;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i18 = length2;
            int i19 = 0;
            while (true) {
                long j3 = jArr2[i19];
                relocationoffsetfbgroke = relocationoffsetfbgroke2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - i18)) >>> 31);
                    long j4 = j3;
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j4 & 255) < 128) {
                            m1$$ExternalSyntheticOutline0.m(onremeasuredozmzzpi.MediaBrowserCompatMediaItem(objArr2[(i19 << 3) + i21]));
                        }
                        j4 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                int i22 = i18;
                if (i19 == i22) {
                    break;
                }
                i19++;
                i18 = i22;
                relocationoffsetfbgroke2 = relocationoffsetfbgroke;
            }
        } else {
            relocationoffsetfbgroke = relocationoffsetfbgroke2;
        }
        ArrayList arrayList4 = this.MediaMetadataCompat;
        if (arrayList4.isEmpty()) {
            i6 = 1;
        } else {
            if (arrayList4.size() > 1) {
                BrazeContentCardsManagerCompanion.write(arrayList4, new onPreFlingQWom1Mo(downVar, 3));
            }
            int size5 = arrayList4.size();
            for (int i23 = 0; i23 < size5; i23++) {
                FabBaselineTokens fabBaselineTokens3 = (FabBaselineTokens) arrayList4.get(i23);
                LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) fabBaselineTokens3;
                Object objMediaBrowserCompatMediaItem3 = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(lazyListMeasuredItem5.MediaDescriptionCompat);
                objMediaBrowserCompatMediaItem3.getClass();
                m1$$ExternalSyntheticOutline0.m(objMediaBrowserCompatMediaItem3);
                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(iArr, fabBaselineTokens3);
                if (z2) {
                    LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) ((FabBaselineTokens) onContentCardDismissed.read((List) arrayList));
                    long jM91getOffsetBjo55l6 = lazyListMeasuredItem6.m91getOffsetBjo55l4(0);
                    if (lazyListMeasuredItem6.MediaSessionCompatQueueItem) {
                        iM3801getXimpl = IntOffset.m3802getYimpl(jM91getOffsetBjo55l6);
                    } else {
                        iM3801getXimpl = IntOffset.m3801getXimpl(jM91getOffsetBjo55l6);
                    }
                } else {
                    iM3801getXimpl = 0;
                }
                lazyListMeasuredItem5.position(iM3801getXimpl - iRemoteActionCompatParcelizer3, i2, i3);
                if (z4) {
                    read(fabBaselineTokens3, true);
                    throw null;
                }
            }
            i6 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.RatingCompat;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i6) {
                BrazeContentCardsManagerCompanion.write(arrayList5, new onPreFlingQWom1Mo(downVar, i6));
            }
            int size6 = arrayList5.size();
            for (int i24 = 0; i24 < size6; i24++) {
                FabBaselineTokens fabBaselineTokens4 = (FabBaselineTokens) arrayList5.get(i24);
                LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) fabBaselineTokens4;
                Object objMediaBrowserCompatMediaItem4 = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(lazyListMeasuredItem7.MediaDescriptionCompat);
                objMediaBrowserCompatMediaItem4.getClass();
                m1$$ExternalSyntheticOutline0.m(objMediaBrowserCompatMediaItem4);
                lazyListMeasuredItem7.position((0 - lazyListMeasuredItem7.PlaybackStateCompatCustomAction) + RemoteActionCompatParcelizer(iArr, fabBaselineTokens4), i2, i3);
                if (z4) {
                    read(fabBaselineTokens4, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        relocationoffsetfbgroke.serializer();
    }
}
