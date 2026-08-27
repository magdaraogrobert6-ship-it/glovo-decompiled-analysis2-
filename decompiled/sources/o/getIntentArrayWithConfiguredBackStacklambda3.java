package o;

import com.deliveryhero.fwf_http.ConstantKt;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes4.dex */
public final class getIntentArrayWithConfiguredBackStacklambda3 {
    public final String IconCompatParcelizer;
    public final io.sentry.protocol.createFullyDrawnExecutor MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final byte[] read;
    public final SentryEnvelopeItem$$ExternalSyntheticLambda3 serializer;
    public final String write;

    public getIntentArrayWithConfiguredBackStacklambda3(io.sentry.protocol.createFullyDrawnExecutor createfullydrawnexecutor) {
        this.read = null;
        this.MediaMetadataCompat = createfullydrawnexecutor;
        this.serializer = null;
        this.write = "view-hierarchy.json";
        this.RemoteActionCompatParcelizer = ConstantKt.CONTENT_TYPE_JSON;
        this.IconCompatParcelizer = "event.view_hierarchy";
    }

    public getIntentArrayWithConfiguredBackStacklambda3(String str, String str2, String str3, byte[] bArr) {
        this.read = bArr;
        this.MediaMetadataCompat = null;
        this.serializer = null;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
    }

    public getIntentArrayWithConfiguredBackStacklambda3(SentryEnvelopeItem$$ExternalSyntheticLambda3 sentryEnvelopeItem$$ExternalSyntheticLambda3) {
        this.read = null;
        this.MediaMetadataCompat = null;
        this.serializer = sentryEnvelopeItem$$ExternalSyntheticLambda3;
        this.write = "screenshot.png";
        this.RemoteActionCompatParcelizer = "image/png";
        this.IconCompatParcelizer = "event.attachment";
    }
}
