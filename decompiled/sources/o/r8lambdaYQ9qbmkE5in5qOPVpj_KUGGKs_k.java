package o;

import io.sentry.SpanId$$ExternalSyntheticLambda1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Objects;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k implements RequestPushPermissionStep {
    public static final r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k serializer = new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    public final io.sentry.util.MediaMetadataCompat write;

    public final int hashCode() {
        return ((String) this.write.IconCompatParcelizer()).hashCode();
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer((String) this.write.IconCompatParcelizer());
    }

    public final String toString() {
        return (String) this.write.IconCompatParcelizer();
    }

    public r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(String str) {
        Objects.requireNonNull(str, "value is required");
        this.write = new io.sentry.util.MediaMetadataCompat(new SpanId$$ExternalSyntheticLambda1(str, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k.class != obj.getClass()) {
            return false;
        }
        return ((String) this.write.IconCompatParcelizer()).equals(((r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) obj).write.IconCompatParcelizer());
    }

    public r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k() {
        this.write = new io.sentry.util.MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(13));
    }
}
