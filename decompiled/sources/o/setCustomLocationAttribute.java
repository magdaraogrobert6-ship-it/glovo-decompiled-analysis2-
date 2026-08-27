package o;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setCustomLocationAttribute extends MathKt {
    public Object IconCompatParcelizer;
    public final parseStringArrayFromJsonString read;
    public boolean serializer = false;

    @Override // kotlin.math.MathKt
    public final void read(r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
    }

    public setCustomLocationAttribute(parseStringArrayFromJsonString parsestringarrayfromjsonstring) {
        this.read = parsestringarrayfromjsonstring;
    }

    @Override // kotlin.math.MathKt
    public final void serializer(Object obj) {
        if (this.serializer) {
            throw Status.write.IconCompatParcelizer("More than one value received for unary call").RemoteActionCompatParcelizer();
        }
        this.IconCompatParcelizer = obj;
        this.serializer = true;
    }

    @Override // kotlin.math.MathKt
    public final void serializer(Status status, r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa) {
        boolean zIconCompatParcelizer = status.IconCompatParcelizer();
        parseStringArrayFromJsonString parsestringarrayfromjsonstring = this.read;
        if (!zIconCompatParcelizer) {
            if (component2D9Ej5fM.read.serializer(parsestringarrayfromjsonstring, (Object) null, new component4D9Ej5fM(new StatusRuntimeException(status, r8lambdaqn1du6uas6agx4srbugfttxtpwa)))) {
                component2D9Ej5fM.write(parsestringarrayfromjsonstring, false);
                return;
            }
            return;
        }
        if (!this.serializer) {
            if (component2D9Ej5fM.read.serializer(parsestringarrayfromjsonstring, (Object) null, new component4D9Ej5fM(new StatusRuntimeException(Status.write.IconCompatParcelizer("No value received for unary call"), r8lambdaqn1du6uas6agx4srbugfttxtpwa)))) {
                component2D9Ej5fM.write(parsestringarrayfromjsonstring, false);
            }
        }
        Object obj = this.IconCompatParcelizer;
        if (obj == null) {
            obj = component2D9Ej5fM.serializer;
        }
        if (component2D9Ej5fM.read.serializer(parsestringarrayfromjsonstring, (Object) null, obj)) {
            component2D9Ej5fM.write(parsestringarrayfromjsonstring, false);
        }
    }
}
