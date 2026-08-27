package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class getGraphicsContext implements DrawModifierNodeKt {
    public static final Object serializer;
    public static final coil3.util.ContextsKt write;
    public volatile Object MediaBrowserCompatMediaItem;
    public volatile getGraphicsContextProviderui MediaDescriptionCompat;
    public volatile getCacheParamsui RemoteActionCompatParcelizer;
    public static final boolean read = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(getGraphicsContext.class.getName());

    public static Object write(DrawModifierNodeKt drawModifierNodeKt) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = drawModifierNodeKt.get();
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

    public void RemoteActionCompatParcelizer() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.MediaBrowserCompatMediaItem != null;
    }

    public final void write(getGraphicsContextProviderui getgraphicscontextproviderui) {
        getgraphicscontextproviderui.read = null;
        while (true) {
            getGraphicsContextProviderui getgraphicscontextproviderui2 = this.MediaDescriptionCompat;
            if (getgraphicscontextproviderui2 == getGraphicsContextProviderui.RemoteActionCompatParcelizer) {
                return;
            }
            getGraphicsContextProviderui getgraphicscontextproviderui3 = null;
            while (getgraphicscontextproviderui2 != null) {
                getGraphicsContextProviderui getgraphicscontextproviderui4 = getgraphicscontextproviderui2.write;
                if (getgraphicscontextproviderui2.read != null) {
                    getgraphicscontextproviderui3 = getgraphicscontextproviderui2;
                } else if (getgraphicscontextproviderui3 != null) {
                    getgraphicscontextproviderui3.write = getgraphicscontextproviderui4;
                    if (getgraphicscontextproviderui3.read == null) {
                    }
                } else if (!write.IconCompatParcelizer(this, getgraphicscontextproviderui2, getgraphicscontextproviderui4)) {
                }
                getgraphicscontextproviderui2 = getgraphicscontextproviderui4;
            }
            return;
        }
    }

    public static void read(getGraphicsContext getgraphicscontext) {
        getGraphicsContextProviderui getgraphicscontextproviderui;
        getCacheParamsui getcacheparamsui;
        getCacheParamsui getcacheparamsui2;
        getCacheParamsui getcacheparamsui3;
        do {
            getgraphicscontextproviderui = getgraphicscontext.MediaDescriptionCompat;
        } while (!write.IconCompatParcelizer(getgraphicscontext, getgraphicscontextproviderui, getGraphicsContextProviderui.RemoteActionCompatParcelizer));
        while (true) {
            getcacheparamsui = null;
            if (getgraphicscontextproviderui == null) {
                break;
            }
            Thread thread = getgraphicscontextproviderui.read;
            if (thread != null) {
                getgraphicscontextproviderui.read = null;
                LockSupport.unpark(thread);
            }
            getgraphicscontextproviderui = getgraphicscontextproviderui.write;
        }
        getgraphicscontext.RemoteActionCompatParcelizer();
        do {
            getcacheparamsui2 = getgraphicscontext.RemoteActionCompatParcelizer;
        } while (!write.serializer(getgraphicscontext, getcacheparamsui2, getCacheParamsui.write));
        while (true) {
            getcacheparamsui3 = getcacheparamsui;
            getcacheparamsui = getcacheparamsui2;
            if (getcacheparamsui == null) {
                break;
            }
            getcacheparamsui2 = getcacheparamsui.serializer;
            getcacheparamsui.serializer = getcacheparamsui3;
        }
        while (getcacheparamsui3 != null) {
            getCacheParamsui getcacheparamsui4 = getcacheparamsui3.serializer;
            serializer(getcacheparamsui3.read, getcacheparamsui3.RemoteActionCompatParcelizer);
            getcacheparamsui3 = getcacheparamsui4;
        }
    }

    public boolean IconCompatParcelizer(Throwable th) {
        th.getClass();
        if (!write.read(this, null, new getContentDrawScopeui(th))) {
            return false;
        }
        read(this);
        return true;
    }

    public final void RemoteActionCompatParcelizer(StringBuilder sb) {
        try {
            Object objWrite = write((DrawModifierNodeKt) this);
            sb.append("SUCCESS, result=[");
            sb.append(objWrite == this ? "this future" : String.valueOf(objWrite));
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.MediaBrowserCompatMediaItem instanceof CacheDrawScope;
    }

    public final String toString() {
        String strSerializer;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.MediaBrowserCompatMediaItem instanceof CacheDrawScope) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            RemoteActionCompatParcelizer(sb);
        } else {
            try {
                strSerializer = serializer();
            } catch (RuntimeException e) {
                strSerializer = "Exception thrown from implementation: " + e.getClass();
            }
            if (strSerializer != null && !strSerializer.isEmpty()) {
                af$$ExternalSyntheticOutline0.m(sb, "PENDING, info=[", strSerializer, "]");
            } else if (isDone()) {
                RemoteActionCompatParcelizer(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean write(Object obj) {
        if (obj == null) {
            obj = serializer;
        }
        if (!write.read(this, null, obj)) {
            return false;
        }
        read(this);
        return true;
    }

    @Override // o.DrawModifierNodeKt
    public final void RemoteActionCompatParcelizer(Runnable runnable, Executor executor) {
        executor.getClass();
        getCacheParamsui getcacheparamsui = this.RemoteActionCompatParcelizer;
        getCacheParamsui getcacheparamsui2 = getCacheParamsui.write;
        if (getcacheparamsui != getcacheparamsui2) {
            getCacheParamsui getcacheparamsui3 = new getCacheParamsui(runnable, executor);
            do {
                getcacheparamsui3.serializer = getcacheparamsui;
                if (write.serializer(this, getcacheparamsui, getcacheparamsui3)) {
                    return;
                } else {
                    getcacheparamsui = this.RemoteActionCompatParcelizer;
                }
            } while (getcacheparamsui != getcacheparamsui2);
        }
        serializer(runnable, executor);
    }

    public static Object IconCompatParcelizer(Object obj) throws ExecutionException {
        if (obj instanceof CacheDrawScope) {
            Throwable th = ((CacheDrawScope) obj).IconCompatParcelizer;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof getContentDrawScopeui) {
            throw new ExecutionException(((getContentDrawScopeui) obj).read);
        }
        if (obj == serializer) {
            return null;
        }
        return obj;
    }

    public static void serializer(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            IconCompatParcelizer.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    static {
        coil3.util.ContextsKt getdrawresultui;
        try {
            getdrawresultui = new recordTdoYBX4default(AtomicReferenceFieldUpdater.newUpdater(getGraphicsContextProviderui.class, Thread.class, "read"), AtomicReferenceFieldUpdater.newUpdater(getGraphicsContextProviderui.class, getGraphicsContextProviderui.class, "write"), AtomicReferenceFieldUpdater.newUpdater(getGraphicsContext.class, getGraphicsContextProviderui.class, "MediaDescriptionCompat"), AtomicReferenceFieldUpdater.newUpdater(getGraphicsContext.class, getCacheParamsui.class, "RemoteActionCompatParcelizer"), AtomicReferenceFieldUpdater.newUpdater(getGraphicsContext.class, Object.class, "MediaBrowserCompatMediaItem"));
            th = null;
        } catch (Throwable th) {
            th = th;
            getdrawresultui = new getDrawResultui();
        }
        write = getdrawresultui;
        if (th != null) {
            IconCompatParcelizer.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        serializer = new Object();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        getGraphicsContextProviderui getgraphicscontextproviderui = getGraphicsContextProviderui.RemoteActionCompatParcelizer;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.MediaBrowserCompatMediaItem;
            if (obj != null) {
                return IconCompatParcelizer(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                getGraphicsContextProviderui getgraphicscontextproviderui2 = this.MediaDescriptionCompat;
                if (getgraphicscontextproviderui2 != getgraphicscontextproviderui) {
                    getGraphicsContextProviderui getgraphicscontextproviderui3 = new getGraphicsContextProviderui();
                    while (true) {
                        coil3.util.ContextsKt contextsKt = write;
                        contextsKt.serializer(getgraphicscontextproviderui3, getgraphicscontextproviderui2);
                        if (contextsKt.IconCompatParcelizer(this, getgraphicscontextproviderui2, getgraphicscontextproviderui3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.MediaBrowserCompatMediaItem;
                                    if (obj2 != null) {
                                        return IconCompatParcelizer(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    write(getgraphicscontextproviderui3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            write(getgraphicscontextproviderui3);
                            break;
                        }
                        getgraphicscontextproviderui2 = this.MediaDescriptionCompat;
                        if (getgraphicscontextproviderui2 == getgraphicscontextproviderui) {
                        }
                    }
                }
                return IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
            }
            while (nanos > 0) {
                Object obj3 = this.MediaBrowserCompatMediaItem;
                if (obj3 != null) {
                    return IconCompatParcelizer(obj3);
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
    public final boolean cancel(boolean z) {
        CacheDrawScope cacheDrawScope;
        Object obj = this.MediaBrowserCompatMediaItem;
        if (obj != null) {
            return false;
        }
        if (read) {
            cacheDrawScope = new CacheDrawScope(new CancellationException("Future.cancel() was called."), z);
        } else {
            cacheDrawScope = z ? CacheDrawScope.write : CacheDrawScope.RemoteActionCompatParcelizer;
        }
        if (!write.read(this, obj, cacheDrawScope)) {
            return false;
        }
        read(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        getGraphicsContextProviderui getgraphicscontextproviderui = getGraphicsContextProviderui.RemoteActionCompatParcelizer;
        if (!Thread.interrupted()) {
            Object obj2 = this.MediaBrowserCompatMediaItem;
            if (obj2 != null) {
                return IconCompatParcelizer(obj2);
            }
            getGraphicsContextProviderui getgraphicscontextproviderui2 = this.MediaDescriptionCompat;
            if (getgraphicscontextproviderui2 != getgraphicscontextproviderui) {
                getGraphicsContextProviderui getgraphicscontextproviderui3 = new getGraphicsContextProviderui();
                do {
                    coil3.util.ContextsKt contextsKt = write;
                    contextsKt.serializer(getgraphicscontextproviderui3, getgraphicscontextproviderui2);
                    if (contextsKt.IconCompatParcelizer(this, getgraphicscontextproviderui2, getgraphicscontextproviderui3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.MediaBrowserCompatMediaItem;
                            } else {
                                write(getgraphicscontextproviderui3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return IconCompatParcelizer(obj);
                    }
                    getgraphicscontextproviderui2 = this.MediaDescriptionCompat;
                } while (getgraphicscontextproviderui2 != getgraphicscontextproviderui);
            }
            return IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        throw new InterruptedException();
    }
}
