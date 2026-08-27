package okio.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.format.DateFormat;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.re2j.Machine$Queue;
import com.mapbox.navigation.base.formatter.UnitType;
import com.roadrunner.inappnotifications.data.database.InAppNotificationsDatabase_Impl;
import com.roadrunner.logger.logger.firebase.FirebaseEventLogger;
import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import com.roadrunner.map.container.enabled.presentation.MapViewModel;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.map.integration.mapbox.route.RouteArrowApi;
import com.roadrunner.map.integration.mapbox.speedlimit.SpeedLimitApi;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.permission.location.permission.LocationPermissionLifecycleHandler;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.sentry.JsonObjectSerializer;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeInAppMessageManagerCompanion;
import o.DefaultInAppMessageHtmlViewFactory;
import o.HttpUrlFetcher;
import o.InAppMessageHtmlBaseView;
import o.LottieAnimatableImplanimate2;
import o.MessageCompanion;
import o.ProtoFeatureMsggetAsFeature1;
import o.RecyclableBufferedInputStream;
import o.SuspendingTransacterDefaultImpls;
import o.ThrowableExtensionsKt;
import o.createInAppMessageViewlambda0;
import o.e9;
import o.g6;
import o.getAppropriateModalView;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.getUnregisteredInAppMessageannotations;
import o.hb;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.isMainThreadroom_runtime;
import o.k6;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.performClear;
import o.prepareForActivityTransitionCarryover;
import o.qdExternalSyntheticLambda0;
import o.qg;
import o.r8lambda2tFXStZN_MXijoyymezhxf14xPY;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.rc;
import o.removeNodeAtDepth;
import o.requestContentCardsRefreshFromCache;
import o.resetLayoutParamsIfAppropriate;
import o.setCarryoverInAppMessage;
import o.setPushDeliveryManagerandroid_sdk_base_release;
import o.transferSessionPackageI;
import o.updateAdidI;
import okio.Okio;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ResourceFileSystem$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ ResourceFileSystem$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws IOException {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int iWrite;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        Object obj = this.IconCompatParcelizer;
        int i4 = 6;
        switch (i3) {
            case 0:
                MessageCompanion messageCompanion = (MessageCompanion) obj;
                ClassLoader classLoader = messageCompanion.IconCompatParcelizer;
                HttpUrlFetcher httpUrlFetcher = messageCompanion.MediaBrowserCompatMediaItem;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url.getProtocol(), "file"}, getCieXyz.write())).booleanValue()) {
                        String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
                        onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(httpUrlFetcher, Path$Companion.RemoteActionCompatParcelizer(new File(url.toURI())));
                    } else {
                        onviewattachedtowindowlambda1 = null;
                    }
                    if (onviewattachedtowindowlambda1 != null) {
                        arrayList.add(onviewattachedtowindowlambda1);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int i5 = read + 119;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 4 / 4;
                }
                for (URL url2 : list2) {
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    int i7 = 1;
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(string, "jar:file:", false) && (iWrite = hideCurrentlyDisplayingInAppMessage.write(6, string, "!")) != -1) {
                        String str2 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(ThrowableExtensionsKt.IconCompatParcelizer(Path$Companion.RemoteActionCompatParcelizer(new File(URI.create(string.substring(4, iWrite)))), httpUrlFetcher, new BrazeInAppMessageManagerCompanion(i7)), MessageCompanion.write);
                    } else {
                        onviewattachedtowindowlambda0 = null;
                    }
                    if (onviewattachedtowindowlambda0 != null) {
                        int i8 = RemoteActionCompatParcelizer + 71;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            arrayList2.add(onviewattachedtowindowlambda0);
                            int i9 = 32 / 0;
                        } else {
                            arrayList2.add(onviewattachedtowindowlambda0);
                        }
                    }
                }
                return onContentCardDismissed.IconCompatParcelizer(arrayList2, arrayList);
            case 1:
                return InAppNotificationsDatabase_Impl.serializer((InAppNotificationsDatabase_Impl) obj);
            case 2:
                isMainThreadroom_runtime ismainthreadroom_runtime = (isMainThreadroom_runtime) obj;
                SharedPreferences.Editor editorEdit = ismainthreadroom_runtime.serializer.edit();
                editorEdit.getClass();
                return new performClear(editorEdit, ismainthreadroom_runtime.RemoteActionCompatParcelizer, ismainthreadroom_runtime.IconCompatParcelizer);
            case 3:
                return ((FirebaseRemoteConfigImpl) ((FirebaseEventLogger) obj).serializer).write("events_block_list_for_firebase");
            case 4:
                return ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) ((SuspendingTransacterDefaultImpls) obj).RemoteActionCompatParcelizer)).write("events_block_list_for_perseus");
            case 5:
                return ((setPushDeliveryManagerandroid_sdk_base_release) ((GetAuthStateViewModel) obj).RatingCompat).read(requestContentCardsRefreshFromCache.ID_VERIFICATION_IN_LOGIN);
            case 6:
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) obj);
                firebaseRemoteConfigImpl.getClass();
                return Boolean.valueOf(firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ASYNC_LOGIN_FLOW_ENABLED));
            case 7:
                onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
                ((inCompatibilityMode) ((MapViewModel) obj).IconCompatParcelizer).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(onbackinvokedlambda0Serializer));
            case 8:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = ((MapboxFragment) obj).MediaSessionCompatResultReceiverWrapper;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 9:
                float f = ((e9) obj).read.RemoteActionCompatParcelizer.getResources().getDisplayMetrics().density;
                int i10 = (int) (92.0f * f);
                return new g6(i10, i10, (int) (f * 144.0f), i10);
            case 10:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((hb) obj).RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_DEFERRED_NAVIGATION_SDK_INIT_ENABLED));
            case 11:
                Context applicationContext = ((k6) obj).serializer.getApplicationContext();
                applicationContext.getClass();
                Machine$Queue machine$Queue = new Machine$Queue(applicationContext);
                machine$Queue.unitType(UnitType.METRIC);
                return machine$Queue.build();
            case 12:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((RouteArrowApi) obj).write).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
            case 13:
                return Boolean.valueOf(((FirebaseRemoteConfigImpl) ((SpeedLimitApi) obj).serializer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
            case 14:
                getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                return new ProtoFeatureMsggetAsFeature1(SQLite.write(ConstantKt.CONTENT_TYPE_JSON), new JsonObjectSerializer(16, DelayKt.serializer(new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(i, (qdExternalSyntheticLambda0) obj))));
            case 15:
                return DateFormat.is24HourFormat(((qg) obj).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) ? "24h" : "12h";
            case 16:
                return ((rc) obj).write.IconCompatParcelizer();
            case 17:
                r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 r8lambda60pwjrj_ieyypznb7gugmuamr08 = r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.LOCATION;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((LocationPermissionLifecycleHandler) obj).RatingCompat;
                firebaseRemoteConfigImpl2.getClass();
                return new PermissionModel(r8lambda60pwjrj_ieyypznb7gugmuamr08, firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_DISMISSIBLE_ENABLED));
            case 18:
                return Long.valueOf(LottieAnimatableImplanimate2.serializer((LottieAnimatableImplanimate2) obj));
            case 19:
                return r8lambda2tFXStZN_MXijoyymezhxf14xPY.IconCompatParcelizer((r8lambda2tFXStZN_MXijoyymezhxf14xPY) obj);
            case 20:
                return new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44((Object[]) obj);
            case 21:
                resetLayoutParamsIfAppropriate resetlayoutparamsifappropriate = (resetLayoutParamsIfAppropriate) obj;
                getAppropriateModalView getappropriatemodalviewWrite = RangesKt.write("kotlinx.serialization.Polymorphic", createInAppMessageViewlambda0.RemoteActionCompatParcelizer, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0], new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(i4, resetlayoutparamsifappropriate));
                getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = resetlayoutparamsifappropriate.read;
                getunregisteredinappmessageannotations.getClass();
                DefaultInAppMessageHtmlViewFactory defaultInAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(getappropriatemodalviewWrite, getunregisteredinappmessageannotations);
                int i11 = RemoteActionCompatParcelizer + 15;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return defaultInAppMessageHtmlViewFactory;
            default:
                getAppropriateModalView getappropriatemodalview = (getAppropriateModalView) obj;
                return Integer.valueOf(Okio.IconCompatParcelizer(getappropriatemodalview, getappropriatemodalview.PlaybackStateCompatCustomAction));
        }
    }
}
