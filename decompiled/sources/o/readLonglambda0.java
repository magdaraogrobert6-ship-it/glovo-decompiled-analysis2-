package o;

import android.content.Context;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "DrivingInsightsTileRefreshTask")
public class readLonglambda0 extends createOrGetDataStorelambda00 implements deleteDataStoreFiles {
    private final DataStoreProvidere RemoteActionCompatParcelizer;
    private int serializer = 0;
    private final DataStoreProvidergaa write;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        synchronized (this) {
            this.write.serializer(null);
            this.RemoteActionCompatParcelizer.serializer(null);
            this.write.serializer();
            this.RemoteActionCompatParcelizer.serializer();
        }
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("DrivingInsightsTileRefreshTask");
        publishexceptionlambda0.read(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(0);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return this.write.write() && this.RemoteActionCompatParcelizer.write();
    }

    public readLonglambda0(DataStoreProvidergaa dataStoreProvidergaa, DataStoreProvidere dataStoreProvidere) {
        this.write = dataStoreProvidergaa;
        this.RemoteActionCompatParcelizer = dataStoreProvidere;
        dataStoreProvidergaa.serializer(this);
        dataStoreProvidere.serializer(this);
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        synchronized (this) {
            int i = this.serializer + (this.write.RemoteActionCompatParcelizer() ? 1 : 0);
            this.serializer = i;
            this.serializer = i + (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() ? 1 : 0);
        }
        return false;
    }

    @Override // o.deleteDataStoreFiles
    public final void RemoteActionCompatParcelizer(boolean z) {
        synchronized (this) {
            int i = this.serializer - 1;
            this.serializer = i;
            if (i == 0) {
                serializer(false);
            }
        }
    }
}
