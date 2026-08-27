package o;

import com.google.firebase.firestore.FirebaseFirestoreException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class checkActivityStateI implements resetStateui {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ bootstrapLifecycleI write;

    @Override // o.resetStateui
    public final void serializer(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        Map map;
        String str;
        DateTime dateTime;
        LinkedHashMap linkedHashMap;
        int i = 2 % 2;
        headToTailExclusiveui headtotailexclusiveui = (headToTailExclusiveui) obj;
        if (firebaseFirestoreException != null) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Failed to connect to Firestore", firebaseFirestoreException));
            return;
        }
        if (headtotailexclusiveui == null || headtotailexclusiveui.serializer == null) {
            return;
        }
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (headtotailexclusiveui.write.IconCompatParcelizer) {
            return;
        }
        HashMap mapWrite = headtotailexclusiveui.write();
        mapWrite.getClass();
        Object obj2 = mapWrite.get(RemoteMessageConst.DATA);
        Object obj3 = null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        Object obj4 = map2 != null ? map2.get("metadata") : null;
        String str2 = obj4 instanceof String ? (String) obj4 : null;
        if (str2 != null) {
            int i4 = read + 37;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer;
            int i6 = registerInAppMessageManagerlambda40.IconCompatParcelizer;
            map = (Map) isverticalswipeinalloweddirection.serializer(str2, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareinappmessagewithzippedassethtml, displayInAppMessagelambda1.IconCompatParcelizer(ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(String.class)), ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(String.class)))));
        } else {
            map = null;
        }
        if (map != null) {
            str = (String) map.get("created_at");
            int i7 = read + 41;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            int i9 = IconCompatParcelizer + 43;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            str = null;
        }
        if (str != null) {
            dateTime = DateTime.parse(str, ISODateTimeFormat.dateTimeParser());
            dateTime.getClass();
        } else {
            dateTime = null;
        }
        bootstrapLifecycleI bootstraplifecyclei = this.write;
        int iWrite = (int) ((FirebaseRemoteConfigImpl) bootstraplifecyclei.IconCompatParcelizer).IconCompatParcelizer.write("firestore_expiry_threshold");
        if (dateTime != null) {
            int i11 = IconCompatParcelizer + 65;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            DateTime dateTimePlusSeconds = dateTime.plusSeconds(iWrite);
            if (dateTimePlusSeconds != null) {
                int i13 = IconCompatParcelizer + 31;
                read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (dateTimePlusSeconds.isBeforeNow()) {
                    Timber.RemoteActionCompatParcelizer.write(new Throwable("Ignoring an expired push message. Message data: " + headtotailexclusiveui.write()));
                    return;
                }
            }
        }
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map2.size()));
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                int i15 = IconCompatParcelizer + 47;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    obj3.hashCode();
                    throw null;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            int i16 = IconCompatParcelizer + 61;
            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                ((getIdJ3iCeTQ) bootstraplifecyclei.write.write()).read(linkedHashMap, deleteEventMetadata.Firestore);
            } else {
                ((getIdJ3iCeTQ) bootstraplifecyclei.write.write()).read(linkedHashMap, deleteEventMetadata.Firestore);
                throw null;
            }
        }
    }
}
