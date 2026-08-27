package o;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class arcToRad {
    public static final /* synthetic */ AtomicReference IconCompatParcelizer = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final coil3.RealImageLoader serializer(Context context) {
        coil3.RealImageLoader realImageLoader;
        iteratordefault iteratordefaultVar;
        iteratordefault iteratordefaultVar2;
        iteratordefault iteratordefaultVar3;
        iteratordefault iteratordefaultVar4;
        AtomicReference atomicReference = IconCompatParcelizer;
        Object obj = atomicReference.get();
        coil3.RealImageLoader realImageLoader2 = obj instanceof coil3.RealImageLoader ? (coil3.RealImageLoader) obj : null;
        if (realImageLoader2 != null) {
            return realImageLoader2;
        }
        coil3.RealImageLoader realImageLoaderWrite = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof coil3.RealImageLoader) {
                realImageLoader = (coil3.RealImageLoader) obj2;
            } else {
                if (realImageLoaderWrite == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (obj2 instanceof iteratordefault) {
                        iteratordefaultVar4 = (iteratordefault) obj2;
                    } else {
                        iteratordefaultVar = null;
                    }
                    if (iteratordefaultVar != null) {
                        iteratordefaultVar = iteratordefaultVar4;
                        realImageLoaderWrite = iteratordefaultVar.write(applicationContext);
                    } else {
                        if (applicationContext instanceof iteratordefault) {
                            iteratordefaultVar3 = (iteratordefault) applicationContext;
                        } else {
                            iteratordefaultVar2 = null;
                        }
                        if (iteratordefaultVar2 != null) {
                            iteratordefaultVar = iteratordefaultVar4;
                            iteratordefaultVar = iteratordefaultVar4;
                            iteratordefaultVar2 = iteratordefaultVar3;
                            realImageLoaderWrite = iteratordefaultVar2.write(applicationContext);
                        } else {
                            iteratordefaultVar = iteratordefaultVar4;
                            iteratordefaultVar = iteratordefaultVar4;
                            iteratordefaultVar2 = iteratordefaultVar3;
                            realImageLoaderWrite = addRoundRectdefault.IconCompatParcelizer.write(applicationContext);
                        }
                    }
                }
                realImageLoader = realImageLoaderWrite;
            }
            while (!atomicReference.compareAndSet(obj2, realImageLoader)) {
                if (atomicReference.get() != obj2) {
                }
            }
            return realImageLoader;
        }
    }
}
