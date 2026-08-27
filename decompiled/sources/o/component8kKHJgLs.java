package o;

import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class component8kKHJgLs extends getSafeInnerRect {
    public final /* synthetic */ androidx.fragment.app.Fragment serializer;

    @Override // o.getSafeInnerRect
    public final View IconCompatParcelizer(int i) {
        androidx.fragment.app.Fragment fragment = this.serializer;
        View view = fragment.getActivityResultRegistry;
        if (view != null) {
            return view.findViewById(i);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // o.getSafeInnerRect
    public final boolean write() {
        return this.serializer.getActivityResultRegistry != null;
    }

    public component8kKHJgLs(androidx.fragment.app.Fragment fragment) {
        this.serializer = fragment;
    }
}
