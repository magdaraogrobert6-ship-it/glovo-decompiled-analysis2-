package o;

/* JADX INFO: loaded from: classes.dex */
public enum mul3x3Float3_0 {
    STAR(1),
    POLYGON(2);

    private final int value;

    mul3x3Float3_0(int i) {
        this.value = i;
    }

    public static mul3x3Float3_0 forValue(int i) {
        for (mul3x3Float3_0 mul3x3float3_0 : values()) {
            if (mul3x3float3_0.value == i) {
                return mul3x3float3_0;
            }
        }
        return null;
    }
}
