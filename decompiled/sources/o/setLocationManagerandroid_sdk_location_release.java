package o;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class setLocationManagerandroid_sdk_location_release extends setShouldOptInWhenPushAuthorizedandroid_sdk_base_release {
    final /* synthetic */ setCustomUserAttributedefault serializer;

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final void read(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) throws IOException {
        r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new migratePushDeliveryEventsToJson(new GZIPOutputStream(r8lambdamiqxxozlmuuicx7gg348aw6pqe.PlaybackStateCompat(), 8192)));
        setCustomUserAttributedefault.serializer.read(r8lambdaajvt3gxgjaliojuptnhztnfupq, this.serializer);
        migrateMetadataToJson.write(r8lambdaajvt3gxgjaliojuptnhztnfupq);
    }

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final isHtmlInAppMessageHtmlLinkTargetEnabled serializer() {
        try {
            return isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public setLocationManagerandroid_sdk_location_release(setCustomUserAttributedefault setcustomuserattributedefault) {
        this.serializer = setcustomuserattributedefault;
    }
}
