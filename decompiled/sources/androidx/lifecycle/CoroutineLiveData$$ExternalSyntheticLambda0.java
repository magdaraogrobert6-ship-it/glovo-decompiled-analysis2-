package androidx.lifecycle;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.navigation.fragment.NavHostFragment;
import androidx.transition.TransitionValuesMaps;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamite.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.logistics.rider.glovo.R;
import java.util.Arrays;
import o.AndroidCursorHandle_androidKt;
import o.AndroidPathIterator;
import o.AndroidRenderEffect_androidKt;
import o.Camera2DeviceSurfaceManager;
import o.ComposedModifierKt;
import o.DragAndDrop_androidKt;
import o.FocusMeteringAction;
import o.FocusMeteringControl;
import o.LazyLayoutSemanticStateKtLazyLayoutSemanticState1;
import o.PagerStaterequestScrollToPage1;
import o.SelectionHandleIcon;
import o.SnapshotStateListExternalSyntheticLambda0;
import o.TrackpadScrollingLogic;
import o.accessgetGreencp;
import o.any;
import o.boximpl;
import o.countTransparentColors;
import o.createFromParcel;
import o.createImageBitmap;
import o.cubicTo;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.equals;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getFilterQualityfv9h1I;
import o.getGreen0d7_KjU;
import o.getKey2;
import o.getNativePathEffect;
import o.getWhite0d7_KjU;
import o.hashCodeimpl;
import o.invalidateShadow;
import o.isAdapterPositionOnScreen;
import o.isAppSetIdReadingEnabled;
import o.isSupported0vamqd0;
import o.isText;
import o.obtainPainter;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.preferredFrameRate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.relativeMoveTo;
import o.removeNodeAtDepth;
import o.setDetachedListenerui;
import o.setNativeShader;
import o.toAndroidTileMode0vamqd0;
import o.toColorLong8_81llA;
import o.validateColorStops;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CoroutineLiveData$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ CoroutineLiveData$$ExternalSyntheticLambda0(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

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
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws PendingIntent.CanceledException {
        TextLayoutInput layoutInput;
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.RemoteActionCompatParcelizer;
        final int i2 = 1;
        final int i3 = 0;
        text = null;
        AnnotatedString text = null;
        switch (i) {
            case 0:
                ((CoroutineLiveData) obj).RemoteActionCompatParcelizer = null;
                return createfromparcel;
            case 1:
                int i4 = FocusMeteringControl.write[((Camera2DeviceSurfaceManager) obj).write().ordinal()];
                if (i4 == 1) {
                    i2 = 0;
                } else if (i4 != 2) {
                    i2 = 3;
                    if (i4 == 3) {
                        i2 = 2;
                    } else if (i4 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                }
                return Integer.valueOf(i2);
            case 2:
                return ((FocusMeteringAction) ((TransitionValuesMaps) obj).MediaBrowserCompatMediaItem).serializer(34);
            case 3:
                return Float.valueOf(SuspendAnimationKt.read(((getContentViewGroupParentLayout) obj).getCoroutineContext()));
            case 4:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
                Transition transition = seekableTransitionState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                seekableTransitionState.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = transition != null ? transition.RemoteActionCompatParcelizer() : 0L;
                return createfromparcel;
            case 5:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = ((CombinedClickableNode) obj).addObserverForBackInvokerlambda0;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                return Boolean.TRUE;
            case 6:
                AndroidCursorHandle_androidKt androidCursorHandle_androidKt = (AndroidCursorHandle_androidKt) obj;
                LazyLayoutSemanticStateKtLazyLayoutSemanticState1 lazyLayoutSemanticStateKtLazyLayoutSemanticState1 = (LazyLayoutSemanticStateKtLazyLayoutSemanticState1) CompositionLocalConsumerModifierNodeKt.currentValueOf(androidCursorHandle_androidKt, PagerStaterequestScrollToPage1.serializer);
                androidCursorHandle_androidKt.IconCompatParcelizer = lazyLayoutSemanticStateKtLazyLayoutSemanticState1;
                androidCursorHandle_androidKt.MediaSessionCompatQueueItem = lazyLayoutSemanticStateKtLazyLayoutSemanticState1 != null ? new AndroidEdgeEffectOverscrollEffect(lazyLayoutSemanticStateKtLazyLayoutSemanticState1.RemoteActionCompatParcelizer, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.IconCompatParcelizer, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.read, lazyLayoutSemanticStateKtLazyLayoutSemanticState1.serializer) : null;
                return createfromparcel;
            case 7:
                return Float.valueOf(((Density) obj).mo48toPx0680j_4(Dp.m3673constructorimpl(125.0f)));
            case 8:
                return (Rect) obj;
            case 9:
                SnapshotStateListExternalSyntheticLambda0 snapshotStateListExternalSyntheticLambda0 = (SnapshotStateListExternalSyntheticLambda0) obj;
                snapshotStateListExternalSyntheticLambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.invoke(Boolean.valueOf(!snapshotStateListExternalSyntheticLambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0));
                return createfromparcel;
            case 10:
                return new equals((SelectionHandleIcon) obj, 0.0f);
            case 11:
                return ((LegacyTextFieldState) obj).serializer();
            case 12:
                return IntOffset.m3792boximpl(((IntRect) obj).m3830getTopLeftnOccac());
            case 13:
                TextLinkScope textLinkScope = (TextLinkScope) obj;
                AnnotatedString annotatedString = textLinkScope.IconCompatParcelizer;
                TextLayoutResult textLayoutResult = (TextLayoutResult) ((onShowTranslationui) textLinkScope.RemoteActionCompatParcelizer).getValue();
                if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
                    text = layoutInput.getText();
                }
                return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedString, text}, getCieXyz.write())).booleanValue());
            case 14:
                return ((hashCodeimpl) obj).serializer();
            case 15:
                ((ComposedModifierKt) obj).read();
                return createfromparcel;
            case 16:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    preferredFrameRate.read(actionIntent);
                } else {
                    actionIntent.send();
                }
                return createfromparcel;
            case 17:
                boximpl boximplVar = (boximpl) obj;
                return boximplVar.isAttached() ? zzpc.collectTextContextMenuData(boximplVar) : any.read;
            case 18:
                Object systemService = ((View) ((accessgetGreencp) obj).IconCompatParcelizer).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 19:
                return new BaseInputConnection(((getKey2) obj).PlaybackStateCompatCustomAction, false);
            case 20:
                DrawModifierNodeKt.invalidateDraw((setDetachedListenerui) obj);
                return createfromparcel;
            case 21:
                return Float.valueOf(((isText) obj).IconCompatParcelizer() < 1.0f ? 0.3f : 1.0f);
            case 22:
                DragAndDrop_androidKt dragAndDrop_androidKt = (DragAndDrop_androidKt) obj;
                invalidateShadow invalidateshadow = dragAndDrop_androidKt.serializer;
                Object obj2 = dragAndDrop_androidKt.MediaSessionCompatQueueItem;
                if (obj2 != null) {
                    return invalidateshadow.save(dragAndDrop_androidKt, obj2);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Value should be initialized");
                return null;
            case 23:
                getWhite0d7_KjU getwhite0d7_kju = ((obtainPainter) obj).write;
                if (getwhite0d7_kju == null) {
                    return null;
                }
                Bundle bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
                getwhite0d7_kju.read(bundle);
                if (bundle.isEmpty()) {
                    return null;
                }
                return bundle;
            case 24:
                return ShaderBrushSpan.shaderState$lambda$0((ShaderBrushSpan) obj);
            case 25:
                return ComposeViewAdapter.init$lambda$2$0$2$0((ComposeViewAdapter) obj);
            case 26:
                return Long.valueOf(Utils_androidKt.createTransitionInfo$lambda$0((TrackpadScrollingLogic) obj));
            case 27:
                return Long.valueOf(((ClockInfo) obj).getMaxDurationPerIterationMillis());
            case 28:
                validateColorStops validatecolorstops = ((cubicTo) obj).MediaBrowserCompatMediaItem;
                if (!validatecolorstops.MediaSessionCompatResultReceiverWrapper) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (validatecolorstops.RatingCompat.RatingCompat != toColorLong8_81llA.DESTROYED) {
                    return ((isSupported0vamqd0) zzj.serializer(validatecolorstops.IconCompatParcelizer, (createImageBitmap) validatecolorstops.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper(), 4).write(displayInAppMessagelambda1.serializer(isSupported0vamqd0.class))).RemoteActionCompatParcelizer;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                return null;
            default:
                final NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context = navHostFragment.getContext();
                if (context == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("NavController cannot be created before the fragment is attached");
                    return null;
                }
                final relativeMoveTo relativemoveto = new relativeMoveTo(context);
                relativemoveto.write(navHostFragment);
                getFilterQualityfv9h1I viewModelStore = navHostFragment.getViewModelStore();
                viewModelStore.getClass();
                relativemoveto.write(viewModelStore);
                toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemoveto.read;
                AndroidPathIterator androidPathIterator = toandroidtilemode0vamqd0.IconCompatParcelizer;
                Context contextRequireContext = navHostFragment.requireContext();
                contextRequireContext.getClass();
                div7Ah8Wj8 childFragmentManager = navHostFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                androidPathIterator.write(new AndroidRenderEffect_androidKt(contextRequireContext, childFragmentManager));
                AndroidPathIterator androidPathIterator2 = toandroidtilemode0vamqd0.IconCompatParcelizer;
                Context contextRequireContext2 = navHostFragment.requireContext();
                contextRequireContext2.getClass();
                div7Ah8Wj8 childFragmentManager2 = navHostFragment.getChildFragmentManager();
                childFragmentManager2.getClass();
                int id = navHostFragment.getId();
                if (id == 0 || id == -1) {
                    id = R.id.nav_host_fragment_container;
                }
                androidPathIterator2.write(new countTransparentColors(contextRequireContext2, childFragmentManager2, id));
                Bundle bundleWrite = navHostFragment.getSavedStateRegistry().write("android-support-nav:fragment:navControllerState");
                if (bundleWrite != null) {
                    relativemoveto.read(bundleWrite);
                }
                navHostFragment.getSavedStateRegistry().RemoteActionCompatParcelizer("android-support-nav:fragment:navControllerState", new getGreen0d7_KjU() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1
                    @Override // o.getGreen0d7_KjU
                    public final Bundle saveState() {
                        int i5 = i3;
                        Object obj3 = relativemoveto;
                        if (i5 == 0) {
                            Bundle bundleIconCompatParcelizer = ((relativeMoveTo) obj3).IconCompatParcelizer();
                            if (bundleIconCompatParcelizer != null) {
                                return bundleIconCompatParcelizer;
                            }
                            Bundle bundle2 = Bundle.EMPTY;
                            bundle2.getClass();
                            return bundle2;
                        }
                        int i6 = ((NavHostFragment) obj3).IconCompatParcelizer;
                        if (i6 == 0) {
                            Bundle bundle3 = Bundle.EMPTY;
                            bundle3.getClass();
                            return bundle3;
                        }
                        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("android-support-nav:fragment:graphId", Integer.valueOf(i6))};
                        int iSerializer = isAppSetIdReadingEnabled.serializer();
                        return (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
                    }
                });
                Bundle bundleWrite2 = navHostFragment.getSavedStateRegistry().write("android-support-nav:fragment:graphId");
                if (bundleWrite2 != null) {
                    navHostFragment.IconCompatParcelizer = bundleWrite2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().RemoteActionCompatParcelizer("android-support-nav:fragment:graphId", new getGreen0d7_KjU() { // from class: androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1
                    @Override // o.getGreen0d7_KjU
                    public final Bundle saveState() {
                        int i5 = i2;
                        Object obj3 = navHostFragment;
                        if (i5 == 0) {
                            Bundle bundleIconCompatParcelizer = ((relativeMoveTo) obj3).IconCompatParcelizer();
                            if (bundleIconCompatParcelizer != null) {
                                return bundleIconCompatParcelizer;
                            }
                            Bundle bundle2 = Bundle.EMPTY;
                            bundle2.getClass();
                            return bundle2;
                        }
                        int i6 = ((NavHostFragment) obj3).IconCompatParcelizer;
                        if (i6 == 0) {
                            Bundle bundle3 = Bundle.EMPTY;
                            bundle3.getClass();
                            return bundle3;
                        }
                        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("android-support-nav:fragment:graphId", Integer.valueOf(i6))};
                        int iSerializer = isAppSetIdReadingEnabled.serializer();
                        return (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
                    }
                });
                int i5 = navHostFragment.IconCompatParcelizer;
                isAdapterPositionOnScreen isadapterpositiononscreen = relativemoveto.MediaBrowserCompatMediaItem;
                if (i5 != 0) {
                    toandroidtilemode0vamqd0.read(((getNativePathEffect) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).write(i5), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    i3 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i3 != 0) {
                        toandroidtilemode0vamqd0.read(((getNativePathEffect) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).write(i3), bundle2);
                    }
                }
                return relativemoveto;
        }
    }
}
