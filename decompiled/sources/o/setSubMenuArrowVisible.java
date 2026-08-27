package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes4.dex */
public final class setSubMenuArrowVisible implements PopupWindow.OnDismissListener {
    public final /* synthetic */ getInflater IconCompatParcelizer;
    public final /* synthetic */ setTitle read;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.IconCompatParcelizer.read.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.read);
        }
    }

    public setSubMenuArrowVisible(getInflater getinflater, setTitle settitle) {
        this.IconCompatParcelizer = getinflater;
        this.read = settitle;
    }
}
