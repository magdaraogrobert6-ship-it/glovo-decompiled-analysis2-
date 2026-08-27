package com.roadrunner.realtime.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.realtime.data.SocketIoGuard;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getContentViewGroupParentLayout;
import o.lambdaremoveGlobalPartnerParameter26;
import o.lambdaremoveGlobalPartnerParameters31;
import o.lambdatrackThirdPartySharing37;
import o.lambdaverifyAndTrackPlayStorePurchase46;
import o.lambdaverifyAndTrackPlayStorePurchase47;
import o.lambdaverifyPlayStorePurchase44;
import o.launchEventResponseTasksI;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RealtimeConnectionManagerImpl$observeMessages$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ launchEventResponseTasksI serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealtimeConnectionManagerImpl$observeMessages$1(launchEventResponseTasksI launcheventresponsetasksi, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = launcheventresponsetasksi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 37;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.read;
        launchEventResponseTasksI launcheventresponsetasksi = this.serializer;
        if (i4 == 0) {
            return new RealtimeConnectionManagerImpl$observeMessages$1(launcheventresponsetasksi, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 == 1) {
            return new RealtimeConnectionManagerImpl$observeMessages$1(launcheventresponsetasksi, shortNewsContentCardView, i5);
        }
        if (i4 != 2) {
            return new RealtimeConnectionManagerImpl$observeMessages$1(launcheventresponsetasksi, shortNewsContentCardView, 3);
        }
        RealtimeConnectionManagerImpl$observeMessages$1 realtimeConnectionManagerImpl$observeMessages$1 = new RealtimeConnectionManagerImpl$observeMessages$1(launcheventresponsetasksi, shortNewsContentCardView, i);
        int i6 = write + 117;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return realtimeConnectionManagerImpl$observeMessages$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 111;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((RealtimeConnectionManagerImpl$observeMessages$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((RealtimeConnectionManagerImpl$observeMessages$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 2) {
            return ((RealtimeConnectionManagerImpl$observeMessages$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RealtimeConnectionManagerImpl$observeMessages$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 97;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 73;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i4 = this.read;
        Object obj2 = createFromParcel.INSTANCE;
        final launchEventResponseTasksI launcheventresponsetasksi = this.serializer;
        final int i5 = 0;
        final int i6 = 1;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.IconCompatParcelizer;
            if (i7 != 0) {
                int i8 = RemoteActionCompatParcelizer;
                int i9 = i8 + 27;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i7 == 1) {
                    int i11 = i8 + 45;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = launcheventresponsetasksi.RatingCompat.MediaSessionCompatQueueItem;
                lambdatrackThirdPartySharing37 lambdatrackthirdpartysharing37 = launcheventresponsetasksi.RemoteActionCompatParcelizer;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.roadrunner.realtime.domain.RealtimeConnectionManagerImpl$observeMessages$1.2
                    private static int IconCompatParcelizer = 1;
                    private static int write;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj3, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i13 = 2 % 2;
                        int i14 = IconCompatParcelizer + 97;
                        write = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        int i16 = i5;
                        Object obj4 = createFromParcel.INSTANCE;
                        launchEventResponseTasksI launcheventresponsetasksi2 = launcheventresponsetasksi;
                        Object obj5 = null;
                        if (i16 == 0) {
                            lambdaremoveGlobalPartnerParameters31 lambdaremoveglobalpartnerparameters31 = (lambdaremoveGlobalPartnerParameters31) obj3;
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            Objects.toString(lambdaremoveglobalpartnerparameters31);
                            forest.getClass();
                            Object objEmit = launcheventresponsetasksi2.read.emit(lambdaremoveglobalpartnerparameters31, shortNewsContentCardView2);
                            if (objEmit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                int i17 = IconCompatParcelizer + 53;
                                write = i17 % Fields.SpotShadowColor;
                                if (i17 % 2 != 0) {
                                    throw null;
                                }
                                obj4 = objEmit;
                            }
                            int i18 = IconCompatParcelizer + 119;
                            write = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            return obj4;
                        }
                        boolean z = true;
                        if (i16 != 1) {
                            lambdaverifyAndTrackPlayStorePurchase47 lambdaverifyandtrackplaystorepurchase47 = (lambdaverifyAndTrackPlayStorePurchase47) obj3;
                            SocketIoGuard socketIoGuard = launcheventresponsetasksi2.RatingCompat;
                            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                            displayInAppMessagelambda1.serializer(lambdaverifyandtrackplaystorepurchase47.getClass()).IconCompatParcelizer();
                            forest2.getClass();
                            if (lambdaverifyandtrackplaystorepurchase47 instanceof lambdaverifyPlayStorePurchase44) {
                                socketIoGuard.IconCompatParcelizer(((lambdaverifyPlayStorePurchase44) lambdaverifyandtrackplaystorepurchase47).serializer, true);
                                return obj4;
                            }
                            if (lambdaverifyandtrackplaystorepurchase47.equals(lambdaverifyAndTrackPlayStorePurchase46.write)) {
                                socketIoGuard.IconCompatParcelizer();
                                return obj4;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter26 = (lambdaremoveGlobalPartnerParameter26) obj3;
                        MutableStateFlow mutableStateFlow = launcheventresponsetasksi2.IconCompatParcelizer;
                        Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                        lambdaremoveglobalpartnerparameter26.name();
                        forest3.getClass();
                        if (lambdaremoveglobalpartnerparameter26 != lambdaremoveGlobalPartnerParameter26.CONNECTED) {
                            int i20 = IconCompatParcelizer + 23;
                            write = i20 % Fields.SpotShadowColor;
                            if (i20 % 2 != 0) {
                                int i21 = 5 / 5;
                            }
                            z = false;
                        }
                        if (((Boolean) mutableStateFlow.read()).booleanValue() != z) {
                            mutableStateFlow.IconCompatParcelizer(Boolean.valueOf(z));
                        }
                        int i22 = IconCompatParcelizer + 103;
                        write = i22 % Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            return obj4;
                        }
                        obj5.hashCode();
                        throw null;
                    }
                };
                this.IconCompatParcelizer = 1;
                NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1 = new NestViewModel$updateConfiguration$1$1$1$1(flowCollector, 20, lambdatrackthirdpartysharing37);
                sharedFlowImpl.getClass();
                Object objCollect$suspendImpl = SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, nestViewModel$updateConfiguration$1$1$1$1, this);
                if (objCollect$suspendImpl != coroutineSingletons) {
                    int i13 = write + 35;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    objCollect$suspendImpl = obj2;
                }
                if (objCollect$suspendImpl == coroutineSingletons) {
                    int i15 = write + 65;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        int i16 = 76 / 0;
                    }
                    obj2 = coroutineSingletons;
                }
            }
            int i17 = write + 55;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                return obj2;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i18 = this.IconCompatParcelizer;
            if (i18 != 0) {
                int i19 = write + 13;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0 ? i18 != 1 : i18 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SocketIoGuard socketIoGuard = launcheventresponsetasksi.RatingCompat;
                this.IconCompatParcelizer = 1;
                Object objCoroutineScope = YieldKt.coroutineScope(new PhotoIdUiModelImpl$1$1(socketIoGuard, shortNewsContentCardView, 10), this);
                if (objCoroutineScope != coroutineSingletons2) {
                    objCoroutineScope = obj2;
                }
                if (objCoroutineScope == coroutineSingletons2) {
                    int i20 = write + 103;
                    RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        int i21 = 31 / 0;
                    }
                    return coroutineSingletons2;
                }
            }
            return obj2;
        }
        if (i4 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i22 = this.IconCompatParcelizer;
            if (i22 != 0) {
                int i23 = write + 11;
                RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0 ? i22 != 1 : i22 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flow = launcheventresponsetasksi.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.roadrunner.realtime.domain.RealtimeConnectionManagerImpl$observeMessages$1.2
                    private static int IconCompatParcelizer = 1;
                    private static int write;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj3, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i110 = 2 % 2;
                        int i111 = IconCompatParcelizer + 97;
                        write = i111 % Fields.SpotShadowColor;
                        int i112 = i111 % 2;
                        int i113 = i;
                        Object obj4 = createFromParcel.INSTANCE;
                        launchEventResponseTasksI launcheventresponsetasksi2 = launcheventresponsetasksi;
                        Object obj5 = null;
                        if (i113 == 0) {
                            lambdaremoveGlobalPartnerParameters31 lambdaremoveglobalpartnerparameters31 = (lambdaremoveGlobalPartnerParameters31) obj3;
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            Objects.toString(lambdaremoveglobalpartnerparameters31);
                            forest.getClass();
                            Object objEmit = launcheventresponsetasksi2.read.emit(lambdaremoveglobalpartnerparameters31, shortNewsContentCardView2);
                            if (objEmit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                int i114 = IconCompatParcelizer + 53;
                                write = i114 % Fields.SpotShadowColor;
                                if (i114 % 2 != 0) {
                                    throw null;
                                }
                                obj4 = objEmit;
                            }
                            int i115 = IconCompatParcelizer + 119;
                            write = i115 % Fields.SpotShadowColor;
                            int i116 = i115 % 2;
                            return obj4;
                        }
                        boolean z = true;
                        if (i113 != 1) {
                            lambdaverifyAndTrackPlayStorePurchase47 lambdaverifyandtrackplaystorepurchase47 = (lambdaverifyAndTrackPlayStorePurchase47) obj3;
                            SocketIoGuard socketIoGuard2 = launcheventresponsetasksi2.RatingCompat;
                            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                            displayInAppMessagelambda1.serializer(lambdaverifyandtrackplaystorepurchase47.getClass()).IconCompatParcelizer();
                            forest2.getClass();
                            if (lambdaverifyandtrackplaystorepurchase47 instanceof lambdaverifyPlayStorePurchase44) {
                                socketIoGuard2.IconCompatParcelizer(((lambdaverifyPlayStorePurchase44) lambdaverifyandtrackplaystorepurchase47).serializer, true);
                                return obj4;
                            }
                            if (lambdaverifyandtrackplaystorepurchase47.equals(lambdaverifyAndTrackPlayStorePurchase46.write)) {
                                socketIoGuard2.IconCompatParcelizer();
                                return obj4;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter26 = (lambdaremoveGlobalPartnerParameter26) obj3;
                        MutableStateFlow mutableStateFlow = launcheventresponsetasksi2.IconCompatParcelizer;
                        Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                        lambdaremoveglobalpartnerparameter26.name();
                        forest3.getClass();
                        if (lambdaremoveglobalpartnerparameter26 != lambdaremoveGlobalPartnerParameter26.CONNECTED) {
                            int i24 = IconCompatParcelizer + 23;
                            write = i24 % Fields.SpotShadowColor;
                            if (i24 % 2 != 0) {
                                int i25 = 5 / 5;
                            }
                            z = false;
                        }
                        if (((Boolean) mutableStateFlow.read()).booleanValue() != z) {
                            mutableStateFlow.IconCompatParcelizer(Boolean.valueOf(z));
                        }
                        int i26 = IconCompatParcelizer + 103;
                        write = i26 % Fields.SpotShadowColor;
                        if (i26 % 2 == 0) {
                            return obj4;
                        }
                        obj5.hashCode();
                        throw null;
                    }
                };
                this.IconCompatParcelizer = 1;
                if (((AbstractFlow) flow).collect(flowCollector2, this) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            }
            return obj2;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i24 = this.IconCompatParcelizer;
        if (i24 != 0) {
            int i25 = write + 73;
            RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            if (i24 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow = launcheventresponsetasksi.RatingCompat.RatingCompat;
            FlowCollector flowCollector3 = new FlowCollector() { // from class: com.roadrunner.realtime.domain.RealtimeConnectionManagerImpl$observeMessages$1.2
                private static int IconCompatParcelizer = 1;
                private static int write;

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj3, ShortNewsContentCardView shortNewsContentCardView2) {
                    int i110 = 2 % 2;
                    int i111 = IconCompatParcelizer + 97;
                    write = i111 % Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    int i113 = i6;
                    Object obj4 = createFromParcel.INSTANCE;
                    launchEventResponseTasksI launcheventresponsetasksi2 = launcheventresponsetasksi;
                    Object obj5 = null;
                    if (i113 == 0) {
                        lambdaremoveGlobalPartnerParameters31 lambdaremoveglobalpartnerparameters31 = (lambdaremoveGlobalPartnerParameters31) obj3;
                        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                        Objects.toString(lambdaremoveglobalpartnerparameters31);
                        forest.getClass();
                        Object objEmit = launcheventresponsetasksi2.read.emit(lambdaremoveglobalpartnerparameters31, shortNewsContentCardView2);
                        if (objEmit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            int i114 = IconCompatParcelizer + 53;
                            write = i114 % Fields.SpotShadowColor;
                            if (i114 % 2 != 0) {
                                throw null;
                            }
                            obj4 = objEmit;
                        }
                        int i115 = IconCompatParcelizer + 119;
                        write = i115 % Fields.SpotShadowColor;
                        int i116 = i115 % 2;
                        return obj4;
                    }
                    boolean z = true;
                    if (i113 != 1) {
                        lambdaverifyAndTrackPlayStorePurchase47 lambdaverifyandtrackplaystorepurchase47 = (lambdaverifyAndTrackPlayStorePurchase47) obj3;
                        SocketIoGuard socketIoGuard2 = launcheventresponsetasksi2.RatingCompat;
                        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                        displayInAppMessagelambda1.serializer(lambdaverifyandtrackplaystorepurchase47.getClass()).IconCompatParcelizer();
                        forest2.getClass();
                        if (lambdaverifyandtrackplaystorepurchase47 instanceof lambdaverifyPlayStorePurchase44) {
                            socketIoGuard2.IconCompatParcelizer(((lambdaverifyPlayStorePurchase44) lambdaverifyandtrackplaystorepurchase47).serializer, true);
                            return obj4;
                        }
                        if (lambdaverifyandtrackplaystorepurchase47.equals(lambdaverifyAndTrackPlayStorePurchase46.write)) {
                            socketIoGuard2.IconCompatParcelizer();
                            return obj4;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    lambdaremoveGlobalPartnerParameter26 lambdaremoveglobalpartnerparameter26 = (lambdaremoveGlobalPartnerParameter26) obj3;
                    MutableStateFlow mutableStateFlow = launcheventresponsetasksi2.IconCompatParcelizer;
                    Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                    lambdaremoveglobalpartnerparameter26.name();
                    forest3.getClass();
                    if (lambdaremoveglobalpartnerparameter26 != lambdaremoveGlobalPartnerParameter26.CONNECTED) {
                        int i27 = IconCompatParcelizer + 23;
                        write = i27 % Fields.SpotShadowColor;
                        if (i27 % 2 != 0) {
                            int i28 = 5 / 5;
                        }
                        z = false;
                    }
                    if (((Boolean) mutableStateFlow.read()).booleanValue() != z) {
                        mutableStateFlow.IconCompatParcelizer(Boolean.valueOf(z));
                    }
                    int i29 = IconCompatParcelizer + 103;
                    write = i29 % Fields.SpotShadowColor;
                    if (i29 % 2 == 0) {
                        return obj4;
                    }
                    obj5.hashCode();
                    throw null;
                }
            };
            this.IconCompatParcelizer = 1;
            if (stateFlow.collect(flowCollector3, this) == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        }
        DrawableTransformation.read();
        return null;
    }
}
