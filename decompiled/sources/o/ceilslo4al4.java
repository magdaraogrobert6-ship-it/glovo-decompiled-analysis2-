package o;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ceilslo4al4 {
    public final ImageKt IconCompatParcelizer;
    public final ImageKt read;
    public final ImageKt serializer;

    public abstract boolean IconCompatParcelizer(int i);

    public abstract accessgetNegativeZerocp read();

    public final accessgetPositiveZerocp serializer() {
        String string = ((accessgetNegativeZerocp) this).MediaDescriptionCompat.readString();
        if (string == null) {
            return null;
        }
        try {
            return (accessgetPositiveZerocp) write(string).invoke(null, read());
        } catch (ClassNotFoundException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void serializer(int i);

    public final Method write(String str) throws NoSuchMethodException {
        ImageKt imageKt = this.read;
        Method method = (Method) imageKt.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ceilslo4al4.class.getClassLoader()).getDeclaredMethod("read", ceilslo4al4.class);
        imageKt.put(str, declaredMethod);
        return declaredMethod;
    }

    public ceilslo4al4(ImageKt imageKt, ImageKt imageKt2, ImageKt imageKt3) {
        this.read = imageKt;
        this.IconCompatParcelizer = imageKt2;
        this.serializer = imageKt3;
    }

    public final void write(int i, int i2) {
        serializer(i2);
        ((accessgetNegativeZerocp) this).MediaDescriptionCompat.writeInt(i);
    }

    public final void write(accessgetPositiveZerocp accessgetpositivezerocp) {
        if (accessgetpositivezerocp == null) {
            ((accessgetNegativeZerocp) this).MediaDescriptionCompat.writeString(null);
            return;
        }
        try {
            ((accessgetNegativeZerocp) this).MediaDescriptionCompat.writeString(RemoteActionCompatParcelizer(accessgetpositivezerocp.getClass()).getName());
            accessgetNegativeZerocp accessgetnegativezerocp = read();
            try {
                write(accessgetpositivezerocp.getClass()).invoke(null, accessgetpositivezerocp, accessgetnegativezerocp);
                Parcel parcel = accessgetnegativezerocp.MediaDescriptionCompat;
                int i = accessgetnegativezerocp.write;
                if (i >= 0) {
                    int i2 = accessgetnegativezerocp.MediaMetadataCompat.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(accessgetpositivezerocp.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final Class RemoteActionCompatParcelizer(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        ImageKt imageKt = this.serializer;
        Class cls2 = (Class) imageKt.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(m1$$ExternalSyntheticOutline0.m(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        imageKt.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method write(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        ImageKt imageKt = this.IconCompatParcelizer;
        Method method = (Method) imageKt.get(name);
        if (method != null) {
            return method;
        }
        Class clsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsRemoteActionCompatParcelizer.getDeclaredMethod("write", cls, ceilslo4al4.class);
        imageKt.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Parcelable read(Parcelable parcelable, int i) {
        if (!IconCompatParcelizer(i)) {
            return parcelable;
        }
        return ((accessgetNegativeZerocp) this).MediaDescriptionCompat.readParcelable(accessgetNegativeZerocp.class.getClassLoader());
    }

    public final int serializer(int i, int i2) {
        return !IconCompatParcelizer(i2) ? i : ((accessgetNegativeZerocp) this).MediaDescriptionCompat.readInt();
    }
}
