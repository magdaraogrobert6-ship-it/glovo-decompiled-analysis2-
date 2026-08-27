package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoErrorCode extends LazyKt__LazyJVMKt {
    public final Method IconCompatParcelizer;
    public final int read;
    public final boolean serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ ProtoErrorCode(Method method, int i, boolean z, int i2) {
        this.write = i2;
        this.IconCompatParcelizer = method;
        this.read = i;
        this.serializer = z;
    }

    @Override // kotlin.LazyKt__LazyJVMKt
    public final void read(ProtoFeatureMsg protoFeatureMsg, Object obj) {
        int i = this.write;
        boolean z = this.serializer;
        Method method = this.IconCompatParcelizer;
        int i2 = this.read;
        if (i == 0) {
            Map map = (Map) obj;
            if (map == null) {
                throw getKind.IconCompatParcelizer(method, i2, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw getKind.IconCompatParcelizer(method, i2, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw getKind.IconCompatParcelizer(method, i2, ff$$ExternalSyntheticOutline0.m("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw getKind.IconCompatParcelizer(method, i2, "Field map value '" + value + "' converted to null by " + getChangeVersionControl.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                FormBody.Builder builder = protoFeatureMsg.RatingCompat;
                if (z) {
                    builder.read(str, string);
                } else {
                    builder.RemoteActionCompatParcelizer(str, string);
                }
            }
            return;
        }
        if (i == 1) {
            Map map2 = (Map) obj;
            if (map2 == null) {
                throw getKind.IconCompatParcelizer(method, i2, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                String str2 = (String) entry2.getKey();
                if (str2 == null) {
                    throw getKind.IconCompatParcelizer(method, i2, "Header map contained null key.", new Object[0]);
                }
                Object value2 = entry2.getValue();
                if (value2 == null) {
                    throw getKind.IconCompatParcelizer(method, i2, ff$$ExternalSyntheticOutline0.m("Header map contained null value for key '", str2, "'."), new Object[0]);
                }
                protoFeatureMsg.IconCompatParcelizer(str2, value2.toString(), z);
            }
            return;
        }
        Map map3 = (Map) obj;
        if (map3 == null) {
            throw getKind.IconCompatParcelizer(method, i2, "Query map was null", new Object[0]);
        }
        for (Map.Entry entry3 : map3.entrySet()) {
            String str3 = (String) entry3.getKey();
            if (str3 == null) {
                throw getKind.IconCompatParcelizer(method, i2, "Query map contained null key.", new Object[0]);
            }
            Object value3 = entry3.getValue();
            if (value3 == null) {
                throw getKind.IconCompatParcelizer(method, i2, ff$$ExternalSyntheticOutline0.m("Query map contained null value for key '", str3, "'."), new Object[0]);
            }
            String string2 = value3.toString();
            if (string2 == null) {
                throw getKind.IconCompatParcelizer(method, i2, "Query map value '" + value3 + "' converted to null by " + getChangeVersionControl.class.getName() + " for key '" + str3 + "'.", new Object[0]);
            }
            protoFeatureMsg.serializer(str3, string2, z);
        }
    }
}
