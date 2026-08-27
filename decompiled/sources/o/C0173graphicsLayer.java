package o;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: o.graphicsLayer, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173graphicsLayer implements getCameraDistance {
    public static volatile C0173graphicsLayer RemoteActionCompatParcelizer;
    public static final ReentrantLock serializer = new ReentrantLock();
    public final CopyOnWriteArrayList read = new CopyOnWriteArrayList();
    public final getScaleX write;

    @Override // o.getCameraDistance
    public final void read(snapTo snapto) {
        synchronized (serializer) {
            if (this.write == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.read.iterator();
            it.getClass();
            while (it.hasNext()) {
                graphicsLayer2Xn7asIdefault graphicslayer2xn7asidefault = (graphicsLayer2Xn7asIdefault) it.next();
                if (graphicslayer2xn7asidefault.write == snapto) {
                    arrayList.add(graphicslayer2xn7asidefault);
                }
            }
            this.read.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = ((graphicsLayer2Xn7asIdefault) it2.next()).serializer;
                CopyOnWriteArrayList copyOnWriteArrayList = this.read;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((graphicsLayer2Xn7asIdefault) it3.next()).serializer.equals(activity)) {
                            }
                        }
                    }
                }
                getScaleX getscalex = this.write;
                if (getscalex != null) {
                    ((accessgetReusableGraphicsLayerScopep) getscalex).IconCompatParcelizer(activity);
                }
            }
        }
    }

    public C0173graphicsLayer(accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep) {
        this.write = accessgetreusablegraphicslayerscopep;
        if (accessgetreusablegraphicslayerscopep != null) {
            accessgetreusablegraphicslayerscopep.write(new getExponentimpl(7, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x009f A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #0 {all -> 0x00aa, blocks: (B:9:0x0015, B:11:0x0019, B:16:0x0029, B:26:0x004b, B:28:0x0055, B:30:0x005d, B:32:0x0063, B:34:0x0067, B:35:0x006b, B:36:0x007c, B:37:0x0080, B:39:0x0086, B:43:0x0097, B:45:0x009b, B:47:0x009f, B:19:0x0030, B:20:0x0034, B:22:0x003a), top: B:55:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0096 A[SYNTHETIC] */
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
    @Override // o.getCameraDistance
    public final void registerLayoutChangeCallback(Context context, setSupportButtonTintList setsupportbuttontintlist, snapTo snapto) {
        boolean z;
        graphicsLayer2Xn7asIdefault graphicslayer2xn7asidefault;
        Iterator it;
        Object next;
        component160d7_KjU component160d7_kju;
        accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep;
        Window window;
        WindowManager.LayoutParams attributes;
        context.getClass();
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (activity == null) {
            snapto.accept(new component160d7_KjU(instance_delegatelambda0Var));
            return;
        }
        ReentrantLock reentrantLock = serializer;
        reentrantLock.lock();
        try {
            getScaleX getscalex = this.write;
            if (getscalex == null) {
                snapto.accept(new component160d7_KjU(instance_delegatelambda0Var));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.read;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((graphicsLayer2Xn7asIdefault) it2.next()).serializer.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                graphicslayer2xn7asidefault = new graphicsLayer2Xn7asIdefault(activity, setsupportbuttontintlist, snapto);
                copyOnWriteArrayList.add(graphicslayer2xn7asidefault);
                if (z) {
                    it = copyOnWriteArrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!activity.equals(((graphicsLayer2Xn7asIdefault) next).serializer));
                    graphicsLayer2Xn7asIdefault graphicslayer2xn7asidefault2 = (graphicsLayer2Xn7asIdefault) next;
                    component160d7_kju = graphicslayer2xn7asidefault2 != null ? graphicslayer2xn7asidefault2.RemoteActionCompatParcelizer : null;
                    if (component160d7_kju != null) {
                        graphicslayer2xn7asidefault.RemoteActionCompatParcelizer = component160d7_kju;
                        graphicslayer2xn7asidefault.write.accept(component160d7_kju);
                    }
                } else {
                    accessgetreusablegraphicslayerscopep = (accessgetReusableGraphicsLayerScopep) getscalex;
                    window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        accessgetreusablegraphicslayerscopep.RemoteActionCompatParcelizer(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new assignFocus3ESFkO8(accessgetreusablegraphicslayerscopep, activity));
                    }
                }
            }
            z = false;
            graphicslayer2xn7asidefault = new graphicsLayer2Xn7asIdefault(activity, setsupportbuttontintlist, snapto);
            copyOnWriteArrayList.add(graphicslayer2xn7asidefault);
            if (z) {
                accessgetreusablegraphicslayerscopep = (accessgetReusableGraphicsLayerScopep) getscalex;
                window = activity.getWindow();
                if (window != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    accessgetreusablegraphicslayerscopep.RemoteActionCompatParcelizer(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new assignFocus3ESFkO8(accessgetreusablegraphicslayerscopep, activity));
                }
            } else {
                it = copyOnWriteArrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!activity.equals(((graphicsLayer2Xn7asIdefault) next).serializer));
                graphicsLayer2Xn7asIdefault graphicslayer2xn7asidefault3 = (graphicsLayer2Xn7asIdefault) next;
                if (graphicslayer2xn7asidefault3 != null) {
                }
                if (component160d7_kju != null) {
                    graphicslayer2xn7asidefault.RemoteActionCompatParcelizer = component160d7_kju;
                    graphicslayer2xn7asidefault.write.accept(component160d7_kju);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
