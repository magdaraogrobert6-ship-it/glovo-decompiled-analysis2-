package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Arrangement;
import o.PlatformSelectionBehaviorsImpl;
import o.SelectionGesturesKt;
import o.ShortNewsContentCardView;
import o.applyMeasureResultfoundation;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScrollExtensionsKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaMetadataCompat = 0;
        private static int RatingCompat = 1;
        public final /* synthetic */ o.TrackpadScrollingLogic IconCompatParcelizer;
        public int MediaDescriptionCompat;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ float serializer;
        public /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(ZoomState zoomState, float f, width widthVar, Rect rect, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.write = zoomState;
            this.serializer = f;
            this.IconCompatParcelizer = widthVar;
            this.RemoteActionCompatParcelizer = rect;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, o.TrackpadScrollingLogic trackpadScrollingLogic, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.read = 0;
            this.serializer = f;
            this.IconCompatParcelizer = trackpadScrollingLogic;
            this.RemoteActionCompatParcelizer = cancelpendingwebviewpauselambda0;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = RatingCompat + 37;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i4 != 0) {
                return i4 != 1 ? ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass2) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = MediaMetadataCompat + 33;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = RatingCompat + 5;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.read;
            Object obj2 = this.RemoteActionCompatParcelizer;
            o.TrackpadScrollingLogic trackpadScrollingLogic = this.IconCompatParcelizer;
            if (i4 == 0) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.serializer, trackpadScrollingLogic, (cancelPendingWebViewPauselambda0) obj2, shortNewsContentCardView);
                anonymousClass2.write = obj;
                return anonymousClass2;
            }
            if (i4 == 1) {
                return new AnonymousClass2((ZoomState) this.write, this.serializer, (width) trackpadScrollingLogic, (Rect) obj2, shortNewsContentCardView, 1);
            }
            AnonymousClass2 anonymousClass3 = new AnonymousClass2((ZoomState) this.write, this.serializer, (width) trackpadScrollingLogic, (Rect) obj2, shortNewsContentCardView, 2);
            int i5 = MediaMetadataCompat + 3;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = MediaMetadataCompat + 25;
            RatingCompat = i3 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                obj2.hashCode();
                throw null;
            }
            int i4 = this.read;
            o.TrackpadScrollingLogic trackpadScrollingLogic = this.IconCompatParcelizer;
            float f = this.serializer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            Object obj3 = this.RemoteActionCompatParcelizer;
            if (i4 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.MediaDescriptionCompat;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    GapComposerKt$$ExternalSyntheticLambda0 gapComposerKt$$ExternalSyntheticLambda0 = new GapComposerKt$$ExternalSyntheticLambda0((cancelPendingWebViewPauselambda0) obj3, i, (PlatformSelectionBehaviorsImpl) this.write);
                    this.MediaDescriptionCompat = 1;
                    if (SuspendAnimationKt.serializer(0.0f, this.serializer, this.IconCompatParcelizer, gapComposerKt$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = MediaMetadataCompat + 109;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        throw null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createfromparcel2;
            }
            if (i4 == 1) {
                Rect rect = (Rect) obj3;
                Animatable animatable = ((ZoomState) this.write).serializer;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.MediaDescriptionCompat;
                if (i7 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    animatable.serializer(null, null);
                    this.MediaDescriptionCompat = 1;
                    if (Animatable.IconCompatParcelizer(animatable, new Float(f), (width) trackpadScrollingLogic, this, 12) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i7 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = RatingCompat + 85;
                    MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        int i9 = 36 / 0;
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                }
                animatable.serializer(new Float(rect.getLeft()), new Float(rect.getRight()));
                return createfromparcel2;
            }
            Rect rect2 = (Rect) obj3;
            Animatable animatable2 = ((ZoomState) this.write).RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.MediaDescriptionCompat;
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                animatable2.serializer(null, null);
                this.MediaDescriptionCompat = 1;
                if (Animatable.IconCompatParcelizer(animatable2, new Float(f), (width) trackpadScrollingLogic, this, 12) == coroutineSingletons3) {
                    int i11 = RatingCompat + 37;
                    MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return coroutineSingletons3;
                }
            } else {
                if (i10 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i13 = RatingCompat + 47;
                MediaMetadataCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            animatable2.serializer(new Float(rect2.getTop()), new Float(rect2.getBottom()));
            return createfromparcel2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object animateScrollBy(ScrollState scrollState, float f, Arrangement arrangement, ContinuationImpl continuationImpl) {
        SelectionGesturesKt selectionGesturesKt;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        if (continuationImpl instanceof SelectionGesturesKt) {
            selectionGesturesKt = (SelectionGesturesKt) continuationImpl;
            int i = selectionGesturesKt.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt.write = i - Integer.MIN_VALUE;
            } else {
                selectionGesturesKt = new SelectionGesturesKt(continuationImpl);
            }
        } else {
            selectionGesturesKt = new SelectionGesturesKt(continuationImpl);
        }
        Object obj = selectionGesturesKt.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectionGesturesKt.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 anonymousClass2 = new AnonymousClass2(f, arrangement, cancelpendingwebviewpauselambda1, null);
            selectionGesturesKt.read = cancelpendingwebviewpauselambda1;
            selectionGesturesKt.write = 1;
            if (scrollState.scroll(applyMeasureResultfoundation.Default, anonymousClass2, selectionGesturesKt) == obj2) {
                return obj2;
            }
            cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cancelpendingwebviewpauselambda0 = selectionGesturesKt.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new Float(cancelpendingwebviewpauselambda0.write);
    }
}
