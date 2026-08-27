package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.LazyKt__LazyJVMKt;
import o.FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    private final onViewDetachedFromWindowlambda1 imm$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final android.view.inputmethod.InputMethodManager invoke() {
            Object systemService = this.this$0.view.getContext().getSystemService("input_method");
            systemService.getClass();
            return (android.view.inputmethod.InputMethodManager) systemService;
        }

        {
            super(0);
        }
    });
    private final FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 softwareKeyboardControllerCompat;
    private final View view;

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.RemoteActionCompatParcelizer.serializer();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public InputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int i, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.view, i, i2, i3, i4);
    }
}
