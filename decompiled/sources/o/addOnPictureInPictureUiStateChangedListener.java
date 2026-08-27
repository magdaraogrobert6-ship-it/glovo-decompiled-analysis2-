package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class addOnPictureInPictureUiStateChangedListener extends onBackPressed {
    public final onBackPressedDispatcher_delegatelambda0 IconCompatParcelizer;

    @Override // o.onBackPressed
    public final void write(Object obj) {
        onBackPressed onbackpressed = this.IconCompatParcelizer.IconCompatParcelizer;
        if (onbackpressed != null) {
            onbackpressed.write(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Launcher has not been initialized");
        }
    }

    public addOnPictureInPictureUiStateChangedListener(onBackPressedDispatcher_delegatelambda0 onbackpresseddispatcher_delegatelambda0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        this.IconCompatParcelizer = onbackpresseddispatcher_delegatelambda0;
    }

    @Override // o.onBackPressed
    public final void serializer() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
