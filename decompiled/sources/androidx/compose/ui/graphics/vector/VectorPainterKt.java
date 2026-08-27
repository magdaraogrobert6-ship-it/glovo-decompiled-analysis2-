package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.GapComposer$CompositionContextImpl;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import java.util.List;
import java.util.Map;
import o.AndroidContentCaptureManager;
import o.ContentType_androidKt;
import o.DragAndDropTargetModifierNode;
import o.SimpleItemTouchHelperCallback;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationDate;
import o.getCreditCardExpirationMonth;
import o.getCreditCardSecurityCode;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPersonMiddleInitial;
import o.getPersonNamePrefix;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes.dex */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX INFO: renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m1487configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j, long j2, String str, ColorFilter colorFilter, boolean z) {
        vectorPainter.m1484setSizeuvyYCjk$ui(j);
        vectorPainter.setAutoMirror$ui(z);
        vectorPainter.setIntrinsicColorFilter$ui(colorFilter);
        vectorPainter.m1485setViewportSizeuvyYCjk$ui(j2);
        vectorPainter.setName$ui(str);
        return vectorPainter;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long jM1490obtainSizePxVpY3zN4 = m1490obtainSizePxVpY3zN4(density, imageVector.m1458getDefaultWidthD9Ej5fM(), imageVector.m1457getDefaultHeightD9Ej5fM());
        return m1487configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), jM1490obtainSizePxVpY3zN4, m1491obtainViewportSizePq9zytI(jM1490obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m1489createColorFilterxETnrds(imageVector.m1460getTintColor0d7_KjU(), imageVector.m1459getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    private static final void mirror(DrawScope drawScope, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long jMo1303getCenterF1C5BW0 = drawScope.mo1303getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1232scale0AR0LA0(-1.0f, 1.0f, jMo1303getCenterF1C5BW0);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(drawScope);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m1490obtainSizePxVpY3zN4(Density density, float f, float f2) {
        float fMo48toPx0680j_4 = density.mo48toPx0680j_4(f);
        float fMo48toPx0680j_5 = density.mo48toPx0680j_4(f2);
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_5)) & 4294967295L));
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
        boolean zSerializer = getpostalcode.serializer((((long) Float.floatToRawIntBits(density.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(imageVector.getGenId$ui())) << 32));
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (zSerializer || objComponentActivity == getCreditCardExpirationMonth.write) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            objComponentActivity = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            getpostalcode.write(objComponentActivity);
        }
        return (VectorPainter) objComponentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x015a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0161  */
    /* JADX WARN: Code duplicated, block: B:43:0x0178  */
    /* JADX WARN: Code duplicated, block: B:45:0x0238  */
    /* JADX WARN: Code duplicated, block: B:48:0x0251  */
    /* JADX WARN: Code duplicated, block: B:51:0x025c  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void RenderVectorGroup(final VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        Map<String, ? extends VectorConfig> map2;
        boolean z;
        getPostalCode getpostalcode;
        final Map<String, ? extends VectorConfig> map3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Map<String, ? extends VectorConfig> map4;
        final Map<String, ? extends VectorConfig> map5;
        getPostalCode getpostalcode2;
        Map<String, ? extends VectorConfig> map6;
        VectorConfig vectorConfig;
        VectorConfig vectorConfig2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-446179233);
        if ((i & 6) == 0) {
            i3 = (getpostalcode3.read(vectorGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                map2 = map;
                i3 |= getpostalcode3.IconCompatParcelizer(map2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode3.write(i3 & 1, z)) {
                if (i4 != 0) {
                    map4 = SimpleItemTouchHelperCallback.serializer;
                } else {
                    map4 = map2;
                }
                for (final VectorNode vectorNode : vectorGroup) {
                    if (vectorNode instanceof VectorPath) {
                        getpostalcode3.serializer(798455915);
                        VectorPath vectorPath = (VectorPath) vectorNode;
                        vectorConfig2 = map4.get(vectorPath.getName());
                        if (vectorConfig2 == null) {
                            vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            };
                        }
                        VectorConfig vectorConfig3 = vectorConfig2;
                        getpostalcode2 = getpostalcode3;
                        VectorComposeKt.m1475Path9cdaXJ4((List) vectorConfig3.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m1494getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig3.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig3.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig3.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig3.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m1495getStrokeLineCapKaPHkGw(), vectorPath.m1496getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), getpostalcode2, 0, 0, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                        map6 = map4;
                    } else {
                        map5 = map4;
                        getpostalcode2 = getpostalcode3;
                        if (vectorNode instanceof VectorGroup) {
                            getpostalcode2.serializer(799870476);
                            VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                            vectorConfig = map5.get(vectorGroup2.getName());
                            if (vectorConfig == null) {
                                vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                };
                            }
                            String name = vectorGroup2.getName();
                            float fFloatValue = ((Number) vectorConfig.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup2.getRotation()))).floatValue();
                            float fFloatValue2 = ((Number) vectorConfig.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup2.getScaleX()))).floatValue();
                            float fFloatValue3 = ((Number) vectorConfig.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup2.getScaleY()))).floatValue();
                            float fFloatValue4 = ((Number) vectorConfig.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup2.getTranslationX()))).floatValue();
                            float fFloatValue5 = ((Number) vectorConfig.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup2.getTranslationY()))).floatValue();
                            map6 = map5;
                            VectorComposeKt.Group(name, fFloatValue, ((Number) vectorConfig.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup2.getPivotX()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup2.getPivotY()))).floatValue(), fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, (List) vectorConfig.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup2.getClipPathData()), ExtrasKt.write(1450046638, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                                    getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull2;
                                    if (getpostalcode4.write(i5 & 1, (i5 & 3) != 2)) {
                                        VectorPainterKt.RenderVectorGroup((VectorGroup) vectorNode, map5, getpostalcode4, 0, 0);
                                    } else {
                                        getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }
                                }

                                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                    return createFromParcel.INSTANCE;
                                }
                            }, getpostalcode2), getpostalcode2, 805306368, 0);
                            getpostalcode2.IconCompatParcelizer(false);
                        } else {
                            map6 = map5;
                            getpostalcode2.serializer(800876643);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                    }
                    map4 = map6;
                    getpostalcode3 = getpostalcode2;
                }
                map3 = map4;
                getpostalcode = getpostalcode3;
            } else {
                getpostalcode = getpostalcode3;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                map3 = map2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                        VectorPainterKt.RenderVectorGroup(vectorGroup, map3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        map2 = map;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode3.write(i3 & 1, z)) {
            if (i4 != 0) {
                map4 = SimpleItemTouchHelperCallback.serializer;
            } else {
                map4 = map2;
            }
            while (r21.hasNext()) {
                if (vectorNode instanceof VectorPath) {
                    getpostalcode3.serializer(798455915);
                    VectorPath vectorPath2 = (VectorPath) vectorNode;
                    vectorConfig2 = map4.get(vectorPath2.getName());
                    if (vectorConfig2 == null) {
                        vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                        };
                    }
                    VectorConfig vectorConfig4 = vectorConfig2;
                    getpostalcode2 = getpostalcode3;
                    VectorComposeKt.m1475Path9cdaXJ4((List) vectorConfig4.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath2.getPathData()), vectorPath2.m1494getPathFillTypeRgk1Os(), vectorPath2.getName(), (Brush) vectorConfig4.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath2.getFill()), ((Number) vectorConfig4.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath2.getFillAlpha()))).floatValue(), (Brush) vectorConfig4.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath2.getStroke()), ((Number) vectorConfig4.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath2.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath2.getStrokeLineWidth()))).floatValue(), vectorPath2.m1495getStrokeLineCapKaPHkGw(), vectorPath2.m1496getStrokeLineJoinLxFBmk8(), vectorPath2.getStrokeLineMiter(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath2.getTrimPathStart()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath2.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath2.getTrimPathOffset()))).floatValue(), getpostalcode2, 0, 0, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                    map6 = map4;
                } else {
                    map5 = map4;
                    getpostalcode2 = getpostalcode3;
                    if (vectorNode instanceof VectorGroup) {
                        getpostalcode2.serializer(799870476);
                        VectorGroup vectorGroup3 = (VectorGroup) vectorNode;
                        vectorConfig = map5.get(vectorGroup3.getName());
                        if (vectorConfig == null) {
                            vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                            };
                        }
                        String name2 = vectorGroup3.getName();
                        float fFloatValue6 = ((Number) vectorConfig.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup3.getRotation()))).floatValue();
                        float fFloatValue7 = ((Number) vectorConfig.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup3.getScaleX()))).floatValue();
                        float fFloatValue8 = ((Number) vectorConfig.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup3.getScaleY()))).floatValue();
                        float fFloatValue9 = ((Number) vectorConfig.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup3.getTranslationX()))).floatValue();
                        float fFloatValue10 = ((Number) vectorConfig.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup3.getTranslationY()))).floatValue();
                        map6 = map5;
                        VectorComposeKt.Group(name2, fFloatValue6, ((Number) vectorConfig.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup3.getPivotX()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup3.getPivotY()))).floatValue(), fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, (List) vectorConfig.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup3.getClipPathData()), ExtrasKt.write(1450046638, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull2;
                                if (getpostalcode4.write(i5 & 1, (i5 & 3) != 2)) {
                                    VectorPainterKt.RenderVectorGroup((VectorGroup) vectorNode, map5, getpostalcode4, 0, 0);
                                } else {
                                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }
                            }

                            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                return createFromParcel.INSTANCE;
                            }
                        }, getpostalcode2), getpostalcode2, 805306368, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        map6 = map5;
                        getpostalcode2.serializer(800876643);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                }
                map4 = map6;
                getpostalcode3 = getpostalcode2;
            }
            map3 = map4;
            getpostalcode = getpostalcode3;
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            map3 = map2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                    VectorPainterKt.RenderVectorGroup(vectorGroup, map3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m1489createColorFilterxETnrds(long j, int i) {
        if (j != 16) {
            return ColorFilter.Companion.m766tintxETnrds(j, i);
        }
        return null;
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i = 0; i < size; i++) {
            VectorNode vectorNode = vectorGroup.get(i);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m1468setPathFillTypeoQ8Xj4U(vectorPath.m1494getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m1469setStrokeLineCapBeK7IIE(vectorPath.m1495getStrokeLineCapKaPHkGw());
                pathComponent.m1470setStrokeLineJoinWw9F2mQ(vectorPath.m1496getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i, groupComponent2);
            }
        }
        return groupComponent;
    }

    /* JADX INFO: renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m1491obtainViewportSizePq9zytI(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m1492rememberVectorPaintermlNsNFs(float f, float f2, float f3, float f4, String str, long j, int i, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, getBirthDateFull getbirthdatefull, int i2, int i3) {
        return m1493rememberVectorPaintervIP8VLU(f, f2, (i3 & 4) != 0 ? Float.NaN : f3, (i3 & 8) != 0 ? Float.NaN : f4, (i3 & 16) != 0 ? RootGroupName : str, (i3 & 32) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i3 & 64) != 0 ? BlendMode.Companion.m660getSrcIn0nO6VwU() : i, false, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, getbirthdatefull, (i2 & 14) | 12582912 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i2 << 3) & 234881024), 0);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0116 A[PHI: r5 r8
  0x0116: PHI (r5v12 boolean) = (r5v10 boolean), (r5v13 boolean) binds: [B:73:0x0114, B:69:0x010d] A[DONT_GENERATE, DONT_INLINE]
  0x0116: PHI (r8v8 o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) = (r8v6 o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds), (r8v9 o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) binds: [B:73:0x0114, B:69:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0166  */
    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final VectorPainter m1493rememberVectorPaintervIP8VLU(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, getBirthDateFull getbirthdatefull, int i2, int i3) {
        boolean z2;
        boolean z3;
        final r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2;
        boolean z4;
        getCreditCardExpirationDate composition$ui;
        Object obj;
        final getCreditCardExpirationDate getcreditcardexpirationdate;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? RootGroupName : str;
        long jM758getUnspecified0d7_KjU = (i3 & 32) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j;
        int iM660getSrcIn0nO6VwU = (i3 & 64) != 0 ? BlendMode.Companion.m660getSrcIn0nO6VwU() : i;
        boolean z5 = (i3 & Fields.SpotShadowColor) != 0 ? false : z;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        long jM1490obtainSizePxVpY3zN4 = m1490obtainSizePxVpY3zN4((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity()), f, f2);
        final long jM1491obtainViewportSizePq9zytI = m1491obtainViewportSizePq9zytI(jM1490obtainSizePxVpY3zN4, f5, f6);
        boolean z6 = (((458752 & i2) ^ 196608) > 131072 && getpostalcode.serializer(jM758getUnspecified0d7_KjU)) || (i2 & 196608) == 131072;
        boolean z7 = (((3670016 & i2) ^ 1572864) > 1048576 && getpostalcode.read(iM660getSrcIn0nO6VwU)) || (i2 & 1572864) == 1048576;
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        float f7 = f6;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if ((z7 | z6) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = m1489createColorFilterxETnrds(jM758getUnspecified0d7_KjU, iM660getSrcIn0nO6VwU);
            getpostalcode.write(objComponentActivity2);
        }
        ColorFilter colorFilter = (ColorFilter) objComponentActivity2;
        getpostalcode.serializer(789579543);
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (objComponentActivity3 == androidContentCaptureManager) {
            z2 = true;
            objComponentActivity3 = new VectorPainter(null, 1, null);
            getpostalcode.write(objComponentActivity3);
        } else {
            z2 = true;
        }
        VectorPainter vectorPainter = (VectorPainter) objComponentActivity3;
        m1487configureVectorPainterT4PVSW8(vectorPainter, jM1490obtainSizePxVpY3zN4, jM1491obtainViewportSizePq9zytI, str2, colorFilter, z5);
        GapComposer$CompositionContextImpl gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
        boolean z8 = ((((i2 & 896) ^ 384) <= 256 || !getpostalcode.serializer(f5)) && (i2 & 384) != 256) ? false : z2;
        boolean z9 = ((((i2 & 7168) ^ 3072) <= 2048 || !getpostalcode.serializer(f7)) && (i2 & 3072) != 2048) ? false : z2;
        if (((234881024 & i2) ^ 100663296) > 67108864) {
            z3 = z2;
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
            if (getpostalcode.read(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2)) {
                z4 = z3;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            obj = objComponentActivity4;
            if (!(z4 | z8 | z9) || objComponentActivity4 == androidContentCaptureManager) {
                composition$ui = vectorPainter.getComposition$ui();
                if (composition$ui != null || composition$ui.isDisposed()) {
                    composition$ui = new getCreditCardSecurityCode(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new VectorApplier(vectorPainter.getVector$ui().getRoot()));
                }
                getCreditCardExpirationDate getcreditcardexpirationdate2 = composition$ui;
                getcreditcardexpirationdate2.setContent(new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$composition$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i4) {
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(i4 & 1, (i4 & 3) != 2)) {
                            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke(Float.valueOf(Float.intBitsToFloat((int) (jM1491obtainViewportSizePq9zytI >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jM1491obtainViewportSizePq9zytI & 4294967295L))), getpostalcode2, 0);
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                        return createFromParcel.INSTANCE;
                    }
                }, z3, 1749374910));
                getpostalcode.write(getcreditcardexpirationdate2);
                obj = getcreditcardexpirationdate2;
            }
            getcreditcardexpirationdate = (getCreditCardExpirationDate) obj;
            vectorPainter.setComposition$ui(getcreditcardexpirationdate);
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcreditcardexpirationdate);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        final getCreditCardExpirationDate getcreditcardexpirationdate3 = getcreditcardexpirationdate;
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                                getcreditcardexpirationdate3.dispose();
                            }
                        };
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.serializer(vectorPainter, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            getpostalcode.IconCompatParcelizer(false);
            return vectorPainter;
        }
        z3 = z2;
        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        if ((i2 & 100663296) == 67108864) {
            z4 = z3;
        } else {
            z4 = false;
        }
        Object objComponentActivity5 = getpostalcode.ComponentActivity();
        obj = objComponentActivity5;
        if (!(z4 | z8 | z9)) {
            composition$ui = vectorPainter.getComposition$ui();
            if (composition$ui != null) {
                composition$ui = new getCreditCardSecurityCode(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new VectorApplier(vectorPainter.getVector$ui().getRoot()));
            } else {
                composition$ui = new getCreditCardSecurityCode(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new VectorApplier(vectorPainter.getVector$ui().getRoot()));
            }
            getCreditCardExpirationDate getcreditcardexpirationdate3 = composition$ui;
            getcreditcardexpirationdate3.setContent(new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$composition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i4) {
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(i4 & 1, (i4 & 3) != 2)) {
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke(Float.valueOf(Float.intBitsToFloat((int) (jM1491obtainViewportSizePq9zytI >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jM1491obtainViewportSizePq9zytI & 4294967295L))), getpostalcode2, 0);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                    return createFromParcel.INSTANCE;
                }
            }, z3, 1749374910));
            getpostalcode.write(getcreditcardexpirationdate3);
            obj = getcreditcardexpirationdate3;
        } else {
            composition$ui = vectorPainter.getComposition$ui();
            if (composition$ui != null) {
                composition$ui = new getCreditCardSecurityCode(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new VectorApplier(vectorPainter.getVector$ui().getRoot()));
            } else {
                composition$ui = new getCreditCardSecurityCode(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new VectorApplier(vectorPainter.getVector$ui().getRoot()));
            }
            getCreditCardExpirationDate getcreditcardexpirationdate4 = composition$ui;
            getcreditcardexpirationdate4.setContent(new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$composition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i4) {
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(i4 & 1, (i4 & 3) != 2)) {
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke(Float.valueOf(Float.intBitsToFloat((int) (jM1491obtainViewportSizePq9zytI >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jM1491obtainViewportSizePq9zytI & 4294967295L))), getpostalcode2, 0);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                    return createFromParcel.INSTANCE;
                }
            }, z3, 1749374910));
            getpostalcode.write(getcreditcardexpirationdate4);
            obj = getcreditcardexpirationdate4;
        }
        getcreditcardexpirationdate = (getCreditCardExpirationDate) obj;
        vectorPainter.setComposition$ui(getcreditcardexpirationdate);
        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcreditcardexpirationdate);
        objComponentActivity = getpostalcode.ComponentActivity();
        if (!zIconCompatParcelizer) {
            objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                    final getCreditCardExpirationDate getcreditcardexpirationdate5 = getcreditcardexpirationdate;
                    return new getPersonMiddleInitial() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1$invoke$$inlined$onDispose$1
                        @Override // o.getPersonMiddleInitial
                        public void dispose() {
                            getcreditcardexpirationdate5.dispose();
                        }
                    };
                }
            };
            getpostalcode.write(objComponentActivity);
        } else {
            objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                    final getCreditCardExpirationDate getcreditcardexpirationdate5 = getcreditcardexpirationdate;
                    return new getPersonMiddleInitial() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1$invoke$$inlined$onDispose$1
                        @Override // o.getPersonMiddleInitial
                        public void dispose() {
                            getcreditcardexpirationdate5.dispose();
                        }
                    };
                }
            };
            getpostalcode.write(objComponentActivity);
        }
        getPhoneNumberNational.serializer(vectorPainter, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
        getpostalcode.IconCompatParcelizer(false);
        return vectorPainter;
    }
}
