package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class RadialGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    /* JADX INFO: renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m1047getCenterF1C5BW0$ui_graphics() {
        return this.center;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final float getRadius$ui_graphics() {
        return this.radius;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* JADX INFO: renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name */
    public final int m1048getTileMode3opZhB0$ui_graphics() {
        return this.tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo668getIntrinsicSizeNHjbRc() {
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) >= 2139095040) {
            return Size.Companion.m554getUnspecifiedNHjbRc();
        }
        float f = this.radius * 2.0f;
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode();
        List<Float> list = this.stops;
        return TileMode.m1117hashCodeimpl(this.tileMode) + af$$ExternalSyntheticOutline1.m(this.radius, (Offset.m479hashCodeimpl(this.center) + (((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.colors, radialGradient.colors}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stops, radialGradient.stops}, getCieXyz.write())).booleanValue() && Offset.m474equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m1116equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m757getTransparent0d7_KjU(), defaultConstructorMarker);
        }
        if (obj instanceof SolidColor) {
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m732unboximpl();
                arrayList.add(Color.m712boximpl(((SolidColor) obj).m1081getValue0d7_KjU()));
            }
            obj = new RadialGradient(arrayList, this.stops, this.center, this.radius, this.tileMode, null);
        }
        if (!(obj instanceof RadialGradient)) {
            return null;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        List<Color> listLerpColorList = BrushKt.lerpColorList(this.colors, radialGradient.colors, f);
        List<Float> listLerpNullableFloatList = BrushKt.lerpNullableFloatList(this.stops, radialGradient.stops, f);
        long jM500lerpWko1d7g = OffsetKt.m500lerpWko1d7g(this.center, radialGradient.center, f);
        float fLerp = MathHelpersKt.lerp(this.radius, radialGradient.radius, f);
        if (f < 0.5f) {
            radialGradient = this;
        }
        return new RadialGradient(listLerpColorList, listLerpNullableFloatList, jM500lerpWko1d7g, fLerp, radialGradient.tileMode, null);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? TileMode.Companion.m1120getClamp3opZhB0() : i, null);
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.center & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m485toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        if ((Float.floatToRawIntBits(this.radius) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1118toStringimpl(this.tileMode)) + ')';
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j, float f, int i) {
        this.colors = list;
        this.stops = list2;
        this.center = j;
        this.radius = f;
        this.tileMode = i;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo691createShaderuvyYCjk(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.center;
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & j2) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM556getCenteruvyYCjk = SizeKt.m556getCenteruvyYCjk(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM556getCenteruvyYCjk >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM556getCenteruvyYCjk & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.center >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.center & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.center & 4294967295L));
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))));
        float f = this.radius;
        return ShaderKt.m1061RadialGradientShader8uybcMk(jM469constructorimpl, f == Float.POSITIVE_INFINITY ? Size.m545getMinDimensionimpl(j) / 2.0f : f, list, list2, this.tileMode);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }
}
