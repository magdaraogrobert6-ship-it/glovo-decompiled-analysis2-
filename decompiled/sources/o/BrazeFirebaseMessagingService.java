package o;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeFirebaseMessagingService {
    private final int read;
    private final long serializer;
    private final int write;

    public final long RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int serializer() {
        return this.read;
    }

    public final int write() {
        return this.write;
    }

    public BrazeFirebaseMessagingService(int i, int i2, long j) {
        this.read = i;
        this.serializer = j;
        this.write = i2;
    }

    public final int hashCode() {
        int i = this.read;
        int i2 = this.write;
        long j = this.serializer;
        return (((i * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BrazeFirebaseMessagingService brazeFirebaseMessagingService = (BrazeFirebaseMessagingService) obj;
            if (this.read == brazeFirebaseMessagingService.read && this.write == brazeFirebaseMessagingService.write && this.serializer == brazeFirebaseMessagingService.serializer) {
                return true;
            }
        }
        return false;
    }
}
