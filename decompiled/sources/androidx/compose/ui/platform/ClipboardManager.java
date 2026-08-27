package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public interface ClipboardManager {
    default ClipEntry getClip() {
        return null;
    }

    AnnotatedString getText();

    default void setClip(ClipEntry clipEntry) {
    }

    void setText(AnnotatedString annotatedString);

    default android.content.ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    default boolean hasText() {
        AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }
}
