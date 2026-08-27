package o;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import com.roadrunner.login.presentation.LoginActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusModifierKt {
    public static long IconCompatParcelizer(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static final void RemoteActionCompatParcelizer(LoginActivity loginActivity) {
        loginActivity.getClass();
        View currentFocus = loginActivity.getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = loginActivity.getSystemService("input_method");
            systemService.getClass();
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final View IconCompatParcelizer(Activity activity) {
        activity.getClass();
        View rootView = ((ViewGroup) activity.findViewById(android.R.id.content)).getRootView();
        if (rootView != null) {
            return rootView;
        }
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(android.R.id.content);
        viewFindViewById.getClass();
        return viewFindViewById;
    }
}
