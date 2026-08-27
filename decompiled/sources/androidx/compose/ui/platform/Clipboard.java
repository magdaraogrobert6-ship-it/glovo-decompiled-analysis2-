package androidx.compose.ui.platform;

import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public interface Clipboard {
    Object getClipEntry(ShortNewsContentCardView<? super ClipEntry> shortNewsContentCardView);

    android.content.ClipboardManager getNativeClipboard();

    Object setClipEntry(ClipEntry clipEntry, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView);
}
