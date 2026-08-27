package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class getTargets implements ParameterizedType {
    public final Type IconCompatParcelizer;
    public final Type read;
    public final Type[] serializer;

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.read;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.IconCompatParcelizer;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.serializer.clone();
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.serializer);
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        Type type = this.read;
        return (iHashCode ^ iHashCode2) ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.serializer;
        int length = typeArr.length;
        Type type = this.IconCompatParcelizer;
        if (length == 0) {
            return getKind.RemoteActionCompatParcelizer(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(getKind.RemoteActionCompatParcelizer(type));
        sb.append("<");
        sb.append(getKind.RemoteActionCompatParcelizer(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(getKind.RemoteActionCompatParcelizer(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }

    public getTargets(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                DrawableTransformation.write();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            getKind.IconCompatParcelizer(type3);
        }
        this.read = type;
        this.IconCompatParcelizer = type2;
        this.serializer = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && getKind.serializer(this, (ParameterizedType) obj);
    }
}
