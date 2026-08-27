package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExceptionHelper {
    public static final Throwable serializer = new Termination("No further exceptions");

    public static Throwable RemoteActionCompatParcelizer(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = serializer;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static boolean read(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == serializer) {
                return false;
            }
        } while (!IconCompatParcelizer.read(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static RuntimeException write(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    public static final class Termination extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }

        public Termination(String str) {
            super(str);
        }
    }
}
