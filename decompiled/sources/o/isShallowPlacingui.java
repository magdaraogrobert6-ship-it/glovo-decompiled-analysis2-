package o;

/* JADX INFO: loaded from: classes4.dex */
public final class isShallowPlacingui {
    public final boolean IconCompatParcelizer;
    public final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 read;

    public final int hashCode() {
        return ((this.read.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.IconCompatParcelizer).hashCode();
    }

    public isShallowPlacingui(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, boolean z) {
        this.read = lookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
        this.IconCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isShallowPlacingui)) {
            return false;
        }
        isShallowPlacingui isshallowplacingui = (isShallowPlacingui) obj;
        return isshallowplacingui.read.equals(this.read) && isshallowplacingui.IconCompatParcelizer == this.IconCompatParcelizer;
    }
}
