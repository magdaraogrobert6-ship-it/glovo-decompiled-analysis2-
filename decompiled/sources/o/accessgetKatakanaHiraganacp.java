package o;

import coil3.ImageLoader$Builder;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetKatakanaHiraganacp implements accessgetFivecp {
    public final accessgetF5cp IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return new ImageLoader$Builder((Executor) this.write.write(), (SQLiteEventStore) this.serializer.write(), (androidx.emoji2.text.EmojiProcessor) this.IconCompatParcelizer.write(), (SQLiteEventStore) this.read.write());
    }

    public accessgetKatakanaHiraganacp(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, accessgetF5cp accessgetf5cp, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = accessgetf5cp;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }
}
