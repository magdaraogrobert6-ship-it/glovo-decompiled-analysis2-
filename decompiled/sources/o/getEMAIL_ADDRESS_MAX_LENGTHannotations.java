package o;

import com.huawei.hmf.tasks.a.d$a;
import io.grpc.Status;
import io.grpc.internal.DelayedClientCall$2;
import java.util.ArrayList;
import java.util.List;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getEMAIL_ADDRESS_MAX_LENGTHannotations extends MathKt {
    public volatile boolean IconCompatParcelizer;
    public final MathKt read;
    public List serializer = new ArrayList();

    public final void read(Runnable runnable) {
        synchronized (this) {
            if (this.IconCompatParcelizer) {
                runnable.run();
            } else {
                this.serializer.add(runnable);
            }
        }
    }

    @Override // kotlin.math.MathKt
    public final void serializer(Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        read(new DelayedClientCall$2(this, status, r8lambdaqn1du6uas6agx4srbugfttxtpwa, 6));
    }

    @Override // kotlin.math.MathKt
    public final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            this.read.RemoteActionCompatParcelizer();
        } else {
            read(new isAutomaticGeofenceRequestsEnabled(6, this));
        }
    }

    @Override // kotlin.math.MathKt
    public final void read(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        if (this.IconCompatParcelizer) {
            this.read.read(r8lambdaqn1du6uas6agx4srbugfttxtpwa);
        } else {
            read(new d$a(this, 7, r8lambdaqn1du6uas6agx4srbugfttxtpwa));
        }
    }

    @Override // kotlin.math.MathKt
    public final void serializer(Object obj) {
        if (this.IconCompatParcelizer) {
            this.read.serializer(obj);
        } else {
            read(new d$a(this, 8, obj));
        }
    }

    public getEMAIL_ADDRESS_MAX_LENGTHannotations(MathKt mathKt) {
        this.read = mathKt;
    }
}
