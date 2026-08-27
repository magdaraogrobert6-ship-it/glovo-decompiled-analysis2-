package o;

import android.os.Looper;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.oss.licenses.zzm;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class getNativeAntiAlias extends NativePaintannotations {
    public final accessisRenderNodeCompatiblecp IconCompatParcelizer;
    public final getNativeColor RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer(String str, PrintWriter printWriter) {
        getNativeColor getnativecolor = this.RemoteActionCompatParcelizer;
        if (getnativecolor.write.write() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < getnativecolor.write.write(); i++) {
                getNativeStrokeJoin getnativestrokejoin = (getNativeStrokeJoin) getnativecolor.write.read(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(getnativecolor.write.IconCompatParcelizer(i));
                printWriter.print(": ");
                printWriter.println(getnativestrokejoin.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(getnativestrokejoin.RemoteActionCompatParcelizer);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(getnativestrokejoin.serializer);
                zzm zzmVar = getnativestrokejoin.serializer;
                String strConcat = str2.concat("  ");
                zzmVar.getClass();
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(zzmVar.MediaSessionCompatQueueItem);
                printWriter.print(" mListener=");
                printWriter.println(zzmVar.MediaBrowserCompatMediaItem);
                if (zzmVar.MediaDescriptionCompat || zzmVar.write) {
                    printWriter.print(strConcat);
                    printWriter.print("mStarted=");
                    printWriter.print(zzmVar.MediaDescriptionCompat);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(zzmVar.write);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (zzmVar.IconCompatParcelizer || zzmVar.MediaMetadataCompat) {
                    printWriter.print(strConcat);
                    printWriter.print("mAbandoned=");
                    printWriter.print(zzmVar.IconCompatParcelizer);
                    printWriter.print(" mReset=");
                    printWriter.println(zzmVar.MediaMetadataCompat);
                }
                if (zzmVar.PlaybackStateCompat != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mTask=");
                    printWriter.print(zzmVar.PlaybackStateCompat);
                    printWriter.print(" waiting=");
                    zzmVar.PlaybackStateCompat.getClass();
                    printWriter.println(false);
                }
                if (zzmVar.serializer != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(zzmVar.serializer);
                    printWriter.print(" waiting=");
                    zzmVar.serializer.getClass();
                    printWriter.println(false);
                }
                if (getnativestrokejoin.write != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(getnativestrokejoin.write);
                    getNativePaint getnativepaint = getnativestrokejoin.write;
                    String strConcat2 = str2.concat("  ");
                    getnativepaint.getClass();
                    printWriter.print(strConcat2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(getnativepaint.RemoteActionCompatParcelizer);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                zzm zzmVar2 = getnativestrokejoin.serializer;
                Object objIconCompatParcelizer = getnativestrokejoin.IconCompatParcelizer();
                zzmVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (objIconCompatParcelizer == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = objIconCompatParcelizer.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(getnativestrokejoin.MediaDescriptionCompat > 0);
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        accessprocessDragStart accessprocessdragstart = this.RemoteActionCompatParcelizer.write;
        int iWrite = accessprocessdragstart.write();
        for (int i = 0; i < iWrite; i++) {
            ((getNativeStrokeJoin) accessprocessdragstart.read(i)).serializer();
        }
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
    @Override // o.NativePaintannotations
    public final zzm serializer(int i, getNativeAlpha getnativealpha) {
        getNativeColor getnativecolor = this.RemoteActionCompatParcelizer;
        boolean z = getnativecolor.IconCompatParcelizer;
        accessprocessDragStart accessprocessdragstart = getnativecolor.write;
        if (z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("initLoader must be called on the main thread");
            return null;
        }
        accessprocessdragstart.getClass();
        getNativeStrokeJoin getnativestrokejoin = (getNativeStrokeJoin) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.IconCompatParcelizer;
        if (getnativestrokejoin != null) {
            zzm zzmVar = getnativestrokejoin.serializer;
            getNativePaint getnativepaint = new getNativePaint(zzmVar, getnativealpha);
            getnativestrokejoin.serializer(accessisrendernodecompatiblecp, getnativepaint);
            getNativePaint getnativepaint2 = getnativestrokejoin.write;
            if (getnativepaint2 != null) {
                getnativestrokejoin.RemoteActionCompatParcelizer((unregisterComponentCallback) getnativepaint2);
            }
            getnativestrokejoin.IconCompatParcelizer = accessisrendernodecompatiblecp;
            getnativestrokejoin.write = getnativepaint;
            return zzmVar;
        }
        try {
            getnativecolor.IconCompatParcelizer = true;
            zzm zzmVarRemoteActionCompatParcelizer = getnativealpha.RemoteActionCompatParcelizer();
            if (zzmVarRemoteActionCompatParcelizer.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(zzmVarRemoteActionCompatParcelizer.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + zzmVarRemoteActionCompatParcelizer);
            }
            getNativeStrokeJoin getnativestrokejoin2 = new getNativeStrokeJoin(i, zzmVarRemoteActionCompatParcelizer);
            accessprocessdragstart.RemoteActionCompatParcelizer(i, getnativestrokejoin2);
            getnativecolor.IconCompatParcelizer = false;
            zzm zzmVar2 = getnativestrokejoin2.serializer;
            getNativePaint getnativepaint3 = new getNativePaint(zzmVar2, getnativealpha);
            getnativestrokejoin2.serializer(accessisrendernodecompatiblecp, getnativepaint3);
            getNativePaint getnativepaint4 = getnativestrokejoin2.write;
            if (getnativepaint4 != null) {
                getnativestrokejoin2.RemoteActionCompatParcelizer((unregisterComponentCallback) getnativepaint4);
            }
            getnativestrokejoin2.IconCompatParcelizer = accessisrendernodecompatiblecp;
            getnativestrokejoin2.write = getnativepaint3;
            return zzmVar2;
        } catch (Throwable th) {
            getnativecolor.IconCompatParcelizer = false;
            throw th;
        }
    }

    public getNativeAntiAlias(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getFilterQualityfv9h1I getfilterqualityfv9h1i) {
        this.IconCompatParcelizer = accessisrendernodecompatiblecp;
        getfilterqualityfv9h1i.getClass();
        setPathEffect setpatheffect = setPathEffect.IconCompatParcelizer;
        setpatheffect.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(getfilterqualityfv9h1i, getNativeColor.read, setpatheffect);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getNativeColor.class);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            this.RemoteActionCompatParcelizer = (getNativeColor) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.IconCompatParcelizer.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
