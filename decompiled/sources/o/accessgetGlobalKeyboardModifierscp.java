package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetGlobalKeyboardModifierscp implements Cloneable {
    public long read;
    public float serializer = 0.0f;
    public float write = 0.0f;
    public float IconCompatParcelizer = 0.0f;

    public final Object clone() {
        accessgetGlobalKeyboardModifierscp accessgetglobalkeyboardmodifierscp = new accessgetGlobalKeyboardModifierscp();
        try {
            if (super.clone() instanceof accessgetGlobalKeyboardModifierscp) {
                return (accessgetGlobalKeyboardModifierscp) super.clone();
            }
        } catch (CloneNotSupportedException unused) {
            WrappedCompositionsetContent1211.read("SensorRecord", "Clone Not Supported Exception");
        }
        return accessgetglobalkeyboardmodifierscp;
    }

    public final String toString() {
        return "time: " + this.read + " x:" + this.serializer + " y:" + this.write + " z:" + this.IconCompatParcelizer;
    }
}
