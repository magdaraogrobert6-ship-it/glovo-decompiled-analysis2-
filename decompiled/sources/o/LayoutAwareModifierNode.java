package o;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutAwareModifierNode extends Number {
    public final String read;

    public final String toString() {
        return this.read;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.read);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.read;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.read;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public LayoutAwareModifierNode(String str) {
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutAwareModifierNode) {
            return this.read.equals(((LayoutAwareModifierNode) obj).read);
        }
        return false;
    }
}
