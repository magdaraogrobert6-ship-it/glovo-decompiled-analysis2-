package io.sentry.android.core.internal.threaddump;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import o.BeyondBoundsLayoutKt;
import o.resetShadow;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer {
    public final int RemoteActionCompatParcelizer;
    public int serializer;
    public final ArrayList write;

    public static RemoteActionCompatParcelizer IconCompatParcelizer(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new RemoteActionCompatParcelizer(arrayList);
            }
            serializer serializerVar = new serializer();
            serializerVar.serializer = line;
            arrayList.add(serializerVar);
        }
    }

    public void IconCompatParcelizer(resetShadow resetshadow) {
        this.write.add(resetshadow);
    }

    public serializer IconCompatParcelizer() {
        int i = this.serializer;
        if (i < 0 || i >= this.RemoteActionCompatParcelizer) {
            return null;
        }
        this.serializer = i + 1;
        return (serializer) this.write.get(i);
    }

    public RemoteActionCompatParcelizer(Context context, XmlResourceParser xmlResourceParser) {
        this.write = new ArrayList();
        this.serializer = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), BeyondBoundsLayoutKt.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.RemoteActionCompatParcelizer);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.serializer);
                this.serializer = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new ConstraintSet().read((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public RemoteActionCompatParcelizer(ArrayList arrayList) {
        this.write = arrayList;
        this.RemoteActionCompatParcelizer = arrayList.size();
    }
}
