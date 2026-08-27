package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class TasksRepository$observeLocalTasks$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 write;

    public /* synthetic */ TasksRepository$observeLocalTasks$$inlined$map$1(FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, String str, int i) {
        this.IconCompatParcelizer = i;
        this.write = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        this.read = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = createFromParcel.INSTANCE;
        String str = this.read;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this.write;
        if (i4 == 0) {
            Object objCollect = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(new NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2(flowCollector, str, 1), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return obj;
            }
            int i5 = RemoteActionCompatParcelizer + 81;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objCollect;
            }
            throw null;
        }
        Object objCollect2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(new NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2(flowCollector, str, 2), shortNewsContentCardView);
        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i6 = RemoteActionCompatParcelizer + 117;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            obj = objCollect2;
        }
        int i8 = serializer + 117;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 50 / 0;
        }
        return obj;
    }
}
