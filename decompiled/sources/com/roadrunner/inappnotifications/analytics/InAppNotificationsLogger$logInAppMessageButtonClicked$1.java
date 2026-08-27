package com.roadrunner.inappnotifications.analytics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationsLogger$logInAppMessageButtonClicked$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public int serializer;
    public final /* synthetic */ N$b write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationsLogger$logInAppMessageButtonClicked$1(N$b n$b, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = n$b;
        this.read = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = 1;
        int i3 = IconCompatParcelizer + 1;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        String str = this.read;
        N$b n$b = this.write;
        if (i5 == 0) {
            return new InAppNotificationsLogger$logInAppMessageButtonClicked$1(n$b, str, shortNewsContentCardView, 0);
        }
        InAppNotificationsLogger$logInAppMessageButtonClicked$1 inAppNotificationsLogger$logInAppMessageButtonClicked$1 = new InAppNotificationsLogger$logInAppMessageButtonClicked$1(n$b, str, shortNewsContentCardView, i2);
        int i6 = MediaSessionCompatQueueItem + 103;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return inAppNotificationsLogger$logInAppMessageButtonClicked$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((InAppNotificationsLogger$logInAppMessageButtonClicked$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((InAppNotificationsLogger$logInAppMessageButtonClicked$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 45;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        String str = this.read;
        N$b n$b = this.write;
        Object obj3 = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                obj = N$b.access$baseParamMap(n$b, this);
                if (obj == coroutineSingletons) {
                    int i4 = MediaSessionCompatQueueItem + 25;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return coroutineSingletons;
                    }
                    obj3.hashCode();
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            Map map = (Map) obj;
            map.put("shared_platform", str);
            ((decode) n$b.read).logEvent("in_app_message_media_shared_platforms", map);
            return obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.serializer;
        if (i5 != 0) {
            int i6 = MediaSessionCompatQueueItem;
            int i7 = i6 + 109;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i5 == 1) {
                int i9 = i6 + 35;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i10 = 64 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                Map map2 = (Map) obj;
                map2.put("button_id", str);
                ((decode) n$b.read).logEvent("in_app_message_button_clicked", map2);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 1;
            obj = N$b.access$baseParamMap(n$b, this);
            if (obj == coroutineSingletons2) {
                obj2 = coroutineSingletons2;
            } else {
                Map map3 = (Map) obj;
                map3.put("button_id", str);
                ((decode) n$b.read).logEvent("in_app_message_button_clicked", map3);
            }
        }
        int i11 = IconCompatParcelizer + 93;
        MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return obj2;
        }
        throw null;
    }
}
