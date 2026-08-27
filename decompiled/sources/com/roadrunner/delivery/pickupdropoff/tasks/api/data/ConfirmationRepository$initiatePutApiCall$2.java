package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.ui.graphics.Fields;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$initiatePutApiCall$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ String IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ ConfirmationRepository serializer;
    public final /* synthetic */ Map write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfirmationRepository$initiatePutApiCall$2(ConfirmationRepository confirmationRepository, String str, Map map, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.serializer = confirmationRepository;
        this.IconCompatParcelizer = str;
        this.write = map;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 != 0) {
            return ((ConfirmationRepository$initiatePutApiCall$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((ConfirmationRepository$initiatePutApiCall$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaSessionCompatQueueItem + 17;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 45;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read != 0) {
            return new ConfirmationRepository$initiatePutApiCall$2(this.serializer, this.IconCompatParcelizer, this.write, shortNewsContentCardView, 1);
        }
        ConfirmationRepository$initiatePutApiCall$2 confirmationRepository$initiatePutApiCall$2 = new ConfirmationRepository$initiatePutApiCall$2(this.serializer, this.IconCompatParcelizer, this.write, shortNewsContentCardView, 0);
        int i4 = MediaSessionCompatQueueItem + 41;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return confirmationRepository$initiatePutApiCall$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r8 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat + 55;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        r10 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem + 107;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r10 = r7.RemoteActionCompatParcelizer;
        r9.RemoteActionCompatParcelizer = 1;
        r10 = r10.IconCompatParcelizer(r6, r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r10 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r10 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem + 57;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r8 = r9.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r8 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem + 69;
        com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r8 != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r10);
        r10 = r7.RemoteActionCompatParcelizer;
        r9.RemoteActionCompatParcelizer = 1;
        r10 = r10.read(r6, r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r10 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r8 = r9.RemoteActionCompatParcelizer;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            if (r1 != 0) goto L21
            int r1 = r9.read
            java.util.Map r5 = r9.write
            java.lang.String r6 = r9.IconCompatParcelizer
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r7 = r9.serializer
            r8 = 58
            int r8 = r8 / 0
            if (r1 == 0) goto L6b
            goto L2b
        L21:
            int r1 = r9.read
            java.util.Map r5 = r9.write
            java.lang.String r6 = r9.IconCompatParcelizer
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository r7 = r9.serializer
            if (r1 == 0) goto L6b
        L2b:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r8 = r9.RemoteActionCompatParcelizer
            if (r8 == 0) goto L53
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat
            int r1 = r1 + 55
            int r5 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L3f
            if (r8 != r4) goto L45
            goto L41
        L3f:
            if (r8 != r4) goto L45
        L41:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L6a
        L45:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            int r10 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem
            int r10 = r10 + 107
            int r1 = r10 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r1
            int r10 = r10 % r0
            r10 = r2
            goto L6a
        L53:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c r10 = r7.RemoteActionCompatParcelizer
            r9.RemoteActionCompatParcelizer = r4
            java.lang.Object r10 = r10.IconCompatParcelizer(r6, r5, r9)
            if (r10 != r1) goto L6a
            int r10 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem
            int r10 = r10 + 57
            int r2 = r10 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r2
            int r10 = r10 % r0
            r10 = r1
        L6a:
            return r10
        L6b:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r8 = r9.RemoteActionCompatParcelizer
            if (r8 == 0) goto L85
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaSessionCompatQueueItem
            int r1 = r1 + 69
            int r5 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.MediaDescriptionCompat = r5
            int r1 = r1 % r0
            if (r8 != r4) goto L80
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L93
        L80:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            r10 = r2
            goto L93
        L85:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c r10 = r7.RemoteActionCompatParcelizer
            r9.RemoteActionCompatParcelizer = r4
            java.lang.Object r10 = r10.read(r6, r5, r9)
            if (r10 != r1) goto L93
            r10 = r1
        L93:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiatePutApiCall$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
