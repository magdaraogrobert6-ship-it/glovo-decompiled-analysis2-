package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public interface intrinsicHeight extends TextFieldColors {
    @Override // o.TextFieldColors
    default int read(androidx.compose.ui.layout.Placeable placeable) {
        return placeable.getMeasuredHeight();
    }

    @Override // o.TextFieldColors
    default int write(androidx.compose.ui.layout.Placeable placeable) {
        return placeable.getMeasuredWidth();
    }

    @Override // o.TextFieldColors
    default void IconCompatParcelizer(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.MeasureScope measureScope) {
        ((androidx.compose.foundation.layout.FlowMeasurePolicy) this).write.RemoteActionCompatParcelizer(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    @Override // o.TextFieldColors
    default long read(int i, int i2, int i3, boolean z) {
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3default = TextFieldDefaults.serializer;
        return !z ? androidx.compose.ui.unit.ConstraintsKt.Constraints(i, i2, 0, i3) : androidx.compose.ui.unit.Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA(i, i2, 0, i3);
    }

    @Override // o.TextFieldColors
    default androidx.compose.ui.layout.MeasureResult serializer(final androidx.compose.ui.layout.Placeable[] placeableArr, androidx.compose.ui.layout.MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i2, i3, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.calculateWidthIzADHW4
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                UrlUtils urlUtils;
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    androidx.compose.ui.layout.Placeable placeable = placeableArr[i9];
                    placeable.getClass();
                    Object parentData = placeable.getParentData();
                    TextFieldLayout textFieldLayout = parentData instanceof TextFieldLayout ? (TextFieldLayout) parentData : null;
                    if (textFieldLayout == null || (urlUtils = textFieldLayout.RemoteActionCompatParcelizer) == null) {
                        urlUtils = ((androidx.compose.foundation.layout.FlowMeasurePolicy) this).RemoteActionCompatParcelizer;
                    }
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, iArr[i9 - i8], urlUtils.write(i3, placeable.getMeasuredHeight(), layoutDirection, placeable, i) + i7, 0.0f, 4, null);
                }
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }
}
