package androidx.compose.ui.graphics;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public interface PathMeasure {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    float getLength();

    /* JADX INFO: renamed from: getPosition-tuRUvjQ */
    long mo617getPositiontuRUvjQ(float f);

    boolean getSegment(float f, float f2, Path path, boolean z);

    /* JADX INFO: renamed from: getTangent-tuRUvjQ */
    long mo618getTangenttuRUvjQ(float f);

    void setPath(Path path, boolean z);

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = true;
            }
            return pathMeasure.getSegment(f, f2, path, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getSegment");
        return false;
    }
}
