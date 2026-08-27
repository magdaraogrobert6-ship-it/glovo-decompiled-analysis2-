package o;

/* JADX INFO: loaded from: classes3.dex */
final class migrateFeatureFlagStorageToJsonlambda0 {
    private final String RemoteActionCompatParcelizer;
    private final short read;

    public migrateFeatureFlagStorageToJsonlambda0(String str, short s) {
        this.read = s;
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.read * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || migrateFeatureFlagStorageToJsonlambda0.class != obj.getClass()) {
            return false;
        }
        migrateFeatureFlagStorageToJsonlambda0 migratefeatureflagstoragetojsonlambda0 = (migrateFeatureFlagStorageToJsonlambda0) obj;
        if (this.read != migratefeatureflagstoragetojsonlambda0.read) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(migratefeatureflagstoragetojsonlambda0.RemoteActionCompatParcelizer);
    }
}
