package androidx.navigation.fragment;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.CustomerChatModulestartChat2;
import o.getConicEvaluation;
import o.relativeMoveTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentKt {
    public static void write(int i, CustomerChatModulestartChat2 customerChatModulestartChat2) {
        customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) (i >>> 24));
        customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) (i >>> 16));
        customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) (i >>> 8));
        customerChatModulestartChat2.RemoteActionCompatParcelizer((byte) i);
    }

    public static final relativeMoveTo write(Fragment fragment) {
        Dialog dialog;
        Window window;
        fragment.getClass();
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).IconCompatParcelizer();
            }
            Fragment fragment2 = parentFragment.getParentFragmentManager()._init_lambda3;
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).IconCompatParcelizer();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return getConicEvaluation.IconCompatParcelizer(view);
        }
        DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
        View decorView = (dialogFragment == null || (dialog = dialogFragment.read) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return getConicEvaluation.IconCompatParcelizer(decorView);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", fragment, " does not have a NavController set"));
        return null;
    }
}
