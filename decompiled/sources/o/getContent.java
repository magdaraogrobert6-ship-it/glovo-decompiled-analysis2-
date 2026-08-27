package o;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class getContent extends setSlotReusePolicy {
    public static final long IconCompatParcelizer;
    public static final long MediaBrowserCompatMediaItem;
    public static final Unsafe RemoteActionCompatParcelizer;
    public static final long read;
    public static final long serializer;
    public static final long write;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: o.getOperations
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* synthetic */ Object run() throws IllegalAccessException {
                        Unsafe unsafe2 = getContent.RemoteActionCompatParcelizer;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                write = unsafe.objectFieldOffset(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.class.getDeclaredField("MediaBrowserCompatMediaItem"));
                read = unsafe.objectFieldOffset(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.class.getDeclaredField("MediaDescriptionCompat"));
                IconCompatParcelizer = unsafe.objectFieldOffset(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.class.getDeclaredField("RatingCompat"));
                serializer = unsafe.objectFieldOffset(getSlotId.class.getDeclaredField("write"));
                MediaBrowserCompatMediaItem = unsafe.objectFieldOffset(getSlotId.class.getDeclaredField("read"));
                RemoteActionCompatParcelizer = unsafe;
            } catch (NoSuchFieldException e) {
                DrawableTransformation.read((Throwable) e);
            }
        } catch (PrivilegedActionException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // o.setSlotReusePolicy
    public final LayoutNodeSubcompositionsStateNodeState IconCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeState;
        LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeState2 = LayoutNodeSubcompositionsStateNodeState.serializer;
        do {
            layoutNodeSubcompositionsStateNodeState = forcerecomposechildren.MediaDescriptionCompat;
            if (layoutNodeSubcompositionsStateNodeState2 == layoutNodeSubcompositionsStateNodeState) {
                break;
            }
        } while (!getComposition.IconCompatParcelizer(RemoteActionCompatParcelizer, forcerecomposechildren, read, layoutNodeSubcompositionsStateNodeState));
        return layoutNodeSubcompositionsStateNodeState;
    }

    @Override // o.setSlotReusePolicy
    public final getSlotId RemoteActionCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        getSlotId getslotid;
        getSlotId getslotid2 = getSlotId.RemoteActionCompatParcelizer;
        do {
            getslotid = forcerecomposechildren.MediaBrowserCompatMediaItem;
            if (getslotid2 == getslotid) {
                break;
            }
        } while (!RemoteActionCompatParcelizer(forcerecomposechildren, getslotid, getslotid2));
        return getslotid;
    }

    @Override // o.setSlotReusePolicy
    public final boolean RemoteActionCompatParcelizer(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, getSlotId getslotid, getSlotId getslotid2) {
        return getComposedWithReusableContentHost.serializer(RemoteActionCompatParcelizer, layoutNodeSubcompositionsStateApproachMeasureScopeImpl, write, getslotid, getslotid2);
    }

    @Override // o.setSlotReusePolicy
    public final void serializer(getSlotId getslotid, Thread thread) {
        RemoteActionCompatParcelizer.putObject(getslotid, serializer, thread);
    }

    @Override // o.setSlotReusePolicy
    public final void serializer(getSlotId getslotid, getSlotId getslotid2) {
        RemoteActionCompatParcelizer.putObject(getslotid, MediaBrowserCompatMediaItem, getslotid2);
    }

    @Override // o.setSlotReusePolicy
    public final boolean write(LayoutNodeSubcompositionsStateApproachMeasureScopeImpl layoutNodeSubcompositionsStateApproachMeasureScopeImpl, Object obj, Object obj2) {
        return getForceRecompose.serializer(RemoteActionCompatParcelizer, layoutNodeSubcompositionsStateApproachMeasureScopeImpl, IconCompatParcelizer, obj, obj2);
    }
}
