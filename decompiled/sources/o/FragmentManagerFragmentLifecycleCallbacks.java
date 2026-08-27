package o;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentManagerFragmentLifecycleCallbacks {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final SetRetainInstanceUsageViolation IconCompatParcelizer;
    public final boolean read;
    public final SetUserVisibleHintViolation serializer;
    public final getFragment write;

    public FragmentManagerFragmentLifecycleCallbacks(SetRetainInstanceUsageViolation setRetainInstanceUsageViolation, SetUserVisibleHintViolation setUserVisibleHintViolation, getFragment getfragment, boolean z) {
        setRetainInstanceUsageViolation.getClass();
        setUserVisibleHintViolation.getClass();
        getfragment.getClass();
        this.IconCompatParcelizer = setRetainInstanceUsageViolation;
        this.serializer = setUserVisibleHintViolation;
        this.write = getfragment;
        this.read = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = Boolean.hashCode(this.read) + ((this.write.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = MediaDescriptionCompat + 39;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentManagerFragmentLifecycleCallbacks)) {
            return false;
        }
        FragmentManagerFragmentLifecycleCallbacks fragmentManagerFragmentLifecycleCallbacks = (FragmentManagerFragmentLifecycleCallbacks) obj;
        if (this.IconCompatParcelizer == fragmentManagerFragmentLifecycleCallbacks.IconCompatParcelizer) {
            if (this.serializer != fragmentManagerFragmentLifecycleCallbacks.serializer) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, fragmentManagerFragmentLifecycleCallbacks.write}, getCieXyz.write())).booleanValue() && this.read == fragmentManagerFragmentLifecycleCallbacks.read;
        }
        int i5 = i2 + 101;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FloatingLayerItem(verticalAlignment=" + this.IconCompatParcelizer + ", horizontalAlignment=" + this.serializer + ", uiModel=" + this.write + ", extendToEdges=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 111;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
