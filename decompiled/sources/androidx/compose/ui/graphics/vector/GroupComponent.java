package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m758getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            public final void invoke(VNode vNode) {
                this.this$0.markTintForVNode(vNode);
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM invalidateListener$ui = this.this$0.getInvalidateListener$ui();
                if (invalidateListener$ui != null) {
                    invalidateListener$ui.invoke(vNode);
                }
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return createFromParcel.INSTANCE;
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m758getUnspecified0d7_KjU();
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getInvalidateListener$ui() {
        return this.invalidateListener;
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

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m1456getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.invalidateListener = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void remove(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.children.size()) {
                this.children.get(i).setInvalidateListener$ui(null);
                this.children.remove(i);
            }
        }
        invalidate();
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m1455markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    public final void insertAt(int i, VNode vNode) {
        int numChildren = getNumChildren();
        List<VNode> list = this.children;
        if (i < numChildren) {
            list.set(i, vNode);
        } else {
            list.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui(this.wrappedListener);
        invalidate();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = list.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo1233transform58bKbWc(Matrix.m967boximpl(fArr).m992unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m1360clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).draw(drawScope);
            }
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    public final void move(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                VNode vNode = this.children.get(i);
                this.children.remove(i);
                this.children.add(i2, vNode);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                VNode vNode2 = this.children.get(i);
                this.children.remove(i);
                this.children.add(i2 - 1, vNode2);
                i4++;
            }
        }
        invalidate();
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path Path = this.clipPath;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.clipPath = Path;
            }
            PathParserKt.toPath(this.clipPathData, Path);
        }
    }

    private final void updateMatrix() {
        float[] fArrM969constructorimpl$default = this.groupMatrix;
        if (fArrM969constructorimpl$default == null) {
            fArrM969constructorimpl$default = Matrix.m969constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM969constructorimpl$default;
        } else {
            Matrix.m978resetimpl(fArrM969constructorimpl$default);
        }
        float f = this.translationX;
        float[] fArr = fArrM969constructorimpl$default;
        Matrix.m991translateimpl$default(fArr, this.pivotX + f, this.translationY + this.pivotY, 0.0f, 4, null);
        Matrix.m983rotateZimpl(fArrM969constructorimpl$default, this.rotation);
        Matrix.m984scaleimpl(fArrM969constructorimpl$default, this.scaleX, this.scaleY, 1.0f);
        Matrix.m991translateimpl$default(fArrM969constructorimpl$default, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m1455markTintForColor8_81llA(((SolidColor) brush).m1081getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m1455markTintForColor8_81llA(long j) {
        if (this.isTintable && j != 16) {
            long j2 = this.tintColor;
            if (j2 == 16) {
                this.tintColor = j;
            } else {
                if (VectorKt.m1479rgbEqualOWjLjI(j2, j)) {
                    return;
                }
                markNotTintable();
            }
        }
    }
}
