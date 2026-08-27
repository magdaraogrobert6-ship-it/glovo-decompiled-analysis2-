package o;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvMediaContextMenucp {
    public static final accessgetTvMediaContextMenucp serializer;
    public getFocusEK5gGoQ write;

    static {
        accessgetTvMediaContextMenucp accessgettvmediacontextmenucp = new accessgetTvMediaContextMenucp();
        accessgettvmediacontextmenucp.write = null;
        serializer = accessgettvmediacontextmenucp;
    }

    public static getFocusEK5gGoQ serializer(Context context) {
        getFocusEK5gGoQ getfocusek5ggoq;
        accessgetTvMediaContextMenucp accessgettvmediacontextmenucp = serializer;
        synchronized (accessgettvmediacontextmenucp) {
            if (accessgettvmediacontextmenucp.write == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                accessgettvmediacontextmenucp.write = new getFocusEK5gGoQ(context, 3);
            }
            getfocusek5ggoq = accessgettvmediacontextmenucp.write;
        }
        return getfocusek5ggoq;
    }
}
