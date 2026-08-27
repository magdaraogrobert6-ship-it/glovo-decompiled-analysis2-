package io.reactivex.exceptions;

import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Exceptions {
    public static void IconCompatParcelizer(Throwable th) {
        throw ExceptionHelper.write(th);
    }

    public static void read(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
