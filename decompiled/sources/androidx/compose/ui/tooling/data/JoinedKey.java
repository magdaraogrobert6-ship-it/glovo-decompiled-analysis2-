package androidx.compose.ui.tooling.data;

import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@UiToolingDataApi
public final class JoinedKey {
    public static final int $stable = 8;
    private final Object left;
    private final Object right;

    public final Object component1() {
        return this.left;
    }

    public final Object component2() {
        return this.right;
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }

    public final JoinedKey copy(Object obj, Object obj2) {
        return new JoinedKey(obj, obj2);
    }

    public JoinedKey(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.left, joinedKey.left}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.right, joinedKey.right}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.left);
        sb.append(", right=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.right, ')');
    }

    public int hashCode() {
        Object obj = this.left;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.right;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
