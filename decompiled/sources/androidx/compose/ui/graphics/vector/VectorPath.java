package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m1494getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m1495getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m1496getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.pathData, this.name.hashCode() * 31, 31);
        Brush brush = this.fill;
        int iM2 = af$$ExternalSyntheticOutline1.m(this.fillAlpha, (iM + (brush != null ? brush.hashCode() : 0)) * 31, 31);
        Brush brush2 = this.stroke;
        int iM3 = af$$ExternalSyntheticOutline1.m(this.strokeLineWidth, af$$ExternalSyntheticOutline1.m(this.strokeAlpha, (iM2 + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31), 31);
        return PathFillType.m1018hashCodeimpl(this.pathFillType) + af$$ExternalSyntheticOutline1.m(this.trimPathOffset, af$$ExternalSyntheticOutline1.m(this.trimPathEnd, af$$ExternalSyntheticOutline1.m(this.trimPathStart, af$$ExternalSyntheticOutline1.m(this.strokeLineMiter, (StrokeJoin.m1106hashCodeimpl(this.strokeLineJoin) + ((StrokeCap.m1096hashCodeimpl(this.strokeLineCap) + iM3) * 31)) * 31, 31), 31), 31), 31);
    }

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, list, i, (i4 & 8) != 0 ? null : brush, (i4 & 16) != 0 ? 1.0f : f, (i4 & 32) != 0 ? null : brush2, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Fields.SpotShadowColor) != 0 ? 0.0f : f3, (i4 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2, (i4 & Fields.RotationY) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3, (i4 & Fields.RotationZ) != 0 ? 4.0f : f4, (i4 & Fields.CameraDistance) != 0 ? 0.0f : f5, (i4 & Fields.TransformOrigin) != 0 ? 1.0f : f6, (i4 & 8192) != 0 ? 0.0f : f7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, vectorPath.name}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fill, vectorPath.fill}, getCieXyz.write())).booleanValue() && this.fillAlpha == vectorPath.fillAlpha) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stroke, vectorPath.stroke}, getCieXyz.write())).booleanValue() || this.strokeAlpha != vectorPath.strokeAlpha || this.strokeLineWidth != vectorPath.strokeLineWidth || !StrokeCap.m1095equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) || !StrokeJoin.m1105equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) || this.strokeLineMiter != vectorPath.strokeLineMiter || this.trimPathStart != vectorPath.trimPathStart || this.trimPathEnd != vectorPath.trimPathEnd || this.trimPathOffset != vectorPath.trimPathOffset || !PathFillType.m1017equalsimpl0(this.pathFillType, vectorPath.pathFillType)) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pathData, vectorPath.pathData}, getCieXyz.write())).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i;
        this.fill = brush;
        this.fillAlpha = f;
        this.stroke = brush2;
        this.strokeAlpha = f2;
        this.strokeLineWidth = f3;
        this.strokeLineCap = i2;
        this.strokeLineJoin = i3;
        this.strokeLineMiter = f4;
        this.trimPathStart = f5;
        this.trimPathEnd = f6;
        this.trimPathOffset = f7;
    }

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7);
    }
}
