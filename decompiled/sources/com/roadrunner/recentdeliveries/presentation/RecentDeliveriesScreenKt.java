package com.roadrunner.recentdeliveries.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getOnFill;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.resumeSendingI;
import o.sendLicenseVerificationDataI;
import o.sendPreinstallReferrerI;
import o.setEnabledI;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RecentDeliveriesScreenKt {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:14:0x0067  */
    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    public static final void RecentDeliveriesScreen(final sendLicenseVerificationDataI sendlicenseverificationdatai, final boolean z, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = write + 105;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        sendlicenseverificationdatai.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1948080001);
        if ((i & 6) == 0) {
            int i10 = read + 59;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                if (getpostalcode2.read(sendlicenseverificationdatai)) {
                    i5 = read + 23;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i6 = 5;
                    } else {
                        i6 = 4;
                    }
                } else {
                    i6 = 2;
                }
            } else {
                int i11 = 5 / 0;
                if (getpostalcode2.read(sendlicenseverificationdatai)) {
                    i5 = read + 23;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i6 = 5;
                    } else {
                        i6 = 4;
                    }
                } else {
                    i6 = 2;
                }
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.write(z)) {
                int i12 = read + 85;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ^ true ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            int i14 = write + 25;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            int i16 = read + 83;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm4) ? 8388608 : 4194304;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm4);
                throw null;
            }
        }
        if ((100663296 & i) == 0) {
            int i17 = read + 11;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 536870912 : 268435456;
        }
        if (getpostalcode2.write(i3 & 1, ((306783379 & i3) == 306783378 && ((i2 | 6) & 3) == 2) ? false : true)) {
            Modifier.Companion companion = Modifier.Companion;
            FillElement fillElement = SizeKt.read;
            Modifier modifierRemoteActionCompatParcelizer = AspectRatioKt.RemoteActionCompatParcelizer(AspectRatioKt.read(companion.then(fillElement)));
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read != null) {
                int i19 = write + 35;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                getOnFill getonfillRemoteActionCompatParcelizer = PullToRefreshKt.RemoteActionCompatParcelizer(getpostalcode2);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                setEnabledI setenabledi = setEnabledI.serializer;
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.valueOf(sendlicenseverificationdatai.equals(setenabledi)));
                    getpostalcode2.write(objComponentActivity);
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
                populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(sendlicenseverificationdatai.equals(setenabledi)));
                HeaderKt.serializer(ZIndexModifierKt.zIndex(companion, 1.0f), StringResources_androidKt.stringResource(R.string.recent_deliveries_title, getpostalcode2, 0), 0L, ExtrasKt.write(-2090663709, new trigger(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, null, null, getpostalcode2, 24582, 236);
                boolean zBooleanValue = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
                Alignment topCenter = companion2.getTopCenter();
                Modifier modifierThen = companion.then(fillElement);
                boolean z2 = (i3 & 1879048192) == 536870912;
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7, 0);
                    getpostalcode2.write(objComponentActivity2);
                }
                getpostalcode = getpostalcode2;
                PullToRefreshKt.PullToRefreshBox(zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierThen, getonfillRemoteActionCompatParcelizer, topCenter, null, ExtrasKt.write(490574769, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.setAskingAttributionI
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int MediaSessionCompatResultReceiverWrapper = 1;

                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i21 = 2 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((IconButtonKt) obj).getClass();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                            setEnabledI setenabledi2 = setEnabledI.serializer;
                            sendLicenseVerificationDataI sendlicenseverificationdatai2 = sendlicenseverificationdatai;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sendlicenseverificationdatai2, setenabledi2}, getCieXyz.write())).booleanValue()) {
                                getpostalcode3.serializer(-1060705053);
                                LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(true, null, null, null, resetThirdPartySharingCoppaActivityStateI.RemoteActionCompatParcelizer, getpostalcode3, 24582, 14);
                                getpostalcode3.IconCompatParcelizer(false);
                            } else if (sendlicenseverificationdatai2 instanceof sendInstallReferrerI) {
                                getpostalcode3.serializer(-1060556656);
                                if (!((sendInstallReferrerI) sendlicenseverificationdatai2).read.write.isEmpty()) {
                                    getpostalcode3.serializer(-1059959472);
                                    LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(z, null, null, null, coil3.ExtrasKt.write(1984018942, new b8ExternalSyntheticLambda4(sendlicenseverificationdatai2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, 2), getpostalcode3), getpostalcode3, 24576, 14);
                                    getpostalcode3.IconCompatParcelizer(false);
                                } else {
                                    int i22 = MediaBrowserCompatMediaItem + 95;
                                    MediaSessionCompatResultReceiverWrapper = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i23 = i22 % 2;
                                    getpostalcode3.serializer(-1060512884);
                                    startForegroundTimerI.serializer(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.recent_deliveries_empty_content_title, getpostalcode3, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.recent_deliveries_empty_content_text, getpostalcode3, 0), null, PagerWrapperFlingBehavior.IconCompatParcelizer(androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read), PagerWrapperFlingBehavior.read(0, getpostalcode3, 1), false, 14), getpostalcode3, 384);
                                    getpostalcode3.IconCompatParcelizer(false);
                                }
                                getpostalcode3.IconCompatParcelizer(false);
                                int i24 = MediaBrowserCompatMediaItem + 89;
                                MediaSessionCompatResultReceiverWrapper = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i24 % 2 == 0) {
                                    int i25 = 5 % 2;
                                }
                            } else if (sendlicenseverificationdatai2 instanceof sendReftagReferrerI) {
                                getpostalcode3.serializer(-1059282401);
                                startForegroundTimerI.serializer(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.all_error_message, getpostalcode3, 0), ((sendReftagReferrerI) sendlicenseverificationdatai2).IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, PagerWrapperFlingBehavior.IconCompatParcelizer(androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read), PagerWrapperFlingBehavior.read(0, getpostalcode3, 1), false, 14), getpostalcode3, 0);
                                getpostalcode3.IconCompatParcelizer(false);
                            } else {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode3, -1004047188, false);
                            }
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, 1597824, 32);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new sendPreinstallReferrerI(sendlicenseverificationdatai, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, i2);
        }
    }
}
