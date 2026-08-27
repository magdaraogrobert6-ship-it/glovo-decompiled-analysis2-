package o;

/* JADX INFO: loaded from: classes.dex */
public enum mul3x3Float3 {
    MERGE,
    ADD,
    SUBTRACT,
    INTERSECT,
    EXCLUDE_INTERSECTIONS;

    public static mul3x3Float3 forId(int i) {
        if (i == 1) {
            return MERGE;
        }
        if (i == 2) {
            return ADD;
        }
        if (i == 3) {
            return SUBTRACT;
        }
        if (i == 4) {
            return INTERSECT;
        }
        if (i != 5) {
            return MERGE;
        }
        return EXCLUDE_INTERSECTIONS;
    }
}
