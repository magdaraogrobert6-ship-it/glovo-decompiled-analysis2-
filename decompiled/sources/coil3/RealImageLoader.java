package coil3;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1;
import androidx.compose.foundation.gestures.DraggableNode;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.fragment.app.Fragment;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.Room;
import androidx.room.coroutines.Pool;
import androidx.transition.TransitionValuesMaps;
import coil3.intercept.EngineInterceptor;
import coil3.request.LifecycleRequestDelegate;
import coil3.request.NullRequestDataException;
import coil3.util.UtilsKt;
import com.deliveryhero.customerchat.service.ChatService;
import com.deliveryhero.performance.core.screenmetric.FragmentMetricsLifecycleCallback;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusEvent;
import com.roadrunner.delivery.pickupdropoff.tasks.data.MergedTaskStateRepositoryImpl$getMergedState$2;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.BezierKtWhenMappings;
import o.ButtonDefaults;
import o.CheckboxKt;
import o.CompositeShader7EN7VTw;
import o.FloatingTextActionModeCallback;
import o.ImageShaderF49vj9s;
import o.ImageShaderF49vj9sdefault;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.LinearGradientShaderVjE6UOU;
import o.PathDefaultImpls;
import o.PathEffectCompanion;
import o.PathHitTesterWhenMappings;
import o.PathSegment;
import o.PlatformSelectionBehaviorsImpl;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RadialGradientShader8uybcMk;
import o.RadialGradientShader8uybcMkdefault;
import o.RecyclableBufferedInputStream;
import o.ShaderKt;
import o.Shadow;
import o.Shape;
import o.ShortNewsContentCardView;
import o.SimpleGraphicsLayerModifier;
import o.SimpleGraphicsLayerModifierlayerBlock1;
import o.StampedPathEffectStyleCompanion;
import o.StrokeCapCompanion;
import o.TextAnnouncementContentCardView;
import o.TextFieldCursor_androidKt;
import o.accessandjd;
import o.accessgetLayerBlockp;
import o.accessgetPolygoncp;
import o.accessgetTranslatecp;
import o.accessgetUnioncp;
import o.accessisRenderNodeCompatiblecp;
import o.accessquadraticTojd;
import o.accessrewindjd;
import o.accesstransform58bKbWcjd;
import o.accessxorjd;
import o.addPathUv8p0NAdefault;
import o.addRectdefault;
import o.and;
import o.applyMeasureResultfoundation;
import o.booleanValue;
import o.boximpl;
import o.component11SzJe1aQ;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getColor0d7_KjUannotations;
import o.getContentViewGroupParentLayout;
import o.getGlobalChangeEntries;
import o.getHighNSsRyOo;
import o.getInAppMessageAnimationFactory;
import o.getInAppMessageManagerListener;
import o.getNoneannotations;
import o.getOnBackInvokedCallback;
import o.getPointsr_lszbg;
import o.getRadiusui_graphics;
import o.getReverseDifference;
import o.getRotateYpspkwk;
import o.getStrokeTiuSbCo;
import o.handleUrlOverridelambda1;
import o.listValue;
import o.minus;
import o.notifyContentCaptureChanges;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;
import o.setTransformQ8lPUPs;
import o.supportsColorMatrixQuery;
import o.updateClipPath;
import o.updateOutlineui;

/* JADX INFO: loaded from: classes.dex */
public final class RealImageLoader {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public volatile /* synthetic */ int IconCompatParcelizer;
    public final Extras$Key read;
    public final accessandjd serializer;
    public final addPathUv8p0NAdefault write;

