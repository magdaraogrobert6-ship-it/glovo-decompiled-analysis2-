package com.roadrunner.rrds.compose.component.buttons.slider;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class SliderButtonContainerKt$SliderCore$2$1$1$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ float MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ float MediaMetadataCompat;
    public int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ Animatable serializer;
    public final /* synthetic */ onViewAttachedToWindow write;

    /* JADX INFO: renamed from: com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
        public int read;
        public final /* synthetic */ int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 9;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.serializer != 0) {
                return new AnonymousClass1(this.RemoteActionCompatParcelizer, shortNewsContentCardView, 1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.RemoteActionCompatParcelizer, shortNewsContentCardView, 0);
            int i3 = IconCompatParcelizer + 3;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 43;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 != 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = IconCompatParcelizer + 109;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        
            if (r9 == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write + 75;
            r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            if ((r1 % 2) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r9 != 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            if (r9 != 1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            r3 = r3 + 27;
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if ((r3 % 2) != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
            r8.setValue(java.lang.Boolean.TRUE);
            r10.read = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r10) != r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            r11 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write + 35;
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        
            if ((r11 % 2) != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        
            r11 = 34 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        
            r8.setValue(java.lang.Boolean.FALSE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        
            r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            r9 = r10.read;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        
            if (r9 == 0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer;
            r3 = r1 + 103;
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        
            if ((r3 % 2) == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        
            if (r9 != 0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
        
            if (r9 != 1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
        
            r1 = r1 + 123;
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r1 = r1 % 2;
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
        
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
        
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11);
            r10.read = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r10) != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
        
            r8.setValue(java.lang.Boolean.TRUE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            r9 = r10.read;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write
                int r1 = r1 + 125
                int r2 = r1 % 128
                com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer = r2
                int r1 = r1 % r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r3 = 1000(0x3e8, double:4.94E-321)
                r5 = 0
                r6 = 1
                if (r1 != 0) goto L21
                int r1 = r10.serializer
                o.createFromParcel r7 = o.createFromParcel.INSTANCE
                o.PopulateViewStructure_androidKtpopulate7 r8 = r10.RemoteActionCompatParcelizer
                r9 = 19
                int r9 = r9 / 0
                if (r1 == 0) goto L7f
                goto L29
            L21:
                int r1 = r10.serializer
                o.createFromParcel r7 = o.createFromParcel.INSTANCE
                o.PopulateViewStructure_androidKtpopulate7 r8 = r10.RemoteActionCompatParcelizer
                if (r1 == 0) goto L7f
            L29:
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r9 = r10.read
                if (r9 == 0) goto L57
                int r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write
                int r1 = r1 + 75
                int r3 = r1 % 128
                com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L3d
                if (r9 != 0) goto L53
                goto L3f
            L3d:
                if (r9 != r6) goto L53
            L3f:
                int r3 = r3 + 27
                int r1 = r3 % 128
                com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write = r1
                int r3 = r3 % r0
                if (r3 != 0) goto L4c
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                goto L78
            L4c:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                r5.hashCode()
                throw r5
            L53:
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
                goto L7e
            L57:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                java.lang.Boolean r11 = java.lang.Boolean.TRUE
                r8.setValue(r11)
                r10.read = r6
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r3, r10)
                if (r11 != r1) goto L78
                int r11 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write
                int r11 = r11 + 35
                int r2 = r11 % 128
                com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer = r2
                int r11 = r11 % r0
                if (r11 != 0) goto L76
                r11 = 34
                int r11 = r11 / 0
            L76:
                r5 = r1
                goto L7e
            L78:
                java.lang.Boolean r11 = java.lang.Boolean.FALSE
                r8.setValue(r11)
                r5 = r7
            L7e:
                return r5
            L7f:
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r9 = r10.read
                if (r9 == 0) goto La4
                int r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.IconCompatParcelizer
                int r3 = r1 + 103
                int r4 = r3 % 128
                com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write = r4
                int r3 = r3 % r0
                if (r3 == 0) goto L93
                if (r9 != 0) goto La0
                goto L95
            L93:
                if (r9 != r6) goto La0
            L95:
                int r1 = r1 + 123
                int r2 = r1 % 128
                com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.write = r2
                int r1 = r1 % r0
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                goto Lb1
            La0:
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
                goto Lb7
            La4:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
                r10.read = r6
                java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r3, r10)
                if (r11 != r1) goto Lb1
                r5 = r1
                goto Lb7
            Lb1:
                java.lang.Boolean r11 = java.lang.Boolean.TRUE
                r8.setValue(r11)
                r5 = r7
            Lb7:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderButtonContainerKt$SliderCore$2$1$1$2$1(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Animatable animatable, float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, float f2, onViewAttachedToWindow onviewattachedtowindow, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = animatable;
        this.MediaBrowserCompatMediaItem = f;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = f2;
        this.write = onviewattachedtowindow;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 65;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((SliderButtonContainerKt$SliderCore$2$1$1$2$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = PlaybackStateCompatCustomAction + 69;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        SliderButtonContainerKt$SliderCore$2$1$1$2$1 sliderButtonContainerKt$SliderCore$2$1$1$2$1 = new SliderButtonContainerKt$SliderCore$2$1$1$2$1(this.RemoteActionCompatParcelizer, this.serializer, this.MediaBrowserCompatMediaItem, this.read, this.MediaMetadataCompat, this.write, this.IconCompatParcelizer, shortNewsContentCardView);
        sliderButtonContainerKt$SliderCore$2$1$1$2$1.MediaDescriptionCompat = obj;
        int i2 = PlaybackStateCompatCustomAction + 5;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
        return sliderButtonContainerKt$SliderCore$2$1$1$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        if (r12 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r12 == r3) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.MediaSessionCompatQueueItem
            r2 = 5
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.PlaybackStateCompatCustomAction = r3
            int r1 = r1 % r0
            java.lang.Object r1 = r11.MediaDescriptionCompat
            o.getContentViewGroupParentLayout r1 = (o.getContentViewGroupParentLayout) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r11.RatingCompat
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L33
            if (r4 == r5) goto L2f
            if (r4 != r0) goto L29
            int r1 = com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.PlaybackStateCompatCustomAction
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L9b
        L29:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r6
        L2f:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L78
        L33:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            o.onViewAttachedToWindow r12 = r11.write
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.animation.core.Animatable r4 = r11.serializer
            o.PopulateViewStructure_androidKtpopulate7 r7 = r11.IconCompatParcelizer
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            r8 = 12
            r9 = 1153138688(0x44bb8000, float:1500.0)
            r10 = 0
            if (r12 >= 0) goto L7b
            com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1$1 r12 = new com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1$1
            r0 = 0
            r12.<init>(r7, r6, r0)
            r0 = 3
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r1, r6, r6, r12, r0)
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r12 = r11.RemoteActionCompatParcelizer
            r12.invoke()
            float r12 = r11.MediaBrowserCompatMediaItem
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r12)
            o.width r12 = kotlinx.coroutines.DelayKt.IconCompatParcelizer(r10, r9, r2, r6)
            r11.MediaDescriptionCompat = r6
            r11.RatingCompat = r5
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.IconCompatParcelizer(r4, r0, r12, r11, r8)
            if (r12 != r3) goto L78
            goto L9a
        L78:
            o.anglek4lQ0M r12 = (o.anglek4lQ0M) r12
            goto L9d
        L7b:
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r12 = r11.read
            r12.invoke()
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r7.setValue(r12)
            float r12 = r11.MediaMetadataCompat
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r12)
            o.width r12 = kotlinx.coroutines.DelayKt.IconCompatParcelizer(r10, r9, r2, r6)
            r11.MediaDescriptionCompat = r6
            r11.RatingCompat = r0
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.IconCompatParcelizer(r4, r1, r12, r11, r8)
            if (r12 != r3) goto L9b
        L9a:
            return r3
        L9b:
            o.anglek4lQ0M r12 = (o.anglek4lQ0M) r12
        L9d:
            o.createFromParcel r12 = o.createFromParcel.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
