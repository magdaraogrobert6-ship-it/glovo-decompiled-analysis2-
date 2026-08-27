package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
import o.drawImageRectHPBpro0;
import o.drawPath;
import o.drawPointsO7TthRY;
import o.drawRawPointsO7TthRY;

/* JADX INFO: loaded from: classes4.dex */
public final class PathIteratorPreApi34Impl extends drawPath {
    public final long serializer;

    private final native long createInternalPathIterator(Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j);

    @FastNative
    private final native int internalPathIteratorRawSize(long j);

    @FastNative
    private final native int internalPathIteratorSize(long j);

    public final void finalize() {
        destroyInternalPathIterator(this.serializer);
    }

    @Override // o.drawPath
    public final boolean write() {
        return internalPathIteratorHasNext(this.serializer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, drawImageRectHPBpro0 drawimagerecthpbpro0, float f) {
        super(path, drawimagerecthpbpro0, f);
        path.getClass();
        drawimagerecthpbpro0.getClass();
        this.serializer = createInternalPathIterator(path, drawimagerecthpbpro0.ordinal(), f);
    }

    @Override // o.drawPath
    public final drawRawPointsO7TthRY RemoteActionCompatParcelizer(float[] fArr, int i) {
        fArr.getClass();
        return drawPointsO7TthRY.serializer[internalPathIteratorNext(this.serializer, fArr, i)];
    }

    @Override // o.drawPath
    public final int serializer(boolean z) {
        long j = this.serializer;
        return (!z || this.RemoteActionCompatParcelizer == drawImageRectHPBpro0.AsConic) ? internalPathIteratorRawSize(j) : internalPathIteratorSize(j);
    }
}
