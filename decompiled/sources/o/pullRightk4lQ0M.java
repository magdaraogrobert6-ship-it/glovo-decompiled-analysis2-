package o;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class pullRightk4lQ0M implements DisplayManager.DisplayListener {
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect read;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.read;
        Display defaultDisplay = androidEdgeEffectOverscrollEffect.getDefaultDisplay();
        if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
            return;
        }
        androidEdgeEffectOverscrollEffect.RemoteActionCompatParcelizer();
    }

    public pullRightk4lQ0M(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        this.read = androidEdgeEffectOverscrollEffect;
    }
}
