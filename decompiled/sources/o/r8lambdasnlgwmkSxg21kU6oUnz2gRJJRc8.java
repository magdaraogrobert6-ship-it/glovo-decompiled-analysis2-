package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8lambdasnlgwmkSxg21kU6oUnz2gRJJRc8 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdasnlgwmkSxg21kU6oUnz2gRJJRc8(Object obj, boolean z, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.read = z;
        this.IconCompatParcelizer = obj2;
        this.serializer = obj3;
        this.RatingCompat = obj4;
        this.MediaBrowserCompatMediaItem = obj5;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.text.input.TextInputSession textInputSession;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.RatingCompat;
        Object obj4 = this.serializer;
        Object obj5 = this.IconCompatParcelizer;
        boolean z = this.read;
        Object obj6 = this.write;
        if (i != 0) {
            androidx.compose.material3.SheetState sheetState = (androidx.compose.material3.SheetState) obj6;
            String str = (String) obj5;
            String str2 = (String) obj4;
            String str3 = (String) obj3;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj2;
            androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
            if (sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().serializer.size() > 1 && z) {
                getAutofillTree getautofilltreeIconCompatParcelizer = sheetState.IconCompatParcelizer();
                getAutofillTree getautofilltree = getAutofillTree.PartiallyExpanded;
                androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState = sheetState.IconCompatParcelizer;
                if (getautofilltreeIconCompatParcelizer == getautofilltree) {
                    if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) anchoredDraggableState.serializer).invoke(getAutofillTree.Expanded)).booleanValue()) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new Rcolor(getcontentviewgroupparentlayout, sheetState, 1));
                    }
                } else if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) anchoredDraggableState.serializer).invoke(getautofilltree)).booleanValue()) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new Rcolor(getcontentviewgroupparentlayout, sheetState, 2));
                }
                if (!sheetState.RatingCompat) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new Rcolor(getcontentviewgroupparentlayout, sheetState, 3));
                }
            }
            return createfromparcel;
        }
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = (androidx.compose.foundation.text.LegacyTextFieldState) obj6;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = legacyTextFieldState.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        androidx.compose.ui.platform.WindowInfo windowInfo = (androidx.compose.ui.platform.WindowInfo) obj5;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) obj4;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) obj3;
        androidx.compose.ui.text.input.OffsetMapping offsetMapping = (androidx.compose.ui.text.input.OffsetMapping) obj2;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = (androidx.compose.ui.layout.LayoutCoordinates) obj;
        legacyTextFieldState.RemoteActionCompatParcelizer = layoutCoordinates3;
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
        if (textLayoutResultProxySerializer != null) {
            textLayoutResultProxySerializer.serializer = layoutCoordinates3;
        }
        if (z) {
            if (legacyTextFieldState.IconCompatParcelizer() == alignKFBX0sM.Selection) {
                if (((Boolean) ((onShowTranslationui) legacyTextFieldState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg).getValue()).booleanValue() && windowInfo.isWindowFocused()) {
                    textFieldSelectionManager.MediaSessionCompatQueueItem();
                } else {
                    textFieldSelectionManager.MediaMetadataCompat();
                }
                ((onShowTranslationui) legacyTextFieldState.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).setValue(Boolean.valueOf(onReset.IconCompatParcelizer(textFieldSelectionManager, true)));
                ((onShowTranslationui) legacyTextFieldState.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).setValue(Boolean.valueOf(onReset.IconCompatParcelizer(textFieldSelectionManager, false)));
                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Boolean.valueOf(androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(textFieldValue.m3330getSelectiond9O1mEE())));
            } else if (legacyTextFieldState.IconCompatParcelizer() == alignKFBX0sM.Cursor) {
                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Boolean.valueOf(onReset.IconCompatParcelizer(textFieldSelectionManager, true)));
            }
            androidx.compose.foundation.text.CoreTextFieldKt.read(legacyTextFieldState, textFieldValue, offsetMapping);
            androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer2 = legacyTextFieldState.serializer();
            if (textLayoutResultProxySerializer2 != null && (textInputSession = legacyTextFieldState.MediaDescriptionCompat) != null && legacyTextFieldState.write() && (layoutCoordinates = textLayoutResultProxySerializer2.serializer) != null && layoutCoordinates.isAttached() && (layoutCoordinates2 = textLayoutResultProxySerializer2.write) != null) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = textLayoutResultProxySerializer2.RemoteActionCompatParcelizer;
                setSizeuvyYCjk setsizeuvyycjk = new setSizeuvyYCjk(1, layoutCoordinates);
                int i2 = getShouldAutoInvalidateannotations.IconCompatParcelizer;
                androidx.compose.ui.geometry.Rect rectBoundsInWindow$default = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
                textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, setsizeuvyycjk, androidx.compose.ui.geometry.RectKt.m515Rect0a9Yr6o(layoutCoordinates.mo2226windowToLocalMKHz9U(rectBoundsInWindow$default.m512getTopLeftF1C5BW0()), layoutCoordinates.mo2226windowToLocalMKHz9U(rectBoundsInWindow$default.m506getBottomRightF1C5BW0())), layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false));
            }
        }
        return createfromparcel;
    }
}
