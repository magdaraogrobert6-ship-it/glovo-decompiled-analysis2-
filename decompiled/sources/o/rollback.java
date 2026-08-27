package o;

import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rollback {
    private static int serializer = 1;
    private static int write;
    public final transferSessionPackageI RemoteActionCompatParcelizer;

    public rollback(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
    }

    public final io.sentry.okhttp.RemoteActionCompatParcelizer IconCompatParcelizer() {
        int i = 2 % 2;
        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer).IconCompatParcelizer.read("sentry_okhttp_error_codes_to_track"), new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSerializer.iterator();
        while (it.hasNext()) {
            int i2 = write + 3;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setCarryoverInAppMessage.PlaybackStateCompat((String) it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat((String) it.next());
            if (numPlaybackStateCompat != null) {
                arrayList.add(numPlaybackStateCompat);
                int i3 = serializer + 83;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new getBrazeActionVersionAndJsonandroid_sdk_ui_release(((Number) it2.next()).intValue()));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List list = arrayList2;
        if (zIsEmpty) {
            list = instance_delegatelambda0.write;
        }
        Object[] objArr = {new getBrazeActionVersionAndJsonandroid_sdk_ui_release(Constant.ERROR_UNKNOWN, 599)};
        int iSerializer = getQueryParameterslambda2.serializer();
        List list2 = list;
        io.sentry.okhttp.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.okhttp.RemoteActionCompatParcelizer(onContentCardDismissed.IconCompatParcelizer(list2, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer)));
        int i5 = write + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return remoteActionCompatParcelizer;
    }
}
