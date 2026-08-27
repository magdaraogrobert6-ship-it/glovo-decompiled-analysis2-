package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IInAppMessageViewWrapper;
import o.StretchOverscrollNode;
import o.VerticalScrollableClipShape;
import o.accessisRenderNodeCompatiblecp;
import o.animateToWithDecay;
import o.createFromParcel;
import o.getCieXyz;
import o.logUnregisterActivitylambda1;
import o.onContentCardDismissed;
import o.onRemeasuredozmzZPI;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidContentCaptureManager implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX";
    public static final String VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP = "android.view.contentcapture.EventTimestamp";
    private boolean checkingForSemanticsChanges;
    private final Runnable contentCaptureChangeChecker;
    private ContentCaptureSessionWrapper contentCaptureSession;
    private StretchOverscrollNode currentSemanticsNodes;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onContentCaptureSession;
    private animateToWithDecay previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final logUnregisterActivitylambda1 boundsUpdateChannel = SQLite.IconCompatParcelizer(1, 6, (IInAppMessageViewWrapper) null);
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());

    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$0(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x006e  */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onCreateVirtualViewTranslationRequests(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            String strFastJoinToString$default;
            for (long j : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.getCurrentSemanticsNodes$ui().serializer((int) j);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.getView().getAutofillId(), semanticsNode.getId());
                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getText());
                    if (list != null && (strFastJoinToString$default = ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(strFastJoinToString$default, null, 2, 0 == true ? 1 : 0)));
                        consumer.accept(builder.build());
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void doTranslation(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse viewTranslationResponse = longSparseArray.get(jKeyAt);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.getCurrentSemanticsNodes$ui().serializer((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction.getAction()) != null) {
                }
            }
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager androidContentCaptureManager, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            Object[] objArr = {Looper.getMainLooper().getThread(), Thread.currentThread()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                doTranslation(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$ViewTranslationHelperMethods$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$0(androidContentCaptureManager, longSparseArray);
                    }
                });
            }
        }
    }

    private final <T> void fastForEachIndexedWithFilter(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t)).booleanValue()) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i), t);
                i++;
            }
        }
    }

    public static /* synthetic */ void getContentCaptureSession$ui$annotations() {
    }

    public static /* synthetic */ void getHandler$ui$annotations() {
    }

    public final ContentCaptureSessionWrapper getContentCaptureSession$ui() {
        return this.contentCaptureSession;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final void onLayoutChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeStateChangeIfNeeded();
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler$ui = getHandler$ui();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler$ui == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler$ui.post(this.contentCaptureChangeChecker);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public final void setContentCaptureSession$ui(ContentCaptureSessionWrapper contentCaptureSessionWrapper) {
        this.contentCaptureSession = contentCaptureSessionWrapper;
    }

    public final void setCurrentSemanticsNodes$ui(StretchOverscrollNode stretchOverscrollNode) {
        this.currentSemanticsNodes = stretchOverscrollNode;
    }

    public final void setOnContentCaptureSession(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.onContentCaptureSession = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeStateChangeIfNeeded() {
        this.boundsUpdateChannel.b_(createFromParcel.INSTANCE);
    }

    private final void sendContentCaptureAppearEvents(SemanticsNode semanticsNode, final SemanticsNodeCopy semanticsNodeCopy) {
        fastForEachReplacedVisibleChildren(semanticsNode, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendContentCaptureAppearEvents.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void invoke(int i, SemanticsNode semanticsNode2) {
                if (semanticsNodeCopy.getChildren().read(semanticsNode2.getId())) {
                    return;
                }
                this.updateBuffersOnAppeared(i, semanticsNode2);
                this.notifySubtreeStateChangeIfNeeded();
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
                return createFromParcel.INSTANCE;
            }
        });
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (getCurrentSemanticsNodes$ui().RemoteActionCompatParcelizer(semanticsNode2.getId()) && this.previousSemanticsNodes.RemoteActionCompatParcelizer(semanticsNode2.getId())) {
                Object objSerializer = this.previousSemanticsNodes.serializer(semanticsNode2.getId());
                if (objSerializer == null) {
                    throw c8$$ExternalSyntheticOutline0.m("node not present in pruned tree before this change");
                }
                sendContentCaptureAppearEvents(semanticsNode2, (SemanticsNodeCopy) objSerializer);
            }
        }
    }

    private final void sendContentCaptureDisappearEvents() {
        animateToWithDecay animatetowithdecay = this.previousSemanticsNodes;
        int[] iArr = animatetowithdecay.serializer;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        if (!getCurrentSemanticsNodes$ui().RemoteActionCompatParcelizer(i4)) {
                            bufferContentCaptureViewDisappeared(i4);
                            notifySubtreeStateChangeIfNeeded();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode, int i) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM2783toLegacyClassNameV4PA4sw;
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null) {
            autofillId2 = contentCaptureSessionWrapper.newAutofillId(parent.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionWrapper.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong(VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP, this.currentSemanticsNodesSnapshotTimestampMillis);
            extras.putInt(VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX, i);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getTestTag());
        if (str != null) {
            viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getIsTraversalGroup())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            viewStructureCompatNewVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getRole());
        if (role != null && (strM2783toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m2783toLegacyClassNameV4PA4sw(role.m2813unboximpl())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM2783toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(layoutInput.getDensity().getFontScale() * layoutInput.getDensity().getDensity() * TextUnit.m3867getValueimpl(layoutInput.getStyle().m3107getFontSizeXSAIIZE()), 0, 0, 0);
        }
        Rect boundsInParent$ui = semanticsNode.getBoundsInParent$ui();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui.getLeft(), (int) boundsInParent$ui.getTop(), 0, 0, (int) (boundsInParent$ui.getRight() - boundsInParent$ui.getLeft()), (int) (boundsInParent$ui.getBottom() - boundsInParent$ui.getTop()));
        return viewStructureCompatNewVirtualViewStructure;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0017->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005f], SYNTHETIC] */
    private final void updateSemanticsCopy() {
        this.previousSemanticsNodes.RemoteActionCompatParcelizer();
        StretchOverscrollNode currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        int[] iArr = currentSemanticsNodes$ui.serializer;
        Object[] objArr = currentSemanticsNodes$ui.IconCompatParcelizer;
        long[] jArr = currentSemanticsNodes$ui.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            this.previousSemanticsNodes.IconCompatParcelizer(iArr[i4], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i4]).getSemanticsNode(), getCurrentSemanticsNodes$ui()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui());
    }

    public final boolean isEnabled$ui() {
        return ContentCaptureManager.Companion.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    public final void onCreateVirtualViewTranslationRequests$ui(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    public final void onHideTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onShowTranslation$ui() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.contentCaptureSession = (ContentCaptureSessionWrapper) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    public final void onVirtualViewTranslationResponses$ui(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        animatetowithdecay.getClass();
        this.currentSemanticsNodes = animatetowithdecay;
        this.previousSemanticsNodes = new animateToWithDecay();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), animatetowithdecay);
        this.contentCaptureChangeChecker = new Sentry$$ExternalSyntheticLambda5(1, this);
    }

    private final void bufferContentCaptureViewAppeared(int i, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(i, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructureCompat));
    }

    private final void bufferContentCaptureViewDisappeared(int i) {
        this.bufferedEvents.add(new ContentCaptureEvent(i, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    private final void checkForContentCapturePropertyChanges(StretchOverscrollNode stretchOverscrollNode) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i;
        char c;
        long j;
        int i2;
        long[] jArr3;
        Object[] objArr;
        SemanticsNodeCopy semanticsNodeCopy;
        long[] jArr4;
        Object[] objArr2;
        SemanticsNodeCopy semanticsNodeCopy2;
        Object[] objArr3;
        Object[] objArr4;
        StretchOverscrollNode stretchOverscrollNode2 = stretchOverscrollNode;
        int[] iArr3 = stretchOverscrollNode2.serializer;
        long[] jArr5 = stretchOverscrollNode2.RemoteActionCompatParcelizer;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr5[i3];
            char c2 = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        SemanticsNodeCopy semanticsNodeCopy3 = (SemanticsNodeCopy) this.previousSemanticsNodes.serializer(i7);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) stretchOverscrollNode2.serializer(i7);
                        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode == null) {
                            throw c8$$ExternalSyntheticOutline0.m("no value for specified key");
                        }
                        if (semanticsNodeCopy3 == null) {
                            onRemeasuredozmzZPI props$ui = semanticsNode.getUnmergedConfig$ui().getProps$ui();
                            Object[] objArr5 = props$ui.IconCompatParcelizer;
                            long[] jArr6 = props$ui.write;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j4 = jArr6[i8];
                                    jArr2 = jArr5;
                                    i = length;
                                    if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j4 & 255) < 128) {
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr5[(i8 << 3) + i10];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                                objArr4 = objArr5;
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey, semanticsProperties.getText()}, getCieXyz.write())).booleanValue()) {
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getText());
                                                    sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(list != null ? (AnnotatedString) onContentCardDismissed.MediaMetadataCompat(list) : null));
                                                }
                                            } else {
                                                objArr4 = objArr5;
                                            }
                                            j4 >>= 8;
                                            i10++;
                                            objArr5 = objArr4;
                                        }
                                        objArr3 = objArr5;
                                        if (i9 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr3 = objArr5;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jArr5 = jArr2;
                                    length = i;
                                    objArr5 = objArr3;
                                    c2 = 7;
                                }
                                j = -9187201950435737472L;
                                c = 7;
                            } else {
                                jArr2 = jArr5;
                                i = length;
                                c = c2;
                                j = -9187201950435737472L;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i = length;
                            onRemeasuredozmzZPI props$ui2 = semanticsNode.getUnmergedConfig$ui().getProps$ui();
                            Object[] objArr6 = props$ui2.IconCompatParcelizer;
                            long[] jArr7 = props$ui2.write;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j5 = jArr7[i11];
                                    c = 7;
                                    j = -9187201950435737472L;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length3)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j5 & 255) < 128) {
                                                jArr4 = jArr7;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr6[(i11 << 3) + i13];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                                objArr2 = objArr6;
                                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{semanticsPropertyKey2, semanticsProperties2.getText()}, getCieXyz.write())).booleanValue()) {
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy3.getUnmergedConfig(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) onContentCardDismissed.MediaMetadataCompat(list2) : null;
                                                    semanticsNodeCopy2 = semanticsNodeCopy3;
                                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getText());
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) onContentCardDismissed.MediaMetadataCompat(list3) : null;
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedString, annotatedString2}, getCieXyz.write())).booleanValue()) {
                                                        sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(annotatedString2));
                                                    }
                                                }
                                                j5 >>= 8;
                                                i13++;
                                                jArr7 = jArr4;
                                                objArr6 = objArr2;
                                                semanticsNodeCopy3 = semanticsNodeCopy2;
                                            } else {
                                                jArr4 = jArr7;
                                                objArr2 = objArr6;
                                            }
                                            semanticsNodeCopy2 = semanticsNodeCopy3;
                                            j5 >>= 8;
                                            i13++;
                                            jArr7 = jArr4;
                                            objArr6 = objArr2;
                                            semanticsNodeCopy3 = semanticsNodeCopy2;
                                        }
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        semanticsNodeCopy = semanticsNodeCopy3;
                                        if (i12 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        semanticsNodeCopy = semanticsNodeCopy3;
                                    }
                                    if (i11 == length3) {
                                        break;
                                    }
                                    i11++;
                                    jArr7 = jArr3;
                                    objArr6 = objArr;
                                    semanticsNodeCopy3 = semanticsNodeCopy;
                                }
                            } else {
                                j = -9187201950435737472L;
                                c = 7;
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        i = length;
                        c = c2;
                        j = j3;
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                    j3 = j;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i;
                    c2 = c;
                    stretchOverscrollNode2 = stretchOverscrollNode;
                }
                iArr = iArr3;
                jArr = jArr5;
                int i14 = length;
                if (i5 != i4) {
                    return;
                } else {
                    length = i14;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            stretchOverscrollNode2 = stretchOverscrollNode;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        StretchOverscrollNode currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.IconCompatParcelizer;
        long[] jArr = currentSemanticsNodes$ui.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        StretchOverscrollNode currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.IconCompatParcelizer;
        long[] jArr = currentSemanticsNodes$ui.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE}, getCieXyz.write())).booleanValue() && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        StretchOverscrollNode currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.IconCompatParcelizer;
        long[] jArr = currentSemanticsNodes$ui.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration unmergedConfig$ui = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig$ui();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE}, getCieXyz.write())).booleanValue() && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution());
                if (accessibilityAction2 == null || (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction2.getAction()) == null) {
                    return;
                }
                return;
            }
        }
        if (this.translateStatus == TranslateStatus.SHOW_TRANSLATED) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction.getAction()) == null) {
                return;
            }
        }
    }

    public final Handler getHandler$ui() {
        return AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler$ui = getHandler$ui();
        handler$ui.getClass();
        handler$ui.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    private final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
            if (getCurrentSemanticsNodes$ui().RemoteActionCompatParcelizer(semanticsNode2.getId())) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i), semanticsNode2);
                i++;
            }
        }
    }

    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i);
            int i2 = WhenMappings.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i2 == 1) {
                ViewStructureCompat structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    contentCaptureSessionWrapper.notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            } else {
                AutofillId autofillIdNewAutofillId = contentCaptureSessionWrapper.newAutofillId(contentCaptureEvent.getId());
                if (autofillIdNewAutofillId != null) {
                    contentCaptureSessionWrapper.notifyViewDisappeared(autofillIdNewAutofillId);
                }
            }
        }
        contentCaptureSessionWrapper.flush();
        this.bufferedEvents.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(o.ShortNewsContentCardView<? super o.createFromParcel> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r2 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
        L2d:
            r9 = r2
            goto L47
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            r9 = 0
            return r9
        L36:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r2 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L55
        L3e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            o.logUnregisterActivitylambda1 r9 = r8.boundsUpdateChannel
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r9 = r9.MediaSessionCompatToken()
        L47:
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r2 = r9.hasNext(r0)
            if (r2 != r1) goto L52
            goto L86
        L52:
            r7 = r2
            r2 = r9
            r9 = r7
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L87
            r2.write()
            boolean r9 = r8.isEnabled$ui()
            if (r9 == 0) goto L69
            r8.notifyContentCaptureChanges()
        L69:
            android.os.Handler r9 = r8.getHandler$ui()
            boolean r5 = r8.checkingForSemanticsChanges
            if (r5 != 0) goto L7a
            if (r9 == 0) goto L7a
            r8.checkingForSemanticsChanges = r4
            java.lang.Runnable r5 = r8.contentCaptureChangeChecker
            r9.post(r5)
        L7a:
            long r5 = r8.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r9 != r1) goto L2d
        L86:
            return r1
        L87:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui(o.ShortNewsContentCardView):java.lang.Object");
    }

    public final StretchOverscrollNode getCurrentSemanticsNodes$ui() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$currentSemanticsNodes$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(SemanticsNode semanticsNode) {
                    return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
                }
            });
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    private final void sendContentCaptureTextUpdateEvent(int i, String str) {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionWrapper = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionWrapper.newAutofillId(i);
            if (autofillIdNewAutofillId == null) {
                throw c8$$ExternalSyntheticOutline0.m("Invalid content capture ID");
            }
            contentCaptureSessionWrapper.notifyViewTextChanged(autofillIdNewAutofillId, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBuffersOnAppeared(int i, SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            updateTranslationOnAppeared(semanticsNode);
            bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode, i));
            fastForEachReplacedVisibleChildren(semanticsNode, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateBuffersOnAppeared.1
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).intValue(), (SemanticsNode) obj2);
                    return createFromParcel.INSTANCE;
                }

                {
                    super(2);
                }

                public final void invoke(int i2, SemanticsNode semanticsNode2) {
                    AndroidContentCaptureManager.this.updateBuffersOnAppeared(i2, semanticsNode2);
                }
            });
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            bufferContentCaptureViewDisappeared(semanticsNode.getId());
            List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
            int size = replacedChildren$ui.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared(replacedChildren$ui.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
                androidContentCaptureManager.sendContentCaptureDisappearEvents();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                try {
                    androidContentCaptureManager.sendContentCaptureAppearEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
                    Trace.endSection();
                    androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui());
                    androidContentCaptureManager.updateSemanticsCopy();
                    androidContentCaptureManager.checkingForSemanticsChanges = false;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }
}
