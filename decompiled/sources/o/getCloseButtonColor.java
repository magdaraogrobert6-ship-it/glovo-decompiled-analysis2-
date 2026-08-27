package o;

import com.deliveryhero.fwf_http.ConstantKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
public final class getCloseButtonColor {
    private final getHeaderTextColor write;

    public final ArrayList write(long j, long j2, List list) {
        Object objPrevious;
        Object next;
        List listSerializer = onContentCardDismissed.serializer(list, new IInAppMessageImmersive());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSerializer) {
            long jMediaDescriptionCompat = ((handleLogClickdefault) obj).MediaDescriptionCompat();
            if (j <= jMediaDescriptionCompat && jMediaDescriptionCompat <= j2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 2) {
            return arrayList;
        }
        handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) onContentCardDismissed.read((List) arrayList);
        long jMediaDescriptionCompat2 = handlelogclickdefault.MediaDescriptionCompat() - ConstantKt.DEFAULT_REQUEST_TIMEOUT;
        ListIterator listIterator = listSerializer.listIterator(listSerializer.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((handleLogClickdefault) objPrevious).MediaDescriptionCompat() > jMediaDescriptionCompat2);
        handleLogClickdefault handlelogclickdefaultRemoteActionCompatParcelizer = (handleLogClickdefault) objPrevious;
        getHeaderTextColor getheadertextcolor = this.write;
        if (handlelogclickdefaultRemoteActionCompatParcelizer == null) {
            handlelogclickdefaultRemoteActionCompatParcelizer = null;
        } else if (handlelogclickdefaultRemoteActionCompatParcelizer.MediaDescriptionCompat() != jMediaDescriptionCompat2) {
            handlelogclickdefaultRemoteActionCompatParcelizer = getheadertextcolor.RemoteActionCompatParcelizer(jMediaDescriptionCompat2, new onViewAttachedToWindowlambda0(handlelogclickdefaultRemoteActionCompatParcelizer, handlelogclickdefault));
        }
        handleLogClickdefault handlelogclickdefault2 = (handleLogClickdefault) onContentCardDismissed.MediaDescriptionCompat((List) arrayList);
        long jMediaDescriptionCompat3 = handlelogclickdefault2.MediaDescriptionCompat() + ConstantKt.DEFAULT_REQUEST_TIMEOUT;
        Iterator it = listSerializer.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((handleLogClickdefault) next).MediaDescriptionCompat() < jMediaDescriptionCompat3);
        handleLogClickdefault handlelogclickdefault3 = (handleLogClickdefault) next;
        handleLogClickdefault handlelogclickdefaultRemoteActionCompatParcelizer2 = handlelogclickdefault3 != null ? handlelogclickdefault3.MediaDescriptionCompat() == jMediaDescriptionCompat3 ? handlelogclickdefault3 : getheadertextcolor.RemoteActionCompatParcelizer(jMediaDescriptionCompat3, new onViewAttachedToWindowlambda0(handlelogclickdefault2, handlelogclickdefault3)) : null;
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(3);
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(handlelogclickdefaultRemoteActionCompatParcelizer);
        applydisplaycutoutmarginstocontentarealambda0.serializer(arrayList.toArray(new handleLogClickdefault[0]));
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(handlelogclickdefaultRemoteActionCompatParcelizer2);
        ArrayList arrayList2 = applydisplaycutoutmarginstocontentarealambda0.write;
        Object[] array = arrayList2.toArray(new handleLogClickdefault[arrayList2.size()]);
        array.getClass();
        return onContentCardClicked.RemoteActionCompatParcelizer(array);
    }

    public getCloseButtonColor(getHeaderTextColor getheadertextcolor) {
        getheadertextcolor.getClass();
        this.write = getheadertextcolor;
    }
}
