package com.roadrunner.auth.data;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.sqlite.SQLite;
import androidx.transition.TransitionValuesMaps;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.g0$$ExternalSyntheticLambda8;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;
import coil3.network.NetworkFetcher;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.data.util.sharedPreferences.SharedPreferencesManagerImpl;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.android.gms.internal.mlkit_vision_face.zzlv;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.common.LoggingLevel;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.eh.EHorizonPosition;
import com.mapbox.navigation.core.routealternatives.SuggestionType$AlternativesUpdated;
import com.mapbox.navigation.core.routealternatives.UpdateRouteSuggestion;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.ElectronicHorizonPosition;
import com.mapbox.navigator.RoadObjectDistance;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appmigration.model.PhaseVariant;
import com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl;
import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheStatus;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose.PhotoSharedSuccessDialogKt;
import com.roadrunner.delivery.ontheway.destination.domain.GetDestinationAddressImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.MetadataApplierImpl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import o.AlignmentHorizontal;
import o.AndroidFontListTypeface;
import o.AndroidPlatformLocale_androidKt;
import o.BrazeContentCardsManager;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.Bullet;
import o.BulletSpanWithLevel;
import o.CharHelpers_androidKt;
import o.DefaultInAppMessageViewWrapper;
import o.ForgottenCoroutineScopeException;
import o.InputMethodManager;
import o.Locale;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SemanticsListener;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.StrokeJoinCompanion;
import o.TextMeasurerKt;
import o.WordIterator;
import o.accessgetDonecp;
import o.accessgetGocp;
import o.accessgetIdjd;
import o.accessgetInstancedelegatecp;
import o.accessgetXyzcp;
import o.addSemanticsPropertiesFrom;
import o.backwardFocusSearch;
import o.composeToViewOffset;
import o.copyWithMergingEnabledui;
import o.createFromParcel;
import o.createPlatformLocaleDelegate;
import o.cubicTo;
import o.dashPathEffectdefault;
import o.drawARGB;
import o.ensureSubscribedToInAppMessageEvents;
import o.findFollowingBreak;
import o.findOneLayerOfMergingSemanticsNodes;
import o.first;
import o.getChildrenuidefault;
import o.getCieXyz;
import o.getContentType;
import o.getContentViewGroupParentLayout;
import o.getD50Xyzui_graphics;
import o.getDefaultIndentationXSAIIZE;
import o.getLanguage;
import o.getLeftIndents;
import o.getMirror3opZhB0;
import o.getNoActiveChildannotations;
import o.getParagraphForOffset;
import o.getPlatformLocale;
import o.getPositionannotations;
import o.getQueryParameterslambda2;
import o.getTextDirectionHeuristic;
import o.getTopLeftannotations;
import o.getVonKries;
import o.hasLinkAnnotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.isItemViewSwipeEnabled;
import o.isLongPressDragEnabled;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.loadBlocking;
import o.markTintForBrush;
import o.markTintForVNode;
import o.measurexDpz5zY;
import o.metaMarkUpdatedAndHasCallbacks;
import o.newD50Xyzui_graphics;
import o.onContentCardDismissed;
import o.onDependencyAdded;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewCreated;
import o.parseAnimatedVisibility;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setFontSizeR2X_6o;
import o.setGraphicModalMaxWidthDp;
import o.setPath;
import o.setWasCloseMessageCalled;
import o.subSequence5zctL8;
import o.toGlobalxdX6G0default;
import o.updateAdidI;
import o.updateClipPath;
import org.bouncycastle.asn1.ASN1UniversalType;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInDataStore$set$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;
    private static final byte[] $$a = {77, -89, -118, -2};
    private static final int $$b = 51;
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    private static char IconCompatParcelizer = 14681;
    private static char MediaSessionCompatQueueItem = 16073;
    private static char MediaMetadataCompat = 15452;
    private static char MediaBrowserCompatMediaItem = 29010;

    private static String $$c(short s, short s2, int i) {
        int i2 = s * 2;
        int i3 = i + 4;
        int i4 = (s2 * 2) + 107;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 += -i5;
        }
        while (true) {
            i6++;
            i3++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i3];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInDataStore$set$2(SharedPreferencesManagerImpl sharedPreferencesManagerImpl, String str, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = 5;
        this.RemoteActionCompatParcelizer = sharedPreferencesManagerImpl;
        this.write = str;
        this.read = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInDataStore$set$2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.write = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInDataStore$set$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInDataStore$set$2(ShortNewsContentCardView shortNewsContentCardView, WebChatViewModel webChatViewModel, Uri uri) {
        super(2, shortNewsContentCardView);
        this.serializer = 18;
        this.RemoteActionCompatParcelizer = webChatViewModel;
        this.write = uri;
    }

    private final Object invokeSuspend$com$roadrunner$delivery$ontheway$entrancepicture$data$EntrancePictureDataStore$setTooltipShownEntrancePicture$2$1(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch.write(((AndroidFontListTypeface) this.RemoteActionCompatParcelizer).read, (String) this.write);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RatingCompat + 79;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return createfromparcel;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        composeToViewOffset composetoviewoffset = new composeToViewOffset();
        char[] cArr2 = new char[cArr.length];
        composetoviewoffset.RemoteActionCompatParcelizer = 0;
        char[] cArr3 = new char[2];
        while (composetoviewoffset.RemoteActionCompatParcelizer < cArr.length) {
            cArr3[0] = cArr[composetoviewoffset.RemoteActionCompatParcelizer];
            char c = 1;
            cArr3[1] = cArr[composetoviewoffset.RemoteActionCompatParcelizer + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[0];
                int i4 = (c3 + i2) ^ ((c3 << 4) + ((char) (((long) MediaMetadataCompat) ^ 7962313315467514595L)));
                int i5 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatMediaItem);
                    objArr2[2] = Integer.valueOf(i5);
                    objArr2[c] = Integer.valueOf(i4);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 65450);
                        int i6 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1243;
                        int i7 = 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        String str$$c = $$c(b, b2, (byte) (-b2));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cNormalizeMetaState, i6, i7, 402902884, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i8 = i3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i2) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 7962313315467514595L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaSessionCompatQueueItem)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getCapsMode("", 0, 0) + 65450), 1244 - View.MeasureSpec.getSize(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32, 402902884, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                    i3 = i8 + 1;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer] = cArr3[0];
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer + 1] = cArr3[1];
            Object[] objArr4 = {composetoviewoffset, composetoviewoffset};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(547433723);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2545, AndroidCharacter.getMirror('0') - 18, -261026534, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final Object invokeSuspend$com$roadrunner$delivery$ontheway$destination$domain$GetDestinationAddressImpl$invoke$uri$1(Object obj) {
        boolean zM;
        String str;
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        GetDestinationAddressImpl getDestinationAddressImpl = (GetDestinationAddressImpl) this.read;
        accessgetDonecp accessgetdonecp = (accessgetDonecp) this.RemoteActionCompatParcelizer;
        accessgetGocp accessgetgocp = (accessgetGocp) this.write;
        getLanguage getlanguage = getDestinationAddressImpl.IconCompatParcelizer;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) getDestinationAddressImpl.RemoteActionCompatParcelizer;
        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
        if (strSerializer == null) {
            int i2 = MediaDescriptionCompat + 97;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            zM = false;
        } else {
            zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_NAVIGATION_MODE_SUPPORTED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl);
        }
        if (zM) {
            int i4 = MediaDescriptionCompat + 49;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accessgetdonecp.RemoteActionCompatParcelizer.length() == 0 ? getlanguage.IconCompatParcelizer(new AndroidPlatformLocale_androidKt(accessgetgocp)) : getlanguage.IconCompatParcelizer(new createPlatformLocaleDelegate(accessgetgocp, accessgetdonecp.RemoteActionCompatParcelizer));
        }
        String str2 = getDestinationAddressImpl.serializer.IconCompatParcelizer.read();
        if (str2 != null) {
            int i6 = MediaDescriptionCompat + 39;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str2, (CharSequence) "com.google.android.apps.maps", false) && (str = accessgetdonecp.IconCompatParcelizer) != null) {
                if (str == null) {
                    int i8 = MediaDescriptionCompat + 71;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    str = "";
                }
                return getlanguage.IconCompatParcelizer(new Locale(accessgetgocp, str));
            }
        }
        return getlanguage.IconCompatParcelizer(new getPlatformLocale(accessgetgocp));
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = null;
        switch (i2) {
            case 0:
                ((SignInDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                return ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 3:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 4:
                return ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = MediaDescriptionCompat + 29;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            case 7:
                ((SignInDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 8:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 9:
                ((SignInDataStore$set$2) create((List) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 10:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((SignInDataStore$set$2) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                throw null;
            case 11:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 12:
                return ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                ((SignInDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = RatingCompat + 103;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return createfromparcel;
            case 14:
                return ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i7 = MediaDescriptionCompat + 33;
                RatingCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return createfromparcel;
                }
                obj3.hashCode();
                throw null;
            case 16:
                ((SignInDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 17:
                return ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 19:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 20:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 21:
                ((SignInDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 22:
                return ((SignInDataStore$set$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((SignInDataStore$set$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 25:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 26:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 27:
                return ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                ((SignInDataStore$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            default:
                ((SignInDataStore$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj2 = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        int i3 = 0;
        Object obj4 = null;
        switch (i2) {
            case 0:
                SignInDataStore$set$2 signInDataStore$set$2 = new SignInDataStore$set$2((SignInDataStore) obj3, (getContentType) obj2, shortNewsContentCardView, i3);
                signInDataStore$set$2.read = obj;
                return signInDataStore$set$2;
            case 1:
                SignInDataStore$set$2 signInDataStore$set$3 = new SignInDataStore$set$2((PointerInputScope) obj3, (AlignmentHorizontal) obj2, shortNewsContentCardView, 1);
                signInDataStore$set$3.read = obj;
                return signInDataStore$set$3;
            case 2:
                return new SignInDataStore$set$2((PopulateViewStructure_androidKtpopulate7) this.read, (setPath) obj3, (SnapshotStateList) obj2, shortNewsContentCardView, 2);
            case 3:
                return new SignInDataStore$set$2((StrokeJoinCompanion) this.read, (Context) obj3, (String) obj2, shortNewsContentCardView, 3);
            case 4:
                return new SignInDataStore$set$2((SharedPreferencesManagerImpl) this.read, (String) obj3, (Class) obj2, shortNewsContentCardView, 4);
            case 5:
                return new SignInDataStore$set$2((SharedPreferencesManagerImpl) obj3, (String) obj2, this.read, shortNewsContentCardView);
            case 6:
                SignInDataStore$set$2 signInDataStore$set$4 = new SignInDataStore$set$2((ASN1UniversalType) this.read, (TransitionValuesMaps) obj3, (String) obj2, shortNewsContentCardView, 6);
                int i4 = RatingCompat + 93;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return signInDataStore$set$4;
                }
                obj4.hashCode();
                throw null;
            case 7:
                SignInDataStore$set$2 signInDataStore$set$5 = new SignInDataStore$set$2((isRoot) obj3, (Long) obj2, shortNewsContentCardView, 7);
                signInDataStore$set$5.read = obj;
                return signInDataStore$set$5;
            case 8:
                SignInDataStore$set$2 signInDataStore$set$6 = new SignInDataStore$set$2((DefaultLocationProvider) obj3, (LocationComponentPluginImpl) obj2, shortNewsContentCardView, 8);
                signInDataStore$set$6.read = obj;
                return signInDataStore$set$6;
            case 9:
                SignInDataStore$set$2 signInDataStore$set$7 = new SignInDataStore$set$2((MetadataApplierImpl) obj3, (AnalyticsServiceImpl) obj2, shortNewsContentCardView, 9);
                signInDataStore$set$7.read = obj;
                return signInDataStore$set$7;
            case 10:
                SignInDataStore$set$2 signInDataStore$set$8 = new SignInDataStore$set$2((EHorizonPosition) obj3, (ArrayList) obj2, shortNewsContentCardView, 10);
                signInDataStore$set$8.read = obj;
                return signInDataStore$set$8;
            case 11:
                return new SignInDataStore$set$2((ElectronicHorizonPosition) this.read, (List) obj3, (DropShadowEffect) obj2, shortNewsContentCardView, 11);
            case 12:
                return new SignInDataStore$set$2((AppMigrationBannerUiModelImpl) this.read, (findOneLayerOfMergingSemanticsNodes) obj3, (PhaseVariant) obj2, shortNewsContentCardView, 12);
            case 13:
                SignInDataStore$set$2 signInDataStore$set$9 = new SignInDataStore$set$2((CountryConfigListLocalDataSource) obj3, (List) obj2, shortNewsContentCardView, 13);
                signInDataStore$set$9.read = obj;
                return signInDataStore$set$9;
            case 14:
                return new SignInDataStore$set$2((ChatAssetCacheManager) this.read, (String) obj3, (getDefaultIndentationXSAIIZE) obj2, shortNewsContentCardView, 14);
            case 15:
                return new SignInDataStore$set$2((ChatAssetCacheManager) this.read, (findFollowingBreak) obj3, (ArrayList) obj2, shortNewsContentCardView, 15);
            case 16:
                SignInDataStore$set$2 signInDataStore$set$10 = new SignInDataStore$set$2((isRoot) obj3, obj2, shortNewsContentCardView, 16);
                signInDataStore$set$10.read = obj;
                int i5 = RatingCompat + 3;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return signInDataStore$set$10;
                }
                obj4.hashCode();
                throw null;
            case 17:
                SignInDataStore$set$2 signInDataStore$set$11 = new SignInDataStore$set$2((ChatUrlProviderImpl) obj3, (Bullet) obj2, shortNewsContentCardView, 17);
                signInDataStore$set$11.read = obj;
                int i6 = RatingCompat + 121;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 90 / 0;
                }
                return signInDataStore$set$11;
            case 18:
                SignInDataStore$set$2 signInDataStore$set$12 = new SignInDataStore$set$2(shortNewsContentCardView, (WebChatViewModel) obj3, (Uri) obj2);
                signInDataStore$set$12.read = obj;
                return signInDataStore$set$12;
            case 19:
                SignInDataStore$set$2 signInDataStore$set$13 = new SignInDataStore$set$2((N$b) obj3, (getContentViewGroupParentLayout) obj2, shortNewsContentCardView, 19);
                signInDataStore$set$13.read = obj;
                return signInDataStore$set$13;
            case 20:
                SignInDataStore$set$2 signInDataStore$set$14 = new SignInDataStore$set$2((SignInDataStore) obj3, (getContentViewGroupParentLayout) obj2, shortNewsContentCardView, 20);
                signInDataStore$set$14.read = obj;
                return signInDataStore$set$14;
            case 21:
                SignInDataStore$set$2 signInDataStore$set$15 = new SignInDataStore$set$2((RecentLastStopsDatastoreImpl) obj3, (List) obj2, shortNewsContentCardView, 21);
                signInDataStore$set$15.read = obj;
                return signInDataStore$set$15;
            case 22:
                SignInDataStore$set$2 signInDataStore$set$16 = new SignInDataStore$set$2((ShadowSpan) obj3, (String) obj2, shortNewsContentCardView, 22);
                signInDataStore$set$16.read = obj;
                return signInDataStore$set$16;
            case 23:
                SignInDataStore$set$2 signInDataStore$set$17 = new SignInDataStore$set$2((ShadowSpan) obj3, (List) obj2, shortNewsContentCardView, 23);
                signInDataStore$set$17.read = obj;
                return signInDataStore$set$17;
            case 24:
                return new SignInDataStore$set$2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 24);
            case 25:
                return new SignInDataStore$set$2((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) this.read, (ForgottenCoroutineScopeException) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 25);
            case 26:
                return new SignInDataStore$set$2((getVonKries) this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (accessgetXyzcp) obj2, shortNewsContentCardView, 26);
            case 27:
                return new SignInDataStore$set$2((GetDestinationAddressImpl) this.read, (accessgetDonecp) obj3, (accessgetGocp) obj2, shortNewsContentCardView, 27);
            case 28:
                SignInDataStore$set$2 signInDataStore$set$18 = new SignInDataStore$set$2((AndroidFontListTypeface) obj3, (String) obj2, shortNewsContentCardView, 28);
                signInDataStore$set$18.read = obj;
                return signInDataStore$set$18;
            default:
                return new SignInDataStore$set$2((CashPaymentTaskUiModelImpl) this.read, (String) obj3, (String) obj2, shortNewsContentCardView, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0686  */
    /* JADX WARN: Code duplicated, block: B:189:0x0710  */
    /* JADX WARN: Code duplicated, block: B:193:0x0723  */
    /* JADX WARN: Code duplicated, block: B:377:0x0dc8  */
    /* JADX WARN: Code duplicated, block: B:421:0x0748 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Bitmap bitmapDecodeStream;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        Iterator it;
        r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44;
        Waypoint waypoint;
        Waypoint waypoint2;
        String str;
        String strIconCompatParcelizer;
        String str2;
        String str3;
        String str4;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = 28;
        int i4 = 16;
        int i5 = 10;
        int i6 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            switch (this.serializer) {
                case 0:
                    backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SignInDataStore signInDataStore = (SignInDataStore) this.RemoteActionCompatParcelizer;
                    isRoot isroot = (isRoot) signInDataStore.RemoteActionCompatParcelizer;
                    getContentType getcontenttype = (getContentType) this.write;
                    resetTransientState resettransientstate = (resetTransientState) ((isAdapterPositionOnScreen) signInDataStore.read).MediaSessionCompatResultReceiverWrapper();
                    resettransientstate.getClass();
                    backwardfocussearch.write(isroot, resettransientstate.RemoteActionCompatParcelizer(getContentType.Companion.serializer(), getcontenttype));
                    return createFromParcel.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.read;
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    PointerInputScope pointerInputScope = (PointerInputScope) this.RemoteActionCompatParcelizer;
                    AlignmentHorizontal alignmentHorizontal = (AlignmentHorizontal) this.write;
                    ShortNewsContentCardView shortNewsContentCardView2 = null;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, coroutineStart, new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(pointerInputScope, alignmentHorizontal, shortNewsContentCardView2, 1), 1);
                    return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, coroutineStart, new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(pointerInputScope, alignmentHorizontal, shortNewsContentCardView2, i), 1);
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Set<cubicTo> set = (Set) ((PopulateViewStructure_androidKtpopulate7) this.read).getValue();
                    setPath setpath = (setPath) this.RemoteActionCompatParcelizer;
                    SnapshotStateList snapshotStateList = (SnapshotStateList) this.write;
                    for (cubicTo cubicto : set) {
                        if (!((List) setpath.serializer().serializer.read()).contains(cubicto) && !snapshotStateList.contains(cubicto)) {
                            setpath.serializer().IconCompatParcelizer(cubicto);
                        }
                    }
                    return createFromParcel.INSTANCE;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Iterator it2 = ((HashMap) ((StrokeJoinCompanion) this.read).IconCompatParcelizer()).values().iterator();
                    while (it2.hasNext()) {
                        int i7 = RatingCompat + 31;
                        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            getMirror3opZhB0 getmirror3opzhb0 = (getMirror3opZhB0) it2.next();
                            getmirror3opzhb0.getClass();
                            String str5 = getmirror3opzhb0.RemoteActionCompatParcelizer;
                            Bitmap bitmap = getmirror3opzhb0.serializer;
                            throw null;
                        }
                        getMirror3opZhB0 getmirror3opzhb1 = (getMirror3opZhB0) it2.next();
                        getmirror3opzhb1.getClass();
                        String str6 = getmirror3opzhb1.RemoteActionCompatParcelizer;
                        if (getmirror3opzhb1.serializer == null && setCarryoverInAppMessage.RemoteActionCompatParcelizer(str6, "data:", false) && hideCurrentlyDisplayingInAppMessage.write((CharSequence) str6, "base64,", 0, false, 6) > 0) {
                            try {
                                try {
                                    byte[] bArrDecode = Base64.decode((String) String.class.getMethod("substring", Integer.TYPE).invoke(str6, Integer.valueOf(hideCurrentlyDisplayingInAppMessage.write((CharSequence) str6, ',', 0, false, 6) + 1)), 0);
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inScaled = true;
                                    options.inDensity = 160;
                                    getmirror3opzhb1.serializer = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (IllegalArgumentException e) {
                                getD50Xyzui_graphics.IconCompatParcelizer("data URL did not have correct base64 format.", e);
                            }
                        }
                        Context context = (Context) this.RemoteActionCompatParcelizer;
                        String str7 = (String) this.write;
                        if (getmirror3opzhb1.serializer == null && str7 != null) {
                            try {
                                try {
                                    Object[] objArr = {context.getAssets(), str7 + str6};
                                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26244), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, 13 - TextUtils.indexOf("", "", 0, 0), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                                    }
                                    InputStream inputStream = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                                    inputStream.getClass();
                                    try {
                                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                                        options2.inScaled = true;
                                        options2.inDensity = 160;
                                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options2);
                                    } catch (IllegalArgumentException e2) {
                                        getD50Xyzui_graphics.IconCompatParcelizer("Unable to decode image.", e2);
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapDecodeStream != null) {
                                        getmirror3opzhb1.serializer = newD50Xyzui_graphics.write(bitmapDecodeStream, getmirror3opzhb1.MediaSessionCompatQueueItem, getmirror3opzhb1.write);
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } catch (IOException e3) {
                                getD50Xyzui_graphics.IconCompatParcelizer("Unable to open asset.", e3);
                            }
                            break;
                        }
                    }
                    return createFromParcel.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return ((SharedPreferencesManagerImpl) this.read).RemoteActionCompatParcelizer((Class) this.write, (String) this.RemoteActionCompatParcelizer);
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedPreferencesManagerImpl sharedPreferencesManagerImpl = (SharedPreferencesManagerImpl) this.RemoteActionCompatParcelizer;
                    String str8 = (String) this.write;
                    Object obj2 = this.read;
                    str8.getClass();
                    String json = onDependencyAdded.IconCompatParcelizer().toJson(obj2);
                    SharedPreferences.Editor editorEdit = sharedPreferencesManagerImpl.RemoteActionCompatParcelizer.edit();
                    editorEdit.putString(str8, json);
                    editorEdit.apply();
                    return createFromParcel.INSTANCE;
                case 6:
                    String str9 = (String) this.write;
                    TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) this.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ASN1UniversalType aSN1UniversalType = (ASN1UniversalType) this.read;
                    String str10 = (String) aSN1UniversalType.RatingCompat;
                    if (aSN1UniversalType.equals(markTintForBrush.read) || aSN1UniversalType.equals(markTintForBrush.IconCompatParcelizer)) {
                        transitionValuesMaps.RemoteActionCompatParcelizer(str9).RemoteActionCompatParcelizer.put(str10, Long.valueOf((Runtime.getRuntime().totalMemory() / 1024) - (Runtime.getRuntime().freeMemory() / 1024)));
                    } else if (aSN1UniversalType instanceof markTintForVNode) {
                        updateClipPath updateclippathRemoteActionCompatParcelizer = transitionValuesMaps.RemoteActionCompatParcelizer(str9);
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = updateclippathRemoteActionCompatParcelizer.write;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                        }
                        BrazeContentCardsManager brazeContentCardsManager = updateclippathRemoteActionCompatParcelizer.IconCompatParcelizer;
                        if (brazeContentCardsManager.RemoteActionCompatParcelizer >= 60) {
                            brazeContentCardsManager.removeFirst();
                        }
                        brazeContentCardsManager.addLast(Long.valueOf((Runtime.getRuntime().totalMemory() / 1024) - (Runtime.getRuntime().freeMemory() / 1024)));
                        ShortNewsContentCardView shortNewsContentCardView3 = null;
                        updateclippathRemoteActionCompatParcelizer.write = BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) transitionValuesMaps.MediaBrowserCompatMediaItem, (CoroutineDispatcher) transitionValuesMaps.MediaDescriptionCompat, null, new RealImageLoader$execute$2$job$1(new RealImageLoader.AnonymousClass2(transitionValuesMaps, updateclippathRemoteActionCompatParcelizer, shortNewsContentCardView3, i3), shortNewsContentCardView3, 7), 2);
                    } else if (aSN1UniversalType.equals(markTintForBrush.write)) {
                        updateClipPath updateclippathRemoteActionCompatParcelizer2 = transitionValuesMaps.RemoteActionCompatParcelizer(str9);
                        updateclippathRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer.put(str10, Long.valueOf((Runtime.getRuntime().totalMemory() / 1024) - (Runtime.getRuntime().freeMemory() / 1024)));
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = updateclippathRemoteActionCompatParcelizer2.write;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                            int i8 = MediaDescriptionCompat + 73;
                            RatingCompat = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = null;
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                        } else {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = null;
                        }
                        updateclippathRemoteActionCompatParcelizer2.write = r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
                    }
                    return createFromParcel.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((backwardFocusSearch) this.read).write((isRoot) this.RemoteActionCompatParcelizer, (Long) this.write);
                    return createFromParcel.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.read;
                    DefaultLocationProvider defaultLocationProvider = (DefaultLocationProvider) this.RemoteActionCompatParcelizer;
                    Flow flow = defaultLocationProvider.locationUpdatesFlow;
                    LocationComponentPluginImpl locationComponentPluginImpl = (LocationComponentPluginImpl) this.write;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DefaultLocationProvider$collectLocationFlow$1$1(flow, locationComponentPluginImpl, defaultLocationProvider, (ShortNewsContentCardView) null), 3);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new DefaultLocationProvider$collectLocationFlow$1$1(defaultLocationProvider, flow, locationComponentPluginImpl, (ShortNewsContentCardView) null), 3);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new RealImageLoader$execute$2$job$1(flow, locationComponentPluginImpl, (ShortNewsContentCardView) null, i4), 3);
                    return createFromParcel.INSTANCE;
                case 9:
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    List list = (List) this.read;
                    LoggerProviderKt.logD(list.size() + " alternatives available", "RouteAlternativesController");
                    MetadataApplierImpl metadataApplierImpl = (MetadataApplierImpl) this.RemoteActionCompatParcelizer;
                    RouteProgress routeProgress = ((MapboxTripSession) metadataApplierImpl.MediaBrowserCompatMediaItem).routeProgress;
                    if (routeProgress == null) {
                        LoggerProviderKt.logD("skipping alternatives update - no progress", "RouteAlternativesController");
                    } else {
                        NavigationRoute navigationRoute = routeProgress.navigationRoute;
                        navigationRoute.getClass();
                        List listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(routeProgress.remainingWaypoints, navigationRoute.nativeWaypoints);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : listIconCompatParcelizer) {
                            int i10 = ((Waypoint) obj3).type;
                            if (i10 != 1) {
                                int i11 = RatingCompat + 67;
                                MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                                if (i11 % 2 != 0) {
                                    if (i10 == 4) {
                                        arrayList.add(obj3);
                                    }
                                } else if (i10 == 2) {
                                    arrayList.add(obj3);
                                }
                            } else {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list) {
                            NavigationRoute navigationRoute2 = (NavigationRoute) obj4;
                            navigationRoute2.getClass();
                            List listSerializer = onContentCardDismissed.serializer(navigationRoute2.nativeWaypoints, i6);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj5 : listSerializer) {
                                int i12 = RatingCompat + 109;
                                MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                int i14 = ((Waypoint) obj5).type;
                                if (i14 == i6 || i14 == 2) {
                                    arrayList3.add(obj5);
                                }
                            }
                            if (arrayList3.size() != arrayList.size()) {
                                i6 = 0;
                            } else {
                                isLongPressDragEnabled islongpressdragenabled = new isLongPressDragEnabled(0, new g0$$ExternalSyntheticLambda8(4, arrayList3));
                                if (islongpressdragenabled instanceof Collection) {
                                    int i15 = MediaDescriptionCompat + 7;
                                    RatingCompat = i15 % Fields.SpotShadowColor;
                                    if (i15 % 2 == 0) {
                                        ((Collection) islongpressdragenabled).isEmpty();
                                        throw null;
                                    }
                                    if (!((Collection) islongpressdragenabled).isEmpty()) {
                                        it = islongpressdragenabled.iterator();
                                        while (true) {
                                            r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = (r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44) it;
                                            if (((((Iterator) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.IconCompatParcelizer).hasNext() ? 1 : 0) ^ i6) != 0) {
                                                isItemViewSwipeEnabled isitemviewswipeenabled = (isItemViewSwipeEnabled) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.next();
                                                int i16 = isitemviewswipeenabled.IconCompatParcelizer;
                                                waypoint = (Waypoint) isitemviewswipeenabled.read;
                                                waypoint2 = (Waypoint) arrayList.get(i16);
                                                if (waypoint.location.equals(waypoint2.location) || waypoint.type != waypoint2.type) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = 1;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    it = islongpressdragenabled.iterator();
                                    while (true) {
                                        r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = (r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44) it;
                                        if (((((Iterator) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.IconCompatParcelizer).hasNext() ? 1 : 0) ^ i6) != 0) {
                                            isItemViewSwipeEnabled isitemviewswipeenabled2 = (isItemViewSwipeEnabled) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.next();
                                            int i17 = isitemviewswipeenabled2.IconCompatParcelizer;
                                            waypoint = (Waypoint) isitemviewswipeenabled2.read;
                                            waypoint2 = (Waypoint) arrayList.get(i17);
                                            if (waypoint.location.equals(waypoint2.location)) {
                                            }
                                            i6 = 0;
                                        }
                                        i6 = 1;
                                    }
                                }
                            }
                            if (i6 == 0) {
                                int i18 = MediaDescriptionCompat + 97;
                                RatingCompat = i18 % Fields.SpotShadowColor;
                                int i19 = i18 % 2;
                                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                                    LoggerProviderKt.logI("ignoring alternative " + navigationRoute2.id + ": upcoming regular/silent waypoints don't match the current primary route", "RouteAlternativesController");
                                }
                            }
                            if (i6 != 0) {
                                arrayList2.add(obj4);
                            }
                            i6 = 1;
                        }
                        AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) metadataApplierImpl.MediaDescriptionCompat;
                        if (analyticsServiceImpl != null) {
                            SuggestionType$AlternativesUpdated suggestionType$AlternativesUpdated = SuggestionType$AlternativesUpdated.INSTANCE;
                            NetworkFetcher.AnonymousClass2 anonymousClass2 = (NetworkFetcher.AnonymousClass2) analyticsServiceImpl.locationProvider;
                            String str11 = navigationRoute.origin;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str11, "ONLINE"}, getCieXyz.write())).booleanValue()) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj6 : arrayList2) {
                                    int i20 = MediaDescriptionCompat + 91;
                                    RatingCompat = i20 % Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) obj6).origin, "ONLINE"}, getCieXyz.write())).booleanValue()) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                anonymousClass2.invoke(new UpdateRouteSuggestion(onContentCardDismissed.IconCompatParcelizer(arrayList4, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())), suggestionType$AlternativesUpdated));
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str11, "OFFLINE"}, getCieXyz.write())).booleanValue()) {
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it3 = arrayList2.iterator();
                                while (!(!it3.hasNext())) {
                                    Object next = it3.next();
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) next).origin, "ONLINE"}, getCieXyz.write())).booleanValue()) {
                                        arrayList5.add(next);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj7 : arrayList2) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((NavigationRoute) obj7).origin, "OFFLINE"}, getCieXyz.write())).booleanValue()) {
                                        arrayList6.add(obj7);
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    anonymousClass2.invoke(new UpdateRouteSuggestion(arrayList5, SuggestionType$AlternativesUpdated.INSTANCE$1));
                                } else if (!arrayList6.isEmpty()) {
                                    anonymousClass2.invoke(new UpdateRouteSuggestion(onContentCardDismissed.IconCompatParcelizer(arrayList6, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())), suggestionType$AlternativesUpdated));
                                } else if (arrayList2.isEmpty()) {
                                    anonymousClass2.invoke(new UpdateRouteSuggestion((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), suggestionType$AlternativesUpdated));
                                }
                            }
                        }
                    }
                    return createfromparcel;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    throw c8$$ExternalSyntheticOutline0.m(this.read);
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                    ElectronicHorizonPosition electronicHorizonPosition = (ElectronicHorizonPosition) this.read;
                    List list2 = (List) this.RemoteActionCompatParcelizer;
                    DropShadowEffect dropShadowEffect = (DropShadowEffect) this.write;
                    if (PerformanceTracker.getTrackingIsActive()) {
                        PerformanceTracker.syncSectionStarted("EHorizon.onPositionUpdated");
                        try {
                            long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                            EHorizonPosition eHorizonPositionBuildEHorizonPosition = zzlv.buildEHorizonPosition(electronicHorizonPosition);
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList7.add(zzlv.buildRoadObjectDistance((RoadObjectDistance) it4.next()));
                            }
                            DropShadowEffect.access$notifyAllObservers(dropShadowEffect, new SignInDataStore$set$2(eHorizonPositionBuildEHorizonPosition, arrayList7, shortNewsContentCardView, i5));
                            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("EHorizon.onPositionUpdated", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                        } catch (Throwable th3) {
                            PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("EHorizon.onPositionUpdated", null);
                            throw th3;
                        }
                    } else {
                        EHorizonPosition eHorizonPositionBuildEHorizonPosition2 = zzlv.buildEHorizonPosition(electronicHorizonPosition);
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it5 = list2.iterator();
                        while (!(!it5.hasNext())) {
                            arrayList8.add(zzlv.buildRoadObjectDistance((RoadObjectDistance) it5.next()));
                        }
                        DropShadowEffect.access$notifyAllObservers(dropShadowEffect, new SignInDataStore$set$2(eHorizonPositionBuildEHorizonPosition2, arrayList8, shortNewsContentCardView, i5));
                    }
                    return createFromParcel.INSTANCE;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = ((AppMigrationBannerUiModelImpl) this.read).MediaBrowserCompatMediaItem;
                    findOneLayerOfMergingSemanticsNodes findonelayerofmergingsemanticsnodes = (findOneLayerOfMergingSemanticsNodes) this.RemoteActionCompatParcelizer;
                    PhaseVariant phaseVariant = (PhaseVariant) this.write;
                    initializeAppStartupItemsImpl.getClass();
                    phaseVariant.getClass();
                    addSemanticsPropertiesFrom addsemanticspropertiesfrom = (addSemanticsPropertiesFrom) initializeAppStartupItemsImpl.IconCompatParcelizer;
                    Application application = (Application) initializeAppStartupItemsImpl.serializer;
                    ((n0) addsemanticspropertiesfrom).getClass();
                    application.getClass();
                    String str12 = findonelayerofmergingsemanticsnodes.icon;
                    String str13 = findonelayerofmergingsemanticsnodes.title;
                    String str14 = findonelayerofmergingsemanticsnodes.body;
                    String str15 = findonelayerofmergingsemanticsnodes.ctaButtonText;
                    String str16 = findonelayerofmergingsemanticsnodes.ctaButtonUrl;
                    boolean z = findonelayerofmergingsemanticsnodes.collapsed;
                    getChildrenuidefault getchildrenuidefault = findonelayerofmergingsemanticsnodes.analytics;
                    return new accessgetIdjd(str12, str13, str14, str15, str16, z, new SemanticsListener(getchildrenuidefault.daysUntilMigration, getchildrenuidefault.bannerVariant, copyWithMergingEnabledui.serializer(phaseVariant)));
                case 13:
                    backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.read;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isRoot isroot2 = ((CountryConfigListLocalDataSource) this.RemoteActionCompatParcelizer).read;
                    List list3 = (List) this.write;
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    backwardfocussearch2.write(isroot2, isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(metaMarkUpdatedAndHasCallbacks.Companion.serializer(), 0), list3));
                    return createFromParcel.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ChatAssetCacheManager chatAssetCacheManager = (ChatAssetCacheManager) this.read;
                    File fileIconCompatParcelizer = ChatAssetCacheManager.IconCompatParcelizer(chatAssetCacheManager, (String) this.RemoteActionCompatParcelizer);
                    getDefaultIndentationXSAIIZE getdefaultindentationxsaiize = (getDefaultIndentationXSAIIZE) this.write;
                    File file = new File(fileIconCompatParcelizer, ChatAssetCacheManager.read(chatAssetCacheManager, getdefaultindentationxsaiize));
                    if (!file.exists() || !file.isFile()) {
                        file = null;
                    }
                    if (file == null) {
                        return null;
                    }
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    return new BulletSpanWithLevel(getdefaultindentationxsaiize, absolutePath);
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    try {
                        File fileIconCompatParcelizer2 = ChatAssetCacheManager.IconCompatParcelizer((ChatAssetCacheManager) this.read, ((findFollowingBreak) this.RemoteActionCompatParcelizer).read);
                        ArrayList arrayList9 = (ArrayList) this.write;
                        ChatAssetCacheManager chatAssetCacheManager2 = (ChatAssetCacheManager) this.read;
                        ArrayList arrayList10 = new ArrayList(accessgetInstancedelegatecp.write(arrayList9, 10));
                        Iterator it6 = arrayList9.iterator();
                        while (it6.hasNext()) {
                            int i22 = MediaDescriptionCompat + 35;
                            RatingCompat = i22 % Fields.SpotShadowColor;
                            if (i22 % 2 == 0) {
                                arrayList10.add(ChatAssetCacheManager.IconCompatParcelizer(chatAssetCacheManager2, (BulletSpanWithLevel) it6.next()));
                                try {
                                    shortNewsContentCardView.hashCode();
                                    throw null;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            arrayList10.add(ChatAssetCacheManager.IconCompatParcelizer(chatAssetCacheManager2, (BulletSpanWithLevel) it6.next()));
                        }
                        findFollowingBreak findfollowingbreak = (findFollowingBreak) this.RemoteActionCompatParcelizer;
                        String str17 = findfollowingbreak.read;
                        String str18 = findfollowingbreak.RemoteActionCompatParcelizer;
                        ChatAssetCacheStatus chatAssetCacheStatus = ChatAssetCacheStatus.READY;
                        ArrayList<CharHelpers_androidKt> arrayList11 = findfollowingbreak.write;
                        ArrayList arrayList12 = new ArrayList(accessgetInstancedelegatecp.write(arrayList11, 10));
                        for (CharHelpers_androidKt charHelpers_androidKt : arrayList11) {
                            arrayList12.add(new subSequence5zctL8(charHelpers_androidKt.serializer(), charHelpers_androidKt.read(), charHelpers_androidKt.IconCompatParcelizer()));
                        }
                        ArrayList<CharHelpers_androidKt> arrayList13 = ((findFollowingBreak) this.RemoteActionCompatParcelizer).IconCompatParcelizer;
                        ArrayList arrayList14 = new ArrayList(accessgetInstancedelegatecp.write(arrayList13, 10));
                        for (CharHelpers_androidKt charHelpers_androidKt2 : arrayList13) {
                            arrayList14.add(new subSequence5zctL8(charHelpers_androidKt2.serializer(), charHelpers_androidKt2.read(), charHelpers_androidKt2.IconCompatParcelizer()));
                        }
                        hasLinkAnnotations haslinkannotations = new hasLinkAnnotations(str17, str18, chatAssetCacheStatus, arrayList12, arrayList14, arrayList10);
                        File file2 = new File(fileIconCompatParcelizer2, "_metadata.json");
                        File file3 = new File(fileIconCompatParcelizer2, "_metadata.json.tmp");
                        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = ((ChatAssetCacheManager) this.read).MediaSessionCompatQueueItem;
                        r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = hasLinkAnnotations.Companion.serializer();
                        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                        r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(file3, r8lambda3kmch7yklpui_5smgazrgczhglc.RemoteActionCompatParcelizer(setgraphicmodalmaxwidthdpSerializer, haslinkannotations), ensureSubscribedToInAppMessageEvents.write);
                        Files.move(file3.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        ChatAssetCacheManager chatAssetCacheManager3 = (ChatAssetCacheManager) this.read;
                        chatAssetCacheManager3.IconCompatParcelizer = ChatAssetCacheManager.read(chatAssetCacheManager3, fileIconCompatParcelizer2, haslinkannotations);
                        return createFromParcel.INSTANCE;
                    } catch (Exception e4) {
                        if (e4 instanceof IOException) {
                            str = "I/O error";
                        } else if (e4 instanceof SecurityException) {
                            str = "permission denied";
                        } else {
                            Object[] objArr2 = new Object[1];
                            a(16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{57151, 28913, 21273, 22055, 15641, 13385, 52884, 10751, 7534, 18198, 20546, 43227, 9817, 17577, 59958, 44661}, objArr2);
                            str = (String) objArr2[0];
                        }
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e4, af$$ExternalSyntheticOutline0.m("Failed to write metadata for release ", ((findFollowingBreak) this.RemoteActionCompatParcelizer).read, ": ", str), new Object[0]);
                        throw e4;
                    }
                case 16:
                    backwardFocusSearch backwardfocussearch3 = (backwardFocusSearch) this.read;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch3.write((isRoot) this.RemoteActionCompatParcelizer, this.write);
                    return createFromParcel.INSTANCE;
                case 17:
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = (getContentViewGroupParentLayout) this.read;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new RealImageLoader$execute$2$job$1((ChatUrlProviderImpl) this.RemoteActionCompatParcelizer, (Bullet) this.write, shortNewsContentCardView, i3), 3);
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((WebChatViewModel) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer.serializer(new toGlobalxdX6G0default((Uri) this.write));
                    return createFromParcel.INSTANCE;
                case 19:
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout4 = (getContentViewGroupParentLayout) this.read;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    N$b n$b = (N$b) this.RemoteActionCompatParcelizer;
                    AnalyticsServiceImpl analyticsServiceImpl2 = (AnalyticsServiceImpl) n$b.read;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout5 = (getContentViewGroupParentLayout) this.write;
                    getcontentviewgroupparentlayout5.getClass();
                    SignInDataStore signInDataStore2 = (SignInDataStore) analyticsServiceImpl2.locationProvider;
                    r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer = removeNodeAtDepth.serializer(((loadBlocking) signInDataStore2.RemoteActionCompatParcelizer).serializer(getcontentviewgroupparentlayout5), ((first) signInDataStore2.serializer).IconCompatParcelizer(getcontentviewgroupparentlayout5), ((WordIterator) signInDataStore2.read).RemoteActionCompatParcelizer(getcontentviewgroupparentlayout5, true));
                    n$b.serializer = new measurexDpz5zY(r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer);
                    if (r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer != null) {
                        Iterator<E> it7 = r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer.iterator();
                        while (it7.hasNext()) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout4, null, null, new BridgeManager$trackEvent$2((onViewCreated) it7.next(), n$b, shortNewsContentCardView, 14), 3);
                        }
                    }
                    return createFromParcel.INSTANCE;
                case 20:
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout6 = (getContentViewGroupParentLayout) this.read;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SignInDataStore signInDataStore3 = (SignInDataStore) this.RemoteActionCompatParcelizer;
                    AnalyticsServiceImpl analyticsServiceImpl3 = (AnalyticsServiceImpl) signInDataStore3.serializer;
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout7 = (getContentViewGroupParentLayout) this.write;
                    getcontentviewgroupparentlayout7.getClass();
                    SignInDataStore signInDataStore4 = (SignInDataStore) analyticsServiceImpl3.locationProvider;
                    r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer2 = removeNodeAtDepth.serializer(((getParagraphForOffset) signInDataStore4.serializer).RemoteActionCompatParcelizer(getcontentviewgroupparentlayout7, true), ((getLeftIndents) signInDataStore4.read).serializer(getcontentviewgroupparentlayout7), ((getTextDirectionHeuristic) signInDataStore4.RemoteActionCompatParcelizer).read(getcontentviewgroupparentlayout7));
                    TextMeasurerKt textMeasurerKt = new TextMeasurerKt(r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer2);
                    ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer2.listIterator(0);
                    while (listIterator.hasNext()) {
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout6, null, null, new PerseusLogger$w$1((onViewCreated) listIterator.next(), signInDataStore3, textMeasurerKt, null, 18), 3);
                    }
                    return createFromParcel.INSTANCE;
                case 21:
                    backwardFocusSearch backwardfocussearch4 = (backwardFocusSearch) this.read;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isRoot isroot3 = ((RecentLastStopsDatastoreImpl) this.RemoteActionCompatParcelizer).serializer;
                    List list4 = (List) this.write;
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                    isverticalswipeinalloweddirection2.getClass();
                    backwardfocussearch4.write(isroot3, isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(drawARGB.Companion.serializer(), 0), list4));
                    return createFromParcel.INSTANCE;
                case 22:
                    getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) this.read;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                    ShadowSpan shadowSpan = (ShadowSpan) this.RemoteActionCompatParcelizer;
                    String str19 = (String) this.write;
                    isRoot isroot4 = shadowSpan.serializer;
                    String str20 = (String) backwardfocussearchIconCompatParcelizer.serializer(isroot4);
                    if (str20 != null && ((Integer) String.class.getMethod("length", null).invoke(str20, null)).intValue() != 0) {
                        List listSerializer2 = hideCurrentlyDisplayingInAppMessage.serializer(str20, new String[]{","}, 6);
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj8 : listSerializer2) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj8, str19}, getCieXyz.write())).booleanValue()) {
                                arrayList15.add(obj8);
                            }
                        }
                        String strIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer(arrayList15, ",", null, null, null, 62);
                        if (((Integer) String.class.getMethod("length", null).invoke(strIconCompatParcelizer2, null)).intValue() == 0) {
                            backwardfocussearchIconCompatParcelizer.read(isroot4);
                        } else {
                            backwardfocussearchIconCompatParcelizer.write(isroot4, strIconCompatParcelizer2);
                        }
                    }
                    return backwardfocussearchIconCompatParcelizer;
                case 23:
                    getNoActiveChildannotations getnoactivechildannotations2 = (getNoActiveChildannotations) this.read;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardFocusSearch backwardfocussearchIconCompatParcelizer2 = getnoactivechildannotations2.IconCompatParcelizer();
                    ShadowSpan shadowSpan2 = (ShadowSpan) this.RemoteActionCompatParcelizer;
                    List list5 = (List) this.write;
                    isRoot isroot5 = shadowSpan2.serializer;
                    String str21 = (String) backwardfocussearchIconCompatParcelizer2.serializer(isroot5);
                    if (str21 != null) {
                        List listSerializer3 = hideCurrentlyDisplayingInAppMessage.serializer(str21, new String[]{","}, 6);
                        ArrayList arrayList16 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer3, 10));
                        Iterator it8 = listSerializer3.iterator();
                        while (it8.hasNext()) {
                            arrayList16.add(new Long(Long.parseLong((String) it8.next())));
                        }
                        strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.ParcelableVolumeInfo(onContentCardDismissed.IconCompatParcelizer(list5, arrayList16))), ",", null, null, null, 62);
                    } else {
                        strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list5, ",", null, null, null, 62);
                    }
                    backwardfocussearchIconCompatParcelizer2.write(isroot5, strIconCompatParcelizer);
                    return backwardfocussearchIconCompatParcelizer2;
                case 24:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    dashPathEffectdefault dashpatheffectdefault = (dashPathEffectdefault) ((PopulateViewStructure_androidKtpopulate7) this.write).getValue();
                    if (dashpatheffectdefault instanceof AsyncImagePainter$State$Success) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read).invoke();
                    } else if (dashpatheffectdefault instanceof AsyncImagePainter$State$Error) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.RemoteActionCompatParcelizer).invoke();
                        int i23 = MediaDescriptionCompat + 25;
                        RatingCompat = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                    }
                    return createFromParcel.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    InputMethodManager inputMethodManager = (InputMethodManager) onContentCardDismissed.read(((ForgottenCoroutineScopeException) this.RemoteActionCompatParcelizer).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer(), (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) this.read);
                    if (inputMethodManager != null && (str2 = inputMethodManager.RemoteActionCompatParcelizer) != null) {
                        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write).invoke(str2);
                    }
                    return createFromParcel.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessgetXyzcp accessgetxyzcp = (accessgetXyzcp) this.write;
                    getTopLeftannotations gettopleftannotations = PhotoSharedSuccessDialogKt.read;
                    if (((StrokeJoinCompanion) accessgetxyzcp.getValue()) != null && ((getVonKries) this.read).write() == 1.0f) {
                        ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.RemoteActionCompatParcelizer).invoke();
                    }
                    return createFromParcel.INSTANCE;
                case 27:
                    return invokeSuspend$com$roadrunner$delivery$ontheway$destination$domain$GetDestinationAddressImpl$invoke$uri$1(obj);
                case 28:
                    return invokeSuspend$com$roadrunner$delivery$ontheway$entrancepicture$data$EntrancePictureDataStore$setTooltipShownEntrancePicture$2$1(obj);
                default:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = (CashPaymentTaskUiModelImpl) this.read;
                    BuildersKt.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl.serializer, null, null, new CashPaymentTaskUiModelImpl.AnonymousClass2(cashPaymentTaskUiModelImpl, null, 1), 3);
                    parseAnimatedVisibility parseanimatedvisibility = cashPaymentTaskUiModelImpl.MediaDescriptionCompat;
                    getPositionannotations getpositionannotations = cashPaymentTaskUiModelImpl.write;
                    String str22 = (String) this.RemoteActionCompatParcelizer;
                    String str23 = (String) this.write;
                    parseanimatedvisibility.getClass();
                    str22.getClass();
                    str23.getClass();
                    Map mapRemoteActionCompatParcelizer = getpositionannotations != null ? onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", str23), new onViewAttachedToWindowlambda0("isTaskMandatory", String.class.getMethod("valueOf", Object.class).invoke(null, (Boolean) onContentCardDismissed.read(getpositionannotations.taskIds.indexOf(str23), getpositionannotations.tasksRequired))), new onViewAttachedToWindowlambda0("transferChangeAmount", str22)) : null;
                    if (mapRemoteActionCompatParcelizer == null) {
                        mapRemoteActionCompatParcelizer = SimpleItemTouchHelperCallback.serializer;
                    }
                    String str24 = getpositionannotations != null ? getpositionannotations.deliveryState : null;
                    if (str24 != null) {
                        str3 = null;
                        int iIntValue = ((Integer) String.class.getMethod("hashCode", null).invoke(str24, null)).intValue();
                        if (iIntValue != -988476804) {
                            int i25 = RatingCompat + 41;
                            MediaDescriptionCompat = i25 % Fields.SpotShadowColor;
                            int i26 = i25 % 2;
                            if (iIntValue != -934396624) {
                                if (iIntValue == 1925735456 && ((Boolean) String.class.getMethod("equals", Object.class).invoke(str24, "dropoff")).booleanValue()) {
                                    str4 = "deliveries_dropoff_task_success";
                                }
                            } else if (((Boolean) String.class.getMethod("equals", Object.class).invoke(str24, "return")).booleanValue()) {
                                str4 = "deliveries_return_task_success";
                            }
                        } else if (((Boolean) String.class.getMethod("equals", Object.class).invoke(str24, "pickup")).booleanValue()) {
                            str4 = "deliveries_pickup_task_success";
                        }
                        if (str4 != null) {
                            parseanimatedvisibility.IconCompatParcelizer.logEvent(str4, mapRemoteActionCompatParcelizer);
                        }
                        return createFromParcel.INSTANCE;
                    }
                    str3 = null;
                    Timber.RemoteActionCompatParcelizer.write(new Error(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid status for logging ", str24)));
                    str4 = str3;
                    if (str4 != null) {
                        parseanimatedvisibility.IconCompatParcelizer.logEvent(str4, mapRemoteActionCompatParcelizer);
                    }
                    return createFromParcel.INSTANCE;
            }
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }
}
