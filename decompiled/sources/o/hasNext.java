package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class hasNext extends androidx.lifecycle.ViewModel {
    public getExponentimpl IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public hasNext(getBitmapui_graphics getbitmapui_graphics) {
        String string = (String) getbitmapui_graphics.write("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            getbitmapui_graphics.RemoteActionCompatParcelizer("SaveableStateHolder_BackStackEntryKey", string);
        }
        this.RemoteActionCompatParcelizer = string;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        getExponentimpl getexponentimpl = this.IconCompatParcelizer;
        if (getexponentimpl == null) {
            removeNodeAtDepth.serializer("saveableStateHolderRef");
            throw null;
        }
        AlphaKt alphaKt = (AlphaKt) ((java.lang.ref.WeakReference) getexponentimpl.read).get();
        if (alphaKt != null) {
            alphaKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        getExponentimpl getexponentimpl2 = this.IconCompatParcelizer;
        if (getexponentimpl2 != null) {
            ((java.lang.ref.WeakReference) getexponentimpl2.read).clear();
        } else {
            removeNodeAtDepth.serializer("saveableStateHolderRef");
            throw null;
        }
    }
}
