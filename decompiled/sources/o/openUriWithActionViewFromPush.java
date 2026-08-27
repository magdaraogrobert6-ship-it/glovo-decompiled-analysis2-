package o;

import com.huawei.hms.android.SystemUtils;
import fwfd.com.fwfsdk.constant.FWFConstants;

/* JADX INFO: loaded from: classes4.dex */
public enum openUriWithActionViewFromPush {
    All("__all__"),
    Default("default"),
    Error(FWFConstants.EXPLANATION_TYPE_ERROR),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown(SystemUtils.UNKNOWN);

    private final String category;

    public String getCategory() {
        return this.category;
    }

    openUriWithActionViewFromPush(String str) {
        this.category = str;
    }
}
