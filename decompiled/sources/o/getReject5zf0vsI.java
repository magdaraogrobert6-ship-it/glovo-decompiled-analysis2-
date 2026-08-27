package o;

import com.foodora.courier.legacy.ui.main.PushTokenUpdateViewModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getReject5zf0vsI implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ PushTokenUpdateViewModel IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getReject5zf0vsI(PushTokenUpdateViewModel pushTokenUpdateViewModel, int i) {
        this.read = i;
        this.IconCompatParcelizer = pushTokenUpdateViewModel;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        PushTokenUpdateViewModel pushTokenUpdateViewModel = this.IconCompatParcelizer;
        boolean z = true;
        if (i3 == 0) {
            String str = (String) obj;
            str.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                if (pushTokenUpdateViewModel.serializer.write() == setPaddingTop.GOOGLE) {
                    int i4 = serializer + 5;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i3 == 1) {
            String str2 = (String) obj;
            str2.getClass();
            pushTokenUpdateViewModel.read.RemoteActionCompatParcelizer(str2);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((createFromParcel) obj).getClass();
            return pushTokenUpdateViewModel.IconCompatParcelizer.IconCompatParcelizer();
        }
        pushTokenUpdateViewModel.write.RemoteActionCompatParcelizer((Integer) obj);
        return createfromparcel2;
    }
}
