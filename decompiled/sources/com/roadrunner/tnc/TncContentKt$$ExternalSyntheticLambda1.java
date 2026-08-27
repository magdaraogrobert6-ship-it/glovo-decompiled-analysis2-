package com.roadrunner.tnc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.common.HttpHeaders;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.rider.state.ondemand.presentation.OnDemandUiModelImpl;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import com.sentiance.core.model.events.C$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.JsonObjectSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import o.ActivityHandler40;
import o.AdjustFactory;
import o.AdjustInstance9;
import o.AnchoredDraggableKtrestartable2;
import o.BlockRunner;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.BrazeExternalSyntheticLambda28;
import o.BrazeExternalSyntheticLambda45;
import o.BundleUtils;
import o.C0169getOrderId;
import o.DataStoreUtilsa;
import o.DragAndDropTargetModifierNode;
import o.DraggableAnchorsElement;
import o.JvmDefaultWithCompatibility_jvmAndroidAndroidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ReferrerDetails;
import o.SingleThreadCachedScheduler;
import o.UncheckedColordefault;
import o._get_cachedContentCardsUpdatedEvent_lambda0;
import o._get_registeredPushToken_lambda0;
import o.accessgetCustomBrazeNotificationFactorycp;
import o.accessgetDeviceDataProvidercp;
import o.accessgetInstancedelegatecp;
import o.accessinstallForLifecycle;
import o.areCachedContentCardsStale;
import o.brazeLogTag;
import o.byte2HexFormatted;
import o.createDefaultInstance;
import o.createFromParcel;
import o.ddefault;
import o.decode;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.deserializeContentCard;
import o.div7Ah8Wj8;
import o.forName;
import o.fromString;
import o.getActivityHandler;
import o.getCieXyz;
import o.getDefaultJoinLxFBmk8;
import o.getGdprUrl;
import o.getGlobalPositionAwareOLwlOKwannotations;
import o.getMaxWidth;
import o.getOnThirdPartySharingSettingsReadListener;
import o.getOptimizationLevel;
import o.getPersonNamePrefix;
import o.getSceneString;
import o.getSdkDebuggerCallbackandroid_sdk_base_release;
import o.installForLifecycle;
import o.launchSessionResponseListenerI;
import o.launchThirdPartySharingResponseTasks;
import o.logPushNotificationActionClickedlambda12;
import o.onMove;
import o.onShowTranslationui;
import o.onViewAdded;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo;
import o.r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ;
import o.r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE;
import o.r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaLZjsjPSXWRendXZH98LKrH6PSs;
import o.r8lambdaMkSjJB1nMG37oUW_yupQha4;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaU4vLXHjORmFq6AKZsHFWuwIuLoo;
import o.r8lambdaU6FEEC8tmUhSdq6Ym_Pl3g2FyLo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaUvs_x70sPZ1RbJHSO9gVBc3lAYQ;
import o.r8lambdaXTprrz59IiooUoChp937ds3kuBc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.readContentProvider;
import o.removeNodeAtDepth;
import o.requestContentCardsRefreshlambda0;
import o.setCallbackId;
import o.setGraphicModalMaxWidthDp;
import o.setOnAdidReadListener;
import o.setOnAttributionReadListener;
import o.setPurchaseToken;
import o.setTransactionSuccessful;
import o.shouldProcessEventI;
import o.teardownAllGlobalParametersS;
import o.tintxETnrds;
import o.vlambda0;
import o.y3;
import o.z0;
import okhttp3.FormBody;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TncContentKt$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ TncContentKt$$ExternalSyntheticLambda1(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        long j;
        defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        z0 z0Var = null;
        switch (this.IconCompatParcelizer) {
            case 0:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer;
                FragmentActivity fragmentActivity = (FragmentActivity) this.serializer;
                requestContentCardsRefreshlambda0 requestcontentcardsrefreshlambda0 = (requestContentCardsRefreshlambda0) obj;
                requestcontentcardsrefreshlambda0.getClass();
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(requestcontentcardsrefreshlambda0, fragmentActivity);
                return createFromParcel.INSTANCE;
            case 1:
                y3 y3Var = (y3) this.RemoteActionCompatParcelizer;
                z0 z0Var2 = (z0) this.serializer;
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                y3Var.write.IconCompatParcelizer(tintxetnrds, z0Var2);
                return createFromParcel.INSTANCE;
            case 2:
                LocalDate localDate = (LocalDate) this.RemoteActionCompatParcelizer;
                y3 y3Var2 = (y3) this.serializer;
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM history WHERE date = ? LIMIT 1");
                try {
                    localDate.getClass();
                    String string = localDate.toString("yyyy-MM-dd");
                    string.getClass();
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, string);
                    int iWrite = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, HttpHeaders.DATE);
                    int iWrite2 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "deliveries");
                    if (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        String str = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite);
                        str.getClass();
                        LocalDate localDate2 = LocalDate.parse(str);
                        localDate2.getClass();
                        String str2 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite2);
                        BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21 = y3Var2.serializer;
                        z0Var = new z0(localDate2, BrazeCompanionExternalSyntheticLambda21.write(str2));
                        break;
                    }
                    return z0Var;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 3:
                shouldProcessEventI shouldprocesseventi = (shouldProcessEventI) this.RemoteActionCompatParcelizer;
                teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) this.serializer;
                teardownAllGlobalParametersS teardownallglobalparameterss2 = (teardownAllGlobalParametersS) obj;
                teardownallglobalparameterss2.getClass();
                teardownAllGlobalParametersS teardownallglobalparameterssWrite = teardownAllGlobalParametersS.write(teardownallglobalparameterss2, !teardownallglobalparameterss2.IconCompatParcelizer, false, 2015);
                FormBody.Builder builder = shouldprocesseventi.MediaSessionCompatQueueItem;
                String str3 = teardownallglobalparameterssWrite.MediaDescriptionCompat;
                long j2 = teardownallglobalparameterss.RemoteActionCompatParcelizer;
                launchThirdPartySharingResponseTasks launchthirdpartysharingresponsetasks = teardownallglobalparameterssWrite.IconCompatParcelizer ? launchThirdPartySharingResponseTasks.OPEN : launchThirdPartySharingResponseTasks.CLOSED;
                launchSessionResponseListenerI launchsessionresponselisteneri = launchSessionResponseListenerI.VENDOR;
                str3.getClass();
                launchsessionresponselisteneri.getClass();
                launchthirdpartysharingresponsetasks.getClass();
                builder.getClass();
                ((decode) builder.serializer).logEvent("recent_detail_click", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(j2)), new onViewAttachedToWindowlambda0("orderId", str3), new onViewAttachedToWindowlambda0("componentDetailStatus", launchthirdpartysharingresponsetasks.getValue()), new onViewAttachedToWindowlambda0("screenName", "Recent Deliveries")));
                return teardownallglobalparameterssWrite;
            case 4:
                Context context = (Context) this.RemoteActionCompatParcelizer;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.serializer;
                fromString fromstring = (fromString) obj;
                fromstring.getClass();
                if (ActivityHandler40.RemoteActionCompatParcelizer[fromstring.ordinal()] == 1) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.woowahan.bros")));
                } else {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                return createFromParcel.INSTANCE;
            case 5:
                C0169getOrderId c0169getOrderId = (C0169getOrderId) this.RemoteActionCompatParcelizer;
                getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) this.serializer;
                byte2HexFormatted byte2hexformatted = (byte2HexFormatted) obj;
                byte2hexformatted.getClass();
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = c0169getOrderId.write;
                List list = (List) ((getSceneString) getoptimizationlevel).read;
                brazeExternalSyntheticLambda28.getClass();
                list.getClass();
                List<setCallbackId> list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (setCallbackId setcallbackid : list2) {
                    setTransactionSuccessful settransactionsuccessful = brazeExternalSyntheticLambda28.read;
                    String str4 = setcallbackid.value;
                    String str5 = setcallbackid.localizeKey;
                    arrayList.add(new setPurchaseToken(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, "UNTIL_END_OF_SHIFT"}, getCieXyz.write())).booleanValue() ? settransactionsuccessful.read(str5) : af$$ExternalSyntheticOutline0.m(str4, " ", settransactionsuccessful.read(str5)), str4));
                }
                return byte2HexFormatted.RemoteActionCompatParcelizer(byte2hexformatted, null, arrayList, 1);
            case 6:
                C0169getOrderId c0169getOrderId2 = (C0169getOrderId) this.RemoteActionCompatParcelizer;
                SharedResourcePool sharedResourcePool = c0169getOrderId2.IconCompatParcelizer;
                String str6 = (String) this.serializer;
                getOptimizationLevel getoptimizationlevel2 = (getOptimizationLevel) obj;
                getoptimizationlevel2.getClass();
                if (getoptimizationlevel2 instanceof getSceneString) {
                    sharedResourcePool.serializer(AdjustFactory.serializer);
                    OtpLogger otpLogger = c0169getOrderId2.read;
                    otpLogger.getClass();
                    str6.getClass();
                    ff$$ExternalSyntheticOutline0.m("break_duration", str6, otpLogger.IconCompatParcelizer, "request_break");
                } else if (getoptimizationlevel2 instanceof getMaxWidth) {
                    sharedResourcePool.serializer(new getActivityHandler(new getGdprUrl(((getMaxWidth) getoptimizationlevel2).write())));
                } else if (!(getoptimizationlevel2 instanceof onViewAdded)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                return createFromParcel.INSTANCE;
            case 7:
                AdjustInstance9 adjustInstance9 = (AdjustInstance9) this.RemoteActionCompatParcelizer;
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.serializer;
                div7Ah8Wj8 div7ah8wj8 = (div7Ah8Wj8) obj;
                div7ah8wj8.getClass();
                CombinedScopeView combinedScopeView = adjustInstance9.read;
                r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer = ((r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE) ((JsonObjectSerializer) combinedScopeView.RemoteActionCompatParcelizer).jsonReflectionObjectSerializer).RemoteActionCompatParcelizer(R.string.my_shifts, "/app/rooster/web/my-shifts?nested_mode", "Rooster My Shifts");
                r8lambdaLZjsjPSXWRendXZH98LKrH6PSs.read((r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) combinedScopeView.read, fragmentActivity2, div7ah8wj8, ((setTransactionSuccessful) combinedScopeView.write).IconCompatParcelizer(r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer.IconCompatParcelizer), r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer.read, r8lambda5hznbmbgds2eczlmhrok6qxrfroRemoteActionCompatParcelizer.RemoteActionCompatParcelizer, "Rooster");
                return createFromParcel.INSTANCE;
            case 8:
                OnDemandUiModel onDemandUiModel = (OnDemandUiModel) this.RemoteActionCompatParcelizer;
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.serializer;
                setOnAdidReadListener setonadidreadlistener = (setOnAdidReadListener) obj;
                setonadidreadlistener.getClass();
                if (setonadidreadlistener instanceof setOnAttributionReadListener) {
                    ((StartWorkingNavigationUiModelImpl) ((OnDemandUiModelImpl) onDemandUiModel).RatingCompat.MediaSessionCompatResultReceiverWrapper()).serializer(StartWorkingNavAction.StartOnDemand.serializer);
                } else {
                    if (!(setonadidreadlistener instanceof getOnThirdPartySharingSettingsReadListener)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((getOnThirdPartySharingSettingsReadListener) setonadidreadlistener).IconCompatParcelizer, ddefault.IconCompatParcelizer, 0);
                }
                return createFromParcel.INSTANCE;
            case 9:
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) this.RemoteActionCompatParcelizer;
                String str7 = (String) this.serializer;
                AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2 = (AnchoredDraggableKtrestartable2) obj;
                anchoredDraggableKtrestartable2.getClass();
                anchoredDraggableKtrestartable2.serializer(1, null, DraggableAnchorsElement.write, createDefaultInstance.write);
                anchoredDraggableKtrestartable2.serializer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size(), null, new getGlobalPositionAwareOLwlOKwannotations(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 7), new DragAndDropTargetModifierNode(new forName(i3, str7, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk), true, 2039820996));
                anchoredDraggableKtrestartable2.serializer(1, null, DraggableAnchorsElement.write, createDefaultInstance.IconCompatParcelizer);
                return createFromParcel.INSTANCE;
            case 10:
                ReferrerDetails referrerDetails = (ReferrerDetails) this.RemoteActionCompatParcelizer;
                String str8 = ((readContentProvider) ((ArrayList) this.serializer).get(((Integer) obj).intValue())).IconCompatParcelizer.read;
                referrerDetails.getClass();
                str8.getClass();
                ArrayList arrayList2 = referrerDetails.write().write;
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((readContentProvider) it.next()).IconCompatParcelizer.read, str8}, getCieXyz.write())).booleanValue()) {
                            ((onShowTranslationui) referrerDetails.write).setValue(str8);
                        }
                    }
                }
                return createFromParcel.INSTANCE;
            case 11:
                C$b c$b = (C$b) this.RemoteActionCompatParcelizer;
                FragmentActivity fragmentActivity3 = (FragmentActivity) this.serializer;
                Uri uri = (Uri) obj;
                uri.getClass();
                ((BrazeExternalSyntheticLambda45) c$b.serializer).RemoteActionCompatParcelizer(uri, fragmentActivity3);
                return createFromParcel.INSTANCE;
            case 12:
                onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) this.RemoteActionCompatParcelizer;
                Brush brush = (Brush) this.serializer;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.getClass();
                float fFloatValue = ((Number) onviewattachedtowindow.getValue()).floatValue();
                long jMo1303getCenterF1C5BW0 = contentDrawScope.mo1303getCenterF1C5BW0();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo1231rotateUv8p0NA(fFloatValue, jMo1303getCenterF1C5BW0);
                    try {
                        DrawScope.m1284drawCircleV9BoPsw$default(contentDrawScope, brush, Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32)), 0L, 0.0f, null, null, 0, 124, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                        contentDrawScope.drawContent();
                        return createFromParcel.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        j = jMo1225getSizeNHjbRc;
                        c8$$ExternalSyntheticOutline0.m(drawContext, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = jMo1225getSizeNHjbRc;
                }
                break;
            case 13:
                Placeable placeable = (Placeable) this.RemoteActionCompatParcelizer;
                ZoomableNode zoomableNode = (ZoomableNode) this.serializer;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new SingleThreadCachedScheduler(zoomableNode, i3), 4, (Object) null);
                return createFromParcel.INSTANCE;
            case 14:
                NavigationSettingsFragment navigationSettingsFragment = (NavigationSettingsFragment) this.RemoteActionCompatParcelizer;
                ComposeView composeView = (ComposeView) this.serializer;
                r8lambdaU4vLXHjORmFq6AKZsHFWuwIuLoo r8lambdau4vlxhjormfq6akzshfwuwiuloo = (r8lambdaU4vLXHjORmFq6AKZsHFWuwIuLoo) obj;
                r8lambdau4vlxhjormfq6akzshfwuwiuloo.getClass();
                if (r8lambdau4vlxhjormfq6akzshfwuwiuloo.equals(r8lambdaUvs_x70sPZ1RbJHSO9gVBc3lAYQ.read)) {
                    if (navigationSettingsFragment.getOnBackPressedDispatcher == null) {
                        removeNodeAtDepth.serializer("routerNavigator");
                        throw null;
                    }
                    Context context2 = composeView.getContext();
                    context2.getClass();
                    Intent intent = new Intent(context2, (Class<?>) RouterActivity.class);
                    intent.addFlags(268468224);
                    context2.startActivity(intent);
                } else {
                    if (!r8lambdau4vlxhjormfq6akzshfwuwiuloo.equals(r8lambdaU6FEEC8tmUhSdq6Ym_Pl3g2FyLo.serializer)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    if (((DialogFragment) navigationSettingsFragment).read != null) {
                        navigationSettingsFragment.read(false, false);
                    } else {
                        FragmentActivity activity = navigationSettingsFragment.getActivity();
                        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                            onBackPressedDispatcher.IconCompatParcelizer();
                        }
                    }
                }
                return createFromParcel.INSTANCE;
            case 15:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer;
                r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq = (r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ) this.serializer;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(r8lambda6lbbiu9ea4hcjth7fzj0mblqlbq.IconCompatParcelizer, bool);
                return createFromParcel.INSTANCE;
            case 16:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer;
                r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = (r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) this.serializer;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.RemoteActionCompatParcelizer, bool2);
                return createFromParcel.INSTANCE;
            case 17:
                GetAppStateImpl getAppStateImpl = (GetAppStateImpl) this.RemoteActionCompatParcelizer;
                FragmentActivity fragmentActivity4 = (FragmentActivity) this.serializer;
                ((String) obj).getClass();
                accessgetCustomBrazeNotificationFactorycp accessgetcustombrazenotificationfactorycp = (accessgetCustomBrazeNotificationFactorycp) getAppStateImpl.serializer;
                accessgetDeviceDataProvidercp accessgetdevicedataprovidercp = accessgetDeviceDataProvidercp.HIDE_SIDE_MENU;
                accessgetcustombrazenotificationfactorycp.getClass();
                accessgetdevicedataprovidercp.getClass();
                accessgetcustombrazenotificationfactorycp.write.write(accessgetdevicedataprovidercp);
                new PhotoIdPreviewFragment().RemoteActionCompatParcelizer(fragmentActivity4.getSupportFragmentManager(), "PhotoIdPreviewFragment");
                return createFromParcel.INSTANCE;
            case 18:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.RemoteActionCompatParcelizer;
                _get_registeredPushToken_lambda0 _get_registeredpushtoken_lambda0 = (_get_registeredPushToken_lambda0) this.serializer;
                _get_cachedContentCardsUpdatedEvent_lambda0 _get_cachedcontentcardsupdatedevent_lambda0 = (_get_cachedContentCardsUpdatedEvent_lambda0) obj;
                _get_cachedcontentcardsupdatedevent_lambda0.getClass();
                if (_get_cachedcontentcardsupdatedevent_lambda0.equals(_get_cachedContentCardsUpdatedEvent_lambda0.IconCompatParcelizer)) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(_get_registeredpushtoken_lambda0.IconCompatParcelizer);
                    return createFromParcel.INSTANCE;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 19:
                SideMenuViewModel sideMenuViewModel = (SideMenuViewModel) this.RemoteActionCompatParcelizer;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.serializer;
                ((getPersonNamePrefix) obj).getClass();
                if (!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                    Boolean bool3 = Boolean.TRUE;
                    populateViewStructure_androidKtpopulate7.setValue(bool3);
                    sideMenuViewModel.serializer.IconCompatParcelizer(bool3);
                }
                return new BlockRunner(10);
            case 20:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.RemoteActionCompatParcelizer;
                logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12 = (logPushNotificationActionClickedlambda12) this.serializer;
                ((String) obj).getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(logpushnotificationactionclickedlambda12.serializer);
                return createFromParcel.INSTANCE;
            case 21:
                deserializeContentCard deserializecontentcard = (deserializeContentCard) this.RemoteActionCompatParcelizer;
                Calendar calendar = (Calendar) this.serializer;
                tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                tintxetnrds3.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds3.RemoteActionCompatParcelizer("DELETE FROM vendor_review_state WHERE updated_at < ?");
                try {
                    BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda22 = deserializecontentcard.write;
                    uncheckedColordefaultRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(1, calendar.getTimeInMillis());
                    uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                    return createFromParcel.INSTANCE;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                }
            case 22:
                deserializeContentCard deserializecontentcard2 = (deserializeContentCard) this.RemoteActionCompatParcelizer;
                areCachedContentCardsStale arecachedcontentcardsstale = (areCachedContentCardsStale) this.serializer;
                tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                tintxetnrds4.getClass();
                deserializecontentcard2.read.IconCompatParcelizer(tintxetnrds4, arecachedcontentcardsstale);
                return createFromParcel.INSTANCE;
            case 23:
                installForLifecycle installforlifecycle = (installForLifecycle) this.RemoteActionCompatParcelizer;
                brazeLogTag brazelogtag = (brazeLogTag) this.serializer;
                ((List) obj).getClass();
                Object obj2 = installforlifecycle.RemoteActionCompatParcelizer;
                if (obj2 == accessinstallForLifecycle.RemoteActionCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
                    return null;
                }
                for (Object obj3 : ((BundleUtils) obj2).IconCompatParcelizer) {
                    if (i3 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) obj3;
                    View childAt = ((JvmDefaultWithCompatibility_jvmAndroidAndroidKt) installforlifecycle.read).IconCompatParcelizer.getChildAt((i3 * 2) + 1);
                    childAt.getClass();
                    vlambda0 vlambda0Var = (vlambda0) childAt;
                    vlambda0Var.setTag(getsdkdebuggercallbackandroid_sdk_base_release.write);
                    DataStoreUtilsa dataStoreUtilsa = new DataStoreUtilsa(brazelogtag, i2);
                    getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = vlambda0Var.IconCompatParcelizer;
                    ((TextView) getdefaultjoinlxfbmk8.write).setText(getsdkdebuggercallbackandroid_sdk_base_release.read);
                    TextView textView = (TextView) getdefaultjoinlxfbmk8.write;
                    textView.setEnabled(getsdkdebuggercallbackandroid_sdk_base_release.RemoteActionCompatParcelizer);
                    textView.setSelected(getsdkdebuggercallbackandroid_sdk_base_release.serializer);
                    getdefaultjoinlxfbmk8.read.setVisibility(8);
                    ((vlambda0) getdefaultjoinlxfbmk8.serializer).setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(dataStoreUtilsa, i, getsdkdebuggercallbackandroid_sdk_base_release));
                    i3++;
                }
                return createFromParcel.INSTANCE;
            case 24:
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) this.RemoteActionCompatParcelizer;
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = (setGraphicModalMaxWidthDp) this.serializer;
                r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = (r8lambdaXTprrz59IiooUoChp937ds3kuBc) obj;
                r8lambdaxtprrz59iioouochp937ds3kubc.getClass();
                r8lambdaxtprrz59iioouochp937ds3kubc.write("key", setgraphicmodalmaxwidthdp.getDescriptor());
                r8lambdaxtprrz59iioouochp937ds3kubc.write("value", setgraphicmodalmaxwidthdp2.getDescriptor());
                return createFromParcel.INSTANCE;
            default:
                r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = (r8lambdaMkSjJB1nMG37oUW_yupQha4) this.RemoteActionCompatParcelizer;
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.serializer;
                ((IOException) obj).getClass();
                synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
                    r8lambdalmkbrrgswwtv97obrsj7trj7ai.MediaSessionCompatQueueItem();
                }
                return createFromParcel.INSTANCE;
        }
    }
}
