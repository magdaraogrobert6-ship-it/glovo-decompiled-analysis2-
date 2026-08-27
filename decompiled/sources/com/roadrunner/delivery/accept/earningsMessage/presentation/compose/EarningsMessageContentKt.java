package com.roadrunner.delivery.accept.earningsMessage.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LayoutIntrinsics;
import o.accessgetIntRangeComparatorp;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.computeMinIntrinsicWidth;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EarningsMessageContentKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d A[PHI: r2
  0x003d: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r2
  0x0031: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void EarningsMessageContent(StateFlow stateFlow, accessgetIntRangeComparatorp accessgetintrangecomparatorp, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 73;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            stateFlow.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-352116126);
            if ((i & 97) == 0) {
                if (getpostalcode.IconCompatParcelizer(stateFlow)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                int i6 = IconCompatParcelizer + 95;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = i;
            }
        } else {
            stateFlow.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-352116126);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(stateFlow)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                int i8 = IconCompatParcelizer + 95;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i10 = IconCompatParcelizer + 125;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= getpostalcode.read(accessgetintrangecomparatorp) ? 32 : 16;
        }
        int i12 = i3 | 384;
        if (getpostalcode.write(i12 & 1, (i12 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            LayoutIntrinsics layoutIntrinsics = (LayoutIntrinsics) ExtrasKt.write(stateFlow, getpostalcode, i12 & 14).getValue();
            if (layoutIntrinsics instanceof computeMinIntrinsicWidth) {
                getpostalcode.serializer(-1581076565);
                computeMinIntrinsicWidth computeminintrinsicwidth = (computeMinIntrinsicWidth) layoutIntrinsics;
                String str = computeminintrinsicwidth.IconCompatParcelizer;
                String str2 = computeminintrinsicwidth.write;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int length = 0;
                while (length < str2.length()) {
                    int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, str, length, false, 4);
                    if (iWrite < 0) {
                        builder.append(str2.substring(length, str2.length()));
                        break;
                    }
                    builder.append(str2.substring(length, iWrite));
                    int iPushStyle = builder.pushStyle(new SpanStyle(computeminintrinsicwidth.read, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append(str);
                        builder.pop(iPushStyle);
                        length = str.length() + iWrite;
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i13 = write + 37;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion4 = Modifier.Companion;
                float f = Dimensions.setActionBarVisibilityCallback;
                TextKt.m132TextZ58ophY(annotatedString, BoxScopeInstance.serializer.align(PaddingKt.read(companion4, f, Dimensions.getNestedScrollAxes, f, f), companion2.getCenter()), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, performLayout.write(), getpostalcode, 0, 0, 261112);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1580379840);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 20, modifier2, (Object) stateFlow, (Object) accessgetintrangecomparatorp);
        }
    }
}
