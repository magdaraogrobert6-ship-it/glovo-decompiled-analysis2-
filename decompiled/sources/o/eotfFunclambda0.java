package o;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface eotfFunclambda0 {
    public static final Charset read = Charset.forName(com.adjust.sdk.Constants.ENCODING);

    boolean equals(Object obj);

    int hashCode();

    void serializer(MessageDigest messageDigest);
}
