package o;

import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class addToGlobalEntries implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ CustomerChatsActivity IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ addToGlobalEntries(CustomerChatsActivity customerChatsActivity, int i) {
        this.write = i;
        this.IconCompatParcelizer = customerChatsActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        CustomerChatsActivity customerChatsActivity = this.IconCompatParcelizer;
        if (i3 == 0) {
            return CustomerChatsActivity.serializer(customerChatsActivity);
        }
        if (i3 != 1) {
            return CustomerChatsActivity.read(customerChatsActivity);
        }
        Object[] objArr = {customerChatsActivity};
        int iSerializer = GapBufferKt.serializer();
        createFromParcel createfromparcel = (createFromParcel) CustomerChatsActivity.read(167808002, GapBufferKt.serializer(), objArr, -167808000, GapBufferKt.serializer(), GapBufferKt.serializer(), iSerializer);
        int i4 = RemoteActionCompatParcelizer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
