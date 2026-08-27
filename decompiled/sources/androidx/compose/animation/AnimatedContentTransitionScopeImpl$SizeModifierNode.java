package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import o.PaddingValuesModifier;
import o.PaddingValuesa9UjIt4default;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessdispatchMouseWheelScrollwaitNextScrollDelta;
import o.createFromParcel;
import o.positionChangeInternalwfG_k4k;
import o.primaryAxisPosition_bfSUIo;
import o.processTapGesture;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode extends processTapGesture {
    public PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public positionChangeInternalwfG_k4k read;
    public PaddingValuesModifier serializer;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        this.RemoteActionCompatParcelizer = AnimatedContentKt.IconCompatParcelizer;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final long jM3848unboximpl;
        final Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        if (measureScope.isLookingAhead()) {
            jM3848unboximpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
        } else if (this.serializer == null) {
            jM3848unboximpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
            this.RemoteActionCompatParcelizer = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
        } else {
            long jM3839constructorimpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
            PaddingValuesModifier paddingValuesModifier = this.serializer;
            paddingValuesModifier.getClass();
            PaddingValuesa9UjIt4default paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer = paddingValuesModifier.RemoteActionCompatParcelizer(new accessdispatchMouseWheelScrollwaitNextScrollDelta(this, jM3839constructorimpl), new primaryAxisPosition_bfSUIo(this, jM3839constructorimpl));
            this.read.getClass();
            jM3848unboximpl = ((IntSize) paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer.getValue()).m3848unboximpl();
            this.RemoteActionCompatParcelizer = ((IntSize) paddingValuesa9UjIt4defaultRemoteActionCompatParcelizer.getValue()).m3848unboximpl();
        }
        return MeasureScope.layout$default(measureScope, (int) (jM3848unboximpl >> 32), (int) (jM3848unboximpl & 4294967295L), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Alignment alignment = this.read.read.read;
                Placeable placeable = placeableMo2209measureBRTryo0;
                Placeable.PlacementScope.m2280place70tqf50$default(placementScope, placeableMo2209measureBRTryo0, alignment.mo139alignKFBX0sM(IntSize.m3839constructorimpl((((long) placeable.getWidth()) << 32) | (((long) placeable.getHeight()) & 4294967295L)), jM3848unboximpl, LayoutDirection.Ltr), 0.0f, 2, null);
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }
}
