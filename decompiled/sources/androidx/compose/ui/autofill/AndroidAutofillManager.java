package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.ContentInViewNode;
import o.DefaultFlingBehaviorperformFling2;
import o.createFromParcel;
import o.drag;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 8;
    private drag currentlyDisplayedIDs;
    private final String packageName;
    private boolean pendingAutofillCommit;
    private PlatformAutofillManager platformAutofillManager;
    private final RectManager rectManager;
    private Rect reusableRect = new Rect();
    private AutofillId rootAutofillId;
    private final SemanticsOwner semanticsOwner;
    private final View view;

    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void setPlatformAutofillManager(PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    public final void onDetach$ui(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.IconCompatParcelizer(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onEndApplyChanges$ui() {
        if (this.currentlyDisplayedIDs.read == 0 && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.read != 0) {
            this.pendingAutofillCommit = true;
        }
    }

    public final void onLayoutNodeDeactivated$ui(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.IconCompatParcelizer(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onPostLayoutNodeReused$ui(SemanticsInfo semanticsInfo, int i) {
        if (this.currentlyDisplayedIDs.IconCompatParcelizer(i)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.RemoteActionCompatParcelizer(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void populateViewStructure(ViewStructure viewStructure) {
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui = this.semanticsOwner.getRootInfo$ui();
        PopulateViewStructure_androidKt.populate(viewStructure, rootInfo$ui, this.rootAutofillId, this.packageName, this.rectManager);
        Object[] objArr = DefaultFlingBehaviorperformFling2.read;
        ContentInViewNode contentInViewNode = new ContentInViewNode(2);
        contentInViewNode.read(rootInfo$ui);
        contentInViewNode.read(viewStructure);
        while (contentInViewNode.RemoteActionCompatParcelizer()) {
            Object objWrite = contentInViewNode.write(contentInViewNode.IconCompatParcelizer - 1);
            objWrite.getClass();
            ViewStructure viewStructure2 = (ViewStructure) objWrite;
            Object objWrite2 = contentInViewNode.write(contentInViewNode.IconCompatParcelizer - 1);
            objWrite2.getClass();
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) objWrite2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i = 0; i < size; i++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i);
                if (!semanticsInfo.isDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutofill(semanticsConfiguration)) {
                        contentInViewNode.read(semanticsInfo);
                        contentInViewNode.read(viewStructure2);
                    } else {
                        ViewStructure viewStructureNewChild = autofillApi26Helper.newChild(viewStructure2, autofillApi26Helper.addChildCount(viewStructure2, 1));
                        PopulateViewStructure_androidKt.populate(viewStructureNewChild, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                        contentInViewNode.read(semanticsInfo);
                        contentInViewNode.read(viewStructureNewChild);
                    }
                }
            }
        }
    }

    public final void requestAutofill$ui(final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void invoke(int i, int i2, int i3, int i4) {
                this.this$0.reusableRect.set(i, i2, i3, i4);
                this.this$0.getPlatformAutofillManager().requestAutofill(this.this$0.view, semanticsInfo.getSemanticsId(), this.this$0.reusableRect);
            }

            @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return createFromParcel.INSTANCE;
            }
        });
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            throw c8$$ExternalSyntheticOutline0.m("Required value was null.");
        }
        this.rootAutofillId = autofillId2;
        this.currentlyDisplayedIDs = new drag();
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        SemanticsInfo semanticsInfoRequireSemanticsInfo;
        SemanticsConfiguration semanticsConfiguration;
        SemanticsInfo semanticsInfoRequireSemanticsInfo2;
        SemanticsConfiguration semanticsConfiguration2;
        if (focusTargetModifierNode != null && (semanticsInfoRequireSemanticsInfo2 = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode)) != null && (semanticsConfiguration2 = semanticsInfoRequireSemanticsInfo2.getSemanticsConfiguration()) != null && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2)) {
            this.platformAutofillManager.notifyViewExited(this.view, semanticsInfoRequireSemanticsInfo2.getSemanticsId());
        }
        if (focusTargetModifierNode2 == null || (semanticsInfoRequireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode2)) == null || (semanticsConfiguration = semanticsInfoRequireSemanticsInfo.getSemanticsConfiguration()) == null || !AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
            return;
        }
        final int semanticsId = semanticsInfoRequireSemanticsInfo.getSemanticsId();
        this.rectManager.getRects().withRect(semanticsId, new r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return createFromParcel.INSTANCE;
            }

            public final void invoke(int i, int i2, int i3, int i4) {
                this.this$0.getPlatformAutofillManager().notifyViewEntered(this.this$0.view, semanticsId, new Rect(i, i2, i3, i4));
            }
        });
    }

    @Override // androidx.compose.ui.semantics.SemanticsListener
    public void onSemanticsChanged(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        Boolean bool;
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfiguration2 = semanticsInfo.getSemanticsConfiguration();
        int semanticsId = semanticsInfo.getSemanticsId();
        String text = (semanticsConfiguration == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        String text2 = (semanticsConfiguration2 == null || (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        boolean z = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.Companion.getText()}, getCieXyz.write())).booleanValue()) {
                    this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2));
                }
            }
        }
        ToggleableState toggleableState = semanticsConfiguration != null ? (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getToggleableState()) : null;
        ToggleableState toggleableState2 = semanticsConfiguration2 != null ? (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getToggleableState()) : null;
        if (toggleableState != toggleableState2) {
            if (toggleableState == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (toggleableState2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.Companion.getToggle()}, getCieXyz.write())).booleanValue()) {
                    int i = WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
                    if (i != 1) {
                        bool = i != 2 ? null : Boolean.FALSE;
                    } else {
                        bool = Boolean.TRUE;
                    }
                    if (bool != null) {
                        this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillToggleValue(bool.booleanValue()));
                    }
                }
            }
        }
        FillableData fillableData = semanticsConfiguration != null ? (FillableData) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFillableData()) : null;
        FillableData fillableData2 = semanticsConfiguration2 != null ? (FillableData) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getFillableData()) : null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fillableData, fillableData2}, getCieXyz.write())).booleanValue()) {
            if (fillableData == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else {
                PlatformAutofillManager platformAutofillManager = this.platformAutofillManager;
                if (fillableData2 == null) {
                    platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
                } else {
                    platformAutofillManager.notifyValueChanged(this.view, semanticsId, ((AndroidFillableData) fillableData2).getAutofillValue$ui());
                }
            }
        }
        boolean z2 = semanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
        if (semanticsConfiguration2 != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration2)) {
            z = true;
        }
        if (z2 != z) {
            drag dragVar = this.currentlyDisplayedIDs;
            if (z) {
                dragVar.RemoteActionCompatParcelizer(semanticsId);
            } else {
                dragVar.IconCompatParcelizer(semanticsId);
            }
        }
    }

    public final void onPostAttach$ui(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.RemoteActionCompatParcelizer(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void performAutofill(SparseArray<AutofillValue> sparseArray) {
        SemanticsConfiguration semanticsConfiguration;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui(iKeyAt);
            if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null) {
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsActions.getOnAutofillText());
                if (accessibilityAction != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction.getAction()) != null) {
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsActions.getOnFillData());
                if (accessibilityAction2 != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction2.getAction()) != null) {
                }
            }
        }
    }
}
