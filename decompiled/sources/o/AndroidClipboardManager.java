package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidClipboardManager {
    public static final Pattern write = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer, this.read});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AndroidClipboardManager)) {
            return false;
        }
        AndroidClipboardManager androidClipboardManager = (AndroidClipboardManager) obj;
        return this.read.equals(androidClipboardManager.read) && this.serializer.equals(androidClipboardManager.serializer);
    }

    public AndroidClipboardManager(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !write.matcher(strSubstring).matches()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.read = strSubstring;
        this.serializer = str;
        this.IconCompatParcelizer = af$$ExternalSyntheticOutline0.m(str, "!", str2);
    }
}
