package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.legacy.ui.preferences.SettingsActivity;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.zzw;
import com.google.android.gms.internal.mlkit_vision_common.zzaj;
import com.google.android.gms.internal.mlkit_vision_face.zzcv;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.tasks.Task;
import com.roadrunner.adjust.ui.AdjustTrueLinkBrowsableActivity;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.custom.password.presentation.CustomPasswordActivity;
import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.deeplink.DeepLinkActivity;
import com.roadrunner.delivery.accept.autoaccept.preferences.presentation.AutoAcceptPreferencesFragment;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.ContentSharingFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.PhotoSharedSuccessDialogFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.TripPlannerActionsFragment;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.DoubleConfirmationFragment;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderActionsFragment;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.FullScreenDetailsFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragmentV2;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.CodeScanFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.diagnostics.presentation.activity.DiagnosticsActivity;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationContainerFragment;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogFragment;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.opportunities.calendar.BonusCalendarFragment;
import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.order.history.presentation.HistoryDialogFragment;
import com.roadrunner.order.history.presentation.HistoryNavContainerFragment;
import com.roadrunner.order.history.presentation.main.HistoryFragment;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.permission.location.gps.presentation.GPSActivity;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationFragment;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;
import com.roadrunner.rider.state.breakrequest.SelectBreakDurationFragment;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoBottomSheet;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.roadrunner.web.download.WebViewDownloadHandler;
import com.roadrunner.web.presentation.authWebView.AuthWebFragment;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.roadrunner.web.presentation.simpleWebView.SimpleWebViewFragment;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import com.ui.common.widget.message_dialog.MessageDialogFragment;
import io.grpc.SynchronizationContext$1;
import io.sentry.util.UrlUtils;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public class accessgetTvTeletextcp implements accessrecordJVtK1S4jd, drawOvalnJ9OG0default, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, PinnableContainer, getDiffer, getMeasurePolicy, LookaheadLayoutCoordinatesKt {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public static accessgetTvTeletextcp read;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object serializer;
    public Object write;

    public void IconCompatParcelizer(int i, int i2, long j, long j2) {
        synchronized (this) {
            ((LookaheadScopeKtLookaheadScope221) this.RemoteActionCompatParcelizer).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            AtomicLong atomicLong = (AtomicLong) this.write;
            if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
                return;
            }
            ((accessgetSlashcp) this.serializer).serializer(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new resizeGraphicFrameIfAppropriatelambda0(jElapsedRealtime, 6, this));
        }
    }

    public void RemoteActionCompatParcelizer(calculateSemanticsConfiguration calculatesemanticsconfiguration) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        this.write = calculatesemanticsconfiguration;
        int i5 = i3 + 23;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public void read(Extras$Key extras$Key) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 121;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = extras$Key;
        } else {
            this.serializer = extras$Key;
            int i3 = 21 / 0;
        }
    }

    public void write(HitTestResultKt hitTestResultKt) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        this.RemoteActionCompatParcelizer = hitTestResultKt;
        int i5 = i3 + 27;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void RemoteActionCompatParcelizer(calculateAlignmentLine calculatealignmentline) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 75;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.RemoteActionCompatParcelizer = calculatealignmentline;
        int i5 = i2 + 45;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public void read(remeasureSync remeasuresync) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        this.RemoteActionCompatParcelizer = remeasuresync;
        int i5 = i3 + 99;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        if (this.IconCompatParcelizer == 9) {
            Rpc rpc = (Rpc) this.serializer;
            String str = (String) this.RemoteActionCompatParcelizer;
            ScheduledFuture scheduledFuture = (ScheduledFuture) this.write;
            synchronized (rpc.read) {
                rpc.read.remove(str);
            }
            scheduledFuture.cancel(false);
            return;
        }
        ((getBackEK5gGoQ) this.RemoteActionCompatParcelizer).removeCallbacksAndMessages(null);
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.serializer;
        if (task.isSuccessful()) {
            parentDataModifierDefaultImpls.write(task.getResult());
        } else {
            if (task.isCanceled()) {
                ((getMeasuredSizeYbymL2g) this.write).write.RemoteActionCompatParcelizer((Object) null);
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            parentDataModifierDefaultImpls.IconCompatParcelizer(exception);
        }
    }

    public void write(accessgetDummyViewConfigurationcp accessgetdummyviewconfigurationcp) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        this.RemoteActionCompatParcelizer = accessgetdummyviewconfigurationcp;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 71;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public accessgetTvTeletextcp(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.IconCompatParcelizer = i;
        int i2 = 4;
        if (i == 5) {
            this.serializer = this;
            this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation;
            this.write = new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME(this, i2);
            return;
        }
        int i3 = 11;
        if (i == 6) {
            this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation;
            this.serializer = new applyLayoutFeatures(getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.AnimatedContentTransitionScopeImplSizeModifierNode, getstyleable_vector_drawable_group_rotation.calculateApproachOffset, 12);
            this.write = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.FlingCancellationException, i3);
            return;
        }
        int i4 = 10;
        if (i == 7) {
            this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation;
            readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery = new readInstallReferrerHuaweiAppGallery(14);
            readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery2 = new readInstallReferrerHuaweiAppGallery(16);
            readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery3 = new readInstallReferrerHuaweiAppGallery(13);
            readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery4 = new readInstallReferrerHuaweiAppGallery(i3);
            readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery5 = new readInstallReferrerHuaweiAppGallery(i4);
            getDataStoreFileName getdatastorefilename = new getDataStoreFileName(3, readinstallreferrerhuaweiappgallery5, readinstallreferrerhuaweiappgallery, readinstallreferrerhuaweiappgallery2, readinstallreferrerhuaweiappgallery3, readinstallreferrerhuaweiappgallery4, new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(4, readinstallreferrerhuaweiappgallery4, readinstallreferrerhuaweiappgallery, readinstallreferrerhuaweiappgallery2, readinstallreferrerhuaweiappgallery3, readinstallreferrerhuaweiappgallery5));
            r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw r8lambdazcildvoiqyr1yqsoxhhdusfdjyw = getstyleable_vector_drawable_group_rotation.play;
            setPresentationView setpresentationview = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
            lambda31 lambda31Var = new lambda31((mergeJsonObjects) r8lambdazcildvoiqyr1yqsoxhhdusfdjyw, (getColorIntegerOrNulllambda0) getdatastorefilename, (getColorIntegerOrNulllambda0) setpresentationview, i2);
            executeQuery executequery = new executeQuery(getstyleable_vector_drawable_group_rotation.AbstractClickableNodeonKeyEvent1, i4);
            this.serializer = new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(lambda31Var, new isHiddenannotations(executequery, setpresentationview, getstyleable_vector_drawable_group_rotation.drag, getstyleable_vector_drawable_group_rotation.toClipEntry, 3), executequery, new getFailureMessage(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk, r8lambdazcildvoiqyr1yqsoxhhdusfdjyw, getstyleable_vector_drawable_group_rotation.ContentInViewNodelaunchAnimation21, 3), getstyleable_vector_drawable_group_rotation.accessdispatchMouseWheelScrollwaitNextScrollDelta);
            this.write = getDoubleOrNull.write(new setStateRestorationPolicy(new SignInDataStore(getDoubleOrNull.write(new RecyclerView7()), getstyleable_vector_drawable_group_rotation.drag, getstyleable_vector_drawable_group_rotation.toClipEntry)));
            return;
        }
        int i5 = 9;
        int i6 = 8;
        if (i != 8) {
            this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation;
            r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8 r8lambdans7bywa6reyjg6iizz7pak0ee8 = new r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8(5);
            r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8 = new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(getstyleable_vector_drawable_group_rotation.onConsumedWindowInsetsChanged, i5);
            setPresentationView setpresentationview2 = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
            mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.Contentfoundation;
            this.serializer = new getModels(5, r8lambdans7bywa6reyjg6iizz7pak0ee8, r8lambdahmuf48geqgedwlhl7mczo1q1bv8, setpresentationview2, mergejsonobjects, getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.TextFieldSelectionManagercopy1, getstyleable_vector_drawable_group_rotation.WindowCallbackWrapper);
            this.write = new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(getstyleable_vector_drawable_group_rotation.FlingCancellationException, new r8lambda4ctur6dHthQRF8ridJfgtUMxjY0(0, setpresentationview2, getstyleable_vector_drawable_group_rotation.ScrollableKt, getstyleable_vector_drawable_group_rotation.getTabContainer, getstyleable_vector_drawable_group_rotation.getId, mergejsonobjects), new setSdkAuthenticationSignature(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.accessprocessDragStart, 0), getstyleable_vector_drawable_group_rotation.getContentInsetLeft, new r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8(mergejsonobjects, i4));
            return;
        }
        this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation;
        this.serializer = new PreferenceGroupAdapter((getColorIntegerOrNulllambda0) new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.toClipEntry, i6), (mergeJsonObjects) getstyleable_vector_drawable_group_rotation.VideoCapture, i5);
        this.write = getDoubleOrNull.write(new fetch(new C$b((PreferenceGroupAdapter) this.serializer, getDoubleOrNull.write(new HttpException()), getstyleable_vector_drawable_group_rotation.setTitle)));
    }

    @Override // o.accessrecordJVtK1S4jd
    public void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        if (this.IconCompatParcelizer != 1) {
            return;
        }
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) ((toLinear) this.RemoteActionCompatParcelizer).write;
        synchronized (recyclableBufferedInputStream) {
            recyclableBufferedInputStream.IconCompatParcelizer = recyclableBufferedInputStream.serializer.length;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:8:0x0029, B:21:0x006f, B:24:0x008d, B:15:0x0036, B:17:0x005c, B:19:0x0067, B:20:0x006b), top: B:53:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005c A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:8:0x0029, B:21:0x006f, B:24:0x008d, B:15:0x0036, B:17:0x005c, B:19:0x0067, B:20:0x006b), top: B:53:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:8:0x0029, B:21:0x006f, B:24:0x008d, B:15:0x0036, B:17:0x005c, B:19:0x0067, B:20:0x006b), top: B:53:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x006b A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:8:0x0029, B:21:0x006f, B:24:0x008d, B:15:0x0036, B:17:0x005c, B:19:0x0067, B:20:0x006b), top: B:53:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[Catch: all -> 0x002c, PHI: r10
  0x006f: PHI (r10v21 int) = (r10v15 int), (r10v0 int) binds: [B:14:0x0034, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x002c, blocks: (B:8:0x0029, B:21:0x006f, B:24:0x008d, B:15:0x0036, B:17:0x005c, B:19:0x0067, B:20:0x006b), top: B:53:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7 A[PHI: r10
  0x00f7: PHI (r10v8 int) = (r10v1 int), (r10v0 int) binds: [B:37:0x00dc, B:35:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.getMeasurePolicy, o.LookaheadLayoutCoordinatesKt
    public void IconCompatParcelizer(String str, int i, Throwable th, byte[] bArr, Map map) {
        getCallback getcallback;
        zzgz zzgzVar;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1;
        String strSubstring;
        Object obj;
        int i2 = this.IconCompatParcelizer;
        if (i2 == 19) {
            NoWindowInsetsAnimation noWindowInsetsAnimation = (NoWindowInsetsAnimation) this.RemoteActionCompatParcelizer;
            noWindowInsetsAnimation.MediaSessionCompatToken();
            zzom zzomVar = (zzom) this.write;
            if (i == 200 || i == 204) {
                if (th == null) {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.PlaybackStateCompat.serializer(Long.valueOf(zzomVar.write), "[sgtm] Upload succeeded for row_id");
                    getcallback = getCallback.SUCCESS;
                } else {
                    getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.MediaSessionCompatQueueItem.IconCompatParcelizer("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.write), Integer.valueOf(i), th);
                    if (Arrays.asList(((String) premeasure0kLqBqw.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ.IconCompatParcelizer(null)).split(",")).contains(String.valueOf(i))) {
                        getcallback = getCallback.BACKOFF;
                    } else {
                        getcallback = getCallback.FAILURE;
                    }
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.PlaybackStateCompat.serializer(Long.valueOf(zzomVar.write), "[sgtm] Upload succeeded for row_id");
                    getcallback = getCallback.SUCCESS;
                } else {
                    getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.MediaSessionCompatQueueItem.IconCompatParcelizer("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.write), Integer.valueOf(i), th);
                    if (Arrays.asList(((String) premeasure0kLqBqw.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ.IconCompatParcelizer(null)).split(",")).contains(String.valueOf(i))) {
                        getcallback = getCallback.BACKOFF;
                    } else {
                        getcallback = getCallback.FAILURE;
                    }
                }
            } else {
                getLookaheadDelegate getlookaheaddelegate5 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                getlookaheaddelegate5.MediaSessionCompatQueueItem.IconCompatParcelizer("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.write), Integer.valueOf(i), th);
                if (Arrays.asList(((String) premeasure0kLqBqw.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ.IconCompatParcelizer(null)).split(",")).contains(String.valueOf(i))) {
                    getcallback = getCallback.BACKOFF;
                } else {
                    getcallback = getCallback.FAILURE;
                }
            }
            AtomicReference atomicReference = (AtomicReference) this.serializer;
            setViewportBounds setviewportboundsMediaDescriptionCompat = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
            long j = zzomVar.write;
            zzaf zzafVar = new zzaf(j, zzomVar.MediaDescriptionCompat, getcallback.zza());
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new SynchronizationContext$1(setviewportboundsMediaDescriptionCompat, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(true), zzafVar, 12));
            getLookaheadDelegate getlookaheaddelegate6 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
            getlookaheaddelegate6.PlaybackStateCompat.serializer("[sgtm] Updated status for row_id", Long.valueOf(j), getcallback);
            synchronized (atomicReference) {
                atomicReference.set(getcallback);
                atomicReference.notifyAll();
            }
            return;
        }
        if (i2 == 20) {
            ((zzpg) this.write).write(true, i, th, bArr, (String) this.RemoteActionCompatParcelizer, (ArrayList) this.serializer);
            return;
        }
        long j2 = ((OnLayoutRectChangedModifierKt) this.serializer).RemoteActionCompatParcelizer;
        zzpg zzpgVar = (zzpg) this.write;
        String str2 = (String) this.RemoteActionCompatParcelizer;
        zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
        zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                zzpgVar._init_lambda3 = false;
                zzpgVar.MediaSessionCompatQueueItem();
            }
        }
        if (i == 200) {
            if (th == null) {
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
                layoutNodeSubcompositionsStatecreateMeasurePolicy2.write(Long.valueOf(j2));
                zzpgVar.RatingCompat().PlaybackStateCompat.serializer("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                zzgzVar = zzpgVar.MediaSessionCompatToken;
                zzpg.serializer(zzgzVar);
                if (zzgzVar.serializer()) {
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
                    if (layoutNodeSubcompositionsStatecreateMeasurePolicy1.read(str2)) {
                        zzpgVar.write(str2);
                    } else {
                        zzpgVar.MediaMetadataCompat();
                    }
                } else {
                    zzpgVar.MediaMetadataCompat();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                zzgs zzgsVar = zzpgVar.RatingCompat().RatingCompat;
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                zzgsVar.IconCompatParcelizer("Network upload failed. Will retry later. appId, status, error", str2, Integer.valueOf(i), obj);
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy3 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy3);
                layoutNodeSubcompositionsStatecreateMeasurePolicy3.RemoteActionCompatParcelizer(Long.valueOf(j2));
                zzpgVar.MediaMetadataCompat();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy4 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy4);
                layoutNodeSubcompositionsStatecreateMeasurePolicy4.write(Long.valueOf(j2));
                zzpgVar.RatingCompat().PlaybackStateCompat.serializer("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                zzgzVar = zzpgVar.MediaSessionCompatToken;
                zzpg.serializer(zzgzVar);
                if (zzgzVar.serializer()) {
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
                    if (layoutNodeSubcompositionsStatecreateMeasurePolicy1.read(str2)) {
                        zzpgVar.write(str2);
                    } else {
                        zzpgVar.MediaMetadataCompat();
                    }
                } else {
                    zzpgVar.MediaMetadataCompat();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                zzgs zzgsVar2 = zzpgVar.RatingCompat().RatingCompat;
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                zzgsVar2.IconCompatParcelizer("Network upload failed. Will retry later. appId, status, error", str2, Integer.valueOf(i), obj);
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy5 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy5);
                layoutNodeSubcompositionsStatecreateMeasurePolicy5.RemoteActionCompatParcelizer(Long.valueOf(j2));
                zzpgVar.MediaMetadataCompat();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            zzgs zzgsVar3 = zzpgVar.RatingCompat().RatingCompat;
            obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            zzgsVar3.IconCompatParcelizer("Network upload failed. Will retry later. appId, status, error", str2, Integer.valueOf(i), obj);
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy6 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy6);
            layoutNodeSubcompositionsStatecreateMeasurePolicy6.RemoteActionCompatParcelizer(Long.valueOf(j2));
            zzpgVar.MediaMetadataCompat();
        }
    }

    public void serializer(Extras$Key extras$Key) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        if (i5 == 24) {
            this.serializer = extras$Key;
            return;
        }
        if (i5 == 25) {
            this.serializer = extras$Key;
            return;
        }
        this.serializer = extras$Key;
        int i6 = i3 + 57;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void read(getZSortedChildrenannotations getzsortedchildrenannotations) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 3;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (((ArrayList) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("setAnnotations cannot be called after build()");
            int i5 = MediaDescriptionCompat + 99;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i6 = i2 + 29;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            this.serializer = getzsortedchildrenannotations;
        } else {
            this.serializer = getzsortedchildrenannotations;
            int i7 = 35 / 0;
        }
    }

    public void IconCompatParcelizer(Integer num) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 75;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        switch (this.IconCompatParcelizer) {
            case 24:
                this.write = num;
                break;
            case 25:
                this.write = num;
                int i5 = i2 + 13;
                MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                break;
            case 26:
                this.write = num;
                break;
            default:
                this.write = num;
                break;
        }
    }

    public void serializer(int i) {
        int i2 = 2 % 2;
        if (((ArrayList) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("setPrimaryKeyId cannot be called after build()");
            return;
        }
        int i3 = MediaDescriptionCompat + 37;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.write = Integer.valueOf(i);
        int i5 = MediaMetadataCompat + 13;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void write(Object obj, String str) {
        int i = 2 % 2;
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp((byte) 0, 15);
        ((accessgetTvTeletextcp) this.write).write = accessgettvteletextcp;
        this.write = accessgettvteletextcp;
        accessgettvteletextcp.serializer = obj;
        accessgettvteletextcp.RemoteActionCompatParcelizer = str;
        int i2 = MediaMetadataCompat + 51;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public void write(removeNodesInRange removenodesinrange, int i, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 35;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ArrayList arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
        if (arrayList != null) {
            arrayList.add(new onChildRemoved(removenodesinrange, i, str, str2));
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("addEntry cannot be called after build()");
        int i4 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.write = Boolean.TRUE;
            obj.hashCode();
            throw null;
        }
        this.write = Boolean.TRUE;
        int i3 = MediaDescriptionCompat + 59;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void read(int i) throws GeneralSecurityException {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat;
        int i4 = i3 + 65;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0 ? i >= 10 : i >= 119) {
            if (16 >= i) {
                int i5 = i3 + 3;
                MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    this.serializer = Integer.valueOf(i);
                    int i6 = 20 / 0;
                    return;
                } else {
                    this.serializer = Integer.valueOf(i);
                    return;
                }
            }
        }
        throw new GeneralSecurityException(c8$$ExternalSyntheticOutline0.m(i, "Invalid tag size for AesCmacParameters: "));
    }

    @Override // o.getDiffer
    public /* synthetic */ getDiffer serializer(Class cls, accessdetachAndRemoveNode accessdetachandremovenode) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 69;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer == 11) {
            ((HashMap) this.RemoteActionCompatParcelizer).put(cls, accessdetachandremovenode);
            ((HashMap) this.serializer).remove(cls);
            return this;
        }
        ((HashMap) this.RemoteActionCompatParcelizer).put(cls, accessdetachandremovenode);
        ((HashMap) this.serializer).remove(cls);
        int i4 = MediaDescriptionCompat + 29;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return this;
    }

    public void write(int i) throws InvalidAlgorithmParameterException {
        int i2 = 2 % 2;
        if (i != 16) {
            int i3 = MediaDescriptionCompat + 41;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaMetadataCompat = i4;
            int i5 = i3 % 2;
            if (i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
            }
            int i6 = i4 + 11;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        this.RemoteActionCompatParcelizer = Integer.valueOf(i);
    }

    @Override // o.drawOvalnJ9OG0default
    public generateOetf RemoteActionCompatParcelizer(generateOetf generateoetf, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 33;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Drawable drawable = (Drawable) generateoetf.IconCompatParcelizer();
        getCanvas getcanvas = null;
        if (!(drawable instanceof BitmapDrawable)) {
            if (!(drawable instanceof drawImage9jGpkUEdefault)) {
                return null;
            }
            int i5 = MediaMetadataCompat + 43;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            generateOetf generateoetfRemoteActionCompatParcelizer = ((drawPointsGsft0Wsdefault) this.write).RemoteActionCompatParcelizer(generateoetf, geteotffuncui_graphics);
            int i7 = MediaDescriptionCompat + 81;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return generateoetfRemoteActionCompatParcelizer;
        }
        DeltaDecoder deltaDecoder = (DeltaDecoder) this.serializer;
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        getD getd = (getD) this.RemoteActionCompatParcelizer;
        if (bitmap == null) {
            i = MediaDescriptionCompat + 67;
        } else {
            getcanvas = new getCanvas(bitmap, getd);
            i = MediaDescriptionCompat + 123;
        }
        MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i % 2;
        return deltaDecoder.RemoteActionCompatParcelizer(getcanvas, geteotffuncui_graphics);
    }

    public zzw PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = (Boolean) this.serializer;
        if (bool == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("allowTestKeys must be set");
            int i3 = MediaMetadataCompat + 13;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
        if (((Boolean) this.write) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("isGoogleOrPlatformOnly must be set");
            return null;
        }
        String str = (String) this.RemoteActionCompatParcelizer;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.write).booleanValue();
        zzw zzwVar = new zzw();
        zzwVar.RemoteActionCompatParcelizer = str;
        zzwVar.write = zBooleanValue;
        zzwVar.read = zBooleanValue2;
        int i5 = MediaMetadataCompat + 43;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return zzwVar;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        if (this.IconCompatParcelizer != 10) {
            Object objClone = super.clone();
            int i2 = MediaDescriptionCompat + 81;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objClone;
        }
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp(((getNumPadDivideEK5gGoQ) this.RemoteActionCompatParcelizer).clone());
        Iterator it = ((ArrayList) this.write).iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i4 = MediaDescriptionCompat + 99;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return accessgettvteletextcp;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = MediaMetadataCompat + 57;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ((ArrayList) accessgettvteletextcp.write).add(((getNumPadDivideEK5gGoQ) it.next()).clone());
                throw null;
            }
            ((ArrayList) accessgettvteletextcp.write).add(((getNumPadDivideEK5gGoQ) it.next()).clone());
        }
    }

    public void IconCompatParcelizer(int i, String str) {
        int i2 = 2 % 2;
        createMeasurePolicy createmeasurepolicy = new createMeasurePolicy((byte) 0, 15);
        ((accessgetTvTeletextcp) this.write).write = createmeasurepolicy;
        this.write = createmeasurepolicy;
        createmeasurepolicy.serializer = String.valueOf(i);
        createmeasurepolicy.RemoteActionCompatParcelizer = str;
        int i3 = MediaDescriptionCompat + 109;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public void read(boolean z) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = Boolean.valueOf(z);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
    }

    @Override // o.accessrecordJVtK1S4jd
    public int serializer() throws Throwable {
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream;
        int i = 2 % 2;
        if (this.IconCompatParcelizer == 1) {
            List list = (List) this.write;
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream2 = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) ((toLinear) this.RemoteActionCompatParcelizer).write;
            recyclableBufferedInputStream2.reset();
            return resizeToBitmapDimensionslambda3.serializer(list, recyclableBufferedInputStream2, (getF) this.serializer);
        }
        List list2 = (List) this.serializer;
        toLinear tolinear = (toLinear) this.write;
        getF getf = (getF) this.RemoteActionCompatParcelizer;
        int size = list2.size();
        int i2 = MediaDescriptionCompat + 71;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < size; i4++) {
            accessgetMaxp accessgetmaxp = (accessgetMaxp) list2.get(i4);
            try {
                FileDescriptor fileDescriptor = tolinear.IconCompatParcelizer().getFileDescriptor();
                recyclableBufferedInputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(getActiveFocusTargetNode.serializer(new FileInputStream(fileDescriptor), fileDescriptor), getf);
                try {
                    int iRemoteActionCompatParcelizer = accessgetmaxp.RemoteActionCompatParcelizer(recyclableBufferedInputStream, getf);
                    recyclableBufferedInputStream.write();
                    tolinear.IconCompatParcelizer();
                    if (iRemoteActionCompatParcelizer != -1) {
                        return iRemoteActionCompatParcelizer;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (recyclableBufferedInputStream != null) {
                        int i5 = MediaMetadataCompat + 53;
                        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            recyclableBufferedInputStream.write();
                            int i6 = 32 / 0;
                        } else {
                            recyclableBufferedInputStream.write();
                        }
                    }
                    tolinear.IconCompatParcelizer();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                recyclableBufferedInputStream = null;
            }
        }
        return -1;
    }

    @Override // o.accessrecordJVtK1S4jd
    public ImageHeaderParser$ImageType RatingCompat() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 41;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = null;
        if (i2 % 2 != 0) {
            recyclableBufferedInputStream.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer == 1) {
            List list = (List) this.write;
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream2 = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) ((toLinear) this.RemoteActionCompatParcelizer).write;
            recyclableBufferedInputStream2.reset();
            return resizeToBitmapDimensionslambda3.IconCompatParcelizer(list, recyclableBufferedInputStream2, (getF) this.serializer);
        }
        List list2 = (List) this.serializer;
        toLinear tolinear = (toLinear) this.write;
        getF getf = (getF) this.RemoteActionCompatParcelizer;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            accessgetMaxp accessgetmaxp = (accessgetMaxp) list2.get(i3);
            try {
                FileDescriptor fileDescriptor = tolinear.IconCompatParcelizer().getFileDescriptor();
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream3 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(getActiveFocusTargetNode.serializer(new FileInputStream(fileDescriptor), fileDescriptor), getf);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeIconCompatParcelizer = accessgetmaxp.IconCompatParcelizer(recyclableBufferedInputStream3);
                    recyclableBufferedInputStream3.write();
                    tolinear.IconCompatParcelizer();
                    if (imageHeaderParser$ImageTypeIconCompatParcelizer != ImageHeaderParser$ImageType.UNKNOWN) {
                        return imageHeaderParser$ImageTypeIconCompatParcelizer;
                    }
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream3;
                    if (recyclableBufferedInputStream != null) {
                        int i4 = MediaMetadataCompat + 87;
                        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        recyclableBufferedInputStream.write();
                    }
                    tolinear.IconCompatParcelizer();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public String toString() {
        int i = 2 % 2;
        if (this.IconCompatParcelizer != 16) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append((String) this.RemoteActionCompatParcelizer);
        sb.append('{');
        accessgetTvTeletextcp accessgettvteletextcp = (accessgetTvTeletextcp) ((accessgetTvTeletextcp) this.serializer).write;
        int i2 = MediaDescriptionCompat + 83;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = "";
        while (accessgettvteletextcp != null) {
            int i4 = MediaMetadataCompat + 85;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object obj = accessgettvteletextcp.serializer;
                sb.append(str);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object obj3 = accessgettvteletextcp.serializer;
            sb.append(str);
            String str2 = (String) accessgettvteletextcp.RemoteActionCompatParcelizer;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj3 == null || !obj3.getClass().isArray()) {
                sb.append(obj3);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj3});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            accessgettvteletextcp = (accessgetTvTeletextcp) accessgettvteletextcp.write;
            int i5 = MediaMetadataCompat + 1;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 5 / 5;
            }
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // o.accessrecordJVtK1S4jd
    public Bitmap RemoteActionCompatParcelizer(BitmapFactory.Options options) throws Throwable {
        int i = 2 % 2;
        if (this.IconCompatParcelizer == 1) {
            com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) ((toLinear) this.RemoteActionCompatParcelizer).write;
            recyclableBufferedInputStream.reset();
            return invalidateFocusProperties.IconCompatParcelizer(recyclableBufferedInputStream, options, this);
        }
        FileDescriptor fileDescriptor = ((toLinear) this.write).IconCompatParcelizer().getFileDescriptor();
        int i2 = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i2 == 34 && i2 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE && ((Boolean) drawContent.IconCompatParcelizer.B_()).booleanValue()) {
            try {
                boolean zPlaybackStateCompat = PlaybackStateCompat();
                Log.isLoggable("GlideBitmapFactory", 2);
                if (zPlaybackStateCompat) {
                    Bitmap.Config config = options.inPreferredConfig;
                    Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                    UrlUtils.IconCompatParcelizer("", config == config2);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        if (bitmapDecodeFileDescriptor == null) {
                            int i3 = MediaMetadataCompat + 37;
                            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                bitmap.hashCode();
                                throw null;
                            }
                            if (bitmapDecodeFileDescriptor != null) {
                            }
                            options.inPreferredConfig = config2;
                            return bitmap;
                        }
                        try {
                            bitmap = invalidateFocusProperties.read(bitmapDecodeFileDescriptor);
                            int i4 = MediaMetadataCompat + 19;
                            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                        } catch (Throwable th) {
                            th = th;
                            bitmap = bitmapDecodeFileDescriptor;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            options.inPreferredConfig = Bitmap.Config.HARDWARE;
                            throw th;
                        }
                        bitmapDecodeFileDescriptor.recycle();
                        options.inPreferredConfig = config2;
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("GlideBitmapFactory", 2);
            }
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    @Override // o.accessrecordJVtK1S4jd
    public boolean PlaybackStateCompat() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 79;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream = null;
        boolean z = false;
        if (this.IconCompatParcelizer != 1) {
            List list = (List) this.serializer;
            toLinear tolinear = (toLinear) this.write;
            getF getf = (getF) this.RemoteActionCompatParcelizer;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                accessgetMaxp accessgetmaxp = (accessgetMaxp) list.get(i4);
                try {
                    FileDescriptor fileDescriptor = tolinear.IconCompatParcelizer().getFileDescriptor();
                    com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream2 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(getActiveFocusTargetNode.serializer(new FileInputStream(fileDescriptor), fileDescriptor), getf);
                    try {
                        boolean z2 = accessgetmaxp.read(recyclableBufferedInputStream2, getf);
                        recyclableBufferedInputStream2.write();
                        tolinear.IconCompatParcelizer();
                        if (z2) {
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        recyclableBufferedInputStream = recyclableBufferedInputStream2;
                        if (recyclableBufferedInputStream != null) {
                            int i5 = MediaDescriptionCompat + 53;
                            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            recyclableBufferedInputStream.write();
                        }
                        tolinear.IconCompatParcelizer();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return false;
        }
        List list2 = (List) this.write;
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream3 = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) ((toLinear) this.RemoteActionCompatParcelizer).write;
        recyclableBufferedInputStream3.reset();
        getF getf2 = (getF) this.serializer;
        recyclableBufferedInputStream3.mark(5242880);
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            int i8 = MediaMetadataCompat + 97;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                ((accessgetMaxp) list2.get(i7)).read(recyclableBufferedInputStream3, getf2);
                recyclableBufferedInputStream3.reset();
                recyclableBufferedInputStream.hashCode();
                throw null;
            }
            try {
                boolean z3 = ((accessgetMaxp) list2.get(i7)).read(recyclableBufferedInputStream3, getf2);
                recyclableBufferedInputStream3.reset();
                if (z3) {
                    z = true;
                    break;
                }
            } catch (Throwable th3) {
                recyclableBufferedInputStream3.reset();
                throw th3;
            }
            recyclableBufferedInputStream3.reset();
            throw th3;
        }
        int i9 = MediaDescriptionCompat + 87;
        MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (((java.lang.Integer) r8.write) != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (((java.lang.Integer) r8.write) != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        o.getAlignmentLinesMap.write("Cannot create key without ID requirement with parameters with ID requirement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.LayoutNode MediaDescriptionCompat() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetTvTeletextcp.MediaDescriptionCompat():o.LayoutNode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r1.IconCompatParcelizer == ((o.setNextChildPlaceOrderui) r3.IconCompatParcelizer).RemoteActionCompatParcelizer.length) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = r1.serializer;
        r3 = o.HitTestResultSubList.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r1 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (((java.lang.Integer) r8.write) == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        o.getAlignmentLinesMap.write("Cannot create key without ID requirement with parameters with ID requirement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (((java.lang.Integer) r8.write) != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r1 != r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r1 = o.accessgetTvTeletextcp.MediaMetadataCompat + 93;
        o.accessgetTvTeletextcp.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        o.setNextChildPlaceOrderui.IconCompatParcelizer(new byte[0]);
        r1 = o.accessgetTvTeletextcp.MediaMetadataCompat + 115;
        o.accessgetTvTeletextcp.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r1 != o.HitTestResultSubList.serializer) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r1 = o.accessgetTvTeletextcp.MediaMetadataCompat + 13;
        o.accessgetTvTeletextcp.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        o.setNextChildPlaceOrderui.IconCompatParcelizer(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) r8.write).intValue()).array());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r1 != o.HitTestResultSubList.MediaBrowserCompatMediaItem) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        o.setNextChildPlaceOrderui.IconCompatParcelizer(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) r8.write).intValue()).array());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        return new o.ensureLookaheadDelegateCreated();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(((o.calculateAlignmentLine) r8.RemoteActionCompatParcelizer).serializer, "Unknown AesGcmSivParameters.Variant: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        o.getAlignmentLinesMap.write("Cannot create key with ID requirement with parameters without ID requirement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        o.getAlignmentLinesMap.write("Key size mismatch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r1.IconCompatParcelizer == ((o.setNextChildPlaceOrderui) r3.IconCompatParcelizer).RemoteActionCompatParcelizer.length) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.ensureLookaheadDelegateCreated IconCompatParcelizer() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetTvTeletextcp.IconCompatParcelizer():o.ensureLookaheadDelegateCreated");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r4 = r4 + 45;
        o.accessgetTvTeletextcp.MediaMetadataCompat = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((r4 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r1.IconCompatParcelizer != ((o.setNextChildPlaceOrderui) r3.IconCompatParcelizer).RemoteActionCompatParcelizer.length) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r1 = r1.write;
        r3 = o.HitTestResultSubList.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (((java.lang.Integer) r7.write) == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        o.getAlignmentLinesMap.write("Cannot create key without ID requirement with parameters with ID requirement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (((java.lang.Integer) r7.write) != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r1 != r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r1 = o.accessgetTvTeletextcp.MediaDescriptionCompat + 9;
        o.accessgetTvTeletextcp.MediaMetadataCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        o.setNextChildPlaceOrderui.IconCompatParcelizer(new byte[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r1 != o.HitTestResultSubList.RemoteActionCompatParcelizer) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        o.setNextChildPlaceOrderui.IconCompatParcelizer(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) r7.write).intValue()).array());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r1 != o.HitTestResultSubList.MediaSessionCompatQueueItem) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        r1 = o.accessgetTvTeletextcp.MediaMetadataCompat + 39;
        o.accessgetTvTeletextcp.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if ((r1 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        o.setNextChildPlaceOrderui.IconCompatParcelizer(java.nio.ByteBuffer.allocate(3).put((byte) 0).putInt(((java.lang.Integer) r7.write).intValue()).array());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        o.setNextChildPlaceOrderui.IconCompatParcelizer(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) r7.write).intValue()).array());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        return new o.setIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(((o.HitTestResultKt) r7.RemoteActionCompatParcelizer).write, "Unknown AesEaxParameters.Variant: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        o.getAlignmentLinesMap.write("Cannot create key with ID requirement with parameters without ID requirement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
    
        o.getAlignmentLinesMap.write("Key size mismatch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        r0 = r1.IconCompatParcelizer;
        r0 = ((o.setNextChildPlaceOrderui) r3.IconCompatParcelizer).RemoteActionCompatParcelizer.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.setIndex read() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetTvTeletextcp.read():o.setIndex");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public invalidateLayer RemoteActionCompatParcelizer() throws GeneralSecurityException {
        setNextChildPlaceOrderui setnextchildplaceorderuiIconCompatParcelizer;
        int i = 2 % 2;
        remeasureSync remeasuresync = (remeasureSync) this.RemoteActionCompatParcelizer;
        if (remeasuresync != null) {
            int i2 = MediaMetadataCompat;
            int i3 = i2 + 13;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Extras$Key extras$Key = (Extras$Key) this.serializer;
            if (extras$Key != null) {
                int i5 = i2 + 83;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (remeasuresync.IconCompatParcelizer != ((setNextChildPlaceOrderui) extras$Key.IconCompatParcelizer).RemoteActionCompatParcelizer.length) {
                    getAlignmentLinesMap.write("Key size mismatch");
                    return null;
                }
                calculateSemanticsConfiguration calculatesemanticsconfiguration = remeasuresync.RemoteActionCompatParcelizer;
                calculateSemanticsConfiguration calculatesemanticsconfiguration2 = calculateSemanticsConfiguration.MediaBrowserCompatMediaItem;
                if (calculatesemanticsconfiguration != calculatesemanticsconfiguration2 && ((Integer) this.write) == null) {
                    getAlignmentLinesMap.write("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (calculatesemanticsconfiguration == calculatesemanticsconfiguration2 && ((Integer) this.write) != null) {
                    getAlignmentLinesMap.write("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                if (calculatesemanticsconfiguration == calculatesemanticsconfiguration2) {
                    setnextchildplaceorderuiIconCompatParcelizer = setNextChildPlaceOrderui.IconCompatParcelizer(new byte[0]);
                } else if (calculatesemanticsconfiguration != calculateSemanticsConfiguration.serializer) {
                    int i7 = MediaDescriptionCompat + 123;
                    MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        calculateSemanticsConfiguration calculatesemanticsconfiguration3 = calculateSemanticsConfiguration.write;
                        throw null;
                    }
                    if (calculatesemanticsconfiguration == calculateSemanticsConfiguration.write) {
                        setnextchildplaceorderuiIconCompatParcelizer = setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.write).intValue()).array());
                    } else {
                        if (calculatesemanticsconfiguration != calculateSemanticsConfiguration.PlaybackStateCompat) {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(((remeasureSync) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer, "Unknown AesCmacParametersParameters.Variant: ");
                            return null;
                        }
                        int i8 = MediaDescriptionCompat + 43;
                        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        setnextchildplaceorderuiIconCompatParcelizer = setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.write).intValue()).array());
                    }
                } else {
                    setnextchildplaceorderuiIconCompatParcelizer = setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.write).intValue()).array());
                }
                return new invalidateLayer((remeasureSync) this.RemoteActionCompatParcelizer, setnextchildplaceorderuiIconCompatParcelizer);
            }
        }
        getAlignmentLinesMap.write("Cannot build without parameters and/or key material");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (((java.lang.Integer) r4.serializer) == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return new o.remeasureSync(r1.intValue(), ((java.lang.Integer) r4.serializer).intValue(), (o.calculateSemanticsConfiguration) r4.write);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        o.getAlignmentLinesMap.write("tag size not set");
        r1 = o.accessgetTvTeletextcp.MediaDescriptionCompat + 31;
        o.accessgetTvTeletextcp.MediaMetadataCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        o.getAlignmentLinesMap.write("key size not set");
        r1 = o.accessgetTvTeletextcp.MediaDescriptionCompat + 25;
        o.accessgetTvTeletextcp.MediaMetadataCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.remeasureSync write() throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.accessgetTvTeletextcp.MediaMetadataCompat
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.accessgetTvTeletextcp.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r4.RemoteActionCompatParcelizer
            java.lang.Integer r1 = (java.lang.Integer) r1
            r3 = 69
            int r3 = r3 / 0
            if (r1 == 0) goto L4b
            goto L20
        L1a:
            java.lang.Object r1 = r4.RemoteActionCompatParcelizer
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L4b
        L20:
            java.lang.Object r3 = r4.serializer
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L3c
            o.remeasureSync r0 = new o.remeasureSync
            int r1 = r1.intValue()
            java.lang.Object r2 = r4.serializer
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r4.write
            o.calculateSemanticsConfiguration r3 = (o.calculateSemanticsConfiguration) r3
            r0.<init>(r1, r2, r3)
            return r0
        L3c:
            java.lang.String r1 = "tag size not set"
            o.getAlignmentLinesMap.write(r1)
            int r1 = o.accessgetTvTeletextcp.MediaDescriptionCompat
            int r1 = r1 + 31
            int r3 = r1 % 128
            o.accessgetTvTeletextcp.MediaMetadataCompat = r3
            int r1 = r1 % r0
            return r2
        L4b:
            java.lang.String r1 = "key size not set"
            o.getAlignmentLinesMap.write(r1)
            int r1 = o.accessgetTvTeletextcp.MediaDescriptionCompat
            int r1 = r1 + 25
            int r3 = r1 % 128
            o.accessgetTvTeletextcp.MediaMetadataCompat = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetTvTeletextcp.write():o.remeasureSync");
    }

    public invalidateUnfoldedVirtualChildren MediaBrowserCompatMediaItem() throws GeneralSecurityException {
        int i = 2 % 2;
        if (((ArrayList) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("cannot call build() twice");
            return null;
        }
        Integer num = (Integer) this.write;
        if (num != null) {
            int iIntValue = num.intValue();
            Iterator it = ((ArrayList) this.RemoteActionCompatParcelizer).iterator();
            while (true) {
                if (!it.hasNext()) {
                    getAlignmentLinesMap.write("primary key ID is not present in entries");
                    int i2 = MediaMetadataCompat + 99;
                    MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return null;
                }
                int i4 = MediaDescriptionCompat + 53;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                    if (((onChildRemoved) it.next()).RemoteActionCompatParcelizer == iIntValue) {
                        break;
                    }
                } else if (((onChildRemoved) it.next()).RemoteActionCompatParcelizer == iIntValue) {
                    break;
                }
            }
            int i6 = MediaMetadataCompat + 83;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
        }
        invalidateUnfoldedVirtualChildren invalidateunfoldedvirtualchildren = new invalidateUnfoldedVirtualChildren((getZSortedChildrenannotations) this.serializer, Collections.unmodifiableList((ArrayList) this.RemoteActionCompatParcelizer), (Integer) this.write);
        this.RemoteActionCompatParcelizer = null;
        return invalidateunfoldedvirtualchildren;
    }

    public /* synthetic */ accessgetTvTeletextcp(int i, boolean z) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = null;
        this.serializer = null;
        this.write = null;
    }

    public /* synthetic */ accessgetTvTeletextcp(zzpg zzpgVar, String str, Object obj, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = obj;
        this.write = zzpgVar;
    }

    public /* synthetic */ accessgetTvTeletextcp(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.write = obj3;
    }

    public /* synthetic */ accessgetTvTeletextcp(Object obj, String str, Comparable comparable, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = str;
        this.write = comparable;
    }

    public /* synthetic */ accessgetTvTeletextcp(String str) {
        this.IconCompatParcelizer = 16;
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp((byte) 0, 15);
        this.serializer = accessgettvteletextcp;
        this.write = accessgettvteletextcp;
        this.RemoteActionCompatParcelizer = str;
    }

    public accessgetTvTeletextcp(int i) {
        this.IconCompatParcelizer = i;
        if (i == 11) {
            this.RemoteActionCompatParcelizer = new HashMap();
            this.serializer = new HashMap();
            this.write = zzaj.RemoteActionCompatParcelizer;
        } else if (i == 13) {
            this.RemoteActionCompatParcelizer = new HashMap();
            this.serializer = new HashMap();
            this.write = zzcv.write;
        } else if (i != 27) {
            this.RemoteActionCompatParcelizer = new getNumPadDivideEK5gGoQ("", 0L, null);
            this.serializer = new getNumPadDivideEK5gGoQ("", 0L, null);
            this.write = new ArrayList();
        } else {
            this.RemoteActionCompatParcelizer = null;
            this.serializer = null;
            this.write = calculateSemanticsConfiguration.MediaBrowserCompatMediaItem;
        }
    }

    public accessgetTvTeletextcp(Context context, LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        this.IconCompatParcelizer = 18;
        this.write = new AtomicLong(-1L);
        this.serializer = new accessgetSlashcp(context, null, accessgetSlashcp.IconCompatParcelizer, new accessgetSevencp("measurement:api"), accessgetNumPad8cp.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = lookaheadScopeKtLookaheadScope221;
    }

    public accessgetTvTeletextcp(getNumPadDivideEK5gGoQ getnumpaddivideek5ggoq) {
        this.IconCompatParcelizer = 10;
        this.RemoteActionCompatParcelizer = getnumpaddivideek5ggoq;
        this.serializer = getnumpaddivideek5ggoq.clone();
        this.write = new ArrayList();
    }

    public accessgetTvTeletextcp(getSlotToReusedFromOnReuseNjRlDlw getslottoreusedfromonreusenjrldlw, View view) {
        Object getreusednjrldlw;
        this.IconCompatParcelizer = 23;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            getreusednjrldlw = new getReuseScheduleOutOfFrameDeactivationNjRlDlw();
        } else if (i >= 33) {
            getreusednjrldlw = new getReusedNjRlDlw();
        } else {
            int i2 = MediaMetadataCompat + 83;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            getreusednjrldlw = null;
        }
        this.RemoteActionCompatParcelizer = getreusednjrldlw;
        this.serializer = getslottoreusedfromonreusenjrldlw;
        this.write = view;
        int i4 = MediaDescriptionCompat + 95;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static accessgetTvTeletextcp write(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 85;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (read == null) {
            read = new accessgetTvTeletextcp(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat, lookaheadScopeKtLookaheadScope221);
        }
        accessgetTvTeletextcp accessgettvteletextcp = read;
        int i3 = MediaMetadataCompat + 49;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return accessgettvteletextcp;
        }
        obj.hashCode();
        throw null;
    }

    public void IconCompatParcelizer(float f, String str) {
        int i = 2 % 2;
        createMeasurePolicy createmeasurepolicy = new createMeasurePolicy((byte) 0, 15);
        ((accessgetTvTeletextcp) this.write).write = createmeasurepolicy;
        this.write = createmeasurepolicy;
        createmeasurepolicy.serializer = String.valueOf(f);
        createmeasurepolicy.RemoteActionCompatParcelizer = str;
        int i2 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void serializer(String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 43;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        this.RemoteActionCompatParcelizer = str;
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        int i6 = i2 + 43;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public accessgetTvTeletextcp(getTimestampSeconds gettimestampseconds, ArrayList arrayList, getF getf) {
        this.IconCompatParcelizer = 1;
        UrlUtils.serializer(getf, "Argument must not be null");
        this.serializer = getf;
        UrlUtils.serializer(arrayList, "Argument must not be null");
        this.write = arrayList;
        this.RemoteActionCompatParcelizer = new toLinear(gettimestampseconds, getf);
    }

    public accessgetTvTeletextcp(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, getF getf) {
        this.IconCompatParcelizer = 2;
        UrlUtils.serializer(getf, "Argument must not be null");
        this.RemoteActionCompatParcelizer = getf;
        UrlUtils.serializer(arrayList, "Argument must not be null");
        this.serializer = arrayList;
        this.write = new toLinear(parcelFileDescriptor);
    }

    public /* synthetic */ accessgetTvTeletextcp(byte b, int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        if (i3 != 4) {
            if (i3 == 5) {
                ((DiagnosticsActivity) obj)._init_lambda1 = MediaMetadataCompat();
                return;
            }
            if (i3 == 6) {
                GPSActivity gPSActivity = (GPSActivity) obj;
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer;
                gPSActivity._init_lambda1 = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                gPSActivity.MediaSessionCompatQueueItem = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((applyLayoutFeatures) this.serializer);
                gPSActivity.MediaBrowserCompatMediaItem = new r8lambdaPO7RMOx5_w8jhcfg0pDu3GUdFjk(new r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo((r8lambdaGDT82k101pFrQcAu5KuS7n_2ZU) getstyleable_vector_drawable_group_rotation.setActionBarHideOffset.write()));
                gPSActivity.MediaDescriptionCompat = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) this.write);
                return;
            }
            if (i3 != 7) {
                OverlayPermissionDialogFragment overlayPermissionDialogFragment = (OverlayPermissionDialogFragment) obj;
                overlayPermissionDialogFragment.removeOnUserLeaveHintListener = ((getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction();
                overlayPermissionDialogFragment.getSavedStateRegistry = (fetch) ((getDoubleOrNull) this.write).write;
                return;
            }
            InAppNotificationsFragment inAppNotificationsFragment = (InAppNotificationsFragment) obj;
            getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer;
            inAppNotificationsFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation2.PlaybackStateCompatCustomAction();
            inAppNotificationsFragment.onBackPressed = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4) this.serializer);
            int iIconCompatParcelizer = bo.app.n5.IconCompatParcelizer();
            int iIconCompatParcelizer2 = bo.app.n5.IconCompatParcelizer();
            inAppNotificationsFragment.initializeViewTreeOwners = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation2}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer2);
            inAppNotificationsFragment.getSavedStateRegistry = (setStateRestorationPolicy) ((getDoubleOrNull) this.write).write;
            inAppNotificationsFragment.getOnBackPressedDispatcher = new SendTestPushUseCase(new onGenericMotionEvent(new N$b((decode) getstyleable_vector_drawable_group_rotation2.setItemInvoker.write(), (getError) new getLiveRegiondelegate((AuthRepository) getstyleable_vector_drawable_group_rotation2.defaultViewModelProviderFactory_delegatelambda0.write()), getstyleable_vector_drawable_group_rotation2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss(), (getContentViewGroupParentLayout) getstyleable_vector_drawable_group_rotation2.ContentInViewNodelaunchAnimation21.write())));
            return;
        }
        AuthWebFragment authWebFragment = (AuthWebFragment) obj;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation3 = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer;
        authWebFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation3.PlaybackStateCompatCustomAction();
        authWebFragment.removeOnContextAvailableListener = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((getModels) this.serializer);
        int iIconCompatParcelizer3 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer4 = bo.app.n5.IconCompatParcelizer();
        authWebFragment.onMenuItemSelected = (recreateDisplayListIfNeeded) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(-787608258, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), 787608271, iIconCompatParcelizer3, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer4);
        authWebFragment.onMultiWindowModeChanged = getstyleable_vector_drawable_group_rotation3.ResultReceiver();
        authWebFragment.onNewIntent = new unpackInt2((transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write(), 15);
        authWebFragment.onBackPressed = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write();
        authWebFragment.getNavigationEventDispatcher = getstyleable_vector_drawable_group_rotation3.read();
        authWebFragment.onPreparePanel = (setTransactionSuccessful) getstyleable_vector_drawable_group_rotation3.toClipEntry.write();
        authWebFragment.peekAvailableContext = new setUdmandroid_sdk_base_release(getstyleable_vector_drawable_group_rotation3.getNavigationEventDispatcher(), 0);
        authWebFragment.initializeViewTreeOwners = new getSdkEnablementProviderandroid_sdk_base_release(new BrazeExternalSyntheticLambda5(0));
        r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_yaIconCompatParcelizer = getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.IconCompatParcelizer();
        int iIconCompatParcelizer5 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer6 = bo.app.n5.IconCompatParcelizer();
        authWebFragment.onPanelClosed = new N$b(r8lambdaekymoxv_2c6wlkkhzt5tho0_yaIconCompatParcelizer, (H$b) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(-330351060, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), 330351062, iIconCompatParcelizer5, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer6), (transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write());
        authWebFragment.onPictureInPictureUiStateChanged = (inRing) getstyleable_vector_drawable_group_rotation3.Transition.write;
        int iIconCompatParcelizer7 = bo.app.n5.IconCompatParcelizer();
        int iIconCompatParcelizer8 = bo.app.n5.IconCompatParcelizer();
        authWebFragment.registerForActivityResult = (BrazeExternalSyntheticLambda45) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(525972808, new Object[]{getstyleable_vector_drawable_group_rotation3}, bo.app.n5.IconCompatParcelizer(), -525972792, iIconCompatParcelizer7, bo.app.n5.IconCompatParcelizer(), iIconCompatParcelizer8);
        authWebFragment.onRequestPermissionsResult = new BrazeExternalSyntheticLambda28((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation3.toClipEntry.write(), 19);
        authWebFragment.onCreate = new BrazeExternalSyntheticLambda28((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation3.toClipEntry.write(), 0);
        authWebFragment.onActivityResult = new stopInstancelambda11(new ImageHeaderParserImageType());
        authWebFragment.removeMenuProvider = (subscribeToPushNotificationEvents) getstyleable_vector_drawable_group_rotation3.TextFieldSelectionManagercut1.write();
        authWebFragment.removeOnTrimMemoryListener = (BrazeExternalSyntheticLambda36) getstyleable_vector_drawable_group_rotation3.getSavedStateRegistry.write();
        authWebFragment.removeOnConfigurationChangedListener = new WebViewDownloadHandler(waitForUserDependencyThreadandroid_sdk_base_release.read(getstyleable_vector_drawable_group_rotation3.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs));
        authWebFragment.onSaveInstanceState = (r8lambda52ctlEduwkfz3l8UwwWKdau6wdM) getstyleable_vector_drawable_group_rotation3.onActivityResult.write();
        authWebFragment.removeOnPictureInPictureUiStateChangedListener = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4) this.write);
        authWebFragment.removeOnMultiWindowModeChangedListener = new subscribeToSdkAuthenticationFailures((subscribeToNewInAppMessages) getstyleable_vector_drawable_group_rotation3.UseCase.write(), 0);
        int i4 = MediaMetadataCompat + 21;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public constructJsonArray MediaMetadataCompat() {
        int i = 2 % 2;
        androidx.sqlite.SQLite.serializer(77, "expectedSize");
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(77);
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer;
        resizegraphicframeifappropriate.read(AccountCreationFragment.class, getstyleable_vector_drawable_group_rotation.write);
        resizegraphicframeifappropriate.read(AutoAcceptPreferencesFragment.class, getstyleable_vector_drawable_group_rotation.addOnMultiWindowModeChangedListener);
        resizegraphicframeifappropriate.read(AdjustTrueLinkBrowsableActivity.class, getstyleable_vector_drawable_group_rotation.PlaybackStateCompat);
        resizegraphicframeifappropriate.read(BiometricsActivity.class, getstyleable_vector_drawable_group_rotation.onCreate);
        resizegraphicframeifappropriate.read(BluetoothEnableDialogFragment.class, getstyleable_vector_drawable_group_rotation.onRequestPermissionsResult);
        resizegraphicframeifappropriate.read(BluetoothScanPermissionDialogFragment.class, getstyleable_vector_drawable_group_rotation.onPanelClosed);
        resizegraphicframeifappropriate.read(SelectBreakDurationFragment.class, getstyleable_vector_drawable_group_rotation.requiredSize3ABfNKs);
        resizegraphicframeifappropriate.read(RequestBreakFragment.class, getstyleable_vector_drawable_group_rotation.fling);
        resizegraphicframeifappropriate.read(MessageDialogFragment.class, getstyleable_vector_drawable_group_rotation.getMaxCardElevation);
        resizegraphicframeifappropriate.read(ContentSharingFragment.class, getstyleable_vector_drawable_group_rotation.initDelegate);
        resizegraphicframeifappropriate.read(PhotoSharedSuccessDialogFragment.class, getstyleable_vector_drawable_group_rotation.TransitionanimateTo111);
        resizegraphicframeifappropriate.read(TermsAndConditionsFragment.class, getstyleable_vector_drawable_group_rotation.TextFieldSizeNode);
        resizegraphicframeifappropriate.read(GalleryFragment.class, getstyleable_vector_drawable_group_rotation.setThumbTintMode);
        resizegraphicframeifappropriate.read(CustomPasswordActivity.class, getstyleable_vector_drawable_group_rotation.onPrepareSupportNavigateUpTaskStack);
        resizegraphicframeifappropriate.read(CustomerChatsActivity.class, getstyleable_vector_drawable_group_rotation.openOptionsMenu);
        resizegraphicframeifappropriate.read(LasagnaDeclineBottomSheet.class, getstyleable_vector_drawable_group_rotation.MediaStoreVideoCannotWrite);
        resizegraphicframeifappropriate.read(LasagnaDeclineComposeBottomSheet.class, getstyleable_vector_drawable_group_rotation.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk);
        resizegraphicframeifappropriate.read(LasagnaDeclineWithAcceptanceRateBottomSheet.class, getstyleable_vector_drawable_group_rotation.PreviewFreezeAfterHighSpeedRecordingQuirk);
        resizegraphicframeifappropriate.read(DiagnosticsActivity.class, getstyleable_vector_drawable_group_rotation.getNestedScrollAxes);
        resizegraphicframeifappropriate.read(EntrancePictureFragment.class, getstyleable_vector_drawable_group_rotation.setExpandedActionViewsExclusive);
        resizegraphicframeifappropriate.read(HelpCenterActivity.class, getstyleable_vector_drawable_group_rotation.TextureViewIsClosedQuirk);
        resizegraphicframeifappropriate.read(HistoryNavContainerFragment.class, getstyleable_vector_drawable_group_rotation.ImageCaptureMetadata);
        resizegraphicframeifappropriate.read(HistoryFragment.class, getstyleable_vector_drawable_group_rotation.CameraXExternalSyntheticLambda2);
        resizegraphicframeifappropriate.read(OrderDetailsFragment.class, getstyleable_vector_drawable_group_rotation.getValueFromNanos);
        resizegraphicframeifappropriate.read(HistoryDialogFragment.class, getstyleable_vector_drawable_group_rotation.CameraXExternalSyntheticLambda0);
        resizegraphicframeifappropriate.read(IdentityVerificationActivity.class, getstyleable_vector_drawable_group_rotation.nativeConvertAndroid420ToABGR);
        resizegraphicframeifappropriate.read(LoginActivity.class, getstyleable_vector_drawable_group_rotation.getBitmap);
        resizegraphicframeifappropriate.read(EquipmentBottomSheet.class, getstyleable_vector_drawable_group_rotation.setOverflowReserved);
        resizegraphicframeifappropriate.read(OneClickStartWorkingFragment.class, getstyleable_vector_drawable_group_rotation.getVelocityFromNanos);
        resizegraphicframeifappropriate.read(DeepLinkActivity.class, getstyleable_vector_drawable_group_rotation.ensureSubDecor);
        resizegraphicframeifappropriate.read(SettingsActivity.class, getstyleable_vector_drawable_group_rotation.LazyList);
        resizegraphicframeifappropriate.read(FullScreenDetailsFragment.class, getstyleable_vector_drawable_group_rotation.setTrackTintMode);
        resizegraphicframeifappropriate.read(HomeFragment.class, getstyleable_vector_drawable_group_rotation.ImageCapture1);
        resizegraphicframeifappropriate.read(NafathModalFragment.class, getstyleable_vector_drawable_group_rotation.setCardElevation);
        resizegraphicframeifappropriate.read(InAppCameraWithTagsFragment.class, getstyleable_vector_drawable_group_rotation.nativeShiftPixel);
        resizegraphicframeifappropriate.read(InAppNotificationsFragment.class, getstyleable_vector_drawable_group_rotation.nativeGetYUVImageVUOff);
        resizegraphicframeifappropriate.read(BookShiftConfirmationContainerFragment.class, getstyleable_vector_drawable_group_rotation.onTrimMemory);
        resizegraphicframeifappropriate.read(BookShiftConfirmationDialogFragment.class, getstyleable_vector_drawable_group_rotation.onRetainNonConfigurationInstance);
        resizegraphicframeifappropriate.read(LivenessDetectionActivity.class, getstyleable_vector_drawable_group_rotation.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk);
        resizegraphicframeifappropriate.read(GPSActivity.class, getstyleable_vector_drawable_group_rotation.setTrackTintList);
        resizegraphicframeifappropriate.read(LogoutActivity.class, getstyleable_vector_drawable_group_rotation.getOutputTransform);
        resizegraphicframeifappropriate.read(MapboxFragment.class, getstyleable_vector_drawable_group_rotation.setBrightness);
        resizegraphicframeifappropriate.read(NestFragment.class, getstyleable_vector_drawable_group_rotation.get);
        resizegraphicframeifappropriate.read(BonusCalendarFragment.class, getstyleable_vector_drawable_group_rotation.onPictureInPictureModeChanged);
        resizegraphicframeifappropriate.read(CalendarInformationFragment.class, getstyleable_vector_drawable_group_rotation.startActivityForResult);
        resizegraphicframeifappropriate.read(OverlayPermissionDialogFragment.class, getstyleable_vector_drawable_group_rotation.animateOneFrame);
        resizegraphicframeifappropriate.read(NonFloatablePermissionActivity.class, getstyleable_vector_drawable_group_rotation.MutableSetWrapperiterator1iterator1);
        resizegraphicframeifappropriate.read(PermissionActivity.class, getstyleable_vector_drawable_group_rotation.updateValuesIJZedt4animation_core);
        resizegraphicframeifappropriate.read(ContactRiderActionsFragment.class, getstyleable_vector_drawable_group_rotation.performMenuItemShortcut);
        resizegraphicframeifappropriate.read(CustomerSignatureFragment.class, getstyleable_vector_drawable_group_rotation.setSupportProgressBarIndeterminateVisibility);
        resizegraphicframeifappropriate.read(com.roadrunner.push.presentation.MessageDialogFragment.class, getstyleable_vector_drawable_group_rotation.getPreventCornerOverlap);
        resizegraphicframeifappropriate.read(RecentDeliveriesFragment.class, getstyleable_vector_drawable_group_rotation.calculateCentroid);
        resizegraphicframeifappropriate.read(RiderSafetyReportFragment.class, getstyleable_vector_drawable_group_rotation.placeSpaceEvenlyfoundation_layout);
        resizegraphicframeifappropriate.read(RiderSafetyPermissionFragment.class, getstyleable_vector_drawable_group_rotation.placeCenterfoundation_layout);
        resizegraphicframeifappropriate.read(RouterActivity.class, getstyleable_vector_drawable_group_rotation.FillNode);
        resizegraphicframeifappropriate.read(SelfServiceCustomerChatActivity.class, getstyleable_vector_drawable_group_rotation.requiredSizeInqDBjuR0default);
        resizegraphicframeifappropriate.read(PhotoIdPreviewFragment.class, getstyleable_vector_drawable_group_rotation.TransitionKtrememberTransitionlambda10inlinedonDispose1);
        resizegraphicframeifappropriate.read(SideMenuFragment.class, getstyleable_vector_drawable_group_rotation.LazyLayoutPagerKtdragDirectionDetector111);
        resizegraphicframeifappropriate.read(StackedDeliveryDetailsFragment.class, getstyleable_vector_drawable_group_rotation.bringIntoView);
        resizegraphicframeifappropriate.read(TripPlannerActionsFragment.class, getstyleable_vector_drawable_group_rotation.AndroidTextContextMenuToolbarProvider);
        resizegraphicframeifappropriate.read(VendorReviewFragment.class, getstyleable_vector_drawable_group_rotation.accessawaitDown);
        resizegraphicframeifappropriate.read(SimpleWebViewFragment.class, getstyleable_vector_drawable_group_rotation.PagerDefaultsExternalSyntheticLambda0);
        resizegraphicframeifappropriate.read(RiderHiringWebViewFragment.class, getstyleable_vector_drawable_group_rotation.ClipboardUtils_androidKt);
        resizegraphicframeifappropriate.read(AuthWebFragment.class, getstyleable_vector_drawable_group_rotation.getSavedStateRegistryControllerannotations);
        resizegraphicframeifappropriate.read(SettingsInfoBottomSheet.class, getstyleable_vector_drawable_group_rotation.LazyListKt);
        resizegraphicframeifappropriate.read(com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment.class, getstyleable_vector_drawable_group_rotation.nativeNewDirectByteBuffer);
        resizegraphicframeifappropriate.read(CustomerUnavailableFragment.class, getstyleable_vector_drawable_group_rotation.setSupportProgressBarIndeterminate);
        resizegraphicframeifappropriate.read(CustomerUnavailableFragmentV2.class, getstyleable_vector_drawable_group_rotation.setSupportProgress);
        resizegraphicframeifappropriate.read(TimeChangedBlockingDialogFragment.class, getstyleable_vector_drawable_group_rotation.TextLayoutResultProxy);
        resizegraphicframeifappropriate.read(TransferChangeFragment.class, getstyleable_vector_drawable_group_rotation.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl);
        resizegraphicframeifappropriate.read(AmountChangingReasonDialogFragment.class, getstyleable_vector_drawable_group_rotation.MediaSessionCompatResultReceiverWrapper);
        resizegraphicframeifappropriate.read(DoubleConfirmationFragment.class, getstyleable_vector_drawable_group_rotation.setMenuPrepared);
        resizegraphicframeifappropriate.read(QrPaymentScreenFragment.class, getstyleable_vector_drawable_group_rotation.onPan);
        resizegraphicframeifappropriate.read(QrScannerFragment.class, getstyleable_vector_drawable_group_rotation.TransformGestureDetectorKt);
        resizegraphicframeifappropriate.read(PinScreenFragment.class, getstyleable_vector_drawable_group_rotation.VectorizedFloatDecaySpec);
        resizegraphicframeifappropriate.read(CodeScanFragment.class, getstyleable_vector_drawable_group_rotation.handleMessage);
        resizegraphicframeifappropriate.read(SettingsNotificationsDiagnosticsFragment.class, (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME) this.write);
        constructJsonArray constructjsonarray = new constructJsonArray(resizegraphicframeifappropriate.RemoteActionCompatParcelizer());
        int i2 = MediaDescriptionCompat + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return constructjsonarray;
    }
}
