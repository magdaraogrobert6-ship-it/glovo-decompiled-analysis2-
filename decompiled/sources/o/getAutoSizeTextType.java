package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class getAutoSizeTextType extends ViewGroup.MarginLayoutParams {
    public int RemoteActionCompatParcelizer;
    public int write;

    public getAutoSizeTextType(getAutoSizeTextType getautosizetexttype) {
        super((ViewGroup.MarginLayoutParams) getautosizetexttype);
        this.write = 0;
        this.write = getautosizetexttype.write;
    }

    public getAutoSizeTextType(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.write = 0;
    }

    public getAutoSizeTextType(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public getAutoSizeTextType(int i, int i2) {
        super(i, i2);
    }
}
