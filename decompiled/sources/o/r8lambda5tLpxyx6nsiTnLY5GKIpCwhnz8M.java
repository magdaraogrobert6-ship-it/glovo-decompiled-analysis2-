package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M {
    public static String RemoteActionCompatParcelizer(Iterable<?> iterable, String str) {
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.RotationX);
        if (string != null) {
            sb.append(string);
        }
        while (it.hasNext()) {
            sb.append(str);
            String string2 = it.next().toString();
            if (string2 != null) {
                sb.append(string2);
            }
        }
        return sb.toString();
    }
}
