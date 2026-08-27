package io.sentry.android.replay;

import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.sentry.SentryOptions;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyKt__LazyJVMKt;
import o.BrazeBaseFragmentActivity;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements BrazeBaseFragmentActivity {
    public static final onViewDetachedFromWindowlambda1 read = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, MediaSessionCompatToken.write);
    public static final HashSet write;
    public final Map IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        write = hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0334  */
    /* JADX WARN: Code duplicated, block: B:102:0x0358  */
    /* JADX WARN: Code duplicated, block: B:104:0x0386  */
    /* JADX WARN: Code duplicated, block: B:106:0x0390  */
    /* JADX WARN: Code duplicated, block: B:107:0x0393  */
    /* JADX WARN: Code duplicated, block: B:109:0x0396  */
    /* JADX WARN: Code duplicated, block: B:110:0x039d  */
    /* JADX WARN: Code duplicated, block: B:112:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:119:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:123:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:128:0x0403  */
    /* JADX WARN: Code duplicated, block: B:129:0x0406  */
    /* JADX WARN: Code duplicated, block: B:132:0x040b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0418  */
    /* JADX WARN: Code duplicated, block: B:135:0x0440  */
    /* JADX WARN: Code duplicated, block: B:137:0x0466  */
    /* JADX WARN: Code duplicated, block: B:139:0x0490  */
    /* JADX WARN: Code duplicated, block: B:140:0x0493  */
    /* JADX WARN: Code duplicated, block: B:142:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:156:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:157:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:159:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:161:0x0527  */
    /* JADX WARN: Code duplicated, block: B:164:0x053f  */
    /* JADX WARN: Code duplicated, block: B:166:0x056f  */
    /* JADX WARN: Code duplicated, block: B:171:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:186:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0593 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0539 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0290  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x02da  */
    /* JADX WARN: Code duplicated, block: B:97:0x030b  */
    @Override // o.BrazeBaseFragmentActivity
    public final io.sentry.rrweb.IconCompatParcelizer write(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1) {
        String str;
        String str2;
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco;
        LinkedHashMap linkedHashMap;
        String str3;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        String str4;
        Object obj2;
        Object obj3;
        String str5;
        Object obj4;
        boolean zBooleanValue;
        ConcurrentHashMap concurrentHashMap2;
        Object obj5;
        String strIconCompatParcelizer;
        Object obj6;
        String str6;
        Object obj7;
        double dLongValue;
        double dLongValue2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "http"}, getCieXyz.write())).booleanValue()) {
            Object obj8 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("url");
            String str7 = obj8 instanceof String ? (String) obj8 : null;
            if (str7 == null || str7.length() == 0) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap3 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
            concurrentHashMap3.getClass();
            if (!concurrentHashMap3.containsKey("http.start_timestamp")) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
            concurrentHashMap4.getClass();
            if (!concurrentHashMap4.containsKey("http.end_timestamp")) {
                return null;
            }
            Object obj9 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("http.start_timestamp");
            Object obj10 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("http.end_timestamp");
            io.sentry.rrweb.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new io.sentry.rrweb.PlaybackStateCompatCustomAction();
            playbackStateCompatCustomAction.PlaybackStateCompatCustomAction = getintentarraywithconfiguredbackstacklambda1.write().getTime();
            playbackStateCompatCustomAction.read = "resource.http";
            Object obj11 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("url");
            obj11.getClass();
            playbackStateCompatCustomAction.RemoteActionCompatParcelizer = (String) obj11;
            if (obj9 instanceof Double) {
                dLongValue = ((Number) obj9).doubleValue();
            } else {
                obj9.getClass();
                dLongValue = ((Long) obj9).longValue();
            }
            playbackStateCompatCustomAction.MediaMetadataCompat = dLongValue / 1000.0d;
            if (obj10 instanceof Double) {
                dLongValue2 = ((Number) obj10).doubleValue();
            } else {
                obj10.getClass();
                dLongValue2 = ((Long) obj10).longValue();
            }
            playbackStateCompatCustomAction.IconCompatParcelizer = dLongValue2 / 1000.0d;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            io.sentry.util.network.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (io.sentry.util.network.RemoteActionCompatParcelizer) this.IconCompatParcelizer.remove(getintentarraywithconfiguredbackstacklambda1);
            if (remoteActionCompatParcelizer != null) {
                String str8 = remoteActionCompatParcelizer.read;
                if (str8 != null) {
                    linkedHashMap3.put("method", str8);
                }
                Integer num = remoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                if (num != null) {
                    linkedHashMap3.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, num);
                }
                Long l = remoteActionCompatParcelizer.IconCompatParcelizer;
                if (l != null) {
                    linkedHashMap3.put("requestBodySize", l);
                }
                Long l2 = remoteActionCompatParcelizer.write;
                if (l2 != null) {
                    linkedHashMap3.put("responseBodySize", l2);
                }
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = remoteActionCompatParcelizer.serializer;
                if (r8lambdadeozq815xuuwmllyyvm_qv79qy != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    Long lPlaybackStateCompatCustomAction = r8lambdadeozq815xuuwmllyyvm_qv79qy.PlaybackStateCompatCustomAction();
                    if (lPlaybackStateCompatCustomAction != null) {
                        linkedHashMap4.put("size", lPlaybackStateCompatCustomAction);
                    }
                    NetworkBody networkBodyMediaDescriptionCompat = r8lambdadeozq815xuuwmllyyvm_qv79qy.MediaDescriptionCompat();
                    if (networkBodyMediaDescriptionCompat != null) {
                        linkedHashMap4.put(PushNotificationParserObj.BODY_KEY, networkBodyMediaDescriptionCompat.MediaMetadataCompat());
                        List listMediaSessionCompatQueueItem = networkBodyMediaDescriptionCompat.MediaSessionCompatQueueItem();
                        if (listMediaSessionCompatQueueItem != null) {
                            List list = listMediaSessionCompatQueueItem;
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((io.sentry.util.network.read) it.next()).getValue());
                            }
                            linkedHashMap4.put("warnings", arrayList);
                        }
                    }
                    if (!r8lambdadeozq815xuuwmllyyvm_qv79qy.RatingCompat().isEmpty()) {
                        linkedHashMap4.put("headers", r8lambdadeozq815xuuwmllyyvm_qv79qy.RatingCompat());
                    }
                    if (!linkedHashMap4.isEmpty()) {
                        linkedHashMap3.put("request", linkedHashMap4);
                    }
                }
                r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy2 = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                if (r8lambdadeozq815xuuwmllyyvm_qv79qy2 != null) {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    Long lPlaybackStateCompatCustomAction2 = r8lambdadeozq815xuuwmllyyvm_qv79qy2.PlaybackStateCompatCustomAction();
                    if (lPlaybackStateCompatCustomAction2 != null) {
                        linkedHashMap5.put("size", lPlaybackStateCompatCustomAction2);
                    }
                    NetworkBody networkBodyMediaDescriptionCompat2 = r8lambdadeozq815xuuwmllyyvm_qv79qy2.MediaDescriptionCompat();
                    if (networkBodyMediaDescriptionCompat2 != null) {
                        linkedHashMap5.put(PushNotificationParserObj.BODY_KEY, networkBodyMediaDescriptionCompat2.MediaMetadataCompat());
                        List listMediaSessionCompatQueueItem2 = networkBodyMediaDescriptionCompat2.MediaSessionCompatQueueItem();
                        if (listMediaSessionCompatQueueItem2 != null) {
                            List list2 = listMediaSessionCompatQueueItem2;
                            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((io.sentry.util.network.read) it2.next()).getValue());
                            }
                            linkedHashMap5.put("warnings", arrayList2);
                        }
                    }
                    if (!r8lambdadeozq815xuuwmllyyvm_qv79qy2.RatingCompat().isEmpty()) {
                        linkedHashMap5.put("headers", r8lambdadeozq815xuuwmllyyvm_qv79qy2.RatingCompat());
                    }
                    if (!linkedHashMap5.isEmpty()) {
                        linkedHashMap3.put("response", linkedHashMap5);
                    }
                }
            }
            ConcurrentHashMap concurrentHashMap5 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
            concurrentHashMap5.getClass();
            for (Map.Entry entry : concurrentHashMap5.entrySet()) {
                String str9 = (String) entry.getKey();
                Object value = entry.getValue();
                if (write.contains(str9)) {
                    str9.getClass();
                    String strWrite = setCarryoverInAppMessage.write(str9, "content_length", "body_size");
                    linkedHashMap3.put(((getInAppMessageEventMap) read.MediaSessionCompatResultReceiverWrapper()).serializer(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(strWrite, ".", strWrite), MediaSessionCompatQueueItem.write), value);
                }
            }
            playbackStateCompatCustomAction.serializer = new ConcurrentHashMap(linkedHashMap3);
            return playbackStateCompatCustomAction;
        }
        String str10 = "navigation";
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "app.lifecycle"}, getCieXyz.write())).booleanValue()) {
                str10 = "app." + getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("state");
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "device.orientation"}, getCieXyz.write())).booleanValue()) {
                    str10 = getintentarraywithconfiguredbackstacklambda1.write;
                    str10.getClass();
                    obj7 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("position");
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj7, "landscape"}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj7, "portrait"}, getCieXyz.write())).booleanValue()) {
                            return null;
                        }
                    }
                    linkedHashMap2.put("position", obj7);
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
                    zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("state"), "resumed"}, getCieXyz.write())).booleanValue();
                    concurrentHashMap2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    if (zBooleanValue) {
                        obj6 = concurrentHashMap2.get("screen");
                        if (obj6 instanceof String) {
                            str6 = (String) obj6;
                        } else {
                            str6 = null;
                        }
                        if (str6 != null) {
                            strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', str6, str6);
                        } else {
                            strIconCompatParcelizer = null;
                        }
                    } else {
                        concurrentHashMap2.getClass();
                        if (concurrentHashMap2.containsKey(RemoteMessageConst.TO)) {
                            obj5 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get(RemoteMessageConst.TO);
                            if (obj5 instanceof String) {
                                strIconCompatParcelizer = (String) obj5;
                            } else {
                                strIconCompatParcelizer = null;
                            }
                        } else {
                            strIconCompatParcelizer = null;
                        }
                    }
                    if (strIconCompatParcelizer == null) {
                        return null;
                    }
                    linkedHashMap2.put(RemoteMessageConst.TO, strIconCompatParcelizer);
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "ui.click"}, getCieXyz.write())).booleanValue()) {
                    obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.id");
                    if (obj4 == null && (obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.tag")) == null) {
                        obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.class");
                    }
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        return null;
                    }
                    ConcurrentHashMap concurrentHashMap6 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap6.getClass();
                    linkedHashMap2.putAll(concurrentHashMap6);
                    str = "ui.tap";
                    r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "system"}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "NETWORK_LOST"}, getCieXyz.write())).booleanValue()) {
                            obj2 = "offline";
                        } else {
                            concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                            concurrentHashMap.getClass();
                            if (concurrentHashMap.containsKey("network_type")) {
                                return null;
                            }
                            obj = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("network_type");
                            if (obj instanceof String) {
                                str4 = (String) obj;
                            } else {
                                str4 = null;
                            }
                            if (str4 != null || str4.length() == 0) {
                                return null;
                            }
                            obj2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("network_type");
                        }
                        linkedHashMap2.put("state", obj2);
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, linkedHashMap2.get("state")}, getCieXyz.write())).booleanValue()) {
                            return null;
                        }
                        obj3 = linkedHashMap2.get("state");
                        if (obj3 instanceof String) {
                            str5 = (String) obj3;
                        } else {
                            str5 = null;
                        }
                        this.RemoteActionCompatParcelizer = str5;
                        str10 = "device.connectivity";
                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                        ConcurrentHashMap concurrentHashMap7 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                        concurrentHashMap7.getClass();
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry2 : concurrentHashMap7.entrySet()) {
                            str3 = (String) entry2.getKey();
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                                }
                            }
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                        linkedHashMap2.putAll(linkedHashMap);
                        str10 = "device.battery";
                    } else {
                        str = getintentarraywithconfiguredbackstacklambda1.write;
                        str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                        r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                        ConcurrentHashMap concurrentHashMap8 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                        concurrentHashMap8.getClass();
                        linkedHashMap2.putAll(concurrentHashMap8);
                    }
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                    ConcurrentHashMap concurrentHashMap9 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap9.getClass();
                    linkedHashMap = new LinkedHashMap();
                    while (r5.hasNext()) {
                        str3 = (String) entry2.getKey();
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                    linkedHashMap2.putAll(linkedHashMap);
                    str10 = "device.battery";
                } else {
                    str = getintentarraywithconfiguredbackstacklambda1.write;
                    str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                    r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                    ConcurrentHashMap concurrentHashMap10 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap10.getClass();
                    linkedHashMap2.putAll(concurrentHashMap10);
                }
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
                zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("state"), "resumed"}, getCieXyz.write())).booleanValue();
                concurrentHashMap2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                if (zBooleanValue) {
                    obj6 = concurrentHashMap2.get("screen");
                    if (obj6 instanceof String) {
                        str6 = (String) obj6;
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', str6, str6);
                    } else {
                        strIconCompatParcelizer = null;
                    }
                } else {
                    concurrentHashMap2.getClass();
                    if (concurrentHashMap2.containsKey(RemoteMessageConst.TO)) {
                        obj5 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get(RemoteMessageConst.TO);
                        if (obj5 instanceof String) {
                            strIconCompatParcelizer = (String) obj5;
                        } else {
                            strIconCompatParcelizer = null;
                        }
                    } else {
                        strIconCompatParcelizer = null;
                    }
                }
                if (strIconCompatParcelizer == null) {
                    return null;
                }
                linkedHashMap2.put(RemoteMessageConst.TO, strIconCompatParcelizer);
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "ui.click"}, getCieXyz.write())).booleanValue()) {
                obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.id");
                if (obj4 == null) {
                    obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.class");
                }
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                ConcurrentHashMap concurrentHashMap11 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap11.getClass();
                linkedHashMap2.putAll(concurrentHashMap11);
                str = "ui.tap";
                r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "system"}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "NETWORK_LOST"}, getCieXyz.write())).booleanValue()) {
                        concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                        concurrentHashMap.getClass();
                        if (concurrentHashMap.containsKey("network_type")) {
                            return null;
                        }
                        obj = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("network_type");
                        if (obj instanceof String) {
                            str4 = (String) obj;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            return null;
                        }
                        return null;
                    }
                    obj2 = "offline";
                    linkedHashMap2.put("state", obj2);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, linkedHashMap2.get("state")}, getCieXyz.write())).booleanValue()) {
                        return null;
                    }
                    obj3 = linkedHashMap2.get("state");
                    if (obj3 instanceof String) {
                        str5 = (String) obj3;
                    } else {
                        str5 = null;
                    }
                    this.RemoteActionCompatParcelizer = str5;
                    str10 = "device.connectivity";
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                    ConcurrentHashMap concurrentHashMap12 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap12.getClass();
                    linkedHashMap = new LinkedHashMap();
                    while (r5.hasNext()) {
                        str3 = (String) entry2.getKey();
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                    linkedHashMap2.putAll(linkedHashMap);
                    str10 = "device.battery";
                } else {
                    str = getintentarraywithconfiguredbackstacklambda1.write;
                    str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                    r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                    ConcurrentHashMap concurrentHashMap13 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap13.getClass();
                    linkedHashMap2.putAll(concurrentHashMap13);
                }
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                ConcurrentHashMap concurrentHashMap14 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap14.getClass();
                linkedHashMap = new LinkedHashMap();
                while (r5.hasNext()) {
                    str3 = (String) entry2.getKey();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                linkedHashMap2.putAll(linkedHashMap);
                str10 = "device.battery";
            } else {
                str = getintentarraywithconfiguredbackstacklambda1.write;
                str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                ConcurrentHashMap concurrentHashMap15 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap15.getClass();
                linkedHashMap2.putAll(concurrentHashMap15);
            }
            str2 = null;
            r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
            str = str10;
        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "device.orientation"}, getCieXyz.write())).booleanValue()) {
                str10 = getintentarraywithconfiguredbackstacklambda1.write;
                str10.getClass();
                obj7 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("position");
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj7, "landscape"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj7, "portrait"}, getCieXyz.write())).booleanValue()) {
                        return null;
                    }
                }
                linkedHashMap2.put("position", obj7);
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
                zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("state"), "resumed"}, getCieXyz.write())).booleanValue();
                concurrentHashMap2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                if (zBooleanValue) {
                    obj6 = concurrentHashMap2.get("screen");
                    if (obj6 instanceof String) {
                        str6 = (String) obj6;
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', str6, str6);
                    } else {
                        strIconCompatParcelizer = null;
                    }
                } else {
                    concurrentHashMap2.getClass();
                    if (concurrentHashMap2.containsKey(RemoteMessageConst.TO)) {
                        obj5 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get(RemoteMessageConst.TO);
                        if (obj5 instanceof String) {
                            strIconCompatParcelizer = (String) obj5;
                        } else {
                            strIconCompatParcelizer = null;
                        }
                    } else {
                        strIconCompatParcelizer = null;
                    }
                }
                if (strIconCompatParcelizer == null) {
                    return null;
                }
                linkedHashMap2.put(RemoteMessageConst.TO, strIconCompatParcelizer);
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "ui.click"}, getCieXyz.write())).booleanValue()) {
                obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.id");
                if (obj4 == null) {
                    obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.class");
                }
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                ConcurrentHashMap concurrentHashMap16 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap16.getClass();
                linkedHashMap2.putAll(concurrentHashMap16);
                str = "ui.tap";
                r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "system"}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "NETWORK_LOST"}, getCieXyz.write())).booleanValue()) {
                        concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                        concurrentHashMap.getClass();
                        if (concurrentHashMap.containsKey("network_type")) {
                            return null;
                        }
                        obj = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("network_type");
                        if (obj instanceof String) {
                            str4 = (String) obj;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            return null;
                        }
                        return null;
                    }
                    obj2 = "offline";
                    linkedHashMap2.put("state", obj2);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, linkedHashMap2.get("state")}, getCieXyz.write())).booleanValue()) {
                        return null;
                    }
                    obj3 = linkedHashMap2.get("state");
                    if (obj3 instanceof String) {
                        str5 = (String) obj3;
                    } else {
                        str5 = null;
                    }
                    this.RemoteActionCompatParcelizer = str5;
                    str10 = "device.connectivity";
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                    ConcurrentHashMap concurrentHashMap17 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap17.getClass();
                    linkedHashMap = new LinkedHashMap();
                    while (r5.hasNext()) {
                        str3 = (String) entry2.getKey();
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                    linkedHashMap2.putAll(linkedHashMap);
                    str10 = "device.battery";
                } else {
                    str = getintentarraywithconfiguredbackstacklambda1.write;
                    str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                    r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                    ConcurrentHashMap concurrentHashMap18 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap18.getClass();
                    linkedHashMap2.putAll(concurrentHashMap18);
                }
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                ConcurrentHashMap concurrentHashMap19 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap19.getClass();
                linkedHashMap = new LinkedHashMap();
                while (r5.hasNext()) {
                    str3 = (String) entry2.getKey();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                linkedHashMap2.putAll(linkedHashMap);
                str10 = "device.battery";
            } else {
                str = getintentarraywithconfiguredbackstacklambda1.write;
                str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                ConcurrentHashMap concurrentHashMap110 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap110.getClass();
                linkedHashMap2.putAll(concurrentHashMap110);
            }
            str2 = null;
            r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
            str = str10;
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "navigation"}, getCieXyz.write())).booleanValue()) {
                zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("state"), "resumed"}, getCieXyz.write())).booleanValue();
                concurrentHashMap2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                if (zBooleanValue) {
                    obj6 = concurrentHashMap2.get("screen");
                    if (obj6 instanceof String) {
                        str6 = (String) obj6;
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', str6, str6);
                    } else {
                        strIconCompatParcelizer = null;
                    }
                } else {
                    concurrentHashMap2.getClass();
                    if (concurrentHashMap2.containsKey(RemoteMessageConst.TO)) {
                        obj5 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get(RemoteMessageConst.TO);
                        if (obj5 instanceof String) {
                            strIconCompatParcelizer = (String) obj5;
                        } else {
                            strIconCompatParcelizer = null;
                        }
                    } else {
                        strIconCompatParcelizer = null;
                    }
                }
                if (strIconCompatParcelizer == null) {
                    return null;
                }
                linkedHashMap2.put(RemoteMessageConst.TO, strIconCompatParcelizer);
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "ui.click"}, getCieXyz.write())).booleanValue()) {
                obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.id");
                if (obj4 == null) {
                    obj4 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("view.class");
                }
                if (obj4 instanceof String) {
                    str2 = (String) obj4;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                ConcurrentHashMap concurrentHashMap111 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap111.getClass();
                linkedHashMap2.putAll(concurrentHashMap111);
                str = "ui.tap";
                r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, "system"}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "NETWORK_LOST"}, getCieXyz.write())).booleanValue()) {
                        concurrentHashMap = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                        concurrentHashMap.getClass();
                        if (concurrentHashMap.containsKey("network_type")) {
                            return null;
                        }
                        obj = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("network_type");
                        if (obj instanceof String) {
                            str4 = (String) obj;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            return null;
                        }
                        return null;
                    }
                    obj2 = "offline";
                    linkedHashMap2.put("state", obj2);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, linkedHashMap2.get("state")}, getCieXyz.write())).booleanValue()) {
                        return null;
                    }
                    obj3 = linkedHashMap2.get("state");
                    if (obj3 instanceof String) {
                        str5 = (String) obj3;
                    } else {
                        str5 = null;
                    }
                    this.RemoteActionCompatParcelizer = str5;
                    str10 = "device.connectivity";
                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                    ConcurrentHashMap concurrentHashMap112 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap112.getClass();
                    linkedHashMap = new LinkedHashMap();
                    while (r5.hasNext()) {
                        str3 = (String) entry2.getKey();
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                    linkedHashMap2.putAll(linkedHashMap);
                    str10 = "device.battery";
                } else {
                    str = getintentarraywithconfiguredbackstacklambda1.write;
                    str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                    r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                    ConcurrentHashMap concurrentHashMap113 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                    concurrentHashMap113.getClass();
                    linkedHashMap2.putAll(concurrentHashMap113);
                }
            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("action"), "BATTERY_CHANGED"}, getCieXyz.write())).booleanValue()) {
                ConcurrentHashMap concurrentHashMap114 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap114.getClass();
                linkedHashMap = new LinkedHashMap();
                while (r5.hasNext()) {
                    str3 = (String) entry2.getKey();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "level"}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "charging"}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                linkedHashMap2.putAll(linkedHashMap);
                str10 = "device.battery";
            } else {
                str = getintentarraywithconfiguredbackstacklambda1.write;
                str2 = getintentarraywithconfiguredbackstacklambda1.serializer;
                r8lambdal32xcezw71g2xzeh1nm3nimxco = getintentarraywithconfiguredbackstacklambda1.read;
                ConcurrentHashMap concurrentHashMap115 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                concurrentHashMap115.getClass();
                linkedHashMap2.putAll(concurrentHashMap115);
            }
            str2 = null;
            r8lambdal32xcezw71g2xzeh1nm3nimxco = null;
            str = str10;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        io.sentry.rrweb.serializer serializerVar = new io.sentry.rrweb.serializer();
        serializerVar.PlaybackStateCompatCustomAction = getintentarraywithconfiguredbackstacklambda1.write().getTime();
        serializerVar.RemoteActionCompatParcelizer = getintentarraywithconfiguredbackstacklambda1.write().getTime() / 1000.0d;
        serializerVar.write = "default";
        serializerVar.serializer = str;
        serializerVar.RatingCompat = str2;
        serializerVar.MediaMetadataCompat = r8lambdal32xcezw71g2xzeh1nm3nimxco;
        serializerVar.read = new ConcurrentHashMap(linkedHashMap2);
        return serializerVar;
    }

    public serializer(SentryOptions sentryOptions) {
        sentryOptions.getClass();
        this.IconCompatParcelizer = Collections.synchronizedMap(new RemoteActionCompatParcelizer());
        sentryOptions.setBeforeBreadcrumb(new OkHttpCall$1((Object) this, (Object) sentryOptions.getBeforeBreadcrumb(), false));
    }
}
