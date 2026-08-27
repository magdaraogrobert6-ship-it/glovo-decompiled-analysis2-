package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class copyMDFrsts implements toAndroidColorSpace {
    public final /* synthetic */ androidx.fragment.app.Fragment read;

    public copyMDFrsts(androidx.fragment.app.Fragment fragment) {
        this.read = fragment;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        View view;
        if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_STOP || (view = this.read.getActivityResultRegistry) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
