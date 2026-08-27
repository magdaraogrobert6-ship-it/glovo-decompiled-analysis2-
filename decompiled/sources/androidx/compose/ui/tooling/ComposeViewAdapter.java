package androidx.compose.ui.tooling;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.CompositionDataTreeKt;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceContext;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.PreviewWrapperProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.BlurredEdgeTreatmentCompanion;
import o.ContentType_androidKt;
import o.DragAndDropTargetModifierNode;
import o.FocusDirection;
import o.InlineChildren;
import o.RemoteActionCompatParcelizer;
import o.UiMediaScopeViewingDistance;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.addOnTrimMemoryListener;
import o.addOnUserLeaveHintListener;
import o.createFromParcel;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.fullyDrawnReporter_delegatelambda0;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationDate;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getOffsetF1C5BW0;
import o.getOrBuildCachedDrawBlock;
import o.getPhoneNumber;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.hideTranslatedText;
import o.instance_delegatelambda0;
import o.invalidateDrawCache;
import o.onContentCardDismissed;
import o.onMultiWindowModeChanged;
import o.onNewIntent;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdaz8s0fQwEJ2REloWUnQw1hUaIxGo;
import o.registerInAppMessageManagerlambda0;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;

    @SuppressLint
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;
    private final String TAG;
    public PreviewAnimationClock clock;
    private String composableName;
    private final ComposeView composeView;
    private getCreditCardExpirationDate composition;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final ThreadSafeException delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onDraw;
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 previewComposition;
    private final CompositionDataRecord slotTableRecord;
    private List<ViewInfo> viewInfos;

    public static /* synthetic */ void getClock$ui_tooling$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel init$lambda$2$0$2$0(ComposeViewAdapter composeViewAdapter) {
        boolean z = false;
        View childAt = composeViewAdapter.getChildAt(0);
        childAt.getClass();
        KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
        ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
        if (viewRootForTest != null) {
            viewRootForTest.invalidateDescendants();
        }
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            relocationOffsetfbGrOKE relocationoffsetfbgroke = getOffsetF1C5BW0.serializer.read;
            if (relocationoffsetfbgroke != null && relocationoffsetfbgroke.read()) {
                z = true;
            }
        }
        if (z) {
            getOffsetF1C5BW0.read();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel processViewInfos$lambda$0(invalidateDrawCache invalidatedrawcache) {
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewInfo processViewInfos$lambda$1(invalidateDrawCache invalidatedrawcache, ViewInfo viewInfo, List list) {
        return viewInfo;
    }

    public final PreviewAnimationClock getClock$ui_tooling() {
        return this.clock;
    }

    public final List<String> getDesignInfoList$ui_tooling() {
        return this.designInfoList;
    }

    public final List<ViewInfo> getViewInfos$ui_tooling() {
        return this.viewInfos;
    }

    public final boolean hasAnimations() {
        return this.hasAnimations;
    }

    public final void setClock$ui_tooling(PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    public final void setDesignInfoList$ui_tooling(List<String> list) {
        this.designInfoList = list;
    }

    public final void setViewInfos$ui_tooling(List<ViewInfo> list) {
        this.viewInfos = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel WrapPreview$lambda$1(ComposeViewAdapter composeViewAdapter, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, getBirthDateFull getbirthdatefull, int i2) {
        composeViewAdapter.WrapPreview(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
        return createFromParcel.INSTANCE;
    }

    private final void findAndTrackAnimations() {
        Set<BlurredEdgeTreatmentCompanion> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((BlurredEdgeTreatmentCompanion) it.next()));
        }
        boolean z = this.clock != null;
        AnimationSearch animationSearch = new AnimationSearch(new r8lambdaz8s0fQwEJ2REloWUnQw1hUaIxGo(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter.findAndTrackAnimations.1
            @Override // o.registerInAppMessageManagerlambda7
            public Object get() {
                return ((ComposeViewAdapter) this.MediaMetadataCompat).getClock$ui_tooling();
            }

            public void set(Object obj) {
                ((ComposeViewAdapter) this.MediaMetadataCompat).setClock$ui_tooling((PreviewAnimationClock) obj);
            }
        });
        boolean zSearchAny = animationSearch.searchAny(arrayList);
        this.hasAnimations = zSearchAny;
        if (z && zSearchAny) {
            animationSearch.attachAllAnimations(arrayList);
        }
    }

    private final void findDesignInfoProviders() {
        Set<BlurredEdgeTreatmentCompanion> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((BlurredEdgeTreatmentCompanion) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<Group> listFindAll = PreviewUtils_androidKt.findAll((Group) it2.next(), new InlineChildren(29, this));
            ArrayList arrayList3 = new ArrayList();
            for (Group group : listFindAll) {
                String designInfoOrNull = getDesignInfoOrNull(group, group.getBox());
                if (designInfoOrNull == null) {
                    Iterator<T> it3 = group.getChildren().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((Group) it3.next(), group.getBox());
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList3.add(designInfoOrNull);
                }
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList3, (Collection) arrayList2);
        }
        this.designInfoList = arrayList2;
    }

    private final void processViewInfos() {
        List<ViewInfo> listMakeTree$default = CompositionDataTreeKt.makeTree$default(this.slotTableRecord.getStore(), new UiMediaScopeViewingDistance(29), new AnonymousClass2(this), new ComposeViewAdapter$$ExternalSyntheticLambda2(0), null, 8, null);
        this.viewInfos = listMakeTree$default;
        if (this.debugViewInfos) {
            ViewInfoUtil_androidKt.toDebugString$default(listMakeTree$default, 0, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewInfo toViewInfoFactory(getOrBuildCachedDrawBlock getorbuildcacheddrawblock, SourceContext sourceContext, List<ViewInfo> list, List<ViewInfo> list2) {
        String sourceFile;
        if (list2 != null) {
            list = onContentCardDismissed.IconCompatParcelizer(list2, list);
        }
        List<ViewInfo> list3 = list;
        SourceLocation location = sourceContext.getLocation();
        if (location == null || (sourceFile = location.getSourceFile()) == null) {
            sourceFile = "";
        }
        String str = sourceFile;
        SourceLocation location2 = sourceContext.getLocation();
        int lineNumber = location2 != null ? location2.getLineNumber() : -1;
        IntRect bounds = sourceContext.getBounds();
        SourceLocation location3 = sourceContext.getLocation();
        Object obj = getorbuildcacheddrawblock.read();
        return new ViewInfo(str, lineNumber, bounds, location3, list3, obj instanceof LayoutInfo ? (LayoutInfo) obj : null, sourceContext.getName());
    }

    public final void dispose$ui_tooling() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling().dispose();
        }
        this.FakeSavedStateRegistryOwner.getLifecycleRegistry().RemoteActionCompatParcelizer(toColorLong8_81llA.DESTROYED);
        this.FakeViewModelStoreOwner.getViewModelStore().read();
    }

    public final void init$ui_tooling(final String str, final String str2, final Class<? extends PreviewWrapperProvider> cls, final Class<? extends PreviewParameterProvider<?>> cls2, final int i, boolean z, boolean z2, final long j, boolean z3, String str3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.debugPaintBounds = z;
        this.debugViewInfos = z2;
        this.composableName = str2;
        this.lookForDesignInfoProviders = z3;
        this.designInfoProvidersArgument = str3 == null ? "" : str3;
        this.onDraw = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda9
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return ComposeViewAdapter.init$lambda$2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, this, j, cls, str, str2, cls2, i, (getBirthDateFull) obj, iIntValue);
            }
        }, true, -1214370042);
        this.previewComposition = dragAndDropTargetModifierNode;
        this.composeView.setContent(dragAndDropTargetModifierNode);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        removeNodeAtDepth.write(this.composeView.getRootView(), (accessisRenderNodeCompatiblecp) this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                int iSerializer = getQueryParameterslambda2.serializer();
                int iSerializer2 = getQueryParameterslambda2.serializer();
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) onContentCardDismissed.IconCompatParcelizer(viewInfo.allChildren(), (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{viewInfo}, getQueryParameterslambda2.serializer(), -516583649, iSerializer)), (Collection) arrayList);
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.hasBounds()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    private final String getDesignInfoOrNull(Group group, IntRect intRect) {
        String strInvokeGetDesignInfo;
        Iterator<T> it = group.getData().iterator();
        do {
            strInvokeGetDesignInfo = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                strInvokeGetDesignInfo = invokeGetDesignInfo(next, intRect.getLeft(), intRect.getRight());
            }
        } while (strInvokeGetDesignInfo == null);
        return strInvokeGetDesignInfo;
    }

    private final boolean hasDesignInfo(Group group) {
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasNullSourcePosition(Group group) {
        return getFileName(group).length() == 0 && getLineNumber(group) == -1;
    }

    private final void init(AttributeSet attributeSet) {
        long j;
        setTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner, this.FakeSavedStateRegistryOwner);
        setTag(com.logistics.rider.glovo.R.id.view_tree_saved_state_registry_owner, this.FakeSavedStateRegistryOwner);
        setTag(com.logistics.rider.glovo.R.id.view_tree_view_model_store_owner, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(attributeValue, '.');
        String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', attributeValue, attributeValue);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "previewWrapperProviderClass");
        Class<? extends PreviewWrapperProvider> clsAsPreviewWrapperProviderClass = attributeValue2 != null ? PreviewUtils_androidKt.asPreviewWrapperProviderClass(attributeValue2) : null;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue3 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends PreviewParameterProvider<?>> clsAsPreviewProviderClass = attributeValue3 != null ? PreviewUtils_androidKt.asPreviewProviderClass(attributeValue3) : null;
        try {
            j = Long.parseLong(attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j = -1;
        }
        init$ui_tooling$default(this, strRemoteActionCompatParcelizer, strIconCompatParcelizer, clsAsPreviewWrapperProviderClass, clsAsPreviewProviderClass, attributeIntValue, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 3072, null);
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.viewInfos = instance_delegatelambda0Var;
        this.designInfoList = instance_delegatelambda0Var;
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.getLambda$2086912010$ui_tooling();
        this.designInfoProvidersArgument = "";
        this.onDraw = new RemoteActionCompatParcelizer(23);
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m776toArgb8_81llA(Color.Companion.m756getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new fullyDrawnReporter_delegatelambda0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = new defaultViewModelProviderFactory_delegatelambda0(null);

            @Override // o.fullyDrawnReporter_delegatelambda0
            public defaultViewModelProviderFactory_delegatelambda0 getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // o.accessisRenderNodeCompatiblecp
            public accessregisterComponentCallback getLifecycle() {
                return this.this$0.FakeSavedStateRegistryOwner.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new onMultiWindowModeChanged() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i, onNewIntent onnewintent, I i2, FocusDirection focusDirection) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // o.onMultiWindowModeChanged
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    private final void WrapPreview(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-265259911);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(this) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            hideTranslatedText hidetranslatedtextWrite = CompositionLocalsKt.getLocalFontLoader().write(new LayoutlibFontResourceLoader(getContext()));
            hideTranslatedText hidetranslatedtextWrite2 = CompositionLocalsKt.getLocalFontFamilyResolver().write(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
            getPhoneNumber getphonenumber = addOnUserLeaveHintListener.serializer;
            hideTranslatedText hidetranslatedtextWrite3 = addOnUserLeaveHintListener.serializer.write(this.FakeOnBackPressedDispatcherOwner);
            getPhoneNumber getphonenumber2 = addOnTrimMemoryListener.serializer;
            AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{hidetranslatedtextWrite, hidetranslatedtextWrite2, hidetranslatedtextWrite3, addOnTrimMemoryListener.serializer.write(this.FakeActivityResultRegistryOwner)}, ExtrasKt.write(-874838087, new GapComposerKt$$ExternalSyntheticLambda0(this, 9, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 5, this, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String getFileName(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        return (location == null || (sourceFile = location.getSourceFile()) == null) ? "" : sourceFile;
    }

    private final int getLineNumber(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    private final boolean isNullGroup(Group group) {
        if (!hasNullSourcePosition(group) || !group.getChildren().isEmpty()) {
            return false;
        }
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        return (node instanceof LayoutInfo ? (LayoutInfo) node : null) == null;
    }

    private final ViewInfo toViewInfo(Group group) {
        String sourceFile;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (group.getChildren().size() == 1 && hasNullSourcePosition(group) && layoutInfo == null) {
            return toViewInfo((Group) onContentCardDismissed.MediaBrowserCompatMediaItem(group.getChildren()));
        }
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (!isNullGroup((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toViewInfo((Group) it.next()));
        }
        SourceLocation location = group.getLocation();
        if (location == null || (sourceFile = location.getSourceFile()) == null) {
            sourceFile = "";
        }
        String str = sourceFile;
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList2, layoutInfo, group.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findDesignInfoProviders$lambda$1$0(ComposeViewAdapter composeViewAdapter, Group group) {
        Object[] objArr = {group.getName(), "remember"};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && composeViewAdapter.hasDesignInfo(group)) {
            return true;
        }
        Collection<Group> children = group.getChildren();
        if ((children instanceof Collection) && children.isEmpty()) {
            return false;
        }
        for (Group group2 : children) {
            Object[] objArr2 = {group2.getName(), "remember"};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && composeViewAdapter.hasDesignInfo(group2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel init$lambda$2(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final ComposeViewAdapter composeViewAdapter, final long j, final Class cls, final String str, final String str2, final Class cls2, final int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode);
            composeViewAdapter.WrapPreview(ExtrasKt.write(-322523079, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda6
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ComposeViewAdapter.init$lambda$2$0(j, composeViewAdapter, cls, str, str2, cls2, i, (getBirthDateFull) obj, iIntValue);
                }
            }, getpostalcode), getpostalcode, 6);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel init$lambda$2$0$0(String str, String str2, getBirthDateFull getbirthdatefull, Class cls, int i, ComposeViewAdapter composeViewAdapter, getBirthDateFull getbirthdatefull2, int i2) {
        Throwable cause;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull2;
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            try {
                ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(cls, i);
                composableInvoker.invokeComposable(str, str2, getbirthdatefull, Arrays.copyOf(previewProviderParameters, previewProviderParameters.length));
            } catch (Throwable th) {
                Throwable th2 = th;
                while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                    th2 = cause;
                }
                composeViewAdapter.delayedException.set(th2);
                throw th;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$processViewInfos$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
        public AnonymousClass2(Object obj) {
            super(4, 0, ComposeViewAdapter.class, obj, "toViewInfoFactory", "toViewInfoFactory(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/SourceContext;Ljava/util/List;Ljava/util/List;)Landroidx/compose/ui/tooling/ViewInfo;");
        }

        @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
        public final ViewInfo invoke(getOrBuildCachedDrawBlock getorbuildcacheddrawblock, SourceContext sourceContext, List<ViewInfo> list, List<ViewInfo> list2) {
            return ((ComposeViewAdapter) this.MediaMetadataCompat).toViewInfoFactory(getorbuildcacheddrawblock, sourceContext, list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel WrapPreview$lambda$0(ComposeViewAdapter composeViewAdapter, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
            InspectableKt.Inspectable(composeViewAdapter.slotTableRecord, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel init$lambda$2$0(long j, ComposeViewAdapter composeViewAdapter, Class cls, String str, String str2, Class cls2, int i, getBirthDateFull getbirthdatefull, int i2) {
        createFromParcel createfromparcel;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(i2 & 1, (i2 & 3) != 2);
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (zWrite) {
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite = ExtrasKt.write(-1805031794, new getPointerPrecisionfpxItnM(str, str2, getpostalcode, cls2, i, composeViewAdapter), getpostalcode);
            if (j >= 0) {
                getpostalcode.serializer(-441489733);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(composeViewAdapter);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new ComposeViewAdapter$init$3$1$1$1(composeViewAdapter);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(composeViewAdapter);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new CoroutineLiveData$$ExternalSyntheticLambda0(25, composeViewAdapter);
                    getpostalcode.write(objComponentActivity2);
                }
                composeViewAdapter.setClock$ui_tooling(new PreviewAnimationClock(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-440215447);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (cls == null) {
                getpostalcode.serializer(-439702305);
                getpostalcode.IconCompatParcelizer(false);
                createfromparcel = null;
            } else {
                getpostalcode.serializer(-439702304);
                PreviewUtils_androidKt.instantiatePreviewWrapperProvider(cls).Wrap(dragAndDropTargetModifierNodeWrite, getpostalcode, 6);
                getpostalcode.IconCompatParcelizer(false);
                createfromparcel = createfromparcel2;
            }
            if (createfromparcel == null) {
                getpostalcode.serializer(-706916214);
                dragAndDropTargetModifierNodeWrite.invoke(getpostalcode, 6);
            } else {
                getpostalcode.serializer(-706921329);
            }
            getpostalcode.IconCompatParcelizer(false);
            return createfromparcel2;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return createfromparcel2;
    }

    private final String invokeGetDesignInfo(Object obj, int i, int i2) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull != null) {
            try {
                Object objInvoke = designInfoMethodOrNull.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.designInfoProvidersArgument);
                objInvoke.getClass();
                String str = (String) objInvoke;
                if (str.length() != 0) {
                    return str;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$ui_tooling$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, Class cls2, int i, boolean z, boolean z2, long j, boolean z3, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i2, Object obj) {
        composeViewAdapter.init$ui_tooling(str, str2, (i2 & 4) != 0 ? null : cls, (i2 & 8) != 0 ? null : cls2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & Fields.SpotShadowColor) != 0 ? -1L : j, (i2 & Fields.RotationX) != 0 ? false : z3, (i2 & Fields.RotationY) != 0 ? null : str3, (i2 & Fields.RotationZ) != 0 ? new RemoteActionCompatParcelizer(24) : r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i2 & Fields.CameraDistance) != 0 ? new RemoteActionCompatParcelizer(25) : r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.viewInfos = instance_delegatelambda0Var;
        this.designInfoList = instance_delegatelambda0Var;
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.getLambda$2086912010$ui_tooling();
        this.designInfoProvidersArgument = "";
        this.onDraw = new RemoteActionCompatParcelizer(23);
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m776toArgb8_81llA(Color.Companion.m756getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new fullyDrawnReporter_delegatelambda0() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = new defaultViewModelProviderFactory_delegatelambda0(null);

            @Override // o.fullyDrawnReporter_delegatelambda0
            public defaultViewModelProviderFactory_delegatelambda0 getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // o.accessisRenderNodeCompatiblecp
            public accessregisterComponentCallback getLifecycle() {
                return this.this$0.FakeSavedStateRegistryOwner.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new onMultiWindowModeChanged() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i2, onNewIntent onnewintent, I i3, FocusDirection focusDirection) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // o.onMultiWindowModeChanged
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }
}
