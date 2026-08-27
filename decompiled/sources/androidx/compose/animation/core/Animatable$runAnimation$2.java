package androidx.compose.animation.core;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.UpdatableAnimationState;
import o.accessdispatchTrackpadScroll;
import o.accessisMainThread;
import o.anglek4lQ0M;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.getHoldoutVariationName;
import o.onPan;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(DeliveryAcceptDataRepository deliveryAcceptDataRepository, String str, String str2, String str3, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = deliveryAcceptDataRepository;
        this.MediaSessionCompatQueueItem = str;
        this.serializer = str2;
        this.read = str3;
        this.IconCompatParcelizer = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable animatable, Object obj, onPan onpan, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = animatable;
        this.serializer = obj;
        this.read = onpan;
        this.IconCompatParcelizer = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 == 0) {
            return ((Animatable$runAnimation$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((Animatable$runAnimation$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaMetadataCompat + 63;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r8 = r12.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        return new androidx.compose.animation.core.Animatable$runAnimation$2((androidx.compose.animation.core.Animatable) r3, r12.serializer, (o.onPan) r2, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = new androidx.compose.animation.core.Animatable$runAnimation$2((com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository) r12.MediaBrowserCompatMediaItem, (java.lang.String) r3, (java.lang.String) r12.serializer, (java.lang.String) r2, r12.IconCompatParcelizer, r13);
        r13 = androidx.compose.animation.core.Animatable$runAnimation$2.MediaDescriptionCompat + 5;
        androidx.compose.animation.core.Animatable$runAnimation$2.MediaMetadataCompat = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(o.ShortNewsContentCardView r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.compose.animation.core.Animatable$runAnimation$2.MediaDescriptionCompat
            int r1 = r1 + 109
            int r2 = r1 % 128
            androidx.compose.animation.core.Animatable$runAnimation$2.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1b
            int r1 = r12.write
            java.lang.Object r2 = r12.read
            java.lang.Object r3 = r12.MediaSessionCompatQueueItem
            r4 = 36
            int r4 = r4 / 0
            if (r1 == 0) goto L46
            goto L23
        L1b:
            int r1 = r12.write
            java.lang.Object r2 = r12.read
            java.lang.Object r3 = r12.MediaSessionCompatQueueItem
            if (r1 == 0) goto L46
        L23:
            java.lang.Object r1 = r12.MediaBrowserCompatMediaItem
            r5 = r1
            com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository r5 = (com.roadrunner.delivery.accept.repository.DeliveryAcceptDataRepository) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r12.serializer
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            long r9 = r12.IconCompatParcelizer
            androidx.compose.animation.core.Animatable$runAnimation$2 r1 = new androidx.compose.animation.core.Animatable$runAnimation$2
            r4 = r1
            r11 = r13
            r4.<init>(r5, r6, r7, r8, r9, r11)
            int r13 = androidx.compose.animation.core.Animatable$runAnimation$2.MediaDescriptionCompat
            int r13 = r13 + 5
            int r2 = r13 % 128
            androidx.compose.animation.core.Animatable$runAnimation$2.MediaMetadataCompat = r2
            int r13 = r13 % r0
            return r1
        L46:
            r5 = r3
            androidx.compose.animation.core.Animatable r5 = (androidx.compose.animation.core.Animatable) r5
            r7 = r2
            o.onPan r7 = (o.onPan) r7
            long r8 = r12.IconCompatParcelizer
            java.lang.Object r6 = r12.serializer
            androidx.compose.animation.core.Animatable$runAnimation$2 r0 = new androidx.compose.animation.core.Animatable$runAnimation$2
            r4 = r0
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Animatable$runAnimation$2.create(o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cancelPendingWebViewPause cancelpendingwebviewpause;
        UpdatableAnimationState updatableAnimationState;
        accessisMainThread accessismainthread;
        Object objWrite;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.read;
        Object obj3 = this.serializer;
        Object obj4 = this.MediaSessionCompatQueueItem;
        int i5 = 1;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.RatingCompat;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessismainthread = DeliveryAcceptDataRepository.IconCompatParcelizer;
                this.RemoteActionCompatParcelizer = accessismainthread;
                this.RatingCompat = 1;
                objWrite = ((DeliveryAcceptDataRepository) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer.write((String) obj4, (String) obj3, (String) obj2, this.IconCompatParcelizer, this);
                if (objWrite == coroutineSingletons) {
                    int i7 = MediaMetadataCompat + 59;
                    MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                accessisMainThread accessismainthread2 = (accessisMainThread) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = MediaDescriptionCompat + 97;
                MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                accessismainthread = accessismainthread2;
                objWrite = obj;
            }
            getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) objWrite;
            accessismainthread.getClass();
            getholdoutvariationname.getClass();
            if (getholdoutvariationname.rawResponse.isSuccessful) {
                return (createFromParcel) getholdoutvariationname.body;
            }
            throw UniqueHttpExceptionKt.write(new HttpException(getholdoutvariationname));
        }
        onPan onpan = (onPan) obj2;
        Animatable animatable = (Animatable) obj4;
        UpdatableAnimationState updatableAnimationState2 = animatable.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.RatingCompat;
        try {
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                updatableAnimationState2.MediaSessionCompatQueueItem = (TransformGestureDetectorKtdetectTransformGestures2) animatable.MediaSessionCompatResultReceiverWrapper.serializer.invoke(obj3);
                ((onShowTranslationui) animatable.RatingCompat).setValue(onpan.read());
                ((onShowTranslationui) animatable.read).setValue(Boolean.TRUE);
                UpdatableAnimationState updatableAnimationState3 = new UpdatableAnimationState(updatableAnimationState2.serializer, ((onShowTranslationui) updatableAnimationState2.write).getValue(), UtilsKt.serializer(updatableAnimationState2.MediaSessionCompatQueueItem), updatableAnimationState2.RemoteActionCompatParcelizer, Long.MIN_VALUE, updatableAnimationState2.read);
                cancelpendingwebviewpause = new cancelPendingWebViewPause();
                long j = this.IconCompatParcelizer;
                UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(animatable, updatableAnimationState3, cancelpendingwebviewpause, i5);
                this.RemoteActionCompatParcelizer = updatableAnimationState3;
                this.MediaBrowserCompatMediaItem = cancelpendingwebviewpause;
                this.RatingCompat = 1;
                if (SuspendAnimationKt.animate(updatableAnimationState3, onpan, j, userJavascriptInterfaceBase$$ExternalSyntheticLambda12, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                updatableAnimationState = updatableAnimationState3;
            } else {
                if (i11 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cancelpendingwebviewpause = (cancelPendingWebViewPause) this.MediaBrowserCompatMediaItem;
                updatableAnimationState = (UpdatableAnimationState) this.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            accessdispatchTrackpadScroll accessdispatchtrackpadscroll = cancelpendingwebviewpause.IconCompatParcelizer ? accessdispatchTrackpadScroll.BoundReached : accessdispatchTrackpadScroll.Finished;
            Animatable.RemoteActionCompatParcelizer(animatable);
            return new anglek4lQ0M(updatableAnimationState, accessdispatchtrackpadscroll);
        } catch (CancellationException e) {
            Animatable.RemoteActionCompatParcelizer(animatable);
            throw e;
        }
    }
}
