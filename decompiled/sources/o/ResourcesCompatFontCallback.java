package o;

import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ResourcesCompatFontCallback extends AdaptedFunctionReference implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:100:0x0289  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2 A[LOOP:7: B:110:0x02d3->B:115:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0305  */
    /* JADX WARN: Code duplicated, block: B:123:0x0314  */
    /* JADX WARN: Code duplicated, block: B:129:0x0331  */
    /* JADX WARN: Code duplicated, block: B:132:0x035a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x035e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0361  */
    /* JADX WARN: Code duplicated, block: B:136:0x0364 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0366  */
    /* JADX WARN: Code duplicated, block: B:138:0x0373  */
    /* JADX WARN: Code duplicated, block: B:140:0x0389  */
    /* JADX WARN: Code duplicated, block: B:141:0x038c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0399  */
    /* JADX WARN: Code duplicated, block: B:144:0x039c  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:173:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x02f9 A[EDGE_INSN: B:197:0x02f9->B:117:0x02f9 BREAK  A[LOOP:7: B:110:0x02d3->B:115:0x02f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x012a A[LOOP:1: B:48:0x0124->B:50:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0151  */
    /* JADX WARN: Code duplicated, block: B:57:0x0154  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0227  */
    /* JADX WARN: Code duplicated, block: B:87:0x0236  */
    /* JADX WARN: Code duplicated, block: B:93:0x0255  */
    /* JADX WARN: Code duplicated, block: B:95:0x0268  */
    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        getGpsAdid getgpsadid;
        boolean z;
        List list;
        Object next;
        String strValueOf;
        Map map;
        ArrayList arrayList;
        Iterator it;
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        o7ExternalSyntheticLambda3 o7externalsyntheticlambda3;
        sa saVar;
        sb sbVar;
        List list2;
        List list3;
        ArrayList arrayList2;
        Iterator it2;
        HashSet hashSet;
        ArrayList<t2> arrayList3;
        ArrayList arrayList4;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList5;
        List list4;
        t2ExternalSyntheticLambda1 t2externalsyntheticlambda1;
        boolean zInvoke;
        Map map2;
        Iterator it3;
        Object next2;
        sg sgVar;
        String str;
        onServiceConnected onserviceconnectedRemoteActionCompatParcelizer;
        String str2;
        instantiateActivity instantiateactivity;
        createNotificationChannelsCompat createnotificationchannelscompat;
        Iterator it4;
        Object next3;
        String str3;
        int i;
        Integer numValueOf;
        Object arrayList6;
        t2ExternalSyntheticLambda1 t2externalsyntheticlambda2;
        createNotificationChannelsCompat createnotificationchannelscompat2;
        int i2;
        int i3;
        Object next4;
        Iterator it5;
        Object obj7;
        int i4 = 2 % 2;
        List list5 = (List) obj;
        AdjustEvent adjustEvent = (AdjustEvent) obj2;
        getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) obj3;
        getBridge getbridge = (getBridge) obj4;
        se seVar = (se) obj5;
        GetWorkNowOpportunity getWorkNowOpportunity = (GetWorkNowOpportunity) this.MediaSessionCompatQueueItem;
        IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl = getWorkNowOpportunity.read;
        getActionList getactionlist = getWorkNowOpportunity.write;
        if ((adjustEvent == null || !adjustEvent.IconCompatParcelizer) && (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession)) {
            onServiceConnected onserviceconnected = onServiceConnected.WORK_NOW_LOW_FILL;
            endRearDisplayPresentationSession endreardisplaypresentationsession = (endRearDisplayPresentationSession) getwindowareadisplaymetrics;
            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = endreardisplaypresentationsession.IconCompatParcelizer;
            double d = extensionWindowAreaStatusRequirements.read;
            double d2 = extensionWindowAreaStatusRequirements.serializer;
            getGpsAdid getgpsadidRemoteActionCompatParcelizer = getWorkNowOpportunity.RemoteActionCompatParcelizer(list5, onserviceconnected, endreardisplaypresentationsession);
            if (getgpsadidRemoteActionCompatParcelizer == null) {
                int i5 = write + 51;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    getgpsadidRemoteActionCompatParcelizer = getWorkNowOpportunity.RemoteActionCompatParcelizer(list5, onServiceConnected.WORK_NOW, endreardisplaypresentationsession);
                    int i6 = 93 / 0;
                } else {
                    getgpsadidRemoteActionCompatParcelizer = getWorkNowOpportunity.RemoteActionCompatParcelizer(list5, onServiceConnected.WORK_NOW, endreardisplaypresentationsession);
                }
            }
            boolean z2 = getactionlist.read();
            List listIconCompatParcelizer = instance_delegatelambda0.write;
            if (z2) {
                if (list5 != null) {
                    int i7 = RemoteActionCompatParcelizer + 35;
                    write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        it5 = list5.iterator();
                        int i8 = 44 / 0;
                    } else {
                        it5 = list5.iterator();
                    }
                    while (true) {
                        if (!it5.hasNext()) {
                            getgpsadid = getgpsadidRemoteActionCompatParcelizer;
                            list = listIconCompatParcelizer;
                            obj7 = null;
                            break;
                        }
                        Object next5 = it5.next();
                        Iterator it6 = it5;
                        getgpsadid = getgpsadidRemoteActionCompatParcelizer;
                        list = listIconCompatParcelizer;
                        if (getWorkNowOpportunity.read.invoke(new o7ExternalSyntheticLambda3(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read), ((getGpsAdid) next5).MediaMetadataCompat.write.serializer)) {
                            int i9 = RemoteActionCompatParcelizer + 49;
                            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            obj7 = next5;
                            break;
                        }
                        it5 = it6;
                        getgpsadidRemoteActionCompatParcelizer = getgpsadid;
                        listIconCompatParcelizer = list;
                    }
                    getGpsAdid getgpsadid2 = (getGpsAdid) obj7;
                    if (getgpsadid2 == null || (strValueOf = getgpsadid2.read) == null) {
                    }
                    List list6 = seVar.write;
                    map = seVar.RemoteActionCompatParcelizer;
                    List list7 = list6;
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((sg) it.next()).IconCompatParcelizer));
                    }
                    setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
                    o7externalsyntheticlambda3 = new o7ExternalSyntheticLambda3(d2, d);
                    saVar = seVar.serializer;
                    if (!(saVar instanceof sb)) {
                        sbVar = null;
                    } else {
                        sbVar = (sb) saVar;
                    }
                    if (sbVar != null) {
                        list2 = sbVar.write;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        list3 = list;
                    } else {
                        list3 = list2;
                    }
                    arrayList2 = new ArrayList();
                    it2 = list3.iterator();
                    while (it2.hasNext()) {
                        i3 = write + 119;
                        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(Integer.valueOf(((t2) it2.next()).MediaDescriptionCompat));
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        next4 = it2.next();
                        if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(Integer.valueOf(((t2) next4).MediaDescriptionCompat))) {
                            arrayList2.add(next4);
                        }
                    }
                    hashSet = new HashSet();
                    arrayList3 = new ArrayList();
                    for (Object obj9 : arrayList2) {
                        if (hashSet.add(Integer.valueOf(((t2) obj9).MediaDescriptionCompat))) {
                            arrayList3.add(obj9);
                        }
                    }
                    arrayList4 = new ArrayList();
                    for (t2 t2Var : arrayList3) {
                        t2externalsyntheticlambda2 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(t2Var.MediaDescriptionCompat));
                        if (t2externalsyntheticlambda2 != null) {
                            createnotificationchannelscompat2 = new createNotificationChannelsCompat(String.valueOf(t2externalsyntheticlambda2.RemoteActionCompatParcelizer), t2externalsyntheticlambda2.MediaBrowserCompatMediaItem, t2externalsyntheticlambda2.serializer, t2externalsyntheticlambda2.write, t2externalsyntheticlambda2.read, GetWorkNowOpportunity.read(getbridge, String.valueOf(t2Var.MediaDescriptionCompat), strValueOf), instantiateActivity.NOT_AVAILABLE, t2externalsyntheticlambda2.IconCompatParcelizer, (onServiceConnected) null, (String) null, 1792);
                        } else {
                            createnotificationchannelscompat2 = null;
                        }
                        if (createnotificationchannelscompat2 != null) {
                            i2 = write + 43;
                            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                arrayList4.add(createnotificationchannelscompat2);
                                Object obj10 = null;
                                obj10.hashCode();
                                throw null;
                            }
                            arrayList4.add(createnotificationchannelscompat2);
                        }
                    }
                    List list8 = seVar.write;
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj11 : list8) {
                        numValueOf = Integer.valueOf(((sg) obj11).IconCompatParcelizer);
                        arrayList6 = linkedHashMap.get(numValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj11);
                    }
                    arrayList5 = new ArrayList();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        list4 = (List) entry.getValue();
                        t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(iIntValue));
                        if (t2externalsyntheticlambda1 == null) {
                            i = RemoteActionCompatParcelizer + 125;
                            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                Object obj12 = null;
                                obj12.hashCode();
                                throw null;
                            }
                            map2 = map;
                            createnotificationchannelscompat = null;
                        } else {
                            zInvoke = isRiderInsideAreaUseCaseImpl.invoke(o7externalsyntheticlambda3, t2externalsyntheticlambda1.serializer);
                            if (zInvoke) {
                                it4 = list4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        map2 = map;
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it4.next();
                                    GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo = onServiceConnected.Companion;
                                    str3 = ((sg) next3).RemoteActionCompatParcelizer;
                                    googlePlayServicesClientGooglePlayServicesInfo.getClass();
                                    map2 = map;
                                    if (GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str3) != onServiceConnected.GO_AND_START_NOW) {
                                        break;
                                    }
                                    map = map2;
                                }
                                sgVar = (sg) next3;
                                if (sgVar == null) {
                                    sgVar = (sg) onContentCardDismissed.read(list4);
                                }
                            } else {
                                map2 = map;
                                it3 = list4.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it3.next();
                                    GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo2 = onServiceConnected.Companion;
                                    str = ((sg) next2).RemoteActionCompatParcelizer;
                                    googlePlayServicesClientGooglePlayServicesInfo2.getClass();
                                } while (GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str) != onServiceConnected.GO_AND_START_NOW);
                                sgVar = (sg) next2;
                                if (sgVar == null) {
                                    sgVar = (sg) onContentCardDismissed.read(list4);
                                }
                            }
                            GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo3 = onServiceConnected.Companion;
                            String str4 = sgVar.RemoteActionCompatParcelizer;
                            int i11 = sgVar.IconCompatParcelizer;
                            googlePlayServicesClientGooglePlayServicesInfo3.getClass();
                            onserviceconnectedRemoteActionCompatParcelizer = GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str4);
                            str2 = sgVar.write;
                            boolean z3 = GetWorkNowOpportunity.read(getbridge, String.valueOf(i11), strValueOf);
                            if (notify.RemoteActionCompatParcelizer[onserviceconnectedRemoteActionCompatParcelizer.ordinal()] == 1) {
                                if (zInvoke) {
                                    if (str2 != null) {
                                        instantiateactivity = instantiateActivity.NOT_AVAILABLE_YET;
                                    } else {
                                        instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                    }
                                } else if (str2 == null) {
                                    int i12 = RemoteActionCompatParcelizer + 21;
                                    write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i13 = i12 % 2;
                                    instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                } else if (ChronoUnit.MINUTES.between(ZonedDateTime.now(getWorkNowOpportunity.RemoteActionCompatParcelizer), ZonedDateTime.parse(str2)) <= 30) {
                                    instantiateactivity = instantiateActivity.GO_AND_START;
                                } else {
                                    instantiateactivity = instantiateActivity.NOT_AVAILABLE_YET;
                                    int i14 = RemoteActionCompatParcelizer + 97;
                                    write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                }
                            } else if (zInvoke) {
                                int i16 = RemoteActionCompatParcelizer + 21;
                                write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                                if (str2 == null) {
                                    instantiateactivity = instantiateActivity.START_NOW;
                                } else {
                                    instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                }
                            } else {
                                instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                            }
                            instantiateActivity instantiateactivity2 = instantiateactivity;
                            instantiateactivity2.getClass();
                            createnotificationchannelscompat = new createNotificationChannelsCompat(String.valueOf(i11), t2externalsyntheticlambda1.MediaBrowserCompatMediaItem, t2externalsyntheticlambda1.serializer, t2externalsyntheticlambda1.write, t2externalsyntheticlambda1.read, z3, instantiateactivity2, t2externalsyntheticlambda1.IconCompatParcelizer, GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(sgVar.RemoteActionCompatParcelizer), sgVar.write, androidx.compose.ui.graphics.Fields.RotationY);
                        }
                        if (createnotificationchannelscompat != null) {
                            arrayList5.add(createnotificationchannelscompat);
                        }
                        strValueOf = strValueOf;
                        map = map2;
                    }
                    listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList5, arrayList4);
                } else {
                    getgpsadid = getgpsadidRemoteActionCompatParcelizer;
                    list = listIconCompatParcelizer;
                }
                Map map3 = seVar.RemoteActionCompatParcelizer;
                o7ExternalSyntheticLambda3 o7externalsyntheticlambda4 = new o7ExternalSyntheticLambda3(d2, d);
                Iterator it7 = map3.values().iterator();
                do {
                    if (!it7.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it7.next();
                } while (!isRiderInsideAreaUseCaseImpl.invoke(o7externalsyntheticlambda4, ((t2ExternalSyntheticLambda1) next).serializer));
                t2ExternalSyntheticLambda1 t2externalsyntheticlambda3 = (t2ExternalSyntheticLambda1) next;
                strValueOf = t2externalsyntheticlambda3 != null ? String.valueOf(t2externalsyntheticlambda3.RemoteActionCompatParcelizer) : null;
                List list9 = seVar.write;
                map = seVar.RemoteActionCompatParcelizer;
                List list10 = list9;
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list10, 10));
                it = list10.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((sg) it.next()).IconCompatParcelizer));
                }
                setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
                o7externalsyntheticlambda3 = new o7ExternalSyntheticLambda3(d2, d);
                saVar = seVar.serializer;
                if (!(saVar instanceof sb)) {
                    sbVar = null;
                } else {
                    sbVar = (sb) saVar;
                }
                if (sbVar != null) {
                    list2 = sbVar.write;
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list3 = list;
                } else {
                    list3 = list2;
                }
                arrayList2 = new ArrayList();
                it2 = list3.iterator();
                while (it2.hasNext()) {
                    i3 = write + 119;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(Integer.valueOf(((t2) it2.next()).MediaDescriptionCompat));
                        Object obj13 = null;
                        obj13.hashCode();
                        throw null;
                    }
                    next4 = it2.next();
                    if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(Integer.valueOf(((t2) next4).MediaDescriptionCompat))) {
                        arrayList2.add(next4);
                    }
                }
                hashSet = new HashSet();
                arrayList3 = new ArrayList();
                while (r6.hasNext()) {
                    if (hashSet.add(Integer.valueOf(((t2) obj9).MediaDescriptionCompat))) {
                        arrayList3.add(obj9);
                    }
                }
                arrayList4 = new ArrayList();
                while (r6.hasNext()) {
                    t2externalsyntheticlambda2 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(t2Var.MediaDescriptionCompat));
                    if (t2externalsyntheticlambda2 != null) {
                        createnotificationchannelscompat2 = new createNotificationChannelsCompat(String.valueOf(t2externalsyntheticlambda2.RemoteActionCompatParcelizer), t2externalsyntheticlambda2.MediaBrowserCompatMediaItem, t2externalsyntheticlambda2.serializer, t2externalsyntheticlambda2.write, t2externalsyntheticlambda2.read, GetWorkNowOpportunity.read(getbridge, String.valueOf(t2Var.MediaDescriptionCompat), strValueOf), instantiateActivity.NOT_AVAILABLE, t2externalsyntheticlambda2.IconCompatParcelizer, (onServiceConnected) null, (String) null, 1792);
                    } else {
                        createnotificationchannelscompat2 = null;
                    }
                    if (createnotificationchannelscompat2 != null) {
                        i2 = write + 43;
                        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            arrayList4.add(createnotificationchannelscompat2);
                            Object obj14 = null;
                            obj14.hashCode();
                            throw null;
                        }
                        arrayList4.add(createnotificationchannelscompat2);
                    }
                }
                List list11 = seVar.write;
                linkedHashMap = new LinkedHashMap();
                while (r5.hasNext()) {
                    numValueOf = Integer.valueOf(((sg) obj11).IconCompatParcelizer);
                    arrayList6 = linkedHashMap.get(numValueOf);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList6);
                    }
                    ((List) arrayList6).add(obj11);
                }
                arrayList5 = new ArrayList();
                while (r6.hasNext()) {
                    int iIntValue2 = ((Number) entry.getKey()).intValue();
                    list4 = (List) entry.getValue();
                    t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) map.get(Integer.valueOf(iIntValue2));
                    if (t2externalsyntheticlambda1 == null) {
                        i = RemoteActionCompatParcelizer + 125;
                        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            Object obj15 = null;
                            obj15.hashCode();
                            throw null;
                        }
                        map2 = map;
                        createnotificationchannelscompat = null;
                    } else {
                        zInvoke = isRiderInsideAreaUseCaseImpl.invoke(o7externalsyntheticlambda3, t2externalsyntheticlambda1.serializer);
                        if (zInvoke) {
                            it4 = list4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    map2 = map;
                                    next3 = null;
                                    break;
                                }
                                next3 = it4.next();
                                GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo4 = onServiceConnected.Companion;
                                str3 = ((sg) next3).RemoteActionCompatParcelizer;
                                googlePlayServicesClientGooglePlayServicesInfo4.getClass();
                                map2 = map;
                                if (GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str3) != onServiceConnected.GO_AND_START_NOW) {
                                    break;
                                    break;
                                }
                                map = map2;
                            }
                            sgVar = (sg) next3;
                            if (sgVar == null) {
                                sgVar = (sg) onContentCardDismissed.read(list4);
                            }
                        } else {
                            map2 = map;
                            it3 = list4.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                                GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo5 = onServiceConnected.Companion;
                                str = ((sg) next2).RemoteActionCompatParcelizer;
                                googlePlayServicesClientGooglePlayServicesInfo5.getClass();
                            } while (GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str) != onServiceConnected.GO_AND_START_NOW);
                            sgVar = (sg) next2;
                            if (sgVar == null) {
                                sgVar = (sg) onContentCardDismissed.read(list4);
                            }
                        }
                        GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo6 = onServiceConnected.Companion;
                        String str5 = sgVar.RemoteActionCompatParcelizer;
                        int i18 = sgVar.IconCompatParcelizer;
                        googlePlayServicesClientGooglePlayServicesInfo6.getClass();
                        onserviceconnectedRemoteActionCompatParcelizer = GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str5);
                        str2 = sgVar.write;
                        boolean z4 = GetWorkNowOpportunity.read(getbridge, String.valueOf(i18), strValueOf);
                        if (notify.RemoteActionCompatParcelizer[onserviceconnectedRemoteActionCompatParcelizer.ordinal()] == 1) {
                            if (zInvoke) {
                                if (str2 != null) {
                                    instantiateactivity = instantiateActivity.NOT_AVAILABLE_YET;
                                } else {
                                    instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                }
                            } else if (str2 == null) {
                                int i19 = RemoteActionCompatParcelizer + 21;
                                write = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i110 = i19 % 2;
                                instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                            } else if (ChronoUnit.MINUTES.between(ZonedDateTime.now(getWorkNowOpportunity.RemoteActionCompatParcelizer), ZonedDateTime.parse(str2)) <= 30) {
                                instantiateactivity = instantiateActivity.GO_AND_START;
                            } else {
                                instantiateactivity = instantiateActivity.NOT_AVAILABLE_YET;
                                int i111 = RemoteActionCompatParcelizer + 97;
                                write = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i112 = i111 % 2;
                            }
                        } else if (zInvoke) {
                            int i113 = RemoteActionCompatParcelizer + 21;
                            write = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i114 = i113 % 2;
                            if (str2 == null) {
                                instantiateactivity = instantiateActivity.START_NOW;
                            } else {
                                instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                            }
                        } else {
                            instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                        }
                        instantiateActivity instantiateactivity3 = instantiateactivity;
                        instantiateactivity3.getClass();
                        createnotificationchannelscompat = new createNotificationChannelsCompat(String.valueOf(i18), t2externalsyntheticlambda1.MediaBrowserCompatMediaItem, t2externalsyntheticlambda1.serializer, t2externalsyntheticlambda1.write, t2externalsyntheticlambda1.read, z4, instantiateactivity3, t2externalsyntheticlambda1.IconCompatParcelizer, GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(sgVar.RemoteActionCompatParcelizer), sgVar.write, androidx.compose.ui.graphics.Fields.RotationY);
                    }
                    if (createnotificationchannelscompat != null) {
                        arrayList5.add(createnotificationchannelscompat);
                    }
                    strValueOf = strValueOf;
                    map = map2;
                }
                listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList5, arrayList4);
            } else {
                getgpsadid = getgpsadidRemoteActionCompatParcelizer;
            }
            if (getactionlist.read() && !listIconCompatParcelizer.isEmpty()) {
                if (getgpsadid != null) {
                    int i20 = RemoteActionCompatParcelizer + 91;
                    write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    z = true;
                } else {
                    z = false;
                }
                return new RemoteActionCompat(getgpsadid, z, listIconCompatParcelizer);
            }
            getGpsAdid getgpsadid3 = getgpsadid;
            if (getgpsadid3 != null) {
                return new RemoteActionCompat(getgpsadid3, true, listIconCompatParcelizer);
            }
        }
        return getNotificationChannelsCompat.read;
    }

    public ResourcesCompatFontCallback(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
    }
}
