package o;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.provider.Settings;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.huawei.hms.location.LocationRequest;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.ui.maps.building.model.MapboxBuildingHighlightOptions;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.login.presentation.mapper.ErrorSnackbarMessageMapper;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ b3(ActivityHandler39 activityHandler39, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        this.RemoteActionCompatParcelizer = 8;
        this.IconCompatParcelizer = activityHandler39;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = populateViewStructure_androidKtpopulate7;
    }

    public /* synthetic */ b3(Object obj, Object obj2, Object obj3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.serializer;
        switch (i2) {
            case 0:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                relativeMoveTo relativemoveto = (relativeMoveTo) obj2;
                bbExternalSyntheticLambda0 bbexternalsyntheticlambda0 = (bbExternalSyntheticLambda0) ((onViewAttachedToWindow) obj).getValue();
                if (bbexternalsyntheticlambda0 != null && (!bbexternalsyntheticlambda0.MediaDescriptionCompat)) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    relativeMoveTo.RemoteActionCompatParcelizer(relativemoveto, "reset-password?userName={userName}", false);
                }
                break;
            case 1:
                doWork dowork = (doWork) obj3;
                LocationRequest locationRequest = (LocationRequest) obj2;
                onWindowLayoutChanged onwindowlayoutchanged = (onWindowLayoutChanged) obj;
                if (dowork.serializer) {
                    int i3 = write + 35;
                    MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    dowork.write().requestLocationUpdates(locationRequest, onwindowlayoutchanged, Looper.getMainLooper());
                }
                break;
            case 2:
                LoginActivityViewModel.serializer(new Object[]{LoginActivity.MediaBrowserCompatMediaItem((LoginActivity) obj3), (String) obj2, (String) obj}, MapboxBuildingHighlightOptions.IconCompatParcelizer(), MapboxBuildingHighlightOptions.IconCompatParcelizer(), 1977514003, MapboxBuildingHighlightOptions.IconCompatParcelizer(), MapboxBuildingHighlightOptions.IconCompatParcelizer(), -1977513999);
                break;
            case 3:
                ((ErrorSnackbarMessageMapper) obj3).IconCompatParcelizer.serializer.logEvent("rider_disabled_support_clicked", null);
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((String) obj);
                break;
            case 4:
                OtpViewModel otpViewModel = (OtpViewModel) obj3;
                String str = (String) obj2;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
                str.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(otpViewModel), null, null, new PerseusLogger$e$1(str, ((bbExternalSyntheticLambda0) otpViewModel.MediaMetadataCompat.write()).write.write(), otpViewModel, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (ShortNewsContentCardView) null), 3);
                break;
            case 5:
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3).invoke();
                ((d4ExternalSyntheticLambda2) obj2).RatingCompat.invoke((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, Boolean.FALSE);
                break;
            case 6:
                String str2 = (String) obj2;
                ((TncContentKt$$ExternalSyntheticLambda2) obj3).invoke(new AsyncImagePainter(str2, ((RealImageLoaderexecuteresult1) obj).RemoteActionCompatParcelizer.read(com.logistics.rider.glovo.R.string.history_order_details_order_details_copied_message, str2)));
                break;
            case 7:
                r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY r8lambdacj1mepsdbazy84sfpnjalw40jly = (r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY) obj2;
                Context context = (Context) obj;
                String action = ((Intent) obj3).getAction();
                r8lambdacj1mepsdbazy84sfpnjalw40jly.read.getClass();
                if (!"android.location.MODE_CHANGED".equals(action)) {
                    r8lambdacj1mepsdbazy84sfpnjalw40jly.write.getClass();
                    if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                        r8lambdacj1mepsdbazy84sfpnjalw40jly.IconCompatParcelizer.read();
                    }
                } else {
                    r8lambdacj1mepsdbazy84sfpnjalw40jly.IconCompatParcelizer.read();
                }
                break;
            case 8:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj;
                if (((ActivityHandler39) obj2).MediaDescriptionCompat) {
                    populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
                } else {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                }
                int i5 = MediaDescriptionCompat + 7;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                break;
            case 9:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
                String str3 = (String) ((PopulateViewStructure_androidKtpopulate7) obj2).getValue();
                String str4 = (String) ((PopulateViewStructure_androidKtpopulate7) obj).getValue();
                if (str3 != null && str4 != null) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(str3, str4);
                }
                break;
            case 10:
                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj2;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj;
                H$b h$b = (H$b) ((C$b) obj3).IconCompatParcelizer;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
                fragmentActivity.getSupportFragmentManager().read("break-request-dialog-request-key", fragmentActivity, new ArrivalProgressObserver$$ExternalSyntheticLambda0(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 22, h$b));
                int i7 = MediaDescriptionCompat + 85;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                break;
            case 11:
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3).invoke((String) obj2, (lambda316) obj);
                break;
            default:
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3).invoke((logPushDeliveryandroid_sdk_base_release) obj2, (requestBannersRefresh) obj);
                break;
        }
        return createfromparcel;
    }
}
