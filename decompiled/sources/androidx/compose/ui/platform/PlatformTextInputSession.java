package androidx.compose.ui.platform;

import android.view.View;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes.dex */
public interface PlatformTextInputSession {
    View getView();

    Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, ShortNewsContentCardView<?> shortNewsContentCardView);
}
