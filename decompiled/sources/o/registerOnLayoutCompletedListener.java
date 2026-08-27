package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class registerOnLayoutCompletedListener extends MeasureScopeWithLayoutNode {
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public byte read;
    public setUncaughtExceptionHandlerui serializer;
    public long write;

    public final registerOnLayoutCompletedListener IconCompatParcelizer(String str) {
        if (str != null) {
            this.IconCompatParcelizer = str;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null parameterKey");
        return null;
    }

    public final registerOnLayoutCompletedListener read(long j) {
        this.write = j;
        this.read = (byte) (this.read | 1);
        return this;
    }

    public final requestLookaheadRemeasure IconCompatParcelizer() {
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui;
        String str;
        String str2;
        if (this.read == 1 && (setuncaughtexceptionhandlerui = this.serializer) != null && (str = this.IconCompatParcelizer) != null && (str2 = this.RemoteActionCompatParcelizer) != null) {
            return new requestLookaheadRemeasure(setuncaughtexceptionhandlerui, str, str2, this.write);
        }
        StringBuilder sb = new StringBuilder();
        if (this.serializer == null) {
            sb.append(" rolloutVariant");
        }
        if (this.IconCompatParcelizer == null) {
            sb.append(" parameterKey");
        }
        if (this.RemoteActionCompatParcelizer == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.read) == 0) {
            sb.append(" templateVersion");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
