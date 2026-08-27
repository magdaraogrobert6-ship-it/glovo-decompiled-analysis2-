package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.internal.router.RouterWrapper$endRouteRequest$4$1;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt$CameraView$2$1;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt$CameraView$7$1;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.PictureTags$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidEdgeEffectOverscrollEffect;
import o.AuthenticatorUtils;
import o.BackspaceCommand;
import o.CircularProgressIndicatorTokens;
import o.CommitTextCommand;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LayoutDirection;
import o.LinearGradientShaderVjE6UOUdefault;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.accessisRenderNodeCompatiblecp;
import o.applyTo;
import o.computeDirection;
import o.copyykzQM6k;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.generateUrlStringForPOST;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCacheable;
import o.getCameraProvider;
import o.getCreditCardExpirationMonth;
import o.getDisplayingInAppMessageannotations;
import o.getHandleruiannotations;
import o.getLogoDescription;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getTypeUIouoOA;
import o.isEmimpl;
import o.minIntrinsicWidth;
import o.onViewAttachedToWindow;
import o.parseResponse;
import o.performLayout;
import o.preWarmCache;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resumeSendingI;
import o.setInternalPaintui_graphics;
import o.setNavigationOnClickListener;
import o.setOutlineui;
import o.setSlingshotDistance;
import o.setTransformQ8lPUPs;
import o.supportingTextPaddinga9UjIt4material3default;
import o.toIntRectozmzZPI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppCameraWithTagsKt {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public static final float read = Dp.m3673constructorimpl(150.0f);
    public static final ensureSubscribedToInAppMessageEventslambda7 serializer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, 30}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
    public static final ensureSubscribedToInAppMessageEventslambda7 IconCompatParcelizer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{330, 360}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
    public static final ensureSubscribedToInAppMessageEventslambda7 MediaBrowserCompatMediaItem = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{60, 120}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
    public static final ensureSubscribedToInAppMessageEventslambda7 RemoteActionCompatParcelizer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{150, 210}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
    public static final getDisplayingInAppMessageannotations write = new getDisplayingInAppMessageannotations(240, 299);

    static {
        int i = MediaDescriptionCompat + 61;
        RatingCompat = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void write(Uri uri, setNavigationOnClickListener setnavigationonclicklistener, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3 = 2;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1010099155);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(uri)) {
                i3 = 4;
            } else {
                int i5 = MediaMetadataCompat + 23;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            i2 = i3 | i;
        } else {
            int i7 = MediaMetadataCompat + 7;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(setnavigationonclicklistener) ^ true ? 16 : 32;
        }
        int i9 = i2 | 384;
        if (getpostalcode.write(i9 & 1, (i9 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            settransformq8lpups.ParcelableVolumeInfo = setOutlineui.DISABLED;
            settransformq8lpups.IconCompatParcelizer = uri;
            LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new preWarmCache(uri, setnavigationonclicklistener, 1));
            ImageKt.Image(computeDirection.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, null, getpostalcode, 0, 30), "Clicked picture", companion.then(SizeKt.read), null, ContentScale.Companion.getFillHeight(), 0.0f, null, getpostalcode, 24624, 104);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new BackspaceCommand(uri, setnavigationonclicklistener, modifier2, i, 1);
        }
    }

    public static final void read(setNavigationOnClickListener setnavigationonclicklistener, boolean z, Uri uri, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1582773313);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(setnavigationonclicklistener) ? 4 : 2) | i;
            int i6 = MediaMetadataCompat + 123;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(uri) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i8 = MediaSessionCompatQueueItem + 75;
                MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 == 0 ? 21050 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i9 = MediaMetadataCompat + 15;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode.write(z2);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.write(z2)) {
                int i10 = MediaSessionCompatQueueItem + 91;
                MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = Fields.Clip;
            } else {
                int i12 = MediaMetadataCompat + 25;
                MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 8192;
            }
            i2 |= i3;
        }
        if (!getpostalcode.write(i2 & 1, !((i2 & 9363) == 9362))) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (uri.equals(Uri.EMPTY)) {
            getpostalcode.serializer(2046400232);
            int i14 = i2 >> 3;
            serializer(z, setnavigationonclicklistener, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, null, getpostalcode, ((i2 << 3) & 112) | (i14 & 14) | (i14 & 896) | (i14 & 7168));
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(2046620332);
            write(uri, setnavigationonclicklistener, null, getpostalcode, ((i2 >> 6) & 14) | ((i2 << 3) & 112));
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new parseResponse(setnavigationonclicklistener, z, uri, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r2
  0x0048: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(Uri uri, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = MediaMetadataCompat + 89;
        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(802663936);
            if ((i & 98) == 0) {
                int i9 = MediaMetadataCompat + 35;
                MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (getpostalcode.IconCompatParcelizer(uri)) {
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
            getpostalcode.MediaSessionCompatQueueItem(802663936);
            if ((i & 6) == 0) {
                int i11 = MediaMetadataCompat + 35;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (getpostalcode.IconCompatParcelizer(uri)) {
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
            i3 |= !(getpostalcode.write(z) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i13 = MediaSessionCompatQueueItem + 89;
            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i3 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i15 = MediaSessionCompatQueueItem + 95;
            MediaMetadataCompat = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
            } else {
                int i16 = 44 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            int i17 = MediaSessionCompatQueueItem + 13;
            MediaMetadataCompat = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2))) {
                int i19 = MediaMetadataCompat + 25;
                MediaSessionCompatQueueItem = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                i5 = Fields.RenderEffect;
                if (i20 != 0) {
                    int i21 = 76 / 0;
                }
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 1048576 : Fields.BlendMode;
        }
        Object obj = null;
        if ((12582912 & i) == 0) {
            int i22 = MediaSessionCompatQueueItem + 87;
            MediaMetadataCompat = i22 % Fields.SpotShadowColor;
            if (i22 % 2 != 0) {
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 8388608 : 4194304;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
                obj.hashCode();
                throw null;
            }
        }
        if ((100663296 & i) == 0) {
            if (!getpostalcode.read(modifier)) {
                i4 = 33554432;
            } else {
                int i23 = MediaSessionCompatQueueItem + 115;
                MediaMetadataCompat = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    int i24 = 92 / 0;
                }
                i4 = 67108864;
            }
            i3 |= i4;
        }
        if (getpostalcode.write(i3 & 1, (38347923 & i3) != 38347922)) {
            int i25 = MediaMetadataCompat + 97;
            MediaSessionCompatQueueItem = i25 % Fields.SpotShadowColor;
            if (i25 % 2 == 0) {
                if (uri.equals(Uri.EMPTY)) {
                    getpostalcode.serializer(2078706883);
                    int i26 = i3 >> 6;
                    int i27 = i3 >> 9;
                    ControlWithClickOptionKt.ControlWithClickOption(z2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, modifier, getpostalcode, (i26 & 14) | (i3 & 112) | ((i3 >> 3) & 896) | (i26 & 7168) | (57344 & i27) | (458752 & i27));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(2078992579);
                    int i28 = i3 >> 18;
                    ControlWithConfirmOption(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, getpostalcode, (i28 & 896) | ((i3 >> 9) & 112) | (i28 & 14));
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                uri.equals(Uri.EMPTY);
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new applyTo(uri, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public static final void RemoteActionCompatParcelizer(isEmimpl isemimpl, toIntRectozmzZPI tointrectozmzzpi, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, boolean z, boolean z2, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = MediaMetadataCompat + 77;
        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        isemimpl.getClass();
        tointrectozmzzpi.getClass();
        setnavigationonclicklistener.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1654772472);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.IconCompatParcelizer(isemimpl) ? 4 : 2) | i;
        } else {
            int i10 = MediaSessionCompatQueueItem + 83;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 3 % 3;
            }
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0 ? getpostalcode2.read(tointrectozmzzpi) : getpostalcode2.IconCompatParcelizer(tointrectozmzzpi)) {
                int i12 = MediaMetadataCompat + 3;
                MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            int i14 = MediaSessionCompatQueueItem + 23;
            MediaMetadataCompat = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                int i15 = 5 / 0;
                if (getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener)) {
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i16 = MediaSessionCompatQueueItem + 61;
            MediaMetadataCompat = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? 8192 : Fields.Clip;
        }
        if ((i & 196608) == 0) {
            int i17 = MediaMetadataCompat + 35;
            MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            int i19 = MediaSessionCompatQueueItem + 75;
            MediaMetadataCompat = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                int i21 = MediaMetadataCompat + 13;
                MediaSessionCompatQueueItem = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        if ((100663296 & i) == 0) {
            int i22 = MediaMetadataCompat + 85;
            MediaSessionCompatQueueItem = i22 % Fields.SpotShadowColor;
            if (i22 % 2 != 0) {
                getpostalcode2.write(z);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.write(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode2.write(z2) ? 536870912 : 268435456;
        }
        int i23 = i2 | 6;
        if (getpostalcode2.write(i3 & 1, ((306783379 & i3) == 306783378 && (i23 & 3) == 2) ? false : true)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 13);
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            boolean z3 = (i3 & 7168) == 2048;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z3 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 4);
                getpostalcode2.write(objComponentActivity3);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
            Uri uri = isemimpl.read;
            LayoutDirection layoutDirection = isemimpl.write;
            boolean zBooleanValue = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
            int i24 = i3 >> 15;
            PictureTags$Companion pictureTags$Companion = LayoutDirection.Companion;
            int i25 = i3 >> 21;
            getpostalcode = getpostalcode2;
            PictureWithTags(uri, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, layoutDirection, setnavigationonclicklistener, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, zBooleanValue, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, tointrectozmzzpi, z, z2, companion, getpostalcode, ((i3 >> 6) & 7168) | (i24 & 112) | 805306368 | (i24 & 896) | (57344 & i3) | Fields.ColorFilter | ((i3 << 12) & 3670016), ((i3 >> 3) & 14) | 8 | (i25 & 112) | (i25 & 896) | ((i23 << 9) & 7168));
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new generateUrlStringForPOST(isemimpl, tointrectozmzzpi, setnavigationonclicklistener, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, z, z2, modifier2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x015d  */
    public static final void ControlWithConfirmOption(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1366735643);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i6 = MediaSessionCompatQueueItem;
                int i7 = i6 + 29;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i6 + 57;
                MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 32 : 16;
            int i11 = MediaSessionCompatQueueItem + 109;
            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i13 = MediaMetadataCompat + 27;
                MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i15 = i2;
        if ((i15 & 147) != 146) {
            int i16 = MediaSessionCompatQueueItem + 95;
            MediaMetadataCompat = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i15 & 1, z)) {
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(modifier, 1.0f), read);
            Color.Companion companion = Color.Companion;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM75height3ABfNKs, companion.m748getBlack0d7_KjU(), RectangleShapeKt.getRectangleShape());
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(companion4, 1.0f), Dimensions.setVisibility, Dimensions.setCustomView);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion2.getCenterVertically(), getpostalcode2, 54);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i18 = MediaMetadataCompat + 83;
                MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    getpostalcode2.serializer(constructor2);
                    throw null;
                }
                getpostalcode2.serializer(constructor2);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.take_better_picture_retake_button_text, getpostalcode2, 0);
            long jM759getWhite0d7_KjU = companion.m759getWhite0d7_KjU();
            TextStyle textStyle = performLayout.read();
            boolean z2 = (i15 & 112) == 32;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2) {
                objComponentActivity = new b1$$ExternalSyntheticLambda0(13, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode2.write(objComponentActivity);
            } else {
                int i19 = MediaSessionCompatQueueItem + 89;
                MediaMetadataCompat = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new b1$$ExternalSyntheticLambda0(13, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode2.write(objComponentActivity);
                }
            }
            TextKt.m131TextNvy7gAk(strStringResource, ClickableKt.RemoteActionCompatParcelizer(companion4, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15), jM759getWhite0d7_KjU, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 384, 0, 131064);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.take_better_picture_use_photo_button_text, getpostalcode2, 0);
            long jM759getWhite0d7_KjU2 = companion.m759getWhite0d7_KjU();
            TextStyle textStyle2 = performLayout.read();
            boolean z3 = (i15 & 14) == 4;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new b1$$ExternalSyntheticLambda0(14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode2.write(objComponentActivity2);
            }
            Modifier modifierRemoteActionCompatParcelizer2 = ClickableKt.RemoteActionCompatParcelizer(companion4, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, 15);
            modifierRemoteActionCompatParcelizer2.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(strStringResource2, modifierRemoteActionCompatParcelizer2, jM759getWhite0d7_KjU2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle2, getpostalcode, 384, 0, 131064);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new copyykzQM6k(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02de  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    /* JADX WARN: Code duplicated, block: B:94:0x024c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0295  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a1  */
    public static final void serializer(boolean z, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        boolean z4;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        boolean zIconCompatParcelizer3;
        boolean zIconCompatParcelizer4;
        boolean zIconCompatParcelizer5;
        boolean zIconCompatParcelizer6;
        boolean zIconCompatParcelizer7;
        boolean z5;
        boolean z6;
        Object objComponentActivity;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        Modifier.Companion companion;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z7;
        Object objComponentActivity2;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean zIconCompatParcelizer8;
        Object objComponentActivity3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1759380761);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i7 = MediaMetadataCompat + 49;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.write(z2)) {
                int i8 = MediaSessionCompatQueueItem + 33;
                MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = Fields.CameraDistance;
            } else {
                int i10 = MediaSessionCompatQueueItem + 61;
                MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        int i12 = i2 | 24576;
        if ((i12 & 9363) != 9362) {
            int i13 = MediaSessionCompatQueueItem + 39;
            MediaMetadataCompat = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode2.write(i12 & 1, z3)) {
            Modifier.Companion companion2 = Modifier.Companion;
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode2.write((getNewPassword) setInternalPaintui_graphics.write);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
            if (objComponentActivity4 == androidContentCaptureManager3) {
                objComponentActivity4 = new getCameraProvider(0).IconCompatParcelizer();
                getpostalcode2.write(objComponentActivity4);
            }
            AuthenticatorUtils authenticatorUtils = (AuthenticatorUtils) objComponentActivity4;
            authenticatorUtils.getClass();
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager3) {
                objComponentActivity5 = new AndroidEdgeEffectOverscrollEffect(context);
                getpostalcode2.write(objComponentActivity5);
            }
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = (AndroidEdgeEffectOverscrollEffect) objComponentActivity5;
            getLogoDescription getlogodescription = getLogoDescription.serializer;
            getlogodescription.getClass();
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager3) {
                int i15 = MediaSessionCompatQueueItem + 71;
                MediaMetadataCompat = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity6 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity6);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode2.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager3) {
                objComponentActivity7 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity7);
            }
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity7;
            Object objComponentActivity8 = getpostalcode2.ComponentActivity();
            if (objComponentActivity8 == androidContentCaptureManager3) {
                objComponentActivity8 = CompositionKt.serializer(new CommitTextCommand(getplatformandroidmanager, 2));
                getpostalcode2.write(objComponentActivity8);
            }
            onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity8;
            Object objComponentActivity9 = getpostalcode2.ComponentActivity();
            if (objComponentActivity9 == androidContentCaptureManager3) {
                int i17 = MediaMetadataCompat + 123;
                MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                minIntrinsicWidth[] minintrinsicwidthArr = new minIntrinsicWidth[1];
                getpostalcode2.write(minintrinsicwidthArr);
                objComponentActivity9 = minintrinsicwidthArr;
            }
            minIntrinsicWidth[] minintrinsicwidthArr2 = (minIntrinsicWidth[]) objComponentActivity9;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(Boolean.valueOf(z2), getpostalcode2);
            Object objComponentActivity10 = getpostalcode2.ComponentActivity();
            if (objComponentActivity10 == androidContentCaptureManager3) {
                objComponentActivity10 = new getTypeUIouoOA(context, getplatformandroidmanager);
                getpostalcode2.write(objComponentActivity10);
            }
            getTypeUIouoOA gettypeuiouooa = (getTypeUIouoOA) objComponentActivity10;
            int iIntValue = ((Number) onviewattachedtowindow.getValue()).intValue();
            boolean zIconCompatParcelizer9 = getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
            Object objComponentActivity11 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer9 || objComponentActivity11 == androidContentCaptureManager3) {
                i3 = 1;
                objComponentActivity11 = new InAppCameraWithTagsKt$CameraView$2$1(setnavigationonclicklistener, onviewattachedtowindow, null, i3);
                getpostalcode2.write(objComponentActivity11);
            } else {
                i3 = 1;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Integer.valueOf(iIntValue), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity11);
            boolean zIconCompatParcelizer10 = getpostalcode2.IconCompatParcelizer(gettypeuiouooa);
            Object objComponentActivity12 = getpostalcode2.ComponentActivity();
            if (((zIconCompatParcelizer10 ? 1 : 0) ^ i3) != 0) {
                int i19 = MediaMetadataCompat + 119;
                MediaSessionCompatQueueItem = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                if (objComponentActivity12 == androidContentCaptureManager3) {
                    objComponentActivity12 = new RetryWithDelay$$ExternalSyntheticLambda0(13, gettypeuiouooa);
                    getpostalcode2.write(objComponentActivity12);
                }
            } else {
                objComponentActivity12 = new RetryWithDelay$$ExternalSyntheticLambda0(13, gettypeuiouooa);
                getpostalcode2.write(objComponentActivity12);
            }
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{gettypeuiouooa, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity12, getpostalcode2, 0}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
            boolean zIconCompatParcelizer11 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr2);
            boolean z8 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            Object objComponentActivity13 = getpostalcode2.ComponentActivity();
            if (!zIconCompatParcelizer11 && !z8) {
                int i21 = MediaMetadataCompat + 63;
                MediaSessionCompatQueueItem = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    z4 = false;
                    int i22 = 71 / 0;
                    if (objComponentActivity13 == androidContentCaptureManager3) {
                    }
                } else {
                    z4 = false;
                    if (objComponentActivity13 == androidContentCaptureManager3) {
                    }
                }
                getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity13, getpostalcode2);
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(context);
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr2);
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getlogodescription);
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(accessisrendernodecompatiblecp);
                zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(authenticatorUtils);
                zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
                zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(androidEdgeEffectOverscrollEffect2);
                if ((i12 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                z6 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if ((!(z5 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | z6)) || objComponentActivity == androidContentCaptureManager3) {
                    androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect2;
                    companion = companion2;
                    androidContentCaptureManager = androidContentCaptureManager3;
                    getpostalcode = getpostalcode2;
                    RouterWrapper$endRouteRequest$4$1 routerWrapper$endRouteRequest$4$1 = new RouterWrapper$endRouteRequest$4$1(context, minintrinsicwidthArr2, getlogodescription, accessisrendernodecompatiblecp, authenticatorUtils, setnavigationonclicklistener, androidEdgeEffectOverscrollEffect, r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate7, populateViewStructure_androidKtpopulate7Serializer, null);
                    getpostalcode.write(routerWrapper$endRouteRequest$4$1);
                    objComponentActivity = routerWrapper$endRouteRequest$4$1;
                } else {
                    companion = companion2;
                    androidContentCaptureManager = androidContentCaptureManager3;
                    getpostalcode = getpostalcode2;
                    androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect2;
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, getlogodescription, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                if ((i12 & 14) == 4) {
                    int i23 = MediaSessionCompatQueueItem + 15;
                    MediaMetadataCompat = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    z7 = true;
                } else {
                    z7 = z4;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                androidContentCaptureManager2 = androidContentCaptureManager;
                if (z7 || objComponentActivity2 == androidContentCaptureManager2) {
                    objComponentActivity2 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate7, null, 1);
                    getpostalcode.write(objComponentActivity2);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
                zIconCompatParcelizer8 = getpostalcode.IconCompatParcelizer(androidEdgeEffectOverscrollEffect);
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer8) {
                    objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect, 2);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    i4 = MediaMetadataCompat + 111;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        int i25 = 51 / 0;
                        if (objComponentActivity3 == androidContentCaptureManager2) {
                            objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect, 2);
                            getpostalcode.write(objComponentActivity3);
                        }
                    } else if (objComponentActivity3 == androidContentCaptureManager2) {
                        objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect, 2);
                        getpostalcode.write(objComponentActivity3);
                    }
                }
                Modifier.Companion companion3 = companion;
                AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, companion3.then(SizeKt.read), null, getpostalcode, 0, 4);
                modifier2 = companion3;
            } else {
                z4 = false;
            }
            objComponentActivity13 = new getCacheable(minintrinsicwidthArr2, populateViewStructure_androidKtpopulate7Serializer, 1);
            getpostalcode2.write(objComponentActivity13);
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity13, getpostalcode2);
            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(context);
            zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr2);
            zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getlogodescription);
            zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(accessisrendernodecompatiblecp);
            zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(authenticatorUtils);
            zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
            zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(androidEdgeEffectOverscrollEffect2);
            if ((i12 & 896) == 256) {
                z5 = true;
            } else {
                z5 = z4;
            }
            z6 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            objComponentActivity = getpostalcode2.ComponentActivity();
            if (!(z5 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | z6)) {
                androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect2;
                companion = companion2;
                androidContentCaptureManager = androidContentCaptureManager3;
                getpostalcode = getpostalcode2;
                RouterWrapper$endRouteRequest$4$1 routerWrapper$endRouteRequest$4$2 = new RouterWrapper$endRouteRequest$4$1(context, minintrinsicwidthArr2, getlogodescription, accessisrendernodecompatiblecp, authenticatorUtils, setnavigationonclicklistener, androidEdgeEffectOverscrollEffect, r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate7, populateViewStructure_androidKtpopulate7Serializer, null);
                getpostalcode.write(routerWrapper$endRouteRequest$4$2);
                objComponentActivity = routerWrapper$endRouteRequest$4$2;
            } else {
                companion = companion2;
                androidContentCaptureManager = androidContentCaptureManager3;
                getpostalcode = getpostalcode2;
                androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect2;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, getlogodescription, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            if ((i12 & 14) == 4) {
                int i26 = MediaSessionCompatQueueItem + 15;
                MediaMetadataCompat = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                z7 = true;
            } else {
                z7 = z4;
            }
            objComponentActivity2 = getpostalcode.ComponentActivity();
            androidContentCaptureManager2 = androidContentCaptureManager;
            if (z7) {
                objComponentActivity2 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate7, null, 1);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate7, null, 1);
                getpostalcode.write(objComponentActivity2);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            zIconCompatParcelizer8 = getpostalcode.IconCompatParcelizer(androidEdgeEffectOverscrollEffect);
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer8) {
                i4 = MediaMetadataCompat + 111;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i28 = 51 / 0;
                    if (objComponentActivity3 == androidContentCaptureManager2) {
                        objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect, 2);
                        getpostalcode.write(objComponentActivity3);
                    }
                } else if (objComponentActivity3 == androidContentCaptureManager2) {
                    objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect, 2);
                    getpostalcode.write(objComponentActivity3);
                }
            } else {
                objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect, 2);
                getpostalcode.write(objComponentActivity3);
            }
            Modifier.Companion companion4 = companion;
            AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, companion4.then(SizeKt.read), null, getpostalcode, 0, 4);
            modifier2 = companion4;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new parseResponse(z, setnavigationonclicklistener, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e2  */
    public static final void PictureWithTags(final Uri uri, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final LayoutDirection layoutDirection, final setNavigationOnClickListener setnavigationonclicklistener, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, final toIntRectozmzZPI tointrectozmzzpi, final boolean z2, final boolean z3, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        boolean z4;
        getPostalCode getpostalcode;
        boolean z5;
        boolean zIconCompatParcelizer;
        boolean zIconCompatParcelizer2;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(481147889);
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(uri)) {
                int i7 = MediaSessionCompatQueueItem + 51;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i8 = i & 384;
        int i9 = Fields.SpotShadowColor;
        if (i8 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : 128;
        }
        int i10 = i & 3072;
        int i11 = Fields.CameraDistance;
        if (i10 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            int i12 = MediaSessionCompatQueueItem + 99;
            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            int i14 = MediaMetadataCompat + 83;
            MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if ((262144 & i) == 0) {
                zIconCompatParcelizer2 = getpostalcode2.read(layoutDirection);
            } else {
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(layoutDirection);
            }
            i3 |= zIconCompatParcelizer2 ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ^ true ? 4194304 : 8388608;
        }
        if ((i & 100663296) == 0) {
            i3 |= getpostalcode2.write(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            int i15 = MediaSessionCompatQueueItem + 111;
            MediaMetadataCompat = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 536870912 : 268435456;
        }
        int i17 = i3;
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(tointrectozmzzpi);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(tointrectozmzzpi);
            }
            i4 = (zIconCompatParcelizer ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i18 = MediaMetadataCompat + 67;
            MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                i4 |= getpostalcode2.write(z2) ? 32 : 16;
            } else {
                getpostalcode2.write(z2);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.write(z3)) {
                i9 = Fields.RotationX;
            }
            i4 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (!getpostalcode2.read(modifier)) {
                i11 = 1024;
            }
            i4 |= i11;
        }
        int i19 = i4;
        if ((i17 & 306783379) == 306783378) {
            int i20 = MediaMetadataCompat + 107;
            MediaSessionCompatQueueItem = i20 % Fields.SpotShadowColor;
            if (i20 % 2 == 0 ? (i19 & 1171) == 1170 : (i19 & 27632) == 2584) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = true;
        }
        if (getpostalcode2.write(i17 & 1, z4)) {
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z6 = getpostalcode2.read(context);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z6) {
                int i21 = MediaSessionCompatQueueItem + 125;
                MediaMetadataCompat = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.camera.flash"));
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                objComponentActivity = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.camera.flash"));
                getpostalcode2.write(objComponentActivity);
            }
            boolean zBooleanValue = ((Boolean) objComponentActivity).booleanValue();
            Modifier modifierThen = modifier.then(SizeKt.read);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                int i23 = MediaSessionCompatQueueItem + 21;
                MediaMetadataCompat = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                    boolean z7 = getpostalcode2.read(uri);
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (z7 || objComponentActivity2 == androidContentCaptureManager) {
                        if (uri.equals(Uri.EMPTY)) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("InAppCameraWithTags: hasSystemFeature FEATURE_CAMERA_FLASH: ", zBooleanValue), new Object[0]);
                        } else {
                            zBooleanValue = false;
                        }
                        objComponentActivity2 = Boolean.valueOf(zBooleanValue);
                        getpostalcode2.write(objComponentActivity2);
                    }
                    boolean zBooleanValue2 = ((Boolean) objComponentActivity2).booleanValue();
                    int i24 = i17 >> 18;
                    int i25 = i17 << 6;
                    read(setnavigationonclicklistener, z, uri, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z3, getpostalcode2, (i24 & 14) | ((i17 >> 21) & 112) | (i25 & 896) | ((i17 >> 3) & 7168) | ((i19 << 6) & 57344));
                    Modifier.Companion companion3 = Modifier.Companion;
                    Alignment bottomEnd = companion.getBottomEnd();
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
                    IconCompatParcelizer(uri, zBooleanValue2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, boxScopeInstance.align(companion3, bottomEnd), getpostalcode2, (i17 & 14) | (i24 & 896) | (i24 & 7168) | ((i17 << 9) & 57344) | (458752 & i25) | ((i17 << 12) & 3670016) | (i17 & 29360128));
                    if (uri.equals(Uri.EMPTY)) {
                        getpostalcode = getpostalcode2;
                        getpostalcode.serializer(-2065405417);
                        if (z2) {
                            getpostalcode.serializer(-2065369054);
                            CameraOverlayV2ContentKt.CameraOverlayV2Content(tointrectozmzzpi, null, 0.0f, getpostalcode, (i19 & 14) | 8);
                            z5 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(-2065226020);
                            Modifier modifierAlign = boxScopeInstance.align(companion3, companion.getTopStart());
                            PictureTags$Companion pictureTags$Companion = LayoutDirection.Companion;
                            TagOverlayKt.TagOverlay(layoutDirection, modifierAlign, null, getpostalcode, ((i17 >> 15) & 14) | 8);
                            z5 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        getpostalcode.IconCompatParcelizer(z5);
                    } else {
                        getpostalcode = getpostalcode2;
                        getpostalcode.serializer(-2065047925);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z8 = getpostalcode2.ComponentActivity;
                    throw null;
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.compareToR2X_6o
                private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
                private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj3, Object obj4) {
                    int i26 = 2 % 2;
                    int i27 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 85;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    ((Integer) obj4).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    InAppCameraWithTagsKt.PictureWithTags(uri, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, layoutDirection, setnavigationonclicklistener, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, tointrectozmzzpi, z2, z3, modifier, (getBirthDateFull) obj3, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i29 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 55;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i29 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            };
        }
    }
}
