package androidx.compose.ui.graphics;

import coil3.util.UtilsKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import o.displayInAppMessagelambda121;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes4.dex */
public interface PathIterator extends Iterator<PathSegment>, displayInAppMessagelambda121 {

    public enum ConicEvaluation {
        AsConic,
        AsQuadratics;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    int calculateSize(boolean z);

    ConicEvaluation getConicEvaluation();

    Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    PathSegment.Type next(float[] fArr, int i);

    @Override // java.util.Iterator
    PathSegment next();

    static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return pathIterator.calculateSize(z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: calculateSize");
        return 0;
    }

    static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return pathIterator.next(fArr, i);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: next");
        return null;
    }
}
