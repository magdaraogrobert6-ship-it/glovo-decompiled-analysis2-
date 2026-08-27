package com.roadrunner.domain.usecase;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.BlockRunner;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.AmountTextInputState;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator.CustomerUnavailableArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.navigation.CodeScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.QrScanTaskArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.presentation.identitypopup.IdentityPopupViewModel;
import com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel;
import com.roadrunner.freelancing.api.bonus.WorkNowWithBonusUiModel;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.home.nest.riderstatistics.RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.login.presentation.checkemail.EmailClientNotFoundException;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import com.sentiance.core.model.events.N$b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKtrestartable2;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AnimationSearchExternalSyntheticLambda2;
import o.BrazeExternalSyntheticLambda26;
import o.BrazeExternalSyntheticLambda45;
import o.C0150a;
import o.ConstraintsKt;
import o.CoordinatorLayoutBehavior;
import o.DialogPreference;
import o.DragAndDropTargetModifierNode;
import o.EditTextPreferenceDialogFragment;
import o.ExperimentalUnitApi;
import o.FocusPropertiesNode;
import o.FontScaling;
import o.FontScalingDefaultImpls;
import o.GridLayoutManager;
import o.ItemTouchHelper;
import o.LinearLayoutManagerSavedState1;
import o.ListPreferenceDialogFragment;
import o.PlatformOptimizedCancellationException;
import o.PopulateViewStructure_androidKtpopulate7;
import o.Preference;
import o.PreferenceGroupAdapter;
import o.PrematureEndOfStreamVideoQuirk;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.ShortNewsContentCardView;
import o.StatementParameterInterceptor;
import o.SystemLifecycleSystemLifecycleCallback;
import o.Wallpapers;
import o.accessgetCancelcp;
import o.accessgetInstancedelegatecp;
import o.accessibleField;
import o.accessisRenderNodeCompatiblecp;
import o.allAnimations;
import o.applyLayoutFeatures;
import o.bitOffsetToIndex;
import o.bitsNeedForSizeUnchecked;
import o.buildGdprPackage;
import o.checkCompatWrapper;
import o.clearView;
import o.constrainWidthK40F9xA;
import o.createFromParcel;
import o.createTransitionInfolambda0;
import o.dashPathEffectdefault;
import o.div7Ah8Wj8;
import o.executeQuery;
import o.extractFromIndyLambdaFields;
import o.extractFromLegacyFieldsextractedName;
import o.ffExternalSyntheticOutline0;
import o.findAnimationSpec;
import o.fixedHeightOenEA2s;
import o.fixedJhjzzOo;
import o.generateLoremIpsum;
import o.getActionViewIntentlambda0;
import o.getAndClearParameters;
import o.getAnimatedProperties;
import o.getAnimationClocksui_tooling;
import o.getBitmapui_graphics;
import o.getChangingConfigurations;
import o.getCieXyz;
import o.getExtendedTouchPaddinghWWAJMo;
import o.getGlobalPositionAwareOLwlOKwannotations;
import o.getHasFixedWidthimpl;
import o.getId;
import o.getLastWindowInsets;
import o.getNoopState;
import o.getPathName;
import o.getPersonNamePrefix;
import o.getQueryContext;
import o.getScrimColor;
import o.getSuggestedMinimumWidth;
import o.getTopD9Ej5fMannotations;
import o.getTransactionExecutor;
import o.getTransitions;
import o.h4;
import o.hasAnimation;
import o.instantiateApplication;
import o.instantiateReceiver;
import o.internalPathIteratorSize;
import o.isMainThread;
import o.j6;
import o.makeMovementFlags;
import o.makeTreedefault;
import o.mergeJsonObjects;
import o.offsetNN6EwU;
import o.onBackPressedDispatcher_delegatelambda00;
import o.onDrawOver;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareToDraw;
import o.r8lambda1rNldqZTruYAmq0tSFsnillPA;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.restrictConstraintsxF2OJ5Q;
import o.setDividerHeight;
import o.setGuidelineBegin;
import o.setGuidelineEnd;
import o.setReferencedIds;
import o.setStrokeCapBeK7IIE;
import o.setTranslateX;
import o.smoothScrollToPosition;
import o.suppressLayout;
import o.throwInvalidConstraintException;
import o.throwInvalidConstraintsSizeException;
import o.timesGh9hcWk;
import o.tintxETnrds;
import o.unpackY;
import o.wrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SuspendingWorkUseCase$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ SuspendingWorkUseCase$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0728  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Calendar calendar;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        boolean zBefore = true;
        int i3 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (i2) {
            case 0:
                ((createFromParcel) obj).getClass();
                return ((TransitionState) obj3).RemoteActionCompatParcelizer(obj2);
            case 1:
                AmountTextInputState amountTextInputState = (AmountTextInputState) obj3;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (!focusState.isFocused() && !amountTextInputState.write) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                }
                return createfromparcel;
            case 2:
                getAnimatedProperties getanimatedproperties = (getAnimatedProperties) obj3;
                FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                AnimationSearchExternalSyntheticLambda2 animationSearchExternalSyntheticLambda2 = (AnimationSearchExternalSyntheticLambda2) obj;
                animationSearchExternalSyntheticLambda2.getClass();
                getanimatedproperties.getClass();
                if (animationSearchExternalSyntheticLambda2 instanceof r8lambda1rNldqZTruYAmq0tSFsnillPA) {
                    r8lambda1rNldqZTruYAmq0tSFsnillPA r8lambda1rnldqztruyamq0tsfsnillpa = (r8lambda1rNldqZTruYAmq0tSFsnillPA) animationSearchExternalSyntheticLambda2;
                    long j = r8lambda1rnldqztruyamq0tsfsnillpa.RemoteActionCompatParcelizer;
                    String str = r8lambda1rnldqztruyamq0tsfsnillpa.read;
                    makeTreedefault maketreedefault = r8lambda1rnldqztruyamq0tsfsnillpa.serializer;
                    str.getClass();
                    maketreedefault.getClass();
                    getAnimationClocksui_tooling getanimationclocksui_tooling = getanimatedproperties.RemoteActionCompatParcelizer;
                    CustomerUnavailableArgs customerUnavailableArgs = new CustomerUnavailableArgs(j, str, maketreedefault.taskId);
                    getanimationclocksui_tooling.getClass();
                    getId.read(customerUnavailableArgs).RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment");
                }
                return createfromparcel;
            case 3:
                getTransitions gettransitions = (getTransitions) obj3;
                FragmentActivity fragmentActivity2 = (FragmentActivity) obj2;
                findAnimationSpec findanimationspec = (findAnimationSpec) obj;
                findanimationspec.getClass();
                gettransitions.getClass();
                if (findanimationspec instanceof hasAnimation) {
                    hasAnimation hasanimation = (hasAnimation) findanimationspec;
                    long j2 = hasanimation.RemoteActionCompatParcelizer;
                    String str2 = hasanimation.read;
                    accessibleField accessiblefield = hasanimation.IconCompatParcelizer;
                    str2.getClass();
                    accessiblefield.getClass();
                    getAnimationClocksui_tooling getanimationclocksui_tooling2 = gettransitions.IconCompatParcelizer;
                    CustomerUnavailableArgs customerUnavailableArgs2 = new CustomerUnavailableArgs(j2, str2, accessiblefield.taskId);
                    getanimationclocksui_tooling2.getClass();
                    CustomerUnavailableFragmentV2 customerUnavailableFragmentV2 = new CustomerUnavailableFragmentV2();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("customer_unavailable", customerUnavailableArgs2);
                    customerUnavailableFragmentV2.setArguments(bundle);
                    customerUnavailableFragmentV2.RemoteActionCompatParcelizer(fragmentActivity2.getSupportFragmentManager(), "com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2");
                }
                return createfromparcel;
            case 4:
                String str3 = (String) obj2;
                accessibleField accessiblefield2 = (accessibleField) obj;
                accessiblefield2.getClass();
                m mVar = ((CustomerUnavailableViewModelV2) obj3).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                mVar.getClass();
                str3.getClass();
                g0 g0Var = (g0) mVar.read;
                List list = accessiblefield2.utccComponents;
                g0Var.getClass();
                list.getClass();
                List<Object> list2 = list;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (Object obj4 : list2) {
                    if (obj4 instanceof fixedJhjzzOo) {
                        fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) obj4;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fixedjhjzzoo.id, str3}, getCieXyz.write())).booleanValue()) {
                            restrictConstraintsxF2OJ5Q restrictconstraintsxf2oj5q = restrictConstraintsxF2OJ5Q.INITIATED;
                            obj4 = fixedJhjzzOo.read(fixedjhjzzoo, (ConstraintsKt) fixedjhjzzoo.availableStates.get(restrictconstraintsxf2oj5q), restrictconstraintsxf2oj5q, false, false, 207);
                        }
                    }
                    arrayList.add(obj4);
                }
                Set setWrite = m.write(arrayList);
                ((IsFixableByRetry) mVar.RemoteActionCompatParcelizer).getClass();
                return accessibleField.write(accessiblefield2, IsFixableByRetry.IconCompatParcelizer(setWrite, arrayList), fixedHeightOenEA2s.serializer(accessiblefield2.taskState, onMove.serializer(accessiblefield2.taskState.componentStatus, new onViewAttachedToWindowlambda0(str3, restrictConstraintsxF2OJ5Q.INITIATED.getKey())), null, null, null, 14), 47);
            case 5:
                accessibleField accessiblefield3 = (accessibleField) obj;
                accessiblefield3.getClass();
                m mVar2 = ((CustomerUnavailableViewModelV2) obj3).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                String str4 = ((bitOffsetToIndex) obj2).id;
                mVar2.getClass();
                str4.getClass();
                List<Object> list3 = accessiblefield3.utccComponents;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                for (Object obj5 : list3) {
                    if (obj5 instanceof bitOffsetToIndex) {
                        bitOffsetToIndex bitoffsettoindex = (bitOffsetToIndex) obj5;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bitoffsettoindex.id, str4}, getCieXyz.write())).booleanValue()) {
                            Map map = bitoffsettoindex.availableStates;
                            bitsNeedForSizeUnchecked bitsneedforsizeunchecked = bitsNeedForSizeUnchecked.COMPLETED;
                            constrainWidthK40F9xA constrainwidthk40f9xa = (constrainWidthK40F9xA) map.get(bitsneedforsizeunchecked);
                            if (constrainwidthk40f9xa == null) {
                                int i4 = serializer + 9;
                                write = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    constrainWidthK40F9xA constrainwidthk40f9xa2 = bitoffsettoindex.currentState;
                                    throw null;
                                }
                                constrainwidthk40f9xa = bitoffsettoindex.currentState;
                            }
                            obj5 = bitOffsetToIndex.read(bitoffsettoindex, null, constrainwidthk40f9xa, bitsneedforsizeunchecked, false, 319);
                        }
                    }
                    arrayList2.add(obj5);
                }
                Set setWrite2 = m.write(arrayList2);
                ((IsFixableByRetry) mVar2.RemoteActionCompatParcelizer).getClass();
                return accessibleField.write(accessiblefield3, IsFixableByRetry.IconCompatParcelizer(setWrite2, arrayList2), fixedHeightOenEA2s.serializer(accessiblefield3.taskState, onMove.serializer(accessiblefield3.taskState.componentStatus, new onViewAttachedToWindowlambda0(str4, bitsNeedForSizeUnchecked.COMPLETED.getKey())), null, null, null, 14), 47);
            case 6:
                getNoopState getnoopstate = (getNoopState) obj;
                getnoopstate.getClass();
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3).invoke(((fixedJhjzzOo) obj2).id, getnoopstate);
                return createfromparcel;
            case 7:
                DatePickerTaskUiModelImpl datePickerTaskUiModelImpl = (DatePickerTaskUiModelImpl) obj3;
                long jLongValue = ((Long) obj).longValue();
                extractFromIndyLambdaFields extractfromindylambdafields = ((createTransitionInfolambda0) obj2).IconCompatParcelizer;
                datePickerTaskUiModelImpl.getClass();
                extractfromindylambdafields.getClass();
                Calendar calendar2 = Calendar.getInstance(Locale.getDefault());
                calendar2.setTimeInMillis(jLongValue);
                String str5 = DateFormat.getDateInstance(2, Locale.getDefault()).format(calendar2.getTime());
                str5.getClass();
                String str6 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(calendar2.getTimeInMillis()));
                str6.getClass();
                extractFromLegacyFieldsextractedName extractfromlegacyfieldsextractedname = extractfromindylambdafields.dateValidation;
                Integer num = extractfromindylambdafields.minimumAge;
                if (extractfromlegacyfieldsextractedname != null || num != null) {
                    if (extractfromlegacyfieldsextractedname != null) {
                        try {
                            Date date = new SimpleDateFormat(extractfromlegacyfieldsextractedname.format, Locale.getDefault()).parse(extractfromlegacyfieldsextractedname.date);
                            date.getClass();
                            calendar = Calendar.getInstance();
                            calendar.setTime(date);
                        } catch (Exception e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Invalid date or format for backend date validation", new Object[0]);
                            calendar = null;
                        }
                        if (calendar == null || calendar2.get(1) != calendar.get(1) || calendar2.get(2) != calendar.get(2) || calendar2.get(5) != calendar.get(5)) {
                            zBefore = false;
                        }
                    } else {
                        Calendar calendar3 = Calendar.getInstance(Locale.getDefault());
                        calendar3.getClass();
                        if (num != null) {
                            Object objClone = calendar2.clone();
                            objClone.getClass();
                            Calendar calendar4 = (Calendar) objClone;
                            calendar4.add(1, num.intValue());
                            zBefore = true ^ calendar3.before(calendar4);
                        }
                    }
                    break;
                }
                Object obj6 = datePickerTaskUiModelImpl.ParcelableVolumeInfo.read();
                allAnimations allanimations = obj6 instanceof allAnimations ? (allAnimations) obj6 : null;
                if (allanimations != null) {
                    extractFromIndyLambdaFields extractfromindylambdafields2 = allanimations.IconCompatParcelizer;
                    if (zBefore) {
                        datePickerTaskUiModelImpl.MediaMetadataCompat.read(datePickerTaskUiModelImpl.IconCompatParcelizer, extractfromindylambdafields2.taskId);
                    }
                    BuildersKt.RemoteActionCompatParcelizer(datePickerTaskUiModelImpl.serializer, null, null, new QrCodeScanTaskUiModelImpl$1(datePickerTaskUiModelImpl, (extractFromIndyLambdaFields) extractFromIndyLambdaFields.serializer(setReferencedIds.write(), -981634389, setReferencedIds.write(), setReferencedIds.write(), setReferencedIds.write(), 981634390, new Object[]{extractfromindylambdafields2, str6, str5, Boolean.valueOf(zBefore), Long.valueOf(jLongValue)}), shortNewsContentCardView, 17), 3);
                }
                return createfromparcel;
            case 8:
                RouterLogger routerLogger = (RouterLogger) obj3;
                FragmentActivity fragmentActivity3 = (FragmentActivity) obj2;
                offsetNN6EwU offsetnn6ewu = (offsetNN6EwU) obj;
                offsetnn6ewu.getClass();
                routerLogger.getClass();
                if (offsetnn6ewu instanceof throwInvalidConstraintsSizeException) {
                    ((getTransactionExecutor) routerLogger.read).write();
                    return createfromparcel;
                }
                if (!(offsetnn6ewu instanceof throwInvalidConstraintException)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                isMainThread ismainthread = (isMainThread) routerLogger.serializer;
                throwInvalidConstraintException throwinvalidconstraintexception = (throwInvalidConstraintException) offsetnn6ewu;
                CodeScanTaskArgs codeScanTaskArgs = new CodeScanTaskArgs(throwinvalidconstraintexception.serializer, throwinvalidconstraintexception.IconCompatParcelizer, throwinvalidconstraintexception.write);
                ismainthread.getClass();
                CodeScanFragment codeScanFragment = new CodeScanFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("args_code_scanner", codeScanTaskArgs);
                codeScanFragment.setArguments(bundle2);
                codeScanFragment.RemoteActionCompatParcelizer(fragmentActivity3.getSupportFragmentManager(), "CodeScanFragment");
                return createfromparcel;
            case 9:
                CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) obj;
                cashPaymentTaskUiItem.getClass();
                return ((getTopD9Ej5fMannotations) obj3).PlaybackStateCompatCustomAction.serializer(cashPaymentTaskUiItem, (String) obj2);
            case 10:
                ProtobufEncoder protobufEncoder = (ProtobufEncoder) obj3;
                FragmentActivity fragmentActivity4 = (FragmentActivity) obj2;
                timesGh9hcWk timesgh9hcwk = (timesGh9hcWk) obj;
                timesgh9hcwk.getClass();
                if (timesgh9hcwk instanceof FontScaling) {
                    int i5 = write + 27;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    ((getTransactionExecutor) protobufEncoder.write).write();
                    return createfromparcel;
                }
                if (!(timesgh9hcwk instanceof FontScalingDefaultImpls)) {
                    if (!(timesgh9hcwk instanceof ExperimentalUnitApi)) {
                        protobufEncoder.getClass();
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    ExperimentalUnitApi experimentalUnitApi = (ExperimentalUnitApi) timesgh9hcwk;
                    long j3 = experimentalUnitApi.read;
                    String str7 = experimentalUnitApi.serializer;
                    String str8 = experimentalUnitApi.RemoteActionCompatParcelizer;
                    getActionViewIntentlambda0 getactionviewintentlambda0 = (getActionViewIntentlambda0) protobufEncoder.RemoteActionCompatParcelizer;
                    div7Ah8Wj8 supportFragmentManager = fragmentActivity4.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    PinScreenArgs pinScreenArgs = new PinScreenArgs(j3, str7, str8, false);
                    getactionviewintentlambda0.getClass();
                    PlatformOptimizedCancellationException.RemoteActionCompatParcelizer(pinScreenArgs).RemoteActionCompatParcelizer(supportFragmentManager, "PinScreenFragment");
                    return createfromparcel;
                }
                FontScalingDefaultImpls fontScalingDefaultImpls = (FontScalingDefaultImpls) timesgh9hcwk;
                long j4 = fontScalingDefaultImpls.write;
                String str9 = fontScalingDefaultImpls.RemoteActionCompatParcelizer;
                String str10 = fontScalingDefaultImpls.read;
                AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1 = (AndroidUiDispatcherCompanioncurrentThread1) protobufEncoder.serializer;
                QrScanTaskArgs qrScanTaskArgs = new QrScanTaskArgs(j4, str9, str10);
                androidUiDispatcherCompanioncurrentThread1.getClass();
                QrScannerFragment qrScannerFragment = new QrScannerFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("args_qr_scanner", qrScanTaskArgs);
                qrScannerFragment.setArguments(bundle3);
                qrScannerFragment.RemoteActionCompatParcelizer(fragmentActivity4.getSupportFragmentManager(), "QrScannerFragment");
                int i7 = serializer + 21;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return createfromparcel;
            case 11:
                getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = (getExtendedTouchPaddinghWWAJMo) obj3;
                ((getPersonNamePrefix) obj).getClass();
                getextendedtouchpaddinghwwajmo.getClass();
                PrematureEndOfStreamVideoQuirk.write();
                getextendedtouchpaddinghwwajmo.accessensureViewModelStore = (accessisRenderNodeCompatiblecp) obj2;
                getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer(null);
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(14, getextendedtouchpaddinghwwajmo);
            case 12:
                wrapper wrapperVar = (wrapper) obj3;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj2;
                dashPathEffectdefault dashpatheffectdefault = (dashPathEffectdefault) obj;
                dashpatheffectdefault.getClass();
                if (dashpatheffectdefault instanceof AsyncImagePainter$State$Success) {
                    populateViewStructure_androidKtpopulate7.setValue("image-" + wrapperVar.taskId);
                } else if (dashpatheffectdefault instanceof AsyncImagePainter$State$Error) {
                    Wallpapers wallpapers = wrapperVar.state;
                    if (wallpapers instanceof generateLoremIpsum) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((AsyncImagePainter$State$Error) dashpatheffectdefault).serializer.read, "PictureItem loading failed. " + wallpapers, new Object[0]);
                    }
                }
                return createfromparcel;
            case 13:
                getHasFixedWidthimpl gethasfixedwidthimpl = (getHasFixedWidthimpl) obj3;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj2;
                dashPathEffectdefault dashpatheffectdefault2 = (dashPathEffectdefault) obj;
                dashpatheffectdefault2.getClass();
                if (dashpatheffectdefault2 instanceof AsyncImagePainter$State$Success) {
                    populateViewStructure_androidKtpopulate8.setValue("image-" + gethasfixedwidthimpl.filePath);
                } else if (dashpatheffectdefault2 instanceof AsyncImagePainter$State$Error) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((AsyncImagePainter$State$Error) dashpatheffectdefault2).serializer.read, "PictureItem loading failed. " + gethasfixedwidthimpl, new Object[0]);
                }
                return createfromparcel;
            case 14:
                setStrokeCapBeK7IIE setstrokecapbek7iie = (setStrokeCapBeK7IIE) obj;
                setstrokecapbek7iie.getClass();
                getBitmapui_graphics getbitmapui_graphicsIconCompatParcelizer = prepareToDraw.IconCompatParcelizer(setstrokecapbek7iie);
                BlockRunner blockRunner = ((CoordinatorLayoutBehavior) ((getScrimColor) obj3)).serializer;
                return new SelfieFlowViewModel((setGuidelineBegin) ((executeQuery) blockRunner.read).write(), (SignInDataStore) ((applyLayoutFeatures) blockRunner.serializer).write(), (OtpLogger) ((executeQuery) blockRunner.RatingCompat).write(), (Vw$Vw) ((PreferenceGroupAdapter) blockRunner.write).write(), (CompleteIdentityVerificationUseCaseImpl) ((mergeJsonObjects) blockRunner.RemoteActionCompatParcelizer).write(), (setGuidelineEnd) ((mergeJsonObjects) blockRunner.IconCompatParcelizer).write(), getbitmapui_graphicsIconCompatParcelizer, (IdentityVerificationParams) obj2);
            case 15:
                ((setStrokeCapBeK7IIE) obj).getClass();
                SignInDataStore signInDataStore = ((getLastWindowInsets) ((getSuggestedMinimumWidth) obj3)).RemoteActionCompatParcelizer;
                return new IdentityPopupViewModel(new getQueryContext(), (OtpLogger) ((executeQuery) signInDataStore.serializer).write(), (unpackY) ((mergeJsonObjects) signInDataStore.RemoteActionCompatParcelizer).write(), (SystemLifecycleSystemLifecycleCallback) ((mergeJsonObjects) signInDataStore.read).write(), (IdentityVerificationParams) obj2);
            case 16:
                WorkNowWithBonusUiModel workNowWithBonusUiModel = (WorkNowWithBonusUiModel) obj3;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2;
                checkCompatWrapper checkcompatwrapper = (checkCompatWrapper) obj;
                checkcompatwrapper.getClass();
                if (checkcompatwrapper instanceof instantiateReceiver) {
                    ((StartWorkingNavigationUiModelImpl) ((WorkNowWithBonusUiModelImpl) workNowWithBonusUiModel).MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer(((instantiateReceiver) checkcompatwrapper).write);
                    return createfromparcel;
                }
                if (!(checkcompatwrapper instanceof instantiateApplication)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                instantiateApplication instantiateapplication = (instantiateApplication) checkcompatwrapper;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(instantiateapplication.write), instantiateapplication.read);
                return createfromparcel;
            case 17:
                String str11 = (String) obj;
                str11.getClass();
                ((Parser.Pair) ((SendTestPushUseCase) obj3).serializer).serializer((Activity) obj2, Uri.parse(str11), false);
                return createfromparcel;
            case 18:
                GridLayoutManager gridLayoutManager = (GridLayoutManager) obj3;
                FragmentActivity fragmentActivity5 = (FragmentActivity) obj2;
                DialogPreference dialogPreference = (DialogPreference) obj;
                dialogPreference.getClass();
                Uri uri = Uri.parse(dialogPreference.IconCompatParcelizer);
                int i9 = ItemTouchHelper.serializer[dialogPreference.write.ordinal()];
                if (i9 == 1) {
                    BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26 = gridLayoutManager.RemoteActionCompatParcelizer;
                    div7Ah8Wj8 supportFragmentManager2 = fragmentActivity5.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    brazeExternalSyntheticLambda26.write(fragmentActivity5, supportFragmentManager2, uri, dialogPreference.serializer, "Available Sessions");
                    return createfromparcel;
                }
                if (i9 == 2) {
                    gridLayoutManager.IconCompatParcelizer.serializer((Activity) fragmentActivity5, uri, false);
                    return createfromparcel;
                }
                if (i9 == 3) {
                    gridLayoutManager.read.RemoteActionCompatParcelizer(uri, fragmentActivity5);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 19:
                clearView clearview = (clearView) obj3;
                FragmentActivity fragmentActivity6 = (FragmentActivity) obj2;
                EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = (EditTextPreferenceDialogFragment) obj;
                editTextPreferenceDialogFragment.getClass();
                Uri uri2 = Uri.parse(editTextPreferenceDialogFragment.write);
                int i10 = makeMovementFlags.RemoteActionCompatParcelizer[editTextPreferenceDialogFragment.read.ordinal()];
                if (i10 == 1) {
                    BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda27 = clearview.write;
                    div7Ah8Wj8 supportFragmentManager3 = fragmentActivity6.getSupportFragmentManager();
                    supportFragmentManager3.getClass();
                    brazeExternalSyntheticLambda27.write(fragmentActivity6, supportFragmentManager3, uri2, editTextPreferenceDialogFragment.serializer, "Start Tutorial");
                    return createfromparcel;
                }
                int i11 = serializer + 119;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (i10 == 2) {
                    clearview.read.serializer((Activity) fragmentActivity6, uri2, false);
                    return createfromparcel;
                }
                if (i10 == 3) {
                    clearview.IconCompatParcelizer.RemoteActionCompatParcelizer(uri2, fragmentActivity6);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 20:
                N$b n$b = (N$b) obj3;
                FragmentActivity fragmentActivity7 = (FragmentActivity) obj2;
                Preference preference = (Preference) obj;
                preference.getClass();
                ListPreferenceDialogFragment listPreferenceDialogFragment = preference.RemoteActionCompatParcelizer;
                if (listPreferenceDialogFragment == null) {
                    return createfromparcel;
                }
                int i13 = write + 13;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                internalPathIteratorSize internalpathiteratorsize = (internalPathIteratorSize) n$b.serializer;
                String str12 = preference.serializer;
                str12.getClass();
                ff$$ExternalSyntheticOutline0.m("nestItemOpen", str12, internalpathiteratorsize.RemoteActionCompatParcelizer, "nest_clicked");
                Uri uri3 = Uri.parse(listPreferenceDialogFragment.serializer);
                int i15 = onDrawOver.read[listPreferenceDialogFragment.read.ordinal()];
                if (i15 == 1) {
                    BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda28 = (BrazeExternalSyntheticLambda26) n$b.write;
                    div7Ah8Wj8 supportFragmentManager4 = fragmentActivity7.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    brazeExternalSyntheticLambda28.write(fragmentActivity7, supportFragmentManager4, uri3, listPreferenceDialogFragment.RemoteActionCompatParcelizer, "RiderStatistics");
                    return createfromparcel;
                }
                if (i15 == 2) {
                    ((Parser.Pair) n$b.read).serializer((Activity) fragmentActivity7, uri3, false);
                    return createfromparcel;
                }
                if (i15 == 3) {
                    ((BrazeExternalSyntheticLambda45) n$b.IconCompatParcelizer).RemoteActionCompatParcelizer(uri3, fragmentActivity7);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 21:
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj3;
                AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2 = (AnchoredDraggableKtrestartable2) obj;
                anchoredDraggableKtrestartable2.getClass();
                anchoredDraggableKtrestartable2.serializer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size(), null, new getGlobalPositionAwareOLwlOKwannotations(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 4), new DragAndDropTargetModifierNode(new RiderStatisticsContentKt$RiderStatisticsList$lambda$0$0$$inlined$itemsIndexed$default$3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, i3, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk), true, 2039820996));
                return createfromparcel;
            case 22:
                Vw$Vw vw$Vw = (Vw$Vw) obj3;
                FragmentActivity fragmentActivity8 = (FragmentActivity) obj2;
                setDividerHeight setdividerheight = (setDividerHeight) obj;
                setdividerheight.getClass();
                String str13 = setdividerheight.read;
                if (str13 == null) {
                    return createfromparcel;
                }
                int i16 = LinearLayoutManagerSavedState1.read[setdividerheight.IconCompatParcelizer.ordinal()];
                if (i16 == 1) {
                    BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda29 = (BrazeExternalSyntheticLambda26) vw$Vw.IconCompatParcelizer;
                    div7Ah8Wj8 supportFragmentManager5 = fragmentActivity8.getSupportFragmentManager();
                    supportFragmentManager5.getClass();
                    brazeExternalSyntheticLambda29.write(fragmentActivity8, supportFragmentManager5, Uri.parse(str13), setdividerheight.write, "Wallet");
                    return createfromparcel;
                }
                int i17 = write;
                int i18 = i17 + 101;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                if (i16 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i20 = i17 + 43;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                ((Parser.Pair) vw$Vw.serializer).serializer((Activity) fragmentActivity8, Uri.parse(str13), false);
                return createfromparcel;
            case 23:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                ((smoothScrollToPosition) obj3).serializer.IconCompatParcelizer(tintxetnrds, (suppressLayout) obj2);
                return createfromparcel;
            case 24:
                View view = (View) obj3;
                ((getPersonNamePrefix) obj).getClass();
                onBackPressedDispatcher_delegatelambda00 onbackpresseddispatcher_delegatelambda00 = new onBackPressedDispatcher_delegatelambda00((PopulateViewStructure_androidKtpopulate7) obj2);
                View rootView = view.getRootView();
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                accessgetCancelcp.write(rootView, onbackpresseddispatcher_delegatelambda00);
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(15, view);
            case 25:
                ((Boolean) obj).getClass();
                ((RecordingViewModel) obj3).read((RoomDatabaseperformClear11) obj2, RoomDatabaseExternalSyntheticLambda2.LIVENESS_DETECTION);
                return createfromparcel;
            case 26:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                setTranslateX settranslatex = (setTranslateX) obj;
                settranslatex.getClass();
                if (settranslatex instanceof getChangingConfigurations) {
                    int i22 = write + 93;
                    serializer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    getChangingConfigurations getchangingconfigurations = (getChangingConfigurations) settranslatex;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(getchangingconfigurations.read, getchangingconfigurations.serializer);
                    return createfromparcel;
                }
                if (!settranslatex.equals(getPathName.IconCompatParcelizer)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i24 = serializer + 63;
                write = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                return createfromparcel;
            case 27:
                Context context = (Context) obj3;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                StatementParameterInterceptor statementParameterInterceptor = (StatementParameterInterceptor) obj;
                statementParameterInterceptor.getClass();
                if (!(statementParameterInterceptor instanceof getAndClearParameters)) {
                    if (statementParameterInterceptor instanceof C0150a) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((C0150a) statementParameterInterceptor).IconCompatParcelizer);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                context.getClass();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.APP_EMAIL");
                intent.setFlags(268435456);
                try {
                    context.startActivity(intent);
                    return createfromparcel;
                } catch (ActivityNotFoundException e2) {
                    Timber.RemoteActionCompatParcelizer.write(new EmailClientNotFoundException("Email app not found: " + e2, null));
                    return createfromparcel;
                }
            case 28:
                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                expressionBuilder.getClass();
                String str14 = ((ffExternalSyntheticOutline0) obj3).IconCompatParcelizer;
                str14.getClass();
                ArrayList arrayList3 = expressionBuilder.arguments;
                Expression[] expressionArr = {new Expression(str14)};
                Expression.ExpressionBuilder expressionBuilder2 = new Expression.ExpressionBuilder("get");
                expressionBuilder2.addArgument(expressionArr[0]);
                arrayList3.add(expressionBuilder2.build());
                expressionBuilder.literal("HIGH");
                buildGdprPackage buildgdprpackage = ((j6) obj2).serializer;
                expressionBuilder.color(buildgdprpackage.serializer("HIGH"));
                expressionBuilder.literal("MID");
                expressionBuilder.color(buildgdprpackage.serializer("MID"));
                expressionBuilder.literal("LOW");
                expressionBuilder.color(buildgdprpackage.serializer("LOW"));
                expressionBuilder.color(h4.serializer);
                return createfromparcel;
            default:
                MapNavigationImpl mapNavigationImpl = (MapNavigationImpl) obj3;
                MapboxMap mapboxMap = (MapboxMap) obj2;
                List list4 = (List) obj;
                list4.getClass();
                MapboxNavigation mapboxNavigationCurrent = MapboxNavigationApp.current();
                if (mapboxNavigationCurrent != null) {
                    mapNavigationImpl.RemoteActionCompatParcelizer(list4, mapboxNavigationCurrent, mapboxMap);
                }
                return createfromparcel;
        }
    }
}
