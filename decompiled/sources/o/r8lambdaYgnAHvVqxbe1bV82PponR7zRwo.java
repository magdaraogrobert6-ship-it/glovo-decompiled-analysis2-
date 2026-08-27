package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaYgnAHvVqxbe1bV82PponR7zRwo extends OutputStream {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambdaYgnAHvVqxbe1bV82PponR7zRwo(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = r8lambdamiqxxozlmuuicx7gg348aw6pqe;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.IconCompatParcelizer;
        r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ((r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) r8lambdamiqxxozlmuuicx7gg348aw6pqe).write((int) ((byte) i));
            return;
        }
        readResourceValuelambda2 readresourcevaluelambda2 = (readResourceValuelambda2) r8lambdamiqxxozlmuuicx7gg348aw6pqe;
        if (readresourcevaluelambda2.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
        } else {
            readresourcevaluelambda2.read.write((int) ((byte) i));
            readresourcevaluelambda2.serializer();
        }
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return ((readResourceValuelambda2) r8lambdamiqxxozlmuuicx7gg348aw6pqe) + ".outputStream()";
        }
        return ((r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) r8lambdamiqxxozlmuuicx7gg348aw6pqe) + ".outputStream()";
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.IconCompatParcelizer != 0) {
            ((readResourceValuelambda2) this.RemoteActionCompatParcelizer).close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.IconCompatParcelizer != 0) {
            readResourceValuelambda2 readresourcevaluelambda2 = (readResourceValuelambda2) this.RemoteActionCompatParcelizer;
            if (readresourcevaluelambda2.RemoteActionCompatParcelizer) {
                return;
            }
            readresourcevaluelambda2.flush();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.IconCompatParcelizer;
        r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            readResourceValuelambda2 readresourcevaluelambda2 = (readResourceValuelambda2) r8lambdamiqxxozlmuuicx7gg348aw6pqe;
            if (!readresourcevaluelambda2.RemoteActionCompatParcelizer) {
                readresourcevaluelambda2.read.write(bArr, i, i2);
                readresourcevaluelambda2.serializer();
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
                return;
            }
        }
        ((r8lambdaBEyrNr8p6809BwlBoRO_sTaNs) r8lambdamiqxxozlmuuicx7gg348aw6pqe).write(bArr, i, i2);
    }
}
