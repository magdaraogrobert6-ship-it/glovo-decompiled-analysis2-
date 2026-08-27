package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class copyxjbvk4Adefault implements View.OnAttachStateChangeListener {
    public final /* synthetic */ isSpecifieduvyYCjkannotations RemoteActionCompatParcelizer;
    public final /* synthetic */ copyxjbvk4A serializer;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations = this.RemoteActionCompatParcelizer;
        androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
        isspecifieduvyycjkannotations.MediaDescriptionCompat();
        isFiniteannotations.read((ViewGroup) fragment.getActivityResultRegistry.getParent(), this.serializer.write).RemoteActionCompatParcelizer();
    }

    public copyxjbvk4Adefault(copyxjbvk4A copyxjbvk4a, isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations) {
        this.serializer = copyxjbvk4a;
        this.RemoteActionCompatParcelizer = isspecifieduvyycjkannotations;
    }
}
