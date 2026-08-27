package o;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public abstract class fetchFocusPropertiesui {
    public static void read(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
