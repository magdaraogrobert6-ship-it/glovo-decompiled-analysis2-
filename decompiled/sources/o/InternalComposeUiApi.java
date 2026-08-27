package o;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InternalComposeUiApi {
    public static void serializer(long j, androidx.compose.ui.text.AnnotatedString annotatedString, boolean z, InlineChildren inlineChildren) {
        if (z) {
            int iM3076getStartimpl = androidx.compose.ui.text.TextRange.m3076getStartimpl(j);
            int iM3071getEndimpl = androidx.compose.ui.text.TextRange.m3071getEndimpl(j);
            int iCodePointBefore = iM3076getStartimpl > 0 ? Character.codePointBefore(annotatedString, iM3076getStartimpl) : 10;
            int iCodePointAt = iM3071getEndimpl < annotatedString.length() ? Character.codePointAt(annotatedString, iM3071getEndimpl) : 10;
            if (androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.serializer(iCodePointBefore) && (androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.IconCompatParcelizer(iCodePointAt) || androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.RemoteActionCompatParcelizer(iCodePointAt))) {
                do {
                    iM3076getStartimpl -= Character.charCount(iCodePointBefore);
                    if (iM3076getStartimpl == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(annotatedString, iM3076getStartimpl);
                    }
                } while (androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.serializer(iCodePointBefore));
                j = androidx.compose.ui.text.TextRangeKt.TextRange(iM3076getStartimpl, iM3071getEndimpl);
            } else if (androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.serializer(iCodePointAt) && (androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.IconCompatParcelizer(iCodePointBefore) || androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.RemoteActionCompatParcelizer(iCodePointBefore))) {
                do {
                    iM3071getEndimpl += Character.charCount(iCodePointAt);
                    if (iM3071getEndimpl == annotatedString.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(annotatedString, iM3071getEndimpl);
                    }
                } while (androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.serializer(iCodePointAt));
                j = androidx.compose.ui.text.TextRangeKt.TextRange(iM3076getStartimpl, iM3071getEndimpl);
            }
        }
        inlineChildren.invoke(new onDetach(new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m3071getEndimpl(j), androidx.compose.ui.text.TextRange.m3071getEndimpl(j)), new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m3072getLengthimpl(j), 0)}));
    }

    public static int aY_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, InlineChildren inlineChildren) {
        long jM3081getZerod9O1mEE;
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer;
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer2;
        androidx.compose.ui.text.TextLayoutInput layoutInput;
        androidx.compose.ui.text.AnnotatedString annotatedString = legacyTextFieldState.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (annotatedString == null) {
            return 3;
        }
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer3 = legacyTextFieldState.serializer();
        if (!annotatedString.equals((textLayoutResultProxySerializer3 == null || (layoutInput = textLayoutResultProxySerializer3.RemoteActionCompatParcelizer.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jRemoteActionCompatParcelizer = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.RemoteActionCompatParcelizer(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), IconCompatParcelizer(selectGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter());
            if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(jRemoteActionCompatParcelizer)) {
                return aX_(selectGesture, inlineChildren);
            }
            inlineChildren.invoke(new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m3076getStartimpl(jRemoteActionCompatParcelizer), androidx.compose.ui.text.TextRange.m3071getEndimpl(jRemoteActionCompatParcelizer)));
            if (textFieldSelectionManager != null) {
                textFieldSelectionManager.RemoteActionCompatParcelizer(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int iIconCompatParcelizer = IconCompatParcelizer(deleteGesture.getGranularity());
                long jRemoteActionCompatParcelizer2 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.RemoteActionCompatParcelizer(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iIconCompatParcelizer, androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter());
                if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(jRemoteActionCompatParcelizer2)) {
                    return aX_(deleteGesture, inlineChildren);
                }
                serializer(jRemoteActionCompatParcelizer2, annotatedString, androidx.compose.ui.text.TextGranularity.m3033equalsimpl0(iIconCompatParcelizer, androidx.compose.ui.text.TextGranularity.Companion.m3038getWordDRrd7Zo()), inlineChildren);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int iIconCompatParcelizer2 = IconCompatParcelizer(deleteRangeGesture.getGranularity());
                    long jWrite = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.write(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iIconCompatParcelizer2, androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter());
                    if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(jWrite)) {
                        return aX_(deleteRangeGesture, inlineChildren);
                    }
                    serializer(jWrite, annotatedString, androidx.compose.ui.text.TextGranularity.m3033equalsimpl0(iIconCompatParcelizer2, androidx.compose.ui.text.TextGranularity.Companion.m3038getWordDRrd7Zo()), inlineChildren);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (viewConfiguration == null) {
                        return aX_(joinOrSplitGesture, inlineChildren);
                    }
                    int iIconCompatParcelizer3 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.IconCompatParcelizer(legacyTextFieldState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
                    if (iIconCompatParcelizer3 == -1 || ((textLayoutResultProxySerializer2 = legacyTextFieldState.serializer()) != null && androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.write(textLayoutResultProxySerializer2.RemoteActionCompatParcelizer, iIconCompatParcelizer3))) {
                        return aX_(joinOrSplitGesture, inlineChildren);
                    }
                    int iCharCount = iIconCompatParcelizer3;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(annotatedString, iCharCount);
                        if (!androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.IconCompatParcelizer(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iIconCompatParcelizer3 < annotatedString.length()) {
                        int iCodePointAt = Character.codePointAt(annotatedString, iIconCompatParcelizer3);
                        if (!androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.IconCompatParcelizer(iCodePointAt)) {
                            break;
                        }
                        iIconCompatParcelizer3 += Character.charCount(iCodePointAt);
                    }
                    long jTextRange = androidx.compose.ui.text.TextRangeKt.TextRange(iCharCount, iIconCompatParcelizer3);
                    if (!androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(jTextRange)) {
                        serializer(jTextRange, annotatedString, false, inlineChildren);
                        return 1;
                    }
                    int iM3076getStartimpl = androidx.compose.ui.text.TextRange.m3076getStartimpl(jTextRange);
                    inlineChildren.invoke(new onDetach(new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.SetSelectionCommand(iM3076getStartimpl, iM3076getStartimpl), new androidx.compose.ui.text.input.CommitTextCommand(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (viewConfiguration == null) {
                        return aX_(insertGesture, inlineChildren);
                    }
                    int iIconCompatParcelizer4 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.IconCompatParcelizer(legacyTextFieldState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
                    if (iIconCompatParcelizer4 == -1 || ((textLayoutResultProxySerializer = legacyTextFieldState.serializer()) != null && androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.write(textLayoutResultProxySerializer.RemoteActionCompatParcelizer, iIconCompatParcelizer4))) {
                        return aX_(insertGesture, inlineChildren);
                    }
                    inlineChildren.invoke(new onDetach(new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.SetSelectionCommand(iIconCompatParcelizer4, iIconCompatParcelizer4), new androidx.compose.ui.text.input.CommitTextCommand(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer4 = legacyTextFieldState.serializer();
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = textLayoutResultProxySerializer4 != null ? textLayoutResultProxySerializer4.RemoteActionCompatParcelizer : null;
                long jAccess$toOffset = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(removeSpaceGesture.getStartPoint());
                long jAccess$toOffset2 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(removeSpaceGesture.getEndPoint());
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = legacyTextFieldState.read();
                if (textLayoutResult == null || layoutCoordinates == null) {
                    jM3081getZerod9O1mEE = androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE();
                } else {
                    long jMo2223screenToLocalMKHz9U = layoutCoordinates.mo2223screenToLocalMKHz9U(jAccess$toOffset);
                    long jMo2223screenToLocalMKHz9U2 = layoutCoordinates.mo2223screenToLocalMKHz9U(jAccess$toOffset2);
                    int iM103getLineForHandwritingGestured4ec7I = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m103getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo2223screenToLocalMKHz9U, viewConfiguration);
                    int iM103getLineForHandwritingGestured4ec7I2 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m103getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo2223screenToLocalMKHz9U2, viewConfiguration);
                    if (iM103getLineForHandwritingGestured4ec7I == -1) {
                        if (iM103getLineForHandwritingGestured4ec7I2 == -1) {
                            jM3081getZerod9O1mEE = androidx.compose.ui.text.TextRange.Companion.m3081getZerod9O1mEE();
                        } else {
                            iM103getLineForHandwritingGestured4ec7I = iM103getLineForHandwritingGestured4ec7I2;
                        }
                    } else if (iM103getLineForHandwritingGestured4ec7I2 != -1) {
                        iM103getLineForHandwritingGestured4ec7I = Math.min(iM103getLineForHandwritingGestured4ec7I, iM103getLineForHandwritingGestured4ec7I2);
                    }
                    float lineBottom = (textLayoutResult.getLineBottom(iM103getLineForHandwritingGestured4ec7I) + textLayoutResult.getLineTop(iM103getLineForHandwritingGestured4ec7I)) / 2.0f;
                    int i = (int) (jMo2223screenToLocalMKHz9U >> 32);
                    int i2 = (int) (jMo2223screenToLocalMKHz9U2 >> 32);
                    jM3081getZerod9O1mEE = textLayoutResult.getMultiParagraph().m2911getRangeForRect86BmAI(new androidx.compose.ui.geometry.Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom + 0.1f), androidx.compose.ui.text.TextGranularity.Companion.m3037getCharacterDRrd7Zo(), androidx.compose.ui.text.TextInclusionStrategy.Companion.getAnyOverlap());
                }
                if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(jM3081getZerod9O1mEE)) {
                    return aX_(removeSpaceGesture, inlineChildren);
                }
                createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
                createbrazeuserchangeeventsubscriberlambda01.read = -1;
                createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda02 = new createBrazeUserChangeEventSubscriberlambda01();
                createbrazeuserchangeeventsubscriberlambda02.read = -1;
                String strSerializer = new getInAppMessageEventMap("\\s+").serializer(androidx.compose.ui.text.TextRangeKt.m3083substringFDrldGo(annotatedString, jM3081getZerod9O1mEE), new waitForFirstLayout(createbrazeuserchangeeventsubscriberlambda01, 29, createbrazeuserchangeeventsubscriberlambda02));
                if (createbrazeuserchangeeventsubscriberlambda01.read == -1 || createbrazeuserchangeeventsubscriberlambda02.read == -1) {
                    return aX_(removeSpaceGesture, inlineChildren);
                }
                inlineChildren.invoke(new onDetach(new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m3076getStartimpl(jM3081getZerod9O1mEE) + createbrazeuserchangeeventsubscriberlambda01.read, androidx.compose.ui.text.TextRange.m3076getStartimpl(jM3081getZerod9O1mEE) + createbrazeuserchangeeventsubscriberlambda02.read), new androidx.compose.ui.text.input.CommitTextCommand(strSerializer.substring(createbrazeuserchangeeventsubscriberlambda01.read, strSerializer.length() - (androidx.compose.ui.text.TextRange.m3072getLengthimpl(jM3081getZerod9O1mEE) - createbrazeuserchangeeventsubscriberlambda02.read)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jWrite2 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.write(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), IconCompatParcelizer(selectRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter());
            if (androidx.compose.ui.text.TextRange.m3070getCollapsedimpl(jWrite2)) {
                return aX_(selectRangeGesture, inlineChildren);
            }
            inlineChildren.invoke(new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m3076getStartimpl(jWrite2), androidx.compose.ui.text.TextRange.m3071getEndimpl(jWrite2)));
            if (textFieldSelectionManager != null) {
                textFieldSelectionManager.RemoteActionCompatParcelizer(true);
            }
        }
        return 1;
    }

    public static int IconCompatParcelizer(int i) {
        if (i == 1) {
            return androidx.compose.ui.text.TextGranularity.Companion.m3038getWordDRrd7Zo();
        }
        if (i != 2) {
            return androidx.compose.ui.text.TextGranularity.Companion.m3037getCharacterDRrd7Zo();
        }
        return androidx.compose.ui.text.TextGranularity.Companion.m3037getCharacterDRrd7Zo();
    }

    public static boolean aZ_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        androidx.compose.ui.text.TextLayoutInput layoutInput;
        androidx.compose.ui.text.AnnotatedString annotatedString = legacyTextFieldState.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (annotatedString != null) {
            androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
            if (annotatedString.equals((textLayoutResultProxySerializer == null || (layoutInput = textLayoutResultProxySerializer.RemoteActionCompatParcelizer.getLayoutInput()) == null) ? null : layoutInput.getText())) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        textFieldSelectionManager.serializer(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.RemoteActionCompatParcelizer(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), IconCompatParcelizer(selectGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter()));
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        textFieldSelectionManager.write(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.RemoteActionCompatParcelizer(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), IconCompatParcelizer(deleteGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter()));
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        textFieldSelectionManager.serializer(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.write(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), IconCompatParcelizer(selectRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter()));
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (textFieldSelectionManager != null) {
                        textFieldSelectionManager.write(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.write(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), IconCompatParcelizer(deleteRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.Companion.getContainsCenter()));
                    }
                }
                if (cancellationSignal == null) {
                    return true;
                }
                cancellationSignal.setOnCancelListener(new setShouldUpdateFrameRates(0, textFieldSelectionManager));
                return true;
            }
        }
        return false;
    }

    public static int aX_(HandwritingGesture handwritingGesture, InlineChildren inlineChildren) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        inlineChildren.invoke(new androidx.compose.ui.text.input.CommitTextCommand(fallbackText, 1));
        return 5;
    }
}
