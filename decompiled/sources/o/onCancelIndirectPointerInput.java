package o;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class onCancelIndirectPointerInput extends TuplesKt {
    private static int serializer = 1;
    private static int write;
    public final Map RemoteActionCompatParcelizer;

    public onCancelIndirectPointerInput(Map map) {
        map.getClass();
        this.RemoteActionCompatParcelizer = map;
    }

    @Override // kotlin.TuplesKt
    public final accesssetSpotShadowColor8_81llAjd write(Context context, String str, androidx.work.WorkerParameters workerParameters) {
        Object next;
        int i = 2 % 2;
        int i2 = serializer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        str.getClass();
        try {
            if (str.equals("com.foodora.courier.push.service.SendPushReceiptWorker")) {
                str = "com.foodora.courier.push.messages.services.SendPushReceiptWorker";
            }
            Class<?> cls = Class.forName(str);
            Iterator it = this.RemoteActionCompatParcelizer.entrySet().iterator();
            int i4 = write + 89;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cls.isAssignableFrom((Class) ((Map.Entry) next).getKey()));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return ((getViewWidget) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) entry.getValue()).write()).read(context, workerParameters);
            }
            int i6 = serializer + 89;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = serializer + 17;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 5 / 0;
            }
            return null;
        } catch (ClassNotFoundException unused) {
        }
    }
}
