package o;

import android.annotation.SuppressLint;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class getTriggerId {
    private final List<String> RemoteActionCompatParcelizer;
    private final List<String> read;
    private final List<String> serializer;
    private final String write;

    public final List<String> IconCompatParcelizer() {
        return this.serializer;
    }

    public static final class RemoteActionCompatParcelizer {
        private String read = null;
        private List<String> write = new ArrayList();
        private List<String> IconCompatParcelizer = new ArrayList();
        private List<String> serializer = new ArrayList();

        public final void IconCompatParcelizer(List list) {
            this.serializer = list;
        }

        public final void write(List list) {
            this.IconCompatParcelizer = list;
        }

        @SuppressLint
        public final getTriggerId read() {
            if (this.read == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Table has no name. Make sure abstract method Table.getName() is implemented.");
                return null;
            }
            if (!this.write.isEmpty()) {
                return new getTriggerId(this);
            }
            java.util.Locale locale = java.util.Locale.US;
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(ff$$ExternalSyntheticOutline0.m("Table (", this.read, ") has no columns"));
            return null;
        }

        public final void serializer(String str) {
            this.read = str;
        }

        public final void serializer(List list) {
            this.write = list;
        }
    }

    public getTriggerId(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.write = remoteActionCompatParcelizer.read;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer.write;
        this.read = remoteActionCompatParcelizer.IconCompatParcelizer;
        this.serializer = remoteActionCompatParcelizer.serializer;
    }

    public final String RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder("create table ");
        sb.append(this.write);
        sb.append(" (");
        sb.append(r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ", "));
        List<String> list = this.read;
        if (!list.isEmpty()) {
            sb.append(",");
            sb.append(r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(list, ", "));
        }
        sb.append(");");
        return sb.toString();
    }
}
