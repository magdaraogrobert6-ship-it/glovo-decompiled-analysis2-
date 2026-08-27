package o;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM {
    public static int read;
    public static int serializer;
    private final boolean IconCompatParcelizer;
    private final r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k RemoteActionCompatParcelizer;

    public r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k, boolean z) {
        this.RemoteActionCompatParcelizer = r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        this.IconCompatParcelizer = z;
    }

    public static int read() {
        int i = serializer;
        int i2 = i % 8370805;
        serializer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iNextInt = new Random().nextInt();
        read = iNextInt;
        return iNextInt;
    }
}
