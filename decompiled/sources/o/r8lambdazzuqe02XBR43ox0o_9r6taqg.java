package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.BitSet;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdazzuqe02XBR43ox0o_9r6taqg {
    public static final BitSet serializer;
    public final Object IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final byte[] read;

    public abstract byte[] RemoteActionCompatParcelizer(Object obj);

    public abstract Object write(byte[] bArr);

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public r8lambdazzuqe02XBR43ox0o_9r6taqg(String str, Object obj, boolean z) {
        String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        TextStreamsKt.serializer(lowerCase, "name");
        TextStreamsKt.read("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.read.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char cCharAt = lowerCase.charAt(i);
            if ((!z || cCharAt != ':' || i != 0) && !serializer.get(cCharAt)) {
                Object[] objArr = {"Invalid character '%s' in key name '%s'", new Object[]{Character.valueOf(cCharAt), lowerCase}};
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer((String) ModuleDSLKt.serializer(MaybeObserveOn.write(), 1556036116, MaybeObserveOn.write(), -1556036116, MaybeObserveOn.write(), objArr, MaybeObserveOn.write()));
                throw null;
            }
        }
        this.RemoteActionCompatParcelizer = lowerCase;
        this.read = lowerCase.getBytes(visitSelfAndChildrenYYKmhodefault.read);
        this.IconCompatParcelizer = obj;
    }

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        serializer = bitSet;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Key{name='"), this.RemoteActionCompatParcelizer, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((r8lambdazzuqe02XBR43ox0o_9r6taqg) obj).RemoteActionCompatParcelizer);
    }
}
