package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.displayInAppMessagelambda121;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, displayInAppMessagelambda121 {
    public static final int $stable = 0;
    private final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<VectorNode>, displayInAppMessagelambda121 {
        private final Iterator<VectorNode> it;

        public final Iterator<VectorNode> getIt() {
            return this.it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public VectorNode next() {
            return this.it.next();
        }

        public AnonymousClass1(VectorGroup vectorGroup) {
            this.it = vectorGroup.children.iterator();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final VectorNode get(int i) {
        return this.children.get(i);
    }

    public final int getSize() {
        return this.children.size();
    }

    public int hashCode() {
        return this.children.hashCode() + c8$$ExternalSyntheticOutline0.m(this.clipPathData, af$$ExternalSyntheticOutline1.m(this.translationY, af$$ExternalSyntheticOutline1.m(this.translationX, af$$ExternalSyntheticOutline1.m(this.scaleY, af$$ExternalSyntheticOutline1.m(this.scaleX, af$$ExternalSyntheticOutline1.m(this.pivotY, af$$ExternalSyntheticOutline1.m(this.pivotX, af$$ExternalSyntheticOutline1.m(this.rotation, this.name.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public Iterator<VectorNode> iterator() {
        return new AnonymousClass1(this);
    }

    public /* synthetic */ VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & Fields.SpotShadowColor) == 0 ? f7 : 0.0f, (i & Fields.RotationX) != 0 ? VectorKt.getEmptyPath() : list, (i & Fields.RotationY) != 0 ? instance_delegatelambda0.write : list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, vectorGroup.name}, getCieXyz.write())).booleanValue() && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clipPathData, vectorGroup.clipPathData}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.children, vectorGroup.children}, getCieXyz.write())).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f;
        this.pivotX = f2;
        this.pivotY = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.clipPathData = list;
        this.children = list2;
    }

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }
}
