package o;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getFontFeatureSettings {
    public static final Charset IconCompatParcelizer;
    public static final Charset RemoteActionCompatParcelizer = Charset.defaultCharset();

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        IconCompatParcelizer = charsetForName;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset = IconCompatParcelizer;
        if ((charset == null || !charset.equals(RemoteActionCompatParcelizer)) && charsetForName2 != null) {
            charsetForName2.equals(RemoteActionCompatParcelizer);
        }
    }
}
