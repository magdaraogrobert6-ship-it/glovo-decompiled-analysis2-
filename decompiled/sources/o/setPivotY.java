package o;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setPivotY implements Runnable {
    public final /* synthetic */ Window RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ setInvalidateListenerui write;

    public /* synthetic */ setPivotY(setInvalidateListenerui setinvalidatelistenerui, Window window, int i) {
        this.serializer = i;
        this.write = setinvalidatelistenerui;
        this.RemoteActionCompatParcelizer = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Window window = this.RemoteActionCompatParcelizer;
        setInvalidateListenerui setinvalidatelistenerui = this.write;
        if (i == 0) {
            setinvalidatelistenerui.IconCompatParcelizer(window);
        } else {
            window.getClass();
            setinvalidatelistenerui.write(window);
        }
    }
}
