package com.braze;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import androidx.compose.ui.graphics.Fields;
import androidx.core.app.NotificationManagerCompat;
import androidx.room.Room;
import androidx.sqlite.SQLite;
import bo.app.f2$$ExternalSyntheticLambda4;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.Gender;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.outgoing.AttributionData;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.foodora.courier.delivery.service.DeliveryService;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1;
import com.google.firebase.firestore.pipeline.DocumentsSource;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesFragment;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.rider.recruitment.passverification.pass_error.PassErrorScreenKt$$ExternalSyntheticLambda4;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.YieldKt;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.DragAndDropTargetModifierNode;
import o.LetterSpacingSpanEm;
import o.LineHeightStyleTrimSaverlambda1;
import o.SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1;
import o.SubcomposeContentPainterElement;
import o.VerbatimTtsAnnotationSaverlambda1;
import o.autoInvalidateInsertedNode;
import o.autoInvalidateRemovedNode;
import o.contains64DMado;
import o.createFromParcel;
import o.fillStringBounds;
import o.getCieXyz;
import o.getEnterdhqQ8s;
import o.getIdJ3iCeTQ;
import o.getInsertedannotations;
import o.getQueryParameterslambda2;
import o.getRemovedannotations;
import o.getTransactionExecutor;
import o.inTransaction;
import o.isUnderlineText;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.or64DMado;
import o.prepareForActivityTransitionCarryover;
import o.q4ExternalSyntheticLambda9;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;
import o.requestInputModeiuPiT84;
import o.setOnApplyWindowInsetsListener;
import o.setTextCompositionRangepsREZIo;
import o.setTextSelectionRangeFDrldGo;
import o.setTextSubstitution;
import o.setTextSubstitutiondefault;
import o.setToggleableState;
import o.setTraversalIndex;
import o.shareWithSiblings;
import o.shouldIncreaseMaxIntrinsic;
import o.specifiesCanFocusProperty;
import o.stripNonMetricAffectingCharacterStyleSpans;
import o.tailH91voCIui;
import o.updateOffsetsgTq6Wqs;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeUser$$ExternalSyntheticLambda28 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BrazeUser$$ExternalSyntheticLambda28(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, LineHeightStyleTrimSaverlambda1 lineHeightStyleTrimSaverlambda1) {
        this.$r8$classId = 21;
        this.f$0 = deliveryAcceptButtonUiModelImpl;
    }

    public /* synthetic */ BrazeUser$$ExternalSyntheticLambda28(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        autoInvalidateRemovedNode autoinvalidateremovednode;
        String str;
        float f;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.f$0;
        int i5 = 0;
        int i6 = 1;
        Object obj2 = null;
        switch (i4) {
            case 0:
                return BrazeUser.setEmailNotificationSubscriptionType$lambda$0((NotificationSubscriptionType) obj);
            case 1:
                return Braze.Companion.enableDelayedInitialization$lambda$3((DelayedInitializationAnalyticsBehavior) obj);
            case 2:
                return BrazeUser.setGender$lambda$0((Gender) obj);
            case 3:
                return AttributionData.forJsonPut$lambda$0((JSONException) obj);
            case 4:
                return BrazeDeeplinkHandler.Companion.setBrazeDeeplinkHandler$lambda$0((IBrazeDeeplinkHandler) obj);
            case 5:
                return BrazeWebViewClient.appendBridgeJavascript$lambda$0((BrazeWebViewClient) obj);
            case 6:
                return UriAction.getActionViewIntent$lambda$0((ResolveInfo) obj);
            case 7:
                return BannerJavascriptInterface.beforeMessageClosed$lambda$0((BannerJavascriptInterface) obj);
            case 8:
                return ContentCardsFragment.contentCardsUpdate$lambda$0((ContentCardsUpdatedEvent) obj);
            case 9:
                return DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$2((DefaultInAppMessageViewWrapper) obj);
            case 10:
                int i7 = DeliveryService.serializer;
                onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
                if (((DeliveryService) obj).write == null) {
                    removeNodeAtDepth.serializer("dispatcherProvider");
                    throw null;
                }
                int i8 = read + 41;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
                }
                YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer));
                throw null;
            case 11:
                requestInputModeiuPiT84 requestinputmodeiupit84 = (requestInputModeiuPiT84) obj;
                return requestinputmodeiupit84.IconCompatParcelizer.getApplicationContext().registerReceiver(requestinputmodeiupit84.read, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            case 12:
                return MainActivity.IconCompatParcelizer((setOnApplyWindowInsetsListener) obj);
            case 13:
                getIdJ3iCeTQ getidj3icetq = (getIdJ3iCeTQ) obj;
                q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(getidj3icetq.write, getidj3icetq.IconCompatParcelizer, null, null, 12);
                return createfromparcel;
            case 14:
                return new DrawablePainter$callback$2$1(i5, (DrawablePainter) obj);
            case 15:
                BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, getQueryParameterslambda2.serializer());
                boolean z = false;
                for (specifiesCanFocusProperty specifiescanfocusproperty : ((tailH91voCIui) obj).IconCompatParcelizer) {
                    if (specifiescanfocusproperty instanceof getRemovedannotations) {
                        if (!z) {
                            int i9 = read + 47;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 != 0) {
                                baseContentCardViewExternalSyntheticLambda0.add(or64DMado.write);
                                z = false;
                            } else {
                                baseContentCardViewExternalSyntheticLambda0.add(or64DMado.write);
                                z = true;
                            }
                        }
                        baseContentCardViewExternalSyntheticLambda0.add(specifiescanfocusproperty);
                    } else if (specifiescanfocusproperty instanceof or64DMado) {
                        or64DMado or64dmado = (or64DMado) specifiescanfocusproperty;
                        contains64DMado[] contains64dmadoArr = or64dmado.RemoteActionCompatParcelizer;
                        int length = contains64dmadoArr.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                autoInvalidateInsertedNode autoinvalidateinsertednode = contains64dmadoArr[i10].read;
                                if (autoinvalidateinsertednode instanceof autoInvalidateRemovedNode) {
                                    autoinvalidateremovednode = (autoInvalidateRemovedNode) autoinvalidateinsertednode;
                                    int i11 = read + 113;
                                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                                    int i12 = i11 % 2;
                                } else {
                                    autoinvalidateremovednode = null;
                                }
                                if (autoinvalidateremovednode != null) {
                                    int i13 = read + 95;
                                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                                    if (i13 % 2 != 0) {
                                        String str2 = autoinvalidateremovednode.write;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    str = autoinvalidateremovednode.write;
                                } else {
                                    str = null;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "__name__"}, getCieXyz.write())).booleanValue()) {
                                    i10++;
                                } else if (i10 < 0) {
                                }
                            }
                            List listAsList = Arrays.asList(contains64dmadoArr);
                            listAsList.getClass();
                            autoInvalidateRemovedNode autoinvalidateremovednode2 = autoInvalidateRemovedNode.IconCompatParcelizer;
                            autoinvalidateremovednode2.getClass();
                            or64dmado = new or64DMado((contains64DMado[]) onContentCardDismissed.RemoteActionCompatParcelizer((Collection) listAsList, (Object) new contains64DMado(autoinvalidateremovednode2, getInsertedannotations.ASCENDING)).toArray(new contains64DMado[0]), or64dmado.MediaSessionCompatQueueItem);
                        }
                        baseContentCardViewExternalSyntheticLambda0.add(or64dmado);
                        z = true;
                    } else {
                        baseContentCardViewExternalSyntheticLambda0.add(specifiescanfocusproperty);
                    }
                }
                if (!z) {
                    baseContentCardViewExternalSyntheticLambda0.add(or64DMado.write);
                }
                return SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
            case 16:
                shareWithSiblings[] sharewithsiblingsArr = ((DocumentsSource) obj).RemoteActionCompatParcelizer;
                ArrayList arrayList = new ArrayList(sharewithsiblingsArr.length);
                int length2 = sharewithsiblingsArr.length;
                while (i5 < length2) {
                    arrayList.add(sharewithsiblingsArr[i5].write());
                    i5++;
                }
                return onContentCardDismissed.write(arrayList);
            case 17:
                return (createFromParcel) LogoutActivity.write(771640202, SubcomposeContentPainterElement.read(), new Object[]{(LogoutActivity) obj}, SubcomposeContentPainterElement.read(), -771640201, SubcomposeContentPainterElement.read(), SubcomposeContentPainterElement.read());
            case 18:
                return (SharedPreferences) ((setTextCompositionRangepsREZIo) obj).RemoteActionCompatParcelizer.write();
            case 19:
                setTextSubstitution settextsubstitutionWrite = ((setTextSubstitutiondefault) ((SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1) obj).IconCompatParcelizer.locationProvider).write();
                setTraversalIndex settraversalindex = settextsubstitutionWrite.serializer;
                setTraversalIndex settraversalindex2 = settextsubstitutionWrite.RemoteActionCompatParcelizer;
                setTextSelectionRangeFDrldGo settextselectionrangefdrldgo = settraversalindex.IconCompatParcelizer;
                setTextSelectionRangeFDrldGo settextselectionrangefdrldgo2 = setTextSelectionRangeFDrldGo.AVAILABLE;
                if (settextselectionrangefdrldgo == settextselectionrangefdrldgo2) {
                    return (setToggleableState) onContentCardDismissed.read(settraversalindex.read);
                }
                return settraversalindex2.IconCompatParcelizer == settextselectionrangefdrldgo2 ? (setToggleableState) onContentCardDismissed.read(settraversalindex2.read) : setToggleableState.NONE;
            case 20:
                ((f2$$ExternalSyntheticLambda4) obj).invoke(updateOffsetsgTq6Wqs.write);
                return createfromparcel;
            case 21:
                ((DeliveryAcceptButtonUiModelImpl) obj).read("state_api_error_dialog");
                return createfromparcel;
            case 22:
                Application application = ((VerbatimTtsAnnotationSaverlambda1) obj).RemoteActionCompatParcelizer;
                NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(application);
                notificationManagerCompatFrom.getClass();
                if (notificationManagerCompatFrom.getNotificationChannel("com.foodora.acknowledgment.order.seen.notification") == null) {
                    String string = application.getString(com.logistics.rider.glovo.R.string.acknowledgment_notification_channel_title);
                    string.getClass();
                    NotificationChannel notificationChannel = new NotificationChannel("com.foodora.acknowledgment.order.seen.notification", string, 2);
                    NotificationManagerCompat notificationManagerCompatFrom2 = NotificationManagerCompat.from(application);
                    notificationManagerCompatFrom2.getClass();
                    notificationManagerCompatFrom2.createNotificationChannel(notificationChannel);
                }
                getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(application, "com.foodora.acknowledgment.order.seen.notification");
                String string2 = application.getString(com.logistics.rider.glovo.R.string.acknowledgment_order_seen_notification_title);
                string2.getClass();
                getenterdhqq8s.PlaybackStateCompatCustomAction = getEnterdhqQ8s.serializer((CharSequence) string2);
                String string3 = application.getString(com.logistics.rider.glovo.R.string.acknowledgment_order_seen_notification_content);
                string3.getClass();
                getenterdhqq8s.MediaDescriptionCompat = getEnterdhqQ8s.serializer((CharSequence) string3);
                getenterdhqq8s.write(2, true);
                getenterdhqq8s.write(16, true);
                getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = com.logistics.rider.glovo.R.drawable.ic_bold_large_notification_roadrunner;
                Notification notificationWrite = getenterdhqq8s.write();
                notificationWrite.getClass();
                return notificationWrite;
            case 23:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = ((AutoAcceptPreferencesFragment) obj).getSavedStateRegistry;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 24:
                LetterSpacingSpanEm letterSpacingSpanEm = (LetterSpacingSpanEm) obj;
                return new DragAndDropTargetModifierNode(new PassErrorScreenKt$$ExternalSyntheticLambda4(new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, letterSpacingSpanEm, LetterSpacingSpanEm.class, "hide", "hide()V", 0, 3), i6, letterSpacingSpanEm.serializer), true, 693992642);
            case 25:
                SignInDataStore signInDataStore = (SignInDataStore) obj;
                return ((fillStringBounds) ((shouldIncreaseMaxIntrinsic) signInDataStore.RemoteActionCompatParcelizer)).serializer((stripNonMetricAffectingCharacterStyleSpans) signInDataStore.serializer);
            case 26:
                Object objWrite = ((isUnderlineText) obj).RemoteActionCompatParcelizer.write();
                objWrite.getClass();
                AudioManager audioManager = (AudioManager) objWrite;
                int streamVolume = audioManager.getStreamVolume(5);
                int streamMaxVolume = audioManager.getStreamMaxVolume(5);
                if (streamMaxVolume > 0) {
                    int i14 = IconCompatParcelizer + 109;
                    read = i14 % Fields.SpotShadowColor;
                    f = i14 % 2 == 0 ? streamVolume - streamMaxVolume : streamVolume / streamMaxVolume;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 27:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = ((InAppCameraWithTagsFragment) obj).getSavedStateRegistry;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny2 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny2;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            case 28:
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = ((GalleryFragment) obj).onConfigurationChanged;
                if (r8lambdaudhhxliolpu0hpccqh6voskpny3 != null) {
                    return r8lambdaudhhxliolpu0hpccqh6voskpny3;
                }
                removeNodeAtDepth.serializer("viewModelFactory");
                throw null;
            default:
                if (((ContentSharingFragment) obj).getNavigationEventDispatcher != null) {
                    return new getTransactionExecutor(new inTransaction(32));
                }
                removeNodeAtDepth.serializer("cameraPermissionStateHolderFactory");
                throw null;
        }
    }
}
