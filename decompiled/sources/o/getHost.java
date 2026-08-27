package o;

import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getHost implements r8lambda43nB7leLWjup6aTdW2xmA7XSAs, getNavigationEventDispatcher {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ HelpCenterActivity write;

    public /* synthetic */ getHost(HelpCenterActivity helpCenterActivity, int i) {
        this.IconCompatParcelizer = i;
        this.write = helpCenterActivity;
    }

    @Override // o.r8lambda43nB7leLWjup6aTdW2xmA7XSAs
    public void serializer(boolean z) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {this.write, Boolean.valueOf(z)};
        int i4 = sourceInformationContextOfdefault.read();
        HelpCenterActivity.IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i4, 2100559417, -2100559414, objArr);
        int i5 = RemoteActionCompatParcelizer + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = read + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        HelpCenterActivity helpCenterActivity = this.write;
        if (i4 != 1) {
            HelpCenterActivity.serializer(helpCenterActivity, (androidx.activity.result.ActivityResult) obj);
            int i5 = read + 113;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        HelpCenterActivity.read(helpCenterActivity, ((Boolean) obj).booleanValue());
        int i7 = read + 19;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 64 / 0;
        }
    }
}
