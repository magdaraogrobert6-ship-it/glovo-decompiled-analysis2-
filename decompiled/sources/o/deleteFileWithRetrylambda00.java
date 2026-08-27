package o;

import android.content.Context;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "VenueTileRefreshTask")
public class deleteFileWithRetrylambda00 extends createOrGetDataStorelambda00 implements deleteDataStoreFiles {
    private final deleteFileWithRetrylambda1 serializer;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        synchronized (this) {
            this.serializer.serializer(null);
            this.serializer.serializer();
        }
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("VenueTileRefreshTask");
        publishexceptionlambda0.read(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return this.serializer.write();
    }

    public deleteFileWithRetrylambda00(deleteFileWithRetrylambda1 deletefilewithretrylambda1) {
        this.serializer = deletefilewithretrylambda1;
        deletefilewithretrylambda1.serializer(this);
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        synchronized (this) {
            this.serializer.RemoteActionCompatParcelizer();
        }
        return false;
    }

    @Override // o.deleteDataStoreFiles
    public final void RemoteActionCompatParcelizer(boolean z) {
        serializer(false);
    }
}
