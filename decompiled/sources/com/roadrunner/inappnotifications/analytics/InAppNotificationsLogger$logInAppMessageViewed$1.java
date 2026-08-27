package com.roadrunner.inappnotifications.analytics;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationsLogger$logInAppMessageViewed$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ N$b read;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InAppNotificationsLogger$logInAppMessageViewed$1(N$b n$b, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer != 0) {
            return new InAppNotificationsLogger$logInAppMessageViewed$1(this.read, shortNewsContentCardView, 1);
        }
        InAppNotificationsLogger$logInAppMessageViewed$1 inAppNotificationsLogger$logInAppMessageViewed$1 = new InAppNotificationsLogger$logInAppMessageViewed$1(this.read, shortNewsContentCardView, 0);
        int i4 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return inAppNotificationsLogger$logInAppMessageViewed$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return ((com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r5 = ((com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer + 61;
        com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = r4.serializer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 91
            int r3 = r3 / 0
            if (r1 == 0) goto L32
            goto L27
        L1d:
            int r1 = r4.serializer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L32
        L27:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1 r5 = (com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        L32:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1 r5 = (com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer
            int r6 = r6 + 61
            int r1 = r6 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r7 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r7 != 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r1 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer + 59;
        com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r0 = 31 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        r10 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer + 1;
        com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r9.write = 1;
        r10 = com.sentiance.core.model.events.N$b.access$baseParamMap(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r10 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        ((o.decode) r6.read).logEvent("in_app_message_content_displayed", (java.util.Map) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r7 = r9.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r7 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r1 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer + 65;
        com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r7 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7 != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r9.write = 1;
        r10 = com.sentiance.core.model.events.N$b.access$baseParamMap(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r10 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        ((o.decode) r6.read).logEvent("in_app_message_viewed", (java.util.Map) r10);
        r10 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer + 37;
        com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r7 = r9.write;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            if (r1 == 0) goto L1f
            int r1 = r9.serializer
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            com.sentiance.core.model.events.N$b r6 = r9.read
            r7 = 14
            int r7 = r7 / 0
            if (r1 == 0) goto L6c
            goto L27
        L1f:
            int r1 = r9.serializer
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            com.sentiance.core.model.events.N$b r6 = r9.read
            if (r1 == 0) goto L6c
        L27:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r7 = r9.write
            if (r7 == 0) goto L52
            if (r7 != r4) goto L46
            int r1 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L42
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r0 = 31
            int r0 = r0 / 0
            goto L5f
        L42:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L5f
        L46:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            int r10 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer
            int r10 = r10 + r4
            int r1 = r10 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r1
            int r10 = r10 % r0
            goto L6b
        L52:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r9.write = r4
            java.io.Serializable r10 = com.sentiance.core.model.events.N$b.access$baseParamMap(r6, r9)
            if (r10 != r1) goto L5f
            r2 = r1
            goto L6b
        L5f:
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r0 = r6.read
            o.decode r0 = (o.decode) r0
            java.lang.String r1 = "in_app_message_content_displayed"
            r0.logEvent(r1, r10)
            r2 = r5
        L6b:
            return r2
        L6c:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r7 = r9.write
            if (r7 == 0) goto L8a
            int r1 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer
            int r1 = r1 + 65
            int r8 = r1 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer = r8
            int r1 = r1 % r0
            if (r1 != 0) goto L80
            if (r7 != 0) goto L86
            goto L82
        L80:
            if (r7 != r4) goto L86
        L82:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L97
        L86:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            goto Lac
        L8a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r9.write = r4
            java.io.Serializable r10 = com.sentiance.core.model.events.N$b.access$baseParamMap(r6, r9)
            if (r10 != r1) goto L97
            r2 = r1
            goto Lac
        L97:
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r1 = r6.read
            o.decode r1 = (o.decode) r1
            java.lang.String r2 = "in_app_message_viewed"
            r1.logEvent(r2, r10)
            int r10 = com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.RemoteActionCompatParcelizer
            int r10 = r10 + 37
            int r1 = r10 % 128
            com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.IconCompatParcelizer = r1
            int r10 = r10 % r0
            r2 = r5
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageViewed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
