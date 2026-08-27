package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SimpleInnerShadowElement extends View {
    public boolean IconCompatParcelizer;

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.IconCompatParcelizer = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public SimpleInnerShadowElement(Context context) {
        super(context);
        this.IconCompatParcelizer = true;
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) getLayoutParams();
        if (this.IconCompatParcelizer && shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == i) {
            return;
        }
        shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
        setLayoutParams(shadows4czxiidefault);
    }

    public void setGuidelineEnd(int i) {
        shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) getLayoutParams();
        if (this.IconCompatParcelizer && shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == i) {
            return;
        }
        shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i;
        setLayoutParams(shadows4czxiidefault);
    }

    public void setGuidelinePercent(float f) {
        shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) getLayoutParams();
        if (this.IconCompatParcelizer && shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == f) {
            return;
        }
        shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = f;
        setLayoutParams(shadows4czxiidefault);
    }

    public SimpleInnerShadowElement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = true;
        super.setVisibility(8);
    }
}
