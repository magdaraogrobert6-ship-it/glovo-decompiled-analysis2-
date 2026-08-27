package com.mapbox.maps.plugin.logo.generated;

import android.content.res.TypedArray;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class LogoAttributeParser$parseLogoSettings$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ float $pixelRatio;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TypedArray $typedArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogoAttributeParser$parseLogoSettings$1(TypedArray typedArray, int i, float f) {
        super(1);
        this.$r8$classId = i;
        this.$typedArray = typedArray;
        this.$pixelRatio = f;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        float f = this.$pixelRatio;
        TypedArray typedArray = this.$typedArray;
        if (i == 0) {
            LogoSettings.Builder builder = (LogoSettings.Builder) obj;
            builder.getClass();
            builder.enabled = typedArray.getBoolean(98, true);
            builder.position = typedArray.getInt(99, 8388691);
            float f2 = f * 4.0f;
            builder.marginLeft = typedArray.getDimension(101, f2);
            builder.marginTop = typedArray.getDimension(103, f2);
            builder.marginRight = typedArray.getDimension(102, f2);
            builder.marginBottom = typedArray.getDimension(100, f2);
            return createfromparcel;
        }
        ScaleBarSettings.Builder builder2 = (ScaleBarSettings.Builder) obj;
        builder2.getClass();
        builder2.enabled = typedArray.getBoolean(117, true);
        builder2.position = typedArray.getInt(118, 8388659);
        float f3 = 4.0f * f;
        builder2.marginLeft = typedArray.getDimension(122, f3);
        builder2.marginTop = typedArray.getDimension(124, f3);
        builder2.marginRight = typedArray.getDimension(123, f3);
        builder2.marginBottom = typedArray.getDimension(121, f3);
        builder2.textColor = typedArray.getColor(132, -16777216);
        builder2.primaryColor = typedArray.getColor(125, -16777216);
        builder2.secondaryColor = typedArray.getColor(Fields.SpotShadowColor, -1);
        float f4 = 2.0f * f;
        builder2.borderWidth = typedArray.getDimension(115, f4);
        builder2.height = typedArray.getDimension(119, f4);
        float f5 = f * 8.0f;
        builder2.textBarMargin = typedArray.getDimension(130, f5);
        builder2.textBorderWidth = typedArray.getDimension(131, f4);
        builder2.textSize = typedArray.getDimension(133, f5);
        builder2.isMetricUnits = typedArray.getBoolean(120, LocaleUnitResolver.isMetricSystem());
        DistanceUnits distanceUnits = DistanceUnits.METRIC;
        DistanceUnits distanceUnits2 = DistanceUnits.IMPERIAL;
        List list = SQLite.read(distanceUnits, distanceUnits2, DistanceUnits.NAUTICAL);
        if (!LocaleUnitResolver.isMetricSystem()) {
            distanceUnits = distanceUnits2;
        }
        DistanceUnits distanceUnits3 = (DistanceUnits) list.get(typedArray.getInt(116, distanceUnits.ordinal));
        distanceUnits3.getClass();
        builder2.distanceUnits = distanceUnits3;
        builder2.refreshInterval = typedArray.getInt(127, 15);
        builder2.showTextBorder = typedArray.getBoolean(129, true);
        builder2.ratio = typedArray.getFloat(126, 0.5f);
        builder2.useContinuousRendering = typedArray.getBoolean(134, false);
        return createfromparcel;
    }
}
