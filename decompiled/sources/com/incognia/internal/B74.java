package com.incognia.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class B74 implements y9X {
    public final Runnable BGx;
    public final AtomicInteger mbG = new AtomicInteger(0);

    public B74(Runnable runnable) {
        this.BGx = runnable;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        if (this.mbG.compareAndSet(0, 1)) {
            try {
                this.BGx.run();
            } finally {
                this.mbG.set(2);
            }
        }
    }
}
