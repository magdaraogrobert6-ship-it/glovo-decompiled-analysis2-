package com.sentiance.protobuf;

import java.io.IOException;
import o.getCardCount;

/* JADX INFO: loaded from: classes4.dex */
public enum WireFormat$Utf8Validation {
    LOOSE { // from class: com.sentiance.protobuf.WireFormat$Utf8Validation.1
        @Override // com.sentiance.protobuf.WireFormat$Utf8Validation
        public Object readString(u uVar) throws IOException {
            return uVar.RemoteActionCompatParcelizer();
        }
    },
    STRICT { // from class: com.sentiance.protobuf.WireFormat$Utf8Validation.2
        @Override // com.sentiance.protobuf.WireFormat$Utf8Validation
        public Object readString(u uVar) throws IOException {
            return uVar.write();
        }
    },
    LAZY { // from class: com.sentiance.protobuf.WireFormat$Utf8Validation.3
        @Override // com.sentiance.protobuf.WireFormat$Utf8Validation
        public Object readString(u uVar) throws IOException {
            return uVar.MediaSessionCompatToken();
        }
    };

    public abstract Object readString(u uVar) throws IOException;

    /* synthetic */ WireFormat$Utf8Validation(getCardCount getcardcount) {
        this();
    }
}
