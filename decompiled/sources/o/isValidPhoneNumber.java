package o;

import java.util.Random;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidPhoneNumber {
    public final Random read = new Random();
    public final long RemoteActionCompatParcelizer = 120000000000L;
    public final double write = 1.6d;
    public final double IconCompatParcelizer = 0.2d;
    public long serializer = 1000000000;

    public final long write() {
        long j = this.serializer;
        double d = j;
        this.serializer = Math.min((long) (this.write * d), this.RemoteActionCompatParcelizer);
        double d2 = this.IconCompatParcelizer;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        TextStreamsKt.write(d4 >= d3);
        return j + ((long) ((this.read.nextDouble() * (d4 - d3)) + d3));
    }
}
