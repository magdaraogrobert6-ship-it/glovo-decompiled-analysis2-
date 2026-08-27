package o;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public abstract class displayInAppMessagelambda2 extends displayInAppMessagelambda9 {
    public abstract Random IconCompatParcelizer();

    @Override // o.displayInAppMessagelambda9
    public final int IconCompatParcelizer(int i) {
        return (IconCompatParcelizer().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // o.displayInAppMessagelambda9
    public final long read() {
        return IconCompatParcelizer().nextLong();
    }

    @Override // o.displayInAppMessagelambda9
    public final int serializer() {
        return IconCompatParcelizer().nextInt();
    }

    @Override // o.displayInAppMessagelambda9
    public final double write() {
        return IconCompatParcelizer().nextDouble();
    }

    @Override // o.displayInAppMessagelambda9
    public final int RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer().nextInt(i);
    }
}
