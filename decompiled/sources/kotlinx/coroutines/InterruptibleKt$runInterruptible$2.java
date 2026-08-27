package kotlinx.coroutines;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidUiFrameClock;
import o.OnDeferredDeeplinkResponseListener;
import o.OnEventTrackingFailedListener;
import o.OnLastDeeplinkReadListener;
import o.PointerInteropFilterpointerInputFilter1onCancel1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessgetInstancedelegatecp;
import o.beforeInAppMessageViewClosed;
import o.createFromParcel;
import o.debug;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getGpsAdid;
import o.getSuccessResponseData;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.o7ExternalSyntheticLambda3;
import o.onContentCardDismissed;
import o.onIsEnabledRead;
import o.onLayoutChangelambda0;
import o.onServiceConnected;
import o.onServiceDisconnected;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;
import o.sf;
import o.sgExternalSyntheticLambda2;
import o.sgExternalSyntheticLambda3;
import o.t0;
import o.t2ExternalSyntheticLambda0;
import o.t3;
import o.v9;
import o.xa;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(OnLastDeeplinkReadListener onLastDeeplinkReadListener, OkHttpCall$1 okHttpCall$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = onLastDeeplinkReadListener;
        this.IconCompatParcelizer = okHttpCall$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj2 = this.IconCompatParcelizer;
        if (i4 == 0) {
            InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView);
            interruptibleKt$runInterruptible$2.serializer = obj;
            return interruptibleKt$runInterruptible$2;
        }
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$3 = new InterruptibleKt$runInterruptible$2((OnLastDeeplinkReadListener) this.serializer, (OkHttpCall$1) obj2, shortNewsContentCardView);
        int i5 = RemoteActionCompatParcelizer + 75;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return interruptibleKt$runInterruptible$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 115;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((InterruptibleKt$runInterruptible$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((InterruptibleKt$runInterruptible$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 63;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        List list;
        debug debugVar;
        o7ExternalSyntheticLambda3 o7externalsyntheticlambda3;
        String str;
        onServiceConnected onserviceconnected;
        sgExternalSyntheticLambda2 sgexternalsyntheticlambda2;
        sgExternalSyntheticLambda3 sgexternalsyntheticlambda3;
        int i2 = 2 % 2;
        int i3 = this.read;
        Object obj2 = this.IconCompatParcelizer;
        int i4 = 0;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TextAnnouncementContentCardView coroutineContext = ((getContentViewGroupParentLayout) this.serializer).getCoroutineContext();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
            try {
                onLayoutChangelambda0 onlayoutchangelambda0 = new onLayoutChangelambda0();
                onlayoutchangelambda0.RemoteActionCompatParcelizer = JobKt.RemoteActionCompatParcelizer(JobKt.IconCompatParcelizer(coroutineContext), onlayoutchangelambda0);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onLayoutChangelambda0.read;
                do {
                    i = atomicIntegerFieldUpdater.get(onlayoutchangelambda0);
                    if (i != 0) {
                        int i5 = write + 73;
                        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (i == 2 || i == 3) {
                            break;
                            break;
                        }
                        onLayoutChangelambda0.RemoteActionCompatParcelizer(i);
                        throw null;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(onlayoutchangelambda0, i, 0));
                try {
                    return r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                } finally {
                    onlayoutchangelambda0.IconCompatParcelizer();
                }
            } catch (InterruptedException e) {
                throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
            }
        }
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) obj2;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        OnLastDeeplinkReadListener onLastDeeplinkReadListener = (OnLastDeeplinkReadListener) this.serializer;
        String str2 = onLastDeeplinkReadListener.MediaBrowserCompatMediaItem;
        onServiceConnected onserviceconnected2 = onLastDeeplinkReadListener.RatingCompat;
        String str3 = onLastDeeplinkReadListener.RemoteActionCompatParcelizer;
        String str4 = onLastDeeplinkReadListener.MediaSessionCompatResultReceiverWrapper;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = onLastDeeplinkReadListener.MediaSessionCompatQueueItem;
        onServiceDisconnected onservicedisconnected = new onServiceDisconnected(str4, str5 != null ? new getSuccessResponseData(AndroidUiFrameClock.write(str5)) : new getSuccessResponseData(instance_delegatelambda0.write));
        String str6 = onLastDeeplinkReadListener.write;
        String str7 = onLastDeeplinkReadListener.IconCompatParcelizer;
        if (str7 != null) {
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                list = (List) isverticalswipeinalloweddirection.serializer(str7, setgraphicmodalmaxwidthdp);
            } catch (Exception unused) {
                list = null;
            }
        } else {
            list = null;
        }
        t3 t3VarRemoteActionCompatParcelizer = xa.RemoteActionCompatParcelizer((xa) okHttpCall$1.write, str6, list);
        String str8 = onLastDeeplinkReadListener.serializer;
        int i7 = 10;
        if (str8 != null) {
            int i8 = write + 97;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                isverticalswipeinalloweddirection2.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = debug.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer;
                debugVar = (debug) isverticalswipeinalloweddirection2.serializer(str8, setgraphicmodalmaxwidthdpSerializer);
                int i10 = write + 43;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } catch (Exception unused2) {
            }
        } else {
            debugVar = null;
        }
        if (debugVar != null) {
            ArrayList<List> arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(debugVar.coordinates);
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 10));
            for (List list2 : arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                arrayList.add(new o7ExternalSyntheticLambda3(((Number) list2.get(1)).doubleValue(), ((Number) list2.get(i4)).doubleValue()));
                i4 = 0;
            }
            o7externalsyntheticlambda3 = (o7ExternalSyntheticLambda3) onContentCardDismissed.read((List) arrayList);
        } else {
            o7externalsyntheticlambda3 = null;
        }
        boolean z = !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onLastDeeplinkReadListener.read, Boolean.TRUE}, getCieXyz.write())).booleanValue() ^ true) && ((v9) okHttpCall$1.serializer).serializer();
        List list3 = onLastDeeplinkReadListener.MediaDescriptionCompat;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            onIsEnabledRead onisenabledread = (onIsEnabledRead) it.next();
            int i12 = onisenabledread.id;
            String str9 = onisenabledread.name;
            List list4 = onisenabledread.zoneIds;
            ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(onisenabledread.centerGeoJson.IconCompatParcelizer());
            Iterator it2 = it;
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2, i7));
            Iterator it3 = arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2.iterator();
            while (it3.hasNext()) {
                List list5 = (List) it3.next();
                arrayList3.add(new o7ExternalSyntheticLambda3(((Number) list5.get(1)).doubleValue(), ((Number) list5.get(0)).doubleValue()));
                it3 = it3;
                onisenabledread = onisenabledread;
                t3VarRemoteActionCompatParcelizer = t3VarRemoteActionCompatParcelizer;
                o7externalsyntheticlambda3 = o7externalsyntheticlambda3;
            }
            o7ExternalSyntheticLambda3 o7externalsyntheticlambda4 = o7externalsyntheticlambda3;
            t3 t3Var = t3VarRemoteActionCompatParcelizer;
            List list6 = onisenabledread.h3Indexes;
            OnEventTrackingFailedListener onEventTrackingFailedListener = onisenabledread.payment;
            if (onEventTrackingFailedListener != null) {
                String strIconCompatParcelizer = onEventTrackingFailedListener.IconCompatParcelizer();
                boolean zIconCompatParcelizer = onEventTrackingFailedListener.write().IconCompatParcelizer();
                List listRemoteActionCompatParcelizer = onEventTrackingFailedListener.write().RemoteActionCompatParcelizer();
                ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(listRemoteActionCompatParcelizer, 10));
                Iterator it4 = listRemoteActionCompatParcelizer.iterator();
                while (it4.hasNext()) {
                    OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = (OnDeferredDeeplinkResponseListener) it4.next();
                    Iterator it5 = it4;
                    List list7 = onDeferredDeeplinkResponseListener.read();
                    String str10 = str2;
                    onServiceConnected onserviceconnected3 = onserviceconnected2;
                    ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list7, 10));
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(PointerInteropFilterpointerInputFilter1onCancel1.write((String) it6.next()));
                    }
                    String strRemoteActionCompatParcelizer = onDeferredDeeplinkResponseListener.RemoteActionCompatParcelizer();
                    String strSerializer = onDeferredDeeplinkResponseListener.serializer();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strSerializer, "promo"}, getCieXyz.write())).booleanValue()) {
                        sgexternalsyntheticlambda3 = sgExternalSyntheticLambda3.PROMO;
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strSerializer, "earnings"}, getCieXyz.write())).booleanValue()) {
                            int i13 = write + 87;
                            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                            if (i13 % 2 != 0) {
                                sgexternalsyntheticlambda3 = sgExternalSyntheticLambda3.EARNINGS;
                                int i14 = 40 / 0;
                            } else {
                                sgexternalsyntheticlambda3 = sgExternalSyntheticLambda3.EARNINGS;
                            }
                        } else {
                            sgexternalsyntheticlambda3 = sgExternalSyntheticLambda3.UNKNOWN;
                        }
                    }
                    arrayList4.add(new sf(arrayList5, strRemoteActionCompatParcelizer, sgexternalsyntheticlambda3));
                    it4 = it5;
                    str2 = str10;
                    onserviceconnected2 = onserviceconnected3;
                }
                str = str2;
                onserviceconnected = onserviceconnected2;
                sgexternalsyntheticlambda2 = new sgExternalSyntheticLambda2(strIconCompatParcelizer, new t0(arrayList4, zIconCompatParcelizer), onEventTrackingFailedListener.read(), onEventTrackingFailedListener.RemoteActionCompatParcelizer());
            } else {
                str = str2;
                onserviceconnected = onserviceconnected2;
                sgexternalsyntheticlambda2 = null;
            }
            arrayList2.add(new t2ExternalSyntheticLambda0(i12, str9, list4, arrayList3, list6, sgexternalsyntheticlambda2));
            it = it2;
            str3 = str3;
            t3VarRemoteActionCompatParcelizer = t3Var;
            o7externalsyntheticlambda3 = o7externalsyntheticlambda4;
            onservicedisconnected = onservicedisconnected;
            str2 = str;
            onserviceconnected2 = onserviceconnected;
            i7 = 10;
        }
        return new getGpsAdid(str2, onserviceconnected2, str3, onservicedisconnected, o7externalsyntheticlambda3, t3VarRemoteActionCompatParcelizer, Boolean.valueOf(z), arrayList2, onLastDeeplinkReadListener.MediaMetadataCompat);
    }
}
