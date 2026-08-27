package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaw4Ks5vKtotS_PmqJAq50O2BrsTk {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(r8lambdaw4Ks5vKtotS_PmqJAq50O2BrsTk.class.getName());
    public static final byte[] write = "-bin".getBytes(visitSelfAndChildrenYYKmhodefault.read);

    public static boolean write(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
