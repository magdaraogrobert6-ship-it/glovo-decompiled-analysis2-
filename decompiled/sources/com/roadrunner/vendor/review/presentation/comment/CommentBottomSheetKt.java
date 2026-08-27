package com.roadrunner.vendor.review.presentation.comment;

import android.content.Context;
import android.widget.EditText;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.google.android.material.textfield.TextInputLayout;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SweepGradientShader9KIMszo;
import o.UtilNetworking;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CommentBottomSheetKt {
    private static int IconCompatParcelizer = 0;
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(180.0f);
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 109;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    public static final void CommentBottomSheet(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1124410973);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i6 = read + 11;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                int i8 = serializer + 57;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 5;
                }
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = Fields.CameraDistance;
            } else {
                int i10 = read + 51;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 4 % 3;
                }
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.Clip : 8192;
        }
        int i12 = i2 | 196608;
        if ((i12 & 74899) != 74898) {
            int i13 = read + 85;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i12 & 1, z2)) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.serializer(null, StringResources_androidKt.stringResource(R.string.vendor_review_add_comment_title, getpostalcode, 0), 0L, ExtrasKt.write(-1881947003, new trigger(22, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), ExtrasKt.write(1577750844, new DefaultLazyKey(26, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), null, null, getpostalcode, 221184, Constant.ERROR_ACC_GRAVITY_INVALID);
            int iMo48toPx0680j_4 = (int) ((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(RemoteActionCompatParcelizer);
            Modifier modifierWrite = PaddingKt.write(companion, Dimensions.setHideOnContentScrollEnabled);
            String strStringResource = StringResources_androidKt.stringResource(R.string.vendor_review_add_comment_placeholder, getpostalcode, 0);
            boolean z3 = getpostalcode.read(iMo48toPx0680j_4);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3) {
                objComponentActivity = new SweepGradientShader9KIMszo(iMo48toPx0680j_4, 11);
                getpostalcode.write(objComponentActivity);
            } else {
                int i15 = read + 39;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 30 / 0;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new SweepGradientShader9KIMszo(iMo48toPx0680j_4, 11);
                        getpostalcode.write(objComponentActivity);
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new SweepGradientShader9KIMszo(iMo48toPx0680j_4, 11);
                    getpostalcode.write(objComponentActivity);
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            boolean z4 = (i12 & 57344) == 16384;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.logCustomEvent
                    private static int RemoteActionCompatParcelizer = 1;
                    private static int write;

                    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[PHI: r1
  0x0030: PHI (r1v6 android.widget.EditText) = (r1v5 android.widget.EditText), (r1v7 android.widget.EditText) binds: [B:10:0x002e, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        EditText editText;
                        int i17 = 2 % 2;
                        TextInputLayout textInputLayout = (TextInputLayout) obj;
                        textInputLayout.getClass();
                        if (z) {
                            int i18 = write + 113;
                            RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i18 % 2 == 0) {
                                textInputLayout.requestFocus();
                                editText = textInputLayout.getEditText();
                                int i19 = 73 / 0;
                                if (editText != null) {
                                    int i20 = RemoteActionCompatParcelizer + 49;
                                    write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                    Context context = textInputLayout.getContext();
                                    context.getClass();
                                    Object systemService = context.getSystemService("input_method");
                                    systemService.getClass();
                                    ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 1);
                                }
                            } else {
                                textInputLayout.requestFocus();
                                editText = textInputLayout.getEditText();
                                if (editText != null) {
                                    int i22 = RemoteActionCompatParcelizer + 49;
                                    write = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i23 = i22 % 2;
                                    Context context2 = textInputLayout.getContext();
                                    context2.getClass();
                                    Object systemService2 = context2.getSystemService("input_method");
                                    systemService2.getClass();
                                    ((android.view.inputmethod.InputMethodManager) systemService2).showSoftInput(editText, 1);
                                }
                            }
                        } else {
                            textInputLayout.clearFocus();
                            EditText editText2 = textInputLayout.getEditText();
                            if (editText2 != null) {
                                Context context3 = textInputLayout.getContext();
                                context3.getClass();
                                Object systemService3 = context3.getSystemService("input_method");
                                systemService3.getClass();
                                ((android.view.inputmethod.InputMethodManager) systemService3).hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                            }
                        }
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            UtilNetworking.write(str, strStringResource, modifierWrite, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i12 & 14) | ((i12 << 15) & 29360128));
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z, modifier2, i);
        }
    }
}
