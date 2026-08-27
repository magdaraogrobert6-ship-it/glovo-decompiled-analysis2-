package o;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityIteratorsLineTextSegmentIteratorCompanion extends accesssetLineInstancecp {
    public String IconCompatParcelizer;
    public accessgetPageInstancecp RemoteActionCompatParcelizer;
    public getLineEdgeIndex read;
    public String serializer;
    public String write;

    public final AccessibilityIteratorsLineTextSegmentIteratorCompanion RemoteActionCompatParcelizer(String str) {
        this.IconCompatParcelizer = str;
        return this;
    }

    public final AccessibilityIteratorsLineTextSegmentIteratorCompanion read(String str) {
        this.write = str;
        return this;
    }

    public final AccessibilityIteratorsLineTextSegmentIteratorCompanion serializer(String str) {
        this.serializer = str;
        return this;
    }

    public final AccessibilityIteratorsLineTextSegmentIteratorCompanion serializer(accessgetPageInstancecp accessgetpageinstancecp) {
        this.RemoteActionCompatParcelizer = accessgetpageinstancecp;
        return this;
    }

    public final AccessibilityIteratorsLineTextSegmentIteratorCompanion write(getLineEdgeIndex getlineedgeindex) {
        this.read = getlineedgeindex;
        return this;
    }

    public final AccessibilityIteratorsPageTextSegmentIterator read() {
        return new AccessibilityIteratorsPageTextSegmentIterator(this.IconCompatParcelizer, this.write, this.serializer, this.read, this.RemoteActionCompatParcelizer);
    }
}
