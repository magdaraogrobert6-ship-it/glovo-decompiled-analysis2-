package androidx.lifecycle;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.camera.view.ScreenFlashView$2;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n5;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.gms.net.zza;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.x;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.extension.style.StyleContract$StyleExtension;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.viewannotation.ViewAnnotationManager;
import com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt;
import com.mapbox.navigation.base.internal.route.parsing.ParsingEntryPoint;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.internal.route.callout.api.MapboxRouteCalloutsView$onViewAnnotationUpdatedListener$1;
import com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiState;
import com.mapbox.navigation.ui.maps.route.callout.api.RouteCalloutUiStateData;
import com.mapbox.navigation.ui.maps.route.callout.model.CalloutViewHolder;
import com.mapbox.navigation.ui.maps.route.callout.model.DefaultRouteCalloutAdapterOptions;
import com.mapbox.navigation.ui.maps.route.callout.model.RouteCallout;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.mapbox.navigator.RouterInterface;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.auth.domain.token.DoesAccessTokenExistUseCaseImpl;
import com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1;
import com.roadrunner.biometrics.domain.decryption.LaunchBiometricsDecryptionUseCase$invoke$1;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.custom.password.domain.CreatePasswordUseCase$invoke$1;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.liveness.api.recording.CameraImage;
import com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl;
import com.roadrunner.liveness.domain.UploadLivenessSelfieUseCase$invoke$1;
import com.roadrunner.login.domain.forgotpassword.usecase.ResetPasswordUseCase$invoke$1;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.domain.FetchHistoryUseCase$invoke$1;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationFragment;
import com.sentiance.core.model.events.H$b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidUiFrameClock;
import o.AuthPromptFailureException;
import o.BiometricFragmentExternalSyntheticLambda1;
import o.BrazeExternalSyntheticLambda28;
import o.BrazeExternalSyntheticLambda45;
import o.BrazeExternalSyntheticLambda5;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.Camera2CameraFactory;
import o.CaptureSessionShouldUseMrirQuirk;
import o.CaptureSessionStuckQuirk;
import o.ConfigureSurfaceToSecondarySessionFailQuirk;
import o.DrawModifierNodeKt;
import o.ExtraSupportedOutputSizeQuirk;
import o.ImageCaptureFailWithAutoFlashQuirk;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.InterruptedRuntimeException;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.PrematureEndOfStreamVideoQuirk;
import o.QueryResultCompanion;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.ShortNewsContentCardView;
import o.Transacter;
import o.UseCaseAdditionSimulator;
import o.VideoQualityQuirk;
import o.accessgetInstancedelegatecp;
import o.accessisMainThread;
import o.accessstartTrackingTable;
import o.afExternalSyntheticOutline1;
import o.boundingRectInRoot;
import o.colorResource;
import o.currentTransaction;
import o.db;
import o.extractJsonString;
import o.getAbsoluteAdapterPosition;
import o.getAccessibilityClassNamedelegate;
import o.getAccessibilityManager;
import o.getBindingAdapter;
import o.getColorIntegerOrNull;
import o.getCoroutineContext;
import o.getDataStore;
import o.getFontLoaderannotations;
import o.getInflatedId;
import o.getLong;
import o.getNavigationIcon;
import o.getPendingTablesruntime;
import o.getPopupContext;
import o.getRectManager;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSearchViewTextMinWidthDp;
import o.getTestTagsAsResourceIddelegate;
import o.getTextInputService;
import o.getTextSelectionRange;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.incrementSensitiveComponentCount;
import o.insertOrUpdateTransformedNode;
import o.insertOrUpdateTransformedNodeSubhierarchy;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.m2;
import o.m5;
import o.m6;
import o.mapToBase;
import o.mergeJsonObjects;
import o.nodeRemoved;
import o.onContentCardDismissed;
import o.onEndApplyChanges;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.publishErrorlambda1;
import o.r8lambdaCTegLFIY2N5eeYL50pY32CICZRI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.sendAttributionRequestI;
import o.setAccessibilityClassName;
import o.setDistanceToTriggerSync;
import o.setInflatedId;
import o.setIsRecyclable;
import o.setLastShapeui;
import o.setResourcePackageNamelambda0;
import o.setSensitiveData;
import o.setShowingTextSubstitution;
import o.setTextSelectionRangeFDrldGo;
import o.setTextSubstitution;
import o.setTextSubstitutiondefault;
import o.setToggleableState;
import o.setTransactionSuccessful;
import o.setTraversalGroup;
import o.setTraversalIndex;
import o.setUnregisteredInAppMessage;
import o.shouldSkipDump;
import o.transferSessionPackageI;
import o.unregisterInAppMessageManager;
import o.updateAdidI;
import o.verifyPlayStorePurchaseI;
import o.visitNodes;
import okhttp3.FormBody;
import okio.Path$Companion;
import org.joda.time.LocalDate;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class BlockRunner implements r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, StyleContract$StyleExtension {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public Object IconCompatParcelizer;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public ArrayList RatingCompat() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.serializer) {
            arrayList = new ArrayList();
            arrayList.addAll(read());
            synchronized (this.serializer) {
                arrayList2 = new ArrayList((LinkedHashSet) this.RemoteActionCompatParcelizer);
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public ArrayList read() {
        ArrayList arrayList;
        synchronized (this.serializer) {
            arrayList = new ArrayList((LinkedHashSet) this.RatingCompat);
        }
        return arrayList;
    }

    public BlockRunner(CameraAnimationsPlugin cameraAnimationsPlugin, MapboxMap mapboxMap, AnimatorSet animatorSet) {
        this.read = cameraAnimationsPlugin;
        this.serializer = mapboxMap;
        this.RatingCompat = animatorSet;
        this.write = SQLite.read(Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f));
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(childAnimations, 10));
        Iterator<T> it = childAnimations.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                Object[] array = arrayList.toArray(new ValueAnimator[0]);
                array.getClass();
                this.RemoteActionCompatParcelizer = (ValueAnimator[]) array;
                this.IconCompatParcelizer = new CopyOnWriteArrayList();
                ((AnimatorSet) this.RatingCompat).addListener(new ScreenFlashView$2(i, this));
                int i2 = MediaMetadataCompat + 15;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            int i4 = MediaDescriptionCompat + 43;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Animator animator = (Animator) it.next();
            animator.getClass();
            arrayList.add((ValueAnimator) animator);
            int i6 = 2 % 2;
        }
    }

    public int serializer() {
        int iMediaMetadataCompat;
        int i;
        PrematureEndOfStreamVideoQuirk.write();
        UtilsKt.RemoteActionCompatParcelizer("The ImageReader is not initialized.", ((AuthPromptFailureException) this.serializer) != null);
        AuthPromptFailureException authPromptFailureException = (AuthPromptFailureException) this.serializer;
        synchronized (authPromptFailureException.read) {
            iMediaMetadataCompat = authPromptFailureException.serializer.MediaMetadataCompat();
            i = authPromptFailureException.MediaBrowserCompatMediaItem;
        }
        return iMediaMetadataCompat - i;
    }

    public String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (String) this.RatingCompat;
        }
        int i3 = 18 / 0;
        return (String) this.RatingCompat;
    }

    public String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 109;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = (String) this.read;
        int i5 = i2 + 105;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public List getImages() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 115;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = (List) this.RatingCompat;
        int i5 = i2 + 31;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public List getLayers() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        List list = (List) this.RemoteActionCompatParcelizer;
        int i5 = i3 + 73;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public List getModels() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (List) this.write;
        }
        throw null;
    }

    public List getSources() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 117;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (List) this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getStyle() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (String) this.read;
        }
        int i3 = 52 / 0;
        return (String) this.read;
    }

    public TransitionOptions getTransition() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 45;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TransitionOptions transitionOptions = (TransitionOptions) this.IconCompatParcelizer;
        int i5 = i2 + 5;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return transitionOptions;
    }

    public Map write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 57;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.write;
        int i5 = i2 + 93;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return linkedHashMap;
        }
        throw null;
    }

    public boolean RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 113;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (write(i) != null) {
            return true;
        }
        int i5 = MediaMetadataCompat + 35;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public RouterInterface getRouter$navigation_release() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = ((AtomicReference) this.IconCompatParcelizer).get();
        obj.getClass();
        RouterInterface routerInterface = (RouterInterface) obj;
        int i4 = MediaMetadataCompat + 51;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return routerInterface;
    }

    public List IconCompatParcelizer(boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = (ArrayList) this.IconCompatParcelizer;
        if (z) {
            int i2 = MediaMetadataCompat + 47;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                arrayList.isEmpty();
                throw null;
            }
            if (!arrayList.isEmpty()) {
                int i3 = MediaMetadataCompat + 57;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return arrayList;
                }
                obj.hashCode();
                throw null;
            }
        }
        return (ArrayList) this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1
  0x0033: PHI (r1v6 java.util.HashMap) = (r1v5 java.util.HashMap), (r1v10 java.util.HashMap) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public getCoroutineContext read(int i) {
        HashMap map;
        getCoroutineContext getcoroutinecontext;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 1;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            map = (HashMap) this.serializer;
            getcoroutinecontext = (getCoroutineContext) map.get(Integer.valueOf(i));
            int i4 = 16 / 0;
            if (getcoroutinecontext == null) {
                getcoroutinecontext = new getCoroutineContext();
                map.put(Integer.valueOf(i), getcoroutinecontext);
                int i5 = MediaMetadataCompat + 91;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            map = (HashMap) this.serializer;
            getcoroutinecontext = (getCoroutineContext) map.get(Integer.valueOf(i));
            if (getcoroutinecontext == null) {
                getcoroutinecontext = new getCoroutineContext();
                map.put(Integer.valueOf(i), getcoroutinecontext);
                int i7 = MediaMetadataCompat + 91;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        int i9 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 76 / 0;
        }
        return getcoroutinecontext;
    }

    public void release() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 87;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = null;
        clear();
        ((ViewAnnotationManager) this.read).removeOnViewAnnotationUpdatedListener((MapboxRouteCalloutsView$onViewAnnotationUpdatedListener$1) this.write);
        m2 m2Var = (m2) this.serializer;
        m2Var.observers.remove((SearchOptionsKt$validateLimit$1) this.RemoteActionCompatParcelizer);
        int i4 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public setLastShapeui write(int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 47;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getCoroutineContext getcoroutinecontext = (getCoroutineContext) ((HashMap) this.serializer).get(Integer.valueOf(i));
        if (getcoroutinecontext == null || getcoroutinecontext.serializer == 0) {
            return (setLastShapeui) ((getAccessibilityManager) this.read).IconCompatParcelizer.get(Integer.valueOf(i));
        }
        int i4 = MediaDescriptionCompat + 69;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public void IconCompatParcelizer(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk) {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 83;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = 1;
        if (i2 % 2 == 0) {
            PrematureEndOfStreamVideoQuirk.write();
            if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem.size() == 1) {
                z = true;
            } else {
                int i4 = MediaMetadataCompat + 13;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = false;
            }
        } else {
            PrematureEndOfStreamVideoQuirk.write();
            if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem.size() == 1) {
                z = true;
            } else {
                int i6 = MediaMetadataCompat + 13;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                z = false;
            }
        }
        UtilsKt.RemoteActionCompatParcelizer("only one capture stage is supported.", z);
        UtilsKt.RemoteActionCompatParcelizer("Too many acquire images. Close image to be able to process next.", serializer() > 0);
        this.read = imageCaptureFailedWhenVideoCaptureIsBoundQuirk;
        DrawModifierNodeKt drawModifierNodeKt = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer;
        drawModifierNodeKt.RemoteActionCompatParcelizer(new zza(drawModifierNodeKt, i3, new colorResource(this, 4, imageCaptureFailedWhenVideoCaptureIsBoundQuirk)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public void serializer(int i, visitNodes visitnodes, NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        int i2 = 2 % 2;
        if (RemoteActionCompatParcelizer(i)) {
            getCoroutineContext getcoroutinecontext = read(i);
            HashMap map = getcoroutinecontext.IconCompatParcelizer;
            if (!((getAccessibilityManager) this.read).MediaMetadataCompat.write(i).RemoteActionCompatParcelizer.serializer(visitnodes)) {
                getcoroutinecontext.RemoteActionCompatParcelizer = true;
                map.remove(visitnodes);
            } else {
                int i3 = MediaMetadataCompat + 29;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                nodeRemoved noderemoved = nodeRemoved.REMOVED;
                getcoroutinecontext.RemoteActionCompatParcelizer = true;
                map.put(visitnodes, noderemoved);
            }
            Set hashSet = (Set) ((HashMap) this.write).get(visitnodes);
            if (hashSet == null) {
                hashSet = new HashSet();
                ((HashMap) this.write).put(visitnodes, hashSet);
            }
            hashSet.add(Integer.valueOf(i));
            if (nodeCoordinatorCompanionPointerInputSource1 != null) {
                int i5 = MediaDescriptionCompat + 63;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    ((HashMap) this.RatingCompat).put(visitnodes, nodeCoordinatorCompanionPointerInputSource1);
                    throw null;
                }
                ((HashMap) this.RatingCompat).put(visitnodes, nodeCoordinatorCompanionPointerInputSource1);
            }
        }
        int i6 = MediaMetadataCompat + 41;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public void IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        HashMap map = (HashMap) this.serializer;
        getRectManager.RemoteActionCompatParcelizer(map.get(Integer.valueOf(i)) != null && ((getCoroutineContext) map.get(Integer.valueOf(i))).serializer == 0, "Should only reset active targets", new Object[0]);
        map.put(Integer.valueOf(i), new getCoroutineContext());
        Iterator it = ((getAccessibilityManager) this.read).MediaMetadataCompat.write(i).iterator();
        while (true) {
            zzkh zzkhVar = (zzkh) it;
            if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                int i3 = MediaMetadataCompat + 115;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            } else {
                int i5 = MediaMetadataCompat + 109;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                serializer(i, (visitNodes) zzkhVar.next(), null);
            }
        }
    }

    public void read(r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo) {
        int i = 2 % 2;
        setResourcePackageNamelambda0 setresourcepackagenamelambda0IconCompatParcelizer = r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo.read.IconCompatParcelizer();
        onEndApplyChanges.read("GrpcCallProvider", "Current gRPC connectivity state: " + setresourcepackagenamelambda0IconCompatParcelizer, new Object[0]);
        if (((x) this.write) != null) {
            int i2 = MediaMetadataCompat + 5;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onEndApplyChanges.read("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            ((x) this.write).cancel();
            this.write = null;
            int i4 = MediaDescriptionCompat + 121;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (setresourcepackagenamelambda0IconCompatParcelizer == setResourcePackageNamelambda0.CONNECTING) {
            onEndApplyChanges.read("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.write = ((getTextInputService) this.serializer).serializer(incrementSensitiveComponentCount.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new getFontLoaderannotations(this, r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo, 1));
        }
        r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo.IconCompatParcelizer(setresourcepackagenamelambda0IconCompatParcelizer, new getFontLoaderannotations(this, r8lambdayt7kkhvxypx5qc1jtjtr5ifnrzo, 2));
        int i6 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 60 / 0;
        }
    }

    public void clear() {
        int i = 2 % 2;
        ViewAnnotationManager viewAnnotationManager = (ViewAnnotationManager) this.read;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int i2 = MediaMetadataCompat + 77;
                    MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        viewAnnotationManager.removeViewAnnotation((View) it2.next());
                        obj.hashCode();
                        throw null;
                    }
                    viewAnnotationManager.removeViewAnnotation((View) it2.next());
                }
                viewAnnotationManager.setViewAnnotationAvoidLayers(new HashSet<>(RangesKt.RemoteActionCompatParcelizer((Set) viewAnnotationManager.getViewAnnotationAvoidLayers(), (Iterable) linkedHashSet)));
                linkedHashSet.clear();
                return;
            }
            AnnotatedLayerFeature annotatedLayerFeatureBuild = new AnnotatedLayerFeature.Builder().layerId((String) it.next()).build();
            annotatedLayerFeatureBuild.getClass();
            View viewAnnotation = viewAnnotationManager.getViewAnnotation(annotatedLayerFeatureBuild);
            if (viewAnnotation != null) {
                int i3 = MediaMetadataCompat + 59;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    arrayList.add(viewAnnotation);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(viewAnnotation);
            }
        }
    }

    public mapToBase RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.write;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer((getSearchViewTextMinWidthDp) this.RatingCompat, size);
        int i2 = 1;
        useCaseAdditionSimulatorIconCompatParcelizer.serializer.MediaMetadataCompat = 1;
        Camera2CameraFactory camera2CameraFactory = new Camera2CameraFactory(surface);
        this.read = camera2CameraFactory;
        DrawModifierNodeKt drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) camera2CameraFactory.ParcelableVolumeInfo);
        colorResource colorresource = new colorResource(surface, surfaceTexture, false, 3);
        drawModifierNodeKtWrite.RemoteActionCompatParcelizer(new zza(drawModifierNodeKtWrite, i2, colorresource), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        useCaseAdditionSimulatorIconCompatParcelizer.serializer((Camera2CameraFactory) this.read, getNavigationIcon.MediaDescriptionCompat, -1);
        InterruptedRuntimeException interruptedRuntimeException = (InterruptedRuntimeException) this.IconCompatParcelizer;
        if (interruptedRuntimeException != null) {
            int i3 = MediaDescriptionCompat + 1;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                interruptedRuntimeException.write();
            } else {
                interruptedRuntimeException.write();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        InterruptedRuntimeException interruptedRuntimeException2 = new InterruptedRuntimeException(new BiometricFragmentExternalSyntheticLambda1(i2, this));
        this.IconCompatParcelizer = interruptedRuntimeException2;
        useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer = interruptedRuntimeException2;
        return useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        AccountCreationFragment accountCreationFragment = (AccountCreationFragment) obj;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.read;
        accountCreationFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
        accountCreationFragment.getNavigationEventDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((sendAttributionRequestI) this.serializer);
        accountCreationFragment.initializeViewTreeOwners = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((setIsRecyclable) this.RatingCompat);
        accountCreationFragment.invalidateMenu = getColorIntegerOrNull.serializer((mergeJsonObjects) this.write);
        accountCreationFragment.onConfigurationChanged = getColorIntegerOrNull.serializer((mergeJsonObjects) this.RemoteActionCompatParcelizer);
        accountCreationFragment.getSavedStateRegistry = new AndroidUiFrameClock(new accessisMainThread());
        int iIconCompatParcelizer = n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
        accountCreationFragment.onPreparePanel = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2);
        accountCreationFragment.onMultiWindowModeChanged = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        int iIconCompatParcelizer3 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer4 = n5.IconCompatParcelizer();
        accountCreationFragment.onActivityResult = new FormBody.Builder(transfersessionpackagei, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer3, n5.IconCompatParcelizer(), iIconCompatParcelizer4));
        accountCreationFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((publishErrorlambda1) this.IconCompatParcelizer);
        int i2 = MediaDescriptionCompat + 5;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    public /* synthetic */ BlockRunner(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.read = obj;
        this.serializer = obj2;
        this.RatingCompat = obj3;
        this.write = obj4;
        this.RemoteActionCompatParcelizer = obj5;
        this.IconCompatParcelizer = obj6;
    }

    public BlockRunner(RouterInterface routerInterface, ThreadController threadController, ParsingEntryPoint parsingEntryPoint, ParsingEntryPoint parsingEntryPoint2) {
        threadController.getClass();
        this.read = threadController;
        this.serializer = parsingEntryPoint;
        this.RatingCompat = new LinkedHashMap();
        this.write = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new SearchOptionsKt$validateLimit$1(9, this));
        this.IconCompatParcelizer = new AtomicReference(routerInterface);
    }

    public BlockRunner(String str, String str2, String str3, LinkedHashMap linkedHashMap, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str3.getClass();
        this.read = str;
        this.serializer = str2;
        this.RatingCompat = str3;
        this.write = linkedHashMap;
        this.RemoteActionCompatParcelizer = arrayList;
        this.IconCompatParcelizer = arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r9
  0x00a4: PHI (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v7 java.lang.Object) binds: [B:32:0x00a1, B:29:0x008e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m3949invokegIAlus(BiometricsActivity biometricsActivity, ContinuationImpl continuationImpl) {
        LaunchBiometricsDecryptionUseCase$invoke$1 launchBiometricsDecryptionUseCase$invoke$1;
        Object objM3946decryptAndGetPasswordBWLJW6A;
        int i = 2 % 2;
        if (continuationImpl instanceof LaunchBiometricsDecryptionUseCase$invoke$1) {
            launchBiometricsDecryptionUseCase$invoke$1 = (LaunchBiometricsDecryptionUseCase$invoke$1) continuationImpl;
            int i2 = launchBiometricsDecryptionUseCase$invoke$1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 47;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    launchBiometricsDecryptionUseCase$invoke$1.read = i2 >>> Integer.MIN_VALUE;
                } else {
                    launchBiometricsDecryptionUseCase$invoke$1.read = i2 - Integer.MIN_VALUE;
                }
            } else {
                launchBiometricsDecryptionUseCase$invoke$1 = new LaunchBiometricsDecryptionUseCase$invoke$1(this, continuationImpl);
                int i4 = MediaDescriptionCompat + 85;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            launchBiometricsDecryptionUseCase$invoke$1 = new LaunchBiometricsDecryptionUseCase$invoke$1(this, continuationImpl);
            int i6 = MediaDescriptionCompat + 85;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Object obj = launchBiometricsDecryptionUseCase$invoke$1.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = launchBiometricsDecryptionUseCase$invoke$1.read;
        if (i8 != 0) {
            int i9 = MediaDescriptionCompat + 107;
            MediaMetadataCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0 ? i8 != 1 : i8 != 1) {
                if (i8 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        setTextSubstitution settextsubstitutionWrite = ((setTextSubstitutiondefault) this.serializer).write();
        setTraversalIndex settraversalindex = settextsubstitutionWrite.serializer;
        setTextSelectionRangeFDrldGo settextselectionrangefdrldgo = settraversalindex.IconCompatParcelizer;
        setTextSelectionRangeFDrldGo settextselectionrangefdrldgo2 = setTextSelectionRangeFDrldGo.AVAILABLE;
        if (settextselectionrangefdrldgo == settextselectionrangefdrldgo2) {
            int i10 = MediaMetadataCompat + 93;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                setToggleableState settoggleablestate = (setToggleableState) onContentCardDismissed.read(settraversalindex.read);
                launchBiometricsDecryptionUseCase$invoke$1.read = 0;
                objM3946decryptAndGetPasswordBWLJW6A = m3946decryptAndGetPasswordBWLJW6A(settoggleablestate, 20, biometricsActivity, launchBiometricsDecryptionUseCase$invoke$1);
                if (objM3946decryptAndGetPasswordBWLJW6A != obj2) {
                    return objM3946decryptAndGetPasswordBWLJW6A;
                }
            } else {
                setToggleableState settoggleablestate2 = (setToggleableState) onContentCardDismissed.read(settraversalindex.read);
                launchBiometricsDecryptionUseCase$invoke$1.read = 1;
                objM3946decryptAndGetPasswordBWLJW6A = m3946decryptAndGetPasswordBWLJW6A(settoggleablestate2, 15, biometricsActivity, launchBiometricsDecryptionUseCase$invoke$1);
                if (objM3946decryptAndGetPasswordBWLJW6A != obj2) {
                    return objM3946decryptAndGetPasswordBWLJW6A;
                }
            }
        } else {
            setTraversalIndex settraversalindex2 = settextsubstitutionWrite.RemoteActionCompatParcelizer;
            if (settraversalindex2.IconCompatParcelizer != settextselectionrangefdrldgo2) {
                ((setShowingTextSubstitution) this.read).serializer("None", "DECRYPTION", "Biometrics not available");
                return new isItemDismissable(new getTestTagsAsResourceIddelegate(null));
            }
            setToggleableState settoggleablestate3 = (setToggleableState) onContentCardDismissed.read(settraversalindex2.read);
            launchBiometricsDecryptionUseCase$invoke$1.read = 2;
            Object objM3946decryptAndGetPasswordBWLJW6A2 = m3946decryptAndGetPasswordBWLJW6A(settoggleablestate3, 255, biometricsActivity, launchBiometricsDecryptionUseCase$invoke$1);
            if (objM3946decryptAndGetPasswordBWLJW6A2 != obj2) {
                int i11 = MediaMetadataCompat + 85;
                MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    return objM3946decryptAndGetPasswordBWLJW6A2;
                }
                throw null;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m3950invokegIAlus(LocalDate localDate, ContinuationImpl continuationImpl) {
        FetchHistoryUseCase$invoke$1 fetchHistoryUseCase$invoke$1;
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof FetchHistoryUseCase$invoke$1) {
            int i2 = MediaMetadataCompat + 87;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((FetchHistoryUseCase$invoke$1) continuationImpl).IconCompatParcelizer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            fetchHistoryUseCase$invoke$1 = (FetchHistoryUseCase$invoke$1) continuationImpl;
            int i4 = fetchHistoryUseCase$invoke$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fetchHistoryUseCase$invoke$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                fetchHistoryUseCase$invoke$1 = new FetchHistoryUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchHistoryUseCase$invoke$1 = new FetchHistoryUseCase$invoke$1(this, continuationImpl);
        }
        Object objWithContext = fetchHistoryUseCase$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = fetchHistoryUseCase$invoke$1.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.IconCompatParcelizer)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$1 = new PushEventPublisherImpl$emit$1(this, localDate, shortNewsContentCardView, 27);
            fetchHistoryUseCase$invoke$1.IconCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, pushEventPublisherImpl$emit$1, fetchHistoryUseCase$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i6 = MediaMetadataCompat + 29;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return coroutineSingletons;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[Catch: all -> 0x00ac, setAccessibilityClassName -> 0x00d8, getAccessibilityClassNamedelegate -> 0x00ee, TryCatch #2 {getAccessibilityClassNamedelegate -> 0x00ee, setAccessibilityClassName -> 0x00d8, all -> 0x00ac, blocks: (B:18:0x005b, B:23:0x0069, B:29:0x0085, B:31:0x0096, B:35:0x00a4, B:36:0x00ab, B:26:0x0070), top: B:56:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: all -> 0x00ac, setAccessibilityClassName -> 0x00d8, getAccessibilityClassNamedelegate -> 0x00ee, TryCatch #2 {getAccessibilityClassNamedelegate -> 0x00ee, setAccessibilityClassName -> 0x00d8, all -> 0x00ac, blocks: (B:18:0x005b, B:23:0x0069, B:29:0x0085, B:31:0x0096, B:35:0x00a4, B:36:0x00ab, B:26:0x0070), top: B:56:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r1
  0x0023: PHI (r1v6 o.setShowingTextSubstitution) = (r1v5 o.setShowingTextSubstitution), (r1v10 o.setShowingTextSubstitution) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: decryptAndGetPassword-BWLJW6A, reason: not valid java name */
    public Object m3946decryptAndGetPasswordBWLJW6A(setToggleableState settoggleablestate, int i, FragmentActivity fragmentActivity, ContinuationImpl continuationImpl) {
        setShowingTextSubstitution setshowingtextsubstitution;
        LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1 launchBiometricsDecryptionUseCase$decryptAndGetPassword$1;
        int i2;
        Object objInvoke;
        CoroutineSingletons coroutineSingletons;
        int i3;
        H$b h$b;
        Cipher cipher;
        Object objInvoke2;
        int i4 = 2 % 2;
        int i5 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        try {
            if (i5 % 2 == 0) {
                setshowingtextsubstitution = (setShowingTextSubstitution) this.read;
                if (continuationImpl instanceof LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1) {
                    launchBiometricsDecryptionUseCase$decryptAndGetPassword$1 = (LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1) continuationImpl;
                    i2 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        int i6 = MediaDescriptionCompat + 9;
                        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = i2 - Integer.MIN_VALUE;
                    }
                }
                objInvoke = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.write;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read;
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) this.RatingCompat;
                    SignInDataStore signInDataStore = (SignInDataStore) this.write;
                    launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer = settoggleablestate;
                    launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer = i;
                    launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = 1;
                    objInvoke = analyticsServiceImpl.invoke(fragmentActivity, i, signInDataStore, launchBiometricsDecryptionUseCase$decryptAndGetPassword$1);
                    if (objInvoke == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    setToggleableState settoggleablestate2 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                    return objInvoke;
                }
                i = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer;
                settoggleablestate = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                setshowingtextsubstitution.serializer(settoggleablestate.getType(), "DECRYPTION");
                h$b = (H$b) this.RemoteActionCompatParcelizer;
                cipher = ((getPopupContext) objInvoke).serializer;
                if (cipher == null) {
                    throw new IllegalArgumentException("Crypto object should not be null at the time of decryption.");
                }
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer = settoggleablestate;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer = i;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = 2;
                objInvoke2 = h$b.invoke(cipher, launchBiometricsDecryptionUseCase$decryptAndGetPassword$1);
                if (objInvoke2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objInvoke2;
            }
            setshowingtextsubstitution = (setShowingTextSubstitution) this.read;
            int i8 = 63 / 0;
            if (continuationImpl instanceof LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1) {
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1 = (LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1) continuationImpl;
                i2 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    int i9 = MediaDescriptionCompat + 9;
                    MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = i2 - Integer.MIN_VALUE;
                }
            }
            objInvoke = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.write;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i3 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                AnalyticsServiceImpl analyticsServiceImpl2 = (AnalyticsServiceImpl) this.RatingCompat;
                SignInDataStore signInDataStore2 = (SignInDataStore) this.write;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer = settoggleablestate;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer = i;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = 1;
                objInvoke = analyticsServiceImpl2.invoke(fragmentActivity, i, signInDataStore2, launchBiometricsDecryptionUseCase$decryptAndGetPassword$1);
                if (objInvoke == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                setToggleableState settoggleablestate3 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return objInvoke;
            }
            i = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer;
            settoggleablestate = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            setshowingtextsubstitution.serializer(settoggleablestate.getType(), "DECRYPTION");
            h$b = (H$b) this.RemoteActionCompatParcelizer;
            cipher = ((getPopupContext) objInvoke).serializer;
            if (cipher == null) {
                throw new IllegalArgumentException("Crypto object should not be null at the time of decryption.");
            }
            launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer = settoggleablestate;
            launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer = i;
            launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = 2;
            objInvoke2 = h$b.invoke(cipher, launchBiometricsDecryptionUseCase$decryptAndGetPassword$1);
            if (objInvoke2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objInvoke2;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                AnalyticsServiceImpl analyticsServiceImpl3 = (AnalyticsServiceImpl) this.RatingCompat;
                SignInDataStore signInDataStore3 = (SignInDataStore) this.write;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer = settoggleablestate;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer = i;
                launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = 1;
                objInvoke = analyticsServiceImpl3.invoke(fragmentActivity, i, signInDataStore3, launchBiometricsDecryptionUseCase$decryptAndGetPassword$1);
                if (objInvoke == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                setToggleableState settoggleablestate4 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return objInvoke;
            }
            i = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer;
            settoggleablestate = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            setshowingtextsubstitution.serializer(settoggleablestate.getType(), "DECRYPTION");
            h$b = (H$b) this.RemoteActionCompatParcelizer;
            cipher = ((getPopupContext) objInvoke).serializer;
            if (cipher == null) {
                throw new IllegalArgumentException("Crypto object should not be null at the time of decryption.");
            }
            launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.serializer = settoggleablestate;
            launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.RemoteActionCompatParcelizer = i;
            launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read = 2;
            objInvoke2 = h$b.invoke(cipher, launchBiometricsDecryptionUseCase$decryptAndGetPassword$1);
            if (objInvoke2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objInvoke2;
        } catch (getAccessibilityClassNamedelegate e) {
            String type = settoggleablestate.getType();
            String message = e.getMessage();
            if (message == null) {
                message = "BiometricUserCancellationException when decrypting";
            }
            setshowingtextsubstitution.serializer(type, "DECRYPTION", message);
            return new isItemDismissable(e);
        } catch (setAccessibilityClassName e2) {
            String type2 = settoggleablestate.getType();
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = "BiometricTooManyAttemptsException when decrypting";
            }
            setshowingtextsubstitution.serializer(type2, "DECRYPTION", message2);
            return new isItemDismissable(e2);
        } catch (Throwable th) {
            String type3 = settoggleablestate.getType();
            String message3 = th.getMessage();
            if (message3 == null) {
                int i11 = MediaDescriptionCompat + 19;
                MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    throw null;
                }
                message3 = "Failed when decrypting password";
            }
            setshowingtextsubstitution.serializer(type3, "DECRYPTION", message3);
            ((setTraversalGroup) ((setSensitiveData) this.IconCompatParcelizer)).IconCompatParcelizer();
            return new isItemDismissable(th);
        }
        launchBiometricsDecryptionUseCase$decryptAndGetPassword$1 = new LaunchBiometricsDecryptionUseCase$decryptAndGetPassword$1(this, continuationImpl);
        int i12 = MediaMetadataCompat + 53;
        MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        objInvoke = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = launchBiometricsDecryptionUseCase$decryptAndGetPassword$1.read;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    public void read(getInflatedId getinflatedid) {
        boolean z;
        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk;
        int i = 2 % 2;
        PrematureEndOfStreamVideoQuirk.write();
        if (((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read) == null) {
            setInflatedId.read("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + getinflatedid);
            getinflatedid.close();
            return;
        }
        if (((Integer) getinflatedid.read().IconCompatParcelizer().IconCompatParcelizer.get(((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read).MediaSessionCompatToken)) == null) {
            setInflatedId.read("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            getinflatedid.close();
            return;
        }
        PrematureEndOfStreamVideoQuirk.write();
        CaptureSessionShouldUseMrirQuirk captureSessionShouldUseMrirQuirk = (CaptureSessionShouldUseMrirQuirk) this.write;
        Objects.requireNonNull(captureSessionShouldUseMrirQuirk);
        captureSessionShouldUseMrirQuirk.serializer.accept(new CaptureSessionStuckQuirk((ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read, getinflatedid));
        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read;
        ConfigureSurfaceToSecondarySessionFailQuirk configureSurfaceToSecondarySessionFailQuirk = (ConfigureSurfaceToSecondarySessionFailQuirk) this.RemoteActionCompatParcelizer;
        if (configureSurfaceToSecondarySessionFailQuirk == null || configureSurfaceToSecondarySessionFailQuirk.MediaBrowserCompatMediaItem.size() <= 1) {
            int i2 = MediaDescriptionCompat + 71;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = false;
        } else {
            z = true;
        }
        if (z && (imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read) != null) {
            int i4 = MediaDescriptionCompat + 95;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaSessionCompatResultReceiverWrapper.read(getinflatedid.write());
            int i6 = MediaDescriptionCompat + 111;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        if (z) {
            ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk3 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read;
            if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk3 != null) {
                int i8 = MediaMetadataCompat + 79;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 2 / 0;
                    if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk3.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                        this.read = null;
                    }
                } else if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk3.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer()) {
                    this.read = null;
                }
            }
        } else {
            this.read = null;
        }
        ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.write;
        int i10 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.serializer;
        if (i10 != -1 && i10 != 100) {
            imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.serializer = 100;
            PrematureEndOfStreamVideoQuirk.write();
            if (!imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat;
                extraSupportedOutputSizeQuirk.IconCompatParcelizer.execute(new pNP$$ExternalSyntheticLambda0(3, extraSupportedOutputSizeQuirk));
            }
        }
        PrematureEndOfStreamVideoQuirk.write();
        if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
            return;
        }
        if (!imageCaptureFailWithAutoFlashQuirk.RatingCompat) {
            PrematureEndOfStreamVideoQuirk.write();
            if (!imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                int i11 = MediaDescriptionCompat + 71;
                MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (!imageCaptureFailWithAutoFlashQuirk.RatingCompat) {
                    imageCaptureFailWithAutoFlashQuirk.RatingCompat = true;
                }
            }
        }
        imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX INFO: renamed from: invoke-BWLJW6A, reason: not valid java name */
    public Object m3948invokeBWLJW6A(boolean z, RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2, ContinuationImpl continuationImpl) {
        UploadLivenessSelfieUseCase$invoke$1 uploadLivenessSelfieUseCase$invoke$1;
        RoomDatabaseperformClear11 roomDatabaseperformClear12;
        boolean z2;
        RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda3;
        Object objM4984invokeIoAF18A;
        RoomDatabaseperformClear11 roomDatabaseperformClear13;
        boolean z3;
        r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri;
        Object objInvoke;
        r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczri2;
        boolean z4;
        RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda4;
        Object objM4505uploadImagebMdYcbs;
        int i = 2 % 2;
        accessstartTrackingTable accessstarttrackingtable = (accessstartTrackingTable) this.IconCompatParcelizer;
        if (continuationImpl instanceof UploadLivenessSelfieUseCase$invoke$1) {
            uploadLivenessSelfieUseCase$invoke$1 = (UploadLivenessSelfieUseCase$invoke$1) continuationImpl;
            int i2 = uploadLivenessSelfieUseCase$invoke$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaDescriptionCompat + 83;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                uploadLivenessSelfieUseCase$invoke$1.write = i2 - Integer.MIN_VALUE;
            } else {
                uploadLivenessSelfieUseCase$invoke$1 = new UploadLivenessSelfieUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            uploadLivenessSelfieUseCase$invoke$1 = new UploadLivenessSelfieUseCase$invoke$1(this, continuationImpl);
        }
        UploadLivenessSelfieUseCase$invoke$1 uploadLivenessSelfieUseCase$invoke$2 = uploadLivenessSelfieUseCase$invoke$1;
        Object objInvoke2 = uploadLivenessSelfieUseCase$invoke$2.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = uploadLivenessSelfieUseCase$invoke$2.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke2);
            DoesAccessTokenExistUseCaseImpl doesAccessTokenExistUseCaseImpl = (DoesAccessTokenExistUseCaseImpl) this.write;
            roomDatabaseperformClear12 = roomDatabaseperformClear11;
            uploadLivenessSelfieUseCase$invoke$2.serializer = roomDatabaseperformClear12;
            uploadLivenessSelfieUseCase$invoke$2.read = roomDatabaseExternalSyntheticLambda2;
            z2 = z;
            uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer = z2;
            uploadLivenessSelfieUseCase$invoke$2.write = 1;
            objInvoke2 = doesAccessTokenExistUseCaseImpl.invoke(uploadLivenessSelfieUseCase$invoke$2);
            if (objInvoke2 != coroutineSingletons) {
                roomDatabaseExternalSyntheticLambda3 = roomDatabaseExternalSyntheticLambda2;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            boolean z5 = uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer;
            roomDatabaseExternalSyntheticLambda3 = uploadLivenessSelfieUseCase$invoke$2.read;
            RoomDatabaseperformClear11 roomDatabaseperformClear14 = uploadLivenessSelfieUseCase$invoke$2.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke2);
            z2 = z5;
            roomDatabaseperformClear12 = roomDatabaseperformClear14;
        } else {
            if (i5 == 2) {
                z3 = uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer;
                roomDatabaseExternalSyntheticLambda3 = uploadLivenessSelfieUseCase$invoke$2.read;
                roomDatabaseperformClear13 = uploadLivenessSelfieUseCase$invoke$2.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke2);
                objM4984invokeIoAF18A = ((onItemDismiss) objInvoke2).IconCompatParcelizer;
                if (objM4984invokeIoAF18A instanceof isItemDismissable) {
                    int i6 = MediaDescriptionCompat + 33;
                    MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return ExtrasKt.IconCompatParcelizer(accessstarttrackingtable);
                }
                ExtrasKt.RemoteActionCompatParcelizer(objM4984invokeIoAF18A);
                r8lambdacteglfiy2n5eeyl50py32ciczri = (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) objM4984invokeIoAF18A;
                GetUserDataUseCaseImpl getUserDataUseCaseImpl = (GetUserDataUseCaseImpl) this.RemoteActionCompatParcelizer;
                uploadLivenessSelfieUseCase$invoke$2.serializer = roomDatabaseperformClear13;
                uploadLivenessSelfieUseCase$invoke$2.read = roomDatabaseExternalSyntheticLambda3;
                uploadLivenessSelfieUseCase$invoke$2.RemoteActionCompatParcelizer = r8lambdacteglfiy2n5eeyl50py32ciczri;
                uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer = z3;
                uploadLivenessSelfieUseCase$invoke$2.write = 3;
                objInvoke = getUserDataUseCaseImpl.invoke(uploadLivenessSelfieUseCase$invoke$2);
                if (objInvoke != coroutineSingletons) {
                    r8lambdacteglfiy2n5eeyl50py32ciczri2 = r8lambdacteglfiy2n5eeyl50py32ciczri;
                    objInvoke2 = objInvoke;
                    z4 = z3;
                    roomDatabaseExternalSyntheticLambda4 = roomDatabaseExternalSyntheticLambda3;
                }
                return coroutineSingletons;
            }
            if (i5 != 3) {
                if (i5 == 4) {
                    ExtrasKt.RemoteActionCompatParcelizer(objInvoke2);
                    return ((onItemDismiss) objInvoke2).IconCompatParcelizer;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer;
            r8lambdacteglfiy2n5eeyl50py32ciczri2 = uploadLivenessSelfieUseCase$invoke$2.RemoteActionCompatParcelizer;
            RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda5 = uploadLivenessSelfieUseCase$invoke$2.read;
            RoomDatabaseperformClear11 roomDatabaseperformClear15 = uploadLivenessSelfieUseCase$invoke$2.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke2);
            roomDatabaseExternalSyntheticLambda4 = roomDatabaseExternalSyntheticLambda5;
            roomDatabaseperformClear13 = roomDatabaseperformClear15;
        }
        getTextSelectionRange gettextselectionrange = (getTextSelectionRange) objInvoke2;
        m mVar = (m) this.RatingCompat;
        String str = gettextselectionrange.ParcelableVolumeInfo;
        String str2 = gettextselectionrange.MediaBrowserCompatMediaItem;
        uploadLivenessSelfieUseCase$invoke$2.serializer = null;
        uploadLivenessSelfieUseCase$invoke$2.read = null;
        uploadLivenessSelfieUseCase$invoke$2.RemoteActionCompatParcelizer = null;
        uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer = z4;
        uploadLivenessSelfieUseCase$invoke$2.write = 4;
        objM4505uploadImagebMdYcbs = mVar.m4505uploadImagebMdYcbs(r8lambdacteglfiy2n5eeyl50py32ciczri2, str2, str, z4, roomDatabaseperformClear13, roomDatabaseExternalSyntheticLambda4, uploadLivenessSelfieUseCase$invoke$2);
        if (objM4505uploadImagebMdYcbs != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objM4505uploadImagebMdYcbs;
        if (!((Boolean) objInvoke2).booleanValue()) {
            int i8 = MediaMetadataCompat + 121;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return ExtrasKt.IconCompatParcelizer(accessstarttrackingtable);
            }
            ExtrasKt.IconCompatParcelizer(accessstarttrackingtable);
            throw null;
        }
        CameraImage cameraImageRemoteActionCompatParcelizer = ((setDistanceToTriggerSync) this.read).IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (cameraImageRemoteActionCompatParcelizer == null) {
            int i9 = MediaDescriptionCompat + 47;
            MediaMetadataCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 5 / 5;
            }
        } else if (cameraImageRemoteActionCompatParcelizer.IconCompatParcelizer) {
            CreateMultipartForLivenessUploadImpl createMultipartForLivenessUploadImpl = (CreateMultipartForLivenessUploadImpl) this.serializer;
            uploadLivenessSelfieUseCase$invoke$2.serializer = roomDatabaseperformClear12;
            uploadLivenessSelfieUseCase$invoke$2.read = roomDatabaseExternalSyntheticLambda3;
            uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer = z2;
            uploadLivenessSelfieUseCase$invoke$2.write = 2;
            objM4984invokeIoAF18A = createMultipartForLivenessUploadImpl.m4984invokeIoAF18A(uploadLivenessSelfieUseCase$invoke$2);
            if (objM4984invokeIoAF18A != coroutineSingletons) {
                roomDatabaseperformClear13 = roomDatabaseperformClear12;
                z3 = z2;
                if (objM4984invokeIoAF18A instanceof isItemDismissable) {
                    int i11 = MediaDescriptionCompat + 33;
                    MediaMetadataCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return ExtrasKt.IconCompatParcelizer(accessstarttrackingtable);
                }
                ExtrasKt.RemoteActionCompatParcelizer(objM4984invokeIoAF18A);
                r8lambdacteglfiy2n5eeyl50py32ciczri = (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI) objM4984invokeIoAF18A;
                GetUserDataUseCaseImpl getUserDataUseCaseImpl2 = (GetUserDataUseCaseImpl) this.RemoteActionCompatParcelizer;
                uploadLivenessSelfieUseCase$invoke$2.serializer = roomDatabaseperformClear13;
                uploadLivenessSelfieUseCase$invoke$2.read = roomDatabaseExternalSyntheticLambda3;
                uploadLivenessSelfieUseCase$invoke$2.RemoteActionCompatParcelizer = r8lambdacteglfiy2n5eeyl50py32ciczri;
                uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer = z3;
                uploadLivenessSelfieUseCase$invoke$2.write = 3;
                objInvoke = getUserDataUseCaseImpl2.invoke(uploadLivenessSelfieUseCase$invoke$2);
                if (objInvoke != coroutineSingletons) {
                    r8lambdacteglfiy2n5eeyl50py32ciczri2 = r8lambdacteglfiy2n5eeyl50py32ciczri;
                    objInvoke2 = objInvoke;
                    z4 = z3;
                    roomDatabaseExternalSyntheticLambda4 = roomDatabaseExternalSyntheticLambda3;
                    getTextSelectionRange gettextselectionrange2 = (getTextSelectionRange) objInvoke2;
                    m mVar2 = (m) this.RatingCompat;
                    String str3 = gettextselectionrange2.ParcelableVolumeInfo;
                    String str4 = gettextselectionrange2.MediaBrowserCompatMediaItem;
                    uploadLivenessSelfieUseCase$invoke$2.serializer = null;
                    uploadLivenessSelfieUseCase$invoke$2.read = null;
                    uploadLivenessSelfieUseCase$invoke$2.RemoteActionCompatParcelizer = null;
                    uploadLivenessSelfieUseCase$invoke$2.IconCompatParcelizer = z4;
                    uploadLivenessSelfieUseCase$invoke$2.write = 4;
                    objM4505uploadImagebMdYcbs = mVar2.m4505uploadImagebMdYcbs(r8lambdacteglfiy2n5eeyl50py32ciczri2, str4, str3, z4, roomDatabaseperformClear13, roomDatabaseExternalSyntheticLambda4, uploadLivenessSelfieUseCase$invoke$2);
                    if (objM4505uploadImagebMdYcbs != coroutineSingletons) {
                        return objM4505uploadImagebMdYcbs;
                    }
                }
            }
            return coroutineSingletons;
        }
        Timber.RemoteActionCompatParcelizer.write(new Throwable("Failed image is not available in liveness"));
        return ExtrasKt.IconCompatParcelizer(accessstarttrackingtable);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0037  */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    public Object m3947invoke0E7RQCE(String str, boolean z, ContinuationImpl continuationImpl) {
        ResetPasswordUseCase$invoke$1 resetPasswordUseCase$invoke$1;
        String str2;
        String str3;
        Object obj;
        Object obj2;
        boolean z2;
        Object obj3;
        boolean z3;
        Throwable thSerializer;
        Throwable thSerializer2;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 27;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Path$Companion path$Companion = (Path$Companion) this.RemoteActionCompatParcelizer;
        SignInDataStore signInDataStore = (SignInDataStore) this.read;
        BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = (BrazeExternalSyntheticLambda5) this.RatingCompat;
        OtpLogger otpLogger = (OtpLogger) this.write;
        if (continuationImpl instanceof ResetPasswordUseCase$invoke$1) {
            resetPasswordUseCase$invoke$1 = (ResetPasswordUseCase$invoke$1) continuationImpl;
            int i4 = resetPasswordUseCase$invoke$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                resetPasswordUseCase$invoke$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                resetPasswordUseCase$invoke$1 = new ResetPasswordUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            resetPasswordUseCase$invoke$1 = new ResetPasswordUseCase$invoke$1(this, continuationImpl);
        }
        Object obj4 = resetPasswordUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = resetPasswordUseCase$invoke$1.serializer;
        if (i5 != 0) {
            if (i5 == 1) {
                z3 = resetPasswordUseCase$invoke$1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                obj3 = ((onItemDismiss) obj4).IconCompatParcelizer;
                if (!(obj3 instanceof isItemDismissable)) {
                    otpLogger.RemoteActionCompatParcelizer(Transacter.SMS, z3);
                }
                thSerializer = onItemDismiss.serializer(obj3);
                if (thSerializer != null) {
                    path$Companion.getClass();
                    otpLogger.read(Path$Companion.serializer(thSerializer).write, Transacter.SMS, z3);
                }
                return obj3;
            }
            int i6 = MediaDescriptionCompat + 117;
            int i7 = i6 % Fields.SpotShadowColor;
            MediaMetadataCompat = i7;
            if (i6 % 2 == 0 ? i5 == 2 : i5 == 2) {
                z2 = resetPasswordUseCase$invoke$1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                obj2 = ((onItemDismiss) obj4).IconCompatParcelizer;
                if (!(obj2 instanceof isItemDismissable)) {
                    otpLogger.RemoteActionCompatParcelizer(Transacter.EMAIL, z2);
                }
                thSerializer2 = onItemDismiss.serializer(obj2);
                if (thSerializer2 != null) {
                    int i8 = MediaMetadataCompat + 111;
                    MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    path$Companion.getClass();
                    otpLogger.read(Path$Companion.serializer(thSerializer2).write, Transacter.EMAIL, z2);
                }
                return obj2;
            }
            if (i5 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i7 + 69;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                str3 = resetPasswordUseCase$invoke$1.write;
                str2 = resetPasswordUseCase$invoke$1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                obj = ((onItemDismiss) obj4).IconCompatParcelizer;
                int i11 = 1 / 0;
            } else {
                str3 = resetPasswordUseCase$invoke$1.write;
                str2 = resetPasswordUseCase$invoke$1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                obj = ((onItemDismiss) obj4).IconCompatParcelizer;
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("userName:{", str2, "}; countryCode:{", str3, "}; result:{"), onItemDismiss.write(obj), "}"), new Object[0]);
            return obj;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj4);
        String str4 = ((boundingRectInRoot) this.serializer).write().countryCode;
        brazeExternalSyntheticLambda5.getClass();
        if (BrazeExternalSyntheticLambda5.RemoteActionCompatParcelizer(str)) {
            getPendingTablesruntime getpendingtablesruntime = new getPendingTablesruntime(null, ((QueryResultCompanion) this.IconCompatParcelizer).IconCompatParcelizer(str), str4);
            resetPasswordUseCase$invoke$1.IconCompatParcelizer = null;
            resetPasswordUseCase$invoke$1.write = null;
            resetPasswordUseCase$invoke$1.RemoteActionCompatParcelizer = z;
            resetPasswordUseCase$invoke$1.serializer = 1;
            Object objM4864forgotPasswordgIAlus = signInDataStore.m4864forgotPasswordgIAlus(getpendingtablesruntime, resetPasswordUseCase$invoke$1);
            if (objM4864forgotPasswordgIAlus != coroutineSingletons) {
                obj3 = objM4864forgotPasswordgIAlus;
                z3 = z;
                if (!(obj3 instanceof isItemDismissable)) {
                    otpLogger.RemoteActionCompatParcelizer(Transacter.SMS, z3);
                }
                thSerializer = onItemDismiss.serializer(obj3);
                if (thSerializer != null) {
                    path$Companion.getClass();
                    otpLogger.read(Path$Companion.serializer(thSerializer).write, Transacter.SMS, z3);
                }
                return obj3;
            }
        } else if (BrazeExternalSyntheticLambda5.serializer(str)) {
            getPendingTablesruntime getpendingtablesruntime2 = new getPendingTablesruntime(str, null, str4);
            resetPasswordUseCase$invoke$1.IconCompatParcelizer = null;
            resetPasswordUseCase$invoke$1.write = null;
            resetPasswordUseCase$invoke$1.RemoteActionCompatParcelizer = z;
            resetPasswordUseCase$invoke$1.serializer = 2;
            Object objM4864forgotPasswordgIAlus2 = signInDataStore.m4864forgotPasswordgIAlus(getpendingtablesruntime2, resetPasswordUseCase$invoke$1);
            if (objM4864forgotPasswordgIAlus2 != coroutineSingletons) {
                obj2 = objM4864forgotPasswordgIAlus2;
                z2 = z;
                if (!(obj2 instanceof isItemDismissable)) {
                    otpLogger.RemoteActionCompatParcelizer(Transacter.EMAIL, z2);
                }
                thSerializer2 = onItemDismiss.serializer(obj2);
                if (thSerializer2 != null) {
                    int i12 = MediaMetadataCompat + 111;
                    MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    path$Companion.getClass();
                    otpLogger.read(Path$Companion.serializer(thSerializer2).write, Transacter.EMAIL, z2);
                }
                return obj2;
            }
        } else {
            getPendingTablesruntime getpendingtablesruntime3 = new getPendingTablesruntime(str, null, str4);
            resetPasswordUseCase$invoke$1.IconCompatParcelizer = str;
            resetPasswordUseCase$invoke$1.write = str4;
            resetPasswordUseCase$invoke$1.RemoteActionCompatParcelizer = z;
            resetPasswordUseCase$invoke$1.serializer = 3;
            Object objM4864forgotPasswordgIAlus3 = signInDataStore.m4864forgotPasswordgIAlus(getpendingtablesruntime3, resetPasswordUseCase$invoke$1);
            if (objM4864forgotPasswordgIAlus3 != coroutineSingletons) {
                str2 = str;
                str3 = str4;
                obj = objM4864forgotPasswordgIAlus3;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("userName:{", str2, "}; countryCode:{", str3, "}; result:{"), onItemDismiss.write(obj), "}"), new Object[0]);
                return obj;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public Object invoke(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str, ContinuationImpl continuationImpl) throws Throwable {
        getDataStore getdatastore;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        String str2;
        extractJsonString extractjsonstring;
        String strIconCompatParcelizer;
        int i = 2 % 2;
        QueryResultCompanion queryResultCompanion = (QueryResultCompanion) this.read;
        getBindingAdapter getbindingadapter = (getBindingAdapter) this.IconCompatParcelizer;
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) this.serializer;
        if (!(!(continuationImpl instanceof getDataStore))) {
            getdatastore = (getDataStore) continuationImpl;
            int i2 = getdatastore.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) == 0) {
                getdatastore = new getDataStore(this, continuationImpl);
            } else {
                int i3 = MediaMetadataCompat + 97;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getdatastore.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            }
        } else {
            getdatastore = new getDataStore(this, continuationImpl);
        }
        Object objWithContext = getdatastore.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getdatastore.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 != 0) {
            int i6 = MediaMetadataCompat + 91;
            int i7 = i6 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i7;
            int i8 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 19;
            MediaMetadataCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                String str3 = getdatastore.IconCompatParcelizer;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = getdatastore.read;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                str2 = str3;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
            } else {
                String str4 = getdatastore.IconCompatParcelizer;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = getdatastore.read;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                throw null;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) this.RemoteActionCompatParcelizer)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            HomeViewModel.AnonymousClass1 anonymousClass1 = new HomeViewModel.AnonymousClass1(this, shortNewsContentCardView, 23);
            getdatastore.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            getdatastore.IconCompatParcelizer = str;
            getdatastore.RemoteActionCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultScheduler, anonymousClass1, getdatastore);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i10 = MediaMetadataCompat + 1;
            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 4 / 5;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            str2 = str;
        }
        verifyPlayStorePurchaseI verifyplaystorepurchasei = (verifyPlayStorePurchaseI) objWithContext;
        setTransactionSuccessful settransactionsuccessful2 = ((BrazeExternalSyntheticLambda28) this.write).read;
        verifyplaystorepurchasei.getClass();
        int i12 = afExternalSyntheticOutline1.RemoteActionCompatParcelizer[verifyplaystorepurchasei.ordinal()];
        if (i12 == 1) {
            extractjsonstring = extractJsonString.Email;
            strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.COURIER_AND_EMAIL);
        } else if (i12 != 2) {
            int i13 = MediaMetadataCompat + 53;
            int i14 = i13 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i14;
            if (i13 % 2 != 0 ? i12 == 3 : i12 == 2) {
                int i15 = i14 + 115;
                MediaMetadataCompat = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                extractjsonstring = extractJsonString.Email;
                strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.login_email_or_phone_placeholder);
                int i17 = MediaMetadataCompat + 97;
                MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
        } else {
            extractjsonstring = extractJsonString.Phone;
            strIconCompatParcelizer = settransactionsuccessful2.IconCompatParcelizer(R.string.login_phone_placeholder_title);
        }
        String str5 = strIconCompatParcelizer;
        extractjsonstring.getClass();
        int i19 = db.serializer[verifyplaystorepurchasei.ordinal()];
        if (i19 == 1) {
            return new getLong(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, queryResultCompanion.RemoteActionCompatParcelizer(), settransactionsuccessful.read(R.string.login_forgot_password_sub_title_with_placeholder, settransactionsuccessful.IconCompatParcelizer(R.string.login_forgot_password_sub_phone_placeholder)), str5, queryResultCompanion.serializer(str2), getbindingadapter.serializer(getAbsoluteAdapterPosition.read), hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2));
        }
        if (i19 == 2) {
            return new currentTransaction(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, str5, str2, settransactionsuccessful.read(R.string.login_forgot_password_sub_title_with_placeholder, settransactionsuccessful.IconCompatParcelizer(R.string.login_forgot_password_sub_email_placeholder)), getbindingadapter.serializer(getAbsoluteAdapterPosition.IconCompatParcelizer), hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2));
        }
        if (i19 == 3) {
            return new currentTransaction(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, str5, str2, settransactionsuccessful.read(R.string.login_forgot_password_sub_title_with_placeholder, settransactionsuccessful.IconCompatParcelizer(R.string.login_forgot_password_sub_email_or_phone_placeholder)), getbindingadapter.serializer(getAbsoluteAdapterPosition.serializer), hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r0 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = ((com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl) r6.RatingCompat).IconCompatParcelizer();
        r1 = ((o.buildMeasurementConsentPackage) r6.serializer).serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        return kotlinx.coroutines.flow.FlowKt.read(r0, new com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1(((o.performCustomExitMxy_nc0) r1.read.write()).serializer(), 13, r1), ((com.roadrunner.delivery.repository.CachedDeliveryRepository) r6.write).write(), new com.roadrunner.rider.state.quests.domain.GetBannerUiState$invoke$1(r6, null, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (((o.getAdRevenueParameters) r6.read).serializer() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (((o.getAdRevenueParameters) r6.read).serializer() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(o.addDuration.serializer);
        r2 = androidx.lifecycle.BlockRunner.MediaMetadataCompat + 27;
        androidx.lifecycle.BlockRunner.MediaDescriptionCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlinx.coroutines.flow.Flow MediaBrowserCompatMediaItem() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.lifecycle.BlockRunner.MediaDescriptionCompat
            int r1 = r1 + 61
            int r2 = r1 % 128
            androidx.lifecycle.BlockRunner.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r6.read
            o.getAdRevenueParameters r1 = (o.getAdRevenueParameters) r1
            boolean r1 = r1.serializer()
            r2 = 99
            int r2 = r2 / 0
            if (r1 != 0) goto L3e
            goto L27
        L1d:
            java.lang.Object r1 = r6.read
            o.getAdRevenueParameters r1 = (o.getAdRevenueParameters) r1
            boolean r1 = r1.serializer()
            if (r1 != 0) goto L3e
        L27:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            o.addDuration r2 = o.addDuration.serializer
            r1.<init>(r2)
            int r2 = androidx.lifecycle.BlockRunner.MediaMetadataCompat
            int r2 = r2 + 27
            int r3 = r2 % 128
            androidx.lifecycle.BlockRunner.MediaDescriptionCompat = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L3d
            r0 = 44
            int r0 = r0 / 0
        L3d:
            return r1
        L3e:
            java.lang.Object r0 = r6.RatingCompat
            com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl r0 = (com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl) r0
            com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1 r0 = r0.IconCompatParcelizer()
            java.lang.Object r1 = r6.serializer
            o.buildMeasurementConsentPackage r1 = (o.buildMeasurementConsentPackage) r1
            com.roadrunner.rider.state.quests.data.QuestsCache r1 = r1.serializer
            o.buildSessionPackage r2 = r1.read
            java.lang.Object r2 = r2.write()
            o.performCustomExitMxy_nc0 r2 = (o.performCustomExitMxy_nc0) r2
            kotlinx.coroutines.flow.Flow r2 = r2.serializer()
            com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1 r3 = new com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1
            r4 = 13
            r3.<init>(r2, r4, r1)
            java.lang.Object r1 = r6.write
            com.roadrunner.delivery.repository.CachedDeliveryRepository r1 = (com.roadrunner.delivery.repository.CachedDeliveryRepository) r1
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r1 = r1.write()
            com.roadrunner.rider.state.quests.domain.GetBannerUiState$invoke$1 r2 = new com.roadrunner.rider.state.quests.domain.GetBannerUiState$invoke$1
            r4 = 0
            r5 = 1
            r2.<init>(r6, r4, r5)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 r0 = kotlinx.coroutines.flow.FlowKt.read(r0, r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.BlockRunner.MediaBrowserCompatMediaItem():kotlinx.coroutines.flow.Flow");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:32:0x0149  */
    /* JADX WARN: Code duplicated, block: B:35:0x0151  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    public Object m3951invokeyxL6bBk(String str, String str2, boolean z, insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy, ContinuationImpl continuationImpl) {
        CreatePasswordUseCase$invoke$1 createPasswordUseCase$invoke$1;
        String str3;
        insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy2;
        String str4;
        boolean z2;
        Object objM4509createPasswordgIAlus;
        insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy3;
        Object obj;
        Throwable thSerializer;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) this.write;
        OtpLogger otpLogger = (OtpLogger) this.RatingCompat;
        if (continuationImpl instanceof CreatePasswordUseCase$invoke$1) {
            createPasswordUseCase$invoke$1 = (CreatePasswordUseCase$invoke$1) continuationImpl;
            int i5 = createPasswordUseCase$invoke$1.RemoteActionCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                createPasswordUseCase$invoke$1.RemoteActionCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                createPasswordUseCase$invoke$1 = new CreatePasswordUseCase$invoke$1(this, continuationImpl);
                int i6 = MediaDescriptionCompat + 73;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            createPasswordUseCase$invoke$1 = new CreatePasswordUseCase$invoke$1(this, continuationImpl);
            int i8 = MediaDescriptionCompat + 73;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        Object objInvoke = createPasswordUseCase$invoke$1.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = createPasswordUseCase$invoke$1.RemoteActionCompatParcelizer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetUserDataUseCaseImpl getUserDataUseCaseImpl = (GetUserDataUseCaseImpl) this.serializer;
            createPasswordUseCase$invoke$1.IconCompatParcelizer = str;
            str3 = str2;
            createPasswordUseCase$invoke$1.serializer = str3;
            insertorupdatetransformednodesubhierarchy2 = insertorupdatetransformednodesubhierarchy;
            createPasswordUseCase$invoke$1.write = insertorupdatetransformednodesubhierarchy2;
            createPasswordUseCase$invoke$1.read = z;
            createPasswordUseCase$invoke$1.RemoteActionCompatParcelizer = 1;
            objInvoke = getUserDataUseCaseImpl.invoke(createPasswordUseCase$invoke$1);
            if (objInvoke != coroutineSingletons) {
                str4 = str;
                z2 = z;
            }
            return coroutineSingletons;
        }
        if (i10 != 1) {
            int i11 = MediaDescriptionCompat + 77;
            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0 ? i10 != 2 : i10 != 5) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            insertorupdatetransformednodesubhierarchy3 = createPasswordUseCase$invoke$1.write;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            objM4509createPasswordgIAlus = ((onItemDismiss) objInvoke).IconCompatParcelizer;
        } else {
            z2 = createPasswordUseCase$invoke$1.read;
            insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy4 = createPasswordUseCase$invoke$1.write;
            String str5 = createPasswordUseCase$invoke$1.serializer;
            str4 = createPasswordUseCase$invoke$1.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            insertorupdatetransformednodesubhierarchy2 = insertorupdatetransformednodesubhierarchy4;
            str3 = str5;
        }
        if (objM4509createPasswordgIAlus instanceof isItemDismissable) {
            obj = r10;
        } else {
            ((setTraversalGroup) ((setSensitiveData) this.IconCompatParcelizer)).IconCompatParcelizer();
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl.getClass();
            boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
            otpLogger.getClass();
            insertorupdatetransformednodesubhierarchy3.getClass();
            obj = "isResetPasswordFlexibilityEnabled";
            otpLogger.IconCompatParcelizer.logEvent("custom_password_success", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("resetPasswordType", insertorupdatetransformednodesubhierarchy3.getLoggingName()), new onViewAttachedToWindowlambda0(obj, String.valueOf(zIconCompatParcelizer))));
        }
        thSerializer = onItemDismiss.serializer(objM4509createPasswordgIAlus);
        if (thSerializer != null) {
            ((Path$Companion) this.RemoteActionCompatParcelizer).getClass();
            String str6 = Path$Companion.serializer(thSerializer).write;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl2.getClass();
            boolean zIconCompatParcelizer2 = firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
            otpLogger.getClass();
            str6.getClass();
            insertorupdatetransformednodesubhierarchy3.getClass();
            i = 2;
            otpLogger.IconCompatParcelizer.logEvent("custom_password_failure", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("resetPasswordType", insertorupdatetransformednodesubhierarchy3.getLoggingName()), new onViewAttachedToWindowlambda0("failureReason", str6), new onViewAttachedToWindowlambda0(obj, String.valueOf(zIconCompatParcelizer2))));
        } else {
            i = 2;
        }
        int i12 = MediaMetadataCompat + 15;
        MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
        int i13 = i12 % i;
        return objM4509createPasswordgIAlus;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl3.getClass();
        boolean zIconCompatParcelizer3 = firebaseRemoteConfigImpl3.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
        otpLogger.getClass();
        insertorupdatetransformednodesubhierarchy2.getClass();
        otpLogger.IconCompatParcelizer.logEvent("custom_password_started", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("resetPasswordType", insertorupdatetransformednodesubhierarchy2.getLoggingName()), new onViewAttachedToWindowlambda0("isResetPasswordFlexibilityEnabled", String.valueOf(zIconCompatParcelizer3))));
        Vw$Vw vw$Vw = (Vw$Vw) this.read;
        insertOrUpdateTransformedNode insertorupdatetransformednode = new insertOrUpdateTransformedNode(((getTextSelectionRange) objInvoke).ParcelableVolumeInfo, str3, str4, z2);
        createPasswordUseCase$invoke$1.IconCompatParcelizer = null;
        createPasswordUseCase$invoke$1.serializer = null;
        createPasswordUseCase$invoke$1.write = insertorupdatetransformednodesubhierarchy2;
        createPasswordUseCase$invoke$1.read = z2;
        createPasswordUseCase$invoke$1.RemoteActionCompatParcelizer = 2;
        objM4509createPasswordgIAlus = vw$Vw.m4509createPasswordgIAlus(insertorupdatetransformednode, createPasswordUseCase$invoke$1);
        if (objM4509createPasswordgIAlus != coroutineSingletons) {
            insertorupdatetransformednodesubhierarchy3 = insertorupdatetransformednodesubhierarchy2;
            if (objM4509createPasswordgIAlus instanceof isItemDismissable) {
                ((setTraversalGroup) ((setSensitiveData) this.IconCompatParcelizer)).IconCompatParcelizer();
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl4 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                firebaseRemoteConfigImpl4.getClass();
                boolean zIconCompatParcelizer4 = firebaseRemoteConfigImpl4.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
                otpLogger.getClass();
                insertorupdatetransformednodesubhierarchy3.getClass();
                obj = "isResetPasswordFlexibilityEnabled";
                otpLogger.IconCompatParcelizer.logEvent("custom_password_success", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("resetPasswordType", insertorupdatetransformednodesubhierarchy3.getLoggingName()), new onViewAttachedToWindowlambda0(obj, String.valueOf(zIconCompatParcelizer4))));
            } else {
                obj = r10;
            }
            thSerializer = onItemDismiss.serializer(objM4509createPasswordgIAlus);
            if (thSerializer != null) {
                ((Path$Companion) this.RemoteActionCompatParcelizer).getClass();
                String str7 = Path$Companion.serializer(thSerializer).write;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl5 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                firebaseRemoteConfigImpl5.getClass();
                boolean zIconCompatParcelizer5 = firebaseRemoteConfigImpl5.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
                otpLogger.getClass();
                str7.getClass();
                insertorupdatetransformednodesubhierarchy3.getClass();
                i = 2;
                otpLogger.IconCompatParcelizer.logEvent("custom_password_failure", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("resetPasswordType", insertorupdatetransformednodesubhierarchy3.getLoggingName()), new onViewAttachedToWindowlambda0("failureReason", str7), new onViewAttachedToWindowlambda0(obj, String.valueOf(zIconCompatParcelizer5))));
            } else {
                i = 2;
            }
            int i14 = MediaMetadataCompat + 15;
            MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
            int i15 = i14 % i;
            return objM4509createPasswordgIAlus;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0195  */
    public void renderCallouts(RouteCalloutUiStateData routeCalloutUiStateData) {
        View viewInflate;
        long jMediaSessionCompatQueueItem;
        m6 m6Var;
        String strIconCompatParcelizer;
        String strSerializer;
        boolean z;
        BlockRunner blockRunner = this;
        int i = 2 % 2;
        ViewAnnotationManager viewAnnotationManager = (ViewAnnotationManager) blockRunner.read;
        LinkedHashSet linkedHashSet = (LinkedHashSet) blockRunner.IconCompatParcelizer;
        routeCalloutUiStateData.getClass();
        blockRunner.RatingCompat = routeCalloutUiStateData;
        clear();
        ArrayList arrayList = new ArrayList();
        Iterator it = routeCalloutUiStateData.callouts.iterator();
        while (it.hasNext()) {
            RouteCalloutUiState routeCalloutUiState = (RouteCalloutUiState) it.next();
            String str = routeCalloutUiState.layerId;
            RouteCallout routeCallout = routeCalloutUiState.routeCallout;
            NavigationRoute navigationRoute = routeCallout.route;
            m2 m2Var = (m2) blockRunner.serializer;
            shouldSkipDump shouldskipdump = m2Var.RatingCompat;
            DefaultRouteCalloutAdapterOptions defaultRouteCalloutAdapterOptions = m2Var.RemoteActionCompatParcelizer;
            Context context = m2Var.read;
            long jMediaSessionCompatQueueItem2 = routeCallout.durationDifferenceWithPrimary;
            boolean z2 = routeCallout.isPrimary;
            LayoutInflater layoutInflater = m2Var.write;
            Iterator it2 = it;
            long j = 0;
            if (z2) {
                viewInflate = layoutInflater.inflate(R.layout.view_item_eta, (ViewGroup) new FrameLayout(context), false);
                viewInflate.setTag(0);
                ((TextView) viewInflate.findViewById(R.id.eta)).setText(shouldskipdump.serializer((long) navigationRoute.directionsRoute.duration().doubleValue()));
                viewInflate.setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.primary_light_01)));
                linkedHashSet = linkedHashSet;
                arrayList = arrayList;
            } else {
                viewInflate = layoutInflater.inflate(R.layout.view_item_eta, (ViewGroup) new FrameLayout(context), false);
                viewInflate.setTag(1);
                TextView textView = (TextView) viewInflate.findViewById(R.id.eta);
                if (defaultRouteCalloutAdapterOptions.routeCalloutType == 0) {
                    strSerializer = shouldskipdump.serializer((long) navigationRoute.directionsRoute.duration().doubleValue());
                    linkedHashSet = linkedHashSet;
                    arrayList = arrayList;
                } else {
                    setTransactionSuccessful settransactionsuccessful = m2Var.serializer;
                    if (jMediaSessionCompatQueueItem2 < 0) {
                        jMediaSessionCompatQueueItem = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jMediaSessionCompatQueueItem2);
                    } else {
                        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
                        jMediaSessionCompatQueueItem = jMediaSessionCompatQueueItem2;
                    }
                    String strSerializer2 = shouldskipdump.serializer(BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.SECONDS));
                    if (jMediaSessionCompatQueueItem2 < 0) {
                        jMediaSessionCompatQueueItem2 = BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(jMediaSessionCompatQueueItem2);
                    }
                    if (BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem2, defaultRouteCalloutAdapterOptions.similarDurationDelta) <= 0) {
                        int i2 = MediaDescriptionCompat + 125;
                        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        m6Var = m6.Same;
                    } else if (jMediaSessionCompatQueueItem2 < 0) {
                        m6Var = m6.Slower;
                    } else {
                        m6Var = m6.Faster;
                    }
                    int i4 = m5.RemoteActionCompatParcelizer[m6Var.ordinal()];
                    if (i4 == 1) {
                        strIconCompatParcelizer = settransactionsuccessful.read(R.string.route_preview_callout_faster_tag, strSerializer2);
                    } else if (i4 == 2) {
                        strIconCompatParcelizer = settransactionsuccessful.read(R.string.route_preview_callout_slower_tag, strSerializer2);
                    } else {
                        int i5 = MediaMetadataCompat + 7;
                        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (i4 == 3) {
                            strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.route_preview_callout_similar_tag);
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                    }
                    strSerializer = strIconCompatParcelizer;
                }
                textView.setText(strSerializer);
                viewInflate.setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.primary_light_02)));
            }
            viewInflate.setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(m2Var, 3, routeCallout));
            new ViewAnnotationOptions.Builder().build().getClass();
            ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
            builder.ignoreCameraPadding(Boolean.TRUE);
            if (z2 != 0) {
                int i7 = MediaDescriptionCompat + 47;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0 ? defaultRouteCalloutAdapterOptions.routeCalloutType == 1 : defaultRouteCalloutAdapterOptions.routeCalloutType == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            builder.visible(Boolean.valueOf(z));
            if (z2) {
                int i8 = MediaDescriptionCompat + 81;
                MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                j = 1;
            }
            builder.priority(Long.valueOf(j));
            builder.minZoom(Float.valueOf(1.0f));
            builder.maxZoom(Float.valueOf(16.0f));
            ViewAnnotationOptionsKtxKt.annotationAnchors(builder, new NafathLogger$$ExternalSyntheticLambda0(6), new NafathLogger$$ExternalSyntheticLambda0(7), new NafathLogger$$ExternalSyntheticLambda0(8), new NafathLogger$$ExternalSyntheticLambda0(9));
            ViewAnnotationOptions viewAnnotationOptionsBuild = builder.build();
            viewAnnotationOptionsBuild.getClass();
            CalloutViewHolder calloutViewHolder = new CalloutViewHolder(viewInflate, viewAnnotationOptionsBuild);
            linkedHashSet.add(str);
            ConstraintSetForInlineDsl$applyTo$1 constraintSetForInlineDsl$applyTo$1 = new ConstraintSetForInlineDsl$applyTo$1(this, str, calloutViewHolder, 5);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(constraintSetForInlineDsl$applyTo$1);
            arrayList = arrayList2;
            blockRunner = this;
            linkedHashSet = linkedHashSet;
            viewAnnotationManager = viewAnnotationManager;
            it = it2;
        }
        viewAnnotationManager.setViewAnnotationAvoidLayers(new HashSet<>(RangesKt.read(viewAnnotationManager.getViewAnnotationAvoidLayers(), linkedHashSet)));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it3.next()).invoke();
        }
    }

    public BlockRunner() {
    }
}
