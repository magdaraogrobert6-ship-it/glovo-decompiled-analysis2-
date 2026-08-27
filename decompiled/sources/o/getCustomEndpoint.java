package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomEndpoint extends getContextandroid_sdk_base_release {
    @Override // o.getContextandroid_sdk_base_release
    public final void write(getDeviceObjectAllowlist getdeviceobjectallowlist) {
        getdeviceobjectallowlist.write(ErrorCode.REFUSED_STREAM);
    }
}
