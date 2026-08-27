package o;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.transition.Transition$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.sentiance.semantic_time.StationaryLabel;
import com.sentiance.tflitemodel.InferenceResult$Failure$InferenceError;
import com.sentiance.visitessentials.VisitEssentials$VEOutputIdx;
import com.sentiance.visitessentials.h$c;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.datetime.LocalDateJvmKt;
import kotlinx.datetime.TimeZone$Companion;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeImageUtils {
    public final Object IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public final Serializable MediaMetadataCompat;
    public final Serializable MediaSessionCompatQueueItem;
    public final Object MediaSessionCompatResultReceiverWrapper;
    public final Object MediaSessionCompatToken;
    public Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public boolean serializer;
    public final Object write;

    public boolean RemoteActionCompatParcelizer(android.graphics.Path path, int i) {
        android.graphics.Path path2 = (android.graphics.Path) this.MediaSessionCompatToken;
        path2.reset();
        ((getMessageannotations[]) this.IconCompatParcelizer)[i].IconCompatParcelizer(((android.graphics.Matrix[]) this.read)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, android.graphics.Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [float[], java.io.Serializable] */
    public BrazeImageUtils() {
        this.IconCompatParcelizer = new getMessageannotations[4];
        this.read = new android.graphics.Matrix[4];
        this.MediaSessionCompatResultReceiverWrapper = new android.graphics.Matrix[4];
        this.write = new PointF();
        this.RemoteActionCompatParcelizer = new android.graphics.Path();
        this.MediaDescriptionCompat = new android.graphics.Path();
        this.RatingCompat = new getMessageannotations();
        this.MediaMetadataCompat = new float[2];
        this.MediaSessionCompatQueueItem = new float[2];
        this.MediaBrowserCompatMediaItem = new android.graphics.Path();
        this.MediaSessionCompatToken = new android.graphics.Path();
        this.serializer = true;
        for (int i = 0; i < 4; i++) {
            ((getMessageannotations[]) this.IconCompatParcelizer)[i] = new getMessageannotations();
            ((android.graphics.Matrix[]) this.read)[i] = new android.graphics.Matrix();
            ((android.graphics.Matrix[]) this.MediaSessionCompatResultReceiverWrapper)[i] = new android.graphics.Matrix();
        }
    }

    /* JADX WARN: Code duplicated, block: B:349:0x09f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v24, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Iterable] */
    public r8lambda8h6ssWCgEJ40frWkOBG5qOs2t0s RemoteActionCompatParcelizer(r8lambdasH2xGkoIMJfF_ZfqITpzqxAcDU r8lambdash2xgkoimjff_zfqitpzqxacdu) {
        r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE r8lambdaqwwr0tgaeodzg9catcjjjo8rpi;
        int i;
        deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda1;
        boolean z;
        int i2;
        deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda2;
        String str;
        deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda3;
        ArrayList arrayList;
        deleteFileOrDirectorylambda0 deletefileordirectorylambda0;
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release;
        Iterator it;
        double dWrite;
        StationaryLabel stationaryLabel;
        float[] fArr;
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseRemoteActionCompatParcelizer;
        Integer num;
        Integer num2;
        Integer num3;
        Map map = (Map) this.RemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.MediaSessionCompatResultReceiverWrapper;
        r8lambdamTNG9VMm6XpcY8TjXi2Y5NHPZfM r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm = r8lambdash2xgkoimjff_zfqitpzqxacdu.a;
        r8lambdaZX2xA8csSBSphMPsG20ZD182Io r8lambdazx2xa8cssbsphmpsg20zd182io = r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.b;
        float[] fArr2 = r8lambdash2xgkoimjff_zfqitpzqxacdu.b;
        r8lambdazx2xa8cssbsphmpsg20zd182io.getClass();
        fArr2.getClass();
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.MediaDescriptionCompat;
        if (sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < 200; i3++) {
                int i4 = i3 * 8;
                arrayList2.add(new setLargeNotificationIconNameandroid_sdk_base_release(Double.parseDouble(String.valueOf(fArr2[i4])), Double.parseDouble(String.valueOf(fArr2[i4 + 1]))));
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            if (r8lambdazx2xa8cssbsphmpsg20zd182io.f == null) {
                arrayList3.add(new setLargeNotificationIconNameandroid_sdk_base_release(r8lambdazx2xa8cssbsphmpsg20zd182io.a, r8lambdazx2xa8cssbsphmpsg20zd182io.b));
            }
            List<setLargeNotificationIconNameandroid_sdk_base_release> listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(200, arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release : listIconCompatParcelizer) {
                arrayList4.add(Float.valueOf((float) setlargenotificationiconnameandroid_sdk_base_release.a));
                arrayList4.add(Float.valueOf((float) setlargenotificationiconnameandroid_sdk_base_release.b));
            }
            downloadFileToPathlambda2 downloadfiletopathlambda2Serializer = ((getAssetFileStringContents) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).serializer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{onContentCardDismissed.serializer((Collection) arrayList4)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
            if (downloadfiletopathlambda2Serializer instanceof isLocalUri) {
                List list = ((isLocalUri) downloadfiletopathlambda2Serializer).IconCompatParcelizer;
                list.getClass();
                float[] fArr3 = (float[]) list.get(0);
                ArrayList arrayList5 = new ArrayList();
                for (int i5 = 0; i5 < 200; i5++) {
                    arrayList5.add(Integer.valueOf((int) fArr3[i5]));
                }
                int iIntValue = ((Number) onContentCardDismissed.MediaDescriptionCompat((List) arrayList5)).intValue();
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList5.size();
                double size2 = 0.0d;
                double size3 = 0.0d;
                for (int i6 = 0; i6 < size; i6++) {
                    if (((Number) arrayList5.get(i6)).intValue() == iIntValue) {
                        arrayList6.add(listIconCompatParcelizer.get(i6));
                        size2 += ((setLargeNotificationIconNameandroid_sdk_base_release) listIconCompatParcelizer.get(i6)).a;
                        size3 += ((setLargeNotificationIconNameandroid_sdk_base_release) listIconCompatParcelizer.get(i6)).b;
                    }
                }
                if (!arrayList6.isEmpty()) {
                    size2 /= (double) arrayList6.size();
                    size3 /= (double) arrayList6.size();
                }
                r8lambdaqwwr0tgaeodzg9catcjjjo8rpi = new r8lambdajGYfLa__DtTjrktDQFIWwimCNA(arrayList5, new setLargeNotificationIconNameandroid_sdk_base_release(size2, size3));
            } else if (downloadfiletopathlambda2Serializer instanceof downloadFileToPathlambda6) {
                r8lambdaqwwr0tgaeodzg9catcjjjo8rpi = new r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI(((downloadFileToPathlambda6) downloadfiletopathlambda2Serializer).RemoteActionCompatParcelizer);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            if (r8lambdaqwwr0tgaeodzg9catcjjjo8rpi instanceof r8lambdajGYfLa__DtTjrktDQFIWwimCNA) {
                List<onViewAttachedToWindowlambda0> listRemoteActionCompatParcelizer = ((migrateTriggersStorageToJson) this.write).RemoteActionCompatParcelizer(((r8lambdajGYfLa__DtTjrktDQFIWwimCNA) r8lambdaqwwr0tgaeodzg9catcjjjo8rpi).serializer);
                linkedHashMap.clear();
                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : listRemoteActionCompatParcelizer) {
                    StringBuilder sb = new StringBuilder();
                    setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release = (setSdkFlavorandroid_sdk_base_release) onviewattachedtowindowlambda0.serializer;
                    String str2 = setsdkflavorandroid_sdk_base_release.b;
                    setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release2 = setsdkflavorandroid_sdk_base_release.a;
                    sb.append(str2);
                    sb.append(':');
                    sb.append(setlargenotificationiconnameandroid_sdk_base_release2.a);
                    sb.append(',');
                    sb.append(setlargenotificationiconnameandroid_sdk_base_release2.b);
                    String string = sb.toString();
                    setIsSessionStartBasedTimeoutEnabled setissessionstartbasedtimeoutenabled = (setIsSessionStartBasedTimeoutEnabled) onviewattachedtowindowlambda0.write;
                    linkedHashMap.put(string, "NearestPoint( lat/lon=" + setissessionstartbasedtimeoutenabled.a.a + ", " + setissessionstartbasedtimeoutenabled.a.b + "\tdistance=" + setissessionstartbasedtimeoutenabled.b + "\tisInPolygon=" + setissessionstartbasedtimeoutenabled.c);
                }
                r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.c = listRemoteActionCompatParcelizer;
                getAssetFileStringContents getassetfilestringcontents = (getAssetFileStringContents) this.RatingCompat;
                if (getassetfilestringcontents != null) {
                    r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM r8lambdasa7krr6xvtiu0qbxslysa6ylom = (r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM) this.MediaBrowserCompatMediaItem;
                    ArrayList arrayList7 = new ArrayList();
                    boolean z2 = r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.a;
                    r8lambdaZX2xA8csSBSphMPsG20ZD182Io r8lambdazx2xa8cssbsphmpsg20zd182io2 = r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.b;
                    arrayList7.add(new float[]{z2 ? 1.0f : 0.0f});
                    float f = r8lambdazx2xa8cssbsphmpsg20zd182io2.a;
                    setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2 = r8lambdazx2xa8cssbsphmpsg20zd182io2.c;
                    float f2 = r8lambdazx2xa8cssbsphmpsg20zd182io2.b;
                    LocalDateTime localDateTime = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2.value;
                    DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
                    dayOfWeek.getClass();
                    float fOrdinal = dayOfWeek.ordinal();
                    float hour = localDateTime.getHour();
                    Integer num4 = r8lambdazx2xa8cssbsphmpsg20zd182io2.f;
                    float fIntValue = num4 != null ? num4.intValue() : -1.0f;
                    int i7 = 5;
                    arrayList7.add(new float[]{f, f2, fOrdinal, hour, fIntValue, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth()});
                    ArrayList arrayList8 = new ArrayList();
                    int i8 = 0;
                    while (true) {
                        i = 10;
                        if (i8 >= 30) {
                            break;
                        }
                        if (i8 < r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.c.size()) {
                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) r8lambdamtng9vmm6xpcy8tjxi2y5nhpzfm.c.get(i8);
                            setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release2 = (setSdkFlavorandroid_sdk_base_release) onviewattachedtowindowlambda1.serializer;
                            setIsSessionStartBasedTimeoutEnabled setissessionstartbasedtimeoutenabled2 = (setIsSessionStartBasedTimeoutEnabled) onviewattachedtowindowlambda1.write;
                            List list2 = setsdkflavorandroid_sdk_base_release2.c;
                            ArrayList arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList9.add(((setPushDeepLinkBackStackActivityClass) it2.next()).toString());
                            }
                            r8lambdasa7krr6xvtiu0qbxslysa6ylom.getClass();
                            Map map2 = r8lambdasa7krr6xvtiu0qbxslysa6ylom.a;
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj : arrayList9) {
                                if (map2.keySet().contains((String) obj)) {
                                    arrayList10.add(obj);
                                }
                            }
                            String str3 = (String) onContentCardDismissed.MediaMetadataCompat(onContentCardDismissed.serializer(arrayList10, new h$c(0, r8lambdasa7krr6xvtiu0qbxslysa6ylom)));
                            if (str3 != null) {
                                r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) map2.get(str3);
                                num = (Integer) map.get(r8lambdab0isqpsb2j3nkxpxcm79mddzdtm != null ? r8lambdab0isqpsb2j3nkxpxcm79mddzdtm.b : null);
                            } else {
                                num = null;
                            }
                            if (str3 != null) {
                                Map map3 = r8lambdasa7krr6xvtiu0qbxslysa6ylom.c;
                                r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm2 = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) map2.get(str3);
                                num2 = (Integer) map3.get(r8lambdab0isqpsb2j3nkxpxcm79mddzdtm2 != null ? r8lambdab0isqpsb2j3nkxpxcm79mddzdtm2.e : null);
                            } else {
                                num2 = null;
                            }
                            if (str3 != null) {
                                Map map4 = r8lambdasa7krr6xvtiu0qbxslysa6ylom.b;
                                r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM r8lambdab0isqpsb2j3nkxpxcm79mddzdtm3 = (r8lambdab0ISQPsb2J3NkxPxCM79mDdZDtM) map2.get(str3);
                                num3 = (Integer) map4.get(r8lambdab0isqpsb2j3nkxpxcm79mddzdtm3 != null ? r8lambdab0isqpsb2j3nkxpxcm79mddzdtm3.d : null);
                            } else {
                                num3 = null;
                            }
                            arrayList8.add(Float.valueOf((float) setissessionstartbasedtimeoutenabled2.a.a));
                            arrayList8.add(Float.valueOf((float) setissessionstartbasedtimeoutenabled2.a.b));
                            arrayList8.add(Float.valueOf(num != null ? num.intValue() : -1.0f));
                            arrayList8.add(Float.valueOf(num2 != null ? num2.intValue() : -1.0f));
                            arrayList8.add(Float.valueOf(num3 != null ? num3.intValue() : -1.0f));
                        } else {
                            int i9 = 0;
                            for (int i10 = i7; i9 < i10; i10 = 5) {
                                arrayList8.add(Float.valueOf(-1.0f));
                                i9++;
                            }
                        }
                        i8++;
                        i7 = 5;
                    }
                    arrayList7.add(onContentCardDismissed.serializer((Collection) arrayList8));
                    arrayList7.add(fArr2);
                    downloadFileToPathlambda2 downloadfiletopathlambda2Serializer2 = getassetfilestringcontents.serializer(arrayList7);
                    if (downloadfiletopathlambda2Serializer2 instanceof isLocalUri) {
                        List list3 = ((isLocalUri) downloadfiletopathlambda2Serializer2).IconCompatParcelizer;
                        if (((setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.MediaDescriptionCompat) != null) {
                            int i11 = 0;
                            int i12 = 0;
                            for (int i13 = 200; i11 < i13; i13 = 200) {
                                int i14 = i11 * 8;
                                float f3 = fArr2[i14];
                                float f4 = fArr2[i14 + 1];
                                if (f3 != 0.0f || f4 != 0.0f) {
                                    i12++;
                                }
                                i11++;
                            }
                            list3.getClass();
                            boolean z3 = ((float[]) list3.get(VisitEssentials$VEOutputIdx.HOME.ordinal()))[0] == 1.0f;
                            boolean z4 = ((float[]) list3.get(VisitEssentials$VEOutputIdx.WORK.ordinal()))[0] == 1.0f;
                            ArrayList<ContentCardAdapterExternalSyntheticLambda0> arrayList11 = new ArrayList();
                            int iOrdinal = VisitEssentials$VEOutputIdx.PRED_HISTORY.ordinal();
                            for (int i15 = 0; i15 < 200; i15++) {
                                int i16 = i15 * 3;
                                arrayList11.add(new ContentCardAdapterExternalSyntheticLambda0(Integer.valueOf((int) ((float[]) list3.get(iOrdinal))[i16]), Integer.valueOf((int) ((float[]) list3.get(iOrdinal))[i16 + 1]), Integer.valueOf((int) ((float[]) list3.get(iOrdinal))[i16 + 2])));
                            }
                            int i17 = (int) ((float[]) list3.get(VisitEssentials$VEOutputIdx.VENUE_TYPE_IDX.ordinal()))[0];
                            List listWrite = onContentCardClicked.write((float[]) list3.get(VisitEssentials$VEOutputIdx.VENUE_TYPE_PROB.ordinal()));
                            boolean z5 = i12 >= 10;
                            boolean z6 = z5 ? z3 : false;
                            boolean z7 = z5 ? z4 : false;
                            if (z3 || z4) {
                                i17 = Integer.MAX_VALUE;
                            }
                            if (((setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) this.MediaDescriptionCompat) != null) {
                                VisitEssentials$VEOutputIdx visitEssentials$VEOutputIdx = VisitEssentials$VEOutputIdx.NEW_STATE;
                                float[] fArr4 = (float[]) list3.get(visitEssentials$VEOutputIdx.ordinal());
                                fArr4.getClass();
                                ArrayList arrayList12 = new ArrayList();
                                getGraphicModalMaxHeightDp.Companion.getClass();
                                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                                zoneIdSystemDefault.getClass();
                                getGraphicModalMaxHeightDp getgraphicmodalmaxheightdpIconCompatParcelizer = TimeZone$Companion.IconCompatParcelizer(zoneIdSystemDefault);
                                int i18 = 0;
                                while (i18 < 200) {
                                    int i19 = i18 * 8;
                                    float f5 = fArr4[i19];
                                    float f6 = fArr4[i19 + 1];
                                    float f7 = fArr4[i19 + 3];
                                    List list4 = list3;
                                    int i20 = (int) f7;
                                    VisitEssentials$VEOutputIdx visitEssentials$VEOutputIdx2 = visitEssentials$VEOutputIdx;
                                    int i21 = (int) ((f7 - i20) * 60.0f);
                                    int i22 = (int) fArr4[i19 + 4];
                                    List list5 = listWrite;
                                    int i23 = (int) fArr4[i19 + 5];
                                    boolean z8 = z7;
                                    int i24 = (int) fArr4[i19 + 6];
                                    int i25 = (int) fArr4[i19 + 7];
                                    if (i23 <= 0 || i24 <= 0 || i25 <= 0) {
                                        fArr = fArr4;
                                    } else {
                                        fArr = fArr4;
                                        try {
                                            setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release3 = new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(i23, i24, i25, i20, i21);
                                            if (i22 == -1) {
                                                setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseRemoteActionCompatParcelizer = null;
                                            } else {
                                                setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskippedSerializer = TimeZoneKt.serializer(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release3, getgraphicmodalmaxheightdpIconCompatParcelizer);
                                                unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                                setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseRemoteActionCompatParcelizer = TimeZoneKt.RemoteActionCompatParcelizer(setshouldnextunregisterbeskippedSerializer.write(coil3.UriKt.RemoteActionCompatParcelizer(i22, setUnregisteredInAppMessage.MINUTES)), getgraphicmodalmaxheightdpIconCompatParcelizer);
                                            }
                                            arrayList12.add(new r8lambdaZX2xA8csSBSphMPsG20ZD182Io(f5, f6, setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release3, setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseRemoteActionCompatParcelizer));
                                        } catch (Exception unused) {
                                        }
                                    }
                                    i18++;
                                    list3 = list4;
                                    visitEssentials$VEOutputIdx = visitEssentials$VEOutputIdx2;
                                    fArr4 = fArr;
                                    listWrite = list5;
                                    z7 = z8;
                                    i = 10;
                                }
                                VisitEssentials$VEOutputIdx visitEssentials$VEOutputIdx3 = visitEssentials$VEOutputIdx;
                                List list6 = list3;
                                boolean z9 = z7;
                                List list7 = listWrite;
                                ArrayList arrayList13 = new ArrayList(accessgetInstancedelegatecp.write(arrayList11, i));
                                for (ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0 : arrayList11) {
                                    if (((Number) contentCardAdapterExternalSyntheticLambda0.serializer).intValue() == 1) {
                                        stationaryLabel = StationaryLabel.HOME;
                                    } else if (((Number) contentCardAdapterExternalSyntheticLambda0.RemoteActionCompatParcelizer).intValue() == 1) {
                                        stationaryLabel = StationaryLabel.WORK;
                                    } else {
                                        stationaryLabel = StationaryLabel.OTHER;
                                    }
                                    arrayList13.add(stationaryLabel);
                                }
                                deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda4 = downloadFileToPathdefault.IconCompatParcelizer;
                                ArrayList<deleteFileOrDirectory> arrayList14 = new ArrayList();
                                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 : onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList12, (Iterable) arrayList13)) {
                                    r8lambdaZX2xA8csSBSphMPsG20ZD182Io r8lambdazx2xa8cssbsphmpsg20zd182io3 = (r8lambdaZX2xA8csSBSphMPsG20ZD182Io) onviewattachedtowindowlambda2.serializer;
                                    StationaryLabel stationaryLabel2 = (StationaryLabel) onviewattachedtowindowlambda2.write;
                                    setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release4 = r8lambdazx2xa8cssbsphmpsg20zd182io3.d;
                                    if (setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release4 != null) {
                                        arrayList14.add(new deleteFileOrDirectory(r8lambdazx2xa8cssbsphmpsg20zd182io3.c, setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release4, stationaryLabel2));
                                    }
                                }
                                deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda5 = downloadFileToPathdefault.IconCompatParcelizer;
                                ArrayList arrayList15 = new ArrayList();
                                for (deleteFileOrDirectory deletefileordirectory : arrayList14) {
                                    setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release5 = deletefileordirectory.read;
                                    setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release6 = deletefileordirectory.IconCompatParcelizer;
                                    getGraphicModalMaxHeightDp.Companion.getClass();
                                    InAppMessageManagerBaseExternalSyntheticLambda2 inAppMessageManagerBaseExternalSyntheticLambda2 = getGraphicModalMaxHeightDp.UTC;
                                    setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskippedSerializer2 = TimeZoneKt.serializer(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release5, inAppMessageManagerBaseExternalSyntheticLambda2);
                                    unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                                    setUnregisteredInAppMessage setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    LocalDate localDate = TimeZoneKt.RemoteActionCompatParcelizer(setshouldnextunregisterbeskippedSerializer2.write(BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(coil3.UriKt.RemoteActionCompatParcelizer(3, setunregisteredinappmessage))), inAppMessageManagerBaseExternalSyntheticLambda2).value.toLocalDate();
                                    localDate.getClass();
                                    InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1 = new InAppMessageManagerBaseExternalSyntheticLambda1(localDate);
                                    LocalDate localDate2 = TimeZoneKt.RemoteActionCompatParcelizer(TimeZoneKt.serializer(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release6, inAppMessageManagerBaseExternalSyntheticLambda2).write(coil3.UriKt.RemoteActionCompatParcelizer(3, setunregisteredinappmessage)), inAppMessageManagerBaseExternalSyntheticLambda2).value.toLocalDate();
                                    localDate2.getClass();
                                    InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda3 = new InAppMessageManagerBaseExternalSyntheticLambda1(localDate2);
                                    while (inAppMessageManagerBaseExternalSyntheticLambda1.value.compareTo((ChronoLocalDate) inAppMessageManagerBaseExternalSyntheticLambda3.value) <= 0) {
                                        setCustomHtmlInAppMessageActionListener.Companion.getClass();
                                        setCustomInAppMessageAnimationFactory setcustominappmessageanimationfactory = setCustomHtmlInAppMessageActionListener.DAY;
                                        InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1Serializer = LocalDateJvmKt.serializer(inAppMessageManagerBaseExternalSyntheticLambda1, 1L, setcustominappmessageanimationfactory);
                                        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseSerializer = downloadFileToPathlambda1.serializer(inAppMessageManagerBaseExternalSyntheticLambda1, new deleteSharedPreferencesFilelambda0(3, 0));
                                        int i26 = i17;
                                        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseSerializer2 = downloadFileToPathlambda1.serializer(LocalDateJvmKt.serializer(inAppMessageManagerBaseExternalSyntheticLambda1, 1L, setcustominappmessageanimationfactory), new deleteSharedPreferencesFilelambda0(3, 0));
                                        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release7 = deletefileordirectory.read;
                                        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release7.getClass();
                                        if (setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseSerializer.value.compareTo((ChronoLocalDateTime<?>) setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release6.value) <= 0 && setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_releaseSerializer2.value.compareTo((ChronoLocalDateTime<?>) setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release7.value) >= 0) {
                                            arrayList15.add(new deleteFileOrDirectorylambda0(deletefileordirectory, inAppMessageManagerBaseExternalSyntheticLambda1));
                                        }
                                        inAppMessageManagerBaseExternalSyntheticLambda1 = inAppMessageManagerBaseExternalSyntheticLambda1Serializer;
                                        i17 = i26;
                                    }
                                }
                                int i27 = i17;
                                ArrayList arrayList16 = new ArrayList(accessgetInstancedelegatecp.write(arrayList15, 10));
                                Iterator it3 = arrayList15.iterator();
                                while (it3.hasNext()) {
                                    arrayList16.add(((deleteFileOrDirectorylambda0) it3.next()).read);
                                }
                                List<InAppMessageManagerBaseExternalSyntheticLambda1> listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(arrayList16));
                                ArrayList arrayList17 = new ArrayList();
                                for (InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda4 : listPlaybackStateCompat) {
                                    ?? arrayList18 = new ArrayList();
                                    for (Object obj2 : arrayList15) {
                                        if (((deleteFileOrDirectorylambda0) obj2).read.equals(inAppMessageManagerBaseExternalSyntheticLambda4)) {
                                            arrayList18.add(obj2);
                                        }
                                    }
                                    if (!arrayList18.isEmpty()) {
                                        Iterator it4 = arrayList18.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (((deleteFileOrDirectorylambda0) it4.next()).serializer == StationaryLabel.HOME) {
                                                    if (!arrayList18.isEmpty()) {
                                                        Iterator it5 = arrayList18.iterator();
                                                        do {
                                                            if (it5.hasNext()) {
                                                            }
                                                        } while (((deleteFileOrDirectorylambda0) it5.next()).serializer != StationaryLabel.WORK);
                                                    }
                                                }
                                            }
                                            arrayList18 = instance_delegatelambda0.write;
                                            break;
                                            break;
                                        }
                                    }
                                    arrayList18 = instance_delegatelambda0.write;
                                    break;
                                    onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList18, (Collection) arrayList17);
                                }
                                ArrayList arrayList19 = new ArrayList(accessgetInstancedelegatecp.write(arrayList17, 10));
                                Iterator it6 = arrayList17.iterator();
                                while (it6.hasNext()) {
                                    arrayList19.add(((deleteFileOrDirectorylambda0) it6.next()).read);
                                }
                                if (onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(arrayList19)).size() >= 5) {
                                    ArrayList arrayList20 = new ArrayList();
                                    ArrayList arrayList21 = new ArrayList();
                                    ArrayList arrayList22 = new ArrayList();
                                    ArrayList arrayList23 = new ArrayList();
                                    ArrayList arrayList24 = new ArrayList(accessgetInstancedelegatecp.write(arrayList17, 10));
                                    Iterator it7 = arrayList17.iterator();
                                    while (it7.hasNext()) {
                                        arrayList24.add(((deleteFileOrDirectorylambda0) it7.next()).read);
                                    }
                                    Iterator it8 = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(arrayList24)).iterator();
                                    while (it8.hasNext()) {
                                        InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda5 = (InAppMessageManagerBaseExternalSyntheticLambda1) it8.next();
                                        ArrayList<deleteFileOrDirectorylambda0> arrayList25 = new ArrayList();
                                        for (Object obj3 : arrayList17) {
                                            if (((deleteFileOrDirectorylambda0) obj3).read.equals(inAppMessageManagerBaseExternalSyntheticLambda5)) {
                                                arrayList25.add(obj3);
                                            }
                                        }
                                        inAppMessageManagerBaseExternalSyntheticLambda5.getClass();
                                        Iterator it9 = arrayList25.iterator();
                                        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8 = null;
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                deletesharedpreferencesfilelambda3 = deletesharedpreferencesfilelambda5;
                                                break;
                                            }
                                            deleteFileOrDirectorylambda0 deletefileordirectorylambda1 = (deleteFileOrDirectorylambda0) it9.next();
                                            StationaryLabel stationaryLabel3 = deletefileordirectorylambda1.serializer;
                                            deletesharedpreferencesfilelambda3 = deletesharedpreferencesfilelambda5;
                                            if (stationaryLabel3 == StationaryLabel.HOME) {
                                                setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8 = deletefileordirectorylambda1.IconCompatParcelizer;
                                            }
                                            if (stationaryLabel3 == StationaryLabel.WORK) {
                                                break;
                                            }
                                            deletesharedpreferencesfilelambda5 = deletesharedpreferencesfilelambda3;
                                        }
                                        if (setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8 == null) {
                                            for (deleteFileOrDirectorylambda0 deletefileordirectorylambda2 : arrayList25) {
                                                StationaryLabel stationaryLabel4 = deletefileordirectorylambda2.serializer;
                                                StationaryLabel stationaryLabel5 = StationaryLabel.WORK;
                                                if (stationaryLabel4 != stationaryLabel5) {
                                                    setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8 = deletefileordirectorylambda2.IconCompatParcelizer;
                                                }
                                                if (stationaryLabel4 == stationaryLabel5) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8 == null) {
                                            setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8 = ((deleteFileOrDirectorylambda0) onContentCardDismissed.IconCompatParcelizer((Iterable) arrayList25)).RemoteActionCompatParcelizer;
                                        }
                                        double dWrite2 = downloadFileToPathlambda3.write(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release8, inAppMessageManagerBaseExternalSyntheticLambda5);
                                        Iterator it10 = arrayList25.iterator();
                                        deleteFileOrDirectorylambda0 deletefileordirectorylambda3 = null;
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                arrayList = arrayList17;
                                                break;
                                            }
                                            deleteFileOrDirectorylambda0 deletefileordirectorylambda4 = (deleteFileOrDirectorylambda0) it10.next();
                                            Iterator it11 = it10;
                                            StationaryLabel stationaryLabel6 = deletefileordirectorylambda4.serializer;
                                            arrayList = arrayList17;
                                            StationaryLabel stationaryLabel7 = StationaryLabel.HOME;
                                            if (stationaryLabel6 == stationaryLabel7) {
                                                deletefileordirectorylambda3 = deletefileordirectorylambda4;
                                            }
                                            if (stationaryLabel6 == StationaryLabel.WORK || (deletefileordirectorylambda3 != null && stationaryLabel6 != stationaryLabel7)) {
                                                break;
                                            }
                                            it10 = it11;
                                            arrayList17 = arrayList;
                                        }
                                        if (deletefileordirectorylambda3 != null) {
                                            dWrite2 = downloadFileToPathlambda3.write(deletefileordirectorylambda3.IconCompatParcelizer, inAppMessageManagerBaseExternalSyntheticLambda5);
                                        }
                                        Iterator it12 = arrayList25.iterator();
                                        while (true) {
                                            if (it12.hasNext()) {
                                                deletefileordirectorylambda0 = (deleteFileOrDirectorylambda0) it12.next();
                                                StationaryLabel stationaryLabel8 = deletefileordirectorylambda0.serializer;
                                                Iterator it13 = it12;
                                                setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = deletefileordirectorylambda0.IconCompatParcelizer;
                                                it = it8;
                                                if (stationaryLabel8 == StationaryLabel.WORK) {
                                                    break;
                                                }
                                                it12 = it13;
                                                it8 = it;
                                            } else {
                                                DrawableTransformation.write("Collection contains no element matching the predicate.");
                                                return null;
                                            }
                                        }
                                        Iterator it14 = arrayList25.iterator();
                                        boolean z10 = false;
                                        Object obj4 = null;
                                        while (it14.hasNext()) {
                                            Object next = it14.next();
                                            it14 = it14;
                                            i27 = i27;
                                            if (((deleteFileOrDirectorylambda0) next).serializer == StationaryLabel.WORK) {
                                                obj4 = next;
                                                z10 = true;
                                            }
                                        }
                                        int i28 = i27;
                                        if (z10) {
                                            if (deletefileordirectorylambda0.equals((deleteFileOrDirectorylambda0) obj4)) {
                                                dWrite = (downloadFileToPathlambda3.write(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, inAppMessageManagerBaseExternalSyntheticLambda5) + downloadFileToPathlambda3.write(deletefileordirectorylambda0.RemoteActionCompatParcelizer, inAppMessageManagerBaseExternalSyntheticLambda5)) / 2.0d;
                                            } else {
                                                dWrite = downloadFileToPathlambda3.write(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, inAppMessageManagerBaseExternalSyntheticLambda5);
                                            }
                                            Iterator it15 = arrayList25.iterator();
                                            Object obj5 = null;
                                            boolean z11 = false;
                                            while (it15.hasNext()) {
                                                Object next2 = it15.next();
                                                it15 = it15;
                                                if (((deleteFileOrDirectorylambda0) next2).serializer == StationaryLabel.WORK) {
                                                    obj5 = next2;
                                                    z11 = true;
                                                }
                                            }
                                            if (z11) {
                                                double dWrite3 = downloadFileToPathlambda3.write(((deleteFileOrDirectorylambda0) obj5).IconCompatParcelizer, inAppMessageManagerBaseExternalSyntheticLambda5);
                                                Iterator it16 = arrayList25.iterator();
                                                Object obj6 = null;
                                                boolean z12 = false;
                                                while (it16.hasNext()) {
                                                    Object next3 = it16.next();
                                                    it16 = it16;
                                                    z6 = z6;
                                                    if (((deleteFileOrDirectorylambda0) next3).serializer != StationaryLabel.HOME) {
                                                        obj6 = next3;
                                                        z12 = true;
                                                    }
                                                }
                                                boolean z13 = z6;
                                                if (z12) {
                                                    deleteFileOrDirectorylambda0 deletefileordirectorylambda5 = (deleteFileOrDirectorylambda0) obj6;
                                                    Iterator it17 = arrayList25.iterator();
                                                    boolean z14 = false;
                                                    Object obj7 = null;
                                                    while (it17.hasNext()) {
                                                        Object next4 = it17.next();
                                                        it17 = it17;
                                                        if (((deleteFileOrDirectorylambda0) next4).serializer == StationaryLabel.HOME) {
                                                            obj7 = next4;
                                                            z14 = true;
                                                        }
                                                    }
                                                    if (z14) {
                                                        double dMax = Math.max(downloadFileToPathlambda3.write(deletefileordirectorylambda5.IconCompatParcelizer, inAppMessageManagerBaseExternalSyntheticLambda5), downloadFileToPathlambda3.write(((deleteFileOrDirectorylambda0) obj7).RemoteActionCompatParcelizer, inAppMessageManagerBaseExternalSyntheticLambda5));
                                                        arrayList20.add(Double.valueOf(dWrite2));
                                                        arrayList21.add(Double.valueOf(dWrite));
                                                        arrayList22.add(Double.valueOf(dWrite3));
                                                        arrayList23.add(Double.valueOf(dMax));
                                                        deletesharedpreferencesfilelambda5 = deletesharedpreferencesfilelambda3;
                                                        arrayList17 = arrayList;
                                                        it8 = it;
                                                        i27 = i28;
                                                        z6 = z13;
                                                    } else {
                                                        DrawableTransformation.write("Collection contains no element matching the predicate.");
                                                        return null;
                                                    }
                                                } else {
                                                    DrawableTransformation.write("Collection contains no element matching the predicate.");
                                                    return null;
                                                }
                                            } else {
                                                DrawableTransformation.write("Collection contains no element matching the predicate.");
                                                return null;
                                            }
                                        } else {
                                            DrawableTransformation.write("Collection contains no element matching the predicate.");
                                            return null;
                                        }
                                    }
                                    deletesharedpreferencesfilelambda1 = deletesharedpreferencesfilelambda5;
                                    z = z6;
                                    i2 = i27;
                                    double dRemoteActionCompatParcelizer = downloadFileToPathlambda3.RemoteActionCompatParcelizer(arrayList20);
                                    double dRemoteActionCompatParcelizer2 = downloadFileToPathlambda3.RemoteActionCompatParcelizer(arrayList21);
                                    double dRemoteActionCompatParcelizer3 = downloadFileToPathlambda3.RemoteActionCompatParcelizer(arrayList22);
                                    double dRemoteActionCompatParcelizer4 = downloadFileToPathlambda3.RemoteActionCompatParcelizer(arrayList23);
                                    double d = (dRemoteActionCompatParcelizer + dRemoteActionCompatParcelizer2) / 2.0d;
                                    double d2 = (dRemoteActionCompatParcelizer2 + dRemoteActionCompatParcelizer3) / ((downloadFileToPathdefault.serializer + downloadFileToPathdefault.write) / downloadFileToPathdefault.read);
                                    double d3 = (d2 + dRemoteActionCompatParcelizer3) / 2.0d;
                                    if (dRemoteActionCompatParcelizer <= d && d <= dRemoteActionCompatParcelizer2 && dRemoteActionCompatParcelizer2 <= d2 && d2 <= d3 && d3 <= dRemoteActionCompatParcelizer3 && dRemoteActionCompatParcelizer3 <= dRemoteActionCompatParcelizer4) {
                                        deletesharedpreferencesfilelambda2 = new deleteSharedPreferencesFilelambda1(downloadFileToPathlambda3.serializer(dRemoteActionCompatParcelizer), downloadFileToPathlambda3.serializer(d), downloadFileToPathlambda3.serializer(dRemoteActionCompatParcelizer2), downloadFileToPathlambda3.serializer(d2), downloadFileToPathlambda3.serializer(d3), downloadFileToPathlambda3.serializer(dRemoteActionCompatParcelizer3), downloadFileToPathlambda3.serializer(dRemoteActionCompatParcelizer4));
                                    }
                                    str = (String) onContentCardDismissed.read(i2, onContentCardDismissed.PlaybackStateCompat(map.keySet()));
                                    if (str == null) {
                                        str = SystemUtils.UNKNOWN;
                                    }
                                    return new r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA(new decodeSampledBitmapFromStream(z, z9, str, list7, linkedHashMap, deletesharedpreferencesfilelambda2), (float[]) list6.get(visitEssentials$VEOutputIdx3.ordinal()));
                                }
                                deletesharedpreferencesfilelambda1 = deletesharedpreferencesfilelambda5;
                                z = z6;
                                i2 = i27;
                                deletesharedpreferencesfilelambda2 = deletesharedpreferencesfilelambda1;
                                str = (String) onContentCardDismissed.read(i2, onContentCardDismissed.PlaybackStateCompat(map.keySet()));
                                if (str == null) {
                                    str = SystemUtils.UNKNOWN;
                                }
                                return new r8lambdaSsCf132VhiMWNtAeD6ps3DRTWA(new decodeSampledBitmapFromStream(z, z9, str, list7, linkedHashMap, deletesharedpreferencesfilelambda2), (float[]) list6.get(visitEssentials$VEOutputIdx3.ordinal()));
                            }
                            removeNodeAtDepth.serializer("locationClustering");
                            throw null;
                        }
                        removeNodeAtDepth.serializer("locationClustering");
                        throw null;
                    }
                    if (downloadfiletopathlambda2Serializer2 instanceof downloadFileToPathlambda6) {
                        InferenceResult$Failure$InferenceError inferenceResult$Failure$InferenceError = ((downloadFileToPathlambda6) downloadfiletopathlambda2Serializer2).RemoteActionCompatParcelizer;
                        return new r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA(new r8lambdaeD0hINKsFSncb2CH40qanlgo5o0(inferenceResult$Failure$InferenceError), inferenceResult$Failure$InferenceError.name());
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                removeNodeAtDepth.serializer("visitEssentialsWrapper");
                throw null;
            }
            if (r8lambdaqwwr0tgaeodzg9catcjjjo8rpi instanceof r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI) {
                return new r8lambdaDIZK_xRmChWlR9wiQgM2lROAdiA(new r8lambdaeD0hINKsFSncb2CH40qanlgo5o0(((r8lambdaQwWR0TgAeOdzG9caTCJjJO8rPI) r8lambdaqwwr0tgaeodzg9catcjjjo8rpi).serializer), "Failure during Clustering.");
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        removeNodeAtDepth.serializer("locationClustering");
        throw null;
    }

    public void IconCompatParcelizer(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException, float f, RectF rectF, PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, android.graphics.Path path) {
        int i;
        Transition$1 transition$1;
        android.graphics.Path path2;
        android.graphics.Path path3;
        char c;
        SimplePlacementScope simplePlacementScope;
        timesUQTWf7w timesuqtwf7w;
        BrazeImageUtils brazeImageUtils = this;
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException2 = subcomposeLayoutPausableCompositionException;
        pinnableContainerKtLocalPinnableContainer1 = pinnableContainerKtLocalPinnableContainer1;
        android.graphics.Path path4 = path;
        android.graphics.Matrix[] matrixArr = (android.graphics.Matrix[]) brazeImageUtils.MediaSessionCompatResultReceiverWrapper;
        float[] fArr = (float[]) brazeImageUtils.MediaMetadataCompat;
        getMessageannotations[] getmessageannotationsArr = (getMessageannotations[]) brazeImageUtils.IconCompatParcelizer;
        android.graphics.Matrix[] matrixArr2 = (android.graphics.Matrix[]) brazeImageUtils.read;
        path.rewind();
        android.graphics.Path path5 = (android.graphics.Path) brazeImageUtils.RemoteActionCompatParcelizer;
        path5.rewind();
        android.graphics.Path path6 = (android.graphics.Path) brazeImageUtils.MediaDescriptionCompat;
        path6.rewind();
        path6.addRect(rectF, android.graphics.Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) brazeImageUtils.write;
            if (i2 == 1) {
                simplePlacementScope = subcomposeLayoutPausableCompositionException2.read;
            } else if (i2 == 2) {
                simplePlacementScope = subcomposeLayoutPausableCompositionException2.write;
            } else if (i2 != 3) {
                simplePlacementScope = subcomposeLayoutPausableCompositionException2.PlaybackStateCompat;
            } else {
                simplePlacementScope = subcomposeLayoutPausableCompositionException2.MediaDescriptionCompat;
            }
            if (i2 == 1) {
                timesuqtwf7w = subcomposeLayoutPausableCompositionException2.IconCompatParcelizer;
            } else if (i2 == 2) {
                timesuqtwf7w = subcomposeLayoutPausableCompositionException2.RemoteActionCompatParcelizer;
            } else if (i2 != 3) {
                timesuqtwf7w = subcomposeLayoutPausableCompositionException2.PlaybackStateCompatCustomAction;
            } else {
                timesuqtwf7w = subcomposeLayoutPausableCompositionException2.MediaMetadataCompat;
            }
            getMessageannotations getmessageannotations = getmessageannotationsArr[i2];
            timesuqtwf7w.getClass();
            android.graphics.Path path7 = path5;
            timesuqtwf7w.write(getmessageannotations, f, simplePlacementScope.write(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            getMessageannotations getmessageannotations2 = getmessageannotationsArr[i2];
            fArr[0] = getmessageannotations2.read;
            fArr[1] = getmessageannotations2.serializer;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
            path5 = path7;
        }
        android.graphics.Path path8 = path5;
        char c2 = 0;
        int i4 = 0;
        while (i4 < i) {
            getMessageannotations getmessageannotations3 = getmessageannotationsArr[i4];
            getmessageannotations3.getClass();
            fArr[c2] = 0.0f;
            fArr[1] = getmessageannotations3.MediaMetadataCompat;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path4.moveTo(fArr[c2], fArr[1]);
            } else {
                path4.lineTo(fArr[c2], fArr[1]);
            }
            getmessageannotationsArr[i4].IconCompatParcelizer(matrixArr2[i4], path4);
            if (pinnableContainerKtLocalPinnableContainer1 != null) {
                getMessageannotations getmessageannotations4 = getmessageannotationsArr[i4];
                android.graphics.Matrix matrix = matrixArr2[i4];
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = (SubcomposeSlotReusePolicy) pinnableContainerKtLocalPinnableContainer1.serializer;
                BitSet bitSet = subcomposeSlotReusePolicy.getActivityResultRegistry;
                getmessageannotations4.getClass();
                bitSet.set(i4, false);
                getMessage[] getmessageArr = subcomposeSlotReusePolicy.getDefaultViewModelCreationExtras;
                getmessageannotations4.serializer(getmessageannotations4.IconCompatParcelizer);
                getmessageArr[i4] = new operationsList(new ArrayList(getmessageannotations4.MediaDescriptionCompat), new android.graphics.Matrix(matrix));
            }
            android.graphics.Path path9 = (android.graphics.Path) brazeImageUtils.MediaBrowserCompatMediaItem;
            getMessageannotations getmessageannotations5 = (getMessageannotations) brazeImageUtils.RatingCompat;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            getMessageannotations getmessageannotations6 = getmessageannotationsArr[i4];
            fArr[0] = getmessageannotations6.read;
            fArr[1] = getmessageannotations6.serializer;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) brazeImageUtils.MediaSessionCompatQueueItem;
            getMessageannotations getmessageannotations7 = getmessageannotationsArr[i6];
            getmessageannotations7.getClass();
            fArr2[0] = 0.0f;
            fArr2[1] = getmessageannotations7.MediaMetadataCompat;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            getMessageannotations getmessageannotations8 = getmessageannotationsArr[i4];
            fArr[0] = getmessageannotations8.read;
            fArr[1] = getmessageannotations8.serializer;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            getmessageannotations5.write(0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                transition$1 = subcomposeLayoutPausableCompositionException2.serializer;
            } else if (i4 == 2) {
                transition$1 = subcomposeLayoutPausableCompositionException2.MediaSessionCompatQueueItem;
            } else if (i4 != 3) {
                transition$1 = subcomposeLayoutPausableCompositionException2.RatingCompat;
            } else {
                transition$1 = subcomposeLayoutPausableCompositionException2.MediaBrowserCompatMediaItem;
            }
            transition$1.getClass();
            getmessageannotations5.serializer(fMax, 0.0f);
            path9.reset();
            getmessageannotations5.IconCompatParcelizer(matrixArr[i4], path9);
            if (brazeImageUtils.serializer && (brazeImageUtils.RemoteActionCompatParcelizer(path9, i4) || brazeImageUtils.RemoteActionCompatParcelizer(path9, i6))) {
                path9.op(path9, path6, android.graphics.Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = getmessageannotations5.MediaMetadataCompat;
                matrixArr[i4].mapPoints(fArr);
                path2 = path8;
                path2.moveTo(fArr[0], fArr[1]);
                getmessageannotations5.IconCompatParcelizer(matrixArr[i4], path2);
                path3 = path;
            } else {
                path2 = path8;
                path3 = path;
                getmessageannotations5.IconCompatParcelizer(matrixArr[i4], path3);
            }
            if (pinnableContainerKtLocalPinnableContainer1 != 0) {
                android.graphics.Matrix matrix2 = matrixArr[i4];
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = (SubcomposeSlotReusePolicy) pinnableContainerKtLocalPinnableContainer1.serializer;
                c = 0;
                subcomposeSlotReusePolicy2.getActivityResultRegistry.set(i4 + 4, false);
                getMessage[] getmessageArr2 = subcomposeSlotReusePolicy2.getViewModelStore;
                getmessageannotations5.serializer(getmessageannotations5.IconCompatParcelizer);
                getmessageArr2[i4] = new operationsList(new ArrayList(getmessageannotations5.MediaDescriptionCompat), new android.graphics.Matrix(matrix2));
            } else {
                c = 0;
            }
            brazeImageUtils = this;
            c2 = c;
            i4 = i5;
            path4 = path3;
            path8 = path2;
            i = 4;
            subcomposeLayoutPausableCompositionException2 = subcomposeLayoutPausableCompositionException;
        }
        android.graphics.Path path10 = path4;
        android.graphics.Path path11 = path8;
        path.close();
        path11.close();
        if (path11.isEmpty()) {
            return;
        }
        path10.op(path11, android.graphics.Path.Op.UNION);
    }

    public BrazeImageUtils(migrateTriggersStorageToJson migratetriggersstoragetojson, r8lambda8ySpy9Wx6YDdbRlRNNOrt8CXa9g r8lambda8yspy9wx6yddbrlrnnort8cxa9g) {
        migratetriggersstoragetojson.getClass();
        this.IconCompatParcelizer = r8lambda8yspy9wx6yddbrlrnnort8cxa9g;
        this.read = new LinkedHashMap();
        this.write = migratetriggersstoragetojson;
        this.MediaMetadataCompat = "VisitEssentials";
        this.MediaSessionCompatQueueItem = "LocationClustering";
        r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM r8lambdasa7krr6xvtiu0qbxslysa6ylom = r8lambdaqWHh_D9OmwtkJ21CJOYxsvMqaVc.serializer;
        Map map = r8lambdasa7krr6xvtiu0qbxslysa6ylom.a;
        Map map2 = r8lambdasa7krr6xvtiu0qbxslysa6ylom.b;
        Map map3 = r8lambdasa7krr6xvtiu0qbxslysa6ylom.c;
        map.getClass();
        map2.getClass();
        map3.getClass();
        r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM r8lambdasa7krr6xvtiu0qbxslysa6ylom2 = new r8lambdaSA7KRr6XvTIu0qbXsLySA6yLoM(map, map2, map3);
        this.MediaBrowserCompatMediaItem = r8lambdasa7krr6xvtiu0qbxslysa6ylom2;
        this.MediaSessionCompatResultReceiverWrapper = new LinkedHashMap();
        this.MediaSessionCompatToken = androidx.sqlite.SQLite.read(new isRemoteUri("VisitEssentials", "default", 2, 0), new isRemoteUri("LocationClustering", "default", 1, 0));
        this.RemoteActionCompatParcelizer = r8lambdasa7krr6xvtiu0qbxslysa6ylom2.write();
    }
}
