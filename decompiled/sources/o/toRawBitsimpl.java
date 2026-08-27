package o;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class toRawBitsimpl {
    public static final HashSet RemoteActionCompatParcelizer = new HashSet();
    public final String read;
    public final String serializer;

    public abstract boolean write();

    public boolean RemoteActionCompatParcelizer() {
        HashSet hashSet = getHalfValue.RemoteActionCompatParcelizer;
        String str = this.read;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }

    public toRawBitsimpl(String str, String str2) {
        this.serializer = str;
        this.read = str2;
        RemoteActionCompatParcelizer.add(this);
    }
}
