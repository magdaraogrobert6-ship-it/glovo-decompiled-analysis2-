package o;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class assignFocus3ESFkO8 implements View.OnAttachStateChangeListener {
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write = 0;

    public assignFocus3ESFkO8(accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep, Activity activity) {
        accessgetreusablegraphicslayerscopep.getClass();
        this.RemoteActionCompatParcelizer = accessgetreusablegraphicslayerscopep;
        this.IconCompatParcelizer = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            ((ViewGroup) obj).addView((fetchFocusRectuidefault) obj2, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) ((java.lang.ref.WeakReference) obj2).get();
        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (activity == null || iBinder == null) {
            return;
        }
        ((accessgetReusableGraphicsLayerScopep) obj).RemoteActionCompatParcelizer(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.write != 0) {
            view.getClass();
        } else {
            ((ViewGroup) this.RemoteActionCompatParcelizer).addView((fetchFocusRectuidefault) this.IconCompatParcelizer, 0);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public assignFocus3ESFkO8(ViewGroup viewGroup, fetchFocusRectuidefault fetchfocusrectuidefault) {
        this.RemoteActionCompatParcelizer = viewGroup;
        this.IconCompatParcelizer = fetchfocusrectuidefault;
    }
}
