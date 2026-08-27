package o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class drawPathGBMwjPU implements drawImage9jGpkUE {
    public final /* synthetic */ int read;
    public final drawImage9jGpkUE serializer;

    public /* synthetic */ drawPathGBMwjPU(drawImage9jGpkUE drawimage9jgpkue, int i) {
        this.read = i;
        this.serializer = drawimage9jgpkue;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        Uri uriFromFile;
        int i3 = this.read;
        drawImage9jGpkUE drawimage9jgpkue = this.serializer;
        if (i3 != 0) {
            return drawimage9jgpkue.RemoteActionCompatParcelizer(new modulate5vOe2sY((URL) obj), i, i2, geteotffuncui_graphics);
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uriFromFile = null;
        } else if (str.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str));
        } else {
            Uri uri = Uri.parse(str);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
        }
        if (uriFromFile == null || !drawimage9jgpkue.write(uriFromFile)) {
            return null;
        }
        return drawimage9jgpkue.RemoteActionCompatParcelizer(uriFromFile, i, i2, geteotffuncui_graphics);
    }

    @Override // o.drawImage9jGpkUE
    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        if (this.read != 0) {
            return true;
        }
        return true;
    }
}
