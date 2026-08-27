package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final List<String> invoke(List<String> list, List<String> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", true);
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", true);
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<createFromParcel> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", true);
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", true);
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", true);
    private static final SemanticsPropertyKey<createFromParcel> Heading = new SemanticsPropertyKey<>("Heading", true);
    private static final SemanticsPropertyKey<createFromParcel> TextEntryKey = new SemanticsPropertyKey<>("TextEntryKey", true);
    private static final SemanticsPropertyKey<createFromParcel> Disabled = new SemanticsPropertyKey<>("Disabled", true);
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", true);
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", true);
    private static final SemanticsPropertyKey<Boolean> IsContainer = new SemanticsPropertyKey<>("IsContainer", true);
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Boolean> IsSensitiveData = new SemanticsPropertyKey<>("IsSensitiveData", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<createFromParcel> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final createFromParcel invoke(createFromParcel createfromparcel, createFromParcel createfromparcel2) {
            return createfromparcel;
        }
    });
    private static final SemanticsPropertyKey<createFromParcel> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final createFromParcel invoke(createFromParcel createfromparcel, createFromParcel createfromparcel2) {
            return createfromparcel;
        }
    });
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final ContentType invoke(ContentType contentType, ContentType contentType2) {
            return contentType;
        }
    });
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final ContentDataType invoke(ContentDataType contentDataType, ContentDataType contentDataType2) {
            return contentDataType;
        }
    });
    private static final SemanticsPropertyKey<FillableData> FillableData = new SemanticsPropertyKey<>("FillableData", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$FillableData$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final FillableData invoke(FillableData fillableData, FillableData fillableData2) {
            return fillableData;
        }
    });
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f, float f2) {
            return f;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Float) obj, ((Number) obj2).floatValue());
        }
    });
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", true);
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", true);
    private static final SemanticsPropertyKey<createFromParcel> IsPopup = new SemanticsPropertyKey<>("IsPopup", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final createFromParcel invoke(createFromParcel createfromparcel, createFromParcel createfromparcel2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<createFromParcel> IsDialog = new SemanticsPropertyKey<>("IsDialog", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final createFromParcel invoke(createFromParcel createfromparcel, createFromParcel createfromparcel2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        /* JADX INFO: renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final Role m2828invokeqtAw6s(Role role, int i) {
            return role;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m2828invokeqtAw6s((Role) obj, ((Role) obj2).m2813unboximpl());
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final String invoke(String str, String str2) {
            return str;
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<createFromParcel> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final createFromParcel invoke(createFromParcel createfromparcel, createFromParcel createfromparcel2) {
            return createfromparcel;
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", true, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    }, null, 8, null);
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<AnnotatedString> InputText = new SemanticsPropertyKey<>("InputText", true);
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", true);
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", true);
    private static final SemanticsPropertyKey<TextRange> TextCompositionRange = new SemanticsPropertyKey<>("TextCompositionRange", true);
    private static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", true);
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", true);
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", true);
    private static final SemanticsPropertyKey<InputTextSuggestionState> InputTextSuggestionState = new SemanticsPropertyKey<>("InputTextSuggestionState", true);
    private static final SemanticsPropertyKey<createFromParcel> Password = new SemanticsPropertyKey<>("Password", true);
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", true);
    private static final SemanticsPropertyKey<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Shape> Shape = new SemanticsPropertyKey<>("Shape", false, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Shape$1
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Shape invoke(Shape shape, Shape shape2) {
            return shape;
        }
    }, null, 8, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    public final SemanticsPropertyKey<createFromParcel> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<FillableData> getFillableData() {
        return FillableData;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<createFromParcel> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<createFromParcel> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    public final SemanticsPropertyKey<InputTextSuggestionState> getInputTextSuggestionState() {
        return InputTextSuggestionState;
    }

    public final SemanticsPropertyKey<createFromParcel> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<createFromParcel> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<createFromParcel> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> getIsSensitiveData() {
        return IsSensitiveData;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<createFromParcel> getLinkTestMarker() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<createFromParcel> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<createFromParcel> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<Shape> getShape() {
        return Shape;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<TextRange> getTextCompositionRange() {
        return TextCompositionRange;
    }

    public final SemanticsPropertyKey<createFromParcel> getTextEntryKey() {
        return TextEntryKey;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }
}
