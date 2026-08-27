package o;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetFourcp implements accessgetFivecp {
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public /* synthetic */ accessgetFourcp(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, int i) {
        this.read = i;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        if (i == 0) {
            return new accessgetF9cp((Context) ((accessgetGuidecp) r8lambdaktwlyipskq3tfa9ey3gatonixfq).serializer, (androidx.emoji2.text.EmojiProcessor) ((accessgetGuidecp) this.serializer).write());
        }
        return new SQLiteEventStore(new getIntentArrayWithConfiguredBackStacklambda4(8), new accessgetWcp(9), accessgetLastChannelcp.RemoteActionCompatParcelizer, (accessgetMcp) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), this.serializer);
    }
}
