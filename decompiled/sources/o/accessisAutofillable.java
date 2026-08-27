package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessisAutofillable implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ notifyViewVisibilityChanged IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ accessisAutofillable(notifyViewVisibilityChanged notifyviewvisibilitychanged, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = notifyviewvisibilitychanged;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        notifyViewVisibilityChanged notifyviewvisibilitychanged = this.IconCompatParcelizer;
        return i != 0 ? androidx.compose.ui.unit.Dp.m3671boximpl(androidx.compose.ui.unit.DpKt.m3716lerpMdfbLM(androidx.compose.material3.internal.TextFieldImplKt.write, androidx.compose.material3.internal.TextFieldImplKt.RemoteActionCompatParcelizer, notifyviewvisibilitychanged.IconCompatParcelizer())) : androidx.compose.ui.unit.Dp.m3671boximpl(androidx.compose.ui.unit.DpKt.m3716lerpMdfbLM(androidx.compose.material3.internal.TextFieldImplKt.write, androidx.compose.material3.internal.TextFieldImplKt.RemoteActionCompatParcelizer, notifyviewvisibilitychanged.IconCompatParcelizer()));
    }
}
