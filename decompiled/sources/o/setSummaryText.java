package o;

import com.sentiance.sdk.SdkException;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
final class setSummaryText extends migrateTriggersReeligibilityToJsonlambda1<Object> {
    final /* synthetic */ Class read;
    final /* synthetic */ Object[] serializer;
    final /* synthetic */ Constructor write;

    public setSummaryText(Class cls, Constructor constructor, Object[] objArr) {
        this.write = constructor;
        this.serializer = objArr;
        this.read = cls;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final Object RemoteActionCompatParcelizer() {
        try {
            return this.write.newInstance(this.serializer);
        } catch (Exception e) {
            throw new SdkException("Exception while creating class ".concat(this.read.getSimpleName()), e);
        }
    }
}
