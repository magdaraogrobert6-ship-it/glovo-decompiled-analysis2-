package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = m243constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m243constructorimpl(null);
    private final Shape shape;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Shape m243constructorimpl(Shape shape) {
        return shape;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m245equalsimpl0(Shape shape, Shape shape2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{shape, shape2}, iWrite3)).booleanValue();
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m248unboximpl() {
        return this.shape;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m242boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    public boolean equals(Object obj) {
        return m244equalsimpl(this.shape, obj);
    }

    public int hashCode() {
        return m246hashCodeimpl(this.shape);
    }

    public String toString() {
        return m247toStringimpl(this.shape);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m249getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* JADX INFO: renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m250getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m246hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m247toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m244equalsimpl(Shape shape, Object obj) {
        if (!(obj instanceof BlurredEdgeTreatment)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shape, ((BlurredEdgeTreatment) obj).m248unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
