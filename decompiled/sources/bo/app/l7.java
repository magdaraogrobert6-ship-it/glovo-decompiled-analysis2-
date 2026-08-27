package bo.app;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class l7 {
    public final String a;
    public final long[] b;
    public boolean c;
    public p5 d;
    public final int e;
    public final File f;

    public final File a(int i) {
        return new File(this.f, this.a + "." + i + ".tmp");
    }

    public l7(String str, int i, File file) {
        this.a = str;
        this.e = i;
        this.f = file;
        this.b = new long[i];
    }
}
