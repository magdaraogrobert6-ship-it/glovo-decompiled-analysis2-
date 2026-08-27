package androidx.compose.animation.core;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.MotionDurationScale;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.DelayKt;
import o.Box;
import o.OffsetKt;
import o.PaddingKt;
import o.PaddingValuesYgX7TsAdefault;
import o.TextAnnouncementContentCardView;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKt;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.UpdatableAnimationState;
import o.accessanimateWithTarget;
import o.calculateSnapOffset;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.height;
import o.onPan;
import o.onShowTranslationui;
import o.placeCenterfoundation_layout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.requiredSizeInqDBjuR0default;
import o.requiredWidth3ABfNKs;

/* JADX INFO: loaded from: classes.dex */
public abstract class SuspendAnimationKt {
    public static final Object animateDecay(UpdatableAnimationState updatableAnimationState, accessanimateWithTarget accessanimatewithtarget, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        Object objAnimate = animate(updatableAnimationState, new calculateSnapOffset(accessanimatewithtarget, updatableAnimationState.serializer, ((onShowTranslationui) updatableAnimationState.write).getValue(), updatableAnimationState.MediaSessionCompatQueueItem), z ? updatableAnimationState.RemoteActionCompatParcelizer : Long.MIN_VALUE, r8lambdaunavo3sxub_pc9xroryotnrlvsm, continuationImpl);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : createFromParcel.INSTANCE;
    }

    public static final Object animateTo(UpdatableAnimationState updatableAnimationState, Float f, TrackpadScrollingLogic trackpadScrollingLogic, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        Object objAnimate = animate(updatableAnimationState, new PaddingKt(trackpadScrollingLogic, updatableAnimationState.serializer, ((onShowTranslationui) updatableAnimationState.write).getValue(), f, updatableAnimationState.MediaSessionCompatQueueItem), z ? updatableAnimationState.RemoteActionCompatParcelizer : Long.MIN_VALUE, r8lambdaunavo3sxub_pc9xroryotnrlvsm, continuationImpl);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : createFromParcel.INSTANCE;
    }

