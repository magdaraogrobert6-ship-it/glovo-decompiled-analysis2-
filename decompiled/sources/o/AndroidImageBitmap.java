package o;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidImageBitmap {
    public static void read(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion.getClass();
            getColorSpace.serializer(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new androidx.lifecycle.ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void write(Activity activity, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        activity.getClass();
        androidColorSpace_androidKt.getClass();
        if (activity instanceof accessisRenderNodeCompatiblecp) {
            supportsColorMatrixQuery lifecycle = ((accessisRenderNodeCompatiblecp) activity).getLifecycle();
            if (lifecycle instanceof accessregisterComponentCallback) {
                ((accessregisterComponentCallback) lifecycle).serializer(androidColorSpace_androidKt);
            }
        }
    }
}
