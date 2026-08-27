package androidx.transition;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraRepository;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.sqlite.SQLite;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.n5;
import coil3.RealImageLoader$execute$2$job$1;
import com.data.injection.DataModule_ProvideSchedulerFactory;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.google.android.gms.net.zza;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.wisesecurity.kfs.crypto.cipher.DefaultDecryptHandler;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsResponseParsingResult;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.mapbox.navigation.base.internal.utils.OptimisedForJavaMemoryRoutesParsingQueue;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.internal.congestions.model.CongestionRangeGroup$WhenMappings;
import com.mapbox.navigation.core.internal.congestions.model.CongestionSeverityType;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.mapbox.navigator.RouteInterface;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.face.verification.domain.ImageCaptureUseCaseImpl;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.order.history.presentation.main.HistoryFragment;
import com.roadrunner.settings.SettingsFragment;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.visitessentials.h$c;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.RxCompletableKt;
import o.AlertControllerButtonHandler;
import o.AndroidFontResourceLoader;
import o.AndroidPlatformTextInputSession;
import o.AnimatedVisibilityKt;
import o.BrazeExternalSyntheticLambda28;
import o.BrazeExternalSyntheticLambda45;
import o.Bt2020Pqlambda1;
import o.ContextMenuSpec;
import o.CoordinatorLayoutBehavior;
import o.FocusMeteringAction;
import o.FocusPropertiesNode;
import o.FocusRestorerNode;
import o.HitTestResultKt;
import o.HitTestResultSubList;
import o.ImageKt;
import o.LegacyCameraSurfaceCleanupQuirk;
import o.MediaSessionCompatQueueItem;
import o.NodeChain;
import o.OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0;
import o.PreferenceGroupAdapter;
import o.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import o.PreviewOrientationIncorrectQuirk;
import o.ScrollCaptureExternalSyntheticApiModelOutline0;
import o.ScrollCapture_androidKt;
import o.ScrollCaptureonScrollCaptureSearch1;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.ShortNewsContentCardView;
import o.SubcomposeMeasureScope;
import o.SurfaceRequest;
import o.accessgetButtoncp;
import o.accessgetCoroutineScopep;
import o.accessgetDrawBlockCanvasp;
import o.accessgetGreencp;
import o.accessgetInstancedelegatecp;
import o.accessgetSwitchcp;
import o.accesssetDrawBlockCanvasp;
import o.acquire;
import o.ancestorToLocalS_NoaFU;
import o.applyDiff;
import o.applyLayoutFeatures;
import o.backward4l5_RBY;
import o.calculateDiff;
import o.calculateSemanticsConfiguration;
import o.closeOptionsMenu;
import o.compareAndSetFactory;
import o.decode;
import o.dispatchIndirectPointerEvent;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.executeDiff;
import o.executeQuery;
import o.fillSnake;
import o.forEach;
import o.getAlignmentLinesMap;
import o.getButtonSelectEK5gGoQ;
import o.getButtonThumbLeftEK5gGoQ;
import o.getCanScrollVertically;
import o.getColorIntegerOrNulllambda0;
import o.getContactsEK5gGoQ;
import o.getContentDataType;
import o.getContentViewGroupParentLayout;
import o.getDataStoreFileName;
import o.getDividerPadding;
import o.getDoubleOrNull;
import o.getForwardEK5gGoQ;
import o.getFourEK5gGoQ;
import o.getLastWindowInsets;
import o.getLocalSavedStateRegistryOwnerannotations;
import o.getNumPadDirectionUpEK5gGoQ;
import o.getNumPadEqualsEK5gGoQ;
import o.getNumPadLeftParenthesisEK5gGoQ;
import o.getNumPadMoveEndEK5gGoQ;
import o.getNumPadMoveHomeEK5gGoQ;
import o.getNumPadRightParenthesisEK5gGoQ;
import o.getOnVectorMutated;
import o.getOuterActionMenuPresenter;
import o.getPivotX;
import o.getPositionChangeannotations;
import o.getPrettyPrintedString;
import o.getQueryParameterslambda2;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getScrimColor;
import o.getScrollCaptureInProgress;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.getSetRootui;
import o.getStatusBarBackground;
import o.getSuggestedMinimumWidth;
import o.getSwitchMinWidth;
import o.getThumbTintList;
import o.getTransactionExecutor;
import o.getTvInputComposite2EK5gGoQ;
import o.getVector;
import o.getZEK5gGoQ;
import o.getZenkakuHankaruEK5gGoQ;
import o.handleOnBackPressed;
import o.handleOnBackStarted;
import o.isAdapterPositionOnScreen;
import o.isHiddenannotations;
import o.isInfiniteimpl;
import o.jsonStringToList;
import o.jsonStringToStringMap;
import o.lambdaprocessAndResolveDeeplink15;
import o.load;
import o.mergeJsonObjects;
import o.nodeUpdated;
import o.offsetFromEdgeMKHz9U;
import o.onContentCardDismissed;
import o.onContentChanged;
import o.onDrawWithContent;
import o.onViewAttachedToWindowlambda0;
import o.performPushDeliveryFlushlambda0;
import o.play;
import o.processDragGesture;
import o.prune;
import o.r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw;
import o.r8lambda6UOvp7lvejigbq5knKoP8A0vEiw;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaG9rB9GwnhH4FGsWkARoJWjtnPDI;
import o.r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8;
import o.r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I;
import o.requestGeofences;
import o.requestSingleLocationUpdatelambda1;
import o.resetStateui;
import o.setInitialAnimationsanimation_core;
import o.setPresentationView;
import o.setSdkAuthenticationSignature;
import o.setTransactionSuccessful;
import o.setType;
import o.shutdown;
import o.subscribeToChangeUserEventslambda1;
import o.updateClipPath;
import o.updateInitialValuesanimation_core;
import o.xyzaToColorJlNiLsgui_graphics;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionValuesMaps implements handleOnBackStarted, getSwitchMinWidth, shutdown, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, ScrollCapture_androidKt {
    public static TransitionValuesMaps IconCompatParcelizer = null;
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompat = 1;
    public static TransitionValuesMaps RemoteActionCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object RatingCompat;
    public final /* synthetic */ int read;

    public static TransitionValuesMaps read() {
        TransitionValuesMaps transitionValuesMaps;
        synchronized (TransitionValuesMaps.class) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new TransitionValuesMaps(1);
            }
            transitionValuesMaps = RemoteActionCompatParcelizer;
        }
        return transitionValuesMaps;
    }

    @Override // o.getSwitchMinWidth
    public float RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 53;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 1.0f;
        }
        throw null;
    }

    public void RemoteActionCompatParcelizer(SubcomposeMeasureScope subcomposeMeasureScope) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (IconCompatParcelizer(subcomposeMeasureScope)) {
                forEach foreach = (forEach) this.MediaMetadataCompat;
                if (!foreach.serializer) {
                    foreach.serializer = true;
                    ((Handler) this.MediaDescriptionCompat).removeCallbacksAndMessages(foreach);
                }
            }
        }
    }

    public load read(String str) {
        if (!((ConcurrentHashMap) this.RatingCompat).containsKey(str)) {
            synchronized (this) {
                if (!((ConcurrentHashMap) this.RatingCompat).containsKey(str)) {
                    try {
                        ((accessgetCoroutineScopep) this.MediaBrowserCompatMediaItem).getClass();
                        InputStream inputStream = accessgetCoroutineScopep.read(str);
                        ((AndroidPlatformTextInputSession) this.MediaDescriptionCompat).getClass();
                        for (getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations : AndroidPlatformTextInputSession.serializer(inputStream)) {
                            Parser.Pair pair = (Parser.Pair) this.MediaMetadataCompat;
                            m mVar = (m) pair.write;
                            if (((String) ((AndroidFontResourceLoader) mVar.read).write(getlocalsavedstateregistryownerannotations)).equals("001")) {
                                ((m) pair.RemoteActionCompatParcelizer).serializer(getlocalsavedstateregistryownerannotations);
                            } else {
                                mVar.serializer(getlocalsavedstateregistryownerannotations);
                            }
                        }
                        ((ConcurrentHashMap) this.RatingCompat).put(str, str);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        throw new IllegalStateException("Failed to read file ".concat(str), e);
                    }
                }
            }
        }
        return (Parser.Pair) this.MediaMetadataCompat;
    }

    public void read(calculateSemanticsConfiguration calculatesemanticsconfiguration) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 71;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        this.MediaMetadataCompat = calculatesemanticsconfiguration;
        int i5 = i3 + 125;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public void serializer(calculateSemanticsConfiguration calculatesemanticsconfiguration) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 11;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.RatingCompat = calculatesemanticsconfiguration;
            throw null;
        }
        this.RatingCompat = calculatesemanticsconfiguration;
        int i4 = i2 + 95;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void write(SubcomposeMeasureScope subcomposeMeasureScope) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            if (IconCompatParcelizer(subcomposeMeasureScope)) {
                forEach foreach = (forEach) this.MediaMetadataCompat;
                if (foreach.serializer) {
                    foreach.serializer = false;
                    RemoteActionCompatParcelizer(foreach);
                }
            }
        }
    }

    public void IconCompatParcelizer(HitTestResultSubList hitTestResultSubList) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 67;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        int i4 = i2 % 2;
        this.RatingCompat = hitTestResultSubList;
        int i5 = i3 + 63;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.shutdown
    public SurfaceRequest write(int i) {
        SurfaceRequest surfaceRequestIconCompatParcelizer;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 63;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            surfaceRequestIconCompatParcelizer = IconCompatParcelizer(i);
            int i4 = 39 / 0;
        } else {
            surfaceRequestIconCompatParcelizer = IconCompatParcelizer(i);
        }
        int i5 = MediaSessionCompatQueueItem + 27;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return surfaceRequestIconCompatParcelizer;
    }

    public TransitionValuesMaps(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.read = i;
        int i2 = 7;
        int i3 = 5;
        int i4 = 9;
        int i5 = 6;
        if (i != 11) {
            this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
            this.MediaDescriptionCompat = new acquire(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.accessprocessDragStart, 21);
            this.MediaMetadataCompat = new r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I(getstyleable_vector_drawable_group_rotation.AnchoredDraggableKtanimateToWithDecay2, new r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY(getstyleable_vector_drawable_group_rotation.AbstractClickableNodeonPointerEvent1, 1), getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList, 24);
            setPresentationView setpresentationview = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
            setpresentationview.getClass();
            mergeJsonObjects mergejsonobjectsRemoteActionCompatParcelizer = getPrettyPrintedString.RemoteActionCompatParcelizer(new performPushDeliveryFlushlambda0((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) this.MediaMetadataCompat, getstyleable_vector_drawable_group_rotation.AnchoredDraggableKtanimateTo4, getstyleable_vector_drawable_group_rotation.HorizontalScrollableClipShape, new DataModule_ProvideSchedulerFactory(setpresentationview, 9), 9));
            mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.Contentfoundation;
            getDataStoreFileName getdatastorefilename = new getDataStoreFileName(mergejsonobjectsRemoteActionCompatParcelizer, getstyleable_vector_drawable_group_rotation.AfRegionFlipHorizontallyQuirk, new lambdaprocessAndResolveDeeplink15(mergejsonobjects, i5), new lambdaprocessAndResolveDeeplink15(mergejsonobjects, i3), new lambdaprocessAndResolveDeeplink15(mergejsonobjects, 4), getstyleable_vector_drawable_group_rotation.createnHHXs2Y);
            mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.getEditsText;
            mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.toClipEntry;
            this.RatingCompat = new getDataStoreFileName((acquire) this.MediaDescriptionCompat, getdatastorefilename, getstyleable_vector_drawable_group_rotation.trimToSize, new acquire(mergejsonobjects2, mergejsonobjects3, 23), new lambdaprocessAndResolveDeeplink15(mergejsonobjects3, i2), new acquire(mergejsonobjects2, mergejsonobjects3, 22));
            return;
        }
        this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
        executeQuery executequery = new executeQuery(getstyleable_vector_drawable_group_rotation.drag, i5);
        applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(getstyleable_vector_drawable_group_rotation.width3ABfNKs, getstyleable_vector_drawable_group_rotation.setMaxCardElevation, getstyleable_vector_drawable_group_rotation.createnHHXs2Y, i4);
        executeQuery executequery2 = new executeQuery(getstyleable_vector_drawable_group_rotation.setItemInvoker, i3);
        this.MediaDescriptionCompat = executequery2;
        this.MediaMetadataCompat = getDoubleOrNull.write(new CoordinatorLayoutBehavior(new BlockRunner(executequery, applylayoutfeatures, executequery2, new PreferenceGroupAdapter((mergeJsonObjects) getstyleable_vector_drawable_group_rotation.getSubtitle, (getColorIntegerOrNulllambda0) executequery2, i2), getstyleable_vector_drawable_group_rotation.Keep, getstyleable_vector_drawable_group_rotation.awaitNavigationRoutes)));
        this.RatingCompat = getDoubleOrNull.write(new getLastWindowInsets(new SignInDataStore((executeQuery) this.MediaDescriptionCompat, getstyleable_vector_drawable_group_rotation.Camera2CapturePipelineScreenFlashTask, getstyleable_vector_drawable_group_rotation.tryMaxHeightJN0ABg)));
    }

    public void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaMetadataCompat = 16;
        int i4 = PlaybackStateCompat + 101;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void MediaMetadataCompat(int i) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 73;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.MediaDescriptionCompat = Integer.valueOf(i);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = MediaSessionCompatQueueItem + 23;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public TransitionValuesMaps PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps(this, (zzz) this.MediaDescriptionCompat);
        int i2 = MediaSessionCompatQueueItem + 63;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return transitionValuesMaps;
    }

    @Override // o.shutdown
    public boolean serializer(int i) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 77;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            IconCompatParcelizer(i);
            throw null;
        }
        if (IconCompatParcelizer(i) == null) {
            return false;
        }
        int i4 = MediaSessionCompatQueueItem + 105;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public void RemoteActionCompatParcelizer(getFourEK5gGoQ getfourek5ggoq) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ArrayList) this.MediaBrowserCompatMediaItem).add(getfourek5ggoq);
            throw null;
        }
        ((ArrayList) this.MediaBrowserCompatMediaItem).add(getfourek5ggoq);
        int i3 = MediaSessionCompatQueueItem + 107;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // o.handleOnBackStarted
    public void IconCompatParcelizer(handleOnBackPressed handleonbackpressed) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 19;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((ActionMode.Callback) this.MediaBrowserCompatMediaItem).onDestroyActionMode(RemoteActionCompatParcelizer(handleonbackpressed));
        int i4 = PlaybackStateCompat + 79;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    @Override // o.getSwitchMinWidth
    public void IconCompatParcelizer(getOuterActionMenuPresenter getouteractionmenupresenter) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat;
        int i3 = i2 + 3;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Rect rect = (Rect) this.MediaDescriptionCompat;
        if (rect != null) {
            int i4 = i2 + 73;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                getouteractionmenupresenter.read(CaptureRequest.SCALER_CROP_REGION, rect, play.REQUIRED);
            } else {
                getouteractionmenupresenter.read(CaptureRequest.SCALER_CROP_REGION, rect, play.REQUIRED);
                throw null;
            }
        }
    }

    public static TransitionValuesMaps MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 15;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = new TransitionValuesMaps(19);
            int i4 = MediaSessionCompatQueueItem + 93;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return IconCompatParcelizer;
    }

    public Object serializer(String str, getPivotX getpivotx) {
        int i = 2 % 2;
        Object objWithContext = BuildersKt.withContext((CoroutineDispatcher) this.MediaDescriptionCompat, new FlowLiveDataConversions$asFlow$1$1(this, str, (ShortNewsContentCardView) null, 9), getpivotx);
        int i2 = PlaybackStateCompat + 13;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objWithContext;
    }

    public static PreviewDelayWhenVideoCaptureIsBoundQuirk write(TransitionValuesMaps transitionValuesMaps, int i, int i2, int i3) {
        int i4 = 2 % 2;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = new PreviewDelayWhenVideoCaptureIsBoundQuirk(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
        int i5 = MediaSessionCompatQueueItem + 91;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return previewDelayWhenVideoCaptureIsBoundQuirk;
    }

    public boolean IconCompatParcelizer(SubcomposeMeasureScope subcomposeMeasureScope) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 49;
        int i3 = i2 % Fields.SpotShadowColor;
        PlaybackStateCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        forEach foreach = (forEach) this.MediaMetadataCompat;
        if (foreach == null || subcomposeMeasureScope == null) {
            return false;
        }
        int i4 = i3 + 67;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            foreach.read.get();
            throw null;
        }
        if (foreach.read.get() != subcomposeMeasureScope) {
            return false;
        }
        int i5 = PlaybackStateCompat + 13;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    @Override // o.getSwitchMinWidth
    public Rect write() {
        int i = 2 % 2;
        Rect rect = (Rect) this.MediaDescriptionCompat;
        if (rect == null) {
            Rect rect2 = (Rect) ((getThumbTintList) this.MediaBrowserCompatMediaItem).write(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            rect2.getClass();
            int i2 = PlaybackStateCompat + 73;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return rect2;
        }
        int i4 = MediaSessionCompatQueueItem + 113;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return rect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getSwitchMinWidth
    public void serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 7;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = null;
        this.MediaDescriptionCompat = null;
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.MediaMetadataCompat;
        if (ondrawwithcontent != null) {
            ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
            this.MediaMetadataCompat = null;
            int i4 = PlaybackStateCompat + 97;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    @Override // o.handleOnBackStarted
    public boolean write(handleOnBackPressed handleonbackpressed, MenuItem menuItem) {
        int i = 2 % 2;
        boolean zOnActionItemClicked = ((ActionMode.Callback) this.MediaBrowserCompatMediaItem).onActionItemClicked(RemoteActionCompatParcelizer(handleonbackpressed), new closeOptionsMenu((Context) this.MediaDescriptionCompat, (dispatchIndirectPointerEvent) menuItem));
        int i2 = MediaSessionCompatQueueItem + 53;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zOnActionItemClicked;
    }

    public boolean serializer(String str) {
        int i = 2 % 2;
        if (((HashMap) this.MediaMetadataCompat).containsKey(str)) {
            int i2 = PlaybackStateCompat + 83;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) this.MediaBrowserCompatMediaItem;
        if (transitionValuesMaps == null) {
            return false;
        }
        int i4 = MediaSessionCompatQueueItem + 43;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return transitionValuesMaps.serializer(str);
        }
        transitionValuesMaps.serializer(str);
        throw null;
    }

    public void write(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 63;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!((HashMap) this.RatingCompat).containsKey(str)) {
            HashMap map = (HashMap) this.MediaMetadataCompat;
            if (getnumpadmovehomeek5ggoq == null) {
                map.remove(str);
                return;
            } else {
                map.put(str, getnumpadmovehomeek5ggoq);
                return;
            }
        }
        int i4 = PlaybackStateCompat + 121;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void RatingCompat() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 9;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((HashSet) this.MediaMetadataCompat).iterator();
            obj.hashCode();
            throw null;
        }
        Iterator it = ((HashSet) this.MediaMetadataCompat).iterator();
        while (it.hasNext()) {
            int i3 = MediaSessionCompatQueueItem + 75;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                ((resetStateui) it.next()).serializer(null, null);
                int i4 = 70 / 0;
            } else {
                ((resetStateui) it.next()).serializer(null, null);
            }
        }
    }

    public void read(getFourEK5gGoQ getfourek5ggoq) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 107;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((ArrayList) this.RatingCompat).add(getfourek5ggoq);
            int i3 = 11 / 0;
        } else {
            ((ArrayList) this.RatingCompat).add(getfourek5ggoq);
        }
        int i4 = PlaybackStateCompat + 89;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static double RemoteActionCompatParcelizer(float f, float f2, float f3, float f4, float f5) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 67;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = f;
        double d2 = 1.0d - d;
        double d3 = (((double) f4) * 3.0d * d2 * d * d) + (((double) f3) * 3.0d * d2 * d2 * d) + (((double) f2) * d2 * d2 * d2) + ((double) (f5 * f * f * f));
        int i5 = i2 + 93;
        PlaybackStateCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d3;
    }

    public void IconCompatParcelizer(String str, ASN1UniversalType aSN1UniversalType) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.MediaBrowserCompatMediaItem, (CoroutineDispatcher) this.MediaDescriptionCompat, null, new RealImageLoader$execute$2$job$1(new SignInDataStore$set$2(aSN1UniversalType, this, str, null, 6), (ShortNewsContentCardView) null, 7), 2);
        int i2 = PlaybackStateCompat + 45;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.getSwitchMinWidth
    public float IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Float f = (Float) ((getThumbTintList) this.MediaBrowserCompatMediaItem).write(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null) {
            if (f.floatValue() < 1.0f) {
                return 1.0f;
            }
            return f.floatValue();
        }
        int i4 = PlaybackStateCompat + 111;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 1.0f;
    }

    public boolean read(forEach foreach, int i) {
        int i2 = 2 % 2;
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) foreach.read.get();
        if (subcomposeMeasureScope == null) {
            int i3 = MediaSessionCompatQueueItem + 99;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = PlaybackStateCompat + 97;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            ((Handler) this.MediaDescriptionCompat).removeCallbacksAndMessages(foreach);
            Handler handler = getSetRootui.MediaDescriptionCompat;
            handler.sendMessage(handler.obtainMessage(1, i, 0, subcomposeMeasureScope.RemoteActionCompatParcelizer));
            return false;
        }
        ((Handler) this.MediaDescriptionCompat).removeCallbacksAndMessages(foreach);
        Handler handler2 = getSetRootui.MediaDescriptionCompat;
        handler2.sendMessage(handler2.obtainMessage(1, i, 0, subcomposeMeasureScope.RemoteActionCompatParcelizer));
        return true;
    }

    @Override // o.ScrollCapture_androidKt
    public ScrollCaptureExternalSyntheticApiModelOutline0 getDecryptHandler() {
        int i = 2 % 2;
        x xVar = new x(11);
        xVar.IconCompatParcelizer = (getScrollCaptureInProgress) this.MediaBrowserCompatMediaItem;
        DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler((getCanScrollVertically) this.MediaDescriptionCompat, (Key) this.MediaMetadataCompat, xVar, (AlgorithmParameterSpec) this.RatingCompat, 0);
        int i2 = PlaybackStateCompat + 15;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return defaultDecryptHandler;
    }

    @Override // o.ScrollCapture_androidKt
    public ScrollCaptureonScrollCaptureSearch1 getEncryptHandler() {
        int i = 2 % 2;
        x xVar = new x(11);
        xVar.IconCompatParcelizer = (getScrollCaptureInProgress) this.MediaBrowserCompatMediaItem;
        DefaultDecryptHandler defaultDecryptHandler = new DefaultDecryptHandler((getCanScrollVertically) this.MediaDescriptionCompat, (Key) this.MediaMetadataCompat, xVar, (AlgorithmParameterSpec) this.RatingCompat, 1);
        int i2 = PlaybackStateCompat + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return defaultDecryptHandler;
    }

    public void RemoteActionCompatParcelizer(forEach foreach) {
        int i = 2 % 2;
        Handler handler = (Handler) this.MediaDescriptionCompat;
        int i2 = foreach.write;
        if (i2 == -2) {
            int i3 = PlaybackStateCompat + 85;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i2 > 0) {
            int i4 = MediaSessionCompatQueueItem + 9;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(foreach);
        handler.sendMessageDelayed(Message.obtain(handler, 0, foreach), i2);
        int i6 = PlaybackStateCompat + 115;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public void RemoteActionCompatParcelizer(int i) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 73;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0 ? i != 12 : i != 10) {
            if (i != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
            }
        }
        this.MediaDescriptionCompat = Integer.valueOf(i);
        int i4 = PlaybackStateCompat + 51;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void MediaSessionCompatToken() {
        int i = 2 % 2;
        forEach foreach = (forEach) this.RatingCompat;
        Object obj = null;
        if (foreach != null) {
            int i2 = PlaybackStateCompat + 125;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.MediaMetadataCompat = foreach;
                this.RatingCompat = null;
                obj.hashCode();
                throw null;
            }
            this.MediaMetadataCompat = foreach;
            this.RatingCompat = null;
            SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) foreach.read.get();
            if (subcomposeMeasureScope != null) {
                Handler handler = getSetRootui.MediaDescriptionCompat;
                handler.sendMessage(handler.obtainMessage(0, subcomposeMeasureScope.RemoteActionCompatParcelizer));
                return;
            }
            this.MediaMetadataCompat = null;
        }
        int i3 = MediaSessionCompatQueueItem + 55;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public getNumPadMoveHomeEK5gGoQ IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 71;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((HashMap) this.MediaMetadataCompat).containsKey(str);
            obj.hashCode();
            throw null;
        }
        HashMap map = (HashMap) this.MediaMetadataCompat;
        if (map.containsKey(str)) {
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) map.get(str);
            int i3 = MediaSessionCompatQueueItem + 21;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return getnumpadmovehomeek5ggoq;
            }
            obj.hashCode();
            throw null;
        }
        TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) this.MediaBrowserCompatMediaItem;
        if (transitionValuesMaps == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " is not defined"));
            return null;
        }
        int i4 = PlaybackStateCompat + 45;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return transitionValuesMaps.IconCompatParcelizer(str);
        }
        int i5 = 62 / 0;
        return transitionValuesMaps.IconCompatParcelizer(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0039  */
    public getNumPadMoveHomeEK5gGoQ serializer(TransitionValuesMaps transitionValuesMaps, getZEK5gGoQ... getzek5ggoqArr) {
        int i = 2 % 2;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        int i2 = PlaybackStateCompat + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (getZEK5gGoQ getzek5ggoq : getzek5ggoqArr) {
            int i4 = MediaSessionCompatQueueItem + 31;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getnumpadmovehomeek5ggoqWrite = RxCompletableKt.write(getzek5ggoq);
            getTvInputComposite2EK5gGoQ.write((TransitionValuesMaps) this.MediaMetadataCompat);
            if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadRightParenthesisEK5gGoQ) {
                getnumpadmovehomeek5ggoqWrite = ((zzz) this.MediaBrowserCompatMediaItem).write(transitionValuesMaps, getnumpadmovehomeek5ggoqWrite);
            } else {
                int i6 = MediaSessionCompatQueueItem + 111;
                PlaybackStateCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadMoveEndEK5gGoQ) {
                    getnumpadmovehomeek5ggoqWrite = ((zzz) this.MediaBrowserCompatMediaItem).write(transitionValuesMaps, getnumpadmovehomeek5ggoqWrite);
                }
            }
        }
        return getnumpadmovehomeek5ggoqWrite;
    }

    public OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 RemoteActionCompatParcelizer(handleOnBackPressed handleonbackpressed) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 75;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ArrayList arrayList = (ArrayList) this.MediaMetadataCompat;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = MediaSessionCompatQueueItem + 55;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 = (OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0) arrayList.get(i4);
            if (onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 != null && onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0.IconCompatParcelizer == handleonbackpressed) {
                int i7 = MediaSessionCompatQueueItem + 91;
                PlaybackStateCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda1 = new OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0((Context) this.MediaDescriptionCompat, handleonbackpressed);
        arrayList.add(onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda1);
        return onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda1;
    }

    @Override // o.handleOnBackStarted
    public boolean RemoteActionCompatParcelizer(handleOnBackPressed handleonbackpressed, Menu menu) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 91;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer(handleonbackpressed);
            throw null;
        }
        ActionMode.Callback callback = (ActionMode.Callback) this.MediaBrowserCompatMediaItem;
        OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(handleonbackpressed);
        processDragGesture processdraggesture = (processDragGesture) this.RatingCompat;
        Menu menu2 = (Menu) processdraggesture.get(menu);
        if (menu2 == null) {
            onContentChanged oncontentchanged = new onContentChanged((Context) this.MediaDescriptionCompat, (AlertControllerButtonHandler) menu);
            processdraggesture.put(menu, oncontentchanged);
            int i3 = MediaSessionCompatQueueItem + 33;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            menu2 = oncontentchanged;
        }
        return callback.onPrepareActionMode(onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0RemoteActionCompatParcelizer, menu2);
    }

    @Override // o.handleOnBackStarted
    public boolean read(handleOnBackPressed handleonbackpressed, Menu menu) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 33;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer(handleonbackpressed);
            throw null;
        }
        ActionMode.Callback callback = (ActionMode.Callback) this.MediaBrowserCompatMediaItem;
        OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(handleonbackpressed);
        processDragGesture processdraggesture = (processDragGesture) this.RatingCompat;
        Menu menu2 = (Menu) processdraggesture.get(menu);
        if (menu2 == null) {
            onContentChanged oncontentchanged = new onContentChanged((Context) this.MediaDescriptionCompat, (AlertControllerButtonHandler) menu);
            processdraggesture.put(menu, oncontentchanged);
            menu2 = oncontentchanged;
        }
        boolean zOnCreateActionMode = callback.onCreateActionMode(onBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0RemoteActionCompatParcelizer, menu2);
        int i3 = PlaybackStateCompat + 7;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zOnCreateActionMode;
    }

    public getNumPadMoveHomeEK5gGoQ serializer(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 5;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = ((zzz) this.MediaDescriptionCompat).write(this, getnumpadmovehomeek5ggoq);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return getnumpadmovehomeek5ggoqWrite;
    }

    public void write(getFourEK5gGoQ getfourek5ggoq) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 27;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((ArrayList) this.MediaMetadataCompat).add(getfourek5ggoq);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    @Override // o.getSwitchMinWidth
    public void IconCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        int i = 2 % 2;
        if (((onDrawWithContent) this.MediaMetadataCompat) != null) {
            int i2 = PlaybackStateCompat + 61;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                totalCaptureResult.getRequest();
                throw null;
            }
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.RatingCompat;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            ((onDrawWithContent) this.MediaMetadataCompat).RemoteActionCompatParcelizer(null);
            this.MediaMetadataCompat = null;
            this.RatingCompat = null;
            int i3 = MediaSessionCompatQueueItem + 53;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }

    public boolean IconCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 115;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((Boolean) this.MediaDescriptionCompat) == null) {
            boolean z = false;
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                int i4 = PlaybackStateCompat + 27;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    z = true;
                }
            }
            this.MediaDescriptionCompat = Boolean.valueOf(z);
        }
        if (!((Boolean) this.MediaDescriptionCompat).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.MediaDescriptionCompat).booleanValue();
    }

    public void RemoteActionCompatParcelizer(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        TransitionValuesMaps transitionValuesMaps;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 37;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HashMap map = (HashMap) this.MediaMetadataCompat;
        if (!map.containsKey(str) && (transitionValuesMaps = (TransitionValuesMaps) this.MediaBrowserCompatMediaItem) != null && transitionValuesMaps.serializer(str)) {
            transitionValuesMaps.RemoteActionCompatParcelizer(str, getnumpadmovehomeek5ggoq);
            return;
        }
        if (((HashMap) this.RatingCompat).containsKey(str)) {
            return;
        }
        if (getnumpadmovehomeek5ggoq == null) {
            map.remove(str);
            return;
        }
        map.put(str, getnumpadmovehomeek5ggoq);
        int i4 = MediaSessionCompatQueueItem + 79;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public boolean RemoteActionCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 75;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
            if (((Boolean) this.MediaMetadataCompat) == null) {
                this.MediaMetadataCompat = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
            }
        } else if (((Boolean) this.MediaMetadataCompat) == null) {
            this.MediaMetadataCompat = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.MediaDescriptionCompat).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
            int i4 = PlaybackStateCompat + 37;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return ((Boolean) this.MediaMetadataCompat).booleanValue();
    }

    public ensureSubscribedToInAppMessageEventslambda7 fromCongestionSeverityType(CongestionSeverityType congestionSeverityType) {
        int i = 2 % 2;
        congestionSeverityType.getClass();
        int i2 = CongestionRangeGroup$WhenMappings.$EnumSwitchMapping$0[congestionSeverityType.ordinal()];
        if (i2 == 1) {
            return (ensureSubscribedToInAppMessageEventslambda7) this.MediaBrowserCompatMediaItem;
        }
        int i3 = PlaybackStateCompat;
        int i4 = i3 + 17;
        int i5 = i4 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i5;
        int i6 = i4 % 2;
        if (i2 == 2) {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) this.MediaDescriptionCompat;
            int i7 = i5 + 7;
            PlaybackStateCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return ensuresubscribedtoinappmessageeventslambda7;
        }
        Object obj = null;
        if (i2 == 3) {
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = (ensureSubscribedToInAppMessageEventslambda7) this.MediaMetadataCompat;
            int i9 = i3 + 37;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return ensuresubscribedtoinappmessageeventslambda8;
            }
            obj.hashCode();
            throw null;
        }
        int i10 = i3 + 39;
        MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0 ? i2 == 4 : i2 == 2) {
            return (ensureSubscribedToInAppMessageEventslambda7) this.RatingCompat;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public getForwardEK5gGoQ PlaybackStateCompat() {
        int i = 2 % 2;
        getForwardEK5gGoQ getforwardek5ggoq = new getForwardEK5gGoQ((ArrayList) this.MediaBrowserCompatMediaItem, (ArrayList) this.MediaDescriptionCompat, (ArrayList) this.MediaMetadataCompat, (ArrayList) this.RatingCompat);
        int i2 = MediaSessionCompatQueueItem + 49;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getforwardek5ggoq;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void read(int i) throws InvalidAlgorithmParameterException {
        int i2 = 2 % 2;
        if (this.read != 20) {
            this.MediaBrowserCompatMediaItem = Integer.valueOf(i);
            return;
        }
        if (i != 16 && i != 24) {
            int i3 = MediaSessionCompatQueueItem + 107;
            int i4 = i3 % Fields.SpotShadowColor;
            PlaybackStateCompat = i4;
            int i5 = i3 % 2;
            if (i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            int i6 = i4 + 53;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        this.MediaBrowserCompatMediaItem = Integer.valueOf(i);
        int i8 = PlaybackStateCompat + 69;
        MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public fillSnake IconCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = MediaSessionCompatQueueItem + 111;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        Map map = (Map) this.MediaDescriptionCompat;
        List list = (List) this.MediaBrowserCompatMediaItem;
        if (i2 == 0) {
            return getOnVectorMutated.IconCompatParcelizer;
        }
        if (i2 == 1) {
            Object obj = list.get(i);
            getVector getvector = new getVector(obj, map.get(obj), null, null);
            int i6 = PlaybackStateCompat + 7;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return getvector;
        }
        int i8 = i2 / 2;
        int i9 = i + i8;
        fillSnake fillsnakeIconCompatParcelizer = IconCompatParcelizer(i, i8);
        fillSnake fillsnakeIconCompatParcelizer2 = IconCompatParcelizer(i9 + 1, i8);
        Object obj2 = list.get(i9);
        return new getVector(obj2, map.get(obj2), fillsnakeIconCompatParcelizer, fillsnakeIconCompatParcelizer2);
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 69;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read != 14) {
            return super.toString();
        }
        String str = "<path stroke-width=\"" + ((Integer) this.MediaDescriptionCompat) + "\" d=\"" + ((Object) 'M') + ((o.Key) this.MediaMetadataCompat) + ((CharSequence) this.MediaBrowserCompatMediaItem) + "\"/>";
        int i4 = PlaybackStateCompat + 115;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public CongestionSeverityType fromCongestionValue$navigation_release(int i) {
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompat + 65;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) this.MediaBrowserCompatMediaItem;
        int i5 = ensuresubscribedtoinappmessageeventslambda7.write;
        if (i <= ensuresubscribedtoinappmessageeventslambda7.read && i5 <= i) {
            CongestionSeverityType congestionSeverityType = CongestionSeverityType.LOW;
            int i6 = PlaybackStateCompat + 109;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return congestionSeverityType;
            }
            throw null;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = (ensureSubscribedToInAppMessageEventslambda7) this.MediaDescriptionCompat;
        int i7 = ensuresubscribedtoinappmessageeventslambda8.write;
        if (i <= ensuresubscribedtoinappmessageeventslambda8.read && i7 <= i) {
            int i8 = PlaybackStateCompat + 33;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            CongestionSeverityType congestionSeverityType2 = CongestionSeverityType.MODERATE;
            int i10 = MediaSessionCompatQueueItem + 17;
            PlaybackStateCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return congestionSeverityType2;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9 = (ensureSubscribedToInAppMessageEventslambda7) this.MediaMetadataCompat;
        int i12 = ensuresubscribedtoinappmessageeventslambda9.write;
        if (i <= ensuresubscribedtoinappmessageeventslambda9.read && i12 <= i) {
            int i13 = PlaybackStateCompat + 3;
            MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return CongestionSeverityType.HEAVY;
        }
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10 = (ensureSubscribedToInAppMessageEventslambda7) this.RatingCompat;
        int i15 = ensuresubscribedtoinappmessageeventslambda10.write;
        if (i <= ensuresubscribedtoinappmessageeventslambda10.read) {
            int i16 = PlaybackStateCompat + 57;
            MediaSessionCompatQueueItem = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if (i15 <= i) {
                return CongestionSeverityType.SEVERE;
            }
        }
        return CongestionSeverityType.LOW;
    }

    public void RemoteActionCompatParcelizer(applyDiff applydiff, int i, int i2) {
        executeDiff calculatediff;
        int i3 = 2 % 2;
        int i4 = PlaybackStateCompat + 33;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        fillSnake fillsnakeIconCompatParcelizer = IconCompatParcelizer(i2 + 1, i - 1);
        Object obj = ((List) this.MediaBrowserCompatMediaItem).get(i2);
        applyDiff applydiff2 = applyDiff.RED;
        Map map = (Map) this.MediaDescriptionCompat;
        if (applydiff == applydiff2) {
            calculatediff = new calculateDiff(obj, map.get(obj), null, fillsnakeIconCompatParcelizer);
        } else {
            getVector getvector = new getVector(obj, map.get(obj), null, fillsnakeIconCompatParcelizer);
            int i6 = PlaybackStateCompat + 57;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            calculatediff = getvector;
        }
        if (((executeDiff) this.MediaMetadataCompat) == null) {
            this.MediaMetadataCompat = calculatediff;
            this.RatingCompat = calculatediff;
        } else {
            ((executeDiff) this.RatingCompat).write(calculatediff);
            this.RatingCompat = calculatediff;
        }
    }

    public void read(List list) {
        int i = 2 % 2;
        Iterator it = list.iterator();
        int i2 = MediaSessionCompatQueueItem + 117;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = false;
        while (it.hasNext()) {
            offsetFromEdgeMKHz9U offsetfromedgemkhz9u = (offsetFromEdgeMKHz9U) it.next();
            nodeUpdated nodeupdated = (nodeUpdated) ((HashMap) this.MediaDescriptionCompat).get(offsetfromedgemkhz9u.MediaMetadataCompat);
            if (nodeupdated != null) {
                int i4 = PlaybackStateCompat + 79;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    nodeupdated.write.iterator();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Iterator it2 = nodeupdated.write.iterator();
                while (it2.hasNext()) {
                    if (!(!((accesssetDrawBlockCanvasp) it2.next()).RemoteActionCompatParcelizer(offsetfromedgemkhz9u))) {
                        z = true;
                    }
                }
                nodeupdated.RemoteActionCompatParcelizer = offsetfromedgemkhz9u;
            }
        }
        if (z) {
            RatingCompat();
        }
    }

    public updateClipPath RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.MediaMetadataCompat;
        updateClipPath updateclippath = (updateClipPath) linkedHashMap.get(str);
        if (updateclippath == null) {
            int i2 = PlaybackStateCompat + 101;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0 ? linkedHashMap.size() >= 64 : linkedHashMap.size() >= 51) {
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    int i3 = PlaybackStateCompat + 47;
                    MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                    Object obj = null;
                    if (i3 % 2 != 0) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        value.getClass();
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = ((updateClipPath) value).write;
                        obj.hashCode();
                        throw null;
                    }
                    Object value2 = ((Map.Entry) it.next()).getValue();
                    value2.getClass();
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = ((updateClipPath) value2).write;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                        int i4 = MediaSessionCompatQueueItem + 91;
                        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                    }
                    it.remove();
                    int i6 = MediaSessionCompatQueueItem + 15;
                    PlaybackStateCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                }
            }
            updateclippath = new updateClipPath();
            linkedHashMap.put(str, updateclippath);
            int i8 = PlaybackStateCompat + 99;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        int i10 = PlaybackStateCompat + 65;
        MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return updateclippath;
    }

    @Override // o.getSwitchMinWidth
    public void write(float f, onDrawWithContent ondrawwithcontent) {
        int i = 2 % 2;
        Rect rect = (Rect) ((getThumbTintList) this.MediaBrowserCompatMediaItem).write(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float fWidth = rect.width() / f;
        float fHeight = rect.height() / f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        this.MediaDescriptionCompat = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) this.MediaMetadataCompat;
        if (ondrawwithcontent2 != null) {
            ondrawwithcontent2.serializer(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.RatingCompat = (Rect) this.MediaDescriptionCompat;
        this.MediaMetadataCompat = ondrawwithcontent;
        int i2 = PlaybackStateCompat + 27;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static backward4l5_RBY write(List list, Map map, Comparator comparator) {
        boolean z;
        int i = 2 % 2;
        TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps(list, map);
        Collections.sort(list, comparator);
        NodeChain nodeChain = new NodeChain(list.size());
        int i2 = nodeChain.serializer - 1;
        int size = list.size();
        while (i2 >= 0) {
            int i3 = MediaSessionCompatQueueItem + 51;
            PlaybackStateCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if ((((long) (1 << i2)) & nodeChain.write) == 0) {
                z = true;
            } else {
                int i5 = PlaybackStateCompat + 123;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = false;
            }
            int iPow = (int) Math.pow(2.0d, i2);
            i2--;
            size -= iPow;
            if (!z) {
                transitionValuesMaps.RemoteActionCompatParcelizer(applyDiff.BLACK, iPow, size);
                size -= iPow;
                transitionValuesMaps.RemoteActionCompatParcelizer(applyDiff.RED, iPow, size);
            } else {
                int i7 = MediaSessionCompatQueueItem + 101;
                PlaybackStateCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                transitionValuesMaps.RemoteActionCompatParcelizer(applyDiff.BLACK, iPow, size);
            }
        }
        fillSnake fillsnake = (executeDiff) transitionValuesMaps.MediaMetadataCompat;
        if (fillsnake == null) {
            fillsnake = getOnVectorMutated.IconCompatParcelizer;
        }
        return new backward4l5_RBY(fillsnake, comparator);
    }

    public void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        Uri data = ((Intent) this.MediaMetadataCompat).getData();
        try {
            getContactsEK5gGoQ getcontactsek5ggoq = (getContactsEK5gGoQ) this.RatingCompat;
            getcontactsek5ggoq.MediaBrowserCompatMediaItem.execute(new zza(getcontactsek5ggoq, data, false, 12));
            Context context = (Context) this.MediaDescriptionCompat;
            String string = context.getResources().getString(R.string.tagmanager_preview_dialog_title);
            String string2 = context.getResources().getString(R.string.tagmanager_preview_dialog_message);
            String string3 = context.getResources().getString(R.string.tagmanager_preview_dialog_button);
            AlertDialog alertDialogCreate = new AlertDialog.Builder((Context) this.MediaBrowserCompatMediaItem).create();
            alertDialogCreate.setTitle(string);
            alertDialogCreate.setMessage(string2);
            alertDialogCreate.setButton(-1, string3, new getButtonSelectEK5gGoQ(this));
            alertDialogCreate.show();
            int i2 = PlaybackStateCompat + 119;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            getButtonThumbLeftEK5gGoQ.write("Calling preview threw an exception: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public getNumPadMoveHomeEK5gGoQ write(getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq) {
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite;
        Iterator itMediaBrowserCompatMediaItem;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 71;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getnumpadmovehomeek5ggoqWrite = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
            itMediaBrowserCompatMediaItem = getnumpaddirectionupek5ggoq.MediaBrowserCompatMediaItem();
            int i3 = 15 / 0;
        } else {
            getnumpadmovehomeek5ggoqWrite = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
            itMediaBrowserCompatMediaItem = getnumpaddirectionupek5ggoq.MediaBrowserCompatMediaItem();
        }
        while (itMediaBrowserCompatMediaItem.hasNext()) {
            getnumpadmovehomeek5ggoqWrite = ((zzz) this.MediaDescriptionCompat).write(this, getnumpaddirectionupek5ggoq.IconCompatParcelizer(((Integer) itMediaBrowserCompatMediaItem.next()).intValue()));
            if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadEqualsEK5gGoQ) {
                int i4 = MediaSessionCompatQueueItem + 123;
                PlaybackStateCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                break;
            }
        }
        return getnumpadmovehomeek5ggoqWrite;
    }

    public void serializer(getFourEK5gGoQ getfourek5ggoq) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((ArrayList) this.MediaDescriptionCompat).add(getfourek5ggoq);
        int i4 = PlaybackStateCompat + 123;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void ParcelableVolumeInfo() {
        int itemCount;
        int i;
        int i2 = 2 % 2;
        isInfiniteimpl isinfiniteimpl = (isInfiniteimpl) this.MediaDescriptionCompat;
        isInfiniteimpl isinfiniteimpl2 = (isInfiniteimpl) this.MediaBrowserCompatMediaItem;
        ViewPager2 viewPager2 = (ViewPager2) this.RatingCompat;
        int i3 = android.R.id.accessibilityActionPageLeft;
        FocusPropertiesNode.read(android.R.id.accessibilityActionPageLeft, viewPager2);
        boolean z = false;
        FocusPropertiesNode.serializer(0, viewPager2);
        FocusPropertiesNode.read(android.R.id.accessibilityActionPageRight, viewPager2);
        FocusPropertiesNode.serializer(0, viewPager2);
        FocusPropertiesNode.read(android.R.id.accessibilityActionPageUp, viewPager2);
        FocusPropertiesNode.serializer(0, viewPager2);
        FocusPropertiesNode.read(android.R.id.accessibilityActionPageDown, viewPager2);
        FocusPropertiesNode.serializer(0, viewPager2);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0) {
            return;
        }
        if (!viewPager2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            int i4 = PlaybackStateCompat + 25;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.write < itemCount - 1) {
                FocusPropertiesNode.read(viewPager2, new FocusRestorerNode(android.R.id.accessibilityActionPageDown, (String) null), isinfiniteimpl2);
            }
            if (viewPager2.write > 0) {
                FocusPropertiesNode.read(viewPager2, new FocusRestorerNode(android.R.id.accessibilityActionPageUp, (String) null), isinfiniteimpl);
                return;
            }
            return;
        }
        int i6 = MediaSessionCompatQueueItem + 13;
        PlaybackStateCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (viewPager2.MediaMetadataCompat.ensureViewModelStore.getLayoutDirection() == 1) {
            int i8 = MediaSessionCompatQueueItem + 19;
            PlaybackStateCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        }
        if (z) {
            int i10 = PlaybackStateCompat;
            int i11 = i10 + 121;
            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = i10 + 125;
            MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i = 16908360;
        } else {
            i = 16908361;
        }
        if (z) {
            i3 = 16908361;
        }
        if (viewPager2.write < itemCount - 1) {
            FocusPropertiesNode.read(viewPager2, new FocusRestorerNode(i, (String) null), isinfiniteimpl2);
        }
        if (viewPager2.write > 0) {
            FocusPropertiesNode.read(viewPager2, new FocusRestorerNode(i3, (String) null), isinfiniteimpl);
        }
    }

    public TransitionValuesMaps(Intent intent, Context context, Context context2, getContactsEK5gGoQ getcontactsek5ggoq) {
        this.read = 15;
        this.MediaBrowserCompatMediaItem = context;
        this.MediaDescriptionCompat = context2;
        this.MediaMetadataCompat = intent;
        this.RatingCompat = getcontactsek5ggoq;
    }

    public TransitionValuesMaps(getCanScrollVertically getcanscrollvertically, getScrollCaptureInProgress getscrollcaptureinprogress, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        this.read = 25;
        this.MediaDescriptionCompat = getcanscrollvertically;
        this.MediaBrowserCompatMediaItem = getscrollcaptureinprogress;
        this.MediaMetadataCompat = key;
        this.RatingCompat = algorithmParameterSpec;
    }

    public TransitionValuesMaps(String str) throws UcsException {
        this.read = 27;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("\\.");
            try {
                byte[] bArrIconCompatParcelizer = accessgetButtoncp.IconCompatParcelizer(8, strArrSplit[0]);
                Charset charset = StandardCharsets.UTF_8;
                JSONObject jSONObject = new JSONObject(new String(bArrIconCompatParcelizer, charset));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x5c");
                String[] strArr = {jSONArrayOptJSONArray.optString(0), jSONArrayOptJSONArray.optString(1)};
                H$b h$b = new H$b(1);
                this.MediaBrowserCompatMediaItem = h$b;
                h$b.serializer = jSONObject.getString("alg");
                ((H$b) this.MediaBrowserCompatMediaItem).write = strArr;
                try {
                    JSONObject jSONObject2 = new JSONObject(new String(accessgetButtoncp.IconCompatParcelizer(8, strArrSplit[1]), charset));
                    prune pruneVar = new prune();
                    this.MediaDescriptionCompat = pruneVar;
                    pruneVar.RemoteActionCompatParcelizer = jSONObject2.getString("component");
                    ((prune) this.MediaDescriptionCompat).IconCompatParcelizer = jSONObject2.getInt("version");
                    try {
                        this.MediaMetadataCompat = accessgetButtoncp.IconCompatParcelizer(8, strArrSplit[2]);
                        this.RatingCompat = str.substring(0, str.lastIndexOf("."));
                        int i = MediaSessionCompatQueueItem + 113;
                        PlaybackStateCompat = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            int i2 = 83 / 0;
                            return;
                        }
                        return;
                    } catch (UcsException e) {
                        StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("Fail to convert jws string to Content, ");
                        sbIconCompatParcelizer.append(e.getMessage());
                        throw new UcsException(1012L, sbIconCompatParcelizer.toString());
                    }
                } catch (RuntimeException | JSONException e2) {
                    throw new UcsException(1012L, MediaSessionCompatQueueItem.read(e2, accessgetSwitchcp.IconCompatParcelizer("Fail to convert jws string to payload, ")));
                }
            } catch (RuntimeException | JSONException e3) {
                throw new UcsException(1012L, MediaSessionCompatQueueItem.read(e3, accessgetSwitchcp.IconCompatParcelizer("Fail to convert jws string to header, ")));
            }
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1012L, "ComponentJws is empty.");
        throw null;
    }

    public static final List access$parse(TransitionValuesMaps transitionValuesMaps, ArrayList arrayList, long j) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = PlaybackStateCompat + 57;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (Object obj : arrayList) {
            int i4 = PlaybackStateCompat + 117;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String responseUuid = ((RouteInterface) obj).getResponseUuid();
            Object arrayList2 = linkedHashMap.get(responseUuid);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(responseUuid, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new LayerUtils$getLayer$source$2(list, 8, transitionValuesMaps));
            List<RouteInterface> list2 = list;
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            for (RouteInterface routeInterface : list2) {
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) transitionValuesMaps.MediaBrowserCompatMediaItem;
                String routeId = routeInterface.getRouteId();
                routeId.getClass();
                NavigationRoute navigationRoute = (NavigationRoute) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(routeId);
                if (navigationRoute == null) {
                    DirectionsResponseParsingResult directionsResponseParsingResult = (DirectionsResponseParsingResult) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    ArrayList arrayList5 = directionsResponseParsingResult.routesParsingResult;
                    DirectionsRouteModelParsingResult directionsRouteModelParsingResult = (DirectionsRouteModelParsingResult) onContentCardDismissed.read(routeInterface.getRouteIndex(), arrayList5);
                    Integer numRefreshTtl = directionsRouteModelParsingResult != null ? zzmb.refreshTtl(directionsRouteModelParsingResult.data.route) : null;
                    RouteOptions routeOptions = directionsResponseParsingResult.routeOptions;
                    DirectionsParsedRouteData directionsParsedRouteData = ((DirectionsRouteModelParsingResult) arrayList5.get(routeInterface.getRouteIndex())).data;
                    navigationRoute = new NavigationRoute(directionsParsedRouteData.route, directionsParsedRouteData.routesWaypoint, directionsParsedRouteData.responseOriginAPI, routeOptions, routeInterface, numRefreshTtl != null ? Long.valueOf(((long) numRefreshTtl.intValue()) + j) : null, ((DirectionsRouteModelParsingResult) arrayList5.get(routeInterface.getRouteIndex())).operations);
                }
                arrayList4.add(navigationRoute);
            }
            arrayList3.add(arrayList4);
        }
        return onContentCardDismissed.serializer(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList3), new h$c(4, arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (((o.calculateSemanticsConfiguration) r7.MediaMetadataCompat) != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1.intValue() < 16) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r1 = androidx.transition.TransitionValuesMaps.PlaybackStateCompat + 95;
        androidx.transition.TransitionValuesMaps.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        r1 = (java.lang.Integer) r7.MediaDescriptionCompat;
        r3 = r1.intValue();
        r4 = (o.calculateSemanticsConfiguration) r7.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r3 < 10) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r5 = androidx.transition.TransitionValuesMaps.MediaSessionCompatQueueItem + 123;
        androidx.transition.TransitionValuesMaps.PlaybackStateCompat = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r4 != o.calculateSemanticsConfiguration.MediaSessionCompatQueueItem) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r3 > 20) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r4 != o.calculateSemanticsConfiguration.MediaMetadataCompat) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r3 > 28) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r4 != o.calculateSemanticsConfiguration.RatingCompat) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        r2 = androidx.transition.TransitionValuesMaps.MediaSessionCompatQueueItem + 97;
        androidx.transition.TransitionValuesMaps.PlaybackStateCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if ((r2 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        if (r3 > 90) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r3 > 32) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r4 != o.calculateSemanticsConfiguration.MediaDescriptionCompat) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r2 = androidx.transition.TransitionValuesMaps.PlaybackStateCompat + 61;
        androidx.transition.TransitionValuesMaps.MediaSessionCompatQueueItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if ((r2 % 2) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r3 > 5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r3 > 48) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        if (r4 != o.calculateSemanticsConfiguration.MediaSessionCompatToken) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        if (r3 > 64) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        return new o.accessgetDummyViewConfigurationcp(((java.lang.Integer) r7.MediaBrowserCompatMediaItem).intValue(), ((java.lang.Integer) r7.MediaDescriptionCompat).intValue(), (o.calculateSemanticsConfiguration) r7.RatingCompat, (o.calculateSemanticsConfiguration) r7.MediaMetadataCompat);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010f, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        o.getAlignmentLinesMap.write("unknown hash type; must be SHA256, SHA384 or SHA512");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0115, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
    
        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0139, code lost:
    
        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 16 bytes", (java.lang.Integer) r7.MediaBrowserCompatMediaItem));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
    
        o.getAlignmentLinesMap.write("hash type is not set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (((o.calculateSemanticsConfiguration) r7.MediaMetadataCompat) != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.accessgetDummyViewConfigurationcp MediaMetadataCompat() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionValuesMaps.MediaMetadataCompat():o.accessgetDummyViewConfigurationcp");
    }

    public HitTestResultKt MediaBrowserCompatMediaItem() throws GeneralSecurityException {
        int i = 2 % 2;
        Integer num = (Integer) this.MediaBrowserCompatMediaItem;
        if (num == null) {
            getAlignmentLinesMap.write("Key size is not set");
            return null;
        }
        if (((Integer) this.MediaDescriptionCompat) == null) {
            getAlignmentLinesMap.write("IV size is not set");
            return null;
        }
        int i2 = MediaSessionCompatQueueItem + 111;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((Integer) this.MediaMetadataCompat) == null) {
            getAlignmentLinesMap.write("Tag size is not set");
            return null;
        }
        HitTestResultKt hitTestResultKt = new HitTestResultKt(num.intValue(), ((Integer) this.MediaDescriptionCompat).intValue(), ((Integer) this.MediaMetadataCompat).intValue(), (HitTestResultSubList) this.RatingCompat);
        int i4 = MediaSessionCompatQueueItem + 49;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return hitTestResultKt;
    }

    public TransitionValuesMaps(TransitionValuesMaps transitionValuesMaps, zzz zzzVar) {
        this.read = 18;
        this.MediaMetadataCompat = new HashMap();
        this.RatingCompat = new HashMap();
        this.MediaBrowserCompatMediaItem = transitionValuesMaps;
        this.MediaDescriptionCompat = zzzVar;
    }

    public TransitionValuesMaps(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10) {
        this.read = 29;
        ensuresubscribedtoinappmessageeventslambda7.getClass();
        ensuresubscribedtoinappmessageeventslambda8.getClass();
        ensuresubscribedtoinappmessageeventslambda9.getClass();
        ensuresubscribedtoinappmessageeventslambda10.getClass();
        this.MediaBrowserCompatMediaItem = ensuresubscribedtoinappmessageeventslambda7;
        this.MediaDescriptionCompat = ensuresubscribedtoinappmessageeventslambda8;
        this.MediaMetadataCompat = ensuresubscribedtoinappmessageeventslambda9;
        this.RatingCompat = ensuresubscribedtoinappmessageeventslambda10;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 65;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        if (i4 == 10) {
            HistoryFragment historyFragment = (HistoryFragment) obj;
            getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem;
            historyFragment.initializeViewTreeOwners = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
            historyFragment.MediaMetadataCompat = getstyleable_vector_drawable_group_rotation.getLifecycle();
            historyFragment.MediaBrowserCompatMediaItem = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getDataStoreFileName) this.RatingCompat);
            historyFragment.read = new BrazeExternalSyntheticLambda28((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation.toClipEntry.write(), 13);
            historyFragment.RemoteActionCompatParcelizer = new jsonStringToList(new jsonStringToStringMap(new jsonStringToStringMap()));
            int i5 = MediaSessionCompatQueueItem + 9;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 63 / 0;
                return;
            }
            return;
        }
        if (i4 == 11) {
            IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) obj;
            getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem;
            identityVerificationActivity._init_lambda1 = getstyleable_vector_drawable_group_rotation2.PlaybackStateCompatCustomAction();
            identityVerificationActivity.MediaSessionCompatToken = new getStatusBarBackground(new SendTestPushUseCase());
            int iIconCompatParcelizer = n5.IconCompatParcelizer();
            int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
            identityVerificationActivity.PlaybackStateCompat = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation2}, n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2);
            identityVerificationActivity.ParcelableVolumeInfo = (getScrimColor) ((getDoubleOrNull) this.MediaMetadataCompat).write;
            identityVerificationActivity.MediaSessionCompatQueueItem = new ImageCaptureUseCaseImpl(0);
            identityVerificationActivity.MediaDescriptionCompat = (getSuggestedMinimumWidth) ((getDoubleOrNull) this.RatingCompat).write;
            identityVerificationActivity.MediaSessionCompatResultReceiverWrapper = new getTransactionExecutor();
            identityVerificationActivity.PlaybackStateCompatCustomAction = (SemanticsOwner) getstyleable_vector_drawable_group_rotation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write();
            identityVerificationActivity.RatingCompat = (SemanticsOwnerKt) getstyleable_vector_drawable_group_rotation2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
            identityVerificationActivity.MediaBrowserCompatMediaItem = (requestGeofences) getstyleable_vector_drawable_group_rotation2.ImageCaptureException.write();
            return;
        }
        SettingsFragment settingsFragment = (SettingsFragment) obj;
        settingsFragment.initializeViewTreeOwners = ((E$b) this.MediaDescriptionCompat).read();
        settingsFragment.read = new getSdkEnablementProviderandroid_sdk_base_release(8);
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation3 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.MediaBrowserCompatMediaItem;
        int iIconCompatParcelizer3 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer4 = n5.IconCompatParcelizer();
        settingsFragment.MediaSessionCompatToken = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer3, n5.IconCompatParcelizer(), iIconCompatParcelizer4);
        settingsFragment.IconCompatParcelizer = new setType(getstyleable_vector_drawable_group_rotation3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        settingsFragment.serializer = getstyleable_vector_drawable_group_rotation3.getDefaultViewModelProviderFactory();
        settingsFragment.MediaMetadataCompat = getstyleable_vector_drawable_group_rotation3.getLifecycle();
        settingsFragment.RatingCompat = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdaG9rB9GwnhH4FGsWkARoJWjtnPDI) this.MediaMetadataCompat);
        settingsFragment.RemoteActionCompatParcelizer = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) this.RatingCompat);
        decode decodeVar = (decode) getstyleable_vector_drawable_group_rotation3.setItemInvoker.write();
        QualtricsManagerImpl qualtricsManagerImpl = (QualtricsManagerImpl) getstyleable_vector_drawable_group_rotation3.accessprocessDragStart.write();
        decodeVar.getClass();
        qualtricsManagerImpl.getClass();
        settingsFragment.MediaSessionCompatQueueItem = new subscribeToChangeUserEventslambda1(0);
        settingsFragment.MediaBrowserCompatMediaItem = new r8lambdaRTIvhvu27JBv_zhnPEAt2ZGU();
    }

    public SurfaceRequest IconCompatParcelizer(int i) {
        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkSerializer;
        Object next;
        AnimatedVisibilityKt animatedVisibilityKt;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirkWrite;
        int i2;
        int i3 = 2 % 2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.RatingCompat;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            return (SurfaceRequest) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = ((List) this.MediaDescriptionCompat).iterator();
        while (true) {
            previewOrientationIncorrectQuirkSerializer = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = MediaSessionCompatQueueItem + 13;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                next = it.next();
                AnimatedVisibilityKt animatedVisibilityKt2 = (AnimatedVisibilityKt) next;
                animatedVisibilityKt2.getClass();
                if (animatedVisibilityKt2.RemoteActionCompatParcelizer(1) == i) {
                    break;
                }
            } else {
                next = it.next();
                AnimatedVisibilityKt animatedVisibilityKt3 = (AnimatedVisibilityKt) next;
                animatedVisibilityKt3.getClass();
                if (animatedVisibilityKt3.RemoteActionCompatParcelizer(1) == i) {
                    break;
                }
            }
        }
        if (!(next instanceof AnimatedVisibilityKt)) {
            animatedVisibilityKt = null;
        } else {
            int i5 = PlaybackStateCompat + 79;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                animatedVisibilityKt = (AnimatedVisibilityKt) next;
                int i6 = 60 / 0;
            } else {
                animatedVisibilityKt = (AnimatedVisibilityKt) next;
            }
        }
        if (animatedVisibilityKt != null) {
            Iterator it2 = animatedVisibilityKt.PlaybackStateCompatCustomAction.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    previewDelayWhenVideoCaptureIsBoundQuirkWrite = null;
                    break;
                }
                Size size = (Size) it2.next();
                if (!(!((List) ((isAdapterPositionOnScreen) this.MediaMetadataCompat).MediaSessionCompatResultReceiverWrapper()).contains(size))) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (animatedVisibilityKt.equals(AnimatedVisibilityKt.RatingCompat)) {
                        i2 = HuaweiApiAvailability.HMS_VERSION_CODE_KIT_UPDATE;
                    } else if (animatedVisibilityKt.equals(AnimatedVisibilityKt.read)) {
                        int i7 = PlaybackStateCompat + 99;
                        MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        i2 = ExceptionCode.CRASH_EXCEPTION;
                    } else if (animatedVisibilityKt.equals(AnimatedVisibilityKt.RemoteActionCompatParcelizer)) {
                        i2 = 4000000;
                    } else {
                        if (!animatedVisibilityKt.equals(AnimatedVisibilityKt.MediaBrowserCompatMediaItem)) {
                            Gson$$ExternalSyntheticBUOutline0.m(animatedVisibilityKt, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i2 = 2000000;
                    }
                    previewDelayWhenVideoCaptureIsBoundQuirkWrite = write(this, width, height, i2);
                    setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer = updateInitialValuesanimation_core.serializer("video/avc");
                    if (setinitialanimationsanimation_coreSerializer != null && setinitialanimationsanimation_coreSerializer.IconCompatParcelizer(width, height)) {
                        Integer num = (Integer) setinitialanimationsanimation_coreSerializer.serializer().clamp(Integer.valueOf(i2));
                        if (num == null || num.intValue() != i2) {
                            num.getClass();
                            previewDelayWhenVideoCaptureIsBoundQuirkWrite = write(this, width, height, num.intValue());
                        }
                    } else {
                        previewDelayWhenVideoCaptureIsBoundQuirkWrite = null;
                    }
                    if (previewDelayWhenVideoCaptureIsBoundQuirkWrite != null) {
                        break;
                    }
                }
            }
        } else {
            previewDelayWhenVideoCaptureIsBoundQuirkWrite = null;
            break;
        }
        if (previewDelayWhenVideoCaptureIsBoundQuirkWrite != null) {
            List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new LegacyCameraSurfaceCleanupQuirk("audio/mp4a-latm", 3, 96000, 44100, 1, 2)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            int iSerializer = getQueryParameterslambda2.serializer();
            previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(60, 2, list, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{previewDelayWhenVideoCaptureIsBoundQuirkWrite}, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
        }
        linkedHashMap.put(Integer.valueOf(i), previewOrientationIncorrectQuirkSerializer);
        return previewOrientationIncorrectQuirkSerializer;
    }

    public TransitionValuesMaps(getContentViewGroupParentLayout getcontentviewgroupparentlayout, CoroutineDispatcher coroutineDispatcher) {
        this.read = 9;
        getcontentviewgroupparentlayout.getClass();
        coroutineDispatcher.getClass();
        this.MediaBrowserCompatMediaItem = getcontentviewgroupparentlayout;
        this.MediaDescriptionCompat = coroutineDispatcher;
        this.MediaMetadataCompat = new LinkedHashMap();
        this.RatingCompat = new onViewAttachedToWindowlambda0("smu_max_heap", Long.valueOf(Runtime.getRuntime().maxMemory() / 1024));
    }

    public TransitionValuesMaps(o.Key key, Integer num) {
        this.read = 14;
        this.MediaDescriptionCompat = num;
        this.MediaMetadataCompat = key;
        this.RatingCompat = key;
        StringBuilder sb = new StringBuilder();
        this.MediaBrowserCompatMediaItem = sb;
        sb.append((Object) 'c');
    }

    public TransitionValuesMaps(xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics3, Bt2020Pqlambda1 bt2020Pqlambda1) {
        this.read = 8;
        this.MediaBrowserCompatMediaItem = xyzatocolorjlnilsgui_graphics;
        this.MediaDescriptionCompat = xyzatocolorjlnilsgui_graphics2;
        this.MediaMetadataCompat = xyzatocolorjlnilsgui_graphics3;
        this.RatingCompat = bt2020Pqlambda1;
    }

    public TransitionValuesMaps(int i) {
        this.read = i;
        Object obj = null;
        if (i == 1) {
            this.MediaBrowserCompatMediaItem = null;
            this.MediaDescriptionCompat = null;
            this.MediaMetadataCompat = null;
            this.RatingCompat = new ArrayDeque();
            return;
        }
        if (i == 16) {
            this.MediaBrowserCompatMediaItem = new ArrayList();
            this.MediaDescriptionCompat = new ArrayList();
            this.MediaMetadataCompat = new ArrayList();
            this.RatingCompat = new ArrayList();
            return;
        }
        if (i != 17) {
            switch (i) {
                case 19:
                    this.MediaBrowserCompatMediaItem = new Object();
                    this.MediaDescriptionCompat = new Handler(Looper.getMainLooper(), new compareAndSetFactory(3, this));
                    break;
                case 20:
                    this.MediaBrowserCompatMediaItem = null;
                    this.MediaDescriptionCompat = null;
                    this.MediaMetadataCompat = null;
                    this.RatingCompat = HitTestResultSubList.read;
                    break;
                case 21:
                    this.MediaBrowserCompatMediaItem = null;
                    this.MediaDescriptionCompat = null;
                    this.MediaMetadataCompat = null;
                    this.RatingCompat = calculateSemanticsConfiguration.read;
                    break;
                default:
                    this.MediaBrowserCompatMediaItem = new ImageKt(0);
                    this.MediaMetadataCompat = new SparseArray();
                    this.RatingCompat = new ContextMenuSpec(obj);
                    this.MediaDescriptionCompat = new ImageKt(0);
                    break;
            }
            return;
        }
        zzz zzzVar = new zzz(1);
        this.MediaBrowserCompatMediaItem = zzzVar;
        TransitionValuesMaps transitionValuesMaps = new TransitionValuesMaps((TransitionValuesMaps) null, zzzVar);
        this.MediaMetadataCompat = transitionValuesMaps;
        this.MediaDescriptionCompat = transitionValuesMaps.PlaybackStateCompatCustomAction();
        getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq = new getZenkakuHankaruEK5gGoQ(0);
        this.RatingCompat = getzenkakuhankaruek5ggoq;
        transitionValuesMaps.RemoteActionCompatParcelizer("require", new getPositionChangeannotations(getzenkakuhankaruek5ggoq));
        ((HashMap) getzenkakuhankaruek5ggoq.write).put("internal.platform", new Callable() { // from class: o.getSevenEK5gGoQ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dispatchPreFlingQWom1Mo dispatchpreflingqwom1mo = new dispatchPreFlingQWom1Mo("internal.platform", 4);
                dispatchpreflingqwom1mo.IconCompatParcelizer.put("getVersion", new dispatchPreFlingQWom1Mo("getVersion", 3));
                return dispatchpreflingqwom1mo;
            }
        });
        transitionValuesMaps.RemoteActionCompatParcelizer("runtime.counter", new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(0.0d)));
    }

    public TransitionValuesMaps(float[] fArr, float[][] fArr2) {
        int i;
        this.read = 6;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        this.RatingCompat = new float[length2];
        int i3 = length - 1;
        float[][] fArr3 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr3[i4] = new float[length2];
        }
        float[][] fArr4 = new float[length][];
        for (int i5 = 0; i5 < length; i5++) {
            fArr4[i5] = new float[length2];
        }
        int i6 = MediaSessionCompatQueueItem + 113;
        PlaybackStateCompat = i6 % Fields.SpotShadowColor;
        int i7 = 2;
        int i8 = i6 % 2;
        int i9 = 2 % 2;
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i3) {
                int i12 = i11 + 1;
                float f = fArr[i12];
                float f2 = fArr[i11];
                float[] fArr5 = fArr3[i11];
                float f3 = (fArr2[i12][i10] - fArr2[i11][i10]) / (f - f2);
                fArr5[i10] = f3;
                if (i11 == 0) {
                    fArr4[i11][i10] = f3;
                } else {
                    fArr4[i11][i10] = (fArr3[i11 - 1][i10] + f3) * 0.5f;
                }
                i11 = i12;
            }
            fArr4[i3][i10] = fArr3[length - 2][i10];
        }
        if (!Float.isNaN(Float.NaN)) {
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = MediaSessionCompatQueueItem + 35;
                PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                float[] fArr6 = fArr3[length - 2];
                float f4 = fArr6[i13];
                float[] fArr7 = fArr3[0];
                float f5 = (fArr7[i13] * Float.NaN) + (f4 * Float.NaN);
                fArr7[i13] = f5;
                fArr6[i13] = f5;
                fArr4[i3][i13] = f5;
                fArr4[0][i13] = f5;
            }
        }
        int i16 = 0;
        while (i16 < i3) {
            int i17 = i2;
            while (i17 < length2) {
                float f6 = fArr3[i16][i17];
                if (f6 == 0.0f) {
                    fArr4[i16][i17] = 0.0f;
                    fArr4[i16 + 1][i17] = 0.0f;
                    int i18 = MediaSessionCompatQueueItem + 49;
                    PlaybackStateCompat = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % i7;
                    i = length2;
                } else {
                    float f7 = fArr4[i16][i17] / f6;
                    int i20 = i16 + 1;
                    float f8 = fArr4[i20][i17] / f6;
                    i = length2;
                    float fHypot = (float) Math.hypot(f7, f8);
                    if (fHypot > 9.0d) {
                        float f9 = 3.0f / fHypot;
                        float[] fArr8 = fArr4[i16];
                        float[] fArr9 = fArr3[i16];
                        fArr8[i17] = f7 * f9 * fArr9[i17];
                        fArr4[i20][i17] = f9 * f8 * fArr9[i17];
                    }
                }
                i17++;
                length2 = i;
                i7 = 2;
            }
            i16++;
            i2 = 0;
            i7 = 2;
        }
        this.MediaBrowserCompatMediaItem = fArr;
        this.MediaDescriptionCompat = fArr2;
        this.MediaMetadataCompat = fArr4;
    }

    public TransitionValuesMaps(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, CoroutineDispatcher coroutineDispatcher, Time$SystemClockImpl time$SystemClockImpl, p0 p0Var, OptimisedForJavaMemoryRoutesParsingQueue optimisedForJavaMemoryRoutesParsingQueue) {
        this.read = 28;
        coroutineDispatcher.getClass();
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = coroutineDispatcher;
        this.MediaMetadataCompat = p0Var;
        this.RatingCompat = optimisedForJavaMemoryRoutesParsingQueue;
    }

    public TransitionValuesMaps(accessgetCoroutineScopep accessgetcoroutinescopep, AndroidPlatformTextInputSession androidPlatformTextInputSession, Parser.Pair pair) {
        this.read = 24;
        this.MediaBrowserCompatMediaItem = accessgetcoroutinescopep;
        this.MediaDescriptionCompat = androidPlatformTextInputSession;
        this.MediaMetadataCompat = pair;
        this.RatingCompat = new ConcurrentHashMap();
    }

    public TransitionValuesMaps(getThumbTintList getthumbtintlist) {
        this.read = 3;
        this.MediaDescriptionCompat = null;
        this.RatingCompat = null;
        this.MediaBrowserCompatMediaItem = getthumbtintlist;
    }

    public TransitionValuesMaps(FocusMeteringAction focusMeteringAction, List list) {
        this.read = 5;
        focusMeteringAction.getClass();
        list.getClass();
        this.MediaBrowserCompatMediaItem = focusMeteringAction;
        this.MediaDescriptionCompat = list;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new CoroutineLiveData$$ExternalSyntheticLambda0(2, this));
        this.RatingCompat = new LinkedHashMap();
    }

    public TransitionValuesMaps(CameraRepository cameraRepository, Camera2CameraCoordinator camera2CameraCoordinator, getDividerPadding getdividerpadding, accessgetGreencp accessgetgreencp) {
        this.read = 4;
        cameraRepository.getClass();
        camera2CameraCoordinator.getClass();
        getdividerpadding.getClass();
        accessgetgreencp.getClass();
        this.MediaBrowserCompatMediaItem = cameraRepository;
        this.MediaDescriptionCompat = camera2CameraCoordinator;
        this.MediaMetadataCompat = getdividerpadding;
        this.RatingCompat = accessgetgreencp;
    }

    public TransitionValuesMaps(ancestorToLocalS_NoaFU ancestortolocals_noafu) {
        this.read = 23;
        this.MediaMetadataCompat = new HashSet();
        this.RatingCompat = accessgetDrawBlockCanvasp.UNKNOWN;
        this.MediaBrowserCompatMediaItem = ancestortolocals_noafu;
        this.MediaDescriptionCompat = new HashMap();
        ancestortolocals_noafu.ParcelableVolumeInfo = this;
    }

    public TransitionValuesMaps(Context context, ActionMode.Callback callback) {
        this.read = 2;
        this.MediaDescriptionCompat = context;
        this.MediaBrowserCompatMediaItem = callback;
        this.MediaMetadataCompat = new ArrayList();
        this.RatingCompat = new processDragGesture(0);
    }

    public TransitionValuesMaps(List list, Map map) {
        this.read = 22;
        this.MediaBrowserCompatMediaItem = list;
        this.MediaDescriptionCompat = map;
    }

    public TransitionValuesMaps(ViewPager2 viewPager2) {
        this.read = 7;
        this.RatingCompat = viewPager2;
        this.MediaBrowserCompatMediaItem = new isInfiniteimpl(this, 0);
        this.MediaDescriptionCompat = new isInfiniteimpl(this, 1);
    }

    public /* synthetic */ TransitionValuesMaps(int i, boolean z) {
        this.read = i;
    }

    public TransitionValuesMaps(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, E$b e$b) {
        this.read = 12;
        this.MediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation;
        this.MediaDescriptionCompat = e$b;
        int i = 2;
        setSdkAuthenticationSignature setsdkauthenticationsignature = new setSdkAuthenticationSignature(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.accessprocessDragStart, i);
        mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.Contentfoundation;
        r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8 = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(mergejsonobjects, 8);
        mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.onPointerEventH0pRuoY;
        r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv9 = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(mergejsonobjects2, 0);
        mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.toClipEntry;
        getContentDataType getcontentdatatype = getstyleable_vector_drawable_group_rotation.ScrollableKt;
        r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw r8lambda4qmpbs3swzmg_sq6wvv9rb3jzw = new r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw(mergejsonobjects3, mergejsonobjects, getcontentdatatype, r8lambdahmuf48geqgedwlhl7mczo1q1bv8, r8lambdahmuf48geqgedwlhl7mczo1q1bv9, getstyleable_vector_drawable_group_rotation.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, getstyleable_vector_drawable_group_rotation.AlertControllerButtonHandler, getstyleable_vector_drawable_group_rotation.getId, getstyleable_vector_drawable_group_rotation.getTabContainer);
        requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1 = getstyleable_vector_drawable_group_rotation.awaitEachGesture;
        r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw = getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList;
        setSdkAuthenticationSignature setsdkauthenticationsignature2 = new setSdkAuthenticationSignature(requestsinglelocationupdatelambda1, r8lambda6uovp7lvejigbq5knkop8a0veiw, 4);
        r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv10 = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(mergejsonobjects2, i);
        this.MediaMetadataCompat = new r8lambdaG9rB9GwnhH4FGsWkARoJWjtnPDI(mergejsonobjects3, setsdkauthenticationsignature, getstyleable_vector_drawable_group_rotation.TransitionState, r8lambda4qmpbs3swzmg_sq6wvv9rb3jzw, new isHiddenannotations(setsdkauthenticationsignature2, r8lambdahmuf48geqgedwlhl7mczo1q1bv10, getstyleable_vector_drawable_group_rotation.toFloatk4lQ0M, getstyleable_vector_drawable_group_rotation.createnHHXs2Y, 12), getstyleable_vector_drawable_group_rotation.MultiParagraphLayoutCache, getstyleable_vector_drawable_group_rotation.toSingleAxisDeltaFromAnglek4lQ0M, new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.Arrangement, 7), new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.AbstractClickableNodeonKeyEvent1, 6), getcontentdatatype, getstyleable_vector_drawable_group_rotation._init_lambda4, getstyleable_vector_drawable_group_rotation.ArrangementHorizontal, getstyleable_vector_drawable_group_rotation.getOffsetBjo55l4, new setSdkAuthenticationSignature(requestsinglelocationupdatelambda1, r8lambda6uovp7lvejigbq5knkop8a0veiw, 3), r8lambdahmuf48geqgedwlhl7mczo1q1bv10, getstyleable_vector_drawable_group_rotation.AutoFlashUnderExposedQuirk, mergejsonobjects, getstyleable_vector_drawable_group_rotation.TextDelegateKt, getstyleable_vector_drawable_group_rotation.access601);
        this.RatingCompat = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.FlingCancellationException, 11);
    }
}
