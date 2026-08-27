package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class MouseWheelScrollingLogicKt extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.layout.Placeable IconCompatParcelizer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.IconCompatParcelizer, 0, 0, 0.0f, 4, null);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogicKt(androidx.compose.ui.layout.Placeable placeable) {
        super(1);
        this.IconCompatParcelizer = placeable;
    }
}
