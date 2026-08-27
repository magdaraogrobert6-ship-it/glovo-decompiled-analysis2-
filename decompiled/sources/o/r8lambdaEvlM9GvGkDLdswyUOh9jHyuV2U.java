package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U {
    public static final Pattern RemoteActionCompatParcelizer;
    public static final Pattern write;
    public final setOnReadyForComposition IconCompatParcelizer;
    public final HashSet MediaBrowserCompatMediaItem = new HashSet();
    public final Executor read;
    public final setOnReadyForComposition serializer;

    static {
        Charset.forName(com.adjust.sdk.Constants.ENCODING);
        write = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        RemoteActionCompatParcelizer = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public static HashSet IconCompatParcelizer(setOnReadyForComposition setonreadyforcomposition) {
        HashSet hashSet = new HashSet();
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = setonreadyforcomposition.serializer();
        if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer != null) {
            Iterator<String> itKeys = setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public final void write(setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui, String str) {
        if (setprimarydirectionalmotionaxisoverrider2eplt8ui == null) {
            return;
        }
        synchronized (this.MediaBrowserCompatMediaItem) {
            Iterator it = this.MediaBrowserCompatMediaItem.iterator();
            while (it.hasNext()) {
                this.read.execute(new accessgetAlpha8cp((requestFocusViewFocusFix) it.next(), str, setprimarydirectionalmotionaxisoverrider2eplt8ui, 9));
            }
        }
    }

    public r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U(Executor executor, setOnReadyForComposition setonreadyforcomposition, setOnReadyForComposition setonreadyforcomposition2) {
        this.read = executor;
        this.serializer = setonreadyforcomposition;
        this.IconCompatParcelizer = setonreadyforcomposition2;
    }

    public static void read(String str, String str2) {
        SentryLogcatAdapter.IconCompatParcelizer("FirebaseRemoteConfig", r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public static String read(setOnReadyForComposition setonreadyforcomposition, String str) {
        setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = setonreadyforcomposition.serializer();
        if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer == null) {
            return null;
        }
        try {
            return setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
