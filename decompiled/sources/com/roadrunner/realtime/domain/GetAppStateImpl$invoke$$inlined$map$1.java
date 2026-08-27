package com.roadrunner.realtime.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.EdgeInsets;
import com.roadrunner.map.integration.mapbox.camera.CalculateSafeAreaUseCase;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.AudioAttributesImplApi21;
import o.AudioAttributesImplApi21Parcelizer;
import o.AudioAttributesImplBase;
import o.C0198r;
import o.C0206t;
import o.DelegatingFrameMetricsListener;
import o.ShortNewsContentCardView;
import o.SubcomposeContentPainterElement;
import o.checkActivityHandler;
import o.createFromParcel;
import o.downFrom;
import o.downTo;
import o.eh;
import o.g6;
import o.getCachedDeeplink;
import o.getConnectionOptions;
import o.getDeeplinkReferrer;
import o.getInstallSessionBackoffStrategy;
import o.getNoActiveChildannotations;
import o.getPackageHandlerBackoffStrategy;
import o.ha;
import o.i5;
import o.igExternalSyntheticLambda7;
import o.installSecondaryDexes;
import o.isInstanceEnabled;
import o.k9;
import o.kd;
import o.ke;
import o.lambdatrackMeasurementConsent1;
import o.lambdatrackMeasurementConsent38;
import o.lambdatrackMeasurementConsent39;
import o.lambdatrackPlayStoreSubscription42;
import o.le;
import o.o0;
import o.onActivityResumed;
import o.p8;
import o.r8lambdaKhgtrlFjSwmiGcCSe60piLUCY;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.r8lambdagKfRJUcMmakOQRpGHGUq3msRI;
import o.r8lambdagvkeXY25A9xZdNNF8GqusXDol5M;
import o.r8lambdahCMuiUVsRubxJCkqZuukT4uD724;
import o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM;
import o.r8lambdamP9aK9cy_4kwIReu_5gwzQUxLxo;
import o.r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs;
import o.requireParentFragment;
import o.setLogger;
import o.timesmpE4wyQ;
import o.toColorLong8_81llA;
import o.urlMatchesSuffix;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAppStateImpl$invoke$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Flow write;

    /* JADX INFO: renamed from: com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ FlowCollector read;

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.IconCompatParcelizer = i;
            this.read = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.IconCompatParcelizer = i;
            this.read = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:113:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:129:0x0205  */
        /* JADX WARN: Code duplicated, block: B:12:0x0039  */
        /* JADX WARN: Code duplicated, block: B:156:0x0264  */
        /* JADX WARN: Code duplicated, block: B:167:0x0287  */
        /* JADX WARN: Code duplicated, block: B:194:0x02d9  */
        /* JADX WARN: Code duplicated, block: B:221:0x0334  */
        /* JADX WARN: Code duplicated, block: B:236:0x037c  */
        /* JADX WARN: Code duplicated, block: B:254:0x03bd  */
        /* JADX WARN: Code duplicated, block: B:275:0x040e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Code duplicated, block: B:294:0x044f  */
        /* JADX WARN: Code duplicated, block: B:311:0x0489  */
        /* JADX WARN: Code duplicated, block: B:328:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:350:0x051a  */
        /* JADX WARN: Code duplicated, block: B:365:0x0578  */
        /* JADX WARN: Code duplicated, block: B:382:0x05b5  */
        /* JADX WARN: Code duplicated, block: B:399:0x05f2  */
        /* JADX WARN: Code duplicated, block: B:416:0x0635  */
        /* JADX WARN: Code duplicated, block: B:433:0x0676  */
        /* JADX WARN: Code duplicated, block: B:45:0x00be  */
        /* JADX WARN: Code duplicated, block: B:64:0x010a  */
        /* JADX WARN: Code duplicated, block: B:91:0x0165  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            lambdatrackPlayStoreSubscription42 lambdatrackplaystoresubscription42;
            C0206t c0206t;
            C0198r c0198r;
            ha haVar;
            i5 i5Var;
            k9 k9Var;
            kd kdVar;
            ke keVar;
            o0 o0Var;
            p8 p8Var;
            SubcomposeContentPainterElement subcomposeContentPainterElement;
            boolean z;
            getPackageHandlerBackoffStrategy getpackagehandlerbackoffstrategy;
            setLogger setlogger;
            DelegatingFrameMetricsListener delegatingFrameMetricsListener;
            lambdatrackMeasurementConsent1 lambdatrackmeasurementconsent1;
            DelegatingFrameMetricsListener delegatingFrameMetricsListener2;
            isInstanceEnabled isinstanceenabled;
            r8lambdahCMuiUVsRubxJCkqZuukT4uD724 r8lambdahcmuiuvsrubxjckqzuukt4ud724;
            Object r8lambdawewsq6zoo2b2985gwdloptnl6xs;
            getCachedDeeplink getcacheddeeplink;
            urlMatchesSuffix urlmatchessuffix;
            getDeeplinkReferrer getdeeplinkreferrer;
            DelegatingFrameMetricsListener delegatingFrameMetricsListener3;
            r8lambdaKhgtrlFjSwmiGcCSe60piLUCY r8lambdakhgtrlfjswmigccse60pilucy;
            r8lambdagKfRJUcMmakOQRpGHGUq3msRI r8lambdagkfrjucmmakoqrpghguq3msri;
            r8lambdagvkeXY25A9xZdNNF8GqusXDol5M r8lambdagvkexy25a9xzdnnf8gqusxdol5m;
            r8lambdamP9aK9cy_4kwIReu_5gwzQUxLxo r8lambdamp9ak9cy_4kwireu_5gwzquxlxo;
            int i = 2 % 2;
            int i2 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            FlowCollector flowCollector = this.read;
            Object obj2 = null;
            switch (i2) {
                case 0:
                    if (shortNewsContentCardView instanceof lambdatrackPlayStoreSubscription42) {
                        lambdatrackplaystoresubscription42 = (lambdatrackPlayStoreSubscription42) shortNewsContentCardView;
                        int i3 = lambdatrackplaystoresubscription42.write;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            lambdatrackplaystoresubscription42.write = i3 - Integer.MIN_VALUE;
                        } else {
                            lambdatrackplaystoresubscription42 = new lambdatrackPlayStoreSubscription42(this, shortNewsContentCardView);
                        }
                    } else {
                        lambdatrackplaystoresubscription42 = new lambdatrackPlayStoreSubscription42(this, shortNewsContentCardView);
                    }
                    Object obj3 = lambdatrackplaystoresubscription42.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = lambdatrackplaystoresubscription42.write;
                    if (i4 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj3);
                        Object obj4 = ((toColorLong8_81llA) obj).isAtLeast(toColorLong8_81llA.STARTED) ? lambdatrackMeasurementConsent38.write : lambdatrackMeasurementConsent39.IconCompatParcelizer;
                        lambdatrackplaystoresubscription42.write = 1;
                        return flowCollector.emit(obj4, lambdatrackplaystoresubscription42) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                    }
                    if (i4 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj3);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 1:
                    if (shortNewsContentCardView instanceof C0206t) {
                        c0206t = (C0206t) shortNewsContentCardView;
                        int i5 = c0206t.read;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            c0206t.read = i5 - Integer.MIN_VALUE;
                        } else {
                            c0206t = new C0206t(this, shortNewsContentCardView);
                        }
                    } else {
                        c0206t = new C0206t(this, shortNewsContentCardView);
                    }
                    Object obj5 = c0206t.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = c0206t.read;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj5);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj5);
                    if (((timesmpE4wyQ) obj).MediaBrowserCompatMediaItem.isEmpty()) {
                        return createfromparcel;
                    }
                    c0206t.read = 1;
                    return flowCollector.emit(obj, c0206t) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                case 2:
                    if (shortNewsContentCardView instanceof C0198r) {
                        c0198r = (C0198r) shortNewsContentCardView;
                        int i7 = c0198r.read;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            c0198r.read = i7 - Integer.MIN_VALUE;
                        } else {
                            c0198r = new C0198r(this, shortNewsContentCardView);
                        }
                    } else {
                        c0198r = new C0198r(this, shortNewsContentCardView);
                    }
                    Object obj6 = c0198r.serializer;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = c0198r.read;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj6);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj6);
                    if (((igExternalSyntheticLambda7) obj) != igExternalSyntheticLambda7.NAVIGATION_INITIALIZED) {
                        return createfromparcel;
                    }
                    c0198r.read = 1;
                    return flowCollector.emit(obj, c0198r) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
                case 3:
                    if (shortNewsContentCardView instanceof ha) {
                        haVar = (ha) shortNewsContentCardView;
                        int i9 = haVar.RemoteActionCompatParcelizer;
                        if ((i9 & Integer.MIN_VALUE) != 0) {
                            haVar.RemoteActionCompatParcelizer = i9 - Integer.MIN_VALUE;
                        } else {
                            haVar = new ha(this, shortNewsContentCardView);
                        }
                    } else {
                        haVar = new ha(this, shortNewsContentCardView);
                    }
                    Object obj7 = haVar.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = haVar.RemoteActionCompatParcelizer;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj7);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj7);
                    if (((igExternalSyntheticLambda7) obj) != igExternalSyntheticLambda7.MAPBOX_INITIALIZED) {
                        return createfromparcel;
                    }
                    haVar.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(obj, haVar) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
                case 4:
                    if (shortNewsContentCardView instanceof i5) {
                        int i11 = write + 47;
                        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        i5Var = (i5) shortNewsContentCardView;
                        int i13 = i5Var.RemoteActionCompatParcelizer;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            i5Var.RemoteActionCompatParcelizer = i13 - Integer.MIN_VALUE;
                        } else {
                            i5Var = new i5(this, shortNewsContentCardView);
                        }
                    } else {
                        i5Var = new i5(this, shortNewsContentCardView);
                    }
                    Object obj8 = i5Var.read;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = i5Var.RemoteActionCompatParcelizer;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj8);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj8);
                    g6 g6Var = (g6) obj;
                    g6 g6VarIconCompatParcelizer = g6.IconCompatParcelizer(g6Var, CalculateSafeAreaUseCase.write + g6Var.read, 0, 11);
                    EdgeInsets edgeInsets = new EdgeInsets(g6VarIconCompatParcelizer.read, g6VarIconCompatParcelizer.IconCompatParcelizer, g6VarIconCompatParcelizer.write, g6VarIconCompatParcelizer.serializer);
                    i5Var.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(edgeInsets, i5Var) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
                case 5:
                    if (shortNewsContentCardView instanceof k9) {
                        k9Var = (k9) shortNewsContentCardView;
                        int i15 = k9Var.read;
                        if ((i15 & Integer.MIN_VALUE) != 0) {
                            k9Var.read = i15 - Integer.MIN_VALUE;
                        } else {
                            k9Var = new k9(this, shortNewsContentCardView);
                        }
                    } else {
                        k9Var = new k9(this, shortNewsContentCardView);
                    }
                    Object obj9 = k9Var.write;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = k9Var.read;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj9);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj9);
                    if (!(obj instanceof eh)) {
                        return createfromparcel;
                    }
                    int i17 = RemoteActionCompatParcelizer + 79;
                    write = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        k9Var.read = 0;
                        if (flowCollector.emit(obj, k9Var) != coroutineSingletons6) {
                            return createfromparcel;
                        }
                    } else {
                        k9Var.read = 1;
                        if (flowCollector.emit(obj, k9Var) != coroutineSingletons6) {
                            return createfromparcel;
                        }
                    }
                    return coroutineSingletons6;
                case 6:
                    if (shortNewsContentCardView instanceof kd) {
                        kdVar = (kd) shortNewsContentCardView;
                        int i18 = kdVar.RemoteActionCompatParcelizer;
                        if ((i18 & Integer.MIN_VALUE) != 0) {
                            kdVar.RemoteActionCompatParcelizer = i18 - Integer.MIN_VALUE;
                        } else {
                            kdVar = new kd(this, shortNewsContentCardView);
                        }
                    } else {
                        kdVar = new kd(this, shortNewsContentCardView);
                    }
                    Object obj10 = kdVar.write;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = kdVar.RemoteActionCompatParcelizer;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj10);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj10);
                    if (!(obj instanceof le)) {
                        return createfromparcel;
                    }
                    kdVar.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(obj, kdVar) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
                case 7:
                    if (shortNewsContentCardView instanceof ke) {
                        keVar = (ke) shortNewsContentCardView;
                        int i20 = keVar.read;
                        if ((i20 & Integer.MIN_VALUE) != 0) {
                            keVar.read = i20 - Integer.MIN_VALUE;
                        } else {
                            keVar = new ke(this, shortNewsContentCardView);
                        }
                    } else {
                        keVar = new ke(this, shortNewsContentCardView);
                    }
                    Object obj11 = keVar.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = keVar.read;
                    if (i21 != 0) {
                        if (i21 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj11);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj11);
                    if (!(obj instanceof le)) {
                        return createfromparcel;
                    }
                    keVar.read = 1;
                    return flowCollector.emit(obj, keVar) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
                case 8:
                    if (shortNewsContentCardView instanceof o0) {
                        o0Var = (o0) shortNewsContentCardView;
                        int i22 = o0Var.IconCompatParcelizer;
                        if ((i22 & Integer.MIN_VALUE) != 0) {
                            o0Var.IconCompatParcelizer = i22 - Integer.MIN_VALUE;
                        } else {
                            o0Var = new o0(this, shortNewsContentCardView);
                        }
                    } else {
                        o0Var = new o0(this, shortNewsContentCardView);
                    }
                    Object obj12 = o0Var.write;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = o0Var.IconCompatParcelizer;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj12);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj12);
                    igExternalSyntheticLambda7 igexternalsyntheticlambda7 = (igExternalSyntheticLambda7) obj;
                    if (igexternalsyntheticlambda7 != igExternalSyntheticLambda7.MAPBOX_INITIALIZED && igexternalsyntheticlambda7 != igExternalSyntheticLambda7.NONE) {
                        return createfromparcel;
                    }
                    o0Var.IconCompatParcelizer = 1;
                    return flowCollector.emit(obj, o0Var) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
                case 9:
                    if (shortNewsContentCardView instanceof p8) {
                        p8Var = (p8) shortNewsContentCardView;
                        int i24 = p8Var.read;
                        if ((i24 & Integer.MIN_VALUE) != 0) {
                            p8Var.read = i24 - Integer.MIN_VALUE;
                        } else {
                            p8Var = new p8(this, shortNewsContentCardView);
                        }
                    } else {
                        p8Var = new p8(this, shortNewsContentCardView);
                    }
                    Object obj13 = p8Var.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = p8Var.read;
                    if (i25 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj13);
                        if (((Number) obj).longValue() <= 0) {
                            return createfromparcel;
                        }
                        p8Var.read = 1;
                        return flowCollector.emit(obj, p8Var) == coroutineSingletons10 ? coroutineSingletons10 : createfromparcel;
                    }
                    int i26 = write + 35;
                    RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
                    if (i26 % 2 == 0 ? i25 != 1 : i25 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj13);
                    return createfromparcel;
                case 10:
                    if (shortNewsContentCardView instanceof SubcomposeContentPainterElement) {
                        int i27 = write + 29;
                        RemoteActionCompatParcelizer = i27 % Fields.SpotShadowColor;
                        int i28 = i27 % 2;
                        subcomposeContentPainterElement = (SubcomposeContentPainterElement) shortNewsContentCardView;
                        int i29 = subcomposeContentPainterElement.RemoteActionCompatParcelizer;
                        if ((i29 & Integer.MIN_VALUE) != 0) {
                            subcomposeContentPainterElement.RemoteActionCompatParcelizer = i29 - Integer.MIN_VALUE;
                        } else {
                            subcomposeContentPainterElement = new SubcomposeContentPainterElement(this, shortNewsContentCardView);
                        }
                    } else {
                        subcomposeContentPainterElement = new SubcomposeContentPainterElement(this, shortNewsContentCardView);
                    }
                    Object obj14 = subcomposeContentPainterElement.serializer;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = subcomposeContentPainterElement.RemoteActionCompatParcelizer;
                    if (i30 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj14);
                        z = ((requireParentFragment) obj) == requireParentFragment.WAITING_FOR_DELIVERIES;
                        subcomposeContentPainterElement.RemoteActionCompatParcelizer = 1;
                        return flowCollector.emit(Boolean.valueOf(z), subcomposeContentPainterElement) == coroutineSingletons11 ? coroutineSingletons11 : createfromparcel;
                    }
                    if (i30 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj14);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 11:
                    if (shortNewsContentCardView instanceof getPackageHandlerBackoffStrategy) {
                        getpackagehandlerbackoffstrategy = (getPackageHandlerBackoffStrategy) shortNewsContentCardView;
                        int i31 = getpackagehandlerbackoffstrategy.read;
                        if ((i31 & Integer.MIN_VALUE) != 0) {
                            getpackagehandlerbackoffstrategy.read = i31 - Integer.MIN_VALUE;
                        } else {
                            getpackagehandlerbackoffstrategy = new getPackageHandlerBackoffStrategy(this, shortNewsContentCardView);
                        }
                    } else {
                        getpackagehandlerbackoffstrategy = new getPackageHandlerBackoffStrategy(this, shortNewsContentCardView);
                    }
                    Object obj15 = getpackagehandlerbackoffstrategy.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = getpackagehandlerbackoffstrategy.read;
                    if (i32 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj15);
                        getpackagehandlerbackoffstrategy.read = 1;
                        return flowCollector.emit(Boolean.valueOf((((getConnectionOptions) obj) instanceof getInstallSessionBackoffStrategy) ^ true), getpackagehandlerbackoffstrategy) == coroutineSingletons12 ? coroutineSingletons12 : createfromparcel;
                    }
                    if (i32 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj15);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 12:
                    if (shortNewsContentCardView instanceof setLogger) {
                        setlogger = (setLogger) shortNewsContentCardView;
                        int i33 = setlogger.IconCompatParcelizer;
                        if ((i33 & Integer.MIN_VALUE) != 0) {
                            setlogger.IconCompatParcelizer = i33 - Integer.MIN_VALUE;
                        } else {
                            setlogger = new setLogger(this, shortNewsContentCardView);
                        }
                    } else {
                        setlogger = new setLogger(this, shortNewsContentCardView);
                    }
                    Object obj16 = setlogger.read;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = setlogger.IconCompatParcelizer;
                    if (i34 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj16);
                        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase instanceof AudioAttributesImplApi21Parcelizer) {
                            delegatingFrameMetricsListener = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase).serializer;
                        } else if (audioAttributesImplBase instanceof AudioAttributesImplApi21) {
                            delegatingFrameMetricsListener = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        obj2 = delegatingFrameMetricsListener instanceof onActivityResumed ? delegatingFrameMetricsListener : null;
                        setlogger.IconCompatParcelizer = 1;
                        return flowCollector.emit((onActivityResumed) obj2, setlogger) == coroutineSingletons13 ? coroutineSingletons13 : createfromparcel;
                    }
                    if (i34 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj16);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i35 = RemoteActionCompatParcelizer + 95;
                    write = i35 % Fields.SpotShadowColor;
                    int i36 = i35 % 2;
                    return null;
                case 13:
                    if (shortNewsContentCardView instanceof lambdatrackMeasurementConsent1) {
                        lambdatrackmeasurementconsent1 = (lambdatrackMeasurementConsent1) shortNewsContentCardView;
                        int i37 = lambdatrackmeasurementconsent1.IconCompatParcelizer;
                        if ((i37 & Integer.MIN_VALUE) != 0) {
                            lambdatrackmeasurementconsent1.IconCompatParcelizer = i37 - Integer.MIN_VALUE;
                        } else {
                            lambdatrackmeasurementconsent1 = new lambdatrackMeasurementConsent1(this, shortNewsContentCardView);
                        }
                    } else {
                        lambdatrackmeasurementconsent1 = new lambdatrackMeasurementConsent1(this, shortNewsContentCardView);
                    }
                    Object obj17 = lambdatrackmeasurementconsent1.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = lambdatrackmeasurementconsent1.IconCompatParcelizer;
                    if (i38 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj17);
                        AudioAttributesImplBase audioAttributesImplBase2 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase2 instanceof AudioAttributesImplApi21Parcelizer) {
                            delegatingFrameMetricsListener2 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase2).serializer;
                        } else if (audioAttributesImplBase2 instanceof AudioAttributesImplApi21) {
                            delegatingFrameMetricsListener2 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        obj2 = delegatingFrameMetricsListener2 instanceof downTo ? delegatingFrameMetricsListener2 : null;
                        lambdatrackmeasurementconsent1.IconCompatParcelizer = 1;
                        return flowCollector.emit((downTo) obj2, lambdatrackmeasurementconsent1) == coroutineSingletons14 ? coroutineSingletons14 : createfromparcel;
                    }
                    if (i38 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj17);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 14:
                    if (shortNewsContentCardView instanceof isInstanceEnabled) {
                        isinstanceenabled = (isInstanceEnabled) shortNewsContentCardView;
                        int i39 = isinstanceenabled.RemoteActionCompatParcelizer;
                        if ((i39 & Integer.MIN_VALUE) != 0) {
                            isinstanceenabled.RemoteActionCompatParcelizer = i39 - Integer.MIN_VALUE;
                        } else {
                            isinstanceenabled = new isInstanceEnabled(this, shortNewsContentCardView);
                        }
                    } else {
                        isinstanceenabled = new isInstanceEnabled(this, shortNewsContentCardView);
                    }
                    Object obj18 = isinstanceenabled.serializer;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i40 = isinstanceenabled.RemoteActionCompatParcelizer;
                    if (i40 != 0) {
                        if (i40 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj18);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj18);
                    downTo downto = (downTo) obj;
                    if (downto == null) {
                        r8lambdawewsq6zoo2b2985gwdloptnl6xs = checkActivityHandler.read;
                    } else {
                        downFrom downfrom = downto.data;
                        String str = downfrom.description;
                        String str2 = downfrom.style;
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -1867169789) {
                            if (iHashCode != 92899676) {
                                if (iHashCode == 1952151455 && str2.equals("critical")) {
                                    r8lambdahcmuiuvsrubxjckqzuukt4ud724 = r8lambdahCMuiUVsRubxJCkqZuukT4uD724.CRITICAL;
                                } else {
                                    r8lambdahcmuiuvsrubxjckqzuukt4ud724 = r8lambdahCMuiUVsRubxJCkqZuukT4uD724.NEUTRAL;
                                }
                            } else if (str2.equals("alert")) {
                                r8lambdahcmuiuvsrubxjckqzuukt4ud724 = r8lambdahCMuiUVsRubxJCkqZuukT4uD724.ALERT;
                            } else {
                                r8lambdahcmuiuvsrubxjckqzuukt4ud724 = r8lambdahCMuiUVsRubxJCkqZuukT4uD724.NEUTRAL;
                            }
                        } else if (str2.equals("success")) {
                            r8lambdahcmuiuvsrubxjckqzuukt4ud724 = r8lambdahCMuiUVsRubxJCkqZuukT4uD724.SUCCESS;
                        } else {
                            r8lambdahcmuiuvsrubxjckqzuukt4ud724 = r8lambdahCMuiUVsRubxJCkqZuukT4uD724.NEUTRAL;
                        }
                        r8lambdawewsq6zoo2b2985gwdloptnl6xs = new r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs(str, r8lambdahcmuiuvsrubxjckqzuukt4ud724);
                    }
                    isinstanceenabled.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(r8lambdawewsq6zoo2b2985gwdloptnl6xs, isinstanceenabled) == coroutineSingletons15 ? coroutineSingletons15 : createfromparcel;
                case 15:
                    if (shortNewsContentCardView instanceof getCachedDeeplink) {
                        int i41 = RemoteActionCompatParcelizer + 105;
                        write = i41 % Fields.SpotShadowColor;
                        if (i41 % 2 == 0) {
                            int i42 = ((getCachedDeeplink) shortNewsContentCardView).read;
                            obj2.hashCode();
                            throw null;
                        }
                        getcacheddeeplink = (getCachedDeeplink) shortNewsContentCardView;
                        int i43 = getcacheddeeplink.read;
                        if ((i43 & Integer.MIN_VALUE) != 0) {
                            getcacheddeeplink.read = i43 - Integer.MIN_VALUE;
                        } else {
                            getcacheddeeplink = new getCachedDeeplink(this, shortNewsContentCardView);
                        }
                    } else {
                        getcacheddeeplink = new getCachedDeeplink(this, shortNewsContentCardView);
                    }
                    Object obj19 = getcacheddeeplink.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i44 = getcacheddeeplink.read;
                    if (i44 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj19);
                        boolean zIsEmpty = ((timesmpE4wyQ) obj).MediaBrowserCompatMediaItem.isEmpty();
                        getcacheddeeplink.read = 1;
                        return flowCollector.emit(Boolean.valueOf(zIsEmpty), getcacheddeeplink) == coroutineSingletons16 ? coroutineSingletons16 : createfromparcel;
                    }
                    int i45 = write + 59;
                    RemoteActionCompatParcelizer = i45 % Fields.SpotShadowColor;
                    int i46 = i45 % 2;
                    if (i44 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj19);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 16:
                    if (shortNewsContentCardView instanceof urlMatchesSuffix) {
                        urlmatchessuffix = (urlMatchesSuffix) shortNewsContentCardView;
                        int i47 = urlmatchessuffix.serializer;
                        if ((i47 & Integer.MIN_VALUE) != 0) {
                            urlmatchessuffix.serializer = i47 - Integer.MIN_VALUE;
                        } else {
                            urlmatchessuffix = new urlMatchesSuffix(this, shortNewsContentCardView);
                        }
                    } else {
                        urlmatchessuffix = new urlMatchesSuffix(this, shortNewsContentCardView);
                    }
                    Object obj20 = urlmatchessuffix.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i48 = urlmatchessuffix.serializer;
                    if (i48 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj20);
                        z = ((requireParentFragment) obj) == requireParentFragment.WAITING_FOR_DELIVERIES;
                        urlmatchessuffix.serializer = 1;
                        return flowCollector.emit(Boolean.valueOf(z), urlmatchessuffix) == coroutineSingletons17 ? coroutineSingletons17 : createfromparcel;
                    }
                    if (i48 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj20);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 17:
                    if (shortNewsContentCardView instanceof getDeeplinkReferrer) {
                        getdeeplinkreferrer = (getDeeplinkReferrer) shortNewsContentCardView;
                        int i49 = getdeeplinkreferrer.serializer;
                        if ((i49 & Integer.MIN_VALUE) != 0) {
                            getdeeplinkreferrer.serializer = i49 - Integer.MIN_VALUE;
                        } else {
                            getdeeplinkreferrer = new getDeeplinkReferrer(this, shortNewsContentCardView);
                        }
                    } else {
                        getdeeplinkreferrer = new getDeeplinkReferrer(this, shortNewsContentCardView);
                    }
                    Object obj21 = getdeeplinkreferrer.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i50 = getdeeplinkreferrer.serializer;
                    if (i50 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj21);
                        AudioAttributesImplBase audioAttributesImplBase3 = (AudioAttributesImplBase) obj;
                        if (audioAttributesImplBase3 instanceof AudioAttributesImplApi21Parcelizer) {
                            delegatingFrameMetricsListener3 = ((AudioAttributesImplApi21Parcelizer) audioAttributesImplBase3).serializer;
                        } else if (audioAttributesImplBase3 instanceof AudioAttributesImplApi21) {
                            delegatingFrameMetricsListener3 = null;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        }
                        obj2 = delegatingFrameMetricsListener3 instanceof installSecondaryDexes ? delegatingFrameMetricsListener3 : null;
                        getdeeplinkreferrer.serializer = 1;
                        return flowCollector.emit((installSecondaryDexes) obj2, getdeeplinkreferrer) == coroutineSingletons18 ? coroutineSingletons18 : createfromparcel;
                    }
                    if (i50 == 1) {
                        int i51 = RemoteActionCompatParcelizer + 81;
                        write = i51 % Fields.SpotShadowColor;
                        int i52 = i51 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj21);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 18:
                    Object objEmit = flowCollector.emit((r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj, shortNewsContentCardView);
                    return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : createfromparcel;
                case 19:
                    if (shortNewsContentCardView instanceof r8lambdaKhgtrlFjSwmiGcCSe60piLUCY) {
                        r8lambdakhgtrlfjswmigccse60pilucy = (r8lambdaKhgtrlFjSwmiGcCSe60piLUCY) shortNewsContentCardView;
                        int i53 = r8lambdakhgtrlfjswmigccse60pilucy.IconCompatParcelizer;
                        if ((i53 & Integer.MIN_VALUE) != 0) {
                            r8lambdakhgtrlfjswmigccse60pilucy.IconCompatParcelizer = i53 - Integer.MIN_VALUE;
                        } else {
                            r8lambdakhgtrlfjswmigccse60pilucy = new r8lambdaKhgtrlFjSwmiGcCSe60piLUCY(this, shortNewsContentCardView);
                        }
                    } else {
                        r8lambdakhgtrlfjswmigccse60pilucy = new r8lambdaKhgtrlFjSwmiGcCSe60piLUCY(this, shortNewsContentCardView);
                    }
                    Object obj22 = r8lambdakhgtrlfjswmigccse60pilucy.serializer;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i54 = r8lambdakhgtrlfjswmigccse60pilucy.IconCompatParcelizer;
                    if (i54 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj22);
                        Set setKeySet = ((getNoActiveChildannotations) obj).read().keySet();
                        r8lambdakhgtrlfjswmigccse60pilucy.IconCompatParcelizer = 1;
                        return flowCollector.emit(setKeySet, r8lambdakhgtrlfjswmigccse60pilucy) == coroutineSingletons19 ? coroutineSingletons19 : createfromparcel;
                    }
                    if (i54 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj22);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 20:
                    if (shortNewsContentCardView instanceof r8lambdagKfRJUcMmakOQRpGHGUq3msRI) {
                        r8lambdagkfrjucmmakoqrpghguq3msri = (r8lambdagKfRJUcMmakOQRpGHGUq3msRI) shortNewsContentCardView;
                        int i55 = r8lambdagkfrjucmmakoqrpghguq3msri.RemoteActionCompatParcelizer;
                        if ((i55 & Integer.MIN_VALUE) != 0) {
                            int i56 = write + 61;
                            RemoteActionCompatParcelizer = i56 % Fields.SpotShadowColor;
                            int i57 = i56 % 2;
                            r8lambdagkfrjucmmakoqrpghguq3msri.RemoteActionCompatParcelizer = i55 - Integer.MIN_VALUE;
                        } else {
                            r8lambdagkfrjucmmakoqrpghguq3msri = new r8lambdagKfRJUcMmakOQRpGHGUq3msRI(this, shortNewsContentCardView);
                        }
                    } else {
                        r8lambdagkfrjucmmakoqrpghguq3msri = new r8lambdagKfRJUcMmakOQRpGHGUq3msRI(this, shortNewsContentCardView);
                    }
                    Object obj23 = r8lambdagkfrjucmmakoqrpghguq3msri.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i58 = r8lambdagkfrjucmmakoqrpghguq3msri.RemoteActionCompatParcelizer;
                    if (i58 != 0) {
                        if (i58 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj23);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj23);
                    r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r8lambdakqbp11wz4zjrp1b2dhszxunsbm = (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) obj;
                    obj2 = r8lambdakqbp11wz4zjrp1b2dhszxunsbm != null ? r8lambdakqbp11wz4zjrp1b2dhszxunsbm.photoId : null;
                    r8lambdagkfrjucmmakoqrpghguq3msri.RemoteActionCompatParcelizer = 1;
                    return flowCollector.emit(obj2, r8lambdagkfrjucmmakoqrpghguq3msri) == coroutineSingletons20 ? coroutineSingletons20 : createfromparcel;
                case 21:
                    if (shortNewsContentCardView instanceof r8lambdagvkeXY25A9xZdNNF8GqusXDol5M) {
                        r8lambdagvkexy25a9xzdnnf8gqusxdol5m = (r8lambdagvkeXY25A9xZdNNF8GqusXDol5M) shortNewsContentCardView;
                        int i59 = r8lambdagvkexy25a9xzdnnf8gqusxdol5m.serializer;
                        if ((i59 & Integer.MIN_VALUE) != 0) {
                            r8lambdagvkexy25a9xzdnnf8gqusxdol5m.serializer = i59 - Integer.MIN_VALUE;
                        } else {
                            r8lambdagvkexy25a9xzdnnf8gqusxdol5m = new r8lambdagvkeXY25A9xZdNNF8GqusXDol5M(this, shortNewsContentCardView);
                        }
                    } else {
                        r8lambdagvkexy25a9xzdnnf8gqusxdol5m = new r8lambdagvkeXY25A9xZdNNF8GqusXDol5M(this, shortNewsContentCardView);
                    }
                    Object obj24 = r8lambdagvkexy25a9xzdnnf8gqusxdol5m.write;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i60 = r8lambdagvkexy25a9xzdnnf8gqusxdol5m.serializer;
                    if (i60 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj24);
                        Set setKeySet2 = ((getNoActiveChildannotations) obj).read().keySet();
                        r8lambdagvkexy25a9xzdnnf8gqusxdol5m.serializer = 1;
                        return flowCollector.emit(setKeySet2, r8lambdagvkexy25a9xzdnnf8gqusxdol5m) == coroutineSingletons21 ? coroutineSingletons21 : createfromparcel;
                    }
                    if (i60 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj24);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                default:
                    if (shortNewsContentCardView instanceof r8lambdamP9aK9cy_4kwIReu_5gwzQUxLxo) {
                        int i61 = write + 31;
                        RemoteActionCompatParcelizer = i61 % Fields.SpotShadowColor;
                        int i62 = i61 % 2;
                        r8lambdamp9ak9cy_4kwireu_5gwzquxlxo = (r8lambdamP9aK9cy_4kwIReu_5gwzQUxLxo) shortNewsContentCardView;
                        int i63 = r8lambdamp9ak9cy_4kwireu_5gwzquxlxo.read;
                        if ((i63 & Integer.MIN_VALUE) != 0) {
                            r8lambdamp9ak9cy_4kwireu_5gwzquxlxo.read = i63 - Integer.MIN_VALUE;
                        } else {
                            r8lambdamp9ak9cy_4kwireu_5gwzquxlxo = new r8lambdamP9aK9cy_4kwIReu_5gwzQUxLxo(this, shortNewsContentCardView);
                        }
                    } else {
                        r8lambdamp9ak9cy_4kwireu_5gwzquxlxo = new r8lambdamP9aK9cy_4kwIReu_5gwzQUxLxo(this, shortNewsContentCardView);
                    }
                    Object obj25 = r8lambdamp9ak9cy_4kwireu_5gwzquxlxo.serializer;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i64 = r8lambdamp9ak9cy_4kwireu_5gwzquxlxo.read;
                    if (i64 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj25);
                        boolean zIsEmpty2 = ((Map) obj).isEmpty();
                        r8lambdamp9ak9cy_4kwireu_5gwzquxlxo.read = 1;
                        return flowCollector.emit(Boolean.valueOf(zIsEmpty2 ^ true), r8lambdamp9ak9cy_4kwireu_5gwzquxlxo) == coroutineSingletons22 ? coroutineSingletons22 : createfromparcel;
                    }
                    if (i64 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj25);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    public /* synthetic */ GetAppStateImpl$invoke$$inlined$map$1(Flow flow, int i) {
        this.IconCompatParcelizer = i;
        this.write = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = createFromParcel.INSTANCE;
        Flow flow = this.write;
        int i3 = 0;
        switch (i2) {
            case 0:
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, i3), shortNewsContentCardView);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : obj;
            case 1:
                Object objCollect2 = flow.collect(new AnonymousClass2(flowCollector, 3), shortNewsContentCardView);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : obj;
            case 2:
                Object objCollect3 = ((ChannelFlow) flow).collect(new AnonymousClass2(flowCollector, 6), shortNewsContentCardView);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : obj;
            case 3:
                Object objCollect4 = ((ChannelFlow) flow).collect(new AnonymousClass2(flowCollector, 7), shortNewsContentCardView);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : obj;
            case 4:
                Object objCollect5 = flow.collect(new AnonymousClass2(flowCollector, 8), shortNewsContentCardView);
                if (objCollect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i4 = read + 93;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objCollect5;
            case 5:
                Object objCollect6 = flow.collect(new AnonymousClass2(flowCollector, 9), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : obj;
            case 6:
                Object objCollect7 = flow.collect(new AnonymousClass2(flowCollector, 10), shortNewsContentCardView);
                if (objCollect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i6 = read + 85;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 94 / 0;
                }
                return objCollect7;
            case 7:
                Object objCollect8 = flow.collect(new AnonymousClass2(flowCollector, 11), shortNewsContentCardView);
                if (objCollect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return obj;
                }
                int i8 = RemoteActionCompatParcelizer + 63;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return objCollect8;
            case 8:
                Object objCollect9 = flow.collect(new AnonymousClass2(flowCollector, 19), shortNewsContentCardView);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : obj;
            case 9:
                Object objCollect10 = flow.collect(new AnonymousClass2(flowCollector, 20), shortNewsContentCardView);
                if (objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = objCollect10;
                }
                int i10 = read + 29;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return obj;
                }
                throw null;
            case 10:
                Object objCollect11 = flow.collect(new AnonymousClass2(flowCollector, 21), shortNewsContentCardView);
                if (objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = objCollect11;
                }
                int i11 = read + 63;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return obj;
            default:
                Object objCollect12 = flow.collect(new AnonymousClass2(flowCollector, 22), shortNewsContentCardView);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : obj;
        }
    }
}
