package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.R;
import java.lang.ref.WeakReference;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView_androidKt {
    private static boolean areWindowInsetsRulersEnabled = true;

    @ExperimentalComposeUiApi
    public static final void disableWindowInsetsRulers(ComposeView.Companion companion) {
        areWindowInsetsRulersEnabled = false;
    }

    public static final boolean getAreWindowInsetsRulersEnabled() {
        return areWindowInsetsRulersEnabled;
    }

    public static /* synthetic */ void getComposeViewContext$annotations(View view) {
    }

    public static final void setAreWindowInsetsRulersEnabled(boolean z) {
        areWindowInsetsRulersEnabled = z;
    }

    public static final ComposeViewContext getComposeViewContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (ComposeViewContext) weakReference.get();
        }
        return null;
    }

    @ExperimentalComposeViewContextApi
    public static final ComposeViewContext findViewTreeComposeViewContext(View view) {
        return getComposeViewContext(findViewTreeComposeViewRoot(view));
    }

    public static final void setComposeViewContext(View view, ComposeViewContext composeViewContext) {
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(composeViewContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewTreeComposeViewRoot(View view) {
        if (!view.isAttachedToWindow() || !AndroidComposeUiFlags.isSharedComposeViewContextEnabled) {
            return view;
        }
        int iMin = Math.min(findDepthToTag(view, com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner), findDepthToTag(view, com.logistics.rider.glovo.R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view3 != null) {
            if (i == iMin) {
                if (!(view3.getParent() instanceof ViewGroup)) {
                    return view;
                }
            } else if (getComposeViewContext(view3) == null) {
                i++;
                Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view3);
                View view4 = objRemoteActionCompatParcelizer instanceof View ? (View) objRemoteActionCompatParcelizer : null;
                view2 = view;
                view = view3;
                view3 = view4;
            }
            return view3;
        }
        return view2;
    }

    private static final int findDepthToTag(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
            view = objRemoteActionCompatParcelizer instanceof View ? (View) objRemoteActionCompatParcelizer : null;
        }
        return i3;
    }
}
