package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class IInAppMessageHtml {
    public static setMessage IconCompatParcelizer(long j, List list) {
        Object objPrevious;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        List listSerializer = onContentCardDismissed.serializer(list, new setMessageTextColor());
        ListIterator listIterator = listSerializer.listIterator(listSerializer.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((handleLogClickdefault) objPrevious).MediaDescriptionCompat() >= j);
        handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) objPrevious;
        Iterator it = listSerializer.iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((handleLogClickdefault) next).MediaDescriptionCompat() == j) {
                if (!z) {
                    z = true;
                    obj2 = next;
                }
            }
            obj2 = null;
            break;
        }
        handleLogClickdefault handlelogclickdefault2 = (handleLogClickdefault) obj2;
        for (Object obj3 : listSerializer) {
            if (((handleLogClickdefault) obj3).MediaDescriptionCompat() > j) {
                obj = obj3;
                break;
            }
        }
        return new setMessage(handlelogclickdefault, handlelogclickdefault2, (handleLogClickdefault) obj);
    }
}
