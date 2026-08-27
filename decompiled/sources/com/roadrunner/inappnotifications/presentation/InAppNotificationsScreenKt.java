package com.roadrunner.inappnotifications.presentation;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RecyclerViewLayoutManager;
import o.RecyclerViewRecycler;
import o.ShortNewsContentCardView;
import o.computeVerticalScrollExtent;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.offsetChildrenHorizontal;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.show;
import o.stopScroll;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InAppNotificationsScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void InAppNotificationsScreen(RecyclerViewLayoutManager recyclerViewLayoutManager, stopScroll stopscroll, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        recyclerViewLayoutManager.getClass();
        stopscroll.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1175586867);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(recyclerViewLayoutManager)) {
                int i9 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(stopscroll) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i11 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            int i13 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (!(!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1))) {
                int i15 = RemoteActionCompatParcelizer + 59;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i4 = Fields.RenderEffect;
                if (i16 != 0) {
                    int i17 = 13 / 0;
                }
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            int i18 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                i3 = 1048576;
            } else {
                int i20 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i3 = Fields.BlendMode;
            }
            i2 |= i3;
        }
        int i22 = i2 | 12582912;
        if (getpostalcode2.write(i22 & 1, (4793491 & i22) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion;
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z2 = (i22 & 112) == 32;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(context);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            boolean z3 = z2 | zIconCompatParcelizer;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new GetNestScope$invoke$3(stopscroll, context, shortNewsContentCardView, 11);
                getpostalcode2.write(objComponentActivity);
            }
            int i23 = i22 >> 3;
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, stopscroll, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = companion.then(fillElement);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (recyclerViewLayoutManager.read()) {
                z = false;
                getpostalcode2.serializer(-677616769);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-677958885);
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, null, ExtrasKt.write(-623793306, new DefaultLazyKey(17, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), getpostalcode2), null, null, getpostalcode2, 1572864, 447);
                z = false;
                getpostalcode2.IconCompatParcelizer(false);
            }
            if (!(recyclerViewLayoutManager instanceof RecyclerViewRecycler)) {
                getpostalcode = getpostalcode2;
                if (!recyclerViewLayoutManager.equals(offsetChildrenHorizontal.RemoteActionCompatParcelizer)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
            } else if (recyclerViewLayoutManager.read()) {
                int i24 = IconCompatParcelizer + 39;
                RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                getpostalcode2.serializer(-677522095);
                boolean z4 = z;
                getpostalcode = getpostalcode2;
                InAppNotificationLayoutComponentsKt.AnimationPage(((RecyclerViewRecycler) recyclerViewLayoutManager).serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion.then(fillElement), r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getpostalcode2, (i23 & 7168) | (i23 & 112) | 196608 | (i23 & 896) | (57344 & i23) | (i22 & 3670016));
                getpostalcode.IconCompatParcelizer(z4);
            } else {
                boolean z5 = z;
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-677121978);
                InAppNotificationLayoutComponentsKt.Page(((RecyclerViewRecycler) recyclerViewLayoutManager).serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, SizeKt.write(companion, 1.0f).then(new show(1.0f, true)), getpostalcode, i23 & 65520);
                getpostalcode.IconCompatParcelizer(z5);
            }
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(recyclerViewLayoutManager, stopscroll, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier2, i);
        }
    }
}
