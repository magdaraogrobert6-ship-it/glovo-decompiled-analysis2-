package o;

import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LayoutNodeSubcompositionsStateApproachMeasureScopeImpl implements Future {
    public static final setSlotReusePolicy IconCompatParcelizer;
    public static final boolean RemoteActionCompatParcelizer;
    public static final Object read = new Object();
    public static final getPausedComposition serializer = new getPausedComposition();
    public volatile getSlotId MediaBrowserCompatMediaItem;
    public volatile LayoutNodeSubcompositionsStateNodeState MediaDescriptionCompat;
    public volatile Object RatingCompat;

    public final void write(getSlotId getslotid) {
        getslotid.write = null;
        while (true) {
            getSlotId getslotid2 = this.MediaBrowserCompatMediaItem;
            if (getslotid2 != getSlotId.RemoteActionCompatParcelizer) {
                getSlotId getslotid3 = null;
                while (getslotid2 != null) {
                    getSlotId getslotid4 = getslotid2.read;
                    if (getslotid2.write != null) {
                        getslotid3 = getslotid2;
                    } else if (getslotid3 != null) {
                        getslotid3.read = getslotid4;
                        if (getslotid3.write == null) {
                        }
                    } else if (!IconCompatParcelizer.RemoteActionCompatParcelizer(this, getslotid2, getslotid4)) {
                    }
                    getslotid2 = getslotid4;
                }
                return;
            }
            return;
        }
    }

    static {
        boolean z;
        setSlotReusePolicy getforcereuse;
        Throwable th;
        Throwable th2;
        setSlotReusePolicy getcontent;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        RemoteActionCompatParcelizer = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains("Android")) {
            try {
                getcontent = new getContent();
            } catch (Error | Exception e2) {
                try {
                    getforcereuse = new getActive();
                } catch (Error | Exception e3) {
                    e = e3;
                    getforcereuse = new getForceReuse();
                }
                th = e2;
                th2 = e;
                getcontent = getforcereuse;
            }
        } else {
            try {
                getcontent = new getActive();
            } catch (NoClassDefFoundError unused2) {
                getcontent = new getForceReuse();
            }
        }
        th2 = null;
        th = null;
        IconCompatParcelizer = getcontent;
        if (th2 != null) {
            getPausedComposition getpausedcomposition = serializer;
            java.util.logging.Logger loggerSerializer = getpausedcomposition.serializer();
            Level level = Level.SEVERE;
            loggerSerializer.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            getpausedcomposition.serializer().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }
}
