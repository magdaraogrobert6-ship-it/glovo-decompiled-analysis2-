package o;

import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48 {
    private final String IconCompatParcelizer;
    private Long RatingCompat;
    private r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 RemoteActionCompatParcelizer;
    private final ArrayList read = new ArrayList();
    private boolean serializer;
    private long write;

    public final void serializer(boolean z, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        this.serializer = true;
        for (r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer serializerVar : this.read) {
            r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.read();
            serializerVar.IconCompatParcelizer.RemoteActionCompatParcelizer(new f$$ExternalSyntheticLambda1(z, serializerVar, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4));
        }
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final void serializer(r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer serializerVar) {
        this.read.remove(serializerVar);
    }

    public r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48(String str) {
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48.class != obj.getClass()) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((r8lambdaCE_GWPYEoJlQPHqzu_0IXLVzJ48) obj).IconCompatParcelizer);
    }

    public final void read(r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer serializerVar) {
        this.read.add(serializerVar);
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        return this.read;
    }
}
