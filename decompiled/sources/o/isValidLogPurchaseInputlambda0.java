package o;

import com.huawei.hmf.tasks.a.d$a;
import io.grpc.Status;
import io.grpc.internal.DelayedStream$3;
import io.grpc.internal.SharedResourcePool;
import io.sentry.MovePreviousSession;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isValidLogPurchaseInputlambda0 implements r8lambda6LGSESzBuanebUADYycWZpXP5Kw {
    public List IconCompatParcelizer = new ArrayList();
    public volatile boolean serializer;
    public final r8lambda6LGSESzBuanebUADYycWZpXP5Kw write;

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        synchronized (this) {
            if (this.serializer) {
                runnable.run();
            } else {
                this.IconCompatParcelizer.add(runnable);
            }
        }
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public final void write(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        RemoteActionCompatParcelizer(new DelayedStream$3(this, 7, r8lambdaqn1du6uas6agx4srbugfttxtpwa));
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public final void read() {
        if (this.serializer) {
            this.write.read();
        } else {
            RemoteActionCompatParcelizer(new MovePreviousSession(12, this));
        }
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public final void serializer(SharedResourcePool sharedResourcePool) {
        if (this.serializer) {
            this.write.serializer(sharedResourcePool);
        } else {
            RemoteActionCompatParcelizer(new d$a(this, 11, sharedResourcePool));
        }
    }

    public isValidLogPurchaseInputlambda0(r8lambda6LGSESzBuanebUADYycWZpXP5Kw r8lambda6lgseszbuanebuadyycwzpxp5kw) {
        this.write = r8lambda6lgseszbuanebuadyycwzpxp5kw;
    }

    @Override // o.r8lambda6LGSESzBuanebUADYycWZpXP5Kw
    public final void serializer(Status status, r8lambdacIxdbs1VMz7DJpiM5hikhHgartg r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        RemoteActionCompatParcelizer(new r8lambdapbG_fqEcit8CH1waoNmDxLhROlU(this, status, r8lambdacixdbs1vmz7djpim5hikhhgartg, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 3));
    }
}
