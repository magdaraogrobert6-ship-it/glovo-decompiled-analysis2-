package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> GetScrollViewportLength;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> OnAutofillText;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> OnFillData;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> PerformImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0>> ScrollBy;
    private static final SemanticsPropertyKey<r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0> ScrollByOffset;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> ShowTextSubstitution;

    private SemanticsActions() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getOnAutofillText$annotations() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getOnFillData() {
        return OnFillData;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    static {
        SemanticsPropertiesKt.AnonymousClass1 anonymousClass1 = SemanticsPropertiesKt.AnonymousClass1.INSTANCE;
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", true, anonymousClass1, null, 8, null);
        OnClick = new SemanticsPropertyKey<>("OnClick", true, anonymousClass1, null, 8, null);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", true, anonymousClass1, null, 8, null);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", true, anonymousClass1, null, 8, null);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", true, anonymousClass1, null, 8, null);
        OnAutofillText = new SemanticsPropertyKey<>("OnAutofillText", true, anonymousClass1, null, 8, null);
        OnFillData = new SemanticsPropertyKey<>("OnFillData", true, anonymousClass1, null, 8, null);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", true, anonymousClass1, null, 8, null);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", true, anonymousClass1, null, 8, null);
        SetText = new SemanticsPropertyKey<>("SetText", true, anonymousClass1, null, 8, null);
        SetTextSubstitution = new SemanticsPropertyKey<>("SetTextSubstitution", true, anonymousClass1, null, 8, null);
        ShowTextSubstitution = new SemanticsPropertyKey<>("ShowTextSubstitution", true, anonymousClass1, null, 8, null);
        ClearTextSubstitution = new SemanticsPropertyKey<>("ClearTextSubstitution", true, anonymousClass1, null, 8, null);
        InsertTextAtCursor = new SemanticsPropertyKey<>("InsertTextAtCursor", true, anonymousClass1, null, 8, null);
        OnImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, anonymousClass1, null, 8, null);
        PerformImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, anonymousClass1, null, 8, null);
        CopyText = new SemanticsPropertyKey<>("CopyText", true, anonymousClass1, null, 8, null);
        CutText = new SemanticsPropertyKey<>("CutText", true, anonymousClass1, null, 8, null);
        PasteText = new SemanticsPropertyKey<>("PasteText", true, anonymousClass1, null, 8, null);
        Expand = new SemanticsPropertyKey<>("Expand", true, anonymousClass1, null, 8, null);
        Collapse = new SemanticsPropertyKey<>("Collapse", true, anonymousClass1, null, 8, null);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", true, anonymousClass1, null, 8, null);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", true, anonymousClass1, null, 8, null);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsActions$CustomActions$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final List<CustomAccessibilityAction> invoke(List<CustomAccessibilityAction> list, List<CustomAccessibilityAction> list2) {
                if (list == null) {
                    list = instance_delegatelambda0.write;
                }
                return onContentCardDismissed.IconCompatParcelizer(list2, list);
            }
        }, null, 8, null);
        PageUp = new SemanticsPropertyKey<>("PageUp", true, anonymousClass1, null, 8, null);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", true, anonymousClass1, null, 8, null);
        PageDown = new SemanticsPropertyKey<>("PageDown", true, anonymousClass1, null, 8, null);
        PageRight = new SemanticsPropertyKey<>("PageRight", true, anonymousClass1, null, 8, null);
        GetScrollViewportLength = new SemanticsPropertyKey<>("GetScrollViewportLength", true, anonymousClass1, null, 8, null);
        $stable = 8;
    }
}
