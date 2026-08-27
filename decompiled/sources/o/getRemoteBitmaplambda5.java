package o;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes4.dex */
public final class getRemoteBitmaplambda5 implements WildcardType {
    public final Type IconCompatParcelizer;
    public final Type write;

    public getRemoteBitmaplambda5(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            DrawableTransformation.write();
            throw null;
        }
        if (typeArr.length != 1) {
            DrawableTransformation.write();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            getRemoteBitmaplambda4.IconCompatParcelizer(typeArr[0]);
            this.IconCompatParcelizer = null;
            this.write = getRemoteBitmaplambda4.serializer(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        getRemoteBitmaplambda4.IconCompatParcelizer(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            DrawableTransformation.write();
            throw null;
        }
        this.IconCompatParcelizer = getRemoteBitmaplambda4.serializer(typeArr2[0]);
        this.write = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && androidx.room.Room.serializer(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.write};
    }

    public final int hashCode() {
        Type type = this.IconCompatParcelizer;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.write.hashCode() + 31);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.IconCompatParcelizer;
        return type != null ? new Type[]{type} : getRemoteBitmaplambda4.write;
    }

    public final String toString() {
        Type type = this.IconCompatParcelizer;
        if (type != null) {
            return "? super " + getRemoteBitmaplambda4.read(type);
        }
        Type type2 = this.write;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + getRemoteBitmaplambda4.read(type2);
    }
}
