package o;

import com.google.common.io.BaseEncoding$Base64Encoding;
import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class requestPushPermissionPrompt {
    public static final Charset serializer = Charset.forName("US-ASCII");
    public static final BaseEncoding$Base64Encoding IconCompatParcelizer = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.serializer;

    public static constructObjectQuietlylambda0 RemoteActionCompatParcelizer(String str, WebContentUtils webContentUtils) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
        return new constructObjectQuietlylambda0(str, z, webContentUtils);
    }
}
