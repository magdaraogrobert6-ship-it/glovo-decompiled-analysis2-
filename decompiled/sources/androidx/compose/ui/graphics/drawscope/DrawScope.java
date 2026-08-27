package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.List;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m662getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m825getLowfv9h1I();

        private Companion() {
        }

        /* JADX INFO: renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m1306getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* JADX INFO: renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m1307getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* JADX INFO: renamed from: drawArc-illE91I */
    void mo1201drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    void mo1202drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    void mo1203drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    void mo1204drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    @onItemDismisslambda0
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo1205drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    void mo1207drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    void mo1208drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    void mo1209drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* JADX INFO: renamed from: drawOval-AsUm42w */
    void mo1210drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    void mo1211drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    void mo1212drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawPath-LG529CI */
    void mo1213drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    void mo1214drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    void mo1215drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* JADX INFO: renamed from: drawRect-AsUm42w */
    void mo1216drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    void mo1217drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    void mo1218drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    void mo1219drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i);

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m1313drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            DrawScope.super.mo1206drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m1328getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo1303getCenterF1C5BW0();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m1329getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo1304getSizeNHjbRc();
        }

        @Deprecated
        /* JADX INFO: renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m1330recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            DrawScope.super.mo1305recordJVtK1S4(graphicsLayer, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1332roundToPxR2X_6o(DrawScope drawScope, long j) {
            return DrawScope.super.mo41roundToPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1333roundToPx0680j_4(DrawScope drawScope, float f) {
            return DrawScope.super.mo42roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1334toDpGaN1DYA(DrawScope drawScope, long j) {
            return DrawScope.super.mo43toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1335toDpu2uoSUM(DrawScope drawScope, float f) {
            return DrawScope.super.mo44toDpu2uoSUM(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m1337toDpSizekrfVVM(DrawScope drawScope, long j) {
            return DrawScope.super.mo46toDpSizekrfVVM(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1338toPxR2X_6o(DrawScope drawScope, long j) {
            return DrawScope.super.mo47toPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1339toPx0680j_4(DrawScope drawScope, float f) {
            return DrawScope.super.mo48toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m1340toSizeXkaWNTQ(DrawScope drawScope, long j) {
            return DrawScope.super.mo49toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1341toSp0xMU5do(DrawScope drawScope, float f) {
            return DrawScope.super.mo50toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1342toSpkPz2Gy4(DrawScope drawScope, float f) {
            return DrawScope.super.mo51toSpkPz2Gy4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1336toDpu2uoSUM(DrawScope drawScope, int i) {
            return DrawScope.super.mo45toDpu2uoSUM(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1343toSpkPz2Gy4(DrawScope drawScope, int i) {
            return DrawScope.super.mo52toSpkPz2Gy4(i);
        }
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo1303getCenterF1C5BW0() {
        return SizeKt.m556getCenteruvyYCjk(getDrawContext().mo1225getSizeNHjbRc());
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo1304getSizeNHjbRc() {
        return getDrawContext().mo1225getSizeNHjbRc();
    }

    /* JADX INFO: renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m1301offsetSizePENXr5M(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat2) << 32));
    }

    /* JADX INFO: renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m1284drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo1203drawCircleV9BoPsw(brush, (i2 & 2) != 0 ? Size.m545getMinDimensionimpl(drawScope.mo1304getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo1303getCenterF1C5BW0() : j, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
    }

    /* JADX INFO: renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m1285drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo1204drawCircleVaOC9Bg(j, (i2 & 2) != 0 ? Size.m545getMinDimensionimpl(drawScope.mo1304getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo1303getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
    }

    /* JADX INFO: renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m1288drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo1207drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
    }

    /* JADX INFO: renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m1291drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j;
            drawScope.mo1210drawOvalAsUm42w(brush, jM493getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
    }

    /* JADX INFO: renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m1292drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j2;
            drawScope.mo1211drawOvalnJ9OG0(j, jM493getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
    }

    /* JADX INFO: renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m1297drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j;
            drawScope.mo1216drawRectAsUm42w(brush, jM493getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
    }

    /* JADX INFO: renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m1298drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j2;
            drawScope.mo1217drawRectnJ9OG0(j, jM493getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
    }

    /* JADX INFO: renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m1302recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = IntSizeKt.m3855toIntSizeuvyYCjk(drawScope.mo1304getSizeNHjbRc());
            }
            drawScope.mo1305recordJVtK1S4(graphicsLayer, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
    }

    /* JADX INFO: renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo1305recordJVtK1S4(GraphicsLayer graphicsLayer, long j, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        graphicsLayer.m1398recordmLhObY(this, getLayoutDirection(), j, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(DrawScope drawScope) {
                DrawScope drawScope2 = this.this$0;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long jMo1225getSizeNHjbRc = drawScope.getDrawContext().mo1225getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo1225getSizeNHjbRc2 = drawScope2.getDrawContext().mo1225getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m1282drawArcillE91I$default(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j;
            drawScope.mo1201drawArcillE91I(brush, f, f2, z, jM493getZeroF1C5BW0, (i2 & 32) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j2, (i2 & 64) != 0 ? 1.0f : f3, (i2 & Fields.SpotShadowColor) != 0 ? Fill.INSTANCE : drawStyle, (i2 & Fields.RotationX) != 0 ? null : colorFilter, (i2 & Fields.RotationY) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
    }

    /* JADX INFO: renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m1283drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j2;
            drawScope.mo1202drawArcyD3GUKo(j, f, f2, z, jM493getZeroF1C5BW0, (i2 & 32) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & Fields.SpotShadowColor) != 0 ? Fill.INSTANCE : drawStyle, (i2 & Fields.RotationX) != 0 ? null : colorFilter, (i2 & Fields.RotationY) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
    }

    /* JADX INFO: renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m1286drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long jM3839constructorimpl;
        if (obj == null) {
            long jM3812getZeronOccac = (i2 & 2) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j;
            if ((i2 & 4) != 0) {
                jM3839constructorimpl = IntSize.m3839constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32));
            } else {
                jM3839constructorimpl = j2;
            }
            drawScope.mo1205drawImage9jGpkUE(imageBitmap, jM3812getZeronOccac, jM3839constructorimpl, (i2 & 8) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j3, (i2 & 16) != 0 ? jM3839constructorimpl : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i2 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i2 & Fields.RotationX) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* JADX INFO: renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m1287drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        long jM3839constructorimpl;
        if (obj == null) {
            long jM3812getZeronOccac = (i3 & 2) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j;
            if ((i3 & 4) != 0) {
                jM3839constructorimpl = IntSize.m3839constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32));
            } else {
                jM3839constructorimpl = j2;
            }
            drawScope.mo1206drawImageAZ2fEMs(imageBitmap, jM3812getZeronOccac, jM3839constructorimpl, (i3 & 8) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j3, (i3 & 16) != 0 ? jM3839constructorimpl : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i3 & Fields.RotationX) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i, (i3 & Fields.RotationY) != 0 ? Companion.m1307getDefaultFilterQualityfv9h1I() : i2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m1299drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j;
            drawScope.mo1218drawRoundRectZuiqVtQ(brush, jM493getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? CornerRadius.Companion.m449getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & Fields.SpotShadowColor) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
    }

    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m1300drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            long jM493getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j2;
            drawScope.mo1219drawRoundRectuAw5IA(j, jM493getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1301offsetSizePENXr5M(drawScope.mo1304getSizeNHjbRc(), jM493getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? CornerRadius.Companion.m449getZerokKHJgLs() : j4, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & Fields.SpotShadowColor) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
    }

    /* JADX INFO: renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m1293drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i2 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i2 & 32) != 0) {
                i = Companion.m1306getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo1212drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* JADX INFO: renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m1294drawPathLG529CI$default(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo1213drawPathLG529CI(path, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
    }

    /* JADX INFO: renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m1289drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.mo1208drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.Companion.m1375getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i3 & Fields.RotationX) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i2);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
    }

    /* JADX INFO: renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m1290drawLineNGM6Ib0$default(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.mo1209drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.Companion.m1375getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i3 & Fields.RotationX) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i2);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
    }

    /* JADX INFO: renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m1295drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj == null) {
            drawScope.mo1214drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.Companion.m1099getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i4 & Fields.RotationX) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i3);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
    }

    /* JADX INFO: renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m1296drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj == null) {
            drawScope.mo1215drawPointsGsft0Ws(list, i, brush, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.Companion.m1099getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i4 & Fields.RotationX) != 0 ? Companion.m1306getDefaultBlendMode0nO6VwU() : i3);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
    }

    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    default void mo1206drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        m1287drawImageAZ2fEMs$default(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, Fields.RotationY, null);
    }
}
