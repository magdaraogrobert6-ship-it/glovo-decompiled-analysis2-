package o;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class getUnsetValueInsets implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ TextInputLayout write;

    public /* synthetic */ getUnsetValueInsets(TextInputLayout textInputLayout, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        TextInputLayout textInputLayout = this.write;
        if (i != 0) {
            textInputLayout._init_lambda4.requestLayout();
            return;
        }
        CheckableImageButton checkableImageButton = textInputLayout.ensureViewModelStore.ParcelableVolumeInfo;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }
}
