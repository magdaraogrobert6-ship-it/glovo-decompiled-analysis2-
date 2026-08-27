package o;

import android.text.TextUtils;
import io.sentry.android.core.SentryLogcatAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidClipboardManager_androidKt {
    public final String read;
    public final String serializer;
    public final long write;

    public static String RemoteActionCompatParcelizer(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public AndroidClipboardManager_androidKt(String str, String str2, long j) {
        this.read = str;
        this.serializer = str2;
        this.write = j;
    }

    public static AndroidClipboardManager_androidKt IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new AndroidClipboardManager_androidKt(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new AndroidClipboardManager_androidKt(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }
}
