package com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class TurnByTurnNavigationLogger$logNavigationArrival$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public String read;
    public decode serializer;
    public final /* synthetic */ TurnByTurnNavigationLogger write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TurnByTurnNavigationLogger$logNavigationArrival$1(TurnByTurnNavigationLogger turnByTurnNavigationLogger, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = turnByTurnNavigationLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 9;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger = this.write;
        int i6 = 0;
        switch (i5) {
            case 0:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, i6);
            case 1:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 1);
            case 2:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, i);
            case 3:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 3);
            case 4:
                TurnByTurnNavigationLogger$logNavigationArrival$1 turnByTurnNavigationLogger$logNavigationArrival$1 = new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 4);
                int i7 = MediaSessionCompatQueueItem + 75;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 45 / 0;
                }
                return turnByTurnNavigationLogger$logNavigationArrival$1;
            case 5:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 5);
            case 6:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 6);
            default:
                return new TurnByTurnNavigationLogger$logNavigationArrival$1(turnByTurnNavigationLogger, shortNewsContentCardView, 7);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 15;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                Object objInvokeSuspend = ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = MediaSessionCompatQueueItem + 119;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
                return objInvokeSuspend;
            case 3:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((TurnByTurnNavigationLogger$logNavigationArrival$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        decode decodeVar;
        String str;
        decode decodeVar2;
        String str2;
        decode decodeVar3;
        String str3;
        decode decodeVar4;
        String str4;
        decode decodeVar5;
        String str5;
        decode decodeVar6;
        decode decodeVar7;
        String str6;
        decode decodeVar8;
        String str7;
        String str8 = "deliveries_route_clicked";
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TurnByTurnNavigationLogger turnByTurnNavigationLogger = this.write;
        Object obj2 = null;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.RemoteActionCompatParcelizer;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decodeVar = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar;
                    this.read = "deliveries_navigation_arrival";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams == coroutineSingletons) {
                        int i4 = MediaSessionCompatQueueItem + 25;
                        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            return coroutineSingletons;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    str = "deliveries_navigation_arrival";
                    obj = serializableAccess$getCommonParams;
                } else {
                    if (i3 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.read;
                    decodeVar = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar.logEvent(str, (Map) obj);
                int i5 = MediaDescriptionCompat + 17;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.RemoteActionCompatParcelizer;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decodeVar2 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar2;
                    this.read = "deliveries_navigation_building_highlighted";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams2 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    str2 = "deliveries_navigation_building_highlighted";
                    obj = serializableAccess$getCommonParams2;
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = MediaDescriptionCompat + 37;
                    MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    str2 = this.read;
                    decodeVar2 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar2.logEvent(str2, (Map) obj);
                return createfromparcel;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.RemoteActionCompatParcelizer;
                if (i10 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decodeVar3 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar3;
                    this.read = "deliveries_navigation_exit_clicked";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams3 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams3 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    str3 = "deliveries_navigation_exit_clicked";
                    obj = serializableAccess$getCommonParams3;
                } else {
                    if (i10 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i11 = MediaSessionCompatQueueItem + 109;
                    MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    str3 = this.read;
                    decodeVar3 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar3.logEvent(str3, (Map) obj);
                return createfromparcel;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.RemoteActionCompatParcelizer;
                if (i13 != 0) {
                    int i14 = MediaSessionCompatQueueItem + 85;
                    MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (i13 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = this.read;
                    decodeVar4 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decode decodeVar9 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar9;
                    this.read = "deliveries_navigation_click_route";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams4 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams4 == coroutineSingletons4) {
                        int i16 = MediaSessionCompatQueueItem + 113;
                        MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        return coroutineSingletons4;
                    }
                    decodeVar4 = decodeVar9;
                    str4 = "deliveries_navigation_click_route";
                    obj = serializableAccess$getCommonParams4;
                }
                decodeVar4.logEvent(str4, (Map) obj);
                return createfromparcel;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.RemoteActionCompatParcelizer;
                if (i18 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decodeVar5 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar5;
                    this.read = "deliveries_route_preview_error";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams5 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams5 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    str5 = "deliveries_route_preview_error";
                    obj = serializableAccess$getCommonParams5;
                } else {
                    if (i18 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i19 = MediaSessionCompatQueueItem + 59;
                    MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    str5 = this.read;
                    decodeVar5 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar5.logEvent(str5, (Map) obj);
                return createfromparcel;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.RemoteActionCompatParcelizer;
                if (i21 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decode decodeVar10 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar10;
                    this.read = "deliveries_route_clicked";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams6 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams6 == coroutineSingletons6) {
                        int i22 = MediaSessionCompatQueueItem + 71;
                        MediaDescriptionCompat = i22 % Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            int i23 = 38 / 0;
                        }
                        return coroutineSingletons6;
                    }
                    decodeVar6 = decodeVar10;
                    obj = serializableAccess$getCommonParams6;
                } else {
                    if (i21 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str8 = this.read;
                    decodeVar6 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar6.logEvent(str8, onMove.serializer((Map) obj, new onViewAttachedToWindowlambda0("route_source", "mapbox")));
                return createfromparcel;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.RemoteActionCompatParcelizer;
                if (i24 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decode decodeVar11 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar11;
                    this.read = "deliveries_navigation_start_error";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams7 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams7 == coroutineSingletons7) {
                        int i25 = MediaSessionCompatQueueItem + 69;
                        MediaDescriptionCompat = i25 % Fields.SpotShadowColor;
                        if (i25 % 2 == 0) {
                            int i26 = 11 / 0;
                        }
                        return coroutineSingletons7;
                    }
                    decodeVar7 = decodeVar11;
                    str6 = "deliveries_navigation_start_error";
                    obj = serializableAccess$getCommonParams7;
                } else {
                    if (i24 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i27 = MediaSessionCompatQueueItem + 59;
                    MediaDescriptionCompat = i27 % Fields.SpotShadowColor;
                    if (i27 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        throw null;
                    }
                    str6 = this.read;
                    decodeVar7 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar7.logEvent(str6, (Map) obj);
                return createfromparcel;
            default:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.RemoteActionCompatParcelizer;
                if (i28 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    decodeVar8 = turnByTurnNavigationLogger.RemoteActionCompatParcelizer;
                    this.serializer = decodeVar8;
                    this.read = "deliveries_recenter_button_expanded";
                    this.RemoteActionCompatParcelizer = 1;
                    Serializable serializableAccess$getCommonParams8 = TurnByTurnNavigationLogger.access$getCommonParams(turnByTurnNavigationLogger, this);
                    if (serializableAccess$getCommonParams8 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                    str7 = "deliveries_recenter_button_expanded";
                    obj = serializableAccess$getCommonParams8;
                } else {
                    if (i28 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str7 = this.read;
                    decodeVar8 = this.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                decodeVar8.logEvent(str7, (Map) obj);
                return createfromparcel;
        }
    }
}
