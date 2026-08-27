package com.roadrunner.startingarea.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.PuckBearing;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$WhenMappings;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import io.sentry.CombinedScopeView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import o.ExtensionWindowAreaStatusRequirements;
import o.ShortNewsContentCardView;
import o.accesssetEndpointProvidercp;
import o.addSerializedCardJsonToStoragelambda10;
import o.createFromParcel;
import o.endRearDisplayPresentationSession;
import o.getWindowAreaDisplayMetrics;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigateToStartingArea$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(ShortNewsContentCardView shortNewsContentCardView, DefaultLocationProvider defaultLocationProvider, Flow flow) {
        super(3, shortNewsContentCardView);
        this.write = 1;
        this.read = defaultLocationProvider;
        this.MediaBrowserCompatMediaItem = flow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(ShortNewsContentCardView shortNewsContentCardView, Object obj, int i) {
        super(3, shortNewsContentCardView);
        this.write = i;
        this.MediaBrowserCompatMediaItem = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.MediaBrowserCompatMediaItem;
        FlowCollector flowCollector = (FlowCollector) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        if (i3 == 0) {
            NavigateToStartingArea$invoke$$inlined$flatMapLatest$1 navigateToStartingArea$invoke$$inlined$flatMapLatest$1 = new NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(shortNewsContentCardView, (ComponentRegistry$Builder) obj4, 0);
            navigateToStartingArea$invoke$$inlined$flatMapLatest$1.RemoteActionCompatParcelizer = flowCollector;
            navigateToStartingArea$invoke$$inlined$flatMapLatest$1.IconCompatParcelizer = obj2;
            Object objInvokeSuspend = navigateToStartingArea$invoke$$inlined$flatMapLatest$1.invokeSuspend(createfromparcel);
            int i4 = MediaSessionCompatQueueItem + 77;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
        if (i3 == 1) {
            NavigateToStartingArea$invoke$$inlined$flatMapLatest$1 navigateToStartingArea$invoke$$inlined$flatMapLatest$2 = new NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(shortNewsContentCardView, (DefaultLocationProvider) this.read, (Flow) obj4);
            navigateToStartingArea$invoke$$inlined$flatMapLatest$2.RemoteActionCompatParcelizer = flowCollector;
            navigateToStartingArea$invoke$$inlined$flatMapLatest$2.IconCompatParcelizer = obj2;
            return navigateToStartingArea$invoke$$inlined$flatMapLatest$2.invokeSuspend(createfromparcel);
        }
        NavigateToStartingArea$invoke$$inlined$flatMapLatest$1 navigateToStartingArea$invoke$$inlined$flatMapLatest$3 = new NavigateToStartingArea$invoke$$inlined$flatMapLatest$1(shortNewsContentCardView, (addSerializedCardJsonToStoragelambda10) obj4, i);
        navigateToStartingArea$invoke$$inlined$flatMapLatest$3.RemoteActionCompatParcelizer = flowCollector;
        navigateToStartingArea$invoke$$inlined$flatMapLatest$3.IconCompatParcelizer = obj2;
        Object objInvokeSuspend2 = navigateToStartingArea$invoke$$inlined$flatMapLatest$3.invokeSuspend(createfromparcel);
        int i6 = RatingCompat + 87;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return objInvokeSuspend2;
        }
        Object obj5 = null;
        obj5.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        Flow flowSerializer;
        FlowCollector flowCollector3;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.MediaBrowserCompatMediaItem;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                flowCollector = this.RemoteActionCompatParcelizer;
                getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) this.IconCompatParcelizer;
                if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                    ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) ((ComponentRegistry$Builder) obj2).read;
                    ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                    double d = extensionWindowAreaStatusRequirements.serializer;
                    double d2 = extensionWindowAreaStatusRequirements.read;
                    this.RemoteActionCompatParcelizer = null;
                    this.IconCompatParcelizer = null;
                    this.read = flowCollector;
                    this.serializer = 1;
                    Object objInvoke = componentRegistry$Builder.invoke(d, d2, this);
                    if (objInvoke != coroutineSingletons) {
                        flowCollector2 = flowCollector;
                        obj = objInvoke;
                    }
                } else {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                    this.RemoteActionCompatParcelizer = null;
                    this.IconCompatParcelizer = null;
                    this.read = null;
                    this.serializer = 2;
                    if (FlowKt.emitAll(flowCollector, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) != coroutineSingletons) {
                        return createfromparcel;
                    }
                }
                return coroutineSingletons;
            }
            int i4 = RatingCompat;
            int i5 = i4 + 11;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? i3 != 1 : i3 != 0) {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = i4 + 9;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            flowCollector2 = (FlowCollector) this.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowKt__LimitKt$take$$inlined$unsafeFlow$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1((Flow) obj);
            flowCollector = flowCollector2;
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = flowKt__LimitKt$take$$inlined$unsafeFlow$1;
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = null;
            this.read = null;
            this.serializer = 2;
            if (FlowKt.emitAll(flowCollector, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) != coroutineSingletons) {
                return createfromparcel;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.serializer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowCollector flowCollector4 = this.RemoteActionCompatParcelizer;
                PuckBearing puckBearing = (PuckBearing) this.IconCompatParcelizer;
                int i9 = puckBearing == null ? -1 : DefaultLocationProvider$collectLocationFlow$1$2$WhenMappings.$EnumSwitchMapping$0[puckBearing.ordinal()];
                if (i9 == -1) {
                    flowSerializer = FlowKt.serializer();
                } else if (i9 == 1) {
                    flowSerializer = ((DefaultLocationProvider) this.read).deviceOrientationFlow;
                } else if (i9 == 2) {
                    flowSerializer = new NestLoadingServiceImpl$special$$inlined$map$1((Flow) obj2, 1);
                    int i10 = RatingCompat + 43;
                    MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                }
                this.serializer = 1;
                return FlowKt.emitAll(flowCollector4, flowSerializer, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            int i12 = RatingCompat + 15;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0 ? i8 == 1 : i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.serializer;
        if (i13 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowCollector flowCollector5 = this.RemoteActionCompatParcelizer;
            getWindowAreaDisplayMetrics getwindowareadisplaymetrics2 = (getWindowAreaDisplayMetrics) this.IconCompatParcelizer;
            if (getwindowareadisplaymetrics2 instanceof endRearDisplayPresentationSession) {
                CombinedScopeView combinedScopeView = ((addSerializedCardJsonToStoragelambda10) obj2).write;
                ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements2 = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics2).IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = null;
                this.IconCompatParcelizer = null;
                this.read = flowCollector5;
                this.serializer = 1;
                Object objInvoke2 = combinedScopeView.invoke(extensionWindowAreaStatusRequirements2, this);
                if (objInvoke2 != coroutineSingletons3) {
                    flowCollector3 = flowCollector5;
                    obj = objInvoke2;
                }
                return coroutineSingletons3;
            }
            flowCollector3 = flowCollector5;
            obj = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(accesssetEndpointProvidercp.serializer);
        } else {
            if (i13 != 1) {
                int i14 = RatingCompat + 77;
                MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0 ? i13 != 2 : i13 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            flowCollector3 = (FlowCollector) this.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = null;
        this.read = null;
        this.serializer = 2;
        if (FlowKt.emitAll(flowCollector3, (Flow) obj, this) != coroutineSingletons3) {
            return createfromparcel;
        }
        return coroutineSingletons3;
    }
}
