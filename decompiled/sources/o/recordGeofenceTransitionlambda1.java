package o;

import android.app.Activity;
import android.net.Uri;
import com.roadrunner.settings.SettingsViewModel;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import io.sentry.JsonObjectSerializer;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class recordGeofenceTransitionlambda1 extends FunctionReferenceImpl implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ recordGeofenceTransitionlambda1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.read = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i;
        String str;
        Object obj3;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = 10;
        boolean z = true;
        switch (i4) {
            case 0:
                requestContentCardsRefreshlambda0 requestcontentcardsrefreshlambda0 = (requestContentCardsRefreshlambda0) obj;
                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj2;
                requestcontentcardsrefreshlambda0.getClass();
                fragmentActivity.getClass();
                JsonObjectSerializer jsonObjectSerializer = ((reenqueueInAppMessagelambda0) this.MediaMetadataCompat).write;
                fragmentActivity.getSupportFragmentManager().getClass();
                Uri uri = Uri.parse(requestcontentcardsrefreshlambda0.read);
                uri.getClass();
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26 = (BrazeExternalSyntheticLambda26) jsonObjectSerializer.jsonReflectionObjectSerializer;
                div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                brazeExternalSyntheticLambda26.write(fragmentActivity, supportFragmentManager, uri, "Terms And Conditions", "Terms And Conditions");
                return createfromparcel;
            case 1:
                String str2 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str2.getClass();
                SettingsViewModel settingsViewModel = (SettingsViewModel) this.MediaMetadataCompat;
                settingsViewModel.getClass();
                subscribeToBannersDismissedEventandroid_sdk_base_release subscribetobannersdismissedeventandroid_sdk_base_release = settingsViewModel.ComponentActivity;
                subscribetobannersdismissedeventandroid_sdk_base_release.getClass();
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("toggle_type", str2);
                if (zBooleanValue) {
                    int i6 = RemoteActionCompatParcelizer + 17;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    str = "on";
                    i = 2;
                } else {
                    int i7 = IconCompatParcelizer + 11;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    i = 2;
                    int i8 = i7 % 2;
                    str = "off";
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("new_status", str);
                onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = new onViewAttachedToWindowlambda0[i];
                onviewattachedtowindowlambda0Arr[0] = onviewattachedtowindowlambda0;
                onviewattachedtowindowlambda0Arr[1] = onviewattachedtowindowlambda1;
                subscribetobannersdismissedeventandroid_sdk_base_release.read.logEvent("rider_promotion_toggle_change", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0Arr));
                if (zBooleanValue) {
                    BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(settingsViewModel), null, null, new androidx.room.RoomDatabase.AnonymousClass1(settingsViewModel, str2, true, (ShortNewsContentCardView) null), 3);
                } else {
                    r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA r8lambdardo_un7xdjhqoviqton9xcxiqpa = settingsViewModel.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    r8lambdardo_un7xdjhqoviqton9xcxiqpa.getClass();
                    r8lambdardo_un7xdjhqoviqton9xcxiqpa.IconCompatParcelizer.IconCompatParcelizer(new r8lambdaRs8ikecszMGN9l84OfpDXRodorE((generatePOSTBodyString) r8lambdardo_un7xdjhqoviqton9xcxiqpa.write.MediaSessionCompatResultReceiverWrapper(), str2));
                }
                return createfromparcel;
            case 2:
                r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o r8lambdal_fwgru_wvotlrxdso9ikjmb4o = (r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o) obj;
                androidx.fragment.app.FragmentActivity fragmentActivity2 = (androidx.fragment.app.FragmentActivity) obj2;
                r8lambdal_fwgru_wvotlrxdso9ikjmb4o.getClass();
                fragmentActivity2.getClass();
                r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum = (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) this.MediaMetadataCompat;
                r8lambdakakrsj0yrwnwiggdad9idpyum.getClass();
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda27 = r8lambdakakrsj0yrwnwiggdad9idpyum.RemoteActionCompatParcelizer;
                div7Ah8Wj8 supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                brazeExternalSyntheticLambda27.write(fragmentActivity2, supportFragmentManager2, Uri.parse(r8lambdal_fwgru_wvotlrxdso9ikjmb4o.RemoteActionCompatParcelizer), r8lambdal_fwgru_wvotlrxdso9ikjmb4o.serializer, r8lambdal_fwgru_wvotlrxdso9ikjmb4o.write);
                return createfromparcel;
            case 3:
                r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ r8lambdamciokcs7zg0fxr0ccpxoy9t79zq = (r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ) obj;
                androidx.fragment.app.FragmentActivity fragmentActivity3 = (androidx.fragment.app.FragmentActivity) obj2;
                r8lambdamciokcs7zg0fxr0ccpxoy9t79zq.getClass();
                fragmentActivity3.getClass();
                r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum2 = (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) this.MediaMetadataCompat;
                r8lambdakakrsj0yrwnwiggdad9idpyum2.getClass();
                r8lambdakakrsj0yrwnwiggdad9idpyum2.read.serializer((Activity) fragmentActivity3, Uri.parse(r8lambdamciokcs7zg0fxr0ccpxoy9t79zq.write), false);
                return createfromparcel;
            case 4:
                r8lambdam8zKDGVczFsFTURUOoSF_afmF0 r8lambdam8zkdgvczfsfturuoosf_afmf0 = (r8lambdam8zKDGVczFsFTURUOoSF_afmF0) obj;
                androidx.fragment.app.FragmentActivity fragmentActivity4 = (androidx.fragment.app.FragmentActivity) obj2;
                r8lambdam8zkdgvczfsfturuoosf_afmf0.getClass();
                fragmentActivity4.getClass();
                r8lambdakakRSJ0yRWnWIggdAd9IDPYuM r8lambdakakrsj0yrwnwiggdad9idpyum3 = (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) this.MediaMetadataCompat;
                r8lambdakakrsj0yrwnwiggdad9idpyum3.getClass();
                r8lambdakakrsj0yrwnwiggdad9idpyum3.serializer.RemoteActionCompatParcelizer(Uri.parse(r8lambdam8zkdgvczfsfturuoosf_afmf0.RemoteActionCompatParcelizer), fragmentActivity4);
                return createfromparcel;
            case 5:
                String str3 = (String) obj;
                lambda316 lambda316Var = (lambda316) obj2;
                str3.getClass();
                lambda316Var.getClass();
                lambda318 lambda318Var = (lambda318) this.MediaMetadataCompat;
                MutableStateFlow mutableStateFlow = lambda318Var.serializer;
                boolean z2 = lambda316Var.IconCompatParcelizer;
                if (!z2) {
                    NetworkBody networkBody = lambda318Var.RatingCompat;
                    if (str3.equals("vehicle")) {
                        ((decode) networkBody.IconCompatParcelizer).logEvent("vehicle_select", null);
                    } else if (str3.equals("bag")) {
                        int i9 = IconCompatParcelizer + 67;
                        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            ((decode) networkBody.IconCompatParcelizer).logEvent("bag_select", null);
                            throw null;
                        }
                        ((decode) networkBody.IconCompatParcelizer).logEvent("bag_select", null);
                    }
                    List<Object> list = ((lambda317) mutableStateFlow.read()).write;
                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                    for (Object objWrite : list) {
                        if (objWrite instanceof lambda314) {
                            int i10 = IconCompatParcelizer + 41;
                            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % i2;
                            lambda314 lambda314Var = (lambda314) objWrite;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda314Var.write, str3}, getCieXyz.write())).booleanValue()) {
                                List list2 = lambda314Var.RemoteActionCompatParcelizer;
                                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, i5));
                                Iterator it = list2.iterator();
                                int i12 = IconCompatParcelizer + 79;
                                RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i13 = i12 % i2;
                                while (it.hasNext()) {
                                    int i14 = RemoteActionCompatParcelizer + 75;
                                    IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i14 % i2 == 0) {
                                        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((lambda316) it.next()).read, lambda316Var.read}, getCieXyz.write())).booleanValue();
                                        Object obj5 = null;
                                        obj5.hashCode();
                                        throw null;
                                    }
                                    lambda316 lambda316Var2 = (lambda316) it.next();
                                    arrayList2.add(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda316Var2.read, lambda316Var.read}, getCieXyz.write())).booleanValue() ? lambda316.RemoteActionCompatParcelizer(lambda316Var2, lambda316Var2.IconCompatParcelizer ^ z, false, 23) : lambda316.RemoteActionCompatParcelizer(lambda316Var2, false, false, 23));
                                    i2 = 2;
                                    z = true;
                                }
                                objWrite = lambda314.write(lambda314Var, arrayList2);
                            } else {
                                continue;
                            }
                        }
                        arrayList.add(objWrite);
                        i2 = 2;
                        i5 = 10;
                        z = true;
                    }
                    ArrayList arrayListSerializer = lambda318.serializer(arrayList, str3, lambda316.RemoteActionCompatParcelizer(lambda316Var, z ^ z2, false, 23));
                    do {
                        obj3 = mutableStateFlow.read();
                        ((lambda317) obj3).getClass();
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, new lambda317(arrayListSerializer)));
                }
                return createfromparcel;
            case 6:
                androidx.fragment.app.FragmentActivity fragmentActivity5 = (androidx.fragment.app.FragmentActivity) obj;
                EquipmentBottomSheetParams equipmentBottomSheetParams = (EquipmentBottomSheetParams) obj2;
                fragmentActivity5.getClass();
                equipmentBottomSheetParams.getClass();
                accessisMainThread accessismainthread = ((logFeatureFlagImpressionlambda0) this.MediaMetadataCompat).RemoteActionCompatParcelizer;
                div7Ah8Wj8 supportFragmentManager3 = fragmentActivity5.getSupportFragmentManager();
                supportFragmentManager3.getClass();
                MotionEventAdapterIndirectPointerEventData.read("EQUIPMENT_BOTTOM_SHEET_REQUEST_KEY", equipmentBottomSheetParams).RemoteActionCompatParcelizer(supportFragmentManager3, "com.roadrunner.startworking.equipment.EquipmentBottomSheet");
                return createfromparcel;
            default:
                logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = (logPushDeliveryandroid_sdk_base_release) obj;
                requestBannersRefresh requestbannersrefresh = (requestBannersRefresh) obj2;
                logpushdeliveryandroid_sdk_base_release.getClass();
                requestbannersrefresh.getClass();
                handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_release = (handleInAppMessageTestPushandroid_sdk_base_release) this.MediaMetadataCompat;
                handleinappmessagetestpushandroid_sdk_base_release.getClass();
                List<requestBannersRefresh> list3 = logpushdeliveryandroid_sdk_base_release.write;
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                for (requestBannersRefresh requestbannersrefreshSerializer : list3) {
                    if (requestbannersrefresh.equals(requestbannersrefreshSerializer)) {
                        int i15 = RemoteActionCompatParcelizer + 125;
                        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            requestbannersrefreshSerializer = requestBannersRefresh.serializer(requestbannersrefreshSerializer, true, requestbannersrefreshSerializer.read, 119);
                        } else {
                            requestbannersrefreshSerializer = requestBannersRefresh.serializer(requestbannersrefreshSerializer, false, !requestbannersrefreshSerializer.read, 7);
                        }
                        arrayList3.add(requestbannersrefreshSerializer);
                    }
                    arrayList3.add(requestbannersrefreshSerializer);
                }
                handleinappmessagetestpushandroid_sdk_base_release.serializer.IconCompatParcelizer(logPushDeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer(logpushdeliveryandroid_sdk_base_release, null, null, arrayList3, 15));
                return createfromparcel;
        }
    }
}
