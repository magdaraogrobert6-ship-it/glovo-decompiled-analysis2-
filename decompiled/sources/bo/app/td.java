package bo.app;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class td {
    public final String a;
    public final Uri b;
    public final URL c;
    public final boolean d;

    public final String toString() {
        return this.a;
    }

    public td(Uri uri) {
        uri.getClass();
        this.b = uri;
        String string = uri.toString();
        string.getClass();
        this.a = string;
        this.c = new URL(string);
        this.d = false;
    }

    public td(String str, boolean z) {
        str.getClass();
        this.b = Uri.parse(str);
        this.a = str;
        this.c = new URL(str);
        this.d = z;
    }
}
