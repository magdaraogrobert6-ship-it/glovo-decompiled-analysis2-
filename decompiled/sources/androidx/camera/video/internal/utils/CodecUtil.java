package androidx.camera.video.internal.utils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodecUtil {
    public static final LruCache serializer = new LruCache(10);

    public static MediaCodecInfo serializer(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = serializer;
        synchronized (lruCache) {
            mediaCodecInfo = (MediaCodecInfo) lruCache.get(str);
        }
        try {
            if (mediaCodecInfo != null) {
                return mediaCodecInfo;
            }
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                    synchronized (lruCache) {
                        lruCache.put(str, codecInfo);
                    }
                    mediaCodecCreateEncoderByType.release();
                    return codecInfo;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCodecCreateEncoderByType != null) {
                        mediaCodecCreateEncoderByType.release();
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e) {
                throw new InvalidConfigException(e);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
    }
}
