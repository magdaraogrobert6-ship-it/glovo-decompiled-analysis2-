package androidx.compose.ui.graphics;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.drawImageRectHPBpro0;
import o.drawOval;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidPathIterator implements PathIterator {
    private final PathIterator.ConicEvaluation conicEvaluation;
    private final drawOval implementation;
    private final Path path;
    private final float[] segmentPoints = new float[8];
    private final float tolerance;

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public float getTolerance() {
        return this.tolerance;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public int calculateSize(boolean z) {
        return this.implementation.serializer.serializer(z);
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.serializer.write();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        float[] fArr;
        float[] fArr2 = this.segmentPoints;
        if (fArr2.length < 8) {
            return PathSegmentKt.getDoneSegment();
        }
        drawOval drawoval = this.implementation;
        drawoval.getClass();
        PathSegment.Type pathSegmentType = AndroidPathIterator_androidKt.toPathSegmentType(drawoval.serializer.RemoteActionCompatParcelizer(fArr2, 0));
        if (pathSegmentType == PathSegment.Type.Done) {
            return PathSegmentKt.getDoneSegment();
        }
        if (pathSegmentType == PathSegment.Type.Close) {
            return PathSegmentKt.getCloseSegment();
        }
        int i = WhenMappings.$EnumSwitchMapping$1[pathSegmentType.ordinal()];
        if (i == 1) {
            fArr = new float[]{fArr2[0], fArr2[1]};
        } else if (i == 2) {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]};
        } else if (i == 3 || i == 4) {
            fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
        } else {
            fArr = i != 5 ? new float[0] : new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7]};
        }
        return new PathSegment(pathSegmentType, fArr, pathSegmentType == PathSegment.Type.Conic ? fArr2[6] : 0.0f);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        drawImageRectHPBpro0 drawimagerecthpbpro0;
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f;
        Path path2 = getPath();
        if (!(path2 instanceof AndroidPath)) {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
            throw null;
        }
        android.graphics.Path internalPath = ((AndroidPath) path2).getInternalPath();
        int i = WhenMappings.$EnumSwitchMapping$0[getConicEvaluation().ordinal()];
        if (i == 1) {
            drawimagerecthpbpro0 = drawImageRectHPBpro0.AsConic;
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            drawimagerecthpbpro0 = drawImageRectHPBpro0.AsQuadratics;
        }
        this.implementation = new drawOval(internalPath, drawimagerecthpbpro0, getTolerance());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public PathSegment.Type next(float[] fArr, int i) {
        drawOval drawoval = this.implementation;
        drawoval.getClass();
        fArr.getClass();
        return AndroidPathIterator_androidKt.toPathSegmentType(drawoval.serializer.RemoteActionCompatParcelizer(fArr, i));
    }
}
