package com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import o.ActivityPackageSender1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBackgroundModifier;
import o.DrawBehindElement;
import o.DrawStyleSpan_androidKt;
import o.FlingCancellationException;
import o.IActivityPackageSender;
import o.IActivityPackageSenderResponseDataCallbackSubscriber;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.buildMapping;
import o.createFromParcel;
import o.findField;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPostalCode;
import o.getUnspecifiedy9eOQZsannotations;
import o.parseResponse;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;
import o.takeOrElseJpAxnlU;
import o.toAndroidCapBeK7IIE;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TripPlannerItemKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;

    static {
        DrawStyleSpan_androidKt drawStyleSpan_androidKt = DrawStyleSpan_androidKt.CUSTOMER;
        new findField(TagColorToken.NaturalPale);
        drawStyleSpan_androidKt.getClass();
        int i = serializer + 61;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void write(findField findfield, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1978948554);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(findfield) : getpostalcode.IconCompatParcelizer(findfield)) {
                int i7 = RemoteActionCompatParcelizer + 101;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = IconCompatParcelizer + 79;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int i12 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier = Modifier.Companion;
            String str = findfield.text;
            switch (takeOrElseJpAxnlU.write[findfield.color.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    getpostalcode.serializer(2135659501);
                    TagsKt.RemoteActionCompatParcelizer(str, modifier, 0, 0, getpostalcode, i9 & 112, 28);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                default:
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -900947354, false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 7, findfield, modifier);
            int i14 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    public static final void read(toAndroidCapBeK7IIE toandroidcapbek7iie, boolean z, boolean z2, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7;
        int i8 = 2 % 2;
        int i9 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        toandroidcapbek7iie.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1056573934);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i11 = RemoteActionCompatParcelizer + 21;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                zIconCompatParcelizer = getpostalcode.read(toandroidcapbek7iie);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(toandroidcapbek7iie);
            }
            if (zIconCompatParcelizer) {
                int i13 = IconCompatParcelizer + 115;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i15 = IconCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                getpostalcode.write(z);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.write(z)) {
                i6 = 32;
            } else {
                int i16 = IconCompatParcelizer + 39;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i18 = RemoteActionCompatParcelizer + 111;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            if (getpostalcode.read(modifier)) {
                int i20 = RemoteActionCompatParcelizer + 125;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i5 = Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            int i22 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
            if (i22 % 2 != 0) {
                int i23 = 51 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i3 = Fields.Clip;
                } else {
                    i4 = RemoteActionCompatParcelizer + 45;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i24 = 3 / 2;
                    }
                    i3 = 8192;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = Fields.Clip;
            } else {
                i4 = RemoteActionCompatParcelizer + 45;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i25 = 3 / 2;
                }
                i3 = 8192;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f, 0.0f, f, f, 2);
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            Measurer2 measurer2 = (Measurer2) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
            }
            DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                int i26 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                if (i26 % 2 == 0) {
                    getpostalcode.write(CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE));
                    obj.hashCode();
                    throw null;
                }
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z3 = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | z3) || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 5);
                getpostalcode.write(objComponentActivity6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 5);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 5);
                getpostalcode.write(objComponentActivity8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM74paddingqDBjuR0$default, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new getUnspecifiedy9eOQZsannotations(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, toandroidcapbek7iie, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new parseResponse(toandroidcapbek7iie, z, z2, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[PHI: r1 r2
  0x0049: PHI (r1v78 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v80 o.getPostalCode) binds: [B:8:0x0038, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r2v23 o.getAddressCountry) = (r2v2 o.getAddressCountry), (r2v24 o.getAddressCountry) binds: [B:8:0x0038, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003a A[PHI: r1 r2
  0x003a: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v80 o.getPostalCode) binds: [B:8:0x0038, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r2v3 o.getAddressCountry) = (r2v2 o.getAddressCountry), (r2v24 o.getAddressCountry) binds: [B:8:0x0038, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void OrderInfo(String str, String str2, String str3, String str4, findField findfield, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        getPostalCode getpostalcode4;
        boolean z;
        getPostalCode getpostalcode5;
        getNewPassword getnewpassword;
        ?? r15;
        getPostalCode getpostalcode6;
        boolean z2;
        getPostalCode getpostalcode7;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 91;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-763444808);
            getaddresscountry = getpostalcode.read;
            if ((i & 84) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-763444808);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i6 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                i3 |= getpostalcode2.read(str2) ? 32 : 16;
            } else {
                getpostalcode2.read(str2);
                throw null;
            }
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.read(str4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(findfield);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(findfield);
            }
            i3 |= zIconCompatParcelizer ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        int i7 = i3;
        if (getpostalcode2.write(i7 & 1, (i7 & 74899) != 74898)) {
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                getNewPassword getnewpassword2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode2.write(getnewpassword2)).setPresenter();
                TextOverflow.Companion companion3 = TextOverflow.Companion;
                TextKt.m131TextNvy7gAk(str, null, presenter, 0L, null, null, 0L, null, 0L, companion3.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, getpostalcode2, i7 & 14, 24960, 110586);
                if (str2 == null) {
                    getpostalcode2.serializer(1706998224);
                    getpostalcode2.IconCompatParcelizer(false);
                    z = false;
                    getpostalcode5 = getpostalcode2;
                } else {
                    getpostalcode2.serializer(1706998225);
                    getPostalCode getpostalcode8 = getpostalcode2;
                    TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode2.write(getnewpassword2)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, companion3.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.IconCompatParcelizer(), getpostalcode8, (i7 >> 3) & 14, 24960, 110586);
                    getpostalcode4 = getpostalcode8;
                    z = false;
                    getpostalcode4.IconCompatParcelizer(false);
                }
                if (str3 == null) {
                    getpostalcode5 = getpostalcode4;
                    getpostalcode5.serializer(1707270001);
                    getpostalcode5.IconCompatParcelizer(z);
                    getnewpassword = getnewpassword2;
                    getpostalcode6 = getpostalcode5;
                    r15 = z;
                } else {
                    getpostalcode5 = getpostalcode4;
                    getpostalcode5.serializer(1707270002);
                    getnewpassword = getnewpassword2;
                    getPostalCode getpostalcode9 = getpostalcode5;
                    TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode5.write(getnewpassword2)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode9, 0, 0, 131066);
                    getPostalCode getpostalcode10 = getpostalcode9;
                    r15 = 0;
                    getpostalcode10.IconCompatParcelizer(false);
                    getpostalcode6 = getpostalcode10;
                }
                Modifier.Companion companion4 = Modifier.Companion;
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getTop(), getpostalcode6, r15);
                int iHashCode2 = Long.hashCode(getpostalcode6.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode6.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode6, companion4);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode6.ComponentActivity) {
                    getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i8 = IconCompatParcelizer + 89;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        getpostalcode6.serializer(constructor2);
                    } else {
                        getpostalcode6.serializer(constructor2);
                        throw null;
                    }
                }
                int i9 = RemoteActionCompatParcelizer + 65;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode6, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode6, Integer.valueOf(iHashCode2), getpostalcode6));
                if (str4 == null) {
                    getpostalcode6.serializer(-121688960);
                    getpostalcode6.IconCompatParcelizer((boolean) r15);
                    getpostalcode7 = getpostalcode6;
                    z2 = r15;
                } else {
                    getpostalcode6.serializer(-121688959);
                    TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                    long onMenuItemClickListener = ((buildMapping) getpostalcode6.write(getnewpassword)).setOnMenuItemClickListener();
                    float f = Dimensions.getNestedScrollAxes;
                    getPostalCode getpostalcode11 = getpostalcode6;
                    TextKt.m131TextNvy7gAk(str4, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, 0.0f, f, f, 3), onMenuItemClickListener, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode11, (i7 >> 9) & 14, 0, 131064);
                    getPostalCode getpostalcode12 = getpostalcode11;
                    z2 = 0;
                    getpostalcode12.IconCompatParcelizer(false);
                    getpostalcode7 = getpostalcode12;
                }
                int i11 = IconCompatParcelizer + 65;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (findfield == null) {
                    getpostalcode7.serializer(-121376263);
                } else {
                    getpostalcode7.serializer(-121376262);
                    write(findfield, null, getpostalcode7, (i7 >> 12) & 14);
                }
                getpostalcode7.IconCompatParcelizer(z2);
                getpostalcode7.IconCompatParcelizer(true);
                getpostalcode7.IconCompatParcelizer(true);
                getpostalcode3 = getpostalcode7;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getPostalCode getpostalcode13 = getpostalcode2;
            getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode3 = getpostalcode13;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) str, (Object) str2, (Object) str3, (Object) str4, (Object) findfield, modifier, i, 4);
        }
    }
}
