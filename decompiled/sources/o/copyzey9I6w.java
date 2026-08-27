package o;

import android.graphics.BlurMaskFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class copyzey9I6w implements encodeColorList, TransformOriginCompanion {
    public final float[] IconCompatParcelizer;
    public final accessgetMirrorcp MediaDescriptionCompat;
    public final ExtendedSrgblambda0 MediaMetadataCompat;
    public final getTransformui_graphics MediaSessionCompatQueueItem;
    public final getTransformui_graphics PlaybackStateCompat;
    public final copyzey9I6wdefault RatingCompat;
    public final getTransformui_graphics RemoteActionCompatParcelizer;
    public float read;
    public final getTransformui_graphics serializer;
    public final ArrayList write;
    public final android.graphics.PathMeasure MediaSessionCompatToken = new android.graphics.PathMeasure();
    public final android.graphics.Path MediaBrowserCompatMediaItem = new android.graphics.Path();
    public final android.graphics.Path PlaybackStateCompatCustomAction = new android.graphics.Path();
    public final RectF MediaSessionCompatResultReceiverWrapper = new RectF();
    public final ArrayList ParcelableVolumeInfo = new ArrayList();

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        getPivotFractionXimpl getpivotfractionximpl = null;
        encodePointList encodepointlist = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList2.get(size);
            if (getpackedvalueannotations instanceof encodePointList) {
                encodePointList encodepointlist2 = (encodePointList) getpackedvalueannotations;
                if (encodepointlist2.RatingCompat == Bt2020Pqlambda0.INDIVIDUALLY) {
                    encodepointlist = encodepointlist2;
                }
            }
        }
        if (encodepointlist != null) {
            encodepointlist.serializer(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.ParcelableVolumeInfo;
            if (size2 < 0) {
                break;
            }
            getPackedValueannotations getpackedvalueannotations2 = (getPackedValueannotations) list2.get(size2);
            if (getpackedvalueannotations2 instanceof encodePointList) {
                encodePointList encodepointlist3 = (encodePointList) getpackedvalueannotations2;
                if (encodepointlist3.RatingCompat == Bt2020Pqlambda0.INDIVIDUALLY) {
                    if (getpivotfractionximpl != null) {
                        arrayList.add(getpivotfractionximpl);
                    }
                    getPivotFractionXimpl getpivotfractionximpl2 = new getPivotFractionXimpl(encodepointlist3);
                    encodepointlist3.serializer(this);
                    getpivotfractionximpl = getpivotfractionximpl2;
                }
            }
            if (getpackedvalueannotations2 instanceof transformQ8lPUPs) {
                if (getpivotfractionximpl == null) {
                    getpivotfractionximpl = new getPivotFractionXimpl(encodepointlist);
                }
                getpivotfractionximpl.IconCompatParcelizer.add((transformQ8lPUPs) getpackedvalueannotations2);
            }
        }
        if (getpivotfractionximpl != null) {
            arrayList.add(getpivotfractionximpl);
        }
    }

    @Override // o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        android.graphics.Path path = this.MediaBrowserCompatMediaItem;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ParcelableVolumeInfo;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.MediaSessionCompatResultReceiverWrapper;
                path.computeBounds(rectF2, false);
                float fWrite = this.PlaybackStateCompat.write() / 2.0f;
                rectF2.set(rectF2.left - fWrite, rectF2.top - fWrite, rectF2.right + fWrite, rectF2.bottom + fWrite);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                return;
            }
            getPivotFractionXimpl getpivotfractionximpl = (getPivotFractionXimpl) arrayList.get(i);
            for (int i2 = 0; i2 < getpivotfractionximpl.IconCompatParcelizer.size(); i2++) {
                path.addPath(((transformQ8lPUPs) getpivotfractionximpl.IconCompatParcelizer.get(i2)).write(), matrix);
            }
            i++;
        }
    }

    @Override // o.encodeColorList
    public final void serializer() {
        this.MediaDescriptionCompat.invalidateSelf();
    }

    public copyzey9I6w(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, android.graphics.Paint.Cap cap, android.graphics.Paint.Join join, float f, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics, toXyz toxyz, ArrayList arrayList, toXyz toxyz2) {
        copyzey9I6wdefault copyzey9i6wdefault = new copyzey9I6wdefault(1, 0);
        this.RatingCompat = copyzey9i6wdefault;
        this.read = 0.0f;
        this.MediaDescriptionCompat = accessgetmirrorcp;
        this.MediaMetadataCompat = extendedSrgblambda0;
        copyzey9i6wdefault.setStyle(android.graphics.Paint.Style.STROKE);
        copyzey9i6wdefault.setStrokeCap(cap);
        copyzey9i6wdefault.setStrokeJoin(join);
        copyzey9i6wdefault.setStrokeMiter(f);
        this.MediaSessionCompatQueueItem = (getTransformui_graphics) xyzatocolorjlnilsgui_graphics.write();
        this.PlaybackStateCompat = toxyz.write();
        if (toxyz2 == null) {
            this.RemoteActionCompatParcelizer = null;
        } else {
            this.RemoteActionCompatParcelizer = toxyz2.write();
        }
        this.write = new ArrayList(arrayList.size());
        this.IconCompatParcelizer = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.write.add(((toXyz) arrayList.get(i)).write());
        }
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.PlaybackStateCompat);
        for (int i2 = 0; i2 < this.write.size(); i2++) {
            extendedSrgblambda0.RemoteActionCompatParcelizer((getColors) this.write.get(i2));
        }
        getColors getcolors = this.RemoteActionCompatParcelizer;
        if (getcolors != null) {
            extendedSrgblambda0.RemoteActionCompatParcelizer(getcolors);
        }
        this.MediaSessionCompatQueueItem.write(this);
        this.PlaybackStateCompat.write(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((getColors) this.write.get(i3)).write(this);
        }
        getTransformui_graphics gettransformui_graphics = this.RemoteActionCompatParcelizer;
        if (gettransformui_graphics != null) {
            gettransformui_graphics.write(this);
        }
        if (extendedSrgblambda0.write() != null) {
            getTransformui_graphics gettransformui_graphicsWrite = ((toXyz) extendedSrgblambda0.write().read).write();
            this.serializer = gettransformui_graphicsWrite;
            gettransformui_graphicsWrite.write(this);
            extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01e7  */
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
    public void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        copyzey9I6w copyzey9i6w = this;
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        float[] fArr2 = (float[]) newD50Xyzui_graphics.serializer.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i2 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) copyzey9i6w.MediaSessionCompatQueueItem.IconCompatParcelizer()).intValue() / 100.0f;
        int iWrite = getD50.write((int) (i * fIntValue));
        copyzey9I6wdefault copyzey9i6wdefault = copyzey9i6w.RatingCompat;
        copyzey9i6wdefault.setAlpha(iWrite);
        copyzey9i6wdefault.setStrokeWidth(copyzey9i6w.PlaybackStateCompat.write());
        if (copyzey9i6wdefault.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = copyzey9i6w.write;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = copyzey9i6w.IconCompatParcelizer;
                if (i3 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((getColors) arrayList.get(i3)).IconCompatParcelizer()).floatValue();
                fArr[i3] = fFloatValue;
                if (i3 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i3] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i3] = 0.1f;
                }
                i3++;
            }
            getTransformui_graphics gettransformui_graphics = copyzey9i6w.RemoteActionCompatParcelizer;
            copyzey9i6wdefault.setPathEffect(new DashPathEffect(fArr, gettransformui_graphics == null ? 0.0f : ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue()));
            getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
        }
        getTransformui_graphics gettransformui_graphics2 = copyzey9i6w.serializer;
        if (gettransformui_graphics2 != null) {
            float fFloatValue2 = ((Float) gettransformui_graphics2.IconCompatParcelizer()).floatValue();
            if (fFloatValue2 == 0.0f) {
                copyzey9i6wdefault.setMaskFilter(null);
            } else if (fFloatValue2 != copyzey9i6w.read) {
                ExtendedSrgblambda0 extendedSrgblambda0 = copyzey9i6w.MediaMetadataCompat;
                if (extendedSrgblambda0.serializer == fFloatValue2) {
                    maskFilter = extendedSrgblambda0.RemoteActionCompatParcelizer;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    extendedSrgblambda0.RemoteActionCompatParcelizer = blurMaskFilter;
                    extendedSrgblambda0.serializer = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                copyzey9i6wdefault.setMaskFilter(maskFilter);
            }
            copyzey9i6w.read = fFloatValue2;
        }
        if (geta != null) {
            geta.RemoteActionCompatParcelizer((int) (fIntValue * 255.0f), copyzey9i6wdefault);
        }
        canvas.save();
        canvas.concat(matrix);
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = copyzey9i6w.ParcelableVolumeInfo;
            if (i4 < arrayList2.size()) {
                getPivotFractionXimpl getpivotfractionximpl = (getPivotFractionXimpl) arrayList2.get(i4);
                encodePointList encodepointlist = getpivotfractionximpl.write;
                ArrayList arrayList3 = getpivotfractionximpl.IconCompatParcelizer;
                android.graphics.Path path = copyzey9i6w.MediaBrowserCompatMediaItem;
                if (encodepointlist != null) {
                    getMiterLxFBmk8 getmiterlxfbmk10 = getRoundLxFBmk8.read;
                    path.reset();
                    for (int size2 = arrayList3.size() - i2; size2 >= 0; size2--) {
                        path.addPath(((transformQ8lPUPs) arrayList3.get(size2)).write());
                    }
                    float fFloatValue3 = ((Float) encodepointlist.RemoteActionCompatParcelizer.IconCompatParcelizer()).floatValue() / f2;
                    float fFloatValue4 = ((Float) encodepointlist.read.IconCompatParcelizer()).floatValue() / f2;
                    float fFloatValue5 = ((Float) encodepointlist.IconCompatParcelizer.IconCompatParcelizer()).floatValue() / 360.0f;
                    if (fFloatValue3 < 0.01f && fFloatValue4 > 0.99f) {
                        canvas.drawPath(path, copyzey9i6wdefault);
                        getMiterLxFBmk8 getmiterlxfbmk11 = getRoundLxFBmk8.read;
                    } else {
                        android.graphics.PathMeasure pathMeasure = copyzey9i6w.MediaSessionCompatToken;
                        pathMeasure.setPath(path, z);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length += pathMeasure.getLength();
                        }
                        float f3 = fFloatValue5 * length;
                        float f4 = (fFloatValue3 * length) + f3;
                        float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                        int size3 = arrayList3.size() - i2;
                        float f5 = 0.0f;
                        while (size3 >= 0) {
                            android.graphics.Path pathWrite = ((transformQ8lPUPs) arrayList3.get(size3)).write();
                            android.graphics.Path path2 = copyzey9i6w.PlaybackStateCompatCustomAction;
                            path2.set(pathWrite);
                            pathMeasure.setPath(path2, z);
                            float length2 = pathMeasure.getLength();
                            if (fMin > length) {
                                float f6 = fMin - length;
                                if (f6 >= f5 + length2 || f5 >= f6) {
                                    f = f5 + length2;
                                    if (f < f4 && f5 <= fMin) {
                                        if (f <= fMin && f4 < f5) {
                                            canvas.drawPath(path2, copyzey9i6wdefault);
                                        } else {
                                            newD50Xyzui_graphics.serializer(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                            canvas.drawPath(path2, copyzey9i6wdefault);
                                        }
                                    }
                                } else {
                                    newD50Xyzui_graphics.serializer(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(path2, copyzey9i6wdefault);
                                }
                            } else {
                                f = f5 + length2;
                                if (f < f4) {
                                }
                            }
                            f5 += length2;
                            size3--;
                            copyzey9i6w = this;
                            z = false;
                        }
                        getMiterLxFBmk8 getmiterlxfbmk12 = getRoundLxFBmk8.read;
                    }
                } else {
                    getMiterLxFBmk8 getmiterlxfbmk13 = getRoundLxFBmk8.read;
                    path.reset();
                    int size4 = arrayList3.size();
                    while (true) {
                        size4--;
                        if (size4 < 0) {
                            break;
                        } else {
                            path.addPath(((transformQ8lPUPs) arrayList3.get(size4)).write());
                        }
                    }
                    getMiterLxFBmk8 getmiterlxfbmk14 = getRoundLxFBmk8.read;
                    canvas.drawPath(path, copyzey9i6wdefault);
                }
                i4++;
                copyzey9i6w = this;
                z = false;
                i2 = 1;
                f2 = 100.0f;
            } else {
                canvas.restore();
                getMiterLxFBmk8 getmiterlxfbmk15 = getRoundLxFBmk8.read;
                return;
            }
        }
    }
}
