package com.sentiance.protobuf;

import java.io.IOException;
import o.accessgetDiskCacheLockp;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private accessgetDiskCacheLockp unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public final void MediaSessionCompatQueueItem() {
        this.wasThrownFromInputStream = true;
    }

    public final void write(GeneratedMessageLite generatedMessageLite) {
        this.unfinishedMessage = generatedMessageLite;
    }

    public final boolean MediaMetadataCompat() {
        return this.wasThrownFromInputStream;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public static InvalidWireTypeException IconCompatParcelizer() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static InvalidProtocolBufferException MediaBrowserCompatMediaItem() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static InvalidProtocolBufferException RatingCompat() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException RemoteActionCompatParcelizer() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException read() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public static InvalidProtocolBufferException serializer() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException write() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }
}
