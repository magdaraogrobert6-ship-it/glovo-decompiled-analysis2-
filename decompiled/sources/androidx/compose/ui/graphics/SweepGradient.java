package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class SweepGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final long center;
    private final List<Color> colors;
    private final List<Float> stops;

    /* JADX INFO: renamed from: getCenter-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m1112getCenterF1C5BW0$ui_graphics() {
        return this.center;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    public int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.colors, Offset.m479hashCodeimpl(this.center) * 31, 31);
        List<Float> list = this.stops;
        return iM + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        if (!Offset.m474equalsimpl0(this.center, sweepGradient.center)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.colors, sweepGradient.colors}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stops, sweepGradient.stops}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m757getTransparent0d7_KjU(), defaultConstructorMarker);
        }
        if (obj instanceof SolidColor) {
            long j = this.center;
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m732unboximpl();
                arrayList.add(Color.m712boximpl(((SolidColor) obj).m1081getValue0d7_KjU()));
            }
            obj = new SweepGradient(j, arrayList, this.stops, null);
        }
        if (!(obj instanceof SweepGradient)) {
            return null;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        return new SweepGradient(OffsetKt.m500lerpWko1d7g(this.center, sweepGradient.center, f), BrushKt.lerpColorList(this.colors, sweepGradient.colors, f), BrushKt.lerpNullableFloatList(this.stops, sweepGradient.stops, f), null);
    }

    public /* synthetic */ SweepGradient(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    private SweepGradient(long j, List<Color> list, List<Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo691createShaderuvyYCjk(long j) {
        long jM469constructorimpl;
        long j2 = this.center;
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & j2) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM469constructorimpl = SizeKt.m556getCenteruvyYCjk(j);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                j = this.center;
            }
            jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        }
        return ShaderKt.m1063SweepGradientShader9KIMszo(jM469constructorimpl, this.colors, this.stops);
    }

    public /* synthetic */ SweepGradient(long j, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    public String toString() {
        String str;
        if ((this.center & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            str = "center=" + ((Object) Offset.m485toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SweepGradient(", str, "colors=");
        sbM.append(this.colors);
        sbM.append(", stops=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sbM, (List) this.stops, ')');
    }
}
