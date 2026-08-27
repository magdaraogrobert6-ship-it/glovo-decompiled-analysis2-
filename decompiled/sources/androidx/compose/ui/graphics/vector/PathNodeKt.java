package androidx.compose.ui.graphics.vector;

import com.huawei.hms.location.ActivityIdentificationData;
import com.mapbox.common.logger.LogPriority;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i) {
        int i2 = i - 2;
        if (i2 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void addPathNodes(char c, ArrayList<PathNode> arrayList, float[] fArr, int i) {
        int i2 = 0;
        switch (c) {
            case 'A':
                for (int i3 = 0; i3 <= i - 7; i3 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], Float.compare(fArr[i3 + 3], 0.0f) != 0, Float.compare(fArr[i3 + 4], 0.0f) != 0, fArr[i3 + 5], fArr[i3 + 6]));
                }
                break;
            case 'C':
                while (i2 <= i - 6) {
                    arrayList.add(new PathNode.CurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                break;
            case 'H':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i2]));
                    i2++;
                }
                break;
            case 'L':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.LineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                break;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i);
                break;
            case 'Q':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.QuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                break;
            case 'S':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                break;
            case 'T':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                break;
            case 'V':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i2]));
                    i2++;
                }
                break;
            case 'Z':
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                break;
            case 'a':
                for (int i4 = 0; i4 <= i - 7; i4 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i4], fArr[i4 + 1], fArr[i4 + 2], Float.compare(fArr[i4 + 3], 0.0f) != 0, Float.compare(fArr[i4 + 4], 0.0f) != 0, fArr[i4 + 5], fArr[i4 + 6]));
                }
                break;
            case LogPriority.NONE /* 99 */:
                while (i2 <= i - 6) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], fArr[i2 + 4], fArr[i2 + 5]));
                    i2 += 6;
                }
                break;
            case 'h':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i2]));
                    i2++;
                }
                break;
            case ActivityIdentificationData.RUNNING /* 108 */:
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                break;
            case 'm':
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i);
                break;
            case 'q':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                break;
            case 's':
                while (i2 <= i - 4) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3]));
                    i2 += 4;
                }
                break;
            case 't':
                while (i2 <= i - 2) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i2], fArr[i2 + 1]));
                    i2 += 2;
                }
                break;
            case 'v':
                while (i2 <= i - 1) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i2]));
                    i2++;
                }
                break;
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(c, "Unknown command for: ");
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i, int i2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i3 = 0;
        while (i3 <= i - i2) {
            list.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(fArr, Integer.valueOf(i3)));
            i3 += i2;
        }
    }
}
