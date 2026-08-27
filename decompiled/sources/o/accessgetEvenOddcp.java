package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetEvenOddcp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.layout.Placeable serializer;

    public /* synthetic */ accessgetEvenOddcp(androidx.compose.ui.layout.Placeable placeable, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = placeable;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, 0, 0, 0.0f, 4, null);
                return createfromparcel;
            case 1:
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, 0, 0, 0.0f, 4, null);
                return createfromparcel;
            case 2:
                androidx.compose.ui.layout.Placeable.PlacementScope.m2281placeRelative70tqf50$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac(), 0.0f, 2, null);
                return createfromparcel;
            case 3:
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, 0, 0, 0.0f, 4, null);
                return createfromparcel;
            case 4:
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, 0, 0, 0.0f, 4, null);
                int i3 = read + 21;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return createfromparcel;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 5:
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, 0, 0, 0.0f, 4, null);
                int i4 = write + 21;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel;
            case 6:
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.serializer, 0, 0, 0.0f, 4, null);
                return createfromparcel;
            default:
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                placementScope.getClass();
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, this.serializer, 0, 0, 0.0f, 4, null);
                return createfromparcel;
        }
    }
}
