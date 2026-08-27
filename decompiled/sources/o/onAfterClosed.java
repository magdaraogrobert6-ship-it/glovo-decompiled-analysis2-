package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class onAfterClosed {
    private final int IconCompatParcelizer;
    private final int serializer;

    public final int serializer() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.serializer;
    }

    public final int hashCode() {
        return Integer.hashCode(this.IconCompatParcelizer) + (Integer.hashCode(this.serializer) * 31);
    }

    public onAfterClosed(int i, int i2) {
        this.serializer = i;
        this.IconCompatParcelizer = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onAfterClosed)) {
            return false;
        }
        onAfterClosed onafterclosed = (onAfterClosed) obj;
        return this.serializer == onafterclosed.serializer && this.IconCompatParcelizer == onafterclosed.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmoothScoreFormulaVariables(harshEventsCount=");
        sb.append(this.serializer);
        sb.append(", windowsCount=");
        return af$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ')');
    }
}
