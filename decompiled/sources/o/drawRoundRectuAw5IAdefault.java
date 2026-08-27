package o;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class drawRoundRectuAw5IAdefault implements getDefaultBlendMode0nO6VwU {
    public volatile boolean RemoteActionCompatParcelizer;
    public final Set write = Collections.newSetFromMap(new WeakHashMap());

    @Override // o.getDefaultBlendMode0nO6VwU
    public final void RemoteActionCompatParcelizer(androidx.fragment.app.FragmentActivity fragmentActivity) {
        if (!this.RemoteActionCompatParcelizer && this.write.add(fragmentActivity)) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new recordJVtK1S4default(this, decorView));
        }
    }
}
