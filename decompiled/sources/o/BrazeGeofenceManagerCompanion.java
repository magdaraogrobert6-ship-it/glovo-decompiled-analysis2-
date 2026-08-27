package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.location.Location;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "WrongWayDrivingEvaluator")
public final class BrazeGeofenceManagerCompanion {
    private final parseLonglambda0 IconCompatParcelizer;
    private final storeRegisteredGeofencesToLocalStoragelambda0 RemoteActionCompatParcelizer;
    private final ConfigurationManager serializer;
    private final DataStoreProvidereExternalSyntheticLambda0 write;

    private static ArrayList IconCompatParcelizer(Banner banner, Banner banner2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : banner.entrySet()) {
            if (((Boolean) banner2.get(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            List<initBanner> list = (List) entry2.getValue();
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (initBanner initbanner : list) {
                arrayList2.add(new ContentCardAdapterExternalSyntheticLambda0(str, new r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0(initbanner.read(), initbanner.RemoteActionCompatParcelizer()), Long.valueOf(initbanner.IconCompatParcelizer())));
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList2, (Collection) arrayList);
        }
        return arrayList;
    }

    public final List write(ArrayList arrayList) {
        Float fIconCompatParcelizer;
        parseLonglambda0 parselonglambda0;
        this = this;
        int size = arrayList.size();
        parseLonglambda0 parselonglambda1 = this.IconCompatParcelizer;
        if (size < 2) {
            parselonglambda1.serializer("Not enough waypoints to evaluate wrong way driving.", new Object[0]);
            return null;
        }
        IBannerView iBannerView = new IBannerView(this.write);
        Banner banner = new Banner(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.sentiance.sdk.drivinginsights.wrongwaydrivingdetection.WrongWayDrivingEvaluator$getWrongWayDrivingEvents$violationData$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return new ArrayList();
            }
        }, 1, null);
        Banner banner2 = new Banner(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.sentiance.sdk.drivinginsights.wrongwaydrivingdetection.WrongWayDrivingEvaluator$getWrongWayDrivingEvents$violationFlags$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return Boolean.TRUE;
            }
        }, 1, null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) onContentCardDismissed.read((List) arrayList);
        Iterator it = onContentCardDismissed.serializer(arrayList, 1).iterator();
        boolean z = false;
        while (it.hasNext()) {
            handlelogclickdefault = (handleLogClickdefault) it.next();
            handlelogclickdefault.getClass();
            handlelogclickdefault.getClass();
            if (handlelogclickdefault.MediaDescriptionCompat() - handlelogclickdefault.MediaDescriptionCompat() >= ((double) this.serializer.read(DetectionTrigger.SDK).shortValue()) * 1000.0d * 0.8d && (fIconCompatParcelizer = handlelogclickdefault.IconCompatParcelizer()) != null) {
                float fFloatValue = fIconCompatParcelizer.floatValue();
                Float fIconCompatParcelizer2 = handlelogclickdefault.IconCompatParcelizer();
                if (fIconCompatParcelizer2 != null) {
                    float fFloatValue2 = fIconCompatParcelizer2.floatValue();
                    Float fWrite = handlelogclickdefault.write();
                    if (fWrite != null) {
                        float fFloatValue3 = fWrite.floatValue();
                        Float fWrite2 = handlelogclickdefault.write();
                        if (fWrite2 != null) {
                            float fFloatValue4 = fWrite2.floatValue();
                            storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0 = this.RemoteActionCompatParcelizer;
                            Float fWrite3 = storeregisteredgeofencestolocalstoragelambda0.write();
                            if (fFloatValue * 3.6f >= (fWrite3 != null ? fWrite3.floatValue() : 10.0f)) {
                                Float fRemoteActionCompatParcelizer = storeregisteredgeofencestolocalstoragelambda0.RemoteActionCompatParcelizer();
                                if (fFloatValue3 <= (fRemoteActionCompatParcelizer != null ? fRemoteActionCompatParcelizer.floatValue() : 5.0f)) {
                                    Float fWrite4 = storeregisteredgeofencestolocalstoragelambda0.write();
                                    if (fFloatValue2 * 3.6f >= (fWrite4 != null ? fWrite4.floatValue() : 10.0f)) {
                                        Float fRemoteActionCompatParcelizer2 = storeregisteredgeofencestolocalstoragelambda0.RemoteActionCompatParcelizer();
                                        if (fFloatValue4 <= (fRemoteActionCompatParcelizer2 != null ? fRemoteActionCompatParcelizer2.floatValue() : 5.0f)) {
                                            Float fSerializer = storeregisteredgeofencestolocalstoragelambda0.serializer();
                                            float fFloatValue5 = fSerializer != null ? fSerializer.floatValue() : 25.0f;
                                            Float f = storeregisteredgeofencestolocalstoragelambda0.read();
                                            float fFloatValue6 = f != null ? f.floatValue() : 100.0f;
                                            float fSerializer2 = handlelogclickdefault.serializer(handlelogclickdefault);
                                            if (fFloatValue5 <= fSerializer2 && fSerializer2 <= fFloatValue6) {
                                                Iterator it2 = it;
                                                double degrees = Math.toDegrees(Math.atan2(handlelogclickdefault.RemoteActionCompatParcelizer() - handlelogclickdefault.RemoteActionCompatParcelizer(), handlelogclickdefault.serializer() - handlelogclickdefault.serializer()));
                                                double dRemoteActionCompatParcelizer = handlelogclickdefault.RemoteActionCompatParcelizer();
                                                double dSerializer = handlelogclickdefault.serializer();
                                                double dRemoteActionCompatParcelizer2 = handlelogclickdefault.RemoteActionCompatParcelizer();
                                                double dSerializer2 = handlelogclickdefault.serializer();
                                                long jMediaDescriptionCompat = handlelogclickdefault.MediaDescriptionCompat();
                                                long jMediaDescriptionCompat2 = handlelogclickdefault.MediaDescriptionCompat();
                                                long jMediaDescriptionCompat3 = handlelogclickdefault.MediaDescriptionCompat();
                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                ArrayList<onViewAttachedToWindowlambda0> arrayList2 = new ArrayList();
                                                int i = 0;
                                                while (true) {
                                                    double d = ((double) i) / 150.0d;
                                                    double d2 = 1.0d - d;
                                                    double d3 = dRemoteActionCompatParcelizer;
                                                    double d4 = (dRemoteActionCompatParcelizer2 * d) + (dRemoteActionCompatParcelizer * d2);
                                                    double d5 = dSerializer;
                                                    double d6 = (dSerializer2 * d) + (d2 * dSerializer);
                                                    parselonglambda0 = parselonglambda1;
                                                    String strRemoteActionCompatParcelizer = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(d4, d6, 23));
                                                    if (linkedHashSet2.add(strRemoteActionCompatParcelizer)) {
                                                        arrayList2.add(new onViewAttachedToWindowlambda0(strRemoteActionCompatParcelizer, Long.valueOf(jMediaDescriptionCompat + ((long) ((jMediaDescriptionCompat2 - jMediaDescriptionCompat3) * d)))));
                                                    }
                                                    if (i == 150) {
                                                        break;
                                                    }
                                                    i++;
                                                    parselonglambda1 = parselonglambda0;
                                                    dSerializer = d5;
                                                    dRemoteActionCompatParcelizer = d3;
                                                }
                                                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : arrayList2) {
                                                    String str = (String) onviewattachedtowindowlambda0.serializer;
                                                    long jLongValue = ((Number) onviewattachedtowindowlambda0.write).longValue();
                                                    DataStoreProviderea dataStoreProvidereaIconCompatParcelizer = iBannerView.IconCompatParcelizer(str);
                                                    if (dataStoreProvidereaIconCompatParcelizer != null) {
                                                        boolean zRemoteActionCompatParcelizer = dataStoreProvidereaIconCompatParcelizer.RemoteActionCompatParcelizer();
                                                        Float fWrite5 = handlelogclickdefault.write();
                                                        if (fWrite5 != null) {
                                                            float fFloatValue7 = fWrite5.floatValue();
                                                            Float fWrite6 = handlelogclickdefault.write();
                                                            if (fWrite6 != null) {
                                                                float fFloatValue8 = fWrite6.floatValue();
                                                                Float fIconCompatParcelizer3 = handlelogclickdefault.IconCompatParcelizer();
                                                                if (fIconCompatParcelizer3 != null) {
                                                                    float fFloatValue9 = fIconCompatParcelizer3.floatValue();
                                                                    Float fIconCompatParcelizer4 = handlelogclickdefault.IconCompatParcelizer();
                                                                    if (fIconCompatParcelizer4 != null) {
                                                                        float f2 = fFloatValue9 * 3.6f;
                                                                        float fFloatValue10 = fIconCompatParcelizer4.floatValue() * 3.6f;
                                                                        if (!zRemoteActionCompatParcelizer || (fFloatValue7 <= 1.0f && fFloatValue8 <= 1.0f)) {
                                                                            if (Math.max(f2, fFloatValue10) <= 50.0f && (!zRemoteActionCompatParcelizer || Math.max(f2, fFloatValue10) <= 40.0f)) {
                                                                                if (Math.abs(Math.abs(Math.floor(degrees / 3.0d) - ((double) (dataStoreProvidereaIconCompatParcelizer.IconCompatParcelizer() / 3))) - 60.0d) >= 5.0d) {
                                                                                    banner2.put(str, Boolean.FALSE);
                                                                                    linkedHashSet.remove(str);
                                                                                } else if (((Boolean) banner2.get(str)).booleanValue()) {
                                                                                    linkedHashSet.add(str);
                                                                                }
                                                                                ((List) banner.get(str)).add(new initBanner(handlelogclickdefault.MediaDescriptionCompat(), handlelogclickdefault.MediaDescriptionCompat(), jLongValue));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                it = it2;
                                                parselonglambda1 = parselonglambda0;
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            it = it;
            parselonglambda1 = parselonglambda1;
        }
        parseLonglambda0 parselonglambda2 = parselonglambda1;
        try {
            if (!z) {
                parselonglambda2.serializer("No valid adjacent waypoints found, cannot evaluate wrong way driving.", new Object[0]);
                iBannerView.serializer();
                return null;
            }
            if (iBannerView.IconCompatParcelizer()) {
                parselonglambda2.serializer("No road direction data available, cannot evaluate wrong way driving.", new Object[0]);
                iBannerView.serializer();
                return null;
            }
            if (linkedHashSet.size() <= 3) {
                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                iBannerView.serializer();
                return instance_delegatelambda0Var;
            }
            List list = read(RemoteActionCompatParcelizer(IconCompatParcelizer(banner, banner2)));
            iBannerView.serializer();
            return list;
        } catch (Throwable th) {
            iBannerView.serializer();
            throw th;
        }
    }

    static {
        new write(null);
    }

    public BrazeGeofenceManagerCompanion(DataStoreProvidereExternalSyntheticLambda0 dataStoreProvidereExternalSyntheticLambda0, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0, ConfigurationManager configurationManager, parseLonglambda0 parselonglambda0) {
        dataStoreProvidereExternalSyntheticLambda0.getClass();
        storeregisteredgeofencestolocalstoragelambda0.getClass();
        configurationManager.getClass();
        parselonglambda0.getClass();
        this.write = dataStoreProvidereExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = storeregisteredgeofencestolocalstoragelambda0;
        this.serializer = configurationManager;
        this.IconCompatParcelizer = parselonglambda0;
    }

    private static ArrayList RemoteActionCompatParcelizer(ArrayList arrayList) {
        Banner banner = new Banner(null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.sentiance.sdk.drivinginsights.wrongwaydrivingdetection.WrongWayDrivingEvaluator$formatEvents$grouped$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0) obj).getClass();
                return new ArrayList();
            }
        }, 1, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0 = (ContentCardAdapterExternalSyntheticLambda0) it.next();
            ((List) banner.get((r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0) contentCardAdapterExternalSyntheticLambda0.RemoteActionCompatParcelizer)).add(new onViewAttachedToWindowlambda0((String) contentCardAdapterExternalSyntheticLambda0.serializer, Long.valueOf(((Number) contentCardAdapterExternalSyntheticLambda0.IconCompatParcelizer).longValue())));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = banner.entrySet().iterator();
        while (it2.hasNext()) {
            List listSerializer = onContentCardDismissed.serializer((List) ((Map.Entry) it2.next()).getValue(), new getGeofencesEnabledFromServerConfiglambda1());
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = listSerializer.iterator();
            while (it3.hasNext()) {
                Location locationIconCompatParcelizer = getDataStoreInstanceCacheandroid_sdk_base_releaseannotations.IconCompatParcelizer((String) ((onViewAttachedToWindowlambda0) it3.next()).serializer);
                if (locationIconCompatParcelizer != null) {
                    arrayList3.add(locationIconCompatParcelizer);
                }
            }
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
            Iterator it4 = listSerializer.iterator();
            while (it4.hasNext()) {
                arrayList4.add(Long.valueOf(((Number) ((onViewAttachedToWindowlambda0) it4.next()).write).longValue()));
            }
            if (arrayList3.size() >= 2 && arrayList4.size() >= 2 && arrayList3.size() == arrayList4.size()) {
                ((Location) onContentCardDismissed.read((List) arrayList3)).setTime(((Number) onContentCardDismissed.read((List) arrayList4)).longValue());
                ((Location) onContentCardDismissed.MediaDescriptionCompat((List) arrayList3)).setTime(((Number) onContentCardDismissed.MediaDescriptionCompat((List) arrayList4)).longValue());
                long jLongValue = ((Number) onContentCardDismissed.read((List) arrayList4)).longValue();
                long jLongValue2 = ((Number) onContentCardDismissed.MediaDescriptionCompat((List) arrayList4)).longValue();
                Location location = (Location) onContentCardDismissed.read((List) arrayList3);
                handleLogClickdefault handlelogclickdefault = new handleLogClickdefault(location.getTime(), migrateSealedSessionsMapToJsonlambda3.RemoteActionCompatParcelizer(location.getLatitude()), migrateSealedSessionsMapToJsonlambda3.RemoteActionCompatParcelizer(location.getLongitude()), null, null, null, true);
                Location location2 = (Location) onContentCardDismissed.MediaDescriptionCompat((List) arrayList3);
                arrayList2.add(new r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ(jLongValue, jLongValue2, androidx.sqlite.SQLite.read(handlelogclickdefault, new handleLogClickdefault(location2.getTime(), migrateSealedSessionsMapToJsonlambda3.RemoteActionCompatParcelizer(location2.getLatitude()), migrateSealedSessionsMapToJsonlambda3.RemoteActionCompatParcelizer(location2.getLongitude()), null, null, null, true))));
            }
        }
        return arrayList2;
    }

    private static List read(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList2 = new ArrayList();
        long jSerializer = ((r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ) onContentCardDismissed.read((List) arrayList)).serializer();
        long jIconCompatParcelizer = ((r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ) onContentCardDismissed.read((List) arrayList)).IconCompatParcelizer();
        List<handleLogClickdefault> listMediaDescriptionCompat = ((r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ) onContentCardDismissed.read((List) arrayList)).MediaDescriptionCompat();
        long j = jSerializer;
        long jMax = jIconCompatParcelizer;
        for (r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ r8lambdaw2zgeworkx0mwnt812prufswtq : onContentCardDismissed.serializer(arrayList, 1)) {
            long jSerializer2 = r8lambdaw2zgeworkx0mwnt812prufswtq.serializer();
            long jIconCompatParcelizer2 = r8lambdaw2zgeworkx0mwnt812prufswtq.IconCompatParcelizer();
            List<handleLogClickdefault> listMediaDescriptionCompat2 = r8lambdaw2zgeworkx0mwnt812prufswtq.MediaDescriptionCompat();
            if (jSerializer2 - jMax <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                jMax = Math.max(jMax, jIconCompatParcelizer2);
                listMediaDescriptionCompat = onContentCardDismissed.IconCompatParcelizer(listMediaDescriptionCompat2, listMediaDescriptionCompat);
            } else {
                arrayList2.add(new r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ(j, jMax, read(listMediaDescriptionCompat)));
                listMediaDescriptionCompat = listMediaDescriptionCompat2;
                j = jSerializer2;
                jMax = jIconCompatParcelizer2;
            }
        }
        arrayList2.add(new r8lambdaW2zGEWorkx0MWNt812pRuFSWtQ(j, jMax, read(listMediaDescriptionCompat)));
        return arrayList2;
    }

    private static List read(List list) {
        HashMap map = new HashMap();
        for (handleLogClickdefault handlelogclickdefault : onContentCardDismissed.serializer(list, new r8lambda8ex2e79ZvXYgJyAOzjYj8uJEU())) {
            map.put(new onViewAttachedToWindowlambda0(Double.valueOf(handlelogclickdefault.RemoteActionCompatParcelizer()), Double.valueOf(handlelogclickdefault.serializer())), handlelogclickdefault);
        }
        Collection collectionValues = map.values();
        collectionValues.getClass();
        return onContentCardDismissed.serializer(collectionValues, new getGeofencesEnabledFromServerConfiglambda0());
    }

    public static final class write {
        private static final byte[] $$c = {23, -98, 35, 29};
        private static final int $$d = Constant.ERROR_LOCATION_INVALID;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {46, 32, 85, 72, 14, -13, 9, 8, -11, 3, -17, 21, -13, -3, 7, 13, 4, -3, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 116;
        private static int read = 0;
        private static int serializer = 1;
        private static char[] RemoteActionCompatParcelizer = {5628, 5541, 5566, 5538, 5544, 5511, 5510, 5543, 5536, 5567, 5538, 5543, 5567, 5535, 5622, 5527, 5536, 5567, 5538, 5536, 5560, 5540, 5545, 5538, 5402, 5402, 5387, 5387, 5398, 5400, 5398, 5402, 5378, 5406, 5402, 5398, 5396, 5388, 5386, 5400, 5406, 5449, 5338, 5336, 5334, 5331, 5335, 5341, 5432, 5435, 5336, 5333, 5328, 5335, 5336, 5328, 5424, 5426, 5333, 5428, 5418, 5323, 5331, 5333, 5337, 5341, 5313, 5337, 5333, 5335, 5333, 5318, 5318, 5337, 5337, 5623, 5539, 5546, 5544, 5543, 5464, 5346, 5349, 5353, 5318, 5318, 5354, 5357, 5349, 5344, 5353, 5354, 5359, 5353, 5350, 5319, 5342, 5348, 5319, 5316, 5346, 5349, 5319, 5314, 5349, 5349, 5344, 5343, 5507, 5627, 5536, 5539, 5545, 5540, 5539, 5562, 5567, 5543, 5540, 5505, 5530, 5560};

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r7, short r8, short r9) {
            /*
                byte[] r0 = o.BrazeGeofenceManagerCompanion.write.$$c
                int r7 = r7 * 2
                int r7 = 1 - r7
                int r8 = r8 * 3
                int r8 = r8 + 65
                int r9 = r9 * 2
                int r9 = r9 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r9
                r4 = r2
                goto L29
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r9]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r9 = r9 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BrazeGeofenceManagerCompanion.write.$$e(byte, short, short):java.lang.String");
        }

        public write(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r0 = 28 - r8
                int r7 = 36 - r7
                byte[] r1 = o.BrazeGeofenceManagerCompanion.write.$$a
                int r6 = 115 - r6
                byte[] r0 = new byte[r0]
                int r8 = 27 - r8
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2b
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L21:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2b:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BrazeGeofenceManagerCompanion.write.a(short, byte, int, java.lang.Object[]):void");
        }

        private static void b(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char c;
            int length;
            char[] cArr2;
            int i = 2 % 2;
            accessgetScrollAxesk4lQ0M accessgetscrollaxesk4lq0m = new accessgetScrollAxesk4lQ0M();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr3 = RemoteActionCompatParcelizer;
            float f = 0.0f;
            if (cArr3 != null) {
                int i6 = $11 + 25;
                $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25206323);
                        if (objRemoteActionCompatParcelizer == null) {
                            char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int fadingEdgeLength = (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2752;
                            int i8 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 8;
                            byte b = (byte) 0;
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarFadeDuration, fadingEdgeLength, i8, 783237164, false, $$e(b, (byte) (b | 18), b), new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i7++;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, i2, cArr4, 0, i3);
            if (bArr != null) {
                int i9 = $11 + 61;
                $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    cArr = new char[i3];
                    accessgetscrollaxesk4lq0m.write = 1;
                    c = 1;
                } else {
                    cArr = new char[i3];
                    accessgetscrollaxesk4lq0m.write = 0;
                    c = 0;
                }
                while (accessgetscrollaxesk4lq0m.write < i3) {
                    if (bArr[accessgetscrollaxesk4lq0m.write] == 1) {
                        int i10 = $10 + 89;
                        $11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            int i11 = accessgetscrollaxesk4lq0m.write;
                            Object[] objArr3 = {Integer.valueOf(cArr4[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c)};
                            Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1988698908);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 1);
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.indexOf("", "", 0) + 52849), 1563 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 37, -1504115971, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i12 = accessgetscrollaxesk4lq0m.write;
                        Object[] objArr4 = {Integer.valueOf(cArr4[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1988698908);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (52848 - TextUtils.indexOf((CharSequence) "", '0')), 1564 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) + 37, -1504115971, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } else {
                        int i13 = accessgetscrollaxesk4lq0m.write;
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c)};
                            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(340245898);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                byte b6 = (byte) 0;
                                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 2547, 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -996696981, false, $$e(b6, (byte) (b6 | 19), b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    c = cArr[accessgetscrollaxesk4lq0m.write];
                    Object[] objArr6 = {accessgetscrollaxesk4lq0m, accessgetscrollaxesk4lq0m};
                    Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1705057313);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (Gravity.getAbsoluteGravity(0, 0) + 15495), 2821 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, 1250869822, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    int i14 = $10 + 35;
                    $11 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 0, i3);
                int i16 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr4, i16, i5);
                System.arraycopy(cArr5, i5, cArr4, 0, i16);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                accessgetscrollaxesk4lq0m.write = 0;
                while (accessgetscrollaxesk4lq0m.write < i3) {
                    cArr6[accessgetscrollaxesk4lq0m.write] = cArr4[(i3 - accessgetscrollaxesk4lq0m.write) - 1];
                    accessgetscrollaxesk4lq0m.write++;
                }
                cArr4 = cArr6;
            }
            if (i4 > 0) {
                int i17 = $10 + 109;
                $11 = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                char c2 = 2;
                int i18 = i17 % 2;
                accessgetscrollaxesk4lq0m.write = 0;
                while (accessgetscrollaxesk4lq0m.write < i3) {
                    cArr4[accessgetscrollaxesk4lq0m.write] = (char) (cArr4[accessgetscrollaxesk4lq0m.write] - iArr[c2]);
                    accessgetscrollaxesk4lq0m.write++;
                    int i19 = $10 + 41;
                    $11 = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    c2 = 2;
                    int i20 = i19 % 2;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code duplicated, block: B:113:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x020a  */
        /* JADX WARN: Code duplicated, block: B:44:0x0210  */
        /* JADX WARN: Code duplicated, block: B:46:0x021f  */
        /* JADX WARN: Code duplicated, block: B:47:0x0222  */
        /* JADX WARN: Code duplicated, block: B:51:0x0229  */
        /* JADX WARN: Code duplicated, block: B:55:0x0259 A[Catch: all -> 0x03ce, TryCatch #4 {all -> 0x03ce, blocks: (B:53:0x024c, B:55:0x0259, B:56:0x029d), top: B:116:0x024c, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:61:0x0323 A[Catch: Exception -> 0x0477, TryCatch #2 {Exception -> 0x0477, blocks: (B:48:0x0223, B:52:0x023a, B:60:0x02b8, B:62:0x039a, B:61:0x0323, B:64:0x03cf, B:66:0x03d5, B:67:0x03d6, B:68:0x03d7, B:73:0x045c, B:77:0x046f, B:79:0x0475, B:80:0x0476, B:69:0x0406, B:71:0x0413, B:72:0x0455, B:53:0x024c, B:55:0x0259, B:56:0x029d), top: B:113:0x0223, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x03d7 A[Catch: Exception -> 0x0477, TRY_LEAVE, TryCatch #2 {Exception -> 0x0477, blocks: (B:48:0x0223, B:52:0x023a, B:60:0x02b8, B:62:0x039a, B:61:0x0323, B:64:0x03cf, B:66:0x03d5, B:67:0x03d6, B:68:0x03d7, B:73:0x045c, B:77:0x046f, B:79:0x0475, B:80:0x0476, B:69:0x0406, B:71:0x0413, B:72:0x0455, B:53:0x024c, B:55:0x0259, B:56:0x029d), top: B:113:0x0223, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x0413 A[Catch: all -> 0x046e, TryCatch #3 {all -> 0x046e, blocks: (B:69:0x0406, B:71:0x0413, B:72:0x0455), top: B:114:0x0406, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x0462  */
        /* JADX WARN: Code duplicated, block: B:81:0x0477  */
        /* JADX WARN: Code duplicated, block: B:84:0x0491  */
        /* JADX WARN: Code duplicated, block: B:86:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:87:0x04ab  */
        /* JADX WARN: Code duplicated, block: B:99:0x05ef  */
        public static Object[] read(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            String str;
            Object[] objArr;
            Object objRemoteActionCompatParcelizer;
            Object objRemoteActionCompatParcelizer2;
            long jLongValue;
            int i17;
            long j;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23 = 2 % 2;
            int i24 = read;
            int i25 = (i24 ^ 41) + ((i24 & 41) << 1);
            int i26 = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i26;
            Object obj = null;
            if (i25 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i27 = i26 + 57;
            int i28 = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i28;
            if (i27 % 2 != 0) {
                int i29 = 74 / 0;
            }
            if (context != null) {
                int i30 = (i28 & 55) + (i28 | 55);
                int i31 = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i31;
                if (i30 % 2 == 0) {
                    throw null;
                }
                int i32 = i31 + 27;
                read = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i33 = i32 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    b(false, new int[]{0, 23, 0, 21}, new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1}, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    b(true, new int[]{23, 18, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 0}, new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0}, objArr3);
                    String str2 = (String) objArr3[0];
                    int i34 = read + 7;
                    serializer = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i35 = i34 % 2;
                    Object objInvoke = cls.getMethod(str2, null).invoke(context, null);
                    Object[] objArr4 = new Object[1];
                    b(false, new int[]{41, 34, 173, 0}, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1}, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    b(true, new int[]{75, 5, 0, 0}, new byte[]{1, 0, 0, 1, 0}, objArr5);
                    int i36 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i37 = read;
                    int i38 = (i37 & 1) + (i37 | 1);
                    serializer = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i38 % 2 == 0) {
                        int i39 = -i36;
                        int i40 = (i36 & i39) | (i36 ^ i39);
                        i21 = ((i40 | 69) << 1) - (i40 ^ 69);
                        i22 = i;
                    } else {
                        i21 = (i36 | (-i36)) >> 31;
                        i22 = (i & (-2)) | ((~i) & 1);
                    }
                    int i41 = (i37 ^ 43) + ((i37 & 43) << 1);
                    serializer = i41 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i42 = i41 % 2;
                    int i43 = (~i21) & i;
                    int i44 = i22 & i21;
                    int i45 = (i44 & i43) | (i43 ^ i44);
                    int i46 = (~(i & i)) & (i | i);
                    int i47 = -i46;
                    int i48 = ((i46 & i47) | (i46 ^ i47)) >> 31;
                    int i49 = i45 & (~i48);
                    int i50 = i48 & i;
                    i4 = (i49 & i50) | (i49 ^ i50);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2120081762);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                    int iResolveSizeAndState = 2193 - View.resolveSizeAndState(0, 0, 0);
                    int deadChar = 28 - android.view.KeyEvent.getDeadChar(0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) (bArr[21] - 1), (byte) (-bArr[26]), bArr[7], objArr6);
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, iResolveSizeAndState, deadChar, -1366441853, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-298760278);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char tapTimeout = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                    int offsetAfter = 2193 - TextUtils.getOffsetAfter("", 0);
                    int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr2 = $$a;
                    byte b = (byte) (bArr2[1] + 1);
                    byte b2 = (byte) (bArr2[20] - 1);
                    Object[] objArr7 = new Object[1];
                    a(b, b2, b2, objArr7);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(tapTimeout, offsetAfter, bitsPerPixel, 1054959179, false, (String) objArr7[0], null);
                }
                if (!set.contains(((Field) objRemoteActionCompatParcelizer4).get(null))) {
                    int i51 = serializer;
                    int i52 = (i51 & 49) + (i51 | 49);
                    read = i52 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i53 = i52 % 2;
                    Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109429865);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2194;
                        int i54 = 29 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b3 = (byte) ($$a[20] - 1);
                        Object[] objArr8 = new Object[1];
                        a(b3, (byte) (b3 | 33), (byte) 18, objArr8);
                        objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, packedPositionChild, i54, 1829720182, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objRemoteActionCompatParcelizer5).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i55 = read + 123;
                            serializer = i55 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i56 = i55 % 2;
                            Object[] objArr9 = new Object[1];
                            b(false, new int[]{80, 28, 192, 18}, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1}, objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int iKeyCodeFromString = 2645 - android.view.KeyEvent.keyCodeFromString("");
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                byte[] bArr3 = $$a;
                                byte b4 = bArr3[20];
                                byte b5 = (byte) (bArr3[11] + 1);
                                Object[] objArr11 = new Object[1];
                                a(b4, b5, (byte) (b5 + 2), objArr11);
                                objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, iKeyCodeFromString, threadPriority, 1171920412, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr10)).longValue();
                            i17 = read + 77;
                            serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i17 % 2 == 0) {
                                long j2 = 42262340;
                                long j3 = -495;
                                long j4 = -1;
                                long j5 = j2 ^ j4;
                                long jNextInt = new Random().nextInt(533880572);
                                long j6 = ((j5 | (jLongValue ^ j4)) ^ j4) | ((j5 | jNextInt) ^ j4);
                                j = (j3 * j2) + (j3 * jLongValue) + (((long) 992) * j6) + (((long) (-496)) * (j6 | (j4 ^ (((jNextInt ^ j4) | j2) | jLongValue)))) + (((long) 496) * (jNextInt | jLongValue)) + ((long) 1051188310);
                                i18 = (int) (j >> 79);
                                int iMyTid = Process.myTid();
                                int i57 = ~iMyTid;
                                i19 = (-145705014) + ((~(1279906202 | i57)) * (-560)) + ((~(iMyTid | (-18875393))) * (-560));
                                i20 = ((~(157320208 | i57)) | 1141461386) * 560;
                            } else {
                                long j7 = 686210437;
                                long j8 = 46;
                                long j9 = -1;
                                long j10 = jLongValue ^ j9;
                                long j11 = i;
                                long j12 = j11 ^ j9;
                                j = (j8 * j7) + (j8 * jLongValue) + (((long) (-90)) * (j7 | ((j10 | j12) ^ j9))) + (((long) (-45)) * (((j10 | j11) ^ j9) | ((jLongValue | j7) ^ j9))) + (((long) 45) * (((j12 | j7) ^ j9) | ((j11 | (j7 ^ j9)) ^ j9) | j10)) + ((long) 407240213);
                                i18 = (int) (j >> 32);
                                int i58 = ~i;
                                int i59 = 1905160562 + (((~((-833682188) | i58)) | 565205515 | (~((-603544224) | i58)) | (~(872020895 | i))) * (-84));
                                int i60 = (~((-603544224) | i)) | 833682187;
                                int i61 = ~(i58 | 603544223);
                                i19 = i59 + ((i60 | i61) * (-84));
                                i20 = (i61 | (-872020896)) * 84;
                            }
                            int i62 = i18 & (i19 + i20);
                            int iNextInt = new Random().nextInt(1789050617);
                            int i63 = ((int) j) & (((1320243365 + (((~(98937065 | iNextInt)) | (-1340452074)) * 1504)) + ((~(iNextInt | (-1241515009))) * (-1504))) - 1057212304);
                            i9 = (i62 & i63) | (i62 ^ i63);
                        } else {
                            Object[] objArr12 = new Object[1];
                            b(true, new int[]{ActivityIdentificationData.RUNNING, 1, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 0}, new byte[]{1}, objArr12);
                            str = (String) objArr12[0];
                            Object[] objArr13 = new Object[1];
                            b(true, new int[]{109, 13, 6, 0}, new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1}, objArr13);
                            objArr = new Object[]{(String) objArr13[0]};
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                            if (objRemoteActionCompatParcelizer == null) {
                                char packedPositionGroup = (char) (58126 - ExpandableListView.getPackedPositionGroup(0L));
                                int iRed = android.graphics.Color.red(0) + 947;
                                int touchSlop = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 27;
                                byte b6 = (byte) 24;
                                Object[] objArr14 = new Object[1];
                                a($$a[20], b6, (byte) (b6 + 1), objArr14);
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup, iRed, touchSlop, 2024488889, false, (String) objArr14[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))) {
                                int i64 = serializer + 105;
                                read = i64 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i65 = i64 % 2;
                                i9 = 1;
                            } else {
                                i9 = 0;
                            }
                        }
                        i10 = (i & (-11)) | ((~i) & 10);
                        int i66 = -i9;
                        i11 = ((i9 & i66) | (i9 ^ i66)) >> 31;
                        i12 = read;
                        i13 = i12 + 15;
                        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        int i67 = (~i11) & i;
                        int i68 = i11 & i10;
                        int i69 = (i68 & i67) | (i67 ^ i68);
                        i14 = i2 & 32;
                        i15 = i12 + 107;
                        serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            int i70 = -i14;
                            i16 = ((i14 & i70) | (i14 ^ i70)) + 2;
                        } else {
                            int i71 = -i14;
                            i16 = ((i14 & i71) | (i14 ^ i71)) >> 31;
                        }
                        int i72 = i69 & (~i16);
                        int i73 = i16 & i;
                        i6 = (i72 & i73) | (i72 ^ i73);
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i74 = serializer;
                        i5 = (i74 ^ 55) + ((i74 & 55) << 1);
                        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        i6 = i;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i510 = read + 123;
                                serializer = i510 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i511 = i510 % 2;
                                Object[] objArr15 = new Object[1];
                                b(false, new int[]{80, 28, 192, 18}, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1}, objArr15);
                                try {
                                    Object[] objArr16 = {(String) objArr15[0]};
                                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        int iKeyCodeFromString2 = 2645 - android.view.KeyEvent.keyCodeFromString("");
                                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                        byte[] bArr4 = $$a;
                                        byte b7 = bArr4[20];
                                        byte b8 = (byte) (bArr4[11] + 1);
                                        Object[] objArr17 = new Object[1];
                                        a(b7, b8, (byte) (b8 + 2), objArr17);
                                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c3, iKeyCodeFromString2, threadPriority2, 1171920412, false, (String) objArr17[0], new Class[]{String.class});
                                    }
                                    jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr16)).longValue();
                                    i17 = read + 77;
                                    serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i17 % 2 == 0) {
                                        long j13 = 42262340;
                                        long j14 = -495;
                                        long j15 = -1;
                                        long j16 = j13 ^ j15;
                                        long jNextInt2 = new Random().nextInt(533880572);
                                        long j17 = ((j16 | (jLongValue ^ j15)) ^ j15) | ((j16 | jNextInt2) ^ j15);
                                        j = (j14 * j13) + (j14 * jLongValue) + (((long) 992) * j17) + (((long) (-496)) * (j17 | (j15 ^ (((jNextInt2 ^ j15) | j13) | jLongValue)))) + (((long) 496) * (jNextInt2 | jLongValue)) + ((long) 1051188310);
                                        i18 = (int) (j >> 79);
                                        int iMyTid2 = Process.myTid();
                                        int i512 = ~iMyTid2;
                                        i19 = (-145705014) + ((~(1279906202 | i512)) * (-560)) + ((~(iMyTid2 | (-18875393))) * (-560));
                                        i20 = ((~(157320208 | i512)) | 1141461386) * 560;
                                    } else {
                                        long j18 = 686210437;
                                        long j19 = 46;
                                        long j20 = -1;
                                        long j110 = jLongValue ^ j20;
                                        long j111 = i;
                                        long j112 = j111 ^ j20;
                                        j = (j19 * j18) + (j19 * jLongValue) + (((long) (-90)) * (j18 | ((j110 | j112) ^ j20))) + (((long) (-45)) * (((j110 | j111) ^ j20) | ((jLongValue | j18) ^ j20))) + (((long) 45) * (((j112 | j18) ^ j20) | ((j111 | (j18 ^ j20)) ^ j20) | j110)) + ((long) 407240213);
                                        i18 = (int) (j >> 32);
                                        int i513 = ~i;
                                        int i514 = 1905160562 + (((~((-833682188) | i513)) | 565205515 | (~((-603544224) | i513)) | (~(872020895 | i))) * (-84));
                                        int i610 = (~((-603544224) | i)) | 833682187;
                                        int i611 = ~(i513 | 603544223);
                                        i19 = i514 + ((i610 | i611) * (-84));
                                        i20 = (i611 | (-872020896)) * 84;
                                    }
                                    int i612 = i18 & (i19 + i20);
                                    int iNextInt2 = new Random().nextInt(1789050617);
                                    int i613 = ((int) j) & (((1320243365 + (((~(98937065 | iNextInt2)) | (-1340452074)) * 1504)) + ((~(iNextInt2 | (-1241515009))) * (-1504))) - 1057212304);
                                    i9 = (i612 & i613) | (i612 ^ i613);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                Object[] objArr18 = new Object[1];
                                b(true, new int[]{ActivityIdentificationData.RUNNING, 1, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 0}, new byte[]{1}, objArr18);
                                str = (String) objArr18[0];
                                Object[] objArr19 = new Object[1];
                                b(true, new int[]{109, 13, 6, 0}, new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1}, objArr19);
                                try {
                                    objArr = new Object[]{(String) objArr19[0]};
                                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        char packedPositionGroup2 = (char) (58126 - ExpandableListView.getPackedPositionGroup(0L));
                                        int iRed2 = android.graphics.Color.red(0) + 947;
                                        int touchSlop2 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 27;
                                        byte b9 = (byte) 24;
                                        Object[] objArr110 = new Object[1];
                                        a($$a[20], b9, (byte) (b9 + 1), objArr110);
                                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup2, iRed2, touchSlop2, 2024488889, false, (String) objArr110[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))) {
                                        int i614 = serializer + 105;
                                        read = i614 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i615 = i614 % 2;
                                        i9 = 1;
                                    } else {
                                        i9 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                        i10 = (i & (-11)) | ((~i) & 10);
                        int i616 = -i9;
                        i11 = ((i9 & i616) | (i9 ^ i616)) >> 31;
                        i12 = read;
                        i13 = i12 + 15;
                        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        int i617 = (~i11) & i;
                        int i618 = i11 & i10;
                        int i619 = (i618 & i617) | (i617 ^ i618);
                        i14 = i2 & 32;
                        i15 = i12 + 107;
                        serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            int i75 = -i14;
                            i16 = ((i14 & i75) | (i14 ^ i75)) + 2;
                        } else {
                            int i76 = -i14;
                            i16 = ((i14 & i76) | (i14 ^ i76)) >> 31;
                        }
                        int i77 = i619 & (~i16);
                        int i78 = i16 & i;
                        i6 = (i77 & i78) | (i77 ^ i78);
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i79 = serializer;
                    i5 = (i79 ^ 55) + ((i79 & 55) << 1);
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    i6 = i;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i515 = read + 123;
                        serializer = i515 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i516 = i515 % 2;
                        Object[] objArr111 = new Object[1];
                        b(false, new int[]{80, 28, 192, 18}, new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1}, objArr111);
                        Object[] objArr112 = {(String) objArr111[0]};
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int iKeyCodeFromString3 = 2645 - android.view.KeyEvent.keyCodeFromString("");
                            int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[20];
                            byte b11 = (byte) (bArr5[11] + 1);
                            Object[] objArr113 = new Object[1];
                            a(b10, b11, (byte) (b11 + 2), objArr113);
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c4, iKeyCodeFromString3, threadPriority3, 1171920412, false, (String) objArr113[0], new Class[]{String.class});
                        }
                        jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr112)).longValue();
                        i17 = read + 77;
                        serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            long j113 = 42262340;
                            long j114 = -495;
                            long j115 = -1;
                            long j116 = j113 ^ j115;
                            long jNextInt3 = new Random().nextInt(533880572);
                            long j117 = ((j116 | (jLongValue ^ j115)) ^ j115) | ((j116 | jNextInt3) ^ j115);
                            j = (j114 * j113) + (j114 * jLongValue) + (((long) 992) * j117) + (((long) (-496)) * (j117 | (j115 ^ (((jNextInt3 ^ j115) | j113) | jLongValue)))) + (((long) 496) * (jNextInt3 | jLongValue)) + ((long) 1051188310);
                            i18 = (int) (j >> 79);
                            int iMyTid3 = Process.myTid();
                            int i517 = ~iMyTid3;
                            i19 = (-145705014) + ((~(1279906202 | i517)) * (-560)) + ((~(iMyTid3 | (-18875393))) * (-560));
                            i20 = ((~(157320208 | i517)) | 1141461386) * 560;
                        } else {
                            long j118 = 686210437;
                            long j119 = 46;
                            long j21 = -1;
                            long j1110 = jLongValue ^ j21;
                            long j1111 = i;
                            long j1112 = j1111 ^ j21;
                            j = (j119 * j118) + (j119 * jLongValue) + (((long) (-90)) * (j118 | ((j1110 | j1112) ^ j21))) + (((long) (-45)) * (((j1110 | j1111) ^ j21) | ((jLongValue | j118) ^ j21))) + (((long) 45) * (((j1112 | j118) ^ j21) | ((j1111 | (j118 ^ j21)) ^ j21) | j1110)) + ((long) 407240213);
                            i18 = (int) (j >> 32);
                            int i518 = ~i;
                            int i519 = 1905160562 + (((~((-833682188) | i518)) | 565205515 | (~((-603544224) | i518)) | (~(872020895 | i))) * (-84));
                            int i6110 = (~((-603544224) | i)) | 833682187;
                            int i6111 = ~(i518 | 603544223);
                            i19 = i519 + ((i6110 | i6111) * (-84));
                            i20 = (i6111 | (-872020896)) * 84;
                        }
                        int i6112 = i18 & (i19 + i20);
                        int iNextInt3 = new Random().nextInt(1789050617);
                        int i6113 = ((int) j) & (((1320243365 + (((~(98937065 | iNextInt3)) | (-1340452074)) * 1504)) + ((~(iNextInt3 | (-1241515009))) * (-1504))) - 1057212304);
                        i9 = (i6112 & i6113) | (i6112 ^ i6113);
                    } else {
                        Object[] objArr114 = new Object[1];
                        b(true, new int[]{ActivityIdentificationData.RUNNING, 1, GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 0}, new byte[]{1}, objArr114);
                        str = (String) objArr114[0];
                        Object[] objArr115 = new Object[1];
                        b(true, new int[]{109, 13, 6, 0}, new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1}, objArr115);
                        objArr = new Object[]{(String) objArr115[0]};
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                        if (objRemoteActionCompatParcelizer == null) {
                            char packedPositionGroup3 = (char) (58126 - ExpandableListView.getPackedPositionGroup(0L));
                            int iRed3 = android.graphics.Color.red(0) + 947;
                            int touchSlop3 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 27;
                            byte b12 = (byte) 24;
                            Object[] objArr116 = new Object[1];
                            a($$a[20], b12, (byte) (b12 + 1), objArr116);
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(packedPositionGroup3, iRed3, touchSlop3, 2024488889, false, (String) objArr116[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))) {
                            int i6114 = serializer + 105;
                            read = i6114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i6115 = i6114 % 2;
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                    }
                    i10 = (i & (-11)) | ((~i) & 10);
                    int i6116 = -i9;
                    i11 = ((i9 & i6116) | (i9 ^ i6116)) >> 31;
                    i12 = read;
                    i13 = i12 + 15;
                    serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    int i6117 = (~i11) & i;
                    int i6118 = i11 & i10;
                    int i6119 = (i6118 & i6117) | (i6117 ^ i6118);
                    i14 = i2 & 32;
                    i15 = i12 + 107;
                    serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        int i710 = -i14;
                        i16 = ((i14 & i710) | (i14 ^ i710)) + 2;
                    } else {
                        int i711 = -i14;
                        i16 = ((i14 & i711) | (i14 ^ i711)) >> 31;
                    }
                    int i712 = i6119 & (~i16);
                    int i713 = i16 & i;
                    i6 = (i712 & i713) | (i712 ^ i713);
                }
                int i80 = i ^ i4;
                int i81 = -i80;
                int i82 = ((i80 & i81) | (i80 ^ i81)) >> 31;
                int i83 = i6 & (~i82);
                int i84 = i82 & i4;
                int i85 = (i83 & i84) | (i83 ^ i84);
                Object[] objArr20 = new Object[4];
                int[] iArr = new int[1];
                objArr20[0] = iArr;
                objArr20[2] = new int[]{i};
                objArr20[3] = new int[1];
                int i86 = i ^ i85;
                int i87 = -i86;
                int i88 = ((i86 & i87) | (i86 ^ i87)) >> 31;
                int i89 = serializer;
                int i90 = (i89 ^ 25) + ((i89 & 25) << 1);
                read = i90 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i91 = i90 % 2;
                int i92 = i88 & 16;
                int i93 = (i89 ^ 93) + ((i89 & 93) << 1);
                read = i93 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i93 % 2 != 0) {
                    ((int[]) objArr20[1])[1] = i85;
                    objArr20[1] = null;
                    int i94 = (~new Random().nextInt()) | 1030769654;
                    i7 = 203981394 + (i94 * 495) + (((~i94) | 610289670) * 495);
                } else {
                    iArr[0] = i85;
                    objArr20[1] = null;
                    int iMyPid = Process.myPid();
                    int i95 = ~iMyPid;
                    i7 = 2137327527 + (((~((-1326146113) | i95)) | (~((-323510718) | iMyPid))) * (-370)) + (((~(iMyPid | (-1326146113))) | (~(i95 | (-323510718))) | (-1598776318)) * (-370)) + 1158249188;
                }
                int i96 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                int i97 = (((i92 * 367) + (i7 * 367)) - (~(((i92 ^ i7) | (i92 & i7)) * (-366)))) - 1;
                int i98 = read + 17;
                serializer = i98 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i99 = i98 % 2;
                int i100 = ~i7;
                if (i99 == 0) {
                    int i101 = ~((i100 ^ i96) | (i100 & i96));
                    int i102 = ~(i7 | (~i92));
                    int i103 = ~(i96 | i92 | i100);
                    i8 = i3 + (((i97 << (((i101 & i92) | (i92 ^ i101)) * (-366))) - (~(-(-(366 >> ((i103 & i102) | (i102 ^ i103))))))) - 1);
                } else {
                    int i104 = ~((i100 & i96) | (i100 ^ i96));
                    int i105 = ((i104 & i92) | (i92 ^ i104)) * (-366);
                    int i106 = ((i97 | i105) << 1) - (i97 ^ i105);
                    int i107 = ~i92;
                    int i108 = ~((i107 & i7) | (i107 ^ i7));
                    int i109 = i92 | (~i7);
                    int i110 = ~((i96 & i109) | (i109 ^ i96));
                    int i111 = i106 + (((i110 & i108) | (i108 ^ i110)) * 366);
                    i8 = (i3 & i111) + (i3 | i111);
                }
                int i112 = i8 << 13;
                int i113 = ((~i8) & i112) | ((~i112) & i8);
                int i114 = i113 >>> 17;
                int i115 = (i113 | i114) & (~(i113 & i114));
                int i116 = i115 << 5;
                ((int[]) objArr20[3])[0] = (i115 | i116) & (~(i115 & i116));
                return objArr20;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
    }
}
