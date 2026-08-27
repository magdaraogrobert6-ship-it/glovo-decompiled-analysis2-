package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose;

import android.content.Context;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.TagOverlayKt$$ExternalSyntheticLambda3;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.ImageLoadingKt;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Locale;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.AsyncTaskExecutor11;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ForgottenCoroutineScopeException;
import o.PathEffect;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RunnableWrapper;
import o.ShaderKt;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TextFieldDefaults;
import o.accessgetMediumcp;
import o.accessparse;
import o.addEditCommandWithBatch;
import o.buildMapping;
import o.computeDirection;
import o.dashPathEffectdefault;
import o.endBatchEditInternal;
import o.ensureActive;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.isNestedScrollingEnabled;
import o.logDebug;
import o.onMessageReceived;
import o.pa;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setTransformQ8lPUPs;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r3
  0x0043: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(isNestedScrollingEnabled isnestedscrollingenabled, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 23;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1854795874);
            if ((i & 98) == 0) {
                if (getpostalcode.IconCompatParcelizer(isnestedscrollingenabled)) {
                    i4 = IconCompatParcelizer + 19;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1854795874);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(isnestedscrollingenabled)) {
                    i4 = IconCompatParcelizer + 19;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i3 & 3) != 2) {
            int i7 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            String upperCase = isnestedscrollingenabled.text.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            switch (logDebug.serializer[isnestedscrollingenabled.style.ordinal()]) {
                case 1:
                case 2:
                    getpostalcode.serializer(-47402045);
                    TagsKt.RemoteActionCompatParcelizer(upperCase, null, 0, 0, getpostalcode, 0, 30);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 3:
                    getpostalcode.serializer(-47399645);
                    TagsKt.write(upperCase, null, 0, 0, getpostalcode, 0, 30);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 4:
                    getpostalcode.serializer(-47397311);
                    TagsKt.serializer(upperCase, (Modifier) null, 0, 0, getpostalcode, 0, 30);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 5:
                    getpostalcode.serializer(-47395006);
                    TagsKt.read(upperCase, null, 0, 0, 0L, 0L, 0L, null, getpostalcode, 0, 510);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 6:
                    getpostalcode.serializer(-47392703);
                    TagsKt.MediaBrowserCompatMediaItem(upperCase, null, 0, 0, getpostalcode, 0, 30);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                case 7:
                    getpostalcode.serializer(-47390431);
                    int iIconCompatParcelizer = onMessageReceived.IconCompatParcelizer();
                    int iIconCompatParcelizer2 = onMessageReceived.IconCompatParcelizer();
                    TagsKt.serializer(2032277805, iIconCompatParcelizer, onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{upperCase, null, 0, 0, getpostalcode, 0, 30}, onMessageReceived.IconCompatParcelizer(), iIconCompatParcelizer2);
                    getpostalcode.IconCompatParcelizer(false);
                    break;
                default:
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -47404127, false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(isnestedscrollingenabled, i, 9);
        }
    }

    public static final void Picture(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z) {
        int i2;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1047590933);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.write(z)) {
                int i5 = IconCompatParcelizer + 23;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 5;
                }
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
            int i7 = RemoteActionCompatParcelizer + 109;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 5 % 5;
            }
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        int i9 = i2;
        if (getpostalcode.write(i9 & 1, (74899 & i9) != 74898)) {
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            settransformq8lpups.IconCompatParcelizer = str2;
            settransformq8lpups.MediaSessionCompatResultReceiverWrapper = str;
            settransformq8lpups.write = str;
            ShaderKt shaderKtIconCompatParcelizer = settransformq8lpups.IconCompatParcelizer();
            ContentScale.Companion companion = ContentScale.Companion;
            AsyncImagePainter asyncImagePainterRemoteActionCompatParcelizer = computeDirection.RemoteActionCompatParcelizer(shaderKtIconCompatParcelizer, null, companion.getFillWidth(), getpostalcode, 3072, 22);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = CompositionKt.write(asyncImagePainterRemoteActionCompatParcelizer.ResultReceiver, getpostalcode);
            dashPathEffectdefault dashpatheffectdefault = (dashPathEffectdefault) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean z3 = getpostalcode.read(populateViewStructure_androidKtpopulate7Write);
            if ((57344 & i9) == 16384) {
                int i10 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z2 = true;
            } else {
                int i12 = RemoteActionCompatParcelizer + 9;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z3 | z2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new LocalAuthDataSource.AnonymousClass2(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7Write, null, 26);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, dashpatheffectdefault, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            dashPathEffectdefault dashpatheffectdefault2 = (dashPathEffectdefault) populateViewStructure_androidKtpopulate7Write.getValue();
            if (dashpatheffectdefault2 instanceof AsyncImagePainter$State$Success) {
                getpostalcode.serializer(-1548443285);
                ContentScale fillWidth = companion.getFillWidth();
                Alignment center = Alignment.Companion.getCenter();
                Modifier modifierClipToBounds = ClipKt.clipToBounds(modifier);
                ZoomState zoomState = AsyncTaskExecutor11.read(getpostalcode);
                boolean z4 = (i9 & 7168) == 2048;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(12, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity2);
                }
                androidx.compose.foundation.ImageKt.Image(asyncImagePainterRemoteActionCompatParcelizer, "entrance picture", RunnableWrapper.serializer(modifierClipToBounds, zoomState, z, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), center, fillWidth, 0.0f, null, getpostalcode, 27696, 96);
                getpostalcode.IconCompatParcelizer(false);
            } else if (!(dashpatheffectdefault2 instanceof AsyncImagePainter$State$Loading) && !(dashpatheffectdefault2 instanceof PathEffect)) {
                if (dashpatheffectdefault2 instanceof AsyncImagePainter$State$Error) {
                    getpostalcode.serializer(-1712494472);
                    ImageLoadingKt.ImageError(Modifier.Companion.then(SizeKt.read), null, getpostalcode, 6, 2);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1712518708, false);
                }
            } else {
                int i14 = RemoteActionCompatParcelizer + 1;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode.serializer(-1712496646);
                    ImageLoadingKt.ImageLoading(Modifier.Companion.then(SizeKt.read), getpostalcode, 56);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(-1712496646);
                    ImageLoadingKt.ImageLoading(Modifier.Companion.then(SizeKt.read), getpostalcode, 6);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new pa(str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d A[PHI: r3
  0x011d: PHI (r3v27 int) = (r3v13 int), (r3v14 int), (r3v28 int) binds: [B:74:0x00fd, B:80:0x0110, B:71:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Pager(int i, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean zIconCompatParcelizer;
        int i6 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-120422028);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        Object obj = null;
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                int i7 = IconCompatParcelizer + 93;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            }
            i3 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i8 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i3 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            int i10 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= getpostalcode.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i12 = i3;
        boolean z4 = true;
        if (getpostalcode.write(i12 & 1, (599187 & i12) != 599186)) {
            int i13 = RemoteActionCompatParcelizer;
            int i14 = i13 + 111;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0 ? (i4 = i12 & 112) == 32 : (i4 = i12 & 24) == 124) {
                i5 = i4;
                z2 = true;
            } else {
                if ((i12 & 64) != 0) {
                    int i15 = i13 + 77;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                        obj.hashCode();
                        throw null;
                    }
                    if (getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                        i5 = i4;
                        z2 = true;
                    }
                }
                i5 = i4;
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new endBatchEditInternal(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 0);
                getpostalcode.write(objComponentActivity);
            }
            ForgottenCoroutineScopeException forgottenCoroutineScopeException = PagerStateKt.read(i, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, i12 & 14);
            boolean z5 = i5 == 32 || ((i12 & 64) != 0 && getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk));
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z5 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(19, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                getpostalcode.write(objComponentActivity2);
            }
            int i16 = i5;
            PagerKt.m95HorizontalPager8jOkeI(forgottenCoroutineScopeException, modifier, null, null, 0.0f, null, null, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, null, null, null, ExtrasKt.write(-832370315, new ensureActive(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 0), getpostalcode), getpostalcode, (i12 >> 15) & 112, 24576, 15356);
            int iRemoteActionCompatParcelizer = forgottenCoroutineScopeException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer();
            if (i16 != 32) {
                int i17 = RemoteActionCompatParcelizer + 75;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0 ? (i12 & 64) != 0 : (i12 & 29) != 0) {
                    if (getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                        z3 = true;
                    }
                }
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z6 = getpostalcode.read(forgottenCoroutineScopeException);
            if ((i12 & 7168) == 2048) {
                int i18 = IconCompatParcelizer + 73;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            } else {
                z4 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (((z6 | z3) || z4) || objComponentActivity3 == androidContentCaptureManager) {
                getpostalcode = getpostalcode;
                objComponentActivity3 = new SignInDataStore$set$2(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, forgottenCoroutineScopeException, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 25);
                getpostalcode.write(objComponentActivity3);
            } else {
                getpostalcode = getpostalcode;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iRemoteActionCompatParcelizer), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new addEditCommandWithBatch(i, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f A[PHI: r1
  0x003f: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1
  0x0032: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void PictureBox(int i, String str, String str2, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(545760653);
            if ((i2 & 48) == 0) {
                if (getpostalcode.read(i)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(545760653);
            if ((i2 & 6) == 0) {
                if (getpostalcode.read(i)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i12 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.read(str2)) {
                int i14 = RemoteActionCompatParcelizer + 87;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                i8 = i14 % 2 != 0 ? 9807 : Fields.RotationX;
            } else {
                i8 = Fields.SpotShadowColor;
            }
            i4 |= i8;
        }
        Object obj = null;
        if ((i2 & 3072) == 0) {
            int i15 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                    int i16 = IconCompatParcelizer + 69;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    i7 = i16 % 2 == 0 ? 16794 : Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
                i4 |= i7;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                obj.hashCode();
                throw null;
            }
        }
        if ((i2 & 24576) == 0) {
            if (getpostalcode.write(z)) {
                int i17 = IconCompatParcelizer + 97;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i6 = Fields.Clip;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((196608 & i2) == 0) {
            i4 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i19 = IconCompatParcelizer + 11;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i5 = 1048576;
            } else {
                i5 = Fields.BlendMode;
            }
            i4 |= i5;
        }
        if ((12582912 & i2) == 0) {
            i4 |= getpostalcode.read(modifier) ? 8388608 : 4194304;
        }
        if ((4793491 & i4) != 4793490) {
            int i20 = IconCompatParcelizer + 71;
            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                boolean z3 = (458752 & i4) == 131072;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(11, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null);
                modifierSemantics$default.getClass();
                Modifier modifierWrite = SizeKt.write(modifierSemantics$default, 1.0f);
                Alignment center = companion.getCenter();
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
                Modifier modifierAlign = boxScopeInstance.align(modifierWrite, center);
                int i22 = i4 >> 6;
                Picture((i22 & 57344) | ((i4 >> 3) & 126) | (i22 & 896) | (i22 & 7168), getpostalcode, modifierAlign, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z);
                if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                    getpostalcode.serializer(108468219);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i23 = RemoteActionCompatParcelizer + 121;
                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                    if (!z) {
                        getpostalcode.serializer(108010783);
                        Modifier modifierWrite2 = PaddingKt.write(boxScopeInstance.align(SizeKt.serializer(companion3, 1.0f), companion.getBottomStart()), Dimensions.setActionBarVisibilityCallback);
                        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                        FlowLayoutKt.serializer(modifierWrite2, Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), new snapElevation(Dimensions.getActionBarHideOffset, false, new StreamSharing$$ExternalSyntheticLambda0(15, companion.getBottom())), null, 0, 0, ExtrasKt.write(-893493305, new TagOverlayKt$$ExternalSyntheticLambda3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 1), getpostalcode), getpostalcode, 1572864, 56);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(108468219);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(i, str, str2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i2);
        }
    }

    public static final void PageIndicator(int i, int i2, Modifier modifier, getBirthDateFull getbirthdatefull, int i3) {
        int i4;
        getPostalCode getpostalcode;
        long supportBackgroundTintMode;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1861589407);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        Object obj = null;
        if ((i3 & 6) == 0) {
            int i6 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                i4 = (getpostalcode2.read(i) ? 4 : 2) | i3;
            } else {
                getpostalcode2.read(i);
                obj.hashCode();
                throw null;
            }
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            int i7 = RemoteActionCompatParcelizer + 65;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i4 |= getpostalcode2.read(i2) ? 32 : 16;
            } else {
                getpostalcode2.read(i2);
                obj.hashCode();
                throw null;
            }
        }
        if ((i3 & 384) == 0) {
            i4 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            int i8 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (!getpostalcode2.write(i4 & 1, (i4 & 147) != 146)) {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (2 <= i && i < 11) {
            getpostalcode2.serializer(1992497720);
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f = Dimensions.getNestedScrollAxes;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f, 0.0f, f, 5);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.serializer(f, companion.getCenterHorizontally()), companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                getpostalcode2.serializer(1813028116);
                for (int i10 = 0; i10 < i; i10++) {
                    if (i10 == i2) {
                        getpostalcode2.serializer(-1260033444);
                        supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener();
                    } else {
                        getpostalcode2.serializer(-1260032585);
                        supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                    }
                    getpostalcode2.IconCompatParcelizer(false);
                    int i11 = RemoteActionCompatParcelizer + 1;
                    int i12 = i11 % Fields.SpotShadowColor;
                    IconCompatParcelizer = i12;
                    int i13 = i11 % 2;
                    int i14 = i12 + 111;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes), RoundedCornerShapeKt.IconCompatParcelizer), ((Color) TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(supportBackgroundTintMode, null, null, null, getpostalcode2, 0, 14).getValue()).m732unboximpl(), RectangleShapeKt.getRectangleShape()), getpostalcode2, 0);
                }
                af$$ExternalSyntheticOutline0.m(getpostalcode2, false, true, false);
                getpostalcode = getpostalcode2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else if (i <= 10) {
            getpostalcode = getpostalcode2;
            getpostalcode.serializer(-2013900041);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(modifier, Dimensions.setLogo)});
            getpostalcode.IconCompatParcelizer(false);
        } else {
            int i16 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            getpostalcode2.serializer(1993285275);
            Modifier modifierWrite2 = SizeKt.write(modifier, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getTop(), getpostalcode2, 6);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                TextKt.m131TextNvy7gAk((i2 + 1) + " / " + i, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessparse(i, i2, modifier, i3, 1);
        }
    }
}
