package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.MessageBoxTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.ButtonUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose.ShelfNumberChipKt;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannerOverlayKt;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidUiMode;
import o.ComposeAnimationState;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SourceContext;
import o.TextFieldDefaults;
import o.UiToolingDataApi;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDp;
import o.getHandleruiannotations;
import o.getLocations;
import o.getPackageHash;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getSourceFile;
import o.invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0;
import o.mapTreeWithStitching;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resumeSendingI;
import o.setCarryoverInAppMessage;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScannerOverlayKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r2
  0x0055: PHI (r2v49 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v51 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r2
  0x002e: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v51 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(final invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        mapTreeWithStitching maptreewithstitching;
        String str;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 67;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-50440554);
            if ((i & 40) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
                    int i6 = write + 121;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
                if (zIconCompatParcelizer) {
                    int i8 = RemoteActionCompatParcelizer + 79;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
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
            getpostalcode.MediaSessionCompatQueueItem(-50440554);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0);
                    int i10 = write + 121;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
                if (zIconCompatParcelizer) {
                    int i12 = RemoteActionCompatParcelizer + 79;
                    write = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
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
            i3 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        final int i14 = 0;
        final int i15 = 1;
        if (getpostalcode2.write(i3 & 1, (i3 & 19) != 18)) {
            String strWrite = null;
            if (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof AndroidUiMode) {
                maptreewithstitching = null;
            } else if (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getPackageHash) {
                maptreewithstitching = ((getPackageHash) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).message;
            } else if (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof UiToolingDataApi) {
                maptreewithstitching = ((UiToolingDataApi) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).message;
            } else if (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof SourceContext) {
                int i16 = write + 73;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                maptreewithstitching = ((SourceContext) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).message;
            } else if (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getLocations) {
                maptreewithstitching = ((getLocations) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).message;
            } else {
                if (!(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getSourceFile)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                int i18 = write + 87;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                maptreewithstitching = null;
            }
            if (maptreewithstitching == null) {
                int i20 = write + 71;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getCenterEaSLcWc
                        private static int RatingCompat = 1;
                        private static int RemoteActionCompatParcelizer;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = 2 % 2;
                            int i23 = RatingCompat + 75;
                            RemoteActionCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i23 % 2 != 0) {
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                ((Integer) obj2).getClass();
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            int i24 = i14;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            int i25 = i;
                            androidx.compose.ui.Modifier modifier2 = modifier;
                            invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i24 != 0) {
                                ScannerOverlayKt.write(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i25 | 1));
                                return createfromparcel2;
                            }
                            ScannerOverlayKt.write(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i25 | 1));
                            int i26 = RemoteActionCompatParcelizer + 59;
                            RatingCompat = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            return createfromparcel2;
                        }
                    };
                    return;
                }
                return;
            }
            String str2 = maptreewithstitching.body;
            if (!(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof SourceContext)) {
                if (!(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof UiToolingDataApi)) {
                    int i22 = write + 55;
                    RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    str = str2;
                } else if (str2 != null) {
                    strWrite = setCarryoverInAppMessage.write(str2, "%s", ((UiToolingDataApi) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).scannedCode);
                }
                MessageBoxTypeToken messageBoxTypeToken = maptreewithstitching.type;
                Integer num = maptreewithstitching.icon;
                String str3 = maptreewithstitching.title;
                modifier.getClass();
                MessageBoxTypeTokenMapperKt.read(messageBoxTypeToken, modifier, num, str3, str, null, null, null, getpostalcode2, 0, Constant.ERROR_WSS_INVALID);
            } else if (str2 != null) {
                int i24 = write + 65;
                RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                strWrite = setCarryoverInAppMessage.write(str2, "%s", ((SourceContext) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0).scannedCode);
            }
            str = strWrite;
            MessageBoxTypeToken messageBoxTypeToken2 = maptreewithstitching.type;
            Integer num2 = maptreewithstitching.icon;
            String str4 = maptreewithstitching.title;
            modifier.getClass();
            MessageBoxTypeTokenMapperKt.read(messageBoxTypeToken2, modifier, num2, str4, str, null, null, null, getpostalcode2, 0, Constant.ERROR_WSS_INVALID);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getCenterEaSLcWc
                private static int RatingCompat = 1;
                private static int RemoteActionCompatParcelizer;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i26 = 2 % 2;
                    int i27 = RatingCompat + 75;
                    RemoteActionCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i27 % 2 != 0) {
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        ((Integer) obj2).getClass();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    int i28 = i15;
                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                    int i29 = i;
                    androidx.compose.ui.Modifier modifier2 = modifier;
                    invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1 = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i28 != 0) {
                        ScannerOverlayKt.write(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i29 | 1));
                        return createfromparcel2;
                    }
                    ScannerOverlayKt.write(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda1, modifier2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i29 | 1));
                    int i210 = RemoteActionCompatParcelizer + 59;
                    RatingCompat = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    return createfromparcel2;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0166  */
    /* JADX WARN: Code duplicated, block: B:134:0x0261  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x02af  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e4  */
    public static final void ShelfCodesRow(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8 r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8, ComposeAnimationState composeAnimationState, ScrollState scrollState, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        boolean z3;
        boolean z4;
        AndroidContentCaptureManager androidContentCaptureManager;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        boolean z5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i3;
        boolean z6;
        Object objComponentActivity;
        int i4;
        int i5;
        boolean zIconCompatParcelizer;
        int i6 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1945349425);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        Object obj = null;
        if ((i & 6) == 0) {
            int i7 = write + 69;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i2 = (getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i;
            } else {
                getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i & Fields.RotationY) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(composeAnimationState);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(composeAnimationState);
            }
            i2 |= zIconCompatParcelizer ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(scrollState) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i8 = RemoteActionCompatParcelizer + 103;
                write = i8 % Fields.SpotShadowColor;
                i5 = i8 % 2 == 0 ? 1579 : Fields.Clip;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.read(str)) {
                int i9 = RemoteActionCompatParcelizer + 109;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            int i11 = RemoteActionCompatParcelizer + 71;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 8388608 : 4194304;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                obj.hashCode();
                throw null;
            }
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 67108864 : 33554432;
        }
        int i12 = i2;
        if (getpostalcode2.write(i12 & 1, (i12 & 38347923) != 38347922)) {
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity2 == androidContentCaptureManager2) {
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager2) {
                int i13 = RemoteActionCompatParcelizer + 111;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8);
                    getpostalcode2.write(objComponentActivity3);
                } else {
                    getpostalcode2.write(CompositionKt.RemoteActionCompatParcelizer(r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8));
                    obj.hashCode();
                    throw null;
                }
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate10 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            if ((i12 & 458752) == 131072) {
                int i14 = RemoteActionCompatParcelizer + 49;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((i12 & 112) == 32) {
                int i15 = write;
                int i16 = i15 + 27;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                int i18 = i15 + 49;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if ((z2 || z) || objComponentActivity4 == androidContentCaptureManager2) {
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate9;
                z3 = false;
                getpostalcode = getpostalcode2;
                ReconnectScheduler$schedule$1 reconnectScheduler$schedule$1 = new ReconnectScheduler$schedule$1(str, r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8, populateViewStructure_androidKtpopulate10, null, 5);
                getpostalcode.write(reconnectScheduler$schedule$1);
                objComponentActivity4 = reconnectScheduler$schedule$1;
            } else {
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate9;
                getpostalcode = getpostalcode2;
                z3 = false;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, str, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            float f = Dimensions.setMenu;
            Alignment.Companion companion = Alignment.Companion;
            snapElevation snapelevationSerializer = Arrangement.serializer(f, companion.getCenterHorizontally());
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(PagerWrapperFlingBehavior.serializer(SizeKt.write(modifier, 1.0f), scrollState, true, z3), Dimensions.getNestedScrollAxes, 0.0f, 2);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationSerializer, companion.getTop(), getpostalcode, z3 ? 1 : 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(916463328);
                for (Iterator it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator(); it.hasNext(); it = it) {
                    String str2 = (String) it.next();
                    if (!((r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8) populateViewStructure_androidKtpopulate10.getValue()).contains(str2)) {
                        getpostalcode.serializer(1024783354);
                        Modifier.Companion companion3 = Modifier.Companion;
                        boolean z7 = (i12 & 29360128) == 8388608 ? true : z3;
                        boolean z8 = getpostalcode.read(str2);
                        if ((i12 & 234881024) == 67108864) {
                            int i20 = write + 45;
                            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                            if (i20 % 2 != 0) {
                                z5 = z3;
                            } else {
                                z5 = true;
                            }
                        } else {
                            z5 = z3;
                        }
                        Object objComponentActivity5 = getpostalcode.ComponentActivity();
                        if ((!(z8 ? 1 : 0) && !z7) && !z5) {
                            androidContentCaptureManager = androidContentCaptureManager2;
                            if (objComponentActivity5 == androidContentCaptureManager) {
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), z3);
                            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnGloballyPositioned);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                            constructor = companion4.getConstructor();
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (!getpostalcode.ComponentActivity) {
                                i3 = RemoteActionCompatParcelizer + 29;
                                write = i3 % Fields.SpotShadowColor;
                                if (i3 % 2 == 0) {
                                    getpostalcode.serializer(constructor);
                                    int i21 = 64 / 0;
                                } else {
                                    getpostalcode.serializer(constructor);
                                }
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            af$$ExternalSyntheticOutline0.m(companion4, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                            z6 = getpostalcode.read(str2);
                            objComponentActivity = getpostalcode.ComponentActivity();
                            if (!z6 || objComponentActivity == androidContentCaptureManager) {
                                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(str2, 13, populateViewStructure_androidKtpopulate8);
                                getpostalcode.write(objComponentActivity);
                            } else {
                                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                            }
                            ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str2, false, null, 0.0f, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48, 12);
                            getpostalcode.IconCompatParcelizer(true);
                            z4 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            androidContentCaptureManager = androidContentCaptureManager2;
                        }
                        objComponentActivity5 = new NestScreenKt$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, str2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, 2);
                        getpostalcode.write(objComponentActivity5);
                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5);
                        MeasurePolicy measurePolicy2 = BoxKt.read(Alignment.Companion.getTopStart(), z3);
                        int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnGloballyPositioned2);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                        constructor = companion5.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (!getpostalcode.ComponentActivity) {
                            i3 = RemoteActionCompatParcelizer + 29;
                            write = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                getpostalcode.serializer(constructor);
                                int i22 = 64 / 0;
                            } else {
                                getpostalcode.serializer(constructor);
                            }
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        af$$ExternalSyntheticOutline0.m(companion5, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                        z6 = getpostalcode.read(str2);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z6) {
                            populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(str2, 13, populateViewStructure_androidKtpopulate8);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(str2, 13, populateViewStructure_androidKtpopulate8);
                            getpostalcode.write(objComponentActivity);
                        }
                        ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str2, false, null, 0.0f, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48, 12);
                        getpostalcode.IconCompatParcelizer(true);
                        z4 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        z4 = z3;
                        androidContentCaptureManager = androidContentCaptureManager2;
                        populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                        getpostalcode.serializer(1025408965);
                        getpostalcode.IconCompatParcelizer(z4);
                    }
                    z3 = z4;
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                }
                boolean z9 = z3;
                AndroidContentCaptureManager androidContentCaptureManager3 = androidContentCaptureManager2;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate11 = populateViewStructure_androidKtpopulate7;
                getpostalcode.IconCompatParcelizer(z9);
                getpostalcode.IconCompatParcelizer(true);
                String str3 = (String) populateViewStructure_androidKtpopulate11.getValue();
                if (str3 == null) {
                    getpostalcode.serializer(1912801618);
                    getpostalcode.IconCompatParcelizer(z9);
                } else {
                    getpostalcode.serializer(1912801619);
                    boolean z10 = (i12 & 3670016) == 1048576;
                    Object objComponentActivity6 = getpostalcode.ComponentActivity();
                    if (z10 || objComponentActivity6 == androidContentCaptureManager3) {
                        objComponentActivity6 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate11, 2);
                        getpostalcode.write(objComponentActivity6);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
                    ButtonUiItem$Companion buttonUiItem$Companion = ComposeAnimationState.Companion;
                    getDp.RemoteActionCompatParcelizer(str3, composeAnimationState, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, null, getpostalcode, ((i12 >> 3) & 112) | 64);
                    getpostalcode.IconCompatParcelizer(false);
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8, composeAnimationState, scrollState, modifier, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void read(final o.SlotTreeKtExternalSyntheticLambda0 r36, final o.r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8 r37, final boolean r38, final boolean r39, final o.getEllipsisgIe3tQ8 r40, final o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r41, androidx.compose.ui.Modifier r42, final java.lang.Integer r43, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r44, final o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r45, o.getBirthDateFull r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannerOverlayKt.read(o.SlotTreeKtExternalSyntheticLambda0, o.r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8, boolean, boolean, o.getEllipsisgIe3tQ8, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, androidx.compose.ui.Modifier, java.lang.Integer, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, o.getBirthDateFull, int, int):void");
    }
}
