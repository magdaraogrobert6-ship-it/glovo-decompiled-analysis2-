package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class isBetterCandidate_I7lrPNgminorAxisDistance extends PlatformFocusOwner {
    private static Map<Object, isBetterCandidate_I7lrPNgminorAxisDistance> write = new ConcurrentHashMap();
    protected int read;
    protected getUnspecifiedPackedFloatsannotations serializer;

    public static Object write(Method method, isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance, Object... objArr) {
        try {
            return method.invoke(isbettercandidate_i7lrpngminoraxisdistance, objArr);
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public abstract Object IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance isbettercandidate_i7lrpngweighteddistance);

    public static void IconCompatParcelizer(Class cls, isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance) {
        write.put(cls, isbettercandidate_i7lrpngminoraxisdistance);
    }

    public static isBetterCandidate_I7lrPNgminorAxisDistance RemoteActionCompatParcelizer(Class cls) {
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance = write.get(cls);
        if (isbettercandidate_i7lrpngminoraxisdistance == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                isbettercandidate_i7lrpngminoraxisdistance = write.get(cls);
            } catch (ClassNotFoundException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (isbettercandidate_i7lrpngminoraxisdistance != null) {
            return isbettercandidate_i7lrpngminoraxisdistance;
        }
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance2 = (isBetterCandidate_I7lrPNgminorAxisDistance) getUint64Low32annotations.write(cls);
        isbettercandidate_i7lrpngminoraxisdistance2.getClass();
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance3 = (isBetterCandidate_I7lrPNgminorAxisDistance) isbettercandidate_i7lrpngminoraxisdistance2.IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.GET_DEFAULT_INSTANCE);
        if (isbettercandidate_i7lrpngminoraxisdistance3 != null) {
            write.put(cls, isbettercandidate_i7lrpngminoraxisdistance3);
            return isbettercandidate_i7lrpngminoraxisdistance3;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        byte bByteValue = ((Byte) IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        CornerRadiusdefault cornerRadiusdefault = CornerRadiusdefault.write;
        cornerRadiusdefault.getClass();
        boolean z = cornerRadiusdefault.RemoteActionCompatParcelizer(getClass()).read((Object) this);
        IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.SET_MEMOIZED_IS_INITIALIZED);
        return z;
    }

    @Override // o.PlatformFocusOwner
    public final void read(RequestChildFocusKt requestChildFocusKt) {
        CornerRadiusdefault cornerRadiusdefault = CornerRadiusdefault.write;
        cornerRadiusdefault.getClass();
        toStringAsFixed tostringasfixedRemoteActionCompatParcelizer = cornerRadiusdefault.RemoteActionCompatParcelizer(getClass());
        copyOHQCggkdefault copyohqcggkdefault = requestChildFocusKt.MediaMetadataCompat;
        if (copyohqcggkdefault == null) {
            copyohqcggkdefault = new copyOHQCggkdefault(requestChildFocusKt);
        }
        tostringasfixedRemoteActionCompatParcelizer.IconCompatParcelizer(this, copyohqcggkdefault);
    }

    public isBetterCandidate_I7lrPNgminorAxisDistance() {
        this.RemoteActionCompatParcelizer = 0;
        this.serializer = getUnspecifiedPackedFloatsannotations.RemoteActionCompatParcelizer;
        this.read = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((isBetterCandidate_I7lrPNgminorAxisDistance) IconCompatParcelizer(isBetterCandidate_I7lrPNgweightedDistance.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        CornerRadiusdefault cornerRadiusdefault = CornerRadiusdefault.write;
        cornerRadiusdefault.getClass();
        return cornerRadiusdefault.RemoteActionCompatParcelizer(getClass()).read(this, (isBetterCandidate_I7lrPNgminorAxisDistance) obj);
    }

    public final String toString() {
        return isCircularimpl.write(this, super.toString());
    }

    @Override // o.PlatformFocusOwner
    public final int MediaSessionCompatToken() {
        if (this.read == -1) {
            CornerRadiusdefault cornerRadiusdefault = CornerRadiusdefault.write;
            cornerRadiusdefault.getClass();
            this.read = cornerRadiusdefault.RemoteActionCompatParcelizer(getClass()).RemoteActionCompatParcelizer(this);
        }
        return this.read;
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i;
        }
        CornerRadiusdefault cornerRadiusdefault = CornerRadiusdefault.write;
        cornerRadiusdefault.getClass();
        int i2 = cornerRadiusdefault.RemoteActionCompatParcelizer(getClass()).read(this);
        this.RemoteActionCompatParcelizer = i2;
        return i2;
    }
}
