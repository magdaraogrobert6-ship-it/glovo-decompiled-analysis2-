package o;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h2ExternalSyntheticLambda18 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ View read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ gh write;

    public /* synthetic */ h2ExternalSyntheticLambda18(gh ghVar, View view, int i) {
        this.serializer = i;
        this.write = ghVar;
        this.read = view;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        View view = this.read;
        gh ghVar = this.write;
        if (i4 == 0) {
            ghVar.write(view);
            return createfromparcel;
        }
        ghVar.read(view);
        int i5 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
