package o;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface accessgetMediaSkipForwardcp {
    void RemoteActionCompatParcelizer(int i, View view);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int read(int i, int i2, int i3);

    int read(View view);

    View read(int i);

    boolean read();

    int serializer(int i, int i2, int i3);

    int serializer(int i, int i2, View view);

    void serializer(View view, int i, int i2, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp);

    void setFlexLines(List list);

    View write(int i);

    void write(accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp);
}
