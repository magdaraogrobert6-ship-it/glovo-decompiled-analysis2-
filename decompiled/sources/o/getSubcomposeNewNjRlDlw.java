package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubcomposeNewNjRlDlw extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getSubcomposePausableNjRlDlw write;

    public getSubcomposeNewNjRlDlw(getSubcomposePausableNjRlDlw getsubcomposepausablenjrldlw, boolean z, int i) {
        this.write = getsubcomposepausablenjrldlw;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        getSubcomposePausableNjRlDlw getsubcomposepausablenjrldlw = this.write;
        getsubcomposepausablenjrldlw.MediaBrowserCompatMediaItem.setTranslationX(0.0f);
        getsubcomposepausablenjrldlw.serializer(0.0f, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }
}
