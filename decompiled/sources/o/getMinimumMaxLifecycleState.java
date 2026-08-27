package o;

import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getMinimumMaxLifecycleState implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ HelpCenterActivity IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getMinimumMaxLifecycleState(HelpCenterActivity helpCenterActivity, int i) {
        this.read = i;
        this.IconCompatParcelizer = helpCenterActivity;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        HelpCenterActivity helpCenterActivity = this.IconCompatParcelizer;
        if (i4 == 0) {
            int i5 = sourceInformationContextOfdefault.read();
            int i6 = sourceInformationContextOfdefault.read();
            int i7 = sourceInformationContextOfdefault.read();
            return (getLoaderManager) HelpCenterActivity.IconCompatParcelizer(sourceInformationContextOfdefault.read(), i7, i6, i5, 1577451406, -1577451406, new Object[]{helpCenterActivity, (getBitmapui_graphics) obj});
        }
        if (i4 == 1) {
            return HelpCenterActivity.RemoteActionCompatParcelizer(helpCenterActivity, (getPopDirection) obj);
        }
        if (i4 != 2) {
            int i8 = sourceInformationContextOfdefault.read();
            int i9 = sourceInformationContextOfdefault.read();
            int i10 = sourceInformationContextOfdefault.read();
            return (createFromParcel) HelpCenterActivity.IconCompatParcelizer(sourceInformationContextOfdefault.read(), i10, i9, i8, 1161135286, -1161135275, new Object[]{helpCenterActivity, (getSharedElementReturnTransition) obj});
        }
        int i11 = sourceInformationContextOfdefault.read();
        int i12 = sourceInformationContextOfdefault.read();
        int i13 = sourceInformationContextOfdefault.read();
        createFromParcel createfromparcel = (createFromParcel) HelpCenterActivity.IconCompatParcelizer(sourceInformationContextOfdefault.read(), i13, i12, i11, -1839402844, 1839402851, new Object[]{helpCenterActivity, (androidx.activity.OnBackPressedCallback) obj});
        int i14 = RemoteActionCompatParcelizer + 45;
        write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return createfromparcel;
    }
}
