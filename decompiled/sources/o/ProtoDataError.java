package o;

import java.util.Objects;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoDataError extends LazyKt__LazyJVMKt {
    public final getChangeVersionControl IconCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final /* synthetic */ int write;

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        int i = this.write;
        boolean z = this.serializer;
        String str = this.read;
        getChangeVersionControl getchangeversioncontrol = this.IconCompatParcelizer;
        if (i != 0) {
            if (obj == null) {
                return;
            }
            getchangeversioncontrol.getClass();
            String string = obj.toString();
            if (string == null) {
                return;
            }
            protoFeatureMsg.IconCompatParcelizer(str, string, z);
            return;
        }
        if (obj == null) {
            return;
        }
        getchangeversioncontrol.getClass();
        String string2 = obj.toString();
        if (string2 == null) {
            return;
        }
        protoFeatureMsg.serializer(str, string2, z);
    }

    public ProtoDataError(String str, int i, boolean z) {
        this.write = i;
        if (i != 1) {
            getChangeVersionControl getchangeversioncontrol = getChangeVersionControl.write;
            Objects.requireNonNull(str, "name == null");
            this.read = str;
            this.IconCompatParcelizer = getchangeversioncontrol;
            this.serializer = z;
            return;
        }
        getChangeVersionControl getchangeversioncontrol2 = getChangeVersionControl.write;
        Objects.requireNonNull(str, "name == null");
        this.read = str;
        this.IconCompatParcelizer = getchangeversioncontrol2;
        this.serializer = z;
    }
}
