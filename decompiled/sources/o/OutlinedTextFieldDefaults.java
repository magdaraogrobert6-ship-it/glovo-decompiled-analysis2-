package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OutlinedTextFieldDefaults implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.layout.Placeable RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ OutlinedTextFieldDefaults(androidx.compose.ui.layout.Placeable placeable, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = placeable;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
            return createfromparcel;
        }
        if (i == 1) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
            return createfromparcel;
        }
        if (i == 2) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
            return createfromparcel;
        }
        if (i == 3) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
            return createfromparcel;
        }
        if (i != 4) {
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
            return createfromparcel;
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.RemoteActionCompatParcelizer, 0, 0, 0.0f, 4, null);
        return createfromparcel;
    }
}
