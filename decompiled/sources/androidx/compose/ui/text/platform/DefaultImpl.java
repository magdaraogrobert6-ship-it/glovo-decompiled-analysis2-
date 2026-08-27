package androidx.compose.ui.text.platform;

import androidx.compose.runtime.CompositionKt;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import o.MutableRectKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {
    private onViewAttachedToWindow loadState;

    public DefaultImpl() {
        this.loadState = MutableRectKt.write() ? getFontLoadState() : null;
    }

    private final onViewAttachedToWindow getFontLoadState() {
        MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
        if (mutableRectKtRemoteActionCompatParcelizer.IconCompatParcelizer() == 1) {
            return new ImmutableBool(true);
        }
        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        mutableRectKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new EmojiCompat$InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // androidx.emoji2.text.EmojiCompat$InitCallback
            public void onFailed(Throwable th) {
                this.loadState = EmojiCompatStatus_androidKt.Falsey;
            }

            @Override // androidx.emoji2.text.EmojiCompat$InitCallback
            public void onInitialized() {
                populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.setValue(Boolean.TRUE);
                this.loadState = new ImmutableBool(true);
            }
        });
        return populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public onViewAttachedToWindow getFontLoaded() {
        onViewAttachedToWindow onviewattachedtowindow = this.loadState;
        if (onviewattachedtowindow != null) {
            onviewattachedtowindow.getClass();
            return onviewattachedtowindow;
        }
        if (!MutableRectKt.write()) {
            return EmojiCompatStatus_androidKt.Falsey;
        }
        onViewAttachedToWindow fontLoadState = getFontLoadState();
        this.loadState = fontLoadState;
        fontLoadState.getClass();
        return fontLoadState;
    }
}
