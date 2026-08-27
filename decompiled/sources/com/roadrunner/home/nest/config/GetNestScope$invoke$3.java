package com.roadrunner.home.nest.config;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.Perseus;
import com.deliveryhero.perseus.PerseusEvent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.logistics.rider.glovo.R;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.logger.api.data.AppInfoChangedListener;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.login.presentation.LoginActivityViewModel;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC0176i;
import o.AndroidCursor;
import o.AndroidPreparedStatement;
import o.C0179j;
import o.C0180k;
import o.CheckBoxPreference;
import o.DividerItemDecoration;
import o.ExecutableQueryexecuteAsOneOrNull1;
import o.ExtensionWindowAreaStatusRequirements;
import o.LinearLayoutManager;
import o.ListPreference;
import o.ListPreferenceSavedState;
import o.MultiSelectListPreferenceDialogFragment;
import o.NavContext;
import o.NavControllerImplExternalSyntheticLambda0;
import o.NavHostKtNavHost291ExternalSyntheticLambda0;
import o.NotificationCompatStyle;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PreferenceBaseSavedState;
import o.PreferenceFragment;
import o.PreferenceGroupSavedState;
import o.PreferenceOnPreferenceCopyListener;
import o.RectListDebuggerModifierNode;
import o.RecyclerViewItemAnimator;
import o.RgbCompanionExternalSyntheticLambda0;
import o.ShortNewsContentCardView;
import o.StrokeJoinCompanion;
import o.SupportSQLiteOpenHelperCallback;
import o.SuspendingTransacterImpl;
import o.TurbineTimeoutCancellationException;
import o.TwoStatePreference;
import o.VelocityKt;
import o.a4;
import o.a9;
import o.ab;
import o.ac;
import o.accessgetAltRightcp;
import o.accessgetInstancedelegatecp;
import o.accessgetMirrorcp;
import o.bExternalSyntheticLambda1;
import o.backwardFocusSearch;
import o.bindString;
import o.clearTmpDetachFlag;
import o.createFromParcel;
import o.createOpenHelper;
import o.deleteDatabaseFile;
import o.doesTransientStatePreventRecycling;
import o.endRearDisplayPresentationSession;
import o.endStream;
import o.findChildView;
import o.findViewHolder;
import o.getBevelLxFBmk8;
import o.getBoolean;
import o.getContentViewGroupParentLayout;
import o.getItemId;
import o.getPositionInRoot;
import o.getQueryExecutor;
import o.getQueryParameterslambda2;
import o.getStateRestorationPolicy;
import o.getSwipeThreshold;
import o.getUseTempTrackingTableroom_runtime;
import o.getWindowAreaDisplayMetrics;
import o.hasObservers;
import o.hasStableIds;
import o.hideCurrentlyDisplayingInAppMessage;
import o.invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21;
import o.isAdapterPositionOnScreen;
import o.isContainerdelegate;
import o.isRoot;
import o.makeFlag;
import o.markCardAsClicked;
import o.migrate;
import o.notifyItemRangeInserted;
import o.offsetChildrenVertical;
import o.offsetPositionsForMove;
import o.onAnimation;
import o.onContentCardDismissed;
import o.onMove;
import o.onPointerUp;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.processDataSetCompletelyChanged;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.recreateDisplayListIfNeeded;
import o.relativeMoveTo;
import o.requestChildOnScreen;
import o.resetOutlineParams;
import o.safeSetClipToOutline;
import o.scrollStep;
import o.setItemViewCacheSize;
import o.setLayoutManager;
import o.setOnScrollListener;
import o.setRecyclerListener;
import o.setScrollState;
import o.setTransactionSuccessful;
import o.setViewCacheExtension;
import o.sourceInformationContextOfdefault;
import o.startNestedScrollForType;
import o.stopNestedScroll;
import o.stopScroll;
import o.transactionWithResult;
import o.transactionWithWrapper;
import o.unaryMinus9UxMQ8M;
import o.verifyPlayStorePurchaseI;
import okio.Okio;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetNestScope$invoke$3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNestScope$invoke$3(getQueryExecutor getqueryexecutor, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 15;
        this.RemoteActionCompatParcelizer = getqueryexecutor;
        this.write = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNestScope$invoke$3(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNestScope$invoke$3(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        int i4 = 27;
        int i5 = 0;
        switch (i3) {
            case 0:
                GetNestScope$invoke$3 getNestScope$invoke$3 = new GetNestScope$invoke$3((SignInDataStore) obj2, shortNewsContentCardView, i5);
                getNestScope$invoke$3.write = obj;
                return getNestScope$invoke$3;
            case 1:
                GetNestScope$invoke$3 getNestScope$invoke$4 = new GetNestScope$invoke$3((StackedDeliveryListUiModelImpl) obj2, shortNewsContentCardView, 1);
                getNestScope$invoke$4.write = obj;
                return getNestScope$invoke$4;
            case 2:
                return new GetNestScope$invoke$3((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.write, (NotificationCompatStyle) obj2, shortNewsContentCardView, i);
            case 3:
                GetNestScope$invoke$3 getNestScope$invoke$5 = new GetNestScope$invoke$3((DividerItemDecoration) obj2, shortNewsContentCardView, 3);
                getNestScope$invoke$5.write = obj;
                return getNestScope$invoke$5;
            case 4:
                GetNestScope$invoke$3 getNestScope$invoke$6 = new GetNestScope$invoke$3((findChildView) obj2, shortNewsContentCardView, 4);
                getNestScope$invoke$6.write = obj;
                return getNestScope$invoke$6;
            case 5:
                GetNestScope$invoke$3 getNestScope$invoke$7 = new GetNestScope$invoke$3((makeFlag) obj2, shortNewsContentCardView, 5);
                getNestScope$invoke$7.write = obj;
                return getNestScope$invoke$7;
            case 6:
                GetNestScope$invoke$3 getNestScope$invoke$8 = new GetNestScope$invoke$3((getSwipeThreshold) obj2, shortNewsContentCardView, 6);
                getNestScope$invoke$8.write = obj;
                return getNestScope$invoke$8;
            case 7:
                GetNestScope$invoke$3 getNestScope$invoke$9 = new GetNestScope$invoke$3((LinearLayoutManager) obj2, shortNewsContentCardView, 7);
                getNestScope$invoke$9.write = obj;
                return getNestScope$invoke$9;
            case 8:
                GetNestScope$invoke$3 getNestScope$invoke$10 = new GetNestScope$invoke$3((onAnimation) obj2, shortNewsContentCardView, 8);
                getNestScope$invoke$10.write = obj;
                return getNestScope$invoke$10;
            case 9:
                return new GetNestScope$invoke$3((N$b) this.write, (String) obj2, shortNewsContentCardView, 9);
            case 10:
                return new GetNestScope$invoke$3((SignInDataStore) this.write, (setItemViewCacheSize) obj2, shortNewsContentCardView, 10);
            case 11:
                GetNestScope$invoke$3 getNestScope$invoke$11 = new GetNestScope$invoke$3((stopScroll) this.write, (Context) obj2, shortNewsContentCardView, 11);
                int i6 = IconCompatParcelizer + 27;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return getNestScope$invoke$11;
                }
                throw null;
            case 12:
                GetNestScope$invoke$3 getNestScope$invoke$12 = new GetNestScope$invoke$3((offsetChildrenVertical) obj2, shortNewsContentCardView, 12);
                getNestScope$invoke$12.write = obj;
                return getNestScope$invoke$12;
            case 13:
                return new GetNestScope$invoke$3((String) this.write, (clearTmpDetachFlag) obj2, shortNewsContentCardView, 13);
            case 14:
                return new GetNestScope$invoke$3((String) this.write, (doesTransientStatePreventRecycling) obj2, shortNewsContentCardView, 14);
            case 15:
                return new GetNestScope$invoke$3((getQueryExecutor) obj2, this.write, shortNewsContentCardView);
            case 16:
                return new GetNestScope$invoke$3((RgbCompanionExternalSyntheticLambda0) this.write, (accessgetAltRightcp) obj2, shortNewsContentCardView, 16);
            case 17:
                return new GetNestScope$invoke$3((relativeMoveTo) this.write, (deleteDatabaseFile) obj2, shortNewsContentCardView, 17);
            case 18:
                return new GetNestScope$invoke$3((AppEventInfoChangeHandler) this.write, (ExecutableQueryexecuteAsOneOrNull1) obj2, shortNewsContentCardView, 18);
            case 19:
                return new GetNestScope$invoke$3((SuspendingTransacterImpl) this.write, (String) obj2, shortNewsContentCardView, 19);
            case 20:
                return new GetNestScope$invoke$3((transactionWithWrapper) this.write, (PerseusEvent) obj2, shortNewsContentCardView, 20);
            case 21:
                GetNestScope$invoke$3 getNestScope$invoke$13 = new GetNestScope$invoke$3((N$b) obj2, shortNewsContentCardView, 21);
                getNestScope$invoke$13.write = obj;
                return getNestScope$invoke$13;
            case 22:
                return new GetNestScope$invoke$3((List) this.write, (String) obj2, shortNewsContentCardView, 22);
            case 23:
                return new GetNestScope$invoke$3((bindString) this.write, (Activity) obj2, shortNewsContentCardView, 23);
            case 24:
                return new GetNestScope$invoke$3((LoginActivityViewModel) this.write, (String) obj2, shortNewsContentCardView, 24);
            case 25:
                return new GetNestScope$invoke$3((LoginActivityViewModel) this.write, (markCardAsClicked) obj2, shortNewsContentCardView, 25);
            case 26:
                return new GetNestScope$invoke$3((TurbineTimeoutCancellationException) this.write, (String) obj2, shortNewsContentCardView, 26);
            case 27:
                return new GetNestScope$invoke$3((C0180k) this.write, (String) obj2, shortNewsContentCardView, i4);
            case 28:
                GetNestScope$invoke$3 getNestScope$invoke$14 = new GetNestScope$invoke$3((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write, (ac) obj2, shortNewsContentCardView, 28);
                int i7 = IconCompatParcelizer + 63;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 63 / 0;
                }
                return getNestScope$invoke$14;
            default:
                return new GetNestScope$invoke$3((relativeMoveTo) this.write, (AndroidPreparedStatement) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                ((GetNestScope$invoke$3) create((TwoStatePreference) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                ((GetNestScope$invoke$3) create((VelocityKt) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 2:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 3:
                ((GetNestScope$invoke$3) create((NavHostKtNavHost291ExternalSyntheticLambda0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = serializer + 101;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            case 4:
                ((GetNestScope$invoke$3) create((NavContext) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 5:
                ((GetNestScope$invoke$3) create((NavControllerImplExternalSyntheticLambda0) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                ((GetNestScope$invoke$3) create((ListPreference) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 7:
                ((GetNestScope$invoke$3) create((PreferenceFragment) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 8:
                ((GetNestScope$invoke$3) create((PreferenceOnPreferenceCopyListener) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 9:
                return ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 12:
                ((GetNestScope$invoke$3) create((stopScroll) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 13:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 14:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 15:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 16:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = serializer + 77;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 31 / 0;
                }
                return createfromparcel;
            case 17:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i7 = IconCompatParcelizer + 25;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return createfromparcel;
            case 18:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 19:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 20:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 21:
                ((GetNestScope$invoke$3) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 22:
                return ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 24:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 25:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 26:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 27:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 28:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            default:
                ((GetNestScope$invoke$3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        stopNestedScroll stopnestedscroll;
        int color;
        Iterator it;
        boolean z;
        Object objWrite;
        Iterator it2;
        Iterator it3;
        boolean z2;
        hasObservers hasobserversWrite;
        hasObservers hasobserversWrite2;
        Map mapRemoteActionCompatParcelizer;
        Dialog errorDialog;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 55;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.RemoteActionCompatParcelizer;
        boolean z3 = false;
        boolean z4 = true;
        Object obj3 = null;
        switch (i5) {
            case 0:
                TwoStatePreference twoStatePreference = (TwoStatePreference) this.write;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((SignInDataStore) obj2).read = twoStatePreference;
                return createfromparcel;
            case 1:
                VelocityKt velocityKt = (VelocityKt) this.write;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StackedDeliveryListUiModelImpl stackedDeliveryListUiModelImpl = (StackedDeliveryListUiModelImpl) obj2;
                stackedDeliveryListUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(velocityKt);
                stackedDeliveryListUiModelImpl.serializer.IconCompatParcelizer(Boolean.valueOf(velocityKt instanceof unaryMinus9UxMQ8M));
                return createfromparcel;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NotificationCompatStyle notificationCompatStyle = (NotificationCompatStyle) obj2;
                ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.write).invoke(notificationCompatStyle.MediaBrowserCompatMediaItem, notificationCompatStyle.MediaMetadataCompat, false);
                return createfromparcel;
            case 3:
                NavHostKtNavHost291ExternalSyntheticLambda0 navHostKtNavHost291ExternalSyntheticLambda0 = (NavHostKtNavHost291ExternalSyntheticLambda0) this.write;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DividerItemDecoration dividerItemDecoration = (DividerItemDecoration) obj2;
                dividerItemDecoration.RemoteActionCompatParcelizer.IconCompatParcelizer(navHostKtNavHost291ExternalSyntheticLambda0);
                dividerItemDecoration.read.IconCompatParcelizer(Boolean.valueOf(navHostKtNavHost291ExternalSyntheticLambda0 instanceof invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21));
                return createfromparcel;
            case 4:
                NavContext navContext = (NavContext) this.write;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                findChildView findchildview = (findChildView) obj2;
                findchildview.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(navContext instanceof CheckBoxPreference));
                findchildview.IconCompatParcelizer.IconCompatParcelizer(navContext);
                return createfromparcel;
            case 5:
                NavControllerImplExternalSyntheticLambda0 navControllerImplExternalSyntheticLambda0 = (NavControllerImplExternalSyntheticLambda0) this.write;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                makeFlag makeflag = (makeFlag) obj2;
                makeflag.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(navControllerImplExternalSyntheticLambda0 instanceof ListPreferenceSavedState));
                makeflag.serializer.IconCompatParcelizer(navControllerImplExternalSyntheticLambda0);
                return createfromparcel;
            case 6:
                ListPreference listPreference = (ListPreference) this.write;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getSwipeThreshold getswipethreshold = (getSwipeThreshold) obj2;
                getswipethreshold.read.IconCompatParcelizer(listPreference);
                getswipethreshold.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(listPreference instanceof MultiSelectListPreferenceDialogFragment));
                return createfromparcel;
            case 7:
                PreferenceFragment preferenceFragment = (PreferenceFragment) this.write;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj2;
                linearLayoutManager.write.IconCompatParcelizer(preferenceFragment);
                linearLayoutManager.serializer.IconCompatParcelizer(Boolean.valueOf(preferenceFragment instanceof PreferenceBaseSavedState));
                return createfromparcel;
            case 8:
                PreferenceOnPreferenceCopyListener preferenceOnPreferenceCopyListener = (PreferenceOnPreferenceCopyListener) this.write;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                boolean z5 = preferenceOnPreferenceCopyListener instanceof PreferenceGroupSavedState;
                onAnimation onanimation = (onAnimation) obj2;
                onanimation.serializer.IconCompatParcelizer(Boolean.valueOf(z5));
                onanimation.write.IconCompatParcelizer(preferenceOnPreferenceCopyListener);
                if (z5) {
                    onanimation.read.RemoteActionCompatParcelizer.logEvent("suspension_card_displayed", null);
                }
                return createfromparcel;
            case 9:
                N$b n$b = (N$b) this.write;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                try {
                    File fileIconCompatParcelizer = ((recreateDisplayListIfNeeded) ((resetOutlineParams) n$b.IconCompatParcelizer)).IconCompatParcelizer(((setTransactionSuccessful) n$b.serializer).IconCompatParcelizer(R.string.in_app_notification_share_file_name).concat(BundleUtil.UNDERLINE_TAG));
                    try {
                        HashMap map = getBevelLxFBmk8.IconCompatParcelizer;
                        StrokeJoinCompanion strokeJoinCompanion = getBevelLxFBmk8.serializer(Okio.RemoteActionCompatParcelizer(new ByteArrayInputStream(((String) obj2).getBytes())), null).serializer;
                        if (strokeJoinCompanion == null) {
                            return new stopNestedScroll("Failed to parse Lottie JSON.");
                        }
                        accessgetMirrorcp accessgetmirrorcp = new accessgetMirrorcp();
                        accessgetmirrorcp.RemoteActionCompatParcelizer(strokeJoinCompanion);
                        safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = ((a9) n$b.read).IconCompatParcelizer();
                        if (safesetcliptooutlineIconCompatParcelizer != accessgetmirrorcp.MediaSessionCompatResultReceiverWrapper) {
                            accessgetmirrorcp.MediaSessionCompatResultReceiverWrapper = safesetcliptooutlineIconCompatParcelizer;
                            accessgetmirrorcp.invalidateSelf();
                        }
                        accessgetmirrorcp.setBounds(0, 0, strokeJoinCompanion.write.width(), strokeJoinCompanion.write.height());
                        accessgetmirrorcp.read(1.0f);
                        int iWidth = strokeJoinCompanion.write.width();
                        int iHeight = strokeJoinCompanion.write.height();
                        if (iWidth <= 0 || iHeight <= 0) {
                            stopnestedscroll = new stopNestedScroll("Lottie composition bounds are invalid: " + iWidth + "x" + iHeight);
                        } else {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                            accessgetmirrorcp.draw(new Canvas(bitmapCreateBitmap));
                            try {
                                File parentFile = fileIconCompatParcelizer.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(fileIconCompatParcelizer), fileIconCompatParcelizer);
                                try {
                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamWrite);
                                    fileOutputStreamWrite.close();
                                    int i6 = IconCompatParcelizer + 39;
                                    serializer = i6 % Fields.SpotShadowColor;
                                    int i7 = i6 % 2;
                                    z3 = true;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, sourceInformationContextOfdefault.read());
                                        throw th2;
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            bitmapCreateBitmap.recycle();
                            if (z3) {
                                return new offsetPositionsForMove(fileIconCompatParcelizer);
                            }
                            stopnestedscroll = new stopNestedScroll("Failed to save the rendered frame to file: " + fileIconCompatParcelizer.getAbsolutePath());
                        }
                    } catch (Exception e2) {
                        stopnestedscroll = new stopNestedScroll(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("An unexpected error occurred during frame capture: ", e2.getLocalizedMessage()));
                    }
                    return stopnestedscroll;
                } catch (Exception e3) {
                    Timber.RemoteActionCompatParcelizer.write(e3);
                    return new stopNestedScroll("Failed to create image file.");
                }
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                E$b e$b = (E$b) ((SignInDataStore) this.write).RemoteActionCompatParcelizer;
                setItemViewCacheSize setitemviewcachesize = (setItemViewCacheSize) obj2;
                scrollStep scrollstep = setitemviewcachesize.RemoteActionCompatParcelizer;
                e$b.getClass();
                List list = scrollstep.content.pages;
                int i8 = 10;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    setOnScrollListener setonscrolllistener = (setOnScrollListener) it4.next();
                    List<setLayoutManager> list2 = setonscrolllistener.components;
                    ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, i8));
                    for (setLayoutManager setlayoutmanager : list2) {
                        if (setlayoutmanager instanceof startNestedScrollForType) {
                            int i9 = serializer + 67;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % i;
                            objWrite = ((SignInDataStore) e$b.RemoteActionCompatParcelizer).read((startNestedScrollForType) setlayoutmanager);
                        } else if (setlayoutmanager instanceof processDataSetCompletelyChanged) {
                            objWrite = ((m) e$b.MediaBrowserCompatMediaItem).write((processDataSetCompletelyChanged) setlayoutmanager);
                        } else {
                            if (setlayoutmanager instanceof requestChildOnScreen) {
                                H$b h$b = (H$b) e$b.MediaDescriptionCompat;
                                requestChildOnScreen requestchildonscreen = (requestChildOnScreen) setlayoutmanager;
                                String str = requestchildonscreen.source;
                                notifyItemRangeInserted notifyitemrangeinserted = (notifyItemRangeInserted) h$b.write;
                                String str2 = requestchildonscreen.scaleType;
                                notifyitemrangeinserted.getClass();
                                ContentScale contentScale = notifyItemRangeInserted.read(str2);
                                g0 g0Var = (g0) h$b.serializer;
                                Float f = requestchildonscreen.weight;
                                g0Var.getClass();
                                objWrite = new getItemId(str, contentScale, g0.write(f));
                            } else if (setlayoutmanager instanceof setViewCacheExtension) {
                                BlockRunner blockRunner = (BlockRunner) e$b.write;
                                setViewCacheExtension setviewcacheextension = (setViewCacheExtension) setlayoutmanager;
                                blockRunner.getClass();
                                List list3 = setviewcacheextension.components;
                                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, i8));
                                Iterator it5 = list3.iterator();
                                while (it5.hasNext()) {
                                    setRecyclerListener setrecyclerlistener = (setRecyclerListener) it5.next();
                                    if (setrecyclerlistener instanceof processDataSetCompletelyChanged) {
                                        it2 = it4;
                                        hasobserversWrite = ((m) blockRunner.write).write((processDataSetCompletelyChanged) setrecyclerlistener);
                                        z2 = z4;
                                        it3 = it5;
                                    } else {
                                        if (setrecyclerlistener instanceof requestChildOnScreen) {
                                            H$b h$b2 = (H$b) blockRunner.RatingCompat;
                                            requestChildOnScreen requestchildonscreen2 = (requestChildOnScreen) setrecyclerlistener;
                                            String str3 = requestchildonscreen2.source;
                                            it2 = it4;
                                            notifyItemRangeInserted notifyitemrangeinserted2 = (notifyItemRangeInserted) h$b2.write;
                                            it3 = it5;
                                            String str4 = requestchildonscreen2.scaleType;
                                            notifyitemrangeinserted2.getClass();
                                            ContentScale contentScale2 = notifyItemRangeInserted.read(str4);
                                            g0 g0Var2 = (g0) h$b2.serializer;
                                            Float f2 = requestchildonscreen2.weight;
                                            g0Var2.getClass();
                                            hasobserversWrite = new getItemId(str3, contentScale2, g0.write(f2));
                                        } else {
                                            it2 = it4;
                                            it3 = it5;
                                            if (setrecyclerlistener instanceof setScrollState) {
                                                hasobserversWrite2 = ((Vw$Vw) blockRunner.read).write((setScrollState) setrecyclerlistener);
                                            } else if (setrecyclerlistener instanceof startNestedScrollForType) {
                                                hasobserversWrite2 = ((SignInDataStore) blockRunner.serializer).read((startNestedScrollForType) setrecyclerlistener);
                                            } else {
                                                z2 = true;
                                                if (!(setrecyclerlistener instanceof onPointerUp)) {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    return null;
                                                }
                                                hasobserversWrite = ((Parser.Pair) blockRunner.IconCompatParcelizer).write((onPointerUp) setrecyclerlistener);
                                            }
                                            hasobserversWrite = hasobserversWrite2;
                                        }
                                        z2 = true;
                                    }
                                    arrayList3.add(hasobserversWrite);
                                    z4 = z2;
                                    it4 = it2;
                                    it5 = it3;
                                }
                                it = it4;
                                z = z4;
                                g0 g0Var3 = (g0) blockRunner.RemoteActionCompatParcelizer;
                                Float f3 = setviewcacheextension.weight;
                                g0Var3.getClass();
                                objWrite = new getStateRestorationPolicy(arrayList3, g0.write(f3));
                            } else {
                                it = it4;
                                z = z4;
                                if (setlayoutmanager instanceof setScrollState) {
                                    int i11 = IconCompatParcelizer + 95;
                                    serializer = i11 % Fields.SpotShadowColor;
                                    if (i11 % 2 != 0) {
                                        ((Vw$Vw) e$b.read).write((setScrollState) setlayoutmanager);
                                        throw null;
                                    }
                                    objWrite = ((Vw$Vw) e$b.read).write((setScrollState) setlayoutmanager);
                                } else {
                                    if (!(setlayoutmanager instanceof onPointerUp)) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return null;
                                    }
                                    objWrite = ((Parser.Pair) e$b.MediaMetadataCompat).write((onPointerUp) setlayoutmanager);
                                }
                            }
                            arrayList2.add(objWrite);
                            z4 = z;
                            it4 = it;
                            i = 2;
                            i8 = 10;
                        }
                        it = it4;
                        z = z4;
                        arrayList2.add(objWrite);
                        z4 = z;
                        it4 = it;
                        i = 2;
                        i8 = 10;
                    }
                    Iterator it6 = it4;
                    boolean z6 = z4;
                    n0 n0Var = (n0) e$b.IconCompatParcelizer;
                    String str5 = setonscrolllistener.backgroundColor;
                    n0Var.getClass();
                    str5.getClass();
                    try {
                        color = Color.parseColor(str5);
                    } catch (IllegalArgumentException unused) {
                        color = Color.parseColor("#000000");
                    }
                    arrayList.add(new hasStableIds(color, arrayList2));
                    z4 = z6;
                    it4 = it6;
                    i = 2;
                    i8 = 10;
                }
                return new findViewHolder((hasStableIds) onContentCardDismissed.read((List) arrayList), setitemviewcachesize.IconCompatParcelizer);
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((stopScroll) this.write) instanceof stopNestedScroll) {
                    int i12 = serializer + 113;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    Toast.makeText((Context) obj2, R.string.state_api_error_dialog_message, 0).show();
                }
                return createfromparcel;
            case 12:
                stopScroll stopscroll = (stopScroll) this.write;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (stopscroll instanceof offsetPositionsForMove) {
                    File file = ((offsetPositionsForMove) stopscroll).IconCompatParcelizer;
                    ((offsetChildrenVertical) obj2).MediaMetadataCompat.serializer(new RecyclerViewItemAnimator(file));
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    file.getAbsolutePath();
                    forest.getClass();
                }
                return createfromparcel;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("delivery_id", (String) this.write);
                clearTmpDetachFlag cleartmpdetachflag = (clearTmpDetachFlag) obj2;
                cleartmpdetachflag.read.RemoteActionCompatParcelizer("order-accepted", onMove.RemoteActionCompatParcelizer(linkedHashMap, clearTmpDetachFlag.RemoteActionCompatParcelizer(cleartmpdetachflag)));
                return createfromparcel;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("shift_Id", (String) this.write);
                doesTransientStatePreventRecycling doestransientstatepreventrecycling = (doesTransientStatePreventRecycling) obj2;
                IncogniaManagerImpl incogniaManagerImpl = doestransientstatepreventrecycling.RemoteActionCompatParcelizer;
                getWindowAreaDisplayMetrics getwindowareadisplaymetrics = (getWindowAreaDisplayMetrics) doestransientstatepreventrecycling.IconCompatParcelizer.serializer.read();
                if (getwindowareadisplaymetrics instanceof endRearDisplayPresentationSession) {
                    ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = ((endRearDisplayPresentationSession) getwindowareadisplaymetrics).IconCompatParcelizer;
                    mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("delivery_long", String.valueOf(extensionWindowAreaStatusRequirements.read)), new onViewAttachedToWindowlambda0("delivery_lat", String.valueOf(extensionWindowAreaStatusRequirements.serializer)));
                } else {
                    mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("delivery_long", ""), new onViewAttachedToWindowlambda0("delivery_lat", ""));
                }
                incogniaManagerImpl.RemoteActionCompatParcelizer("shift-start", onMove.RemoteActionCompatParcelizer(linkedHashMap2, mapRemoteActionCompatParcelizer));
                return createfromparcel;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                createOpenHelper createopenhelper = (createOpenHelper) ((getQueryExecutor) obj2).serializer.write();
                Object obj4 = this.write;
                createopenhelper.getClass();
                ((TraceTimeMeasurementWithPerformanceKit) createopenhelper.IconCompatParcelizer).read("FoodoraStorageManager.store.".concat("CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL"), new DeviceManager$$ExternalSyntheticLambda1(createopenhelper, 28, obj4));
                return createfromparcel;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (((getUseTempTrackingTableroom_runtime) ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) ((RgbCompanionExternalSyntheticLambda0) this.write).IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).getValue()) == getUseTempTrackingTableroom_runtime.REQUEST_PERMISSION) {
                    int i14 = IconCompatParcelizer + 29;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        ((accessgetAltRightcp) obj2).RemoteActionCompatParcelizer();
                        obj3.hashCode();
                        throw null;
                    }
                    ((accessgetAltRightcp) obj2).RemoteActionCompatParcelizer();
                }
                return createfromparcel;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                relativeMoveTo.IconCompatParcelizer((relativeMoveTo) this.write, ((SupportSQLiteOpenHelperCallback) ((deleteDatabaseFile) obj2)).write, null, 6);
                return createfromparcel;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ExecutableQueryexecuteAsOneOrNull1 executableQueryexecuteAsOneOrNull1 = (ExecutableQueryexecuteAsOneOrNull1) obj2;
                Iterator it7 = ((AppEventInfoChangeHandler) this.write).write().iterator();
                while (it7.hasNext()) {
                    ((AppInfoChangedListener) it7.next()).updateUserProperties(executableQueryexecuteAsOneOrNull1);
                }
                return createfromparcel;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SuspendingTransacterImpl suspendingTransacterImpl = (SuspendingTransacterImpl) this.write;
                suspendingTransacterImpl.read.write("perseusSessionId", (String) obj2);
                suspendingTransacterImpl.MediaSessionCompatQueueItem.getClass();
                transactionWithResult.read(onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("perseusSessionId", Perseus.serializer()), new onViewAttachedToWindowlambda0("perseusClientId", Perseus.RemoteActionCompatParcelizer())));
                suspendingTransacterImpl.MediaMetadataCompat.logEvent("perseus_session_start", null);
                return createfromparcel;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                transactionWithWrapper transactionwithwrapper = (transactionWithWrapper) this.write;
                transactionwithwrapper.getClass();
                forest2.RemoteActionCompatParcelizer("PerseusEventBuffer");
                PerseusEvent perseusEvent = (PerseusEvent) obj2;
                String eventAction = perseusEvent.getEventAction();
                ArrayList arrayList4 = transactionwithwrapper.IconCompatParcelizer;
                forest2.IconCompatParcelizer("Adding event " + eventAction + " to buffer. Current buffer size: " + arrayList4.size(), new Object[0]);
                arrayList4.add(perseusEvent);
                return createfromparcel;
            case 21:
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                N$b n$b2 = (N$b) obj2;
                backwardfocussearch.read((isRoot) n$b2.serializer);
                backwardfocussearch.read((isRoot) n$b2.IconCompatParcelizer);
                return createfromparcel;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                List list4 = (List) this.write;
                String str6 = (String) obj2;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list4) {
                    int i15 = IconCompatParcelizer + 45;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    bExternalSyntheticLambda1 bexternalsyntheticlambda1 = (bExternalSyntheticLambda1) obj5;
                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) bexternalsyntheticlambda1.write, (CharSequence) str6, true)) {
                        String str7 = bexternalsyntheticlambda1.RemoteActionCompatParcelizer;
                        if (str7 != null) {
                            int i17 = IconCompatParcelizer + 1;
                            serializer = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str7, (CharSequence) str6, true)) {
                            }
                        }
                    }
                    arrayList5.add(obj5);
                }
                return arrayList5;
            case 23:
                Activity activity = (Activity) obj2;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                bindString bindstring = (bindString) this.write;
                int i19 = bindstring.RemoteActionCompatParcelizer;
                int i20 = migrate.IconCompatParcelizer[bindstring.IconCompatParcelizer.ordinal()];
                if (i20 == 1) {
                    errorDialog = HuaweiApiAvailability.getInstance().getErrorDialog(activity, i19, 3);
                } else {
                    if (i20 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(activity, i19, 3);
                }
                if (errorDialog == null) {
                    return createfromparcel;
                }
                int i21 = IconCompatParcelizer + 79;
                serializer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    errorDialog.show();
                    return createfromparcel;
                }
                errorDialog.show();
                throw null;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((isContainerdelegate) LoginActivityViewModel.MediaSessionCompatResultReceiverWrapper((LoginActivityViewModel) this.write)).write((String) obj2);
                return createfromparcel;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                markCardAsClicked markcardasclicked = (markCardAsClicked) obj2;
                return createfromparcel;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                TurbineTimeoutCancellationException turbineTimeoutCancellationException = (TurbineTimeoutCancellationException) this.write;
                turbineTimeoutCancellationException.getClass();
                turbineTimeoutCancellationException.MediaSessionCompatQueueItem = (String) obj2;
                MutableStateFlow mutableStateFlow = turbineTimeoutCancellationException.IconCompatParcelizer;
                setTransactionSuccessful settransactionsuccessful = turbineTimeoutCancellationException.MediaMetadataCompat;
                String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.login_check_email_title);
                String str8 = settransactionsuccessful.read(R.string.login_check_email_description_with_placeholder, turbineTimeoutCancellationException.MediaSessionCompatQueueItem);
                int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str8, turbineTimeoutCancellationException.MediaSessionCompatQueueItem, 0, false, 6);
                mutableStateFlow.IconCompatParcelizer(new a4(strIconCompatParcelizer, settransactionsuccessful.IconCompatParcelizer(R.string.login_check_email_sub_title), settransactionsuccessful.IconCompatParcelizer(R.string.login_otp_request_again_button), settransactionsuccessful.IconCompatParcelizer(R.string.login_check_email_open_email_button), new AnnotatedString(str8, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new AnnotatedString.Range(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), iWrite, turbineTimeoutCancellationException.MediaSessionCompatQueueItem.length() + iWrite)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), null, 4, null), new RectListDebuggerModifierNode(null, 3), 1));
                return createfromparcel;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                C0180k c0180k = (C0180k) this.write;
                String strSerializer = (String) obj2;
                getBoolean getboolean = ((C0179j) c0180k.PlaybackStateCompatCustomAction.write()).read;
                GetAppStateImpl getAppStateImpl = c0180k.MediaSessionCompatResultReceiverWrapper;
                endStream endstream = c0180k.RemoteActionCompatParcelizer;
                isAdapterPositionOnScreen isadapterpositiononscreen = c0180k.IconCompatParcelizer;
                if (getAppStateImpl.RemoteActionCompatParcelizer(strSerializer, endstream, (verifyPlayStorePurchaseI) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper())) {
                    if (AbstractC0176i.RemoteActionCompatParcelizer[((verifyPlayStorePurchaseI) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).ordinal()] == 1) {
                        int i22 = IconCompatParcelizer + 109;
                        serializer = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        strSerializer = c0180k.MediaSessionCompatQueueItem.serializer(strSerializer);
                    }
                    getboolean.read(strSerializer);
                    getboolean.read();
                }
                return createfromparcel;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write).invoke(((ab) ((ac) obj2)).IconCompatParcelizer);
                return createfromparcel;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                relativeMoveTo relativemoveto = (relativeMoveTo) this.write;
                AndroidCursor androidCursor = (AndroidCursor) ((AndroidPreparedStatement) obj2);
                String str9 = androidCursor.IconCompatParcelizer;
                String str10 = androidCursor.serializer;
                String str11 = androidCursor.write;
                int i24 = androidCursor.RemoteActionCompatParcelizer;
                str9.getClass();
                str10.getClass();
                str11.getClass();
                String strEncode = Uri.encode(str9);
                String strEncode2 = Uri.encode(str10);
                String strEncode3 = Uri.encode(str11);
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("account-creation?resultCode=", strEncode, "&phoneNumber=", strEncode2, "&originalMessageId=");
                sbM.append(strEncode3);
                sbM.append("&retryCount=");
                sbM.append(i24);
                relativeMoveTo.IconCompatParcelizer(relativemoveto, sbM.toString(), null, 6);
                return createfromparcel;
        }
    }
}
