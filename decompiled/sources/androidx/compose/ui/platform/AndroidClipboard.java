package androidx.compose.ui.platform;

import android.content.Context;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(Context context) {
        this(new AndroidClipboardManager(context));
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object getClipEntry(ShortNewsContentCardView<? super ClipEntry> shortNewsContentCardView) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public android.content.ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object setClipEntry(ClipEntry clipEntry, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        this.androidClipboardManager.setClip(clipEntry);
        return createFromParcel.INSTANCE;
    }

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }
}
