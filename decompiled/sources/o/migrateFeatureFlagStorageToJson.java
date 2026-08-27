package o;

import com.sentiance.sdk.usercontext.api.RequestUserContextError;
import com.sentiance.sdk.usercontext.api.UserContext;

/* JADX INFO: loaded from: classes3.dex */
public final class migrateFeatureFlagStorageToJson {
    private final boolean read;
    private final BrazeNotificationUtilsExternalSyntheticLambda14<UserContext, RequestUserContextError> write;

    public final boolean serializer() {
        return this.read;
    }

    public final BrazeNotificationUtilsExternalSyntheticLambda14<UserContext, RequestUserContextError> write() {
        return this.write;
    }

    public migrateFeatureFlagStorageToJson(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14, boolean z) {
        brazeNotificationUtilsExternalSyntheticLambda14.getClass();
        this.read = z;
        this.write = brazeNotificationUtilsExternalSyntheticLambda14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof migrateFeatureFlagStorageToJson)) {
            return false;
        }
        migrateFeatureFlagStorageToJson migratefeatureflagstoragetojson = (migrateFeatureFlagStorageToJson) obj;
        if (this.read != migratefeatureflagstoragetojson.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, migratefeatureflagstoragetojson.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "UserContextRequest(includeProvisionalResults=" + this.read + ", completer=" + this.write + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.read;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.write.hashCode() + (r0 * 31);
    }
}
