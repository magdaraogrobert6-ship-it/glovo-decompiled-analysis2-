package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaFbd47yHMz1BPgLvbFzIjlnCHtY extends writeToParcel {
    public final /* synthetic */ r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4 IconCompatParcelizer;
    public final ArrayDeque write;

    public final r8lambdaFUdl62ADhPGrEudDmNeD8r1en8 IconCompatParcelizer(File file) {
        int i = r8lambdaK_Oe0QcyT9VoAazq7dUXI8izk2o.RemoteActionCompatParcelizer[((r8lambdaLtU2JGjLk_lnexBelkBSfoEYe_Q) this.IconCompatParcelizer.read).ordinal()];
        if (i == 1) {
            return new r8lambdaJDhErzALZeDrdIfC8LPv0k_o0dw(file);
        }
        if (i == 2) {
            return new r8lambdaFxspVDSlkAUTyfV_sFej68KjlY(file);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    @Override // o.writeToParcel
    public final void read() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.write;
            r8lambdaH0T6quLH6fi2CuKlbOttZKYSBc r8lambdah0t6qulh6fi2cuklbottzkysbc = (r8lambdaH0T6quLH6fi2CuKlbOttZKYSBc) arrayDeque.peek();
            if (r8lambdah0t6qulh6fi2cuklbottzkysbc == null) {
                file = null;
                break;
            }
            File file2 = r8lambdah0t6qulh6fi2cuklbottzkysbc.read();
            if (file2 == null) {
                arrayDeque.pop();
            } else {
                if (file2.equals(r8lambdah0t6qulh6fi2cuklbottzkysbc.MediaDescriptionCompat) || !file2.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = file2;
                    break;
                }
                arrayDeque.push(IconCompatParcelizer(file2));
            }
        }
        if (file == null) {
            this.serializer = 2;
        } else {
            this.read = file;
            this.serializer = 1;
        }
    }

    public r8lambdaFbd47yHMz1BPgLvbFzIjlnCHtY(r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4 r8lambdadrmjdx1j9gjzqwvv4ql9c3nutf4) {
        this.IconCompatParcelizer = r8lambdadrmjdx1j9gjzqwvv4ql9c3nutf4;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.write = arrayDeque;
        File file = (File) r8lambdadrmjdx1j9gjzqwvv4ql9c3nutf4.serializer;
        if (file.isDirectory()) {
            arrayDeque.push(IconCompatParcelizer(file));
        } else if (file.isFile()) {
            arrayDeque.push(new r8lambdaHwO05NdmjcLLA4pGTycR0dyf3yA(file));
        } else {
            this.serializer = 2;
        }
    }
}
