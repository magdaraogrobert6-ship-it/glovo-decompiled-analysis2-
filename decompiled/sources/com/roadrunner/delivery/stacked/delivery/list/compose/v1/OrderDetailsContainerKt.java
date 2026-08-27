package com.roadrunner.delivery.stacked.delivery.list.compose.v1;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.roadrunner.delivery.stacked.delivery.list.compose.StackedDeliveryArrowButtonKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.WrapPreviewlambda0;
import o.accessgetFakeSavedStateRegistryOwnerp;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getSLookupTablesannotations;
import o.onContentCardDismissed;
import o.p7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E;
import o.scroll;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OrderDetailsContainerKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void OrderDetailsContainer(r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        r8lambdayigkjx4opgvyddqvttr8slptylq.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1378085825);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i5 = write + 119;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? (i & 8) == 0 : (i & GwiErrorCode.ALG_LIBRARY_NOT_EXIST) == 0) {
                zIconCompatParcelizer = getpostalcode.read(r8lambdayigkjx4opgvyddqvttr8slptylq);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdayigkjx4opgvyddqvttr8slptylq);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i6 = write + 111;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                i3 = i6 % 2 != 0 ? 25687 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
            int i7 = write + 95;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierThen = SizeKt.write(companion3, 1.0f).then(new show(0.9f, true));
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp = r8lambdayigkjx4opgvyddqvttr8slptylq.serializer;
                if (accessgetfakesavedstateregistryownerp == null) {
                    getpostalcode.serializer(-1002014247);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1002014246);
                    boolean z = !((i2 & 896) != 256);
                    boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && getpostalcode.IconCompatParcelizer(r8lambdayigkjx4opgvyddqvttr8slptylq));
                    boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(accessgetfakesavedstateregistryownerp);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z | z2 | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new n$$ExternalSyntheticLambda3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdayigkjx4opgvyddqvttr8slptylq, accessgetfakesavedstateregistryownerp, 25);
                        getpostalcode.write(objComponentActivity);
                    }
                    ExpandableButtonV1Kt.ExpandableButtonV1(accessgetfakesavedstateregistryownerp, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dimensions.setMenu, 7), getpostalcode, 8);
                    getpostalcode.IconCompatParcelizer(false);
                }
                List list = r8lambdayigkjx4opgvyddqvttr8slptylq.read;
                if (list != null) {
                    getpostalcode.serializer(-1001475900);
                    getSLookupTablesannotations.RemoteActionCompatParcelizer((r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E) onContentCardDismissed.read(list), null, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i9 = IconCompatParcelizer + 89;
                    write = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        getpostalcode.serializer(-1001475901);
                        getpostalcode.IconCompatParcelizer(true);
                    } else {
                        getpostalcode.serializer(-1001475901);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
                WrapPreviewlambda0 wrapPreviewlambda0 = r8lambdayigkjx4opgvyddqvttr8slptylq.RatingCompat;
                if (wrapPreviewlambda0 == null) {
                    int i10 = write + 57;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(-1001289498);
                    getpostalcode.IconCompatParcelizer(false);
                    int i12 = IconCompatParcelizer + 61;
                    write = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        int i13 = 5 % 2;
                    }
                } else {
                    getpostalcode.serializer(-1001289497);
                    scroll.serializer(wrapPreviewlambda0, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i14 = write + 57;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.IconCompatParcelizer(true);
                if (r8lambdayigkjx4opgvyddqvttr8slptylq.IconCompatParcelizer) {
                    getpostalcode.serializer(2086235895);
                    StackedDeliveryArrowButtonKt.StackedDeliveryArrowButton(r8lambdayigkjx4opgvyddqvttr8slptylq.write, companion3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i2 << 3) & 896) | 48);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(2086433861);
                    getpostalcode.IconCompatParcelizer(false);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) r8lambdayigkjx4opgvyddqvttr8slptylq, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 3);
        }
    }
}
