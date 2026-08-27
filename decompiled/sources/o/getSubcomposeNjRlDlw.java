package o;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubcomposeNjRlDlw implements Runnable {
    public final /* synthetic */ getTookFromPrecomposeMapNjRlDlw serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getSubcomposeNjRlDlw(getTookFromPrecomposeMapNjRlDlw gettookfromprecomposemapnjrldlw, int i) {
        this.write = i;
        this.serializer = gettookfromprecomposemapnjrldlw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        getTookFromPrecomposeMapNjRlDlw gettookfromprecomposemapnjrldlw = this.serializer;
        if (i == 0) {
            if (gettookfromprecomposemapnjrldlw.MediaSessionCompatQueueItem > 0) {
                SystemClock.uptimeMillis();
            }
            gettookfromprecomposemapnjrldlw.setVisibility(0);
            return;
        }
        ((copy8GGzs04default) gettookfromprecomposemapnjrldlw.getCurrentDrawable()).RemoteActionCompatParcelizer(false, false, true);
        if (gettookfromprecomposemapnjrldlw.getProgressDrawable() == null || !gettookfromprecomposemapnjrldlw.getProgressDrawable().isVisible()) {
            if (gettookfromprecomposemapnjrldlw.getIndeterminateDrawable() == null || !gettookfromprecomposemapnjrldlw.getIndeterminateDrawable().isVisible()) {
                gettookfromprecomposemapnjrldlw.setVisibility(4);
            }
        }
    }
}
