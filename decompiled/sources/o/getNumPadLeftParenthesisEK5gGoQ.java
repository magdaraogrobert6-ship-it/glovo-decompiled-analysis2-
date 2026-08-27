package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadLeftParenthesisEK5gGoQ implements getNumPadMoveHomeEK5gGoQ {
    public final Double read;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return null;
    }

    public final String toString() {
        return IconCompatParcelizer();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        return this.read;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        Double d = this.read;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return new getNumPadLeftParenthesisEK5gGoQ(this.read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new getNumPadSubtractEK5gGoQ(IconCompatParcelizer());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(IconCompatParcelizer(), ".", str, " is not a function."));
        return null;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        Double d = this.read;
        return Boolean.valueOf((Double.isNaN(d.doubleValue()) || d.doubleValue() == 0.0d) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getNumPadLeftParenthesisEK5gGoQ) {
            return this.read.equals(((getNumPadLeftParenthesisEK5gGoQ) obj).read);
        }
        return false;
    }

    public getNumPadLeftParenthesisEK5gGoQ(Double d) {
        if (d == null) {
            this.read = Double.valueOf(Double.NaN);
        } else {
            this.read = d;
        }
    }
}
