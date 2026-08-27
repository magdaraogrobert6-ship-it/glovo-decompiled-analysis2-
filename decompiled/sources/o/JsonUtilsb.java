package o;

import io.sentry.SentryClient;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonUtilsb extends parseJsonObjectIntoBundlelambda0 {
    public final setCustomUserAttributeArray IconCompatParcelizer;
    public final parseJsonObjectIntoBundlelambda0 RemoteActionCompatParcelizer;

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final JsonUtilsa read(SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        setCustomUserAttributeArray setcustomuserattributearray = this.IconCompatParcelizer;
        setcustomuserattributearray.getClass();
        return new UserJavascriptInterfaceBaseExternalSyntheticLambda6(setcustomuserattributearray, this.RemoteActionCompatParcelizer.read(sentryClient, mergejsonobjectslambda10));
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final String write() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public JsonUtilsb(parseJsonObjectIntoBundlelambda0 parsejsonobjectintobundlelambda0, setCustomUserAttributeArray setcustomuserattributearray) {
        this.RemoteActionCompatParcelizer = parsejsonobjectintobundlelambda0;
        TextStreamsKt.serializer(setcustomuserattributearray, "interceptor");
        this.IconCompatParcelizer = setcustomuserattributearray;
    }
}
