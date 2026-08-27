package bo.app;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class p5 {
    public final l7 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ r5 d;

    public p5(r5 r5Var, l7 l7Var) {
        this.d = r5Var;
        this.a = l7Var;
        this.b = l7Var.c ? null : new boolean[r5Var.g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        o5 o5Var;
        r5 r5Var = this.d;
        if (r5Var.g <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(this.d.g, "Expected index 0 to be greater than 0 and less than the maximum value count of ");
            return null;
        }
        synchronized (r5Var) {
            l7 l7Var = this.a;
            if (l7Var.d != this) {
                throw new IllegalStateException();
            }
            if (!l7Var.c) {
                this.b[0] = true;
            }
            File fileA = l7Var.a(0);
            try {
                fileOutputStream = new FileOutputStream(fileA);
            } catch (FileNotFoundException unused) {
                this.d.a.mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                } catch (FileNotFoundException unused2) {
                    return r5.q;
                }
            }
            o5Var = new o5(this, fileOutputStream);
        }
        return o5Var;
    }
}
