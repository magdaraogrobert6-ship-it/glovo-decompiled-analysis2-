package o;

import com.roadrunner.nafath.data.NafathTimerDataStore;
import com.roadrunner.twofa.domain.GetRemainingTwoFaTimerIfRunning;

/* JADX INFO: loaded from: classes3.dex */
public final class requestLocationInitializationlambda0 implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final elambda0 serializer;

    public /* synthetic */ requestLocationInitializationlambda0(elambda0 elambda0Var, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = elambda0Var;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        elambda0 elambda0Var = this.serializer;
        if (i3 != 0) {
            return new GetRemainingTwoFaTimerIfRunning((NafathTimerDataStore) elambda0Var.write(), 1);
        }
        GetRemainingTwoFaTimerIfRunning getRemainingTwoFaTimerIfRunning = new GetRemainingTwoFaTimerIfRunning((NafathTimerDataStore) elambda0Var.write(), 0);
        int i4 = read + 71;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return getRemainingTwoFaTimerIfRunning;
    }
}
