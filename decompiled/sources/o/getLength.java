package o;

import android.os.Bundle;
import androidx.compose.foundation.pager.PagerState$requestScrollToPage$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.liveness.failure.presentation.FailureViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.sentiance.core.model.thrift.k$c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getLength implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RatingCompat = 1;
    private static int serializer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ boolean write;

    public /* synthetic */ getLength(cubicTo cubicto, List list, boolean z) {
        this.read = 0;
        this.IconCompatParcelizer = cubicto;
        this.write = z;
        this.RemoteActionCompatParcelizer = list;
    }

    public /* synthetic */ getLength(PassthroughConnection passthroughConnection, cubicTo cubicto, boolean z) {
        this.read = 4;
        this.RemoteActionCompatParcelizer = passthroughConnection;
        this.IconCompatParcelizer = cubicto;
        this.write = z;
    }

    public /* synthetic */ getLength(Object obj, Object obj2, boolean z, int i) {
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.write = z;
    }

    public /* synthetic */ getLength(boolean z, Object obj, Object obj2, int i) {
        this.read = i;
        this.write = z;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        RoomDatabaseperformClear11 roomDatabaseperformClear11;
        RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2;
        RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda3;
        final int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        final boolean z = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        if (i3 == 0) {
            final cubicTo cubicto = (cubicTo) obj3;
            final List list = (List) obj2;
            toAndroidColorSpace toandroidcolorspace = new toAndroidColorSpace() { // from class: o.AndroidPath_androidKt
                @Override // o.toAndroidColorSpace
                public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                    boolean z2 = z;
                    List list2 = list;
                    cubicTo cubicto2 = cubicto;
                    if (z2 && !list2.contains(cubicto2)) {
                        list2.add(cubicto2);
                    }
                    if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_START && !list2.contains(cubicto2)) {
                        list2.add(cubicto2);
                    }
                    if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_STOP) {
                        list2.remove(cubicto2);
                    }
                }
            };
            cubicto.MediaBrowserCompatMediaItem.RatingCompat.IconCompatParcelizer(toandroidcolorspace);
            return new refreshFeatureFlagslambda10(cubicto, 8, toandroidcolorspace);
        }
        final int i4 = 0;
        final int i5 = 1;
        if (i3 == 1) {
            ArrayList arrayList = (ArrayList) obj3;
            List list2 = (List) obj2;
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                int i7 = RatingCompat + 107;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    ((androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayList.get(i6)).serializer(placementScope, z);
                    i6 += 51;
                } else {
                    ((androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayList.get(i6)).serializer(placementScope, z);
                    i6++;
                }
            }
            int size2 = list2.size();
            while (i4 < size2) {
                ((androidx.compose.foundation.lazy.LazyListMeasuredItem) list2.get(i4)).serializer(placementScope, z);
                i4++;
            }
            return createfromparcel;
        }
        final int i8 = 3;
        if (i3 == 2) {
            final androidx.compose.foundation.pager.PagerState pagerState = (androidx.compose.foundation.pager.PagerState) obj3;
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj2;
            androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
            if (z) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.ParcelableSnapshotMutableFloatState
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i9 = i4;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        androidx.compose.foundation.pager.PagerState pagerState2 = pagerState;
                        boolean z2 = true;
                        if (i9 == 0) {
                            if (pagerState2.RemoteActionCompatParcelizer()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 == 1) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 != 2) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (pagerState2.RemoteActionCompatParcelizer()) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.ParcelableSnapshotMutableFloatState
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i9 = i5;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        androidx.compose.foundation.pager.PagerState pagerState2 = pagerState;
                        boolean z2 = true;
                        if (i9 == 0) {
                            if (pagerState2.RemoteActionCompatParcelizer()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 == 1) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 != 2) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (pagerState2.RemoteActionCompatParcelizer()) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            } else {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.ParcelableSnapshotMutableFloatState
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i9 = i;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        androidx.compose.foundation.pager.PagerState pagerState2 = pagerState;
                        boolean z2 = true;
                        if (i9 == 0) {
                            if (pagerState2.RemoteActionCompatParcelizer()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 == 1) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 != 2) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (pagerState2.RemoteActionCompatParcelizer()) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.ParcelableSnapshotMutableFloatState
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i9 = i8;
                        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                        androidx.compose.foundation.pager.PagerState pagerState2 = pagerState;
                        boolean z2 = true;
                        if (i9 == 0) {
                            if (pagerState2.RemoteActionCompatParcelizer()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 == 1) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (i9 != 2) {
                            if (pagerState2.write()) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(2, pagerState2, null), 3);
                            } else {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (pagerState2.RemoteActionCompatParcelizer()) {
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new PagerState$requestScrollToPage$1(1, pagerState2, null), 3);
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
            return createfromparcel;
        }
        if (i3 == 3) {
            String str = (String) obj3;
            setRootAutofillId setrootautofillid = (setRootAutofillId) obj2;
            androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver2 = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
            if (z) {
                int i9 = RatingCompat + 7;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m2832setLiveRegionhR3wRGc(semanticsPropertyReceiver2, androidx.compose.ui.semantics.LiveRegionMode.Companion.m2806getPolite0phEisY());
                    throw null;
                }
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m2832setLiveRegionhR3wRGc(semanticsPropertyReceiver2, androidx.compose.ui.semantics.LiveRegionMode.Companion.m2806getPolite0phEisY());
                int i10 = RatingCompat + 93;
                serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver2, null, new onPostAttachui(setrootautofillid, 1), 1, null);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver2, str);
            return createfromparcel;
        }
        if (i3 != 4) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3).invoke(((r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) obj2).RemoteActionCompatParcelizer, bool, Boolean.valueOf(z));
            return createfromparcel;
        }
        PassthroughConnection passthroughConnection = (PassthroughConnection) obj2;
        cubicTo cubicto2 = (cubicTo) obj3;
        setStrokeCapBeK7IIE setstrokecapbek7iie = (setStrokeCapBeK7IIE) obj;
        setstrokecapbek7iie.getClass();
        Bundle bundleRemoteActionCompatParcelizer = cubicto2.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer != null) {
            int iSerializer = getQueryParameterslambda2.serializer();
            roomDatabaseperformClear11 = (RoomDatabaseperformClear11) ((Serializable) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 839340738, new Object[]{bundleRemoteActionCompatParcelizer, "failure_reason", RoomDatabaseperformClear11.class}, getQueryParameterslambda2.serializer(), -839340732, iSerializer));
        } else {
            roomDatabaseperformClear11 = null;
        }
        if (roomDatabaseperformClear11 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failure reason is required");
            return null;
        }
        Bundle bundleRemoteActionCompatParcelizer2 = cubicto2.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        if (bundleRemoteActionCompatParcelizer2 != null) {
            int i12 = RatingCompat + 9;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int iSerializer2 = getQueryParameterslambda2.serializer();
                roomDatabaseExternalSyntheticLambda3 = (RoomDatabaseExternalSyntheticLambda2) ((Serializable) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 839340738, new Object[]{bundleRemoteActionCompatParcelizer2, "invocation_site", RoomDatabaseExternalSyntheticLambda2.class}, getQueryParameterslambda2.serializer(), -839340732, iSerializer2));
                int i13 = 48 / 0;
            } else {
                int iSerializer3 = getQueryParameterslambda2.serializer();
                roomDatabaseExternalSyntheticLambda3 = (RoomDatabaseExternalSyntheticLambda2) ((Serializable) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 839340738, new Object[]{bundleRemoteActionCompatParcelizer2, "invocation_site", RoomDatabaseExternalSyntheticLambda2.class}, getQueryParameterslambda2.serializer(), -839340732, iSerializer3));
            }
            roomDatabaseExternalSyntheticLambda2 = roomDatabaseExternalSyntheticLambda3;
        } else {
            roomDatabaseExternalSyntheticLambda2 = null;
        }
        if (roomDatabaseExternalSyntheticLambda2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invocation site is required");
            return null;
        }
        getBitmapui_graphics getbitmapui_graphicsIconCompatParcelizer = prepareToDraw.IconCompatParcelizer(setstrokecapbek7iie);
        k$c k_c = ((transaction) passthroughConnection).IconCompatParcelizer;
        setDistanceToTriggerSync setdistancetotriggersync = (setDistanceToTriggerSync) ((executeQuery) k_c.RemoteActionCompatParcelizer).write();
        onUpgrade onupgrade = (onUpgrade) ((mergeJsonObjects) k_c.write).write();
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) ((mergeJsonObjects) k_c.IconCompatParcelizer).write();
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) ((mergeJsonObjects) k_c.read).write();
        androidx.lifecycle.BlockRunner blockRunner = (androidx.lifecycle.BlockRunner) ((getDataStoreFileName) k_c.serializer).write();
        OtpLogger otpLogger = (OtpLogger) ((executeQuery) k_c.MediaBrowserCompatMediaItem).write();
        getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = new getUseEvaluationsCachefwf_client_release(6);
        getuseevaluationscachefwf_client_release.write = 1;
        return new FailureViewModel(roomDatabaseperformClear11, roomDatabaseExternalSyntheticLambda2, getbitmapui_graphicsIconCompatParcelizer, this.write, setdistancetotriggersync, onupgrade, settransactionsuccessful, transfersessionpackagei, blockRunner, otpLogger, getuseevaluationscachefwf_client_release, (NetworkErrorMapperImpl) ((mergeJsonObjects) k_c.MediaSessionCompatQueueItem).write(), (CompleteIdentityVerificationUseCaseImpl) ((mergeJsonObjects) k_c.MediaDescriptionCompat).write(), new getQueryContext());
    }
}
