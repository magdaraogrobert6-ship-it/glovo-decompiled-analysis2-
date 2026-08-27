package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessanimateWithTarget;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomState$startFling$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ ZoomState RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZoomState$startFling$2$1(ZoomState zoomState, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = zoomState;
        this.write = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return new com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1(r16.RemoteActionCompatParcelizer, r16.write, r18, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return new com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1(r16.RemoteActionCompatParcelizer, r16.write, r18, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r2 != 2) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r17, o.ShortNewsContentCardView r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1.read
            int r2 = r2 + 59
            int r3 = r2 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1.MediaMetadataCompat = r3
            int r2 = r2 % r1
            r3 = 1
            if (r2 != 0) goto L1e
            int r2 = r0.serializer
            r4 = 29
            int r4 = r4 / 0
            if (r2 == 0) goto L50
            if (r2 == r3) goto L42
            if (r2 == r1) goto L34
            goto L26
        L1e:
            int r2 = r0.serializer
            if (r2 == 0) goto L50
            if (r2 == r3) goto L42
            if (r2 == r1) goto L34
        L26:
            long r6 = r0.write
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r5 = r0.RemoteActionCompatParcelizer
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1 r1 = new com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1
            r9 = 3
            r4 = r1
            r8 = r18
            r4.<init>(r5, r6, r8, r9)
            return r1
        L34:
            long r12 = r0.write
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r11 = r0.RemoteActionCompatParcelizer
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1 r1 = new com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1
            r15 = 2
            r10 = r1
            r14 = r18
            r10.<init>(r11, r12, r14, r15)
            return r1
        L42:
            long r4 = r0.write
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r3 = r0.RemoteActionCompatParcelizer
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1 r1 = new com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1
            r7 = 1
            r2 = r1
            r6 = r18
            r2.<init>(r3, r4, r6, r7)
            return r1
        L50:
            long r10 = r0.write
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r9 = r0.RemoteActionCompatParcelizer
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1 r2 = new com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1
            r13 = 0
            r8 = r2
            r12 = r18
            r8.<init>(r9, r10, r12, r13)
            int r3 = com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1.read
            int r3 = r3 + 11
            int r4 = r3 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1.MediaMetadataCompat = r4
            int r3 = r3 % r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.image.zoomable.ZoomState$startFling$2$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 53;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            if (i4 != 1) {
                return i4 != 2 ? ((ZoomState$startFling$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((ZoomState$startFling$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            return ((ZoomState$startFling$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((ZoomState$startFling$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaMetadataCompat + 63;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.write;
        ZoomState zoomState = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Animatable animatable = zoomState.serializer;
                Float f = new Float(Velocity.m3911getXimpl(j));
                accessanimateWithTarget accessanimatewithtarget = zoomState.MediaDescriptionCompat;
                this.IconCompatParcelizer = 1;
                return Animatable.IconCompatParcelizer(animatable, f, accessanimatewithtarget, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            int i4 = MediaMetadataCompat + 53;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Animatable animatable2 = zoomState.serializer;
                Float f2 = new Float(Float.intBitsToFloat((int) (j >> 32)));
                this.IconCompatParcelizer = 1;
                return animatable2.snapTo(f2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = MediaMetadataCompat + 25;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        if (i2 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Animatable animatable3 = zoomState.RemoteActionCompatParcelizer;
                Float f3 = new Float(Velocity.m3912getYimpl(j));
                accessanimateWithTarget accessanimatewithtarget2 = zoomState.MediaDescriptionCompat;
                this.IconCompatParcelizer = 1;
                return Animatable.IconCompatParcelizer(animatable3, f3, accessanimatewithtarget2, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            }
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = read + 23;
            MediaMetadataCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.IconCompatParcelizer;
        if (i10 != 0) {
            int i11 = MediaMetadataCompat + 79;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0 ? i10 != 1 : i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i12 = read + 75;
            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Animatable animatable4 = zoomState.RemoteActionCompatParcelizer;
        Float f4 = new Float(Float.intBitsToFloat((int) (j & 4294967295L)));
        this.IconCompatParcelizer = 1;
        if (animatable4.snapTo(f4, this) != coroutineSingletons4) {
            return createfromparcel;
        }
        int i14 = read + 45;
        MediaMetadataCompat = i14 % Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            return coroutineSingletons4;
        }
        obj2.hashCode();
        throw null;
    }
}
