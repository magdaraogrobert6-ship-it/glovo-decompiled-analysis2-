package o;

import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class Paragraph extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ SelfServiceCustomerChatActivity read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Paragraph(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, int i) {
        super(0);
        this.RemoteActionCompatParcelizer = i;
        this.read = selfServiceCustomerChatActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.read;
        if (i4 != 0) {
            return selfServiceCustomerChatActivity.getDefaultViewModelCreationExtras();
        }
        getFilterQualityfv9h1I viewModelStore = selfServiceCustomerChatActivity.getViewModelStore();
        int i5 = IconCompatParcelizer + 59;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return viewModelStore;
    }
}
