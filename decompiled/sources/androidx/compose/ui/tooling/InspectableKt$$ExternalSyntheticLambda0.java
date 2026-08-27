package androidx.compose.ui.tooling;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderButtonsKt;
import o.ContentType_androidKt;
import o.createFromParcel;
import o.getBirthDateFull;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InspectableKt$$ExternalSyntheticLambda0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ InspectableKt$$ExternalSyntheticLambda0(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.f$1 = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        int i4 = this.f$1;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.f$0;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        Integer num = (Integer) obj2;
        if (i3 != 0) {
            num.intValue();
            DestinationHeaderButtonsKt.write(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createFromParcel.INSTANCE;
        }
        createFromParcel createfromparcelInInspectionModeOnly$lambda$0 = InspectableKt.InInspectionModeOnly$lambda$0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i4, getbirthdatefull, num.intValue());
        int i5 = serializer + 85;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return createfromparcelInInspectionModeOnly$lambda$0;
    }
}
