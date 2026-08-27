package o;

/* JADX INFO: loaded from: classes.dex */
public final class or {
    public static final or RemoteActionCompatParcelizer = new or();

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }

    public final boolean serializer(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if ((obj instanceof ShaderKt) && (obj2 instanceof ShaderKt)) {
            ShaderKt shaderKt = (ShaderKt) obj;
            ShaderKt shaderKt2 = (ShaderKt) obj2;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shaderKt.read, shaderKt2.read}, getCieXyz.write())).booleanValue() || !shaderKt.write.equals(shaderKt2.write)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shaderKt.PlaybackStateCompatCustomAction, shaderKt2.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue() || !shaderKt.PlaybackStateCompat.equals(shaderKt2.PlaybackStateCompat)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shaderKt.MediaBrowserCompatMediaItem, shaderKt2.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, shaderKt2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4}, getCieXyz.write())).booleanValue() && shaderKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == shaderKt2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && shaderKt.ComponentActivity == shaderKt2.ComponentActivity;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, obj2}, getCieXyz.write())).booleanValue();
    }

    public final int IconCompatParcelizer(Object obj) {
        if (!(obj instanceof ShaderKt)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        ShaderKt shaderKt = (ShaderKt) obj;
        int iHashCode = shaderKt.read.hashCode();
        int iHashCode2 = shaderKt.write.hashCode();
        String str = shaderKt.PlaybackStateCompatCustomAction;
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer((((iHashCode2 + (iHashCode * 31)) * 31) + (str != null ? str.hashCode() : 0)) * 31, shaderKt.PlaybackStateCompat, 31);
        String str2 = shaderKt.MediaBrowserCompatMediaItem;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        return shaderKt.ComponentActivity.hashCode() + ((shaderKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.hashCode() + ((shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.hashCode() + ((iRemoteActionCompatParcelizer + iHashCode3) * 31)) * 31)) * 31);
    }
}
