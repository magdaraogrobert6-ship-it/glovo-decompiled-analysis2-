package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreviewBlackScreenQuirk {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final boolean read(removeScheduledCallback removescheduledcallback) {
        int i = 2 % 2;
        removescheduledcallback.getClass();
        if (removescheduledcallback == removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER) {
            return true;
        }
        int i2 = read + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (removescheduledcallback == removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG) {
            return true;
        }
        int i4 = read + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public static final boolean RemoteActionCompatParcelizer(removeScheduledCallback removescheduledcallback) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            removescheduledcallback.getClass();
            int i3 = 37 / 0;
            if (removescheduledcallback == removeScheduledCallback.CREATE_WEBVIEW) {
                return true;
            }
        } else {
            removescheduledcallback.getClass();
            if (removescheduledcallback == removeScheduledCallback.CREATE_WEBVIEW) {
                return true;
            }
        }
        int i4 = read + 117;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            removeScheduledCallback removescheduledcallback2 = removeScheduledCallback.PRELOAD_WARMUP_ASSETS;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (removescheduledcallback == removeScheduledCallback.PRELOAD_WARMUP_ASSETS || removescheduledcallback == removeScheduledCallback.FULL_PRELOAD) {
            return true;
        }
        int i5 = read + 79;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return false;
    }

    public static void write(float[] fArr) {
        int i = 2 % 2;
        int i2 = read + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            android.opengl.Matrix.translateM(fArr, 1, 0.0f, 0.5f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 1, 2.0f, -1.0f, 0.0f);
            android.opengl.Matrix.translateM(fArr, 0, 2.0f, -0.5f, 0.0f);
        } else {
            android.opengl.Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            android.opengl.Matrix.translateM(fArr, 0, 0.0f, -0.5f, 0.0f);
        }
        int i3 = read + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static void serializer(float[] fArr, float f) {
        int i = 2 % 2;
        int i2 = read + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            android.opengl.Matrix.translateM(fArr, 1, 0.5f, 0.5f, 1.0f);
            android.opengl.Matrix.rotateM(fArr, 0, f, 1.0f, 1.0f, 1.0f);
            android.opengl.Matrix.translateM(fArr, 0, -0.5f, -0.5f, 1.0f);
        } else {
            android.opengl.Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            android.opengl.Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
            android.opengl.Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
        int i3 = read + 71;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    public static final boolean IconCompatParcelizer(removeScheduledCallback removescheduledcallback) {
        int i;
        int i2 = 2 % 2;
        removescheduledcallback.getClass();
        if (removescheduledcallback != removeScheduledCallback.CREATE_WEBVIEW) {
            int i3 = read + 97;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (removescheduledcallback != removeScheduledCallback.PREFETCH_NATIVE_APIS) {
                int i5 = read + 53;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (removescheduledcallback != removeScheduledCallback.PRELOAD_WARMUP_ASSETS) {
                    int i7 = read + 1;
                    IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    Object obj = null;
                    if (i7 % 2 != 0) {
                        removeScheduledCallback removescheduledcallback2 = removeScheduledCallback.WEB_ASSET_CACHE_LOADING;
                        throw null;
                    }
                    if (removescheduledcallback != removeScheduledCallback.WEB_ASSET_CACHE_LOADING && removescheduledcallback != removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER) {
                        int i8 = read + 81;
                        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            int i9 = 27 / 0;
                            if (removescheduledcallback != removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG) {
                                i = read + 27;
                                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i % 2 == 0) {
                                    removeScheduledCallback removescheduledcallback3 = removeScheduledCallback.FULL_PRELOAD;
                                    obj.hashCode();
                                    throw null;
                                }
                                if (removescheduledcallback == removeScheduledCallback.FULL_PRELOAD) {
                                    return false;
                                }
                            }
                        } else if (removescheduledcallback != removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG) {
                            i = read + 27;
                            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i % 2 == 0) {
                                removeScheduledCallback removescheduledcallback4 = removeScheduledCallback.FULL_PRELOAD;
                                obj.hashCode();
                                throw null;
                            }
                            if (removescheduledcallback == removeScheduledCallback.FULL_PRELOAD) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
