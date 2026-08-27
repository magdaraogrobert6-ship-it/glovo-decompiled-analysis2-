package o;

import android.location.Location;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class removeProperty extends r8lambdagzL4jp4oDuRXXeRCE9jPe7Cswjw {
    private final getPushStoryGravityAtIndex IconCompatParcelizer;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;

    public final void serializer() {
        getPushStoryGravityAtIndex getpushstorygravityatindex = this.IconCompatParcelizer;
        getpushstorygravityatindex.MediaSessionCompatResultReceiverWrapper();
        getpushstorygravityatindex.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    public final ArrayList write(ArrayList arrayList) {
        Map map;
        Map mapSerializer;
        DataStoreProvidera dataStoreProvidera;
        Integer modelOutput;
        this.RemoteActionCompatParcelizer.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) it.next();
            r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs r8lambdavyxnhk9sdraxwugvbef6izzxids = (r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read();
            r8lambdavyxnhk9sdraxwugvbef6izzxids.getClass();
            Map map2 = r8lambdavyxnhk9sdraxwugvbef6izzxids.MediaBrowserCompatMediaItem;
            if (map2 == null) {
                map = r8lambdavyxnhk9sdraxwugvbef6izzxids.IconCompatParcelizer;
                map.getClass();
            } else {
                map = map2;
            }
            float f = map2 != null ? 1.0f : 100.0f;
            ArrayList arrayList5 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                byte bByteValue = ((Number) entry.getKey()).byteValue();
                Number number = (Number) entry.getValue();
                ClassifiedTransportMode classifiedTransportModeFromEventConstant = ClassifiedTransportMode.fromEventConstant(Byte.valueOf(bByteValue));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (classifiedTransportModeFromEventConstant == null || (modelOutput = classifiedTransportModeFromEventConstant.toModelOutput()) == null) ? null : new onViewAttachedToWindowlambda0(modelOutput, Float.valueOf(number.floatValue() / f));
                if (onviewattachedtowindowlambda0 != null) {
                    arrayList5.add(onviewattachedtowindowlambda0);
                }
            }
            Collection collectionValues = new TreeMap(onMove.serializer(arrayList5)).values();
            collectionValues.getClass();
            arrayList2.add(onContentCardDismissed.serializer(collectionValues));
            List<r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4> list = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).RemoteActionCompatParcelizer;
            if (list != null) {
                int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 10));
                if (iRemoteActionCompatParcelizer < 16) {
                    iRemoteActionCompatParcelizer = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                for (r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4 r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4 : list) {
                    Location locationWrite = getVerticalAccuracy.write(r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4.RemoteActionCompatParcelizer);
                    clearInstanceandroid_sdk_base_release clearinstanceandroid_sdk_base_release = r8lambdauwxdsmrlntzuda6i1vdnmbtuwe4.write;
                    if (clearinstanceandroid_sdk_base_release == null) {
                        dataStoreProvidera = null;
                    } else {
                        Boolean bool = clearinstanceandroid_sdk_base_release.serializer;
                        bool.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        Boolean bool2 = clearinstanceandroid_sdk_base_release.write;
                        bool2.getClass();
                        boolean zBooleanValue2 = bool2.booleanValue();
                        Boolean bool3 = clearinstanceandroid_sdk_base_release.RemoteActionCompatParcelizer;
                        bool3.getClass();
                        dataStoreProvidera = new DataStoreProvidera(zBooleanValue, zBooleanValue2, bool3.booleanValue());
                    }
                    linkedHashMap.put(locationWrite, dataStoreProvidera);
                }
                mapSerializer = onMove.serializer(linkedHashMap);
            } else {
                mapSerializer = SimpleItemTouchHelperCallback.serializer;
            }
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(mapSerializer.keySet());
            long jWrite = getlongitudeannotations.write();
            long jWrite2 = getlongitudeannotations.write();
            Integer num = r8lambdavyxnhk9sdraxwugvbef6izzxids.read;
            num.getClass();
            float[][] fArrRemoteActionCompatParcelizer = r8lambdaizrsr5SyuYK5T_CQ3jk1HplpfY.RemoteActionCompatParcelizer(18, listPlaybackStateCompat, new r8lambdaaIg5zVykRH73tEpxO0st1uPPjw0(jWrite, num.longValue() + jWrite2));
            float[][] fArr = setBorderColor.read(onContentCardDismissed.PlaybackStateCompat(mapSerializer.values()));
            fArrRemoteActionCompatParcelizer.getClass();
            arrayList3.add(fArrRemoteActionCompatParcelizer);
            arrayList4.add(fArr);
        }
        int i = 0;
        BrazeNotificationPayload brazeNotificationPayloadSerializer = this.IconCompatParcelizer.serializer(new getAttachedBrazeExtras((float[][]) arrayList2.toArray(new float[0][]), (float[][][]) arrayList3.toArray(new float[0][][]), (float[][][]) arrayList4.toArray(new float[0][][])));
        if (brazeNotificationPayloadSerializer == null) {
            return getFlushMaxMinutesannotations.serializer(arrayList);
        }
        List list2 = onContentCardClicked.read(brazeNotificationPayloadSerializer.write());
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ClassifiedTransportMode classifiedTransportModeFromModelOutput = ClassifiedTransportMode.fromModelOutput(((Number) it2.next()).intValue(), false);
            if (classifiedTransportModeFromModelOutput != null) {
                arrayList6.add(classifiedTransportModeFromModelOutput);
            }
        }
        List listRatingCompat = onContentCardClicked.RatingCompat(brazeNotificationPayloadSerializer.RemoteActionCompatParcelizer());
        ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(listRatingCompat, 10));
        Iterator it3 = listRatingCompat.iterator();
        while (it3.hasNext()) {
            List listWrite = onContentCardClicked.write((float[]) it3.next());
            ArrayList arrayList8 = new ArrayList();
            int i2 = 0;
            for (Object obj : listWrite) {
                if (i2 < 0) {
                    androidx.sqlite.SQLite.serializer();
                    throw null;
                }
                float fFloatValue = ((Number) obj).floatValue();
                ClassifiedTransportMode classifiedTransportModeFromModelOutput2 = ClassifiedTransportMode.fromModelOutput(i2, false);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = classifiedTransportModeFromModelOutput2 != null ? new onViewAttachedToWindowlambda0(classifiedTransportModeFromModelOutput2, Float.valueOf(fFloatValue)) : null;
                if (onviewattachedtowindowlambda1 != null) {
                    arrayList8.add(onviewattachedtowindowlambda1);
                }
                i2++;
            }
            arrayList7.add(onMove.serializer(arrayList8));
        }
        if (arrayList.size() != arrayList7.size() || arrayList.size() != arrayList6.size()) {
            return getFlushMaxMinutesannotations.serializer(arrayList);
        }
        ArrayList arrayList9 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (Object obj2 : arrayList) {
            if (i < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            getLongitudeannotations getlongitudeannotations2 = (getLongitudeannotations) obj2;
            long jWrite3 = getlongitudeannotations2.write();
            Integer num2 = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations2.read()).read;
            num2.getClass();
            arrayList9.add(new addProperty(jWrite3, num2.longValue() + jWrite3, (ClassifiedTransportMode) arrayList6.get(i), (Map) arrayList7.get(i)));
            i++;
        }
        return arrayList9;
    }

    public final boolean write() {
        return this.IconCompatParcelizer.RatingCompat();
    }

    public removeProperty(getPushStoryGravityAtIndex getpushstorygravityatindex, getVerticalAccuracy getverticalaccuracy) {
        getpushstorygravityatindex.getClass();
        getverticalaccuracy.getClass();
        this.IconCompatParcelizer = getpushstorygravityatindex;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
    }
}
