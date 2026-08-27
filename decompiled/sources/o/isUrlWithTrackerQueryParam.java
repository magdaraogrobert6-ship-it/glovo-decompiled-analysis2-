package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isUrlWithTrackerQueryParam implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ String serializer;

    public /* synthetic */ isUrlWithTrackerQueryParam(String str, int i) {
        this.read = i;
        this.serializer = str;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i3 == 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((copyejIjP34) obj).getClass();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                int i4 = RemoteActionCompatParcelizer + 111;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                androidx.compose.material3.TextKt.m131TextNvy7gAk(this.serializer, null, 0L, 0L, null, null, 0L, null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, (androidx.compose.ui.text.TextStyle) performLayout.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 24960, 110590);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i3 == 1) {
            IconButtonKt iconButtonKt = (IconButtonKt) obj;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            iconButtonKt.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(iconButtonKt) ? 4 : 2;
                int i6 = RemoteActionCompatParcelizer + 19;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            if ((iIntValue2 & 19) != 18) {
                int i8 = RemoteActionCompatParcelizer + 37;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (!(!getpostalcode2.write(iIntValue2 & 1, z))) {
                int i10 = RemoteActionCompatParcelizer + 101;
                int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i11;
                int i12 = i10 % 2;
                String str = this.serializer;
                if (str != null) {
                    int i13 = i11 + 19;
                    RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        getpostalcode2.serializer(-1820325394);
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                        companion.getClass();
                        BadgeKt.RemoteActionCompatParcelizer(iconButtonKt, str, companion, getpostalcode2, (iIntValue2 & 67) | 12022, 1);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.serializer(-1820325394);
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                        companion2.getClass();
                        BadgeKt.RemoteActionCompatParcelizer(iconButtonKt, str, companion2, getpostalcode2, (iIntValue2 & 14) | 384, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode2.serializer(-1820211035);
                    getpostalcode2.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i3 == 2) {
            IconButtonKt iconButtonKt2 = (IconButtonKt) obj;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            iconButtonKt2.getClass();
            if ((iIntValue3 & 6) == 0) {
                int i14 = RemoteActionCompatParcelizer + 9;
                write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    ((getPostalCode) getbirthdatefull3).read(iconButtonKt2);
                    throw null;
                }
                if (((getPostalCode) getbirthdatefull3).read(iconButtonKt2)) {
                    int i15 = write + 23;
                    RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i = 4;
                }
                iIntValue3 |= i;
            }
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (!getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                String str2 = this.serializer;
                if (str2 != null) {
                    getpostalcode3.serializer(-2076870271);
                    String string = str2.toString();
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    companion3.getClass();
                    BadgeKt.RemoteActionCompatParcelizer(iconButtonKt2, string, companion3, getpostalcode3, (iIntValue3 & 14) | 384, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(-2076745341);
                    getpostalcode3.IconCompatParcelizer(false);
                }
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
        int iIntValue4 = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        if ((iIntValue4 & 17) != 16) {
            int i17 = RemoteActionCompatParcelizer + 111;
            write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
        if (getpostalcode4.write(iIntValue4 & 1, z2)) {
            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
            float f = Dimensions.setTabContainer;
            androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.PaddingKt.write(companion4, f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode4, 0);
            int iHashCode = Long.hashCode(getpostalcode4.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode4.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode4, modifierWrite);
            androidx.compose.ui.node.ComposeUiNode.Companion companion5 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion5.getConstructor();
            if (getpostalcode4.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode4.ComponentActivity) {
                getpostalcode4.serializer(constructor);
            } else {
                getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode4, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode4, Integer.valueOf(iHashCode), getpostalcode4));
            androidx.compose.ui.graphics.painter.Painter painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_lock_open, getpostalcode4, 0);
            androidx.compose.ui.graphics.ColorFilter.Companion companion6 = androidx.compose.ui.graphics.ColorFilter.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            androidx.compose.foundation.ImageKt.Image(painterPainterResource, "", null, null, null, 0.0f, androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(companion6, ((buildMapping) getpostalcode4.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0, 2, null), getpostalcode4, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 60);
            androidx.compose.material3.TextKt.m131TextNvy7gAk(this.serializer, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion4, f, 0.0f, 0.0f, 0.0f, 14), ((buildMapping) getpostalcode4.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode4, 0, 0, 131064);
            getpostalcode4.IconCompatParcelizer(true);
        } else {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
