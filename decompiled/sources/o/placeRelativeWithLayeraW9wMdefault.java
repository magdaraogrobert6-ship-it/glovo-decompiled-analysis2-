package o;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class placeRelativeWithLayeraW9wMdefault extends androidx.core.view.AccessibilityDelegateCompat {
    public final /* synthetic */ AppBarLayout.BaseBehavior read;

    public placeRelativeWithLayeraW9wMdefault(AppBarLayout.BaseBehavior baseBehavior) {
        this.read = baseBehavior;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(this.read.IconCompatParcelizer);
        focusRestorerKtsaveFocusedChild11.read(ScrollView.class.getName());
    }
}
