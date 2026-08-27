package kotlinx.coroutines;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.legacy.ui.preferences.SettingsActivity;
import com.logistics.rider.glovo.R;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.settings.subscreens.appearance.AppearanceViewModel;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.data.StartWorkingRepository$startWorking$2;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.equipment.EquipmentViewModel$saveChanges$1;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.ui.common.widget.calendar.CalendarView;
import io.grpc.internal.SharedResourcePool;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ConstraintReferenceIncorrectConstraintException;
import o.ShortNewsContentCardView;
import o.accessgetPendingConfigurationscp;
import o.accessgetStrictcp;
import o.createFromParcel;
import o.decode;
import o.drawInto;
import o.getDoubleOrNull;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getSUPPRESSannotations;
import o.handleInAppMessageTestPushandroid_sdk_base_release;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAppSetIdReadingEnabled;
import o.lambda30;
import o.lambda318;
import o.logCustomEventlambda14;
import o.logPushDeliveryandroid_sdk_base_release;
import o.logPushNotificationOpened;
import o.mergeJsonObjects;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda5weVaLnJrZw3JZ5gurH6kjpdo;
import o.r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4;
import o.r8lambda8idGBQ6O_cBQkyJ8rQoTH4QXpQ;
import o.r8lambda9TRUgiGfCDXBt9yOTfPj9x8uK2U;
import o.r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s;
import o.r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM;
import o.r8lambdaA6OoEGXD1K3feyxCkHtt4AhzdF0;
import o.r8lambdaAl1EwI53IP1m7WOEQjR8yUoMoo;
import o.r8lambdaCjup2UudZWzaEOXJ0bW8nzZDb4c;
import o.r8lambdaDJ2RgYFdhTGcJ5lUVFy_5qY8;
import o.r8lambdaFeqavdgLqmQOJLvrFaEJOa9xxTc;
import o.r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs;
import o.r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.r8lambdaSr0pDLWOngOPA4Ci9bmOn_XoXs;
import o.r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY;
import o.r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaUvs_x70sPZ1RbJHSO9gVBc3lAYQ;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk;
import o.r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs;
import o.r8lambdakakRSJ0yRWnWIggdAd9IDPYuM;
import o.r8lambdalFncdmww9yhjZmWqz17tKS38WoM;
import o.r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc;
import o.r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k;
import o.r8lambdamj111UIc_32qqPiOezWWbC51j0U;
import o.r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs;
import o.r8lambdarhobHpPgW3fYGaomIOtfm02vDE;
import o.r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4;
import o.r8lambdav4khHexYF7B8JZECOja6EPumcY4;
import o.r8lambdav9lEwuigriKPLoepmU9DzDAsGns;
import o.r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8;
import o.r8lambdavqK0yH3ghr0voBP7IVvbATocpo;
import o.removeNodeAtDepth;
import o.removeOnPictureInPictureModeChangedListener;
import o.setFirstHorizontalBias;
import o.setFirstVerticalStyle;
import o.setNativeShader;
import o.setSdkDebuggerCallbackandroid_sdk_base_release;
import o.subscribeToBannersDismissedEventandroid_sdk_base_release;
import o.toBitmapConfig1JJdX4A;
import o.u4;
import o.wdefault;
import org.joda.time.LocalDate;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobKt__JobKt$invokeOnCompletion$1(SideMenuFragment sideMenuFragment) {
        super(1, 0, SideMenuFragment.class, sideMenuFragment, "handleActions", "handleActions(Lcom/roadrunner/sidemenu/presentation/model/SideMenuAction;)V");
        this.serializer = 15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JobKt__JobKt$invokeOnCompletion$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.serializer = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobKt__JobKt$invokeOnCompletion$1(JobNode jobNode) {
        super(1, 0, JobNode.class, jobNode, "invoke", "invoke(Ljava/lang/Throwable;)V");
        this.serializer = 0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k r8lambdaltz1unitaeov9grvwdnwxxsy0k;
        int i;
        int i2 = 2 % 2;
        int i3 = 3;
        int i4 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (this.serializer) {
            case 0:
                ((JobNode) this.MediaMetadataCompat).write((Throwable) obj);
                return createFromParcel.INSTANCE;
            case 1:
                accessgetStrictcp accessgetstrictcp = (accessgetStrictcp) obj;
                accessgetstrictcp.getClass();
                ((r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat).RemoteActionCompatParcelizer(accessgetstrictcp);
                return createFromParcel.INSTANCE;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = (r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat;
                decode decodeVar = (decode) r8lambdawf0f8_ok6qhelc2navzsyrule94.MediaSessionCompatQueueItem.IconCompatParcelizer;
                Map mapSingletonMap = Collections.singletonMap("selected", String.valueOf(zBooleanValue));
                mapSingletonMap.getClass();
                decodeVar.logEvent("mapbox_metrics_enable", mapSingletonMap);
                r8lambdawf0f8_ok6qhelc2navzsyrule94.PlaybackStateCompatCustomAction.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94.PlaybackStateCompat.IconCompatParcelizer(R.string.preference_map_metrics), zBooleanValue);
                r8lambdawf0f8_ok6qhelc2navzsyrule94.ParcelableVolumeInfo.serializer(r8lambdaUvs_x70sPZ1RbJHSO9gVBc3lAYQ.read);
                return createFromParcel.INSTANCE;
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule95 = (r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat;
                decode decodeVar2 = (decode) r8lambdawf0f8_ok6qhelc2navzsyrule95.MediaSessionCompatQueueItem.IconCompatParcelizer;
                Map mapSingletonMap2 = Collections.singletonMap("is_enabled", String.valueOf(zBooleanValue2));
                mapSingletonMap2.getClass();
                decodeVar2.logEvent("navigation_route_preview_submit", mapSingletonMap2);
                r8lambdawf0f8_ok6qhelc2navzsyrule95.PlaybackStateCompatCustomAction.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule95.PlaybackStateCompat.IconCompatParcelizer(R.string.preference_naver_route_preview), zBooleanValue2);
                if (zBooleanValue2) {
                    r8lambdawf0f8_ok6qhelc2navzsyrule95.read(true);
                }
                return createFromParcel.INSTANCE;
            case 4:
                setFirstVerticalStyle setfirstverticalstyle = (setFirstVerticalStyle) obj;
                setfirstverticalstyle.getClass();
                AppearanceViewModel appearanceViewModel = (AppearanceViewModel) this.MediaMetadataCompat;
                appearanceViewModel.getClass();
                if (((r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY) appearanceViewModel.IconCompatParcelizer.read()).serializer != setfirstverticalstyle) {
                    MutableStateFlow mutableStateFlow = appearanceViewModel.IconCompatParcelizer;
                    r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY r8lambdatq96bk0bbdzjodkqhvdnbn_apy = (r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY) mutableStateFlow.read();
                    String str = r8lambdatq96bk0bbdzjodkqhvdnbn_apy.write;
                    AnnotatedString annotatedString = r8lambdatq96bk0bbdzjodkqhvdnbn_apy.IconCompatParcelizer;
                    List list = r8lambdatq96bk0bbdzjodkqhvdnbn_apy.RemoteActionCompatParcelizer;
                    annotatedString.getClass();
                    mutableStateFlow.IconCompatParcelizer(new r8lambdaTq96bk0BBdzjoDKqhVDnbn_apY(str, annotatedString, setfirstverticalstyle, list));
                    setFirstHorizontalBias setfirsthorizontalbias = appearanceViewModel.RemoteActionCompatParcelizer;
                    setfirsthorizontalbias.getClass();
                    ConstraintReferenceIncorrectConstraintException constraintReferenceIncorrectConstraintException = (ConstraintReferenceIncorrectConstraintException) setfirsthorizontalbias.write;
                    constraintReferenceIncorrectConstraintException.serializer = setfirstverticalstyle;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) constraintReferenceIncorrectConstraintException.write.MediaSessionCompatResultReceiverWrapper()).edit();
                    editorEdit.putString("design_system_mode_key", setfirstverticalstyle.getModeName());
                    editorEdit.apply();
                    removeOnPictureInPictureModeChangedListener.IconCompatParcelizer(setfirstverticalstyle.getModeInt());
                    int i5 = r8lambdaSr0pDLWOngOPA4Ci9bmOn_XoXs.IconCompatParcelizer[setfirstverticalstyle.ordinal()];
                    if (i5 == 1) {
                        appearanceViewModel.write.IconCompatParcelizer.logEvent("theme_dark_mode_enabled", null);
                    } else if (i5 != 2) {
                        int i6 = read + 85;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (i5 != 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        appearanceViewModel.write.IconCompatParcelizer.logEvent("theme_system_settings_enabled", null);
                    } else {
                        appearanceViewModel.write.IconCompatParcelizer.logEvent("theme_light_mode_enabled", null);
                    }
                }
                return createFromParcel.INSTANCE;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8 r8lambdatzeg3oyxzs_g1yz9ru89utpm8 = (r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8) this.MediaMetadataCompat;
                r8lambdatzeg3oyxzs_g1yz9ru89utpm8.getClass();
                r8lambdatzeg3oyxzs_g1yz9ru89utpm8.serializer.IconCompatParcelizer.logEvent("chat_language_changed", null);
                r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds = r8lambdatzeg3oyxzs_g1yz9ru89utpm8.write;
                String strIconCompatParcelizer = r8lambdatzeg3oyxzs_g1yz9ru89utpm8.MediaDescriptionCompat.IconCompatParcelizer(R.string.preference_chat_language);
                r8lambdah04qyyeozrxd4cfrstnkpb99_ds.getClass();
                SharedPreferences.Editor editorEdit2 = r8lambdah04qyyeozrxd4cfrstnkpb99_ds.IconCompatParcelizer.edit();
                editorEdit2.putString(strIconCompatParcelizer, str2);
                editorEdit2.apply();
                return createFromParcel.INSTANCE;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                SettingsViewModel settingsViewModel = (SettingsViewModel) this.MediaMetadataCompat;
                settingsViewModel.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(settingsViewModel), null, null, new RoomDatabase.AnonymousClass1(settingsViewModel, str3, false, (ShortNewsContentCardView) null), 3);
                return createFromParcel.INSTANCE;
            case 7:
                r8lambda5weVaLnJrZw3JZ5gurH6kjpdo r8lambda5wevalnjrzw3jz5gurh6kjpdo = (r8lambda5weVaLnJrZw3JZ5gurH6kjpdo) obj;
                r8lambda5wevalnjrzw3jz5gurh6kjpdo.getClass();
                SettingsViewModel settingsViewModel2 = (SettingsViewModel) this.MediaMetadataCompat;
                subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = settingsViewModel2.ComponentActivity;
                SharedResourcePool sharedResourcePool = settingsViewModel2.ParcelableVolumeInfo;
                switch (r8lambdaFeqavdgLqmQOJLvrFaEJOa9xxTc.serializer[r8lambda5wevalnjrzw3jz5gurh6kjpdo.ordinal()]) {
                    case 1:
                        subscribetobannersdismissedeventandroid_sdk_base_release.read.logEvent("chat_language_select", null);
                        subscribetobannersdismissedeventandroid_sdk_base_release.IconCompatParcelizer.getClass();
                        sharedResourcePool.serializer(r8lambda9vKHKtnZQ48a6W2MGZCuRpRQGEM.read);
                        break;
                    case 2:
                        sharedResourcePool.serializer(r8lambda9TRUgiGfCDXBt9yOTfPj9x8uK2U.write);
                        break;
                    case 3:
                        subscribetobannersdismissedeventandroid_sdk_base_release.read.logEvent("choose_navigation_app", null);
                        subscribetobannersdismissedeventandroid_sdk_base_release.IconCompatParcelizer.getClass();
                        sharedResourcePool.serializer(r8lambdaA6OoEGXD1K3feyxCkHtt4AhzdF0.write);
                        break;
                    case 4:
                        sharedResourcePool.serializer(r8lambdaAl1EwI53IP1m7WOEQjR8yUoMoo.serializer);
                        break;
                    case 5:
                        sharedResourcePool.serializer(r8lambda9qNBVLI9W1w9u6acRFXNMoTC8s.IconCompatParcelizer);
                        break;
                    case 6:
                        sharedResourcePool.serializer(r8lambdaCjup2UudZWzaEOXJ0bW8nzZDb4c.write);
                        break;
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
                return createFromParcel.INSTANCE;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                SettingsViewModel settingsViewModel3 = (SettingsViewModel) this.MediaMetadataCompat;
                settingsViewModel3.getClass();
                settingsViewModel3.ParcelableVolumeInfo.serializer(new r8lambdaDJ2RgYFdhTGcJ5lUVFy_5qY8(str4));
                return createFromParcel.INSTANCE;
            case 9:
                r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 r8lambda61usyyumzjrqq3yb5acq_1_eeg4 = (r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4) obj;
                r8lambda61usyyumzjrqq3yb5acq_1_eeg4.getClass();
                SettingsViewModel settingsViewModel4 = (SettingsViewModel) this.MediaMetadataCompat;
                settingsViewModel4.getClass();
                if (r8lambdaFeqavdgLqmQOJLvrFaEJOa9xxTc.IconCompatParcelizer[r8lambda61usyyumzjrqq3yb5acq_1_eeg4.ordinal()] == 1) {
                    settingsViewModel4.ParcelableVolumeInfo.serializer(r8lambda8idGBQ6O_cBQkyJ8rQoTH4QXpQ.IconCompatParcelizer);
                    return createFromParcel.INSTANCE;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 10:
                r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy4 = (r8lambdav4khHexYF7B8JZECOja6EPumcY4) obj;
                r8lambdav4khhexyf7b8jzecoja6epumcy4.getClass();
                r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk r8lambdafoipryykxsg19oxlsccw3x8q4qk = (r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) this.MediaMetadataCompat;
                r8lambdafoipryykxsg19oxlsccw3x8q4qk.getClass();
                OkHttpCall$1 okHttpCall$1 = r8lambdafoipryykxsg19oxlsccw3x8q4qk.serializer.IconCompatParcelizer;
                return new r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8((r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs) ((mergeJsonObjects) okHttpCall$1.write).write(), (r8lambdalFncdmww9yhjZmWqz17tKS38WoM) ((getDoubleOrNull) okHttpCall$1.serializer).write, r8lambdav4khhexyf7b8jzecoja6epumcy4);
            case 11:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                fragmentActivity.getClass();
                ((r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) this.MediaMetadataCompat).getClass();
                fragmentActivity.startActivity(new Intent(fragmentActivity, (Class<?>) SettingsActivity.class));
                return createFromParcel.INSTANCE;
            case 12:
                r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius = (r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs) obj;
                r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.getClass();
                r8lambdarhobHpPgW3fYGaomIOtfm02vDE r8lambdarhobhppgw3fygaomiotfm02vde = (r8lambdarhobHpPgW3fYGaomIOtfm02vDE) this.MediaMetadataCompat;
                r8lambdarhobhppgw3fygaomiotfm02vde.getClass();
                r8lambdarhobhppgw3fygaomiotfm02vde.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.RemoteActionCompatParcelizer, 1, true);
                ((r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) r8lambdarhobhppgw3fygaomiotfm02vde.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.IconCompatParcelizer);
                return createFromParcel.INSTANCE;
            case 13:
                r8lambdav4khHexYF7B8JZECOja6EPumcY4 r8lambdav4khhexyf7b8jzecoja6epumcy5 = (r8lambdav4khHexYF7B8JZECOja6EPumcY4) obj;
                r8lambdav4khhexyf7b8jzecoja6epumcy5.getClass();
                r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8 r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8 = (r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8) this.MediaMetadataCompat;
                r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.getClass();
                if (r8lambdav4khhexyf7b8jzecoja6epumcy5 instanceof r8lambdavqK0yH3ghr0voBP7IVvbATocpo) {
                    r8lambdavqK0yH3ghr0voBP7IVvbATocpo r8lambdavqk0yh3ghr0vobp7ivvbatocpo = (r8lambdavqK0yH3ghr0voBP7IVvbATocpo) r8lambdav4khhexyf7b8jzecoja6epumcy5;
                    r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.serializer.RemoteActionCompatParcelizer(r8lambdavqk0yh3ghr0vobp7ivvbatocpo.write, r8lambdavqk0yh3ghr0vobp7ivvbatocpo.MediaBrowserCompatMediaItem == r8lambdav9lEwuigriKPLoepmU9DzDAsGns.STANDALONE_ITEM ? 1 : 2, false);
                    r8lambdaltz1unitaeov9grvwdnwxxsy0k = r8lambdavqk0yh3ghr0vobp7ivvbatocpo.read;
                } else {
                    if (!(r8lambdav4khhexyf7b8jzecoja6epumcy5 instanceof r8lambdav2DTvZQspFAZpFmiK0qxdNT7ag4)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    r8lambdaltz1unitaeov9grvwdnwxxsy0k = r8lambdamj111UIc_32qqPiOezWWbC51j0U.IconCompatParcelizer;
                }
                ((r8lambdalR5SL_tSS1JcT7wrmZ_9di0raRc) r8lambdavfhls1yxrgujqvmnjrm6vmsl_h8.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).read(r8lambdaltz1unitaeov9grvwdnwxxsy0k);
                return createFromParcel.INSTANCE;
            case 14:
                accessgetPendingConfigurationscp accessgetpendingconfigurationscp = (accessgetPendingConfigurationscp) obj;
                accessgetpendingconfigurationscp.getClass();
                SideMenuFragment.write((SideMenuFragment) this.MediaMetadataCompat, accessgetpendingconfigurationscp);
                return createFromParcel.INSTANCE;
            case 15:
                accessgetPendingConfigurationscp accessgetpendingconfigurationscp2 = (accessgetPendingConfigurationscp) obj;
                accessgetpendingconfigurationscp2.getClass();
                SideMenuFragment.write((SideMenuFragment) this.MediaMetadataCompat, accessgetpendingconfigurationscp2);
                return createFromParcel.INSTANCE;
            case 16:
                StartWorkingNavAction startWorkingNavAction = (StartWorkingNavAction) obj;
                startWorkingNavAction.getClass();
                EquipmentBottomSheet equipmentBottomSheet = (EquipmentBottomSheet) this.MediaMetadataCompat;
                if (equipmentBottomSheet.getNavigationEventDispatcher == null) {
                    removeNodeAtDepth.serializer("startWorkingNavigator");
                    throw null;
                }
                int i8 = read + 33;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                FragmentActivity fragmentActivityRequireActivity = equipmentBottomSheet.requireActivity();
                fragmentActivityRequireActivity.getClass();
                drawInto.RemoteActionCompatParcelizer(startWorkingNavAction).RemoteActionCompatParcelizer(fragmentActivityRequireActivity.getSupportFragmentManager(), "com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment");
                equipmentBottomSheet.write();
                return createFromParcel.INSTANCE;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                lambda318 lambda318Var = (lambda318) this.MediaMetadataCompat;
                lambda318Var.getClass();
                if (str5.equals("save_changes")) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(lambda318Var), null, null, new EquipmentViewModel$saveChanges$1(lambda318Var, shortNewsContentCardView, i4), 3);
                } else if (str5.equals("cancel")) {
                    lambda318Var.MediaMetadataCompat.serializer(lambda30.write);
                }
                return createFromParcel.INSTANCE;
            case 18:
                String str6 = (String) obj;
                str6.getClass();
                OneClickStartWorkingFragment oneClickStartWorkingFragment = (OneClickStartWorkingFragment) this.MediaMetadataCompat;
                String string = oneClickStartWorkingFragment.requireArguments().getString("one_click_start_working_request_key", "");
                string.getClass();
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    oneClickStartWorkingFragment.getParentFragmentManager().write((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{new onViewAttachedToWindowlambda0[]{new onViewAttachedToWindowlambda0("key_start_working_error", str6)}}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320), string);
                }
                oneClickStartWorkingFragment.read(false, false);
                return createFromParcel.INSTANCE;
            case 19:
                String str7 = (String) obj;
                str7.getClass();
                OneClickStartWorkingViewModel oneClickStartWorkingViewModel = (OneClickStartWorkingViewModel) this.MediaMetadataCompat;
                oneClickStartWorkingViewModel.getClass();
                oneClickStartWorkingViewModel.PlaybackStateCompat.serializer(new logCustomEventlambda14(str7));
                return createFromParcel.INSTANCE;
            case 20:
                String str8 = (String) obj;
                str8.getClass();
                OneClickStartWorkingViewModel oneClickStartWorkingViewModel2 = (OneClickStartWorkingViewModel) this.MediaMetadataCompat;
                oneClickStartWorkingViewModel2.getClass();
                if (str8.equals("agree_and_start")) {
                    oneClickStartWorkingViewModel2.read();
                }
                return createFromParcel.INSTANCE;
            case 21:
                logPushNotificationOpened logpushnotificationopened = (logPushNotificationOpened) obj;
                logpushnotificationopened.getClass();
                VendorReviewFragment vendorReviewFragment = (VendorReviewFragment) this.MediaMetadataCompat;
                vendorReviewFragment.getClass();
                if (logpushnotificationopened.equals(logPushNotificationOpened.write)) {
                    vendorReviewFragment.read(false, false);
                    return createFromParcel.INSTANCE;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 22:
                String str9 = (String) obj;
                str9.getClass();
                handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_release = (handleInAppMessageTestPushandroid_sdk_base_release) this.MediaMetadataCompat;
                handleinappmessagetestpushandroid_sdk_base_release.getClass();
                Object obj2 = handleinappmessagetestpushandroid_sdk_base_release.MediaBrowserCompatMediaItem.read();
                logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = obj2 instanceof logPushDeliveryandroid_sdk_base_release ? (logPushDeliveryandroid_sdk_base_release) obj2 : null;
                if (logpushdeliveryandroid_sdk_base_release != null) {
                    handleinappmessagetestpushandroid_sdk_base_release.serializer.IconCompatParcelizer(logPushDeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer(logpushdeliveryandroid_sdk_base_release, null, str9, null, 29));
                }
                return createFromParcel.INSTANCE;
            case 23:
                logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release2 = (logPushDeliveryandroid_sdk_base_release) obj;
                logpushdeliveryandroid_sdk_base_release2.getClass();
                handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_release2 = (handleInAppMessageTestPushandroid_sdk_base_release) this.MediaMetadataCompat;
                handleinappmessagetestpushandroid_sdk_base_release2.getClass();
                r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(handleinappmessagetestpushandroid_sdk_base_release2, new StartWorkingRepository$startWorking$2(handleinappmessagetestpushandroid_sdk_base_release2, logpushdeliveryandroid_sdk_base_release2, shortNewsContentCardView, i3));
                return createFromParcel.INSTANCE;
            case 24:
                setSdkDebuggerCallbackandroid_sdk_base_release setsdkdebuggercallbackandroid_sdk_base_release = (setSdkDebuggerCallbackandroid_sdk_base_release) obj;
                setsdkdebuggercallbackandroid_sdk_base_release.getClass();
                CalendarView calendarView = (CalendarView) this.MediaMetadataCompat;
                r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs r8lambdagywmiypdgdzbhiy16f9ihdmrys = calendarView.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                getPendingWebViewPauseRunnableandroid_sdk_ui_release getpendingwebviewpauserunnableandroid_sdk_ui_release = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(calendarView, 27, setsdkdebuggercallbackandroid_sdk_base_release);
                r8lambdagywmiypdgdzbhiy16f9ihdmrys.getClass();
                r8lambdagywmiypdgdzbhiy16f9ihdmrys.write.IconCompatParcelizer(setsdkdebuggercallbackandroid_sdk_base_release, new e$$ExternalSyntheticLambda0(11, getpendingwebviewpauserunnableandroid_sdk_ui_release));
                LayoutTileBinding layoutTileBinding = calendarView.ResultReceiver;
                getSUPPRESSannotations getsuppressannotations = (getSUPPRESSannotations) layoutTileBinding.read;
                wdefault wdefaultVar = calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                wdefaultVar.getClass();
                if (wdefaultVar instanceof u4) {
                    i = 8;
                } else {
                    int i10 = read + 103;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i = 0;
                }
                getsuppressannotations.setVisibility(i);
                getSUPPRESSannotations getsuppressannotations2 = (getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer;
                wdefault wdefaultVar2 = calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                wdefaultVar2.getClass();
                getsuppressannotations2.setVisibility(wdefaultVar2 instanceof u4 ? 8 : 0);
                ((getSUPPRESSannotations) layoutTileBinding.read).setEnabled(calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer());
                getSUPPRESSannotations getsuppressannotations3 = (getSUPPRESSannotations) layoutTileBinding.RemoteActionCompatParcelizer;
                wdefault wdefaultVar3 = calendarView.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                String str10 = wdefaultVar3.write.format(wdefaultVar3.MediaMetadataCompat.toDate());
                str10.getClass();
                getsuppressannotations3.setText(str10);
                return createFromParcel.INSTANCE;
            default:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                ((CalendarView) this.MediaMetadataCompat).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(localDate);
                return createFromParcel.INSTANCE;
        }
    }
}
