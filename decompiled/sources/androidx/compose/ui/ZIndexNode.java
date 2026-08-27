package androidx.compose.ui;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import o.MediaSessionCompatQueueItem;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private float zIndex;

    public final float getZIndex() {
        return this.zIndex;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    public ZIndexNode(float f) {
        this.zIndex = f;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                placementScope.place(placeableMo2209measureBRTryo0, 0, 0, this.getZIndex());
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    public String toString() {
        return MediaSessionCompatQueueItem.serializer(new StringBuilder("ZIndexModifier(zIndex="), this.zIndex, ')');
    }
}
