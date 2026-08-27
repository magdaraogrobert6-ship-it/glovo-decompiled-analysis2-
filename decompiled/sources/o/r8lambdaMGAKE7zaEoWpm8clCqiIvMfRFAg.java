package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaMGAKE7zaEoWpm8clCqiIvMfRFAg implements Iterator, displayInAppMessagelambda121 {
    public String IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaN7z0Ea2bnxePLVipqp_gDhWww write;

    public r8lambdaMGAKE7zaEoWpm8clCqiIvMfRFAg(r8lambdaN7z0Ea2bnxePLVipqp_gDhWww r8lambdan7z0ea2bnxeplvipqp_gdhwww) {
        this.write = r8lambdan7z0ea2bnxeplvipqp_gdhwww;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.IconCompatParcelizer == null && !this.RemoteActionCompatParcelizer) {
            String line = ((BufferedReader) this.write.read).readLine();
            this.IconCompatParcelizer = line;
            if (line == null) {
                this.RemoteActionCompatParcelizer = true;
            }
        }
        return this.IconCompatParcelizer != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        String str = this.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        str.getClass();
        return str;
    }
}
