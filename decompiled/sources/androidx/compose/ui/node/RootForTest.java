package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalIndirectPointerApi;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public interface RootForTest {

    public interface UncaughtExceptionHandler {
        void onUncaughtException(Throwable th);
    }

    @onItemDismisslambda0
    static /* synthetic */ void getTextInputService$annotations() {
    }

    default void forceAccessibilityForTesting(boolean z) {
    }

    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    TextInputService getTextInputService();

    default void measureAndLayoutForTest() {
    }

    @ExperimentalIndirectPointerApi
    default boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        return false;
    }

    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo2619sendKeyEventZmokQxo(KeyEvent keyEvent);

    default void setAccessibilityEventBatchIntervalMillis(long j) {
    }

    default void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler) {
    }
}
