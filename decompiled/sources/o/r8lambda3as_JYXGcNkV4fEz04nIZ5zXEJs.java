package o;

import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda3as_JYXGcNkV4fEz04nIZ5zXEJs implements migrateTriggersReeligibilityToJsonlambda0 {
    public static final IconCompatParcelizer serializer = new IconCompatParcelizer(null);
    private final SdkInitConfigRequestReason write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reason", this.write.toJsonValue());
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, "6.27.1");
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public r8lambda3as_JYXGcNkV4fEz04nIZ5zXEJs(SdkInitConfigRequestReason sdkInitConfigRequestReason, DefaultConstructorMarker defaultConstructorMarker) {
        this.write = sdkInitConfigRequestReason;
    }
}
