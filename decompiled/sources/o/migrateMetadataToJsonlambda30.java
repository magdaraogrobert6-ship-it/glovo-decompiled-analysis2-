package o;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class migrateMetadataToJsonlambda30 extends r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4<Short> {
    public migrateMetadataToJsonlambda30() {
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Object IconCompatParcelizer(int i) {
        return new short[i];
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Class serializer() {
        return Short.class;
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final void write(Object obj, int i, Object obj2) {
        ((short[]) obj)[i] = ((Short) obj2).shortValue();
    }

    public migrateMetadataToJsonlambda30(List<Short> list) {
        super(list);
    }

    public migrateMetadataToJsonlambda30(List<Short> list, int i) {
        super(list, i);
    }

    public migrateMetadataToJsonlambda30(int i) {
        super(i);
    }

    @Override // o.r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4
    public final Short read(Object obj, int i) {
        return Short.valueOf(((short[]) obj)[i]);
    }
}
