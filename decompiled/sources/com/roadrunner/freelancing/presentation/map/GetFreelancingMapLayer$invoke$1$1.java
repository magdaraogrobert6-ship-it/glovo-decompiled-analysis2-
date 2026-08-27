package com.roadrunner.freelancing.presentation.map;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import io.grpc.CallOptions$Builder;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AdjustDeeplink;
import o.NotificationCompatProgressStyle;
import o.NotificationCompatStyle;
import o.Person;
import o.RemoteActionCompat;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createNotificationChannelsCompat;
import o.dispatchChildDetached;
import o.f9;
import o.fe;
import o.g0ExternalSyntheticLambda1;
import o.g5;
import o.getCieXyz;
import o.getFailureResponseData;
import o.getGpsAdid;
import o.getNotificationChannelsCompat;
import o.getRootStableInsets;
import o.instance_delegatelambda0;
import o.instantiateActivity;
import o.isTrackingEnabled;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onServiceDisconnected;
import o.onViewAttachedToWindowlambda0;
import o.putExtraData;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.removeNodeAtDepth;
import o.sc;
import o.setCarryoverInAppMessage;
import o.setOverriddenInsets;
import o.setRootWindowInsets;
import o.setTransactionSuccessful;
import o.shouldDumpInternalState;
import o.shouldSkipDump;
import o.t2ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFreelancingMapLayer$invoke$1$1 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public /* synthetic */ Person RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public /* synthetic */ boolean serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetFreelancingMapLayer$invoke$1$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(5, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = obj;
    }

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj6 = this.MediaSessionCompatQueueItem;
        int i4 = 1;
        if (i3 == 0) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            GetFreelancingMapLayer$invoke$1$1 getFreelancingMapLayer$invoke$1$1 = new GetFreelancingMapLayer$invoke$1$1((getRootStableInsets) obj6, (ShortNewsContentCardView) obj5, 0);
            getFreelancingMapLayer$invoke$1$1.read = (f9) obj;
            getFreelancingMapLayer$invoke$1$1.serializer = zBooleanValue;
            getFreelancingMapLayer$invoke$1$1.RemoteActionCompatParcelizer = (Person) obj3;
            getFreelancingMapLayer$invoke$1$1.write = (getFailureResponseData) obj4;
            Object objInvokeSuspend = getFreelancingMapLayer$invoke$1$1.invokeSuspend(createfromparcel);
            int i5 = MediaDescriptionCompat + 77;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 1 / 0;
            }
            return objInvokeSuspend;
        }
        if (i3 == 1) {
            boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
            GetFreelancingMapLayer$invoke$1$1 getFreelancingMapLayer$invoke$1$2 = new GetFreelancingMapLayer$invoke$1$1((CallOptions$Builder) obj6, (ShortNewsContentCardView) obj5, i4);
            getFreelancingMapLayer$invoke$1$2.read = (AdjustDeeplink) obj;
            getFreelancingMapLayer$invoke$1$2.write = (sc) obj2;
            getFreelancingMapLayer$invoke$1$2.RemoteActionCompatParcelizer = (Person) obj3;
            getFreelancingMapLayer$invoke$1$2.serializer = zBooleanValue2;
            return getFreelancingMapLayer$invoke$1$2.invokeSuspend(createfromparcel);
        }
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        GetFreelancingMapLayer$invoke$1$1 getFreelancingMapLayer$invoke$1$3 = new GetFreelancingMapLayer$invoke$1$1((setRootWindowInsets) obj6, (ShortNewsContentCardView) obj5, i);
        getFreelancingMapLayer$invoke$1$3.read = (sc) obj;
        getFreelancingMapLayer$invoke$1$3.RemoteActionCompatParcelizer = (Person) obj2;
        getFreelancingMapLayer$invoke$1$3.serializer = zBooleanValue3;
        getFreelancingMapLayer$invoke$1$3.write = (Integer) obj4;
        Object objInvokeSuspend2 = getFreelancingMapLayer$invoke$1$3.invokeSuspend(createfromparcel);
        int i7 = MediaDescriptionCompat + 109;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objInvokeSuspend2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x022b  */
    /* JADX WARN: Code duplicated, block: B:114:0x022f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0257  */
    /* JADX WARN: Code duplicated, block: B:151:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:1: B:37:0x0091->B:156:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bf  */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.time.ZonedDateTime] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f9 f9Var;
        List list;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        String strIconCompatParcelizer;
        boolean z;
        String str;
        String str2;
        Iterator it;
        List list2;
        createNotificationChannelsCompat createnotificationchannelscompat;
        instantiateActivity instantiateactivity;
        int i;
        Iterator it2;
        Object next;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        Object obj2 = this.MediaSessionCompatQueueItem;
        boolean z2 = false;
        if (i5 == 0) {
            getRootStableInsets getrootstableinsets = (getRootStableInsets) obj2;
            f9 f9Var2 = (f9) this.read;
            boolean z3 = this.serializer;
            Person person = this.RemoteActionCompatParcelizer;
            getFailureResponseData getfailureresponsedata = (getFailureResponseData) this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isTrackingEnabled istrackingenabled = getfailureresponsedata.RemoteActionCompatParcelizer;
            isTrackingEnabled istrackingenabled2 = isTrackingEnabled.NOT_WORKING;
            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
            if (istrackingenabled != istrackingenabled2) {
                return new f9(instance_delegatelambda0Var);
            }
            if (!z3 || !(person instanceof RemoteActionCompat)) {
                return new f9(instance_delegatelambda0Var);
            }
            if (getrootstableinsets.RatingCompat.RemoteActionCompatParcelizer()) {
                list = f9Var2.write;
            } else {
                boolean z4 = getrootstableinsets.MediaMetadataCompat.read();
                GetWorkNowOpportunity getWorkNowOpportunity = getrootstableinsets.MediaSessionCompatQueueItem;
                if (z4) {
                    getWorkNowOpportunity.RatingCompat.clear();
                    List<createNotificationChannelsCompat> list3 = ((RemoteActionCompat) person).IconCompatParcelizer;
                    ArrayList arrayList = new ArrayList();
                    for (createNotificationChannelsCompat createnotificationchannelscompat2 : list3) {
                        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) SQLite.read(getrootstableinsets.read(createnotificationchannelscompat2), getrootstableinsets.RemoteActionCompatParcelizer(createnotificationchannelscompat2)), (Collection) arrayList);
                    }
                    List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList)));
                    list = (listPlaybackStateCompat.isEmpty() ? new f9(instance_delegatelambda0Var) : new f9(onContentCardDismissed.RemoteActionCompatParcelizer((Collection) listPlaybackStateCompat, (Object) new g0ExternalSyntheticLambda1(g5.ALWAYS)))).write;
                } else {
                    RemoteActionCompat remoteActionCompat = (RemoteActionCompat) person;
                    getWorkNowOpportunity.RatingCompat.clear();
                    getGpsAdid getgpsadid = remoteActionCompat.RemoteActionCompatParcelizer;
                    if (getgpsadid == null) {
                        f9Var = new f9(instance_delegatelambda0Var);
                    } else {
                        boolean z5 = remoteActionCompat.read;
                        instantiateActivity instantiateactivity2 = instantiateActivity.START_NOW;
                        instantiateactivity2.getClass();
                        String str3 = getgpsadid.read;
                        onServiceDisconnected onservicedisconnected = getgpsadid.MediaMetadataCompat;
                        createNotificationChannelsCompat createnotificationchannelscompat3 = new createNotificationChannelsCompat(str3, onservicedisconnected.IconCompatParcelizer, onservicedisconnected.write.serializer, getgpsadid.RemoteActionCompatParcelizer, getgpsadid.serializer, z5, instantiateactivity2, getgpsadid.write, getgpsadid.MediaDescriptionCompat, getgpsadid.IconCompatParcelizer, getgpsadid.MediaSessionCompatQueueItem);
                        f9Var = new f9(onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new fe[]{new g0ExternalSyntheticLambda1(g5.ALWAYS), getrootstableinsets.RemoteActionCompatParcelizer(createnotificationchannelscompat3), getrootstableinsets.read(createnotificationchannelscompat3)}));
                    }
                    list = f9Var.write;
                }
            }
            return new f9(list);
        }
        String str4 = null;
        if (i5 == 1) {
            AdjustDeeplink adjustDeeplink = (AdjustDeeplink) this.read;
            sc scVar = (sc) this.write;
            Person person2 = this.RemoteActionCompatParcelizer;
            boolean z6 = this.serializer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CallOptions$Builder callOptions$Builder = (CallOptions$Builder) obj2;
            if (!((RiderStateRepositoryImpl) ((dispatchChildDetached) callOptions$Builder.MediaSessionCompatQueueItem)).write()) {
                int i6 = MediaDescriptionCompat + 71;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    isTrackingEnabled istrackingenabled3 = adjustDeeplink.write.RemoteActionCompatParcelizer;
                    isTrackingEnabled istrackingenabled4 = isTrackingEnabled.NOT_WORKING;
                    str4.hashCode();
                    throw null;
                }
                if (adjustDeeplink.write.RemoteActionCompatParcelizer == isTrackingEnabled.NOT_WORKING) {
                    if (scVar == sc.START_NOW) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{person2, getNotificationChannelsCompat.read}, getCieXyz.write())).booleanValue()) {
                            int i7 = MediaBrowserCompatMediaItem + 33;
                            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            z2 = true;
                        }
                    }
                }
            } else if (scVar == sc.START_NOW) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{person2, getNotificationChannelsCompat.read}, getCieXyz.write())).booleanValue()) {
                    int i9 = MediaBrowserCompatMediaItem + 33;
                    MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z2 = true;
                }
            }
            if (!z6 || !z2) {
                return shouldDumpInternalState.read;
            }
            setTransactionSuccessful settransactionsuccessful = ((shouldSkipDump) callOptions$Builder.serializer).serializer;
            return new putExtraData(settransactionsuccessful.IconCompatParcelizer(R.string.on_going_session_not_available), settransactionsuccessful.IconCompatParcelizer(R.string.on_going_session_switch_schedule_tab));
        }
        sc scVar2 = (sc) this.read;
        Person person3 = this.RemoteActionCompatParcelizer;
        boolean z7 = this.serializer;
        Integer num = (Integer) this.write;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z7 && scVar2 == sc.START_NOW) {
            setRootWindowInsets setrootwindowinsets = (setRootWindowInsets) obj2;
            if (!(person3 instanceof getNotificationChannelsCompat)) {
                if (!(person3 instanceof RemoteActionCompat)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                RemoteActionCompat remoteActionCompat2 = (RemoteActionCompat) person3;
                setTransactionSuccessful settransactionsuccessful2 = setrootwindowinsets.MediaDescriptionCompat;
                boolean z8 = remoteActionCompat2.read;
                getGpsAdid getgpsadid2 = remoteActionCompat2.RemoteActionCompatParcelizer;
                if (z8 && getgpsadid2 != null) {
                    if (((Boolean) setrootwindowinsets.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                        int i11 = MediaBrowserCompatMediaItem + 61;
                        MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        if (num == null) {
                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateActivity.START_NOW, null);
                        } else {
                            List list4 = getgpsadid2.MediaBrowserCompatMediaItem;
                            if (list4 instanceof Collection) {
                                int i13 = MediaDescriptionCompat + 57;
                                MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
                                if (i13 % 2 == 0) {
                                    list4.isEmpty();
                                    throw null;
                                }
                                if (list4.isEmpty()) {
                                    list2 = (List) setrootwindowinsets.RatingCompat.read.get(num);
                                    if (list2 != null) {
                                        i = MediaDescriptionCompat + 81;
                                        MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                                        if (i % 2 == 0) {
                                            remoteActionCompat2.IconCompatParcelizer.iterator();
                                            throw null;
                                        }
                                        it2 = remoteActionCompat2.IconCompatParcelizer.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                        } while (!onContentCardDismissed.write(list2, setCarryoverInAppMessage.PlaybackStateCompat(((createNotificationChannelsCompat) next).RatingCompat)));
                                        createnotificationchannelscompat = (createNotificationChannelsCompat) next;
                                    } else {
                                        createnotificationchannelscompat = null;
                                    }
                                    if (createnotificationchannelscompat != null || (instantiateactivity = createnotificationchannelscompat.write) == null) {
                                        instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                    }
                                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateactivity, createnotificationchannelscompat);
                                } else {
                                    it = list4.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            list2 = (List) setrootwindowinsets.RatingCompat.read.get(num);
                                            if (list2 != null) {
                                                i = MediaDescriptionCompat + 81;
                                                MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                                                if (i % 2 == 0) {
                                                    remoteActionCompat2.IconCompatParcelizer.iterator();
                                                    throw null;
                                                }
                                                it2 = remoteActionCompat2.IconCompatParcelizer.iterator();
                                                do {
                                                    if (!it2.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it2.next();
                                                } while (!onContentCardDismissed.write(list2, setCarryoverInAppMessage.PlaybackStateCompat(((createNotificationChannelsCompat) next).RatingCompat)));
                                                createnotificationchannelscompat = (createNotificationChannelsCompat) next;
                                            } else {
                                                createnotificationchannelscompat = null;
                                            }
                                            if (createnotificationchannelscompat != null) {
                                                instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                            } else {
                                                instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                            }
                                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateactivity, createnotificationchannelscompat);
                                        } else if (((t2ExternalSyntheticLambda0) it.next()).read == num.intValue()) {
                                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateActivity.START_NOW, null);
                                        }
                                    }
                                }
                            } else {
                                it = list4.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        list2 = (List) setrootwindowinsets.RatingCompat.read.get(num);
                                        if (list2 != null) {
                                            i = MediaDescriptionCompat + 81;
                                            MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                                            if (i % 2 == 0) {
                                                remoteActionCompat2.IconCompatParcelizer.iterator();
                                                throw null;
                                            }
                                            it2 = remoteActionCompat2.IconCompatParcelizer.iterator();
                                            do {
                                                if (!it2.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it2.next();
                                            } while (!onContentCardDismissed.write(list2, setCarryoverInAppMessage.PlaybackStateCompat(((createNotificationChannelsCompat) next).RatingCompat)));
                                            createnotificationchannelscompat = (createNotificationChannelsCompat) next;
                                        } else {
                                            createnotificationchannelscompat = null;
                                        }
                                        if (createnotificationchannelscompat != null) {
                                            instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                        } else {
                                            instantiateactivity = instantiateActivity.NOT_AVAILABLE;
                                        }
                                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateactivity, createnotificationchannelscompat);
                                    } else if (((t2ExternalSyntheticLambda0) it.next()).read == num.intValue()) {
                                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateActivity.START_NOW, null);
                                    }
                                }
                            }
                        }
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(instantiateActivity.START_NOW, null);
                    }
                    instantiateActivity instantiateactivity3 = (instantiateActivity) onviewattachedtowindowlambda0.serializer;
                    createNotificationChannelsCompat createnotificationchannelscompat4 = (createNotificationChannelsCompat) onviewattachedtowindowlambda0.write;
                    int[] iArr = setOverriddenInsets.read;
                    int i14 = iArr[instantiateactivity3.ordinal()];
                    if (i14 == 1) {
                        strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_goandstart_action);
                    } else if (i14 == 2) {
                        strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_goandstart_not_available_for_now);
                    } else if (i14 == 3) {
                        strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.rid_goandstart_not_available);
                    } else {
                        if (i14 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        int i15 = MediaBrowserCompatMediaItem + 107;
                        MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 != 0) {
                            settransactionsuccessful2.IconCompatParcelizer(R.string.freelancing_work_now_button);
                            throw null;
                        }
                        strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.freelancing_work_now_button);
                    }
                    String str5 = strIconCompatParcelizer;
                    int i16 = iArr[instantiateactivity3.ordinal()];
                    if (i16 == 1) {
                        z = true;
                    } else if (i16 == 2 || i16 == 3) {
                        z = false;
                    } else {
                        int i17 = MediaBrowserCompatMediaItem + 61;
                        MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0 ? i16 != 4 : i16 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        z = true;
                    }
                    if (instantiateactivity3 != instantiateActivity.NOT_AVAILABLE_YET) {
                        str = null;
                    } else {
                        if (createnotificationchannelscompat4 != null) {
                            int i18 = MediaBrowserCompatMediaItem + 101;
                            MediaDescriptionCompat = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            str2 = createnotificationchannelscompat4.MediaMetadataCompat;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            String str6 = createnotificationchannelscompat4.MediaMetadataCompat;
                            str6.getClass();
                            String str7 = ZonedDateTime.parse(str6).withZoneSameInstant(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm").withLocale(Locale.getDefault()));
                            str7.getClass();
                            str = str7;
                        } else {
                            str = null;
                        }
                    }
                    return new NotificationCompatStyle(getgpsadid2.read, getgpsadid2.MediaDescriptionCompat, getgpsadid2.MediaMetadataCompat.IconCompatParcelizer, str5, getgpsadid2.IconCompatParcelizer, settransactionsuccessful2.IconCompatParcelizer(R.string.infra_payment_earning_per_order), instantiateactivity3, z, instantiateactivity3 == instantiateActivity.NOT_AVAILABLE ? settransactionsuccessful2.IconCompatParcelizer(R.string.rid_goandstart_schedule_instead) : null, str);
                }
            }
        }
        return NotificationCompatProgressStyle.IconCompatParcelizer;
    }
}
