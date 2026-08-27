package com.braze.ui.inappmessage;

import android.app.Activity;
import android.os.Build;
import android.window.OnBackAnimationCallback;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageBackEventHandler {
    private WeakReference<Activity> activityRef;
    private OnBackAnimationCallback backAnimationCallback;
    private final IInAppMessageBackEventListener inAppMessageView;

    public InAppMessageBackEventHandler(Activity activity, IInAppMessageBackEventListener iInAppMessageBackEventListener) {
        activity.getClass();
        this.inAppMessageView = iInAppMessageBackEventListener;
        if (Build.VERSION.SDK_INT < 34 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return;
        }
        InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 inAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 = new InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(this);
        this.backAnimationCallback = inAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1;
        this.activityRef = new WeakReference<>(activity);
        activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, inAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1);
    }

    public void unregister() {
        WeakReference<Activity> weakReference = this.activityRef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        OnBackAnimationCallback onBackAnimationCallback = this.backAnimationCallback;
        if (activity != null && onBackAnimationCallback != null && Build.VERSION.SDK_INT >= 34) {
            activity.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackAnimationCallback);
        }
        this.backAnimationCallback = null;
        this.activityRef = null;
    }
}
