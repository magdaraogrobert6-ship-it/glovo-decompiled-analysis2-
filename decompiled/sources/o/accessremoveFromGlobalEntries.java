package o;

import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class accessremoveFromGlobalEntries implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ CustomerChatsActivity IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ accessremoveFromGlobalEntries(CustomerChatsActivity customerChatsActivity, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = customerChatsActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.serializer;
        CustomerChatsActivity customerChatsActivity = this.IconCompatParcelizer;
        Object obj = null;
        if (i2 != 0) {
            setStrokeCapBeK7IIE defaultViewModelCreationExtras = customerChatsActivity.getDefaultViewModelCreationExtras();
            int i3 = write + 33;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return defaultViewModelCreationExtras;
            }
            obj.hashCode();
            throw null;
        }
        getFilterQualityfv9h1I viewModelStore = customerChatsActivity.getViewModelStore();
        int i4 = write + 71;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return viewModelStore;
        }
        obj.hashCode();
        throw null;
    }
}
