package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class getRemoteBitmaplambda3 implements GenericArrayType {
    public final Type write;

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        return getRemoteBitmaplambda4.read(this.write) + "[]";
    }

    public getRemoteBitmaplambda3(Type type) {
        this.write = getRemoteBitmaplambda4.serializer(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && androidx.room.Room.serializer(this, (GenericArrayType) obj);
    }
}
