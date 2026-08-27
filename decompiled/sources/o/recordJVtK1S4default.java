package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.net.zza;

/* JADX INFO: loaded from: classes.dex */
public final class recordJVtK1S4default implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ drawRoundRectuAw5IAdefault RemoteActionCompatParcelizer;
    public final /* synthetic */ View read;

    public recordJVtK1S4default(drawRoundRectuAw5IAdefault drawroundrectuaw5iadefault, View view) {
        this.RemoteActionCompatParcelizer = drawroundrectuaw5iadefault;
        this.read = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Fill.IconCompatParcelizer().post(new zza(this, this, false, 9));
    }
}
