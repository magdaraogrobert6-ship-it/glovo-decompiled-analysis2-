package androidx.compose.ui.input.key;

import androidx.compose.ui.node.DelegatableNode;

/* JADX INFO: loaded from: classes.dex */
public interface SoftKeyboardInterceptionModifierNode extends DelegatableNode {
    /* JADX INFO: renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo */
    boolean mo1576onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent);

    /* JADX INFO: renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo */
    boolean mo1577onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent);
}
