package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientExtensionKtcreate1 extends getChangeVersionControl {
    @Override // o.getChangeVersionControl
    public final List serializer(Executor executor) {
        return Arrays.asList(new FwFClientExtensionKtgetVariationevalResult1(), new accessgetActionp(executor));
    }

    @Override // o.getChangeVersionControl
    public final List write() {
        return Collections.singletonList(new removeCustomerProfileAttributes(1));
    }

    public FwFClientExtensionKtcreate1(int i) {
        super(i);
    }
}
