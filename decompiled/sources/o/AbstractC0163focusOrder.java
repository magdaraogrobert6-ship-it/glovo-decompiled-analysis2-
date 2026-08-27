package o;

import android.view.View;

/* JADX INFO: renamed from: o.focusOrder, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0163focusOrder {
    public static float RemoteActionCompatParcelizer(View view) {
        return view.getTransitionAlpha();
    }

    public static void RemoteActionCompatParcelizer(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public static void write(android.graphics.Paint paint, Object obj) {
        paint.setBlendMode((android.graphics.BlendMode) obj);
    }
}
