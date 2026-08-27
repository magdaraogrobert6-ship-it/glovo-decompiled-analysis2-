package com.roadrunner.login.presentation.otp;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.ui.graphics.Fields;
import coil3.util.UtilsKt;
import com.google.android.gms.internal.mlkit_vision_face.zznc;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda3;
import com.mapbox.navigation.core.accounts.BillingController$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.accounts.BillingController$arrivalObserver$1;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.NavigationSession;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.login.presentation.mapper.ErrorSnackbarMessageMapper;
import com.roadrunner.overlay.bubble.banner.OverlayVisibilityBannerUiModel;
import com.roadrunner.overlay.bubble.banner.presentation.OverlayVisibilityBannerUiModelImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.noorders.presentation.HomeNoOrdersUiModelImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustInstance101;
import o.AdjustInstance13;
import o.AdjustThirdPartySharing;
import o.AndroidSqliteDriverexecute2;
import o.BrazeExternalSyntheticLambda45;
import o.DataMigrationInitializerCompanionrunMigrations2;
import o.HttpException;
import o.MemoryCacheService;
import o.ShortNewsContentCardView;
import o.SingleProcessDataStoredata1;
import o.SingleProcessDataStorereadAndInitapi1;
import o.a9;
import o.accessexecute;
import o.accessgetAltRightcp;
import o.afExternalSyntheticOutline0;
import o.bExternalSyntheticLambda1;
import o.createFromParcel;
import o.da;
import o.deepCopy;
import o.fromString;
import o.getBaseUrl;
import o.getBitmapui_graphics;
import o.getOnDeeplinkResponseListener;
import o.getOnRemoteTriggerListener;
import o.getScrollRange;
import o.inCompatibilityMode;
import o.l4;
import o.l7;
import o.l8;
import o.l9;
import o.la;
import o.launchAttributionResponseTasks;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.removeGlobalPartnerParameterI;
import o.startFirstSessionI;
import o.trackNewSessionI;
import o.transferSessionPackageI;
import o.updateData;
import okhttp3.FormBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OtpNavigationKt$$ExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ OtpNavigationKt$$ExternalSyntheticLambda4(Object obj, int i, Object obj2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        switch (i3) {
            case 0:
                OtpViewModel otpViewModel = (OtpViewModel) obj2;
                String str = (String) obj;
                str.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(otpViewModel, new AuthRepository$logoutUser$2(otpViewModel, str, shortNewsContentCardView, 23));
                return createfromparcel2;
            case 1:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((accessgetAltRightcp) obj);
                return createfromparcel2;
            case 2:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((bExternalSyntheticLambda1) obj).read);
                return createfromparcel2;
            case 3:
                afExternalSyntheticOutline0 afexternalsyntheticoutline0 = (afExternalSyntheticOutline0) obj2;
                AndroidSqliteDriverexecute2 androidSqliteDriverexecute2 = (AndroidSqliteDriverexecute2) obj;
                a9 a9Var = afexternalsyntheticoutline0.IconCompatParcelizer;
                Uri uri = Uri.parse(afexternalsyntheticoutline0.write.IconCompatParcelizer());
                a9Var.getClass();
                uri.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(268435456);
                try {
                    a9Var.read.startActivity(intent);
                    break;
                } catch (ActivityNotFoundException e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Open url usecase ActivityNotFoundException: ", e.getMessage()), new Object[0]);
                    androidSqliteDriverexecute2.invoke(e);
                }
                return createfromparcel2;
            case 4:
                ErrorSnackbarMessageMapper errorSnackbarMessageMapper = (ErrorSnackbarMessageMapper) obj2;
                a9 a9Var2 = errorSnackbarMessageMapper.MediaDescriptionCompat;
                Uri uri2 = Uri.parse(errorSnackbarMessageMapper.serializer.IconCompatParcelizer());
                String strIconCompatParcelizer = errorSnackbarMessageMapper.read.IconCompatParcelizer(R.string.force_update_download_link_copied);
                a9Var2.getClass();
                uri2.getClass();
                ClipData clipDataNewPlainText = ClipData.newPlainText((String) obj, uri2.toString());
                Application application = a9Var2.read;
                Object systemService = application.getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
                Toast.makeText(application, strIconCompatParcelizer, 1).show();
                return createfromparcel2;
            case 5:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((launchAttributionResponseTasks) ((da) obj).serializer).IconCompatParcelizer);
                return createfromparcel2;
            case 6:
                MapboxTripSession mapboxTripSession = ((MapboxNavigation) obj2).tripSession;
                mapboxTripSession.getClass();
                mapboxTripSession.locationObservers.remove((l4) obj);
                return createfromparcel2;
            case 7:
                MapboxNavigation mapboxNavigation = (MapboxNavigation) obj2;
                mapboxNavigation.getClass();
                NavigationSession navigationSession = mapboxNavigation.navigationSession;
                navigationSession.getClass();
                navigationSession.stateObservers.remove((BillingController$$ExternalSyntheticLambda1) obj);
                return createfromparcel2;
            case 8:
                MapboxTripSession mapboxTripSession2 = ((MapboxNavigation) obj2).tripSession;
                mapboxTripSession2.getClass();
                mapboxTripSession2.locationObservers.remove((l4) obj);
                return createfromparcel2;
            case 9:
                MapboxNavigation mapboxNavigation2 = (MapboxNavigation) obj2;
                mapboxNavigation2.getClass();
                ArrivalProgressObserver arrivalProgressObserver = mapboxNavigation2.arrivalProgressObserver;
                arrivalProgressObserver.getClass();
                arrivalProgressObserver.arrivalObservers.remove((BillingController$arrivalObserver$1) obj);
                return createfromparcel2;
            case 10:
                ((LocationComponentPluginImpl) obj2).onIndicatorPositionChangedListeners.remove((l9) obj);
                return createfromparcel2;
            case 11:
                l7 l7Var = (l7) obj;
                zznc zzncVar = ((MapboxNavigation) obj2).rerouteController;
                if (zzncVar != null) {
                    zzncVar.unregisterRerouteStateObserver(l7Var);
                }
                return createfromparcel2;
            case 12:
                MapboxNavigation mapboxNavigation3 = (MapboxNavigation) obj2;
                mapboxNavigation3.getClass();
                MapboxTripSession mapboxTripSession3 = mapboxNavigation3.tripSession;
                mapboxTripSession3.getClass();
                mapboxTripSession3.routeProgressObservers.remove((l8) obj);
                return createfromparcel2;
            case 13:
                MapboxNavigation mapboxNavigation4 = (MapboxNavigation) obj2;
                mapboxNavigation4.getClass();
                MapboxDirectionsSession mapboxDirectionsSession = mapboxNavigation4.directionsSession;
                mapboxDirectionsSession.getClass();
                mapboxDirectionsSession.onSetNavigationRoutesFinishedObservers.remove((MapboxNavigation$$ExternalSyntheticLambda3) obj);
                return createfromparcel2;
            case 14:
                MapboxNavigation mapboxNavigation5 = (MapboxNavigation) obj2;
                mapboxNavigation5.getClass();
                MapboxTripSession mapboxTripSession4 = mapboxNavigation5.tripSession;
                mapboxTripSession4.getClass();
                mapboxTripSession4.voiceInstructionsObservers.remove((la) obj);
                return createfromparcel2;
            case 15:
                Context context = (Context) obj;
                OverlayVisibilityBannerUiModelImpl overlayVisibilityBannerUiModelImpl = (OverlayVisibilityBannerUiModelImpl) ((OverlayVisibilityBannerUiModel) obj2);
                overlayVisibilityBannerUiModelImpl.getClass();
                context.getClass();
                overlayVisibilityBannerUiModelImpl.serializer.getClass();
                context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.fromParts("package", context.getPackageName(), null)));
                ContextScope contextScope = overlayVisibilityBannerUiModelImpl.IconCompatParcelizer;
                ((inCompatibilityMode) overlayVisibilityBannerUiModelImpl.read).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(contextScope, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new HomeViewModel.AnonymousClass1(overlayVisibilityBannerUiModelImpl, shortNewsContentCardView, 25), 2);
                return createfromparcel2;
            case 16:
                getBitmapui_graphics getbitmapui_graphics = ((accessexecute) obj).RemoteActionCompatParcelizer;
                ((HttpException) obj2).getClass();
                return new MemoryCacheService(getbitmapui_graphics);
            case 17:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((startFirstSessionI) obj).IconCompatParcelizer);
                return createfromparcel2;
            case 18:
                startFirstSessionI startfirstsessioni = (startFirstSessionI) obj;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(Double.valueOf(startfirstsessioni.write), Double.valueOf(startfirstsessioni.RemoteActionCompatParcelizer));
                return createfromparcel2;
            case 19:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((trackNewSessionI) obj).IconCompatParcelizer);
                return createfromparcel2;
            case 20:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((removeGlobalPartnerParameterI) obj).IconCompatParcelizer);
                int i4 = write + 29;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel2;
            case 21:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((fromString) obj);
                return createfromparcel2;
            case 22:
                FormBody.Builder builder = (FormBody.Builder) obj2;
                Context context2 = (Context) obj;
                String str2 = ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) builder.serializer)).IconCompatParcelizer.read("racc_pass_verification_support_center_url");
                if (str2.length() > 0) {
                    int i6 = IconCompatParcelizer + 37;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    ((BrazeExternalSyntheticLambda45) builder.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(Uri.parse(str2), UtilsKt.RemoteActionCompatParcelizer(context2));
                }
                return createfromparcel2;
            case 23:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((getOnRemoteTriggerListener) ((getOnDeeplinkResponseListener) obj)).IconCompatParcelizer);
                return createfromparcel2;
            case 24:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((getBaseUrl) obj).serializer);
                return createfromparcel2;
            case 25:
                AdjustInstance13 adjustInstance13 = (AdjustInstance13) obj2;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj;
                Integer num = adjustInstance13.MediaSessionCompatToken;
                if (num != null) {
                    int iIntValue = num.intValue();
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(iIntValue), adjustInstance13.IconCompatParcelizer);
                }
                return createfromparcel2;
            case 26:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Integer.valueOf(((AdjustInstance101) obj).read));
                return createfromparcel2;
            case 27:
                ContextScope contextScope2 = ((HomeNoOrdersUiModelImpl) obj).RemoteActionCompatParcelizer;
                ProtobufEncoder protobufEncoder = ((SingleProcessDataStoredata1) obj2).IconCompatParcelizer;
                protobufEncoder.getClass();
                Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.write).write();
                objWrite.getClass();
                Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) protobufEncoder.serializer).write();
                objWrite2.getClass();
                return new updateData(contextScope2, (DataMigrationInitializerCompanionrunMigrations2) objWrite, (SingleProcessDataStorereadAndInitapi1) objWrite2, (SendTestPushUseCase) ((getScrollRange) protobufEncoder.RemoteActionCompatParcelizer).write());
            case 28:
                AdjustThirdPartySharing adjustThirdPartySharing = (AdjustThirdPartySharing) obj;
                int i8 = adjustThirdPartySharing.PlaybackStateCompatCustomAction;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(Integer.valueOf(i8), adjustThirdPartySharing.PlaybackStateCompat);
                int i9 = write + 75;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return createfromparcel2;
            default:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((deepCopy) obj);
                return createfromparcel2;
        }
    }
}
