package o;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetKeyDowncp {
    public static final Pattern IconCompatParcelizer;
    public static final Pattern read;
    public static final Uri write = Uri.parse("content://com.google.android.gsf.gservices");

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        IconCompatParcelizer = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        read = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
