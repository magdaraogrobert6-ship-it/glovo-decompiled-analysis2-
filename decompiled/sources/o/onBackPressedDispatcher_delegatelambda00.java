package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onBackPressedDispatcher_delegatelambda00 implements getNavigationEventDispatcher, FocusPropertiesImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read.getValue()).invoke(obj);
            int i3 = 8 / 0;
        } else {
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read.getValue()).invoke(obj);
        }
        int i4 = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        view.getClass();
        this.read.setValue(!focusRequesterModifierKt.IconCompatParcelizer.isVisible(8) ? getDriver.RemoteActionCompatParcelizer : getDriver.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return focusRequesterModifierKt;
    }
}
