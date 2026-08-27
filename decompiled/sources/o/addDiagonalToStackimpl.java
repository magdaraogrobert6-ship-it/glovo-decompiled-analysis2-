package o;

import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class addDiagonalToStackimpl extends getEndYimpl {
    public final /* synthetic */ SortedSet IconCompatParcelizer;
    public final /* synthetic */ WindowManager.LayoutParams RemoteActionCompatParcelizer;
    public final /* synthetic */ WindowManager read;

    @Override // o.getEndYimpl
    public final void serializer(float f) {
        WindowManager.LayoutParams layoutParams = this.RemoteActionCompatParcelizer;
        layoutParams.x = (int) f;
        this.read.updateViewLayout(this.IconCompatParcelizer.IconCompatParcelizer(), layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addDiagonalToStackimpl(View view, PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, WindowManager.LayoutParams layoutParams, WindowManager windowManager, SortedSet sortedSet) {
        super(view, pinnableContainerKtLocalPinnableContainer1);
        this.RemoteActionCompatParcelizer = layoutParams;
        this.read = windowManager;
        this.IconCompatParcelizer = sortedSet;
    }

    @Override // o.getEndYimpl
    public final float write() {
        return this.RemoteActionCompatParcelizer.x;
    }
}
