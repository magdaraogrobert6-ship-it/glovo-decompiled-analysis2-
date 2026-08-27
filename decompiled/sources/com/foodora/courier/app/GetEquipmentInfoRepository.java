package com.foodora.courier.app;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.data.util.sharedPreferences.SharedPreferencesManagerImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ExecutableQueryexecuteAsList1;
import o.getSTYLEABLE_VECTOR_DRAWABLE_ALPHA;
import o.isApiKeyPresentandroid_sdk_base_releaseannotations;

/* JADX INFO: loaded from: classes2.dex */
public final class GetEquipmentInfoRepository {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final SaveHeatmapUrlImpl RemoteActionCompatParcelizer;
    public final isApiKeyPresentandroid_sdk_base_releaseannotations write;

    public GetEquipmentInfoRepository(isApiKeyPresentandroid_sdk_base_releaseannotations isapikeypresentandroid_sdk_base_releaseannotations, SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        this.write = isapikeypresentandroid_sdk_base_releaseannotations;
        this.RemoteActionCompatParcelizer = saveHeatmapUrlImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final Object equipmentInfo(ContinuationImpl continuationImpl) {
        getSTYLEABLE_VECTOR_DRAWABLE_ALPHA getstyleable_vector_drawable_alpha;
        int i;
        Object objWrite;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String str;
        Object objWrite2;
        String str2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 53;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            if (continuationImpl instanceof getSTYLEABLE_VECTOR_DRAWABLE_ALPHA) {
                getstyleable_vector_drawable_alpha = (getSTYLEABLE_VECTOR_DRAWABLE_ALPHA) continuationImpl;
                i = getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                }
            }
            objWrite = getstyleable_vector_drawable_alpha.read;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWrite);
                getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = 1;
                objWrite = this.write.serializer.write("vehicle_selection", String.class, getstyleable_vector_drawable_alpha);
                if (objWrite != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            int i7 = IconCompatParcelizer + 35;
            i3 = i7 % Fields.SpotShadowColor;
            read = i3;
            int i8 = i7 % 2;
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = i3 + 7;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    str2 = getstyleable_vector_drawable_alpha.write;
                    ExtrasKt.RemoteActionCompatParcelizer(objWrite);
                    int i9 = 61 / 0;
                } else {
                    str2 = getstyleable_vector_drawable_alpha.write;
                    ExtrasKt.RemoteActionCompatParcelizer(objWrite);
                }
            }
            ExecutableQueryexecuteAsList1 executableQueryexecuteAsList1 = new ExecutableQueryexecuteAsList1(str2, (String) objWrite);
            int i10 = IconCompatParcelizer + 33;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return executableQueryexecuteAsList1;
            str = (String) objWrite;
            getstyleable_vector_drawable_alpha.write = str;
            getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = 2;
            objWrite2 = ((SharedPreferencesManagerImpl) this.RemoteActionCompatParcelizer.serializer).write("bag_selection", String.class, getstyleable_vector_drawable_alpha);
            if (objWrite2 != coroutineSingletons) {
                int i12 = IconCompatParcelizer + 21;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                str2 = str;
                objWrite = objWrite2;
                ExecutableQueryexecuteAsList1 executableQueryexecuteAsList2 = new ExecutableQueryexecuteAsList1(str2, (String) objWrite);
                int i14 = IconCompatParcelizer + 33;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return executableQueryexecuteAsList2;
            }
            return coroutineSingletons;
        }
        int i16 = 96 / 0;
        if (continuationImpl instanceof getSTYLEABLE_VECTOR_DRAWABLE_ALPHA) {
            getstyleable_vector_drawable_alpha = (getSTYLEABLE_VECTOR_DRAWABLE_ALPHA) continuationImpl;
            i = getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            }
        }
        objWrite = getstyleable_vector_drawable_alpha.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = 1;
            objWrite = this.write.serializer.write("vehicle_selection", String.class, getstyleable_vector_drawable_alpha);
            if (objWrite != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i17 = IconCompatParcelizer + 35;
        i3 = i17 % Fields.SpotShadowColor;
        read = i3;
        int i18 = i17 % 2;
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = i3 + 7;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                str2 = getstyleable_vector_drawable_alpha.write;
                ExtrasKt.RemoteActionCompatParcelizer(objWrite);
                int i19 = 61 / 0;
            } else {
                str2 = getstyleable_vector_drawable_alpha.write;
                ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            }
        }
        ExecutableQueryexecuteAsList1 executableQueryexecuteAsList3 = new ExecutableQueryexecuteAsList1(str2, (String) objWrite);
        int i110 = IconCompatParcelizer + 33;
        read = i110 % Fields.SpotShadowColor;
        int i111 = i110 % 2;
        return executableQueryexecuteAsList3;
        str = (String) objWrite;
        getstyleable_vector_drawable_alpha.write = str;
        getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = 2;
        objWrite2 = ((SharedPreferencesManagerImpl) this.RemoteActionCompatParcelizer.serializer).write("bag_selection", String.class, getstyleable_vector_drawable_alpha);
        if (objWrite2 != coroutineSingletons) {
            int i112 = IconCompatParcelizer + 21;
            read = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
            str2 = str;
            objWrite = objWrite2;
            ExecutableQueryexecuteAsList1 executableQueryexecuteAsList4 = new ExecutableQueryexecuteAsList1(str2, (String) objWrite);
            int i114 = IconCompatParcelizer + 33;
            read = i114 % Fields.SpotShadowColor;
            int i115 = i114 % 2;
            return executableQueryexecuteAsList4;
        }
        return coroutineSingletons;
        getstyleable_vector_drawable_alpha = new getSTYLEABLE_VECTOR_DRAWABLE_ALPHA(this, continuationImpl);
        objWrite = getstyleable_vector_drawable_alpha.read;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = 1;
            objWrite = this.write.serializer.write("vehicle_selection", String.class, getstyleable_vector_drawable_alpha);
            if (objWrite != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i116 = IconCompatParcelizer + 35;
        i3 = i116 % Fields.SpotShadowColor;
        read = i3;
        int i117 = i116 % 2;
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objWrite);
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = i3 + 7;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                str2 = getstyleable_vector_drawable_alpha.write;
                ExtrasKt.RemoteActionCompatParcelizer(objWrite);
                int i118 = 61 / 0;
            } else {
                str2 = getstyleable_vector_drawable_alpha.write;
                ExtrasKt.RemoteActionCompatParcelizer(objWrite);
            }
        }
        ExecutableQueryexecuteAsList1 executableQueryexecuteAsList5 = new ExecutableQueryexecuteAsList1(str2, (String) objWrite);
        int i119 = IconCompatParcelizer + 33;
        read = i119 % Fields.SpotShadowColor;
        int i1110 = i119 % 2;
        return executableQueryexecuteAsList5;
        str = (String) objWrite;
        getstyleable_vector_drawable_alpha.write = str;
        getstyleable_vector_drawable_alpha.RemoteActionCompatParcelizer = 2;
        objWrite2 = ((SharedPreferencesManagerImpl) this.RemoteActionCompatParcelizer.serializer).write("bag_selection", String.class, getstyleable_vector_drawable_alpha);
        if (objWrite2 != coroutineSingletons) {
            int i1111 = IconCompatParcelizer + 21;
            read = i1111 % Fields.SpotShadowColor;
            int i1112 = i1111 % 2;
            str2 = str;
            objWrite = objWrite2;
            ExecutableQueryexecuteAsList1 executableQueryexecuteAsList6 = new ExecutableQueryexecuteAsList1(str2, (String) objWrite);
            int i1113 = IconCompatParcelizer + 33;
            read = i1113 % Fields.SpotShadowColor;
            int i1114 = i1113 % 2;
            return executableQueryexecuteAsList6;
        }
        return coroutineSingletons;
    }
}
