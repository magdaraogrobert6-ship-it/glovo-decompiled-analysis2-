package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl;
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
public final class TimestampRepositoryImpl$delete$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimestampRepositoryImpl$delete$2(long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.read != 0) {
            TimestampRepositoryImpl$delete$2 timestampRepositoryImpl$delete$2 = new TimestampRepositoryImpl$delete$2(this.IconCompatParcelizer, shortNewsContentCardView, 1);
            timestampRepositoryImpl$delete$2.write = obj;
            int i3 = RemoteActionCompatParcelizer + 35;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return timestampRepositoryImpl$delete$2;
            }
            obj2.hashCode();
            throw null;
        }
        TimestampRepositoryImpl$delete$2 timestampRepositoryImpl$delete$3 = new TimestampRepositoryImpl$delete$2(this.IconCompatParcelizer, shortNewsContentCardView, 0);
        timestampRepositoryImpl$delete$3.write = obj;
        int i4 = RemoteActionCompatParcelizer + 11;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return timestampRepositoryImpl$delete$3;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            ((TimestampRepositoryImpl$delete$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = RemoteActionCompatParcelizer + 65;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        ((TimestampRepositoryImpl$delete$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i7 = serializer + 105;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        long j = this.IconCompatParcelizer;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object[] objArr = {String.valueOf(j)};
            int iWrite = BackspaceCommand.write();
            backwardfocussearch.read((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 1579077836, iWrite));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        isRoot isroot = AutoAcceptRequestStateRepositoryImpl.serializer;
        backwardfocussearch.write(AutoAcceptRequestStateRepositoryImpl.IconCompatParcelizer, new Long(j));
        int i5 = serializer + 55;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
