package com.roadrunner.delivery.ontheway.chatfloating.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ImeActionCompanion;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.toVariationValue;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultChatViewStateRepository$fetchChatState$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ ImeActionCompanion IconCompatParcelizer;
    public /* synthetic */ boolean read;
    public /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultChatViewStateRepository$fetchChatState$1(ImeActionCompanion imeActionCompanion, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = imeActionCompanion;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035 A[DONT_INVERT, PHI: r1 r3
  0x0035: PHI (r1v6 int) = (r1v4 int), (r1v8 int) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r3v3 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r3
  0x0029: PHI (r3v1 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        String strValueOf;
        int i2;
        Object obj2;
        int i3 = 2 % 2;
        int i4 = write + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            i = this.serializer;
            z = this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (i > 10) {
                int i5 = RemoteActionCompatParcelizer + 9;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                strValueOf = "+99";
            } else if (i == 0) {
                i2 = write + 99;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                obj2 = null;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                strValueOf = null;
            } else {
                strValueOf = String.valueOf(i);
            }
        } else {
            i = this.serializer;
            z = this.read;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (i > 99) {
                int i7 = RemoteActionCompatParcelizer + 9;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                strValueOf = "+99";
            } else if (i == 0) {
                i2 = write + 99;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                obj2 = null;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                strValueOf = null;
            } else {
                strValueOf = String.valueOf(i);
            }
        }
        return new toVariationValue(strValueOf, z);
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        DefaultChatViewStateRepository$fetchChatState$1 defaultChatViewStateRepository$fetchChatState$1 = new DefaultChatViewStateRepository$fetchChatState$1(this.IconCompatParcelizer, (ShortNewsContentCardView) obj3);
        defaultChatViewStateRepository$fetchChatState$1.serializer = iIntValue;
        defaultChatViewStateRepository$fetchChatState$1.read = zBooleanValue;
        Object objInvokeSuspend = defaultChatViewStateRepository$fetchChatState$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = RemoteActionCompatParcelizer + 97;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return objInvokeSuspend;
    }
}
