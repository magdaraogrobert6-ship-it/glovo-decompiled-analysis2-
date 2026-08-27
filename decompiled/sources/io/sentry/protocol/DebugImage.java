package io.sentry.protocol;

import java.io.IOException;
import java.util.Map;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugImage implements RequestPushPermissionStep {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.uuid != null) {
            okHttpCall$1.write("uuid");
            okHttpCall$1.IconCompatParcelizer(this.uuid);
        }
        if (this.type != null) {
            okHttpCall$1.write("type");
            okHttpCall$1.IconCompatParcelizer(this.type);
        }
        if (this.debugId != null) {
            okHttpCall$1.write("debug_id");
            okHttpCall$1.IconCompatParcelizer(this.debugId);
        }
        if (this.debugFile != null) {
            okHttpCall$1.write("debug_file");
            okHttpCall$1.IconCompatParcelizer(this.debugFile);
        }
        if (this.codeId != null) {
            okHttpCall$1.write("code_id");
            okHttpCall$1.IconCompatParcelizer(this.codeId);
        }
        if (this.codeFile != null) {
            okHttpCall$1.write("code_file");
            okHttpCall$1.IconCompatParcelizer(this.codeFile);
        }
        if (this.imageAddr != null) {
            okHttpCall$1.write("image_addr");
            okHttpCall$1.IconCompatParcelizer(this.imageAddr);
        }
        if (this.imageSize != null) {
            okHttpCall$1.write("image_size");
            okHttpCall$1.RemoteActionCompatParcelizer(this.imageSize);
        }
        if (this.arch != null) {
            okHttpCall$1.write("arch");
            okHttpCall$1.IconCompatParcelizer(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                okHttpCall$1.write(str);
                okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, obj);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }
}
