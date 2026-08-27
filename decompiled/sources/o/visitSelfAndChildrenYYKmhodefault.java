package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class visitSelfAndChildrenYYKmhodefault {
    public static final Charset read = Charset.forName("US-ASCII");
    public static final Charset write;

    static {
        Charset.forName("ISO-8859-1");
        write = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
