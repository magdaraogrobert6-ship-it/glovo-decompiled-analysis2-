package o;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaX9oYHljBNKlnwJiwehaYfTB7JCw implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ SoftwareKeyboardController IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambdaX9oYHljBNKlnwJiwehaYfTB7JCw(SoftwareKeyboardController softwareKeyboardController, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = softwareKeyboardController;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SoftwareKeyboardController softwareKeyboardController = this.IconCompatParcelizer;
        if (i4 == 0) {
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            return createfromparcel;
        }
        if (softwareKeyboardController != null) {
            int i5 = serializer + 51;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                softwareKeyboardController.hide();
                throw null;
            }
            softwareKeyboardController.hide();
        }
        return createfromparcel;
    }
}
