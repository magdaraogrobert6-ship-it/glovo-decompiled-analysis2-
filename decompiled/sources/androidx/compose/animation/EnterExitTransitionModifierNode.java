package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import o.PaddingValuesModifier;
import o.PaddingValuesa9UjIt4default;
import o.ScrollableNestedScrollConnection;
import o.ScrollableNode;
import o.ScrollableNodesetScrollSemanticsActions11;
import o.ScrollingLogic;
import o.ScrollingLogicdoFlingAnimation2;
import o.ScrollingLogicdoFlingAnimation2reverseScope1;
import o.ScrollingLogiconScrollStoppedperformFling1;
import o.TapGestureDetectorKt;
import o.accesssemanticsScrollByd4ec7I;
import o.awaitFirstDown;
import o.onPostFlingRZ2iAVY;
import o.onShowTranslationui;
import o.processTapGesture;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.reset;
import o.toOffsettuRUvjQ;
import o.toSingleAxisDeltaFromAnglek4lQ0M;
import o.tryAwaitRelease;
import o.waitForUpOrCancellation;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionModifierNode extends processTapGesture {
    public TapGestureDetectorKt IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem = AnimationModifierKt.read;
    public PaddingValuesModifier MediaDescriptionCompat;
    public PaddingValuesModifier MediaMetadataCompat;
    public PaddingValuesModifier MediaSessionCompatQueueItem;
    public final ScrollingLogiconScrollStoppedperformFling1 MediaSessionCompatResultReceiverWrapper;
    public Transition MediaSessionCompatToken;
    public final ScrollingLogiconScrollStoppedperformFling1 RatingCompat;
    public onPostFlingRZ2iAVY RemoteActionCompatParcelizer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public Alignment serializer;
    public ScrollingLogicdoFlingAnimation2reverseScope1 write;

    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        TransformOrigin transformOriginM1125boximpl;
        if (this.MediaSessionCompatToken.MediaSessionCompatToken.IconCompatParcelizer() == ((onShowTranslationui) this.MediaSessionCompatToken.MediaBrowserCompatMediaItem).getValue()) {
            this.serializer = null;
        } else if (this.serializer == null) {
            Alignment topStart = read();
            if (topStart == null) {
                topStart = Alignment.Companion.getTopStart();
            }
            this.serializer = topStart;
        }
        if (measureScope.isLookingAhead()) {
            Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
            long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
            this.MediaBrowserCompatMediaItem = jM3839constructorimpl;
            return MeasureScope.layout$default(measureScope, (int) (jM3839constructorimpl >> 32), (int) (jM3839constructorimpl & 4294967295L), null, new toOffsettuRUvjQ(placeableMo2209measureBRTryo0), 4, null);
        }
        if (!((Boolean) this.read.invoke()).booleanValue()) {
            Placeable placeableMo2209measureBRTryo1 = measurable.mo2209measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo1.getWidth(), placeableMo2209measureBRTryo1.getHeight(), null, new awaitFirstDown(placeableMo2209measureBRTryo1), 4, null);
        }
        onPostFlingRZ2iAVY onpostflingrz2iavy = this.RemoteActionCompatParcelizer;
        PaddingValuesModifier paddingValuesModifier = onpostflingrz2iavy.IconCompatParcelizer;
        PaddingValuesModifier paddingValuesModifier2 = onpostflingrz2iavy.RemoteActionCompatParcelizer;
        Transition transition = onpostflingrz2iavy.read;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1 = onpostflingrz2iavy.write;
        TapGestureDetectorKt tapGestureDetectorKt = onpostflingrz2iavy.serializer;
        PaddingValuesModifier paddingValuesModifier3 = onpostflingrz2iavy.RatingCompat;
        PaddingValuesa9UjIt4default paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer = paddingValuesModifier != null ? paddingValuesModifier.RemoteActionCompatParcelizer(new ScrollableNode(scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, 0), new ScrollableNode(scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, 1)) : null;
        PaddingValuesa9UjIt4default paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer2 = paddingValuesModifier2 != null ? paddingValuesModifier2.RemoteActionCompatParcelizer(new ScrollableNodesetScrollSemanticsActions11(scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, 0), new ScrollableNodesetScrollSemanticsActions11(scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, 2)) : null;
        if (transition.MediaSessionCompatToken.IconCompatParcelizer() == accesssemanticsScrollByd4ec7I.PreEnter) {
            waitForUpOrCancellation waitforuporcancellation = scrollingLogicdoFlingAnimation2reverseScope1.serializer.read;
            if (waitforuporcancellation == null && (waitforuporcancellation = tapGestureDetectorKt.serializer.read) == null) {
                transformOriginM1125boximpl = null;
            } else {
                transformOriginM1125boximpl = TransformOrigin.m1125boximpl(waitforuporcancellation.read);
            }
        } else {
            waitForUpOrCancellation waitforuporcancellation2 = tapGestureDetectorKt.serializer.read;
            if (waitforuporcancellation2 == null && (waitforuporcancellation2 = scrollingLogicdoFlingAnimation2reverseScope1.serializer.read) == null) {
                transformOriginM1125boximpl = null;
            } else {
                transformOriginM1125boximpl = TransformOrigin.m1125boximpl(waitforuporcancellation2.read);
            }
        }
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer, paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer2, paddingValuesModifier3 != null ? paddingValuesModifier3.RemoteActionCompatParcelizer(reset.MediaDescriptionCompat, new ScrollingLogic(transformOriginM1125boximpl, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt)) : null);
        Placeable placeableMo2209measureBRTryo2 = measurable.mo2209measureBRTryo0(j);
        long jM3839constructorimpl2 = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo2.getHeight()) & 4294967295L) | (((long) placeableMo2209measureBRTryo2.getWidth()) << 32));
        long j2 = !IntSize.m3842equalsimpl0(this.MediaBrowserCompatMediaItem, AnimationModifierKt.read) ? this.MediaBrowserCompatMediaItem : jM3839constructorimpl2;
        PaddingValuesModifier paddingValuesModifier4 = this.MediaSessionCompatQueueItem;
        PaddingValuesa9UjIt4default paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer3 = paddingValuesModifier4 != null ? paddingValuesModifier4.RemoteActionCompatParcelizer(this.RatingCompat, new ScrollingLogicdoFlingAnimation2(this, j2, 0)) : null;
        if (paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer3 != null) {
            jM3839constructorimpl2 = ((IntSize) paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer3.getValue()).m3848unboximpl();
        }
        long jM3640constrain4WqzIAM = ConstraintsKt.m3640constrain4WqzIAM(j, jM3839constructorimpl2);
        PaddingValuesModifier paddingValuesModifier5 = this.MediaDescriptionCompat;
        long jM3810unboximpl = paddingValuesModifier5 != null ? ((IntOffset) paddingValuesModifier5.RemoteActionCompatParcelizer(reset.MediaSessionCompatQueueItem, new ScrollingLogicdoFlingAnimation2(this, j2, 1)).getValue()).m3810unboximpl() : IntOffset.Companion.m3812getZeronOccac();
        PaddingValuesModifier paddingValuesModifier6 = this.MediaMetadataCompat;
        long jM3810unboximpl2 = paddingValuesModifier6 != null ? ((IntOffset) paddingValuesModifier6.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, new ScrollingLogicdoFlingAnimation2(this, j2, 2)).getValue()).m3810unboximpl() : IntOffset.Companion.m3812getZeronOccac();
        Alignment alignment = this.serializer;
        return MeasureScope.layout$default(measureScope, (int) (jM3640constrain4WqzIAM >> 32), (int) (jM3640constrain4WqzIAM & 4294967295L), null, new toSingleAxisDeltaFromAnglek4lQ0M(placeableMo2209measureBRTryo2, IntOffset.m3805plusqkQi6aY(alignment != null ? alignment.mo139alignKFBX0sM(j2, jM3640constrain4WqzIAM, LayoutDirection.Ltr) : IntOffset.Companion.m3812getZeronOccac(), jM3810unboximpl2), jM3810unboximpl, scrollableNestedScrollConnection), 4, null);
    }

    public final Alignment read() {
        Alignment alignment;
        Alignment alignment2;
        if (this.MediaSessionCompatToken.IconCompatParcelizer().RemoteActionCompatParcelizer(accesssemanticsScrollByd4ec7I.PreEnter, accesssemanticsScrollByd4ec7I.Visible)) {
            tryAwaitRelease tryawaitrelease = this.write.serializer.IconCompatParcelizer;
            if (tryawaitrelease != null && (alignment2 = tryawaitrelease.read) != null) {
                return alignment2;
            }
            tryAwaitRelease tryawaitrelease2 = this.IconCompatParcelizer.serializer.IconCompatParcelizer;
            if (tryawaitrelease2 != null) {
                return tryawaitrelease2.read;
            }
            return null;
        }
        tryAwaitRelease tryawaitrelease3 = this.IconCompatParcelizer.serializer.IconCompatParcelizer;
        if (tryawaitrelease3 != null && (alignment = tryawaitrelease3.read) != null) {
            return alignment;
        }
        tryAwaitRelease tryawaitrelease4 = this.write.serializer.IconCompatParcelizer;
        if (tryawaitrelease4 != null) {
            return tryawaitrelease4.read;
        }
        return null;
    }

    public EnterExitTransitionModifierNode(Transition transition, PaddingValuesModifier paddingValuesModifier, PaddingValuesModifier paddingValuesModifier2, PaddingValuesModifier paddingValuesModifier3, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, onPostFlingRZ2iAVY onpostflingrz2iavy) {
        this.MediaSessionCompatToken = transition;
        this.MediaSessionCompatQueueItem = paddingValuesModifier;
        this.MediaDescriptionCompat = paddingValuesModifier2;
        this.MediaMetadataCompat = paddingValuesModifier3;
        this.write = scrollingLogicdoFlingAnimation2reverseScope1;
        this.IconCompatParcelizer = tapGestureDetectorKt;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = onpostflingrz2iavy;
        ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.RatingCompat = new ScrollingLogiconScrollStoppedperformFling1(this, 1);
        this.MediaSessionCompatResultReceiverWrapper = new ScrollingLogiconScrollStoppedperformFling1(this, 0);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.MediaBrowserCompatMediaItem = AnimationModifierKt.read;
    }
}
