package o;

import com.google.gson.stream.JsonToken;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class copyFrom {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[JsonToken.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[JsonToken.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[JsonToken.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[JsonToken.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[JsonToken.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
