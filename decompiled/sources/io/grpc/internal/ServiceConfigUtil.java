package io.grpc.internal;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.io.TextStreamsKt;
import o.BrazeWebViewClientType;
import o.BrazeWebViewClientWhenMappings;
import o.accessgetSystemHomecp;
import o.getDeclaredMethodQuietlylambda1;
import o.getLocalHtmlUrlFromRemoteUrllambda5;
import o.invokeMethodQuietly;
import o.markPageFinishedlambda00;
import o.wouldPushPermissionPromptDisplaylambda1;
import o.wouldPushPermissionPromptDisplaylambda3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ServiceConfigUtil {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i5 | i6)) | i8;
        int i10 = (~(i6 | (~i2))) | (~((~i5) | i7)) | i8;
        int i11 = i7 | i5 | i2;
        int i12 = i5 + i2 + i4 + (1050315579 * i) + (2086215248 * i3);
        int i13 = i12 * i12;
        int i14 = (i5 * (-1156115713)) + 1671168000 + ((-1156115713) * i2) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i4) + ((-1303117824) * i) + (314572800 * i3) + (431423488 * i13);
        int i15 = ((i5 * (-961373039)) - 1316831794) + (i2 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i4 * (-961372049)) + (i * 755842709) + (i3 * (-1858722640)) + (i13 * (-2040987648));
        int i16 = i14 + (i15 * i15 * 1361641472);
        if (i16 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i16 == 2) {
            return read(objArr);
        }
        if (i16 != 3) {
            return i16 != 4 ? RemoteActionCompatParcelizer(objArr) : serializer(objArr);
        }
        return write(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        SideMenuFragment sideMenuFragment = new SideMenuFragment();
        int i2 = RemoteActionCompatParcelizer + 125;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return sideMenuFragment;
    }

    public static Map IconCompatParcelizer(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("hedgingPolicy", map);
        }
        getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("hedgingPolicy", map);
        throw null;
    }

    public static Integer MediaBrowserCompatMediaItem(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Integer numWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("maxAttempts", map);
        int i4 = RemoteActionCompatParcelizer + 25;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return numWrite;
    }

    public static Long MediaSessionCompatQueueItem(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Long lMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("maxBackoff", map);
        int i4 = RemoteActionCompatParcelizer + 13;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lMediaSessionCompatQueueItem;
    }

    public static String MediaSessionCompatResultReceiverWrapper(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strRatingCompat = getLocalHtmlUrlFromRemoteUrllambda5.RatingCompat("method", map);
        int i4 = write + 23;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strRatingCompat;
        }
        throw null;
    }

    public static Integer ParcelableVolumeInfo(Map map) {
        int i = 2 % 2;
        int i2 = write + 99;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getLocalHtmlUrlFromRemoteUrllambda5.write("maxResponseMessageBytes", map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer numWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("maxResponseMessageBytes", map);
        int i3 = write + 51;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return numWrite;
    }

    public static Integer RatingCompat(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Integer numWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("maxRequestMessageBytes", map);
        int i4 = write + 25;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return numWrite;
    }

    public static Map r8lambda54BeH8ZsBru0CXI2CCSP2syNys(Map map) {
        int i = 2 % 2;
        int i2 = write + 31;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("retryPolicy", map);
        }
        getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("retryPolicy", map);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Long lMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("perAttemptRecvTimeout", map);
        int i4 = RemoteActionCompatParcelizer + 83;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lMediaSessionCompatQueueItem;
    }

    public static String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strRatingCompat = getLocalHtmlUrlFromRemoteUrllambda5.RatingCompat("service", map);
        int i4 = RemoteActionCompatParcelizer + 89;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strRatingCompat;
        }
        throw null;
    }

    public static Long read(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Long lMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("hedgingDelay", map);
        int i4 = write + 77;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lMediaSessionCompatQueueItem;
    }

    public static Double serializer(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Double dIconCompatParcelizer = getLocalHtmlUrlFromRemoteUrllambda5.IconCompatParcelizer("backoffMultiplier", map);
        int i4 = write + 15;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return dIconCompatParcelizer;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        Integer numWrite;
        Map map = (Map) objArr[0];
        int i = 2 % 2;
        int i2 = write + 119;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            numWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("maxAttempts", map);
            int i3 = 34 / 0;
        } else {
            numWrite = getLocalHtmlUrlFromRemoteUrllambda5.write("maxAttempts", map);
        }
        int i4 = write + 69;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return numWrite;
    }

    public static Long write(Map map) {
        Long lMediaSessionCompatQueueItem;
        int i = 2 % 2;
        int i2 = write + 101;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            lMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("initialBackoff", map);
            int i3 = 15 / 0;
        } else {
            lMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("initialBackoff", map);
        }
        int i4 = write + 121;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lMediaSessionCompatQueueItem;
    }

    public static Boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(Map map) {
        int i = 2 % 2;
        int i2 = write + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getLocalHtmlUrlFromRemoteUrllambda5.read("waitForReady", map);
        }
        getLocalHtmlUrlFromRemoteUrllambda5.read("waitForReady", map);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Long lMediaSessionCompatQueueItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("timeout", map);
            int i3 = RemoteActionCompatParcelizer + 65;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return lMediaSessionCompatQueueItem;
        }
        getLocalHtmlUrlFromRemoteUrllambda5.MediaSessionCompatQueueItem("timeout", map);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Map RemoteActionCompatParcelizer(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (map == null) {
            return null;
        }
        Map mapMediaBrowserCompatMediaItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("healthCheckConfig", map);
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return mapMediaBrowserCompatMediaItem;
    }

    public static List MediaSessionCompatToken(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List listSerializer = getLocalHtmlUrlFromRemoteUrllambda5.serializer("name", map);
        if (listSerializer != null) {
            getLocalHtmlUrlFromRemoteUrllambda5.write(listSerializer);
            return listSerializer;
        }
        int i4 = write + 115;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static List PlaybackStateCompat(Map map) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List listSerializer = getLocalHtmlUrlFromRemoteUrllambda5.serializer("methodConfig", map);
        if (listSerializer == null) {
            int i4 = RemoteActionCompatParcelizer + 73;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        getLocalHtmlUrlFromRemoteUrllambda5.write(listSerializer);
        int i6 = write + 1;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return listSerializer;
    }

    public static Set ComponentActivity(Map map) {
        boolean z;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write("retryableStatusCodes", map);
            throw null;
        }
        Set setWrite = write("retryableStatusCodes", map);
        if (setWrite != null) {
            int i3 = write + 73;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        Verify.IconCompatParcelizer("%s is required in retry policy", "retryableStatusCodes", z);
        Verify.IconCompatParcelizer("%s must not contain OK", "retryableStatusCodes", !setWrite.contains(invokeMethodQuietly.OK));
        return setWrite;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write("nonFatalStatusCodes", map);
            throw null;
        }
        Set setWrite = write("nonFatalStatusCodes", map);
        if (setWrite == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(invokeMethodQuietly.class));
        }
        Verify.IconCompatParcelizer("%s must not contain OK", "nonFatalStatusCodes", !setWrite.contains(invokeMethodQuietly.OK));
        int i3 = RemoteActionCompatParcelizer + 85;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setWrite;
    }

    public static List MediaMetadataCompat(Map map) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listSerializer = getLocalHtmlUrlFromRemoteUrllambda5.serializer("loadBalancingConfig", map);
            if (listSerializer == null) {
                int i2 = RemoteActionCompatParcelizer + 69;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                listSerializer = null;
            } else {
                getLocalHtmlUrlFromRemoteUrllambda5.write(listSerializer);
            }
            arrayList.addAll(listSerializer);
        }
        if (arrayList.isEmpty()) {
            int i4 = write + 77;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String strRatingCompat = getLocalHtmlUrlFromRemoteUrllambda5.RatingCompat("loadBalancingPolicy", map);
            if (strRatingCompat != null) {
                arrayList.add(Collections.singletonMap(strRatingCompat.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static markPageFinishedlambda00 ResultReceiver(Map map) {
        Map mapMediaBrowserCompatMediaItem;
        boolean z;
        int i = 2 % 2;
        if (map == null || (mapMediaBrowserCompatMediaItem = getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem("retryThrottling", map)) == null) {
            return null;
        }
        float fFloatValue = getLocalHtmlUrlFromRemoteUrllambda5.IconCompatParcelizer("maxTokens", mapMediaBrowserCompatMediaItem).floatValue();
        float fFloatValue2 = getLocalHtmlUrlFromRemoteUrllambda5.IconCompatParcelizer("tokenRatio", mapMediaBrowserCompatMediaItem).floatValue();
        if (fFloatValue > 0.0f) {
            int i2 = RemoteActionCompatParcelizer + 43;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = write + 31;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
            z = false;
        }
        TextStreamsKt.RemoteActionCompatParcelizer("maxToken should be greater than zero", z);
        TextStreamsKt.RemoteActionCompatParcelizer("tokenRatio should be greater than zero", fFloatValue2 > 0.0f);
        return new markPageFinishedlambda00(fFloatValue, fFloatValue2);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        List<Map> list = (List) objArr[0];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 125;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (list == null) {
            int i4 = i2 + 85;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i2 + 19;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map map : list) {
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new BrazeWebViewClientWhenMappings(str, getLocalHtmlUrlFromRemoteUrllambda5.MediaBrowserCompatMediaItem(str, map)));
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        int i8 = write + 65;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return listUnmodifiableList;
    }

    public static getDeclaredMethodQuietlylambda1 RemoteActionCompatParcelizer(List list, wouldPushPermissionPromptDisplaylambda1 wouldpushpermissionpromptdisplaylambda1) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i2 = RemoteActionCompatParcelizer + 115;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            BrazeWebViewClientWhenMappings brazeWebViewClientWhenMappings = (BrazeWebViewClientWhenMappings) it.next();
            String str = brazeWebViewClientWhenMappings.IconCompatParcelizer;
            wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3 = wouldpushpermissionpromptdisplaylambda1.read(str);
            Object obj = null;
            if (wouldpushpermissionpromptdisplaylambda3 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(ServiceConfigUtil.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1 = wouldpushpermissionpromptdisplaylambda3.read(brazeWebViewClientWhenMappings.read);
                if (getdeclaredmethodquietlylambda1.IconCompatParcelizer == null) {
                    return new getDeclaredMethodQuietlylambda1(new BrazeWebViewClientType(wouldpushpermissionpromptdisplaylambda3, getdeclaredmethodquietlylambda1.write));
                }
                int i4 = RemoteActionCompatParcelizer + 29;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return getdeclaredmethodquietlylambda1;
                }
                throw null;
            }
            int i5 = write + 5;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                arrayList.add(str);
                obj.hashCode();
                throw null;
            }
            arrayList.add(str);
        }
        return new getDeclaredMethodQuietlylambda1(Status.ParcelableVolumeInfo.IconCompatParcelizer("None of " + arrayList + " specified by Service Config are available."));
    }

    public static Set write(String str, Map map) {
        invokeMethodQuietly invokemethodquietlyValueOf;
        boolean z;
        int i = 2 % 2;
        List listSerializer = getLocalHtmlUrlFromRemoteUrllambda5.serializer(str, map);
        if (listSerializer == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(invokeMethodQuietly.class);
        for (Object obj : listSerializer) {
            boolean z2 = false;
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                if (iIntValue == d.doubleValue()) {
                    int i2 = RemoteActionCompatParcelizer + 111;
                    write = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Verify.IconCompatParcelizer("Status code %s is not integral", obj, z);
                invokemethodquietlyValueOf = Status.serializer(iIntValue).PlaybackStateCompat;
                if (invokemethodquietlyValueOf.value() == d.intValue()) {
                    int i4 = RemoteActionCompatParcelizer + 45;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    z2 = true;
                }
                Verify.IconCompatParcelizer("Status code %s is not valid", obj, z2);
            } else {
                if (!(obj instanceof String)) {
                    StringBuilder sb = new StringBuilder("Can not convert status code ");
                    sb.append(obj);
                    Class<?> cls = obj.getClass();
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(cls);
                    throw new VerifyException(sb.toString(), 0);
                }
                try {
                    invokemethodquietlyValueOf = invokeMethodQuietly.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException(af$$ExternalSyntheticOutline0.m(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(invokemethodquietlyValueOf);
            int i6 = RemoteActionCompatParcelizer + 83;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List RemoteActionCompatParcelizer(List list) {
        int i = accessgetSystemHomecp.read();
        int i2 = accessgetSystemHomecp.read();
        return (List) RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 1354250273, new Object[]{list}, accessgetSystemHomecp.read(), i2, -1354250273, i);
    }

    public static SideMenuFragment read() {
        int i = accessgetSystemHomecp.read();
        int i2 = accessgetSystemHomecp.read();
        return (SideMenuFragment) RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), -1553495200, new Object[0], accessgetSystemHomecp.read(), i2, 1553495202, i);
    }

    public static Long r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(Map map) {
        int i = accessgetSystemHomecp.read();
        int i2 = accessgetSystemHomecp.read();
        return (Long) RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 156032058, new Object[]{map}, accessgetSystemHomecp.read(), i2, -156032055, i);
    }

    public static Set PlaybackStateCompatCustomAction(Map map) {
        int i = accessgetSystemHomecp.read();
        int i2 = accessgetSystemHomecp.read();
        return (Set) RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 2023517407, new Object[]{map}, accessgetSystemHomecp.read(), i2, -2023517406, i);
    }

    public static Integer MediaDescriptionCompat(Map map) {
        int i = accessgetSystemHomecp.read();
        int i2 = accessgetSystemHomecp.read();
        return (Integer) RemoteActionCompatParcelizer(accessgetSystemHomecp.read(), 889539650, new Object[]{map}, accessgetSystemHomecp.read(), i2, -889539646, i);
    }
}
