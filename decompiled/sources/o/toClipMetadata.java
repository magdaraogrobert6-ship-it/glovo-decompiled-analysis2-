package o;

import android.content.SharedPreferences;
import android.text.TextUtils;
import coil3.ComponentRegistry$Builder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class toClipMetadata {
    public static java.lang.ref.WeakReference write;
    public final ScheduledThreadPoolExecutor RemoteActionCompatParcelizer;
    public ComponentRegistry$Builder read;

    public final AndroidClipboardManager write() {
        String str;
        AndroidClipboardManager androidClipboardManager;
        synchronized (this) {
            ComponentRegistry$Builder componentRegistry$Builder = this.read;
            synchronized (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer)) {
                str = (String) ((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer).peek();
            }
            Pattern pattern = AndroidClipboardManager.write;
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("!", -1);
                if (strArrSplit.length == 2) {
                    androidClipboardManager = new AndroidClipboardManager(strArrSplit[0], strArrSplit[1]);
                }
            }
            androidClipboardManager = null;
        }
        return androidClipboardManager;
    }

    public toClipMetadata(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.RemoteActionCompatParcelizer = scheduledThreadPoolExecutor;
    }
}
