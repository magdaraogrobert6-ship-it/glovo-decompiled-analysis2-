package o;

import com.roadrunner.realtime.domain.GetAppStateImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DataMigrationInitializerCompanionrunMigrations2 {
    public final GetAppStateImpl IconCompatParcelizer;
    public final setTransactionSuccessful read;
    public final CorruptionException write;

    public DataMigrationInitializerCompanionrunMigrations2(CorruptionException corruptionException, setTransactionSuccessful settransactionsuccessful, GetAppStateImpl getAppStateImpl) {
        this.write = corruptionException;
        this.read = settransactionsuccessful;
        this.IconCompatParcelizer = getAppStateImpl;
    }
}
