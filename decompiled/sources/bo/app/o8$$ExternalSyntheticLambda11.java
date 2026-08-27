package bo.app;

import java.io.IOException;
import o.InAppMessageSlideupView;
import o.createFromParcel;
import o.createHorizontalAnimation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o8$$ExternalSyntheticLambda11 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ o8$$ExternalSyntheticLambda11(o8 o8Var, long j, int i) {
        this.f$0 = o8Var;
        this.f$1 = j;
        this.f$2 = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        int i2 = this.f$2;
        Object obj = this.f$0;
        if (i == 0) {
            return o8.a((o8) obj, j, i2);
        }
        createHorizontalAnimation createhorizontalanimation = (createHorizontalAnimation) obj;
        try {
            createhorizontalanimation.writer.serializer(i2, j);
        } catch (IOException e) {
            InAppMessageSlideupView inAppMessageSlideupView = InAppMessageSlideupView.PROTOCOL_ERROR;
            createhorizontalanimation.RemoteActionCompatParcelizer(inAppMessageSlideupView, inAppMessageSlideupView, e);
        }
        return createFromParcel.INSTANCE;
    }

    public /* synthetic */ o8$$ExternalSyntheticLambda11(createHorizontalAnimation createhorizontalanimation, int i, long j) {
        this.f$0 = createhorizontalanimation;
        this.f$2 = i;
        this.f$1 = j;
    }
}
