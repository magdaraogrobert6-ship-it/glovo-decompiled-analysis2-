package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class blurF8QBwvs implements Map.Entry, displayInAppMessagelambda122 {
    public final /* synthetic */ blur1fqSgwdefault IconCompatParcelizer;
    public final Object serializer;
    public Object write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.serializer;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        blur1fqSgwdefault blur1fqsgwdefault = this.IconCompatParcelizer;
        setAlpha setalpha = blur1fqsgwdefault.serializer;
        if (setalpha.read().read != blur1fqsgwdefault.IconCompatParcelizer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        Object obj2 = this.write;
        setalpha.put(this.serializer, obj);
        this.write = obj;
        return obj2;
    }

    public blurF8QBwvs(blur1fqSgwdefault blur1fqsgwdefault) {
        this.IconCompatParcelizer = blur1fqsgwdefault;
        Map.Entry entry = blur1fqsgwdefault.write;
        entry.getClass();
        this.serializer = entry.getKey();
        Map.Entry entry2 = blur1fqsgwdefault.write;
        entry2.getClass();
        this.write = entry2.getValue();
    }
}
