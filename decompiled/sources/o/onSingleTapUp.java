package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class onSingleTapUp {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int[] read;
    public int write;

    public static String serializer(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int i : iArr) {
            debugInspectorInfo.IconCompatParcelizer(i, sb);
        }
        sb.append('\"');
        return sb.toString();
    }

    public final String toString() {
        switch (this.IconCompatParcelizer) {
            case 1:
                return "alt -> " + this.RemoteActionCompatParcelizer + ", " + this.write;
            case 2:
                return "altmatch -> " + this.RemoteActionCompatParcelizer + ", " + this.write;
            case 3:
                return "cap " + this.write + " -> " + this.RemoteActionCompatParcelizer;
            case 4:
                return "empty " + this.write + " -> " + this.RemoteActionCompatParcelizer;
            case 5:
                return "fail";
            case 6:
                return "match";
            case 7:
                return "nop -> " + this.RemoteActionCompatParcelizer;
            case 8:
                if (this.read == null) {
                    return "rune <null>";
                }
                StringBuilder sb = new StringBuilder("rune ");
                sb.append(serializer(this.read));
                sb.append((this.write & 1) != 0 ? "/i" : "");
                sb.append(" -> ");
                sb.append(this.RemoteActionCompatParcelizer);
                return sb.toString();
            case 9:
                return "rune1 " + serializer(this.read) + " -> " + this.RemoteActionCompatParcelizer;
            case 10:
                return "any -> " + this.RemoteActionCompatParcelizer;
            case 11:
                return "anynotnl -> " + this.RemoteActionCompatParcelizer;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("unhandled case in Inst.toString");
                return null;
        }
    }
}
