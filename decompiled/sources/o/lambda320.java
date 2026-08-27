package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.opportunities.calendar.entrypoint.SeeAllButtonKt;
import com.roadrunner.opportunities.multiplier.BonusMultiplierRowKt;
import com.roadrunner.rider.state.finishedshift.presentation.FinishedShiftV2Kt;
import com.roadrunner.rider.state.quests.presentation.banner.BannerKt;
import com.roadrunner.rider.state.shiftextension.presentation.ShiftExtensionKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.sidemenu.greeting.GreetingContentKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lambda320 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int read;

    public /* synthetic */ lambda320(int i) {
        this.read = i;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = null;
        boolean z3 = false;
        switch (i2) {
            case 0:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((iIntValue & 17) != 16) {
                    int i3 = serializer + 99;
                    IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, z)) {
                    int i5 = IconCompatParcelizer + 3;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_small_essentials_dot, getpostalcode, 0), "", (androidx.compose.ui.Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintMode(), getpostalcode, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i7 = serializer + 87;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                return createfromparcel;
            case 1:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2;
                }
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    SeeAllButtonKt.SeeAllButton((iIntValue2 << 3) & 112, getpostalcode2, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.rid_current_promos_see_all_button_title, getpostalcode2, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 2:
                t3 t3Var = (t3) obj;
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t3Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? ((getPostalCode) getbirthdatefull3).read(t3Var) : ((getPostalCode) getbirthdatefull3).IconCompatParcelizer(t3Var) ? 4 : 2;
                }
                if ((iIntValue3 & 19) != 18) {
                    int i9 = IconCompatParcelizer + 53;
                    serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        obj4.hashCode();
                        throw null;
                    }
                    z3 = true;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(iIntValue3 & 1, z3)) {
                    int i10 = serializer + 31;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    BonusMultiplierRowKt.BonusMultiplierRow(t3Var, null, getpostalcode3, i10 % 2 == 0 ? iIntValue3 & 62 : iIntValue3 & 14);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                AdjustInstanceExternalSyntheticLambda1 adjustInstanceExternalSyntheticLambda1 = (AdjustInstanceExternalSyntheticLambda1) obj;
                int iIntValue4 = ((Integer) obj3).intValue();
                adjustInstanceExternalSyntheticLambda1.getClass();
                FinishedShiftV2Kt.IconCompatParcelizer(adjustInstanceExternalSyntheticLambda1, null, (getBirthDateFull) obj2, iIntValue4 & 14);
                return createfromparcel;
            case 4:
                buildInstallReferrerSdkClickPackage buildinstallreferrersdkclickpackage = (buildInstallReferrerSdkClickPackage) obj;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                buildinstallreferrersdkclickpackage.getClass();
                if ((iIntValue5 & 6) == 0) {
                    int i11 = IconCompatParcelizer + 97;
                    serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        ((getPostalCode) getbirthdatefull4).read(buildinstallreferrersdkclickpackage);
                        throw null;
                    }
                    iIntValue5 |= ((getPostalCode) getbirthdatefull4).read(buildinstallreferrersdkclickpackage) ? 4 : 2;
                }
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode4.write(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    BannerKt.Banner(buildinstallreferrersdkclickpackage, null, getpostalcode4, iIntValue5 & 14);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                invokeMethod invokemethod = (invokeMethod) obj;
                int iIntValue6 = ((Integer) obj3).intValue();
                invokemethod.getClass();
                ShiftExtensionKt.ShiftExtension(invokemethod, null, (getBirthDateFull) obj2, iIntValue6 & 14);
                return createfromparcel;
            case 6:
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((iIntValue7 & 17) != 16) {
                    int i12 = IconCompatParcelizer + 77;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
                if (!(!getpostalcode5.write(iIntValue7 & 1, z2))) {
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode5, 0);
                    int iHashCode = Long.hashCode(getpostalcode5.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode5.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode5, companion);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                    if (getpostalcode5.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode5.ComponentActivity) {
                        getpostalcode5.serializer(constructor);
                    } else {
                        getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode5, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode5, Integer.valueOf(iHashCode), getpostalcode5));
                    getpostalcode5.serializer(1421439287);
                    getpostalcode5.IconCompatParcelizer(false);
                    getpostalcode5.IconCompatParcelizer(true);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode6.write(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("InfiniteTransition", getpostalcode6, 0), 360.0f, 0.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{800, 0, performFling.read, 2}), (BoxMeasurePolicy) null, 6), "FloatAnimation", getpostalcode6, 29112, 0);
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    boolean z4 = getpostalcode6.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                    Object objComponentActivity = getpostalcode6.ComponentActivity();
                    if (z4 || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer, 12);
                        getpostalcode6.write(objComponentActivity);
                    }
                    LoadingFullScreenKt.read(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), getpostalcode6, 0);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull7;
                if (!getpostalcode7.write(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                if ((iIntValue10 & 17) != 16) {
                    int i14 = serializer + 53;
                    IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    z3 = true;
                }
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull8;
                if (!getpostalcode8.write(iIntValue10 & 1, z3)) {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i16 = serializer + 1;
                    IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        int i17 = 2 / 2;
                    }
                }
                return createfromparcel;
            case 10:
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull9;
                if (!getpostalcode9.write(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg r8lambdatyvitgiqdqnju3oex9e3ewupnmg = (r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg) obj;
                int iIntValue12 = ((Integer) obj3).intValue();
                r8lambdatyvitgiqdqnju3oex9e3ewupnmg.getClass();
                GreetingContentKt.serializer(r8lambdatyvitgiqdqnju3oex9e3ewupnmg, null, (getBirthDateFull) obj2, iIntValue12 & 14);
                return createfromparcel;
            case 12:
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode10.write(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_text_formatting_external_link, getpostalcode10, 0), "", (androidx.compose.ui.Modifier) null, ((buildMapping) getpostalcode10.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), getpostalcode10, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj2;
                ((Integer) obj3).intValue();
                ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
                androidx.compose.ui.graphics.painter.Painter painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_emoji_checkmark_small, getbirthdatefull11, 0);
                androidx.compose.ui.layout.ContentScale fillBounds = androidx.compose.ui.layout.ContentScale.Companion.getFillBounds();
                androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
                companion4.getClass();
                androidx.compose.foundation.ImageKt.Image(painterPainterResource, null, companion4, null, fillBounds, 0.0f, null, getbirthdatefull11, androidx.compose.ui.graphics.painter.Painter.$stable | 25008, 104);
                return createfromparcel;
            default:
                ((Integer) obj3).getClass();
                ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{(getBirthDateFull) obj2, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.ui.Modifier.Companion, Dimensions.getTitle)});
                return createfromparcel;
        }
    }
}
