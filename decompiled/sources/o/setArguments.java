package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setArguments {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String RemoteActionCompatParcelizer;
    public final setAnimations read;
    public final long serializer;
    public final setEnterTransition write;

    public setArguments(setAnimations setanimations, String str, setEnterTransition setentertransition, long j) {
        setentertransition.getClass();
        this.read = setanimations;
        this.RemoteActionCompatParcelizer = str;
        this.write = setentertransition;
        this.serializer = j;
    }

    public /* synthetic */ setArguments(setAllowReturnTransitionOverlap setallowreturntransitionoverlap, setEnterTransition setentertransition) {
        this(setallowreturntransitionoverlap, "defaultExtraLargeBubbleContentKey", setentertransition, 6000L);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int iHashCode = Long.hashCode(this.serializer) + ((this.write.hashCode() + iM) * 31);
        int i4 = MediaSessionCompatQueueItem + 25;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setArguments)) {
            return false;
        }
        setArguments setarguments = (setArguments) obj;
        Object[] objArr = {this.read, setarguments.read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.RemoteActionCompatParcelizer, setarguments.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.write != setarguments.write) {
                return false;
            }
            if (this.serializer == setarguments.serializer) {
                return true;
            }
            int i2 = IconCompatParcelizer + 101;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaSessionCompatQueueItem + 123;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ExpandedBubbleConfiguration(item=" + this.read + ", contentKey=" + this.RemoteActionCompatParcelizer + ", size=" + this.write + ", durationMilliseconds=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 89;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
