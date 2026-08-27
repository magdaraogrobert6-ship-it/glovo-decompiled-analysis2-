package io.sentry.protocol;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SpanId$$ExternalSyntheticLambda1;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg implements RequestPushPermissionStep {
    public static final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg serializer = new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg("00000000-0000-0000-0000-000000000000".replace("-", ""));
    public final io.sentry.util.MediaMetadataCompat IconCompatParcelizer;

    public final int hashCode() {
        return ((String) this.IconCompatParcelizer.IconCompatParcelizer()).hashCode();
    }

    public final String toString() {
        return (String) this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer(toString());
    }

    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
            throw null;
        }
        if (str2.length() == 36) {
            this.IconCompatParcelizer = new io.sentry.util.MediaMetadataCompat(new SpanId$$ExternalSyntheticLambda1(this, str2));
        } else {
            this.IconCompatParcelizer = new io.sentry.util.MediaMetadataCompat(new SpanId$$ExternalSyntheticLambda1(str2, 10));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.class != obj.getClass()) {
            return false;
        }
        return ((String) this.IconCompatParcelizer.IconCompatParcelizer()).equals(((r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) obj).IconCompatParcelizer.IconCompatParcelizer());
    }

    public r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        this.IconCompatParcelizer = new io.sentry.util.MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(27));
    }
}
