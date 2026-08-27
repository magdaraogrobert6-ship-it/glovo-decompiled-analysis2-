package androidx.compose.animation.core;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel;
import com.roadrunner.location.util.HmsTasksKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import o.Box;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.UpdatableAnimationState;
import o.accessanimateWithTarget;
import o.animateToZero;
import o.calculateCentroid;
import o.calculateCentroidSize;
import o.calculateSnapOffset;
import o.createFromParcel;
import o.getCieXyz;
import o.mainAxisk4lQ0M;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.requiredSizeInqDBjuR0default;
import o.tryMinHeightJN0ABg;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public final class Animatable {
    public final UpdatableAnimationState IconCompatParcelizer;
    public final TransformGestureDetectorKtdetectTransformGestures2 MediaBrowserCompatMediaItem;
    public TransformGestureDetectorKtdetectTransformGestures2 MediaDescriptionCompat;
    public final TransformGestureDetectorKtdetectTransformGestures2 MediaMetadataCompat;
    public final tryMinHeightJN0ABg MediaSessionCompatQueueItem;
    public final requiredSizeInqDBjuR0default MediaSessionCompatResultReceiverWrapper;
    public Object MediaSessionCompatToken;
    public final Object ParcelableVolumeInfo;
    public TransformGestureDetectorKtdetectTransformGestures2 PlaybackStateCompat;
    public final PopulateViewStructure_androidKtpopulate7 RatingCompat;
    public final width RemoteActionCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 read;
    public Object serializer;
    public final String write;

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$snapTo$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int read = 1;
        private static int write;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ Object serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.serializer = obj;
            this.RemoteActionCompatParcelizer = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = read + 61;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            Object obj = this.RemoteActionCompatParcelizer;
            Object obj2 = this.serializer;
            if (i4 != 0) {
                return new AnonymousClass2((TransferChangeViewModel) obj2, (String) obj, shortNewsContentCardView, 1);
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((Animatable) obj2, obj, shortNewsContentCardView, 0);
            int i5 = write + 59;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return anonymousClass2;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = read + 119;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
            if (i4 != 0) {
                ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((AnonymousClass2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = write + 111;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        
            if ((r7 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        
            r7 = 95 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        
            r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
            r4 = (androidx.compose.animation.core.Animatable) r4;
            androidx.compose.animation.core.Animatable.RemoteActionCompatParcelizer(r4);
            r7 = r4.serializer(r3);
            ((o.onShowTranslationui) r4.IconCompatParcelizer.write).setValue(r7);
            ((o.onShowTranslationui) r4.RatingCompat).setValue(r7);
            r7 = androidx.compose.animation.core.Animatable.AnonymousClass2.write + 23;
            androidx.compose.animation.core.Animatable.AnonymousClass2.read = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r7 = r7 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
            r4 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel) r4;
            r4.write.read(r4.read, (java.lang.String) r3);
            r7 = androidx.compose.animation.core.Animatable.AnonymousClass2.write + 111;
            androidx.compose.animation.core.Animatable.AnonymousClass2.read = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = androidx.compose.animation.core.Animatable.AnonymousClass2.read
                int r1 = r1 + 79
                int r2 = r1 % 128
                androidx.compose.animation.core.Animatable.AnonymousClass2.write = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1d
                int r1 = r6.IconCompatParcelizer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                java.lang.Object r3 = r6.RemoteActionCompatParcelizer
                java.lang.Object r4 = r6.serializer
                r5 = 50
                int r5 = r5 / 0
                if (r1 == 0) goto L47
                goto L27
            L1d:
                int r1 = r6.IconCompatParcelizer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                java.lang.Object r3 = r6.RemoteActionCompatParcelizer
                java.lang.Object r4 = r6.serializer
                if (r1 == 0) goto L47
            L27:
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel r4 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel) r4
                com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl r7 = r4.write
                o.getPositionannotations r1 = r4.read
                java.lang.String r3 = (java.lang.String) r3
                r7.read(r1, r3)
                int r7 = androidx.compose.animation.core.Animatable.AnonymousClass2.write
                int r7 = r7 + 111
                int r1 = r7 % 128
                androidx.compose.animation.core.Animatable.AnonymousClass2.read = r1
                int r7 = r7 % r0
                if (r7 != 0) goto L46
                r7 = 95
                int r7 = r7 / 0
            L46:
                return r2
            L47:
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                androidx.compose.animation.core.Animatable r4 = (androidx.compose.animation.core.Animatable) r4
                androidx.compose.animation.core.Animatable.RemoteActionCompatParcelizer(r4)
                java.lang.Object r7 = r4.serializer(r3)
                o.UpdatableAnimationState r1 = r4.IconCompatParcelizer
                o.PopulateViewStructure_androidKtpopulate7 r1 = r1.write
                o.onShowTranslationui r1 = (o.onShowTranslationui) r1
                r1.setValue(r7)
                o.PopulateViewStructure_androidKtpopulate7 r1 = r4.RatingCompat
                o.onShowTranslationui r1 = (o.onShowTranslationui) r1
                r1.setValue(r7)
                int r7 = androidx.compose.animation.core.Animatable.AnonymousClass2.write
                int r7 = r7 + 23
                int r1 = r7 % 128
                androidx.compose.animation.core.Animatable.AnonymousClass2.read = r1
                int r7 = r7 % r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Animatable.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void RemoteActionCompatParcelizer(Animatable animatable) {
        UpdatableAnimationState updatableAnimationState = animatable.IconCompatParcelizer;
        updatableAnimationState.MediaSessionCompatQueueItem.read();
        updatableAnimationState.RemoteActionCompatParcelizer = Long.MIN_VALUE;
        ((onShowTranslationui) animatable.read).setValue(Boolean.FALSE);
    }

    public final boolean IconCompatParcelizer() {
        return ((Boolean) this.read.getValue()).booleanValue();
    }

    public final Object serializer(Object obj) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompat, this.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
                return obj;
            }
        }
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = this.MediaSessionCompatResultReceiverWrapper;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(obj);
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer();
        boolean z = false;
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (transformGestureDetectorKtdetectTransformGestures2.write(i) < this.MediaDescriptionCompat.write(i) || transformGestureDetectorKtdetectTransformGestures2.write(i) > this.PlaybackStateCompat.write(i)) {
                transformGestureDetectorKtdetectTransformGestures2.write(RangesKt.write(transformGestureDetectorKtdetectTransformGestures2.write(i), this.MediaDescriptionCompat.write(i), this.PlaybackStateCompat.write(i)), i);
                z = true;
            }
        }
        return z ? requiredsizeinqdbjur0default.read.invoke(transformGestureDetectorKtdetectTransformGestures2) : obj;
    }

    public final Object write() {
        return ((onShowTranslationui) this.IconCompatParcelizer.write).getValue();
    }

    public Animatable(Object obj, requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, Object obj2, String str) {
        this.MediaSessionCompatResultReceiverWrapper = requiredsizeinqdbjur0default;
        this.ParcelableVolumeInfo = obj2;
        this.write = str;
        UpdatableAnimationState updatableAnimationState = new UpdatableAnimationState(requiredsizeinqdbjur0default, obj, null, 60);
        this.IconCompatParcelizer = updatableAnimationState;
        this.read = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.RatingCompat = CompositionKt.RemoteActionCompatParcelizer(obj);
        this.MediaSessionCompatQueueItem = new tryMinHeightJN0ABg();
        this.RemoteActionCompatParcelizer = new width(3, obj2);
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = updatableAnimationState.MediaSessionCompatQueueItem;
        boolean z = transformGestureDetectorKtdetectTransformGestures2 instanceof calculateCentroidSize;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3 = z ? mainAxisk4lQ0M.IconCompatParcelizer : transformGestureDetectorKtdetectTransformGestures2 instanceof animateToZero ? mainAxisk4lQ0M.read : transformGestureDetectorKtdetectTransformGestures2 instanceof calculateCentroid ? mainAxisk4lQ0M.write : mainAxisk4lQ0M.serializer;
        this.MediaBrowserCompatMediaItem = transformGestureDetectorKtdetectTransformGestures3;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4 = z ? mainAxisk4lQ0M.RemoteActionCompatParcelizer : transformGestureDetectorKtdetectTransformGestures2 instanceof animateToZero ? mainAxisk4lQ0M.MediaSessionCompatQueueItem : transformGestureDetectorKtdetectTransformGestures2 instanceof calculateCentroid ? mainAxisk4lQ0M.RatingCompat : mainAxisk4lQ0M.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = transformGestureDetectorKtdetectTransformGestures4;
        this.MediaDescriptionCompat = transformGestureDetectorKtdetectTransformGestures3;
        this.PlaybackStateCompat = transformGestureDetectorKtdetectTransformGestures4;
    }

    public static Object IconCompatParcelizer(Animatable animatable, Float f, accessanimateWithTarget accessanimatewithtarget, SuspendLambda suspendLambda) {
        Object objWrite = animatable.write();
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = animatable.MediaSessionCompatResultReceiverWrapper;
        return tryMinHeightJN0ABg.read(animatable.MediaSessionCompatQueueItem, new Animatable$runAnimation$2(animatable, f, new calculateSnapOffset(accessanimatewithtarget, requiredsizeinqdbjur0default, objWrite, (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(f)), animatable.IconCompatParcelizer.RemoteActionCompatParcelizer, null), suspendLambda);
    }

    public static Object IconCompatParcelizer(Animatable animatable, Object obj, TrackpadScrollingLogic trackpadScrollingLogic, ShortNewsContentCardView shortNewsContentCardView, int i) {
        if ((i & 2) != 0) {
            trackpadScrollingLogic = animatable.RemoteActionCompatParcelizer;
        }
        Object objInvoke = animatable.MediaSessionCompatResultReceiverWrapper.read.invoke(animatable.IconCompatParcelizer.MediaSessionCompatQueueItem);
        return tryMinHeightJN0ABg.read(animatable.MediaSessionCompatQueueItem, new Animatable$runAnimation$2(animatable, objInvoke, HmsTasksKt.read(trackpadScrollingLogic, animatable.MediaSessionCompatResultReceiverWrapper, animatable.write(), obj, objInvoke), animatable.IconCompatParcelizer.RemoteActionCompatParcelizer, null), shortNewsContentCardView);
    }

    public final void serializer(Float f, Float f2) {
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3;
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = this.MediaSessionCompatResultReceiverWrapper;
        if (f == null || (transformGestureDetectorKtdetectTransformGestures2 = (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(f)) == null) {
            transformGestureDetectorKtdetectTransformGestures2 = this.MediaBrowserCompatMediaItem;
        }
        if (f2 == null || (transformGestureDetectorKtdetectTransformGestures3 = (TransformGestureDetectorKtdetectTransformGestures2) requiredsizeinqdbjur0default.serializer.invoke(f2)) == null) {
            transformGestureDetectorKtdetectTransformGestures3 = this.MediaMetadataCompat;
        }
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (transformGestureDetectorKtdetectTransformGestures2.write(i) > transformGestureDetectorKtdetectTransformGestures3.write(i)) {
                Box.RemoteActionCompatParcelizer("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + transformGestureDetectorKtdetectTransformGestures2 + " is greater than upper bound " + transformGestureDetectorKtdetectTransformGestures3 + " on index " + i);
            }
        }
        this.MediaDescriptionCompat = transformGestureDetectorKtdetectTransformGestures2;
        this.PlaybackStateCompat = transformGestureDetectorKtdetectTransformGestures3;
        this.MediaSessionCompatToken = f2;
        this.serializer = f;
        if (IconCompatParcelizer()) {
            return;
        }
        Object objSerializer = serializer(write());
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objSerializer, write()}, getCieXyz.write())).booleanValue()) {
            return;
        }
        ((onShowTranslationui) this.IconCompatParcelizer.write).setValue(objSerializer);
    }

    public final Object snapTo(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2 = tryMinHeightJN0ABg.read(this.MediaSessionCompatQueueItem, new AnonymousClass2(this, obj, null, 0), shortNewsContentCardView);
        return obj2 == CoroutineSingletons.COROUTINE_SUSPENDED ? obj2 : createFromParcel.INSTANCE;
    }

    public /* synthetic */ Animatable(Object obj, requiredSizeInqDBjuR0default requiredsizeinqdbjur0default, Object obj2, int i) {
        this(obj, requiredsizeinqdbjur0default, (i & 4) != 0 ? null : obj2, "Animatable");
    }
}
