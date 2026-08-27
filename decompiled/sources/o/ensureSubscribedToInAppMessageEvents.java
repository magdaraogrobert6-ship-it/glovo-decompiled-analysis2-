package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ensureSubscribedToInAppMessageEvents {
    public static final Charset IconCompatParcelizer;
    public static volatile Charset MediaMetadataCompat;
    public static volatile Charset RemoteActionCompatParcelizer;
    public static final Charset read;
    public static final Charset serializer;
    public static final Charset write;

    static {
        Charset charsetForName = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        charsetForName.getClass();
        write = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        read = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        serializer = charsetForName3;
        Charset.forName("US-ASCII").getClass();
        Charset charsetForName4 = Charset.forName("ISO-8859-1");
        charsetForName4.getClass();
        IconCompatParcelizer = charsetForName4;
    }
}
