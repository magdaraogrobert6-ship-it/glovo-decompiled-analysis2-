package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getSupportCheckMarkTintList extends View {
    public int IconCompatParcelizer;
    public java.lang.ref.WeakReference read;
    public int serializer;
    public LayoutInflater write;

    public getSupportCheckMarkTintList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.IconCompatParcelizer = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onUserLeaveHint.ViewStubCompat, 0, 0);
        this.serializer = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    public int getInflatedId() {
        return this.serializer;
    }

    public LayoutInflater getLayoutInflater() {
        return this.write;
    }

    public int getLayoutResource() {
        return this.IconCompatParcelizer;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.serializer = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.write = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.IconCompatParcelizer = i;
    }

    public void setOnInflateListener(getSupportCheckMarkTintMode getsupportcheckmarktintmode) {
    }

    public final View IconCompatParcelizer() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.IconCompatParcelizer == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.write;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.IconCompatParcelizer, viewGroup, false);
        int i = this.serializer;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.read = new java.lang.ref.WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        java.lang.ref.WeakReference weakReference = this.read;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            IconCompatParcelizer();
        }
    }
}
