package androidx.compose.ui.graphics;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.drawRawPointsO7TthRY;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidPathIterator_androidKt {
    public static final PathIterator PathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        return new AndroidPathIterator(path, conicEvaluation, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathSegment.Type toPathSegmentType(drawRawPointsO7TthRY drawrawpointso7tthry) {
        switch (WhenMappings.$EnumSwitchMapping$0[drawrawpointso7tthry.ordinal()]) {
            case 1:
                return PathSegment.Type.Move;
            case 2:
                return PathSegment.Type.Line;
            case 3:
                return PathSegment.Type.Quadratic;
            case 4:
                return PathSegment.Type.Conic;
            case 5:
                return PathSegment.Type.Cubic;
            case 6:
                return PathSegment.Type.Close;
            case 7:
                return PathSegment.Type.Done;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[drawRawPointsO7TthRY.values().length];
            try {
                iArr[drawRawPointsO7TthRY.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[drawRawPointsO7TthRY.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[drawRawPointsO7TthRY.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[drawRawPointsO7TthRY.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[drawRawPointsO7TthRY.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[drawRawPointsO7TthRY.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[drawRawPointsO7TthRY.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ PathIterator PathIterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            conicEvaluation = PathIterator.ConicEvaluation.AsQuadratics;
        }
        if ((i & 4) != 0) {
            f = 0.25f;
        }
        return PathIterator(path, conicEvaluation, f);
    }
}
