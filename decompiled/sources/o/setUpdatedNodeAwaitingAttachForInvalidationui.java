package o;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setUpdatedNodeAwaitingAttachForInvalidationui extends ViewGroup {
    public final ArrayList IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final androidx.compose.material.ripple.RippleHostMap read;
    public final ArrayList serializer;
    public final int write;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    public setUpdatedNodeAwaitingAttachForInvalidationui(Context context) {
        super(context);
        this.write = 5;
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.serializer = arrayList2;
        this.read = new androidx.compose.material.ripple.RippleHostMap(0);
        setClipChildren(false);
        setOwnerScopeui setownerscopeui = new setOwnerScopeui(context);
        addView(setownerscopeui);
        arrayList.add(setownerscopeui);
        arrayList2.add(setownerscopeui);
        this.RemoteActionCompatParcelizer = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }
}
