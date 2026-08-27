package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEnvelopecp implements accessgetFivecp {
    public final /* synthetic */ int read;

    public /* synthetic */ accessgetEnvelopecp(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        Set setUnmodifiableSet;
        if (this.read == 0) {
            return new accessgetParentLayoutDirection(2, Executors.newSingleThreadExecutor());
        }
        getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = new getIntentArrayWithConfiguredBackStacklambda4(8);
        HashMap map = new HashMap();
        accessgetBrowsercp accessgetbrowsercp = accessgetBrowsercp.DEFAULT;
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            map.put(accessgetbrowsercp, new accessgetKanacp(30000L, CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, set));
            accessgetBrowsercp accessgetbrowsercp2 = accessgetBrowsercp.HIGHEST;
            if (set != null) {
                map.put(accessgetbrowsercp2, new accessgetKanacp(1000L, CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, set));
                accessgetBrowsercp accessgetbrowsercp3 = accessgetBrowsercp.VERY_LOW;
                if (set == null || (setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(accessgetInsertcp.DEVICE_IDLE)))) == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null flags");
                } else {
                    map.put(accessgetbrowsercp3, new accessgetKanacp(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, setUnmodifiableSet));
                    if (map.keySet().size() >= accessgetBrowsercp.values().length) {
                        new HashMap();
                        return new accessgetJcp(getintentarraywithconfiguredbackstacklambda4, map);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Not all priorities have been configured");
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null flags");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null flags");
        }
        return null;
    }
}
