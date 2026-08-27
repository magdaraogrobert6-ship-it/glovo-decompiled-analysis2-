package bo.app;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.search.TransitionSearchInfo;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.location.GooglePlayLocationUtils;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.IBrazeGeofenceLocationUpdateListener;
import com.braze.models.IBrazeLocation;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.braze.ui.banners.BannerView;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mapbox.navigator.R;
import com.roadrunner.auth.domain.logout.ClearServicesUseCase;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.thrift.k$c;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.datetime.TimeZoneKt;
import o.AdjustDeeplink;
import o.AndroidGraphicsContext2;
import o.IndirectPointerEventeAXfkT4;
import o.InputMode;
import o.InputModeManager;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.TextMotionCompanion;
import o.UncheckedColor;
import o.accesscontainsDescendant;
import o.accessgetRotatecp;
import o.backwardFocusSearch;
import o.calculateNodeKindSetFromIncludingDelegates;
import o.clipPathmtrdDEdefault;
import o.contains64DMado;
import o.countTransparentColors;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.cubicTo;
import o.emitFakeNodes;
import o.getAction;
import o.getBitmapui_graphics;
import o.getConfirm5zf0vsI;
import o.getContextClick5zf0vsI;
import o.getDrawOLwlOKwannotations;
import o.getLongPress5zf0vsI;
import o.getPositionInWindowF1C5BW0;
import o.getReverseDifferenceannotations;
import o.getSegmentTick5zf0vsI;
import o.invoke3ESFkO8;
import o.isRoot;
import o.nearestParentThatHasSemantics;
import o.obtainBrushFromComplexColor;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.relativeMoveTo;
import o.resetOffsets;
import o.setEnableExtraAssertions;
import o.setOnApplyWindowInsetsListener;
import o.setRectOutlinetz77jQwdefault;
import o.setSdkPrefix;
import o.sortByGeometryGroupingslambda1;
import o.toContentCaptureSession;
import o.toContentCaptureSessionCompat;
import o.unsetHasCallbacksFor;
import o.updateAdidI;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2$$ExternalSyntheticLambda4 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ f2$$ExternalSyntheticLambda4(getPositionInWindowF1C5BW0 getpositioninwindowf1c5bw0, FragmentActivity fragmentActivity) {
        this.$r8$classId = 24;
        this.f$0 = getpositioninwindowf1c5bw0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        setSdkPrefix setsdkprefix;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        int i2 = 1;
        Integer numWrite = null;
        switch (i) {
            case 0:
                return f2.a((f2) obj2, (IBrazeLocation) obj);
            case 1:
                return Boolean.valueOf(AnimationSearch.attachAllAnimations$lambda$0$4((LinkedHashSet) obj2, (TransitionSearchInfo) obj));
            case 2:
                return Boolean.valueOf(AnimationSearch.AnimateContentSizeSearch.addAnimations$lambda$1$0$0((AnimationSearch.AnimateContentSizeSearch) obj2, (Modifier.Element) obj));
            case 3:
                relativeMoveTo relativemoveto = TimeZoneKt.read((Context) obj2);
                relativemoveto.read((Bundle) obj);
                return relativemoveto;
            case 4:
                cubicTo cubicto = (cubicTo) obj;
                cubicto.getClass();
                return new invoke3ESFkO8((countTransparentColors) obj2, i2, cubicto);
            case 5:
                UncheckedColor uncheckedColor = (UncheckedColor) obj;
                uncheckedColor.getClass();
                ((clipPathmtrdDEdefault) obj2).RatingCompat = uncheckedColor;
                return createFromParcel.INSTANCE;
            case 6:
                return ih.a((ih) obj2, (String) obj);
            case 7:
                ((getReverseDifferenceannotations) obj2).MediaDescriptionCompat = true;
                return createFromParcel.INSTANCE;
            case 8:
                createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = (createBrazeUserChangeEventSubscriberlambda01) obj2;
                int i3 = createbrazeuserchangeeventsubscriberlambda01.read;
                createbrazeuserchangeeventsubscriberlambda01.read = i3 + 1;
                return i3 + ":" + ((accessgetRotatecp) obj).read();
            case 9:
                return GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$1((IBrazeGeofenceLocationUpdateListener) obj2, (Location) obj);
            case 10:
                return BrazeGeofenceManager.requestSingleLocationUpdateFromGooglePlay$lambda$0((BrazeGeofenceManager) obj2, (IBrazeLocation) obj);
            case 11:
                return UserJavascriptInterfaceBase.setGender$lambda$1((Gender) obj2, (BrazeUser) obj);
            case 12:
                return RemoveFromCustomAttributeArrayStep.run$lambda$0((StepData) obj2, (BrazeUser) obj);
            case 13:
                return BannerView.internalHeightCallback$lambda$0((BannerView) obj2, ((Double) obj).doubleValue());
            case 14:
                ((DialogInterface) obj).getClass();
                ((obtainBrushFromComplexColor) obj2).RemoteActionCompatParcelizer.invoke();
                return createFromParcel.INSTANCE;
            case 15:
                String str = (String) obj;
                str.getClass();
                ((getLongPress5zf0vsI) obj2).invoke(str);
                return createFromParcel.INSTANCE;
            case 16:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((getLongPress5zf0vsI) obj2).invoke(th);
                return createFromParcel.INSTANCE;
            case 17:
                ((f2$$ExternalSyntheticLambda4) obj2).invoke(((IndirectPointerEventeAXfkT4) obj).IconCompatParcelizer());
                return createFromParcel.INSTANCE;
            case 18:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((f2$$ExternalSyntheticLambda4) obj2).invoke(th2);
                return createFromParcel.INSTANCE;
            case 19:
                k$c k_c = (k$c) obj2;
                Location location = (Location) k_c.MediaBrowserCompatMediaItem;
                if (location != null) {
                    getContextClick5zf0vsI getcontextclick5zf0vsi = (getContextClick5zf0vsI) k_c.write;
                    setRectOutlinetz77jQwdefault setrectoutlinetz77jqwdefault = new setRectOutlinetz77jQwdefault(24);
                    GapComposer$$ExternalSyntheticLambda3 gapComposer$$ExternalSyntheticLambda3 = new GapComposer$$ExternalSyntheticLambda3(11, k_c);
                    AdjustDeeplink adjustDeeplink = (AdjustDeeplink) getcontextclick5zf0vsi.MediaBrowserCompatMediaItem.RatingCompat.read();
                    Long lValueOf = (adjustDeeplink == null || (setsdkprefix = adjustDeeplink.read) == null) ? null : Long.valueOf(setsdkprefix.write);
                    if (lValueOf == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Location update received while courierId is null");
                        Timber.RemoteActionCompatParcelizer.write(illegalStateException);
                        gapComposer$$ExternalSyntheticLambda3.invoke(illegalStateException, Boolean.TRUE);
                    } else {
                        Disposable disposable = getcontextclick5zf0vsi.RemoteActionCompatParcelizer;
                        if (disposable != null) {
                            disposable.dispose();
                        }
                        long jLongValue = lValueOf.longValue();
                        toContentCaptureSessionCompat tocontentcapturesessioncompat = getcontextclick5zf0vsi.RatingCompat;
                        boolean z = getcontextclick5zf0vsi.read.read();
                        getConfirm5zf0vsI getconfirm5zf0vsi = getcontextclick5zf0vsi.MediaSessionCompatToken;
                        getSegmentTick5zf0vsI getsegmenttick5zf0vsi = getcontextclick5zf0vsi.IconCompatParcelizer.RemoteActionCompatParcelizer;
                        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(getcontextclick5zf0vsi.write.read);
                        InputMode inputMode = new InputMode(tocontentcapturesessioncompat.serializer());
                        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) getcontextclick5zf0vsi.MediaDescriptionCompat, updateAdidI.IS_GODROID_BLE_SCANNING_ENABLED})).booleanValue()) {
                            TextMotionCompanion textMotionCompanion = getcontextclick5zf0vsi.serializer.RemoteActionCompatParcelizer;
                            synchronized (textMotionCompanion) {
                                if (!textMotionCompanion.RemoteActionCompatParcelizer.isEmpty()) {
                                    Path$Companion path$Companion = textMotionCompanion.read;
                                    List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(textMotionCompanion.RemoteActionCompatParcelizer);
                                    int i4 = textMotionCompanion.IconCompatParcelizer;
                                    path$Companion.getClass();
                                    numWrite = Path$Companion.write(i4, listPlaybackStateCompat2);
                                    textMotionCompanion.RemoteActionCompatParcelizer.clear();
                                }
                            }
                        }
                        Completable completableIconCompatParcelizer = getconfirm5zf0vsi.IconCompatParcelizer(jLongValue, new InputModeManager(location, getsegmenttick5zf0vsi, listPlaybackStateCompat, inputMode, z, numWrite));
                        Scheduler schedulerIconCompatParcelizer = ((AndroidScheduleProvider) getcontextclick5zf0vsi.MediaMetadataCompat).IconCompatParcelizer();
                        completableIconCompatParcelizer.getClass();
                        getcontextclick5zf0vsi.RemoteActionCompatParcelizer = new CompletableObserveOn(new CompletableSubscribeOn(completableIconCompatParcelizer, schedulerIconCompatParcelizer), AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(getcontextclick5zf0vsi, 16, setrectoutlinetz77jqwdefault), new StreamSharing$$ExternalSyntheticLambda0(26, new Navigator$$ExternalSyntheticLambda1(getcontextclick5zf0vsi, 25, gapComposer$$ExternalSyntheticLambda3)));
                    }
                }
                return createFromParcel.INSTANCE;
            case 20:
                return MainActivity.serializer((setOnApplyWindowInsetsListener) obj2, (Throwable) obj);
            case 21:
                ((NodeCoordinatorCompanionPointerInputSource1) obj).getClass();
                return new getDrawOLwlOKwannotations(((calculateNodeKindSetFromIncludingDelegates) obj2).IconCompatParcelizer);
            case 22:
                contains64DMado contains64dmado = (contains64DMado) obj;
                contains64dmado.getClass();
                accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                getAction getactionNewBuilder = MapValue.newBuilder();
                getactionNewBuilder.serializer(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, contains64dmado.IconCompatParcelizer.getProto());
                getactionNewBuilder.serializer("expression", contains64dmado.read.serializer((toContentCaptureSession) obj2));
                accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer(getactionNewBuilder);
                return (Value) accesscontainsdescendantNewBuilder.serializer();
            case 23:
                setEnableExtraAssertions setenableextraassertions = (setEnableExtraAssertions) obj2;
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
                isRoot isroot = setEnableExtraAssertions.serializer;
                long j = 0;
                for (Map.Entry entry : backwardfocussearch.read().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        isRoot isroot2 = (isRoot) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String str2 = setenableextraassertions.read(System.currentTimeMillis());
                        if (set.contains(str2)) {
                            Object[] objArr = {str2};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj3, "duplicate element: "));
                                return null;
                            }
                            backwardfocussearch.write(isroot2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            backwardfocussearch.read(isroot2);
                        }
                    }
                }
                if (j == 0) {
                    backwardfocussearch.read(isroot);
                } else {
                    backwardfocussearch.write(isroot, Long.valueOf(j));
                }
                return null;
            case 24:
                nearestParentThatHasSemantics nearestparentthathassemantics = (nearestParentThatHasSemantics) obj;
                nearestparentthathassemantics.getClass();
                emitFakeNodes emitfakenodes = ((getPositionInWindowF1C5BW0) obj2).IconCompatParcelizer;
                Uri uri = Uri.parse(nearestparentthathassemantics.read);
                ((com.huawei.wisesecurity.ucs_credential.p0) emitfakenodes).getClass();
                uri.getClass();
                return createFromParcel.INSTANCE;
            case 25:
                ClearServicesUseCase clearServicesUseCase = (ClearServicesUseCase) obj2;
                resetOffsets resetoffsets = (resetOffsets) obj;
                resetoffsets.getClass();
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.IconCompatParcelizer("On result unregister push", new Object[0]);
                try {
                    if (resetoffsets instanceof unsetHasCallbacksFor) {
                        forest.RemoteActionCompatParcelizer(((unsetHasCallbacksFor) resetoffsets).read, "On new Authentication logout CustomerChat unregisterPush failed: " + ((unsetHasCallbacksFor) resetoffsets).read, new Object[0]);
                    }
                    clearServicesUseCase.IconCompatParcelizer.serializer();
                    break;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Unregister push onResult failed", new Object[0]);
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Customer chat cleared", new Object[0]);
                return createFromParcel.INSTANCE;
            case 26:
                return LogoutActivity.RemoteActionCompatParcelizer((LogoutActivity) obj2, (getBitmapui_graphics) obj);
            case 27:
                return BiometricsActivity.RemoteActionCompatParcelizer((BiometricsActivity) obj2, (sortByGeometryGroupingslambda1) obj);
            case 28:
                return CustomPasswordActivity.RemoteActionCompatParcelizer((CustomPasswordActivity) obj2, (getBitmapui_graphics) obj);
            default:
                List list = (List) obj;
                AndroidGraphicsContext2 androidGraphicsContext2 = (AndroidGraphicsContext2) ((N$b) obj2).IconCompatParcelizer;
                list.getClass();
                androidGraphicsContext2.RemoteActionCompatParcelizer(N$b.write(list));
                return createFromParcel.INSTANCE;
        }
    }

    public /* synthetic */ f2$$ExternalSyntheticLambda4(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
