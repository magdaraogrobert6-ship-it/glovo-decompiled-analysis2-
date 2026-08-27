package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ColorModelCompanion extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.layout.Placeable RemoteActionCompatParcelizer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
        placementScope.getClass();
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorModelCompanion(androidx.compose.ui.layout.Placeable placeable) {
        super(1);
        this.RemoteActionCompatParcelizer = placeable;
    }
}
