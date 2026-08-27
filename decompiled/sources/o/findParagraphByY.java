package o;

import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class findParagraphByY implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ SelfServiceCustomerChatActivity serializer;

    public /* synthetic */ findParagraphByY(SelfServiceCustomerChatActivity selfServiceCustomerChatActivity, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = selfServiceCustomerChatActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        SelfServiceCustomerChatActivity selfServiceCustomerChatActivity = this.serializer;
        if (i4 == 0) {
            return SelfServiceCustomerChatActivity.read(selfServiceCustomerChatActivity);
        }
        if (i4 == 1) {
            return SelfServiceCustomerChatActivity.RemoteActionCompatParcelizer(selfServiceCustomerChatActivity);
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return i4 != 4 ? SelfServiceCustomerChatActivity.write(selfServiceCustomerChatActivity) : SelfServiceCustomerChatActivity.IconCompatParcelizer(selfServiceCustomerChatActivity);
            }
            return SelfServiceCustomerChatActivity.serializer(selfServiceCustomerChatActivity);
        }
        createFromParcel createfromparcel = (createFromParcel) SelfServiceCustomerChatActivity.write(2121259960, new Object[]{selfServiceCustomerChatActivity}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), -2121259959, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
        int i5 = IconCompatParcelizer + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return createfromparcel;
    }
}
