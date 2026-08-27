package com.roadrunner.rider.recruitment.passverification.presentation;

import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.MatrixKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.SweepGradientShader9KIMszo;
import o.buildMapping;
import o.dc;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCallbackParameters;
import o.getCreditCardExpirationMonth;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk;
import o.setCurrentSemanticsNodesui;
import o.trigger;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VerifyScreenKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void read(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1418829216);
        if ((i & 6) == 0) {
            int i6 = serializer + 89;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = RemoteActionCompatParcelizer + 31;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = 16;
            } else {
                int i10 = serializer + 37;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i12 = i2 | 3072;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            modifier = Modifier.Companion;
            VerifyContent(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, getpostalcode, i12 & 8190);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getCallbackParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[PHI: r11
  0x0039: PHI (r11v6 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v7 o.getPostalCode) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r11
  0x0025: PHI (r11v2 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v7 o.getPostalCode) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 105;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1196485595);
            if ((i & 112) == 0) {
                int i6 = serializer + 43;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1196485595);
            if ((i & 6) == 0) {
                int i8 = serializer + 43;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (getpostalcode.read(str)) {
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
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        boolean z = false;
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            int i10 = serializer + 27;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int iM776toArgb8_81llA = ColorKt.m776toArgb8_81llA(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter());
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            boolean z2 = getpostalcode.read(iM776toArgb8_81llA);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SweepGradientShader9KIMszo(iM776toArgb8_81llA, 7);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((i3 & 14) == 4) {
                int i12 = serializer + 55;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    z = true;
                }
            }
            boolean z3 = getpostalcode.read(iM776toArgb8_81llA);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z3 | z) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new MatrixKt(str, iM776toArgb8_81llA, 1);
                getpostalcode.write(objComponentActivity2);
                int i13 = RemoteActionCompatParcelizer + 49;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 17);
            int i15 = RemoteActionCompatParcelizer + 95;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
    }

    public static final void RemoteActionCompatParcelizer(final String str, final String str2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1619983784);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i6 = serializer + 3;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 32;
            } else {
                int i8 = serializer + 75;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.SpotShadowColor : 256;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i10 = RemoteActionCompatParcelizer + 117;
                serializer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 != 0 ? 8084 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
            int i11 = RemoteActionCompatParcelizer + 107;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 2 / 3;
            }
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            final int iM776toArgb8_81llA = ColorKt.m776toArgb8_81llA(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter());
            final int iM776toArgb8_81llA2 = ColorKt.m776toArgb8_81llA(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled());
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            boolean z2 = getpostalcode.read(iM776toArgb8_81llA);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SweepGradientShader9KIMszo(iM776toArgb8_81llA, 8);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((i2 & 14) == 4) {
                int i13 = RemoteActionCompatParcelizer + 109;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z3 = getpostalcode.read(iM776toArgb8_81llA);
            boolean z4 = (i2 & 112) == 32;
            boolean z5 = getpostalcode.read(iM776toArgb8_81llA2);
            boolean z6 = (i2 & 896) == 256;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!(!(z | z3 | z4 | z5 | z6)) || objComponentActivity2 == androidContentCaptureManager) {
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getClientSdk
                    private static int MediaMetadataCompat = 1;
                    private static int RatingCompat;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i15 = 2 % 2;
                        TextView textView = (TextView) obj;
                        textView.getClass();
                        String str3 = str;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                        spannableStringBuilder.setSpan(new BulletSpan(16, iM776toArgb8_81llA), 0, spannableStringBuilder.length(), 33);
                        String str4 = str2;
                        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str3, str4, 0, false, 6);
                        if (iWrite >= 0) {
                            int length = str4.length() + iWrite;
                            int i16 = iM776toArgb8_81llA2;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i16), iWrite, length, 33);
                            spannableStringBuilder.setSpan(new getExtendedString(i16, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), iWrite, length, 33);
                            int i17 = MediaMetadataCompat + 39;
                            RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i17 % 2 != 0) {
                                int i18 = 3 / 5;
                            }
                        }
                        textView.setText(spannableStringBuilder);
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                objComponentActivity2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
            }
            AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054 A[PHI: r2 r6
  0x0054: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r6v18 o.getAddressCountry) = (r6v2 o.getAddressCountry), (r6v19 o.getAddressCountry) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r2 r6
  0x0040: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r6v3 o.getAddressCountry) = (r6v2 o.getAddressCountry), (r6v19 o.getAddressCountry) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void VerifyContent(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 69;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(303087807);
            getaddresscountry = getpostalcode.read;
            if ((i & 76) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i8 = serializer + 13;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(303087807);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i10 = serializer + 13;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
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
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i12 = RemoteActionCompatParcelizer + 113;
                serializer = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 != 0 ? 29 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i13 = RemoteActionCompatParcelizer + 79;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i15 = RemoteActionCompatParcelizer + 81;
            serializer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                i3 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        int i16 = i3;
        if (getpostalcode.write(i16 & 1, (i16 & 1171) != 1170)) {
            int i17 = serializer + 67;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), BuildersKt.write(getpostalcode), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, ExtrasKt.write(245684244, new trigger(15, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 196608, 479);
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(1.0f, true, companion3), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
                float f = Dimensions.getAnimatedVisibility;
                Modifier modifierWrite = PaddingKt.write(modifierIconCompatParcelizer, f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.login_verify_account_title, getpostalcode, 0), null, BuildersKt.serializer(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode, 0, 0, 131066);
                float f2 = Dimensions.setTabContainer;
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.login_verify_account_subtitle, getpostalcode, 0), PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131064);
                getCurrentSessionimpl.read(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), RoundedCornerShapeKt.IconCompatParcelizer(Dp.m3673constructorimpl(12.0f)), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer(), getpostalcode, 0), null, null, ExtrasKt.write(807566621, new DefaultLazyKey(21, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), getpostalcode), getpostalcode, 196608, 24);
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.login_verify_account_privacy_text_1, getpostalcode, 0), PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 131064);
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.login_verify_account_privacy_text_2, getpostalcode, 0), PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 131064);
                IconCompatParcelizer.IconCompatParcelizer(companion3, f, getpostalcode, true);
                PrimaryKt.write(StringResources_androidKt.stringResource(R.string.login_verify_account_button, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, PaddingKt.write(SizeKt.write(companion3, 1.0f), f), false, false, null, null, null, null, null, getpostalcode, i16 & 112, 0, 2040);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getCallbackParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 1);
        }
    }
}
