package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import o.BeyondBoundsLayoutKt;
import o.scale;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {
    public boolean IconCompatParcelizer;
    public boolean write;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    public abstract void write(scale scaleVar, int i, int i2);

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.write || this.IconCompatParcelizer) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
                    View view = (View) constraintLayout.serializer.get(this.MediaSessionCompatQueueItem[i]);
                    if (view != null) {
                        if (this.write) {
                            view.setVisibility(visibility);
                        }
                        if (this.IconCompatParcelizer && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void write(AttributeSet attributeSet) {
        super.write(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.write = true;
                } else if (index == 22) {
                    this.IconCompatParcelizer = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