    public static final float read(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) textAnnouncementContentCardView.get(MotionDurationScale.Key);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor < 0.0f) {
            Box.RemoteActionCompatParcelizer("negative scale factor");
        }
        return scaleFactor;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object animate(final UpdatableAnimationState updatableAnimationState, final onPan onpan, long j, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        OffsetKt offsetKt;
        UpdatableAnimationState updatableAnimationState2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        Object objWithFrameNanos;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber3;
        TransformGestureDetectorKt transformGestureDetectorKt;
        TransformGestureDetectorKt transformGestureDetectorKt2;
        Object objWithFrameNanos2;
        onPan onpan2 = onpan;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        if (continuationImpl instanceof OffsetKt) {
            offsetKt = (OffsetKt) continuationImpl;
            int i = offsetKt.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                offsetKt.serializer = i - Integer.MIN_VALUE;
            } else {
                offsetKt = new OffsetKt(continuationImpl);
            }
        } else {
            offsetKt = new OffsetKt(continuationImpl);
        }
        OffsetKt offsetKt2 = offsetKt;
        Object obj = offsetKt2.RatingCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = offsetKt2.serializer;
        int i3 = 1;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            final Object objRemoteActionCompatParcelizer = onpan2.RemoteActionCompatParcelizer(0L);
            final TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Write = onpan2.write(0L);
            final createInAppMessageEventSubscriber createinappmessageeventsubscriber4 = new createInAppMessageEventSubscriber();
            try {
                if (j == Long.MIN_VALUE) {
                    try {
                        final float f = read(offsetKt2.getContext());
                        createinappmessageeventsubscriber2 = createinappmessageeventsubscriber4;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.IntrinsicKt
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                onPan onpan3 = onpan;
                                requiredSizeInqDBjuR0default requiredsizeinqdbjur0defaultIconCompatParcelizer = onpan3.IconCompatParcelizer();
                                Object obj3 = onpan3.read();
                                UpdatableAnimationState updatableAnimationState3 = updatableAnimationState;
                                TransformGestureDetectorKt transformGestureDetectorKt3 = new TransformGestureDetectorKt(objRemoteActionCompatParcelizer, requiredsizeinqdbjur0defaultIconCompatParcelizer, transformGestureDetectorKtdetectTransformGestures2Write, jLongValue, obj3, jLongValue, new height(updatableAnimationState3, 1));
                                androidx.compose.animation.core.SuspendAnimationKt.RemoteActionCompatParcelizer(transformGestureDetectorKt3, jLongValue, f, onpan3, updatableAnimationState3, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                                createinappmessageeventsubscriber4.IconCompatParcelizer = transformGestureDetectorKt3;
                                return createFromParcel.INSTANCE;
                            }
                        };
                        offsetKt2.write = updatableAnimationState;
                        offsetKt2.read = onpan2;
                        offsetKt2.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        offsetKt2.RemoteActionCompatParcelizer = createinappmessageeventsubscriber2;
                        offsetKt2.serializer = 1;
                        if (onpan.RemoteActionCompatParcelizer()) {
                            objWithFrameNanos = placeCenterfoundation_layout.RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, offsetKt2);
                        } else {
                            objWithFrameNanos = TextStreamsKt.read(offsetKt2.getContext()).withFrameNanos(new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, i3), offsetKt2);
                        }
                        if (objWithFrameNanos == coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    } catch (CancellationException e) {
                        e = e;
                        updatableAnimationState2 = updatableAnimationState;
                        createinappmessageeventsubscriber = createinappmessageeventsubscriber4;
                        transformGestureDetectorKt = (TransformGestureDetectorKt) createinappmessageeventsubscriber.IconCompatParcelizer;
                        if (transformGestureDetectorKt != null) {
                            transformGestureDetectorKt.MediaSessionCompatQueueItem();
                        }
                        transformGestureDetectorKt2 = (TransformGestureDetectorKt) createinappmessageeventsubscriber.IconCompatParcelizer;
                        if (transformGestureDetectorKt2 != null && transformGestureDetectorKt2.IconCompatParcelizer() == updatableAnimationState2.RemoteActionCompatParcelizer) {
                            updatableAnimationState2.read = false;
                        }
                        throw e;
                    }
                }
                createinappmessageeventsubscriber2 = createinappmessageeventsubscriber4;
                TransformGestureDetectorKt transformGestureDetectorKt3 = new TransformGestureDetectorKt(objRemoteActionCompatParcelizer, onpan.IconCompatParcelizer(), transformGestureDetectorKtdetectTransformGestures2Write, j, onpan.read(), j, new height(updatableAnimationState, 0));
                RemoteActionCompatParcelizer(transformGestureDetectorKt3, j, read(offsetKt2.getContext()), onpan, updatableAnimationState, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                createinappmessageeventsubscriber2.IconCompatParcelizer = transformGestureDetectorKt3;
                updatableAnimationState2 = updatableAnimationState;
                createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
            } catch (CancellationException e2) {
                e = e2;
            }
        } else if (i2 == 1 || i2 == 2) {
            createinappmessageeventsubscriber3 = offsetKt2.RemoteActionCompatParcelizer;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = offsetKt2.IconCompatParcelizer;
            onPan onpan3 = offsetKt2.read;
            updatableAnimationState2 = offsetKt2.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                onpan2 = onpan3;
            } catch (CancellationException e3) {
                e = e3;
                createinappmessageeventsubscriber = createinappmessageeventsubscriber3;
                transformGestureDetectorKt = (TransformGestureDetectorKt) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (transformGestureDetectorKt != null) {
                    transformGestureDetectorKt.MediaSessionCompatQueueItem();
                }
                transformGestureDetectorKt2 = (TransformGestureDetectorKt) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (transformGestureDetectorKt2 != null) {
                    updatableAnimationState2.read = false;
                }
                throw e;
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        do {
            Object obj2 = createinappmessageeventsubscriber3.IconCompatParcelizer;
            obj2.getClass();
            if (((TransformGestureDetectorKt) obj2).MediaBrowserCompatMediaItem()) {
                final float f2 = read(offsetKt2.getContext());
                final createInAppMessageEventSubscriber createinappmessageeventsubscriber5 = createinappmessageeventsubscriber3;
                final onPan onpan4 = onpan2;
                final UpdatableAnimationState updatableAnimationState3 = updatableAnimationState2;
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.PaddingElement
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = createinappmessageeventsubscriber5.IconCompatParcelizer;
                        obj4.getClass();
                        androidx.compose.animation.core.SuspendAnimationKt.RemoteActionCompatParcelizer((TransformGestureDetectorKt) obj4, jLongValue, f2, onpan4, updatableAnimationState3, r8lambdaunavo3sxub_pc9xroryotnrlvsm5);
                        return createFromParcel.INSTANCE;
                    }
                };
                offsetKt2.write = updatableAnimationState2;
                offsetKt2.read = onpan2;
                offsetKt2.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                offsetKt2.RemoteActionCompatParcelizer = createinappmessageeventsubscriber3;
                offsetKt2.serializer = 2;
                if (onpan2.RemoteActionCompatParcelizer()) {
                    objWithFrameNanos2 = placeCenterfoundation_layout.RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm6, offsetKt2);
                } else {
                    objWithFrameNanos2 = TextStreamsKt.read(offsetKt2.getContext()).withFrameNanos(new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm6, i3), offsetKt2);
                }
            } else {
                return createFromParcel.INSTANCE;
            }
        } while (objWithFrameNanos2 != coroutineSingletons);
        return coroutineSingletons;
    }

    public static final void serializer(TransformGestureDetectorKt transformGestureDetectorKt, UpdatableAnimationState updatableAnimationState) {
        ((onShowTranslationui) updatableAnimationState.write).setValue(transformGestureDetectorKt.read());
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = updatableAnimationState.MediaSessionCompatQueueItem;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2MediaDescriptionCompat = transformGestureDetectorKt.MediaDescriptionCompat();
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            transformGestureDetectorKtdetectTransformGestures2.write(transformGestureDetectorKtdetectTransformGestures2MediaDescriptionCompat.write(i), i);
        }
        updatableAnimationState.IconCompatParcelizer = transformGestureDetectorKt.RemoteActionCompatParcelizer();
        updatableAnimationState.RemoteActionCompatParcelizer = transformGestureDetectorKt.IconCompatParcelizer();
        updatableAnimationState.read = transformGestureDetectorKt.MediaBrowserCompatMediaItem();
    }

    public static final void RemoteActionCompatParcelizer(TransformGestureDetectorKt transformGestureDetectorKt, long j, float f, onPan onpan, UpdatableAnimationState updatableAnimationState, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long jSerializer;
        if (f == 0.0f) {
            jSerializer = onpan.serializer();
        } else {
            jSerializer = (long) ((j - transformGestureDetectorKt.serializer()) / f);
        }
        transformGestureDetectorKt.IconCompatParcelizer(j);
        transformGestureDetectorKt.write(onpan.RemoteActionCompatParcelizer(jSerializer));
        transformGestureDetectorKt.read(onpan.write(jSerializer));
        if (onpan.IconCompatParcelizer(jSerializer)) {
            transformGestureDetectorKt.RemoteActionCompatParcelizer(transformGestureDetectorKt.IconCompatParcelizer());
            transformGestureDetectorKt.MediaSessionCompatQueueItem();
        }
        serializer(transformGestureDetectorKt, updatableAnimationState);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(transformGestureDetectorKt);
    }

    public static /* synthetic */ Object serializer(float f, float f2, TrackpadScrollingLogic trackpadScrollingLogic, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, SuspendLambda suspendLambda, int i) {
        if ((i & 8) != 0) {
            trackpadScrollingLogic = DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null);
        }
        return animate(f, f2, 0.0f, trackpadScrollingLogic, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, suspendLambda);
    }

    public static final Object animate(float f, float f2, float f3, TrackpadScrollingLogic trackpadScrollingLogic, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, SuspendLambda suspendLambda) {
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = requiredWidth3ABfNKs.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = requiredsizeinqdbjur0default.serializer;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer = (TransformGestureDetectorKtdetectTransformGestures2) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(f6);
        if (transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer == null) {
            transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer = ((TransformGestureDetectorKtdetectTransformGestures2) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(f4)).RemoteActionCompatParcelizer();
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2 = transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer;
        Object objAnimate = animate(new UpdatableAnimationState(requiredsizeinqdbjur0default, f4, transformGestureDetectorKtdetectTransformGestures2, 56), new PaddingKt(trackpadScrollingLogic, requiredsizeinqdbjur0default, f4, f5, transformGestureDetectorKtdetectTransformGestures2), Long.MIN_VALUE, new PaddingValuesYgX7TsAdefault(0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objAnimate != coroutineSingletons) {
            objAnimate = createfromparcel;
        }
        return objAnimate == coroutineSingletons ? objAnimate : createfromparcel;
    }
}
