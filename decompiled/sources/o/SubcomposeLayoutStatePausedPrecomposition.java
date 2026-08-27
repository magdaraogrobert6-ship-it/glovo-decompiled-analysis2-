package o;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutStatePausedPrecomposition implements FocusPropertiesImpl {
    public final /* synthetic */ getSetRootui read;

    public /* synthetic */ SubcomposeLayoutStatePausedPrecomposition(getSetRootui getsetrootui) {
        this.read = getsetrootui;
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int iWrite = focusRequesterModifierKt.write();
        getSetRootui getsetrootui = this.read;
        getsetrootui.ComponentActivity = iWrite;
        getsetrootui.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = focusRequesterModifierKt.read();
        getsetrootui.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = focusRequesterModifierKt.serializer();
        getsetrootui.MediaBrowserCompatMediaItem();
        return focusRequesterModifierKt;
    }

    public void write(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.read.IconCompatParcelizer(0);
    }
}
