package o;

import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class clipPathmtrdDE {
    public static clipRectN_I0leg write(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? clipRectN_I0leg.INVISIBLE : write(view.getVisibility());
    }

    public static clipRectN_I0leg write(int i) {
        if (i == 0) {
            return clipRectN_I0leg.VISIBLE;
        }
        if (i == 4) {
            return clipRectN_I0leg.INVISIBLE;
        }
        if (i == 8) {
            return clipRectN_I0leg.GONE;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unknown visibility "));
        return null;
    }
}
