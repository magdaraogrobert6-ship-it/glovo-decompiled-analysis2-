package com.roadrunner.heatmap.presentation.description;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.heatmap.presentation.info.HeatmapInformationDialogKt;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import java.util.Collections;
import java.util.Map;
import o.AndroidContentCaptureManager;
import o.buildMapping;
import o.getBirthDateFull;
import o.getBottomFadingEdgeStrength;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getScrollFeedbackProvider;
import o.isAdapterPositionOnScreen;
import o.p2;
import o.p4;
import o.pa;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.readDataOrHandleCorruption;
import o.registerInAppMessageManagerlambda0;
import o.updateData;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HeatmapDescriptionKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r0 r2
  0x0043: PHI (r0v39 o.isAdapterPositionOnScreen) = (r0v4 o.isAdapterPositionOnScreen), (r0v40 o.isAdapterPositionOnScreen) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r2v14 o.getPostalCode) = (r2v1 o.getPostalCode), (r2v16 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[PHI: r0 r1
  0x0077: PHI (r0v20 androidx.compose.ui.Modifier) = (r0v18 androidx.compose.ui.Modifier), (r0v37 androidx.compose.ui.Modifier) binds: [B:28:0x008e, B:24:0x0075] A[DONT_GENERATE, DONT_INLINE]
  0x0077: PHI (r1v20 o.getScrollFeedbackProvider) = (r1v18 o.getScrollFeedbackProvider), (r1v35 o.getScrollFeedbackProvider) binds: [B:28:0x008e, B:24:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[PHI: r0
  0x007a: PHI (r0v19 androidx.compose.ui.Modifier) = (r0v18 androidx.compose.ui.Modifier), (r0v37 androidx.compose.ui.Modifier) binds: [B:28:0x008e, B:24:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r0 r2
  0x0036: PHI (r0v5 o.isAdapterPositionOnScreen) = (r0v4 o.isAdapterPositionOnScreen), (r0v40 o.isAdapterPositionOnScreen) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r2v2 o.getPostalCode) = (r2v1 o.getPostalCode), (r2v16 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void HeatmapDescription(updateData updatedata, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        isAdapterPositionOnScreen isadapterpositiononscreen;
        getPostalCode getpostalcode;
        int i2;
        int i3;
        isAdapterPositionOnScreen isadapterpositiononscreen2;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        getScrollFeedbackProvider getscrollfeedbackprovider;
        readDataOrHandleCorruption readdataorhandlecorruption;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity2;
        Object obj;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 73;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            updatedata.getClass();
            isadapterpositiononscreen = updatedata.serializer;
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1321795179);
            if ((i & 80) == 0) {
                if (getpostalcode.IconCompatParcelizer(updatedata)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                isadapterpositiononscreen2 = isadapterpositiononscreen;
                getpostalcode2 = getpostalcode;
            } else {
                isadapterpositiononscreen2 = isadapterpositiononscreen;
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            updatedata.getClass();
            isadapterpositiononscreen = updatedata.serializer;
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1321795179);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(updatedata)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                isadapterpositiononscreen2 = isadapterpositiononscreen;
                getpostalcode2 = getpostalcode;
            } else {
                isadapterpositiononscreen2 = isadapterpositiononscreen;
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        int i7 = i3 | 48;
        if (getpostalcode2.write(i7 & 1, (i7 & 19) != 18)) {
            int i8 = serializer + 13;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                modifier2 = Modifier.Companion;
                getscrollfeedbackprovider = (getScrollFeedbackProvider) ExtrasKt.write(updatedata.RatingCompat, getpostalcode2, 0).getValue();
                if (getscrollfeedbackprovider instanceof getBottomFadingEdgeStrength) {
                    Modifier modifier3 = modifier2;
                    getpostalcode2.serializer(-1339791696);
                    getBottomFadingEdgeStrength getbottomfadingedgestrength = (getBottomFadingEdgeStrength) getscrollfeedbackprovider;
                    String str = getbottomfadingedgestrength.RemoteActionCompatParcelizer;
                    String str2 = getbottomfadingedgestrength.read;
                    boolean z = getbottomfadingedgestrength.IconCompatParcelizer;
                    readdataorhandlecorruption = (readDataOrHandleCorruption) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(readdataorhandlecorruption);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new NestScreenKt$NestScreen$1$1(0, readdataorhandlecorruption, readDataOrHandleCorruption.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 26);
                        getpostalcode2.write(objComponentActivity);
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(updatedata);
                    objComponentActivity2 = getpostalcode2.ComponentActivity();
                    obj = null;
                    if (!zIconCompatParcelizer2) {
                        i4 = serializer + 111;
                        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, updatedata, updateData.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 27);
                            getpostalcode2.write(nestScreenKt$NestScreen$1$1);
                            objComponentActivity2 = nestScreenKt$NestScreen$1$1;
                        }
                    } else {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, updatedata, updateData.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 27);
                        getpostalcode2.write(nestScreenKt$NestScreen$1$2);
                        objComponentActivity2 = nestScreenKt$NestScreen$1$2;
                    }
                    getpostalcode3 = getpostalcode2;
                    TextWithIcon((i7 << 12) & 458752, getpostalcode2, modifier3, str, str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), z);
                    HeatmapInformationDialogKt.HeatmapInformationDialog((readDataOrHandleCorruption) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper(), 0, getpostalcode3, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                    int i9 = serializer + 77;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    modifier2 = modifier3;
                } else {
                    getpostalcode3 = getpostalcode2;
                    getpostalcode3.serializer(-1339333299);
                    getpostalcode3.IconCompatParcelizer(false);
                }
            } else {
                modifier2 = Modifier.Companion;
                getscrollfeedbackprovider = (getScrollFeedbackProvider) ExtrasKt.write(updatedata.RatingCompat, getpostalcode2, 0).getValue();
                if (getscrollfeedbackprovider instanceof getBottomFadingEdgeStrength) {
                    Modifier modifier4 = modifier2;
                    getpostalcode2.serializer(-1339791696);
                    getBottomFadingEdgeStrength getbottomfadingedgestrength2 = (getBottomFadingEdgeStrength) getscrollfeedbackprovider;
                    String str3 = getbottomfadingedgestrength2.RemoteActionCompatParcelizer;
                    String str4 = getbottomfadingedgestrength2.read;
                    boolean z2 = getbottomfadingedgestrength2.IconCompatParcelizer;
                    readdataorhandlecorruption = (readDataOrHandleCorruption) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(readdataorhandlecorruption);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!zIconCompatParcelizer) {
                        objComponentActivity = new NestScreenKt$NestScreen$1$1(0, readdataorhandlecorruption, readDataOrHandleCorruption.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 26);
                        getpostalcode2.write(objComponentActivity);
                    } else {
                        objComponentActivity = new NestScreenKt$NestScreen$1$1(0, readdataorhandlecorruption, readDataOrHandleCorruption.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 26);
                        getpostalcode2.write(objComponentActivity);
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(updatedata);
                    objComponentActivity2 = getpostalcode2.ComponentActivity();
                    obj = null;
                    if (!zIconCompatParcelizer2) {
                        i4 = serializer + 111;
                        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$3 = new NestScreenKt$NestScreen$1$1(0, updatedata, updateData.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 27);
                            getpostalcode2.write(nestScreenKt$NestScreen$1$3);
                            objComponentActivity2 = nestScreenKt$NestScreen$1$3;
                        }
                    } else {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$4 = new NestScreenKt$NestScreen$1$1(0, updatedata, updateData.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 27);
                        getpostalcode2.write(nestScreenKt$NestScreen$1$4);
                        objComponentActivity2 = nestScreenKt$NestScreen$1$4;
                    }
                    getpostalcode3 = getpostalcode2;
                    TextWithIcon((i7 << 12) & 458752, getpostalcode2, modifier4, str3, str4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), z2);
                    HeatmapInformationDialogKt.HeatmapInformationDialog((readDataOrHandleCorruption) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper(), 0, getpostalcode3, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                    int i11 = serializer + 77;
                    RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    modifier2 = modifier4;
                } else {
                    getpostalcode3 = getpostalcode2;
                    getpostalcode3.serializer(-1339333299);
                    getpostalcode3.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 6, updatedata, modifier2);
            int i13 = RemoteActionCompatParcelizer + 35;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public static final void TextWithIcon(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-78687490);
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 119;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 54 / 0;
                if (getpostalcode.read(str)) {
                    i6 = 4;
                } else {
                    i6 = 2;
                }
            } else if (getpostalcode.read(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 113;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.write(z)) {
                int i12 = RemoteActionCompatParcelizer + 117;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = serializer + 115;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i16 = RemoteActionCompatParcelizer + 115;
                serializer = i16 % Fields.SpotShadowColor;
                i3 = i16 % 2 == 0 ? 11881 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i2) != 74898) {
            int i17 = RemoteActionCompatParcelizer + 21;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i2 & 1, z2)) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str.concat(" "));
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "infoIcon", "�");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), ExtrasKt.write(664648501, new p4(str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2), getpostalcode));
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier, 0.0f, Dimensions.setPrimaryBackground, 1);
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long actionBarHideOffset = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getActionBarHideOffset();
            Map mapSingletonMap = Collections.singletonMap("infoIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            TextKt.m132TextZ58ophY(annotatedString, modifierM73paddingVpY3zN4$default, actionBarHideOffset, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 196600);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new pa(str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 2);
        }
    }
}
