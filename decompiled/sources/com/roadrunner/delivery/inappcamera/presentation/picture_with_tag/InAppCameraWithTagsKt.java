package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.Braze$$ExternalSyntheticLambda9;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.location.LocationRequest;
import com.logistics.rider.glovo.R;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.zoom.ZoomControlKt;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.DelayKt;
import o.AdjustBridgeInstance8;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidEdgeEffectOverscrollEffect;
import o.AuthenticatorUtils;
import o.BackspaceCommand;
import o.CircularProgressIndicatorTokens;
import o.CommitTextCommand;
import o.CursorAnchorInfoApi33Helper;
import o.CursorAnchorInfoApi34Helper;
import o.DisplayInfoManager;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FocusMeteringAction;
import o.LinearGradientShaderVjE6UOUdefault;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextFieldDefaults;
import o.TextMeasurerHelperKt;
import o.TooltipStateImplshow2;
import o.accessisRenderNodeCompatiblecp;
import o.applyTo;
import o.computeDirection;
import o.copyykzQM6k;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCacheable;
import o.getCameraProvider;
import o.getCieXyz;
import o.getContentInsetStart;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLogoDescription;
import o.getNewCursorPosition;
import o.getNewPassword;
import o.getPersonFullName;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.instance_delegatelambda0;
import o.minIntrinsicWidth;
import o.moveTodefault;
import o.onHideTranslationui;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.populate;
import o.preWarmCache;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resumeSendingI;
import o.setInternalPaintui_graphics;
import o.setNavigationOnClickListener;
import o.setOutlineui;
import o.setSlingshotDistance;
import o.setTransformQ8lPUPs;
import o.supportingTextPaddinga9UjIt4material3default;
import o.updateCursorAnchorInfo;
import o.updateTextLayoutResult;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppCameraWithTagsKt {
    public static final ensureSubscribedToInAppMessageEventslambda7 IconCompatParcelizer;
    public static final ensureSubscribedToInAppMessageEventslambda7 MediaBrowserCompatMediaItem;
    private static int MediaDescriptionCompat = 1;
    public static final ensureSubscribedToInAppMessageEventslambda7 MediaMetadataCompat;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int RatingCompat;
    public static final ensureSubscribedToInAppMessageEventslambda7 RemoteActionCompatParcelizer;
    public static final float read = Dp.m3673constructorimpl(150.0f);
    public static final String serializer;
    public static final ensureSubscribedToInAppMessageEventslambda7 write;

    static {
        int iWrite = BackspaceCommand.write();
        write = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, 30}, BackspaceCommand.write(), -281231677, iWrite);
        int iWrite2 = BackspaceCommand.write();
        MediaMetadataCompat = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{330, 360}, BackspaceCommand.write(), -281231677, iWrite2);
        int iWrite3 = BackspaceCommand.write();
        MediaBrowserCompatMediaItem = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{60, 120}, BackspaceCommand.write(), -281231677, iWrite3);
        int iWrite4 = BackspaceCommand.write();
        IconCompatParcelizer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{150, 210}, BackspaceCommand.write(), -281231677, iWrite4);
        serializer = moveTodefault.IconCompatParcelizer(1.0f);
        RemoteActionCompatParcelizer = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{240, Integer.valueOf(LocationRequest.PRIORITY_INDOOR)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
        int i = MediaDescriptionCompat + 31;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    public static final boolean write(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        int i = 2 % 2;
        int i2 = RatingCompat + 1;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
        }
        int i3 = 10 / 0;
        return ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
    }

    public static final void read(Uri uri, setNavigationOnClickListener setnavigationonclicklistener, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1382156607);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(setnavigationonclicklistener)) {
                int i5 = MediaSessionCompatResultReceiverWrapper + 13;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i7 = i2 | 384;
        if (getpostalcode.write(i7 & 1, (i7 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            settransformq8lpups.ParcelableVolumeInfo = setOutlineui.DISABLED;
            settransformq8lpups.IconCompatParcelizer = uri;
            LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new preWarmCache(uri, setnavigationonclicklistener, 0));
            ImageKt.Image(computeDirection.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, null, getpostalcode, 0, 30), "Clicked picture", companion.then(SizeKt.read), null, ContentScale.Companion.getFillHeight(), 0.0f, null, getpostalcode, 24624, 104);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i8 = RatingCompat + 87;
        MediaSessionCompatResultReceiverWrapper = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new BackspaceCommand(uri, setnavigationonclicklistener, modifier2, i, 0);
        }
    }

    public static final void RemoteActionCompatParcelizer(getLogoDescription getlogodescription, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8, Exception exc) {
        Object next;
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.serializer(exc, "InAppCameraWithTags: Failed to bind " + getlogodescription, new Object[0]);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getlogodescription, getLogoDescription.serializer}, getCieXyz.write())).booleanValue()) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 33;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(exc);
                return;
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(exc);
                int i3 = 30 / 0;
                return;
            }
        }
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                populateViewStructure_androidKtpopulate7.setValue(removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList));
                Iterator<E> it2 = ((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue()).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    int i4 = RatingCompat + 61;
                    MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        ((updateTextLayoutResult) it2.next()).read.equals(serializer);
                        throw null;
                    }
                    next = it2.next();
                } while (!((updateTextLayoutResult) next).read.equals(serializer));
                updateTextLayoutResult updatetextlayoutresult = (updateTextLayoutResult) next;
                if (updatetextlayoutresult == null) {
                    for (Object obj2 : (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue()) {
                        int i5 = RatingCompat + 19;
                        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((updateTextLayoutResult) obj2).IconCompatParcelizer, getLogoDescription.serializer}, getCieXyz.write())).booleanValue()) {
                            obj = obj2;
                            break;
                        }
                    }
                    updatetextlayoutresult = (updateTextLayoutResult) obj;
                }
                populateViewStructure_androidKtpopulate8.setValue(updatetextlayoutresult);
                return;
            }
            int i7 = MediaSessionCompatResultReceiverWrapper + 113;
            RatingCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((updateTextLayoutResult) it.next()).IconCompatParcelizer, getlogodescription}, getCieXyz.write())).booleanValue();
                throw null;
            }
            Object next2 = it.next();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((updateTextLayoutResult) next2).IconCompatParcelizer, getlogodescription}, getCieXyz.write())).booleanValue()) {
                arrayList.add(next2);
            }
        }
    }

    public static final void write(setNavigationOnClickListener setnavigationonclicklistener, boolean z, Uri uri, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, boolean z3, boolean z4, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(806818203);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(setnavigationonclicklistener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(uri)) {
                i4 = Fields.RotationX;
            } else {
                int i6 = MediaSessionCompatResultReceiverWrapper + 35;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 3;
                }
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i3 = Fields.RotationZ;
            } else {
                int i8 = MediaSessionCompatResultReceiverWrapper + 101;
                RatingCompat = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 14089 : Fields.CameraDistance;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i9 = RatingCompat + 59;
            MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.write(z2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.write(z3) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            int i11 = RatingCompat + 1;
            MediaSessionCompatResultReceiverWrapper = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode.write(z4) ? 1048576 : Fields.BlendMode;
        }
        if (getpostalcode.write(i2 & 1, (599187 & i2) != 599186)) {
            if (uri.equals(Uri.EMPTY)) {
                getpostalcode.serializer(1284386730);
                int i13 = i2 >> 3;
                CameraView(z, setnavigationonclicklistener, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, z3, z4, null, getpostalcode, (458752 & i13) | (i13 & 57344) | ((i2 << 3) & 112) | (i13 & 14) | (i13 & 896) | (i13 & 7168));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1284699923);
                read(uri, setnavigationonclicklistener, null, getpostalcode, ((i2 << 3) & 112) | ((i2 >> 6) & 14));
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AdjustBridgeInstance8(setnavigationonclicklistener, z, uri, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, z3, z4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public static final void read(Uri uri, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-611749868);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(uri)) {
                int i10 = MediaSessionCompatResultReceiverWrapper + 95;
                RatingCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    i8 = 2;
                } else {
                    i8 = 4;
                }
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = MediaSessionCompatResultReceiverWrapper + 97;
            RatingCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.write(z)) {
                int i13 = RatingCompat + 49;
                MediaSessionCompatResultReceiverWrapper = i13 % Fields.SpotShadowColor;
                i7 = i13 % 2 == 0 ? 5 : 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.write(z2)) {
                int i14 = MediaSessionCompatResultReceiverWrapper + 57;
                RatingCompat = i14 % Fields.SpotShadowColor;
                i6 = i14 % 2 != 0 ? 16757 : Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i15 = RatingCompat + 11;
                MediaSessionCompatResultReceiverWrapper = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i5 = Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i17 = MediaSessionCompatResultReceiverWrapper + 105;
                RatingCompat = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ^ true) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                int i19 = RatingCompat + 19;
                MediaSessionCompatResultReceiverWrapper = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    throw null;
                }
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((100663296 & i) == 0) {
            int i20 = RatingCompat + 41;
            MediaSessionCompatResultReceiverWrapper = i20 % Fields.SpotShadowColor;
            if (i20 % 2 == 0) {
                getpostalcode.read(modifier);
                throw null;
            }
            z3 = true;
            i2 |= getpostalcode.read(modifier) ^ true ? 33554432 : 67108864;
        } else {
            z3 = true;
        }
        if ((38347923 & i2) == 38347922) {
            z3 = false;
        }
        if (!getpostalcode.write(i2 & 1, z3)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (uri.equals(Uri.EMPTY)) {
            int i21 = RatingCompat + 113;
            MediaSessionCompatResultReceiverWrapper = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            getpostalcode.serializer(-1093754321);
            int i23 = i2 >> 6;
            int i24 = i2 >> 9;
            ControlWithClickOptionKt.ControlWithClickOption(z2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, modifier, getpostalcode, ((i2 >> 3) & 896) | (i23 & 14) | (i2 & 112) | (i23 & 7168) | (57344 & i24) | (458752 & i24));
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(-1093467199);
            int i25 = i2 >> 18;
            ControlWithConfirmOption(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, getpostalcode, ((i2 >> 9) & 112) | (i25 & 14) | (i25 & 896));
            getpostalcode.IconCompatParcelizer(false);
            int i26 = MediaSessionCompatResultReceiverWrapper + 105;
            RatingCompat = i26 % Fields.SpotShadowColor;
            int i27 = i26 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new applyTo(uri, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    public static final void serializer(CursorAnchorInfoApi34Helper cursorAnchorInfoApi34Helper, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        int i5 = MediaSessionCompatResultReceiverWrapper + 3;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        cursorAnchorInfoApi34Helper.getClass();
        setnavigationonclicklistener.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-632410480);
        if ((i & 6) == 0) {
            int i7 = RatingCompat + 25;
            MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(cursorAnchorInfoApi34Helper)) {
                    i3 = 4;
                } else {
                    int i8 = MediaSessionCompatResultReceiverWrapper + 125;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i3 = 2;
                }
            } else {
                int i10 = 5 / 0;
                if (getpostalcode.IconCompatParcelizer(cursorAnchorInfoApi34Helper)) {
                    i3 = 4;
                } else {
                    int i11 = MediaSessionCompatResultReceiverWrapper + 125;
                    RatingCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i3 = 2;
                }
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(setnavigationonclicklistener) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ^ true) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ^ true ? 65536 : Fields.RenderEffect;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.write(z) ? 8388608 : 4194304;
        }
        int i13 = i2 | 100663296;
        if (getpostalcode.write(i13 & 1, (38347923 & i13) != 38347922)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 6);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            if ((i13 & 896) == 256) {
                int i14 = RatingCompat + 29;
                MediaSessionCompatResultReceiverWrapper = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!z2) {
                int i16 = RatingCompat + 43;
                MediaSessionCompatResultReceiverWrapper = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    int i17 = 51 / 0;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 1);
                        getpostalcode.write(objComponentActivity3);
                    }
                } else if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 1);
                    getpostalcode.write(objComponentActivity3);
                }
            } else {
                objComponentActivity3 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 1);
                getpostalcode.write(objComponentActivity3);
            }
            int i18 = i13 >> 12;
            PictureWithTags(cursorAnchorInfoApi34Helper.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, cursorAnchorInfoApi34Helper.write, setnavigationonclicklistener, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue(), r8lambdardpfsr94j4iebcwx_kpqzpm8k4, cursorAnchorInfoApi34Helper.serializer, cursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer, z, companion, getpostalcode, (i18 & 896) | (i18 & 112) | 805306368 | ((i13 >> 3) & 7168) | ((i13 << 3) & 57344) | ((i13 << 15) & 3670016), (i13 >> 15) & 8064);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TooltipStateImplshow2(cursorAnchorInfoApi34Helper, setnavigationonclicklistener, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, z, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01dc  */
    public static final void ControlWithConfirmOption(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(399497391);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i4 = 16;
            } else {
                int i6 = MediaSessionCompatResultReceiverWrapper + 123;
                int i7 = i6 % Fields.SpotShadowColor;
                RatingCompat = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 47;
                MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i11 = MediaSessionCompatResultReceiverWrapper + 25;
                RatingCompat = i11 % Fields.SpotShadowColor;
                i3 = i11 % 2 != 0 ? 28941 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i12 = i2;
        if ((i12 & 147) != 146) {
            int i13 = RatingCompat + 95;
            MediaSessionCompatResultReceiverWrapper = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i12 & 1, z)) {
            int i15 = MediaSessionCompatResultReceiverWrapper + 27;
            RatingCompat = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
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
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i17 = RatingCompat + 47;
                MediaSessionCompatResultReceiverWrapper = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode2.serializer(constructor);
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
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.take_better_picture_retake_button_text, getpostalcode2, 0);
            long jM759getWhite0d7_KjU = companion.m759getWhite0d7_KjU();
            TextStyle textStyle = performLayout.read();
            if ((i12 & 112) == 32) {
                int i19 = RatingCompat + 113;
                MediaSessionCompatResultReceiverWrapper = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!(!z2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new b1$$ExternalSyntheticLambda0(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode2.write(objComponentActivity);
            }
            TextKt.m131TextNvy7gAk(strStringResource, ClickableKt.RemoteActionCompatParcelizer(companion4, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15), jM759getWhite0d7_KjU, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 384, 0, 131064);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.take_better_picture_use_photo_button_text, getpostalcode2, 0);
            long jM759getWhite0d7_KjU2 = companion.m759getWhite0d7_KjU();
            TextStyle textStyle2 = performLayout.read();
            boolean z3 = !((i12 & 14) != 4);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z3) {
                objComponentActivity2 = new b1$$ExternalSyntheticLambda0(7, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode2.write(objComponentActivity2);
            } else {
                int i21 = RatingCompat + 61;
                MediaSessionCompatResultReceiverWrapper = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new b1$$ExternalSyntheticLambda0(7, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity2);
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new copyykzQM6k(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01de  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:127:0x022c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0246  */
    /* JADX WARN: Code duplicated, block: B:138:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0189  */
    /* JADX WARN: Code duplicated, block: B:89:0x0198  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:27:0x0083). Please report as a decompilation issue!!! */
    public static final Object access$resolveZoomOptions(minIntrinsicWidth minintrinsicwidth, getContentInsetStart getcontentinsetstart, ContinuationImpl continuationImpl) {
        getNewCursorPosition getnewcursorposition;
        FocusMeteringAction focusMeteringActionResultReceiver;
        getNewCursorPosition getnewcursorposition2;
        DisplayInfoManager displayInfoManager;
        FocusMeteringAction focusMeteringAction;
        minIntrinsicWidth minintrinsicwidth2;
        int i;
        float fIconCompatParcelizer;
        float fRemoteActionCompatParcelizer;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        Object next;
        Float f;
        float fFloatValue;
        Object next2;
        Float f2;
        float fFloatValue2;
        updateCursorAnchorInfo updatecursoranchorinfo;
        ArrayList arrayList3;
        Iterator it2;
        Object next3;
        Float f3;
        float fFloatValue3;
        Object next4;
        Float f4;
        float fFloatValue4;
        updateCursorAnchorInfo updatecursoranchorinfo2;
        Float f5;
        float fFloatValue5;
        Float f6;
        float fFloatValue6;
        int i2;
        Float f7;
        float fFloatValue7;
        getLogoDescription getlogodescription;
        int i3;
        int i4 = 2 % 2;
        Iterable iterable = instance_delegatelambda0.write;
        if (continuationImpl instanceof getNewCursorPosition) {
            int i5 = MediaSessionCompatResultReceiverWrapper + 113;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            getnewcursorposition = (getNewCursorPosition) continuationImpl;
            int i7 = getnewcursorposition.serializer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                getnewcursorposition.serializer = i7 - Integer.MIN_VALUE;
            } else {
                getnewcursorposition = new getNewCursorPosition(continuationImpl);
            }
        } else {
            getnewcursorposition = new getNewCursorPosition(continuationImpl);
        }
        Object obj = getnewcursorposition.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getnewcursorposition.serializer;
        updateTextLayoutResult updatetextlayoutresult = null;
        try {
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (getcontentinsetstart == null || (focusMeteringActionResultReceiver = getcontentinsetstart.ResultReceiver()) == null) {
                    return SmallPersistentVector.RemoteActionCompatParcelizer;
                }
                getnewcursorposition2 = getnewcursorposition;
                displayInfoManager = (DisplayInfoManager) focusMeteringActionResultReceiver.ResultReceiver().IconCompatParcelizer();
                focusMeteringAction = focusMeteringActionResultReceiver;
                minintrinsicwidth2 = minintrinsicwidth;
                i = 0;
                if (displayInfoManager == null || i >= 6) {
                    iterable = moveTodefault.read(minintrinsicwidth2);
                    if (displayInfoManager != null) {
                        fIconCompatParcelizer = displayInfoManager.IconCompatParcelizer();
                    } else {
                        fIconCompatParcelizer = 1.0f;
                    }
                    if (displayInfoManager != null) {
                        i3 = RatingCompat + 31;
                        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            displayInfoManager.RemoteActionCompatParcelizer();
                            throw null;
                        }
                        fRemoteActionCompatParcelizer = displayInfoManager.RemoteActionCompatParcelizer();
                    } else {
                        fRemoteActionCompatParcelizer = 1.0f;
                    }
                    arrayList = new ArrayList();
                    if (fIconCompatParcelizer <= 0.6f) {
                        String strIconCompatParcelizer = moveTodefault.IconCompatParcelizer(fIconCompatParcelizer);
                        getLogoDescription getlogodescription2 = getLogoDescription.serializer;
                        getlogodescription2.getClass();
                        updatetextlayoutresult = new updateTextLayoutResult(strIconCompatParcelizer, getlogodescription2, fIconCompatParcelizer);
                    } else {
                        arrayList2 = new ArrayList();
                        for (Object obj2 : iterable) {
                            int i9 = RatingCompat + 5;
                            MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            f7 = ((updateCursorAnchorInfo) obj2).read;
                            if (f7 != null) {
                                fFloatValue7 = f7.floatValue();
                            } else {
                                fFloatValue7 = 0.0f;
                            }
                            if (fFloatValue7 > 0.0f) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.size() < 2) {
                            int i11 = RatingCompat + 31;
                            MediaSessionCompatResultReceiverWrapper = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                        } else {
                            it = arrayList2.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    f = ((updateCursorAnchorInfo) next).read;
                                    if (f != null) {
                                        int i13 = RatingCompat + 57;
                                        MediaSessionCompatResultReceiverWrapper = i13 % Fields.SpotShadowColor;
                                        int i14 = i13 % 2;
                                        fFloatValue = f.floatValue();
                                    } else {
                                        fFloatValue = Float.MAX_VALUE;
                                    }
                                    do {
                                        next2 = it.next();
                                        f2 = ((updateCursorAnchorInfo) next2).read;
                                        if (f2 != null) {
                                            fFloatValue2 = f2.floatValue();
                                        } else {
                                            fFloatValue2 = Float.MAX_VALUE;
                                        }
                                        if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                            next = next2;
                                            fFloatValue = fFloatValue2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                i2 = RatingCompat + 77;
                                MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
                                if (i2 % 2 != 0) {
                                    throw null;
                                }
                                next = null;
                            }
                            updatecursoranchorinfo = (updateCursorAnchorInfo) next;
                            if (updatecursoranchorinfo != null) {
                                arrayList3 = new ArrayList();
                                for (Object obj3 : arrayList2) {
                                    if (((updateCursorAnchorInfo) obj3) == updatecursoranchorinfo) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                it2 = arrayList3.iterator();
                                if (it2.hasNext()) {
                                    next3 = it2.next();
                                    if (it2.hasNext()) {
                                        f3 = ((updateCursorAnchorInfo) next3).read;
                                        if (f3 != null) {
                                            fFloatValue3 = f3.floatValue();
                                        } else {
                                            fFloatValue3 = Float.MAX_VALUE;
                                        }
                                        do {
                                            next4 = it2.next();
                                            f4 = ((updateCursorAnchorInfo) next4).read;
                                            if (f4 != null) {
                                                fFloatValue4 = f4.floatValue();
                                            } else {
                                                fFloatValue4 = Float.MAX_VALUE;
                                            }
                                            if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                                                next3 = next4;
                                                fFloatValue3 = fFloatValue4;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    int i15 = MediaSessionCompatResultReceiverWrapper + 81;
                                    RatingCompat = i15 % Fields.SpotShadowColor;
                                    int i16 = i15 % 2;
                                    next3 = null;
                                }
                                updatecursoranchorinfo2 = (updateCursorAnchorInfo) next3;
                                if (updatecursoranchorinfo2 != null && (f5 = updatecursoranchorinfo.read) != null) {
                                    fFloatValue5 = f5.floatValue();
                                    f6 = updatecursoranchorinfo2.read;
                                    if (f6 != null) {
                                        int i17 = RatingCompat + 67;
                                        MediaSessionCompatResultReceiverWrapper = i17 % Fields.SpotShadowColor;
                                        int i18 = i17 % 2;
                                        fFloatValue6 = fFloatValue5 / f6.floatValue();
                                        if (fFloatValue6 < 0.9f && fFloatValue6 >= 0.05f) {
                                            updatetextlayoutresult = new updateTextLayoutResult("0.5x", updatecursoranchorinfo.IconCompatParcelizer, 1.0f);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (updatetextlayoutresult != null) {
                        arrayList.add(updatetextlayoutresult);
                    }
                    String strIconCompatParcelizer2 = moveTodefault.IconCompatParcelizer(1.0f);
                    getlogodescription = getLogoDescription.serializer;
                    getlogodescription.getClass();
                    arrayList.add(new updateTextLayoutResult(strIconCompatParcelizer2, getlogodescription, 1.0f));
                    if (fRemoteActionCompatParcelizer >= 2.0f) {
                        arrayList.add(new updateTextLayoutResult(moveTodefault.IconCompatParcelizer(2.0f), getlogodescription, 2.0f));
                    }
                    return removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                }
                getnewcursorposition2.RemoteActionCompatParcelizer = minintrinsicwidth2;
                getnewcursorposition2.IconCompatParcelizer = focusMeteringAction;
                getnewcursorposition2.write = i;
                getnewcursorposition2.serializer = 1;
                if (DelayKt.delay(50L, getnewcursorposition2) == coroutineSingletons) {
                    int i19 = RatingCompat + 13;
                    MediaSessionCompatResultReceiverWrapper = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = getnewcursorposition.write;
                FocusMeteringAction focusMeteringAction2 = getnewcursorposition.IconCompatParcelizer;
                minIntrinsicWidth minintrinsicwidth3 = getnewcursorposition.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                focusMeteringAction = focusMeteringAction2;
                minintrinsicwidth2 = minintrinsicwidth3;
                getnewcursorposition2 = getnewcursorposition;
            }
            iterable = moveTodefault.read(minintrinsicwidth2);
        } catch (IllegalArgumentException e) {
            Timber.RemoteActionCompatParcelizer.serializer(e, "InAppCameraWithTags: Unable to read back camera specs", new Object[0]);
        } catch (IllegalStateException e2) {
            Timber.RemoteActionCompatParcelizer.serializer(e2, "InAppCameraWithTags: Unable to read back camera specs", new Object[0]);
        }
        displayInfoManager = (DisplayInfoManager) focusMeteringAction.ResultReceiver().IconCompatParcelizer();
        i++;
        if (displayInfoManager == null) {
        }
        if (displayInfoManager != null) {
            fIconCompatParcelizer = displayInfoManager.IconCompatParcelizer();
        } else {
            fIconCompatParcelizer = 1.0f;
        }
        if (displayInfoManager != null) {
            i3 = RatingCompat + 31;
            MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                displayInfoManager.RemoteActionCompatParcelizer();
                throw null;
            }
            fRemoteActionCompatParcelizer = displayInfoManager.RemoteActionCompatParcelizer();
        } else {
            fRemoteActionCompatParcelizer = 1.0f;
        }
        arrayList = new ArrayList();
        if (fIconCompatParcelizer <= 0.6f) {
            String strIconCompatParcelizer3 = moveTodefault.IconCompatParcelizer(fIconCompatParcelizer);
            getLogoDescription getlogodescription3 = getLogoDescription.serializer;
            getlogodescription3.getClass();
            updatetextlayoutresult = new updateTextLayoutResult(strIconCompatParcelizer3, getlogodescription3, fIconCompatParcelizer);
        } else {
            arrayList2 = new ArrayList();
            while (r2.hasNext()) {
                int i21 = RatingCompat + 5;
                MediaSessionCompatResultReceiverWrapper = i21 % Fields.SpotShadowColor;
                int i110 = i21 % 2;
                f7 = ((updateCursorAnchorInfo) obj2).read;
                if (f7 != null) {
                    fFloatValue7 = f7.floatValue();
                } else {
                    fFloatValue7 = 0.0f;
                }
                if (fFloatValue7 > 0.0f) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() < 2) {
                int i111 = RatingCompat + 31;
                MediaSessionCompatResultReceiverWrapper = i111 % Fields.SpotShadowColor;
                int i112 = i111 % 2;
            } else {
                it = arrayList2.iterator();
                if (it.hasNext()) {
                    i2 = RatingCompat + 77;
                    MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        f = ((updateCursorAnchorInfo) next).read;
                        if (f != null) {
                            int i113 = RatingCompat + 57;
                            MediaSessionCompatResultReceiverWrapper = i113 % Fields.SpotShadowColor;
                            int i114 = i113 % 2;
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = Float.MAX_VALUE;
                        }
                        do {
                            next2 = it.next();
                            f2 = ((updateCursorAnchorInfo) next2).read;
                            if (f2 != null) {
                                fFloatValue2 = f2.floatValue();
                            } else {
                                fFloatValue2 = Float.MAX_VALUE;
                            }
                            if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                next = next2;
                                fFloatValue = fFloatValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                updatecursoranchorinfo = (updateCursorAnchorInfo) next;
                if (updatecursoranchorinfo != null) {
                    arrayList3 = new ArrayList();
                    while (r12.hasNext()) {
                        if (((updateCursorAnchorInfo) obj3) == updatecursoranchorinfo) {
                            arrayList3.add(obj3);
                        }
                    }
                    it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                        int i115 = MediaSessionCompatResultReceiverWrapper + 81;
                        RatingCompat = i115 % Fields.SpotShadowColor;
                        int i116 = i115 % 2;
                        next3 = null;
                    } else {
                        next3 = it2.next();
                        if (it2.hasNext()) {
                            f3 = ((updateCursorAnchorInfo) next3).read;
                            if (f3 != null) {
                                fFloatValue3 = f3.floatValue();
                            } else {
                                fFloatValue3 = Float.MAX_VALUE;
                            }
                            do {
                                next4 = it2.next();
                                f4 = ((updateCursorAnchorInfo) next4).read;
                                if (f4 != null) {
                                    fFloatValue4 = f4.floatValue();
                                } else {
                                    fFloatValue4 = Float.MAX_VALUE;
                                }
                                if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                                    next3 = next4;
                                    fFloatValue3 = fFloatValue4;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    updatecursoranchorinfo2 = (updateCursorAnchorInfo) next3;
                    if (updatecursoranchorinfo2 != null) {
                        fFloatValue5 = f5.floatValue();
                        f6 = updatecursoranchorinfo2.read;
                        if (f6 != null) {
                            int i117 = RatingCompat + 67;
                            MediaSessionCompatResultReceiverWrapper = i117 % Fields.SpotShadowColor;
                            int i118 = i117 % 2;
                            fFloatValue6 = fFloatValue5 / f6.floatValue();
                            if (fFloatValue6 < 0.9f) {
                                updatetextlayoutresult = new updateTextLayoutResult("0.5x", updatecursoranchorinfo.IconCompatParcelizer, 1.0f);
                            }
                        }
                    }
                }
            }
        }
        if (updatetextlayoutresult != null) {
            arrayList.add(updatetextlayoutresult);
        }
        String strIconCompatParcelizer4 = moveTodefault.IconCompatParcelizer(1.0f);
        getlogodescription = getLogoDescription.serializer;
        getlogodescription.getClass();
        arrayList.add(new updateTextLayoutResult(strIconCompatParcelizer4, getlogodescription, 1.0f));
        if (fRemoteActionCompatParcelizer >= 2.0f) {
            arrayList.add(new updateTextLayoutResult(moveTodefault.IconCompatParcelizer(2.0f), getlogodescription, 2.0f));
        }
        return removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0226  */
    /* JADX WARN: Code duplicated, block: B:138:0x022e  */
    /* JADX WARN: Code duplicated, block: B:139:0x023d  */
    /* JADX WARN: Code duplicated, block: B:151:0x030c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0317  */
    /* JADX WARN: Code duplicated, block: B:154:0x031b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0345  */
    /* JADX WARN: Code duplicated, block: B:157:0x0349  */
    /* JADX WARN: Code duplicated, block: B:159:0x0355  */
    /* JADX WARN: Code duplicated, block: B:161:0x036d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0388  */
    public static final void PictureWithTags(final Uri uri, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final InAppCameraOverlay inAppCameraOverlay, final setNavigationOnClickListener setnavigationonclicklistener, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, final boolean z2, final boolean z3, final boolean z4, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(609931355);
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.IconCompatParcelizer(uri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= !getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i9 = RatingCompat + 17;
                MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i7 = Fields.RotationX;
            } else {
                i7 = Fields.SpotShadowColor;
            }
            i3 |= i7;
        }
        int i11 = i & 3072;
        int i12 = Fields.RotationZ;
        if (i11 == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            int i13 = MediaSessionCompatResultReceiverWrapper + 39;
            RatingCompat = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(inAppCameraOverlay) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener)) {
                int i15 = MediaSessionCompatResultReceiverWrapper + 105;
                RatingCompat = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i6 = 1048576;
            } else {
                i6 = Fields.BlendMode;
            }
            i3 |= i6;
        }
        if ((12582912 & i) == 0) {
            int i17 = MediaSessionCompatResultReceiverWrapper + 27;
            RatingCompat = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.write(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 536870912 : 268435456;
        }
        int i19 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode2.write(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i20 = RatingCompat + 53;
            MediaSessionCompatResultReceiverWrapper = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            i4 |= getpostalcode2.write(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode2.write(z4) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.read(modifier)) {
                i12 = Fields.CameraDistance;
            }
            i4 |= i12;
        }
        int i22 = i4;
        if (getpostalcode2.write(i19 & 1, ((i19 & 306783379) == 306783378 && (i22 & 1171) == 1170) ? false : true)) {
            int i23 = RatingCompat + 61;
            MediaSessionCompatResultReceiverWrapper = i23 % Fields.SpotShadowColor;
            if (i23 % 2 == 0) {
                getpostalcode2.read((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                throw null;
            }
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z6 = getpostalcode2.read(context);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (z6 || objComponentActivity == androidContentCaptureManager2) {
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
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
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
            if (z7) {
                if (uri.equals(Uri.EMPTY)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("InAppCameraWithTags: hasSystemFeature FEATURE_CAMERA_FLASH: ", zBooleanValue), new Object[0]);
                } else {
                    zBooleanValue = false;
                }
                objComponentActivity2 = Boolean.valueOf(zBooleanValue);
                getpostalcode2.write(objComponentActivity2);
            } else {
                int i24 = RatingCompat + 53;
                MediaSessionCompatResultReceiverWrapper = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    int i25 = 79 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager2) {
                        if (uri.equals(Uri.EMPTY)) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("InAppCameraWithTags: hasSystemFeature FEATURE_CAMERA_FLASH: ", zBooleanValue), new Object[0]);
                        } else {
                            zBooleanValue = false;
                        }
                        objComponentActivity2 = Boolean.valueOf(zBooleanValue);
                        getpostalcode2.write(objComponentActivity2);
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager2) {
                    if (uri.equals(Uri.EMPTY)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("InAppCameraWithTags: hasSystemFeature FEATURE_CAMERA_FLASH: ", zBooleanValue), new Object[0]);
                    } else {
                        zBooleanValue = false;
                    }
                    objComponentActivity2 = Boolean.valueOf(zBooleanValue);
                    getpostalcode2.write(objComponentActivity2);
                }
            }
            boolean zBooleanValue2 = ((Boolean) objComponentActivity2).booleanValue();
            int i26 = i19 >> 18;
            int i27 = i19 << 6;
            int i28 = i22 << 12;
            write(setnavigationonclicklistener, z, uri, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, z3, z4, getpostalcode2, (i26 & 14) | ((i19 >> 21) & 112) | (i27 & 896) | ((i19 >> 3) & 7168) | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016));
            Modifier.Companion companion3 = Modifier.Companion;
            Alignment bottomEnd = companion.getBottomEnd();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            read(uri, zBooleanValue2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, boxScopeInstance.align(companion3, bottomEnd), getpostalcode2, (i19 & 14) | (i26 & 896) | (i26 & 7168) | ((i19 << 9) & 57344) | (i27 & 458752) | ((i19 << 12) & 3670016) | (i19 & 29360128));
            if (!uri.equals(Uri.EMPTY)) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-251540031);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                int i29 = MediaSessionCompatResultReceiverWrapper + 95;
                RatingCompat = i29 % Fields.SpotShadowColor;
                if (i29 % 2 != 0) {
                    getpostalcode.serializer(-251948766);
                    int i30 = 50 / 0;
                    if (inAppCameraOverlay instanceof InAppCameraOverlay.None) {
                        getpostalcode.serializer(-423767771);
                        z5 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (inAppCameraOverlay instanceof InAppCameraOverlay.Tags) {
                        int i31 = MediaSessionCompatResultReceiverWrapper + 53;
                        RatingCompat = i31 % Fields.SpotShadowColor;
                        int i32 = i31 % 2;
                        getpostalcode.serializer(-423766008);
                        TagOverlayKt.TagOverlay((InAppCameraOverlay.Tags) inAppCameraOverlay, boxScopeInstance.align(companion3, companion.getTopStart()), null, getpostalcode, (i19 >> 15) & 14);
                        z5 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (inAppCameraOverlay instanceof InAppCameraOverlay.Structured) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -423769376, false);
                        }
                        i5 = RatingCompat + 5;
                        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            getpostalcode.serializer(-423760028);
                            CameraOverlayV2ContentKt.CameraOverlayV2Content(((InAppCameraOverlay.Structured) inAppCameraOverlay).serializer, null, 2.0f, getpostalcode, 90);
                            z5 = false;
                        } else {
                            z5 = false;
                            getpostalcode.serializer(-423760028);
                            CameraOverlayV2ContentKt.CameraOverlayV2Content(((InAppCameraOverlay.Structured) inAppCameraOverlay).serializer, null, 0.0f, getpostalcode, 8);
                        }
                        getpostalcode.IconCompatParcelizer(z5);
                    }
                } else {
                    getpostalcode.serializer(-251948766);
                    if (inAppCameraOverlay instanceof InAppCameraOverlay.None) {
                        getpostalcode.serializer(-423767771);
                        z5 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (inAppCameraOverlay instanceof InAppCameraOverlay.Tags) {
                        int i33 = MediaSessionCompatResultReceiverWrapper + 53;
                        RatingCompat = i33 % Fields.SpotShadowColor;
                        int i34 = i33 % 2;
                        getpostalcode.serializer(-423766008);
                        TagOverlayKt.TagOverlay((InAppCameraOverlay.Tags) inAppCameraOverlay, boxScopeInstance.align(companion3, companion.getTopStart()), null, getpostalcode, (i19 >> 15) & 14);
                        z5 = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (inAppCameraOverlay instanceof InAppCameraOverlay.Structured) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -423769376, false);
                        }
                        i5 = RatingCompat + 5;
                        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            getpostalcode.serializer(-423760028);
                            CameraOverlayV2ContentKt.CameraOverlayV2Content(((InAppCameraOverlay.Structured) inAppCameraOverlay).serializer, null, 2.0f, getpostalcode, 90);
                            z5 = false;
                        } else {
                            z5 = false;
                            getpostalcode.serializer(-423760028);
                            CameraOverlayV2ContentKt.CameraOverlayV2Content(((InAppCameraOverlay.Structured) inAppCameraOverlay).serializer, null, 0.0f, getpostalcode, 8);
                        }
                        getpostalcode.IconCompatParcelizer(z5);
                    }
                }
                getpostalcode.IconCompatParcelizer(z5);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getCurrentui_text
                private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
                private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i35 = 2 % 2;
                    int i36 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 79;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i37 = i36 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    InAppCameraWithTagsKt.PictureWithTags(uri, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, inAppCameraOverlay, setnavigationonclicklistener, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, z2, z3, z4, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i38 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 43;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i38 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:139:0x032a  */
    /* JADX WARN: Code duplicated, block: B:140:0x032c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0339  */
    /* JADX WARN: Code duplicated, block: B:144:0x033b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[PHI: r2
  0x0041: PHI (r2v88 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v90 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x036d  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:159:0x0403  */
    /* JADX WARN: Code duplicated, block: B:160:0x0405  */
    /* JADX WARN: Code duplicated, block: B:166:0x0415  */
    /* JADX WARN: Code duplicated, block: B:169:0x0430  */
    /* JADX WARN: Code duplicated, block: B:170:0x043d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0453  */
    /* JADX WARN: Code duplicated, block: B:176:0x046c  */
    /* JADX WARN: Code duplicated, block: B:177:0x047f  */
    /* JADX WARN: Code duplicated, block: B:180:0x048b  */
    /* JADX WARN: Code duplicated, block: B:183:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:185:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:187:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:188:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:190:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:194:0x050a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0528  */
    /* JADX WARN: Code duplicated, block: B:199:0x0549  */
    /* JADX WARN: Code duplicated, block: B:201:0x0588  */
    /* JADX WARN: Code duplicated, block: B:203:0x0598  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v90 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void CameraView(boolean z, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, boolean z3, boolean z4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        getLogoDescription getlogodescription;
        Object obj;
        int i4;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        boolean zIconCompatParcelizer2;
        boolean z5;
        Object objComponentActivity2;
        boolean zIconCompatParcelizer3;
        boolean zIconCompatParcelizer4;
        boolean zIconCompatParcelizer5;
        boolean zIconCompatParcelizer6;
        boolean zIconCompatParcelizer7;
        boolean zIconCompatParcelizer8;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2;
        boolean zIconCompatParcelizer9;
        boolean z6;
        int i5;
        boolean z7;
        boolean z8;
        Object objComponentActivity3;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8;
        getLogoDescription getlogodescription2;
        Modifier.Companion companion;
        float f;
        boolean zSerializer;
        Object objComponentActivity4;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9;
        populate populateVar;
        ShortNewsContentCardView shortNewsContentCardView;
        boolean z9;
        Object objComponentActivity5;
        boolean z10;
        int i6;
        Object objComponentActivity6;
        Modifier modifier3;
        Modifier modifierPointerInput;
        Object objComponentActivity7;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate10;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate11;
        onViewAttachedToWindow onviewattachedtowindow;
        Object objComponentActivity8;
        onViewAttachedToWindow onviewattachedtowindow2;
        FillElement fillElement;
        Alignment.Companion companion2;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        boolean zIconCompatParcelizer10;
        Object objComponentActivity9;
        Object objComponentActivity10;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = RatingCompat + 83;
        MediaSessionCompatResultReceiverWrapper = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1339977523);
            if ((i & 93) == 0) {
                if (getpostalcode.write(z)) {
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
            getpostalcode.MediaSessionCompatQueueItem(1339977523);
            if ((i & 6) == 0) {
                if (getpostalcode.write(z)) {
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
            if (getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener)) {
                int i12 = RatingCompat + 21;
                MediaSessionCompatResultReceiverWrapper = i12 % Fields.SpotShadowColor;
                i9 = i12 % 2 == 0 ? 72 : 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj2 = null;
        if ((i & 3072) == 0) {
            int i13 = RatingCompat + 31;
            MediaSessionCompatResultReceiverWrapper = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode2.write(z2);
                obj2.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.write(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i14 = MediaSessionCompatResultReceiverWrapper + 111;
            RatingCompat = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (!getpostalcode2.write(z3)) {
                i8 = 8192;
            } else {
                int i16 = RatingCompat + 55;
                MediaSessionCompatResultReceiverWrapper = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i8 = Fields.Clip;
            }
            i3 |= i8;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.write(z4) ? Fields.RenderEffect : 65536;
        }
        int i18 = i3 | 1572864;
        if (getpostalcode2.write(i18 & 1, (599187 & i18) != 599186)) {
            int i19 = RatingCompat + 81;
            MediaSessionCompatResultReceiverWrapper = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            Modifier.Companion companion4 = Modifier.Companion;
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode2.write((getNewPassword) setInternalPaintui_graphics.write);
            Object objComponentActivity11 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity11 == androidContentCaptureManager) {
                objComponentActivity11 = new getCameraProvider(0).IconCompatParcelizer();
                getpostalcode2.write(objComponentActivity11);
            }
            AuthenticatorUtils authenticatorUtils = (AuthenticatorUtils) objComponentActivity11;
            authenticatorUtils.getClass();
            Object objComponentActivity12 = getpostalcode2.ComponentActivity();
            if (objComponentActivity12 == androidContentCaptureManager) {
                objComponentActivity12 = new AndroidEdgeEffectOverscrollEffect(context);
                getpostalcode2.write(objComponentActivity12);
            }
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect3 = (AndroidEdgeEffectOverscrollEffect) objComponentActivity12;
            Object objComponentActivity13 = getpostalcode2.ComponentActivity();
            if (objComponentActivity13 == androidContentCaptureManager) {
                objComponentActivity13 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity13);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate12 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity13;
            Object objComponentActivity14 = getpostalcode2.ComponentActivity();
            if (objComponentActivity14 == androidContentCaptureManager) {
                objComponentActivity14 = getPersonFullName.RemoteActionCompatParcelizer(1.0f);
                getpostalcode2.write(objComponentActivity14);
            }
            populate populateVar2 = (populate) objComponentActivity14;
            Object objComponentActivity15 = getpostalcode2.ComponentActivity();
            if (objComponentActivity15 == androidContentCaptureManager) {
                objComponentActivity15 = CompositionKt.RemoteActionCompatParcelizer(SmallPersistentVector.RemoteActionCompatParcelizer);
                getpostalcode2.write(objComponentActivity15);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate13 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity15;
            Object objComponentActivity16 = getpostalcode2.ComponentActivity();
            if (objComponentActivity16 == androidContentCaptureManager) {
                objComponentActivity16 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity16);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate14 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity16;
            Object objComponentActivity17 = getpostalcode2.ComponentActivity();
            if (objComponentActivity17 == androidContentCaptureManager) {
                objComponentActivity17 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity17);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate15 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity17;
            Object objComponentActivity18 = getpostalcode2.ComponentActivity();
            if (objComponentActivity18 == androidContentCaptureManager) {
                objComponentActivity18 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity18);
            }
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity18;
            updateTextLayoutResult updatetextlayoutresult = (updateTextLayoutResult) populateViewStructure_androidKtpopulate14.getValue();
            if (updatetextlayoutresult == null || (getlogodescription = updatetextlayoutresult.IconCompatParcelizer) == null) {
                getlogodescription = getLogoDescription.serializer;
                getlogodescription.getClass();
            }
            updateTextLayoutResult updatetextlayoutresult2 = (updateTextLayoutResult) populateViewStructure_androidKtpopulate14.getValue();
            float f2 = updatetextlayoutresult2 != null ? updatetextlayoutresult2.serializer : 1.0f;
            Object objComponentActivity19 = getpostalcode2.ComponentActivity();
            if (objComponentActivity19 == androidContentCaptureManager) {
                objComponentActivity19 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity19);
            }
            getPlatformAndroidManager getplatformandroidmanager2 = (getPlatformAndroidManager) objComponentActivity19;
            Object objComponentActivity20 = getpostalcode2.ComponentActivity();
            if (objComponentActivity20 == androidContentCaptureManager) {
                objComponentActivity20 = new TextMeasurerHelperKt(getplatformandroidmanager2, 4);
                getpostalcode2.write(objComponentActivity20);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity20, getpostalcode2, 390}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
            Object objComponentActivity21 = getpostalcode2.ComponentActivity();
            if (objComponentActivity21 == androidContentCaptureManager) {
                objComponentActivity21 = CompositionKt.read(0);
                getpostalcode2.write(objComponentActivity21);
            }
            getPlatformAndroidManager getplatformandroidmanager3 = (getPlatformAndroidManager) objComponentActivity21;
            Object objComponentActivity22 = getpostalcode2.ComponentActivity();
            if (objComponentActivity22 == androidContentCaptureManager) {
                objComponentActivity22 = CompositionKt.serializer(new CommitTextCommand(getplatformandroidmanager3, 0));
                getpostalcode2.write(objComponentActivity22);
            }
            onViewAttachedToWindow onviewattachedtowindow3 = (onViewAttachedToWindow) objComponentActivity22;
            Object objComponentActivity23 = getpostalcode2.ComponentActivity();
            if (objComponentActivity23 == androidContentCaptureManager) {
                obj = new minIntrinsicWidth[1];
                getpostalcode2.write(obj);
            } else {
                obj = objComponentActivity23;
            }
            minIntrinsicWidth[] minintrinsicwidthArr = (minIntrinsicWidth[]) obj;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(Boolean.valueOf(z4), getpostalcode2);
            Object objComponentActivity24 = getpostalcode2.ComponentActivity();
            if (objComponentActivity24 == androidContentCaptureManager) {
                objComponentActivity24 = new CursorAnchorInfoApi33Helper(context, getplatformandroidmanager3);
                getpostalcode2.write(objComponentActivity24);
            }
            CursorAnchorInfoApi33Helper cursorAnchorInfoApi33Helper = (CursorAnchorInfoApi33Helper) objComponentActivity24;
            int iIntValue = ((Number) onviewattachedtowindow3.getValue()).intValue();
            boolean zIconCompatParcelizer11 = getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
            Object objComponentActivity25 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer11) {
                i4 = i18;
                androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect3;
            } else {
                i4 = i18;
                int i21 = MediaSessionCompatResultReceiverWrapper + 73;
                androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect3;
                RatingCompat = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    int i22 = 58 / 0;
                    if (objComponentActivity25 == androidContentCaptureManager) {
                    }
                } else if (objComponentActivity25 == androidContentCaptureManager) {
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Integer.valueOf(iIntValue), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity25);
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(cursorAnchorInfoApi33Helper);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new BarcodeAnalyzer$$ExternalSyntheticLambda0(16, cursorAnchorInfoApi33Helper);
                    getpostalcode2.write(objComponentActivity);
                }
                RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{cursorAnchorInfoApi33Helper, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 0}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
                zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr);
                z5 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (!(zIconCompatParcelizer2 | z5) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new getCacheable(minintrinsicwidthArr, populateViewStructure_androidKtpopulate7Serializer, 0);
                    getpostalcode2.write(objComponentActivity2);
                }
                getPhoneNumberNational.serializer(createfromparcel, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
                zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(context);
                zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr);
                zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(getlogodescription);
                zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(accessisrendernodecompatiblecp);
                zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(authenticatorUtils);
                zIconCompatParcelizer8 = getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
                androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
                zIconCompatParcelizer9 = getpostalcode2.IconCompatParcelizer(androidEdgeEffectOverscrollEffect2);
                if ((i4 & 57344) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i5 = i4;
                if ((i5 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if ((!(z6 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | zIconCompatParcelizer8 | zIconCompatParcelizer9 | z7) && !z8) || objComponentActivity3 == androidContentCaptureManager) {
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate14;
                    populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate13;
                    getlogodescription2 = getlogodescription;
                    getpostalcode3 = getpostalcode2;
                    companion = companion4;
                    InAppCameraWithTagsKt$CameraView$5$1 inAppCameraWithTagsKt$CameraView$5$1 = new InAppCameraWithTagsKt$CameraView$5$1(context, minintrinsicwidthArr, getlogodescription, accessisrendernodecompatiblecp, authenticatorUtils, setnavigationonclicklistener, androidEdgeEffectOverscrollEffect2, z3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate12, populateViewStructure_androidKtpopulate15, populateViewStructure_androidKtpopulate8, populateViewStructure_androidKtpopulate7, populateViewStructure_androidKtpopulate7Serializer, null);
                    getpostalcode3.write(inAppCameraWithTagsKt$CameraView$5$1);
                    objComponentActivity3 = inAppCameraWithTagsKt$CameraView$5$1;
                } else {
                    companion = companion4;
                    getlogodescription2 = getlogodescription;
                    getpostalcode3 = getpostalcode2;
                    populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate13;
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate14;
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, getlogodescription2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
                getContentInsetStart getcontentinsetstart = (getContentInsetStart) populateViewStructure_androidKtpopulate12.getValue();
                int iSerializer = r28.serializer();
                int iSerializer2 = ((onHideTranslationui) getplatformandroidmanager2).serializer();
                f = f2;
                zSerializer = getpostalcode3.serializer(f);
                objComponentActivity4 = getpostalcode3.ComponentActivity();
                if (!zSerializer || objComponentActivity4 == androidContentCaptureManager) {
                    populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate12;
                    populateVar = r27;
                    shortNewsContentCardView = null;
                    objComponentActivity4 = new InAppCameraWithTagsKt$CameraView$6$1(f, populateViewStructure_androidKtpopulate9, populateVar, null);
                    getpostalcode3.write(objComponentActivity4);
                } else {
                    populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate12;
                    populateVar = populateVar2;
                    shortNewsContentCardView = null;
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getcontentinsetstart, Integer.valueOf(iSerializer), Integer.valueOf(iSerializer2), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, getpostalcode3);
                if ((i5 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objComponentActivity5 = getpostalcode3.ComponentActivity();
                if (!z9 || objComponentActivity5 == androidContentCaptureManager) {
                    z10 = false;
                    objComponentActivity5 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate9, shortNewsContentCardView, null == true ? 1 : 0);
                    getpostalcode3.write(objComponentActivity5);
                } else {
                    z10 = false;
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
                i6 = 1;
                if (!z2) {
                    getpostalcode3.serializer(1852200023);
                    getpostalcode3.IconCompatParcelizer(z10);
                    modifierPointerInput = companion;
                    modifier3 = modifierPointerInput;
                } else {
                    int i23 = MediaSessionCompatResultReceiverWrapper + 43;
                    RatingCompat = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    getpostalcode3.serializer(1851653245);
                    objComponentActivity6 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(populateViewStructure_androidKtpopulate9, i6, populateVar);
                        getpostalcode3.write(objComponentActivity6);
                    }
                    modifier3 = companion;
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier3, createfromparcel, (PointerInputEventHandler) objComponentActivity6);
                    getpostalcode3.IconCompatParcelizer(z10);
                }
                objComponentActivity7 = getpostalcode3.ComponentActivity();
                if (objComponentActivity7 == androidContentCaptureManager) {
                    populateViewStructure_androidKtpopulate10 = populateViewStructure_androidKtpopulate7;
                    populateViewStructure_androidKtpopulate11 = populateViewStructure_androidKtpopulate8;
                    objComponentActivity7 = CompositionKt.serializer(new n$$ExternalSyntheticLambda3(populateViewStructure_androidKtpopulate11, populateViewStructure_androidKtpopulate10, populateVar, 18));
                    getpostalcode3.write(objComponentActivity7);
                } else {
                    populateViewStructure_androidKtpopulate10 = populateViewStructure_androidKtpopulate7;
                    populateViewStructure_androidKtpopulate11 = populateViewStructure_androidKtpopulate8;
                }
                onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity7;
                objComponentActivity8 = getpostalcode3.ComponentActivity();
                if (objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = CompositionKt.serializer(new Braze$$ExternalSyntheticLambda9(populateViewStructure_androidKtpopulate10, populateViewStructure_androidKtpopulate11, onviewattachedtowindow, populateVar, 6));
                    getpostalcode3.write(objComponentActivity8);
                }
                onviewattachedtowindow2 = (onViewAttachedToWindow) objComponentActivity8;
                fillElement = SizeKt.read;
                Modifier modifierThen = modifier3.then(fillElement);
                companion2 = Alignment.Companion;
                measurePolicy = BoxKt.read(companion2.getTopStart(), z10);
                iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierThen);
                companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
                if (getpostalcode3.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    i7 = MediaSessionCompatResultReceiverWrapper + 73;
                    RatingCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        getpostalcode3.serializer(constructor);
                        throw null;
                    }
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                zIconCompatParcelizer10 = getpostalcode3.IconCompatParcelizer(androidEdgeEffectOverscrollEffect2);
                objComponentActivity9 = getpostalcode3.ComponentActivity();
                if (zIconCompatParcelizer10 || objComponentActivity9 == androidContentCaptureManager) {
                    objComponentActivity9 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect2, 1);
                    getpostalcode3.write(objComponentActivity9);
                }
                AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, modifier3.then(fillElement).then(modifierPointerInput), null, getpostalcode3, 0, 4);
                if (z3) {
                    getpostalcode3.serializer(1635075879);
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate11.getValue();
                    String str = (String) onviewattachedtowindow.getValue();
                    String str2 = (String) onviewattachedtowindow2.getValue();
                    objComponentActivity10 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity10 == androidContentCaptureManager) {
                        objComponentActivity10 = new SessionDao_Impl$$ExternalSyntheticLambda1(populateViewStructure_androidKtpopulate10, 17, getplatformandroidmanager);
                        getpostalcode3.write(objComponentActivity10);
                        int i25 = MediaSessionCompatResultReceiverWrapper + 93;
                        RatingCompat = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                    }
                    ZoomControlKt.ZoomControl(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10, PaddingKt.m74paddingqDBjuR0$default(BoxScopeInstance.serializer.align(modifier3, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3673constructorimpl(read + Dimensions.getAnimatedVisibility), 7), getpostalcode3, 3072);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(1635662089);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                getpostalcode3.IconCompatParcelizer(true);
                modifier2 = modifier3;
            }
            objComponentActivity25 = new InAppCameraWithTagsKt$CameraView$2$1(setnavigationonclicklistener, onviewattachedtowindow3, null, 0);
            getpostalcode2.write(objComponentActivity25);
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Integer.valueOf(iIntValue), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity25);
            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(cursorAnchorInfoApi33Helper);
            objComponentActivity = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity = new BarcodeAnalyzer$$ExternalSyntheticLambda0(16, cursorAnchorInfoApi33Helper);
                getpostalcode2.write(objComponentActivity);
            } else {
                objComponentActivity = new BarcodeAnalyzer$$ExternalSyntheticLambda0(16, cursorAnchorInfoApi33Helper);
                getpostalcode2.write(objComponentActivity);
            }
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{cursorAnchorInfoApi33Helper, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 0}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
            zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr);
            z5 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (!zIconCompatParcelizer2 && !z5) {
                objComponentActivity2 = new getCacheable(minintrinsicwidthArr, populateViewStructure_androidKtpopulate7Serializer, 0);
                getpostalcode2.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new getCacheable(minintrinsicwidthArr, populateViewStructure_androidKtpopulate7Serializer, 0);
                getpostalcode2.write(objComponentActivity2);
            }
            getPhoneNumberNational.serializer(createfromparcel, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
            zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(context);
            zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(minintrinsicwidthArr);
            zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(getlogodescription);
            zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(accessisrendernodecompatiblecp);
            zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(authenticatorUtils);
            zIconCompatParcelizer8 = getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener);
            androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
            zIconCompatParcelizer9 = getpostalcode2.IconCompatParcelizer(androidEdgeEffectOverscrollEffect2);
            if ((i4 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            i5 = i4;
            if ((i5 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (!(z6 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5 | zIconCompatParcelizer6 | zIconCompatParcelizer7 | zIconCompatParcelizer8 | zIconCompatParcelizer9 | z7) && !z8) {
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate14;
                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate13;
                getlogodescription2 = getlogodescription;
                getpostalcode3 = getpostalcode2;
                companion = companion4;
                InAppCameraWithTagsKt$CameraView$5$1 inAppCameraWithTagsKt$CameraView$5$2 = new InAppCameraWithTagsKt$CameraView$5$1(context, minintrinsicwidthArr, getlogodescription, accessisrendernodecompatiblecp, authenticatorUtils, setnavigationonclicklistener, androidEdgeEffectOverscrollEffect2, z3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate12, populateViewStructure_androidKtpopulate15, populateViewStructure_androidKtpopulate8, populateViewStructure_androidKtpopulate7, populateViewStructure_androidKtpopulate7Serializer, null);
                getpostalcode3.write(inAppCameraWithTagsKt$CameraView$5$2);
                objComponentActivity3 = inAppCameraWithTagsKt$CameraView$5$2;
            } else {
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate14;
                populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate13;
                getlogodescription2 = getlogodescription;
                getpostalcode3 = getpostalcode2;
                companion = companion4;
                InAppCameraWithTagsKt$CameraView$5$1 inAppCameraWithTagsKt$CameraView$5$3 = new InAppCameraWithTagsKt$CameraView$5$1(context, minintrinsicwidthArr, getlogodescription, accessisrendernodecompatiblecp, authenticatorUtils, setnavigationonclicklistener, androidEdgeEffectOverscrollEffect2, z3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate12, populateViewStructure_androidKtpopulate15, populateViewStructure_androidKtpopulate8, populateViewStructure_androidKtpopulate7, populateViewStructure_androidKtpopulate7Serializer, null);
                getpostalcode3.write(inAppCameraWithTagsKt$CameraView$5$3);
                objComponentActivity3 = inAppCameraWithTagsKt$CameraView$5$3;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, getlogodescription2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            getContentInsetStart getcontentinsetstart2 = (getContentInsetStart) populateViewStructure_androidKtpopulate12.getValue();
            int iSerializer3 = r28.serializer();
            int iSerializer4 = ((onHideTranslationui) getplatformandroidmanager2).serializer();
            f = f2;
            zSerializer = getpostalcode3.serializer(f);
            objComponentActivity4 = getpostalcode3.ComponentActivity();
            if (zSerializer) {
                populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate12;
                populateVar = r27;
                shortNewsContentCardView = null;
                objComponentActivity4 = new InAppCameraWithTagsKt$CameraView$6$1(f, populateViewStructure_androidKtpopulate9, populateVar, null);
                getpostalcode3.write(objComponentActivity4);
            } else {
                populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate12;
                populateVar = r27;
                shortNewsContentCardView = null;
                objComponentActivity4 = new InAppCameraWithTagsKt$CameraView$6$1(f, populateViewStructure_androidKtpopulate9, populateVar, null);
                getpostalcode3.write(objComponentActivity4);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getcontentinsetstart2, Integer.valueOf(iSerializer3), Integer.valueOf(iSerializer4), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, getpostalcode3);
            if ((i5 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            objComponentActivity5 = getpostalcode3.ComponentActivity();
            if (z9) {
                z10 = false;
                objComponentActivity5 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate9, shortNewsContentCardView, null == true ? 1 : 0);
                getpostalcode3.write(objComponentActivity5);
            } else {
                z10 = false;
                objComponentActivity5 = new InAppCameraWithTagsKt$CameraView$7$1(z, populateViewStructure_androidKtpopulate9, shortNewsContentCardView, null == true ? 1 : 0);
                getpostalcode3.write(objComponentActivity5);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode3, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            i6 = 1;
            if (!z2) {
                getpostalcode3.serializer(1852200023);
                getpostalcode3.IconCompatParcelizer(z10);
                modifierPointerInput = companion;
                modifier3 = modifierPointerInput;
            } else {
                int i27 = MediaSessionCompatResultReceiverWrapper + 43;
                RatingCompat = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                getpostalcode3.serializer(1851653245);
                objComponentActivity6 = getpostalcode3.ComponentActivity();
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(populateViewStructure_androidKtpopulate9, i6, populateVar);
                    getpostalcode3.write(objComponentActivity6);
                }
                modifier3 = companion;
                modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier3, createfromparcel, (PointerInputEventHandler) objComponentActivity6);
                getpostalcode3.IconCompatParcelizer(z10);
            }
            objComponentActivity7 = getpostalcode3.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                populateViewStructure_androidKtpopulate10 = populateViewStructure_androidKtpopulate7;
                populateViewStructure_androidKtpopulate11 = populateViewStructure_androidKtpopulate8;
                objComponentActivity7 = CompositionKt.serializer(new n$$ExternalSyntheticLambda3(populateViewStructure_androidKtpopulate11, populateViewStructure_androidKtpopulate10, populateVar, 18));
                getpostalcode3.write(objComponentActivity7);
            } else {
                populateViewStructure_androidKtpopulate10 = populateViewStructure_androidKtpopulate7;
                populateViewStructure_androidKtpopulate11 = populateViewStructure_androidKtpopulate8;
            }
            onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity7;
            objComponentActivity8 = getpostalcode3.ComponentActivity();
            if (objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = CompositionKt.serializer(new Braze$$ExternalSyntheticLambda9(populateViewStructure_androidKtpopulate10, populateViewStructure_androidKtpopulate11, onviewattachedtowindow, populateVar, 6));
                getpostalcode3.write(objComponentActivity8);
            }
            onviewattachedtowindow2 = (onViewAttachedToWindow) objComponentActivity8;
            fillElement = SizeKt.read;
            Modifier modifierThen2 = modifier3.then(fillElement);
            companion2 = Alignment.Companion;
            measurePolicy = BoxKt.read(companion2.getTopStart(), z10);
            iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierThen2);
            companion3 = ComposeUiNode.Companion;
            constructor = companion3.getConstructor();
            if (getpostalcode3.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                i7 = MediaSessionCompatResultReceiverWrapper + 73;
                RatingCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    getpostalcode3.serializer(constructor);
                    throw null;
                }
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            zIconCompatParcelizer10 = getpostalcode3.IconCompatParcelizer(androidEdgeEffectOverscrollEffect2);
            objComponentActivity9 = getpostalcode3.ComponentActivity();
            if (zIconCompatParcelizer10) {
                objComponentActivity9 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect2, 1);
                getpostalcode3.write(objComponentActivity9);
            } else {
                objComponentActivity9 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect2, 1);
                getpostalcode3.write(objComponentActivity9);
            }
            AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, modifier3.then(fillElement).then(modifierPointerInput), null, getpostalcode3, 0, 4);
            if (z3) {
                getpostalcode3.serializer(1635075879);
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate11.getValue();
                String str3 = (String) onviewattachedtowindow.getValue();
                String str4 = (String) onviewattachedtowindow2.getValue();
                objComponentActivity10 = getpostalcode3.ComponentActivity();
                if (objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new SessionDao_Impl$$ExternalSyntheticLambda1(populateViewStructure_androidKtpopulate10, 17, getplatformandroidmanager);
                    getpostalcode3.write(objComponentActivity10);
                    int i29 = MediaSessionCompatResultReceiverWrapper + 93;
                    RatingCompat = i29 % Fields.SpotShadowColor;
                    int i210 = i29 % 2;
                }
                ZoomControlKt.ZoomControl(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, str3, str4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10, PaddingKt.m74paddingqDBjuR0$default(BoxScopeInstance.serializer.align(modifier3, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m3673constructorimpl(read + Dimensions.getAnimatedVisibility), 7), getpostalcode3, 3072);
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                getpostalcode3.serializer(1635662089);
                getpostalcode3.IconCompatParcelizer(false);
            }
            getpostalcode3.IconCompatParcelizer(true);
            modifier2 = modifier3;
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AdjustBridgeInstance8(z, setnavigationonclicklistener, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z2, z3, z4, modifier2, i);
        }
    }
}
