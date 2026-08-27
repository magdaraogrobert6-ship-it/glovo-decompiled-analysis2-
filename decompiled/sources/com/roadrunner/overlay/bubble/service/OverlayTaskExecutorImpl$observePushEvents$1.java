package com.roadrunner.overlay.bubble.service;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.CallsKtawait22;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.getContentViewGroupParentLayout;
import o.getReadEnabled;
import o.inCompatibilityMode;
import o.onFailure;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdattOPrCwQAZdC10c20qDtJUliAwE;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayTaskExecutorImpl$observePushEvents$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ onFailure serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverlayTaskExecutorImpl$observePushEvents$1(onFailure onfailure, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = onfailure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 63;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        onFailure onfailure = this.serializer;
        if (i3 != 0) {
            OverlayTaskExecutorImpl$observePushEvents$1 overlayTaskExecutorImpl$observePushEvents$1 = new OverlayTaskExecutorImpl$observePushEvents$1(onfailure, shortNewsContentCardView, 1);
            overlayTaskExecutorImpl$observePushEvents$1.read = obj;
            return overlayTaskExecutorImpl$observePushEvents$1;
        }
        OverlayTaskExecutorImpl$observePushEvents$1 overlayTaskExecutorImpl$observePushEvents$2 = new OverlayTaskExecutorImpl$observePushEvents$1(onfailure, shortNewsContentCardView, 0);
        overlayTaskExecutorImpl$observePushEvents$2.read = obj;
        int i4 = write + 9;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return overlayTaskExecutorImpl$observePushEvents$2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((OverlayTaskExecutorImpl$observePushEvents$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((OverlayTaskExecutorImpl$observePushEvents$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RatingCompat + 69;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        final onFailure onfailure = this.serializer;
        final int i3 = 0;
        final int i4 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 != 0) {
                int i6 = RatingCompat + 23;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                final SharedFlowImpl sharedFlowImpl = onfailure.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write;
                Flow flow = new Flow() { // from class: com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1
                    private static int IconCompatParcelizer = 0;
                    private static int MediaMetadataCompat = 1;

                    /* JADX INFO: renamed from: com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2 implements FlowCollector {
                        private static int MediaMetadataCompat = 1;
                        private static int write;
                        public final /* synthetic */ onFailure IconCompatParcelizer;
                        public final /* synthetic */ getContentViewGroupParentLayout RemoteActionCompatParcelizer;
                        public final /* synthetic */ int read;
                        public final /* synthetic */ FlowCollector serializer;

                        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, getContentViewGroupParentLayout getcontentviewgroupparentlayout, onFailure onfailure, int i) {
                            this.read = i;
                            this.serializer = flowCollector;
                            this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
                            this.IconCompatParcelizer = onfailure;
                        }

                        /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                        /* JADX WARN: Code duplicated, block: B:45:0x00da  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                            getReadEnabled getreadenabled;
                            String str;
                            CallsKtawait22 callsKtawait22;
                            int i;
                            int i2 = 2 % 2;
                            int i3 = this.read;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            onFailure onfailure = this.IconCompatParcelizer;
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.RemoteActionCompatParcelizer;
                            FlowCollector flowCollector = this.serializer;
                            Object obj2 = null;
                            if (i3 != 0) {
                                if (shortNewsContentCardView instanceof CallsKtawait22) {
                                    callsKtawait22 = (CallsKtawait22) shortNewsContentCardView;
                                    int i4 = callsKtawait22.read;
                                    if ((i4 & Integer.MIN_VALUE) != 0) {
                                        callsKtawait22.read = i4 - Integer.MIN_VALUE;
                                        i = MediaMetadataCompat + 17;
                                        write = i % Fields.SpotShadowColor;
                                    } else {
                                        callsKtawait22 = new CallsKtawait22(this, shortNewsContentCardView);
                                        i = write + 1;
                                        MediaMetadataCompat = i % Fields.SpotShadowColor;
                                    }
                                } else {
                                    callsKtawait22 = new CallsKtawait22(this, shortNewsContentCardView);
                                    i = write + 1;
                                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                                }
                                int i5 = i % 2;
                                Object obj3 = callsKtawait22.serializer;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i6 = callsKtawait22.read;
                                if (i6 != 0) {
                                    int i7 = MediaMetadataCompat + 67;
                                    write = i7 % Fields.SpotShadowColor;
                                    if (i7 % 2 == 0 ? i6 != 1 : i6 != 0) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    ExtrasKt.RemoteActionCompatParcelizer(obj3);
                                    return createfromparcel;
                                }
                                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                                ((Boolean) obj).getClass();
                                if (!YieldKt.write(getcontentviewgroupparentlayout)) {
                                    return createfromparcel;
                                }
                                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) onfailure.MediaMetadataCompat.write;
                                String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                                if (strSerializer == null) {
                                    int i8 = write + 75;
                                    MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                                    int i9 = i8 % 2;
                                    return createfromparcel;
                                }
                                if (!m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_NOTIFICATION_OVERLAY_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                                    return createfromparcel;
                                }
                                int i10 = write + 95;
                                MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                if (!onfailure.PlaybackStateCompatCustomAction.read()) {
                                    return createfromparcel;
                                }
                                callsKtawait22.read = 1;
                                return flowCollector.emit(obj, callsKtawait22) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                            }
                            if (shortNewsContentCardView instanceof getReadEnabled) {
                                int i12 = MediaMetadataCompat + 31;
                                write = i12 % Fields.SpotShadowColor;
                                if (i12 % 2 != 0) {
                                    int i13 = ((getReadEnabled) shortNewsContentCardView).read;
                                    throw null;
                                }
                                getreadenabled = (getReadEnabled) shortNewsContentCardView;
                                int i14 = getreadenabled.read;
                                if ((i14 & Integer.MIN_VALUE) != 0) {
                                    int i15 = write + 63;
                                    MediaMetadataCompat = i15 % Fields.SpotShadowColor;
                                    if (i15 % 2 == 0) {
                                        getreadenabled.read = i14 << Integer.MIN_VALUE;
                                    } else {
                                        getreadenabled.read = i14 - Integer.MIN_VALUE;
                                    }
                                } else {
                                    getreadenabled = new getReadEnabled(this, shortNewsContentCardView);
                                }
                            } else {
                                getreadenabled = new getReadEnabled(this, shortNewsContentCardView);
                            }
                            Object obj4 = getreadenabled.RemoteActionCompatParcelizer;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i16 = getreadenabled.read;
                            if (i16 != 0) {
                                if (i16 == 1) {
                                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                    return createfromparcel;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ExtrasKt.RemoteActionCompatParcelizer(obj4);
                            r8lambdattOPrCwQAZdC10c20qDtJUliAwE r8lambdattoprcwqazdc10c20qdtjuliawe = (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj;
                            if (!YieldKt.write(getcontentviewgroupparentlayout)) {
                                return createfromparcel;
                            }
                            if (!r8lambdattoprcwqazdc10c20qdtjuliawe.serializer && ((str = r8lambdattoprcwqazdc10c20qdtjuliawe.IconCompatParcelizer) == null || !disableThirdPartySharingForCoppaEnabledI.serializer(str))) {
                                return createfromparcel;
                            }
                            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) onfailure.MediaMetadataCompat.write;
                            String strSerializer2 = firebaseRemoteConfigImpl2.RemoteActionCompatParcelizer.serializer();
                            if (strSerializer2 == null) {
                                return createfromparcel;
                            }
                            if (!m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_NOTIFICATION_OVERLAY_ENABLED, firebaseRemoteConfigImpl2.IconCompatParcelizer, strSerializer2, firebaseRemoteConfigImpl2) || !onfailure.PlaybackStateCompatCustomAction.read()) {
                                return createfromparcel;
                            }
                            int i17 = MediaMetadataCompat + 67;
                            write = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            getreadenabled.read = 1;
                            if (flowCollector.emit(obj, getreadenabled) != coroutineSingletons2) {
                                return createfromparcel;
                            }
                            int i19 = MediaMetadataCompat + 3;
                            write = i19 % Fields.SpotShadowColor;
                            if (i19 % 2 == 0) {
                                return coroutineSingletons2;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i8 = 2 % 2;
                        int i9 = IconCompatParcelizer + 47;
                        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        int i11 = i3;
                        Object obj3 = createFromParcel.INSTANCE;
                        onFailure onfailure2 = onfailure;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        Flow flow2 = sharedFlowImpl;
                        if (i11 != 0) {
                            Object objCollect = flow2.collect(new AnonymousClass2(flowCollector, getcontentviewgroupparentlayout2, onfailure2, 1), shortNewsContentCardView2);
                            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj3 = objCollect;
                            }
                            int i12 = IconCompatParcelizer + 25;
                            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            return obj3;
                        }
                        Object objCollect2 = flow2.collect(new AnonymousClass2(flowCollector, getcontentviewgroupparentlayout2, onfailure2, 0), shortNewsContentCardView2);
                        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            int i14 = IconCompatParcelizer + 89;
                            MediaMetadataCompat = i14 % Fields.SpotShadowColor;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            obj3 = objCollect2;
                        }
                        int i15 = MediaMetadataCompat + 27;
                        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        return obj3;
                    }
                };
                PhotoIdUiModelImpl$1$1 photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1(onfailure, shortNewsContentCardView, 9);
                this.read = null;
                this.IconCompatParcelizer = 1;
                if (FlowKt.collectLatest(flow, photoIdUiModelImpl$1$1, this) == coroutineSingletons) {
                    obj2 = coroutineSingletons;
                }
            }
            int i8 = RatingCompat + 75;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return obj2;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        final getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.IconCompatParcelizer;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            final StateFlow stateFlow = onfailure.read.write;
            Flow flow2 = new Flow() { // from class: com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1
                private static int IconCompatParcelizer = 0;
                private static int MediaMetadataCompat = 1;

                /* JADX INFO: renamed from: com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public final class AnonymousClass2 implements FlowCollector {
                    private static int MediaMetadataCompat = 1;
                    private static int write;
                    public final /* synthetic */ onFailure IconCompatParcelizer;
                    public final /* synthetic */ getContentViewGroupParentLayout RemoteActionCompatParcelizer;
                    public final /* synthetic */ int read;
                    public final /* synthetic */ FlowCollector serializer;

                    public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, getContentViewGroupParentLayout getcontentviewgroupparentlayout, onFailure onfailure, int i) {
                        this.read = i;
                        this.serializer = flowCollector;
                        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
                        this.IconCompatParcelizer = onfailure;
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
                    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                        getReadEnabled getreadenabled;
                        String str;
                        CallsKtawait22 callsKtawait22;
                        int i;
                        int i2 = 2 % 2;
                        int i3 = this.read;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        onFailure onfailure = this.IconCompatParcelizer;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.RemoteActionCompatParcelizer;
                        FlowCollector flowCollector = this.serializer;
                        Object obj2 = null;
                        if (i3 != 0) {
                            if (shortNewsContentCardView instanceof CallsKtawait22) {
                                callsKtawait22 = (CallsKtawait22) shortNewsContentCardView;
                                int i4 = callsKtawait22.read;
                                if ((i4 & Integer.MIN_VALUE) != 0) {
                                    callsKtawait22.read = i4 - Integer.MIN_VALUE;
                                    i = MediaMetadataCompat + 17;
                                    write = i % Fields.SpotShadowColor;
                                } else {
                                    callsKtawait22 = new CallsKtawait22(this, shortNewsContentCardView);
                                    i = write + 1;
                                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                                }
                            } else {
                                callsKtawait22 = new CallsKtawait22(this, shortNewsContentCardView);
                                i = write + 1;
                                MediaMetadataCompat = i % Fields.SpotShadowColor;
                            }
                            int i5 = i % 2;
                            Object obj3 = callsKtawait22.serializer;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i6 = callsKtawait22.read;
                            if (i6 != 0) {
                                int i7 = MediaMetadataCompat + 67;
                                write = i7 % Fields.SpotShadowColor;
                                if (i7 % 2 == 0 ? i6 != 1 : i6 != 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                                return createfromparcel;
                            }
                            ExtrasKt.RemoteActionCompatParcelizer(obj3);
                            ((Boolean) obj).getClass();
                            if (!YieldKt.write(getcontentviewgroupparentlayout)) {
                                return createfromparcel;
                            }
                            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) onfailure.MediaMetadataCompat.write;
                            String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                            if (strSerializer == null) {
                                int i8 = write + 75;
                                MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                                int i9 = i8 % 2;
                                return createfromparcel;
                            }
                            if (!m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_NOTIFICATION_OVERLAY_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                                return createfromparcel;
                            }
                            int i10 = write + 95;
                            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            if (!onfailure.PlaybackStateCompatCustomAction.read()) {
                                return createfromparcel;
                            }
                            callsKtawait22.read = 1;
                            return flowCollector.emit(obj, callsKtawait22) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                        }
                        if (shortNewsContentCardView instanceof getReadEnabled) {
                            int i12 = MediaMetadataCompat + 31;
                            write = i12 % Fields.SpotShadowColor;
                            if (i12 % 2 != 0) {
                                int i13 = ((getReadEnabled) shortNewsContentCardView).read;
                                throw null;
                            }
                            getreadenabled = (getReadEnabled) shortNewsContentCardView;
                            int i14 = getreadenabled.read;
                            if ((i14 & Integer.MIN_VALUE) != 0) {
                                int i15 = write + 63;
                                MediaMetadataCompat = i15 % Fields.SpotShadowColor;
                                if (i15 % 2 == 0) {
                                    getreadenabled.read = i14 << Integer.MIN_VALUE;
                                } else {
                                    getreadenabled.read = i14 - Integer.MIN_VALUE;
                                }
                            } else {
                                getreadenabled = new getReadEnabled(this, shortNewsContentCardView);
                            }
                        } else {
                            getreadenabled = new getReadEnabled(this, shortNewsContentCardView);
                        }
                        Object obj4 = getreadenabled.RemoteActionCompatParcelizer;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i16 = getreadenabled.read;
                        if (i16 != 0) {
                            if (i16 == 1) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                return createfromparcel;
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                        r8lambdattOPrCwQAZdC10c20qDtJUliAwE r8lambdattoprcwqazdc10c20qdtjuliawe = (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj;
                        if (!YieldKt.write(getcontentviewgroupparentlayout)) {
                            return createfromparcel;
                        }
                        if (!r8lambdattoprcwqazdc10c20qdtjuliawe.serializer && ((str = r8lambdattoprcwqazdc10c20qdtjuliawe.IconCompatParcelizer) == null || !disableThirdPartySharingForCoppaEnabledI.serializer(str))) {
                            return createfromparcel;
                        }
                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) onfailure.MediaMetadataCompat.write;
                        String strSerializer2 = firebaseRemoteConfigImpl2.RemoteActionCompatParcelizer.serializer();
                        if (strSerializer2 == null) {
                            return createfromparcel;
                        }
                        if (!m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_NOTIFICATION_OVERLAY_ENABLED, firebaseRemoteConfigImpl2.IconCompatParcelizer, strSerializer2, firebaseRemoteConfigImpl2) || !onfailure.PlaybackStateCompatCustomAction.read()) {
                            return createfromparcel;
                        }
                        int i17 = MediaMetadataCompat + 67;
                        write = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        getreadenabled.read = 1;
                        if (flowCollector.emit(obj, getreadenabled) != coroutineSingletons2) {
                            return createfromparcel;
                        }
                        int i19 = MediaMetadataCompat + 3;
                        write = i19 % Fields.SpotShadowColor;
                        if (i19 % 2 == 0) {
                            return coroutineSingletons2;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView2) {
                    int i10 = 2 % 2;
                    int i11 = IconCompatParcelizer + 47;
                    MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    int i13 = i4;
                    Object obj3 = createFromParcel.INSTANCE;
                    onFailure onfailure2 = onfailure;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                    Flow flow3 = stateFlow;
                    if (i13 != 0) {
                        Object objCollect = flow3.collect(new AnonymousClass2(flowCollector, getcontentviewgroupparentlayout3, onfailure2, 1), shortNewsContentCardView2);
                        if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj3 = objCollect;
                        }
                        int i14 = IconCompatParcelizer + 25;
                        MediaMetadataCompat = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        return obj3;
                    }
                    Object objCollect2 = flow3.collect(new AnonymousClass2(flowCollector, getcontentviewgroupparentlayout3, onfailure2, 0), shortNewsContentCardView2);
                    if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        int i16 = IconCompatParcelizer + 89;
                        MediaMetadataCompat = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        obj3 = objCollect2;
                    }
                    int i17 = MediaMetadataCompat + 27;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    return obj3;
                }
            };
            ((inCompatibilityMode) onfailure.MediaDescriptionCompat).getClass();
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flow2, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
            DividerUiModelImpl$1.AnonymousClass1 anonymousClass1 = new DividerUiModelImpl$1.AnonymousClass1(onfailure, shortNewsContentCardView, 8);
            this.read = null;
            this.IconCompatParcelizer = 1;
            if (FlowKt.collectLatest(flowRemoteActionCompatParcelizer, anonymousClass1, this) == coroutineSingletons2) {
                obj2 = coroutineSingletons2;
            }
        } else if (i9 == 1) {
            int i10 = write + 81;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i12 = RatingCompat + 45;
        write = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            int i13 = 78 / 0;
        }
        return obj2;
    }
}
