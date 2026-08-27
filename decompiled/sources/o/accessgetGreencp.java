package o;

import android.app.PendingIntent;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.camera2.CaptureResult;
import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.util.Range;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.transition.Transition$1;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.re2j.Parser;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.location.Vw$Vw;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesFragment;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetGreencp implements handleOnBackStarted, CameraXExternalSyntheticLambda0, seek, fromLinear, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, FrameworkServiceWorkerClient, accessgetNumPadRightParenthesiscp {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public Object write;

    @Override // o.fromLinear
    public r8lambdafQNxHYBbQei_ep6070iYk6_yIE IconCompatParcelizer(getEotfFuncui_graphics geteotffuncui_graphics) {
        int i = 2 % 2;
        int i2 = read + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafQNxHYBbQei_ep6070iYk6_yIE.TRANSFORMED;
        }
        int i3 = 64 / 0;
        return r8lambdafQNxHYBbQei_ep6070iYk6_yIE.TRANSFORMED;
    }

    public void RemoteActionCompatParcelizer(nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr, Toolbar toolbar) {
        getCurrentMenuItems getcurrentmenuitems;
        if (toolbar == null || toolbar.write != 8) {
            switch (getVirtualChildCount.write[nativeconvertandroid420toabgr.ordinal()]) {
                case 1:
                    nativeWriteJpegToSurface nativewritejpegtosurface = (nativeWriteJpegToSurface) this.IconCompatParcelizer;
                    synchronized (nativewritejpegtosurface.write) {
                        Iterator it = nativewritejpegtosurface.serializer.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                getcurrentmenuitems = new getCurrentMenuItems(getLogo.PENDING_OPEN, null);
                            } else if (((nativeNewDirectByteBuffer) ((Map.Entry) it.next()).getValue()).write == nativeConvertAndroid420ToABGR.CLOSING) {
                                getcurrentmenuitems = new getCurrentMenuItems(getLogo.OPENING, null);
                            }
                        }
                    }
                    break;
                case 2:
                    getcurrentmenuitems = new getCurrentMenuItems(getLogo.OPENING, toolbar);
                    break;
                case 3:
                case 4:
                    getcurrentmenuitems = new getCurrentMenuItems(getLogo.OPEN, toolbar);
                    break;
                case 5:
                case 6:
                    getcurrentmenuitems = new getCurrentMenuItems(getLogo.CLOSING, toolbar);
                    break;
                case 7:
                case 8:
                    getcurrentmenuitems = new getCurrentMenuItems(getLogo.CLOSED, toolbar);
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(nativeconvertandroid420toabgr, "Unknown internal camera state: ");
                    return;
            }
        } else {
            getcurrentmenuitems = new getCurrentMenuItems(getLogo.CLOSED, toolbar);
        }
        getcurrentmenuitems.toString();
        Objects.toString(nativeconvertandroid420toabgr);
        Objects.toString(toolbar);
        setInflatedId.IconCompatParcelizer(3, "CameraStateMachine");
        if (Objects.equals((getCurrentMenuItems) ((AndroidGraphicsContext2) this.write).IconCompatParcelizer(), getcurrentmenuitems)) {
            return;
        }
        getcurrentmenuitems.toString();
        setInflatedId.IconCompatParcelizer(3, "CameraStateMachine");
        ((AndroidGraphicsContext2) this.write).serializer(getcurrentmenuitems);
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public CaptureResult IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        CaptureResult captureResult = (CaptureResult) this.write;
        int i5 = i3 + 35;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return captureResult;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public OnePixelShiftQuirk MediaBrowserCompatMediaItem() {
        OnePixelShiftQuirk onePixelShiftQuirk;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 63;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            onePixelShiftQuirk = (OnePixelShiftQuirk) this.IconCompatParcelizer;
            int i4 = 70 / 0;
        } else {
            onePixelShiftQuirk = (OnePixelShiftQuirk) this.IconCompatParcelizer;
        }
        int i5 = i2 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onePixelShiftQuirk;
    }

    public accessgetGreencp(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.serializer = i;
        int i2 = 11;
        int i3 = 21;
        int i4 = 7;
        int i5 = 22;
        int i6 = 0;
        switch (i) {
            case 17:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.FlingCancellationException, i2);
                break;
            case 18:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new isHiddenannotations(getstyleable_vector_drawable_group_rotation.toStringimpl, getstyleable_vector_drawable_group_rotation.clickableXHw0xAIdefault, getstyleable_vector_drawable_group_rotation.toClipEntry, new AndroidIndirectPointerEvent_androidKt(getstyleable_vector_drawable_group_rotation.setItemInvoker, i5), 2);
                break;
            case 19:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new acquire(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.setForceShowIcon, 12), 5);
                break;
            case 20:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new AndroidIndirectPointerEvent_androidKt(getstyleable_vector_drawable_group_rotation.Contentfoundation, i4);
                break;
            case 21:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                executeQuery executequery = new executeQuery(getstyleable_vector_drawable_group_rotation.toClipEntry, 9);
                mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.put;
                this.write = new getModels(new PreferenceGroupAdapter(new SeekBarPreferenceSavedState(mergejsonobjects, getstyleable_vector_drawable_group_rotation.getPopupBackground, executequery, getstyleable_vector_drawable_group_rotation.getDropDownHorizontalOffset, getstyleable_vector_drawable_group_rotation.getInternalPopup, getstyleable_vector_drawable_group_rotation.getDropDownVerticalOffset, getstyleable_vector_drawable_group_rotation.setAdapter, getstyleable_vector_drawable_group_rotation.setOrientation, getstyleable_vector_drawable_group_rotation.getPrompt, getstyleable_vector_drawable_group_rotation.setDropDownVerticalOffset, getstyleable_vector_drawable_group_rotation.setDropDownHorizontalOffset, getstyleable_vector_drawable_group_rotation.setPrompt, getstyleable_vector_drawable_group_rotation.setPopupBackgroundDrawable, getstyleable_vector_drawable_group_rotation.AppCompatSpinnerSavedState, getstyleable_vector_drawable_group_rotation.setDropDownWidth), mergejsonobjects, 0), mergejsonobjects, getstyleable_vector_drawable_group_rotation.createnHHXs2Y, getstyleable_vector_drawable_group_rotation.FocusMeteringControl, getstyleable_vector_drawable_group_rotation.entryRemoved, getstyleable_vector_drawable_group_rotation.trimToSize, getstyleable_vector_drawable_group_rotation.safeSizeOf);
                break;
            case 22:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.TapGestureDetectorKtawaitSecondDown2, i6);
                break;
            case 23:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.RippleHostMap;
                lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15 = new lambdaprocessAndResolveDeeplink15(mergejsonobjects2, 24);
                applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(getstyleable_vector_drawable_group_rotation.DraggableNode, getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList, getstyleable_vector_drawable_group_rotation.AfRegionFlipHorizontallyQuirk, 16);
                setPresentationView setpresentationview = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
                lambda31 lambda31Var = new lambda31(applylayoutfeatures, new lambdaprocessAndResolveDeeplink15(setpresentationview, 23), getstyleable_vector_drawable_group_rotation.LazyLayoutItemAnimator);
                SimpleExecutableQuery simpleExecutableQuery = getstyleable_vector_drawable_group_rotation.FocusMeteringControl2;
                acquire acquireVar = getstyleable_vector_drawable_group_rotation.AudioTimestampFramePositionIncorrectQuirk;
                mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.Contentfoundation;
                mergeJsonObjects mergejsonobjects4 = getstyleable_vector_drawable_group_rotation.height;
                this.write = new getModels(new getDataStoreFileName(simpleExecutableQuery, lambdaprocessandresolvedeeplink15, lambda31Var, acquireVar, mergejsonobjects3, mergejsonobjects4), new lambdaprocessAndResolveDeeplink15(mergejsonobjects2, i5), new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.FlowRow, i3), new lambdaprocessAndResolveDeeplink15(mergejsonobjects2, 20), new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.setItemInvoker, 13), new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new acquire(getstyleable_vector_drawable_group_rotation.tryAwaitRelease, setpresentationview, 27), i2), 14), mergejsonobjects4);
                break;
            case 24:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug = new r8lambdapkx6kfYbgP4lEOWkebovjPb0ug(new r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8(i6), 17);
                getContentDataType getcontentdatatype = getstyleable_vector_drawable_group_rotation.ImageCaptureFailedForVideoSnapshotQuirk;
                mergeJsonObjects mergejsonobjects5 = getstyleable_vector_drawable_group_rotation.toClipEntry;
                setSdkAuthenticationSignature setsdkauthenticationsignature = new setSdkAuthenticationSignature(getcontentdatatype, mergejsonobjects5, i4);
                mergeJsonObjects mergejsonobjects6 = getstyleable_vector_drawable_group_rotation.LazyLayoutPagerKt;
                this.write = new accessgetAreOutboundNetworkRequestsOfflinecp(new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(mergejsonobjects6, r8lambdapkx6kfybgp4leowkebovjpb0ug, setsdkauthenticationsignature, getstyleable_vector_drawable_group_rotation.TextDelegateKt, mergejsonobjects5), mergejsonobjects6, getstyleable_vector_drawable_group_rotation.SelectionHandlewLIcFTc, getstyleable_vector_drawable_group_rotation.access1001, getstyleable_vector_drawable_group_rotation.AppCompatTextView, getstyleable_vector_drawable_group_rotation.access301, getstyleable_vector_drawable_group_rotation.access1201, getstyleable_vector_drawable_group_rotation.access101, getstyleable_vector_drawable_group_rotation.PagereLwUrMk, getstyleable_vector_drawable_group_rotation.execute, getstyleable_vector_drawable_group_rotation.createnHHXs2Y);
                break;
            case 25:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(3, new AndroidIndirectPointerEvent_androidKt(getstyleable_vector_drawable_group_rotation.setItemInvoker, i3), getstyleable_vector_drawable_group_rotation.getValue, getstyleable_vector_drawable_group_rotation.ExtraSupportedQualityQuirk, getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.getActionBarHideOffset);
                break;
            default:
                this.IconCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                this.write = new AndroidIndirectPointerEvent_androidKt(getstyleable_vector_drawable_group_rotation.addOnPictureInPictureModeChangedListener, 4);
                break;
        }
    }

    @Override // o.handleOnBackStarted
    public boolean read(handleOnBackPressed handleonbackpressed, Menu menu) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((handleOnBackStarted) this.IconCompatParcelizer).read(handleonbackpressed, menu);
        }
        boolean z = ((handleOnBackStarted) this.IconCompatParcelizer).read(handleonbackpressed, menu);
        int i3 = 84 / 0;
        return z;
    }

    @Override // o.handleOnBackStarted
    public boolean write(handleOnBackPressed handleonbackpressed, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = read + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((handleOnBackStarted) this.IconCompatParcelizer).write(handleonbackpressed, menuItem);
        }
        ((handleOnBackStarted) this.IconCompatParcelizer).write(handleonbackpressed, menuItem);
        throw null;
    }

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(Location location) {
        int i = 2 % 2;
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FrameworkServiceWorkerClient frameworkServiceWorkerClient = (FrameworkServiceWorkerClient) this.write;
        if (frameworkServiceWorkerClient != null) {
            frameworkServiceWorkerClient.RemoteActionCompatParcelizer(location);
            int i4 = read + 21;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        FrameworkServiceWorkerClient frameworkServiceWorkerClient = (FrameworkServiceWorkerClient) this.write;
        if (frameworkServiceWorkerClient != null) {
            int i2 = read + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            frameworkServiceWorkerClient.RemoteActionCompatParcelizer(z);
        }
        int i4 = read + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public android.view.inputmethod.InputMethodManager ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((onViewDetachedFromWindowlambda1) this.write).MediaSessionCompatResultReceiverWrapper();
        int i4 = RemoteActionCompatParcelizer + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return inputMethodManager;
    }

    @Override // o.FrameworkServiceWorkerClient
    public void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = read + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        FrameworkServiceWorkerClient frameworkServiceWorkerClient = (FrameworkServiceWorkerClient) this.write;
        if (frameworkServiceWorkerClient != null) {
            frameworkServiceWorkerClient.PlaybackStateCompatCustomAction();
            int i3 = RemoteActionCompatParcelizer + 73;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.write = null;
    }

    public accessgetHeadsetHookcp MediaMetadataCompat() {
        int i = 2 % 2;
        accessgetHeadsetHookcp accessgetheadsethookcp = new accessgetHeadsetHookcp((String) this.IconCompatParcelizer, Collections.unmodifiableList((List) this.write));
        int i2 = RemoteActionCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return accessgetheadsethookcp;
    }

    @Override // o.handleOnBackStarted
    public boolean RemoteActionCompatParcelizer(handleOnBackPressed handleonbackpressed, Menu menu) {
        int i = 2 % 2;
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ViewGroup viewGroup = ((startActivityForResult) this.write).addMenuProvider;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        viewGroup.requestApplyInsets();
        boolean zRemoteActionCompatParcelizer = ((handleOnBackStarted) this.IconCompatParcelizer).RemoteActionCompatParcelizer(handleonbackpressed, menu);
        int i4 = RemoteActionCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zRemoteActionCompatParcelizer;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public long RatingCompat() {
        int i = 2 % 2;
        int i2 = read + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        Long l = (Long) ((CaptureResult) this.write).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            return l.longValue();
        }
        int i3 = read + 29;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return -1L;
    }

    @Override // o.seek
    public long MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = read + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jLongValue = ((Long) ((StreamSharing$$ExternalSyntheticLambda0) this.IconCompatParcelizer).read(Long.valueOf(((Transition$1) this.write).MediaDescriptionCompat()))).longValue();
        int i4 = read + 101;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jLongValue;
    }

    @Override // o.seek
    public long MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = read + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jLongValue = ((Long) ((StreamSharing$$ExternalSyntheticLambda0) this.IconCompatParcelizer).read(Long.valueOf(((Transition$1) this.write).MediaSessionCompatQueueItem()))).longValue();
        int i4 = RemoteActionCompatParcelizer + 91;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jLongValue;
    }

    @Override // o.r8lambdayrUYrLf4y8jALbFcm2n28OpawQ
    public boolean IconCompatParcelizer(Object obj, File file, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i = 2 % 2;
        boolean zIconCompatParcelizer = ((setDensity) this.write).IconCompatParcelizer(new getCanvas(((BitmapDrawable) ((generateOetf) obj).IconCompatParcelizer()).getBitmap(), (getD) this.IconCompatParcelizer), file, geteotffuncui_graphics);
        int i2 = RemoteActionCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zIconCompatParcelizer;
    }

    public void IconCompatParcelizer(Object obj, String str) {
        int i = 2 % 2;
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.IconCompatParcelizer).add(d$$ExternalSyntheticOutline0.m(new StringBuilder(length + 1 + strValueOf.length()), str, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf));
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        int i = 2 % 2;
        getMeasurementConstraintsmsEJaDk getmeasurementconstraintsmsejadk = new getMeasurementConstraintsmsEJaDk((ParentDataModifierDefaultImpls) obj2);
        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) this.IconCompatParcelizer;
        PendingIntent pendingIntent = (PendingIntent) this.write;
        accessgetSystemNavigationDowncp.serializer(pendingIntent, "PendingIntent must be specified.");
        getMediaPauseEK5gGoQ getmediapauseek5ggoq = new getMediaPauseEK5gGoQ(getmeasurementconstraintsmsejadk);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) ((getNumPadAddEK5gGoQ) obj).MediaSessionCompatResultReceiverWrapper();
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, activityTransitionRequest);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
        parcelZza.writeStrongBinder(getmediapauseek5ggoq);
        getnumpaddeleteek5ggoq.zzc(72, parcelZza);
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public Camera2CameraControlExternalSyntheticLambda1 serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = (Integer) ((CaptureResult) this.write).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return Camera2CameraControlExternalSyntheticLambda1.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return Camera2CameraControlExternalSyntheticLambda1.INACTIVE;
            case 1:
            case 3:
                return Camera2CameraControlExternalSyntheticLambda1.SCANNING;
            case 2:
                Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = Camera2CameraControlExternalSyntheticLambda1.PASSIVE_FOCUSED;
                int i3 = read + 123;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 22 / 0;
                }
                return camera2CameraControlExternalSyntheticLambda1;
            case 4:
                return Camera2CameraControlExternalSyntheticLambda1.LOCKED_FOCUSED;
            case 5:
                return Camera2CameraControlExternalSyntheticLambda1.LOCKED_NOT_FOCUSED;
            case 6:
                Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda2 = Camera2CameraControlExternalSyntheticLambda1.PASSIVE_NOT_FOCUSED;
                int i5 = RemoteActionCompatParcelizer + 61;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 47 / 0;
                }
                return camera2CameraControlExternalSyntheticLambda2;
            default:
                setInflatedId.serializer("C2CameraCaptureResult", "Undefined af state: " + num);
                return Camera2CameraControlExternalSyntheticLambda1.UNKNOWN;
        }
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public CaptureRequestOptionsBuilderExternalSyntheticLambda0 read() {
        int i = 2 % 2;
        Integer num = (Integer) ((CaptureResult) this.write).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CaptureRequestOptionsBuilderExternalSyntheticLambda0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            CaptureRequestOptionsBuilderExternalSyntheticLambda0 captureRequestOptionsBuilderExternalSyntheticLambda0 = CaptureRequestOptionsBuilderExternalSyntheticLambda0.INACTIVE;
            int i2 = read + 13;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return captureRequestOptionsBuilderExternalSyntheticLambda0;
        }
        int i4 = read + 93;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i5;
        if (i4 % 2 != 0 ? iIntValue == 1 : iIntValue == 0) {
            CaptureRequestOptionsBuilderExternalSyntheticLambda0 captureRequestOptionsBuilderExternalSyntheticLambda1 = CaptureRequestOptionsBuilderExternalSyntheticLambda0.METERING;
            int i6 = RemoteActionCompatParcelizer + 81;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return captureRequestOptionsBuilderExternalSyntheticLambda1;
        }
        int i8 = i5 + 3;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0 ? iIntValue == 2 : iIntValue == 2) {
            return CaptureRequestOptionsBuilderExternalSyntheticLambda0.CONVERGED;
        }
        if (iIntValue == 3) {
            return CaptureRequestOptionsBuilderExternalSyntheticLambda0.LOCKED;
        }
        setInflatedId.serializer("C2CameraCaptureResult", "Undefined awb state: " + num);
        return CaptureRequestOptionsBuilderExternalSyntheticLambda0.UNKNOWN;
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public ZslDisablerQuirk u_() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Integer num = (Integer) ((CaptureResult) this.write).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            int i4 = read + 37;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return ZslDisablerQuirk.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return ZslDisablerQuirk.NONE;
        }
        if (iIntValue == 2) {
            return ZslDisablerQuirk.READY;
        }
        if (iIntValue != 3) {
            int i6 = RemoteActionCompatParcelizer + 113;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? iIntValue != 4 : iIntValue != 5) {
                setInflatedId.serializer("C2CameraCaptureResult", "Undefined flash state: " + num);
                return ZslDisablerQuirk.UNKNOWN;
            }
        }
        return ZslDisablerQuirk.FIRED;
    }

    public void MediaSessionCompatResultReceiverWrapper() throws IOException {
        int i = 2 % 2;
        String str = (String) this.IconCompatParcelizer;
        if (((FileChannel) this.write) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = getPositionInRoot.write(new FileOutputStream(file), file).getChannel();
            this.write = channel;
            if (channel != null) {
                int i2 = RemoteActionCompatParcelizer + 101;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.write;
            if (fileChannel != null) {
                int i4 = RemoteActionCompatParcelizer + 89;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                fileChannel.close();
            }
            this.write = null;
            ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Unable to lock file: '", str, "'."), th);
            int i6 = read + 53;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public TorchIsClosedAfterImageCapturingQuirk write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Integer num = (Integer) ((CaptureResult) this.write).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            int i4 = read + 61;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return TorchIsClosedAfterImageCapturingQuirk.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return TorchIsClosedAfterImageCapturingQuirk.INACTIVE;
        }
        int i6 = RemoteActionCompatParcelizer + 15;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return TorchIsClosedAfterImageCapturingQuirk.CONVERGED;
            }
            if (iIntValue == 3) {
                return TorchIsClosedAfterImageCapturingQuirk.LOCKED;
            }
            if (iIntValue == 4) {
                return TorchIsClosedAfterImageCapturingQuirk.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                setInflatedId.serializer("C2CameraCaptureResult", "Undefined ae state: " + num);
                TorchIsClosedAfterImageCapturingQuirk torchIsClosedAfterImageCapturingQuirk = TorchIsClosedAfterImageCapturingQuirk.UNKNOWN;
                int i8 = RemoteActionCompatParcelizer + 77;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 78 / 0;
                }
                return torchIsClosedAfterImageCapturingQuirk;
            }
        }
        return TorchIsClosedAfterImageCapturingQuirk.SEARCHING;
    }

    @Override // o.handleOnBackStarted
    public void IconCompatParcelizer(handleOnBackPressed handleonbackpressed) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 79;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            ((handleOnBackStarted) this.IconCompatParcelizer).IconCompatParcelizer(handleonbackpressed);
            PopupWindow popupWindow = ((startActivityForResult) this.write).ResultReceiver;
            obj.hashCode();
            throw null;
        }
        ((handleOnBackStarted) this.IconCompatParcelizer).IconCompatParcelizer(handleonbackpressed);
        startActivityForResult startactivityforresult = (startActivityForResult) this.write;
        if (startactivityforresult.ResultReceiver != null) {
            startactivityforresult.getLastCustomNonConfigurationInstance.getDecorView().removeCallbacks(startactivityforresult.addOnNewIntentListener);
        }
        if (startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
            int i4 = RemoteActionCompatParcelizer + 87;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getRedirectui getredirectui = startactivityforresult._init_lambda2;
            if (getredirectui != null) {
                getredirectui.serializer();
            }
            getRedirectui getredirectuiWrite = FocusPropertiesNode.write(startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            getredirectuiWrite.RemoteActionCompatParcelizer(0.0f);
            startactivityforresult._init_lambda2 = getredirectuiWrite;
            getredirectuiWrite.IconCompatParcelizer(new removeOnUserLeaveHintListener(i, this));
        }
        startactivityforresult.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.onSupportActionModeFinished(startactivityforresult.MediaSessionCompatToken);
        startactivityforresult.MediaSessionCompatToken = null;
        ViewGroup viewGroup = startactivityforresult.addMenuProvider;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        viewGroup.requestApplyInsets();
        startactivityforresult.MediaSessionCompatQueueItem();
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj = null;
        if (i4 == 7) {
            String str = "QualitySelector{preferredQualities=" + ((List) this.IconCompatParcelizer) + ", fallbackStrategy=" + ((minIntrinsicHeight) this.write) + "}";
            int i5 = RemoteActionCompatParcelizer + 105;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        if (i4 != 28) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.write.getClass().getSimpleName());
        sb.append('{');
        ArrayList arrayList = (ArrayList) this.IconCompatParcelizer;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            sb.append((String) arrayList.get(i6));
            if (i6 < size - 1) {
                int i7 = read + 27;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    sb.append(", ");
                    obj.hashCode();
                    throw null;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // o.CameraXExternalSyntheticLambda0
    public void write(ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk) {
        String strValueOf;
        int i = 2 % 2;
        CaptureResult captureResult = (CaptureResult) this.write;
        super.write(excludeStretchedVideoQualityQuirk);
        ArrayList arrayList = excludeStretchedVideoQualityQuirk.serializer;
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            setInflatedId.read("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("ExposureTime", String.valueOf(l.longValue() / 1.0E9d), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("SensitivityType", String.valueOf(3), arrayList);
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
            int i2 = RemoteActionCompatParcelizer + 123;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            MediaCodecInfoReportIncorrectInfoQuirk mediaCodecInfoReportIncorrectInfoQuirk = MediaCodecInfoReportIncorrectInfoQuirk.AUTO;
            if (num3.intValue() == 0) {
                int i4 = read + 69;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                mediaCodecInfoReportIncorrectInfoQuirk = MediaCodecInfoReportIncorrectInfoQuirk.MANUAL;
            }
            int iOrdinal = mediaCodecInfoReportIncorrectInfoQuirk.ordinal();
            if (iOrdinal == 0) {
                strValueOf = String.valueOf(0);
            } else if (iOrdinal != 1) {
                int i6 = RemoteActionCompatParcelizer + 57;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                strValueOf = null;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } else {
                strValueOf = String.valueOf(1);
            }
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("WhiteBalance", strValueOf, arrayList);
        }
    }

    public /* synthetic */ accessgetGreencp(Object obj) {
        this.serializer = 28;
        this.write = obj;
        this.IconCompatParcelizer = new ArrayList();
    }

    public accessgetGreencp(getDataStoreFileName getdatastorefilename) {
        this.serializer = 26;
        this.IconCompatParcelizer = getdatastorefilename;
    }

    public accessgetGreencp(String str) {
        this.serializer = 0;
        this.IconCompatParcelizer = str.concat(".lck");
    }

    public accessgetGreencp(nativeWriteJpegToSurface nativewritejpegtosurface) {
        this.serializer = 4;
        this.IconCompatParcelizer = nativewritejpegtosurface;
        AndroidGraphicsContext2 androidGraphicsContext2 = new AndroidGraphicsContext2();
        this.write = androidGraphicsContext2;
        androidGraphicsContext2.serializer(new getCurrentMenuItems(getLogo.CLOSED, null));
    }

    public accessgetGreencp(int i) {
        this.serializer = i;
        if (i == 15) {
            this.IconCompatParcelizer = new AtomicReference();
            this.write = new ImageKt(0);
        } else {
            if (i != 27) {
                return;
            }
            this.IconCompatParcelizer = "";
            this.write = new ArrayList();
        }
    }

    public accessgetGreencp(View view) {
        this.serializer = 1;
        this.IconCompatParcelizer = view;
        this.write = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new CoroutineLiveData$$ExternalSyntheticLambda0(18, this));
    }

    public accessgetGreencp(getDividerPadding getdividerpadding) {
        this.serializer = 6;
        this.IconCompatParcelizer = getdividerpadding;
        this.write = null;
    }

    public accessgetGreencp(List list, minIntrinsicHeight minintrinsicheight) {
        boolean z;
        this.serializer = 7;
        if (!list.isEmpty()) {
            z = true;
        } else if (minintrinsicheight != minIntrinsicHeight.serializer) {
            int i = 2 % 2;
            z = true;
        } else {
            int i2 = RemoteActionCompatParcelizer + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        coil3.util.UtilsKt.IconCompatParcelizer("No preferred quality and fallback strategy.", z);
        this.IconCompatParcelizer = Collections.unmodifiableList(new ArrayList(list));
        this.write = minintrinsicheight;
        int i5 = read + 121;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public accessgetGreencp(ArrayList arrayList, ArrayList arrayList2) {
        this.serializer = 11;
        int size = arrayList.size();
        this.IconCompatParcelizer = new int[size];
        this.write = new float[size];
        int i = 0;
        while (i < size) {
            int i2 = RemoteActionCompatParcelizer + 13;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                ((int[]) this.IconCompatParcelizer)[i] = ((Integer) arrayList.get(i)).intValue();
                ((float[]) this.write)[i] = ((Float) arrayList2.get(i)).floatValue();
                i += 73;
            } else {
                ((int[]) this.IconCompatParcelizer)[i] = ((Integer) arrayList.get(i)).intValue();
                ((float[]) this.write)[i] = ((Float) arrayList2.get(i)).floatValue();
                i++;
            }
            int i3 = 2 % 2;
        }
        int i4 = RemoteActionCompatParcelizer + 9;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public accessgetGreencp(int i, int i2) {
        this.serializer = 11;
        this.IconCompatParcelizer = new int[]{i, i2};
        this.write = new float[]{0.0f, 1.0f};
    }

    public accessgetGreencp(int i, int i2, int i3) {
        this.serializer = 11;
        this.IconCompatParcelizer = new int[]{i, i2, i3};
        this.write = new float[]{0.0f, 0.5f, 1.0f};
    }

    public accessgetGreencp(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState) {
        this.serializer = 10;
        this.write = anchoredDraggableState;
        this.IconCompatParcelizer = new booleanValue(anchoredDraggableState);
    }

    public accessgetGreencp(startActivityForResult startactivityforresult, handleOnBackStarted handleonbackstarted) {
        this.serializer = 2;
        this.write = startactivityforresult;
        this.IconCompatParcelizer = handleonbackstarted;
    }

    public /* synthetic */ accessgetGreencp(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }

    public setScreenFlashUiInfo write(int i, FocusMeteringAction focusMeteringAction, ArrayList arrayList, ArrayList arrayList2, CameraControlOperationCanceledException cameraControlOperationCanceledException, Range range, boolean z) {
        int i2;
        android.graphics.Rect rectMediaSessionCompatQueueItem;
        boolean z2;
        boolean z3;
        android.util.Size size;
        int i3 = 2 % 2;
        focusMeteringAction.getClass();
        cameraControlOperationCanceledException.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String str = focusMeteringAction.read();
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
            androidx.camera.core.UseCase useCase = (androidx.camera.core.UseCase) it.next();
            SmallDisplaySizeQuirk smallDisplaySizeQuirk = useCase.MediaSessionCompatToken;
            if (smallDisplaySizeQuirk != null) {
                androidx.camera.camera2.internal.Camera2DeviceSurfaceManager camera2DeviceSurfaceManager = (androidx.camera.camera2.internal.Camera2DeviceSurfaceManager) this.write;
                if (camera2DeviceSurfaceManager != null) {
                    int iRemoteActionCompatParcelizer = useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer();
                    SmallDisplaySizeQuirk smallDisplaySizeQuirk2 = useCase.MediaSessionCompatToken;
                    if (smallDisplaySizeQuirk2 != null) {
                        int i4 = read + 103;
                        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            size = smallDisplaySizeQuirk2.MediaMetadataCompat;
                        } else {
                            android.util.Size size2 = smallDisplaySizeQuirk2.MediaMetadataCompat;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        size = null;
                    }
                    if (size != null) {
                        AeFpsRangeQuirk aeFpsRangeQuirkRatingCompat = useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RatingCompat();
                        androidx.camera.camera2.internal.SupportedSurfaceCombination supportedSurfaceCombination = (androidx.camera.camera2.internal.SupportedSurfaceCombination) camera2DeviceSurfaceManager.RemoteActionCompatParcelizer.get(str);
                        coil3.util.UtilsKt.IconCompatParcelizer("No such camera id in supported combination list: ".concat(str), supportedSurfaceCombination != null);
                        TemporalNoiseQuirk temporalNoiseQuirkSerializer = supportedSurfaceCombination.serializer(iRemoteActionCompatParcelizer);
                        CaptureFailedRetryQuirk captureFailedRetryQuirk = CaptureFailedRetryQuirk.CAPTURE_SESSION_TABLES;
                        AeFpsRangeQuirk aeFpsRangeQuirk = ImageCaptureRotationOptionQuirk.IconCompatParcelizer;
                        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer = com.mapbox.search.base.utils.extension.StringKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, size, temporalNoiseQuirkSerializer, i, captureFailedRetryQuirk, aeFpsRangeQuirkRatingCompat);
                        int iRemoteActionCompatParcelizer2 = useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer();
                        SmallDisplaySizeQuirk smallDisplaySizeQuirk3 = useCase.MediaSessionCompatToken;
                        android.util.Size size3 = smallDisplaySizeQuirk3 != null ? smallDisplaySizeQuirk3.MediaMetadataCompat : null;
                        size3.getClass();
                        getNavigationIcon getnavigationicon = smallDisplaySizeQuirk.read;
                        ArrayList arrayListIconCompatParcelizer = LruCache.IconCompatParcelizer(useCase);
                        InitializationException initializationException = smallDisplaySizeQuirk.serializer;
                        int iIntValue = ((Integer) useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, 0)).intValue();
                        Range range2 = (Range) useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, SmallDisplaySizeQuirk.RemoteActionCompatParcelizer);
                        if (range2 != null) {
                            Boolean bool = (Boolean) useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Boolean.FALSE);
                            Objects.requireNonNull(bool);
                            LegacyCameraOutputConfigNullPointerQuirk legacyCameraOutputConfigNullPointerQuirk = new LegacyCameraOutputConfigNullPointerQuirk(imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, size3, getnavigationicon, arrayListIconCompatParcelizer, initializationException, iIntValue, range2, bool.booleanValue());
                            arrayList3.add(legacyCameraOutputConfigNullPointerQuirk);
                            linkedHashMap2.put(legacyCameraOutputConfigNullPointerQuirk, useCase);
                            linkedHashMap.put(useCase, smallDisplaySizeQuirk);
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                            return null;
                        }
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attached surface resolution cannot be null for already attached use cases.");
                        return null;
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
                    return null;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Object obj2 = pair.second;
        obj2.getClass();
        Map map = (Map) obj2;
        HashMap mapIconCompatParcelizer = androidx.camera.core.internal.CameraUseCaseAdapter.IconCompatParcelizer(arrayList, (Recorder3) cameraControlOperationCanceledException.read(CameraControlOperationCanceledException.serializer, Recorder3.IconCompatParcelizer), (getDividerPadding) this.IconCompatParcelizer, range);
        String str2 = focusMeteringAction.read();
        str2.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            try {
                rectMediaSessionCompatQueueItem = focusMeteringAction.MediaSessionCompatQueueItem();
            } catch (NullPointerException unused) {
                rectMediaSessionCompatQueueItem = null;
            }
            androidx.navigation.NavArgsLazy navArgsLazy = new androidx.navigation.NavArgsLazy(focusMeteringAction, rectMediaSessionCompatQueueItem != null ? MediaStoreVideoCannotWrite.write(rectMediaSessionCompatQueueItem) : null);
            Iterator it2 = arrayList.iterator();
            boolean z4 = false;
            while (it2.hasNext()) {
                androidx.camera.core.UseCase useCase2 = (androidx.camera.core.UseCase) it2.next();
                Object obj3 = mapIconCompatParcelizer.get(useCase2);
                if (obj3 != null) {
                    getImplementationMode getimplementationmode = (getImplementationMode) obj3;
                    HashMap map2 = mapIconCompatParcelizer;
                    ImageUtilCodecFailedException imageUtilCodecFailedException = useCase2.read(focusMeteringAction, getimplementationmode.write, getimplementationmode.IconCompatParcelizer);
                    imageUtilCodecFailedException.getClass();
                    linkedHashMap4.put(imageUtilCodecFailedException, useCase2);
                    linkedHashMap5.put(imageUtilCodecFailedException, navArgsLazy.serializer(imageUtilCodecFailedException));
                    if (imageUtilCodecFailedException.serializer() == 2) {
                        z4 = true;
                    }
                    mapIconCompatParcelizer = map2;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                    return null;
                }
            }
            androidx.camera.camera2.internal.Camera2DeviceSurfaceManager camera2DeviceSurfaceManager2 = (androidx.camera.camera2.internal.Camera2DeviceSurfaceManager) this.write;
            if (camera2DeviceSurfaceManager2 != null) {
                ArrayList arrayList4 = new ArrayList(map.keySet());
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        z3 = false;
                        break;
                    }
                    int i5 = read + 71;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        z2 = false;
                        if (androidx.camera.core.internal.CameraUseCaseAdapter.IconCompatParcelizer((androidx.camera.core.UseCase) it3.next())) {
                            z3 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        int i6 = 74 / 0;
                        if (androidx.camera.core.internal.CameraUseCaseAdapter.IconCompatParcelizer((androidx.camera.core.UseCase) it3.next())) {
                            z3 = true;
                            break;
                        }
                    }
                }
                coil3.util.UtilsKt.IconCompatParcelizer("No new use cases to be bound.", !linkedHashMap5.isEmpty());
                androidx.camera.camera2.internal.SupportedSurfaceCombination supportedSurfaceCombination2 = (androidx.camera.camera2.internal.SupportedSurfaceCombination) camera2DeviceSurfaceManager2.RemoteActionCompatParcelizer.get(str2);
                if (supportedSurfaceCombination2 != null) {
                    z2 = true;
                }
                coil3.util.UtilsKt.IconCompatParcelizer("No such camera id in supported combination list: ".concat(str2), z2);
                LargeJpegImageQuirk largeJpegImageQuirkSerializer = supportedSurfaceCombination2.serializer(i, arrayList4, linkedHashMap5, z4, z3, z);
                HashMap map3 = largeJpegImageQuirkSerializer.write;
                HashMap map4 = largeJpegImageQuirkSerializer.IconCompatParcelizer;
                i2 = largeJpegImageQuirkSerializer.read;
                for (Map.Entry entry : linkedHashMap4.entrySet()) {
                    Object value = entry.getValue();
                    Object obj4 = map3.get(entry.getKey());
                    if (obj4 != null) {
                        linkedHashMap3.put(value, obj4);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                        return null;
                    }
                }
                for (Map.Entry entry2 : map4.entrySet()) {
                    if (map.containsKey(entry2.getKey())) {
                        Object obj5 = map.get(entry2.getKey());
                        if (obj5 != null) {
                            linkedHashMap3.put(obj5, entry2.getValue());
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
                            return null;
                        }
                    }
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
                return null;
            }
        }
        Object obj6 = pair.first;
        obj6.getClass();
        return new setScreenFlashUiInfo(onMove.RemoteActionCompatParcelizer((Map) obj6, linkedHashMap3), i2);
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = 25;
        int i4 = 8;
        switch (this.serializer) {
            case 16:
                AutoAcceptPreferencesFragment autoAcceptPreferencesFragment = (AutoAcceptPreferencesFragment) obj;
                autoAcceptPreferencesFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                autoAcceptPreferencesFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((AndroidIndirectPointerEvent_androidKt) this.write);
                return;
            case 17:
                MessageDialogFragment messageDialogFragment = (MessageDialogFragment) obj;
                messageDialogFragment.getSavedStateRegistry = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                messageDialogFragment.onCreatePanelMenu = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) this.write);
                return;
            case 18:
                ContactRiderActionsFragment contactRiderActionsFragment = (ContactRiderActionsFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                contactRiderActionsFragment.getOnBackPressedDispatcher = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                contactRiderActionsFragment.onActivityResult = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isHiddenannotations) this.write);
                contactRiderActionsFragment.getNavigationEventDispatcher = getstyleable_vector_drawable_group_rotation.getLifecycle();
                return;
            case 19:
                FullScreenDetailsFragment fullScreenDetailsFragment = (FullScreenDetailsFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                fullScreenDetailsFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation2.PlaybackStateCompatCustomAction();
                fullScreenDetailsFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) this.write);
                return;
            case 20:
                InAppCameraWithTagsFragment inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) obj;
                inAppCameraWithTagsFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                inAppCameraWithTagsFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((AndroidIndirectPointerEvent_androidKt) this.write);
                return;
            case 21:
                NestFragment nestFragment = (NestFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation3 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                nestFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation3.PlaybackStateCompatCustomAction();
                nestFragment.invalidateMenu = getstyleable_vector_drawable_group_rotation3.getLifecycle();
                SharedResourcePool sharedResourcePool = new SharedResourcePool(new r8lambda7N09UYmlXn1od8eOh6S1lYPo8aE(new boundingRectInRoot((getTombStone) getstyleable_vector_drawable_group_rotation3.onContentChanged.write())));
                int iIconCompatParcelizer = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer2 = bo.app.n5.IconCompatParcelizer();
                r8lambda93S_WWydVO4tgS0mQqqSoxDXifE r8lambda93s_wwydvo4tgs0mqqqsoxdxife = new r8lambda93S_WWydVO4tgS0mQqqSoxDXifE(sharedResourcePool, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer2), (setTransactionSuccessful) getstyleable_vector_drawable_group_rotation3.toClipEntry.write());
                int i5 = 7;
                getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release = new getSdkEnablementProviderandroid_sdk_base_release(i5);
                int iIconCompatParcelizer3 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer4 = bo.app.n5.IconCompatParcelizer();
                new BrazeExternalSyntheticLambda5(r8lambda93s_wwydvo4tgs0mqqqsoxdxife, getsdkenablementproviderandroid_sdk_base_release, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer3, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer4), new com.huawei.wisesecurity.ucs_credential.g0(0), new logPushStoryPageClickedlambda11(new AndroidUiFrameClock(), new accessisMainThread()), new H$b((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation3.toClipEntry.write(), (restoreChildFragmentState) getstyleable_vector_drawable_group_rotation3.AndroidSelectionHandles_androidKt.write()));
                getAppVersion getappversion = new getAppVersion(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.serializer(), new logPushStoryPageClickedlambda11(new AndroidUiFrameClock(), new accessisMainThread()));
                int i6 = 19;
                sendAttributionRequest sendattributionrequest = new sendAttributionRequest(new isMainThread(i6), new xb(), new accessisMainThread(), getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.serializer(), new logPushStoryPageClickedlambda11(new AndroidUiFrameClock(), new accessisMainThread()));
                new IsFixableByRetry(20);
                com.huawei.wisesecurity.ucs_credential.n0 n0Var = new com.huawei.wisesecurity.ucs_credential.n0(0);
                Parser.Pair pairMediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation3.MediaBrowserCompatMediaItem();
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener = getstyleable_vector_drawable_group_rotation3.addOnPictureInPictureUiStateChangedListener();
                int iIconCompatParcelizer5 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer6 = bo.app.n5.IconCompatParcelizer();
                N$b n$b = new N$b(pairMediaBrowserCompatMediaItem, brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer5, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer6), new internalPathIteratorSize((decode) getstyleable_vector_drawable_group_rotation3.setItemInvoker.write()));
                SendTestPushUseCase sendTestPushUseCase = new SendTestPushUseCase(getstyleable_vector_drawable_group_rotation3.MediaBrowserCompatMediaItem());
                getStoreIdFromSystem getstoreidfromsystemSerializer = getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.serializer();
                new stopInstancelambda11(i4);
                NetworkBody networkBody = new NetworkBody(new xb(), new u6(), new isMainThread(i6));
                Vw$Vw vw$Vw = new Vw$Vw(getstyleable_vector_drawable_group_rotation3.MediaBrowserCompatMediaItem(), 28, getstyleable_vector_drawable_group_rotation3.addOnPictureInPictureUiStateChangedListener());
                new getSdkEnablementProviderandroid_sdk_base_release(i5);
                int iIconCompatParcelizer7 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer8 = bo.app.n5.IconCompatParcelizer();
                BrazeExternalSyntheticLambda45 brazeExternalSyntheticLambda45 = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer7, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer8);
                com.huawei.wisesecurity.ucs_credential.g0 g0Var = new com.huawei.wisesecurity.ucs_credential.g0(0);
                H$b h$b = new H$b((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation3.toClipEntry.write(), (restoreChildFragmentState) getstyleable_vector_drawable_group_rotation3.AndroidSelectionHandles_androidKt.write());
                C$b c$b = new C$b();
                c$b.serializer = brazeExternalSyntheticLambda45;
                c$b.write = g0Var;
                c$b.IconCompatParcelizer = h$b;
                Parser.Pair pairMediaBrowserCompatMediaItem2 = getstyleable_vector_drawable_group_rotation3.MediaBrowserCompatMediaItem();
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener2 = getstyleable_vector_drawable_group_rotation3.addOnPictureInPictureUiStateChangedListener();
                int iIconCompatParcelizer9 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer10 = bo.app.n5.IconCompatParcelizer();
                clearView clearview = new clearView(pairMediaBrowserCompatMediaItem2, brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener2, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer9, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer10));
                Parser.Pair pairMediaBrowserCompatMediaItem3 = getstyleable_vector_drawable_group_rotation3.MediaBrowserCompatMediaItem();
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener3 = getstyleable_vector_drawable_group_rotation3.addOnPictureInPictureUiStateChangedListener();
                int iIconCompatParcelizer11 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer12 = bo.app.n5.IconCompatParcelizer();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(pairMediaBrowserCompatMediaItem3, brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener3, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer11, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer12));
                new IsFixableByRetry(25);
                setCountrylambda1 setcountrylambda1 = new setCountrylambda1();
                setcountrylambda1.RemoteActionCompatParcelizer = getappversion;
                setcountrylambda1.read = sendattributionrequest;
                setcountrylambda1.write = n0Var;
                setcountrylambda1.MediaSessionCompatQueueItem = n$b;
                setcountrylambda1.MediaMetadataCompat = sendTestPushUseCase;
                setcountrylambda1.RatingCompat = getstoreidfromsystemSerializer;
                setcountrylambda1.PlaybackStateCompatCustomAction = networkBody;
                setcountrylambda1.IconCompatParcelizer = vw$Vw;
                setcountrylambda1.serializer = c$b;
                setcountrylambda1.MediaBrowserCompatMediaItem = clearview;
                setcountrylambda1.MediaDescriptionCompat = gridLayoutManager;
                nestFragment.getSavedStateRegistry = setcountrylambda1;
                nestFragment.onBackPressed = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getModels) this.write);
                return;
            case 22:
                com.roadrunner.push.presentation.MessageDialogFragment messageDialogFragment2 = (com.roadrunner.push.presentation.MessageDialogFragment) obj;
                messageDialogFragment2.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                messageDialogFragment2.getNavigationEventDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((lambdaprocessAndResolveDeeplink15) this.write);
                return;
            case 23:
                RiderSafetyReportFragment riderSafetyReportFragment = (RiderSafetyReportFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation4 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                riderSafetyReportFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation4.PlaybackStateCompatCustomAction();
                riderSafetyReportFragment.getSavedStateRegistry = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getModels) this.write);
                riderSafetyReportFragment.getNavigationEventDispatcher = getstyleable_vector_drawable_group_rotation4.getDefaultViewModelProviderFactory();
                int i7 = RemoteActionCompatParcelizer + 111;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return;
            case 24:
                SideMenuFragment sideMenuFragment = (SideMenuFragment) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation5 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer;
                sideMenuFragment.initializeViewTreeOwners = getstyleable_vector_drawable_group_rotation5.PlaybackStateCompatCustomAction();
                sideMenuFragment.read = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((accessgetAreOutboundNetworkRequestsOfflinecp) this.write);
                sideMenuFragment.serializer = (r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM) getstyleable_vector_drawable_group_rotation5.MeasuredPage.write();
                new BrazeExternalSyntheticLambda5(9);
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener4 = getstyleable_vector_drawable_group_rotation5.addOnPictureInPictureUiStateChangedListener();
                int iIconCompatParcelizer13 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer14 = bo.app.n5.IconCompatParcelizer();
                r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4 r8lambdavhjvxyggllvhk5agniqgyzerf4 = new r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4(new r8lambdakakRSJ0yRWnWIggdAd9IDPYuM(brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener4, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation5}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer13, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer14), getstyleable_vector_drawable_group_rotation5.MediaBrowserCompatMediaItem(), new setRoundRectOutlineTNW_H78default(i4)));
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener5 = getstyleable_vector_drawable_group_rotation5.addOnPictureInPictureUiStateChangedListener();
                int iIconCompatParcelizer15 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer16 = bo.app.n5.IconCompatParcelizer();
                GetAppStateImpl getAppStateImpl = new GetAppStateImpl(i3, new r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4(new r8lambdakakRSJ0yRWnWIggdAd9IDPYuM(brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener5, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation5}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer15, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer16), getstyleable_vector_drawable_group_rotation5.MediaBrowserCompatMediaItem(), new setRoundRectOutlineTNW_H78default(i4))));
                BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener6 = getstyleable_vector_drawable_group_rotation5.addOnPictureInPictureUiStateChangedListener();
                int iIconCompatParcelizer17 = bo.app.n5.IconCompatParcelizer();
                int iIconCompatParcelizer18 = bo.app.n5.IconCompatParcelizer();
                r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4 r8lambdavhjvxyggllvhk5agniqgyzerf5 = new r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4(new r8lambdakakRSJ0yRWnWIggdAd9IDPYuM(brazeExternalSyntheticLambda26AddOnPictureInPictureUiStateChangedListener6, (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation5}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer17, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer18), getstyleable_vector_drawable_group_rotation5.MediaBrowserCompatMediaItem(), new setRoundRectOutlineTNW_H78default(i4)));
                GetAppStateImpl getAppStateImpl2 = new GetAppStateImpl((accessgetCustomBrazeNotificationFactorycp) getstyleable_vector_drawable_group_rotation5.SelectionHandlewLIcFTc.write());
                N$b n$b2 = new N$b();
                n$b2.read = r8lambdavhjvxyggllvhk5agniqgyzerf4;
                n$b2.write = getAppStateImpl;
                n$b2.IconCompatParcelizer = r8lambdavhjvxyggllvhk5agniqgyzerf5;
                n$b2.serializer = getAppStateImpl2;
                sideMenuFragment.RemoteActionCompatParcelizer = n$b2;
                return;
            default:
                TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment = (TimeChangedBlockingDialogFragment) obj;
                timeChangedBlockingDialogFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.IconCompatParcelizer).PlaybackStateCompatCustomAction();
                timeChangedBlockingDialogFragment.getOnBackPressedDispatcher = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4) this.write);
                return;
        }
    }
}
