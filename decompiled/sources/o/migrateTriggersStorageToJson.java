package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "AndroidGisApi")
public class migrateTriggersStorageToJson {
    private final TriggerDataStoreProviderCompanionExternalSyntheticLambda0 read;

    public migrateTriggersStorageToJson(TriggerDataStoreProviderCompanionExternalSyntheticLambda0 triggerDataStoreProviderCompanionExternalSyntheticLambda0) {
        this.read = triggerDataStoreProviderCompanionExternalSyntheticLambda0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0202  */
    /* JADX WARN: Code duplicated, block: B:55:0x020a  */
    /* JADX WARN: Code duplicated, block: B:58:0x021d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0227  */
    /* JADX WARN: Code duplicated, block: B:80:0x0248 A[EDGE_INSN: B:80:0x0248->B:62:0x0248 BREAK  A[LOOP:2: B:26:0x00ae->B:61:0x0235], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0235 A[SYNTHETIC] */
    public final List RemoteActionCompatParcelizer(setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release) {
        Iterator it;
        double d;
        double d2;
        ArrayList arrayList;
        Iterator it2;
        setOptInWhenPushAuthorized setoptinwhenpushauthorized;
        double d3;
        boolean zHasNext;
        Iterator it3;
        double d4;
        ArrayList arrayList2;
        setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release;
        setIsSessionStartBasedTimeoutEnabled setissessionstartbasedtimeoutenabled;
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release2;
        double dIconCompatParcelizer;
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release3;
        double dIconCompatParcelizer2;
        double dIconCompatParcelizer3;
        double d5;
        setOptInWhenPushAuthorized setoptinwhenpushauthorized2;
        double d6;
        double d7;
        double d8;
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release4;
        List list;
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release5;
        double dIconCompatParcelizer4;
        double d9;
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release6 = setlargenotificationiconnameandroid_sdk_base_release;
        ArrayList arrayList3 = new ArrayList();
        Location location = new Location("");
        double d10 = setlargenotificationiconnameandroid_sdk_base_release6.b;
        location.setLongitude(d10);
        double d11 = setlargenotificationiconnameandroid_sdk_base_release6.a;
        location.setLatitude(d11);
        Iterator it4 = this.read.serializer(location, 120).iterator();
        while (it4.hasNext()) {
            setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release2 = (setSdkFlavorandroid_sdk_base_release) it4.next();
            setSdkFlavor setsdkflavor = setsdkflavorandroid_sdk_base_release2.d;
            setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release7 = setsdkflavorandroid_sdk_base_release2.a;
            if (setsdkflavor != null) {
                setSdkAuthEnabledandroid_sdk_base_release setsdkauthenabledandroid_sdk_base_release = setsdkflavor.a;
                setIsAutomaticLocationCollectionEnabled setisautomaticlocationcollectionenabled = setsdkflavor.c;
                if (setisautomaticlocationcollectionenabled.e <= d10 && setisautomaticlocationcollectionenabled.f <= d11 && setisautomaticlocationcollectionenabled.g >= d10 && setisautomaticlocationcollectionenabled.h >= d11 && setServerTargetandroid_sdk_base_release.serializer(setlargenotificationiconnameandroid_sdk_base_release6, setsdkauthenabledandroid_sdk_base_release, false)) {
                    Iterator it5 = setsdkflavor.b.iterator();
                    boolean z = false;
                    while (it5.hasNext()) {
                        if (setServerTargetandroid_sdk_base_release.serializer(setlargenotificationiconnameandroid_sdk_base_release6, (setSdkAuthEnabledandroid_sdk_base_release) it5.next(), true)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        setissessionstartbasedtimeoutenabled = new setIsSessionStartBasedTimeoutEnabled(setlargenotificationiconnameandroid_sdk_base_release6, 0.0d, true);
                        arrayList2 = arrayList3;
                        it = it4;
                        d = d10;
                        d2 = d11;
                        setsdkflavorandroid_sdk_base_release = setsdkflavorandroid_sdk_base_release2;
                    } else {
                        setsdkauthenabledandroid_sdk_base_release.getClass();
                        setOptInWhenPushAuthorized setoptinwhenpushauthorized3 = new setOptInWhenPushAuthorized(new setLargeNotificationIconNameandroid_sdk_base_release(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, -1);
                        it2 = setsdkauthenabledandroid_sdk_base_release.a.iterator();
                        setoptinwhenpushauthorized = setoptinwhenpushauthorized3;
                        d3 = 0.0d;
                        while (true) {
                            zHasNext = it2.hasNext();
                            d = d10;
                            it3 = it4;
                            d4 = setoptinwhenpushauthorized.read;
                            if (zHasNext) {
                                break;
                                break;
                            }
                            setIsHtmlInAppMessageApplyWindowInsetsEnabled setishtmlinappmessageapplywindowinsetsenabled = (setIsHtmlInAppMessageApplyWindowInsetsEnabled) it2.next();
                            setlargenotificationiconnameandroid_sdk_base_release2 = (setLargeNotificationIconNameandroid_sdk_base_release) setishtmlinappmessageapplywindowinsetsenabled.a.serializer;
                            Iterator it6 = it2;
                            dIconCompatParcelizer = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release2);
                            setlargenotificationiconnameandroid_sdk_base_release3 = (setLargeNotificationIconNameandroid_sdk_base_release) setishtmlinappmessageapplywindowinsetsenabled.a.write;
                            double d12 = d11;
                            dIconCompatParcelizer2 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release3);
                            dIconCompatParcelizer3 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2, setlargenotificationiconnameandroid_sdk_base_release3);
                            double dMax = Math.max(dIconCompatParcelizer, dIconCompatParcelizer2);
                            setlargenotificationiconnameandroid_sdk_base_release2.getClass();
                            setlargenotificationiconnameandroid_sdk_base_release3.getClass();
                            double dIconCompatParcelizer5 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2.b);
                            d5 = d3;
                            double dIconCompatParcelizer6 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release3.b);
                            ArrayList arrayList4 = arrayList3;
                            double dIconCompatParcelizer7 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2.a);
                            setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release3 = setsdkflavorandroid_sdk_base_release2;
                            double dIconCompatParcelizer8 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release3.a);
                            double d13 = dIconCompatParcelizer6 - dIconCompatParcelizer5;
                            double dAtan2 = (Math.atan2(Math.sin(d13) * Math.cos(dIconCompatParcelizer8), (Math.sin(dIconCompatParcelizer8) * Math.cos(dIconCompatParcelizer7)) - (Math.cos(d13) * (Math.cos(dIconCompatParcelizer8) * Math.sin(dIconCompatParcelizer7)))) * 180.0d) / 3.141592653589793d;
                            setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release8 = setServerTargetandroid_sdk_base_release.read(setlargenotificationiconnameandroid_sdk_base_release6, dMax, dAtan2 + 90.0d);
                            setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release9 = setServerTargetandroid_sdk_base_release.read(setlargenotificationiconnameandroid_sdk_base_release6, dMax, dAtan2 - 90.0d);
                            new setIsHtmlInAppMessageApplyWindowInsetsEnabled(new onViewAttachedToWindowlambda0(setlargenotificationiconnameandroid_sdk_base_release8, setlargenotificationiconnameandroid_sdk_base_release9));
                            new setIsHtmlInAppMessageApplyWindowInsetsEnabled(new onViewAttachedToWindowlambda0(setlargenotificationiconnameandroid_sdk_base_release2, setlargenotificationiconnameandroid_sdk_base_release3));
                            double d14 = setlargenotificationiconnameandroid_sdk_base_release8.b;
                            double d15 = setlargenotificationiconnameandroid_sdk_base_release8.a;
                            double d16 = setlargenotificationiconnameandroid_sdk_base_release9.b;
                            double d17 = setlargenotificationiconnameandroid_sdk_base_release9.a;
                            double d18 = setlargenotificationiconnameandroid_sdk_base_release2.b;
                            setoptinwhenpushauthorized2 = setoptinwhenpushauthorized;
                            double d19 = setlargenotificationiconnameandroid_sdk_base_release2.a;
                            double d20 = setlargenotificationiconnameandroid_sdk_base_release3.b;
                            double d21 = setlargenotificationiconnameandroid_sdk_base_release3.a - d19;
                            double d22 = d16 - d14;
                            double d23 = d20 - d18;
                            double d24 = d17 - d15;
                            d6 = (d21 * d22) - (d23 * d24);
                            double d25 = d15 - d19;
                            double d26 = d14 - d18;
                            d7 = (d23 * d25) - (d21 * d26);
                            d8 = (d25 * d22) - (d26 * d24);
                            if (d6 == 0.0d) {
                                setlargenotificationiconnameandroid_sdk_base_release4 = null;
                            } else {
                                d9 = d7 / d6;
                                double d27 = d8 / d6;
                                if (0.0d <= d9) {
                                    setlargenotificationiconnameandroid_sdk_base_release4 = null;
                                } else {
                                    setlargenotificationiconnameandroid_sdk_base_release4 = null;
                                }
                            }
                            if (setlargenotificationiconnameandroid_sdk_base_release4 != null) {
                                list = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{setlargenotificationiconnameandroid_sdk_base_release4}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                            } else {
                                list = instance_delegatelambda0.write;
                            }
                            setlargenotificationiconnameandroid_sdk_base_release5 = (setLargeNotificationIconNameandroid_sdk_base_release) onContentCardDismissed.read(0, list);
                            if (dIconCompatParcelizer < d4) {
                                setoptinwhenpushauthorized = new setOptInWhenPushAuthorized(setlargenotificationiconnameandroid_sdk_base_release2, dIconCompatParcelizer, d5, 0);
                            } else {
                                setoptinwhenpushauthorized = setoptinwhenpushauthorized2;
                            }
                            if (dIconCompatParcelizer2 < setoptinwhenpushauthorized.read) {
                                setoptinwhenpushauthorized = new setOptInWhenPushAuthorized(setlargenotificationiconnameandroid_sdk_base_release3, dIconCompatParcelizer2, d5 + dIconCompatParcelizer3, 1);
                            }
                            setlargenotificationiconnameandroid_sdk_base_release6 = setlargenotificationiconnameandroid_sdk_base_release;
                            if (setlargenotificationiconnameandroid_sdk_base_release5 != null) {
                                dIconCompatParcelizer4 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release5);
                                if (dIconCompatParcelizer4 < setoptinwhenpushauthorized.read) {
                                    setoptinwhenpushauthorized = new setOptInWhenPushAuthorized(setlargenotificationiconnameandroid_sdk_base_release5, dIconCompatParcelizer4, setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2, setlargenotificationiconnameandroid_sdk_base_release5) + d5, 0);
                                }
                            }
                            d3 = d5 + dIconCompatParcelizer3;
                            d10 = d;
                            it2 = it6;
                            d11 = d12;
                            it4 = it3;
                            arrayList3 = arrayList4;
                            setsdkflavorandroid_sdk_base_release2 = setsdkflavorandroid_sdk_base_release3;
                        }
                        arrayList2 = arrayList3;
                        it = it3;
                        d2 = d11;
                        setsdkflavorandroid_sdk_base_release = setsdkflavorandroid_sdk_base_release2;
                        setissessionstartbasedtimeoutenabled = new setIsSessionStartBasedTimeoutEnabled(setoptinwhenpushauthorized.RemoteActionCompatParcelizer, d4, false);
                    }
                } else {
                    setsdkauthenabledandroid_sdk_base_release.getClass();
                    setOptInWhenPushAuthorized setoptinwhenpushauthorized4 = new setOptInWhenPushAuthorized(new setLargeNotificationIconNameandroid_sdk_base_release(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, -1);
                    it2 = setsdkauthenabledandroid_sdk_base_release.a.iterator();
                    setoptinwhenpushauthorized = setoptinwhenpushauthorized4;
                    d3 = 0.0d;
                    while (true) {
                        zHasNext = it2.hasNext();
                        d = d10;
                        it3 = it4;
                        d4 = setoptinwhenpushauthorized.read;
                        if (zHasNext) {
                            break;
                        }
                        setIsHtmlInAppMessageApplyWindowInsetsEnabled setishtmlinappmessageapplywindowinsetsenabled2 = (setIsHtmlInAppMessageApplyWindowInsetsEnabled) it2.next();
                        setlargenotificationiconnameandroid_sdk_base_release2 = (setLargeNotificationIconNameandroid_sdk_base_release) setishtmlinappmessageapplywindowinsetsenabled2.a.serializer;
                        Iterator it7 = it2;
                        dIconCompatParcelizer = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release2);
                        setlargenotificationiconnameandroid_sdk_base_release3 = (setLargeNotificationIconNameandroid_sdk_base_release) setishtmlinappmessageapplywindowinsetsenabled2.a.write;
                        double d110 = d11;
                        dIconCompatParcelizer2 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release3);
                        dIconCompatParcelizer3 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2, setlargenotificationiconnameandroid_sdk_base_release3);
                        double dMax2 = Math.max(dIconCompatParcelizer, dIconCompatParcelizer2);
                        setlargenotificationiconnameandroid_sdk_base_release2.getClass();
                        setlargenotificationiconnameandroid_sdk_base_release3.getClass();
                        double dIconCompatParcelizer9 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2.b);
                        d5 = d3;
                        double dIconCompatParcelizer10 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release3.b);
                        ArrayList arrayList5 = arrayList3;
                        double dIconCompatParcelizer11 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2.a);
                        setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release4 = setsdkflavorandroid_sdk_base_release2;
                        double dIconCompatParcelizer12 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release3.a);
                        double d111 = dIconCompatParcelizer10 - dIconCompatParcelizer9;
                        double dAtan3 = (Math.atan2(Math.sin(d111) * Math.cos(dIconCompatParcelizer12), (Math.sin(dIconCompatParcelizer12) * Math.cos(dIconCompatParcelizer11)) - (Math.cos(d111) * (Math.cos(dIconCompatParcelizer12) * Math.sin(dIconCompatParcelizer11)))) * 180.0d) / 3.141592653589793d;
                        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release10 = setServerTargetandroid_sdk_base_release.read(setlargenotificationiconnameandroid_sdk_base_release6, dMax2, dAtan3 + 90.0d);
                        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release11 = setServerTargetandroid_sdk_base_release.read(setlargenotificationiconnameandroid_sdk_base_release6, dMax2, dAtan3 - 90.0d);
                        new setIsHtmlInAppMessageApplyWindowInsetsEnabled(new onViewAttachedToWindowlambda0(setlargenotificationiconnameandroid_sdk_base_release10, setlargenotificationiconnameandroid_sdk_base_release11));
                        new setIsHtmlInAppMessageApplyWindowInsetsEnabled(new onViewAttachedToWindowlambda0(setlargenotificationiconnameandroid_sdk_base_release2, setlargenotificationiconnameandroid_sdk_base_release3));
                        double d112 = setlargenotificationiconnameandroid_sdk_base_release10.b;
                        double d113 = setlargenotificationiconnameandroid_sdk_base_release10.a;
                        double d114 = setlargenotificationiconnameandroid_sdk_base_release11.b;
                        double d115 = setlargenotificationiconnameandroid_sdk_base_release11.a;
                        double d116 = setlargenotificationiconnameandroid_sdk_base_release2.b;
                        setoptinwhenpushauthorized2 = setoptinwhenpushauthorized;
                        double d117 = setlargenotificationiconnameandroid_sdk_base_release2.a;
                        double d28 = setlargenotificationiconnameandroid_sdk_base_release3.b;
                        double d29 = setlargenotificationiconnameandroid_sdk_base_release3.a - d117;
                        double d210 = d114 - d112;
                        double d211 = d28 - d116;
                        double d212 = d115 - d113;
                        d6 = (d29 * d210) - (d211 * d212);
                        double d213 = d113 - d117;
                        double d214 = d112 - d116;
                        d7 = (d211 * d213) - (d29 * d214);
                        d8 = (d213 * d210) - (d214 * d212);
                        if (d6 == 0.0d && !(d7 == 0.0d && d8 == 0.0d)) {
                            d9 = d7 / d6;
                            double d215 = d8 / d6;
                            if (0.0d <= d9 || d9 > 1.0d || 0.0d > d215 || d215 > 1.0d) {
                                setlargenotificationiconnameandroid_sdk_base_release4 = null;
                            } else {
                                setlargenotificationiconnameandroid_sdk_base_release4 = new setLargeNotificationIconNameandroid_sdk_base_release((d212 * d9) + d113, (d210 * d9) + d112);
                            }
                        } else {
                            setlargenotificationiconnameandroid_sdk_base_release4 = null;
                        }
                        if (setlargenotificationiconnameandroid_sdk_base_release4 != null) {
                            list = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{setlargenotificationiconnameandroid_sdk_base_release4}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                        } else {
                            list = instance_delegatelambda0.write;
                        }
                        setlargenotificationiconnameandroid_sdk_base_release5 = (setLargeNotificationIconNameandroid_sdk_base_release) onContentCardDismissed.read(0, list);
                        if (dIconCompatParcelizer < d4) {
                            setoptinwhenpushauthorized = new setOptInWhenPushAuthorized(setlargenotificationiconnameandroid_sdk_base_release2, dIconCompatParcelizer, d5, 0);
                        } else {
                            setoptinwhenpushauthorized = setoptinwhenpushauthorized2;
                        }
                        if (dIconCompatParcelizer2 < setoptinwhenpushauthorized.read) {
                            setoptinwhenpushauthorized = new setOptInWhenPushAuthorized(setlargenotificationiconnameandroid_sdk_base_release3, dIconCompatParcelizer2, d5 + dIconCompatParcelizer3, 1);
                        }
                        setlargenotificationiconnameandroid_sdk_base_release6 = setlargenotificationiconnameandroid_sdk_base_release;
                        if (setlargenotificationiconnameandroid_sdk_base_release5 != null) {
                            dIconCompatParcelizer4 = setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release5);
                            if (dIconCompatParcelizer4 < setoptinwhenpushauthorized.read) {
                                setoptinwhenpushauthorized = new setOptInWhenPushAuthorized(setlargenotificationiconnameandroid_sdk_base_release5, dIconCompatParcelizer4, setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release2, setlargenotificationiconnameandroid_sdk_base_release5) + d5, 0);
                            }
                        }
                        d3 = d5 + dIconCompatParcelizer3;
                        d10 = d;
                        it2 = it7;
                        d11 = d110;
                        it4 = it3;
                        arrayList3 = arrayList5;
                        setsdkflavorandroid_sdk_base_release2 = setsdkflavorandroid_sdk_base_release4;
                    }
                    arrayList2 = arrayList3;
                    it = it3;
                    d2 = d11;
                    setsdkflavorandroid_sdk_base_release = setsdkflavorandroid_sdk_base_release2;
                    setissessionstartbasedtimeoutenabled = new setIsSessionStartBasedTimeoutEnabled(setoptinwhenpushauthorized.RemoteActionCompatParcelizer, d4, false);
                }
                arrayList = arrayList2;
                arrayList.add(new onViewAttachedToWindowlambda0(setsdkflavorandroid_sdk_base_release, setissessionstartbasedtimeoutenabled));
            } else {
                it = it4;
                d = d10;
                d2 = d11;
                arrayList = arrayList3;
                arrayList.add(new onViewAttachedToWindowlambda0(setsdkflavorandroid_sdk_base_release2, new setIsSessionStartBasedTimeoutEnabled(setlargenotificationiconnameandroid_sdk_base_release7, setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release7), setServerTargetandroid_sdk_base_release.IconCompatParcelizer(setlargenotificationiconnameandroid_sdk_base_release6, setlargenotificationiconnameandroid_sdk_base_release7) == 0.0d)));
            }
            arrayList3 = arrayList;
            d10 = d;
            d11 = d2;
            it4 = it;
        }
        return onContentCardDismissed.serializer(arrayList3, new setIsHtmlInAppMessageHtmlLinkTargetEnabled(0));
    }
}
