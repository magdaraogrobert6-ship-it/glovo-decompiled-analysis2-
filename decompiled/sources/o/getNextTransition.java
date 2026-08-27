package o;

import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class getNextTransition extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ HelpCenterActivity read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getNextTransition(HelpCenterActivity helpCenterActivity, int i) {
        super(0);
        this.IconCompatParcelizer = i;
        this.read = helpCenterActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        HelpCenterActivity helpCenterActivity = this.read;
        if (i4 != 0) {
            return helpCenterActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = helpCenterActivity.getViewModelStore();
        int i5 = RemoteActionCompatParcelizer + 87;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return viewModelStore;
    }
}
