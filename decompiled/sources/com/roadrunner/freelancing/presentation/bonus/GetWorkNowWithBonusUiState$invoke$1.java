package com.roadrunner.freelancing.presentation.bonus;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.FrameMetricsAggregator;
import o.NotificationCompatAction;
import o.Person;
import o.RemoteActionCompat;
import o.ShortNewsContentCardView;
import o.WindowInsetsAnimationCompatCallback;
import o.computeVerticalScrollOffset;
import o.createFromParcel;
import o.createNotificationChannelsCompat;
import o.getCieXyz;
import o.getGpsAdid;
import o.getNotificationChannelsCompat;
import o.instantiateActivity;
import o.isAdapterPositionOnScreen;
import o.onServiceConnected;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;
import o.resolveroom_runtime;
import o.sc;
import o.setTransactionSuccessful;
import o.t3;
import o.v4;

/* JADX INFO: loaded from: classes3.dex */
public final class GetWorkNowWithBonusUiState$invoke$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ computeVerticalScrollOffset RemoteActionCompatParcelizer;
    public /* synthetic */ sc serializer;
    public /* synthetic */ Person write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWorkNowWithBonusUiState$invoke$1(computeVerticalScrollOffset computeverticalscrolloffset, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = computeverticalscrolloffset;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        GetWorkNowWithBonusUiState$invoke$1 getWorkNowWithBonusUiState$invoke$1 = new GetWorkNowWithBonusUiState$invoke$1(this.RemoteActionCompatParcelizer, (ShortNewsContentCardView) obj4);
        getWorkNowWithBonusUiState$invoke$1.serializer = (sc) obj;
        getWorkNowWithBonusUiState$invoke$1.write = (Person) obj2;
        getWorkNowWithBonusUiState$invoke$1.IconCompatParcelizer = zBooleanValue;
        Object objInvokeSuspend = getWorkNowWithBonusUiState$invoke$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaDescriptionCompat + 91;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        createNotificationChannelsCompat createnotificationchannelscompat;
        instantiateActivity instantiateactivity;
        String strIconCompatParcelizer;
        String strRemoteActionCompatParcelizer;
        String str;
        boolean z;
        t3 t3Var;
        int i;
        t3 t3Var2;
        String strIconCompatParcelizer2;
        String str2;
        Object next;
        int i2 = 2 % 2;
        sc scVar = this.serializer;
        Person person = this.write;
        boolean z2 = this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z2 && scVar == sc.START_NOW) {
            computeVerticalScrollOffset computeverticalscrolloffset = this.RemoteActionCompatParcelizer;
            isAdapterPositionOnScreen isadapterpositiononscreen = computeverticalscrolloffset.read;
            if (!(person instanceof getNotificationChannelsCompat)) {
                if (!(person instanceof RemoteActionCompat)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                RemoteActionCompat remoteActionCompat = (RemoteActionCompat) person;
                getGpsAdid getgpsadid = remoteActionCompat.RemoteActionCompatParcelizer;
                v4 v4Var = computeverticalscrolloffset.IconCompatParcelizer;
                setTransactionSuccessful settransactionsuccessful = computeverticalscrolloffset.MediaMetadataCompat;
                if (((Boolean) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                    Iterator it = remoteActionCompat.IconCompatParcelizer.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((createNotificationChannelsCompat) next).MediaDescriptionCompat);
                    createnotificationchannelscompat = (createNotificationChannelsCompat) next;
                } else {
                    createnotificationchannelscompat = null;
                }
                if (createnotificationchannelscompat == null || (instantiateactivity = createnotificationchannelscompat.write) == null) {
                    instantiateactivity = instantiateActivity.START_NOW;
                }
                int[] iArr = WindowInsetsAnimationCompatCallback.read;
                int i3 = iArr[instantiateactivity.ordinal()];
                if (i3 == 1) {
                    strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_action);
                } else if (i3 == 2) {
                    strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_not_available_for_now);
                } else if (i3 == 3) {
                    strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_not_available);
                } else {
                    if (i3 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.freelancing_work_now_button);
                }
                String str3 = strIconCompatParcelizer;
                if (instantiateactivity != instantiateActivity.NOT_AVAILABLE_YET) {
                    strRemoteActionCompatParcelizer = null;
                } else {
                    if (createnotificationchannelscompat != null) {
                        int i4 = read + 63;
                        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            String str4 = createnotificationchannelscompat.MediaMetadataCompat;
                            throw null;
                        }
                        str2 = createnotificationchannelscompat.MediaMetadataCompat;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        strRemoteActionCompatParcelizer = resolveroom_runtime.RemoteActionCompatParcelizer(createnotificationchannelscompat.MediaMetadataCompat);
                    } else {
                        strRemoteActionCompatParcelizer = null;
                    }
                }
                boolean z3 = false;
                if (instantiateactivity == instantiateActivity.NOT_AVAILABLE) {
                    int i5 = MediaDescriptionCompat + 83;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_schedule_instead);
                        int i6 = 32 / 0;
                    } else {
                        strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.rid_goandstart_schedule_instead);
                    }
                    str = strIconCompatParcelizer2;
                } else {
                    str = null;
                }
                int i7 = iArr[instantiateactivity.ordinal()];
                if (i7 == 1) {
                    z = true;
                } else if (i7 == 2 || i7 == 3) {
                    z = false;
                } else {
                    if (i7 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    z = true;
                }
                boolean zSerializer = computeverticalscrolloffset.MediaBrowserCompatMediaItem.serializer();
                if (createnotificationchannelscompat != null && (t3Var2 = createnotificationchannelscompat.IconCompatParcelizer) != null) {
                    t3Var = t3Var2;
                } else if (getgpsadid != null) {
                    int i8 = MediaDescriptionCompat + 75;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    t3Var = getgpsadid.serializer;
                } else {
                    t3Var = null;
                }
                boolean z4 = zSerializer && t3Var != null;
                boolean zBooleanValue = ((Boolean) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).booleanValue();
                int i10 = R.string.rid_current_promos_see_all_empty_description;
                if (zBooleanValue && createnotificationchannelscompat != null) {
                    int i11 = read + 99;
                    MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    String str5 = createnotificationchannelscompat.RatingCompat;
                    onServiceConnected onserviceconnected = createnotificationchannelscompat.MediaBrowserCompatMediaItem;
                    String str6 = createnotificationchannelscompat.MediaSessionCompatToken;
                    t3 t3Var3 = createnotificationchannelscompat.IconCompatParcelizer;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{createnotificationchannelscompat.read, Boolean.TRUE}, getCieXyz.write())).booleanValue() && zSerializer) {
                        z3 = true;
                    }
                    boolean zRemoteActionCompatParcelizer = v4Var.RemoteActionCompatParcelizer();
                    if (!z4) {
                        i = R.string.rid_current_promos_see_all_empty_description;
                    } else {
                        int i13 = read + 111;
                        MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        i = R.string.rid_current_promos_see_all_description;
                    }
                    return new NotificationCompatAction(str5, onserviceconnected, str6, str3, null, t3Var3, zSerializer, Boolean.valueOf(z3), zRemoteActionCompatParcelizer, str, strRemoteActionCompatParcelizer, instantiateactivity, z, settransactionsuccessful.IconCompatParcelizer(i), settransactionsuccessful.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title));
                }
                if (remoteActionCompat.read && getgpsadid != null) {
                    String str7 = getgpsadid.read;
                    onServiceConnected onserviceconnected2 = getgpsadid.MediaDescriptionCompat;
                    String str8 = getgpsadid.MediaMetadataCompat.IconCompatParcelizer;
                    String str9 = getgpsadid.IconCompatParcelizer;
                    t3 t3Var4 = getgpsadid.serializer;
                    boolean z5 = getgpsadid.write.equals(Boolean.TRUE) && zSerializer;
                    boolean zRemoteActionCompatParcelizer2 = v4Var.RemoteActionCompatParcelizer();
                    if (z4) {
                        i10 = R.string.rid_current_promos_see_all_description;
                    }
                    return new NotificationCompatAction(str7, onserviceconnected2, str8, str3, str9, t3Var4, zSerializer, Boolean.valueOf(z5), zRemoteActionCompatParcelizer2, str, strRemoteActionCompatParcelizer, instantiateactivity, z, settransactionsuccessful.IconCompatParcelizer(i10), settransactionsuccessful.IconCompatParcelizer(R.string.rid_current_promos_see_all_button_title));
                }
            }
        }
        return FrameMetricsAggregator.RemoteActionCompatParcelizer;
    }
}
