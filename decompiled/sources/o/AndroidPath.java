package o;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@calculateSize(RemoteActionCompatParcelizer = "activity")
public class AndroidPath extends toAndroidPathDashPathEffectStyleoQv6xUo {
    public final Context IconCompatParcelizer;
    public final Activity serializer;

    /* JADX WARN: Code duplicated, block: B:47:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c8, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r5.getResourceTypeName(r1), "animator"}, o.getCieXyz.write())).booleanValue() != false) goto L62;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x012f, please report this as an issue */
    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.opN5in7k0 serializer(o.opN5in7k0 r22, android.os.Bundle r23, o.transform58bKbWc r24) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidPath.serializer(o.opN5in7k0, android.os.Bundle, o.transform58bKbWc):o.opN5in7k0");
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final opN5in7k0 write() {
        return new setNativeStrokeWidth(this);
    }

    public AndroidPath(Context context) {
        context.getClass();
        this.IconCompatParcelizer = context;
        for (Object obj : resetAfterInAppMessageCloselambda2.write(context, new accessgetBlendMode0nO6VwUjd(12))) {
            if (((Context) obj) instanceof Activity) {
                this.serializer = (Activity) obj;
            }
        }
        obj = null;
        this.serializer = (Activity) obj;
    }

    @Override // o.toAndroidPathDashPathEffectStyleoQv6xUo
    public final boolean IconCompatParcelizer() {
        Activity activity = this.serializer;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
