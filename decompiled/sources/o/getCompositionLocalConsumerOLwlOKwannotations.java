package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getCompositionLocalConsumerOLwlOKwannotations {
    public final double read;

    public final int hashCode() {
        return Double.hashCode(this.read);
    }

    public getCompositionLocalConsumerOLwlOKwannotations(double d) {
        this.read = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getCompositionLocalConsumerOLwlOKwannotations) && Double.compare(this.read, ((getCompositionLocalConsumerOLwlOKwannotations) obj).read) == 0;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("DoubleValue(value="), this.read, ')');
    }
}
