package o;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 {
    public final Class IconCompatParcelizer;
    public final Class serializer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.serializer;
        Class cls2 = this.IconCompatParcelizer;
        if (cls2 == setPlacingForAlignmentui.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }

    public LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(Class cls, Class cls2) {
        this.IconCompatParcelizer = cls;
        this.serializer = cls2;
    }

    public static LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 read(Class cls) {
        return new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(setPlacingForAlignmentui.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.class != obj.getClass()) {
            return false;
        }
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = (LookaheadCapablePlaceableCompaniononCommitAffectingRuler1) obj;
        if (this.serializer.equals(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1.serializer)) {
            return this.IconCompatParcelizer.equals(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1.IconCompatParcelizer);
        }
        return false;
    }
}
