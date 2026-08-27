package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getInfinityD9Ej5fM implements androidx.compose.ui.layout.MeasurePolicy {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ Float write;

    public getInfinityD9Ej5fM(float f, Float f2, float f3) {
        this.IconCompatParcelizer = f;
        this.write = f2;
        this.RemoteActionCompatParcelizer = f3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c A[PHI: r2 r5
  0x003c: PHI (r2v16 float) = (r2v4 float), (r2v17 float) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r5v6 int) = (r5v0 int), (r5v8 int) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r2 r5
  0x002f: PHI (r2v5 float) = (r2v4 float), (r2v17 float) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r5v1 int) = (r5v0 int), (r5v8 int) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, List list, final long j) {
        float f;
        int i;
        int iM3626getMaxWidthimpl;
        final int iM3625getMaxHeightimpl;
        float fMo48toPx0680j_4;
        int i2 = 2 % 2;
        int i3 = read + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            measureScope.getClass();
            list.getClass();
            f = this.IconCompatParcelizer;
            i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0) {
                iM3626getMaxWidthimpl = (int) (f * 0.8f);
                int i4 = read + 85;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                iM3626getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j);
            }
        } else {
            measureScope.getClass();
            list.getClass();
            f = this.IconCompatParcelizer;
            i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i > 0) {
                iM3626getMaxWidthimpl = (int) (f * 0.8f);
                int i6 = read + 85;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iM3626getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j);
            }
        }
        final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) list.get(0)).mo2209measureBRTryo0(androidx.compose.ui.unit.Constraints.m3616copyZbe2FdA$default(j, 0, iM3626getMaxWidthimpl, 0, 0, 12, null));
        Float f2 = this.write;
        if (f2 == null || i <= 0) {
            float f3 = this.RemoteActionCompatParcelizer;
            if (f3 > 0.0f) {
                float f4 = f * 0.8f;
                fMo48toPx0680j_4 = (f4 / 2.0f) + ((f3 - f4) * 0.65f);
            } else {
                iM3625getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j) / 2;
            }
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getUnspecifiedD9Ej5fM
                private static int RemoteActionCompatParcelizer = 1;
                private static int write;

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i8 = 2 % 2;
                    int i9 = RemoteActionCompatParcelizer + 21;
                    write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                    placementScope.getClass();
                    int iM3626getMaxWidthimpl2 = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j);
                    androidx.compose.ui.layout.Placeable placeable = placeableMo2209measureBRTryo0;
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, (iM3626getMaxWidthimpl2 - placeable.getWidth()) / 2, iM3625getMaxHeightimpl - (placeable.getHeight() / 2), 0.0f, 4, null);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i11 = write + 3;
                    RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            }, 4, null);
        }
        int i8 = serializer + 61;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        fMo48toPx0680j_4 = ((f * 0.8f) / 2.0f) + measureScope.mo48toPx0680j_4(Dimensions.setLogo) + f2.floatValue();
        iM3625getMaxHeightimpl = (int) fMo48toPx0680j_4;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getUnspecifiedD9Ej5fM
            private static int RemoteActionCompatParcelizer = 1;
            private static int write;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                int i10 = 2 % 2;
                int i11 = RemoteActionCompatParcelizer + 21;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                placementScope.getClass();
                int iM3626getMaxWidthimpl2 = androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j);
                androidx.compose.ui.layout.Placeable placeable = placeableMo2209measureBRTryo0;
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, (iM3626getMaxWidthimpl2 - placeable.getWidth()) / 2, iM3625getMaxHeightimpl - (placeable.getHeight() / 2), 0.0f, 4, null);
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int i13 = write + 3;
                RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            }
        }, 4, null);
    }
}
