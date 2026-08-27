package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.SnapFlingBehaviorKt;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes3.dex */
public final class ScannedChipAnimationKt$ScannedChipAnimation$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompat = 1;
    public final /* synthetic */ Animatable IconCompatParcelizer;
    public final /* synthetic */ float MediaBrowserCompatMediaItem;
    public final /* synthetic */ Animatable MediaDescriptionCompat;
    public final /* synthetic */ float MediaMetadataCompat;
    public final /* synthetic */ Animatable MediaSessionCompatQueueItem;
    public int PlaybackStateCompatCustomAction;
    public /* synthetic */ Object RatingCompat;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ Animatable read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ float write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaBrowserCompatMediaItem = 1;
        private static int read;
        public final /* synthetic */ Animatable IconCompatParcelizer;
        public final /* synthetic */ float RemoteActionCompatParcelizer;
        public final /* synthetic */ int serializer;
        public int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Animatable animatable, float f, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.IconCompatParcelizer = animatable;
            this.RemoteActionCompatParcelizer = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            if (this.serializer != 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 1);
                int i2 = MediaBrowserCompatMediaItem + 73;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return anonymousClass1;
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 0);
            int i4 = read + 61;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 0;
            }
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            return ((com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r5 = ((com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
            r6 = com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.MediaBrowserCompatMediaItem + 27;
            com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r6 = r6 % 2;
         */
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.read
                int r1 = r1 + 63
                int r2 = r1 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.MediaBrowserCompatMediaItem = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1d
                int r1 = r4.serializer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                r3 = 96
                int r3 = r3 / 0
                if (r1 == 0) goto L3b
                goto L27
            L1d:
                int r1 = r4.serializer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                if (r1 == 0) goto L3b
            L27:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1$1 r5 = (com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                int r6 = com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.MediaBrowserCompatMediaItem
                int r6 = r6 + 27
                int r1 = r6 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.read = r1
                int r6 = r6 % r0
                return r5
            L3b:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1$1 r5 = (com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedChipAnimationKt$ScannedChipAnimation$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = MediaBrowserCompatMediaItem + 15;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            float f = this.RemoteActionCompatParcelizer;
            Animatable animatable = this.IconCompatParcelizer;
            if (i4 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.write;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Float f2 = new Float(f);
                    Object[] objArr = {600, 0, SnapFlingBehaviorKt.write, 2};
                    requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr);
                    this.write = 1;
                    return Animatable.IconCompatParcelizer(animatable, f2, requiredwidthinvpy3zn4default, this, 12) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = MediaBrowserCompatMediaItem + 41;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i7 = 64 / 0;
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.write;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Float f3 = new Float(f);
                Object[] objArr2 = {600, 0, SnapFlingBehaviorKt.write, 2};
                requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default2 = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr2);
                this.write = 1;
                if (Animatable.IconCompatParcelizer(animatable, f3, requiredwidthinvpy3zn4default2, this, 12) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i9 = read + 9;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons2;
            }
            int i11 = read + 53;
            int i12 = i11 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i12;
            int i13 = i11 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i14 = i12 + 79;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannedChipAnimationKt$ScannedChipAnimation$1$1(float f, float f2, float f3, float f4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Animatable animatable, Animatable animatable2, Animatable animatable3, Animatable animatable4, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = f;
        this.MediaMetadataCompat = f2;
        this.write = f3;
        this.MediaBrowserCompatMediaItem = f4;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = animatable;
        this.MediaSessionCompatQueueItem = animatable2;
        this.IconCompatParcelizer = animatable3;
        this.read = animatable4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 95;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            objInvokeSuspend = ((ScannedChipAnimationKt$ScannedChipAnimation$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            int i3 = 29 / 0;
        } else {
            objInvokeSuspend = ((ScannedChipAnimationKt$ScannedChipAnimation$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i4 = PlaybackStateCompat + 25;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ScannedChipAnimationKt$ScannedChipAnimation$1$1 scannedChipAnimationKt$ScannedChipAnimation$1$1 = new ScannedChipAnimationKt$ScannedChipAnimation$1$1(this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.write, this.MediaBrowserCompatMediaItem, this.serializer, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, this.read, shortNewsContentCardView);
        scannedChipAnimationKt$ScannedChipAnimation$1$1.RatingCompat = obj;
        int i2 = PlaybackStateCompat + 85;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return scannedChipAnimationKt$ScannedChipAnimation$1$1;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RatingCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.PlaybackStateCompatCustomAction;
        int i3 = 0;
        int i4 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            int i5 = MediaSessionCompatToken + 41;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = MediaSessionCompatToken + 19;
                PlaybackStateCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 38 / 0;
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            float f = this.RemoteActionCompatParcelizer;
            float f2 = this.MediaMetadataCompat;
            float f3 = this.write;
            float f4 = this.MediaBrowserCompatMediaItem;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this.MediaDescriptionCompat, f - f2, shortNewsContentCardView, i3), 3);
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this.MediaSessionCompatQueueItem, f3 - f4, shortNewsContentCardView, i4), 3);
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.IconCompatParcelizer, null, 4), 3);
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(this.read, null, 5), 3);
            this.RatingCompat = null;
            this.PlaybackStateCompatCustomAction = 1;
            if (DelayKt.delay(600L, this) == coroutineSingletons) {
                int i9 = MediaSessionCompatToken + 107;
                PlaybackStateCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        this.serializer.invoke();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i10 = MediaSessionCompatToken + 77;
        PlaybackStateCompat = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            int i11 = 89 / 0;
        }
        return createfromparcel;
    }
}
