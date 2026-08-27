package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = instance_delegatelambda0.write;
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m1099getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m1110getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m660getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m757getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m1022getNonZeroRgk1Os();

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    public static final List<PathNode> PathData(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        PathBuilder pathBuilder = new PathBuilder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    /* JADX INFO: renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m1479rgbEqualOWjLjI(long j, long j2) {
        return Color.m728getRedimpl(j) == Color.m728getRedimpl(j2) && Color.m727getGreenimpl(j) == Color.m727getGreenimpl(j2) && Color.m725getBlueimpl(j) == Color.m725getBlueimpl(j2);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int iM664getBlendMode0nO6VwU = blendModeColorFilter.m664getBlendMode0nO6VwU();
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m631equalsimpl0(iM664getBlendMode0nO6VwU, companion.m660getSrcIn0nO6VwU()) || BlendMode.m631equalsimpl0(blendModeColorFilter.m664getBlendMode0nO6VwU(), companion.m662getSrcOver0nO6VwU());
    }

    /* JADX INFO: renamed from: toOpaque-8_81llA, reason: not valid java name */
    public static final long m1480toOpaque8_81llA(long j) {
        return Color.m724getAlphaimpl(j) == 1.0f ? j : Color.m721copywmQWz5c$default(j, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
