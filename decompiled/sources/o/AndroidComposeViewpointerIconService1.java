package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.firebase.sessions.SessionDetails$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidComposeViewrequestFocusCurrent1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class AndroidComposeViewpointerIconService1 {
    public static final SessionDetails$Companion Companion = new Object() { // from class: com.google.firebase.sessions.SessionDetails$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return AndroidComposeViewrequestFocusCurrent1.read;
        }
    };
    public final String firstSessionId;
    public final String sessionId;
    public final int sessionIndex;
    public final long sessionStartTimestampUs;

    public final int hashCode() {
        return Long.hashCode(this.sessionStartTimestampUs) + af$$ExternalSyntheticOutline0.m(this.sessionIndex, af$$ExternalSyntheticOutline0.m(this.sessionId.hashCode() * 31, 31, this.firstSessionId), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidComposeViewpointerIconService1)) {
            return false;
        }
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1 = (AndroidComposeViewpointerIconService1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, androidComposeViewpointerIconService1.sessionId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.firstSessionId, androidComposeViewpointerIconService1.firstSessionId}, getCieXyz.write())).booleanValue() && this.sessionIndex == androidComposeViewpointerIconService1.sessionIndex && this.sessionStartTimestampUs == androidComposeViewpointerIconService1.sessionStartTimestampUs;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.sessionId);
        sb.append(", firstSessionId=");
        sb.append(this.firstSessionId);
        sb.append(", sessionIndex=");
        sb.append(this.sessionIndex);
        sb.append(", sessionStartTimestampUs=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.sessionStartTimestampUs, ')');
    }

    public /* synthetic */ AndroidComposeViewpointerIconService1(int i, String str, String str2, int i2, long j) {
        if (15 == (i & 15)) {
            this.sessionId = str;
            this.firstSessionId = str2;
            this.sessionIndex = i2;
            this.sessionStartTimestampUs = j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, AndroidComposeViewrequestFocusCurrent1.read.getDescriptor());
        throw null;
    }

    public AndroidComposeViewpointerIconService1(int i, long j, String str, String str2) {
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i;
        this.sessionStartTimestampUs = j;
    }
}
