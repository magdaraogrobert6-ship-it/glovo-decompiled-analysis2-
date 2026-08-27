package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class getLocalAssetsDirectoryUrl {
    private final getHeaderTextColor serializer;

    public final ArrayList read(long j, long j2, List list) {
        getDisplayingInAppMessageannotations getdisplayinginappmessageannotations = new getDisplayingInAppMessageannotations(j, j2);
        List listSerializer = onContentCardDismissed.serializer(list, new setOpenUriInWebView());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSerializer) {
            long jMediaDescriptionCompat = ((handleLogClickdefault) obj).MediaDescriptionCompat();
            if (getdisplayinginappmessageannotations.read <= jMediaDescriptionCompat && jMediaDescriptionCompat <= getdisplayinginappmessageannotations.IconCompatParcelizer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        handleLogClickdefault handlelogclickdefaultWrite = write(this, list, j);
        if (handlelogclickdefaultWrite != null) {
            arrayList2.add(0, handlelogclickdefaultWrite);
        }
        handleLogClickdefault handlelogclickdefaultWrite2 = write(this, list, j2);
        if (handlelogclickdefaultWrite2 != null) {
            arrayList2.add(handlelogclickdefaultWrite2);
        }
        return arrayList2;
    }

    public getLocalAssetsDirectoryUrl(IInAppMessageHtml iInAppMessageHtml, getHeaderTextColor getheadertextcolor) {
        iInAppMessageHtml.getClass();
        getheadertextcolor.getClass();
        this.serializer = getheadertextcolor;
    }

    private static final handleLogClickdefault write(getLocalAssetsDirectoryUrl getlocalassetsdirectoryurl, List<? extends handleLogClickdefault> list, long j) {
        handleLogClickdefault handlelogclickdefaultRemoteActionCompatParcelizer;
        handleLogClickdefault handlelogclickdefaultWrite;
        setMessage setmessageIconCompatParcelizer = IInAppMessageHtml.IconCompatParcelizer(j, list);
        if (setmessageIconCompatParcelizer == null || setmessageIconCompatParcelizer.serializer() != null || (handlelogclickdefaultRemoteActionCompatParcelizer = setmessageIconCompatParcelizer.RemoteActionCompatParcelizer()) == null || (handlelogclickdefaultWrite = setmessageIconCompatParcelizer.write()) == null || handlelogclickdefaultRemoteActionCompatParcelizer.serializer(handlelogclickdefaultWrite) >= 400.0f) {
            return null;
        }
        return getlocalassetsdirectoryurl.serializer.RemoteActionCompatParcelizer(j, new onViewAttachedToWindowlambda0(handlelogclickdefaultRemoteActionCompatParcelizer, handlelogclickdefaultWrite));
    }
}
