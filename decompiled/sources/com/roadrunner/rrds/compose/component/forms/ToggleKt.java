package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.Iterator;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.UtilNetworking1;
import o.buildMapping;
import o.expand;
import o.extractJsonInt;
import o.extractJsonLong;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.onShowTranslationui;
import o.p6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ToggleKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r6
  0x0043: PHI (r6v9 o.getPostalCode) = (r6v5 o.getPostalCode), (r6v11 o.getPostalCode) binds: [B:8:0x0036, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038 A[PHI: r6
  0x0038: PHI (r6v6 o.getPostalCode) = (r6v5 o.getPostalCode), (r6v11 o.getPostalCode) binds: [B:8:0x0036, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ToggleBig(List list, boolean z, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z2;
        long onBackPressedDispatcherannotations;
        boolean z3;
        boolean z4;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = read + 35;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(925034172);
            if ((i & 81) == 0) {
                if (getpostalcode.IconCompatParcelizer(list)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(925034172);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(list)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= !(getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i8 = i3;
        if ((i8 & 1171) != 1170) {
            int i9 = IconCompatParcelizer + 123;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (!getpostalcode.write(i8 & 1, z2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i10 = read + 73;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.defaultViewModelProviderFactory_delegatelambda0);
            float f = Dimensions.PlaybackStateCompat;
            if (!(!z)) {
                getpostalcode.serializer(1183243439);
                onBackPressedDispatcherannotations = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPictureInPictureParams();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1183335726);
                onBackPressedDispatcherannotations = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getOnBackPressedDispatcherannotations();
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier modifierWidth = IntrinsicKt.width(IntrinsicKt.height(PaddingKt.write(ClipKt.clip(BorderKt.write(modifier, f, onBackPressedDispatcherannotations, gettopleftannotationsIconCompatParcelizer), gettopleftannotationsIconCompatParcelizer), Dimensions.onMenuOpened), expand.Min), expand.Max);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWidth);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i12 = IconCompatParcelizer + 79;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    getpostalcode.serializer(constructor);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-1995522440);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UtilNetworking1 utilNetworking1 = (UtilNetworking1) it.next();
                    Modifier modifierThen = SizeKt.serializer(utilNetworking1.serializer, 1.0f).then(new show(1.0f, true));
                    String str = utilNetworking1.IconCompatParcelizer;
                    boolean zBooleanValue = ((Boolean) ((onShowTranslationui) utilNetworking1.read).getValue()).booleanValue();
                    if (utilNetworking1.write && z) {
                        z3 = true;
                    } else {
                        int i14 = IconCompatParcelizer + 39;
                        read = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % i5;
                        z3 = false;
                    }
                    if ((i8 & 7168) == 2048) {
                        int i16 = IconCompatParcelizer + 3;
                        read = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % i5;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z5 = getpostalcode.read(utilNetworking1);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (z4 || z5) {
                        i4 = 2;
                    } else {
                        int i18 = IconCompatParcelizer + 5;
                        read = i18 % Fields.SpotShadowColor;
                        i4 = 2;
                        if (i18 % 2 == 0) {
                            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            }
                            ToggleCell(str, zBooleanValue, z3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierThen, getpostalcode, 0);
                            i5 = i4;
                            i8 = i8;
                        } else {
                            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                            throw null;
                        }
                    }
                    objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 10, utilNetworking1);
                    getpostalcode.write(objComponentActivity);
                    ToggleCell(str, zBooleanValue, z3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierThen, getpostalcode, 0);
                    i5 = i4;
                    i8 = i8;
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(list, z, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8  */
    public static final void ToggleCell(String str, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        long jAddOnMultiWindowModeChangedListener;
        long jOnCreateView;
        TextStyle textStyle;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1310534810);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 43;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
                if (getpostalcode.write(z)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else if (getpostalcode.write(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.write(z2)) {
                int i8 = IconCompatParcelizer + 91;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            int i10 = IconCompatParcelizer + 43;
            int i11 = i10 % Fields.SpotShadowColor;
            read = i11;
            int i12 = i10 % 2;
            if (z && !z2) {
                getpostalcode.serializer(998541967);
                jAddOnMultiWindowModeChangedListener = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).addOnNewIntentListener();
                getpostalcode.IconCompatParcelizer(false);
            } else if (z) {
                int i13 = i11 + 113;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.serializer(998544551);
                jAddOnMultiWindowModeChangedListener = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).addMenuProvider();
                getpostalcode.IconCompatParcelizer(false);
            } else if (z2) {
                getpostalcode.serializer(998546853);
                jAddOnMultiWindowModeChangedListener = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).addOnConfigurationChangedListener();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(998548999);
                jAddOnMultiWindowModeChangedListener = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).addOnMultiWindowModeChangedListener();
                getpostalcode.IconCompatParcelizer(false);
            }
            if (!z2 && !(!z)) {
                int i15 = read + 43;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(998552961);
                jOnCreateView = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).AppCompatDialogFragment();
                getpostalcode.IconCompatParcelizer(false);
            } else if (!z2) {
                getpostalcode.serializer(998555257);
                jOnCreateView = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).ensureSubDecor();
                getpostalcode.IconCompatParcelizer(false);
            } else if (z) {
                int i17 = read + 7;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    getpostalcode.serializer(998557145);
                    jOnCreateView = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getItemData();
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(998557145);
                    jOnCreateView = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getItemData();
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.serializer(998558903);
                jOnCreateView = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onCreateView();
                getpostalcode.IconCompatParcelizer(false);
            }
            long j = jOnCreateView;
            if (z) {
                textStyle = (TextStyle) performLayout.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.MediaSessionCompatResultReceiverWrapper();
            } else if (z2) {
                textStyle = (TextStyle) performLayout.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaSessionCompatResultReceiverWrapper();
            } else {
                int i18 = read + 99;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 == 0) {
                    textStyle = (TextStyle) performLayout.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaSessionCompatResultReceiverWrapper();
                    int i19 = 25 / 0;
                } else {
                    textStyle = (TextStyle) performLayout.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaSessionCompatResultReceiverWrapper();
                }
            }
            TextStyle textStyle2 = textStyle;
            Modifier modifierClip = ClipKt.clip(modifier, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addObserverForBackInvokerlambda0));
            boolean z3 = (i2 & 7168) == 2048;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z3) {
                objComponentActivity = new extractJsonLong(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            } else {
                int i20 = IconCompatParcelizer + 1;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new extractJsonLong(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            }
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClickableKt.RemoteActionCompatParcelizer(modifierClip, z2, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 14), jAddOnMultiWindowModeChangedListener, RectangleShapeKt.getRectangleShape());
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
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
            TextKt.m131TextNvy7gAk(str, PaddingKt.read(Modifier.Companion, Dimensions.onCreateSupportNavigateUpTaskStack, Dimensions.getSupportActionBar, Dimensions.onContentChanged, Dimensions.getSupportParentActivityIntent), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle2, getpostalcode, i2 & 14, 0, 131064);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new extractJsonInt(str, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 0);
        }
    }
}
