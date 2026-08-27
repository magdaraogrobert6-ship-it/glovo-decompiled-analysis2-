package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
final class migrateTriggersReeligibilityToJson implements r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI {
    final /* synthetic */ TriggerDataStoreProviderCompanionExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    final /* synthetic */ ArrayList read;
    final /* synthetic */ CountDownLatch write;

    @Override // o.r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI
    public final void read() {
        this.RemoteActionCompatParcelizer.serializer.IconCompatParcelizer("Failed to get venues", new Object[0]);
        this.write.countDown();
    }

    @Override // o.r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI
    public final void write(List<DataStoreProvidern> list) {
        List list2;
        setSdkFlavorandroid_sdk_base_release setsdkflavorandroid_sdk_base_release;
        Object next;
        Object next2;
        Object next3;
        TriggerDataStoreProviderCompanionExternalSyntheticLambda0 triggerDataStoreProviderCompanionExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        triggerDataStoreProviderCompanionExternalSyntheticLambda0.serializer.IconCompatParcelizer("Closest venues found: %d", Integer.valueOf(list.size()));
        for (DataStoreProvidern dataStoreProvidern : list) {
            com.sentiance.sdk.tile.store.c cVarRemoteActionCompatParcelizer = dataStoreProvidern.RemoteActionCompatParcelizer();
            if (cVarRemoteActionCompatParcelizer == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                for (double[] dArr : cVarRemoteActionCompatParcelizer.read()) {
                    arrayList.add(new setLargeNotificationIconNameandroid_sdk_base_release(dArr[0], dArr[1]));
                }
                list2 = arrayList;
            }
            setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release = new setLargeNotificationIconNameandroid_sdk_base_release(dataStoreProvidern.write(), dataStoreProvidern.serializer());
            long jIconCompatParcelizer = dataStoreProvidern.IconCompatParcelizer();
            List<DataStoreProvidero> list3 = triggerDataStoreProviderCompanionExternalSyntheticLambda0.RemoteActionCompatParcelizer.read(dataStoreProvidern.IconCompatParcelizer());
            HashMap map = new HashMap();
            for (DataStoreProvidero dataStoreProvidero : list3) {
                map.put(dataStoreProvidero.write(), dataStoreProvidero.read());
            }
            setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled setisfirebasemessagingserviceonnewtokenregistrationenabled = new setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(list2, setlargenotificationiconnameandroid_sdk_base_release, jIconCompatParcelizer, map);
            CharSequence charSequence = (CharSequence) map.get("name");
            String strValueOf = (charSequence == null || hideCurrentlyDisplayingInAppMessage.serializer(charSequence)) ? "" : String.valueOf(map.get("name"));
            boolean zIsEmpty = map.isEmpty();
            List list4 = setisfirebasemessagingserviceonnewtokenregistrationenabled.e;
            if (!zIsEmpty) {
                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onMove.IconCompatParcelizer(map)) {
                    list4.add(new setPushDeepLinkBackStackActivityClass((String) onviewattachedtowindowlambda0.serializer, (String) onviewattachedtowindowlambda0.write));
                }
            }
            Object next4 = null;
            if (list2.isEmpty()) {
                setsdkflavorandroid_sdk_base_release = new setSdkFlavorandroid_sdk_base_release(setlargenotificationiconnameandroid_sdk_base_release, strValueOf, list4, null);
            } else {
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
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
                    setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release2 = (setLargeNotificationIconNameandroid_sdk_base_release) next;
                    if (setlargenotificationiconnameandroid_sdk_base_release2 != null) {
                        Double.valueOf(setlargenotificationiconnameandroid_sdk_base_release2.a);
                    }
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (it2.hasNext()) {
                            double d3 = ((setLargeNotificationIconNameandroid_sdk_base_release) next2).b;
                            do {
                                Object next6 = it2.next();
                                double d4 = ((setLargeNotificationIconNameandroid_sdk_base_release) next6).b;
                                if (Double.compare(d3, d4) > 0) {
                                    next2 = next6;
                                    d3 = d4;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next2 = null;
                    }
                    setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release3 = (setLargeNotificationIconNameandroid_sdk_base_release) next2;
                    if (setlargenotificationiconnameandroid_sdk_base_release3 != null) {
                        double d5 = setlargenotificationiconnameandroid_sdk_base_release3.b;
                    }
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        if (it3.hasNext()) {
                            double d6 = ((setLargeNotificationIconNameandroid_sdk_base_release) next3).a;
                            do {
                                Object next7 = it3.next();
                                double d7 = ((setLargeNotificationIconNameandroid_sdk_base_release) next7).a;
                                if (Double.compare(d6, d7) < 0) {
                                    next3 = next7;
                                    d6 = d7;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release4 = (setLargeNotificationIconNameandroid_sdk_base_release) next3;
                    if (setlargenotificationiconnameandroid_sdk_base_release4 != null) {
                        double d8 = setlargenotificationiconnameandroid_sdk_base_release4.a;
                    }
                    Iterator it4 = list2.iterator();
                    if (it4.hasNext()) {
                        next4 = it4.next();
                        if (it4.hasNext()) {
                            double d9 = ((setLargeNotificationIconNameandroid_sdk_base_release) next4).b;
                            do {
                                Object next8 = it4.next();
                                double d10 = ((setLargeNotificationIconNameandroid_sdk_base_release) next8).b;
                                if (Double.compare(d9, d10) < 0) {
                                    next4 = next8;
                                    d9 = d10;
                                }
                            } while (it4.hasNext());
                        }
                    }
                    setLargeNotificationIconNameandroid_sdk_base_release setlargenotificationiconnameandroid_sdk_base_release5 = (setLargeNotificationIconNameandroid_sdk_base_release) next4;
                    if (setlargenotificationiconnameandroid_sdk_base_release5 != null) {
                        double d11 = setlargenotificationiconnameandroid_sdk_base_release5.b;
                    }
                }
                List listResultReceiver = onContentCardDismissed.ResultReceiver(list2);
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listResultReceiver, 10));
                Iterator it5 = listResultReceiver.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(new setIsHtmlInAppMessageApplyWindowInsetsEnabled((onViewAttachedToWindowlambda0) it5.next()));
                }
                setsdkflavorandroid_sdk_base_release = new setSdkFlavorandroid_sdk_base_release(setlargenotificationiconnameandroid_sdk_base_release, strValueOf, list4, new setSdkFlavor(new setSdkAuthEnabledandroid_sdk_base_release(arrayList2)));
            }
            this.read.add(setsdkflavorandroid_sdk_base_release);
        }
        this.write.countDown();
    }

    public migrateTriggersReeligibilityToJson(TriggerDataStoreProviderCompanionExternalSyntheticLambda0 triggerDataStoreProviderCompanionExternalSyntheticLambda0, CountDownLatch countDownLatch, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = triggerDataStoreProviderCompanionExternalSyntheticLambda0;
        this.write = countDownLatch;
        this.read = arrayList;
    }

    @Override // o.r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI
    public final clearandroid_sdk_base_release RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.read;
    }
}
