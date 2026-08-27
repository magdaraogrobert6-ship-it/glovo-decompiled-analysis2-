package o;

import com.huawei.riemann.location.common.utils.Constant;
import java.io.IOException;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public enum defaultCardHandlinglambda0 implements RequestPushPermissionStep {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(Constant.ERROR_UNKNOWN),
    UNKNOWN(Constant.ERROR_UNKNOWN),
    UNKNOWN_ERROR(Constant.ERROR_UNKNOWN),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(Constant.ERROR_UNKNOWN),
    UNAUTHENTICATED(Constant.ERROR_ALGO_NULL_RESULT);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    defaultCardHandlinglambda0(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static defaultCardHandlinglambda0 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(java.util.Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static defaultCardHandlinglambda0 fromHttpStatusCode(int i) {
        for (defaultCardHandlinglambda0 defaultcardhandlinglambda0 : values()) {
            if (defaultcardhandlinglambda0.matches(i)) {
                return defaultcardhandlinglambda0;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer(apiName());
    }

    defaultCardHandlinglambda0(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }

    public static defaultCardHandlinglambda0 fromHttpStatusCode(Integer num, defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        defaultCardHandlinglambda0 defaultcardhandlinglambda0FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : defaultcardhandlinglambda0;
        return defaultcardhandlinglambda0FromHttpStatusCode != null ? defaultcardhandlinglambda0FromHttpStatusCode : defaultcardhandlinglambda0;
    }
}
