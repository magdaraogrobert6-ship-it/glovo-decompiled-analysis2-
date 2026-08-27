package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLineInstancecp extends accesssetPageInstancecp {
    public String IconCompatParcelizer;
    public byte read;
    public AccessibilityIteratorsParagraphTextSegmentIterator serializer;
    public long write;

    public final accessgetLineInstancecp RemoteActionCompatParcelizer(AccessibilityIteratorsParagraphTextSegmentIterator accessibilityIteratorsParagraphTextSegmentIterator) {
        this.serializer = accessibilityIteratorsParagraphTextSegmentIterator;
        return this;
    }

    public final accessgetLineInstancecp serializer(String str) {
        this.IconCompatParcelizer = str;
        return this;
    }

    public final accessgetLineInstancecp RemoteActionCompatParcelizer(long j) {
        this.write = j;
        this.read = (byte) (this.read | 1);
        return this;
    }

    public final getLineEdgeIndex write() {
        if (this.read == 1) {
            return new getLineEdgeIndex(this.IconCompatParcelizer, this.write, this.serializer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: tokenExpirationTimestamp");
        return null;
    }
}
