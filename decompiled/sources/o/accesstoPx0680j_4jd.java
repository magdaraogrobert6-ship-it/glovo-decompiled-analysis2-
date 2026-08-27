package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class accesstoPx0680j_4jd extends accesstoDpu2uoSUMjd {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // o.accesstoDpu2uoSUMjd, o.DropShadowScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accesstoPx0680j_4jd) || write().equals(((accesstoPx0680j_4jd) obj).write())) {
            return super.equals(obj);
        }
        return false;
    }

    public accesstoPx0680j_4jd(char[] cArr) {
        super(cArr);
    }
}
