package o;

import com.huawei.location.lite.common.util.SystemPropertiesUtil;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class clearWeakReferences {
    public static final String serializer;
    public static final String write;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read()));
        String str = File.separator;
        sb.append(str);
        write = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(onPrepareActionMode.IconCompatParcelizer(placeAtf8xVGno.read()));
        sb2.append(str);
        placeAtf8xVGno.read();
        String str2 = "arm64-v8a";
        try {
            String str3 = SystemPropertiesUtil.get("ro.product.cpu.abi", "arm64-v8a");
            WrappedCompositionsetContent1211.read();
            str2 = str3;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LoadSoUtil", "getCurrentCpuAbi error");
        }
        sb2.append(str2);
        serializer = sb2.toString();
    }
}
