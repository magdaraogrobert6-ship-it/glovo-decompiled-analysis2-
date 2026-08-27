package o;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class migrateTriggersStorageToJsonlambda20 extends createOrGetDataStorelambda00 {
    private final migrateTriggersStorageToJsonlambda21 IconCompatParcelizer;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("VenueMapUpdateTask");
        publishexceptionlambda0.read(43200000L);
        publishexceptionlambda0.write(true);
        publishexceptionlambda0.RemoteActionCompatParcelizer(1);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    public migrateTriggersStorageToJsonlambda20(migrateTriggersStorageToJsonlambda21 migratetriggersstoragetojsonlambda21) {
        this.IconCompatParcelizer = migratetriggersstoragetojsonlambda21;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        this.IconCompatParcelizer.write(this, false);
        return false;
    }
}
