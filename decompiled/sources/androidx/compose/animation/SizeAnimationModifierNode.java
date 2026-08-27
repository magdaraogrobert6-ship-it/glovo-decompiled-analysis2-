package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import kotlinx.coroutines.BuildersKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TapGestureDetectorKtawaitSecondDown2;
import o.TrackpadScrollingLogic;
import o.createFromParcel;
import o.onShowTranslationui;
import o.processTapGesture;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requiredWidth3ABfNKs;

/* JADX INFO: loaded from: classes.dex */
public final class SizeAnimationModifierNode extends processTapGesture {
    public boolean IconCompatParcelizer;
    public Alignment serializer;
    public TrackpadScrollingLogic write;
    public long MediaBrowserCompatMediaItem = AnimationModifierKt.read;
    public long read = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(null);

    public SizeAnimationModifierNode(TrackpadScrollingLogic trackpadScrollingLogic, Alignment alignment) {
        this.write = trackpadScrollingLogic;
        this.serializer = alignment;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.MediaBrowserCompatMediaItem = AnimationModifierKt.read;
        this.IconCompatParcelizer = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        ((onShowTranslationui) this.RemoteActionCompatParcelizer).setValue(null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableMo2209measureBRTryo0;
        TapGestureDetectorKtawaitSecondDown2 tapGestureDetectorKtawaitSecondDown2;
        long jM3640constrain4WqzIAM;
        char c;
        if (measureScope.isLookingAhead()) {
            this.read = j;
            this.IconCompatParcelizer = true;
            placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        } else {
            placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(this.IconCompatParcelizer ? this.read : j);
        }
        final Placeable placeable = placeableMo2209measureBRTryo0;
        final long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) placeable.getWidth()) << 32) | (((long) placeable.getHeight()) & 4294967295L));
        if (measureScope.isLookingAhead()) {
            this.MediaBrowserCompatMediaItem = jM3839constructorimpl;
            c = ' ';
            jM3640constrain4WqzIAM = jM3839constructorimpl;
        } else {
            long j2 = !IntSize.m3842equalsimpl0(this.MediaBrowserCompatMediaItem, AnimationModifierKt.read) ? this.MediaBrowserCompatMediaItem : jM3839constructorimpl;
            onShowTranslationui onshowtranslationui = (onShowTranslationui) this.RemoteActionCompatParcelizer;
            TapGestureDetectorKtawaitSecondDown2 tapGestureDetectorKtawaitSecondDown3 = (TapGestureDetectorKtawaitSecondDown2) onshowtranslationui.getValue();
            if (tapGestureDetectorKtawaitSecondDown3 != null) {
                Animatable animatable = tapGestureDetectorKtawaitSecondDown3.RemoteActionCompatParcelizer;
                boolean z = (IntSize.m3842equalsimpl0(j2, ((IntSize) animatable.write()).m3848unboximpl()) || animatable.IconCompatParcelizer()) ? false : true;
                if (!IntSize.m3842equalsimpl0(j2, ((IntSize) ((onShowTranslationui) animatable.RatingCompat).getValue()).m3848unboximpl()) || z) {
                    tapGestureDetectorKtawaitSecondDown3.read = ((IntSize) animatable.write()).m3848unboximpl();
                    BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new NafathTimerManager$observeCountdown$1(tapGestureDetectorKtawaitSecondDown3, j2, this, (ShortNewsContentCardView) null, 1), 3);
                }
                tapGestureDetectorKtawaitSecondDown2 = tapGestureDetectorKtawaitSecondDown3;
            } else {
                onshowtranslationui = onshowtranslationui;
                tapGestureDetectorKtawaitSecondDown2 = new TapGestureDetectorKtawaitSecondDown2(new Animatable(IntSize.m3836boximpl(j2), requiredWidth3ABfNKs.IconCompatParcelizer, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)), 8), j2);
            }
            onshowtranslationui.setValue(tapGestureDetectorKtawaitSecondDown2);
            jM3640constrain4WqzIAM = ConstraintsKt.m3640constrain4WqzIAM(j, ((IntSize) tapGestureDetectorKtawaitSecondDown2.RemoteActionCompatParcelizer.write()).m3848unboximpl());
            c = ' ';
        }
        final int i = (int) (jM3640constrain4WqzIAM >> c);
        final int i2 = (int) (jM3640constrain4WqzIAM & 4294967295L);
        return MeasureScope.layout$default(measureScope, i, i2, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                Placeable.PlacementScope.m2280place70tqf50$default((Placeable.PlacementScope) obj, placeable, this.MediaSessionCompatQueueItem.serializer.mo139alignKFBX0sM(jM3839constructorimpl, IntSize.m3839constructorimpl((((long) i) << 32) | (((long) i2) & 4294967295L)), measureScope.getLayoutDirection()), 0.0f, 2, null);
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }
}
