package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputBigV2Kt$MainText$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public static int RemoteActionCompatParcelizer;
    public static int read;
    public final /* synthetic */ BringIntoViewRequesterImpl IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextInputBigV2Kt$MainText$1$1$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = bringIntoViewRequesterImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r0 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return new com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1(r4.IconCompatParcelizer, r6, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r1 = new com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1(r4.IconCompatParcelizer, r6, r5);
        r6 = com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.MediaSessionCompatQueueItem + 101;
        com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.MediaDescriptionCompat = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if ((r6 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0 != 2) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r5, o.ShortNewsContentCardView r6) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.MediaSessionCompatQueueItem
            int r0 = r0 + 79
            int r1 = r0 % 128
            com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.MediaDescriptionCompat = r1
            int r0 = r0 % r5
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1c
            int r0 = r4.write
            r3 = 95
            int r3 = r3 / r1
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L42
            if (r0 == r5) goto L2d
            goto L24
        L1c:
            int r0 = r4.write
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L42
            if (r0 == r5) goto L2d
        L24:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r5 = r4.IconCompatParcelizer
            com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1 r0 = new com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1
            r1 = 3
            r0.<init>(r5, r6, r1)
            return r0
        L2d:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r0 = r4.IconCompatParcelizer
            com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1 r1 = new com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1
            r1.<init>(r0, r6, r5)
            int r6 = com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.MediaSessionCompatQueueItem
            int r6 = r6 + 101
            int r0 = r6 % 128
            com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.MediaDescriptionCompat = r0
            int r6 = r6 % r5
            if (r6 != 0) goto L40
            return r1
        L40:
            r5 = 0
            throw r5
        L42:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r5 = r4.IconCompatParcelizer
            com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1 r0 = new com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1
            r0.<init>(r5, r6, r2)
            return r0
        L4a:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r5 = r4.IconCompatParcelizer
            com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1 r0 = new com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1
            r0.<init>(r5, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt$MainText$1$1$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            if (i3 != 1) {
                return i3 != 2 ? ((TextInputBigV2Kt$MainText$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((TextInputBigV2Kt$MainText$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            return ((TextInputBigV2Kt$MainText$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((TextInputBigV2Kt$MainText$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaSessionCompatQueueItem + 93;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = this.write;
        Object obj2 = createFromParcel.INSTANCE;
        BringIntoViewRequesterImpl bringIntoViewRequesterImpl = this.IconCompatParcelizer;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.serializer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (DelayKt.delay(250L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            int i5 = MediaDescriptionCompat + 17;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                if (i4 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 2;
            if (bringIntoViewRequesterImpl.bringIntoView(null, this) != coroutineSingletons) {
                return obj2;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.serializer;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (DelayKt.delay(300L, this) != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = MediaDescriptionCompat + 57;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 2;
            if (bringIntoViewRequesterImpl.bringIntoView(null, this) != coroutineSingletons2) {
                return obj2;
            }
            return coroutineSingletons2;
        }
        if (i3 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.serializer;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (DelayKt.delay(300L, this) != coroutineSingletons3) {
                }
                return coroutineSingletons3;
            }
            int i10 = MediaSessionCompatQueueItem + 105;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0 ? i9 != 1 : i9 != 1) {
                if (i9 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 2;
            if (bringIntoViewRequesterImpl.bringIntoView(null, this) != coroutineSingletons3) {
                return obj2;
            }
            return coroutineSingletons3;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.serializer;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 1;
            if (DelayKt.delay(300L, this) == coroutineSingletons4) {
                obj2 = coroutineSingletons4;
            }
            i = MediaDescriptionCompat + 21;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return obj2;
            }
            throw null;
        }
        int i12 = MediaSessionCompatQueueItem + 61;
        MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0 ? i11 == 1 : i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else if (i11 == 2) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        i = MediaDescriptionCompat + 21;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return obj2;
        }
        throw null;
        this.serializer = 2;
        if (bringIntoViewRequesterImpl.bringIntoView(null, this) == coroutineSingletons4) {
            obj2 = coroutineSingletons4;
        }
        i = MediaDescriptionCompat + 21;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return obj2;
        }
        throw null;
    }

    public static int serializer() {
        int i = read;
        int i2 = i % 8989281;
        read = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
