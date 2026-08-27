package o;

import dagger.Lazy;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getOptionalString extends convertJSONObjectToMap implements Lazy {
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return this.serializer;
    }

    public getOptionalString(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
    }
}
