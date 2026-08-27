package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hsvToRgbComponent {
    public final List IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final List read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        return this.read.hashCode() + c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write), 31);
    }

    public hsvToRgbComponent(String str, String str2, List list, String str3, List list2) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.IconCompatParcelizer = list;
        this.read = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsvToRgbComponent)) {
            return false;
        }
        hsvToRgbComponent hsvtorgbcomponent = (hsvToRgbComponent) obj;
        Object[] objArr = {this.serializer, hsvtorgbcomponent.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, hsvtorgbcomponent.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.write, hsvtorgbcomponent.write};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer.equals(hsvtorgbcomponent.IconCompatParcelizer)) {
            return this.read.equals(hsvtorgbcomponent.read);
        }
        return false;
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.serializer(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n            |ForeignKey {\n            |   referenceTable = '" + this.serializer + "',\n            |   onDelete = '" + this.RemoteActionCompatParcelizer + "',\n            |   onUpdate = '" + this.write + "',\n            |   columnNames = {" + hsvJlNiLsgdefault.read(onContentCardDismissed.PlaybackStateCompatCustomAction(this.IconCompatParcelizer)) + "\n            |   referenceColumnNames = {" + hsvJlNiLsgdefault.RemoteActionCompatParcelizer(onContentCardDismissed.PlaybackStateCompatCustomAction(this.read)) + "\n            |}\n        "));
    }
}
