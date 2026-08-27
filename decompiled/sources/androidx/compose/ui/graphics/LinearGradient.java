package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    /* JADX INFO: renamed from: getEnd-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m964getEndF1C5BW0$ui_graphics() {
        return this.end;
    }

    /* JADX INFO: renamed from: getStart-F1C5BW0$ui_graphics, reason: not valid java name */
    public final long m965getStartF1C5BW0$ui_graphics() {
        return this.start;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* JADX INFO: renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name */
    public final int m966getTileMode3opZhB0$ui_graphics() {
        return this.tileMode;
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode();
        List<Float> list = this.stops;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        return TileMode.m1117hashCodeimpl(this.tileMode) + ((Offset.m479hashCodeimpl(this.end) + ((Offset.m479hashCodeimpl(this.start) + (((iHashCode * 31) + iHashCode2) * 31)) * 31)) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.colors, linearGradient.colors}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stops, linearGradient.stops}, getCieXyz.write())).booleanValue() && Offset.m474equalsimpl0(this.start, linearGradient.start) && Offset.m474equalsimpl0(this.end, linearGradient.end) && TileMode.m1116equalsimpl0(this.tileMode, linearGradient.tileMode);
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
            obj = new LinearGradient(arrayList, this.stops, this.start, this.end, this.tileMode, null);
        }
        if (!(obj instanceof LinearGradient)) {
            return null;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        List<Color> listLerpColorList = BrushKt.lerpColorList(this.colors, linearGradient.colors, f);
        List<Float> listLerpNullableFloatList = BrushKt.lerpNullableFloatList(this.stops, linearGradient.stops, f);
        long jM690lerpSafeWko1d7g = BrushKt.m690lerpSafeWko1d7g(this.start, linearGradient.start, f);
        long jM690lerpSafeWko1d7g2 = BrushKt.m690lerpSafeWko1d7g(this.end, linearGradient.end, f);
        if (f < 0.5f) {
            linearGradient = this;
        }
        return new LinearGradient(listLerpColorList, listLerpNullableFloatList, jM690lerpSafeWko1d7g, jM690lerpSafeWko1d7g2, linearGradient.tileMode, null);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo691createShaderuvyYCjk(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.start >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.start & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.end >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.end & 4294967295L));
        return ShaderKt.m1059LinearGradientShaderVjE6UOU(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), this.colors, this.stops, this.tileMode);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo668getIntrinsicSizeNHjbRc() {
        float fAbs = Float.NaN;
        float fAbs2 = (Math.abs(Float.intBitsToFloat((int) (this.start >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (this.end >> 32))) > Float.MAX_VALUE) ? Float.NaN : Math.abs(Float.intBitsToFloat((int) (this.start >> 32)) - Float.intBitsToFloat((int) (this.end >> 32)));
        if (Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (this.end & 4294967295L))) <= Float.MAX_VALUE) {
            fAbs = Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L)) - Float.intBitsToFloat((int) (this.end & 4294967295L)));
        }
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(fAbs2)) << 32) | (((long) Float.floatToRawIntBits(fAbs)) & 4294967295L));
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m1120getClamp3opZhB0() : i, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) Offset.m485toStringimpl(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) Offset.m485toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1118toStringimpl(this.tileMode)) + ')';
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }
}
