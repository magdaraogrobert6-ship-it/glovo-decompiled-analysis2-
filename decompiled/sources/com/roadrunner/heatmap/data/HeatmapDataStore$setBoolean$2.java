package com.roadrunner.heatmap.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.isRoot;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class HeatmapDataStore$setBoolean$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ isRoot serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeatmapDataStore$setBoolean$2(int i, isRoot isroot, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = isroot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        isRoot isroot = this.serializer;
        if (i5 == 0) {
            HeatmapDataStore$setBoolean$2 heatmapDataStore$setBoolean$2 = new HeatmapDataStore$setBoolean$2(0, isroot, shortNewsContentCardView);
            heatmapDataStore$setBoolean$2.write = obj;
            return heatmapDataStore$setBoolean$2;
        }
        int i6 = 1;
        if (i5 != 1) {
            HeatmapDataStore$setBoolean$2 heatmapDataStore$setBoolean$3 = new HeatmapDataStore$setBoolean$2(i, isroot, shortNewsContentCardView);
            heatmapDataStore$setBoolean$3.write = obj;
            return heatmapDataStore$setBoolean$3;
        }
        HeatmapDataStore$setBoolean$2 heatmapDataStore$setBoolean$4 = new HeatmapDataStore$setBoolean$2(i6, isroot, shortNewsContentCardView);
        heatmapDataStore$setBoolean$4.write = obj;
        int i7 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return heatmapDataStore$setBoolean$4;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            ((HeatmapDataStore$setBoolean$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i4 == 1) {
            ((HeatmapDataStore$setBoolean$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((HeatmapDataStore$setBoolean$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        isRoot isroot = this.serializer;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.write(isroot, Boolean.FALSE);
            return createfromparcel2;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.read(isroot);
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch.read(isroot);
        int i4 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
