package bo.app;

import java.io.OutputStream;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class n5 extends OutputStream {
    public static int IconCompatParcelizer;
    public static int write;

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    public static int IconCompatParcelizer() {
        int i = IconCompatParcelizer;
        int i2 = i % 5963225;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iNextInt = new Random().nextInt();
        write = iNextInt;
        return iNextInt;
    }
}