    /* JADX INFO: renamed from: coil3.RealImageLoader$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public Object IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public Object read;
        public final /* synthetic */ Object serializer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PerseusEvent perseusEvent, int i, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = 29;
            this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            this.serializer = perseusEvent;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.write;
            Object obj2 = this.serializer;
            switch (i) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((RealImageLoader) this.IconCompatParcelizer, (ShaderKt) obj2, shortNewsContentCardView, 0);
                    anonymousClass2.read = obj;
                    return anonymousClass2;
                case 1:
                    return new AnonymousClass2((TransitionState) obj2, shortNewsContentCardView);
                case 2:
                    return new AnonymousClass2((MutableInteractionSourceImpl) this.read, (CheckboxKt) this.IconCompatParcelizer, (setAndStartAnimation) obj2, shortNewsContentCardView, 2);
                case 3:
                    return new AnonymousClass2((MutableInteractionSourceImpl) this.read, (ButtonDefaults) this.IconCompatParcelizer, (setAndStartAnimation) obj2, shortNewsContentCardView, 3);
                case 4:
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.IconCompatParcelizer, (AnchoredDraggableState) obj2, shortNewsContentCardView, 4);
                    anonymousClass3.read = obj;
                    return anonymousClass3;
                case 5:
                    AnonymousClass2 anonymousClass4 = new AnonymousClass2((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) this.IconCompatParcelizer, (AnchoredDraggableState) obj2, shortNewsContentCardView, 5);
                    anonymousClass4.read = obj;
                    return anonymousClass4;
                case 6:
                    AnonymousClass2 anonymousClass5 = new AnonymousClass2((DefaultScrollableState) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 6);
                    anonymousClass5.read = obj;
                    return anonymousClass5;
                case 7:
                    return new AnonymousClass2((DefaultScrollableState) this.read, (applyMeasureResultfoundation) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 7);
                case 8:
                    AnonymousClass2 anonymousClass6 = new AnonymousClass2((DragGestureNode$startListeningForEvents$1) this.IconCompatParcelizer, (DraggableNode) obj2, shortNewsContentCardView, 8);
                    anonymousClass6.read = obj;
                    return anonymousClass6;
                case 9:
                    AnonymousClass2 anonymousClass7 = new AnonymousClass2((DraggableNode) this.IconCompatParcelizer, (FloatingTextActionModeCallback) obj2, shortNewsContentCardView, 9);
                    anonymousClass7.read = obj;
                    return anonymousClass7;
                case 10:
                    AnonymousClass2 anonymousClass8 = new AnonymousClass2((ScrollingLogic) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 10);
                    anonymousClass8.read = obj;
                    return anonymousClass8;
                case 11:
                    return new AnonymousClass2((MergedTaskStateRepositoryImpl$getMergedState$2) this.read, (PressGestureScopeImpl) this.IconCompatParcelizer, (PointerInputChange) obj2, shortNewsContentCardView, 11);
                case 12:
                    AnonymousClass2 anonymousClass9 = new AnonymousClass2((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 12);
                    anonymousClass9.read = obj;
                    return anonymousClass9;
                case 13:
                    return new AnonymousClass2((BringIntoViewResponderNode) this.read, (LayoutCoordinates) this.IconCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView, 13);
                case 14:
                    return new AnonymousClass2((boximpl) this.IconCompatParcelizer, (getHighNSsRyOo) obj2, shortNewsContentCardView, 14);
                case 15:
                    AnonymousClass2 anonymousClass10 = new AnonymousClass2((onViewAttachedToWindow) this.IconCompatParcelizer, (Animatable) obj2, shortNewsContentCardView, 15);
                    anonymousClass10.read = obj;
                    return anonymousClass10;
                case 16:
                    AnonymousClass2 anonymousClass11 = new AnonymousClass2((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.IconCompatParcelizer, (androidx.compose.material3.internal.AnchoredDraggableState) obj2, shortNewsContentCardView, 16);
                    anonymousClass11.read = obj;
                    return anonymousClass11;
                case 17:
                    AnonymousClass2 anonymousClass12 = new AnonymousClass2((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) this.IconCompatParcelizer, (androidx.compose.material3.internal.AnchoredDraggableState) obj2, shortNewsContentCardView, 17);
                    anonymousClass12.read = obj;
                    return anonymousClass12;
                case 18:
                    return new AnonymousClass2((MutableStateFlow) this.IconCompatParcelizer, (TooltipStateImpl) obj2, shortNewsContentCardView, 18);
                case 19:
                    AnonymousClass2 anonymousClass13 = new AnonymousClass2((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.IconCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 19);
                    anonymousClass13.read = obj;
                    return anonymousClass13;
                case 20:
                    AnonymousClass2 anonymousClass14 = new AnonymousClass2((TextAnnouncementContentCardView) this.IconCompatParcelizer, (Flow) obj2, shortNewsContentCardView, 20);
                    anonymousClass14.read = obj;
                    return anonymousClass14;
                case 21:
                    return new AnonymousClass2((SeekableTransitionState) this.read, (PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer, (populate) obj2, shortNewsContentCardView, 21);
                case 22:
                    return new AnonymousClass2((BezierKtWhenMappings) this.read, (Uri) this.IconCompatParcelizer, (InputEvent) obj2, shortNewsContentCardView, 22);
                case 23:
                    return new AnonymousClass2((String[]) this.IconCompatParcelizer, (MultiInstanceInvalidationClient) obj2, shortNewsContentCardView, 23);
                case 24:
                    return new AnonymousClass2((createInAppMessageEventSubscriber) this.IconCompatParcelizer, (Pool) obj2, shortNewsContentCardView, 24);
                case 25:
                    AnonymousClass2 anonymousClass15 = new AnonymousClass2((component11SzJe1aQ) this.IconCompatParcelizer, (Context) obj2, shortNewsContentCardView, 25);
                    anonymousClass15.read = obj;
                    return anonymousClass15;
                case 26:
                    return new AnonymousClass2((getGlobalChangeEntries) this.IconCompatParcelizer, (ChatService) obj2, shortNewsContentCardView, 26);
                case 27:
                    return new AnonymousClass2((FragmentMetricsLifecycleCallback) this.read, (String) this.IconCompatParcelizer, (Fragment) obj2, shortNewsContentCardView, 27);
                case 28:
                    AnonymousClass2 anonymousClass16 = new AnonymousClass2((TransitionValuesMaps) this.IconCompatParcelizer, (updateClipPath) obj2, shortNewsContentCardView, 28);
                    anonymousClass16.read = obj;
                    return anonymousClass16;
                default:
                    AnonymousClass2 anonymousClass17 = new AnonymousClass2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer, (PerseusEvent) obj2, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
                    anonymousClass17.read = obj;
                    return anonymousClass17;
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i) {
                case 0:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 1:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 2:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 3:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 4:
                    return ((AnonymousClass2) create((TextFieldCursor_androidKt) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    return ((AnonymousClass2) create((onViewAttachedToWindowlambda0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 6:
                    return ((AnonymousClass2) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 7:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 8:
                    return ((AnonymousClass2) create((booleanValue) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 9:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 10:
                    return ((AnonymousClass2) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 11:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 12:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 13:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 14:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 15:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 16:
                    return ((AnonymousClass2) create((listValue) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 17:
                    return ((AnonymousClass2) create((onViewAttachedToWindowlambda0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 18:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 19:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 20:
                    return ((AnonymousClass2) create((notifyContentCaptureChanges) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 21:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 22:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 23:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 24:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 25:
                    return ((AnonymousClass2) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 26:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 27:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 28:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                default:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0046  */
        /* JADX WARN: Code duplicated, block: B:15:0x0053  */
        /* JADX WARN: Code duplicated, block: B:18:0x0067  */
        /* JADX WARN: Code duplicated, block: B:205:0x043d  */
        /* JADX WARN: Code duplicated, block: B:252:0x0596  */
        /* JADX WARN: Code duplicated, block: B:479:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:480:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0051 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 2322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.read = obj;
            this.IconCompatParcelizer = obj2;
            this.serializer = obj3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = obj;
            this.serializer = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TransitionState transitionState, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = 1;
            this.serializer = transitionState;
        }
    }

    public final getRadiusui_graphics write() {
        return (getRadiusui_graphics) this.write.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0219 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x0037, B:86:0x01ba, B:88:0x01c0, B:95:0x0202, B:91:0x01cc, B:94:0x01fc, B:96:0x0209, B:98:0x020d, B:101:0x0219, B:102:0x021e, B:19:0x004a), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0238 A[Catch: all -> 0x024c, TRY_LEAVE, TryCatch #3 {all -> 0x024c, blocks: (B:110:0x0234, B:112:0x0238, B:115:0x0245, B:116:0x024b), top: B:125:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0245 A[Catch: all -> 0x024c, TRY_ENTER, TryCatch #3 {all -> 0x024c, blocks: (B:110:0x0234, B:112:0x0238, B:115:0x0245, B:116:0x024b), top: B:125:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0 A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x0037, B:86:0x01ba, B:88:0x01c0, B:95:0x0202, B:91:0x01cc, B:94:0x01fc, B:96:0x0209, B:98:0x020d, B:101:0x0219, B:102:0x021e, B:19:0x004a), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cc A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x0037, B:86:0x01ba, B:88:0x01c0, B:95:0x0202, B:91:0x01cc, B:94:0x01fc, B:96:0x0209, B:98:0x020d, B:101:0x0219, B:102:0x021e, B:19:0x004a), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fc A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x0037, B:86:0x01ba, B:88:0x01c0, B:95:0x0202, B:91:0x01cc, B:94:0x01fc, B:96:0x0209, B:98:0x020d, B:101:0x0219, B:102:0x021e, B:19:0x004a), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0209 A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x0037, B:86:0x01ba, B:88:0x01c0, B:95:0x0202, B:91:0x01cc, B:94:0x01fc, B:96:0x0209, B:98:0x020d, B:101:0x0219, B:102:0x021e, B:19:0x004a), top: B:124:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x020d A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x0037, B:86:0x01ba, B:88:0x01c0, B:95:0x0202, B:91:0x01cc, B:94:0x01fc, B:96:0x0209, B:98:0x020d, B:101:0x0219, B:102:0x021e, B:19:0x004a), top: B:124:0x0029 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, o.accessquadraticTojd] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [o.ShaderKt] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [o.Shadow] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, o.ShaderKt] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [coil3.RealImageLoader] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18, types: [o.Shadow] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [o.ShaderKt] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, o.accessquadraticTojd] */
    /* JADX WARN: Type inference failed for: r2v25, types: [o.accessquadraticTojd] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, o.accessquadraticTojd] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.ShaderKt] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [o.Shadow] */
    /* JADX WARN: Type inference failed for: r4v19, types: [o.ShaderKt] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o.ShaderKt] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.Shadow] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, o.accessquadraticTojd] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [o.accessquadraticTojd] */
    /* JADX WARN: Type inference failed for: r5v20, types: [o.Shadow] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object execute(ShaderKt shaderKt, int i, ContinuationImpl continuationImpl) {
        addRectdefault addrectdefault;
        ?? r5;
        ?? r4;
        Shadow updateoutlineui;
        SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1;
        ShaderKt shaderKtIconCompatParcelizer;
        accessquadraticTojd accessquadratictojd;
        ?? r6;
        ?? r7;
        ?? r2;
        getNoneannotations getnoneannotations;
        ?? r8;
        ?? r3;
        ?? r1;
        ?? r14;
        ?? r15;
        ?? r13;
        accessrewindjd accessrewindjdVar;
        ?? r9;
        ?? r10;
        ?? r11;
        RadialGradientShader8uybcMk radialGradientShader8uybcMk;
        getColor0d7_KjUannotations getcolor0d7_kjuannotations;
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier;
        ShaderKt shaderKt2;
        StampedPathEffectStyleCompanion stampedPathEffectStyleCompanion;
        if (continuationImpl instanceof addRectdefault) {
            addrectdefault = (addRectdefault) continuationImpl;
            int i2 = addrectdefault.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addrectdefault.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                addrectdefault = new addRectdefault(this, continuationImpl);
            }
        } else {
            addrectdefault = new addRectdefault(this, continuationImpl);
        }
        addRectdefault addrectdefault2 = addrectdefault;
        Object objWithContext = addrectdefault2.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r12 = addrectdefault2.RemoteActionCompatParcelizer;
        try {
            if (r12 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0IconCompatParcelizer = JobKt.IconCompatParcelizer(addrectdefault2.getContext());
                boolean z = i == 0;
                Extras$Key extras$Key = this.read;
                extras$Key.getClass();
                SimpleGraphicsLayerModifier simpleGraphicsLayerModifier2 = shaderKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                supportsColorMatrixQuery lifecycle = (supportsColorMatrixQuery) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{shaderKt, LinearGradientShaderVjE6UOU.write});
                if (lifecycle == null) {
                    if (!z) {
                        lifecycle = null;
                        break;
                    }
                    Object baseContext = shaderKt.read;
                    while (true) {
                        if (baseContext instanceof accessisRenderNodeCompatiblecp) {
                            lifecycle = ((accessisRenderNodeCompatiblecp) baseContext).getLifecycle();
                            break;
                        }
                        if (!(baseContext instanceof ContextWrapper)) {
                            lifecycle = null;
                            break;
                        }
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                if (lifecycle != null) {
                    updateoutlineui = new LifecycleRequestDelegate(lifecycle, setallviewgroupchildrenasnonaccessibilityimportantlambda0IconCompatParcelizer);
                } else {
                    updateoutlineui = new updateOutlineui(setallviewgroupchildrenasnonaccessibilityimportantlambda0IconCompatParcelizer);
                }
                setTransformQ8lPUPs settransformq8lpupsWrite = ShaderKt.write(shaderKt);
                settransformq8lpupsWrite.serializer = ((RealImageLoader) extras$Key.IconCompatParcelizer).write.RemoteActionCompatParcelizer;
                CompositeShader7EN7VTw compositeShader7EN7VTw = shaderKt.serializer;
                SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock2 = compositeShader7EN7VTw.RatingCompat;
                if (simpleGraphicsLayerModifierlayerBlock2 == null) {
                    simpleGraphicsLayerModifierlayerBlock1 = SimpleGraphicsLayerModifierlayerBlock1.serializer;
                    settransformq8lpupsWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = simpleGraphicsLayerModifierlayerBlock1;
                } else {
                    simpleGraphicsLayerModifierlayerBlock1 = simpleGraphicsLayerModifierlayerBlock2;
                }
                if (compositeShader7EN7VTw.MediaBrowserCompatMediaItem == null) {
                    settransformq8lpupsWrite.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = shaderKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                }
                if (compositeShader7EN7VTw.MediaDescriptionCompat == null) {
                    if (simpleGraphicsLayerModifierlayerBlock2 == null) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{simpleGraphicsLayerModifierlayerBlock1, SimpleGraphicsLayerModifierlayerBlock1.serializer}, getCieXyz.write())).booleanValue()) {
                            getnoneannotations = getNoneannotations.INEXACT;
                        } else {
                            getnoneannotations = getNoneannotations.EXACT;
                        }
                    } else {
                        getnoneannotations = getNoneannotations.EXACT;
                    }
                    settransformq8lpupsWrite.ResultReceiver = getnoneannotations;
                }
                shaderKtIconCompatParcelizer = settransformq8lpupsWrite.IconCompatParcelizer();
                accessquadratictojd = accessquadraticTojd.IconCompatParcelizer;
                try {
                    if (!shaderKtIconCompatParcelizer.write.equals(RadialGradientShader8uybcMkdefault.serializer)) {
                        updateoutlineui.RemoteActionCompatParcelizer();
                        if (i == 0) {
                            addrectdefault2.read = updateoutlineui;
                            addrectdefault2.IconCompatParcelizer = shaderKtIconCompatParcelizer;
                            addrectdefault2.serializer = accessquadratictojd;
                            addrectdefault2.RemoteActionCompatParcelizer = 1;
                            if (updateoutlineui.awaitStarted(addrectdefault2) == coroutineSingletons) {
                                r1 = shaderKtIconCompatParcelizer;
                                r3 = updateoutlineui;
                                r8 = accessquadratictojd;
                            } else {
                                r1 = shaderKtIconCompatParcelizer;
                                r3 = updateoutlineui;
                                r8 = accessquadratictojd;
                                r6 = shaderKtIconCompatParcelizer;
                                r7 = updateoutlineui;
                                r2 = accessquadratictojd;
                                r1 = r6;
                                ?? r21 = r7;
                                r8 = r2;
                                r3 = r21;
                            }
                        }
                        return coroutineSingletons;
                    }
                    throw new NullRequestDataException();
                } catch (Throwable th) {
                    th = th;
                    r4 = shaderKtIconCompatParcelizer;
                    r5 = updateoutlineui;
                    r12 = accessquadratictojd;
                    if (!(th instanceof CancellationException)) {
                        ImageShaderF49vj9s imageShaderF49vj9sWrite = UtilsKt.write((ShaderKt) r4, th);
                        read(imageShaderF49vj9sWrite, r4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, r12);
                        r5.IconCompatParcelizer();
                        return imageShaderF49vj9sWrite;
                    }
                    r12.getClass();
                    r4.getClass();
                    throw th;
                }
            }
            if (r12 == 1) {
                r12 = addrectdefault2.serializer;
                r4 = addrectdefault2.IconCompatParcelizer;
                r5 = addrectdefault2.read;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    r2 = r12;
                    r6 = r4;
                    r7 = r5;
                    r1 = r6;
                    ?? r22 = r7;
                    r8 = r2;
                    r3 = r22;
                } catch (Throwable th2) {
                    th = th2;
                    if (!(th instanceof CancellationException)) {
                        ImageShaderF49vj9s imageShaderF49vj9sWrite2 = UtilsKt.write((ShaderKt) r4, th);
                        read(imageShaderF49vj9sWrite2, r4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, r12);
                        r5.IconCompatParcelizer();
                        return imageShaderF49vj9sWrite2;
                    }
                    r12.getClass();
                    r4.getClass();
                    throw th;
                }
            } else {
                if (r12 == 2) {
                    accessrewindjd accessrewindjdVar2 = addrectdefault2.write;
                    accessquadraticTojd accessquadratictojd2 = addrectdefault2.serializer;
                    ShaderKt shaderKt3 = addrectdefault2.IconCompatParcelizer;
                    Shadow shadow = addrectdefault2.read;
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    accessrewindjdVar = accessrewindjdVar2;
                    r13 = accessquadratictojd2;
                    r14 = shaderKt3;
                    r15 = shadow;
                    try {
                        r13.getClass();
                        TextAnnouncementContentCardView textAnnouncementContentCardView = r14.MediaSessionCompatToken;
                        RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(r14, this, (accessgetLayerBlockp) objWithContext, r13, accessrewindjdVar, null);
                        addrectdefault2.read = r15;
                        addrectdefault2.IconCompatParcelizer = r14;
                        addrectdefault2.serializer = r13;
                        addrectdefault2.write = null;
                        addrectdefault2.RemoteActionCompatParcelizer = 3;
                        objWithContext = BuildersKt.withContext(textAnnouncementContentCardView, realImageLoader$execute$result$1, addrectdefault2);
                        if (objWithContext != coroutineSingletons) {
                            r9 = r13;
                            r10 = r14;
                            r11 = r15;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        r12 = r13;
                        r4 = r14;
                        r5 = r15;
                        try {
                            if (!(th instanceof CancellationException)) {
                                ImageShaderF49vj9s imageShaderF49vj9sWrite3 = UtilsKt.write((ShaderKt) r4, th);
                                read(imageShaderF49vj9sWrite3, r4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, r12);
                                r5.IconCompatParcelizer();
                                return imageShaderF49vj9sWrite3;
                            }
                            r12.getClass();
                            r4.getClass();
                            throw th;
                        } catch (Throwable th4) {
                            r5.IconCompatParcelizer();
                            throw th4;
                        }
                    }
                }
                if (r12 == 3) {
                    accessquadraticTojd accessquadratictojd3 = addrectdefault2.serializer;
                    ShaderKt shaderKt4 = addrectdefault2.IconCompatParcelizer;
                    Shadow shadow2 = addrectdefault2.read;
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    r9 = accessquadratictojd3;
                    r10 = shaderKt4;
                    r11 = shadow2;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                radialGradientShader8uybcMk = (RadialGradientShader8uybcMk) objWithContext;
                if (radialGradientShader8uybcMk instanceof getColor0d7_KjUannotations) {
                    getcolor0d7_kjuannotations = (getColor0d7_KjUannotations) radialGradientShader8uybcMk;
                    simpleGraphicsLayerModifier = r10.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    shaderKt2 = getcolor0d7_kjuannotations.RatingCompat;
                    if (!(simpleGraphicsLayerModifier instanceof PathEffectCompanion)) {
                        Object obj = ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{shaderKt2, LinearGradientShaderVjE6UOU.MediaDescriptionCompat});
                        stampedPathEffectStyleCompanion = ((accessgetTranslatecp) obj).read((PathEffectCompanion) simpleGraphicsLayerModifier, getcolor0d7_kjuannotations);
                        if (stampedPathEffectStyleCompanion instanceof getRotateYpspkwk) {
                            r9.getClass();
                            stampedPathEffectStyleCompanion.RemoteActionCompatParcelizer();
                        }
                    }
                    r9.getClass();
                    shaderKt2.getClass();
                } else if (radialGradientShader8uybcMk instanceof ImageShaderF49vj9s) {
                    read((ImageShaderF49vj9s) radialGradientShader8uybcMk, r10.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, r9);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                r11.IconCompatParcelizer();
                return radialGradientShader8uybcMk;
            }
            r1 = shaderKtIconCompatParcelizer;
            r3 = updateoutlineui;
            r8 = accessquadratictojd;
            r1.getClass();
            SimpleGraphicsLayerModifier simpleGraphicsLayerModifier3 = r1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (simpleGraphicsLayerModifier3 != null) {
                accessrewindjd accessrewindjdVar3 = (accessrewindjd) r1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(r1);
                if (accessrewindjdVar3 == null) {
                    accessrewindjdVar3 = (accessrewindjd) r1.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper.invoke(r1);
                }
                simpleGraphicsLayerModifier3.read(accessrewindjdVar3);
            }
            r8.getClass();
            SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock3 = r1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            addrectdefault2.read = r3;
            addrectdefault2.IconCompatParcelizer = r1;
            addrectdefault2.serializer = r8;
            addrectdefault2.write = null;
            addrectdefault2.RemoteActionCompatParcelizer = 2;
            Object size = simpleGraphicsLayerModifierlayerBlock3.size(addrectdefault2);
            if (size != coroutineSingletons) {
                r14 = r1;
                r15 = r3;
                r13 = r8;
                accessrewindjdVar = null;
                objWithContext = size;
                r13.getClass();
                TextAnnouncementContentCardView textAnnouncementContentCardView2 = r14.MediaSessionCompatToken;
                RealImageLoader$execute$result$1 realImageLoader$execute$result$2 = new RealImageLoader$execute$result$1(r14, this, (accessgetLayerBlockp) objWithContext, r13, accessrewindjdVar, null);
                addrectdefault2.read = r15;
                addrectdefault2.IconCompatParcelizer = r14;
                addrectdefault2.serializer = r13;
                addrectdefault2.write = null;
                addrectdefault2.RemoteActionCompatParcelizer = 3;
                objWithContext = BuildersKt.withContext(textAnnouncementContentCardView2, realImageLoader$execute$result$2, addrectdefault2);
                if (objWithContext != coroutineSingletons) {
                    r9 = r13;
                    r10 = r14;
                    r11 = r15;
                    radialGradientShader8uybcMk = (RadialGradientShader8uybcMk) objWithContext;
                    if (radialGradientShader8uybcMk instanceof getColor0d7_KjUannotations) {
                        getcolor0d7_kjuannotations = (getColor0d7_KjUannotations) radialGradientShader8uybcMk;
                        simpleGraphicsLayerModifier = r10.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        shaderKt2 = getcolor0d7_kjuannotations.RatingCompat;
                        if (!(simpleGraphicsLayerModifier instanceof PathEffectCompanion)) {
                            Object obj2 = ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{shaderKt2, LinearGradientShaderVjE6UOU.MediaDescriptionCompat});
                            stampedPathEffectStyleCompanion = ((accessgetTranslatecp) obj2).read((PathEffectCompanion) simpleGraphicsLayerModifier, getcolor0d7_kjuannotations);
                            if (stampedPathEffectStyleCompanion instanceof getRotateYpspkwk) {
                                r9.getClass();
                                stampedPathEffectStyleCompanion.RemoteActionCompatParcelizer();
                            }
                        }
                        r9.getClass();
                        shaderKt2.getClass();
                    } else if (radialGradientShader8uybcMk instanceof ImageShaderF49vj9s) {
                        read((ImageShaderF49vj9s) radialGradientShader8uybcMk, r10.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, r9);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    r11.IconCompatParcelizer();
                    return radialGradientShader8uybcMk;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            th = th5;
            r5 = 1;
            r4 = 2;
        }
    }

    public RealImageLoader(addPathUv8p0NAdefault addpathuv8p0nadefault) {
        this.write = addpathuv8p0nadefault;
        int i = 0;
        YieldKt.RemoteActionCompatParcelizer(Room.read(UrlUtils.serializer(), new and(getOnBackInvokedCallback.RemoteActionCompatParcelizer, i)));
        StrokeCapCompanion strokeCapCompanion = new StrokeCapCompanion(this);
        Extras$Key extras$Key = new Extras$Key(12, this);
        this.read = extras$Key;
        ComponentRegistry$Builder componentRegistry$Builder = new ComponentRegistry$Builder(addpathuv8p0nadefault.IconCompatParcelizer);
        ArrayList arrayList = (ArrayList) componentRegistry$Builder.write;
        ArrayList arrayList2 = (ArrayList) componentRegistry$Builder.IconCompatParcelizer;
        ArrayList arrayList3 = (ArrayList) componentRegistry$Builder.RemoteActionCompatParcelizer;
        ArrayList arrayList4 = (ArrayList) componentRegistry$Builder.serializer;
        ImageShaderF49vj9sdefault imageShaderF49vj9sdefault = addpathuv8p0nadefault.RemoteActionCompatParcelizer;
        Object obj = imageShaderF49vj9sdefault.RemoteActionCompatParcelizer.read.get(accesstransform58bKbWcjd.serializer);
        int i2 = 3;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new minus(i));
            arrayList4.add(new minus(i2));
        }
        int i3 = 1;
        componentRegistry$Builder.IconCompatParcelizer(new accessgetPolygoncp(i3), displayInAppMessagelambda1.serializer(Uri.class));
        componentRegistry$Builder.IconCompatParcelizer(new accessgetPolygoncp(i2), displayInAppMessagelambda1.serializer(Integer.class));
        arrayList3.add(new onViewAttachedToWindowlambda0(new getPointsr_lszbg(1), displayInAppMessagelambda1.serializer(PathDefaultImpls.class)));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(i3), displayInAppMessagelambda1.serializer(PathDefaultImpls.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(4), displayInAppMessagelambda1.serializer(PathDefaultImpls.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(9), displayInAppMessagelambda1.serializer(PathDefaultImpls.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(6), displayInAppMessagelambda1.serializer(Drawable.class));
        Extras$Key extras$Key2 = accessxorjd.serializer;
        Object obj2 = imageShaderF49vj9sdefault.RemoteActionCompatParcelizer.read.get(accessxorjd.serializer);
        getInAppMessageManagerListener getinappmessagemanagerlistenerSerializer = getInAppMessageAnimationFactory.serializer(((Number) (obj2 == null ? 4 : obj2)).intValue());
        int i4 = Build.VERSION.SDK_INT;
        Object obj3 = accessgetUnioncp.read;
        if (i4 >= 29) {
            Object obj4 = imageShaderF49vj9sdefault.RemoteActionCompatParcelizer.read.get(accessxorjd.read);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = imageShaderF49vj9sdefault.RemoteActionCompatParcelizer.read.get(accessxorjd.write);
                if (((accessgetUnioncp) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList4.add(new getStrokeTiuSbCo(new getReverseDifference(getinappmessagemanagerlistenerSerializer), i3));
                }
            }
        }
        Object obj6 = imageShaderF49vj9sdefault.RemoteActionCompatParcelizer.read.get(accessxorjd.write);
        arrayList4.add(new getStrokeTiuSbCo(new PathHitTesterWhenMappings(getinappmessagemanagerlistenerSerializer, (accessgetUnioncp) (obj6 != null ? obj6 : obj3)), i3));
        componentRegistry$Builder.IconCompatParcelizer(new accessgetPolygoncp(i), displayInAppMessagelambda1.serializer(File.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(8), displayInAppMessagelambda1.serializer(PathDefaultImpls.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(i2), displayInAppMessagelambda1.serializer(ByteBuffer.class));
        componentRegistry$Builder.IconCompatParcelizer(new accessgetPolygoncp(4), displayInAppMessagelambda1.serializer(String.class));
        int i5 = 2;
        componentRegistry$Builder.IconCompatParcelizer(new accessgetPolygoncp(i5), displayInAppMessagelambda1.serializer(RecyclableBufferedInputStream.class));
        arrayList3.add(new onViewAttachedToWindowlambda0(new getPointsr_lszbg(2), displayInAppMessagelambda1.serializer(PathDefaultImpls.class)));
        arrayList3.add(new onViewAttachedToWindowlambda0(new getPointsr_lszbg(0), displayInAppMessagelambda1.serializer(PathDefaultImpls.class)));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(7), displayInAppMessagelambda1.serializer(PathDefaultImpls.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(i5), displayInAppMessagelambda1.serializer(byte[].class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(5), displayInAppMessagelambda1.serializer(PathDefaultImpls.class));
        componentRegistry$Builder.IconCompatParcelizer(new PathSegment(i), displayInAppMessagelambda1.serializer(Bitmap.class));
        arrayList.add(new EngineInterceptor(this, strokeCapCompanion, extras$Key));
        this.serializer = new accessandjd(DelayKt.RemoteActionCompatParcelizer(arrayList), DelayKt.RemoteActionCompatParcelizer((ArrayList) componentRegistry$Builder.read), DelayKt.RemoteActionCompatParcelizer(arrayList3), DelayKt.RemoteActionCompatParcelizer(arrayList2), DelayKt.RemoteActionCompatParcelizer(arrayList4));
    }

    public final void read(ImageShaderF49vj9s imageShaderF49vj9s, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier, accessquadraticTojd accessquadratictojd) {
        ShaderKt shaderKtWrite = imageShaderF49vj9s.write();
        if (simpleGraphicsLayerModifier instanceof PathEffectCompanion) {
            Object[] objArr = {imageShaderF49vj9s.write(), LinearGradientShaderVjE6UOU.MediaDescriptionCompat};
            int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            StampedPathEffectStyleCompanion stampedPathEffectStyleCompanion = ((accessgetTranslatecp) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr)).read((PathEffectCompanion) simpleGraphicsLayerModifier, imageShaderF49vj9s);
            if (!(stampedPathEffectStyleCompanion instanceof getRotateYpspkwk)) {
                accessquadratictojd.getClass();
                stampedPathEffectStyleCompanion.RemoteActionCompatParcelizer();
            }
        }
        accessquadratictojd.getClass();
        shaderKtWrite.getClass();
    }

    static {
        AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "IconCompatParcelizer");
    }

    public final Object serializer(ShaderKt shaderKt, ContinuationImpl continuationImpl) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = shaderKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (!(shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 instanceof Shape)) {
            Object[] objArr = {shaderKt, LinearGradientShaderVjE6UOU.write};
            int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            if (((supportsColorMatrixQuery) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr)) == null) {
                return execute(shaderKt, 1, continuationImpl);
            }
        }
        return YieldKt.coroutineScope(new AnonymousClass2(this, shaderKt, (ShortNewsContentCardView) null, 0), continuationImpl);
    }
}
