package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 {
    public Interpolator IconCompatParcelizer;
    public getCancel serializer;
    public boolean write;
    public long RemoteActionCompatParcelizer = -1;
    public final getSupportButtonTintList MediaSessionCompatQueueItem = new getSupportButtonTintList(this);
    public final ArrayList read = new ArrayList();

    public final void IconCompatParcelizer() {
        View view;
        if (this.write) {
            return;
        }
        for (getRedirectui getredirectui : this.read) {
            long j = this.RemoteActionCompatParcelizer;
            if (j >= 0) {
                getredirectui.RemoteActionCompatParcelizer(j);
            }
            Interpolator interpolator = this.IconCompatParcelizer;
            if (interpolator != null && (view = (View) getredirectui.write.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.serializer != null) {
                getredirectui.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
            }
            View view2 = (View) getredirectui.write.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.write = true;
    }

    public final void serializer() {
        if (this.write) {
            Iterator it = this.read.iterator();
            while (it.hasNext()) {
                ((getRedirectui) it.next()).serializer();
            }
            this.write = false;
        }
    }
}
