package o;

import java.io.IOException;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public enum r8lambdaB2EfoRxiN347_5B93fxdQV0g implements RequestPushPermissionStep {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    public String getItemType() {
        return this.itemType;
    }

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        ((OkHttpCall$1) isargstring).IconCompatParcelizer(this.itemType);
    }

    r8lambdaB2EfoRxiN347_5B93fxdQV0g(String str) {
        this.itemType = str;
    }

    public static r8lambdaB2EfoRxiN347_5B93fxdQV0g resolve(Object obj) {
        if (obj instanceof BannerViewExternalSyntheticLambda2) {
            return ((io.sentry.protocol.MediaSessionCompatResultReceiverWrapper) ((BannerViewExternalSyntheticLambda2) obj).read.write(io.sentry.protocol.MediaSessionCompatResultReceiverWrapper.class, "feedback")) == null ? Event : Feedback;
        }
        if (obj instanceof io.sentry.protocol.accessensureViewModelStore) {
            return Transaction;
        }
        if (obj instanceof logHtmlClicklambda0) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.RemoteActionCompatParcelizer ? ClientReport : Attachment;
    }

    public static r8lambdaB2EfoRxiN347_5B93fxdQV0g valueOfLabel(String str) {
        for (r8lambdaB2EfoRxiN347_5B93fxdQV0g r8lambdab2eforxin347_5b93fxdqv0g : values()) {
            if (r8lambdab2eforxin347_5b93fxdqv0g.itemType.equals(str)) {
                return r8lambdab2eforxin347_5b93fxdqv0g;
            }
        }
        return Unknown;
    }
}
