package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import coil3.util.UtilsKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.onItemDismisslambda0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    public enum Direction {
        CounterClockwise,
        Clockwise;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    void addArc(Rect rect, float f, float f2);

    void addArcRad(Rect rect, float f, float f2);

    @onItemDismisslambda0
    /* synthetic */ void addOval(Rect rect);

    void addOval(Rect rect, Direction direction);

    /* JADX INFO: renamed from: addPath-Uv8p0NA */
    void mo609addPathUv8p0NA(Path path, long j);

    @onItemDismisslambda0
    /* synthetic */ void addRect(Rect rect);

    void addRect(Rect rect, Direction direction);

    @onItemDismisslambda0
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(RoundRect roundRect, Direction direction);

    void arcTo(Rect rect, float f, float f2, boolean z);

    void close();

    void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    Rect getBounds();

    /* JADX INFO: renamed from: getFillType-Rg-k1Os */
    int mo610getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f, float f2);

    void moveTo(float f, float f2);

    /* JADX INFO: renamed from: op-N5in7k0 */
    boolean mo611opN5in7k0(Path path, Path path2, int i);

    default Path or(Path path) {
        return plus(path);
    }

    @onItemDismisslambda0
    void quadraticBezierTo(float f, float f2, float f3, float f4);

    default void quadraticTo(float f, float f2, float f3, float f4) {
        quadraticBezierTo(f, f2, f3, f4);
    }

    void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6);

    void relativeLineTo(float f, float f2);

    void relativeMoveTo(float f, float f2);

    @onItemDismisslambda0
    void relativeQuadraticBezierTo(float f, float f2, float f3, float f4);

    default void relativeQuadraticTo(float f, float f2, float f3, float f4) {
        relativeQuadraticBezierTo(f, f2, f3, f4);
    }

    void reset();

    default void rewind() {
        reset();
    }

    /* JADX INFO: renamed from: setFillType-oQ8Xj4U */
    void mo612setFillTypeoQ8Xj4U(int i);

    /* JADX INFO: renamed from: transform-58bKbWc */
    default void mo613transform58bKbWc(float[] fArr) {
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M */
    void mo614translatek4lQ0M(long j);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m1010combinexh6zSI8(int i, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo611opN5in7k0(path, path2, i)) {
                return Path;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            return null;
        }
    }

    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Path and(Path path, Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f, float f2, boolean z) {
            Path.super.arcToRad(rect, f, f2, z);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        public static Path or(Path path, Path path2) {
            return Path.super.or(path2);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static void quadraticTo(Path path, float f, float f2, float f3, float f4) {
            Path.super.quadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f, float f2, float f3, float f4) {
            Path.super.relativeQuadraticTo(f, f2, f3, f4);
        }

        @Deprecated
        public static void rewind(Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m1012transform58bKbWc(Path path, float[] fArr) {
            Path.super.mo613transform58bKbWc(fArr);
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            return Path.super.xor(path2);
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
            return Path.super.iterator(conicEvaluation, f);
        }
    }

    default Path and(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo611opN5in7k0(this, path, PathOperation.Companion.m1032getIntersectb3I0S0c());
        return Path;
    }

    default void arcToRad(Rect rect, float f, float f2, boolean z) {
        arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    default Path minus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo611opN5in7k0(this, path, PathOperation.Companion.m1031getDifferenceb3I0S0c());
        return Path;
    }

    default Path plus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo611opN5in7k0(this, path, PathOperation.Companion.m1034getUnionb3I0S0c());
        return Path;
    }

    default Path xor(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo611opN5in7k0(this, path, PathOperation.Companion.m1035getXorb3I0S0c());
        return Path;
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addOval(rect, direction);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: addOval");
    }

    /* JADX INFO: renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m1009addPathUv8p0NA$default(Path path, Path path2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m493getZeroF1C5BW0();
            }
            path.mo609addPathUv8p0NA(path2, j);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addRect(rect, direction);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: addRect");
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.addRoundRect(roundRect, direction);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: addRoundRect");
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 0.25f;
            }
            return path.iterator(conicEvaluation, f);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: iterator");
        return null;
    }

    default PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, f);
    }
}
