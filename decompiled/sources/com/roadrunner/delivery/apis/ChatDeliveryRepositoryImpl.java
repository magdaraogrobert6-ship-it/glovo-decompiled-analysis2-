package com.roadrunner.delivery.apis;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidFontLoader;
import o.AndroidFontLoaderawaitLoad1;
import o.AndroidPopup_androidKtPopup21invokeinlinedonDispose1;
import o.AndroidPopup_androidKtPopup81;
import o.AndroidUiFrameClock;
import o.AndroidViewHolder_androidKtNoOpScrollConnection1;
import o.IInAppMessageViewWrapper;
import o.RectManager;
import o.SemanticsPropertiesContentDescription1;
import o.ShortNewsContentCardView;
import o.TextUnitType;
import o.accessgetInstancedelegatecp;
import o.accessrequireViewFactoryHolder;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getEmUIouoOA;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.metaMarkUpdatedAndHasCallbacks;
import o.pageDowndefault;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatDeliveryRepositoryImpl implements TextUnitType {
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompat = 1;
    public final zzz IconCompatParcelizer;
    public final RectManager MediaBrowserCompatMediaItem;
    public final accessrequireViewFactoryHolder MediaMetadataCompat;
    public final SemanticsPropertiesContentDescription1 MediaSessionCompatQueueItem;
    public final GetUserDataUseCaseImpl RatingCompat;
    public final SharedFlowImpl RemoteActionCompatParcelizer;
    public final pageDowndefault read;
    public final AndroidUiFrameClock serializer;
    public final SharedFlowImpl write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;
        public int IconCompatParcelizer;
        public final /* synthetic */ ChatDeliveryRepositoryImpl read;
        public final /* synthetic */ int write;

        /* JADX INFO: renamed from: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00311 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            private static int MediaMetadataCompat = 1;
            private static int RemoteActionCompatParcelizer;
            public final /* synthetic */ ChatDeliveryRepositoryImpl IconCompatParcelizer;
            public final /* synthetic */ int read;
            public int serializer;
            public /* synthetic */ Object write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00311(ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
                super(2, shortNewsContentCardView);
                this.read = i;
                this.IconCompatParcelizer = chatDeliveryRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 11;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = this.read;
                ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = this.IconCompatParcelizer;
                if (i4 != 0) {
                    C00311 c00311 = new C00311(chatDeliveryRepositoryImpl, shortNewsContentCardView, 1);
                    c00311.write = obj;
                    return c00311;
                }
                C00311 c00312 = new C00311(chatDeliveryRepositoryImpl, shortNewsContentCardView, 0);
                c00312.write = obj;
                int i5 = RemoteActionCompatParcelizer + 93;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return c00312;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 61;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = this.read;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (i4 != 0) {
                    return ((C00311) create((getEmUIouoOA) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                }
                Object objInvokeSuspend = ((C00311) create((List) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = RemoteActionCompatParcelizer + 89;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = this.read;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = this.IconCompatParcelizer;
                if (i2 != 0) {
                    getEmUIouoOA getemuiouooa = (getEmUIouoOA) this.write;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.serializer;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedFlowImpl sharedFlowImpl = chatDeliveryRepositoryImpl.write;
                    this.write = null;
                    this.serializer = 1;
                    if (sharedFlowImpl.emit(getemuiouooa, this) != coroutineSingletons) {
                        return createfromparcel;
                    }
                    int i4 = MediaMetadataCompat + 13;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
                List list = (List) this.write;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.serializer;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedFlowImpl sharedFlowImpl2 = chatDeliveryRepositoryImpl.RemoteActionCompatParcelizer;
                    this.write = null;
                    this.serializer = 1;
                    if (sharedFlowImpl2.emit(list, this) != coroutineSingletons2) {
                        return createfromparcel;
                    }
                    int i6 = RemoteActionCompatParcelizer + 13;
                    MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons2;
                }
                int i8 = MediaMetadataCompat;
                int i9 = i8 + 43;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = i8 + 39;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.read = chatDeliveryRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = serializer + 111;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.write;
            ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = this.read;
            if (i4 == 0) {
                return new AnonymousClass1(chatDeliveryRepositoryImpl, shortNewsContentCardView, 0);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(chatDeliveryRepositoryImpl, shortNewsContentCardView, 1);
            int i5 = RemoteActionCompatParcelizer + 11;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i2 == 0) {
                Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = RemoteActionCompatParcelizer + 89;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            }
            Object objInvokeSuspend2 = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = serializer + 41;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return objInvokeSuspend2;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = serializer + 93;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            int i3 = this.write;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            final ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = this.read;
            int i4 = 5;
            int i5 = 15;
            final int i6 = 1;
            if (i3 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.IconCompatParcelizer;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    final WorkSpecDaoKt$dedup$$inlined$map$1 workSpecDaoKt$dedup$$inlined$map$1 = new WorkSpecDaoKt$dedup$$inlined$map$1(i4, new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((AndroidViewHolder_androidKtNoOpScrollConnection1) chatDeliveryRepositoryImpl.MediaMetadataCompat)).MediaSessionCompatQueueItem, i5));
                    Flow flow = new Flow() { // from class: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1
                        private static int IconCompatParcelizer = 0;
                        private static int RemoteActionCompatParcelizer = 1;

                        /* JADX INFO: renamed from: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1$2, reason: invalid class name */
                        public final class AnonymousClass2 implements FlowCollector {
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int read = 1;
                            public final /* synthetic */ FlowCollector IconCompatParcelizer;
                            public final /* synthetic */ ChatDeliveryRepositoryImpl serializer;
                            public final /* synthetic */ int write;

                            public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl, int i) {
                                this.write = i;
                                this.IconCompatParcelizer = flowCollector;
                                this.serializer = chatDeliveryRepositoryImpl;
                            }

                            /* JADX WARN: Code duplicated, block: B:13:0x0034  */
                            /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
                            /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                                AndroidFontLoaderawaitLoad1 androidFontLoaderawaitLoad1;
                                List list;
                                AndroidFontLoader androidFontLoader;
                                getEmUIouoOA getemuiouooa;
                                FlowCollector flowCollector;
                                AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose1;
                                AndroidUiFrameClock androidUiFrameClock;
                                int i = 2 % 2;
                                int i2 = this.write;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = this.serializer;
                                FlowCollector flowCollector2 = this.IconCompatParcelizer;
                                int i3 = 0;
                                if (i2 == 0) {
                                    if (shortNewsContentCardView instanceof AndroidFontLoaderawaitLoad1) {
                                        androidFontLoaderawaitLoad1 = (AndroidFontLoaderawaitLoad1) shortNewsContentCardView;
                                        int i4 = androidFontLoaderawaitLoad1.write;
                                        if ((i4 & Integer.MIN_VALUE) != 0) {
                                            int i5 = read + 67;
                                            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                                            int i6 = i5 % 2;
                                            androidFontLoaderawaitLoad1.write = i4 - Integer.MIN_VALUE;
                                        } else {
                                            androidFontLoaderawaitLoad1 = new AndroidFontLoaderawaitLoad1(this, shortNewsContentCardView);
                                        }
                                    } else {
                                        androidFontLoaderawaitLoad1 = new AndroidFontLoaderawaitLoad1(this, shortNewsContentCardView);
                                    }
                                    Object obj2 = androidFontLoaderawaitLoad1.read;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    int i7 = androidFontLoaderawaitLoad1.write;
                                    if (i7 != 0) {
                                        int i8 = read + 69;
                                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                                        if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                        return createfromparcel;
                                    }
                                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                    AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose2 = (AndroidPopup_androidKtPopup21invokeinlinedonDispose1) obj;
                                    Object obj3 = instance_delegatelambda0.write;
                                    if (androidPopup_androidKtPopup21invokeinlinedonDispose2 != null && (list = androidPopup_androidKtPopup21invokeinlinedonDispose2.deliveries) != null) {
                                        try {
                                            List<AndroidPopup_androidKtPopup81> list2 = list;
                                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                                            for (AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81 : list2) {
                                                chatDeliveryRepositoryImpl.serializer.getClass();
                                                arrayList.add(AndroidUiFrameClock.serializer(androidPopup_androidKtPopup81));
                                            }
                                            obj3 = arrayList;
                                        } catch (NoSuchElementException e) {
                                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to map chat deliveries", new Object[0]);
                                        }
                                    }
                                    androidFontLoaderawaitLoad1.write = 1;
                                    return flowCollector2.emit(obj3, androidFontLoaderawaitLoad1) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                                }
                                if (shortNewsContentCardView instanceof AndroidFontLoader) {
                                    int i9 = read + 1;
                                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                                    if (i9 % 2 != 0) {
                                        int i10 = ((AndroidFontLoader) shortNewsContentCardView).serializer;
                                        throw null;
                                    }
                                    androidFontLoader = (AndroidFontLoader) shortNewsContentCardView;
                                    int i11 = androidFontLoader.serializer;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        androidFontLoader.serializer = i11 - Integer.MIN_VALUE;
                                    } else {
                                        androidFontLoader = new AndroidFontLoader(this, shortNewsContentCardView);
                                        int i12 = RemoteActionCompatParcelizer + 83;
                                        read = i12 % Fields.SpotShadowColor;
                                        int i13 = i12 % 2;
                                    }
                                } else {
                                    androidFontLoader = new AndroidFontLoader(this, shortNewsContentCardView);
                                    int i14 = RemoteActionCompatParcelizer + 83;
                                    read = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                }
                                Object obj4 = androidFontLoader.MediaMetadataCompat;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i16 = androidFontLoader.serializer;
                                if (i16 == 0) {
                                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                    AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose3 = (AndroidPopup_androidKtPopup21invokeinlinedonDispose1) obj;
                                    if (androidPopup_androidKtPopup21invokeinlinedonDispose3 != null) {
                                        AndroidUiFrameClock androidUiFrameClock2 = chatDeliveryRepositoryImpl.serializer;
                                        androidFontLoader.IconCompatParcelizer = flowCollector2;
                                        androidFontLoader.read = androidPopup_androidKtPopup21invokeinlinedonDispose3;
                                        androidFontLoader.write = androidUiFrameClock2;
                                        androidFontLoader.RemoteActionCompatParcelizer = 0;
                                        androidFontLoader.serializer = 1;
                                        Object objAccess$getEmail = ChatDeliveryRepositoryImpl.access$getEmail(chatDeliveryRepositoryImpl, androidFontLoader);
                                        if (objAccess$getEmail != coroutineSingletons2) {
                                            flowCollector = flowCollector2;
                                            androidPopup_androidKtPopup21invokeinlinedonDispose1 = androidPopup_androidKtPopup21invokeinlinedonDispose3;
                                            androidUiFrameClock = androidUiFrameClock2;
                                            obj4 = objAccess$getEmail;
                                        }
                                    } else {
                                        int i17 = read + 49;
                                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                                        int i18 = i17 % 2;
                                        getemuiouooa = null;
                                        androidFontLoader.IconCompatParcelizer = null;
                                        androidFontLoader.read = null;
                                        androidFontLoader.write = null;
                                        androidFontLoader.RemoteActionCompatParcelizer = i3;
                                        androidFontLoader.serializer = 2;
                                        if (flowCollector2.emit(getemuiouooa, androidFontLoader) != coroutineSingletons2) {
                                            return createfromparcel;
                                        }
                                    }
                                    return coroutineSingletons2;
                                }
                                int i19 = read + 57;
                                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                                if (i19 % 2 == 0 ? i16 != 1 : i16 != 0) {
                                    if (i16 == 2) {
                                        ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                        return createfromparcel;
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                    int i20 = RemoteActionCompatParcelizer + 117;
                                    read = i20 % Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                    return null;
                                }
                                int i22 = androidFontLoader.RemoteActionCompatParcelizer;
                                androidUiFrameClock = androidFontLoader.write;
                                androidPopup_androidKtPopup21invokeinlinedonDispose1 = androidFontLoader.read;
                                flowCollector = androidFontLoader.IconCompatParcelizer;
                                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                i3 = i22;
                                androidUiFrameClock.getClass();
                                androidPopup_androidKtPopup21invokeinlinedonDispose1.getClass();
                                getemuiouooa = new getEmUIouoOA(androidPopup_androidKtPopup21invokeinlinedonDispose1.userId, androidPopup_androidKtPopup21invokeinlinedonDispose1.gccSessionToken, (String) obj4);
                                flowCollector2 = flowCollector;
                                androidFontLoader.IconCompatParcelizer = null;
                                androidFontLoader.read = null;
                                androidFontLoader.write = null;
                                androidFontLoader.RemoteActionCompatParcelizer = i3;
                                androidFontLoader.serializer = 2;
                                if (flowCollector2.emit(getemuiouooa, androidFontLoader) != coroutineSingletons2) {
                                    return createfromparcel;
                                }
                                return coroutineSingletons2;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView2) {
                            int i8 = 2 % 2;
                            int i9 = IconCompatParcelizer + 27;
                            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                                throw null;
                            }
                            int i10 = i6;
                            Object obj2 = createFromParcel.INSTANCE;
                            ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl2 = chatDeliveryRepositoryImpl;
                            WorkSpecDaoKt$dedup$$inlined$map$1 workSpecDaoKt$dedup$$inlined$map$2 = workSpecDaoKt$dedup$$inlined$map$1;
                            int i11 = 0;
                            if (i10 == 0) {
                                Object objCollect = workSpecDaoKt$dedup$$inlined$map$2.collect(new AnonymousClass2(flowCollector, chatDeliveryRepositoryImpl2, i11), shortNewsContentCardView2);
                                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    return obj2;
                                }
                                int i12 = RemoteActionCompatParcelizer + 47;
                                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                return objCollect;
                            }
                            Object objCollect2 = workSpecDaoKt$dedup$$inlined$map$2.collect(new AnonymousClass2(flowCollector, chatDeliveryRepositoryImpl2, 1), shortNewsContentCardView2);
                            if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                int i14 = RemoteActionCompatParcelizer + 21;
                                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                obj2 = objCollect2;
                            }
                            int i16 = RemoteActionCompatParcelizer + 77;
                            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                            if (i16 % 2 != 0) {
                                int i17 = 48 / 0;
                            }
                            return obj2;
                        }
                    };
                    C00311 c00311 = new C00311(chatDeliveryRepositoryImpl, shortNewsContentCardView, i6);
                    this.IconCompatParcelizer = 1;
                    if (FlowKt.collectLatest(flow, c00311, this) == coroutineSingletons) {
                        int i8 = RemoteActionCompatParcelizer + 51;
                        serializer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i10 = RemoteActionCompatParcelizer + 9;
                    serializer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        throw null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createfromparcel2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = this.IconCompatParcelizer;
            if (i11 != 0) {
                int i12 = RemoteActionCompatParcelizer + 41;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0 ? i11 != 1 : i11 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                final WorkSpecDaoKt$dedup$$inlined$map$1 workSpecDaoKt$dedup$$inlined$map$2 = new WorkSpecDaoKt$dedup$$inlined$map$1(i4, new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((AndroidViewHolder_androidKtNoOpScrollConnection1) chatDeliveryRepositoryImpl.MediaMetadataCompat)).MediaSessionCompatQueueItem, i5));
                final int i13 = 0;
                Flow flow2 = new Flow() { // from class: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1
                    private static int IconCompatParcelizer = 0;
                    private static int RemoteActionCompatParcelizer = 1;

                    /* JADX INFO: renamed from: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1$2, reason: invalid class name */
                    public final class AnonymousClass2 implements FlowCollector {
                        private static int RemoteActionCompatParcelizer = 0;
                        private static int read = 1;
                        public final /* synthetic */ FlowCollector IconCompatParcelizer;
                        public final /* synthetic */ ChatDeliveryRepositoryImpl serializer;
                        public final /* synthetic */ int write;

                        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl, int i) {
                            this.write = i;
                            this.IconCompatParcelizer = flowCollector;
                            this.serializer = chatDeliveryRepositoryImpl;
                        }

                        /* JADX WARN: Code duplicated, block: B:13:0x0034  */
                        /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
                        /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                            AndroidFontLoaderawaitLoad1 androidFontLoaderawaitLoad1;
                            List list;
                            AndroidFontLoader androidFontLoader;
                            getEmUIouoOA getemuiouooa;
                            FlowCollector flowCollector;
                            AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose1;
                            AndroidUiFrameClock androidUiFrameClock;
                            int i = 2 % 2;
                            int i2 = this.write;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = this.serializer;
                            FlowCollector flowCollector2 = this.IconCompatParcelizer;
                            int i3 = 0;
                            if (i2 == 0) {
                                if (shortNewsContentCardView instanceof AndroidFontLoaderawaitLoad1) {
                                    androidFontLoaderawaitLoad1 = (AndroidFontLoaderawaitLoad1) shortNewsContentCardView;
                                    int i4 = androidFontLoaderawaitLoad1.write;
                                    if ((i4 & Integer.MIN_VALUE) != 0) {
                                        int i5 = read + 67;
                                        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                                        int i6 = i5 % 2;
                                        androidFontLoaderawaitLoad1.write = i4 - Integer.MIN_VALUE;
                                    } else {
                                        androidFontLoaderawaitLoad1 = new AndroidFontLoaderawaitLoad1(this, shortNewsContentCardView);
                                    }
                                } else {
                                    androidFontLoaderawaitLoad1 = new AndroidFontLoaderawaitLoad1(this, shortNewsContentCardView);
                                }
                                Object obj2 = androidFontLoaderawaitLoad1.read;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i7 = androidFontLoaderawaitLoad1.write;
                                if (i7 != 0) {
                                    int i8 = read + 69;
                                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                    return createfromparcel;
                                }
                                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose2 = (AndroidPopup_androidKtPopup21invokeinlinedonDispose1) obj;
                                Object obj3 = instance_delegatelambda0.write;
                                if (androidPopup_androidKtPopup21invokeinlinedonDispose2 != null && (list = androidPopup_androidKtPopup21invokeinlinedonDispose2.deliveries) != null) {
                                    try {
                                        List<AndroidPopup_androidKtPopup81> list2 = list;
                                        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                                        for (AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81 : list2) {
                                            chatDeliveryRepositoryImpl.serializer.getClass();
                                            arrayList.add(AndroidUiFrameClock.serializer(androidPopup_androidKtPopup81));
                                        }
                                        obj3 = arrayList;
                                    } catch (NoSuchElementException e) {
                                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to map chat deliveries", new Object[0]);
                                    }
                                }
                                androidFontLoaderawaitLoad1.write = 1;
                                return flowCollector2.emit(obj3, androidFontLoaderawaitLoad1) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                            }
                            if (shortNewsContentCardView instanceof AndroidFontLoader) {
                                int i9 = read + 1;
                                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 != 0) {
                                    int i10 = ((AndroidFontLoader) shortNewsContentCardView).serializer;
                                    throw null;
                                }
                                androidFontLoader = (AndroidFontLoader) shortNewsContentCardView;
                                int i11 = androidFontLoader.serializer;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    androidFontLoader.serializer = i11 - Integer.MIN_VALUE;
                                } else {
                                    androidFontLoader = new AndroidFontLoader(this, shortNewsContentCardView);
                                    int i14 = RemoteActionCompatParcelizer + 83;
                                    read = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                }
                            } else {
                                androidFontLoader = new AndroidFontLoader(this, shortNewsContentCardView);
                                int i16 = RemoteActionCompatParcelizer + 83;
                                read = i16 % Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                            }
                            Object obj4 = androidFontLoader.MediaMetadataCompat;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i18 = androidFontLoader.serializer;
                            if (i18 == 0) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                AndroidPopup_androidKtPopup21invokeinlinedonDispose1 androidPopup_androidKtPopup21invokeinlinedonDispose3 = (AndroidPopup_androidKtPopup21invokeinlinedonDispose1) obj;
                                if (androidPopup_androidKtPopup21invokeinlinedonDispose3 != null) {
                                    AndroidUiFrameClock androidUiFrameClock2 = chatDeliveryRepositoryImpl.serializer;
                                    androidFontLoader.IconCompatParcelizer = flowCollector2;
                                    androidFontLoader.read = androidPopup_androidKtPopup21invokeinlinedonDispose3;
                                    androidFontLoader.write = androidUiFrameClock2;
                                    androidFontLoader.RemoteActionCompatParcelizer = 0;
                                    androidFontLoader.serializer = 1;
                                    Object objAccess$getEmail = ChatDeliveryRepositoryImpl.access$getEmail(chatDeliveryRepositoryImpl, androidFontLoader);
                                    if (objAccess$getEmail != coroutineSingletons2) {
                                        flowCollector = flowCollector2;
                                        androidPopup_androidKtPopup21invokeinlinedonDispose1 = androidPopup_androidKtPopup21invokeinlinedonDispose3;
                                        androidUiFrameClock = androidUiFrameClock2;
                                        obj4 = objAccess$getEmail;
                                    }
                                } else {
                                    int i19 = read + 49;
                                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                                    int i110 = i19 % 2;
                                    getemuiouooa = null;
                                    androidFontLoader.IconCompatParcelizer = null;
                                    androidFontLoader.read = null;
                                    androidFontLoader.write = null;
                                    androidFontLoader.RemoteActionCompatParcelizer = i3;
                                    androidFontLoader.serializer = 2;
                                    if (flowCollector2.emit(getemuiouooa, androidFontLoader) != coroutineSingletons2) {
                                        return createfromparcel;
                                    }
                                }
                                return coroutineSingletons2;
                            }
                            int i111 = read + 57;
                            RemoteActionCompatParcelizer = i111 % Fields.SpotShadowColor;
                            if (i111 % 2 == 0 ? i18 != 1 : i18 != 0) {
                                if (i18 == 2) {
                                    ExtrasKt.RemoteActionCompatParcelizer(obj4);
                                    return createfromparcel;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                int i20 = RemoteActionCompatParcelizer + 117;
                                read = i20 % Fields.SpotShadowColor;
                                int i21 = i20 % 2;
                                return null;
                            }
                            int i22 = androidFontLoader.RemoteActionCompatParcelizer;
                            androidUiFrameClock = androidFontLoader.write;
                            androidPopup_androidKtPopup21invokeinlinedonDispose1 = androidFontLoader.read;
                            flowCollector = androidFontLoader.IconCompatParcelizer;
                            ExtrasKt.RemoteActionCompatParcelizer(obj4);
                            i3 = i22;
                            androidUiFrameClock.getClass();
                            androidPopup_androidKtPopup21invokeinlinedonDispose1.getClass();
                            getemuiouooa = new getEmUIouoOA(androidPopup_androidKtPopup21invokeinlinedonDispose1.userId, androidPopup_androidKtPopup21invokeinlinedonDispose1.gccSessionToken, (String) obj4);
                            flowCollector2 = flowCollector;
                            androidFontLoader.IconCompatParcelizer = null;
                            androidFontLoader.read = null;
                            androidFontLoader.write = null;
                            androidFontLoader.RemoteActionCompatParcelizer = i3;
                            androidFontLoader.serializer = 2;
                            if (flowCollector2.emit(getemuiouooa, androidFontLoader) != coroutineSingletons2) {
                                return createfromparcel;
                            }
                            return coroutineSingletons2;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i14 = 2 % 2;
                        int i15 = IconCompatParcelizer + 27;
                        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            createFromParcel createfromparcel3 = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i16 = i13;
                        Object obj2 = createFromParcel.INSTANCE;
                        ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl2 = chatDeliveryRepositoryImpl;
                        WorkSpecDaoKt$dedup$$inlined$map$1 workSpecDaoKt$dedup$$inlined$map$3 = workSpecDaoKt$dedup$$inlined$map$2;
                        int i17 = 0;
                        if (i16 == 0) {
                            Object objCollect = workSpecDaoKt$dedup$$inlined$map$3.collect(new AnonymousClass2(flowCollector, chatDeliveryRepositoryImpl2, i17), shortNewsContentCardView2);
                            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return obj2;
                            }
                            int i18 = RemoteActionCompatParcelizer + 47;
                            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            return objCollect;
                        }
                        Object objCollect2 = workSpecDaoKt$dedup$$inlined$map$3.collect(new AnonymousClass2(flowCollector, chatDeliveryRepositoryImpl2, 1), shortNewsContentCardView2);
                        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            int i110 = RemoteActionCompatParcelizer + 21;
                            IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                            int i111 = i110 % 2;
                            obj2 = objCollect2;
                        }
                        int i112 = RemoteActionCompatParcelizer + 77;
                        IconCompatParcelizer = i112 % Fields.SpotShadowColor;
                        if (i112 % 2 != 0) {
                            int i113 = 48 / 0;
                        }
                        return obj2;
                    }
                };
                C00311 c00312 = new C00311(chatDeliveryRepositoryImpl, shortNewsContentCardView, i13);
                this.IconCompatParcelizer = 1;
                if (FlowKt.collectLatest(flow2, c00312, this) == coroutineSingletons2) {
                    int i14 = RemoteActionCompatParcelizer + 59;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        int i15 = 92 / 0;
                    }
                    return coroutineSingletons2;
                }
            }
            return createfromparcel2;
        }
    }

    public ChatDeliveryRepositoryImpl(accessrequireViewFactoryHolder accessrequireviewfactoryholder, AndroidUiFrameClock androidUiFrameClock, RectManager rectManager, GetUserDataUseCaseImpl getUserDataUseCaseImpl, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, zzz zzzVar, pageDowndefault pagedowndefault, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        accessrequireviewfactoryholder.getClass();
        androidUiFrameClock.getClass();
        rectManager.getClass();
        getUserDataUseCaseImpl.getClass();
        semanticsPropertiesContentDescription1.getClass();
        zzzVar.getClass();
        pagedowndefault.getClass();
        getcontentviewgroupparentlayout.getClass();
        isopeninternalroom_runtime.getClass();
        this.MediaMetadataCompat = accessrequireviewfactoryholder;
        this.serializer = androidUiFrameClock;
        this.MediaBrowserCompatMediaItem = rectManager;
        this.RatingCompat = getUserDataUseCaseImpl;
        this.MediaSessionCompatQueueItem = semanticsPropertiesContentDescription1;
        this.IconCompatParcelizer = zzzVar;
        this.read = pagedowndefault;
        IInAppMessageViewWrapper iInAppMessageViewWrapper = IInAppMessageViewWrapper.DROP_OLDEST;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, iInAppMessageViewWrapper, 2);
        this.RemoteActionCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer2 = SharedFlowKt.RemoteActionCompatParcelizer(1, 0, iInAppMessageViewWrapper, 2);
        this.write = sharedFlowImplRemoteActionCompatParcelizer2;
        sharedFlowImplRemoteActionCompatParcelizer.write(instance_delegatelambda0.write);
        ShortNewsContentCardView shortNewsContentCardView = null;
        sharedFlowImplRemoteActionCompatParcelizer2.write((Object) null);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, defaultIoScheduler, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 2);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, defaultIoScheduler, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 2);
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 21;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List list = (List) this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem().get(0);
        int i4 = PlaybackStateCompat + 103;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getEmUIouoOA write() {
        List listMediaSessionCompatQueueItem;
        int i;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 79;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            listMediaSessionCompatQueueItem = this.write.MediaSessionCompatQueueItem();
            i = 1;
        } else {
            listMediaSessionCompatQueueItem = this.write.MediaSessionCompatQueueItem();
            i = 0;
        }
        getEmUIouoOA getemuiouooa = (getEmUIouoOA) listMediaSessionCompatQueueItem.get(i);
        int i4 = MediaDescriptionCompat + 117;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getemuiouooa;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 113;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read.RemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer() == null) {
            return null;
        }
        int i4 = PlaybackStateCompat + 51;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 11;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = this.MediaBrowserCompatMediaItem.serializer();
        if (metamarkupdatedandhascallbacksSerializer != null) {
            int i4 = MediaDescriptionCompat + 71;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                String str2 = metamarkupdatedandhascallbacksSerializer.countryCode;
                throw null;
            }
            str = metamarkupdatedandhascallbacksSerializer.countryCode;
        } else {
            str = null;
        }
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Country config should contain country code");
            return null;
        }
        int i5 = MediaDescriptionCompat + 71;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        String str;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 1;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = this.MediaBrowserCompatMediaItem.serializer();
        if (metamarkupdatedandhascallbacksSerializer != null) {
            int i4 = PlaybackStateCompat + 63;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = metamarkupdatedandhascallbacksSerializer.globalEntityId;
        } else {
            str = null;
        }
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Country config should contain global entity ID");
            return null;
        }
        int i6 = PlaybackStateCompat + 93;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = this.MediaBrowserCompatMediaItem.serializer();
        if (metamarkupdatedandhascallbacksSerializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Country config should not be null");
            int i2 = MediaDescriptionCompat + 105;
            PlaybackStateCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) metamarkupdatedandhascallbacksSerializer.url, (CharSequence) (metamarkupdatedandhascallbacksSerializer.countryCode + "-st"), false)) {
            return "production";
        }
        int i4 = MediaDescriptionCompat + 53;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "staging";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r7 == r2) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$getEmail(com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.PlaybackStateCompat
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r7 instanceof o.AndroidFontLoader_androidKt
            r2 = 65
            int r2 = r2 / 0
            if (r1 == 0) goto L2a
            goto L1b
        L17:
            boolean r1 = r7 instanceof o.AndroidFontLoader_androidKt
            if (r1 == 0) goto L2a
        L1b:
            r1 = r7
            o.AndroidFontLoader_androidKt r1 = (o.AndroidFontLoader_androidKt) r1
            int r2 = r1.RemoteActionCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L2a
            int r2 = r2 + r3
            r1.RemoteActionCompatParcelizer = r2
            goto L2f
        L2a:
            o.AndroidFontLoader_androidKt r1 = new o.AndroidFontLoader_androidKt
            r1.<init>(r6, r7)
        L2f:
            java.lang.Object r7 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.RemoteActionCompatParcelizer
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L73
            if (r3 == r4) goto L66
            int r6 = com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.PlaybackStateCompat
            int r6 = r6 + 79
            int r1 = r6 % 128
            com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.MediaDescriptionCompat = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L4a
            r6 = 3
            if (r3 != r6) goto L60
            goto L4c
        L4a:
            if (r3 != r0) goto L60
        L4c:
            int r1 = r1 + 107
            int r6 = r1 % 128
            com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.PlaybackStateCompat = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L59
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto Lab
        L59:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            r5.hashCode()
            throw r5
        L60:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            return r5
        L66:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            int r3 = com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.MediaDescriptionCompat
            int r3 = r3 + 51
            int r4 = r3 % 128
            com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.PlaybackStateCompat = r4
            int r3 = r3 % r0
            goto L83
        L73:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            o.SemanticsPropertiesContentDescription1 r7 = r6.MediaSessionCompatQueueItem
            r1.RemoteActionCompatParcelizer = r4
            com.roadrunner.auth.domain.token.IsUserSignedInImpl r7 = (com.roadrunner.auth.domain.token.IsUserSignedInImpl) r7
            java.lang.Object r7 = r7.invoke(r1)
            if (r7 != r2) goto L83
            goto L9e
        L83:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lb0
            int r7 = com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.MediaDescriptionCompat
            int r7 = r7 + 9
            int r3 = r7 % 128
            com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.PlaybackStateCompat = r3
            int r7 = r7 % r0
            com.roadrunner.auth.domain.GetUserDataUseCaseImpl r6 = r6.RatingCompat
            r1.RemoteActionCompatParcelizer = r0
            java.lang.Object r7 = r6.invoke(r1)
            if (r7 != r2) goto Lab
        L9e:
            int r6 = com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.PlaybackStateCompat
            int r6 = r6 + 101
            int r7 = r6 % 128
            com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.MediaDescriptionCompat = r7
            int r6 = r6 % r0
            if (r6 != 0) goto Laa
            return r2
        Laa:
            throw r5
        Lab:
            o.getTextSelectionRange r7 = (o.getTextSelectionRange) r7
            java.lang.String r6 = r7.MediaSessionCompatQueueItem
            return r6
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl.access$getEmail(com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
