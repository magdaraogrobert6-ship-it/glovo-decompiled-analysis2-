package com.roadrunner.freelancing.presentation.goandstartinfo;

import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import o.AndroidContentCaptureManager;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPostalCode;
import o.makeBigContentView;
import o.makeContentView;
import o.makeHeadsUpContentView;
import o.p2;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GoAndStartInformationDialogKt {
    private static int read = 0;
    private static int write = 1;

    public static final void write(makeContentView makecontentview, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(70471648);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(makecontentview) : getpostalcode2.IconCompatParcelizer(makecontentview) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i5 = write + 123;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i6 = read + 7;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                i3 = Fields.Clip;
            } else {
                int i7 = read + 69;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            int i9 = write + 107;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode2.write(i2 & 1, (74899 & i2) != 74898)) {
            int i11 = i2 >> 9;
            getpostalcode = getpostalcode2;
            MessagePopUpKt.serializer(makecontentview.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, false, ExtrasKt.write(79567110, new PagerDefaults$$ExternalSyntheticLambda0(makecontentview, 14, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode2), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode2, (i11 & 112) | 24576 | (i11 & 896) | (458752 & (i2 << 9)) | ((i2 << 12) & 29360128), 328);
            int i12 = read + 77;
            write = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 3 % 3;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) makecontentview, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    public static final void GoAndStartInformationDialog(GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3 = 2 % 2;
        goAndStartInformationUiModelImpl.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-121056369);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(goAndStartInformationUiModelImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (getpostalcode.write(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            makeBigContentView makebigcontentview = (makeBigContentView) ExtrasKt.write(goAndStartInformationUiModelImpl.RatingCompat, getpostalcode, 0).getValue();
            if (makebigcontentview instanceof makeContentView) {
                getpostalcode.serializer(1382465598);
                makeContentView makecontentview = (makeContentView) makebigcontentview;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(goAndStartInformationUiModelImpl);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!(!zIconCompatParcelizer) || objComponentActivity == androidContentCaptureManager) {
                    NestFragment.AnonymousClass1 anonymousClass1 = new NestFragment.AnonymousClass1(1, goAndStartInformationUiModelImpl, GoAndStartInformationUiModelImpl.class, "onDontShowAgainChanged", "onDontShowAgainChanged(Z)V", 0, 9);
                    getpostalcode.write(anonymousClass1);
                    objComponentActivity = anonymousClass1;
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(goAndStartInformationUiModelImpl);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer2)) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, goAndStartInformationUiModelImpl, GoAndStartInformationUiModelImpl.class, "onProceed", "onProceed()V", 0, 15);
                    getpostalcode.write(nestScreenKt$NestScreen$1$1);
                    objComponentActivity2 = nestScreenKt$NestScreen$1$1;
                } else {
                    int i5 = write + 3;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, goAndStartInformationUiModelImpl, GoAndStartInformationUiModelImpl.class, "onProceed", "onProceed()V", 0, 15);
                        getpostalcode.write(nestScreenKt$NestScreen$1$2);
                        objComponentActivity2 = nestScreenKt$NestScreen$1$2;
                    }
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(goAndStartInformationUiModelImpl);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$3 = new NestScreenKt$NestScreen$1$1(0, goAndStartInformationUiModelImpl, GoAndStartInformationUiModelImpl.class, "onGoBack", "onGoBack()V", 0, 16);
                    getpostalcode.write(nestScreenKt$NestScreen$1$3);
                    objComponentActivity3 = nestScreenKt$NestScreen$1$3;
                } else {
                    int i7 = read + 113;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$4 = new NestScreenKt$NestScreen$1$1(0, goAndStartInformationUiModelImpl, GoAndStartInformationUiModelImpl.class, "onGoBack", "onGoBack()V", 0, 16);
                        getpostalcode.write(nestScreenKt$NestScreen$1$4);
                        objComponentActivity3 = nestScreenKt$NestScreen$1$4;
                    }
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity3;
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(goAndStartInformationUiModelImpl);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$5 = new NestScreenKt$NestScreen$1$1(0, goAndStartInformationUiModelImpl, GoAndStartInformationUiModelImpl.class, "onHideDialog", "onHideDialog()V", 0, 17);
                    getpostalcode.write(nestScreenKt$NestScreen$1$5);
                    objComponentActivity4 = nestScreenKt$NestScreen$1$5;
                }
                write(makecontentview, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, (i4 << 12) & 458752);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{makebigcontentview, makeHeadsUpContentView.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -371049365, false);
                }
                int i8 = read + 109;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode.serializer(-371035917);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(-371035917);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 4, goAndStartInformationUiModelImpl, modifier2);
            int i9 = read + 71;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 2 / 5;
            }
        }
    }
}
