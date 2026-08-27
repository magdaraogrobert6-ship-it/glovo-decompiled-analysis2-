package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKt;
import o.InlineChildren;
import o.ModalBottomSheetKtModalBottomSheetContent7;
import o.ModalBottomSheetKtScrimdismissSheet11;
import o.OutlinedTextField;
import o.OutlinedTextFieldLayout;
import o.ScrollStateExternalSyntheticLambda3;
import o.SnackbarHostKt;
import o.SweepGradientShader9KIMszodefault;
import o.VerticalScrollableClipShape;
import o.accessisRelatedToAutoCommit;
import o.animateToWithDecay;
import o.calculateInSampleSizelambda1;
import o.drag;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.intrinsicHeight;
import o.isMetaPressedZmokQxo;
import o.onContentCardDismissed;
import o.onCreateVirtualViewTranslationRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FlowMeasurePolicy implements MultiContentMeasurePolicy, intrinsicHeight {
    public final float IconCompatParcelizer;
    public final Arrangement.Vertical MediaSessionCompatQueueItem;
    public final ModalBottomSheetKtModalBottomSheetContent7 RemoteActionCompatParcelizer;
    public final OutlinedTextFieldLayout read;
    public final float serializer;
    public final Arrangement.Horizontal write;

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(true);
        int iHashCode2 = this.write.hashCode();
        int iSerializer = getBitmapFromCache.serializer(this.IconCompatParcelizer, (this.MediaSessionCompatQueueItem.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31, 31);
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(Integer.MAX_VALUE, af$$ExternalSyntheticOutline0.m(Integer.MAX_VALUE, getBitmapFromCache.serializer(this.serializer, (this.RemoteActionCompatParcelizer.serializer.hashCode() + iSerializer) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) onContentCardDismissed.read(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list2) : null;
        List list3 = (List) onContentCardDismissed.read(2, list);
        this.read.write(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list3) : null, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        List list4 = (List) onContentCardDismissed.MediaMetadataCompat(list);
        if (list4 == null) {
            list4 = instance_delegatelambda0.write;
        }
        return write(list4, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer), intrinsicMeasureScope.mo42roundToPx0680j_4(this.serializer), this.read);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) onContentCardDismissed.read(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list2) : null;
        List list3 = (List) onContentCardDismissed.read(2, list);
        this.read.write(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list3) : null, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        List list4 = (List) onContentCardDismissed.MediaMetadataCompat(list);
        if (list4 == null) {
            list4 = instance_delegatelambda0.write;
        }
        int iMo42roundToPx0680j_4 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iMaxIntrinsicWidth = ((IntrinsicMeasurable) list4.get(i2)).maxIntrinsicWidth(i) + iMo42roundToPx0680j_4;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iMaxIntrinsicWidth) - iMo42roundToPx0680j_4);
                i4 = 0;
                i3 = i2;
            } else {
                i4 += iMaxIntrinsicWidth;
            }
            i2 = i5;
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) onContentCardDismissed.read(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list2) : null;
        List list3 = (List) onContentCardDismissed.read(2, list);
        this.read.write(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list3) : null, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        List list4 = (List) onContentCardDismissed.MediaMetadataCompat(list);
        if (list4 == null) {
            list4 = instance_delegatelambda0.write;
        }
        return write(list4, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer), intrinsicMeasureScope.mo42roundToPx0680j_4(this.serializer), this.read);
    }

    public FlowMeasurePolicy(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, ModalBottomSheetKtModalBottomSheetContent7 modalBottomSheetKtModalBottomSheetContent7, float f2, OutlinedTextFieldLayout outlinedTextFieldLayout) {
        this.write = horizontal;
        this.MediaSessionCompatQueueItem = vertical;
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = modalBottomSheetKtModalBottomSheetContent7;
        this.serializer = f2;
        this.read = outlinedTextFieldLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        if (!this.write.equals(flowMeasurePolicy.write) || !this.MediaSessionCompatQueueItem.equals(flowMeasurePolicy.MediaSessionCompatQueueItem) || !Dp.m3678equalsimpl0(this.IconCompatParcelizer, flowMeasurePolicy.IconCompatParcelizer) || !this.RemoteActionCompatParcelizer.equals(flowMeasurePolicy.RemoteActionCompatParcelizer) || !Dp.m3678equalsimpl0(this.serializer, flowMeasurePolicy.serializer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, flowMeasurePolicy.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.write);
        sb.append(", verticalArrangement=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", mainAxisSpacing=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ", crossAxisAlignment=", sb);
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", crossAxisArrangementSpacing=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.serializer, ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=", sb);
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int write(List list, int i, int i2, int i3, OutlinedTextFieldLayout outlinedTextFieldLayout) {
        long jWrite;
        int i4 = 0;
        if (list.isEmpty()) {
            jWrite = ScrollStateExternalSyntheticLambda3.write(0, 0);
        } else {
            isMetaPressedZmokQxo ismetapressedzmokqxo = new isMetaPressedZmokQxo(outlinedTextFieldLayout, ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), i2, i3);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) onContentCardDismissed.read(0, list);
            int iMinIntrinsicHeight = intrinsicMeasurable != null ? intrinsicMeasurable.minIntrinsicHeight(i) : 0;
            int iMinIntrinsicWidth = intrinsicMeasurable != null ? intrinsicMeasurable.minIntrinsicWidth(iMinIntrinsicHeight) : 0;
            if (ismetapressedzmokqxo.RemoteActionCompatParcelizer(list.size() > 1, 0, ScrollStateExternalSyntheticLambda3.write(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(iMinIntrinsicWidth, iMinIntrinsicHeight)), 0, 0, 0, false, false).IconCompatParcelizer) {
                ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda3Serializer = outlinedTextFieldLayout.serializer(0, 0, intrinsicMeasurable != null);
                jWrite = ScrollStateExternalSyntheticLambda3.write(scrollStateExternalSyntheticLambda3Serializer != null ? (int) (scrollStateExternalSyntheticLambda3Serializer.RemoteActionCompatParcelizer & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i5 = i;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i7 < size) {
                    int i11 = i5 - iMinIntrinsicWidth;
                    int i12 = i7 + 1;
                    int iMax = Math.max(i8, iMinIntrinsicHeight);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) onContentCardDismissed.read(i12, list);
                    int iMinIntrinsicHeight2 = intrinsicMeasurable2 != null ? intrinsicMeasurable2.minIntrinsicHeight(i) : i4;
                    int iMinIntrinsicWidth2 = intrinsicMeasurable2 != null ? intrinsicMeasurable2.minIntrinsicWidth(iMinIntrinsicHeight2) + i2 : i4;
                    boolean z = i7 + 2 < list.size() ? 1 : i4;
                    int i13 = i12 - i9;
                    int i14 = iMinIntrinsicWidth2;
                    int i15 = iMinIntrinsicHeight2;
                    FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer = ismetapressedzmokqxo.RemoteActionCompatParcelizer(z, i13, ScrollStateExternalSyntheticLambda3.write(i11, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(iMinIntrinsicWidth2, iMinIntrinsicHeight2)), i10, i6, iMax, false, false);
                    if (flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer.serializer) {
                        i6 += iMax + i3;
                        ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet11Write = ismetapressedzmokqxo.write(flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer, intrinsicMeasurable2 != null, i10, i6, i11, i13);
                        i10++;
                        if (flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer.IconCompatParcelizer) {
                            if (modalBottomSheetKtScrimdismissSheet11Write != null) {
                                long j = modalBottomSheetKtScrimdismissSheet11Write.write;
                                if (!modalBottomSheetKtScrimdismissSheet11Write.read) {
                                    i6 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i12;
                            break;
                        }
                        i5 = i;
                        iMinIntrinsicWidth = i14 - i2;
                        i9 = i12;
                        i8 = 0;
                    } else {
                        i8 = iMax;
                        i5 = i11;
                        iMinIntrinsicWidth = i14;
                    }
                    iMinIntrinsicHeight = i15;
                    i7 = i12;
                    i4 = 0;
                }
                jWrite = ScrollStateExternalSyntheticLambda3.write(i6 - i3, i7);
            }
        }
        return (int) (jWrite >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo69measure3p2s80s(MeasureScope measureScope, List list, long j) {
        Measurable measurable;
        ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda3;
        Placeable placeable;
        ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet11Write;
        int i;
        char c;
        int iM3625getMaxHeightimpl;
        Measurable measurable2;
        ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda4;
        ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda5;
        AnchoredDraggableKt anchoredDraggableKt;
        AnchoredDraggableKt anchoredDraggableKt2;
        int i2;
        Integer numValueOf;
        ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet11Write2;
        long jWrite;
        long jWrite2;
        Placeable placeableMo2209measureBRTryo0;
        int measuredWidth;
        int measuredHeight;
        int measuredHeight2;
        int measuredWidth2;
        if (!list.isEmpty()) {
            int iM3625getMaxHeightimpl2 = Constraints.m3625getMaxHeightimpl(j);
            OutlinedTextFieldLayout outlinedTextFieldLayout = this.read;
            if (iM3625getMaxHeightimpl2 != 0 || outlinedTextFieldLayout.MediaMetadataCompat == OutlinedTextField.Visible) {
                List list2 = (List) onContentCardDismissed.read(list);
                if (list2.isEmpty()) {
                    return MeasureScope.layout$default(measureScope, 0, 0, null, new accessisRelatedToAutoCommit(20), 4, null);
                }
                List list3 = (List) onContentCardDismissed.read(1, list);
                Measurable measurable3 = list3 != null ? (Measurable) onContentCardDismissed.MediaMetadataCompat(list3) : null;
                List list4 = (List) onContentCardDismissed.read(2, list);
                Measurable measurable4 = list4 != null ? (Measurable) onContentCardDismissed.MediaMetadataCompat(list4) : null;
                list2.size();
                outlinedTextFieldLayout.getClass();
                SnackbarHostKt snackbarHostKt = SnackbarHostKt.Horizontal;
                long jSerializer = calculateInSampleSizelambda1.serializer(calculateInSampleSizelambda1.IconCompatParcelizer(10, calculateInSampleSizelambda1.write(j, snackbarHostKt)), snackbarHostKt);
                if (measurable3 != null) {
                    if (((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(measurable3)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue() == 0.0f) {
                        BuildersKt.RemoteActionCompatParcelizer(measurable3);
                        Placeable placeableMo2209measureBRTryo1 = measurable3.mo2209measureBRTryo0(jSerializer);
                        if (placeableMo2209measureBRTryo1 != null) {
                            measuredWidth2 = placeableMo2209measureBRTryo1.getMeasuredWidth();
                            measuredHeight2 = placeableMo2209measureBRTryo1.getMeasuredHeight();
                        } else {
                            measuredHeight2 = 0;
                            measuredWidth2 = 0;
                        }
                        outlinedTextFieldLayout.RatingCompat = new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(measuredWidth2, measuredHeight2));
                        outlinedTextFieldLayout.read = placeableMo2209measureBRTryo1;
                        placeableMo2209measureBRTryo1.getMeasuredWidth();
                        placeableMo2209measureBRTryo1.getMeasuredHeight();
                    } else {
                        measurable3.minIntrinsicHeight(measurable3.minIntrinsicWidth(Integer.MAX_VALUE));
                    }
                    outlinedTextFieldLayout.RemoteActionCompatParcelizer = measurable3;
                }
                if (measurable4 != null) {
                    if (((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(measurable4)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue() == 0.0f) {
                        BuildersKt.RemoteActionCompatParcelizer(measurable4);
                        Placeable placeableMo2209measureBRTryo2 = measurable4.mo2209measureBRTryo0(jSerializer);
                        if (placeableMo2209measureBRTryo2 != null) {
                            measuredWidth = placeableMo2209measureBRTryo2.getMeasuredWidth();
                            measuredHeight = placeableMo2209measureBRTryo2.getMeasuredHeight();
                        } else {
                            measuredWidth = 0;
                            measuredHeight = 0;
                        }
                        outlinedTextFieldLayout.write = new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(measuredWidth, measuredHeight));
                        outlinedTextFieldLayout.IconCompatParcelizer = placeableMo2209measureBRTryo2;
                        placeableMo2209measureBRTryo2.getMeasuredWidth();
                        placeableMo2209measureBRTryo2.getMeasuredHeight();
                    } else {
                        measurable4.minIntrinsicHeight(measurable4.minIntrinsicWidth(Integer.MAX_VALUE));
                    }
                    outlinedTextFieldLayout.serializer = measurable4;
                }
                Iterator it = list2.iterator();
                long jWrite3 = calculateInSampleSizelambda1.write(j, snackbarHostKt);
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new MeasureResult[16]);
                int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(jWrite3);
                int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(jWrite3);
                int iM3625getMaxHeightimpl3 = Constraints.m3625getMaxHeightimpl(jWrite3);
                animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
                animateToWithDecay animatetowithdecay2 = new animateToWithDecay();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(measureScope.mo48toPx0680j_4(this.IconCompatParcelizer));
                int iCeil2 = (int) Math.ceil(measureScope.mo48toPx0680j_4(this.serializer));
                long jConstraints = ConstraintsKt.Constraints(0, iM3626getMaxWidthimpl, 0, iM3625getMaxHeightimpl3);
                long jSerializer2 = calculateInSampleSizelambda1.serializer(calculateInSampleSizelambda1.IconCompatParcelizer(14, jConstraints), snackbarHostKt);
                if (it.hasNext()) {
                    try {
                        measurable = (Measurable) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        measurable = null;
                    }
                } else {
                    measurable = null;
                }
                if (measurable != null) {
                    if (((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(measurable)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue() == 0.0f) {
                        BuildersKt.RemoteActionCompatParcelizer(measurable);
                        placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(jSerializer2);
                        jWrite2 = ScrollStateExternalSyntheticLambda3.write(placeableMo2209measureBRTryo0.getMeasuredWidth(), placeableMo2209measureBRTryo0.getMeasuredHeight());
                    } else {
                        int iMinIntrinsicWidth = measurable.minIntrinsicWidth(Integer.MAX_VALUE);
                        jWrite2 = ScrollStateExternalSyntheticLambda3.write(iMinIntrinsicWidth, measurable.minIntrinsicHeight(iMinIntrinsicWidth));
                        placeableMo2209measureBRTryo0 = null;
                    }
                    scrollStateExternalSyntheticLambda3 = new ScrollStateExternalSyntheticLambda3(jWrite2);
                    placeable = placeableMo2209measureBRTryo0;
                } else {
                    jConstraints = jConstraints;
                    iCeil2 = iCeil2;
                    scrollStateExternalSyntheticLambda3 = null;
                    placeable = null;
                }
                Integer numValueOf2 = scrollStateExternalSyntheticLambda3 != null ? Integer.valueOf((int) (scrollStateExternalSyntheticLambda3.RemoteActionCompatParcelizer >> 32)) : null;
                Integer numValueOf3 = scrollStateExternalSyntheticLambda3 != null ? Integer.valueOf((int) (scrollStateExternalSyntheticLambda3.RemoteActionCompatParcelizer & 4294967295L)) : null;
                AnchoredDraggableKt anchoredDraggableKt3 = new AnchoredDraggableKt();
                AnchoredDraggableKt anchoredDraggableKt4 = new AnchoredDraggableKt();
                drag dragVar = new drag();
                Measurable measurable5 = measurable;
                OutlinedTextFieldLayout outlinedTextFieldLayout2 = this.read;
                long j2 = jConstraints;
                int i3 = iCeil2;
                ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda6 = scrollStateExternalSyntheticLambda3;
                drag dragVar2 = dragVar;
                ArrayList arrayList2 = arrayList;
                isMetaPressedZmokQxo ismetapressedzmokqxo = new isMetaPressedZmokQxo(outlinedTextFieldLayout2, jWrite3, iCeil, i3);
                FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer = ismetapressedzmokqxo.RemoteActionCompatParcelizer(it.hasNext(), 0, ScrollStateExternalSyntheticLambda3.write(iM3626getMaxWidthimpl, iM3625getMaxHeightimpl3), scrollStateExternalSyntheticLambda6, 0, 0, 0, false, false);
                if (flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer.IconCompatParcelizer) {
                    modalBottomSheetKtScrimdismissSheet11Write = ismetapressedzmokqxo.write(flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer, scrollStateExternalSyntheticLambda6 != null, -1, 0, iM3626getMaxWidthimpl, 0);
                } else {
                    modalBottomSheetKtScrimdismissSheet11Write = null;
                }
                int i4 = iM3626getMaxWidthimpl;
                AnchoredDraggableKt anchoredDraggableKt5 = anchoredDraggableKt3;
                AnchoredDraggableKt anchoredDraggableKt6 = anchoredDraggableKt4;
                int iMax = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = iM3628getMinWidthimpl;
                ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet11 = modalBottomSheetKtScrimdismissSheet11Write;
                int i11 = iM3625getMaxHeightimpl3;
                Placeable placeableMo2209measureBRTryo3 = placeable;
                Measurable measurable6 = measurable5;
                while (!flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer.IconCompatParcelizer && measurable6 != null) {
                    numValueOf2.getClass();
                    int iIntValue = numValueOf2.intValue();
                    numValueOf3.getClass();
                    int i12 = iM3626getMaxWidthimpl;
                    i5 += iIntValue;
                    iMax = Math.max(iMax, numValueOf3.intValue());
                    int i13 = i4 - iIntValue;
                    int i14 = i6 + 1;
                    outlinedTextFieldLayout2.getClass();
                    arrayList2.add(measurable6);
                    animatetowithdecay2.IconCompatParcelizer(i6, placeableMo2209measureBRTryo3);
                    measurable6.getParentData();
                    int i15 = i14 - i7;
                    if (it.hasNext()) {
                        try {
                            measurable2 = (Measurable) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            measurable2 = null;
                        }
                    } else {
                        measurable2 = null;
                    }
                    if (measurable2 != null) {
                        if (((Float) BuildersKt.IconCompatParcelizer(386167700, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -386167695, new Object[]{BuildersKt.RemoteActionCompatParcelizer(measurable2)}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer())).floatValue() == 0.0f) {
                            BuildersKt.RemoteActionCompatParcelizer(measurable2);
                            placeableMo2209measureBRTryo3 = measurable2.mo2209measureBRTryo0(jSerializer2);
                            jWrite = ScrollStateExternalSyntheticLambda3.write(placeableMo2209measureBRTryo3.getMeasuredWidth(), placeableMo2209measureBRTryo3.getMeasuredHeight());
                        } else {
                            int iMinIntrinsicWidth2 = measurable2.minIntrinsicWidth(Integer.MAX_VALUE);
                            jWrite = ScrollStateExternalSyntheticLambda3.write(iMinIntrinsicWidth2, measurable2.minIntrinsicHeight(iMinIntrinsicWidth2));
                            placeableMo2209measureBRTryo3 = null;
                        }
                        scrollStateExternalSyntheticLambda4 = new ScrollStateExternalSyntheticLambda3(jWrite);
                    } else {
                        measurable2 = measurable2;
                        i7 = i7;
                        outlinedTextFieldLayout2 = outlinedTextFieldLayout2;
                        scrollStateExternalSyntheticLambda4 = null;
                        placeableMo2209measureBRTryo3 = null;
                    }
                    Integer numValueOf4 = scrollStateExternalSyntheticLambda4 != null ? Integer.valueOf(((int) (scrollStateExternalSyntheticLambda4.RemoteActionCompatParcelizer >> 32)) + iCeil) : null;
                    Integer numValueOf5 = scrollStateExternalSyntheticLambda4 != null ? Integer.valueOf((int) (scrollStateExternalSyntheticLambda4.RemoteActionCompatParcelizer & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jWrite4 = ScrollStateExternalSyntheticLambda3.write(i13, i11);
                    if (scrollStateExternalSyntheticLambda4 == null) {
                        scrollStateExternalSyntheticLambda5 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue2 = numValueOf4.intValue();
                        numValueOf5.getClass();
                        scrollStateExternalSyntheticLambda5 = new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(iIntValue2, numValueOf5.intValue()));
                    }
                    FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer2 = ismetapressedzmokqxo.RemoteActionCompatParcelizer(zHasNext, i15, jWrite4, scrollStateExternalSyntheticLambda5, i8, i9, iMax, false, false);
                    if (flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer2.serializer) {
                        i2 = i12;
                        int iMin = Math.min(Math.max(i10, i5), i2);
                        int i16 = i9 + iMax;
                        modalBottomSheetKtScrimdismissSheet11Write2 = ismetapressedzmokqxo.write(flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer2, scrollStateExternalSyntheticLambda4 != null, i8, i16, i13, i15);
                        anchoredDraggableKt2 = anchoredDraggableKt6;
                        anchoredDraggableKt2.IconCompatParcelizer(iMax);
                        i11 = (iM3625getMaxHeightimpl3 - i16) - i3;
                        anchoredDraggableKt = anchoredDraggableKt5;
                        anchoredDraggableKt.IconCompatParcelizer(i14);
                        i8++;
                        i9 = i16 + i3;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i10 = iMin;
                        i7 = i14;
                        i4 = i2;
                        iMax = 0;
                        i5 = 0;
                    } else {
                        anchoredDraggableKt = anchoredDraggableKt5;
                        anchoredDraggableKt2 = anchoredDraggableKt6;
                        i2 = i12;
                        numValueOf = numValueOf4;
                        i7 = i7;
                        i4 = i13;
                        modalBottomSheetKtScrimdismissSheet11Write2 = modalBottomSheetKtScrimdismissSheet11;
                    }
                    modalBottomSheetKtScrimdismissSheet11 = modalBottomSheetKtScrimdismissSheet11Write2;
                    anchoredDraggableKt5 = anchoredDraggableKt;
                    anchoredDraggableKt6 = anchoredDraggableKt2;
                    measurable6 = measurable2;
                    flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer = flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer2;
                    numValueOf2 = numValueOf;
                    i6 = i14;
                    iM3626getMaxWidthimpl = i2;
                    jSerializer2 = jSerializer2;
                    it = it;
                    numValueOf3 = numValueOf5;
                    outlinedTextFieldLayout2 = outlinedTextFieldLayout2;
                }
                AnchoredDraggableKt anchoredDraggableKt7 = anchoredDraggableKt5;
                AnchoredDraggableKt anchoredDraggableKt8 = anchoredDraggableKt6;
                if (modalBottomSheetKtScrimdismissSheet11 != null) {
                    ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet12 = modalBottomSheetKtScrimdismissSheet11;
                    long j3 = modalBottomSheetKtScrimdismissSheet12.write;
                    arrayList2.add(modalBottomSheetKtScrimdismissSheet12.serializer);
                    animatetowithdecay2.IconCompatParcelizer(arrayList2.size() - 1, modalBottomSheetKtScrimdismissSheet12.IconCompatParcelizer);
                    int i17 = anchoredDraggableKt7.RemoteActionCompatParcelizer - 1;
                    if (modalBottomSheetKtScrimdismissSheet12.read) {
                        anchoredDraggableKt8.write(i17, Math.max(anchoredDraggableKt8.RemoteActionCompatParcelizer(i17), (int) (j3 & 4294967295L)));
                        anchoredDraggableKt7.write(i17, anchoredDraggableKt7.read() + 1);
                    } else {
                        anchoredDraggableKt8.IconCompatParcelizer((int) (j3 & 4294967295L));
                        anchoredDraggableKt7.IconCompatParcelizer(anchoredDraggableKt7.read() + 1);
                    }
                }
                int size = arrayList2.size();
                Placeable[] placeableArr = new Placeable[size];
                for (int i18 = 0; i18 < size; i18++) {
                    placeableArr[i18] = animatetowithdecay2.serializer(i18);
                }
                int i19 = anchoredDraggableKt7.RemoteActionCompatParcelizer;
                int[] iArr = new int[i19];
                int[] iArr2 = new int[i19];
                int[] iArr3 = anchoredDraggableKt7.read;
                int iMax2 = i10;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i20 < i19) {
                    int i23 = iArr3[i20];
                    int iRemoteActionCompatParcelizer = anchoredDraggableKt8.RemoteActionCompatParcelizer(i20);
                    drag dragVar3 = dragVar2;
                    if (dragVar3.read(i20)) {
                        iM3625getMaxHeightimpl = iRemoteActionCompatParcelizer;
                        c = 65535;
                    } else {
                        c = 65535;
                        iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j2) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Constraints.m3625getMaxHeightimpl(j2) - i21;
                    }
                    int i24 = iMax2;
                    AnchoredDraggableKt anchoredDraggableKt9 = anchoredDraggableKt8;
                    int i25 = iMax2;
                    ArrayList arrayList3 = arrayList2;
                    int i26 = i20;
                    int i27 = i22;
                    ArrayList arrayList4 = arrayList2;
                    int[] iArr4 = iArr2;
                    MeasureResult measureResultWrite = LazyKt__LazyJVMKt.write(this, i24, Constraints.m3627getMinHeightimpl(j2), Constraints.m3626getMaxWidthimpl(j2), iM3625getMaxHeightimpl, iCeil, measureScope, arrayList3, placeableArr, i27, i23, iArr, i26);
                    int width = measureResultWrite.getWidth();
                    int height = measureResultWrite.getHeight();
                    iArr4[i26] = height;
                    i21 += height;
                    iMax2 = Math.max(i25, width);
                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(measureResultWrite);
                    i20 = i26 + 1;
                    iArr2 = iArr4;
                    arrayList2 = arrayList4;
                    i22 = i23;
                    i19 = i19;
                    dragVar2 = dragVar3;
                    iArr3 = iArr3;
                    anchoredDraggableKt8 = anchoredDraggableKt9;
                }
                int i28 = iMax2;
                int[] iArr5 = iArr2;
                if (oncreatevirtualviewtranslationrequests.read == 0) {
                    i = 0;
                    i28 = 0;
                } else {
                    i = i21;
                }
                Arrangement.Vertical vertical = this.MediaSessionCompatQueueItem;
                int iMo42roundToPx0680j_4 = ((oncreatevirtualviewtranslationrequests.read - 1) * measureScope.mo42roundToPx0680j_4(vertical.mo64getSpacingD9Ej5fM())) + i;
                int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jWrite3);
                int iM3625getMaxHeightimpl4 = Constraints.m3625getMaxHeightimpl(jWrite3);
                if (iMo42roundToPx0680j_4 < iM3627getMinHeightimpl) {
                    iMo42roundToPx0680j_4 = iM3627getMinHeightimpl;
                }
                if (iMo42roundToPx0680j_4 > iM3625getMaxHeightimpl4) {
                    iMo42roundToPx0680j_4 = iM3625getMaxHeightimpl4;
                }
                vertical.read(measureScope, iMo42roundToPx0680j_4, iArr5, iArr);
                int iM3628getMinWidthimpl2 = Constraints.m3628getMinWidthimpl(jWrite3);
                int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(jWrite3);
                if (i28 < iM3628getMinWidthimpl2) {
                    i28 = iM3628getMinWidthimpl2;
                }
                if (i28 > iM3626getMaxWidthimpl2) {
                    i28 = iM3626getMaxWidthimpl2;
                }
                return MeasureScope.layout$default(measureScope, i28, iMo42roundToPx0680j_4, null, new InlineChildren(6, oncreatevirtualviewtranslationrequests), 4, null);
            }
        }
        return MeasureScope.layout$default(measureScope, 0, 0, null, new accessisRelatedToAutoCommit(20), 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        List list2;
        long jWrite;
        OutlinedTextField outlinedTextField;
        int i5 = 1;
        List list3 = (List) onContentCardDismissed.read(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list3 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list3) : null;
        List list4 = (List) onContentCardDismissed.read(2, list);
        this.read.write(intrinsicMeasurable, list4 != null ? (IntrinsicMeasurable) onContentCardDismissed.MediaMetadataCompat(list4) : null, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        List list5 = (List) onContentCardDismissed.MediaMetadataCompat(list);
        if (list5 == null) {
            list5 = instance_delegatelambda0.write;
        }
        int iMo42roundToPx0680j_4 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer);
        int iMo42roundToPx0680j_5 = intrinsicMeasureScope.mo42roundToPx0680j_4(this.serializer);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr = new int[size];
        int size2 = list5.size();
        int[] iArr2 = new int[size2];
        List list6 = list5;
        int size3 = list6.size();
        for (int i6 = 0; i6 < size3; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list5.get(i6);
            int iMinIntrinsicWidth = intrinsicMeasurable2.minIntrinsicWidth(i);
            iArr[i6] = iMinIntrinsicWidth;
            iArr2[i6] = intrinsicMeasurable2.minIntrinsicHeight(iMinIntrinsicWidth);
        }
        int size4 = list5.size();
        OutlinedTextFieldLayout outlinedTextFieldLayout = this.read;
        if (Integer.MAX_VALUE >= size4 || !((outlinedTextField = outlinedTextFieldLayout.MediaMetadataCompat) == OutlinedTextField.ExpandIndicator || outlinedTextField == OutlinedTextField.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list5.size()) {
                outlinedTextFieldLayout.getClass();
                i2 = outlinedTextFieldLayout.MediaMetadataCompat == OutlinedTextField.ExpandOrCollapseIndicator ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i2, list5.size());
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += iArr[i8];
        }
        int size5 = ((list5.size() - 1) * iMo42roundToPx0680j_4) + i7;
        if (size2 != 0) {
            int i9 = iArr2[0];
            int i10 = size2 - 1;
            if (1 <= i10) {
                int i11 = i9;
                while (true) {
                    int i12 = iArr2[i5];
                    if (i11 < i12) {
                        i11 = i12;
                    }
                    if (i5 == i10) {
                        break;
                    }
                    i5++;
                }
                i9 = i11;
            }
            if (size != 0) {
                int i13 = iArr[0];
                int i14 = size - 1;
                if (1 <= i14) {
                    int i15 = 1;
                    while (true) {
                        int i16 = iArr[i15];
                        if (i13 < i16) {
                            i13 = i16;
                        }
                        if (i15 == i14) {
                            break;
                        }
                        i15++;
                    }
                }
                int i17 = size5;
                int i18 = i9;
                while (i13 <= i17 && i18 != i) {
                    size5 = (i13 + i17) / 2;
                    if (list5.isEmpty()) {
                        iArr = iArr;
                        iArr2 = iArr2;
                        list2 = list6;
                        outlinedTextFieldLayout = outlinedTextFieldLayout;
                        jWrite = ScrollStateExternalSyntheticLambda3.write(0, 0);
                        i3 = i13;
                    } else {
                        isMetaPressedZmokQxo ismetapressedzmokqxo = new isMetaPressedZmokQxo(outlinedTextFieldLayout, ConstraintsKt.Constraints(0, size5, 0, Integer.MAX_VALUE), iMo42roundToPx0680j_4, iMo42roundToPx0680j_5);
                        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) onContentCardDismissed.read(0, list5);
                        int i19 = intrinsicMeasurable3 != null ? iArr2[0] : 0;
                        int i20 = intrinsicMeasurable3 != null ? iArr[0] : 0;
                        i3 = i13;
                        if (list5.size() > 1) {
                            z = true;
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = Integer.MAX_VALUE;
                            z = false;
                        }
                        if (ismetapressedzmokqxo.RemoteActionCompatParcelizer(z, 0, ScrollStateExternalSyntheticLambda3.write(size5, i4), intrinsicMeasurable3 == null ? null : new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(i20, i19)), 0, 0, 0, false, false).IconCompatParcelizer) {
                            ScrollStateExternalSyntheticLambda3 scrollStateExternalSyntheticLambda3Serializer = outlinedTextFieldLayout.serializer(0, 0, intrinsicMeasurable3 != null);
                            jWrite = ScrollStateExternalSyntheticLambda3.write(scrollStateExternalSyntheticLambda3Serializer != null ? (int) (scrollStateExternalSyntheticLambda3Serializer.RemoteActionCompatParcelizer & 4294967295L) : 0, 0);
                            iArr2 = iArr2;
                            iArr = iArr;
                            list2 = list6;
                            outlinedTextFieldLayout = outlinedTextFieldLayout;
                        } else {
                            int size6 = list6.size();
                            int i21 = size5;
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = i20;
                            int i26 = 0;
                            int i27 = i19;
                            int i28 = 0;
                            while (true) {
                                if (i22 >= size6) {
                                    iArr2 = iArr2;
                                    iArr = iArr;
                                    list2 = list6;
                                    outlinedTextFieldLayout = outlinedTextFieldLayout;
                                    break;
                                }
                                int i29 = size6;
                                int i30 = i21 - i25;
                                list2 = list6;
                                int i31 = i22 + 1;
                                int iMax = Math.max(i23, i27);
                                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) onContentCardDismissed.read(i31, list5);
                                int i32 = intrinsicMeasurable4 != null ? iArr2[i31] : 0;
                                int i33 = intrinsicMeasurable4 != null ? iArr[i31] + iMo42roundToPx0680j_4 : 0;
                                boolean z2 = i22 + 2 < list5.size();
                                int i34 = i31 - i28;
                                FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer = ismetapressedzmokqxo.RemoteActionCompatParcelizer(z2, i34, ScrollStateExternalSyntheticLambda3.write(i30, Integer.MAX_VALUE), intrinsicMeasurable4 == null ? null : new ScrollStateExternalSyntheticLambda3(ScrollStateExternalSyntheticLambda3.write(i33, i32)), i26, i24, iMax, false, false);
                                if (flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer.serializer) {
                                    int i35 = iMax + iMo42roundToPx0680j_5 + i24;
                                    ModalBottomSheetKtScrimdismissSheet11 modalBottomSheetKtScrimdismissSheet11Write = ismetapressedzmokqxo.write(flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer, intrinsicMeasurable4 != null, i26, i35, i30, i34);
                                    i26++;
                                    if (flowLayoutBuildingBlocks$WrapInfoRemoteActionCompatParcelizer.IconCompatParcelizer) {
                                        if (modalBottomSheetKtScrimdismissSheet11Write != null) {
                                            long j = modalBottomSheetKtScrimdismissSheet11Write.write;
                                            if (modalBottomSheetKtScrimdismissSheet11Write.read) {
                                                i24 = i35;
                                            } else {
                                                i24 = ((int) (j & 4294967295L)) + iMo42roundToPx0680j_5 + i35;
                                            }
                                        } else {
                                            i24 = i35;
                                        }
                                        i22 = i31;
                                        break;
                                    }
                                    i33 -= iMo42roundToPx0680j_4;
                                    i21 = size5;
                                    i24 = i35;
                                    i28 = i31;
                                    i23 = 0;
                                } else {
                                    i21 = i30;
                                    i23 = iMax;
                                }
                                i22 = i31;
                                list6 = list2;
                                size6 = i29;
                                iArr2 = iArr2;
                                outlinedTextFieldLayout = outlinedTextFieldLayout;
                                i27 = i32;
                                i25 = i33;
                                iArr = iArr;
                            }
                            jWrite = ScrollStateExternalSyntheticLambda3.write(i24 - iMo42roundToPx0680j_5, i22);
                        }
                    }
                    int i36 = (int) (jWrite >> 32);
                    int i37 = (int) (jWrite & 4294967295L);
                    if (i36 > i || i37 < iMin) {
                        i13 = size5 + 1;
                        if (i13 > i17) {
                            return i13;
                        }
                    } else {
                        if (i36 >= i) {
                            return size5;
                        }
                        i17 = size5 - 1;
                        i13 = i3;
                    }
                    list6 = list2;
                    iArr2 = iArr2;
                    iArr = iArr;
                    outlinedTextFieldLayout = outlinedTextFieldLayout;
                    i18 = i36;
                }
                return size5;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
        }
        return 0;
    }
}
