package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection recordingInputConnection);

    void onEditCommands(List<? extends EditCommand> list);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo3280onImeActionKlQnJC8(int i);

    void onKeyEvent(KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);
}
