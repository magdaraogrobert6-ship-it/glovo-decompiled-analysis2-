package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.BackspaceCommand;
import o.TextUnitTypeSaverlambda1;
import o.backwardFocusSearch;
import o.getNoActiveChildannotations;
import o.getParagraphStyleSaver;
import o.isRoot;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampRepositoryImpl implements TextUnitTypeSaverlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final performCustomExitMxy_nc0 RemoteActionCompatParcelizer;

    public TimestampRepositoryImpl(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        this.RemoteActionCompatParcelizer = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object contains(long j, ContinuationImpl continuationImpl) {
        getParagraphStyleSaver getparagraphstylesaver;
        int i = 2 % 2;
        if (continuationImpl instanceof getParagraphStyleSaver) {
            getparagraphstylesaver = (getParagraphStyleSaver) continuationImpl;
            int i2 = getparagraphstylesaver.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 1;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getparagraphstylesaver.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i5 = read + 81;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                getparagraphstylesaver = new getParagraphStyleSaver(this, continuationImpl);
            }
        } else {
            getparagraphstylesaver = new getParagraphStyleSaver(this, continuationImpl);
        }
        Object objFirst = getparagraphstylesaver.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getparagraphstylesaver.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            int i8 = IconCompatParcelizer + 77;
            int i9 = i8 % Fields.SpotShadowColor;
            read = i9;
            int i10 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = i9 + 83;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            j = getparagraphstylesaver.write;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            int i13 = read + 19;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 4 % 4;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            Flow flowSerializer = this.RemoteActionCompatParcelizer.serializer();
            getparagraphstylesaver.write = j;
            getparagraphstylesaver.RemoteActionCompatParcelizer = 1;
            objFirst = FlowKt.first(flowSerializer, getparagraphstylesaver);
            if (objFirst == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        isRoot isroot = (isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{String.valueOf(j)}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write());
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) ((getNoActiveChildannotations) objFirst);
        backwardfocussearch.getClass();
        return Boolean.valueOf(backwardfocussearch.RemoteActionCompatParcelizer.containsKey(isroot));
    }
}
