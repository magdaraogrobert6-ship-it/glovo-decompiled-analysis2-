package o;

import com.deliveryhero.fwf_http.ConstantKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambda6MZWPRxuxsRm623E9MVHkpHRJ4 extends setShouldOptInWhenPushAuthorizedandroid_sdk_base_release {
    private final migrateTriggersReeligibilityToJsonlambda0 write;

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final isHtmlInAppMessageHtmlLinkTargetEnabled serializer() {
        try {
            return isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer(ConstantKt.CONTENT_TYPE_JSON);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public r8lambda6MZWPRxuxsRm623E9MVHkpHRJ4(migrateTriggersReeligibilityToJsonlambda0 migratetriggersreeligibilitytojsonlambda0) {
        this.write = migratetriggersreeligibilitytojsonlambda0;
    }

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final void read(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) throws IOException {
        Charset charsetDefaultCharset;
        migrateTriggersReeligibilityToJsonlambda0 migratetriggersreeligibilitytojsonlambda0 = this.write;
        try {
            charsetDefaultCharset = Charset.forName("utf-8");
        } catch (UnsupportedCharsetException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        try {
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.IconCompatParcelizer(migratetriggersreeligibilitytojsonlambda0.write(), charsetDefaultCharset);
        } catch (JSONException e) {
            throw new IOException("Error serializing data: " + migratetriggersreeligibilitytojsonlambda0, e);
        }
    }
}
