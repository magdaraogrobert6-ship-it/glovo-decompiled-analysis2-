package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class getPrerequisiteFeatures implements GenericArrayType {
    public final Type write;

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        return getKind.RemoteActionCompatParcelizer(this.write) + "[]";
    }

    public getPrerequisiteFeatures(Type type) {
        this.write = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && getKind.serializer(this, (GenericArrayType) obj);
    }
}
