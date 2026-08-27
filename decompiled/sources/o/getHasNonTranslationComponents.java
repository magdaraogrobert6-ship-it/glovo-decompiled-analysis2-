package o;

import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getHasNonTranslationComponents {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final FontEj4NQ78default IconCompatParcelizer;
    public final QualtricsManagerImpl MediaBrowserCompatMediaItem;
    public final getContentViewGroupParentLayout MediaDescriptionCompat;
    public final getScreenOffsetnOccac MediaSessionCompatQueueItem;
    public final decode RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public final TextUnitType serializer;
    public final registerOnChangedCallback write;

    public getHasNonTranslationComponents(decode decodeVar, QualtricsManagerImpl qualtricsManagerImpl, getScreenOffsetnOccac getscreenoffsetnoccac, isOpenInternalroom_runtime isopeninternalroom_runtime, getContentViewGroupParentLayout getcontentviewgroupparentlayout, TextUnitType textUnitType, FontEj4NQ78default fontEj4NQ78default, registerOnChangedCallback registeronchangedcallback) {
        decodeVar.getClass();
        qualtricsManagerImpl.getClass();
        getscreenoffsetnoccac.getClass();
        isopeninternalroom_runtime.getClass();
        getcontentviewgroupparentlayout.getClass();
        textUnitType.getClass();
        fontEj4NQ78default.getClass();
        registeronchangedcallback.getClass();
        textUnitType.getClass();
        fontEj4NQ78default.getClass();
        registeronchangedcallback.getClass();
        this.serializer = textUnitType;
        this.IconCompatParcelizer = fontEj4NQ78default;
        this.write = registeronchangedcallback;
        this.RemoteActionCompatParcelizer = decodeVar;
        this.MediaBrowserCompatMediaItem = qualtricsManagerImpl;
        this.MediaSessionCompatQueueItem = getscreenoffsetnoccac;
        this.read = isopeninternalroom_runtime;
        this.MediaDescriptionCompat = getcontentviewgroupparentlayout;
    }

    public final void write(safeSetClipToOutline safesetcliptooutline) {
        boolean zSerializer;
        int i = 2 % 2;
        accessanalyzeComponents58bKbWc accessanalyzecomponents58bkbwc = (accessanalyzeComponents58bKbWc) this.write;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("quick_reply_enabled", Boolean.valueOf(!accessanalyzecomponents58bkbwc.RemoteActionCompatParcelizer().isEmpty()));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("translations_enabled", Boolean.valueOf(!((FirebaseRemoteConfigImpl) accessanalyzecomponents58bkbwc.serializer).RemoteActionCompatParcelizer().isEmpty()));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("from_enabled", ((trackThirdPartySharingI) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(611636138, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -611636136, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) accessanalyzecomponents58bkbwc.serializer})).getValue());
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("call_masking_enabled", Boolean.valueOf(((FirebaseRemoteConfigImpl) accessanalyzecomponents58bkbwc.serializer).MediaSessionCompatQueueItem()));
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) accessanalyzecomponents58bkbwc.serializer;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            int i2 = RatingCompat + 13;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            zSerializer = false;
        } else {
            zSerializer = firebaseRemoteConfigImpl.IconCompatParcelizer.serializer("is_customer_chat_error_reporting_enabled", strSerializer);
        }
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, onviewattachedtowindowlambda3, new onViewAttachedToWindowlambda0("error_reporting_enabled", Boolean.valueOf(zSerializer)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(mapRemoteActionCompatParcelizer.size()));
        Iterator it = mapRemoteActionCompatParcelizer.entrySet().iterator();
        int i4 = MediaMetadataCompat + 97;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        safesetcliptooutline.putAll(linkedHashMap);
    }
}
