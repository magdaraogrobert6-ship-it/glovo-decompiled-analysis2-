package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.gnsslocation.core.bean.log.GpsRtiItem;
import com.roadrunner.customerchat.selfservice.domain.analytics.NativeCacheEventsTrackerImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.Bullet;
import o.ShortNewsContentCardView;
import o.accessgetDefaultIndentationcp;
import o.accesstoLayoutAlignaXe7zB0;
import o.copyw_4Rhrwdefault;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getParagraph;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setStartLineIndex;
import o.toGlobalLineIndex;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatViewModel$fetchChatUrl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ WebChatViewModel write;

    /* JADX INFO: renamed from: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$fetchChatUrl$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaSessionCompatQueueItem = 1;
        private static int serializer;
        public int IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public final /* synthetic */ WebChatViewModel write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.write = webChatViewModel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView, WebChatViewModel webChatViewModel, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.write = webChatViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.RemoteActionCompatParcelizer;
            WebChatViewModel webChatViewModel = this.write;
            int i4 = 0;
            switch (i3) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, i4);
                    anonymousClass2.read = obj;
                    return anonymousClass2;
                case 1:
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2(shortNewsContentCardView, webChatViewModel, 1);
                    anonymousClass3.read = obj;
                    int i5 = serializer + 15;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i6 = 64 / 0;
                    }
                    return anonymousClass3;
                case 2:
                    AnonymousClass2 anonymousClass4 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, i);
                    anonymousClass4.read = obj;
                    return anonymousClass4;
                case 3:
                    AnonymousClass2 anonymousClass5 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, 3);
                    anonymousClass5.read = obj;
                    return anonymousClass5;
                case 4:
                    AnonymousClass2 anonymousClass6 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, 4);
                    anonymousClass6.read = obj;
                    return anonymousClass6;
                case 5:
                    AnonymousClass2 anonymousClass7 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, 5);
                    anonymousClass7.read = obj;
                    int i7 = MediaSessionCompatQueueItem + 49;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return anonymousClass7;
                case 6:
                    AnonymousClass2 anonymousClass8 = new AnonymousClass2(shortNewsContentCardView, webChatViewModel, 6);
                    anonymousClass8.read = obj;
                    return anonymousClass8;
                case 7:
                    AnonymousClass2 anonymousClass9 = new AnonymousClass2(shortNewsContentCardView, webChatViewModel, 7);
                    anonymousClass9.read = obj;
                    return anonymousClass9;
                case 8:
                    AnonymousClass2 anonymousClass10 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, 8);
                    anonymousClass10.read = obj;
                    return anonymousClass10;
                default:
                    AnonymousClass2 anonymousClass11 = new AnonymousClass2(webChatViewModel, shortNewsContentCardView, 9);
                    anonymousClass11.read = obj;
                    return anonymousClass11;
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i2) {
                case 0:
                    return ((AnonymousClass2) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 1:
                    Object objInvokeSuspend = ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i3 = serializer + 67;
                    MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return objInvokeSuspend;
                case 2:
                    Object objInvokeSuspend2 = ((AnonymousClass2) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = serializer + 111;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return objInvokeSuspend2;
                    }
                    throw null;
                case 3:
                    return ((AnonymousClass2) create((String) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 4:
                    return ((AnonymousClass2) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    return ((AnonymousClass2) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 6:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 7:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 8:
                    return ((AnonymousClass2) create((WebChatEventsTrackerImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                default:
                    return ((AnonymousClass2) create((copyw_4Rhrwdefault) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
        }

        /* JADX WARN: Code duplicated, block: B:127:0x0334  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            boolean z;
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            WebChatViewModel webChatViewModel = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = 1;
            ShortNewsContentCardView shortNewsContentCardView = null;
            switch (i2) {
                case 0:
                    WebChatEventsTrackerImpl webChatEventsTrackerImpl = (WebChatEventsTrackerImpl) this.read;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.IconCompatParcelizer;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Bullet bullet = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    webChatEventsTrackerImpl.getClass();
                    Object objIfTrackingEnabled = webChatEventsTrackerImpl.ifTrackingEnabled(new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, i3), this);
                    if (objIfTrackingEnabled != coroutineSingletons) {
                        objIfTrackingEnabled = createfromparcel;
                    }
                    return objIfTrackingEnabled == coroutineSingletons ? coroutineSingletons : createfromparcel;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.IconCompatParcelizer;
                    if (i5 != 0) {
                        int i6 = MediaSessionCompatQueueItem + 105;
                        serializer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (i5 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!((getParagraph) webChatViewModel.serializer.read()).write) {
                        webChatViewModel.RemoteActionCompatParcelizer.serializer(setStartLineIndex.read);
                        return createfromparcel;
                    }
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    Object objSendMessage = webChatViewModel.sendMessage(new accesstoLayoutAlignaXe7zB0(af$$ExternalSyntheticOutline0.m(webChatViewModel.ensureViewModelStore.write.millis(), "HOST_ASKS_FOR_BACK_NAVIGATION_")), this);
                    if (objSendMessage != coroutineSingletons2) {
                        objSendMessage = createfromparcel;
                    }
                    return objSendMessage == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                case 2:
                    WebChatEventsTrackerImpl webChatEventsTrackerImpl2 = (WebChatEventsTrackerImpl) this.read;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.IconCompatParcelizer;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Bullet bullet2 = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    webChatEventsTrackerImpl2.getClass();
                    Object objIfTrackingEnabled2 = webChatEventsTrackerImpl2.ifTrackingEnabled(new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl2, bullet2, shortNewsContentCardView, i3), this);
                    if (objIfTrackingEnabled2 != coroutineSingletons3) {
                        objIfTrackingEnabled2 = createfromparcel;
                    }
                    return objIfTrackingEnabled2 == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
                case 3:
                    String str = (String) this.read;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.IconCompatParcelizer;
                    if (i9 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (!((getParagraph) webChatViewModel.getOnBackPressedInput.read()).write) {
                            return createfromparcel;
                        }
                        this.read = null;
                        this.IconCompatParcelizer = 1;
                        return webChatViewModel.sendUpdatedVerificationToken$1(str, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
                    }
                    int i10 = serializer;
                    int i11 = i10 + 69;
                    MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (i9 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i13 = i10 + 63;
                    MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                case 4:
                    WebChatEventsTrackerImpl webChatEventsTrackerImpl3 = (WebChatEventsTrackerImpl) this.read;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.IconCompatParcelizer;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Bullet bullet3 = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    webChatEventsTrackerImpl3.getClass();
                    Object objIfTrackingEnabled3 = webChatEventsTrackerImpl3.ifTrackingEnabled(new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl3, bullet3, shortNewsContentCardView, 3), this);
                    if (objIfTrackingEnabled3 != coroutineSingletons5) {
                        objIfTrackingEnabled3 = createfromparcel;
                    }
                    return objIfTrackingEnabled3 == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
                case 5:
                    WebChatEventsTrackerImpl webChatEventsTrackerImpl4 = (WebChatEventsTrackerImpl) this.read;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.IconCompatParcelizer;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Bullet bullet4 = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    return webChatEventsTrackerImpl4.trackWebChatHandshakeFailedEvent(bullet4, this) == coroutineSingletons6 ? coroutineSingletons6 : createfromparcel;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.IconCompatParcelizer;
                    if (i17 != 0) {
                        if (i17 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    String str2 = (String) webChatViewModel.IconCompatParcelizer.read();
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    return webChatViewModel.sendUpdatedVerificationToken$1(str2, this) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.IconCompatParcelizer;
                    if (i18 != 0) {
                        int i19 = serializer + 89;
                        int i20 = i19 % Fields.SpotShadowColor;
                        MediaSessionCompatQueueItem = i20;
                        int i21 = i19 % 2;
                        if (i18 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i22 = i20 + 97;
                        serializer = i22 % Fields.SpotShadowColor;
                        if (i22 % 2 != 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            shortNewsContentCardView.hashCode();
                            throw null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.read = null;
                        this.IconCompatParcelizer = 1;
                        if (DelayKt.delay(8000L, this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    }
                    WebChatViewModel.IconCompatParcelizer(1681248497, new Object[]{webChatViewModel, new AnonymousClass2(webChatViewModel, shortNewsContentCardView, 8)}, GpsRtiItem.write(), -1681248494, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    MutableStateFlow mutableStateFlow = webChatViewModel.serializer;
                    do {
                        obj2 = mutableStateFlow.read();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getParagraph.RemoteActionCompatParcelizer((getParagraph) obj2, null, false, false, toGlobalLineIndex.RemoteActionCompatParcelizer, false, false, 50)));
                    return createfromparcel;
                case 8:
                    WebChatEventsTrackerImpl webChatEventsTrackerImpl5 = (WebChatEventsTrackerImpl) this.read;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.IconCompatParcelizer;
                    if (i23 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        Bullet bullet5 = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                        this.read = null;
                        this.IconCompatParcelizer = 1;
                        return webChatEventsTrackerImpl5.trackWebChatHandshakeFailedEvent(bullet5, this) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
                    }
                    int i24 = MediaSessionCompatQueueItem + 125;
                    serializer = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    if (i23 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                default:
                    copyw_4Rhrwdefault copyw_4rhrwdefault = (copyw_4Rhrwdefault) this.read;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.IconCompatParcelizer;
                    if (i26 != 0) {
                        if (i26 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Bullet bullet6 = (Bullet) WebChatViewModel.IconCompatParcelizer(-1484783990, new Object[]{webChatViewModel}, GpsRtiItem.write(), 1484783990, GpsRtiItem.write(), GpsRtiItem.write(), GpsRtiItem.write());
                    boolean z2 = webChatViewModel.MediaBrowserCompatMediaItem;
                    if (z2) {
                        int i27 = serializer + 27;
                        MediaSessionCompatQueueItem = i27 % Fields.SpotShadowColor;
                        if (i27 % 2 == 0) {
                            String str3 = webChatViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            throw null;
                        }
                        if (webChatViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
                            int i28 = MediaSessionCompatQueueItem + 77;
                            serializer = i28 % Fields.SpotShadowColor;
                            int i29 = i28 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    String str4 = webChatViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    accessgetDefaultIndentationcp accessgetdefaultindentationcp = webChatViewModel.MediaSessionCompatToken;
                    String str5 = webChatViewModel.RatingCompat;
                    this.read = null;
                    this.IconCompatParcelizer = 1;
                    NativeCacheEventsTrackerImpl nativeCacheEventsTrackerImpl = (NativeCacheEventsTrackerImpl) copyw_4rhrwdefault;
                    nativeCacheEventsTrackerImpl.getClass();
                    Object objIfTrackingEnabled4 = nativeCacheEventsTrackerImpl.ifTrackingEnabled(new NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2(nativeCacheEventsTrackerImpl, bullet6, z2, z, str4, accessgetdefaultindentationcp, str5, null), this);
                    if (objIfTrackingEnabled4 != coroutineSingletons10) {
                        objIfTrackingEnabled4 = createfromparcel;
                    }
                    return objIfTrackingEnabled4 == coroutineSingletons10 ? coroutineSingletons10 : createfromparcel;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewModel$fetchChatUrl$1(WebChatViewModel webChatViewModel, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = webChatViewModel;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r5 == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011f, code lost:
    
        if (r2 == r0) goto L58;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$fetchChatUrl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        WebChatViewModel$fetchChatUrl$1 webChatViewModel$fetchChatUrl$1 = new WebChatViewModel$fetchChatUrl$1(this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaMetadataCompat + 63;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return webChatViewModel$fetchChatUrl$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 15;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((WebChatViewModel$fetchChatUrl$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaMetadataCompat + 25;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }
}
