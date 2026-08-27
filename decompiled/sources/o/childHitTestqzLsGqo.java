package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class childHitTestqzLsGqo extends setWrappedByui {
    public static final childHitTestqzLsGqo write = new childHitTestqzLsGqo(Collections.singletonList("__name__"));
    public static final childHitTestqzLsGqo read = new childHitTestqzLsGqo(Collections.singletonList("__update_time__"));
    public static final childHitTestqzLsGqo serializer = new childHitTestqzLsGqo(Collections.singletonList("__create_time__"));
    public static final childHitTestqzLsGqo RemoteActionCompatParcelizer = new childHitTestqzLsGqo(Collections.EMPTY_LIST);

    public static childHitTestqzLsGqo read(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i == str.length()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Trailing escape character is not allowed");
                    return null;
                }
                sb.append(str.charAt(i));
            } else if (cCharAt == '.') {
                if (z) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                        return null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z = !z;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
            return null;
        }
        arrayList.add(string2);
        return new childHitTestqzLsGqo(arrayList);
    }

    @Override // o.setWrappedByui
    public final setWrappedByui serializer(List list) {
        return new childHitTestqzLsGqo(list);
    }

    @Override // o.setWrappedByui
    public final String write() {
        char cCharAt;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.IconCompatParcelizer;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(".");
            }
            String strReplace = ((String) list.get(i)).replace("\\", "\\\\").replace("`", "\\`");
            if (strReplace.isEmpty() || ((cCharAt = strReplace.charAt(0)) != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')))) {
                strReplace = m1$$ExternalSyntheticOutline0.m('`', "`", strReplace);
                break;
                break;
            }
            for (int i2 = 1; i2 < strReplace.length(); i2++) {
                char cCharAt2 = strReplace.charAt(i2);
                if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                    strReplace = m1$$ExternalSyntheticOutline0.m('`', "`", strReplace);
                    break;
                }
            }
            sb.append(strReplace);
            i++;
        }
    }

    public childHitTestqzLsGqo(List list) {
        super(list);
    }
}
