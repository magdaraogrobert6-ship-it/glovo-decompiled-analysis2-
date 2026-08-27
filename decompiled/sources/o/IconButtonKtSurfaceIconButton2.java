package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class IconButtonKtSurfaceIconButton2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.layout.MeasureScope read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ IconButtonKtSurfaceIconButton2(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy) {
        this.RemoteActionCompatParcelizer = placeable;
        this.IconCompatParcelizer = measurable;
        this.read = measureScope;
        this.serializer = i;
        this.MediaDescriptionCompat = i2;
        this.RatingCompat = boxMeasurePolicy;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.RatingCompat;
        androidx.compose.ui.layout.MeasureScope measureScope = this.read;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            androidx.compose.foundation.layout.BoxKt.access$placeInBox((androidx.compose.ui.layout.Placeable.PlacementScope) obj, (androidx.compose.ui.layout.Placeable) obj4, (androidx.compose.ui.layout.Measurable) obj3, measureScope.getLayoutDirection(), this.serializer, this.MediaDescriptionCompat, ((androidx.compose.foundation.layout.BoxMeasurePolicy) obj2).serializer);
            return createfromparcel;
        }
        androidx.compose.ui.layout.Placeable[] placeableArr = (androidx.compose.ui.layout.Placeable[]) obj4;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8 = (ModalBottomSheetYbuCTN8) obj3;
        int[] iArr = (int[]) obj2;
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            androidx.compose.ui.layout.Placeable placeable = placeableArr[i2];
            placeable.getClass();
            Object parentData = placeable.getParentData();
            TextFieldLayout textFieldLayout = parentData instanceof TextFieldLayout ? (TextFieldLayout) parentData : null;
            androidx.compose.ui.unit.LayoutDirection layoutDirection = measureScope.getLayoutDirection();
            UrlUtils urlUtils = textFieldLayout != null ? textFieldLayout.RemoteActionCompatParcelizer : null;
            int i4 = this.serializer;
            androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, urlUtils != null ? urlUtils.write(i4, placeable.getWidth(), layoutDirection, placeable, this.MediaDescriptionCompat) : modalBottomSheetYbuCTN8.serializer.align(placeable.getWidth(), i4, layoutDirection), iArr[i3], 0.0f, 4, null);
            i2++;
            i3++;
        }
        return createfromparcel;
    }

    public /* synthetic */ IconButtonKtSurfaceIconButton2(androidx.compose.ui.layout.Placeable[] placeableArr, ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8, int i, int i2, androidx.compose.ui.layout.MeasureScope measureScope, int[] iArr) {
        this.RemoteActionCompatParcelizer = placeableArr;
        this.IconCompatParcelizer = modalBottomSheetYbuCTN8;
        this.serializer = i;
        this.MediaDescriptionCompat = i2;
        this.read = measureScope;
        this.RatingCompat = iArr;
    }
}
