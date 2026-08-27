package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getClickAction {
    private final int IconCompatParcelizer;
    private final double read;

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final double write() {
        return this.read;
    }

    public final int hashCode() {
        return Integer.hashCode(this.IconCompatParcelizer) + (Double.hashCode(this.read) * 31);
    }

    public getClickAction(double d, int i) {
        this.read = d;
        this.IconCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClickAction)) {
            return false;
        }
        getClickAction getclickaction = (getClickAction) obj;
        return Double.compare(this.read, getclickaction.read) == 0 && this.IconCompatParcelizer == getclickaction.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalScoreFormulaVariables(sumOfWeightedSpeeding=");
        sb.append(this.read);
        sb.append(", filteredWaypointsCount=");
        return af$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ')');
    }
}
