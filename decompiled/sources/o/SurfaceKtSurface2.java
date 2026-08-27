package o;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SurfaceKtSurface2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.ui.layout.Placeable IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ SurfaceKtSurface2(int i, int i2, androidx.compose.ui.layout.Placeable placeable) {
        this.write = 2;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = placeable;
        this.serializer = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer, 0.0f, 4, null);
            return createfromparcel;
        }
        if (i == 1) {
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer, 0.0f, 4, null);
            return createfromparcel;
        }
        androidx.compose.ui.layout.Placeable placeable = this.IconCompatParcelizer;
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, placeable, MathKt.write((this.RemoteActionCompatParcelizer - placeable.getWidth()) / 2.0f), MathKt.write((this.serializer - placeable.getHeight()) / 2.0f), 0.0f, 4, null);
        return createfromparcel;
    }

    public /* synthetic */ SurfaceKtSurface2(androidx.compose.ui.layout.Placeable placeable, int i, int i2, int i3) {
        this.write = i3;
        this.IconCompatParcelizer = placeable;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }
}
