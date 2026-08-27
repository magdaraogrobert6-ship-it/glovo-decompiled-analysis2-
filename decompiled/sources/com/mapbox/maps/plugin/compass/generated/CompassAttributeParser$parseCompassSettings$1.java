package com.mapbox.maps.plugin.compass.generated;

import android.content.res.TypedArray;
import android.graphics.Color;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CompassAttributeParser$parseCompassSettings$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ float $pixelRatio;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TypedArray $typedArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompassAttributeParser$parseCompassSettings$1(TypedArray typedArray, int i, float f) {
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
        if (i != 0) {
            AttributionSettings.Builder builder = (AttributionSettings.Builder) obj;
            builder.getClass();
            builder.enabled = typedArray.getBoolean(1, true);
            builder.iconColor = typedArray.getColor(3, Color.parseColor("#FF1E8CAB"));
            builder.position = typedArray.getInt(2, 8388691);
            builder.marginLeft = typedArray.getDimension(5, 92.0f * f);
            float f2 = f * 4.0f;
            builder.marginTop = typedArray.getDimension(7, f2);
            builder.marginRight = typedArray.getDimension(6, f2);
            builder.marginBottom = typedArray.getDimension(4, f2);
            builder.clickable = typedArray.getBoolean(0, true);
            return createfromparcel;
        }
        CompassSettings.Builder builder2 = (CompassSettings.Builder) obj;
        builder2.getClass();
        builder2.enabled = typedArray.getBoolean(20, true);
        builder2.position = typedArray.getInt(22, 8388661);
        float f3 = f * 4.0f;
        builder2.marginLeft = typedArray.getDimension(25, f3);
        builder2.marginTop = typedArray.getDimension(27, f3);
        builder2.marginRight = typedArray.getDimension(26, f3);
        builder2.marginBottom = typedArray.getDimension(24, f3);
        builder2.opacity = typedArray.getFloat(28, 1.0f);
        builder2.rotation = typedArray.getFloat(29, 0.0f);
        builder2.visibility = typedArray.getBoolean(30, true);
        builder2.fadeWhenFacingNorth = typedArray.getBoolean(21, true);
        builder2.clickable = typedArray.getBoolean(19, true);
        builder2.image = ImageHolder.Companion.from(typedArray.getResourceId(23, -1));
        return createfromparcel;
    }
}
