package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bo.app.af$$ExternalSyntheticOutline0;
import o.div7Ah8Wj8;
import o.drawCircle9KIMszo;
import o.drawLineWko1d7g;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStrictMode {
    public static final drawLineWko1d7g serializer = drawLineWko1d7g.write;

    public static void serializer(Violation violation) {
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            violation.RemoteActionCompatParcelizer.getClass();
        }
    }

    public static drawLineWko1d7g write(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return serializer;
    }

    public static final void write(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        serializer(new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void IconCompatParcelizer(Fragment fragment) {
        serializer(new GetTargetFragmentUsageViolation(fragment, "Attempting to get target fragment from fragment " + fragment));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void IconCompatParcelizer(Fragment fragment, ViewGroup viewGroup) {
        serializer(new FragmentTagUsageViolation(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void IconCompatParcelizer(Fragment fragment, boolean z) {
        serializer(new SetUserVisibleHintViolation(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void RemoteActionCompatParcelizer(Fragment fragment) {
        serializer(new GetTargetFragmentRequestCodeUsageViolation(fragment, "Attempting to get target request code from fragment " + fragment));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void read(Fragment fragment) {
        serializer(new SetRetainInstanceUsageViolation(fragment, "Attempting to set retain instance for fragment " + fragment));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void serializer(Fragment fragment) {
        serializer(new GetRetainInstanceUsageViolation(fragment, "Attempting to get retain instance for fragment " + fragment));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void write(Fragment fragment, Fragment fragment2, int i) {
        serializer(new SetTargetFragmentUsageViolation(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void serializer(Fragment fragment, Fragment fragment2, int i) {
        fragment.getClass();
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(fragment);
        sb.append(" within the view of parent fragment ");
        sb.append(fragment2);
        sb.append(" via container with ID ");
        serializer(new WrongNestedHierarchyViolation(fragment, af$$ExternalSyntheticOutline0.m(i, " without using parent's childFragmentManager", sb)));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }

    public static final void write(Fragment fragment, ViewGroup viewGroup) {
        fragment.getClass();
        serializer(new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView"));
        write(fragment).getClass();
        drawCircle9KIMszo drawcircle9kimszo = drawCircle9KIMszo.PENALTY_LOG;
    }
}
