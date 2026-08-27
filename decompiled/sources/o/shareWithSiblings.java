package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class shareWithSiblings extends setWrappedByui {
    public static final shareWithSiblings serializer = new shareWithSiblings(Collections.EMPTY_LIST);

    public static shareWithSiblings IconCompatParcelizer(String str) {
        if (str.contains("//")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid path (", str, "). Paths must not contain // in them."));
            return null;
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new shareWithSiblings(arrayList);
    }

    @Override // o.setWrappedByui
    public final setWrappedByui serializer(List list) {
        return new shareWithSiblings(list);
    }

    @Override // o.setWrappedByui
    public final String write() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.IconCompatParcelizer;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append("/");
            }
            sb.append((String) list.get(i));
            i++;
        }
    }

    public shareWithSiblings(List list) {
        super(list);
    }
}
