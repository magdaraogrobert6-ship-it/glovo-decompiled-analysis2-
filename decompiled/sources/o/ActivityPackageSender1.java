package o;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPackageSender1 implements androidx.compose.ui.layout.MeasurePolicy {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ DrawBackgroundModifier IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.constraintlayout.compose.Measurer2 write;

    public /* synthetic */ ActivityPackageSender1(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, androidx.constraintlayout.compose.Measurer2 measurer2, DrawBackgroundModifier drawBackgroundModifier, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.write = measurer2;
        this.IconCompatParcelizer = drawBackgroundModifier;
        this.read = populateViewStructure_androidKtpopulate8;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, List list, long j) {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        androidx.constraintlayout.compose.Measurer2 measurer2 = this.write;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = this.RemoteActionCompatParcelizer;
        switch (i3) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ), null, new UrlStrategy(measurer2, list, linkedHashMap), 4, null);
            case 1:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ2 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap2);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ2), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ2), null, new getBeginIndex(measurer2, list, linkedHashMap2), 4, null);
            case 2:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ3 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap3);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ3), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ3), null, new getCompositionEndui_text(measurer2, list, linkedHashMap3), 4, null);
            case 3:
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ4 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap4);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ4), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ4), null, new getCompositionMzsxiRAui_text(measurer2, list, linkedHashMap4), 4, null);
            case 4:
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ5 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap5);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ5), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ5), null, new getSelectionEndui_text(measurer2, list, linkedHashMap5), 4, null);
            case 5:
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ6 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap6);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ6), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ6), null, new getSuperscripty9eOQZs(measurer2, list, linkedHashMap6), 4, null);
            case 6:
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ7 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap7);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ7), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ7), null, new ComposeViewAdapterExternalSyntheticLambda9(measurer2, list, linkedHashMap7), 4, null);
            case 7:
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ8 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap8);
                populateViewStructure_androidKtpopulate7.getValue();
                androidx.compose.ui.layout.MeasureResult measureResultLayout$default = androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ8), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ8), null, new FontScaleConverterTable(measurer2, list, linkedHashMap8), 4, null);
                int i4 = MediaBrowserCompatMediaItem + 45;
                RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return measureResultLayout$default;
                }
                obj.hashCode();
                throw null;
            case 8:
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ9 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap9);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ9), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ9), null, new v0(measurer2, list, linkedHashMap9), 4, null);
            default:
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                populateViewStructure_androidKtpopulate8.getValue();
                long jM3945performMeasureDjhGOtQ10 = this.write.m3945performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.IconCompatParcelizer, list, linkedHashMap10);
                populateViewStructure_androidKtpopulate7.getValue();
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3945performMeasureDjhGOtQ10), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3945performMeasureDjhGOtQ10), null, new getIsUpdatedSystemApp(measurer2, list, linkedHashMap10), 4, null);
        }
    }
}
