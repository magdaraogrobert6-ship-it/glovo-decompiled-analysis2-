package bo.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.managers.banners.IBannerView;
import com.braze.models.Banner;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt__LazyJVMKt;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onContentCardDismissed;
import o.onDismissed;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setWasCloseMessageCalled;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 k;
    public final String a;
    public final u9 b;
    public final df c;
    public final h2 d;
    public final com.braze.storage.a e;
    public List f;
    public final n g;
    public final q h;
    public static final d0 i = new d0();
    public static final LinkedHashMap j = new LinkedHashMap();
    public static final ReentrantLock l = new ReentrantLock();
    public static final ArrayList m = new ArrayList();
    public static final ReentrantLock n = new ReentrantLock();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ArrayList f17o = new ArrayList();

    public static final String k() {
        return "Resetting BannersManager for new session.";
    }

    public static final String m() {
        return "View is not an IBannerView. Cannot update banner data.";
    }

    public final void e() {
        ArrayList<String> arrayList;
        List list;
        com.braze.storage.a aVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = aVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                                list = instance_delegatelambda0Var;
                            }
                        }
                        arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                    }
                    list = instance_delegatelambda0Var;
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(10), 7, (Object) null);
            this.f = instance_delegatelambda0Var;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(11), 6, (Object) null);
                } else {
                    Banner bannerA = Banner.Companion.a(new JSONObject(str2));
                    if (bannerA != null) {
                        arrayList2.add(bannerA);
                    }
                }
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str2, 3), 4, (Object) null);
            }
        }
        this.f = arrayList2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda8(0, arrayList2), 7, (Object) null);
    }

    public final void h() {
        String strRemoteActionCompatParcelizer;
        String string;
        List<Banner> list = this.f;
        ArrayList arrayList = new ArrayList();
        for (Banner banner : list) {
            try {
                string = banner.forJsonPut().toString();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda6(banner, 3), 4, (Object) null);
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        com.braze.storage.a aVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), arrayList);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = arrayList instanceof Map ? "{}" : "[]";
                }
                aVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(2, arrayList), 7, (Object) null);
    }

    public final void j() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(28), 6, (Object) null);
        this.e.clearData(DataStoreKey.BANNERS_IMPRESSION_MAP);
        d0.b();
    }

    public final void l() {
        final int i2;
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = l;
        reentrantLock.lock();
        try {
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(m);
            reentrantLock.unlock();
            Iterator it = listPlaybackStateCompat.iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                final a0 a0Var = (a0) it.next();
                try {
                    KeyEvent.Callback callback = (View) a0Var.b.get();
                    if (callback == null) {
                        arrayList.add(a0Var);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.g0$$ExternalSyntheticLambda11
                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i3 = i2;
                                a0 a0Var2 = a0Var;
                                return i3 != 0 ? g0.b(a0Var2) : g0.a(a0Var2);
                            }
                        }, 7, (Object) null);
                    } else if (callback instanceof IBannerView) {
                        ((IBannerView) callback).initBanner(a0Var.a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(9), 6, (Object) null);
                        arrayList.add(a0Var);
                    }
                } catch (Exception e) {
                    final int i3 = 1;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.g0$$ExternalSyntheticLambda11
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i4 = i3;
                            a0 a0Var2 = a0Var;
                            return i4 != 0 ? g0.b(a0Var2) : g0.a(a0Var2);
                        }
                    }, 4, (Object) null);
                    arrayList.add(a0Var);
                }
            }
            ReentrantLock reentrantLock2 = l;
            reentrantLock2.lock();
            try {
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    m.remove((a0) obj);
                }
                reentrantLock2.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public g0(Context context, String str, String str2, z7 z7Var, u9 u9Var, df dfVar, h2 h2Var) {
        context.getClass();
        str.getClass();
        z7Var.getClass();
        u9Var.getClass();
        dfVar.getClass();
        h2Var.getClass();
        this.a = str2;
        this.b = u9Var;
        this.c = dfVar;
        this.d = h2Var;
        com.braze.storage.a aVar = new com.braze.storage.a(context, str2, str);
        this.e = aVar;
        this.f = instance_delegatelambda0.write;
        this.g = new n(aVar, dfVar);
        this.h = new q(aVar);
        e();
        final int i2 = 0;
        z7Var.c(j0.class, new IEventSubscriber(this) { // from class: bo.app.g0$$ExternalSyntheticLambda28
            public final /* synthetic */ g0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                g0 g0Var = this.f$0;
                if (i3 == 0) {
                    g0.a(g0Var, (j0) obj);
                    return;
                }
                if (i3 == 1) {
                    g0.a(g0Var, (i0) obj);
                } else if (i3 != 2) {
                    g0.a(g0Var, (u3) obj);
                } else {
                    g0.a(g0Var, (BrazeUserChangeEvent) obj);
                }
            }
        });
        final int i3 = 1;
        z7Var.c(i0.class, new IEventSubscriber(this) { // from class: bo.app.g0$$ExternalSyntheticLambda28
            public final /* synthetic */ g0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i4 = i3;
                g0 g0Var = this.f$0;
                if (i4 == 0) {
                    g0.a(g0Var, (j0) obj);
                    return;
                }
                if (i4 == 1) {
                    g0.a(g0Var, (i0) obj);
                } else if (i4 != 2) {
                    g0.a(g0Var, (u3) obj);
                } else {
                    g0.a(g0Var, (BrazeUserChangeEvent) obj);
                }
            }
        });
        final int i4 = 2;
        z7Var.d(BrazeUserChangeEvent.class, new IEventSubscriber(this) { // from class: bo.app.g0$$ExternalSyntheticLambda28
            public final /* synthetic */ g0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i5 = i4;
                g0 g0Var = this.f$0;
                if (i5 == 0) {
                    g0.a(g0Var, (j0) obj);
                    return;
                }
                if (i5 == 1) {
                    g0.a(g0Var, (i0) obj);
                } else if (i5 != 2) {
                    g0.a(g0Var, (u3) obj);
                } else {
                    g0.a(g0Var, (BrazeUserChangeEvent) obj);
                }
            }
        });
        final int i5 = 3;
        z7Var.c(u3.class, new IEventSubscriber(this) { // from class: bo.app.g0$$ExternalSyntheticLambda28
            public final /* synthetic */ g0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i6 = i5;
                g0 g0Var = this.f$0;
                if (i6 == 0) {
                    g0.a(g0Var, (j0) obj);
                    return;
                }
                if (i6 == 1) {
                    g0.a(g0Var, (i0) obj);
                } else if (i6 != 2) {
                    g0.a(g0Var, (u3) obj);
                } else {
                    g0.a(g0Var, (BrazeUserChangeEvent) obj);
                }
            }
        });
    }

    public final Banner a(String str) {
        Object next;
        str.getClass();
        Banner banner = (Banner) j.get(str);
        if (banner != null) {
            if (!banner.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 22), 6, (Object) null);
                banner.setUserId(this.a);
                return banner;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda6(banner, 1), 6, (Object) null);
        }
        Iterator it = this.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Banner) next).getPlacementId(), str}, getCieXyz.write())).booleanValue());
        Banner banner2 = (Banner) next;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 23), 6, (Object) null);
            return null;
        }
        if (banner2.isExpired()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new q$$ExternalSyntheticLambda2(str, banner2), 6, (Object) null);
            return null;
        }
        banner2.setUserId(this.a);
        return banner2;
    }

    public final void d(List list) {
        String trackingId;
        Object next;
        list.getClass();
        if (list.size() > this.c.q()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ah$$ExternalSyntheticLambda0(this, 29, list), 7, (Object) null);
        }
        List<String> list2 = onContentCardDismissed.read(list, this.c.q());
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Iterator it = this.f.iterator();
            do {
                trackingId = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Banner) next).getPlacementId(), str}, getCieXyz.write())).booleanValue());
            Banner banner = (Banner) next;
            if (banner != null) {
                trackingId = banner.getTrackingId();
            }
            arrayList.add(new onViewAttachedToWindowlambda0(str, trackingId));
        }
        this.d.a(arrayList, this.e.b());
    }

    public static final String b(Banner banner) {
        return af$$ExternalSyntheticOutline0.m("Banner dismiss: started. placementId=", banner.getPlacementId(), " trackingId=", banner.getTrackingId());
    }

    public static final String g(String str) {
        return ff$$ExternalSyntheticOutline0.m("Not logging a Banner impression for Banner with placement id ", str, ". The Banner was not present in cache.");
    }

    public final boolean f(String str) {
        Map linkedHashMap;
        beforeOpened beforeopened;
        Map map;
        Map linkedHashMap2;
        beforeOpened beforeopened2;
        Map map2;
        String strRemoteActionCompatParcelizer;
        Object next;
        str.getClass();
        Banner banner = (Banner) j.get(str);
        if (banner == null) {
            Iterator it = this.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!str.equals(((Banner) next).getPlacementId()));
            banner = (Banner) next;
        }
        Banner banner2 = banner;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 25), 6, (Object) null);
            return false;
        }
        String trackingId = banner2.getTrackingId();
        trackingId.getClass();
        com.braze.storage.a aVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_IMPRESSION_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = aVar.readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Boolean.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls5))) {
                                    Object[] objArr2 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls4))) {
                                    Object[] objArr3 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls3))) {
                                    Object[] objArr4 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls2))) {
                                    Object[] objArr5 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr5);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls))) {
                                    Object[] objArr6 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr6);
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) f0.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str2, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str2), 4, (Object) null);
                            }
                        }
                        linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                    }
                    map = simpleItemTouchHelperCallback;
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Object[] objArr7 = {linkedHashMap.get(trackingId), Boolean.TRUE};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 26), 7, (Object) null);
            g9 g9VarC = n1.g.c(banner2.getTrackingId());
            if (g9VarC != null) {
                this.d.a(g9VarC);
            }
            com.braze.storage.a aVar2 = this.e;
            DataStoreKey dataStoreKey2 = DataStoreKey.BANNERS_IMPRESSION_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap2 = new LinkedHashMap();
            } else {
                try {
                    Object data2 = aVar2.readData(dataStoreKey2, "");
                    data2.getClass();
                    String str3 = (String) data2;
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                        linkedHashMap2 = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                            Object[] objArr8 = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str3).toString(), "null"};
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
                                try {
                                    r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2 = displayInAppMessagelambda1.serializer(Boolean.class);
                                    if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                        beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                        int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                        int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                        beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2});
                                    } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls5))) {
                                        Object[] objArr9 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                        beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr9);
                                    } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls4))) {
                                        Object[] objArr10 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                        beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr10);
                                    } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls3))) {
                                        Object[] objArr11 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                        beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr11);
                                    } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls2))) {
                                        Object[] objArr12 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                        beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr12);
                                    } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls))) {
                                        Object[] objArr13 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                        beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr13);
                                    } else {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) e0.a, 6, (Object) null);
                                    }
                                    Object objSerializer2 = resetTransientState.read.serializer(str3, beforeopened2);
                                    objSerializer2.getClass();
                                    map2 = (Map) objSerializer2;
                                } catch (Exception e3) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str3), 4, (Object) null);
                                }
                            }
                            linkedHashMap2 = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map2));
                        }
                        map2 = simpleItemTouchHelperCallback;
                        linkedHashMap2 = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map2));
                    }
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                    linkedHashMap2 = new LinkedHashMap();
                }
            }
            linkedHashMap2.put(trackingId, Boolean.TRUE);
            com.braze.storage.a aVar3 = this.e;
            DataStoreKey dataStoreKey3 = DataStoreKey.BANNERS_IMPRESSION_MAP;
            if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey3), 12, (Object) null);
                return true;
            }
            try {
                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write), linkedHashMap2);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = "{}";
                }
                aVar3.writeData(dataStoreKey3, strRemoteActionCompatParcelizer);
                return true;
            } catch (Exception e6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey3), 8, (Object) null);
                return true;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda6(banner2, 4), 6, (Object) null);
        return true;
    }

    public final void n() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(jNowInSeconds, 2), 6, (Object) null);
        this.e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(jNowInSeconds));
    }

    public final void i() {
        List list = this.f;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(1, arrayList), 6, (Object) null);
        ((z7) this.b).b(new BannersUpdatedEvent(arrayList), BannersUpdatedEvent.class);
    }

    public static final String c(List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Banner) it.next()).getPlacementId());
        }
        return "Publishing BannersUpdatedEvent to subscribers: count=" + size + ", placementIds=" + arrayList;
    }

    public static final String g() {
        return "Received blank serialized Banner string from DataStore. Not parsing.";
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String b(String str) {
        return ff$$ExternalSyntheticOutline0.m("Returning test Banner with placement id ", str, ".");
    }

    public static final String b(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Logging click for Banner with placement id ", str, " with buttonID of ", str2, ".");
    }

    public static final String b(BrazeUserChangeEvent brazeUserChangeEvent) {
        return ff$$ExternalSyntheticOutline0.m("Done updating banners because of user change to ", brazeUserChangeEvent.getCurrentUserId(), ".");
    }

    public static final String b(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Added ", " new Banners to DataStore.");
    }

    public static final String b(a0 a0Var) {
        return ff$$ExternalSyntheticOutline0.m("Error checking banner visibility for ", a0Var.a, ".Removing banner from visibility monitoring.");
    }

    public static final String c(Banner banner) {
        return "Found test banner, but it is expired. Attempting to find non-test banner. " + banner;
    }

    public static final String c(String str) {
        return ff$$ExternalSyntheticOutline0.m("Banner with placement id ", str, " not found in cache. Returning null for this Banner.");
    }

    public static final String c() {
        return "Refreshing Banners on forced internal refresh.";
    }

    public static final String d() {
        return "Banners have moved to disabled. Clearing banners data.";
    }

    public static final String d(Banner banner) {
        return "Not logging a Banner impression for Banner " + banner + ". The Banner already had an impression logged in the current session";
    }

    public static final String d(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Encountered unexpected exception while parsing stored banner: ", str);
    }

    public static final void a(g0 g0Var, j0 j0Var) {
        j0Var.getClass();
        g0Var.n();
    }

    public static final void a(g0 g0Var, i0 i0Var) {
        i0Var.getClass();
        ((z7) g0Var.b).b(i0Var, i0.class);
    }

    public static final void a(g0 g0Var, BrazeUserChangeEvent brazeUserChangeEvent) {
        brazeUserChangeEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda1(brazeUserChangeEvent, 0), 7, (Object) null);
        g0Var.l();
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda1(brazeUserChangeEvent, 1), 7, (Object) null);
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return ff$$ExternalSyntheticOutline0.m("Updating banners because of user change to ", brazeUserChangeEvent.getCurrentUserId(), ".");
    }

    public final void a() {
        ReentrantLock reentrantLock = n;
        reentrantLock.lock();
        try {
            ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) f17o);
            reentrantLock.unlock();
            if (arrayListIconCompatParcelizer.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(1), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(27), 7, (Object) null);
                d(arrayListIconCompatParcelizer);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(g0 g0Var, List list) {
        int iQ = g0Var.c.q();
        int size = list.size();
        List list2 = onContentCardDismissed.read(list, g0Var.c.q());
        List listSubList = list.subList(g0Var.c.q(), list.size());
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(iQ, size, "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of ", " placements, but ", " were requested. Truncating request to fit.\nPlacements that will be requested: ");
        sbM.append(list2);
        sbM.append("\nTruncated placements not requested: ");
        sbM.append(listSubList);
        return sbM.toString();
    }

    public static final void a(g0 g0Var, u3 u3Var) {
        u3Var.getClass();
        if (!u3Var.a.G || u3Var.b.G) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(29), 7, (Object) null);
        g0Var.getClass();
        g0Var.f = instance_delegatelambda0.write;
        g0Var.e.clearData(DataStoreKey.BANNERS);
        g0Var.l();
    }

    public static final String a(String str, Banner banner) {
        return "Banner with placement id " + str + " has expired. Returning null for this Banner " + banner;
    }

    public final void a(String str, String str2) {
        Object next;
        str.getClass();
        Banner banner = (Banner) j.get(str);
        if (banner == null) {
            Iterator it = this.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!str.equals(((Banner) next).getPlacementId()));
            banner = (Banner) next;
        }
        if (banner == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 24), 6, (Object) null);
            return;
        }
        String trackingId = banner.getTrackingId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, str2, 1), 7, (Object) null);
        g9 g9VarC = n1.g.c(trackingId, str2);
        if (g9VarC != null) {
            this.d.a(g9VarC);
        }
    }

    public final void a(Banner banner) {
        banner.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda6(banner, 2), 6, (Object) null);
        this.g.a(banner, this.d);
        j.remove(banner.getPlacementId());
        List list = this.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object[] objArr = {((Banner) obj).getPlacementId(), banner.getPlacementId()};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.f.size()) {
            this.f = arrayList;
            h();
        }
        d0.b(banner.getPlacementId());
        ((z7) this.b).b(new BannerDismissedEvent(banner.getPlacementId()), BannerDismissedEvent.class);
        i();
    }

    public static final String h(String str) {
        return ff$$ExternalSyntheticOutline0.m("Logging impression for Banner with placement id ", str, ".");
    }

    public static final String a(long j2) {
        return af$$ExternalSyntheticOutline0.m(j2, "Updating last Banners refresh time: ");
    }

    public static final String a(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Loaded ", " banners from DataStore.");
    }

    public static final String a(a0 a0Var) {
        return ff$$ExternalSyntheticOutline0.m("Banner ", a0Var.a, " removed because view is null");
    }

    public static final String e(Banner banner) {
        return "Error converting Banner to JSON: " + banner;
    }

    public static final String e(String str) {
        return ff$$ExternalSyntheticOutline0.m("Not logging a Banner click for Banner with placement id ", str, ". The Banner was not present in cache.");
    }

    public static final String f() {
        return "Did not find stored Banners in DataStore.";
    }
}
