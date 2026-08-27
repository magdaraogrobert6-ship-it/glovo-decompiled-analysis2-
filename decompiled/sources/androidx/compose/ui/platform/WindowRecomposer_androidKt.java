package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidColorSpace_androidKt;
import o.AndroidContentCaptureManager;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.TextAnnouncementContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.createTouchAwareListener;
import o.detectDragGestures;
import o.getBirthDateYear;
import o.getCieXyz;
import o.notifyViewEntered;
import o.onBackInvokedlambda0;
import o.onRemeasuredozmzZPI;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.removeNodeAtDepth;
import o.sendContentCaptureAppearEvents;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;

/* JADX INFO: loaded from: classes.dex */
public final class WindowRecomposer_androidKt {
    private static final onRemeasuredozmzZPI animationScale;

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }

    public static final sendContentCaptureAppearEvents createLifecycleAwareWindowRecomposer(final View view, TextAnnouncementContentCardView textAnnouncementContentCardView, supportsColorMatrixQuery supportscolormatrixquery) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (textAnnouncementContentCardView.get(ShortNewsContentCardViewCompanion.serializer) == null || textAnnouncementContentCardView.get(AndroidContentCaptureManager.IconCompatParcelizer) == null) {
            textAnnouncementContentCardView = AndroidUiDispatcher.Companion.getCurrentThread().plus(textAnnouncementContentCardView);
        }
        notifyViewEntered notifyviewentered = (notifyViewEntered) textAnnouncementContentCardView.get(AndroidContentCaptureManager.IconCompatParcelizer);
        if (notifyviewentered != null) {
            pausableMonotonicFrameClock = new PausableMonotonicFrameClock(notifyviewentered);
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = pausableMonotonicFrameClock.serializer;
            synchronized (r8lambdalmkbrrgswwtv97obrsj7trj7ai.write) {
                r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = false;
            }
        } else {
            pausableMonotonicFrameClock = null;
        }
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        MotionDurationScale motionDurationScale = (MotionDurationScale) textAnnouncementContentCardView.get(MotionDurationScale.Key);
        if (motionDurationScale == null) {
            MotionDurationScaleImpl motionDurationScaleImpl = new MotionDurationScaleImpl(view.getContext().getApplicationContext());
            createinappmessageeventsubscriber.IconCompatParcelizer = motionDurationScaleImpl;
            motionDurationScale = motionDurationScaleImpl;
        }
        TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = textAnnouncementContentCardView.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write).plus(motionDurationScale);
        final sendContentCaptureAppearEvents sendcontentcaptureappearevents = new sendContentCaptureAppearEvents(textAnnouncementContentCardViewPlus);
        synchronized (sendcontentcaptureappearevents.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            sendcontentcaptureappearevents.PlaybackStateCompat = true;
        }
        final ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardViewPlus);
        if (supportscolormatrixquery == null) {
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{view}, getCieXyz.write());
            supportscolormatrixquery = accessisrendernodecompatiblecp != null ? accessisrendernodecompatiblecp.getLifecycle() : null;
        }
        if (supportscolormatrixquery != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    sendcontentcaptureappearevents.MediaSessionCompatToken();
                }
            });
            supportscolormatrixquery.IconCompatParcelizer(new toAndroidColorSpace() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2
                @Override // o.toAndroidColorSpace
                public void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                    boolean z;
                    createTouchAwareListener createtouchawarelistenerParcelableVolumeInfo = null;
                    switch (WhenMappings.$EnumSwitchMapping$0[androidColorSpace_androidKt.ordinal()]) {
                        case 1:
                            BuildersKt.RemoteActionCompatParcelizer(contextScopeRemoteActionCompatParcelizer, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(createinappmessageeventsubscriber, sendcontentcaptureappearevents, accessisrendernodecompatiblecp2, this, null), 1);
                            return;
                        case 2:
                            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock;
                            if (pausableMonotonicFrameClock2 != null) {
                                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai2 = pausableMonotonicFrameClock2.serializer;
                                synchronized (r8lambdalmkbrrgswwtv97obrsj7trj7ai2.write) {
                                    synchronized (r8lambdalmkbrrgswwtv97obrsj7trj7ai2.write) {
                                        z = r8lambdalmkbrrgswwtv97obrsj7trj7ai2.RemoteActionCompatParcelizer;
                                    }
                                    if (!z) {
                                        ArrayList arrayList = (ArrayList) r8lambdalmkbrrgswwtv97obrsj7trj7ai2.serializer;
                                        r8lambdalmkbrrgswwtv97obrsj7trj7ai2.serializer = (ArrayList) r8lambdalmkbrrgswwtv97obrsj7trj7ai2.read;
                                        r8lambdalmkbrrgswwtv97obrsj7trj7ai2.read = arrayList;
                                        r8lambdalmkbrrgswwtv97obrsj7trj7ai2.RemoteActionCompatParcelizer = true;
                                        int size = arrayList.size();
                                        for (int i = 0; i < size; i++) {
                                            ((ShortNewsContentCardView) arrayList.get(i)).resumeWith(createFromParcel.INSTANCE);
                                        }
                                        arrayList.clear();
                                    }
                                }
                            }
                            sendContentCaptureAppearEvents sendcontentcaptureappearevents2 = sendcontentcaptureappearevents;
                            synchronized (sendcontentcaptureappearevents2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                                if (sendcontentcaptureappearevents2.PlaybackStateCompat) {
                                    sendcontentcaptureappearevents2.PlaybackStateCompat = false;
                                    createtouchawarelistenerParcelableVolumeInfo = sendcontentcaptureappearevents2.ParcelableVolumeInfo();
                                }
                                break;
                            }
                            if (createtouchawarelistenerParcelableVolumeInfo != null) {
                                ((CancellableContinuationImpl) createtouchawarelistenerParcelableVolumeInfo).resumeWith(createFromParcel.INSTANCE);
                                return;
                            }
                            return;
                        case 3:
                            sendContentCaptureAppearEvents sendcontentcaptureappearevents3 = sendcontentcaptureappearevents;
                            synchronized (sendcontentcaptureappearevents3.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                                sendcontentcaptureappearevents3.PlaybackStateCompat = true;
                            }
                            return;
                        case 4:
                            sendcontentcaptureappearevents.MediaSessionCompatToken();
                            return;
                        case 5:
                        case 6:
                        case 7:
                            return;
                        default:
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$WhenMappings */
                public static final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AndroidColorSpace_androidKt.values().length];
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[AndroidColorSpace_androidKt.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }
            });
            return sendcontentcaptureappearevents;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from " + view);
        DrawableTransformation.read();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final StateFlow<Float> getAnimationScaleFlowFor(Context context) {
        StateFlow<Float> stateFlow;
        onRemeasuredozmzZPI onremeasuredozmzzpi = animationScale;
        synchronized (onremeasuredozmzzpi) {
            Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(context);
            if (objMediaBrowserCompatMediaItem == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                final BufferedChannel bufferedChannelIconCompatParcelizer = SQLite.IconCompatParcelizer(-1, 6, (IInAppMessageViewWrapper) null);
                final Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
                Flow flow = FlowKt.read(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z, Uri uri) {
                        bufferedChannelIconCompatParcelizer.b_(createFromParcel.INSTANCE);
                    }
                }, bufferedChannelIconCompatParcelizer, context, null));
                onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objMediaBrowserCompatMediaItem = FlowKt.write(flow, new ContextScope(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read)), SharingStarted.Companion.read(3), Float.valueOf(readAnimationScale(context)));
                onremeasuredozmzzpi.write(context, objMediaBrowserCompatMediaItem);
            }
            stateFlow = (StateFlow) objMediaBrowserCompatMediaItem;
        }
        return stateFlow;
    }

    public static final getBirthDateYear getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof getBirthDateYear) {
            return (getBirthDateYear) tag;
        }
        return null;
    }

    public static final void setCompositionContext(View view, getBirthDateYear getbirthdateyear) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, getbirthdateyear);
    }

    static {
        long[] jArr = detectDragGestures.write;
        animationScale = new onRemeasuredozmzZPI();
    }

    public static /* synthetic */ sendContentCaptureAppearEvents createLifecycleAwareWindowRecomposer$default(View view, TextAnnouncementContentCardView textAnnouncementContentCardView, supportsColorMatrixQuery supportscolormatrixquery, int i, Object obj) {
        if ((i & 1) != 0) {
            textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        }
        if ((i & 2) != 0) {
            supportscolormatrixquery = null;
        }
        return createLifecycleAwareWindowRecomposer(view, textAnnouncementContentCardView, supportscolormatrixquery);
    }

    public static final View getContentChild(View view) {
        Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
        while (objRemoteActionCompatParcelizer instanceof View) {
            View view2 = (View) objRemoteActionCompatParcelizer;
            if (view2.getId() == 16908290) {
                break;
            }
            objRemoteActionCompatParcelizer = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final getBirthDateYear findViewTreeCompositionContext(View view) {
        getBirthDateYear compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        Object parent = view.getParent();
        while (compositionContext == null && (parent instanceof View)) {
            View view2 = (View) parent;
            compositionContext = getCompositionContext(view2);
            parent = MathKt.RemoteActionCompatParcelizer(view2);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float readAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final sendContentCaptureAppearEvents getWindowRecomposer(View view) {
        if (!view.isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View contentChild = getContentChild(view);
        getBirthDateYear compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui(contentChild);
        }
        if (compositionContext instanceof sendContentCaptureAppearEvents) {
            return (sendContentCaptureAppearEvents) compositionContext;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    }
}
