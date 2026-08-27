package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.k7$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import o.Actual_androidKt;
import o.AlignmentHorizontal;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetReusableRectp;
import o.accessthenjd;
import o.currentTimeMillis;
import o.getBirthDateFull;
import o.getBrush;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInsertedNodeAwaitingAttachForInvalidationui;
import o.getNewPassword;
import o.getPostalCode;
import o.getShouldAutoInvalidate;
import o.isAppSetIdReadingEnabled;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setNativeShader;
import o.tryPopulateReflectively;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoreTextFieldKt {
    public static final void RemoteActionCompatParcelizer(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession textInputSession = legacyTextFieldState.MediaDescriptionCompat;
        if (textInputSession != null) {
            legacyTextFieldState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.invoke(TextFieldValue.m3325copy3r_uNRQ$default(legacyTextFieldState.ComponentActivity.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }
        legacyTextFieldState.MediaDescriptionCompat = null;
    }

    public static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2036174316);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), true);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Actual_androidKt.write(textFieldSelectionManager, dragAndDropTargetModifierNode, getpostalcode, (i2 >> 3) & 126);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(modifier, textFieldSelectionManager, dragAndDropTargetModifierNode, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public static final void IconCompatParcelizer(TextFieldSelectionManager textFieldSelectionManager, boolean z, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        TextLayoutResult textLayoutResult;
        TextLayoutResultProxy textLayoutResultProxySerializer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(626339208);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (z) {
            getpostalcode.serializer(1530097388);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState == null || (textLayoutResultProxySerializer = legacyTextFieldState.serializer()) == null) {
                textLayoutResult = null;
            } else {
                textLayoutResult = textLayoutResultProxySerializer.RemoteActionCompatParcelizer;
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (legacyTextFieldState2 == null || legacyTextFieldState2.MediaSessionCompatQueueItem) {
                    textLayoutResult = null;
                }
            }
            if (textLayoutResult == null) {
                getpostalcode.serializer(1530097387);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1530097388);
                if (TextRange.m3070getCollapsedimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE())) {
                    getpostalcode.serializer(2110860558);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(2109807302);
                    int iOriginalToTransformed = textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3076getStartimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE()));
                    int iOriginalToTransformed2 = textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3071getEndimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                    LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (legacyTextFieldState3 == null || !((Boolean) ((onShowTranslationui) legacyTextFieldState3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).getValue()).booleanValue()) {
                        getpostalcode.serializer(2110490542);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(2110225306);
                        getShouldAutoInvalidate.RemoteActionCompatParcelizer(true, bidiRunDirection, textFieldSelectionManager, getpostalcode, ((i2 << 6) & 896) | 6);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (legacyTextFieldState4 == null || !((Boolean) ((onShowTranslationui) legacyTextFieldState4.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).getValue()).booleanValue()) {
                        getpostalcode.serializer(2110838734);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(2110574459);
                        getShouldAutoInvalidate.RemoteActionCompatParcelizer(false, bidiRunDirection2, textFieldSelectionManager, getpostalcode, ((i2 << 6) & 896) | 6);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                }
                LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (legacyTextFieldState5 != null) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = legacyTextFieldState5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldSelectionManager.ResultReceiver.getText(), textFieldSelectionManager.MediaDescriptionCompat().getText()}, getCieXyz.write())).booleanValue()) {
                        ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(Boolean.FALSE);
                    }
                    if (legacyTextFieldState5.write()) {
                        if (((Boolean) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()).booleanValue()) {
                            textFieldSelectionManager.MediaSessionCompatQueueItem();
                        } else {
                            textFieldSelectionManager.MediaMetadataCompat();
                        }
                    }
                }
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(1989076778);
            getpostalcode.IconCompatParcelizer(false);
            textFieldSelectionManager.MediaMetadataCompat();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new currentTimeMillis(i, 0, textFieldSelectionManager, z);
        }
    }

    public static final void IconCompatParcelizer(TextFieldSelectionManager textFieldSelectionManager, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        AnnotatedString annotatedStringSerializer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1436003720);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (legacyTextFieldState != null && ((Boolean) ((onShowTranslationui) legacyTextFieldState.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4).getValue()).booleanValue() && (annotatedStringSerializer = textFieldSelectionManager.serializer()) != null && annotatedStringSerializer.length() > 0) {
                getpostalcode.serializer(-2112351432);
                boolean z = getpostalcode.read(textFieldSelectionManager);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new getInsertedNodeAwaitingAttachForInvalidationui(textFieldSelectionManager);
                    getpostalcode.write(objComponentActivity);
                }
                AlignmentHorizontal alignmentHorizontal = (AlignmentHorizontal) objComponentActivity;
                Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                int iOriginalToTransformed = textFieldSelectionManager.PlaybackStateCompatCustomAction.originalToTransformed(TextRange.m3076getStartimpl(textFieldSelectionManager.MediaDescriptionCompat().m3330getSelectiond9O1mEE()));
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState2 != null ? legacyTextFieldState2.serializer() : null;
                textLayoutResultProxySerializer.getClass();
                TextLayoutResult textLayoutResult = textLayoutResultProxySerializer.RemoteActionCompatParcelizer;
                Rect cursorRect = textLayoutResult.getCursorRect(RangesKt.RemoteActionCompatParcelizer(iOriginalToTransformed, 0, textLayoutResult.getLayoutInput().getText().length()));
                long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(cursorRect.getBottom())) & 4294967295L) | (((long) Float.floatToRawIntBits((density.mo48toPx0680j_4(TextFieldCursor_androidKt.write) / 2.0f) + cursorRect.getLeft())) << 32));
                boolean zSerializer = getpostalcode.serializer(jM469constructorimpl);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zSerializer || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new tryPopulateReflectively(jM469constructorimpl);
                    getpostalcode.write(objComponentActivity2);
                }
                accessthenjd accessthenjdVar = (accessthenjd) objComponentActivity2;
                Modifier.Companion companion = Modifier.Companion;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(alignmentHorizontal);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(textFieldSelectionManager);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(alignmentHorizontal, 0, textFieldSelectionManager);
                    getpostalcode.write(objComponentActivity3);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, alignmentHorizontal, (PointerInputEventHandler) objComponentActivity3);
                boolean zSerializer2 = getpostalcode.serializer(jM469constructorimpl);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zSerializer2 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new k7$$ExternalSyntheticLambda2(jM469constructorimpl, i3);
                    getpostalcode.write(objComponentActivity4);
                }
                AndroidCursorHandle_androidKt.write(accessthenjdVar, SemanticsModifierKt.semantics$default(modifierPointerInput, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, 1, null), 0L, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-2111042550);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(textFieldSelectionManager, i, 4);
        }
    }

    public static final void read(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
        try {
            TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
            if (textLayoutResultProxySerializer == null) {
                return;
            }
            TextInputSession textInputSession = legacyTextFieldState.MediaDescriptionCompat;
            if (textInputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.read();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate$Companion.notifyFocusedRect$foundation(textFieldValue, legacyTextFieldState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, textLayoutResultProxySerializer.RemoteActionCompatParcelizer, layoutCoordinates, textInputSession, legacyTextFieldState.write(), offsetMapping);
        } finally {
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v11 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void IconCompatParcelizer(final androidx.compose.ui.text.input.TextFieldValue r72, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r73, androidx.compose.ui.Modifier r74, final androidx.compose.ui.text.TextStyle r75, final androidx.compose.ui.text.input.VisualTransformation r76, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r77, androidx.compose.foundation.interaction.MutableInteractionSourceImpl r78, androidx.compose.ui.graphics.SolidColor r79, boolean r80, final int r81, final int r82, androidx.compose.ui.text.input.ImeOptions r83, o.getBottomEnd r84, boolean r85, final o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r86, o.getBirthDateFull r87, int r88, int r89) {
        /*
            Method dump skipped, instruction units count: 2690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.IconCompatParcelizer(androidx.compose.ui.text.input.TextFieldValue, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, androidx.compose.foundation.interaction.MutableInteractionSourceImpl, androidx.compose.ui.graphics.SolidColor, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, o.getBottomEnd, boolean, o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY, o.getBirthDateFull, int, int):void");
    }
}
