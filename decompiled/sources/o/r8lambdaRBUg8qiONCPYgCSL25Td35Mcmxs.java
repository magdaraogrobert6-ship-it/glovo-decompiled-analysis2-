package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs {
    public Byte IconCompatParcelizer;
    public Byte serializer;

    public setSessionHandlingBlocklistlambda0 IconCompatParcelizer() {
        int i = this.IconCompatParcelizer != null ? 1 : 0;
        if (this.serializer != null) {
            i++;
        }
        if (i == 1) {
            return new setSessionHandlingBlocklistlambda0(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Invalid union; ", " field(s) were set"));
        return null;
    }
}
