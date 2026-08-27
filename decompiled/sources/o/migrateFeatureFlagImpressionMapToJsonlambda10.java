package o;

/* JADX INFO: loaded from: classes4.dex */
final class migrateFeatureFlagImpressionMapToJsonlambda10 implements Runnable {
    final /* synthetic */ long IconCompatParcelizer;
    final /* synthetic */ migrateFeatureFlagImpressionMapToJsonlambda20 RemoteActionCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.IconCompatParcelizer;
        migrateFeatureFlagImpressionMapToJsonlambda20 migratefeatureflagimpressionmaptojsonlambda20 = this.RemoteActionCompatParcelizer;
        migratefeatureflagimpressionmaptojsonlambda20.read(j);
        migratefeatureflagimpressionmaptojsonlambda20.IconCompatParcelizer.IconCompatParcelizer();
    }

    public migrateFeatureFlagImpressionMapToJsonlambda10(migrateFeatureFlagImpressionMapToJsonlambda20 migratefeatureflagimpressionmaptojsonlambda20, long j) {
        this.RemoteActionCompatParcelizer = migratefeatureflagimpressionmaptojsonlambda20;
        this.IconCompatParcelizer = j;
    }
}
