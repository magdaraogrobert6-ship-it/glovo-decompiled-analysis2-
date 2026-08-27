package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class displayInAppMessagelambda0 implements registerInAppMessageManagerlambda50 {
    public final List RemoteActionCompatParcelizer;
    public final int serializer;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk write;

    @Override // o.registerInAppMessageManagerlambda50
    public final List IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.registerInAppMessageManagerlambda50
    public final getUnregisteredInAppMessageannotations RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.registerInAppMessageManagerlambda50
    public final boolean read() {
        return (this.serializer & 1) != 0;
    }

    public final String toString() {
        return RemoteActionCompatParcelizer(false).concat(" (Kotlin reflection is not available)");
    }

    public final String RemoteActionCompatParcelizer(boolean z) {
        String name;
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = this.write;
        Class cls = Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        if (!cls.isArray()) {
            name = (z && cls.isPrimitive()) ? Options.Companion.IconCompatParcelizer((getUnregisteredInAppMessageannotations) r8lambdaucgighn8fiyv_vccodeafjfpedk).getName() : cls.getName();
        } else if (cls.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (cls.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (cls.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (cls.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (cls.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (cls.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (cls.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = cls.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = this.RemoteActionCompatParcelizer;
        return af$$ExternalSyntheticOutline0.m(name, list.isEmpty() ? "" : onContentCardDismissed.IconCompatParcelizer(list, ", ", "<", ">", new BrazeInAppMessageManagerExternalSyntheticLambda45(this), 24), read() ? "?" : "");
    }

    public final int hashCode() {
        return Integer.hashCode(this.serializer) + c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.write.hashCode() * 31, 31);
    }

    public displayInAppMessagelambda0(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, List list, boolean z) {
        list.getClass();
        this.write = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.RemoteActionCompatParcelizer = list;
        this.serializer = z ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof displayInAppMessagelambda0)) {
            return false;
        }
        displayInAppMessagelambda0 displayinappmessagelambda0 = (displayInAppMessagelambda0) obj;
        if (!this.write.equals(displayinappmessagelambda0.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, displayinappmessagelambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() && this.serializer == displayinappmessagelambda0.serializer;
    }
}
