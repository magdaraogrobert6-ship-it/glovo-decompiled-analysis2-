package o;

import android.content.Context;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "GisTileRefreshTask")
public class getEventPublisherandroid_sdk_base_release extends createOrGetDataStorelambda00 implements deleteDataStoreFiles {
    private final isWipeableDataStoreFileName IconCompatParcelizer;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        synchronized (this) {
            this.IconCompatParcelizer.serializer(null);
            this.IconCompatParcelizer.serializer();
        }
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("GisTileRefreshTask");
        publishexceptionlambda0.read(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return this.IconCompatParcelizer.write();
    }

    public getEventPublisherandroid_sdk_base_release(isWipeableDataStoreFileName iswipeabledatastorefilename) {
        this.IconCompatParcelizer = iswipeabledatastorefilename;
        iswipeabledatastorefilename.serializer(this);
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        synchronized (this) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        return false;
    }

    @Override // o.deleteDataStoreFiles
    public final void RemoteActionCompatParcelizer(boolean z) {
        serializer(false);
    }
}
