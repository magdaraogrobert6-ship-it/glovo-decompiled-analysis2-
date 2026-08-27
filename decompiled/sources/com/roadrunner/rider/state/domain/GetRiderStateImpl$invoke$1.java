package com.roadrunner.rider.state.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import o.AdjustDeeplink;
import o.BackspaceCommand;
import o.Person;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accesslayoutAccordingTo;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getCieXyz;
import o.getConnectivityType;
import o.getFailureResponseData;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.getWindowAreaDisplayMetrics;
import o.getWindowAreaStatus;
import o.isItemDismissable;
import o.isRoot;
import o.isTrackingEnabled;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda3bU44Zoh4poQG1b9BbDBVanKQ;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.sa;
import o.sb;
import o.se;
import o.setSdkPrefix;
import o.t1;
import o.t2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRiderStateImpl$invoke$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRiderStateImpl$invoke$1(getConnectivityType getconnectivitytype, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 8;
        this.read = getconnectivitytype;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetRiderStateImpl$invoke$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = 3;
        switch (i3) {
            case 0:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$1 = new GetRiderStateImpl$invoke$1(i4, 0, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$1.IconCompatParcelizer = (setSdkPrefix) obj;
                getRiderStateImpl$invoke$1.read = (getFailureResponseData) obj2;
                return getRiderStateImpl$invoke$1.invokeSuspend(createfromparcel);
            case 1:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$2 = new GetRiderStateImpl$invoke$1(i4, 1, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$2.IconCompatParcelizer = (getSystemDefinedLCbbffg) obj;
                getRiderStateImpl$invoke$2.read = (getNoActiveChildannotations) obj2;
                return getRiderStateImpl$invoke$2.invokeSuspend(createfromparcel);
            case 2:
                Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
                Object obj5 = ((onItemDismiss) obj2).IconCompatParcelizer;
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$3 = new GetRiderStateImpl$invoke$1(i4, i, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$3.IconCompatParcelizer = obj4;
                getRiderStateImpl$invoke$3.read = obj5;
                return getRiderStateImpl$invoke$3.invokeSuspend(createfromparcel);
            case 3:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$4 = new GetRiderStateImpl$invoke$1(i4, i4, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$4.IconCompatParcelizer = (String) obj;
                getRiderStateImpl$invoke$4.read = (Throwable) obj2;
                return getRiderStateImpl$invoke$4.invokeSuspend(createfromparcel);
            case 4:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$5 = new GetRiderStateImpl$invoke$1(i4, 4, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$5.IconCompatParcelizer = (Person) obj;
                getRiderStateImpl$invoke$5.read = (getWindowAreaDisplayMetrics) obj2;
                return getRiderStateImpl$invoke$5.invokeSuspend(createfromparcel);
            case 5:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$6 = new GetRiderStateImpl$invoke$1(i4, 5, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$6.IconCompatParcelizer = (getWindowAreaDisplayMetrics) obj;
                getRiderStateImpl$invoke$6.read = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) obj2;
                return getRiderStateImpl$invoke$6.invokeSuspend(createfromparcel);
            case 6:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$7 = new GetRiderStateImpl$invoke$1(i4, 6, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$7.IconCompatParcelizer = (se) obj;
                getRiderStateImpl$invoke$7.read = (Integer) obj2;
                return getRiderStateImpl$invoke$7.invokeSuspend(createfromparcel);
            case 7:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$8 = new GetRiderStateImpl$invoke$1(i4, 7, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$8.IconCompatParcelizer = (se) obj;
                getRiderStateImpl$invoke$8.read = (getFailureResponseData) obj2;
                return getRiderStateImpl$invoke$8.invokeSuspend(createfromparcel);
            case 8:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$9 = new GetRiderStateImpl$invoke$1((getConnectivityType) this.read, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$9.IconCompatParcelizer = (Throwable) obj2;
                getRiderStateImpl$invoke$9.invokeSuspend(createfromparcel);
                int i5 = serializer + 71;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return createfromparcel;
            default:
                GetRiderStateImpl$invoke$1 getRiderStateImpl$invoke$10 = new GetRiderStateImpl$invoke$1(i4, 9, (ShortNewsContentCardView) obj3);
                getRiderStateImpl$invoke$10.IconCompatParcelizer = (onViewAttachedToWindowlambda0) obj;
                getRiderStateImpl$invoke$10.read = (isTrackingEnabled) obj2;
                Object objInvokeSuspend = getRiderStateImpl$invoke$10.invokeSuspend(createfromparcel);
                int i7 = serializer + 107;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objInvokeSuspend;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map.Entry entry;
        Integer numValueOf;
        int i = 2 % 2;
        Object obj2 = null;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                setSdkPrefix setsdkprefix = (setSdkPrefix) this.IconCompatParcelizer;
                getFailureResponseData getfailureresponsedata = (getFailureResponseData) this.read;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new AdjustDeeplink(setsdkprefix, getfailureresponsedata);
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getSystemDefinedLCbbffg getsystemdefinedlcbbffg = (getSystemDefinedLCbbffg) this.IconCompatParcelizer;
                getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) this.read;
                Set setKeySet = getnoactivechildannotations.read().keySet();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    int i2 = serializer + 57;
                    write = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        arrayList.add(((isRoot) it.next()).IconCompatParcelizer);
                        obj2.hashCode();
                        throw null;
                    }
                    arrayList.add(((isRoot) it.next()).IconCompatParcelizer);
                }
                LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = getsystemdefinedlcbbffg.RemoteActionCompatParcelizer();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = linkedHashMapRemoteActionCompatParcelizer.entrySet().iterator();
                while (it2.hasNext()) {
                    int i3 = serializer + 83;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        entry = (Map.Entry) it2.next();
                        int i4 = 83 / 0;
                        if (!arrayList.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else {
                        entry = (Map.Entry) it2.next();
                        if (!arrayList.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        int i5 = write + 55;
                        serializer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), 293359908, BackspaceCommand.write()), value);
                        int i7 = serializer + 75;
                        write = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                    } else if (!(!(value instanceof Float))) {
                        backwardfocussearchIconCompatParcelizer.serializer(RangesKt.RemoteActionCompatParcelizer(str), value);
                    } else if (value instanceof Integer) {
                        backwardfocussearchIconCompatParcelizer.serializer(RangesKt.IconCompatParcelizer(str), value);
                    } else if (value instanceof Long) {
                        backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write()), value);
                    } else if (value instanceof String) {
                        backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), value);
                    } else if (value instanceof Set) {
                        str.getClass();
                        backwardfocussearchIconCompatParcelizer.serializer(new isRoot(str), (Set) value);
                    }
                }
                return new backwardFocusSearch(new LinkedHashMap(backwardfocussearchIconCompatParcelizer.read()), true);
            case 2:
                Object obj3 = this.IconCompatParcelizer;
                Object obj4 = this.read;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (obj3 instanceof isItemDismissable) {
                    obj3 = null;
                }
                if (obj4 instanceof isItemDismissable) {
                    int i9 = serializer + 31;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        int i10 = 5 % 5;
                    }
                } else {
                    obj2 = obj4;
                }
                return new onViewAttachedToWindowlambda0(obj3, obj2);
            case 3:
                String str2 = (String) this.IconCompatParcelizer;
                Throwable th = (Throwable) this.read;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new accesslayoutAccordingTo(str2, th);
            case 4:
                Person person = (Person) this.IconCompatParcelizer;
                getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) this.read;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new onViewAttachedToWindowlambda0(getwindowareadisplaymetrics, person);
            case 5:
                getWindowAreaDisplayMetrics getwindowareadisplaymetrics2 = (getWindowAreaDisplayMetrics) this.IconCompatParcelizer;
                r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) this.read;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return r8lambda3bu44zoh4poqg1b9bbdbvankq == r8lambda3bU44Zoh4poQG1b9BbDBVanKQ.NOT_AVAILABLE ? getWindowAreaStatus.read : getwindowareadisplaymetrics2;
            case 6:
                se seVar = (se) this.IconCompatParcelizer;
                Integer num = (Integer) this.read;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                sa saVar = seVar.serializer;
                if (!(saVar instanceof sb)) {
                    return seVar;
                }
                sb sbVar = (sb) saVar;
                List<t2> list = sbVar.write;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (t2 t2Var : list) {
                    t1 t1Var = t2Var.serializer;
                    if (t1Var != null) {
                        int i11 = write + 115;
                        serializer = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 != 0) {
                            Integer.valueOf(t1Var.IconCompatParcelizer);
                            obj2.hashCode();
                            throw null;
                        }
                        numValueOf = Integer.valueOf(t1Var.IconCompatParcelizer);
                    } else {
                        numValueOf = null;
                    }
                    arrayList2.add(t2.IconCompatParcelizer(t2Var, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf, num}, getCieXyz.write())).booleanValue()));
                }
                return se.RemoteActionCompatParcelizer(seVar, sb.serializer(sbVar, arrayList2));
            case 7:
                se seVar2 = (se) this.IconCompatParcelizer;
                getFailureResponseData getfailureresponsedata2 = (getFailureResponseData) this.read;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new onViewAttachedToWindowlambda0(seVar2, getfailureresponsedata2);
            case 8:
                Throwable th2 = (Throwable) this.IconCompatParcelizer;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                String str3 = "RiderStatusPolling flow completed. exception=" + th2;
                getConnectivityType getconnectivitytype = (getConnectivityType) this.read;
                if (((FirebaseRemoteConfigImpl) getconnectivitytype.RatingCompat).r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    if (th2 == null) {
                        th2 = new Throwable(str3);
                    }
                    forest.RemoteActionCompatParcelizer(th2, str3, new Object[0]);
                } else {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(str3, new Object[0]);
                }
                getconnectivitytype.MediaDescriptionCompat.set(false);
                return createFromParcel.INSTANCE;
            default:
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) this.IconCompatParcelizer;
                isTrackingEnabled istrackingenabled = (isTrackingEnabled) this.read;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return onviewattachedtowindowlambda0 != null ? new onViewAttachedToWindowlambda0((isTrackingEnabled) onviewattachedtowindowlambda0.write, istrackingenabled) : new onViewAttachedToWindowlambda0(null, istrackingenabled);
        }
    }
}
