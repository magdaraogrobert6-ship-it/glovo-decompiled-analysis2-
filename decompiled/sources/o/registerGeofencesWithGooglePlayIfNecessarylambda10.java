package o;

import android.util.Patterns;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public class registerGeofencesWithGooglePlayIfNecessarylambda10 {
    private String serializer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs write;

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public final String serializer() {
        String strReplaceAll;
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = this.write.write();
        if (optionalWrite.IconCompatParcelizer()) {
            String strWrite = optionalWrite.write().write();
            if (Patterns.WEB_URL.matcher(strWrite).matches()) {
                strReplaceAll = strWrite.replaceAll("users/.*", "");
            } else {
                strReplaceAll = null;
            }
        } else {
            strReplaceAll = null;
        }
        if (strReplaceAll != null) {
            return strReplaceAll;
        }
        String str = this.serializer;
        return str != null ? str : "https://api.sentiance.com/";
    }

    public registerGeofencesWithGooglePlayIfNecessarylambda10(r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs) {
        this.write = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    public final void serializer(String str) {
        this.serializer = str;
    }
}
