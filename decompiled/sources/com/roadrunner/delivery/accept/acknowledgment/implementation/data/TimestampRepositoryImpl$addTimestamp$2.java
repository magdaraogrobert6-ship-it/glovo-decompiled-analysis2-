package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.isRoot;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampRepositoryImpl$addTimestamp$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ long read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimestampRepositoryImpl$addTimestamp$2(long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = j;
        this.read = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        TimestampRepositoryImpl$addTimestamp$2 timestampRepositoryImpl$addTimestamp$2 = new TimestampRepositoryImpl$addTimestamp$2(this.IconCompatParcelizer, this.read, shortNewsContentCardView);
        timestampRepositoryImpl$addTimestamp$2.write = obj;
        int i2 = serializer + 99;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return timestampRepositoryImpl$addTimestamp$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TimestampRepositoryImpl$addTimestamp$2 timestampRepositoryImpl$addTimestamp$2 = (TimestampRepositoryImpl$addTimestamp$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        timestampRepositoryImpl$addTimestamp$2.invokeSuspend(createfromparcel);
        int i4 = RemoteActionCompatParcelizer + 119;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object[] objArr = {String.valueOf(this.IconCompatParcelizer)};
        int iWrite = BackspaceCommand.write();
        isRoot isroot = (isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 1579077836, iWrite);
        Long l = new Long(this.read);
        backwardfocussearch.getClass();
        backwardfocussearch.serializer(isroot, l);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = serializer + 63;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }
}
