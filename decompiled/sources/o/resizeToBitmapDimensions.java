package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class resizeToBitmapDimensions implements ParameterizedType {
    public final Type[] IconCompatParcelizer;
    public final Type RemoteActionCompatParcelizer;
    public final Type serializer;

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.serializer;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.IconCompatParcelizer.clone();
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Set set = getRemoteBitmaplambda4.read;
        Type type = this.serializer;
        return (iHashCode ^ iHashCode2) ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(getRemoteBitmaplambda4.read(this.RemoteActionCompatParcelizer));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(getRemoteBitmaplambda4.read(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(getRemoteBitmaplambda4.read(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }

    public resizeToBitmapDimensions(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || androidx.room.Room.write(type) != enclosingClass) {
                    getOffVariationName.read("unexpected owner type for ", type2, ": ", type);
                    throw null;
                }
            } else if (enclosingClass != null) {
                DrawableTransformation.IconCompatParcelizer("unexpected owner type for ", type2, ": null");
                throw null;
            }
        }
        this.serializer = type != null ? getRemoteBitmaplambda4.serializer(type) : null;
        this.RemoteActionCompatParcelizer = getRemoteBitmaplambda4.serializer(type2);
        this.IconCompatParcelizer = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.IconCompatParcelizer;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            getRemoteBitmaplambda4.IconCompatParcelizer(this.IconCompatParcelizer[i]);
            Type[] typeArr3 = this.IconCompatParcelizer;
            typeArr3[i] = getRemoteBitmaplambda4.serializer(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && androidx.room.Room.serializer(this, (ParameterizedType) obj);
    }
}
