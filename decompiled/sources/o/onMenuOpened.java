package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.android.material.textfield.EndCompoundLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class onMenuOpened implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ onMenuOpened(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            getSupportParentActivityIntent getsupportparentactivityintent = (getSupportParentActivityIntent) obj;
            ViewTreeObserver viewTreeObserver = getsupportparentactivityintent.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    getsupportparentactivityintent.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = view.getViewTreeObserver();
                }
                getsupportparentactivityintent.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.removeGlobalOnLayoutListener(getsupportparentactivityintent.MediaBrowserCompatMediaItem);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            EndCompoundLayout endCompoundLayout = (EndCompoundLayout) obj;
            DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 = endCompoundLayout.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 == null || (accessibilityManager = endCompoundLayout.read) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new setFallback(dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5));
            return;
        }
        r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0 r8lambdatwvtypfkihdx0rbtwvlevvlt0 = (r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0) obj;
        ViewTreeObserver viewTreeObserver2 = r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (viewTreeObserver2 != null) {
            if (!viewTreeObserver2.isAlive()) {
                r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = view.getViewTreeObserver();
            }
            r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.removeGlobalOnLayoutListener(r8lambdatwvtypfkihdx0rbtwvlevvlt0.MediaDescriptionCompat);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.serializer;
        if (i == 0 || i == 1) {
            return;
        }
        EndCompoundLayout endCompoundLayout = (EndCompoundLayout) this.IconCompatParcelizer;
        android.view.accessibility.AccessibilityManager accessibilityManager = endCompoundLayout.read;
        if (endCompoundLayout.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null || accessibilityManager == null) {
            return;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (endCompoundLayout.isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(new setFallback(endCompoundLayout.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
        }
    }
}
