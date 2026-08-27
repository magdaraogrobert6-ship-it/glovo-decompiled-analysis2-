package o;

import io.sentry.protocol.DebugImage;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class getContentCardsSwipeLayout implements size3ABfNKs {
    public long RemoteActionCompatParcelizer;
    public long read;
    public Serializable serializer;
    public Object write;

    @Override // o.size3ABfNKs
    public long RemoteActionCompatParcelizer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return Long.MAX_VALUE;
    }

    @Override // o.size3ABfNKs
    public boolean l_() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public getContentCardsSwipeLayout(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArray = jSONObject.getJSONArray("upgrades");
        int length = jSONArray.length();
        ?? r2 = new String[length];
        for (int i = 0; i < length; i++) {
            r2[i] = jSONArray.getString(i);
        }
        this.write = jSONObject.getString("sid");
        this.serializer = r2;
        this.read = jSONObject.getLong("pingInterval");
        this.RemoteActionCompatParcelizer = jSONObject.getLong("pingTimeout");
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return ((SizeNode) this.write).read(read(j), transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, RemoteActionCompatParcelizer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures4, transformGestureDetectorKtdetectTransformGestures3));
    }

    public DebugImage serializer() {
        long j = this.read;
        String str = (String) this.serializer;
        if (str.isEmpty()) {
            return null;
        }
        DebugImage debugImage = new DebugImage();
        debugImage.setCodeId(str);
        debugImage.setCodeFile((String) this.write);
        String strWrite = asComposePath.write(str);
        if (strWrite != null) {
            str = strWrite;
        }
        debugImage.setDebugId(str);
        debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
        debugImage.setImageSize(this.RemoteActionCompatParcelizer - j);
        debugImage.setType("elf");
        return debugImage;
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return ((SizeNode) this.write).serializer(read(j), transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, RemoteActionCompatParcelizer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures4, transformGestureDetectorKtdetectTransformGestures3));
    }

    public TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        long j2 = this.RemoteActionCompatParcelizer;
        long j3 = this.read;
        return j + j2 > j3 ? ((SizeNode) this.write).read(j3 - j2, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures4, transformGestureDetectorKtdetectTransformGestures3) : transformGestureDetectorKtdetectTransformGestures3;
    }

    public long read(long j) {
        long j2 = j + this.RemoteActionCompatParcelizer;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.read;
        long j4 = j2 / j3;
        return (((BoxMeasurePolicy) this.serializer) == BoxMeasurePolicy.Restart || j4 % 2 == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    public getContentCardsSwipeLayout() {
    }
}
