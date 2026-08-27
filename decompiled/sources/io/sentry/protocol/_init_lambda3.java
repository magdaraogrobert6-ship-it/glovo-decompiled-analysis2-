package io.sentry.protocol;

import java.io.IOException;
import java.util.Locale;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public enum _init_lambda3 implements RequestPushPermissionStep {
    AUTO,
    ALL,
    ALL_BUT_FIRST,
    NONE;

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer(toString().toLowerCase(Locale.ROOT));
    }
}
