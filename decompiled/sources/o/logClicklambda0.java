package o;

import java.io.IOException;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public enum logClicklambda0 implements RequestPushPermissionStep {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    logClicklambda0(int i) {
        this.severityNumber = i;
    }

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer(name().toLowerCase(java.util.Locale.ROOT));
    }
}
