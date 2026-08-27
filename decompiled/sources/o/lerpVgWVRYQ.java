package o;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lerpVgWVRYQ implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View IconCompatParcelizer;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.IconCompatParcelizer;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view2.requestApplyInsets();
    }

    public lerpVgWVRYQ(View view) {
        this.IconCompatParcelizer = view;
    }
}
