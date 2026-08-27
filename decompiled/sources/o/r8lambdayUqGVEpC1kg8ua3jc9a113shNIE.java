package o;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.incognia.internal.X6a;
import com.incognia.internal.zB6;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.TelemetryUtilsResponseCallback;
import com.mapbox.common.module.StreamingDataReader;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdayUqGVEpC1kg8ua3jc9a113shNIE implements ObjectConstructor, zB6, Expected.Action, EventsServiceResponseCallback, TelemetryUtilsResponseCallback, Consumer, Action {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = i3 + 119;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // com.incognia.internal.zB6
    public void BGx(boolean z) {
        int i = 2 % 2;
        int i2 = write + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            X6a.BGx(z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        X6a.BGx(z);
        int i3 = IconCompatParcelizer + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
    }

    public /* synthetic */ r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(int i) {
        this.read = i;
    }

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public void run(Expected expected) {
        int i = 2 % 2;
        int i2 = write + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read == 12) {
            MapTelemetryImpl.onAppUserTurnstileEvent$lambda$0(expected);
            return;
        }
        MapTelemetryImpl.enableTelemetryCollection$lambda$3(expected);
        int i4 = write + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StreamingDataReader.fillChunkBuffer$lambda$2((String) obj);
        int i4 = IconCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IconCompatParcelizer(Object obj, String str) {
        int i = 2 % 2;
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void read(String str, Object obj, Object obj2) {
        int i = 2 % 2;
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IconCompatParcelizer(int i, String str) {
        int i2 = 2 % 2;
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void serializer(Object obj, String str) {
        int i = 2 % 2;
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        throw new IllegalStateException();
    }

    public static /* synthetic */ void write(int i, Object obj) {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [char, int] */
    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        ?? IntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) IntValue) + ((Object) " at index ") + ((Number) objArr[1]).intValue());
    }

    public static /* synthetic */ void read(int i, String str) {
        int i2 = 2 % 2;
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(long j, String str) {
        int i = 2 % 2;
        throw new IllegalArgumentException(str + j);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = 2 % 2;
        int i2 = write + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        if (i4 == 1) {
            return ConstructorConstructor.lambda$newMapConstructor$17();
        }
        if (i4 == 2) {
            return ConstructorConstructor.lambda$newMapConstructor$18();
        }
        if (i4 == 3) {
            return ConstructorConstructor.lambda$newCollectionConstructor$10();
        }
        if (i4 != 4) {
            return i4 != 5 ? ConstructorConstructor.lambda$newCollectionConstructor$13() : ConstructorConstructor.lambda$newCollectionConstructor$12();
        }
        Collection collectionLambda$newCollectionConstructor$11 = ConstructorConstructor.lambda$newCollectionConstructor$11();
        int i5 = IconCompatParcelizer + 65;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return collectionLambda$newCollectionConstructor$11;
    }

    public static /* synthetic */ void write(Object obj, String str) {
        int i = 2 % 2;
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void write(String str, Object obj, Object obj2) {
        int i = 2 % 2;
        throw new NumberFormatException(str + obj + obj2);
    }

    public static /* synthetic */ void serializer(String str, Throwable th) {
        int i = 2 % 2;
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void serializer(String str, Object[] objArr) {
        int i = 2 % 2;
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void write(Throwable th) {
        int i = 2 % 2;
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~((~i6) | i8 | i5);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i5);
        int i13 = (~(i6 | i7)) | (~(i7 | i3)) | i10;
        int i14 = i5 + i3 + i + (1787548100 * i2) + (1101416392 * i4);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i5) - 623378432) + (561581232 * i3) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i) + ((-778043392) * i2) + ((-46137344) * i4) + (324403200 * i15);
        int i17 = (i5 * (-930662234)) + 656878810 + (i3 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i * (-930661477)) + (i2 * 2052861356) + (i4 * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        if (i18 == 1) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i18 != 2) {
            int i19 = 2 % 2;
            throw new AssertionError();
        }
        int i20 = 2 % 2;
        throw new ClassCastException();
    }

    public static /* synthetic */ void write() {
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
    }

    public static /* synthetic */ void IconCompatParcelizer() {
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }
}
