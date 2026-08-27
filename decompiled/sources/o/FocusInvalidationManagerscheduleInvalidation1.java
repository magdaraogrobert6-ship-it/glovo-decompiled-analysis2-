package o;

import android.net.Uri;
import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FocusInvalidationManagerscheduleInvalidation1 {
    public final String RemoteActionCompatParcelizer;
    public final HashMap read = new HashMap();

    public final Uri read(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.read.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (clearFocusdefault.IconCompatParcelizer(canonicalPath).startsWith(clearFocusdefault.IconCompatParcelizer(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(this.RemoteActionCompatParcelizer).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            Gson$$ExternalSyntheticBUOutline0.m(file, "Failed to resolve canonical path for ");
            return null;
        }
    }

    public FocusInvalidationManagerscheduleInvalidation1(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final void RemoteActionCompatParcelizer(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Name must not be empty");
            return;
        }
        try {
            this.read.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    public final File serializer(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Unable to find path from root: "));
            return null;
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.read.get(strDecode);
        if (file == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Unable to find configured root for "));
            return null;
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (clearFocusdefault.IconCompatParcelizer(canonicalFile.getPath()).startsWith(clearFocusdefault.IconCompatParcelizer(file.getPath()).concat("/"))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            Gson$$ExternalSyntheticBUOutline0.m(file2, "Failed to resolve canonical path for ");
            return null;
        }
    }
}
