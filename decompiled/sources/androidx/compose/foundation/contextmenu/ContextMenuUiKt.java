package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.window.PopupProperties;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BasicTextFieldKt;
import o.BasicTextKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.expand;
import o.getAddressCountry;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContextMenuUiKt {
    public static final BasicTextFieldKt RemoteActionCompatParcelizer;

    public static final void write(Modifier modifier, BasicTextFieldKt basicTextFieldKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-625529233);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= getpostalcode.read(basicTextFieldKt) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = 1;
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                basicTextFieldKt = RemoteActionCompatParcelizer;
            }
            ContextMenuColumn(basicTextFieldKt, modifier, ExtrasKt.write(-250345048, new PagerDefaults$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, i6, basicTextFieldKt), getpostalcode), getpostalcode, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        BasicTextFieldKt basicTextFieldKt2 = basicTextFieldKt;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(modifier2, basicTextFieldKt2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, i2);
        }
    }

    public static final void ContextMenuColumn(BasicTextFieldKt basicTextFieldKt, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-527864079);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(basicTextFieldKt) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.m73paddingVpY3zN4$default(IntrinsicKt.width(BackgroundKt.m20backgroundbw27NRU(ShadowKt.m317shadows4CzXII$default(modifier, ContextMenuSpec.PlaybackStateCompat, RoundedCornerShapeKt.IconCompatParcelizer(ContextMenuSpec.RemoteActionCompatParcelizer), false, 0L, 0L, 28, null), basicTextFieldKt.read, RectangleShapeKt.getRectangleShape()), expand.Max), 0.0f, ContextMenuSpec.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, 1), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                dragAndDropTargetModifierNode.invoke(ModalBottomSheetKt.write, getpostalcode, Integer.valueOf(((((i2 << 3) & 7168) >> 6) & 112) | 6));
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 1, basicTextFieldKt, modifier, dragAndDropTargetModifierNode);
        }
    }

    static {
        new PopupProperties(true, false, false, false, false, 30, (DefaultConstructorMarker) null);
        Color.Companion companion = Color.Companion;
        RemoteActionCompatParcelizer = new BasicTextFieldKt(companion.m759getWhite0d7_KjU(), companion.m748getBlack0d7_KjU(), companion.m748getBlack0d7_KjU(), Color.m721copywmQWz5c$default(companion.m748getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m721copywmQWz5c$default(companion.m748getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
    }

    public static final void ContextMenuItem(String str, boolean z, BasicTextFieldKt basicTextFieldKt, Modifier modifier, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        long j;
        long j2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2001167027);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(basicTextFieldKt) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 131072 : 65536;
        }
        if (getpostalcode2.write(i2 & 1, (74899 & i2) != 74898)) {
            Alignment.Vertical vertical = ContextMenuSpec.PlaybackStateCompatCustomAction;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            float f = ContextMenuSpec.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(f);
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (458752 & i2) == 131072;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new BasicTextKt(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
                getpostalcode2.write(objComponentActivity);
            }
            Modifier modifierWrite = SizeKt.write(ClickableKt.RemoteActionCompatParcelizer(modifier, z, str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 12), 1.0f);
            float f2 = ContextMenuSpec.write;
            float f3 = ContextMenuSpec.IconCompatParcelizer;
            float f4 = ContextMenuSpec.MediaSessionCompatToken;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.m85sizeInqDBjuR0(modifierWrite, f2, f4, f3, f4), f, 0.0f, 2);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, vertical, getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry == null) {
                    getpostalcode2.serializer(-1597947094);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-1597947093);
                    Modifier.Companion companion2 = Modifier.Companion;
                    float f5 = ContextMenuSpec.MediaSessionCompatQueueItem;
                    Modifier modifierM80requiredSizeInqDBjuR0$default = SizeKt.m80requiredSizeInqDBjuR0$default(companion2, f5, 0.0f, f5, f5, 2);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM80requiredSizeInqDBjuR0$default);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion.getConstructor();
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor2);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                    if (z) {
                        j = basicTextFieldKt.write;
                    } else {
                        j = basicTextFieldKt.IconCompatParcelizer;
                    }
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(Color.m712boximpl(j), getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(true);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                if (z) {
                    j2 = basicTextFieldKt.RemoteActionCompatParcelizer;
                } else {
                    j2 = basicTextFieldKt.serializer;
                }
                androidx.compose.foundation.text.BasicTextKt.m99BasicTextRWo7tUw(str, d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), new TextStyle(j2, ContextMenuSpec.RatingCompat, ContextMenuSpec.MediaMetadataCompat, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, ContextMenuSpec.ParcelableVolumeInfo, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, ContextMenuSpec.MediaDescriptionCompat, 0, ContextMenuSpec.MediaSessionCompatResultReceiverWrapper, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613240, (DefaultConstructorMarker) null), null, 0, false, 1, 0, getpostalcode2, (i2 & 14) | 1572864, 952);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(str, z, basicTextFieldKt, modifier, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }
}
