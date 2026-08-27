package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewgetFocusedRect1 {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;

    public final int hashCode() {
        return Boolean.hashCode(this.serializer) + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.read.hashCode() * 31, 31), 31);
    }

    public AndroidComposeViewgetFocusedRect1(String str, boolean z, int i, int i2) {
        this.read = str;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidComposeViewgetFocusedRect1)) {
            return false;
        }
        AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect1 = (AndroidComposeViewgetFocusedRect1) obj;
        return this.read.equals(androidComposeViewgetFocusedRect1.read) && this.IconCompatParcelizer == androidComposeViewgetFocusedRect1.IconCompatParcelizer && this.RemoteActionCompatParcelizer == androidComposeViewgetFocusedRect1.RemoteActionCompatParcelizer && this.serializer == androidComposeViewgetFocusedRect1.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.read);
        sb.append(", pid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", importance=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isDefaultProcess=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, ')');
    }
}
