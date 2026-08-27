package o;

import android.graphics.BlurMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getPivotFractionYimpl implements TransformOriginCompanion, encodeColorList {
    public final ExtendedSrgblambda0 IconCompatParcelizer;
    public final android.graphics.Path MediaBrowserCompatMediaItem;
    public final getTransformui_graphics MediaDescriptionCompat;
    public final accessgetMirrorcp MediaMetadataCompat;
    public final copyzey9I6wdefault MediaSessionCompatQueueItem;
    public final ArrayList RatingCompat;
    public final getTransformui_graphics RemoteActionCompatParcelizer;
    public float read;
    public final getTransformui_graphics serializer;
    public final boolean write;

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) list2.get(i);
            if (getpackedvalueannotations instanceof transformQ8lPUPs) {
                this.RatingCompat.add((transformQ8lPUPs) getpackedvalueannotations);
            }
        }
    }

    @Override // o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Path path = this.MediaBrowserCompatMediaItem;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.RatingCompat;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            path.addPath(((transformQ8lPUPs) arrayList.get(i)).write(), matrix);
            i++;
        }
    }

    @Override // o.encodeColorList
    public final void serializer() {
        this.MediaMetadataCompat.invalidateSelf();
    }

    public getPivotFractionYimpl(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, r8lambdaAuDvHD5rvRWLz7Jo_0pkShsZRJs r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs) {
        android.graphics.Path path = new android.graphics.Path();
        this.MediaBrowserCompatMediaItem = path;
        this.MediaSessionCompatQueueItem = new copyzey9I6wdefault(1, 0);
        this.RatingCompat = new ArrayList();
        this.IconCompatParcelizer = extendedSrgblambda0;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs.write;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2 = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs.RemoteActionCompatParcelizer;
        this.write = r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs.read;
        this.MediaMetadataCompat = accessgetmirrorcp;
        if (extendedSrgblambda0.write() != null) {
            getTransformui_graphics gettransformui_graphicsWrite = ((toXyz) extendedSrgblambda0.write().read).write();
            this.RemoteActionCompatParcelizer = gettransformui_graphicsWrite;
            gettransformui_graphicsWrite.write(this);
            extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        }
        if (xyzatocolorjlnilsgui_graphics2 == null) {
            this.serializer = null;
            this.MediaDescriptionCompat = null;
            return;
        }
        path.setFillType(r8lambdaaudvhd5rvrwlz7jo_0pkshszrjs.serializer);
        getColors getcolorsWrite = xyzatocolorjlnilsgui_graphics2.write();
        this.serializer = (getTransformui_graphics) getcolorsWrite;
        getcolorsWrite.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        getColors getcolorsWrite2 = xyzatocolorjlnilsgui_graphics.write();
        this.MediaDescriptionCompat = (getTransformui_graphics) getcolorsWrite2;
        getcolorsWrite2.write(this);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite2);
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
    @Override // o.TransformOriginCompanion
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        MaskFilter maskFilter;
        if (this.write) {
            return;
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        getTransformui_graphics gettransformui_graphics = this.serializer;
        gettransformui_graphics.getClass();
        int i2 = gettransformui_graphics.read(gettransformui_graphics.read.MediaDescriptionCompat(), gettransformui_graphics.serializer());
        float fIntValue = ((Integer) this.MediaDescriptionCompat.IconCompatParcelizer()).intValue() / 100.0f;
        int iWrite = getD50.write((int) (i * fIntValue));
        copyzey9I6wdefault copyzey9i6wdefault = this.MediaSessionCompatQueueItem;
        copyzey9i6wdefault.setColor((iWrite << 24) | (i2 & 16777215));
        getTransformui_graphics gettransformui_graphics2 = this.RemoteActionCompatParcelizer;
        if (gettransformui_graphics2 != null) {
            float fFloatValue = ((Float) gettransformui_graphics2.IconCompatParcelizer()).floatValue();
            if (fFloatValue == 0.0f) {
                copyzey9i6wdefault.setMaskFilter(null);
            } else if (fFloatValue != this.read) {
                ExtendedSrgblambda0 extendedSrgblambda0 = this.IconCompatParcelizer;
                if (extendedSrgblambda0.serializer == fFloatValue) {
                    maskFilter = extendedSrgblambda0.RemoteActionCompatParcelizer;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    extendedSrgblambda0.RemoteActionCompatParcelizer = blurMaskFilter;
                    extendedSrgblambda0.serializer = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                copyzey9i6wdefault.setMaskFilter(maskFilter);
            }
            this.read = fFloatValue;
        }
        if (geta != null) {
            geta.RemoteActionCompatParcelizer((int) (fIntValue * 255.0f), copyzey9i6wdefault);
        } else {
            copyzey9i6wdefault.clearShadowLayer();
        }
        android.graphics.Path path = this.MediaBrowserCompatMediaItem;
        path.reset();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.RatingCompat;
            if (i3 >= arrayList.size()) {
                canvas.drawPath(path, copyzey9i6wdefault);
                getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                return;
            } else {
                path.addPath(((transformQ8lPUPs) arrayList.get(i3)).write(), matrix);
                i3++;
            }
        }
    }
}
