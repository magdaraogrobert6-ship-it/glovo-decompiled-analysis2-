package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DataStoreUtilsa implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ brazeLogTag serializer;

    public /* synthetic */ DataStoreUtilsa(brazeLogTag brazelogtag, int i) {
        this.read = i;
        this.serializer = brazelogtag;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        brazeLogTag brazelogtag = this.serializer;
        if (i != 0) {
            LocalDate localDate = (LocalDate) obj;
            localDate.getClass();
            brazelogtag.invoke(localDate);
            return createfromparcel;
        }
        installForLifecycle installforlifecycle = (installForLifecycle) obj;
        installforlifecycle.getClass();
        TncContentKt$$ExternalSyntheticLambda1 tncContentKt$$ExternalSyntheticLambda1 = new TncContentKt$$ExternalSyntheticLambda1(installforlifecycle, 23, brazelogtag);
        if (installforlifecycle.write == null) {
            installforlifecycle.write = tncContentKt$$ExternalSyntheticLambda1;
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("bind { ... } is already defined. Only one bind { ... } is allowed.");
        return null;
    }
}
