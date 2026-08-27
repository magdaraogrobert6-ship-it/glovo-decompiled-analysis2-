package com.roadrunner.home.nest.riderstatistics;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation.CountryCodePickerBottomSheetKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import java.util.List;
import o.AnchoredDraggableKtanimateTo2;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.Preference;
import o.TextFieldDefaults;
import o.createFromParcel;
import o.expand;
import o.getBirthDateFull;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeGlobalCallbackParameters;
import o.removeGlobalPartnerParameterI;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ List RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = list;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0217  */
    /* JADX WARN: Code duplicated, block: B:83:0x0228  */
    /* JADX WARN: Code duplicated, block: B:85:0x022d  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        createFromParcel createfromparcel;
        Object obj5;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        List list;
        int i;
        AnchoredDraggableKtanimateTo2 anchoredDraggableKtanimateTo2;
        int iIntValue;
        getBirthDateFull getbirthdatefull;
        int iIntValue2;
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Preference preference;
        Modifier.Companion companion;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i3;
        int i4;
        int i5;
        int i6;
        AnchoredDraggableKtanimateTo2 anchoredDraggableKtanimateTo3;
        int iIntValue3;
        getBirthDateFull getbirthdatefull2;
        int iIntValue4;
        int i7;
        boolean z2;
        getPostalCode getpostalcode2;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = MediaSessionCompatQueueItem + 99;
        write = i11 % Fields.SpotShadowColor;
        int i12 = 4;
        Object obj6 = null;
        if (i11 % 2 == 0) {
            int i13 = this.serializer;
            createfromparcel = createFromParcel.INSTANCE;
            obj5 = this.read;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
            list = this.RemoteActionCompatParcelizer;
            if (i13 == 0) {
                i = 4;
                anchoredDraggableKtanimateTo2 = (AnchoredDraggableKtanimateTo2) obj;
                iIntValue = ((Number) obj2).intValue();
                getbirthdatefull = (getBirthDateFull) obj3;
                iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    if (!((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2)) {
                        i = 2;
                    }
                    i2 = iIntValue2 | i;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    if (!((getPostalCode) getbirthdatefull).read(iIntValue)) {
                        i5 = 16;
                    } else {
                        i4 = write + 117;
                        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            i5 = 37;
                        } else {
                            i5 = 32;
                        }
                    }
                    i2 |= i5;
                    i6 = write + 17;
                    MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i14 = 4 % 3;
                    }
                }
                if ((i2 & 147) != 146) {
                    i3 = MediaSessionCompatQueueItem + 17;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(i2 & 1, z)) {
                    int i15 = write + 53;
                    MediaSessionCompatQueueItem = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    preference = (Preference) list.get(iIntValue);
                    getpostalcode.serializer(1117979980);
                    companion = Modifier.Companion;
                    Modifier modifierHeight = IntrinsicKt.height(companion, expand.Min);
                    supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight);
                    companion2 = ComposeUiNode.Companion;
                    constructor = companion2.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    RiderStatisticsContentKt.RiderStatistic(preference, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, 0);
                    if (iIntValue < SQLite.write((List) obj5)) {
                        getpostalcode.serializer(1273974996);
                        Object[] objArr = {getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setActionBarVisibilityCallback)};
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                        DividerKt.serializer(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(companion, 0.0f, Dimensions.setSplitBackground, 1));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(1274160469);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            }
            anchoredDraggableKtanimateTo3 = (AnchoredDraggableKtanimateTo2) obj;
            iIntValue3 = ((Number) obj2).intValue();
            getbirthdatefull2 = (getBirthDateFull) obj3;
            iIntValue4 = ((Number) obj4).intValue();
            if ((iIntValue4 & 6) == 0) {
                if (!((getPostalCode) getbirthdatefull2).read(anchoredDraggableKtanimateTo3)) {
                    i12 = 2;
                }
                i7 = iIntValue4 | i12;
            } else {
                i7 = iIntValue4;
            }
            if ((iIntValue4 & 48) == 0) {
                i8 = MediaSessionCompatQueueItem + 17;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    ((getPostalCode) getbirthdatefull2).read(iIntValue3);
                    obj6.hashCode();
                    throw null;
                }
                if (((getPostalCode) getbirthdatefull2).read(iIntValue3)) {
                    int i17 = write + 65;
                    MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    i9 = 32;
                } else {
                    i9 = 16;
                }
                i7 |= i9;
            }
            if ((i7 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(i7 & 1, z2)) {
                removeGlobalPartnerParameterI removeglobalpartnerparameteri = (removeGlobalPartnerParameterI) list.get(iIntValue3);
                getpostalcode2.serializer(-1126412720);
                CountryCodePickerBottomSheetKt.CountryCodeRow(removeglobalpartnerparameteri, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode2, 0);
                if (iIntValue3 < SQLite.write(((removeGlobalCallbackParameters) obj5).RemoteActionCompatParcelizer)) {
                    getpostalcode2.serializer(-1126240702);
                    DividerKt.read(0.0f, 0, 6, 0L, getpostalcode2, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getAnimatedVisibility, 0.0f, 2));
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-1126081176);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        int i19 = this.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        obj5 = this.read;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        list = this.RemoteActionCompatParcelizer;
        if (i19 != 0) {
            i12 = 3;
            anchoredDraggableKtanimateTo3 = (AnchoredDraggableKtanimateTo2) obj;
            iIntValue3 = ((Number) obj2).intValue();
            getbirthdatefull2 = (getBirthDateFull) obj3;
            iIntValue4 = ((Number) obj4).intValue();
            if ((iIntValue4 & 6) == 0) {
                if (!((getPostalCode) getbirthdatefull2).read(anchoredDraggableKtanimateTo3)) {
                    i12 = 2;
                }
                i7 = iIntValue4 | i12;
            } else {
                i7 = iIntValue4;
            }
            if ((iIntValue4 & 48) == 0) {
                i8 = MediaSessionCompatQueueItem + 17;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    ((getPostalCode) getbirthdatefull2).read(iIntValue3);
                    obj6.hashCode();
                    throw null;
                }
                if (((getPostalCode) getbirthdatefull2).read(iIntValue3)) {
                    int i110 = write + 65;
                    MediaSessionCompatQueueItem = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    i9 = 32;
                } else {
                    i9 = 16;
                }
                i7 |= i9;
            }
            if ((i7 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(i7 & 1, z2)) {
                removeGlobalPartnerParameterI removeglobalpartnerparameteri2 = (removeGlobalPartnerParameterI) list.get(iIntValue3);
                getpostalcode2.serializer(-1126412720);
                CountryCodePickerBottomSheetKt.CountryCodeRow(removeglobalpartnerparameteri2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode2, 0);
                if (iIntValue3 < SQLite.write(((removeGlobalCallbackParameters) obj5).RemoteActionCompatParcelizer)) {
                    getpostalcode2.serializer(-1126240702);
                    DividerKt.read(0.0f, 0, 6, 0L, getpostalcode2, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getAnimatedVisibility, 0.0f, 2));
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-1126081176);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        i = 3;
        anchoredDraggableKtanimateTo2 = (AnchoredDraggableKtanimateTo2) obj;
        iIntValue = ((Number) obj2).intValue();
        getbirthdatefull = (getBirthDateFull) obj3;
        iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            if (!((getPostalCode) getbirthdatefull).read(anchoredDraggableKtanimateTo2)) {
                i = 2;
            }
            i2 = iIntValue2 | i;
        } else {
            i2 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (!((getPostalCode) getbirthdatefull).read(iIntValue)) {
                i5 = 16;
            } else {
                i4 = write + 117;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    i5 = 37;
                } else {
                    i5 = 32;
                }
            }
            i2 |= i5;
            i6 = write + 17;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i112 = 4 % 3;
            }
        }
        if ((i2 & 147) != 146) {
            i3 = MediaSessionCompatQueueItem + 17;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i2 & 1, z)) {
            int i113 = write + 53;
            MediaSessionCompatQueueItem = i113 % Fields.SpotShadowColor;
            int i114 = i113 % 2;
            preference = (Preference) list.get(iIntValue);
            getpostalcode.serializer(1117979980);
            companion = Modifier.Companion;
            Modifier modifierHeight2 = IntrinsicKt.height(companion, expand.Min);
            supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            RiderStatisticsContentKt.RiderStatistic(preference, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, 0);
            if (iIntValue < SQLite.write((List) obj5)) {
                getpostalcode.serializer(1273974996);
                Object[] objArr2 = {getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setActionBarVisibilityCallback)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                DividerKt.serializer(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(companion, 0.0f, Dimensions.setSplitBackground, 1));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1274160469);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
