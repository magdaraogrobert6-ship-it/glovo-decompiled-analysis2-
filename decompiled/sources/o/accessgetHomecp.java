package o;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetHomecp implements accessgetFivecp {
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final accessgetF5cp RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return new accessgetHelpcp((Executor) this.read.write(), (accessgetF9cp) this.IconCompatParcelizer.write(), (androidx.emoji2.text.EmojiProcessor) this.RemoteActionCompatParcelizer.write(), (SQLiteEventStore) this.write.write(), (SQLiteEventStore) this.serializer.write());
    }

    public accessgetHomecp(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, accessgetF5cp accessgetf5cp, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = accessgetf5cp;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }
}
