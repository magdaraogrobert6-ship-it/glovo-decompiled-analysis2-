package com.roadrunner.instant.shifts.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AdjustLinkResolution;
import o.NestRiderStateSummary;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1;
import o.accessgetInstancedelegatecp;
import o.convertToUri;
import o.onItemDismiss;
import o.onLeftHiddenState;
import o.readFileContent;
import o.resetInternal;
import o.setTransactionSuccessful;
import o.shouldIgnore;
import o.syncroom_runtime;
import o.v9;
import o.va;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class GetInstantShiftUiState {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public final readFileContent IconCompatParcelizer;
    public final va MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final vg MediaMetadataCompat;
    public final OpportunitiesRepository MediaSessionCompatQueueItem;
    public final RouterLogger PlaybackStateCompat;
    public final setTransactionSuccessful RatingCompat;
    public final syncroom_runtime RemoteActionCompatParcelizer;
    public final GetStatusUseCaseImpl read;
    public final v9 serializer;
    public final RouterLogger write;

    public GetInstantShiftUiState(GetStatusUseCaseImpl getStatusUseCaseImpl, RouterLogger routerLogger, syncroom_runtime syncroom_runtimeVar, setTransactionSuccessful settransactionsuccessful, RouterLogger routerLogger2, v9 v9Var, va vaVar, OpportunitiesRepository opportunitiesRepository, vg vgVar, readFileContent readfilecontent) {
        getStatusUseCaseImpl.getClass();
        routerLogger.getClass();
        syncroom_runtimeVar.getClass();
        settransactionsuccessful.getClass();
        routerLogger2.getClass();
        v9Var.getClass();
        vaVar.getClass();
        opportunitiesRepository.getClass();
        vgVar.getClass();
        readfilecontent.getClass();
        this.read = getStatusUseCaseImpl;
        this.write = routerLogger;
        this.RemoteActionCompatParcelizer = syncroom_runtimeVar;
        this.RatingCompat = settransactionsuccessful;
        this.PlaybackStateCompat = routerLogger2;
        this.serializer = v9Var;
        this.MediaBrowserCompatMediaItem = vaVar;
        this.MediaSessionCompatQueueItem = opportunitiesRepository;
        this.MediaMetadataCompat = vgVar;
        this.IconCompatParcelizer = readfilecontent;
        this.MediaDescriptionCompat = true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[PHI: r3 r6
  0x0031: PHI (r3v32 o.resetInternal) = (r3v31 o.resetInternal), (r3v34 o.resetInternal) binds: [B:11:0x002f, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r6v5 int) = (r6v4 int), (r6v7 int) binds: [B:11:0x002f, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public final Object getInstantShiftsUiState(boolean z, ContinuationImpl continuationImpl) {
        resetInternal resetinternal;
        boolean z2;
        Object objM4990invokeIoAF18A;
        int i;
        int i2 = 2 % 2;
        if (!(continuationImpl instanceof resetInternal)) {
            resetinternal = new resetInternal(this, continuationImpl);
        } else {
            int i3 = MediaSessionCompatResultReceiverWrapper + 11;
            MediaSessionCompatToken = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                resetinternal = (resetInternal) continuationImpl;
                i = resetinternal.write;
                int i4 = 32 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i5 = MediaSessionCompatToken + 67;
                    MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    resetinternal.write = i - Integer.MIN_VALUE;
                } else {
                    resetinternal = new resetInternal(this, continuationImpl);
                }
            } else {
                resetinternal = (resetInternal) continuationImpl;
                i = resetinternal.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i7 = MediaSessionCompatToken + 67;
                    MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    resetinternal.write = i - Integer.MIN_VALUE;
                } else {
                    resetinternal = new resetInternal(this, continuationImpl);
                }
            }
        }
        Object obj = resetinternal.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = resetinternal.write;
        Object obj2 = null;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            z2 = z;
            resetinternal.IconCompatParcelizer = z2;
            resetinternal.write = 1;
            objM4990invokeIoAF18A = this.write.m4990invokeIoAF18A(resetinternal);
            if (objM4990invokeIoAF18A == coroutineSingletons) {
                int i10 = MediaSessionCompatResultReceiverWrapper + 101;
                MediaSessionCompatToken = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = resetinternal.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4990invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
            z2 = z3;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4990invokeIoAF18A);
        StaggeredGridLayoutManagerLazySpanLookupFullSpanItem staggeredGridLayoutManagerLazySpanLookupFullSpanItem = StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.write;
        va vaVar = this.MediaBrowserCompatMediaItem;
        v9 v9Var = this.serializer;
        setTransactionSuccessful settransactionsuccessful = this.RatingCompat;
        if (thSerializer != null) {
            if ((!v9Var.serializer() && (!vaVar.read())) || (!z2)) {
                return new NestRiderStateSummary(settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_title_today_shift), settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_search_shifts_text_button));
            }
            int i12 = MediaSessionCompatToken + 101;
            MediaSessionCompatResultReceiverWrapper = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                return staggeredGridLayoutManagerLazySpanLookupFullSpanItem;
            }
            obj2.hashCode();
            throw null;
        }
        List list = (List) objM4990invokeIoAF18A;
        if (list.isEmpty()) {
            if ((!v9Var.serializer() && !vaVar.read()) || !z2) {
                return new NestRiderStateSummary(settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_title_today_shift), settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_description), settransactionsuccessful.IconCompatParcelizer(R.string.viewholder_search_shifts_text_button));
            }
            int i13 = MediaSessionCompatToken + 19;
            MediaSessionCompatResultReceiverWrapper = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 31 / 0;
            }
            return staggeredGridLayoutManagerLazySpanLookupFullSpanItem;
        }
        List<onLeftHiddenState> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (onLeftHiddenState onlefthiddenstate : list2) {
            syncroom_runtime syncroom_runtimeVar = this.RemoteActionCompatParcelizer;
            syncroom_runtimeVar.getClass();
            onlefthiddenstate.getClass();
            String strIconCompatParcelizer = syncroom_runtimeVar.read.IconCompatParcelizer(R.string.instant_shift_take_shift_button);
            int iRemoteActionCompatParcelizer = onlefthiddenstate.RemoteActionCompatParcelizer();
            AdjustLinkResolution adjustLinkResolution = syncroom_runtimeVar.write;
            Calendar calendarSerializer = onlefthiddenstate.serializer();
            Calendar calendar = onlefthiddenstate.read();
            adjustLinkResolution.getClass();
            String str = AdjustLinkResolution.read(calendarSerializer, calendar);
            String strIconCompatParcelizer2 = onlefthiddenstate.write().serializer().IconCompatParcelizer();
            InstantShiftsUiModel.read readVar = InstantShiftsUiModel.read.BOOK_SHIFT;
            arrayList.add(new shouldIgnore(iRemoteActionCompatParcelizer, AdjustLinkResolution.IconCompatParcelizer(onlefthiddenstate.serializer(), convertToUri.NAME_OF_MONTH), String.valueOf(onlefthiddenstate.serializer().get(5)), AdjustLinkResolution.IconCompatParcelizer(onlefthiddenstate.serializer(), convertToUri.NAME_OF_DAY), str, strIconCompatParcelizer2, strIconCompatParcelizer, readVar));
        }
        return new StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1(settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_title_today_shift), settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_description), settransactionsuccessful.IconCompatParcelizer(R.string.view_all_button), settransactionsuccessful.IconCompatParcelizer(R.string.instant_shift_no_suitable_shift), arrayList);
    }
}
