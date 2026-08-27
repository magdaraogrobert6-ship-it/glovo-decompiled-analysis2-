package o;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import kotlin.ranges.RangesKt;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class getEndD9Ej5fM extends RangesKt {
    public static final Unsafe IconCompatParcelizer;
    public static final long RatingCompat;
    public static final long RemoteActionCompatParcelizer;
    public static final long read;
    public static final long serializer;
    public static final long write;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new roundToTouchBoundsExpansionTW6G1oQ());
        }
        try {
            write = unsafe.objectFieldOffset(component2D9Ej5fM.class.getDeclaredField("MediaDescriptionCompat"));
            RemoteActionCompatParcelizer = unsafe.objectFieldOffset(component2D9Ej5fM.class.getDeclaredField("write"));
            serializer = unsafe.objectFieldOffset(component2D9Ej5fM.class.getDeclaredField("MediaMetadataCompat"));
            RatingCompat = unsafe.objectFieldOffset(Absolutea9UjIt4default.class.getDeclaredField("write"));
            read = unsafe.objectFieldOffset(Absolutea9UjIt4default.class.getDeclaredField("read"));
            IconCompatParcelizer = unsafe;
        } catch (NoSuchFieldException e2) {
            DrawableTransformation.read((Throwable) e2);
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    @Override // kotlin.ranges.RangesKt
    public final Absolutea9UjIt4default IconCompatParcelizer(component2D9Ej5fM component2d9ej5fm) {
        Absolutea9UjIt4default absolutea9UjIt4default;
        Absolutea9UjIt4default absolutea9UjIt4default2 = Absolutea9UjIt4default.serializer;
        do {
            absolutea9UjIt4default = component2d9ej5fm.MediaDescriptionCompat;
            if (absolutea9UjIt4default2 == absolutea9UjIt4default) {
                break;
            }
        } while (!read(component2d9ej5fm, absolutea9UjIt4default, absolutea9UjIt4default2));
        return absolutea9UjIt4default;
    }

    @Override // kotlin.ranges.RangesKt
    public final copylDy3nrA read(component2D9Ej5fM component2d9ej5fm) {
        copylDy3nrA copyldy3nra;
        copylDy3nrA copyldy3nra2 = copylDy3nrA.RemoteActionCompatParcelizer;
        do {
            copyldy3nra = component2d9ej5fm.write;
            if (copyldy3nra2 == copyldy3nra) {
                break;
            }
        } while (!serializer(component2d9ej5fm, copyldy3nra, copyldy3nra2));
        return copyldy3nra;
    }

    @Override // kotlin.ranges.RangesKt
    public final void read(Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        IconCompatParcelizer.putObject(absolutea9UjIt4default, read, absolutea9UjIt4default2);
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean read(component2D9Ej5fM component2d9ej5fm, Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        return isLayoutDirectionAware.read(IconCompatParcelizer, component2d9ej5fm, write, absolutea9UjIt4default, absolutea9UjIt4default2);
    }

    @Override // kotlin.ranges.RangesKt
    public final void serializer(Absolutea9UjIt4default absolutea9UjIt4default, Thread thread) {
        IconCompatParcelizer.putObject(absolutea9UjIt4default, RatingCompat, thread);
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean serializer(component2D9Ej5fM component2d9ej5fm, Object obj, Object obj2) {
        return DrawModifierNode.write(IconCompatParcelizer, component2d9ej5fm, serializer, obj, obj2);
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean serializer(component2D9Ej5fM component2d9ej5fm, copylDy3nrA copyldy3nra, copylDy3nrA copyldy3nra2) {
        return getTopD9Ej5fM.write(IconCompatParcelizer, component2d9ej5fm, RemoteActionCompatParcelizer, copyldy3nra, copyldy3nra2);
    }
}
