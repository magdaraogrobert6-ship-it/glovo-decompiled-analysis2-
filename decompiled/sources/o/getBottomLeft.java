package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getBottomLeft implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;

    public /* synthetic */ getBottomLeft(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.serializer;
        if (i == 0) {
            MediaQueryKt mediaQueryKt = (MediaQueryKt) obj;
            populateViewStructure_androidKtpopulate7.setValue(mediaQueryKt.IconCompatParcelizer() ? mediaQueryKt.serializer() : mediaQueryKt.read());
            return createfromparcel;
        }
        List list = (List) obj;
        if (populateViewStructure_androidKtpopulate7 != null) {
            populateViewStructure_androidKtpopulate7.setValue(list);
        }
        return createfromparcel;
    }
}
