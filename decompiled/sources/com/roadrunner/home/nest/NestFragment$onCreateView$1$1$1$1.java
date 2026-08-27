package com.roadrunner.home.nest;

import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$onTransferChangeClicked$1;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.rider.state.quests.api.list.QuestListUiModel;
import com.roadrunner.rider.state.quests.presentation.list.QuestListUiModelImpl;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.ddefault;
import o.decode;
import o.dlambda0;
import o.generatePOSTBodyString;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.isInline;
import o.launchSessionResponseTasksI;
import o.onItemDismiss;
import o.onMove;
import o.onServiceConnected;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdaWGy3_366U8FSuLZ9uzjXv9xTUfo;
import o.r8lambdaXJwBFR3hveYBLWYKkfUhYenkZtI;
import o.r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno;
import o.r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns;
import o.r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;
import o.shouldProcessEventI;
import o.teardownEventMetadataS;
import o.toBitmapConfig1JJdX4A;
import o.trackMeasurementConsentI;
import okhttp3.FormBody;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NestFragment$onCreateView$1$1$1$1 extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NestFragment$onCreateView$1$1$1$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.write = i3;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Integer numValueOf = null;
        switch (i3) {
            case 0:
                String str = (String) obj;
                ddefault ddefaultVar = (ddefault) obj2;
                int iIntValue = ((Number) obj3).intValue();
                str.getClass();
                ddefaultVar.getClass();
                NestFragment nestFragment = (NestFragment) this.MediaMetadataCompat;
                dlambda0 dlambda0Var = nestFragment.invalidateMenu;
                if (dlambda0Var == null) {
                    removeNodeAtDepth.serializer("snackbarManager");
                    throw null;
                }
                View viewRequireView = nestFragment.requireView();
                viewRequireView.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefaultVar, iIntValue, Float.valueOf(nestFragment.getResources().getDimensionPixelSize(R.dimen.spacing_04)), null, 32);
                return createfromparcel;
            case 1:
                isInline isinline = (isInline) obj;
                String str2 = (String) obj2;
                double dDoubleValue = ((Number) obj3).doubleValue();
                isinline.getClass();
                str2.getClass();
                CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) this.MediaMetadataCompat;
                cashPaymentTaskUiModelImpl.getClass();
                BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl.serializer, null, null, new CashPaymentTaskUiModelImpl$onTransferChangeClicked$1(cashPaymentTaskUiModelImpl, isinline, str2, dDoubleValue, null), 3);
                return createfromparcel;
            case 2:
                Object objM4926initiatePutApiCall0E7RQCE = ((ConfirmationRepository) this.MediaMetadataCompat).m4926initiatePutApiCall0E7RQCE((String) obj, (Map) obj2, (ShortNewsContentCardView) obj3);
                return objM4926initiatePutApiCall0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? objM4926initiatePutApiCall0E7RQCE : new onItemDismiss(objM4926initiatePutApiCall0E7RQCE);
            case 3:
                Object objM4925initiatePostApiCall0E7RQCE = ((ConfirmationRepository) this.MediaMetadataCompat).m4925initiatePostApiCall0E7RQCE((String) obj, (Map) obj2, (ShortNewsContentCardView) obj3);
                return objM4925initiatePostApiCall0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED ? objM4925initiatePostApiCall0E7RQCE : new onItemDismiss(objM4925initiatePostApiCall0E7RQCE);
            case 4:
                Object objM4926initiatePutApiCall0E7RQCE2 = ((ConfirmationRepository) this.MediaMetadataCompat).m4926initiatePutApiCall0E7RQCE((String) obj, (Map) obj2, (ShortNewsContentCardView) obj3);
                return objM4926initiatePutApiCall0E7RQCE2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM4926initiatePutApiCall0E7RQCE2 : new onItemDismiss(objM4926initiatePutApiCall0E7RQCE2);
            case 5:
                Object objM4925initiatePostApiCall0E7RQCE2 = ((ConfirmationRepository) this.MediaMetadataCompat).m4925initiatePostApiCall0E7RQCE((String) obj, (Map) obj2, (ShortNewsContentCardView) obj3);
                return objM4925initiatePostApiCall0E7RQCE2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM4925initiatePostApiCall0E7RQCE2 : new onItemDismiss(objM4925initiatePostApiCall0E7RQCE2);
            case 6:
                Object objM4926initiatePutApiCall0E7RQCE3 = ((ConfirmationRepository) this.MediaMetadataCompat).m4926initiatePutApiCall0E7RQCE((String) obj, (Map) obj2, (ShortNewsContentCardView) obj3);
                if (objM4926initiatePutApiCall0E7RQCE3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objM4926initiatePutApiCall0E7RQCE3;
                }
                onItemDismiss onitemdismiss = new onItemDismiss(objM4926initiatePutApiCall0E7RQCE3);
                int i4 = RemoteActionCompatParcelizer + 99;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return onitemdismiss;
            case 7:
                String str3 = (String) obj;
                ddefault ddefaultVar2 = (ddefault) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                str3.getClass();
                ddefaultVar2.getClass();
                StackedDeliveryDetailsFragment stackedDeliveryDetailsFragment = (StackedDeliveryDetailsFragment) this.MediaMetadataCompat;
                dlambda0 dlambda0Var2 = stackedDeliveryDetailsFragment.invalidateMenu;
                if (dlambda0Var2 == null) {
                    removeNodeAtDepth.serializer("snackbarManager");
                    throw null;
                }
                int i6 = RemoteActionCompatParcelizer + 43;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                View viewRequireView2 = stackedDeliveryDetailsFragment.requireView();
                viewRequireView2.getClass();
                r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var2, viewRequireView2, str3, ddefaultVar2, iIntValue2, Float.valueOf(stackedDeliveryDetailsFragment.getResources().getDimensionPixelSize(R.dimen.spacing_04)), null, 32);
                return createfromparcel;
            case 8:
                onServiceConnected onserviceconnected = (onServiceConnected) obj;
                String str4 = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                onserviceconnected.getClass();
                str4.getClass();
                WorkNowWithInfraBoostUiModelImpl workNowWithInfraBoostUiModelImpl = (WorkNowWithInfraBoostUiModelImpl) ((WorkNowWithInfraBoostUiModel) this.MediaMetadataCompat);
                workNowWithInfraBoostUiModelImpl.getClass();
                workNowWithInfraBoostUiModelImpl.MediaSessionCompatToken.read(onserviceconnected, str4, "work_now_option_displayed", String.valueOf(zBooleanValue));
                return createfromparcel;
            case 9:
                long jLongValue = ((Number) obj).longValue();
                launchSessionResponseTasksI launchsessionresponsetasksi = (launchSessionResponseTasksI) obj3;
                launchsessionresponsetasksi.getClass();
                shouldProcessEventI shouldprocesseventi = (shouldProcessEventI) this.MediaMetadataCompat;
                shouldprocesseventi.getClass();
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(shouldprocesseventi), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1((teardownEventMetadataS) obj2, shouldprocesseventi, launchsessionresponsetasksi, jLongValue, (ShortNewsContentCardView) null), 3);
                return createfromparcel;
            case 10:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                double dDoubleValue3 = ((Number) obj2).doubleValue();
                launchSessionResponseTasksI launchsessionresponsetasksi2 = (launchSessionResponseTasksI) obj3;
                launchsessionresponsetasksi2.getClass();
                shouldProcessEventI shouldprocesseventi2 = (shouldProcessEventI) this.MediaMetadataCompat;
                shouldprocesseventi2.getClass();
                shouldprocesseventi2.read.getClass();
                shouldprocesseventi2.MediaDescriptionCompat.serializer(new trackMeasurementConsentI(String.format(Locale.ENGLISH, "geo:0,0?q=%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue3)}, 2))));
                FormBody.Builder builder = shouldprocesseventi2.MediaSessionCompatQueueItem;
                builder.getClass();
                ((decode) builder.serializer).logEvent("deliveries_map_icon_clicked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("callType", launchsessionresponsetasksi2.serializer.getValue()), new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(launchsessionresponsetasksi2.RemoteActionCompatParcelizer)), new onViewAttachedToWindowlambda0("orderId", launchsessionresponsetasksi2.IconCompatParcelizer), new onViewAttachedToWindowlambda0("screenName", "Recent Deliveries")));
                return createfromparcel;
            case 11:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                String str7 = (String) obj3;
                af$$ExternalSyntheticOutline0.m3978m(str5, str6, str7);
                QuestListUiModelImpl questListUiModelImpl = (QuestListUiModelImpl) ((QuestListUiModel) this.MediaMetadataCompat);
                questListUiModelImpl.getClass();
                questListUiModelImpl.RatingCompat.serializer.logEvent("quest_clicked", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("quest_id", str6), new onViewAttachedToWindowlambda0("quest_index", str7)));
                questListUiModelImpl.serializer.read(Uri.parse(str5));
                return createfromparcel;
            default:
                r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u = (r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                r8lambda7pyt14uieahlprgfczvsqchol6u.getClass();
                r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = (r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94) this.MediaMetadataCompat;
                r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns = r8lambdawf0f8_ok6qhelc2navzsyrule94.RemoteActionCompatParcelizer;
                if (zBooleanValue3) {
                    int i8 = r8lambdaWGy3_366U8FSuLZ9uzjXv9xTUfo.read[r8lambda7pyt14uieahlprgfczvsqchol6u.ordinal()];
                    if (i8 != 1) {
                        int i9 = RemoteActionCompatParcelizer + 31;
                        int i10 = i9 % Fields.SpotShadowColor;
                        read = i10;
                        if (i9 % 2 == 0 ? i8 == 2 : i8 == 5) {
                            numValueOf = Integer.valueOf(R.string.preference_avoid_tolls);
                        } else {
                            int i11 = i10 + 17;
                            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 == 0) {
                                numValueOf.hashCode();
                                throw null;
                            }
                        }
                    } else {
                        numValueOf = Integer.valueOf(R.string.preference_avoid_highways);
                    }
                    if (numValueOf != null) {
                        int iIntValue3 = numValueOf.intValue();
                        if (zBooleanValue2) {
                            setTransactionSuccessful settransactionsuccessful = r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.read;
                            int i12 = r8lambdaXJwBFR3hveYBLWYKkfUhYenkZtI.write[r8lambda7pyt14uieahlprgfczvsqchol6u.ordinal()];
                            if (i12 == 1) {
                                i = R.string.turn_by_turn_settings_dialog_avoid_highways_when_possible;
                            } else if (i12 == 2) {
                                i = R.string.turn_by_turn_settings_dialog_avoid_tolls_when_possible;
                            }
                            r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.write.IconCompatParcelizer(new r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno(r8lambda7pyt14uieahlprgfczvsqchol6u, iIntValue3, new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_good_to_know), false, settransactionsuccessful.IconCompatParcelizer(i), settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_got_it), null, null, 120, null)));
                        } else {
                            r8lambdawf0f8_ok6qhelc2navzsyrule94.PlaybackStateCompatCustomAction.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94.PlaybackStateCompat.IconCompatParcelizer(numValueOf.intValue()), false);
                            r8lambdawf0f8_ok6qhelc2navzsyrule94.MediaSessionCompatQueueItem.write(r8lambda7pyt14uieahlprgfczvsqchol6u, false);
                        }
                    }
                } else {
                    RealWebSocket$$ExternalSyntheticLambda0 realWebSocket$$ExternalSyntheticLambda0 = new RealWebSocket$$ExternalSyntheticLambda0(7, r8lambdawf0f8_ok6qhelc2navzsyrule94);
                    r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.getClass();
                    MutableStateFlow mutableStateFlow = r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.write;
                    setTransactionSuccessful settransactionsuccessful2 = r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.read;
                    mutableStateFlow.IconCompatParcelizer(new r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ(new generatePOSTBodyString(settransactionsuccessful2.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_need_to_turn_on_navigation), false, settransactionsuccessful2.read(R.string.turn_by_turn_settings_dialog_require_brand_navigation, ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.RemoteActionCompatParcelizer).IconCompatParcelizer), settransactionsuccessful2.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_use_in_app), null, settransactionsuccessful2.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_cancel), 104, null), realWebSocket$$ExternalSyntheticLambda0));
                    int i13 = RemoteActionCompatParcelizer + 61;
                    read = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
                return createfromparcel;
        }
    }
}
