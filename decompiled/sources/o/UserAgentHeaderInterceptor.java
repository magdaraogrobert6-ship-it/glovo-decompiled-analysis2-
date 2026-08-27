package o;

import java.io.EOFException;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class UserAgentHeaderInterceptor {
    public static /* synthetic */ void serializer(int i, int i2) throws EOFException {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    public static /* synthetic */ void write(Object obj, String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    public static /* synthetic */ void write(Object obj) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(obj.toString());
    }

    public static /* synthetic */ void IconCompatParcelizer(Object obj, String str) throws ASN1Exception {
        throw new ASN1Exception(str + obj);
    }
}
