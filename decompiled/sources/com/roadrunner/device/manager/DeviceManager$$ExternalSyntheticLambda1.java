package com.roadrunner.device.manager;

import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$observeLocalTasks$$inlined$map$1;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository$observeLocalTasks$1;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.vendor.review.api.navigation.VendorReviewArgs;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import o.BrazeExternalSyntheticLambda28;
import o.CheckBoxPreference;
import o.ComposeAnimationState;
import o.ListPreferenceSavedState;
import o.NavHostFragmentExternalSyntheticLambda1;
import o.NotificationCompatAction;
import o.PopulateViewStructure_androidKtpopulate7;
import o.Preference;
import o.PreferenceGroupSavedState;
import o.RgbCompanionExternalSyntheticLambda0;
import o.SingleProcessDataStorereadAndInitapi1;
import o.accessgetFakeSavedStateRegistryOwnerp;
import o.accessibleField;
import o.createFromParcel;
import o.createOpenDelegate;
import o.createOpenHelper;
import o.div7Ah8Wj8;
import o.findDesignInfoProviderslambda10;
import o.getAnimatable;
import o.getAnimated;
import o.getContentViewGroupParentLayout;
import o.getEnterjXw82LU;
import o.getNoopState;
import o.getScrollRange;
import o.getStartEllipsisgIe3tQ8annotations;
import o.getTopFadingEdgeStrength;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.isAppSetIdReadingEnabled;
import o.makeTreedefault;
import o.onDependencyAdded;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.readDataOrHandleCorruption;
import o.relativeMoveTo;
import o.setDividerHeight;
import o.setFillTypeoQ8Xj4U;
import o.setNativeShader;
import o.setStatusBarBackgroundResource;
import o.setVerticalStyle;
import o.shouldIgnore;
import o.subscribeToNoMatchingTriggerForEventlambda0;
import o.subscribeToPushNotificationEventslambda0;
import o.updateData;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DeviceManager$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static byte read = -112;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ DeviceManager$$ExternalSyntheticLambda1(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int i5 = 4;
        FullscreenItemUi fullscreenItemUi = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i4) {
            case 0:
                ((setVerticalStyle) obj).serializer.IconCompatParcelizer(new onViewAttachedToWindowlambda0(Boolean.valueOf(Settings.Global.getInt(((Context) obj2).getContentResolver(), "airplane_mode_on", 0) == 0), Long.valueOf(System.currentTimeMillis())));
                return createfromparcel;
            case 1:
                try {
                    ((BluetoothLeScanner) obj2).stopScan((getAnimated) obj);
                    break;
                } catch (Exception e) {
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    forest.RemoteActionCompatParcelizer("BleScannerImpl");
                    forest.serializer(e, "stopScan failed during cleanup", new Object[0]);
                }
                return createfromparcel;
            case 2:
                ((getStartEllipsisgIe3tQ8annotations) obj2).IconCompatParcelizer.unregisterReceiver((SyncTask$ConnectivityChangeReceiver) obj);
                return createfromparcel;
            case 3:
                div7Ah8Wj8 supportFragmentManager = ((FragmentActivity) obj).getSupportFragmentManager();
                supportFragmentManager.getClass();
                PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = (PickUpDropOffDetailsUiModelImpl) ((PickUpDropOffDetailsUiModel) obj2);
                pickUpDropOffDetailsUiModelImpl.getClass();
                VendorReviewArgs vendorReviewArgs = new VendorReviewArgs(subscribeToPushNotificationEventslambda0.DF_PICK_UP, pickUpDropOffDetailsUiModelImpl.MediaSessionCompatQueueItem.deliveryId, subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE.getValue());
                VendorReviewFragment vendorReviewFragment = new VendorReviewFragment();
                onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("vendor_review", vendorReviewArgs)};
                vendorReviewFragment.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320));
                vendorReviewFragment.RemoteActionCompatParcelizer(supportFragmentManager, "com.roadrunner.vendor.review.presentation.VendorReviewFragment");
                return createfromparcel;
            case 4:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw) obj);
                return createfromparcel;
            case 5:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp = ((r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) ((findDesignInfoProviderslambda10) obj)).serializer;
                if (accessgetfakesavedstateregistryownerp != null) {
                    int i6 = write + 123;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    fullscreenItemUi = accessgetfakesavedstateregistryownerp.write;
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fullscreenItemUi);
                return createfromparcel;
            case 6:
                getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(getenterjxw82lu.taskId, getenterjxw82lu);
                return createfromparcel;
            case 7:
                CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) obj2;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj;
                CashPaymentTaskUiItem.Reasons reasons = cashPaymentTaskUiItem.reasons;
                if (reasons == null) {
                    int i8 = MediaBrowserCompatMediaItem + 31;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Reasons is null!", Timber.RemoteActionCompatParcelizer);
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(cashPaymentTaskUiItem.taskId, reasons);
                    int i10 = write + 31;
                    MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
                return createfromparcel;
            case 8:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((CashPaymentTaskUiItem.ReasonItem) obj);
                return createfromparcel;
            case 9:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(Double.valueOf(((r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj).amountPayable));
                return createfromparcel;
            case 10:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((makeTreedefault) obj);
                return createfromparcel;
            case 11:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
                getNoopState getnoopstate = ((ComposeAnimationState) obj2).actionData;
                if (getnoopstate != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(getnoopstate);
                }
                return createfromparcel;
            case 12:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((accessibleField) obj);
                return createfromparcel;
            case 13:
                ((PopulateViewStructure_androidKtpopulate7) obj).setValue((String) obj2);
                return createfromparcel;
            case 14:
                PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl = (PinValidationTaskUiModelImpl) obj2;
                pinValidationTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(pinValidationTaskUiModelImpl.IconCompatParcelizer, null, null, new NafathTimerDataStore$set$2(pinValidationTaskUiModelImpl, (FragmentActivity) obj, objArr == true ? 1 : 0, i5), 3);
                return createfromparcel;
            case 15:
                getAnimatable getanimatable = (getAnimatable) obj2;
                PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = (PickUpDropOffTasksUiModelV2Impl) obj;
                long j = pickUpDropOffTasksUiModelV2Impl.MediaSessionCompatQueueItem;
                String str = pickUpDropOffTasksUiModelV2Impl.PlaybackStateCompat;
                getanimatable.getClass();
                str.getClass();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ObserveRemoteTasksUseCaseImpl: invoke called", new Object[0]);
                TasksRepository tasksRepository = getanimatable.write;
                tasksRepository.getClass();
                return FlowKt.serializer(new TasksRepository$observeLocalTasks$$inlined$map$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new TasksRepository$observeLocalTasks$1(tasksRepository, j, str, null, 1), tasksRepository.IconCompatParcelizer), TasksRepository.read(j, str), 1));
            case 16:
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) obj2, null, null, new HomeViewModel.AnonymousClass1((RgbCompanionExternalSyntheticLambda0) obj, objArr2 == true ? 1 : 0, 12), 3);
                return createfromparcel;
            case 17:
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = (DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj2;
                if (((setStatusBarBackgroundResource) ((PopulateViewStructure_androidKtpopulate7) obj).getValue()).serializer) {
                    darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1.invoke();
                }
                return createfromparcel;
            case 18:
                ((NestScreenKt$NestScreen$1$1) obj2).invoke();
                ((relativeMoveTo) obj).write();
                int i12 = MediaBrowserCompatMediaItem + 31;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    return createfromparcel;
                }
                (objArr3 == true ? 1 : 0).hashCode();
                throw null;
            case 19:
                ((DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) obj2).invoke();
                relativeMoveTo.IconCompatParcelizer((relativeMoveTo) obj, "identity-popup", setFillTypeoQ8Xj4U.RemoteActionCompatParcelizer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(19)), 4);
                return createfromparcel;
            case 20:
                NotificationCompatAction notificationCompatAction = (NotificationCompatAction) obj;
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2).invoke(notificationCompatAction.MediaSessionCompatResultReceiverWrapper, notificationCompatAction.PlaybackStateCompat);
                return createfromparcel;
            case 21:
                ContextScope contextScope = ((updateData) obj).write;
                RouterLogger routerLogger = ((SingleProcessDataStorereadAndInitapi1) obj2).serializer;
                Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) routerLogger.read).write();
                objWrite.getClass();
                return new readDataOrHandleCorruption((getTopFadingEdgeStrength) objWrite, (BrazeExternalSyntheticLambda28) ((getScrollRange) routerLogger.serializer).write(), contextScope);
            case 22:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((NavHostFragmentExternalSyntheticLambda1) obj);
                return createfromparcel;
            case 23:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((CheckBoxPreference) obj).RemoteActionCompatParcelizer);
                return createfromparcel;
            case 24:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(((ListPreferenceSavedState) obj).write);
                return createfromparcel;
            case 25:
                Preference preference = (Preference) obj2;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
                if (preference.RemoteActionCompatParcelizer != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(preference);
                }
                return createfromparcel;
            case 26:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
                setDividerHeight setdividerheight = ((PreferenceGroupSavedState) obj2).write;
                if (setdividerheight != null) {
                    int i13 = MediaBrowserCompatMediaItem + 77;
                    write = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(setdividerheight);
                        int i14 = 99 / 0;
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(setdividerheight);
                    }
                    int i15 = write + 29;
                    MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                return createfromparcel;
            case 27:
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke((shouldIgnore) obj);
                return createfromparcel;
            case 28:
                SharedPreferences.Editor editorEdit = ((createOpenHelper) obj2).RemoteActionCompatParcelizer.edit();
                editorEdit.putString("CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL", onDependencyAdded.IconCompatParcelizer().toJson(obj));
                editorEdit.apply();
                return createfromparcel;
            default:
                createOpenHelper createopenhelper = (createOpenHelper) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    int i17 = MediaBrowserCompatMediaItem + 17;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    String string = createopenhelper.read.getString(((createOpenDelegate) it.next()).write());
                    if (string.startsWith("%('")) {
                        Object[] objArr4 = new Object[1];
                        a(string.substring(3), objArr4);
                        string = ((String) objArr4[0]).intern();
                    }
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                Map<String, ?> all = createopenhelper.RemoteActionCompatParcelizer.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    String str2 = (String) ((Map.Entry) it2.next()).getKey();
                    SharedPreferences.Editor editorEdit2 = createopenhelper.RemoteActionCompatParcelizer.edit();
                    editorEdit2.remove(str2);
                    editorEdit2.apply();
                }
                return createfromparcel;
        }
    }
}
