package com.roadrunner.customerchat.selfservice.presentation;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ WebChatViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1(WebChatViewModel webChatViewModel, ShortNewsContentCardView shortNewsContentCardView, boolean z) {
        super(2, shortNewsContentCardView);
        this.write = webChatViewModel;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1 webChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1 = new WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1(this.write, shortNewsContentCardView, this.IconCompatParcelizer);
        webChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.serializer = obj;
        int i2 = MediaDescriptionCompat + 39;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return webChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 87;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r4.sendMessage(r10, r9) == r1) goto L27;
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
            java.lang.Object r1 = r9.serializer
            o.getContentViewGroupParentLayout r1 = (o.getContentViewGroupParentLayout) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.RemoteActionCompatParcelizer
            boolean r3 = r9.IconCompatParcelizer
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel r4 = r9.write
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3e
            int r7 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaDescriptionCompat
            int r7 = r7 + 47
            int r8 = r7 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaMetadataCompat = r8
            int r7 = r7 % r0
            if (r2 == r6) goto L38
            int r8 = r8 + 69
            int r1 = r8 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaDescriptionCompat = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L2b
            r0 = 4
            if (r2 != r0) goto L32
            goto L2d
        L2b:
            if (r2 != r0) goto L32
        L2d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto La5
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r5
        L38:
            int r2 = r9.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L63
        L3e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            o.processingInstruction r10 = r4.ensureViewModelStore
            java.time.Clock r10 = r10.write
            long r7 = r10.millis()
            java.lang.String r10 = "HOST_NOTIFIES_ABOUT_WEBVIEW_VISIBILITY_CHANGE_"
            java.lang.String r10 = bo.app.af$$ExternalSyntheticOutline0.m(r7, r10)
            o.flatMapAnnotations r2 = new o.flatMapAnnotations
            r2.<init>(r10, r3)
            r9.serializer = r5
            r10 = 0
            r9.read = r10
            r9.RemoteActionCompatParcelizer = r6
            java.lang.Object r2 = r4.sendMessage(r2, r9)
            if (r2 != r1) goto L62
            goto La4
        L62:
            r2 = r10
        L63:
            r10 = r3 ^ 1
            if (r10 == r6) goto La5
            int r10 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaMetadataCompat
            int r10 = r10 + 65
            int r3 = r10 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaDescriptionCompat = r3
            int r10 = r10 % r0
            o.getHasStaleResolvedFonts r10 = r4.MediaSessionCompatQueueItem
            kotlinx.coroutines.flow.StateFlow r10 = r10.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            java.lang.Object r10 = r10.read()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L81
            goto La5
        L81:
            int r10 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaDescriptionCompat
            int r10 = r10 + 39
            int r3 = r10 % 128
            com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.MediaMetadataCompat = r3
            int r10 = r10 % r0
            o.NonNullValueClassSaver r10 = r4.accessensureViewModelStore
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData r3 = r4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
            com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData$Delivery r3 = r3.RemoteActionCompatParcelizer
            o.TextUnitTypeCompanion r3 = com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel.serializer(r3)
            o.getTextPaintui_text r10 = r10.IconCompatParcelizer(r3)
            r9.serializer = r5
            r9.read = r2
            r9.RemoteActionCompatParcelizer = r0
            java.lang.Object r10 = r4.sendMessage(r10, r9)
            if (r10 != r1) goto La5
        La4:
            return r1
        La5:
            o.createFromParcel r10 = o.createFromParcel.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$onVisibilityChange$$inlined$launchWithGenericExceptionHandler$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
