package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs implements setComposeViewContextIncrementedDuringInitui {
    public final int RemoteActionCompatParcelizer;
    public final String read;

    public r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs(String str, int i) {
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer == 0 ? "" : this.read;
    }

    public final boolean serializer() {
        if (this.RemoteActionCompatParcelizer != 0) {
            String strTrim = RemoteActionCompatParcelizer().trim();
            if (r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.write.matcher(strTrim).matches()) {
                return true;
            }
            if (!r8lambdaEvlM9GvGkDLdswyUOh9jHyuV2U.RemoteActionCompatParcelizer.matcher(strTrim).matches()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("[Value: ", strTrim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    public final double IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == 0) {
            return 0.0d;
        }
        String strTrim = RemoteActionCompatParcelizer().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ff$$ExternalSyntheticOutline0.m("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    public final long read() {
        if (this.RemoteActionCompatParcelizer == 0) {
            return 0L;
        }
        String strTrim = RemoteActionCompatParcelizer().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ff$$ExternalSyntheticOutline0.m("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }
}
