package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.ensureSubscribedToInAppMessageEvents;
import o.getActiveFocusTargetNode;
import o.isItemDismissable;

/* JADX INFO: loaded from: classes5.dex */
public final class PlatformStreamFactoryKt {
    public static final SizedReadStream asReadStream(InputStream inputStream) {
        inputStream.getClass();
        return new SizedReadStream(inputStream) { // from class: com.mapbox.common.PlatformStreamFactoryKt.asReadStream.1
            final /* synthetic */ InputStream $stream;
            private boolean exhausted;
            private long processed;
            private Long size;

            @Override // com.mapbox.common.SizedReadStream
            public Long getTotalSize() {
                return this.size;
            }

            @Override // com.mapbox.common.ReadStream
            public boolean isExhausted() {
                return this.exhausted;
            }

            @Override // com.mapbox.common.ReadStream
            public boolean isReadable() {
                return true;
            }

            @Override // com.mapbox.common.ReadStream
            public long readBytes() {
                return this.processed;
            }

            {
                Object isitemdismissable;
                this.$stream = inputStream;
                try {
                    isitemdismissable = Long.valueOf(inputStream.available());
                } catch (Throwable th) {
                    isitemdismissable = new isItemDismissable(th);
                }
                Long l = null;
                Long l2 = (Long) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
                if (l2 != null && l2.longValue() > 0) {
                    l = l2;
                }
                this.size = l;
            }

            @Override // com.mapbox.common.ReadStream
            public Expected<String, Long> read(Buffer buffer) {
                buffer.getClass();
                try {
                    ByteBuffer buffer2 = buffer.getData().getBuffer();
                    buffer2.getClass();
                    long j = 0;
                    while (j < buffer2.capacity()) {
                        int i = this.$stream.read();
                        if (i == -1) {
                            this.exhausted = true;
                            break;
                        }
                        buffer2.put((byte) i);
                        j++;
                    }
                    this.processed += j;
                    Expected<String, Long> expectedCreateValue = ExpectedFactory.createValue(Long.valueOf(j));
                    expectedCreateValue.getClass();
                    return expectedCreateValue;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown stream error";
                    }
                    Expected<String, Long> expectedCreateError = ExpectedFactory.createError(message);
                    expectedCreateError.getClass();
                    return expectedCreateError;
                }
            }
        };
    }

    public static final SizedReadStream fileReadStream(String str) {
        str.getClass();
        File file = new File(str);
        return asReadStream(getActiveFocusTargetNode.write(file, new FileInputStream(file)));
    }

    public static final SizedReadStream memoryReadStream(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        return asReadStream(new ByteArrayInputStream(bytes));
    }
}
