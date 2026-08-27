package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class calculatePositionllwVHH4 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ calculatePositionllwVHH4(TooltipKtTooltipBox3 tooltipKtTooltipBox3, int i, androidx.compose.ui.layout.Placeable placeable, int i2, androidx.compose.ui.layout.MeasureScope measureScope) {
        this.write = tooltipKtTooltipBox3;
        this.serializer = i;
        this.IconCompatParcelizer = placeable;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaDescriptionCompat = measureScope;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.MediaDescriptionCompat;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.write;
        if (i == 0) {
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj3;
            androidx.compose.ui.layout.Placeable.PlacementScope.m2280place70tqf50$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, placeable, ((androidx.compose.ui.unit.IntOffset) ((TooltipKtTooltipBox3) obj4).read.invoke(androidx.compose.ui.unit.IntSize.m3836boximpl(androidx.compose.ui.unit.IntSize.m3839constructorimpl((((long) (this.serializer - placeable.getWidth())) << 32) | (((long) (this.RemoteActionCompatParcelizer - placeable.getHeight())) & 4294967295L))), ((androidx.compose.ui.layout.MeasureScope) obj2).getLayoutDirection())).m3810unboximpl(), 0.0f, 2, null);
            return createfromparcel;
        }
        androidx.compose.ui.layout.Placeable[] placeableArr = (androidx.compose.ui.layout.Placeable[]) obj4;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3default = (supportingTextPaddinga9UjIt4material3default) obj3;
        int[] iArr = (int[]) obj2;
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            androidx.compose.ui.layout.Placeable placeable2 = placeableArr[i2];
            placeable2.getClass();
            Object parentData = placeable2.getParentData();
            TextFieldLayout textFieldLayout = parentData instanceof TextFieldLayout ? (TextFieldLayout) parentData : null;
            UrlUtils urlUtils = textFieldLayout != null ? textFieldLayout.RemoteActionCompatParcelizer : null;
            int i4 = this.serializer;
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable2, iArr[i3], urlUtils != null ? urlUtils.write(i4, placeable2.getHeight(), androidx.compose.ui.unit.LayoutDirection.Ltr, placeable2, this.RemoteActionCompatParcelizer) : supportingtextpaddinga9ujit4material3default.write.align(placeable2.getHeight(), i4), 0.0f, 4, null);
            i2++;
            i3++;
        }
        return createfromparcel;
    }

    public /* synthetic */ calculatePositionllwVHH4(androidx.compose.ui.layout.Placeable[] placeableArr, supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3default, int i, int i2, int[] iArr) {
        this.write = placeableArr;
        this.IconCompatParcelizer = supportingtextpaddinga9ujit4material3default;
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaDescriptionCompat = iArr;
    }
}
