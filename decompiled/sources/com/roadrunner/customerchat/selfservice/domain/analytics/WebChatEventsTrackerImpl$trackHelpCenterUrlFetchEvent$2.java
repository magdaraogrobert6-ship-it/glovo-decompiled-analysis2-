package com.roadrunner.customerchat.selfservice.domain.analytics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Bullet;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getWidthXSAIIZE;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatEventsTrackerImpl read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Bullet write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(WebChatEventsTrackerImpl webChatEventsTrackerImpl, Bullet bullet, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.serializer = i;
        this.read = webChatEventsTrackerImpl;
        this.write = bullet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 11;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.serializer;
        Bullet bullet = this.write;
        WebChatEventsTrackerImpl webChatEventsTrackerImpl = this.read;
        int i5 = 0;
        if (i4 == 0) {
            return new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, i5);
        }
        int i6 = 1;
        if (i4 == 1) {
            return new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, i6);
        }
        if (i4 != 2) {
            int i7 = 3;
            if (i4 != 3) {
                return i4 != 4 ? new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, 5) : new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, 4);
            }
            return new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, i7);
        }
        WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 webChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 = new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(webChatEventsTrackerImpl, bullet, shortNewsContentCardView, i);
        int i8 = IconCompatParcelizer + 43;
        MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 96 / 0;
        }
        return webChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r8 = ((com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) create(r8)).invokeSuspend(r5);
        r1 = com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.IconCompatParcelizer + 121;
        com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if ((r1 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return ((com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) create(r8)).invokeSuspend(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r1 != 4) goto L17;
     */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.MediaDescriptionCompat
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 4
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L26
            int r1 = r7.serializer
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            r6 = 12
            int r6 = r6 / 0
            if (r1 == 0) goto L7a
            if (r1 == r4) goto L6f
            if (r1 == r0) goto L64
            if (r1 == r3) goto L59
            if (r1 == r2) goto L4e
            goto L36
        L26:
            int r1 = r7.serializer
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            if (r1 == 0) goto L7a
            if (r1 == r4) goto L6f
            if (r1 == r0) goto L64
            if (r1 == r3) goto L59
            if (r1 == r2) goto L4e
        L36:
            o.ShortNewsContentCardView r8 = r7.create(r8)
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 r8 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) r8
            java.lang.Object r8 = r8.invokeSuspend(r5)
            int r1 = com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.IconCompatParcelizer
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4c
            return r8
        L4c:
            r8 = 0
            throw r8
        L4e:
            o.ShortNewsContentCardView r8 = r7.create(r8)
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 r8 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) r8
            java.lang.Object r8 = r8.invokeSuspend(r5)
            return r8
        L59:
            o.ShortNewsContentCardView r8 = r7.create(r8)
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 r8 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) r8
            java.lang.Object r8 = r8.invokeSuspend(r5)
            return r8
        L64:
            o.ShortNewsContentCardView r8 = r7.create(r8)
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 r8 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) r8
            java.lang.Object r8 = r8.invokeSuspend(r5)
            return r8
        L6f:
            o.ShortNewsContentCardView r8 = r7.create(r8)
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 r8 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) r8
            java.lang.Object r8 = r8.invokeSuspend(r5)
            return r8
        L7a:
            o.ShortNewsContentCardView r8 = r7.create(r8)
            com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2 r8 = (com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2) r8
            java.lang.Object r8 = r8.invokeSuspend(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2.invoke(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Bullet bullet = this.write;
        WebChatEventsTrackerImpl webChatEventsTrackerImpl = this.read;
        Object obj2 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl = webChatEventsTrackerImpl.write;
            getWidthXSAIIZE getwidthxsaiizeSerializer = webChatEventsTrackerImpl.read.serializer("HELP_CENTER_MOBILE_SDK_FETCH_URL", bullet, null);
            this.RemoteActionCompatParcelizer = 1;
            return analyticsImpl.track(getwidthxsaiizeSerializer, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.RemoteActionCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl2 = webChatEventsTrackerImpl.write;
            getWidthXSAIIZE getwidthxsaiizeSerializer2 = webChatEventsTrackerImpl.read.serializer("HELP_CENTER_MOBILE_SDK_FETCH_URL_FAILED", bullet, null);
            this.RemoteActionCompatParcelizer = 1;
            return analyticsImpl2.track(getwidthxsaiizeSerializer2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.RemoteActionCompatParcelizer;
            if (i5 != 0) {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = IconCompatParcelizer + 17;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl3 = webChatEventsTrackerImpl.write;
            getWidthXSAIIZE getwidthxsaiizeSerializer3 = webChatEventsTrackerImpl.read.serializer("HELP_CENTER_MOBILE_SDK_BRIDGE_HANDSHAKING_FAILED", bullet, null);
            this.RemoteActionCompatParcelizer = 1;
            if (analyticsImpl3.track(getwidthxsaiizeSerializer3, this) != coroutineSingletons3) {
                return createfromparcel;
            }
            int i7 = IconCompatParcelizer + 91;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 / 0;
            }
            return coroutineSingletons3;
        }
        if (i2 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.RemoteActionCompatParcelizer;
            if (i9 != 0) {
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl4 = webChatEventsTrackerImpl.write;
            getWidthXSAIIZE getwidthxsaiizeSerializer4 = webChatEventsTrackerImpl.read.serializer("HELP_CENTER_MOBILE_SDK_BRIDGE_HANDSHAKING_SUCCESS", bullet, null);
            this.RemoteActionCompatParcelizer = 1;
            if (analyticsImpl4.track(getwidthxsaiizeSerializer4, this) != coroutineSingletons4) {
                return createfromparcel;
            }
            int i10 = IconCompatParcelizer + 125;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return coroutineSingletons4;
        }
        if (i2 != 4) {
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.RemoteActionCompatParcelizer;
            if (i12 != 0) {
                if (i12 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl5 = webChatEventsTrackerImpl.write;
            getWidthXSAIIZE getwidthxsaiizeSerializer5 = webChatEventsTrackerImpl.read.serializer("HELP_CENTER_MOBILE_SDK_ERROR_RETRY_BUTTON_CLICKED", bullet, null);
            this.RemoteActionCompatParcelizer = 1;
            return analyticsImpl5.track(getwidthxsaiizeSerializer5, this) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.RemoteActionCompatParcelizer;
        if (i13 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl6 = webChatEventsTrackerImpl.write;
            getWidthXSAIIZE getwidthxsaiizeSerializer6 = webChatEventsTrackerImpl.read.serializer("HELP_CENTER_MOBILE_SDK_LOADER_STARTED", bullet, null);
            this.RemoteActionCompatParcelizer = 1;
            return analyticsImpl6.track(getwidthxsaiizeSerializer6, this) == coroutineSingletons6 ? coroutineSingletons6 : createfromparcel;
        }
        int i14 = IconCompatParcelizer + 125;
        int i15 = i14 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i15;
        int i16 = i14 % 2;
        if (i13 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i17 = i15 + 59;
        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createfromparcel;
    }
}
