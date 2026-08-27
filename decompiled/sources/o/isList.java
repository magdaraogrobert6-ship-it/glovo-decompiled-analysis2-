package o;

/* JADX INFO: loaded from: classes.dex */
public final class isList implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ androidx.compose.material3.TooltipStateImpl IconCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ((androidx.compose.ui.input.key.KeyEvent) obj).m1890unboximpl();
        if (!this.IconCompatParcelizer.read()) {
            this.read.setValue(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }

    public isList(androidx.compose.material3.TooltipStateImpl tooltipStateImpl, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        this.IconCompatParcelizer = tooltipStateImpl;
        this.read = populateViewStructure_androidKtpopulate7;
    }
}
