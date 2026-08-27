package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class PathHitTester {
    public static final int $stable = 8;
    private Path path = PathHitTesterKt.EmptyPath;
    private float tolerance = 0.5f;
    private Rect bounds = Rect.Companion.getZero();
    private final IntervalTree<PathSegment> intervals = new IntervalTree<>();
    private final float[] curves = new float[20];
    private final float[] roots = new float[2];

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1023containsk4lQ0M(long j) {
        int i;
        int iLineWinding;
        if (!this.path.isEmpty() && this.bounds.m503containsk4lQ0M(j)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            IntervalTree<PathSegment>.Node node = intervalTree.root;
            if (node != intervalTree.terminator) {
                ArrayList<IntervalTree<PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(node);
                i = 0;
                while (arrayList.size() > 0) {
                    IntervalTree<PathSegment>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                    if (nodeRemove.overlaps(fIntBitsToFloat2, fIntBitsToFloat2)) {
                        PathSegment data = nodeRemove.getData();
                        data.getClass();
                        PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        int i2 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i2 == 1) {
                            iLineWinding = BezierKt.lineWinding(points, fIntBitsToFloat, fIntBitsToFloat2);
                        } else if (i2 == 2) {
                            iLineWinding = BezierKt.quadraticWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        } else if (i2 == 3) {
                            iLineWinding = BezierKt.cubicWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        }
                        i += iLineWinding;
                    }
                    if (nodeRemove.getLeft() != intervalTree.terminator && nodeRemove.getLeft().getMax() >= fIntBitsToFloat2) {
                        arrayList.add(nodeRemove.getLeft());
                    }
                    if (nodeRemove.getRight() != intervalTree.terminator && nodeRemove.getRight().getMin() <= fIntBitsToFloat2) {
                        arrayList.add(nodeRemove.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i = 0;
            }
            if (PathFillType.m1017equalsimpl0(this.path.mo610getFillTypeRgk1Os(), PathFillType.Companion.m1021getEvenOddRgk1Os())) {
                i &= 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(Path path, float f) {
        this.path = path;
        this.tolerance = f;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, f);
        while (it.hasNext()) {
            PathSegment next = it.next();
            int i = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                long jComputeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (jComputeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeVerticalBounds$default & 4294967295L)), next);
            } else if (i == 4) {
                return;
            }
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        pathHitTester.updatePath(path, f);
    }
}
