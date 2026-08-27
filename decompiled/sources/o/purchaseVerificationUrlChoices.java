package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class purchaseVerificationUrlChoices implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ purchaseVerificationUrlChoices(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.write = i;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        if (i2 == 0) {
            androidx.compose.ui.focus.FocusState focusState = (androidx.compose.ui.focus.FocusState) obj;
            focusState.getClass();
            populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(focusState.isFocused()));
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(focusState.isFocused()));
            return createfromparcel;
        }
        if (i2 != 1) {
            String str = (String) obj;
            str.getClass();
            populateViewStructure_androidKtpopulate7.setValue(str);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
            int i3 = read + 25;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        String str2 = (String) obj;
        str2.getClass();
        populateViewStructure_androidKtpopulate7.setValue(str2);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str2);
        int i5 = serializer + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
