package o;

import android.content.Context;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexElement extends androidx.compose.ui.platform.AbstractComposeView implements androidx.compose.ui.window.DialogWindowProvider {
    public boolean RemoteActionCompatParcelizer;
    public final Window read;
    public final PopulateViewStructure_androidKtpopulate7 write;

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public final Window getWindow() {
        return this.read;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(576708319);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((onShowTranslationui) this.write).getValue()).invoke(getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(this, i, 6);
        }
    }

    public ZIndexElement(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.read = window;
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(UiMediaScopeKeyboardKind.IconCompatParcelizer);
    }
}
