package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.huawei.location.Vw$E5;
import com.huawei.location.router.dispatch.IDispatchExceptionListener;
import com.huawei.riemann.common.api.location.CityTileCallback;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnViewCreatedCallback extends Handler {
    public final /* synthetic */ getViewRoot RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public getOnViewCreatedCallback(getViewRoot getviewroot) {
        this.write = 1;
        this.RemoteActionCompatParcelizer = getviewroot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getOnViewCreatedCallback(getViewRoot getviewroot, Looper looper, int i) {
        super(looper);
        this.write = i;
        this.RemoteActionCompatParcelizer = getviewroot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        int i = this.write;
        getViewRoot getviewroot = this.RemoteActionCompatParcelizer;
        String str2 = "handleMessage";
        String str3 = null;
        ?? r5 = 0;
        if (i != 0) {
            try {
                super.handleMessage(message);
                int i2 = message.what;
                if (i2 == 10001) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = IDispatchExceptionListener.API_TASK_EMPTY;
                    messageObtain.setData(message.getData());
                    getviewroot.serializer.sendMessageAtFrontOfQueue(messageObtain);
                    return;
                }
                if (i2 != 10002) {
                    return;
                }
                try {
                    Bundle data = message.getData();
                    if (data == null) {
                        Log.e("SdmLocationManager", "bundle is null");
                        return;
                    }
                    Iterator it = getviewroot.write.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                } catch (ClassCastException e) {
                    e = e;
                    str3 = "handleMessage INVOKE CALLBACK";
                }
            } catch (ClassCastException e2) {
                e = e2;
            }
            Log.e("SdmLocationManager", e.getMessage() != null ? e.getMessage() : "ClassCastException1");
            String str4 = str2;
            if (str3 != null) {
                str4 = str3;
            }
            Log.e("SdmLocationManager", "SdmResultHandler-".concat(str4));
            return;
        }
        try {
            super.handleMessage(message);
            int i3 = message.what;
            r5 = 11;
            if (i3 != 11) {
                r5 = 12;
                if (i3 != 12) {
                    r5 = 17;
                    if (i3 != 17) {
                        r5 = 18;
                        if (i3 == 18) {
                            String str5 = "handleMessage REQUEST REMOTE TILE";
                            Bundle data2 = message.getData();
                            if (data2 == null) {
                                Log.e("SdmLocationManager", "bundle is null");
                                r5 = str5;
                            } else {
                                long j = data2.getLong("tileId");
                                CityTileCallback cityTileCallback = getviewroot.RatingCompat;
                                if (cityTileCallback != null) {
                                    byte[] bArr = cityTileCallback.get(j);
                                    getOnViewCreatedCallback getonviewcreatedcallback = getviewroot.serializer;
                                    if (getonviewcreatedcallback != null) {
                                        getonviewcreatedcallback.postAtFrontOfQueue(new Vw$E5(getviewroot, j, bArr));
                                        r5 = str5;
                                    } else {
                                        str = "result hd is null";
                                    }
                                } else {
                                    str = "rcb null";
                                }
                                Log.e("SdmLocationManager", str);
                                r5 = str5;
                            }
                        }
                    }
                }
            }
        } catch (ClassCastException e3) {
            Log.e("SdmLocationManager", e3.getMessage() != null ? e3.getMessage() : "ClassCastException2");
            ?? r4 = str2;
            if (r5 != 0) {
                r4 = r5;
            }
            Log.e("SdmLocationManager", "SdmOpsHandler-".concat(r4));
        }
    }
}
