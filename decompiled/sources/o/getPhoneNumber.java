package o;

import bo.app.b8$$ExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes.dex */
public final class getPhoneNumber extends androidx.compose.runtime.ProvidableCompositionLocal {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int write = 0;

    public getPhoneNumber(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(new b8$$ExternalSyntheticLambda4(13));
        this.IconCompatParcelizer = new getNewUsername(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // o.getNewPassword
    public setContentCaptureSessionui IconCompatParcelizer() {
        return this.write != 1 ? super.IconCompatParcelizer() : (getNewUsername) this.IconCompatParcelizer;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public final hideTranslatedText write(Object obj) {
        if (this.write != 0) {
            return new hideTranslatedText(this, obj, obj == null, null, true);
        }
        return new hideTranslatedText(this, obj, obj == null, (AndroidContentCaptureManager) this.IconCompatParcelizer, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPhoneNumber(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        AndroidContentCaptureManager androidContentCaptureManager = AndroidContentCaptureManager.write;
        this.IconCompatParcelizer = androidContentCaptureManager;
    }
}
