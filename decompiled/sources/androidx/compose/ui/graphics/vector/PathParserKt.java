package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    private static final double toRadians(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        PathNode pathNode;
        PathNode pathNode2;
        float f;
        int i;
        int i2;
        float arcStartX;
        float arcStartY;
        float f2;
        float f3;
        float x1;
        float dy;
        float x2;
        float x3;
        float y2;
        float dy2;
        float f4;
        float f5;
        float dy3;
        float y;
        float x;
        float x4;
        float y3;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo610getFillTypeRgk1Os = path.mo610getFillTypeRgk1Os();
        path.rewind();
        path2.mo612setFillTypeoQ8Xj4U(iMo610getFillTypeRgk1Os);
        if (list.isEmpty()) {
            pathNode = PathNode.Close.INSTANCE;
        } else {
            pathNode = list2.get(0);
        }
        int size = list2.size();
        float f6 = 0.0f;
        int i3 = 0;
        float y1 = 0.0f;
        float x5 = 0.0f;
        float x6 = 0.0f;
        float y4 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (i3 < size) {
            PathNode pathNode3 = list2.get(i3);
            if (pathNode3 instanceof PathNode.Close) {
                path.close();
                pathNode2 = pathNode3;
                f = f6;
                i = i3;
                i2 = size;
                arcStartX = f7;
                arcStartY = f8;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x4 = relativeMoveTo.getDx() + x6;
                    y3 = relativeMoveTo.getDy() + y4;
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        x4 = moveTo.getX();
                        y3 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x3 = relativeLineTo.getDx() + x6;
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.lineTo(lineTo.getX(), lineTo.getY());
                                x3 = lineTo.getX();
                                y2 = lineTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                    PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                    path2.relativeLineTo(relativeHorizontalTo.getDx(), f6);
                                    x = relativeHorizontalTo.getDx() + x6;
                                } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                    PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                    path2.lineTo(horizontalTo.getX(), y4);
                                    x = horizontalTo.getX();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                        path2.relativeLineTo(f6, relativeVerticalTo.getDy());
                                        y = relativeVerticalTo.getDy() + y4;
                                    } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                        path2.lineTo(x6, verticalTo.getY());
                                        y = verticalTo.getY();
                                    } else {
                                        if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                            x1 = relativeCurveTo.getDx2() + x6;
                                            y1 = relativeCurveTo.getDy2() + y4;
                                            x2 = relativeCurveTo.getDx3() + x6;
                                            dy3 = relativeCurveTo.getDy3();
                                        } else {
                                            if (pathNode3 instanceof PathNode.CurveTo) {
                                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                                path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                                x1 = curveTo.getX2();
                                                y1 = curveTo.getY2();
                                                x2 = curveTo.getX3();
                                                dy = curveTo.getY3();
                                            } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                                if (pathNode.isCurve()) {
                                                    float f9 = y4 - y1;
                                                    f4 = x6 - x5;
                                                    f5 = f9;
                                                } else {
                                                    f4 = f6;
                                                    f5 = f4;
                                                }
                                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                                path.relativeCubicTo(f4, f5, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                                x1 = relativeReflectiveCurveTo.getDx1() + x6;
                                                y1 = relativeReflectiveCurveTo.getDy1() + y4;
                                                x2 = relativeReflectiveCurveTo.getDx2() + x6;
                                                dy3 = relativeReflectiveCurveTo.getDy2();
                                            } else if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                                if (pathNode.isCurve()) {
                                                    x6 = (x6 * 2.0f) - x5;
                                                    y4 = (y4 * 2.0f) - y1;
                                                }
                                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                                path.cubicTo(x6, y4, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                                x1 = reflectiveCurveTo.getX1();
                                                y1 = reflectiveCurveTo.getY1();
                                                x2 = reflectiveCurveTo.getX2();
                                                dy = reflectiveCurveTo.getY2();
                                            } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                                path2.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                                x5 = relativeQuadTo.getDx1() + x6;
                                                y1 = relativeQuadTo.getDy1() + y4;
                                                x3 = relativeQuadTo.getDx2() + x6;
                                                dy2 = relativeQuadTo.getDy2();
                                            } else if (pathNode3 instanceof PathNode.QuadTo) {
                                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                                path2.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                                x5 = quadTo.getX1();
                                                y1 = quadTo.getY1();
                                                x3 = quadTo.getX2();
                                                y2 = quadTo.getY2();
                                            } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                                if (pathNode.isQuad()) {
                                                    f2 = x6 - x5;
                                                    f3 = y4 - y1;
                                                } else {
                                                    f2 = f6;
                                                    f3 = f2;
                                                }
                                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                                path2.relativeQuadraticTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                                x1 = f2 + x6;
                                                y1 = f3 + y4;
                                                float dx = relativeReflectiveQuadTo.getDx() + x6;
                                                dy = relativeReflectiveQuadTo.getDy() + y4;
                                                x2 = dx;
                                            } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                                if (pathNode.isQuad()) {
                                                    x6 = (x6 * 2.0f) - x5;
                                                    y4 = (y4 * 2.0f) - y1;
                                                }
                                                PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                                path2.quadraticTo(x6, y4, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                                x5 = x6;
                                                pathNode2 = pathNode3;
                                                f = f6;
                                                i = i3;
                                                i2 = size;
                                                x6 = reflectiveQuadTo.getX();
                                                y1 = y4;
                                                y4 = reflectiveQuadTo.getY();
                                            } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                                PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                                float arcStartDx = relativeArcTo.getArcStartDx() + x6;
                                                float arcStartDy = relativeArcTo.getArcStartDy() + y4;
                                                pathNode2 = pathNode3;
                                                i = i3;
                                                f = 0.0f;
                                                i2 = size;
                                                drawArc(path, x6, y4, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                                arcStartY = arcStartDy;
                                                arcStartX = arcStartDx;
                                            } else {
                                                pathNode2 = pathNode3;
                                                f = f6;
                                                i = i3;
                                                i2 = size;
                                                if (pathNode2 instanceof PathNode.ArcTo) {
                                                    PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode2;
                                                    drawArc(path, x6, y4, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                    arcStartX = arcTo.getArcStartX();
                                                    arcStartY = arcTo.getArcStartY();
                                                } else {
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                                    return null;
                                                }
                                            }
                                            x6 = x2;
                                            y4 = dy;
                                            pathNode2 = pathNode3;
                                            f = f6;
                                            i = i3;
                                            i2 = size;
                                            x5 = x1;
                                        }
                                        dy = dy3 + y4;
                                        x6 = x2;
                                        y4 = dy;
                                        pathNode2 = pathNode3;
                                        f = f6;
                                        i = i3;
                                        i2 = size;
                                        x5 = x1;
                                    }
                                    y4 = y;
                                    pathNode2 = pathNode3;
                                    f = f6;
                                    i = i3;
                                    i2 = size;
                                }
                                x6 = x;
                                pathNode2 = pathNode3;
                                f = f6;
                                i = i3;
                                i2 = size;
                            }
                            y4 = y2;
                            x6 = x3;
                            pathNode2 = pathNode3;
                            f = f6;
                            i = i3;
                            i2 = size;
                        }
                        y2 = dy2 + y4;
                        y4 = y2;
                        x6 = x3;
                        pathNode2 = pathNode3;
                        f = f6;
                        i = i3;
                        i2 = size;
                    }
                    i3 = i + 1;
                    path2 = path;
                    pathNode = pathNode2;
                    f6 = f;
                    size = i2;
                    list2 = list;
                }
                f7 = x4;
                f8 = y3;
                x6 = f7;
                y4 = f8;
                pathNode2 = pathNode3;
                f = f6;
                i = i3;
                i2 = size;
                i3 = i + 1;
                path2 = path;
                pathNode = pathNode2;
                f6 = f;
                size = i2;
                list2 = list;
            }
            y1 = arcStartY;
            y4 = y1;
            x5 = arcStartX;
            x6 = x5;
            i3 = i + 1;
            path2 = path;
            pathNode = pathNode2;
            f6 = f;
            size = i2;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d11 = -d10;
        double d12 = d11 * dCos;
        double d13 = d4 * dSin;
        double d14 = d11 * dSin;
        double d15 = d4 * dCos;
        double d16 = d9 / ((double) iCeil);
        double d17 = d6;
        double d18 = (dSin2 * d12) - (dCos2 * d13);
        double d19 = (dCos2 * d15) + (dSin2 * d14);
        double d20 = d8;
        int i = 0;
        double d21 = d5;
        while (i < iCeil) {
            double d22 = d20 + d16;
            double dSin3 = Math.sin(d22);
            double dCos3 = Math.cos(d22);
            double d23 = d16;
            double d24 = (((d10 * dCos) * dCos3) + d) - (d13 * dSin3);
            double d25 = (d15 * dSin3) + (d10 * dSin * dCos3) + d2;
            double d26 = (d12 * dSin3) - (d13 * dCos3);
            double d27 = (dCos3 * d15) + (dSin3 * d14);
            double d28 = d22 - d20;
            double dTan = Math.tan(d28 / 2.0d);
            double dSqrt = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d28)) / 3.0d;
            path.cubicTo((float) ((d18 * dSqrt) + d21), (float) ((d19 * dSqrt) + d17), (float) (d24 - (dSqrt * d26)), (float) (d25 - (dSqrt * d27)), (float) d24, (float) d25);
            i++;
            d17 = d25;
            iCeil = iCeil;
            dSin = dSin;
            dCos = dCos;
            d20 = d22;
            d19 = d27;
            d18 = d26;
            d10 = d3;
            d21 = d24;
            d16 = d23;
        }
    }

    private static final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        double d11 = ((d2 * dSin) + (d * dCos)) / d5;
        double d12 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d13 = ((d4 * dSin) + (d3 * dCos)) / d5;
        double d14 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = (d11 + d13) / 2.0d;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            drawArc(path, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d20);
        double d21 = d15 * dSqrt2;
        double d22 = dSqrt2 * d16;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d12 - d9, d11 - d8);
        double dAtan3 = Math.atan2(d14 - d9, d13 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        arcToBezier(path, (d23 * dCos) - (d24 * dSin), (d24 * dCos) + (d23 * dSin), d5, d6, d, d2, d10, dAtan2, dAtan3);
    }
}
