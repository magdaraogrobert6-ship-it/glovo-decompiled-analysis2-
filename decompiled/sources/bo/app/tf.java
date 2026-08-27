package bo.app;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class tf extends ByteArrayOutputStream {
    public final /* synthetic */ uf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(uf ufVar, int i) {
        super(i);
        this.a = ufVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
        } catch (UnsupportedEncodingException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }
}
