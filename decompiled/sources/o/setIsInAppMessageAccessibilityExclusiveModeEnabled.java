package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsInAppMessageAccessibilityExclusiveModeEnabled {
    public static setIsAutomaticLocationCollectionEnabled RemoteActionCompatParcelizer(setSdkAuthEnabledandroid_sdk_base_release setsdkauthenabledandroid_sdk_base_release) {
        Object next;
        Object next2;
        Object next3;
        setsdkauthenabledandroid_sdk_base_release.getClass();
        ArrayList arrayList = new ArrayList();
        for (setIsHtmlInAppMessageApplyWindowInsetsEnabled setishtmlinappmessageapplywindowinsetsenabled : setsdkauthenabledandroid_sdk_base_release.a) {
            arrayList.add(setishtmlinappmessageapplywindowinsetsenabled.a.serializer);
            arrayList.add(setishtmlinappmessageapplywindowinsetsenabled.a.write);
        }
        Iterator it = arrayList.iterator();
        Object next4 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double d = ((setLargeNotificationIconNameandroid_sdk_base_release) next).a;
                do {
                    Object next5 = it.next();
                    double d2 = ((setLargeNotificationIconNameandroid_sdk_base_release) next5).a;
                    if (Double.compare(d, d2) > 0) {
                        next = next5;
                        d = d2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release = (setLargeNotificationIconNameandroid_sdk_base_release) next;
        double d3 = setlargenotificationiconnameandroid_sdk_base_release != null ? setlargenotificationiconnameandroid_sdk_base_release.a : 0.0d;
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                double d4 = ((setLargeNotificationIconNameandroid_sdk_base_release) next2).b;
                do {
                    Object next6 = it2.next();
                    double d5 = ((setLargeNotificationIconNameandroid_sdk_base_release) next6).b;
                    if (Double.compare(d4, d5) > 0) {
                        next2 = next6;
                        d4 = d5;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release2 = (setLargeNotificationIconNameandroid_sdk_base_release) next2;
        double d6 = setlargenotificationiconnameandroid_sdk_base_release2 != null ? setlargenotificationiconnameandroid_sdk_base_release2.b : 0.0d;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            if (it3.hasNext()) {
                double d7 = ((setLargeNotificationIconNameandroid_sdk_base_release) next3).a;
                do {
                    Object next7 = it3.next();
                    double d8 = ((setLargeNotificationIconNameandroid_sdk_base_release) next7).a;
                    if (Double.compare(d7, d8) < 0) {
                        next3 = next7;
                        d7 = d8;
                    }
                } while (it3.hasNext());
            }
        } else {
            next3 = null;
        }
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release3 = (setLargeNotificationIconNameandroid_sdk_base_release) next3;
        double d9 = setlargenotificationiconnameandroid_sdk_base_release3 != null ? setlargenotificationiconnameandroid_sdk_base_release3.a : 0.0d;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            next4 = it4.next();
            if (it4.hasNext()) {
                double d10 = ((setLargeNotificationIconNameandroid_sdk_base_release) next4).b;
                do {
                    Object next8 = it4.next();
                    double d11 = ((setLargeNotificationIconNameandroid_sdk_base_release) next8).b;
                    if (Double.compare(d10, d11) < 0) {
                        next4 = next8;
                        d10 = d11;
                    }
                } while (it4.hasNext());
            }
        }
        setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release4 = (setLargeNotificationIconNameandroid_sdk_base_release) next4;
        return new setIsAutomaticLocationCollectionEnabled(d3, d6, d9, setlargenotificationiconnameandroid_sdk_base_release4 != null ? setlargenotificationiconnameandroid_sdk_base_release4.b : 0.0d);
    }
}
