package o;

import android.view.View;
import androidx.transition.Transition$3;

/* JADX INFO: loaded from: classes.dex */
public final class getRedirectui {
    public final java.lang.ref.WeakReference write;

    public final void IconCompatParcelizer(float f) {
        View view = (View) this.write.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void IconCompatParcelizer(getCancel getcancel) {
        View view = (View) this.write.get();
        if (view != null) {
            if (getcancel != null) {
                view.animate().setListener(new Transition$3(getcancel, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(float f) {
        View view = (View) this.write.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        View view = (View) this.write.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void serializer() {
        View view = (View) this.write.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public getRedirectui(View view) {
        this.write = new java.lang.ref.WeakReference(view);
    }
}
