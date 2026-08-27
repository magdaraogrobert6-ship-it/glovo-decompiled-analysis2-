package o;

import com.google.protobuf.CodedInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public enum onShowPress {
    LOOSE { // from class: o.onShowPress.5
        @Override // o.onShowPress
        public Object readString(CodedInputStream codedInputStream) throws IOException {
            return codedInputStream.ComponentActivity();
        }
    },
    STRICT { // from class: o.onShowPress.4
        @Override // o.onShowPress
        public Object readString(CodedInputStream codedInputStream) throws IOException {
            return codedInputStream.ResultReceiver();
        }
    },
    LAZY { // from class: o.onShowPress.3
        @Override // o.onShowPress
        public Object readString(CodedInputStream codedInputStream) throws IOException {
            return codedInputStream.MediaBrowserCompatMediaItem();
        }
    };

    public abstract Object readString(CodedInputStream codedInputStream) throws IOException;

    /* synthetic */ onShowPress(IndirectPointerNavigationGestureDetectorgestureDetector1 indirectPointerNavigationGestureDetectorgestureDetector1) {
        this();
    }
}
