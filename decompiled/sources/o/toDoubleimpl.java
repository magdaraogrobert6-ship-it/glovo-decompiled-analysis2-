package o;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class toDoubleimpl {
    public static final String[] write = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
    public final File RemoteActionCompatParcelizer;

    public toDoubleimpl(Context context, File file) {
        try {
            this.RemoteActionCompatParcelizer = new File(getLowestValueslo4al4.IconCompatParcelizer(file));
            if (IconCompatParcelizer(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
        }
    }

    public final boolean IconCompatParcelizer(Context context) {
        String strIconCompatParcelizer = getLowestValueslo4al4.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        String strIconCompatParcelizer2 = getLowestValueslo4al4.IconCompatParcelizer(context.getCacheDir());
        String strIconCompatParcelizer3 = getLowestValueslo4al4.IconCompatParcelizer(context.getDataDir());
        if ((strIconCompatParcelizer.startsWith(strIconCompatParcelizer2) || strIconCompatParcelizer.startsWith(strIconCompatParcelizer3)) && !strIconCompatParcelizer.equals(strIconCompatParcelizer2) && !strIconCompatParcelizer.equals(strIconCompatParcelizer3)) {
            for (int i = 0; i < 5; i++) {
                if (!strIconCompatParcelizer.startsWith(strIconCompatParcelizer3 + write[i])) {
                }
            }
            return true;
        }
        return false;
    }
}
