package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.location.nlp.scan.FB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class hslJlNiLsgdefault {
    public static final List serializer(UncheckedColordefault uncheckedColordefault) {
        int i = coil3.util.UtilsKt.read(uncheckedColordefault, "id");
        int i2 = coil3.util.UtilsKt.read(uncheckedColordefault, "seq");
        int i3 = coil3.util.UtilsKt.read(uncheckedColordefault, RemoteMessageConst.FROM);
        int i4 = coil3.util.UtilsKt.read(uncheckedColordefault, RemoteMessageConst.TO);
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
        while (uncheckedColordefault.IconCompatParcelizer()) {
            baseContentCardViewExternalSyntheticLambda0.add(new getYellow0d7_KjUannotations((int) uncheckedColordefault.serializer(i), uncheckedColordefault.read(i3), (int) uncheckedColordefault.serializer(i2), uncheckedColordefault.read(i4)));
        }
        return onContentCardDismissed.PlaybackStateCompatCustomAction(androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0));
    }

    public static final hslToRgbComponent read(tintxETnrds tintxetnrds, String str, boolean z) {
        String str2;
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int i = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "seqno");
            int i2 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, com.braze.Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            int i3 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "name");
            int i4 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "desc");
            if (i != -1 && i2 != -1 && i3 != -1 && i4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                    if (((int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i2)) >= 0) {
                        int iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i);
                        String str3 = uncheckedColordefaultRemoteActionCompatParcelizer.read(i3);
                        if (uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(iSerializer), str3);
                        linkedHashMap2.put(Integer.valueOf(iSerializer), str2);
                    }
                }
                List listSerializer = onContentCardDismissed.serializer(linkedHashMap.entrySet(), new FB(1));
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                Iterator it = listSerializer.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList);
                List listSerializer2 = onContentCardDismissed.serializer(linkedHashMap2.entrySet(), new FB(2));
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer2, 10));
                Iterator it2 = listSerializer2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                hslToRgbComponent hsltorgbcomponent = new hslToRgbComponent(str, z, listPlaybackStateCompat, onContentCardDismissed.PlaybackStateCompat(arrayList2));
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
                return hsltorgbcomponent;
            }
            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                throw th2;
            }
        }
    }
}
