package o;

import android.content.Context;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TimelineStoreCleanupTask")
public class getRemoteImageUrl extends createOrGetDataStorelambda00 {
    private final setHeaderTextColor RemoteActionCompatParcelizer;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("TimelineStoreCleanupTask");
        publishexceptionlambda0.read(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(0);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        return false;
    }

    public getRemoteImageUrl(setHeaderTextColor setheadertextcolor) {
        this.RemoteActionCompatParcelizer = setheadertextcolor;
    }
}
