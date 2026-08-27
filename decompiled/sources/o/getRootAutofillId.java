package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getRootAutofillId implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;

    public /* synthetic */ getRootAutofillId(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.read;
        if (i == 0) {
            ((Float) obj).floatValue();
            return Float.valueOf(((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).floatValue());
        }
        if (i == 1) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createfromparcel;
        }
        if (i == 2) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createfromparcel;
        }
        androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
        Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        if (Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f = (Float) objInvoke;
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new androidx.compose.ui.semantics.ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, new ensureSubscribedToInAppMessageEventslambda0(1.0f), 0, 4, null));
        return createfromparcel;
    }
}
