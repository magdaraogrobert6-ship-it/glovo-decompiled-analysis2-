package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetcachedSerializerdelegatecp implements Enumeration {
    public provideRequest RemoteActionCompatParcelizer;
    public tryRefreshToken read;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.RemoteActionCompatParcelizer != null;
    }

    public final provideRequest IconCompatParcelizer() {
        try {
            return this.read.serializer();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        provideRequest providerequest = this.RemoteActionCompatParcelizer;
        if (providerequest != null) {
            this.RemoteActionCompatParcelizer = IconCompatParcelizer();
            return providerequest;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }
}
