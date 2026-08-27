package o;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class getFocusedRect {
    public static final void IconCompatParcelizer(Throwable th) {
        throw new IllegalStateException("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th);
    }

    public static FocusTargetModifierNodePYyLHbc write(AppCompatDialogFragment appCompatDialogFragment, InputConnection inputConnection, EditorInfo editorInfo) {
        return new FocusTargetModifierNodePYyLHbc(inputConnection, new StreamSharing$$ExternalSyntheticLambda0(17, appCompatDialogFragment));
    }
}
