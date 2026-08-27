package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.tasks.zzw;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class forceRecomposeChildren extends LayoutNodeSubcompositionsStateApproachMeasureScopeImpl {
    public zzw write;

    public static Object IconCompatParcelizer(forceRecomposeChildren forcerecomposechildren) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = forcerecomposechildren.get();
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

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.RatingCompat != null;
    }

    public static void serializer(forceRecomposeChildren forcerecomposechildren) {
        for (getSlotId getslotidRemoteActionCompatParcelizer = LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer.RemoteActionCompatParcelizer(forcerecomposechildren); getslotidRemoteActionCompatParcelizer != null; getslotidRemoteActionCompatParcelizer = getslotidRemoteActionCompatParcelizer.read) {
            Thread thread = getslotidRemoteActionCompatParcelizer.write;
            if (thread != null) {
                getslotidRemoteActionCompatParcelizer.write = null;
                LockSupport.unpark(thread);
            }
        }
        forcerecomposechildren.write = null;
        LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeStateIconCompatParcelizer = LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer.IconCompatParcelizer(forcerecomposechildren);
        LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeState = null;
        while (layoutNodeSubcompositionsStateNodeStateIconCompatParcelizer != null) {
            LayoutNodeSubcompositionsStateNodeState layoutNodeSubcompositionsStateNodeState2 = layoutNodeSubcompositionsStateNodeStateIconCompatParcelizer.IconCompatParcelizer;
            layoutNodeSubcompositionsStateNodeStateIconCompatParcelizer.IconCompatParcelizer = layoutNodeSubcompositionsStateNodeState;
            layoutNodeSubcompositionsStateNodeState = layoutNodeSubcompositionsStateNodeStateIconCompatParcelizer;
            layoutNodeSubcompositionsStateNodeStateIconCompatParcelizer = layoutNodeSubcompositionsStateNodeState2;
        }
        if (layoutNodeSubcompositionsStateNodeState != null) {
            throw null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.RatingCompat instanceof makeSureStateIsConsistent;
    }

    public final void read(StringBuilder sb) {
        try {
            Object objIconCompatParcelizer = IconCompatParcelizer(this);
            sb.append("SUCCESS, result=[");
            if (objIconCompatParcelizer == null) {
                sb.append("null");
            } else if (objIconCompatParcelizer == this) {
                sb.append("this future");
            } else {
                sb.append(objIconCompatParcelizer.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objIconCompatParcelizer)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (forceRecomposeChildren.class.getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append("zzc");
        } else {
            sb.append(forceRecomposeChildren.class.getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.RatingCompat instanceof makeSureStateIsConsistent) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            read(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                zzw zzwVar = this.write;
                strConcat = zzwVar == null ? "" : zzwVar.toString();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Throwable th) {
                if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                    throw th;
                }
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th.getClass()));
            }
            if (strConcat != null) {
                af$$ExternalSyntheticOutline0.m(sb, ", info=[", strConcat, "]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                read(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static Object serializer(Object obj) throws ExecutionException {
        if (obj instanceof makeSureStateIsConsistent) {
            Throwable th = ((makeSureStateIsConsistent) obj).IconCompatParcelizer;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof onReuse) {
            throw new ExecutionException(((onReuse) obj).write);
        }
        if (obj == LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.read) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        makeSureStateIsConsistent makesurestateisconsistent;
        Object obj = this.RatingCompat;
        if (obj != null) {
            return false;
        }
        if (LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.RemoteActionCompatParcelizer) {
            makesurestateisconsistent = new makeSureStateIsConsistent(z, new CancellationException("Future.cancel() was called."));
        } else {
            makesurestateisconsistent = z ? makeSureStateIsConsistent.RemoteActionCompatParcelizer : makeSureStateIsConsistent.read;
            Objects.requireNonNull(makesurestateisconsistent);
        }
        if (!LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer.write(this, obj, makesurestateisconsistent)) {
            return false;
        }
        serializer(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        getSlotId getslotid = getSlotId.RemoteActionCompatParcelizer;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.RatingCompat;
            if (obj != null) {
                return serializer(obj);
            }
            long j2 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                getSlotId getslotid2 = this.MediaBrowserCompatMediaItem;
                if (getslotid2 != getslotid) {
                    getSlotId getslotid3 = new getSlotId();
                    while (true) {
                        setSlotReusePolicy setslotreusepolicy = LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer;
                        setslotreusepolicy.serializer(getslotid3, getslotid2);
                        if (setslotreusepolicy.RemoteActionCompatParcelizer(this, getslotid2, getslotid3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.RatingCompat;
                                    if (obj2 != null) {
                                        return serializer(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    write(getslotid3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            write(getslotid3);
                            j2 = 0;
                            break;
                        }
                        getslotid2 = this.MediaBrowserCompatMediaItem;
                        if (getslotid2 == getslotid) {
                        }
                    }
                }
                Object obj3 = this.RatingCompat;
                Objects.requireNonNull(obj3);
                return serializer(obj3);
            }
            while (nanos > j2) {
                Object obj4 = this.RatingCompat;
                if (obj4 != null) {
                    return serializer(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                    j2 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            java.util.Locale locale = java.util.Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "Waited ", j, " ");
            sb.append(lowerCase2);
            String string3 = sb.toString();
            if (nanos + 1000 < 0) {
                String strConcat = string3.concat(" (plus ");
                long j3 = -nanos;
                long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(jConvert);
                boolean z = jConvert == 0 || nanos2 > 1000;
                if (jConvert > 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb2, strConcat, jConvert, " ");
                    sb2.append(lowerCase);
                    String string4 = sb2.toString();
                    if (z) {
                        string4 = string4.concat(",");
                    }
                    strConcat = string4.concat(" ");
                }
                if (z) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb3.append(strConcat);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(d$$ExternalSyntheticOutline0.m(new StringBuilder(string3.length() + 5 + string.length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        getSlotId getslotid = getSlotId.RemoteActionCompatParcelizer;
        if (!Thread.interrupted()) {
            Object obj2 = this.RatingCompat;
            if (obj2 != null) {
                return serializer(obj2);
            }
            getSlotId getslotid2 = this.MediaBrowserCompatMediaItem;
            if (getslotid2 != getslotid) {
                getSlotId getslotid3 = new getSlotId();
                do {
                    setSlotReusePolicy setslotreusepolicy = LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer;
                    setslotreusepolicy.serializer(getslotid3, getslotid2);
                    if (setslotreusepolicy.RemoteActionCompatParcelizer(this, getslotid2, getslotid3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.RatingCompat;
                            } else {
                                write(getslotid3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return serializer(obj);
                    }
                    getslotid2 = this.MediaBrowserCompatMediaItem;
                } while (getslotid2 != getslotid);
            }
            Object obj3 = this.RatingCompat;
            Objects.requireNonNull(obj3);
            return serializer(obj3);
        }
        throw new InterruptedException();
    }
}
