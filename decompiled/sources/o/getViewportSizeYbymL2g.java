package o;

import android.content.Context;
import android.content.res.Resources;
import bo.app.d0$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getViewportSizeYbymL2g implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;

    public /* synthetic */ getViewportSizeYbymL2g(int i, androidx.compose.foundation.lazy.LazyListMeasureResult lazyListMeasureResult) {
        this.read = 21;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        char c = 1;
        switch (i) {
            case 0:
                ((androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj).drawContent();
                return createfromparcel;
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
            case 3:
                return minIntrinsicWidth.IconCompatParcelizer;
            case 4:
                return createfromparcel;
            case 5:
                ((Long) obj).getClass();
                return createfromparcel;
            case 6:
                int i2 = windowInsetsPadding.RemoteActionCompatParcelizer;
                androidx.compose.runtime.ProvidableCompositionLocal localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) ((getCreditCardNumber) obj);
                dragAndDropNodestartDragAndDropTransfer1.getClass();
                Context context = (Context) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, localContext);
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                PagerStatescrollToPage2 pagerStatescrollToPage2 = (PagerStatescrollToPage2) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, PagerStateanimateScrollToPage3.read);
                if (pagerStatescrollToPage2 == null) {
                    return null;
                }
                return new LazyLayoutSemanticStateKtLazyLayoutSemanticState1(context, density, pagerStatescrollToPage2.RemoteActionCompatParcelizer, pagerStatescrollToPage2.write);
            case 7:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, androidx.compose.ui.semantics.ProgressBarRangeInfo.Companion.getIndeterminate());
                return createfromparcel;
            case 8:
                return new androidx.compose.foundation.ScrollState(((Integer) obj).intValue());
            case 9:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 10:
                androidx.compose.runtime.ProvidableCompositionLocal localContext2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer2 = (DragAndDropNodestartDragAndDropTransfer1) ((getCreditCardNumber) obj);
                dragAndDropNodestartDragAndDropTransfer2.getClass();
                if (((Context) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer2, localContext2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return TextDelegateKt.read;
                }
                getStringId9Hzcbyc.write.getClass();
                return resolvedString.serializer;
            case 11:
                float f = androidx.compose.foundation.gestures.DragGestureDetectorKt.serializer;
                return createfromparcel;
            case 12:
                getViewportSizeYbymL2g getviewportsizeybyml2g = MinLinesConstrainer.serializer;
                return Boolean.TRUE;
            case 13:
                androidx.compose.ui.input.pointer.PointerType pointerType = (androidx.compose.ui.input.pointer.PointerType) obj;
                return Boolean.valueOf(!(pointerType != null ? androidx.compose.ui.input.pointer.PointerType.m2146equalsimpl0(pointerType.m2149unboximpl(), androidx.compose.ui.input.pointer.PointerType.Companion.m2151getMouseT8wyACA()) : false));
            case 14:
                ((Float) obj).getClass();
                return createfromparcel;
            case 15:
                return ((TooltipKt) obj).ComponentActivity;
            case 16:
                return ((TooltipKt) obj).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            case 17:
                return ((TooltipKt) obj).MediaBrowserCompatMediaItem;
            case 18:
                return ((TooltipKt) obj).PlaybackStateCompat;
            case 19:
                ((Integer) obj).getClass();
                return null;
            case 20:
                List list = (List) obj;
                return new androidx.compose.foundation.lazy.LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 21:
                return createfromparcel;
            case 22:
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list2.get(1);
                obj3.getClass();
                return new ForgottenCoroutineScopeException(iIntValue, ((Float) obj3).floatValue(), new d0$$ExternalSyntheticLambda0(list2, c == true ? 1 : 0));
            case 23:
                int i3 = androidx.compose.foundation.text.BasicTextFieldKt.IconCompatParcelizer;
                return createfromparcel;
            case 24:
                return createfromparcel;
            case 25:
                androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj;
                String text = textFieldPreparedSelection.IconCompatParcelizer.getText();
                int iM3071getEndimpl = androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection.MediaDescriptionCompat);
                if (iM3071getEndimpl > 0) {
                    MutableRectKt mutableRectKtSerializer = getEnd.serializer();
                    if (mutableRectKtSerializer != null) {
                        int iSerializer = mutableRectKtSerializer.serializer(iM3071getEndimpl - 1, text);
                        if (iSerializer >= 0) {
                            iOffsetByCodePoints = iSerializer;
                        } else if (iM3071getEndimpl <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(text, iM3071getEndimpl, -1);
                        }
                    } else if (iM3071getEndimpl <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(text, iM3071getEndimpl, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection.MediaDescriptionCompat) - iOffsetByCodePoints, 0);
            case 26:
                androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection2 = (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj;
                int iWrite = getEnd.write(textFieldPreparedSelection2.IconCompatParcelizer.getText(), androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection2.MediaDescriptionCompat));
                if (iWrite != -1) {
                    return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, iWrite - androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection2.MediaDescriptionCompat));
                }
                return null;
            case 27:
                androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection3 = (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj;
                Integer numIconCompatParcelizer = textFieldPreparedSelection3.IconCompatParcelizer();
                if (numIconCompatParcelizer != null) {
                    return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection3.MediaDescriptionCompat) - numIconCompatParcelizer.intValue(), 0);
                }
                return null;
            case 28:
                androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection4 = (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj;
                Integer num = textFieldPreparedSelection4.read();
                if (num != null) {
                    return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, num.intValue() - androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection4.MediaDescriptionCompat));
                }
                return null;
            default:
                androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection5 = (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj;
                androidx.compose.ui.text.input.OffsetMapping offsetMapping = textFieldPreparedSelection5.write;
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = textFieldPreparedSelection5.serializer;
                Integer numValueOf = textLayoutResult != null ? Integer.valueOf(offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m3074getMinimpl(textFieldPreparedSelection5.MediaDescriptionCompat)))))) : null;
                if (numValueOf != null) {
                    return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection5.MediaDescriptionCompat) - numValueOf.intValue(), 0);
                }
                return null;
        }
    }

    public /* synthetic */ getViewportSizeYbymL2g(int i) {
        this.read = i;
    }
}
