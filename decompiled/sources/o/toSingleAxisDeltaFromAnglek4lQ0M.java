package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class toSingleAxisDeltaFromAnglek4lQ0M extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ ScrollableNestedScrollConnection RemoteActionCompatParcelizer;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ androidx.compose.ui.layout.Placeable write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
        long j = this.IconCompatParcelizer;
        int iM3801getXimpl = androidx.compose.ui.unit.IntOffset.m3801getXimpl(j);
        long j2 = this.serializer;
        int iM3801getXimpl2 = androidx.compose.ui.unit.IntOffset.m3801getXimpl(j2);
        int iM3802getYimpl = androidx.compose.ui.unit.IntOffset.m3802getYimpl(j);
        int iM3802getYimpl2 = androidx.compose.ui.unit.IntOffset.m3802getYimpl(j2);
        placementScope.placeWithLayer(this.write, iM3801getXimpl + iM3801getXimpl2, iM3802getYimpl2 + iM3802getYimpl, 0.0f, this.RemoteActionCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toSingleAxisDeltaFromAnglek4lQ0M(androidx.compose.ui.layout.Placeable placeable, long j, long j2, ScrollableNestedScrollConnection scrollableNestedScrollConnection) {
        super(1);
        this.write = placeable;
        this.IconCompatParcelizer = j;
        this.serializer = j2;
        this.RemoteActionCompatParcelizer = scrollableNestedScrollConnection;
    }
}
