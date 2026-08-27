package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.MeasuredPage;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.pager.PagerMeasureResult;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.AnchoredDraggableKtrestartable212;
import o.BottomSheetDefaults;
import o.BottomSheetScaffoldKtBottomSheetScaffoldLayout11;
import o.ComposePausableCompositionExceptionoperationsSequence1;
import o.FabBaselineTokens;
import o.MultiSubscriptionSnapshotFlowManager;
import o.ParcelableSnapshotMutableStateCompanionCREATOR1;
import o.TriStateCheckbox;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getDownimpl;
import o.getSuspendingTransactionContext;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements BottomSheetDefaults {
    public final /* synthetic */ getAdjustedCoordinatesk4lQ0M read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 1;

    public PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(PagerState pagerState, PagerDefaults$$ExternalSyntheticLambda0 pagerDefaults$$ExternalSyntheticLambda0, ParcelableSnapshotMutableStateCompanionCREATOR1 parcelableSnapshotMutableStateCompanionCREATOR1) {
        this.read = pagerState;
        this.serializer = pagerDefaults$$ExternalSyntheticLambda0;
    }

    @Override // o.BottomSheetDefaults
    public final float calculateApproachOffset(float f, float f2) {
        int i = this.write;
        getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = this.read;
        int i2 = 0;
        if (i != 0) {
            float fAbs = Math.abs(f2);
            LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) ((LazyListState) getadjustedcoordinatesk4lq0m).serializer();
            if (!lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.isEmpty()) {
                List list = lazyListMeasureResult.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                int size = list.size();
                int size2 = list.size();
                int i3 = 0;
                while (i2 < size2) {
                    i3 += ((LazyListMeasuredItem) ((AnchoredDraggableKtrestartable212) list.get(i2))).ComponentActivity;
                    i2++;
                }
                i2 = i3 / size;
            }
            float f3 = fAbs - i2;
            return Math.signum(f2) * (f3 >= 0.0f ? f3 : 0.0f);
        }
        PagerState pagerState = (PagerState) getadjustedcoordinatesk4lq0m;
        int iMediaMetadataCompat = pagerState.MediaMetadataCompat();
        onShowTranslationui onshowtranslationui = (onShowTranslationui) pagerState.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i4 = ((PagerMeasureResult) onshowtranslationui.getValue()).ComponentActivity + iMediaMetadataCompat;
        if (i4 == 0) {
            return 0.0f;
        }
        int i5 = pagerState.PlaybackStateCompatCustomAction;
        if (f < 0.0f) {
            i5++;
        }
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(((int) (f2 / i4)) + i5, 0, pagerState.read());
        pagerState.MediaMetadataCompat();
        int i6 = ((PagerMeasureResult) onshowtranslationui.getValue()).ComponentActivity;
        long j = i5;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i7 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((RangesKt.RemoteActionCompatParcelizer(RangesKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, i7, (int) j3), 0, pagerState.read()) - i5) * i4) - i4;
        i2 = iAbs >= 0 ? iAbs : 0;
        if (i2 == 0) {
            return i2;
        }
        return Math.signum(f) * i2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    @Override // o.BottomSheetDefaults
    public final float calculateSnapOffset(float f) {
        int i = this.write;
        Object obj = this.serializer;
        getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = this.read;
        if (i != 0) {
            LazyListState lazyListState = (LazyListState) getadjustedcoordinatesk4lq0m;
            List list = ((LazyListMeasureResult) lazyListState.serializer()).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11 = (BottomSheetScaffoldKtBottomSheetScaffoldLayout11) obj;
            int size = list.size();
            float f2 = Float.POSITIVE_INFINITY;
            float f3 = Float.NEGATIVE_INFINITY;
            for (int i2 = 0; i2 < size; i2++) {
                AnchoredDraggableKtrestartable212 anchoredDraggableKtrestartable212 = (AnchoredDraggableKtrestartable212) list.get(i2);
                FabBaselineTokens fabBaselineTokens = anchoredDraggableKtrestartable212 instanceof FabBaselineTokens ? (FabBaselineTokens) anchoredDraggableKtrestartable212 : null;
                if (fabBaselineTokens == null || !((LazyListMeasuredItem) fabBaselineTokens).ParcelableVolumeInfo) {
                    int iSerializer = getSuspendingTransactionContext.serializer(lazyListState.serializer());
                    int i3 = -((LazyListMeasureResult) lazyListState.serializer()).r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    int i4 = ((LazyListMeasureResult) lazyListState.serializer()).write;
                    LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) anchoredDraggableKtrestartable212;
                    int i5 = lazyListMeasuredItem.ComponentActivity;
                    int i6 = lazyListMeasuredItem.PlaybackStateCompat;
                    int i7 = ((LazyListMeasureResult) lazyListState.serializer()).PlaybackStateCompatCustomAction;
                    float fSerializer = i6 - bottomSheetScaffoldKtBottomSheetScaffoldLayout11.serializer(iSerializer, i5, i3, i4);
                    if (fSerializer <= 0.0f && fSerializer > f3) {
                        f3 = fSerializer;
                    }
                    if (fSerializer >= 0.0f && fSerializer < f2) {
                        f2 = fSerializer;
                    }
                }
            }
            char c = Math.abs(f) < ((LazyListMeasureResult) ((onShowTranslationui) lazyListState.ParcelableVolumeInfo).getValue()).RatingCompat.mo48toPx0680j_4(SnapFlingBehaviorKt.read) ? (char) 0 : f > 0.0f ? (char) 1 : (char) 2;
            if (c == 0) {
                if (Math.abs(f2) > Math.abs(f3)) {
                    f2 = f3;
                }
            } else if (c != 1) {
                if (c == 2) {
                    f2 = f3;
                } else {
                    f2 = 0.0f;
                }
            }
            if (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
                return 0.0f;
            }
            return f2;
        }
        PagerState pagerState = (PagerState) getadjustedcoordinatesk4lq0m;
        BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout12 = pagerState.MediaSessionCompatQueueItem().ResultReceiver;
        List list2 = pagerState.MediaSessionCompatQueueItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int size2 = list2.size();
        float f4 = Float.NEGATIVE_INFINITY;
        float f5 = Float.POSITIVE_INFINITY;
        for (int i8 = 0; i8 < size2; i8++) {
            ComposePausableCompositionExceptionoperationsSequence1 composePausableCompositionExceptionoperationsSequence1 = (ComposePausableCompositionExceptionoperationsSequence1) list2.get(i8);
            int iWrite = MultiSubscriptionSnapshotFlowManager.write(pagerState.MediaSessionCompatQueueItem());
            int i9 = -pagerState.MediaSessionCompatQueueItem().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            int i10 = pagerState.MediaSessionCompatQueueItem().serializer;
            int i11 = pagerState.MediaSessionCompatQueueItem().PlaybackStateCompatCustomAction;
            int i12 = ((MeasuredPage) composePausableCompositionExceptionoperationsSequence1).RatingCompat;
            pagerState.read();
            float fSerializer2 = i12 - bottomSheetScaffoldKtBottomSheetScaffoldLayout12.serializer(iWrite, i11, i9, i10);
            if (fSerializer2 <= 0.0f && fSerializer2 > f4) {
                f4 = fSerializer2;
            }
            if (fSerializer2 >= 0.0f && fSerializer2 < f5) {
                f5 = fSerializer2;
            }
        }
        if (f4 == Float.NEGATIVE_INFINITY) {
            f4 = f5;
        }
        if (f5 == Float.POSITIVE_INFINITY) {
            f5 = f4;
        }
        if (!pagerState.write()) {
            if (getDownimpl.write(pagerState, f)) {
                f4 = 0.0f;
                f5 = 0.0f;
            } else {
                f5 = 0.0f;
            }
        }
        if (!pagerState.RemoteActionCompatParcelizer()) {
            f4 = 0.0f;
            if (!getDownimpl.write(pagerState, f)) {
                f5 = 0.0f;
            }
        }
        float fFloatValue = Float.valueOf(f4).floatValue();
        float fFloatValue2 = Float.valueOf(f5).floatValue();
        float fFloatValue3 = ((Number) ((PagerDefaults$$ExternalSyntheticLambda0) obj).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            TriStateCheckbox.RemoteActionCompatParcelizer("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    public PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(LazyListState lazyListState, BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11) {
        this.read = lazyListState;
        this.serializer = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
    }
}
