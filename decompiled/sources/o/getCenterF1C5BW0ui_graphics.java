package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getCenterF1C5BW0ui_graphics {
    public final toAndroidRect RemoteActionCompatParcelizer;
    public final CSSParseException read;
    public final long serializer;

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
    public final void serializer(accessgetPointscp accessgetpointscp, accessrewindjd accessrewindjdVar, Map map, long j) {
        toAndroidRect toandroidrect = this.RemoteActionCompatParcelizer;
        long j2 = toandroidrect.IconCompatParcelizer;
        LinkedHashMap linkedHashMap = (LinkedHashMap) toandroidrect.serializer;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(accessgetpointscp);
            if (objRemove != null) {
                toandroidrect.write = toandroidrect.RemoteActionCompatParcelizer() - toandroidrect.serializer(accessgetpointscp, objRemove);
                toandroidrect.IconCompatParcelizer(accessgetpointscp, objRemove, null);
            }
            this.read.write(accessgetpointscp, accessrewindjdVar, map, j);
            return;
        }
        RectHelper_androidKt rectHelper_androidKt = new RectHelper_androidKt(accessrewindjdVar, map, j);
        Object objPut = linkedHashMap.put(accessgetpointscp, rectHelper_androidKt);
        toandroidrect.write = toandroidrect.serializer(accessgetpointscp, rectHelper_androidKt) + toandroidrect.RemoteActionCompatParcelizer();
        if (objPut != null) {
            toandroidrect.write = toandroidrect.RemoteActionCompatParcelizer() - toandroidrect.serializer(accessgetpointscp, objPut);
            toandroidrect.IconCompatParcelizer(accessgetpointscp, objPut, rectHelper_androidKt);
        }
        toandroidrect.write(toandroidrect.IconCompatParcelizer);
    }

    public getCenterF1C5BW0ui_graphics(long j, CSSParseException cSSParseException) {
        this.serializer = j;
        this.read = cSSParseException;
        this.RemoteActionCompatParcelizer = new toAndroidRect(this, j);
    }
}
