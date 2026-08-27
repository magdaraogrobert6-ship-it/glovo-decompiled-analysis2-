package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class component2D9Ej5fM implements DrawModifierNodeKt {
    public static final boolean IconCompatParcelizer;
    public static final java.util.logging.Logger RemoteActionCompatParcelizer;
    public static final RangesKt read;
    public static final Object serializer;
    public volatile Absolutea9UjIt4default MediaDescriptionCompat;
    public volatile Object MediaMetadataCompat;
    public volatile copylDy3nrA write;

    public static Object write(component2D9Ej5fM component2d9ej5fm) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = component2d9ej5fm.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public void IconCompatParcelizer() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.MediaMetadataCompat != null;
    }

    public final void read(Absolutea9UjIt4default absolutea9UjIt4default) {
        absolutea9UjIt4default.write = null;
        while (true) {
            Absolutea9UjIt4default absolutea9UjIt4default2 = this.MediaDescriptionCompat;
            if (absolutea9UjIt4default2 == Absolutea9UjIt4default.serializer) {
                return;
            }
            Absolutea9UjIt4default absolutea9UjIt4default3 = null;
            while (absolutea9UjIt4default2 != null) {
                Absolutea9UjIt4default absolutea9UjIt4default4 = absolutea9UjIt4default2.read;
                if (absolutea9UjIt4default2.write != null) {
                    absolutea9UjIt4default3 = absolutea9UjIt4default2;
                } else if (absolutea9UjIt4default3 != null) {
                    absolutea9UjIt4default3.read = absolutea9UjIt4default4;
                    if (absolutea9UjIt4default3.write == null) {
                    }
                } else if (!read.read(this, absolutea9UjIt4default2, absolutea9UjIt4default4)) {
                }
                absolutea9UjIt4default2 = absolutea9UjIt4default4;
            }
            return;
        }
    }

    public static void write(component2D9Ej5fM component2d9ej5fm, boolean z) {
        copylDy3nrA copyldy3nra;
        Absolutea9UjIt4default absolutea9UjIt4defaultIconCompatParcelizer = read.IconCompatParcelizer(component2d9ej5fm);
        while (true) {
            copyldy3nra = null;
            if (absolutea9UjIt4defaultIconCompatParcelizer == null) {
                break;
            }
            Thread thread = absolutea9UjIt4defaultIconCompatParcelizer.write;
            if (thread != null) {
                absolutea9UjIt4defaultIconCompatParcelizer.write = null;
                LockSupport.unpark(thread);
            }
            absolutea9UjIt4defaultIconCompatParcelizer = absolutea9UjIt4defaultIconCompatParcelizer.read;
        }
        if (z) {
            component2d9ej5fm.IconCompatParcelizer();
        }
        copylDy3nrA copyldy3nra2 = read.read(component2d9ej5fm);
        while (copyldy3nra2 != null) {
            copylDy3nrA copyldy3nra3 = copyldy3nra2.read;
            copyldy3nra2.read = copyldy3nra;
            copyldy3nra = copyldy3nra2;
            copyldy3nra2 = copyldy3nra3;
        }
        while (copyldy3nra != null) {
            copylDy3nrA copyldy3nra4 = copyldy3nra.read;
            Runnable runnable = copyldy3nra.IconCompatParcelizer;
            Objects.requireNonNull(runnable);
            Executor executor = copyldy3nra.serializer;
            Objects.requireNonNull(executor);
            read(runnable, executor);
            copyldy3nra = copyldy3nra4;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.MediaMetadataCompat instanceof copylDy3nrAdefault;
    }

    public final void read(StringBuilder sb) {
        try {
            Object objWrite = write(this);
            sb.append("SUCCESS, result=[");
            serializer(sb, objWrite);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public final String toString() {
        String strSerializer;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.MediaMetadataCompat instanceof copylDy3nrAdefault) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            read(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strSerializer = serializer();
                if (visitSubtreeIfYYKmho.write(strSerializer)) {
                    strSerializer = null;
                }
            } catch (RuntimeException | StackOverflowError e) {
                strSerializer = "Exception thrown from implementation: " + e.getClass();
            }
            if (strSerializer != null) {
                af$$ExternalSyntheticOutline0.m(sb, ", info=[", strSerializer, "]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                read(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static Object RemoteActionCompatParcelizer(Object obj) throws ExecutionException {
        if (obj instanceof copylDy3nrAdefault) {
            Throwable th = ((copylDy3nrAdefault) obj).IconCompatParcelizer;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof component4D9Ej5fM) {
            throw new ExecutionException(((component4D9Ej5fM) obj).write);
        }
        if (obj == serializer) {
            return null;
        }
        return obj;
    }

    @Override // o.DrawModifierNodeKt
    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        copylDy3nrA copyldy3nra;
        copylDy3nrA copyldy3nra2 = copylDy3nrA.RemoteActionCompatParcelizer;
        TextStreamsKt.serializer(executor, "Executor was null.");
        if (!isDone() && (copyldy3nra = this.write) != copyldy3nra2) {
            copylDy3nrA copyldy3nra3 = new copylDy3nrA(runnable, executor);
            do {
                copyldy3nra3.read = copyldy3nra;
                if (read.serializer(this, copyldy3nra, copyldy3nra3)) {
                    return;
                } else {
                    copyldy3nra = this.write;
                }
            } while (copyldy3nra != copyldy3nra2);
        }
        read(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        copylDy3nrAdefault copyldy3nradefault;
        Object obj = this.MediaMetadataCompat;
        if (obj != null) {
            return false;
        }
        if (IconCompatParcelizer) {
            copyldy3nradefault = new copylDy3nrAdefault(z, new CancellationException("Future.cancel() was called."));
        } else {
            copyldy3nradefault = z ? copylDy3nrAdefault.write : copylDy3nrAdefault.serializer;
            Objects.requireNonNull(copyldy3nradefault);
        }
        if (!read.serializer(this, obj, copyldy3nradefault)) {
            return false;
        }
        write(this, z);
        return true;
    }

    public final void serializer(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public static void read(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            RemoteActionCompatParcelizer.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    static {
        boolean z;
        RangesKt getstartd9ej5fm;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        IconCompatParcelizer = z;
        RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(component2D9Ej5fM.class.getName());
        Throwable th = null;
        try {
            getstartd9ej5fm = new getEndD9Ej5fM();
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            try {
                getstartd9ej5fm = new getBottomD9Ej5fM(AtomicReferenceFieldUpdater.newUpdater(Absolutea9UjIt4default.class, Thread.class, "write"), AtomicReferenceFieldUpdater.newUpdater(Absolutea9UjIt4default.class, Absolutea9UjIt4default.class, "read"), AtomicReferenceFieldUpdater.newUpdater(component2D9Ej5fM.class, Absolutea9UjIt4default.class, "MediaDescriptionCompat"), AtomicReferenceFieldUpdater.newUpdater(component2D9Ej5fM.class, copylDy3nrA.class, "write"), AtomicReferenceFieldUpdater.newUpdater(component2D9Ej5fM.class, Object.class, "MediaMetadataCompat"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                getstartd9ej5fm = new getStartD9Ej5fM();
            }
        }
        read = getstartd9ej5fm;
        if (th != null) {
            java.util.logging.Logger logger = RemoteActionCompatParcelizer;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", e);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        serializer = new Object();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Absolutea9UjIt4default absolutea9UjIt4default = Absolutea9UjIt4default.serializer;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.MediaMetadataCompat;
            if (obj != null) {
                return RemoteActionCompatParcelizer(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                Absolutea9UjIt4default absolutea9UjIt4default2 = this.MediaDescriptionCompat;
                if (absolutea9UjIt4default2 != absolutea9UjIt4default) {
                    Absolutea9UjIt4default absolutea9UjIt4default3 = new Absolutea9UjIt4default();
                    while (true) {
                        RangesKt rangesKt = read;
                        rangesKt.read(absolutea9UjIt4default3, absolutea9UjIt4default2);
                        if (rangesKt.read(this, absolutea9UjIt4default2, absolutea9UjIt4default3)) {
                            do {
                                measureBRTryo0.serializer(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.MediaMetadataCompat;
                                    if (obj2 != null) {
                                        return RemoteActionCompatParcelizer(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    read(absolutea9UjIt4default3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            read(absolutea9UjIt4default3);
                            break;
                        }
                        absolutea9UjIt4default2 = this.MediaDescriptionCompat;
                        if (absolutea9UjIt4default2 == absolutea9UjIt4default) {
                        }
                    }
                }
                Object obj3 = this.MediaMetadataCompat;
                Objects.requireNonNull(obj3);
                return RemoteActionCompatParcelizer(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.MediaMetadataCompat;
                if (obj4 != null) {
                    return RemoteActionCompatParcelizer(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            java.util.Locale locale = java.util.Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Waited ", " ");
            sbM.append(timeUnit.toString().toLowerCase(locale));
            String string3 = sbM.toString();
            if (nanos + 1000 < 0) {
                String strConcat = string3.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                boolean z = jConvert == 0 || nanos2 > 1000;
                if (jConvert > 0) {
                    String strConcat2 = strConcat + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat2 = strConcat2.concat(",");
                    }
                    strConcat = strConcat2.concat(" ");
                }
                if (z) {
                    strConcat = strConcat + nanos2 + " nanoseconds ";
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(af$$ExternalSyntheticOutline0.m(string3, " for ", string));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String serializer() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        Absolutea9UjIt4default absolutea9UjIt4default = Absolutea9UjIt4default.serializer;
        if (!Thread.interrupted()) {
            Object obj2 = this.MediaMetadataCompat;
            if (obj2 != null) {
                return RemoteActionCompatParcelizer(obj2);
            }
            Absolutea9UjIt4default absolutea9UjIt4default2 = this.MediaDescriptionCompat;
            if (absolutea9UjIt4default2 != absolutea9UjIt4default) {
                Absolutea9UjIt4default absolutea9UjIt4default3 = new Absolutea9UjIt4default();
                do {
                    RangesKt rangesKt = read;
                    rangesKt.read(absolutea9UjIt4default3, absolutea9UjIt4default2);
                    if (rangesKt.read(this, absolutea9UjIt4default2, absolutea9UjIt4default3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.MediaMetadataCompat;
                            } else {
                                read(absolutea9UjIt4default3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return RemoteActionCompatParcelizer(obj);
                    }
                    absolutea9UjIt4default2 = this.MediaDescriptionCompat;
                } while (absolutea9UjIt4default2 != absolutea9UjIt4default);
            }
            Object obj3 = this.MediaMetadataCompat;
            Objects.requireNonNull(obj3);
            return RemoteActionCompatParcelizer(obj3);
        }
        throw new InterruptedException();
    }
}
