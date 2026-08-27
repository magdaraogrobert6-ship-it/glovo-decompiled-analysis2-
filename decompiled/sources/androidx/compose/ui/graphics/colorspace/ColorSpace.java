package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorSpace {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    public abstract float[] fromXyz(float[] fArr);

    public final int getId$ui_graphics() {
        return this.id;
    }

    public abstract float getMaxValue(int i);

    public abstract float getMinValue(int i);

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m1164getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public abstract float[] toXyz(float[] fArr);

    public final float[] fromXyz(float f, float f2, float f3) {
        float[] fArr = new float[ColorModel.m1156getComponentCountimpl(this.model)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return fromXyz(fArr);
    }

    public final int getComponentCount() {
        return ColorModel.m1156getComponentCountimpl(this.model);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        return ((ColorModel.m1157hashCodeimpl(this.model) + (iHashCode * 31)) * 31) + this.id;
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m1158toStringimpl(this.model)) + ')';
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The id must be between -1 and 63");
            throw null;
        }
    }

    public long toXy$ui_graphics(float f, float f2, float f3) {
        float[] xyz = toXyz(f, f2, f3);
        float f4 = xyz[0];
        float f5 = xyz[1];
        return (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    public float toZ$ui_graphics(float f, float f2, float f3) {
        return toXyz(f, f2, f3)[2];
    }

    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics, reason: not valid java name */
    public long mo1165xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        float[] fArrFromXyz = fromXyz(f, f2, f3);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], f4, colorSpace);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id != colorSpace.id) {
            return false;
        }
        Object[] objArr = {this.name, colorSpace.name};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return ColorModel.m1155equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public final float[] toXyz(float f, float f2, float f3) {
        return toXyz(new float[]{f, f2, f3});
    }

    public /* synthetic */ ColorSpace(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public /* synthetic */ ColorSpace(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, null);
    }
}
