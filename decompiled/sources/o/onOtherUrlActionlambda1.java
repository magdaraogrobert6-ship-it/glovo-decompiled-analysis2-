package o;

import java.io.IOException;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public enum onOtherUrlActionlambda1 implements RequestPushPermissionStep {
    SESSION,
    BUFFER;

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer(name().toLowerCase(java.util.Locale.ROOT));
    }
}
