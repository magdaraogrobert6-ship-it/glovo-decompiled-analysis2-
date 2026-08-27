package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
import o.evaluateFeaturesfwf_client_releasedefault;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.updateFeatures;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new evaluateFeaturesfwf_client_releasedefault(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new updateFeatures(new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(28, parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new evaluateFeaturesfwf_client_releasedefault(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new evaluateFeaturesfwf_client_releasedefault(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(File file) {
        return new updateFeatures(new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(27, file));
    }
}
