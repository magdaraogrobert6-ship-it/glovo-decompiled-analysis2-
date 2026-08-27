package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.settings.ui.components.PreferenceItemKt;
import io.sentry.SentryUUID;
import java.util.WeakHashMap;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DefaultContentCardView implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ DefaultContentCardView(int i) {
        this.serializer = i;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x065f  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        androidx.compose.ui.graphics.painter.Painter painterPainterResource;
        String str;
        androidx.compose.ui.Modifier modifier;
        long j;
        int i;
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z3 = false;
        switch (i4) {
            case 0:
                String str2 = (String) obj;
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder = (ShortNewsContentCardViewViewHolder) obj2;
                str2.getClass();
                shortNewsContentCardViewViewHolder.getClass();
                if (str2.length() == 0) {
                    return shortNewsContentCardViewViewHolder.toString();
                }
                return str2 + ", " + shortNewsContentCardViewViewHolder;
            case 1:
                ((Integer) obj2).getClass();
                getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj);
                getpostalcode.serializer(1960221754);
                WeakHashMap weakHashMap = TooltipKt.serializer;
                SheetStateanimateTo2 sheetStateanimateTo2 = new SheetStateanimateTo2(setRoundRectOutlineTNW_H78default.read(getpostalcode).MediaSessionCompatResultReceiverWrapper, 16);
                getpostalcode.IconCompatParcelizer(false);
                return sheetStateanimateTo2;
            case 2:
                getUriPjHm6EE geturipjhm6ee = (getUriPjHm6EE) obj;
                getUriPjHm6EE geturipjhm6ee2 = (getUriPjHm6EE) obj2;
                if (!(geturipjhm6ee2 instanceof MathUtilsKt)) {
                    if ((geturipjhm6ee instanceof MathUtilsKt) && (geturipjhm6ee2 instanceof subtractExactOrElse)) {
                        int i5 = IconCompatParcelizer + 9;
                        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((MathUtilsKt) geturipjhm6ee).read, ((subtractExactOrElse) geturipjhm6ee2).read}, getCieXyz.write())).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{geturipjhm6ee, geturipjhm6ee2}, getCieXyz.write())).booleanValue() || z) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 3:
                PlatformLocaleDelegate platformLocaleDelegate = (PlatformLocaleDelegate) obj;
                PlatformLocaleDelegate platformLocaleDelegate2 = (PlatformLocaleDelegate) obj2;
                platformLocaleDelegate.getClass();
                platformLocaleDelegate2.getClass();
                if (platformLocaleDelegate instanceof getPlatformLocaleDelegate) {
                    getPlatformLocaleDelegate getplatformlocaledelegate = platformLocaleDelegate2 instanceof getPlatformLocaleDelegate ? (getPlatformLocaleDelegate) platformLocaleDelegate2 : null;
                    if (getplatformlocaledelegate != null) {
                        getPlatformLocaleDelegate getplatformlocaledelegate2 = (getPlatformLocaleDelegate) platformLocaleDelegate;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getplatformlocaledelegate2.MediaBrowserCompatMediaItem, getplatformlocaledelegate.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue() && getplatformlocaledelegate2.IconCompatParcelizer.equals(getplatformlocaledelegate.IconCompatParcelizer) && getplatformlocaledelegate2.serializer.equals(getplatformlocaledelegate.serializer)) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getplatformlocaledelegate2.RemoteActionCompatParcelizer, getplatformlocaledelegate.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                                z3 = true;
                            }
                        }
                    }
                } else {
                    if (!platformLocaleDelegate.equals(PlatformLocaleKt.read)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    int i7 = IconCompatParcelizer + 35;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    z3 = platformLocaleDelegate2 instanceof PlatformLocaleKt;
                }
                return Boolean.valueOf(z3);
            case 4:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i9 = IconCompatParcelizer + 75;
                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_navigation_ellipsis_vertical, getpostalcode2, 1);
                        str = "";
                        modifier = null;
                        j = 1;
                        i = androidx.compose.ui.graphics.painter.Painter.$stable | 9;
                        i2 = 117;
                    } else {
                        painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_navigation_ellipsis_vertical, getpostalcode2, 0);
                        str = "";
                        modifier = null;
                        j = 0;
                        i = androidx.compose.ui.graphics.painter.Painter.$stable | 48;
                        i2 = 12;
                    }
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(painterPainterResource, str, modifier, j, getpostalcode2, i, i2);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (!getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode4.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i10 = read + 93;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.layout.SizeKt.m84sizeVpY3zN4(androidx.compose.ui.Modifier.Companion, Dimensions.setWindowCallback, Dimensions.getActionBarHideOffset), getpostalcode4, 0);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode5.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i12 = read + 97;
                    IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        MeasurementManagerImplCommon.IconCompatParcelizer(null, getpostalcode5, 1);
                    } else {
                        MeasurementManagerImplCommon.IconCompatParcelizer(null, getpostalcode5, 0);
                    }
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 8:
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (!(!getpostalcode6.write(iIntValue5 & 1, (iIntValue5 & 3) != 2))) {
                    int i13 = IconCompatParcelizer + 89;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_bonus_fire, getpostalcode6, 0), "", androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer), Dimensions.write), ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode6, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                } else {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode7.write(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_bonus_rain, getpostalcode7, 0), "", androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion2, ((buildMapping) getpostalcode7.write((getNewPassword) setcurrentsemanticsnodesui2)).IconCompatParcelizer(), androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer), Dimensions.write), ((buildMapping) getpostalcode7.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), getpostalcode7, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 10:
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode8.write(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_moon_default, getpostalcode8, 0), "", androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion3, ((buildMapping) getpostalcode8.write((getNewPassword) setcurrentsemanticsnodesui3)).IconCompatParcelizer(), androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer), Dimensions.write), ((buildMapping) getpostalcode8.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter(), getpostalcode8, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode9.write(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int i15 = IconCompatParcelizer + 73;
                    read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui4 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_beach_default, getpostalcode9, 0), "", androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion4, ((buildMapping) getpostalcode9.write((getNewPassword) setcurrentsemanticsnodesui4)).IconCompatParcelizer(), androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer), Dimensions.write), ((buildMapping) getpostalcode9.write((getNewPassword) setcurrentsemanticsnodesui4)).setPresenter(), getpostalcode9, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 12:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.viewholder_all_deliveries_item, viewGroup, false);
                if (viewInflate != null) {
                    updateLayerElements updatelayerelements = (updateLayerElements) viewInflate;
                    return new z7ExternalSyntheticLambda6(updatelayerelements, updatelayerelements);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rootView");
                return null;
            case 13:
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull9;
                if (!getpostalcode10.write(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 14:
                ((Integer) obj).getClass();
                teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) obj2;
                teardownallglobalparameterss.getClass();
                return teardownallglobalparameterss.read;
            case 15:
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode11.write(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_medium_search, getpostalcode11, 0), (String) null, (androidx.compose.ui.Modifier) null, 0L, getpostalcode11, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 12);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 16:
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode12.write(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.ui.Modifier.Companion, Dimensions.onUserLeaveHint), androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer), androidx.compose.ui.graphics.Color.Companion.m759getWhite0d7_KjU(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), getpostalcode12, 0);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 17:
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode13.write(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    getpostalcode13.serializer(-1553297752);
                    getpostalcode13.IconCompatParcelizer(false);
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 18:
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if ((iIntValue13 & 3) != 2) {
                    int i17 = read + 35;
                    IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    z3 = true;
                }
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull13;
                if (!getpostalcode14.write(iIntValue13 & 1, z3)) {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 19:
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull14;
                if (!getpostalcode15.write(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 20:
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull15;
                if (!getpostalcode16.write(iIntValue15 & 1, !((iIntValue15 & 3) == 2))) {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 21:
                getBirthDateFull getbirthdatefull16 = (getBirthDateFull) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull16;
                if (getpostalcode17.write(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    int i19 = read + 23;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        getpostalcode17.ComponentActivity();
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        throw null;
                    }
                    Object objComponentActivity = getpostalcode17.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode17.write(objComponentActivity);
                    }
                    PreferenceItemKt.RemoteActionCompatParcelizer(390, 88, getpostalcode17, null, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_user_privacy), "Dummy preference item", null, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
                } else {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 22:
                getBirthDateFull getbirthdatefull17 = (getBirthDateFull) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if ((iIntValue17 & 3) != 2) {
                    int i20 = IconCompatParcelizer + 53;
                    read = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getPostalCode getpostalcode18 = (getPostalCode) getbirthdatefull17;
                if (getpostalcode18.write(iIntValue17 & 1, z2)) {
                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                    androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.Companion;
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode18, 48);
                    int iHashCode = Long.hashCode(getpostalcode18.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode18.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode18, companion5);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion6 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion6.getConstructor();
                    if (getpostalcode18.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode18.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode18.ComponentActivity) {
                        getpostalcode18.serializer(constructor);
                    } else {
                        getpostalcode18.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion6, getpostalcode18, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode18, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode18, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion6, getpostalcode18, Integer.valueOf(iHashCode), getpostalcode18));
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_text_formatting_external_link, getpostalcode18, 0), (String) null, (androidx.compose.ui.Modifier) null, androidx.compose.ui.res.ColorResources_androidKt.colorResource(com.logistics.rider.glovo.R.color.component_text_form_text_input_big_icon_end_default, getpostalcode18, 0), getpostalcode18, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
                    getpostalcode18.IconCompatParcelizer(true);
                } else {
                    getpostalcode18.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 23:
                ((Boolean) obj2).booleanValue();
                ((String) obj).getClass();
                return createfromparcel;
            case 24:
                ((Boolean) obj2).booleanValue();
                ((r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U) obj).getClass();
                return createfromparcel;
            case 25:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup2.getClass();
                View viewInflate2 = layoutInflater2.inflate(com.logistics.rider.glovo.R.layout.layout_calendar_week_dates, viewGroup2, false);
                if (viewInflate2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rootView");
                    return null;
                }
                LinearLayout linearLayout = (LinearLayout) viewInflate2;
                JvmDefaultWithCompatibility_jvmAndroidAndroidKt jvmDefaultWithCompatibility_jvmAndroidAndroidKt = new JvmDefaultWithCompatibility_jvmAndroidAndroidKt(linearLayout, linearLayout);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return jvmDefaultWithCompatibility_jvmAndroidAndroidKt;
            case 26:
                TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) obj;
                ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder2 = (ShortNewsContentCardViewViewHolder) obj2;
                textAnnouncementContentCardView.getClass();
                shortNewsContentCardViewViewHolder2.getClass();
                TextAnnouncementContentCardView textAnnouncementContentCardViewMinusKey = textAnnouncementContentCardView.minusKey(shortNewsContentCardViewViewHolder2.getKey());
                r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
                if (textAnnouncementContentCardViewMinusKey == r8lambda2qmxd75iptxkfld4rjabqemoamc) {
                    return shortNewsContentCardViewViewHolder2;
                }
                ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
                CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) textAnnouncementContentCardViewMinusKey.get(shortNewsContentCardViewCompanion);
                if (coroutineDispatcher == null) {
                    return new ImageOnlyContentCardView(shortNewsContentCardViewViewHolder2, textAnnouncementContentCardViewMinusKey);
                }
                TextAnnouncementContentCardView textAnnouncementContentCardViewMinusKey2 = textAnnouncementContentCardViewMinusKey.minusKey(shortNewsContentCardViewCompanion);
                return textAnnouncementContentCardViewMinusKey2 == r8lambda2qmxd75iptxkfld4rjabqemoamc ? new ImageOnlyContentCardView(coroutineDispatcher, shortNewsContentCardViewViewHolder2) : new ImageOnlyContentCardView(coroutineDispatcher, new ImageOnlyContentCardView(shortNewsContentCardViewViewHolder2, textAnnouncementContentCardViewMinusKey2));
            case 27:
                ((addInAppMessageViewToViewGrouplambda4) obj).getClass();
                ((addInAppMessageViewToViewGrouplambda4) obj2).getClass();
                return Boolean.TRUE;
            case 28:
                ((addInAppMessageViewToViewGrouplambda4) obj).getClass();
                ((addInAppMessageViewToViewGrouplambda4) obj2).getClass();
                return Boolean.TRUE;
            default:
                ((addInAppMessageViewToViewGrouplambda4) obj).getClass();
                ((addInAppMessageViewToViewGrouplambda4) obj2).getClass();
                return Boolean.TRUE;
        }
    }
}
