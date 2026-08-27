package o;

/* JADX INFO: loaded from: classes4.dex */
final class migrateFeatureFlagStorageToJsonlambda10 extends migrateTriggersReeligibilityToJsonlambda4<migrateFeatureFlagStorageToJsonlambda0> {
    final /* synthetic */ migrateFeatureFlagImpressionMapToJsonlambda20 IconCompatParcelizer;

    public migrateFeatureFlagStorageToJsonlambda10(migrateFeatureFlagImpressionMapToJsonlambda20 migratefeatureflagimpressionmaptojsonlambda20) {
        this.IconCompatParcelizer = migratefeatureflagimpressionmaptojsonlambda20;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda4
    public final migrateFeatureFlagStorageToJsonlambda0 IconCompatParcelizer() {
        return migrateFeatureFlagImpressionMapToJsonlambda20.read(this.IconCompatParcelizer);
    }
}
