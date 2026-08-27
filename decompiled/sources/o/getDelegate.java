package o;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class getDelegate implements PopupWindow.OnDismissListener {
    public final /* synthetic */ getMenuInflater read;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.read.write();
    }

    public getDelegate(getMenuInflater getmenuinflater) {
        this.read = getmenuinflater;
    }
}
