package com.roadrunner.web.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import o.EnumColumnAdapter;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.executeAsList;
import o.getContentViewGroupParentLayout;
import o.r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8;
import o.r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U;
import o.r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0;
import o.r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setRegisteredPushToken;
import o.setUdmandroid_sdk_base_release;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewViewModel$startTimeoutTimer$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ WebViewViewModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewViewModel$startTimeoutTimer$1(WebViewViewModel webViewViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = webViewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        WebViewViewModel webViewViewModel = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            WebViewViewModel$startTimeoutTimer$1 webViewViewModel$startTimeoutTimer$1 = new WebViewViewModel$startTimeoutTimer$1(webViewViewModel, shortNewsContentCardView, 0);
            int i4 = read + 99;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return webViewViewModel$startTimeoutTimer$1;
        }
        int i6 = 1;
        if (i3 == 1) {
            return new WebViewViewModel$startTimeoutTimer$1(webViewViewModel, shortNewsContentCardView, i6);
        }
        WebViewViewModel$startTimeoutTimer$1 webViewViewModel$startTimeoutTimer$2 = new WebViewViewModel$startTimeoutTimer$1(webViewViewModel, shortNewsContentCardView, i);
        int i7 = IconCompatParcelizer + 1;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return webViewViewModel$startTimeoutTimer$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((WebViewViewModel$startTimeoutTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((WebViewViewModel$startTimeoutTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((WebViewViewModel$startTimeoutTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 33;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        WebViewViewModel webViewViewModel = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 != 0) {
                int i5 = IconCompatParcelizer;
                int i6 = i5 + 85;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i8 = IconCompatParcelizer + 111;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return null;
                }
                int i10 = i5 + 45;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i12 = IconCompatParcelizer + 103;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.write = 1;
                if (DelayKt.delay(15000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            setUdmandroid_sdk_base_release setudmandroid_sdk_base_release = webViewViewModel.MediaSessionCompatQueueItem;
            String str = (String) webViewViewModel.read.read();
            EnumColumnAdapter enumColumnAdapter = setudmandroid_sdk_base_release.read;
            executeAsList executeaslist = executeAsList.RXP;
            if (str == null) {
                str = "";
            }
            Map mapSingletonMap = Collections.singletonMap("url", str);
            mapSingletonMap.getClass();
            ((SentryCriticalIssueLogger) enumColumnAdapter).write("web_view_timeout", executeaslist, "T&C Page load exceeds 15s limit", mapSingletonMap);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(webViewViewModel), null, null, new WebViewViewModel$startTimeoutTimer$1(webViewViewModel, shortNewsContentCardView, i), 3);
            return createfromparcel;
        }
        if (i3 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.write;
            if (i14 != 0) {
                if (i14 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setRegisteredPushToken setregisteredpushtoken = webViewViewModel.PlaybackStateCompatCustomAction;
            r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U r8lambdac88k0njtd0ztnqmfv8dtgztf_u = new r8lambdaC88K0nJTd0ZtnQMFV8dTGzTF_U((String) webViewViewModel.read.read(), -1, r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.COMMUNICATION_TIMEOUT, "Page failed to respond within threshold");
            this.write = 1;
            Object objEmit = setregisteredpushtoken.read.emit(r8lambdac88k0njtd0ztnqmfv8dtgztf_u, this);
            if (objEmit != coroutineSingletons2) {
                int i15 = IconCompatParcelizer + 113;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objEmit = createfromparcel;
            }
            return objEmit == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = this.write;
        if (i17 != 0) {
            int i18 = read + 97;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0 ? i17 != 1 : i17 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0 r8lambdadgzfnzek_ynxssj7dowrjatonk0 = webViewViewModel.MediaDescriptionCompat;
            if (r8lambdadgzfnzek_ynxssj7dowrjatonk0 == null) {
                r8lambdadgzfnzek_ynxssj7dowrjatonk0 = new r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0(r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.CLOSED_BY_USER, null, null);
            }
            setRegisteredPushToken setregisteredpushtoken2 = webViewViewModel.PlaybackStateCompatCustomAction;
            this.write = 1;
            Object objEmit2 = setregisteredpushtoken2.read.emit(r8lambdadgzfnzek_ynxssj7dowrjatonk0, this);
            if (objEmit2 != coroutineSingletons3) {
                objEmit2 = createfromparcel;
            }
            if (objEmit2 == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        }
        webViewViewModel.MediaDescriptionCompat = null;
        return createfromparcel;
    }
}
