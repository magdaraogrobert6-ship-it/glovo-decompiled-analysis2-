package o;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLcp implements accessgetFivecp {
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaDescriptionCompat;
    public final accessgetF5cp MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return new access500((Context) this.serializer.write(), (accessgetF9cp) this.read.write(), (SQLiteEventStore) this.IconCompatParcelizer.write(), (androidx.emoji2.text.EmojiProcessor) this.MediaMetadataCompat.write(), (Executor) this.write.write(), (SQLiteEventStore) this.MediaDescriptionCompat.write(), new getIntentArrayWithConfiguredBackStacklambda4(8), new accessgetWcp(9), (SQLiteEventStore) this.RemoteActionCompatParcelizer.write());
    }

    public accessgetLcp(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, accessgetF5cp accessgetf5cp, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6) {
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.MediaMetadataCompat = accessgetf5cp;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
        this.MediaDescriptionCompat = r8lambdaktwlyipskq3tfa9ey3gatonixfq5;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq6;
    }
}
