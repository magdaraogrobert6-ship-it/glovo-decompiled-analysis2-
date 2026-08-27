package o;

import com.sentiance.sdk.usercontext.api.UserContext;
import com.sentiance.sdk.usercontext.api.UserContextUpdateCriteria;
import com.sentiance.sdk.usercontext.api.UserContextUpdateListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class migrateFeatureFlagImpressionMapToJson {
    private final UserContextUpdateListener RemoteActionCompatParcelizer;
    private final boolean read;

    public final UserContextUpdateListener IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.read;
    }

    public migrateFeatureFlagImpressionMapToJson(boolean z, UserContextUpdateListener userContextUpdateListener) {
        userContextUpdateListener.getClass();
        this.read = z;
        this.RemoteActionCompatParcelizer = userContextUpdateListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof migrateFeatureFlagImpressionMapToJson)) {
            return false;
        }
        migrateFeatureFlagImpressionMapToJson migratefeatureflagimpressionmaptojson = (migrateFeatureFlagImpressionMapToJson) obj;
        if (this.read != migratefeatureflagimpressionmaptojson.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, migratefeatureflagimpressionmaptojson.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final void serializer(List<? extends UserContextUpdateCriteria> list, r8lambdaRsG9IrIe_Nt_zbFpq8Jag00_oMQ r8lambdarsg9irie_nt_zbfpq8jag00_omq) {
        UserContext userContextIconCompatParcelizer = this.read ? r8lambdarsg9irie_nt_zbfpq8jag00_omq.IconCompatParcelizer() : r8lambdarsg9irie_nt_zbfpq8jag00_omq.RemoteActionCompatParcelizer();
        userContextIconCompatParcelizer.getClass();
        this.RemoteActionCompatParcelizer.onUserContextUpdated(list, userContextIconCompatParcelizer);
    }

    public final String toString() {
        return "OpinionatedUserContextListener(requiresProvisionalResults=" + this.read + ", wrappedListener=" + this.RemoteActionCompatParcelizer + ')';
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
        return this.RemoteActionCompatParcelizer.hashCode() + (r0 * 31);
    }
}
