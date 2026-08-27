package o;

import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public final class getProject implements FwFClientKt {
    public static final getProject RemoteActionCompatParcelizer = new getProject();
    public static final InAppMessageHtmlBaseView write;

    static {
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        write = androidx.sqlite.SQLite.write("text/plain; charset=UTF-8");
    }

    @Override // o.FwFClientKt
    public final Object IconCompatParcelizer(Object obj) {
        return RequestBody.create(write, String.valueOf(obj));
    }
}
